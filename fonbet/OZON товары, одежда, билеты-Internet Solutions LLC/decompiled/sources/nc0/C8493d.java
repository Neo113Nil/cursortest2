package nc0;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: nc0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8493d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.fragment.app.r f76753a;

    public C8493d(@NotNull androidx.fragment.app.r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f76753a = activity;
    }

    @NotNull
    public final Activity a() {
        return this.f76753a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8493d) {
            return Intrinsics.d(this.f76753a, ((C8493d) obj).f76753a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f76753a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CrossAppArgs(activity=" + this.f76753a + ", isInsideAuthFlow=true)";
    }
}
