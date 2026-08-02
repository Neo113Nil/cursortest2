package l1;

import Sc.C;
import android.graphics.ColorFilter;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7795M extends C7809a0 {

    /* renamed from: b, reason: collision with root package name */
    private final long f72228b;

    /* renamed from: c, reason: collision with root package name */
    private final int f72229c;

    public C7795M(long j11, int i11, ColorFilter colorFilter) {
        super(colorFilter);
        this.f72228b = j11;
        this.f72229c = i11;
    }

    public final int b() {
        return this.f72229c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7795M)) {
            return false;
        }
        C7795M c7795m = (C7795M) obj;
        if (C7807Z.p(this.f72228b, c7795m.f72228b)) {
            return this.f72229c == c7795m.f72229c;
        }
        return false;
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Integer.hashCode(this.f72229c) + (Long.hashCode(this.f72228b) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        Bi.a.e(this.f72228b, ", blendMode=", sb2);
        int i11 = this.f72229c;
        sb2.append((Object) (i11 == 0 ? "Clear" : i11 == 1 ? "Src" : i11 == 2 ? "Dst" : i11 == 3 ? "SrcOver" : i11 == 4 ? "DstOver" : i11 == 5 ? "SrcIn" : i11 == 6 ? "DstIn" : i11 == 7 ? "SrcOut" : i11 == 8 ? "DstOut" : i11 == 9 ? "SrcAtop" : i11 == 10 ? "DstAtop" : i11 == 11 ? "Xor" : i11 == 12 ? "Plus" : i11 == 13 ? "Modulate" : i11 == 14 ? "Screen" : i11 == 15 ? "Overlay" : i11 == 16 ? "Darken" : i11 == 17 ? "Lighten" : i11 == 18 ? "ColorDodge" : i11 == 19 ? "ColorBurn" : i11 == 20 ? "HardLight" : i11 == 21 ? "Softlight" : i11 == 22 ? "Difference" : i11 == 23 ? "Exclusion" : i11 == 24 ? "Multiply" : i11 == 25 ? "Hue" : i11 == 26 ? "Saturation" : i11 == 27 ? "Color" : i11 == 28 ? "Luminosity" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
