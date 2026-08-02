package com.vk.push.core.remote.config.omicron.retriever;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import com.vk.push.core.remote.config.omicron.ParseException;
import com.vk.push.core.remote.config.omicron.fingerprint.OmicronFingerprint;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import xsna.eib;

/* loaded from: classes.dex */
public class NetworkDataRetriever implements DataRetriever {
    public final RequestExecutor a;
    public final ResponseParser b;
    public final AnalyticsHandler c;
    public Data d;

    public NetworkDataRetriever(RequestExecutor requestExecutor, ResponseParser responseParser, AnalyticsHandler analyticsHandler) {
        this.a = requestExecutor;
        this.b = responseParser;
        this.c = analyticsHandler;
    }

    @Override // com.vk.push.core.remote.config.omicron.retriever.DataRetriever
    public Data getData() {
        Data data = this.d;
        if (data != null) {
            return data;
        }
        throw new IllegalStateException("Cannot get data if retrieve status is not SUCCESS");
    }

    @Override // com.vk.push.core.remote.config.omicron.retriever.DataRetriever
    public RetrievalStatus retrieve(DataId dataId, DataQuery dataQuery) {
        String url = dataId.getUrl();
        eib eibVar = new eib();
        eibVar.a(dataId.getAppId(), "mytracker_id");
        Integer num = dataQuery.a;
        if (num != null) {
            eibVar.a(num, "config_v");
        }
        String str = dataQuery.b;
        if (str != null) {
            eibVar.a(str, "cond_s");
        }
        Map<String, String> map = dataQuery.c;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : map.values()) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str2);
            }
            eibVar.a(sb.toString(), AnalyticsBaseParamsConstantsKt.SEGMENTS);
        }
        OmicronEnvironment omicronEnvironment = dataQuery.d;
        if (omicronEnvironment != null) {
            eibVar.a(omicronEnvironment.name(), "app_env");
        }
        String str3 = dataQuery.e;
        if (str3 != null) {
            eibVar.a(str3, "account");
        }
        HashMap hashMap = new HashMap();
        Iterator it = dataQuery.f.iterator();
        while (it.hasNext()) {
            ((OmicronFingerprint) it.next()).collect(hashMap);
            for (Map.Entry entry : hashMap.entrySet()) {
                eibVar.a(entry.getValue(), (String) entry.getKey());
            }
            hashMap.clear();
        }
        HttpRequest.Post post = new HttpRequest.Post(url, ((StringBuilder) eibVar.a).toString());
        String post2 = post.toString();
        AnalyticsHandler analyticsHandler = this.c;
        analyticsHandler.onConfigRequestStarted(post2);
        try {
            HttpResponse execute = this.a.execute(post);
            analyticsHandler.onConfigRequestEnded(execute.getCode());
            int code = execute.getCode();
            if (code == 200) {
                this.d = this.b.parse(execute.getBody());
                analyticsHandler.onResponseSuccess(dataId);
                return RetrievalStatus.SUCCESS;
            }
            if (code != 304) {
                analyticsHandler.onResponseError(dataId, execute.getCode());
                return RetrievalStatus.ERROR;
            }
            analyticsHandler.onResponseNotModified(dataId);
            return RetrievalStatus.NOT_MODIFIED;
        } catch (ParseException e) {
            analyticsHandler.onConfigRequestFailedWithException(e);
            analyticsHandler.onResponseParseException(dataId, e);
            return RetrievalStatus.ERROR;
        } catch (Throwable th) {
            analyticsHandler.onConfigRequestFailedWithException(th);
            analyticsHandler.onResponseException(dataId, th);
            return RetrievalStatus.ERROR;
        }
    }
}
