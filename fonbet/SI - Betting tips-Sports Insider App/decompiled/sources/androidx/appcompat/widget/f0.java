package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.d5;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f743a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.d f744b;

    public f0(TextView textView) {
        this.f743a = textView;
        this.f744b = new i2.d(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((d5) this.f744b.f10882b).t(inputFilterArr);
    }

    public final boolean b() {
        return ((d5) this.f744b.f10882b).z();
    }

    public final void c(AttributeSet attributeSet, int i5) {
        TypedArray obtainStyledAttributes = this.f743a.getContext().obtainStyledAttributes(attributeSet, i.a.f10838i, i5, 0);
        try {
            boolean z5 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            e(z5);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void d(boolean z5) {
        ((d5) this.f744b.f10882b).R(z5);
    }

    public final void e(boolean z5) {
        ((d5) this.f744b.f10882b).S(z5);
    }
}
