package d30;

import Ij.C3261b;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: d30.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC6075f implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f61118a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6072c f61119b;

    CallableC6075f(C6072c c6072c, ArrayList arrayList) {
        this.f61119b = c6072c;
        this.f61118a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() throws Exception {
        StringBuilder e11 = C3261b.e("DELETE FROM graylog_event where id in (");
        ArrayList arrayList = this.f61118a;
        L4.d.a(arrayList.size(), e11);
        e11.append(")");
        String sb2 = e11.toString();
        C6072c c6072c = this.f61119b;
        O4.f compileStatement = c6072c.f61100a.compileStatement(sb2);
        Iterator it = arrayList.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            compileStatement.m0(i11, ((Integer) it.next()).intValue());
            i11++;
        }
        c6072c.f61100a.beginTransaction();
        try {
            compileStatement.C();
            c6072c.f61100a.setTransactionSuccessful();
            return Unit.f71690a;
        } finally {
            c6072c.f61100a.endTransaction();
        }
    }
}
