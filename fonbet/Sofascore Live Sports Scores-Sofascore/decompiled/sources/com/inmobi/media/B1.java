package com.inmobi.media;

import android.app.ApplicationExitInfo;
import defpackage.de6;
import defpackage.f6a;
import defpackage.hg6;
import defpackage.hoi;
import defpackage.lof;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class B1 extends hoi implements Function1 {
    public final /* synthetic */ C1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(C1 c1, rq3 rq3Var) {
        super(1, rq3Var);
        this.a = c1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new B1(this.a, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new B1(this.a, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        D1 d1;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        C1 c1 = this.a;
        List<ApplicationExitInfo> historicalProcessExitReasons = c1.f.getHistoricalProcessExitReasons(c1.b.getPackageName(), 0, 10);
        historicalProcessExitReasons.getClass();
        Qa qa = this.a.g;
        qa.getClass();
        long j = qa.a.getLong("exitReasonTimestamp", 0L);
        C1 c12 = this.a;
        Iterator<T> it = historicalProcessExitReasons.iterator();
        long j2 = j;
        while (it.hasNext()) {
            ApplicationExitInfo b = hg6.b(it.next());
            if (b.getTimestamp() > j) {
                try {
                    int reason = b.getReason();
                    String description = b.getDescription();
                    InputStream traceInputStream = b.getTraceInputStream();
                    d1 = new D1(description, reason, N3.a(traceInputStream != null ? new lof(f6a.I(traceInputStream)) : null, c12.d));
                } catch (Exception e) {
                    c12.e.getClass();
                    e.getMessage();
                    d1 = new D1(b.getDescription(), b.getReason(), de6.b(e));
                }
                xw3.L(Hl.a, null, null, new El(c12.c, null, new A1(c12, d1, null)), 3);
                if (b.getTimestamp() > j2) {
                    j2 = b.getTimestamp();
                }
            }
        }
        this.a.g.a("exitReasonTimestamp", j2, false);
        return Unit.a;
    }
}
