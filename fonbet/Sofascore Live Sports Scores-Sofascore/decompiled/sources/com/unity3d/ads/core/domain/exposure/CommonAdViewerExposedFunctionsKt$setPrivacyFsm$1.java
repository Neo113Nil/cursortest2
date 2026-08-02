package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1 implements ExposedFunction {
    final /* synthetic */ SessionRepository $sessionRepository;

    public CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1(SessionRepository sessionRepository) {
        this.$sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, rq3<? super Unit> rq3Var) {
        CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1;
        int i;
        if (rq3Var instanceof CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) rq3Var;
            int i2 = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    SessionRepository sessionRepository = this.$sessionRepository;
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    byte[] decode = Base64.decode((String) obj2, 2);
                    decode.getClass();
                    ByteString byteString = ByteStringsKt.toByteString(decode);
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label = 1;
                    if (sessionRepository.setPrivacyFsm(byteString, commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1(this, rq3Var);
        Object obj3 = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
        if (i != 0) {
        }
        return Unit.a;
    }
}
