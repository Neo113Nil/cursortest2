package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ac0 {
    public final TextView a;
    public final j0l b;

    public ac0(TextView textView) {
        this.a = textView;
        this.b = new j0l(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((s02) this.b.b).J(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, dkf.i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((s02) this.b.b).a0(z);
    }

    public final void d(boolean z) {
        ((s02) this.b.b).b0(z);
    }
}
