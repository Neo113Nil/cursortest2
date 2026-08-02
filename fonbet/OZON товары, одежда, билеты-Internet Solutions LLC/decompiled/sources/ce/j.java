package ce;

import ie.InterfaceC7061j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j extends AbstractC5814a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<l> f57041b;

    public j(@NotNull ie.o storageManager, @NotNull Function0<? extends l> getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        this.f57041b = storageManager.a(new i(getScope));
    }

    @Override // ce.AbstractC5814a
    @NotNull
    protected final l i() {
        return this.f57041b.invoke();
    }
}
