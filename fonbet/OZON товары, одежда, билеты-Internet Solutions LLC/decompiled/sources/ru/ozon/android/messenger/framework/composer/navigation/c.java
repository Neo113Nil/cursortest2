package ru.ozon.android.messenger.framework.composer.navigation;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.screen.b;

/* loaded from: classes10.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.navigation.config.a f86712a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b.a f86713b;

    /* renamed from: c, reason: collision with root package name */
    private final String f86714c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final d f86715d;

    public c(ru.ozon.android.messenger.framework.composer.navigation.config.a composerPage, b.a displayMode) {
        String b11 = composerPage.b();
        Intrinsics.checkNotNullParameter(composerPage, "composerPage");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        this.f86712a = composerPage;
        this.f86713b = displayMode;
        this.f86714c = b11;
        this.f86715d = new d();
    }

    @NotNull
    public final ru.ozon.android.messenger.framework.composer.navigation.config.a a() {
        return this.f86712a;
    }

    @NotNull
    public final b.a b() {
        return this.f86713b;
    }

    public final String c() {
        return this.f86714c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f86712a, cVar.f86712a) && this.f86713b == cVar.f86713b && Intrinsics.d(this.f86714c, cVar.f86714c);
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.e
    public final h getNavigator() {
        return this.f86715d;
    }

    public final int hashCode() {
        int hashCode = (this.f86713b.hashCode() + (this.f86712a.hashCode() * 31)) * 31;
        String str = this.f86714c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetFragmentDestination(composerPage=");
        sb2.append(this.f86712a);
        sb2.append(", displayMode=");
        sb2.append(this.f86713b);
        sb2.append(", tag=");
        return o0.c(sb2, this.f86714c, ")");
    }
}
