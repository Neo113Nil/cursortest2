package Y2;

import Q2.AbstractC1507s;
import Q2.AbstractC1508t;
import Q2.C1498i;
import Q2.InterfaceC1499j;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public class J implements InterfaceC1499j {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13926d = AbstractC1508t.i("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    public final Z2.b f13927a;

    /* renamed from: b, reason: collision with root package name */
    public final W2.a f13928b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.impl.model.c f13929c;

    public J(WorkDatabase workDatabase, W2.a aVar, Z2.b bVar) {
        this.f13928b = aVar;
        this.f13927a = bVar;
        this.f13929c = workDatabase.l();
    }

    public static /* synthetic */ Void b(J j10, UUID uuid, C1498i c1498i, Context context) {
        j10.getClass();
        String uuid2 = uuid.toString();
        WorkSpec i10 = j10.f13929c.i(uuid2);
        if (i10 == null || i10.state.b()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        j10.f13928b.a(uuid2, c1498i);
        context.startService(androidx.work.impl.foreground.a.d(context, X2.p.a(i10), c1498i));
        return null;
    }

    @Override // Q2.InterfaceC1499j
    public Ta.o a(final Context context, final UUID uuid, final C1498i c1498i) {
        return AbstractC1507s.f(this.f13927a.c(), "setForegroundAsync", new Function0() { // from class: Y2.I
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return J.b(J.this, uuid, c1498i, context);
            }
        });
    }
}
