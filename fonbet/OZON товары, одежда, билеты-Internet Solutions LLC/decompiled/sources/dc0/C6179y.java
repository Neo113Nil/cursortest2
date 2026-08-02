package dc0;

import C.o0;
import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* renamed from: dc0.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6179y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f61595a;

    private /* synthetic */ C6179y(String str) {
        this.f61595a = str;
    }

    public static final /* synthetic */ C6179y a(String str) {
        return new C6179y(str);
    }

    public final /* synthetic */ String b() {
        return this.f61595a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6179y) {
            return Intrinsics.d(this.f61595a, ((C6179y) obj).f61595a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f61595a.hashCode();
    }

    public final String toString() {
        return o0.c(new StringBuilder("FullFormatCookie(value="), this.f61595a, ")");
    }
}
