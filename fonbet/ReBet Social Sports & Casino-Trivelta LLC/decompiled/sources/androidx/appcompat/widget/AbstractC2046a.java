package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2102n0;
import androidx.core.view.InterfaceC2104o0;
import l.AbstractC5335a;

/* renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2046a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0342a f17243a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f17244b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f17245c;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuPresenter f17246d;

    /* renamed from: e, reason: collision with root package name */
    public int f17247e;

    /* renamed from: f, reason: collision with root package name */
    public C2102n0 f17248f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17249g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17250h;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0342a implements InterfaceC2104o0 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f17251a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f17252b;

        public C0342a() {
        }

        @Override // androidx.core.view.InterfaceC2104o0
        public void a(View view) {
            this.f17251a = true;
        }

        @Override // androidx.core.view.InterfaceC2104o0
        public void b(View view) {
            if (this.f17251a) {
                return;
            }
            AbstractC2046a abstractC2046a = AbstractC2046a.this;
            abstractC2046a.f17248f = null;
            AbstractC2046a.super.setVisibility(this.f17252b);
        }

        @Override // androidx.core.view.InterfaceC2104o0
        public void c(View view) {
            AbstractC2046a.super.setVisibility(0);
            this.f17251a = false;
        }

        public C0342a d(C2102n0 c2102n0, int i10) {
            AbstractC2046a.this.f17248f = c2102n0;
            this.f17252b = i10;
            return this;
        }
    }

    public AbstractC2046a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17243a = new C0342a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC5335a.f54986a, typedValue, true) || typedValue.resourceId == 0) {
            this.f17244b = context;
        } else {
            this.f17244b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public C2102n0 f(int i10, long j10) {
        C2102n0 c2102n0 = this.f17248f;
        if (c2102n0 != null) {
            c2102n0.c();
        }
        if (i10 != 0) {
            C2102n0 b10 = AbstractC2082d0.f(this).b(0.0f);
            b10.e(j10);
            b10.g(this.f17243a.d(b10, i10));
            return b10;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C2102n0 b11 = AbstractC2082d0.f(this).b(1.0f);
        b11.e(j10);
        b11.g(this.f17243a.d(b11, i10));
        return b11;
    }

    public int getAnimatedVisibility() {
        return this.f17248f != null ? this.f17243a.f17252b : getVisibility();
    }

    public int getContentHeight() {
        return this.f17247e;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, l.j.ActionBar, AbstractC5335a.f54988c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(l.j.f55310i, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f17246d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f17250h = false;
        }
        if (!this.f17250h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f17250h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f17250h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f17249g = false;
        }
        if (!this.f17249g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f17249g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f17249g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C2102n0 c2102n0 = this.f17248f;
            if (c2102n0 != null) {
                c2102n0.c();
            }
            super.setVisibility(i10);
        }
    }
}
