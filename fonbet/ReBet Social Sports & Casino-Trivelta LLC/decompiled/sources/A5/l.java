package A5;

import android.widget.EditText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w5.EnumC6705a;
import y5.C6855b;

/* loaded from: classes2.dex */
public final class l extends A {

    /* renamed from: A, reason: collision with root package name */
    public final String f135A;

    /* renamed from: y, reason: collision with root package name */
    public final EditText f136y;

    /* renamed from: z, reason: collision with root package name */
    public final C6855b f137z;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6705a.values().length];
            try {
                iArr[EnumC6705a.f67419p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ l(EditText editText, C6855b c6855b, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(editText, c6855b, str);
        CharSequence hint;
        if ((i10 & 4) != 0 && ((hint = editText.getHint()) == null || (str = hint.toString()) == null)) {
            str = "";
        }
    }

    @Override // A5.A, A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f136y, lVar.f136y) && Intrinsics.areEqual(this.f137z, lVar.f137z) && Intrinsics.areEqual(this.f135A, lVar.f135A);
    }

    @Override // A5.A, A5.H
    public int hashCode() {
        return (((this.f136y.hashCode() * 31) + this.f137z.hashCode()) * 31) + this.f135A.hashCode();
    }

    public final boolean n(EnumC6705a enumC6705a) {
        return a.$EnumSwitchMapping$0[enumC6705a.ordinal()] == 1 ? this.f136y.getInputType() == 0 : o(enumC6705a);
    }

    public final boolean o(EnumC6705a enumC6705a) {
        return (this.f136y.getInputType() & 15) == (enumC6705a.b() & 15) && (this.f136y.getInputType() & 4080) == (enumC6705a.b() & 4080);
    }

    public final boolean p() {
        if (this.f137z.c()) {
            return true;
        }
        List b10 = this.f137z.b();
        if ((b10 instanceof Collection) && b10.isEmpty()) {
            return false;
        }
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            if (n((EnumC6705a) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // A5.A, A5.H
    public String toString() {
        return "EditTextMetadata(editText=" + this.f136y + ", hierarchyMaskConfiguration=" + this.f137z + ", hint=" + this.f135A + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(EditText editText, C6855b hierarchyMaskConfiguration, String hint) {
        super(editText, hierarchyMaskConfiguration, null, 4, null);
        Intrinsics.checkNotNullParameter(editText, "editText");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f136y = editText;
        this.f137z = hierarchyMaskConfiguration;
        this.f135A = hint;
        j(p());
    }
}
