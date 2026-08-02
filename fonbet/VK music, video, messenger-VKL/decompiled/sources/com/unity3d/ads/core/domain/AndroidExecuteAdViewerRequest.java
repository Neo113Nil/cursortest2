package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import xsna.jgp;
import xsna.myc0;
import xsna.ovj;
import xsna.rl3;
import xsna.spj;

/* compiled from: AndroidExecuteAdViewerRequest.kt */
/* loaded from: classes14.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClientProvider httpClientProvider;
    private final ovj ioDispatcher;

    /* compiled from: AndroidExecuteAdViewerRequest.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidExecuteAdViewerRequest(ovj ovjVar, HttpClientProvider httpClientProvider, GetCachedAsset getCachedAsset) {
        this.ioDispatcher = ovjVar;
        this.httpClientProvider = httpClientProvider;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        Map map;
        Map headersMap;
        String str = (String) rl3.S(1, objArr);
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        Map map2 = jgp.b;
        if (i == 1 || i == 2) {
            JSONArray jSONArray = (JSONArray) rl3.S(2, objArr);
            Integer num = (Integer) rl3.S(3, objArr);
            Integer num2 = (Integer) rl3.S(4, objArr);
            if (jSONArray == null || (map = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                map = map2;
            }
            return new HttpRequest(str, null, requestType, null, map, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = (String) rl3.S(2, objArr);
        JSONArray jSONArray2 = (JSONArray) rl3.S(3, objArr);
        Integer num3 = (Integer) rl3.S(4, objArr);
        Integer num4 = (Integer) rl3.S(5, objArr);
        if (jSONArray2 != null && (headersMap = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) != null) {
            map2 = headersMap;
        }
        return new HttpRequest(str, null, requestType, str2, map2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, spj<? super HttpResponse> spjVar) {
        return myc0.k(this.ioDispatcher, new AndroidExecuteAdViewerRequest$invoke$2(objArr, this, requestType, null), spjVar);
    }
}
