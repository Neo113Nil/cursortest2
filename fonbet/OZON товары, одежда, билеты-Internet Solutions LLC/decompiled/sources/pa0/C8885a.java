package pa0;

import Jb.j;
import android.content.Context;
import ru.ozon.fintech.wallet.manager.domain.WalletManager;

/* renamed from: pa0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8885a implements InterfaceC8886b {

    /* renamed from: a, reason: collision with root package name */
    private Pc.a<Context> f80376a;

    /* renamed from: b, reason: collision with root package name */
    private Pc.a<WalletManager> f80377b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pa0.a$a, reason: collision with other inner class name */
    static final class C1352a implements Pc.a<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final P30.b f80378a;

        C1352a(P30.b bVar) {
            this.f80378a = bVar;
        }

        @Override // Pc.a
        public final Context get() {
            Context h11 = this.f80378a.h();
            j.c(h11);
            return h11;
        }
    }

    C8885a(P30.b bVar) {
        C1352a c1352a = new C1352a(bVar);
        this.f80376a = c1352a;
        this.f80377b = Jb.d.b(new C8889e(c1352a));
    }

    @Override // oa0.InterfaceC8681a
    public final WalletManager t() {
        return this.f80377b.get();
    }
}
