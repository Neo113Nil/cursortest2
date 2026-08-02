package li0;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* loaded from: classes7.dex */
final class l implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f73364a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f73365b;

    l(e eVar, List list) {
        this.f73365b = eVar;
        this.f73364a = list;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() throws Exception {
        e eVar = this.f73365b;
        eVar.f73342a.beginTransaction();
        try {
            eVar.f73343b.insert((Iterable) this.f73364a);
            eVar.f73342a.setTransactionSuccessful();
            return Unit.f71690a;
        } finally {
            eVar.f73342a.endTransaction();
        }
    }
}
