package li0;

import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import kotlin.Unit;
import ru.ozon.tracker.db.entities.UserData;

/* loaded from: classes7.dex */
final class o implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UserData f73366a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f73367b;

    o(p pVar, UserData userData) {
        this.f73367b = pVar;
        this.f73366a = userData;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() throws Exception {
        J4.l lVar;
        p pVar = this.f73367b;
        pVar.f73368a.beginTransaction();
        try {
            lVar = pVar.f73369b;
            lVar.insert((J4.l) this.f73366a);
            pVar.f73368a.setTransactionSuccessful();
            return Unit.f71690a;
        } finally {
            pVar.f73368a.endTransaction();
        }
    }
}
