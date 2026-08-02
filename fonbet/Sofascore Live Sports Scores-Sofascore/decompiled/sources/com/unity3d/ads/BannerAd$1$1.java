package com.unity3d.ads;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import defpackage.a70;
import defpackage.b98;
import defpackage.f1d;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.wj0;
import defpackage.y6a;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.BannerAd$1$1", f = "BannerAd.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BannerAd$1$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    int label;
    final /* synthetic */ BannerAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAd$1$1(BannerAd bannerAd, rq3<? super BannerAd$1$1> rq3Var) {
        super(2, rq3Var);
        this.this$0 = bannerAd;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new BannerAd$1$1(this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((BannerAd$1$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        AdObject adObject;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            adObject = this.this$0.adObject;
            final f1d state = adObject.getState();
            final AdObjectState adObjectState = AdObjectState.EXPIRED;
            wj0 wj0Var = new wj0(new z88() { // from class: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1

                /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements b98 {
                    final /* synthetic */ b98 $this_unsafeFlow;
                    final /* synthetic */ AdObjectState receiver$inlined;

                    @il4(c = "com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2", f = "BannerAd.kt", l = {50}, m = "emit")
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.unity3d.ads.BannerAd$1$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends sq3 {
                        Object L$0;
                        Object L$1;
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

                    public AnonymousClass2(b98 b98Var, AdObjectState adObjectState) {
                        this.$this_unsafeFlow = b98Var;
                        this.receiver$inlined = adObjectState;
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
                                    if (this.receiver$inlined.equals(obj)) {
                                        anonymousClass1.label = 1;
                                        if (b98Var.emit(obj, anonymousClass1) == lu3Var) {
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
                    Object collect = z88.this.collect(new AnonymousClass2(b98Var, adObjectState), rq3Var);
                    return collect == lu3.a ? collect : Unit.a;
                }
            }, 2);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (wj0Var.collect(anonymousClass2, this) == lu3Var) {
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.BannerAd$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements b98 {
        final /* synthetic */ BannerAd this$0;

        public AnonymousClass2(BannerAd bannerAd) {
            this.this$0 = bannerAd;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit emit$lambda$0(BannerAd bannerAd) {
            AdExpiredListener<BannerAd> onAdExpired = bannerAd.getOnAdExpired();
            if (onAdExpired != null) {
                onAdExpired.onAdExpired(bannerAd);
            }
            return Unit.a;
        }

        public final Object emit(AdObjectState adObjectState, rq3<? super Unit> rq3Var) {
            SafeCallbackInvoke safeCallbackInvoke;
            safeCallbackInvoke = this.this$0.safeCallbackInvoke;
            safeCallbackInvoke.invoke(new a(this.this$0, 0));
            return Unit.a;
        }

        @Override // defpackage.b98
        public /* bridge */ /* synthetic */ Object emit(Object obj, rq3 rq3Var) {
            return emit((AdObjectState) obj, (rq3<? super Unit>) rq3Var);
        }
    }
}
