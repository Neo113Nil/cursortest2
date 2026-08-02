package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import defpackage.a70;
import defpackage.au3;
import defpackage.lm5;
import defpackage.ph0;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.zzl;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidExecuteAdViewerRequest;", "Lcom/unity3d/ads/core/domain/ExecuteAdViewerRequest;", "Lau3;", "ioDispatcher", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "getCachedAsset", "<init>", "(Lau3;Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/GetCachedAsset;)V", "Lcom/unity3d/services/core/network/model/RequestType;", "type", "", "", "parameters", "Lcom/unity3d/services/core/network/model/HttpRequest;", "createRequest", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;)Lcom/unity3d/services/core/network/model/HttpRequest;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "invoke", "(Lcom/unity3d/services/core/network/model/RequestType;[Ljava/lang/Object;Lrq3;)Ljava/lang/Object;", "Lau3;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {

    @NotNull
    private final GetCachedAsset getCachedAsset;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @NotNull
    private final au3 ioDispatcher;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
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

    public AndroidExecuteAdViewerRequest(@NotNull au3 au3Var, @NotNull HttpClientProvider httpClientProvider, @NotNull GetCachedAsset getCachedAsset) {
        au3Var.getClass();
        httpClientProvider.getClass();
        getCachedAsset.getClass();
        this.ioDispatcher = au3Var;
        this.httpClientProvider = httpClientProvider;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequest createRequest(RequestType type, Object[] parameters) {
        Map map;
        Map map2;
        String str = (String) ph0.F(1, parameters);
        if (str == null || str.length() == 0) {
            a70.p("Failed requirement.");
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1 || i == 2) {
            JSONArray jSONArray = (JSONArray) ph0.F(2, parameters);
            Integer num = (Integer) ph0.F(3, parameters);
            Integer num2 = (Integer) ph0.F(4, parameters);
            if (jSONArray == null || (map = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                map = lm5.a;
                map.getClass();
            }
            return new HttpRequest(str, null, type, null, map, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i != 3) {
            zzl.b();
            return null;
        }
        String str2 = (String) ph0.F(2, parameters);
        JSONArray jSONArray2 = (JSONArray) ph0.F(3, parameters);
        Integer num3 = (Integer) ph0.F(4, parameters);
        Integer num4 = (Integer) ph0.F(5, parameters);
        if (jSONArray2 == null || (map2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
            map2 = lm5.a;
            map2.getClass();
        }
        return new HttpRequest(str, null, type, str2, map2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    @Nullable
    public Object invoke(@NotNull RequestType requestType, @NotNull Object[] objArr, @NotNull rq3<? super HttpResponse> rq3Var) {
        return xw3.R(this.ioDispatcher, new AndroidExecuteAdViewerRequest$invoke$2(objArr, this, requestType, null), rq3Var);
    }
}
