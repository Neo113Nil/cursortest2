package mi0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: mi0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8334d implements InterfaceC8333c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f75994a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f75995b;

    @Override // mi0.InterfaceC8333c
    public final void a(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f75994a.add(listener);
    }

    @Override // mi0.InterfaceC8333c
    public final void b(boolean z11) {
        if (z11 != this.f75995b) {
            Iterator it = this.f75994a.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(Boolean.valueOf(z11));
            }
        }
        this.f75995b = z11;
    }

    @Override // mi0.InterfaceC8333c
    public final boolean c() {
        return this.f75995b;
    }
}
