package zd;

import Jd.InterfaceC3391a;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11097E extends y implements Jd.t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sd.c f108802a;

    public C11097E(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f108802a = fqName;
    }

    @Override // Jd.t
    @NotNull
    public final kotlin.collections.K D(@NotNull Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return kotlin.collections.K.f71697a;
    }

    @Override // Jd.t
    @NotNull
    public final Sd.c c() {
        return this.f108802a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11097E) {
            return Intrinsics.d(this.f108802a, ((C11097E) obj).f108802a);
        }
        return false;
    }

    @Override // Jd.d
    public final Collection getAnnotations() {
        return kotlin.collections.K.f71697a;
    }

    @Override // Jd.t
    @NotNull
    public final kotlin.collections.K h() {
        return kotlin.collections.K.f71697a;
    }

    public final int hashCode() {
        return this.f108802a.hashCode();
    }

    @Override // Jd.d
    public final InterfaceC3391a j(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }

    @NotNull
    public final String toString() {
        return C11097E.class.getName() + ": " + this.f108802a;
    }
}
