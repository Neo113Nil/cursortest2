package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class a57 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ e57 t;
    public final /* synthetic */ mj7 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a57(e57 e57Var, mj7 mj7Var, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = e57Var;
        this.u = mj7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        mj7 mj7Var = this.u;
        e57 e57Var = this.t;
        switch (i) {
            case 0:
                return new a57(e57Var, mj7Var, rq3Var, 0);
            case 1:
                return new a57(e57Var, mj7Var, rq3Var, 1);
            default:
                return new a57(e57Var, mj7Var, rq3Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((a57) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.h21
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a57.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
