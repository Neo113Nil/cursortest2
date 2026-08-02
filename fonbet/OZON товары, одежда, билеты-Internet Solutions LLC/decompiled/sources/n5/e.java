package n5;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final BitmapDrawable f76518a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f76519b;

    public e(@NotNull BitmapDrawable bitmapDrawable, boolean z11) {
        this.f76518a = bitmapDrawable;
        this.f76519b = z11;
    }

    @NotNull
    public final Drawable a() {
        return this.f76518a;
    }

    public final boolean b() {
        return this.f76519b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f76518a.equals(eVar.f76518a) && this.f76519b == eVar.f76519b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76519b) + (this.f76518a.hashCode() * 31);
    }
}
