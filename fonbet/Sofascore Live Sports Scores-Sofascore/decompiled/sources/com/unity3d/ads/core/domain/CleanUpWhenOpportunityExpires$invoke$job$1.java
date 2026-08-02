package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import defpackage.a70;
import defpackage.eed;
import defpackage.fdi;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.wj0;
import defpackage.xd5;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", f = "CleanUpWhenOpportunityExpires.kt", l = {35, 36, 41}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ AdObject $adObject;
    int label;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", f = "CleanUpWhenOpportunityExpires.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        final /* synthetic */ AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
            this.$adObject = adObject;
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return new AnonymousClass1(this.$adObject, rq3Var);
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
                ((fdi) this.$adObject.getState()).l(AdObjectState.EXPIRED);
                AdPlayer adPlayer = this.$adObject.getAdPlayer();
                if (adPlayer != null) {
                    this.label = 1;
                    if (adPlayer.destroy(this) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    s9a.o(this.$adObject.getAdScope(), null);
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
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, rq3<? super CleanUpWhenOpportunityExpires$invoke$job$1> rq3Var) {
        super(2, rq3Var);
        this.$adObject = adObject;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (defpackage.xw3.R(r8, r1, r7) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (defpackage.n4o.z(r5, r7) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r8 == r0) goto L26;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xd5 xd5Var;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
            xd5Var = (xd5) ((fdi) this.$adObject.getTtl()).getValue();
            if (xd5Var == null) {
                wj0 wj0Var = new wj0(this.$adObject.getTtl(), 3);
                this.label = 1;
                obj = rd0.y(wj0Var, this);
            }
            long j = xd5Var.a;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                if (((fdi) this.$adObject.getState()).getValue() != AdObjectState.SHOWING) {
                    eed eedVar = eed.b;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, null);
                    this.label = 3;
                }
                return Unit.a;
            }
            y6a.M(obj);
        }
        xd5Var = (xd5) obj;
        long j2 = xd5Var.a;
        this.label = 2;
    }
}
