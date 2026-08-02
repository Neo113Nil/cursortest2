package n30;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: n30.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8437a {

    /* renamed from: a, reason: collision with root package name */
    private final String f76466a;

    public C8437a() {
        this(null, 7);
    }

    public final String a() {
        return this.f76466a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8437a) {
            return Intrinsics.d(this.f76466a, ((C8437a) obj).f76466a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f76466a;
        return (str == null ? 0 : str.hashCode()) * 961;
    }

    @NotNull
    public final String toString() {
        return o0.c(new StringBuilder("AnalyticsPage(name="), this.f76466a, ", layoutId=null, previousPage=null)");
    }

    public C8437a(String str, int i11) {
        this.f76466a = (i11 & 1) != 0 ? null : str;
    }
}
