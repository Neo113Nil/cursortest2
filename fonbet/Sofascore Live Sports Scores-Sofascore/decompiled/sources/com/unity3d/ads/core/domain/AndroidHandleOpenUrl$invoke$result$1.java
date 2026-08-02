package com.unity3d.ads.core.domain;

import android.content.Intent;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import defpackage.a70;
import defpackage.b1d;
import defpackage.b98;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb98;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "", "<anonymous>", "(Lb98;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1", f = "AndroidHandleOpenUrl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidHandleOpenUrl$invoke$result$1 extends hoi implements Function2<b98, rq3<? super Unit>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $useActivityForResult;
    int label;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1", f = "AndroidHandleOpenUrl.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ boolean $useActivityForResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, Intent intent, boolean z, rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
            this.$adObject = adObject;
            this.$intent = intent;
            this.$useActivityForResult = z;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                b1d displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                String uuid = ProtobufExtensionsKt.toUUID(this.$adObject.getOpportunityId()).toString();
                uuid.getClass();
                DisplayMessage.OpenUrl openUrl = new DisplayMessage.OpenUrl(uuid, this.$intent, this.$useActivityForResult);
                this.label = 1;
                if (displayMessages.emit(openUrl, this) == lu3Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleOpenUrl$invoke$result$1(AdObject adObject, Intent intent, boolean z, rq3<? super AndroidHandleOpenUrl$invoke$result$1> rq3Var) {
        super(2, rq3Var);
        this.$adObject = adObject;
        this.$intent = intent;
        this.$useActivityForResult = z;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidHandleOpenUrl$invoke$result$1(this.$adObject, this.$intent, this.$useActivityForResult, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b98 b98Var, rq3<? super Unit> rq3Var) {
        return ((AndroidHandleOpenUrl$invoke$result$1) create(b98Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        xw3.L(s9a.c(getContext()), null, null, new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, null), 3);
        return Unit.a;
    }
}
