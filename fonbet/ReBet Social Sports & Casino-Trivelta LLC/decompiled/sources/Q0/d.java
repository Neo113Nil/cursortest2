package Q0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9193a;

    /* renamed from: b, reason: collision with root package name */
    public f.AbstractC0376f f9194b;

    public static class a extends f.AbstractC0376f {

        /* renamed from: a, reason: collision with root package name */
        public final Reference f9195a;

        /* renamed from: b, reason: collision with root package name */
        public final Reference f9196b;

        public a(TextView textView, d dVar) {
            this.f9195a = new WeakReference(textView);
            this.f9196b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.f.AbstractC0376f
        public void b() {
            CharSequence text;
            CharSequence p10;
            super.b();
            TextView textView = (TextView) this.f9195a.get();
            if (c(textView, (InputFilter) this.f9196b.get()) && textView.isAttachedToWindow() && text != (p10 = androidx.emoji2.text.f.c().p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(p10);
                int selectionEnd = Selection.getSelectionEnd(p10);
                textView.setText(p10);
                if (p10 instanceof Spannable) {
                    d.b((Spannable) p10, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(TextView textView) {
        this.f9193a = textView;
    }

    public static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    public final f.AbstractC0376f a() {
        if (this.f9194b == null) {
            this.f9194b = new a(this.f9193a, this);
        }
        return this.f9194b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f9193a.isInEditMode()) {
            return charSequence;
        }
        int e10 = androidx.emoji2.text.f.c().e();
        if (e10 != 0) {
            if (e10 == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f9193a.getText()) {
                    return charSequence;
                }
                if (charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.f.c().q(charSequence, 0, charSequence.length());
            }
            if (e10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.f.c().t(a());
        return charSequence;
    }
}
