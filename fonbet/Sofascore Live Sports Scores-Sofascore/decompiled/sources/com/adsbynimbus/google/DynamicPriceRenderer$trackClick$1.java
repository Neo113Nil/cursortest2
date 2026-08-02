package com.adsbynimbus.google;

import defpackage.a70;
import defpackage.cjb;
import defpackage.hoi;
import defpackage.il4;
import defpackage.k38;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xka;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {1, 8, 0})
@il4(c = "com.adsbynimbus.google.DynamicPriceRenderer$trackClick$1", f = "DynamicPriceRenderer.kt", l = {394}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DynamicPriceRenderer$trackClick$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    public int r;
    public final /* synthetic */ RenderEvent s;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lk38;", "it", "", "invoke-kT5Y-7U", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.adsbynimbus.google.DynamicPriceRenderer$trackClick$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends xka implements Function1<k38, Unit> {
        public static final AnonymousClass1 i = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            m23invokekT5Y7U(((k38) obj).a);
            return Unit.a;
        }

        /* renamed from: invoke-kT5Y-7U, reason: not valid java name */
        public final void m23invokekT5Y7U(String str) {
            str.getClass();
            cjb.a("Error firing Google click tracker");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicPriceRenderer$trackClick$1(RenderEvent renderEvent, rq3<? super DynamicPriceRenderer$trackClick$1> rq3Var) {
        super(2, rq3Var);
        this.s = renderEvent;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new DynamicPriceRenderer$trackClick$1(this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((DynamicPriceRenderer$trackClick$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            String googleClickEvent = this.s.getGoogleClickEvent();
            googleClickEvent.getClass();
            AnonymousClass1 anonymousClass1 = AnonymousClass1.i;
            this.r = 1;
            obj = k38.a(googleClickEvent, null, null, anonymousClass1, this, 7);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        int intValue = ((Number) obj).intValue();
        if (200 <= intValue && intValue < 400) {
            cjb.a("Successfully fired Google click tracker");
        }
        return Unit.a;
    }
}
