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
import androidx.appcompat.widget.n1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends n1 implements a0, View.OnClickListener, androidx.appcompat.widget.o {

    /* renamed from: a, reason: collision with root package name */
    public p f404a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f405b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f406c;

    /* renamed from: d, reason: collision with root package name */
    public m f407d;

    /* renamed from: e, reason: collision with root package name */
    public b f408e;

    /* renamed from: f, reason: collision with root package name */
    public c f409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f410g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f411h;

    /* renamed from: i, reason: collision with root package name */
    public final int f412i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f413k;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f410g = c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f10832c, 0, 0);
        this.f412i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f413k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.o
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.o
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f404a.getIcon() == null;
    }

    public final boolean c() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i5 < 480) {
            return (i5 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void d() {
        boolean z5 = true;
        boolean z7 = !TextUtils.isEmpty(this.f405b);
        if (this.f406c != null && ((this.f404a.f539y & 4) != 4 || (!this.f410g && !this.f411h))) {
            z5 = false;
        }
        boolean z10 = z7 & z5;
        setText(z10 ? this.f405b : null);
        CharSequence charSequence = this.f404a.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z10 ? null : this.f404a.f521e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f404a.f532r;
        if (TextUtils.isEmpty(charSequence2)) {
            m4.g.v(this, z10 ? null : this.f404a.f521e);
        } else {
            m4.g.v(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.a0
    public p getItemData() {
        return this.f404a;
    }

    @Override // androidx.appcompat.view.menu.a0
    public final void initialize(p pVar, int i5) {
        this.f404a = pVar;
        setIcon(pVar.getIcon());
        setTitle(pVar.getTitleCondensed());
        setId(pVar.f517a);
        setVisibility(pVar.isVisible() ? 0 : 8);
        setEnabled(pVar.isEnabled());
        if (pVar.hasSubMenu() && this.f408e == null) {
            this.f408e = new b(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m mVar = this.f407d;
        if (mVar != null) {
            mVar.a(this.f404a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f410g = c();
        d();
    }

    @Override // androidx.appcompat.widget.n1, android.widget.TextView, android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i11 = this.j) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f412i;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i10);
        }
        if (!isEmpty || this.f406c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f406c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f404a.hasSubMenu() && (bVar = this.f408e) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z5) {
        if (this.f411h != z5) {
            this.f411h = z5;
            p pVar = this.f404a;
            if (pVar != null) {
                pVar.f529n.onItemActionRequestChanged(pVar);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f406c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i5 = this.f413k;
            if (intrinsicWidth > i5) {
                intrinsicHeight = (int) (intrinsicHeight * (i5 / intrinsicWidth));
                intrinsicWidth = i5;
            }
            if (intrinsicHeight > i5) {
                intrinsicWidth = (int) (intrinsicWidth * (i5 / intrinsicHeight));
            } else {
                i5 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i5);
        }
        setCompoundDrawables(drawable, null, null, null);
        d();
    }

    public void setItemInvoker(m mVar) {
        this.f407d = mVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i5, int i10, int i11, int i12) {
        this.j = i5;
        super.setPadding(i5, i10, i11, i12);
    }

    public void setPopupCallback(c cVar) {
        this.f409f = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f405b = charSequence;
        d();
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }
}
