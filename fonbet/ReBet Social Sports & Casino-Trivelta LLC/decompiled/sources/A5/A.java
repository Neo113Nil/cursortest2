package A5;

import android.widget.TextView;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import y5.C6855b;

/* loaded from: classes2.dex */
public class A extends H {

    /* renamed from: w, reason: collision with root package name */
    public final TextView f63w;

    /* renamed from: x, reason: collision with root package name */
    public final String f64x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ A(TextView textView, C6855b c6855b, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(textView, c6855b, str);
        CharSequence text;
        if ((i10 & 4) != 0 && ((text = textView.getText()) == null || (str = text.toString()) == null)) {
            str = "";
        }
    }

    @Override // A5.H
    public String e() {
        String str = this.f64x;
        if (StringsKt.isBlank(str)) {
            str = null;
        }
        return str == null ? super.e() : str;
    }

    @Override // A5.H
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return Intrinsics.areEqual(this.f63w, a10.f63w) && Intrinsics.areEqual(this.f64x, a10.f64x);
    }

    @Override // A5.H
    public int hashCode() {
        return (this.f63w.hashCode() * 31) + this.f64x.hashCode();
    }

    public final String l() {
        return this.f64x;
    }

    public final boolean m(String str, C6855b c6855b) {
        Regex b10;
        if (str.length() == 0) {
            return false;
        }
        if (c6855b.c()) {
            return true;
        }
        List<String> d10 = c6855b.d();
        if ((d10 instanceof Collection) && d10.isEmpty()) {
            return false;
        }
        for (String str2 : d10) {
            if (!Intrinsics.areEqual(str, str2)) {
                b10 = B.b(str2);
                if (b10.matches(str)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // A5.H
    public String toString() {
        return "TextViewMetadata(text='" + this.f64x + "')";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(TextView textView, C6855b hierarchyMaskConfiguration, String text) {
        super(textView, null, 0, false, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 0, 0, false, false, false, null, 1048574, null);
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(hierarchyMaskConfiguration, "hierarchyMaskConfiguration");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f63w = textView;
        this.f64x = text;
        j(m(text, hierarchyMaskConfiguration));
    }
}
