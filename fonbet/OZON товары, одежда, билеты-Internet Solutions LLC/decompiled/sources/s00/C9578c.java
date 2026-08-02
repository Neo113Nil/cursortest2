package s00;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: s00.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9578c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f98097a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f98098b;

    public C9578c(@NotNull String initialText, @NotNull String currentText) {
        Intrinsics.checkNotNullParameter(initialText, "initialText");
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        this.f98097a = initialText;
        this.f98098b = currentText;
    }

    public static C9578c a(C9578c c9578c, String currentText) {
        String initialText = c9578c.f98097a;
        c9578c.getClass();
        Intrinsics.checkNotNullParameter(initialText, "initialText");
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        return new C9578c(initialText, currentText);
    }

    @NotNull
    public final String b() {
        return this.f98098b;
    }

    public final boolean c() {
        return Intrinsics.d(this.f98097a, this.f98098b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9578c)) {
            return false;
        }
        C9578c c9578c = (C9578c) obj;
        return Intrinsics.d(this.f98097a, c9578c.f98097a) && Intrinsics.d(this.f98098b, c9578c.f98098b);
    }

    public final int hashCode() {
        return this.f98098b.hashCode() + (this.f98097a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StingItemState(initialText=");
        sb2.append(this.f98097a);
        sb2.append(", currentText=");
        return o0.c(sb2, this.f98098b, ")");
    }
}
