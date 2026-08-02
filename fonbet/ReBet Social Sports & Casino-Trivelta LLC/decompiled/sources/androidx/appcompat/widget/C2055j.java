package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2055j {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f17327a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0.f f17328b;

    public C2055j(TextView textView) {
        this.f17327a = textView;
        this.f17328b = new Q0.f(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f17328b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f17328b.b();
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f17327a.getContext().obtainStyledAttributes(attributeSet, l.j.AppCompatTextView, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(l.j.f55311i0) ? obtainStyledAttributes.getBoolean(l.j.f55311i0, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void d(boolean z10) {
        this.f17328b.c(z10);
    }

    public void e(boolean z10) {
        this.f17328b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f17328b.e(transformationMethod);
    }
}
