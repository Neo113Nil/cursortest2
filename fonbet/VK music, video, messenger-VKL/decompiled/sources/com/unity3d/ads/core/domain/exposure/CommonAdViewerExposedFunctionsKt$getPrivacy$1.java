package com.unity3d.ads.core.domain.exposure;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$getPrivacy$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    public CommonAdViewerExposedFunctionsKt$getPrivacy$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
        CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1;
        int i;
        if (spjVar instanceof CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) spjVar;
            int i2 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    SessionRepository sessionRepository = this.$sessionRepository;
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = 1;
                    obj = sessionRepository.getPrivacy(commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                return ProtobufExtensionsKt.toBase64$default((ByteString) obj, false, 1, null);
            }
        }
        commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, spjVar);
        Object obj2 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
        if (i != 0) {
        }
        return ProtobufExtensionsKt.toBase64$default((ByteString) obj2, false, 1, null);
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
        return invoke2(objArr, (spj<Object>) spjVar);
    }
}
