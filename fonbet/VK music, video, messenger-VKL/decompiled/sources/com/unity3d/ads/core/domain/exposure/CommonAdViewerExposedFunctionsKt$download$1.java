package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.rl3;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$download$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;
    final /* synthetic */ SessionRepository $sessionRepository;

    public CommonAdViewerExposedFunctionsKt$download$1(SessionRepository sessionRepository, CacheFile cacheFile, AdObject adObject) {
        this.$sessionRepository = sessionRepository;
        this.$cacheFile = cacheFile;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
        CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$1;
        int i;
        boolean disableCustomScheme;
        String str;
        CacheResult cacheResult;
        if (spjVar instanceof CommonAdViewerExposedFunctionsKt$download$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$download$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$download$1$invoke$1) spjVar;
            int i2 = commonAdViewerExposedFunctionsKt$download$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$12 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
                Object obj = commonAdViewerExposedFunctionsKt$download$1$invoke$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonAdViewerExposedFunctionsKt$download$1$invoke$12.label;
                if (i != 0) {
                    a.a(obj);
                    JSONObject jSONObject = (JSONObject) objArr[0];
                    String string = jSONObject.getString("url");
                    JSONArray jSONArray = (JSONArray) rl3.S(2, objArr);
                    int optInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                    disableCustomScheme = this.$sessionRepository.getFeatureFlags().getDisableCustomScheme();
                    CacheFile cacheFile = this.$cacheFile;
                    AdObject adObject = this.$adObject;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.L$0 = string;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.Z$0 = disableCustomScheme;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.label = 1;
                    obj = CacheFile.DefaultImpls.invoke$default(cacheFile, string, adObject, jSONArray, optInt, 0, null, commonAdViewerExposedFunctionsKt$download$1$invoke$12, 48, null);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = string;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    disableCustomScheme = commonAdViewerExposedFunctionsKt$download$1$invoke$12.Z$0;
                    str = (String) commonAdViewerExposedFunctionsKt$download$1$invoke$12.L$0;
                    a.a(obj);
                }
                cacheResult = (CacheResult) obj;
                if (cacheResult instanceof CacheResult.Success) {
                    if (cacheResult instanceof CacheResult.Failure) {
                        throw new IllegalStateException(((CacheResult.Failure) cacheResult).getError().name().toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (disableCustomScheme) {
                    return str;
                }
                return "unity-ads-cache://unity.ads.cache/" + ((CacheResult.Success) cacheResult).getCachedFile().getName();
            }
        }
        commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, spjVar);
        CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$122 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
        Object obj2 = commonAdViewerExposedFunctionsKt$download$1$invoke$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonAdViewerExposedFunctionsKt$download$1$invoke$122.label;
        if (i != 0) {
        }
        cacheResult = (CacheResult) obj2;
        if (cacheResult instanceof CacheResult.Success) {
        }
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
        return invoke2(objArr, (spj<Object>) spjVar);
    }
}
