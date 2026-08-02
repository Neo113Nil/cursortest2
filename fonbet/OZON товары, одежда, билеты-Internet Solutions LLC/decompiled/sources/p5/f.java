package p5;

import Kk.C3532b;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import n5.EnumC8444d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Drawable f80222a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f80223b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC8444d f80224c;

    public f(@NotNull Drawable drawable, boolean z11, @NotNull EnumC8444d enumC8444d) {
        super(0);
        this.f80222a = drawable;
        this.f80223b = z11;
        this.f80224c = enumC8444d;
    }

    @NotNull
    public final EnumC8444d a() {
        return this.f80224c;
    }

    @NotNull
    public final Drawable b() {
        return this.f80222a;
    }

    public final boolean c() {
        return this.f80223b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f80222a, fVar.f80222a) && this.f80223b == fVar.f80223b && this.f80224c == fVar.f80224c;
    }

    public final int hashCode() {
        return this.f80224c.hashCode() + C3532b.a(this.f80222a.hashCode() * 31, 31, this.f80223b);
    }
}
