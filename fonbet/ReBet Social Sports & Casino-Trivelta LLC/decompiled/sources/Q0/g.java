package Q0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f9204a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9205b;

    /* renamed from: c, reason: collision with root package name */
    public f.AbstractC0376f f9206c;

    /* renamed from: d, reason: collision with root package name */
    public int f9207d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f9208e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9209f = true;

    public static class a extends f.AbstractC0376f {

        /* renamed from: a, reason: collision with root package name */
        public final Reference f9210a;

        public a(EditText editText) {
            this.f9210a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.f.AbstractC0376f
        public void b() {
            super.b();
            g.c((EditText) this.f9210a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f9204a = editText;
        this.f9205b = z10;
    }

    public static void c(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.f.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final f.AbstractC0376f a() {
        if (this.f9206c == null) {
            this.f9206c = new a(this.f9204a);
        }
        return this.f9206c;
    }

    public boolean b() {
        return this.f9209f;
    }

    public void d(boolean z10) {
        if (this.f9209f != z10) {
            if (this.f9206c != null) {
                androidx.emoji2.text.f.c().u(this.f9206c);
            }
            this.f9209f = z10;
            if (z10) {
                c(this.f9204a, androidx.emoji2.text.f.c().e());
            }
        }
    }

    public final boolean e() {
        if (this.f9209f) {
            return (this.f9205b || androidx.emoji2.text.f.i()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f9204a.isInEditMode() || e() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int e10 = androidx.emoji2.text.f.c().e();
        if (e10 != 0) {
            if (e10 == 1) {
                androidx.emoji2.text.f.c().s((Spannable) charSequence, i10, i10 + i12, this.f9207d, this.f9208e);
                return;
            } else if (e10 != 3) {
                return;
            }
        }
        androidx.emoji2.text.f.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
