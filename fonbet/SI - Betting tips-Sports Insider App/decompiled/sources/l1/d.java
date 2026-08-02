package l1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends j1.h {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f19321a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f19322b;

    public d(TextView textView, e eVar) {
        this.f19321a = new WeakReference(textView);
        this.f19322b = new WeakReference(eVar);
    }

    @Override // j1.h
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f19321a.get();
        InputFilter inputFilter = (InputFilter) this.f19322b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    j1.j a7 = j1.j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a7.getClass();
                        length = text.length();
                    }
                    CharSequence e7 = a7.e(text, 0, length);
                    if (text == e7) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e7);
                    int selectionEnd = Selection.getSelectionEnd(e7);
                    textView.setText(e7);
                    if (e7 instanceof Spannable) {
                        Spannable spannable = (Spannable) e7;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
