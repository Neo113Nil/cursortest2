package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.epx;
import xsna.ksr;
import xsna.lsr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.xwm0;

/* compiled from: AndroidHandleOpenUrl.kt */
/* loaded from: classes14.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;
    private final IntentCreation intentCreation;

    public AndroidHandleOpenUrl(Context context, IntentCreation intentCreation) {
        this.context = context;
        this.intentCreation = intentCreation;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(final AdObject adObject, String str, String str2, String str3, Map<String, ? extends Object> map, boolean z, spj<? super Boolean> spjVar) {
        AndroidHandleOpenUrl$invoke$1 androidHandleOpenUrl$invoke$1;
        int i;
        Object failure;
        boolean z2;
        if (spjVar instanceof AndroidHandleOpenUrl$invoke$1) {
            androidHandleOpenUrl$invoke$1 = (AndroidHandleOpenUrl$invoke$1) spjVar;
            int i2 = androidHandleOpenUrl$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidHandleOpenUrl$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidHandleOpenUrl$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidHandleOpenUrl$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Intent invoke = this.intentCreation.invoke(str, str2, str3, map);
                    if (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER) {
                        invoke.setFlags(268435456);
                        try {
                            this.context.startActivity(invoke);
                            failure = s3q0.a;
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        z2 = !(failure instanceof Result.Failure);
                        return Boolean.valueOf(z2);
                    }
                    final xwm0 xwm0Var = new xwm0(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new AndroidHandleOpenUrl$invoke$result$1(adObject, invoke, z, null));
                    ksr<DisplayMessage> ksrVar = new ksr<DisplayMessage>() { // from class: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1

                        /* compiled from: Emitters.kt */
                        /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements lsr {
                            final /* synthetic */ AdObject $adObject$inlined;
                            final /* synthetic */ lsr $this_unsafeFlow;

                            @b6l(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2", f = "AndroidHandleOpenUrl.kt", l = {50}, m = "emit")
                            /* renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(spj spjVar) {
                                    super(spjVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(lsr lsrVar, AdObject adObject) {
                                this.$this_unsafeFlow = lsrVar;
                                this.$adObject$inlined = adObject;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // xsna.lsr
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, spj spjVar) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                if (spjVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) spjVar;
                                    int i2 = anonymousClass1.label;
                                    if ((i2 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            kotlin.a.a(obj2);
                                            lsr lsrVar = this.$this_unsafeFlow;
                                            DisplayMessage displayMessage = (DisplayMessage) obj;
                                            if ((displayMessage instanceof DisplayMessage.OpenUrlResult) && epx.f(displayMessage.getOpportunityId(), ProtobufExtensionsKt.toUUID(this.$adObject$inlined.getOpportunityId()).toString())) {
                                                anonymousClass1.label = 1;
                                                if (lsrVar.emit(obj, anonymousClass1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.a.a(obj2);
                                        }
                                        return s3q0.a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(spjVar);
                                Object obj22 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return s3q0.a;
                            }
                        }

                        @Override // xsna.ksr
                        public Object collect(lsr<? super DisplayMessage> lsrVar, spj spjVar2) {
                            Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, adObject), spjVar2);
                            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                        }
                    };
                    androidHandleOpenUrl$invoke$1.label = 1;
                    obj = rsr.n(ksrVar, androidHandleOpenUrl$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                z2 = ((DisplayMessage.OpenUrlResult) obj).getSuccess();
                return Boolean.valueOf(z2);
            }
        }
        androidHandleOpenUrl$invoke$1 = new AndroidHandleOpenUrl$invoke$1(this, spjVar);
        Object obj2 = androidHandleOpenUrl$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidHandleOpenUrl$invoke$1.label;
        if (i != 0) {
        }
        z2 = ((DisplayMessage.OpenUrlResult) obj2).getSuccess();
        return Boolean.valueOf(z2);
    }
}
