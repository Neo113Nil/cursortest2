package A5;

import android.widget.ImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w5.EnumC6708d;
import y5.C6855b;

/* loaded from: classes2.dex */
public final class q extends H {

    /* renamed from: A, reason: collision with root package name */
    public final C6855b f157A;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f158w;

    /* renamed from: x, reason: collision with root package name */
    public final EnumC6708d f159x;

    /* renamed from: y, reason: collision with root package name */
    public final int f160y;

    /* renamed from: z, reason: collision with root package name */
    public final int f161z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ q(ImageView imageView, EnumC6708d enumC6708d, int i10, int i11, C6855b c6855b, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageView, enumC6708d, (i12 & 4) != 0 ? r.d(imageView) : i10, (i12 & 8) != 0 ? r.c(imageView) : i11, c6855b);
        if ((i12 & 2) != 0) {
            EnumC6708d.a aVar = EnumC6708d.f67442a;
            ImageView.ScaleType scaleType = imageView.getScaleType();
            Intrinsics.checkNotNullExpressionValue(scaleType, "getScaleType(...)");
            enumC6708d = aVar.a(scaleType);
        }
    }

    @Override // A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f158w, qVar.f158w) && this.f159x == qVar.f159x && this.f160y == qVar.f160y && this.f161z == qVar.f161z && Intrinsics.areEqual(this.f157A, qVar.f157A);
    }

    @Override // A5.H
    public int hashCode() {
        return (((((((this.f158w.hashCode() * 31) + this.f159x.hashCode()) * 31) + Integer.hashCode(this.f160y)) * 31) + Integer.hashCode(this.f161z)) * 31) + this.f157A.hashCode();
    }

    @Override // A5.H
    public String toString() {
        return "ImageViewMetadata(imageView=" + this.f158w + ", scaleType=" + this.f159x + ", bitmapWidth=" + this.f160y + ", bitmapHeight=" + this.f161z + ", hierarchyMaskConfiguration=" + this.f157A + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ImageView imageView, EnumC6708d scaleType, int i10, int i11, C6855b hierarchyMaskConfiguration) {
        super(imageView, null, 0, false, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 0, false, false, false, null, 1048574, null);
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        this.f158w = imageView;
        this.f159x = scaleType;
        this.f160y = i10;
        this.f161z = i11;
        this.f157A = hierarchyMaskConfiguration;
        j(hierarchyMaskConfiguration.a());
    }
}
