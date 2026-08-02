package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$setOrientation$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;

    public CommonAdViewerExposedFunctionsKt$setOrientation$1(AdObject adObject) {
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, spj<? super s3q0> spjVar) {
        CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1;
        int i;
        if (spjVar instanceof CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) spjVar;
            int i2 = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    int intValue = ((Integer) objArr[0]).intValue();
                    sh50<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.SetOrientation setOrientation = new DisplayMessage.SetOrientation(this.$adObject.getOpportunityId().toStringUtf8(), intValue);
                    commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label = 1;
                    if (displayMessages.emit(setOrientation, commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                return s3q0.a;
            }
        }
        commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1(this, spjVar);
        Object obj2 = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
        return invoke2(objArr, (spj<? super s3q0>) spjVar);
    }
}
