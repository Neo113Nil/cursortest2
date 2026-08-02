package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cym implements Callable {
    public final /* synthetic */ List a;
    public final /* synthetic */ jx0 b;

    public cym(jx0 jx0Var, List list) {
        this.b = jx0Var;
        this.a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StringBuilder q = fc6.q("DELETE FROM analytics_track WHERE id IN (");
        List list = this.a;
        pea.m(list.size(), q);
        q.append(")");
        String sb = q.toString();
        jx0 jx0Var = this.b;
        k6g k6gVar = jx0Var.a;
        k6g k6gVar2 = jx0Var.a;
        mni compileStatement = k6gVar.compileStatement(sb);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            compileStatement.q(i, ((Long) it.next()).longValue());
            i++;
        }
        k6gVar2.beginTransaction();
        try {
            compileStatement.F();
            k6gVar2.setTransactionSuccessful();
            return Unit.a;
        } finally {
            k6gVar2.endTransaction();
        }
    }
}
