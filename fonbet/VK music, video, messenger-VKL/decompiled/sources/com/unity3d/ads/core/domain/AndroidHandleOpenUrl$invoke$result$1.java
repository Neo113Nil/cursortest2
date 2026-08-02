package com.unity3d.ads.core.domain;

import android.content.Intent;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.lsr;
import xsna.myc0;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: AndroidHandleOpenUrl.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1", f = "AndroidHandleOpenUrl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidHandleOpenUrl$invoke$result$1 extends SuspendLambda implements wzs<lsr<? super DisplayMessage>, spj<? super s3q0>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ boolean $useActivityForResult;
    int label;

    /* compiled from: AndroidHandleOpenUrl.kt */
    @b6l(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1", f = "AndroidHandleOpenUrl.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$result$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Intent $intent;
        final /* synthetic */ boolean $useActivityForResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, Intent intent, boolean z, spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
            this.$adObject = adObject;
            this.$intent = intent;
            this.$useActivityForResult = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                sh50<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                DisplayMessage.OpenUrl openUrl = new DisplayMessage.OpenUrl(ProtobufExtensionsKt.toUUID(this.$adObject.getOpportunityId()).toString(), this.$intent, this.$useActivityForResult);
                this.label = 1;
                if (displayMessages.emit(openUrl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleOpenUrl$invoke$result$1(AdObject adObject, Intent intent, boolean z, spj<? super AndroidHandleOpenUrl$invoke$result$1> spjVar) {
        super(2, spjVar);
        this.$adObject = adObject;
        this.$intent = intent;
        this.$useActivityForResult = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidHandleOpenUrl$invoke$result$1(this.$adObject, this.$intent, this.$useActivityForResult, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h(zvj.a(getContext()), null, null, new AnonymousClass1(this.$adObject, this.$intent, this.$useActivityForResult, null), 3);
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super DisplayMessage> lsrVar, spj<? super s3q0> spjVar) {
        return ((AndroidHandleOpenUrl$invoke$result$1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
