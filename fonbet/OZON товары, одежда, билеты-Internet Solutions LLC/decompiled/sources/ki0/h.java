package ki0;

import B1.C2548q;
import J4.A;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.joda.time.DateTime;

/* loaded from: classes3.dex */
final class h implements Callable<Unit> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DateTime f71653a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f71654b;

    h(b bVar, DateTime dateTime) {
        this.f71654b = bVar;
        this.f71653a = dateTime;
    }

    @Override // java.util.concurrent.Callable
    @NonNull
    public final Unit call() throws Exception {
        A a11;
        A a12;
        b bVar = this.f71654b;
        a11 = bVar.f71641f;
        O4.f acquire = a11.acquire();
        C2548q c2548q = bVar.f71638c;
        DateTime dateTime = this.f71653a;
        c2548q.getClass();
        acquire.m0(1, Long.valueOf(dateTime.getMillis()).longValue());
        try {
            bVar.f71636a.beginTransaction();
            try {
                acquire.C();
                bVar.f71636a.setTransactionSuccessful();
                return Unit.f71690a;
            } finally {
                bVar.f71636a.endTransaction();
            }
        } finally {
            a12 = bVar.f71641f;
            a12.release(acquire);
        }
    }
}
