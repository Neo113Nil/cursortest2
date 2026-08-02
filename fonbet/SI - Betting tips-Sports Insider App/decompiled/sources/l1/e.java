package l1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f19323a;

    /* renamed from: b, reason: collision with root package name */
    public d f19324b;

    public e(TextView textView) {
        this.f19323a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i5, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f19323a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b10 = j1.j.a().b();
        if (b10 != 0) {
            if (b10 == 1) {
                if ((i12 == 0 && i11 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i5 != 0 || i10 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i5, i10);
                }
                return j1.j.a().e(charSequence, 0, charSequence.length());
            }
            if (b10 != 3) {
                return charSequence;
            }
        }
        j1.j a7 = j1.j.a();
        if (this.f19324b == null) {
            this.f19324b = new d(textView, this);
        }
        a7.f(this.f19324b);
        return charSequence;
    }
}
