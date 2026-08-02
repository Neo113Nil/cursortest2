package A5;

import android.widget.Button;
import kotlin.jvm.internal.Intrinsics;
import y5.C6855b;

/* renamed from: A5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1020h extends A {

    /* renamed from: y, reason: collision with root package name */
    public final Button f127y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1020h(Button button, C6855b hierarchyMaskConfiguration) {
        super(button, hierarchyMaskConfiguration, null, 4, null);
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        this.f127y = button;
    }

    @Override // A5.A, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1020h) && super.equals(obj) && Intrinsics.areEqual(this.f127y, ((C1020h) obj).f127y);
    }

    @Override // A5.A, A5.H
    public int hashCode() {
        return (super.hashCode() * 31) + this.f127y.hashCode();
    }

    @Override // A5.A, A5.H
    public String toString() {
        return "ButtonMetadata(text='" + l() + "')";
    }
}
