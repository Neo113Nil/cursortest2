package com.unity3d.ads.adplayer;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.a70;
import defpackage.b1d;
import defpackage.b98;
import defpackage.dt8;
import defpackage.hof;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lt8;
import defpackage.lu3;
import defpackage.ot8;
import defpackage.pa3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.un0;
import defpackage.v98;
import defpackage.weh;
import defpackage.y6a;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {165, 168, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidFullscreenWebViewAdPlayer$show$12 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ pa3 $listenerStarted;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb98;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "", "<anonymous>", "(Lb98;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {167}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<b98, rq3<? super Unit>, Object> {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return new AnonymousClass1(this.this$0, this.$showOptions, rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b98 b98Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(b98Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            String str;
            lu3 lu3Var = lu3.a;
            int i = this.label;
            if (i == 0) {
                y6a.M(obj);
                b1d displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                str = this.this$0.opportunityId;
                DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(str, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                this.label = 1;
                if (displayMessages.emit(displayReady, this) == lu3Var) {
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$2, reason: invalid class name */
    public static final class AnonymousClass2 extends hoi implements Function2<OfferwallShowEvent, rq3<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(rq3<? super AnonymousClass2> rq3Var) {
            super(2, rq3Var);
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(rq3Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OfferwallShowEvent offerwallShowEvent, rq3<? super Boolean> rq3Var) {
            return ((AnonymousClass2) create(offerwallShowEvent, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            lu3 lu3Var = lu3.a;
            if (this.label == 0) {
                y6a.M(obj);
                return Boolean.valueOf(Intrinsics.c((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$show$12(pa3 pa3Var, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, rq3<? super AndroidFullscreenWebViewAdPlayer$show$12> rq3Var) {
        super(2, rq3Var);
        this.$listenerStarted = pa3Var;
        this.this$0 = androidFullscreenWebViewAdPlayer;
        this.$showOptions = showOptions;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidFullscreenWebViewAdPlayer$show$12(this.$listenerStarted, this.this$0, this.$showOptions, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((AndroidFullscreenWebViewAdPlayer$show$12) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (r1.collect(r2, r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (defpackage.rd0.z(r5, r8, r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (((defpackage.qa3) r8).w(r7) == r0) goto L23;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        OfferwallManager offerwallManager;
        WebViewAdPlayer webViewAdPlayer;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            pa3 pa3Var = this.$listenerStarted;
            this.label = 1;
        } else if (i == 1) {
            y6a.M(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            offerwallManager = this.this$0.offerwallManager;
            String offerwallPlacementName = ((AndroidShowOptions) this.$showOptions).getOfferwallPlacementName();
            if (offerwallPlacementName == null) {
                offerwallPlacementName = "";
            }
            final hof H = un0.H(offerwallManager.showAd(offerwallPlacementName), this.this$0.getScope(), weh.a, 5);
            z88 z88Var = new z88() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1

                /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements b98 {
                    final /* synthetic */ b98 $this_unsafeFlow;

                    @il4(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {52}, m = "emit")
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends sq3 {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(rq3 rq3Var) {
                            super(rq3Var);
                        }

                        @Override // defpackage.h21
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(b98 b98Var) {
                        this.$this_unsafeFlow = b98Var;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                    @Override // defpackage.b98
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, rq3 rq3Var) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (rq3Var instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) rq3Var;
                            int i2 = anonymousClass1.label;
                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                lu3 lu3Var = lu3.a;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    y6a.M(obj2);
                                    b98 b98Var = this.$this_unsafeFlow;
                                    OfferwallEvent offerwallEvent = ((OfferwallEventData) obj).getOfferwallEvent();
                                    if (offerwallEvent != null) {
                                        anonymousClass1.label = 1;
                                        if (b98Var.emit(offerwallEvent, anonymousClass1) == lu3Var) {
                                            return lu3Var;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        a70.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    y6a.M(obj2);
                                }
                                return Unit.a;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(rq3Var);
                        Object obj22 = anonymousClass1.result;
                        lu3 lu3Var2 = lu3.a;
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.a;
                    }
                }

                @Override // defpackage.z88
                public Object collect(b98 b98Var, rq3 rq3Var) {
                    Object collect = z88.this.collect(new AnonymousClass2(b98Var), rq3Var);
                    return collect == lu3.a ? collect : Unit.a;
                }
            };
            webViewAdPlayer = this.this$0.webViewAdPlayer;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(webViewAdPlayer);
            this.label = 3;
        }
        v98 v98Var = new v98(new AnonymousClass1(this.this$0, this.$showOptions, null), this.this$0.getOnOfferwallEvent());
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
        this.label = 2;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$12$4, reason: invalid class name */
    public /* synthetic */ class AnonymousClass4 implements b98, lt8 {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        public final Object emit(OfferwallEvent offerwallEvent, rq3<? super Unit> rq3Var) {
            Object sendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, rq3Var);
            return sendOfferwallEvent == lu3.a ? sendOfferwallEvent : Unit.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof b98) && (obj instanceof lt8)) {
                return Intrinsics.c(getFunctionDelegate(), ((lt8) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // defpackage.lt8
        public final dt8 getFunctionDelegate() {
            return new ot8(2, 0, WebViewAdPlayer.class, this.$tmp0, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // defpackage.b98
        public /* bridge */ /* synthetic */ Object emit(Object obj, rq3 rq3Var) {
            return emit((OfferwallEvent) obj, (rq3<? super Unit>) rq3Var);
        }
    }
}
