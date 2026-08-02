package v5;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: v5.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10232f extends AbstractC10235i {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f102161a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10234h f102162b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Throwable f102163c;

    public C10232f(Drawable drawable, @NotNull C10234h c10234h, @NotNull Throwable th2) {
        super(0);
        this.f102161a = drawable;
        this.f102162b = c10234h;
        this.f102163c = th2;
    }

    @Override // v5.AbstractC10235i
    public final Drawable a() {
        return this.f102161a;
    }

    @Override // v5.AbstractC10235i
    @NotNull
    public final C10234h b() {
        return this.f102162b;
    }

    @NotNull
    public final Throwable c() {
        return this.f102163c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10232f)) {
            return false;
        }
        C10232f c10232f = (C10232f) obj;
        if (Intrinsics.d(this.f102161a, c10232f.f102161a)) {
            return Intrinsics.d(this.f102162b, c10232f.f102162b) && Intrinsics.d(this.f102163c, c10232f.f102163c);
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f102161a;
        return this.f102163c.hashCode() + ((this.f102162b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
