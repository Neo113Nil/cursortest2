package com.inmobi.media;

import android.content.Context;
import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vb extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ Wb b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vb(Wb wb, Context context, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = wb;
        this.c = context;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new Vb(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Vb(this.b, this.c, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            if (this.b.g.get()) {
                return Unit.a;
            }
            Wb wb = this.b;
            Context context = this.c;
            this.a = 1;
            if (wb.a(context, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        ku3 ku3Var = AbstractC3417fc.a;
        Kb kb = (Kb) Lb.a.getValue();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Wb wb2 = this.b;
        long j = timeInMillis - wb2.c;
        int i2 = wb2.e;
        kb.getClass();
        if (!AbstractC3417fc.c.getAndSet(true)) {
            xw3.L(Hl.a, null, null, new El(com.ironsource.Ua.s, null, new C3366dc(kb, j, i2, null)), 3);
        }
        return Unit.a;
    }
}
