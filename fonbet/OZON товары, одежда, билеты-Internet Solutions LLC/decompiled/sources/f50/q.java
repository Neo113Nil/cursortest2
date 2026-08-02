package f50;

import ru.ozon.android.messenger.framework.data.local.database.MessengerDB;

/* loaded from: classes3.dex */
public final class q implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62940a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f62941b;

    public /* synthetic */ q(Pc.a aVar, int i11) {
        this.f62940a = i11;
        this.f62941b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f62940a) {
            case 0:
                return new p((L30.l) this.f62941b.get());
            default:
                return new ru.ozon.android.messenger.framework.data.local.database.a((MessengerDB) this.f62941b.get());
        }
    }
}
