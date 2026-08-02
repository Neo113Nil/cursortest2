package f30;

import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.domain.usecases.C9397n;
import ru.ozon.fintech.analytic.db.MobileHealthDatabase;
import si0.C9700a;

/* loaded from: classes3.dex */
public final class k implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62527a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f62528b;

    public /* synthetic */ k(Object obj, int i11) {
        this.f62527a = i11;
        this.f62528b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f62527a) {
            case 0:
                MobileHealthDatabase db2 = (MobileHealthDatabase) ((Pc.a) this.f62528b).get();
                Intrinsics.checkNotNullParameter(db2, "db");
                d30.l a11 = db2.a();
                Jb.j.d(a11);
                return a11;
            case 1:
                return new C9397n((ru.ozon.android.messenger.framework.domain.repository.b) ((Pc.a) this.f62528b).get());
            default:
                ((C9700a) this.f62528b).getClass();
                return new Fi0.a(Li0.a.f17089a);
        }
    }
}
