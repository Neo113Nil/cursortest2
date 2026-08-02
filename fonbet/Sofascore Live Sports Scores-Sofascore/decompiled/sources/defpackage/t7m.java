package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t7m implements Callable {
    public final /* synthetic */ List a;
    public final /* synthetic */ dnm b;

    public t7m(dnm dnmVar, List list) {
        this.b = dnmVar;
        this.a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StringBuilder q = fc6.q("DELETE FROM analytics_do_not_track WHERE id IN (");
        List list = this.a;
        pea.m(list.size(), q);
        q.append(")");
        String sb = q.toString();
        dnm dnmVar = this.b;
        k6g k6gVar = dnmVar.a;
        k6g k6gVar2 = dnmVar.a;
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
