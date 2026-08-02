package r10;

import android.os.Bundle;
import androidx.fragment.app.G;
import j10.InterfaceC7238a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

/* renamed from: r10.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9158a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC7238a<l> f82842a;

    public C9158a(@NotNull InterfaceC7238a<l> composerStore) {
        Intrinsics.checkNotNullParameter(composerStore, "composerStore");
        this.f82842a = composerStore;
    }

    public final void a(@NotNull G fragmentManager) {
        E10.a b11;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        InterfaceC7238a<l> interfaceC7238a = this.f82842a;
        T00.e h11 = interfaceC7238a.b().m().h();
        if (h11 != null) {
            H10.c cVar = (H10.c) interfaceC7238a.b().a(H10.c.class);
            C9159b pageDebugInfo = new C9159b(h11.j(), h11.e(), h11.f(), h11.i(), h11.c(), h11.d(), (cVar == null || (b11 = cVar.b()) == null) ? null : Float.valueOf(b11.b()));
            Intrinsics.checkNotNullParameter(pageDebugInfo, "pageDebugInfo");
            C9162e c9162e = new C9162e();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ru.ozon.composer.ui.debug.pageinfo.PageDebugInfo", pageDebugInfo);
            c9162e.setArguments(bundle);
            c9162e.show(fragmentManager, C9162e.class.getSimpleName());
        }
    }
}
