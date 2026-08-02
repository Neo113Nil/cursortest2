package com.unity3d.ads.network.mapper;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import defpackage.bea;
import defpackage.ef0;
import defpackage.pzf;
import defpackage.q89;
import defpackage.qzf;
import defpackage.vha;
import defpackage.yzf;
import defpackage.zdc;
import defpackage.zzl;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody;", "body", "Lyzf;", "generateOkHttpBody", "(Lcom/unity3d/ads/network/model/HttpBody;)Lyzf;", "Lcom/unity3d/ads/network/model/HttpRequest;", "Lq89;", "generateOkHttpHeaders", "(Lcom/unity3d/ads/network/model/HttpRequest;)Lq89;", "Lqzf;", "toOkHttpRequest", "(Lcom/unity3d/ads/network/model/HttpRequest;)Lqzf;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final yzf generateOkHttpBody(HttpBody httpBody) {
        zdc zdcVar = null;
        if (httpBody instanceof HttpBody.StringBody) {
            Regex regex = zdc.e;
            try {
                zdcVar = bea.v("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused) {
            }
            return yzf.create(zdcVar, ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            Regex regex2 = zdc.e;
            try {
                zdcVar = bea.v("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused2) {
            }
            return yzf.create(zdcVar, ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        zzl.b();
        return null;
    }

    private static final q89 generateOkHttpHeaders(HttpRequest httpRequest) {
        ef0 ef0Var = new ef0(1);
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            ef0Var.b(entry.getKey(), CollectionsKt.f0(entry.getValue(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
        }
        return vha.i(ef0Var);
    }

    @NotNull
    public static final qzf toOkHttpRequest(@NotNull HttpRequest httpRequest) {
        httpRequest.getClass();
        pzf pzfVar = new pzf();
        pzfVar.f(StringsKt.W(StringsKt.m0(httpRequest.getBaseURL(), '/') + '/' + StringsKt.m0(httpRequest.getPath(), '/'), "/"));
        pzfVar.e(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody()));
        pzfVar.d(generateOkHttpHeaders(httpRequest));
        return new qzf(pzfVar);
    }
}
