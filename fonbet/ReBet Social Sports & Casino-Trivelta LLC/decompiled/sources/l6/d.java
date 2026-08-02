package l6;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f55640a = new d();

    public static final boolean g(View view) {
        if (Y7.a.d(d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            d dVar = f55640a;
            if (dVar.c((TextView) view) || dVar.a((TextView) view) || dVar.d((TextView) view) || dVar.f((TextView) view) || dVar.e((TextView) view)) {
                return true;
            }
            return dVar.b((TextView) view);
        } catch (Throwable th2) {
            Y7.a.b(th2, d.class);
            return false;
        }
    }

    public final boolean a(TextView textView) {
        int i10;
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            String replace = new Regex("\\s").replace(f.k(textView), "");
            int length = replace.length();
            if (length >= 12 && length <= 19) {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z10 = false;
                    i10 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char charAt = replace.charAt(i11);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        int digitToInt = CharsKt.digitToInt(charAt);
                        if (z10 && (digitToInt = digitToInt * 2) > 9) {
                            digitToInt = (digitToInt % 10) + 1;
                        }
                        i10 += digitToInt;
                        z10 = !z10;
                        if (i12 < 0) {
                            break;
                        }
                        i11 = i12;
                    }
                } else {
                    i10 = 0;
                }
                if (i10 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final boolean b(TextView textView) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String k10 = f.k(textView);
            if (k10 != null && k10.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(k10).matches();
            }
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final boolean c(TextView textView) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final boolean d(TextView textView) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final boolean e(TextView textView) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }

    public final boolean f(TextView textView) {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }
}
