package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import defpackage.lu3;
import defpackage.ph0;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$download$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;
    final /* synthetic */ SessionRepository $sessionRepository;

    public CommonAdViewerExposedFunctionsKt$download$1(SessionRepository sessionRepository, CacheFile cacheFile, AdObject adObject) {
        this.$sessionRepository = sessionRepository;
        this.$cacheFile = cacheFile;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, rq3<Object> rq3Var) {
        CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$1;
        int i;
        boolean z;
        String str;
        CacheResult cacheResult;
        if (rq3Var instanceof CommonAdViewerExposedFunctionsKt$download$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$download$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$download$1$invoke$1) rq3Var;
            int i2 = commonAdViewerExposedFunctionsKt$download$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$12 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
                Object obj = commonAdViewerExposedFunctionsKt$download$1$invoke$12.result;
                lu3 lu3Var = lu3.a;
                i = commonAdViewerExposedFunctionsKt$download$1$invoke$12.label;
                if (i != 0) {
                    y6a.M(obj);
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    JSONObject jSONObject = (JSONObject) obj2;
                    String string = jSONObject.getString("url");
                    JSONArray jSONArray = (JSONArray) ph0.F(2, objArr);
                    int optInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                    boolean disableCustomScheme = this.$sessionRepository.getFeatureFlags().getDisableCustomScheme();
                    CacheFile cacheFile = this.$cacheFile;
                    string.getClass();
                    AdObject adObject = this.$adObject;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.L$0 = string;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.Z$0 = disableCustomScheme;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.label = 1;
                    obj = CacheFile.DefaultImpls.invoke$default(cacheFile, string, adObject, jSONArray, optInt, 0, null, commonAdViewerExposedFunctionsKt$download$1$invoke$12, 48, null);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    z = disableCustomScheme;
                    str = string;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = commonAdViewerExposedFunctionsKt$download$1$invoke$12.Z$0;
                    str = (String) commonAdViewerExposedFunctionsKt$download$1$invoke$12.L$0;
                    y6a.M(obj);
                }
                cacheResult = (CacheResult) obj;
                if (cacheResult instanceof CacheResult.Success) {
                    if (cacheResult instanceof CacheResult.Failure) {
                        throw new IllegalStateException(((CacheResult.Failure) cacheResult).getError().name().toString());
                    }
                    zzl.b();
                    return null;
                }
                if (z) {
                    return str;
                }
                return "unity-ads-cache://unity.ads.cache/" + ((CacheResult.Success) cacheResult).getCachedFile().getName();
            }
        }
        commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, rq3Var);
        CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$122 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
        Object obj3 = commonAdViewerExposedFunctionsKt$download$1$invoke$122.result;
        lu3 lu3Var2 = lu3.a;
        i = commonAdViewerExposedFunctionsKt$download$1$invoke$122.label;
        if (i != 0) {
        }
        cacheResult = (CacheResult) obj3;
        if (cacheResult instanceof CacheResult.Success) {
        }
    }
}
