package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ml5 implements InputFilter {
    public final TextView a;
    public ll5 b;

    public ml5(TextView textView) {
        this.a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (!textView.isInEditMode()) {
            int c = cl5.a().c();
            if (c != 0) {
                if (c == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return cl5.a().g(0, charSequence.length(), 0, charSequence);
                    }
                }
            }
            cl5 a = cl5.a();
            ll5 ll5Var = this.b;
            if (ll5Var == null) {
                ll5Var = new ll5(textView, this);
                this.b = ll5Var;
            }
            a.h(ll5Var);
            return charSequence;
        }
        return charSequence;
    }
}
