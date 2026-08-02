package gk0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f64557a;

    /* renamed from: b, reason: collision with root package name */
    private final String f64558b;

    public s(@NotNull View view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f64557a = view;
        this.f64558b = str;
    }

    public final String a() {
        return this.f64558b;
    }

    @NotNull
    public final View b() {
        return this.f64557a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f64557a, sVar.f64557a) && Intrinsics.d(this.f64558b, sVar.f64558b);
    }

    public final int hashCode() {
        int hashCode = this.f64557a.hashCode() * 31;
        String str = this.f64558b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "PreCreationViewPoolItem(view=" + this.f64557a + ", tag=" + this.f64558b + ")";
    }
}
