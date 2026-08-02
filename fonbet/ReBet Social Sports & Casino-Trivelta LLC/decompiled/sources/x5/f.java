package x5;

import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class f implements y5.c {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup.LayoutParams f67844a;

    /* renamed from: b, reason: collision with root package name */
    public final String f67845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67847d;

    public f(ViewGroup.LayoutParams layoutParams, String name, int i10, int i11) {
        Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f67844a = layoutParams;
        this.f67845b = name;
        this.f67846c = i10;
        this.f67847d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f67844a, fVar.f67844a) && Intrinsics.areEqual(this.f67845b, fVar.f67845b) && this.f67846c == fVar.f67846c && this.f67847d == fVar.f67847d;
    }

    public int hashCode() {
        return (((((this.f67844a.hashCode() * 31) + this.f67845b.hashCode()) * 31) + this.f67846c) * 31) + this.f67847d;
    }

    public String toString() {
        return "LayoutParamsViewGroup(height=" + this.f67847d + ", width=" + this.f67846c + ", name='" + this.f67845b + "')";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ f(ViewGroup.LayoutParams layoutParams, String str, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(layoutParams, str, (i12 & 4) != 0 ? layoutParams.width : i10, (i12 & 8) != 0 ? layoutParams.height : i11);
        if ((i12 & 2) != 0 && (str = layoutParams.getClass().getCanonicalName()) == null) {
            str = "";
        }
    }
}
