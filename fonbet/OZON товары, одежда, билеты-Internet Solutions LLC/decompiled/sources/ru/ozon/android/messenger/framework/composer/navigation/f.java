package ru.ozon.android.messenger.framework.composer.navigation;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.b;

/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.navigation.config.a f86724a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b.a f86725b;

    /* renamed from: c, reason: collision with root package name */
    private final String f86726c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final g f86727d;

    public f(ru.ozon.android.messenger.framework.composer.navigation.config.a composerPage, b.a displayMode) {
        String b11 = composerPage.b();
        Intrinsics.checkNotNullParameter(composerPage, "composerPage");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        this.f86724a = composerPage;
        this.f86725b = displayMode;
        this.f86726c = b11;
        this.f86727d = new g();
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.composer.navigation.config.a a() {
        return this.f86724a;
    }

    @NotNull
    public final b.a b() {
        return this.f86725b;
    }

    public final String c() {
        return this.f86726c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f86724a, fVar.f86724a) && this.f86725b == fVar.f86725b && Intrinsics.d(this.f86726c, fVar.f86726c);
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.e
    public final h getNavigator() {
        return this.f86727d;
    }

    public final int hashCode() {
        int hashCode = (this.f86725b.hashCode() + (this.f86724a.hashCode() * 31)) * 31;
        String str = this.f86726c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentDestination(composerPage=");
        sb2.append(this.f86724a);
        sb2.append(", displayMode=");
        sb2.append(this.f86725b);
        sb2.append(", tag=");
        return o0.c(sb2, this.f86726c, ")");
    }
}
