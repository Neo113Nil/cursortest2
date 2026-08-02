package com.vk.im.ui.views;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;
import xsna.gzs;
import xsna.pvu0;
import xsna.s3q0;

/* compiled from: RichEditText.kt */
/* loaded from: classes2.dex */
public final class RichEditText extends AppCompatEditText {
    public static final /* synthetic */ int g = 0;
    public boolean b;
    public b c;
    public c d;
    public gzs<s3q0> e;
    public final HashSet<Class<?>> f;

    /* compiled from: RichEditText.kt */
    public interface a {
    }

    /* compiled from: RichEditText.kt */
    public interface b {
        boolean a(int i);
    }

    /* compiled from: RichEditText.kt */
    public interface c {
        void b(int i, int i2);
    }

    public RichEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        d dVar = new d();
        HashSet<Class<?>> hashSet = new HashSet<>(4);
        this.f = hashSet;
        hashSet.add(RelativeSizeSpan.class);
        hashSet.add(AbsoluteSizeSpan.class);
        hashSet.add(StyleSpan.class);
        addTextChangedListener(dVar);
    }

    @Override // android.view.View
    public final void clearFocus() {
        if (this.b) {
            return;
        }
        super.clearFocus();
    }

    public final a getExtraContentListener() {
        return null;
    }

    public final b getOnKeyPreImeListener() {
        return this.c;
    }

    public final gzs<s3q0> getOnTextPastedListener() {
        return this.e;
    }

    public final c getSelectionChangeListener() {
        return this.d;
    }

    public final Pair<Integer, Integer> getSelectionYCoordinates() {
        Layout layout;
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart == -1 || selectionEnd == -1 || (layout = getLayout()) == null) {
            return null;
        }
        int lineForOffset = layout.getLineForOffset(selectionStart);
        int lineForOffset2 = layout.getLineForOffset(selectionEnd);
        int lineTop = layout.getLineTop(lineForOffset) - getScrollY();
        int lineBottom = layout.getLineBottom(lineForOffset2) - getScrollY();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i = iArr[1];
        return new Pair<>(Integer.valueOf(lineTop + i), Integer.valueOf(i + lineBottom));
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        b bVar = this.c;
        return bVar != null ? bVar.a(i) : super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        c cVar = this.d;
        if (cVar != null) {
            cVar.b(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i != 16908322) {
            return super.onTextContextMenuItem(i);
        }
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        gzs<s3q0> gzsVar = this.e;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        return onTextContextMenuItem;
    }

    public final void setKeepFocus(boolean z) {
        this.b = z;
        if (z || !hasFocus()) {
            return;
        }
        clearFocus();
        requestFocus();
    }

    public final void setOnKeyPreImeListener(b bVar) {
        this.c = bVar;
    }

    public final void setOnTextPastedListener(gzs<s3q0> gzsVar) {
        this.e = gzsVar;
    }

    public final void setSelectionChangeListener(c cVar) {
        this.d = cVar;
    }

    public final void setExtraContentListener(a aVar) {
    }

    /* compiled from: RichEditText.kt */
    public final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ClipDescription primaryClipDescription;
            int i = RichEditText.g;
            RichEditText richEditText = RichEditText.this;
            try {
                Object systemService = richEditText.getContext().getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                    return;
                }
                if (primaryClipDescription.hasMimeType("text/plain")) {
                    Object[] spans = editable.getSpans(0, editable.length(), MetricAffectingSpan.class);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : spans) {
                        if (!(((MetricAffectingSpan) obj) instanceof pvu0)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) it.next();
                        if (richEditText.f.contains(metricAffectingSpan.getClass())) {
                            editable.removeSpan(metricAffectingSpan);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
