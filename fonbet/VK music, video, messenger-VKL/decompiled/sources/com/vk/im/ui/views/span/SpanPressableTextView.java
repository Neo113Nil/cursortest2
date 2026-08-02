package com.vk.im.ui.views.span;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.au30;
import xsna.fot;
import xsna.jik0;
import xsna.pa;
import xsna.pk30;
import xsna.pxo0;
import xsna.s580;
import xsna.ub80;
import xsna.vb80;
import xsna.y670;
import xsna.zt30;

/* compiled from: SpanPressableTextView.kt */
/* loaded from: classes2.dex */
public class SpanPressableTextView extends AppCompatTextView {
    public final jik0 b;
    public final pxo0 c;
    public View.OnClickListener d;
    public View.OnLongClickListener e;
    public s580 f;
    public c g;
    public ub80 h;
    public vb80 i;
    public boolean j;
    public final fot k;

    /* compiled from: SpanPressableTextView.kt */
    public final class a implements ub80 {
        public a() {
        }

        @Override // xsna.ub80
        public final void c(ClickableSpan clickableSpan, View view) {
            ub80 onSpanClickListener;
            SpanPressableTextView spanPressableTextView = SpanPressableTextView.this;
            if (spanPressableTextView.c.a() || (onSpanClickListener = spanPressableTextView.getOnSpanClickListener()) == null) {
                return;
            }
            onSpanClickListener.c(clickableSpan, spanPressableTextView);
        }
    }

    /* compiled from: SpanPressableTextView.kt */
    public final class b implements vb80 {
        public b() {
        }

        @Override // xsna.vb80
        public final void k(ClickableSpan clickableSpan, View view) {
            SpanPressableTextView spanPressableTextView = SpanPressableTextView.this;
            vb80 onSpanLongPressListener = spanPressableTextView.getOnSpanLongPressListener();
            if (onSpanLongPressListener != null) {
                onSpanLongPressListener.k(clickableSpan, spanPressableTextView);
            }
        }
    }

    /* compiled from: SpanPressableTextView.kt */
    public interface c {
        void a();
    }

    /* compiled from: SpanPressableTextView.kt */
    public static final class d implements y670.a {
        public d() {
        }

        @Override // xsna.y670.a
        public final void a() {
            SpanPressableTextView spanPressableTextView = SpanPressableTextView.this;
            View.OnClickListener onClickListener = spanPressableTextView.d;
            if (onClickListener != null) {
                onClickListener.onClick(spanPressableTextView);
            }
        }

        @Override // xsna.y670.a
        public final void b() {
            zt30 zt30Var;
            au30 au30Var;
            s580 onDoubleTapListener = SpanPressableTextView.this.getOnDoubleTapListener();
            if (onDoubleTapListener == null || (au30Var = (zt30Var = (zt30) ((pa) onDoubleTapListener).c).f) == null) {
                return;
            }
            int i = au30Var.h;
            pk30 pk30Var = zt30Var.e;
            if (pk30Var != null) {
                pk30Var.C(i);
            }
        }

        @Override // xsna.y670.a
        public final void c() {
            SpanPressableTextView spanPressableTextView = SpanPressableTextView.this;
            View.OnLongClickListener onLongClickListener = spanPressableTextView.e;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(spanPressableTextView);
            }
        }
    }

    public SpanPressableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final s580 getOnDoubleTapListener() {
        return this.f;
    }

    public final ub80 getOnSpanClickListener() {
        return this.h;
    }

    public final vb80 getOnSpanLongPressListener() {
        return this.i;
    }

    public final c getOnTextSelectionListener() {
        return this.g;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        c cVar;
        super.onSelectionChanged(i, i2);
        if (i == i2 || (cVar = this.g) == null) {
            return;
        }
        cVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.j && this.b.onTouch(this, motionEvent)) || super.onTouchEvent(motionEvent) || this.k.a.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void setOnDoubleTapListener(s580 s580Var) {
        this.f = s580Var;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e = onLongClickListener;
    }

    public final void setOnSpanClickListener(ub80 ub80Var) {
        this.h = ub80Var;
    }

    public final void setOnSpanLongPressListener(vb80 vb80Var) {
        this.i = vb80Var;
    }

    public final void setOnTextSelectionListener(c cVar) {
        this.g = cVar;
    }

    public final void setSpanClicksEnabled(boolean z) {
        this.j = z;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (charSequence instanceof Spanned) {
            this.b.g = (Spanned) charSequence;
        }
    }

    public final void setTextSelectionEnabled(boolean z) {
        setTextIsSelectable(z);
    }

    public SpanPressableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        setEmojiCompatEnabled(false);
        jik0 jik0Var = new jik0(this);
        this.b = jik0Var;
        this.c = new pxo0(400L);
        this.j = true;
        Handler handler = new Handler(Looper.getMainLooper());
        y670 y670Var = new y670(context, handler, new d());
        y670Var.d = true;
        y670Var.e = true;
        y670Var.c.setIsLongpressEnabled(true);
        this.k = new fot(context, y670Var, handler);
        jik0Var.i = new a();
        jik0Var.j = new b();
    }
}
