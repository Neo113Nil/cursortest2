package x5;

import android.view.WindowManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h extends f {

    /* renamed from: e, reason: collision with root package name */
    public final WindowManager.LayoutParams f67856e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67857f;

    /* renamed from: g, reason: collision with root package name */
    public final float f67858g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f67859h;

    public /* synthetic */ h(WindowManager.LayoutParams layoutParams, int i10, float f10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutParams, (i11 & 2) != 0 ? layoutParams.type : i10, (i11 & 4) != 0 ? layoutParams.dimAmount : f10, (i11 & 8) != 0 ? i.b(layoutParams.flags, 2) : z10);
    }

    @Override // x5.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f67856e, hVar.f67856e) && this.f67857f == hVar.f67857f && Float.compare(this.f67858g, hVar.f67858g) == 0 && this.f67859h == hVar.f67859h;
    }

    @Override // x5.f
    public int hashCode() {
        return (((((this.f67856e.hashCode() * 31) + Integer.hashCode(this.f67857f)) * 31) + Float.hashCode(this.f67858g)) * 31) + Boolean.hashCode(this.f67859h);
    }

    @Override // x5.f
    public String toString() {
        return "LayoutParamsWindowManager(windowManagerLayoutParams=" + this.f67856e + ", type=" + this.f67857f + ", dimAmount=" + this.f67858g + ", isDimWindow=" + this.f67859h + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(WindowManager.LayoutParams windowManagerLayoutParams, int i10, float f10, boolean z10) {
        super(windowManagerLayoutParams, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(windowManagerLayoutParams, "windowManagerLayoutParams");
        this.f67856e = windowManagerLayoutParams;
        this.f67857f = i10;
        this.f67858g = f10;
        this.f67859h = z10;
    }
}
