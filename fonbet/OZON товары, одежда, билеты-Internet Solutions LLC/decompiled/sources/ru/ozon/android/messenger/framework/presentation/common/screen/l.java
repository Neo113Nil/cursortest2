package ru.ozon.android.messenger.framework.presentation.common.screen;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.screen.m;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f91132a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final m.a f91133b;

    public /* synthetic */ l(boolean z11) {
        this(z11, new m.a(null));
    }

    @NotNull
    public final m a() {
        return this.f91133b;
    }

    public final boolean b() {
        return this.f91132a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f91132a == lVar.f91132a && Intrinsics.d(this.f91133b, lVar.f91133b);
    }

    public final int hashCode() {
        return this.f91133b.hashCode() + (Boolean.hashCode(this.f91132a) * 31);
    }

    @NotNull
    public final String toString() {
        return "Loader(isShown=" + this.f91132a + ", loaderType=" + this.f91133b + ")";
    }

    public l(boolean z11, @NotNull m.a loaderType) {
        Intrinsics.checkNotNullParameter(loaderType, "loaderType");
        this.f91132a = z11;
        this.f91133b = loaderType;
    }
}
