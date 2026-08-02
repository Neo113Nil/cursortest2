package dc0;

import C.o0;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: dc0.Q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6153Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f61521a;

    private /* synthetic */ C6153Q(String str) {
        this.f61521a = str;
    }

    public static final /* synthetic */ C6153Q a(String str) {
        return new C6153Q(str);
    }

    public final /* synthetic */ String b() {
        return this.f61521a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6153Q) {
            return Intrinsics.d(this.f61521a, ((C6153Q) obj).f61521a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61521a.hashCode();
    }

    public final String toString() {
        return o0.c(new StringBuilder("SimpleCookie(value="), this.f61521a, ")");
    }
}
