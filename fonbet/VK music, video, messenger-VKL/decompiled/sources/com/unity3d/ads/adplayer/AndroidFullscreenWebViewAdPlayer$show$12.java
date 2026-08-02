package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import xsna.b6l;
import xsna.epx;
import xsna.g0t;
import xsna.ksr;
import xsna.lsr;
import xsna.n7i;
import xsna.rsr;
import xsna.s3q0;
import xsna.sh50;
import xsna.spj;
import xsna.wzs;
import xsna.xzs;
import xsna.yvj;
import xsna.z7f0;

/* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
@b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {165, 168, 173}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$12 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ n7i<s3q0> $listenerStarted;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {167}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<lsr<? super OfferwallShowEvent>, spj<? super s3q0>, Object> {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new AnonymousClass1(this.this$0, this.$showOptions, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                a.a(obj);
                sh50<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                str = this.this$0.opportunityId;
                DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(str, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                this.label = 1;
                if (displayMessages.emit(displayReady, this) == coroutineSingletons) {
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

        @Override // xsna.wzs
        public final Object invoke(lsr<? super OfferwallShowEvent> lsrVar, spj<? super s3q0> spjVar) {
            return ((AnonymousClass1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    @b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements wzs<OfferwallShowEvent, spj<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(spj<? super AnonymousClass2> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(spjVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // xsna.wzs
        public final Object invoke(OfferwallShowEvent offerwallShowEvent, spj<? super Boolean> spjVar) {
            return ((AnonymousClass2) create(offerwallShowEvent, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            return Boolean.valueOf(epx.f((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$12(n7i<s3q0> n7iVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, spj<? super AndroidFullscreenWebViewAdPlayer$show$12> spjVar) {
        super(2, spjVar);
        this.$listenerStarted = n7iVar;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidFullscreenWebViewAdPlayer$show$12(this.$listenerStarted, this.this$0, this.$showOptions, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (r1.collect(r3, r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (xsna.rsr.o(r4, r8, r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r8.H(r7) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OfferwallManager offerwallManager;
        WebViewAdPlayer webViewAdPlayer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            n7i<s3q0> n7iVar = this.$listenerStarted;
            this.label = 1;
        } else if (i == 1) {
            a.a(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                return s3q0.a;
            }
            a.a(obj);
            offerwallManager = this.this$0.offerwallManager;
            String offerwallPlacementName = ((AndroidShowOptions) this.$showOptions).getOfferwallPlacementName();
            if (offerwallPlacementName == null) {
                offerwallPlacementName = "";
            }
            final z7f0 t = rsr.t(offerwallManager.showAd(offerwallPlacementName), this.this$0.getScope(), 5);
            ksr<OfferwallEvent> ksrVar = new ksr<OfferwallEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    final /* synthetic */ lsr $this_unsafeFlow;

                    @b6l(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {52}, m = "emit")
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
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

                    public AnonymousClass2(lsr lsrVar) {
                        this.$this_unsafeFlow = lsrVar;
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
                                    a.a(obj2);
                                    lsr lsrVar = this.$this_unsafeFlow;
                                    OfferwallEvent offerwallEvent = ((OfferwallEventData) obj).getOfferwallEvent();
                                    if (offerwallEvent != null) {
                                        anonymousClass1.label = 1;
                                        if (lsrVar.emit(offerwallEvent, anonymousClass1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a.a(obj2);
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
                public Object collect(lsr<? super OfferwallEvent> lsrVar, spj spjVar) {
                    Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            };
            webViewAdPlayer = this.this$0.webViewAdPlayer;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(webViewAdPlayer);
            this.label = 3;
        }
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(this.this$0.getOnOfferwallEvent(), new AnonymousClass1(this.this$0, this.$showOptions, null));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
        this.label = 2;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((AndroidFullscreenWebViewAdPlayer$show$12) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* compiled from: AndroidFullscreenWebViewAdPlayer.kt */
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$4, reason: invalid class name */
    public /* synthetic */ class AnonymousClass4 implements lsr, g0t {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        public final Object emit(OfferwallEvent offerwallEvent, spj<? super s3q0> spjVar) {
            Object sendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, spjVar);
            return sendOfferwallEvent == CoroutineSingletons.COROUTINE_SUSPENDED ? sendOfferwallEvent : s3q0.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lsr) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.lsr
        public /* bridge */ /* synthetic */ Object emit(Object obj, spj spjVar) {
            return emit((OfferwallEvent) obj, (spj<? super s3q0>) spjVar);
        }
    }
}
