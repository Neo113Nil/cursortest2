package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C2068x;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.f0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C2068x implements j.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: a, reason: collision with root package name */
    public g f16604a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f16605b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f16606c;

    /* renamed from: d, reason: collision with root package name */
    public e.b f16607d;

    /* renamed from: e, reason: collision with root package name */
    public L f16608e;

    /* renamed from: f, reason: collision with root package name */
    public b f16609f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16610g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16611h;

    /* renamed from: i, reason: collision with root package name */
    public int f16612i;

    /* renamed from: j, reason: collision with root package name */
    public int f16613j;

    /* renamed from: k, reason: collision with root package name */
    public int f16614k;

    public class a extends L {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.L
        public r.f b() {
            b bVar = ActionMenuItemView.this.f16609f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.L
        public boolean c() {
            r.f b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f16607d;
            return bVar != null && bVar.b(actionMenuItemView.f16604a) && (b10 = b()) != null && b10.isShowing();
        }
    }

    public static abstract class b {
        public abstract r.f a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f16604a.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(g gVar, int i10) {
        this.f16604a = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f16608e == null) {
            this.f16608e = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return true;
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f16604a;
    }

    public final void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f16605b);
        if (this.f16606c != null && (!this.f16604a.B() || (!this.f16610g && !this.f16611h))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f16605b : null);
        CharSequence contentDescription = this.f16604a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f16604a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f16604a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            f0.a(this, z12 ? null : this.f16604a.getTitle());
        } else {
            f0.a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f16607d;
        if (bVar != null) {
            bVar.b(this.f16604a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f16610g = g();
        h();
    }

    @Override // androidx.appcompat.widget.C2068x, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean f10 = f();
        if (f10 && (i12 = this.f16613j) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f16612i) : this.f16612i;
        if (mode != 1073741824 && this.f16612i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (f10 || this.f16606c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f16606c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        L l10;
        if (this.f16604a.hasSubMenu() && (l10 = this.f16608e) != null && l10.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f16611h != z10) {
            this.f16611h = z10;
            g gVar = this.f16604a;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f16606c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f16614k;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f16607d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f16613j = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f16609f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f16605b = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f16610g = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.j.ActionMenuItemView, i10, 0);
        this.f16612i = obtainStyledAttributes.getDimensionPixelSize(l.j.f55362t, 0);
        obtainStyledAttributes.recycle();
        this.f16614k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f16613j = -1;
        setSaveEnabled(false);
    }
}
