package defpackage;

import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j7m implements Callable {
    public final /* synthetic */ List a;
    public final /* synthetic */ bam b;

    public j7m(bam bamVar, List list) {
        this.b = bamVar;
        this.a = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StringBuilder q = fc6.q("DELETE FROM blaze_logs WHERE id IN (");
        List<String> list = this.a;
        pea.m(list.size(), q);
        q.append(")");
        String sb = q.toString();
        bam bamVar = this.b;
        k6g k6gVar = bamVar.a;
        k6g k6gVar2 = bamVar.a;
        mni compileStatement = k6gVar.compileStatement(sb);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                compileStatement.s(i);
            } else {
                compileStatement.m0(i, str);
            }
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
