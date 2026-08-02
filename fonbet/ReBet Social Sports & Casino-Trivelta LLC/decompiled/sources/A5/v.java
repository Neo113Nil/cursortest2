package A5;

import android.widget.RadioGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v extends E {

    /* renamed from: A, reason: collision with root package name */
    public final int f177A;

    /* renamed from: z, reason: collision with root package name */
    public final RadioGroup f178z;

    public /* synthetic */ v(RadioGroup radioGroup, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(radioGroup, (i11 & 2) != 0 ? radioGroup.getCheckedRadioButtonId() : i10);
    }

    @Override // A5.E, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f178z, vVar.f178z) && this.f177A == vVar.f177A;
    }

    @Override // A5.E, A5.H
    public int hashCode() {
        return (this.f178z.hashCode() * 31) + Integer.hashCode(this.f177A);
    }

    @Override // A5.E, A5.H
    public String toString() {
        return "RadioGroupMetadata(radioGroup=" + this.f178z + ", checkedItemId=" + this.f177A + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(RadioGroup radioGroup, int i10) {
        super(radioGroup);
        Intrinsics.checkNotNullParameter(radioGroup, "radioGroup");
        this.f178z = radioGroup;
        this.f177A = i10;
    }
}
