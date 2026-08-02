package d30;

import Ij.C3261b;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes3.dex */
final class n implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f61127a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f61128b;

    n(m mVar, ArrayList arrayList) {
        this.f61128b = mVar;
        this.f61127a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() throws Exception {
        StringBuilder e11 = C3261b.e("DELETE FROM mobile_health_events WHERE id IN (");
        ArrayList arrayList = this.f61127a;
        L4.d.a(arrayList.size(), e11);
        e11.append(")");
        String sb2 = e11.toString();
        m mVar = this.f61128b;
        O4.f compileStatement = mVar.f61120a.compileStatement(sb2);
        Iterator it = arrayList.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            compileStatement.m0(i11, ((Long) it.next()).longValue());
            i11++;
        }
        mVar.f61120a.beginTransaction();
        try {
            compileStatement.C();
            mVar.f61120a.setTransactionSuccessful();
            return Unit.f71690a;
        } finally {
            mVar.f61120a.endTransaction();
        }
    }
}
