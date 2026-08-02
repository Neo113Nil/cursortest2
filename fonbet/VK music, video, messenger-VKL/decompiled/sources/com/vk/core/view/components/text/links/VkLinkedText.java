package com.vk.core.view.components.text.links;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.links.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.bpn0;
import xsna.g2v0;
import xsna.iut0;
import xsna.izs;
import xsna.jjc;
import xsna.q01;
import xsna.s3q0;
import xsna.w6u0;
import xsna.w9l0;

/* compiled from: VkLinkedText.kt */
/* loaded from: classes17.dex */
public class VkLinkedText extends VkText implements a.InterfaceC0867a {
    public static final /* synthetic */ int j = 0;
    public izs<? super Throwable, s3q0> b;
    public com.vk.core.view.components.text.links.a c;
    public g2v0 d;
    public boolean e;
    public w6u0 f;
    public boolean g;
    public boolean h;
    public boolean i;

    /* compiled from: VkLinkedText.kt */
    public static final class a {
        public static final String a(View view) {
            int i = VkLinkedText.j;
            return view == null ? "null" : view.getId() == -1 ? "NO_ID" : view.getContext().getResources().getResourceName(view.getId());
        }
    }

    public VkLinkedText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[RETURN] */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bringPointIntoView(int i, boolean z) {
        boolean z2;
        if (i == 0) {
            if (this.h) {
                int i2 = Build.VERSION.SDK_INT;
                if ((i2 < 36 ? i2 * 100000 : Build.VERSION.SDK_INT_FULL) > 3600000) {
                    z2 = true;
                    if (z2) {
                        return true;
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        return super.bringPointIntoView(i, z);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.d.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public com.vk.core.view.components.text.links.a getDelegate() {
        return this.c;
    }

    public izs<Throwable, s3q0> getLogException() {
        return this.b;
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        try {
            if (this.e) {
                getDelegate().a(canvas);
                super.onDraw(canvas);
            } else {
                super.onDraw(canvas);
                getDelegate().a(canvas);
            }
        } catch (Exception unused) {
            getLogException().invoke(new Exception("parent=" + getClass().getSimpleName() + StringUtils.PROCESS_POSTFIX_DELIMITER + a.a((View) getParent()) + ", view=" + a.a(this)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        boolean z2;
        if (z && this.i) {
            if (this.h) {
                int i2 = Build.VERSION.SDK_INT;
                if ((i2 < 36 ? i2 * 100000 : Build.VERSION.SDK_INT_FULL) > 3600000) {
                    z2 = true;
                    if (z2) {
                        this.i = false;
                        return;
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        return getDelegate().b(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (IllegalStateException e) {
            getLogException().invoke(e);
            return false;
        }
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect, boolean z) {
        if (this.h) {
            return true;
        }
        return super.requestRectangleOnScreen(rect, z);
    }

    public final void setAccessibilityNodeInfoInitializer(w6u0 w6u0Var) {
        if (this.f != w6u0Var) {
            this.f = w6u0Var;
            this.d.g = w6u0Var;
        }
    }

    public final void setCanShowMessageOptions(boolean z) {
        com.vk.core.view.components.text.links.a delegate = getDelegate();
        delegate.g = z;
        if (delegate.f == null) {
            delegate.f = new GestureDetector(delegate.b.getContext(), delegate);
        }
    }

    public void setDelegate(com.vk.core.view.components.text.links.a aVar) {
        this.c = aVar;
    }

    public final void setDrawHighlightInBackground(boolean z) {
        this.e = z;
    }

    public void setHighlightCornerRadius(float f) {
        getDelegate().i = f;
    }

    public void setLogException(izs<? super Throwable, s3q0> izsVar) {
        this.b = izsVar;
    }

    public final void setOnLinkClickListener(View.OnClickListener onClickListener) {
        com.vk.core.view.components.text.links.a delegate = getDelegate();
        bpn0 bpn0Var = jjc.a;
        delegate.h = new q01(onClickListener, 2);
    }

    public final void setOnLinkClickListenerWithoutLock(View.OnClickListener onClickListener) {
        getDelegate().h = onClickListener;
    }

    public final void setShouldIgnoreScrollAfterGainFocus(boolean z) {
        this.h = z;
    }

    public final void setShouldSkipNextFocus(boolean z) {
        this.i = z;
    }

    public void setUseNewAccessibilityBehaviour(boolean z) {
        if (this.g != z) {
            this.g = z;
            g2v0 g2v0Var = this.d;
            if (g2v0Var.e != z) {
                g2v0Var.e = z;
                VkLinkedText vkLinkedText = g2v0Var.b;
                g2v0Var.f = z ? vkLinkedText.getContentDescription() : vkLinkedText.getText();
            }
        }
    }

    public VkLinkedText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new w9l0(13);
        this.c = new com.vk.core.view.components.text.links.a(this);
        this.d = new g2v0(this);
        setDrawingCacheEnabled(false);
        iut0.q(this, this.d);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        if (this.h) {
            return true;
        }
        return super.requestRectangleOnScreen(rect);
    }

    public /* synthetic */ VkLinkedText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.textViewStyle);
    }

    @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
    public View getView() {
        return this;
    }

    @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
    public void a(RectF rectF, float f) {
    }
}
