package j1;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18232a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f18233b = new AtomicInteger(0);

    public s(Object obj) {
        this.f18232a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f18232a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        ((TextWatcher) this.f18232a).beforeTextChanged(charSequence, i5, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i5, int i10) {
        if (this.f18233b.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f18232a).onSpanAdded(spannable, obj, i5, i10);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i5, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.f18233b.get() <= 0 || !(obj instanceof v)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i5 > i10) {
                    i5 = 0;
                }
                if (i11 > i12) {
                    i13 = i5;
                    i14 = 0;
                    ((SpanWatcher) this.f18232a).onSpanChanged(spannable, obj, i13, i10, i14, i12);
                }
            }
            i13 = i5;
            i14 = i11;
            ((SpanWatcher) this.f18232a).onSpanChanged(spannable, obj, i13, i10, i14, i12);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i5, int i10) {
        if (this.f18233b.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f18232a).onSpanRemoved(spannable, obj, i5, i10);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        ((TextWatcher) this.f18232a).onTextChanged(charSequence, i5, i10, i11);
    }
}
