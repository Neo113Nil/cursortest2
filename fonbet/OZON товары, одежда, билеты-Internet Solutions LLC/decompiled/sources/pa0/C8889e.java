package pa0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import pa0.C8885a;
import qa0.C9016a;
import ru.ozon.fintech.wallet.manager.domain.WalletManager;

/* renamed from: pa0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8889e implements Jb.e<WalletManager> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f80380a;

    public C8889e(Pc.a<Context> aVar) {
        this.f80380a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((C8885a.C1352a) this.f80380a).get();
        Intrinsics.checkNotNullParameter(context, "context");
        return new C9016a(context);
    }
}
