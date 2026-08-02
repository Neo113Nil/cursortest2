package ki0;

import J4.l;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class g implements Callable<List<Long>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f71651a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f71652b;

    g(b bVar, ArrayList arrayList) {
        this.f71652b = bVar;
        this.f71651a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final List<Long> call() throws Exception {
        l lVar;
        b bVar = this.f71652b;
        bVar.f71636a.beginTransaction();
        try {
            lVar = bVar.f71637b;
            List<Long> insertAndReturnIdsList = lVar.insertAndReturnIdsList(this.f71651a);
            bVar.f71636a.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            bVar.f71636a.endTransaction();
        }
    }
}
