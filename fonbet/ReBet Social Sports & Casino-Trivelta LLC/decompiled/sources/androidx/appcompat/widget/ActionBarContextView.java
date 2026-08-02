package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2102n0;
import l.AbstractC5335a;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC2046a {

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f16810i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f16811j;

    /* renamed from: k, reason: collision with root package name */
    public View f16812k;

    /* renamed from: l, reason: collision with root package name */
    public View f16813l;

    /* renamed from: m, reason: collision with root package name */
    public View f16814m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f16815n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f16816o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f16817p;

    /* renamed from: q, reason: collision with root package name */
    public int f16818q;

    /* renamed from: r, reason: collision with root package name */
    public int f16819r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16820s;

    /* renamed from: t, reason: collision with root package name */
    public int f16821t;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.b f16822a;

        public a(androidx.appcompat.view.b bVar) {
            this.f16822a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f16822a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AbstractC2046a
    public /* bridge */ /* synthetic */ C2102n0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f16812k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC2046a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC2046a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f16811j;
    }

    public CharSequence getTitle() {
        return this.f16810i;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f16812k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f16821t, (ViewGroup) this, false);
            this.f16812k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f16812k);
        }
        View findViewById = this.f16812k.findViewById(l.f.f55105j);
        this.f16813l = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f17246d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f17246d = actionMenuPresenter2;
        actionMenuPresenter2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f17246d, this.f17244b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f17246d.q(this);
        this.f17245c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f17245c, layoutParams);
    }

    public final void i() {
        if (this.f16815n == null) {
            LayoutInflater.from(getContext()).inflate(l.g.f55122a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f16815n = linearLayout;
            this.f16816o = (TextView) linearLayout.findViewById(l.f.f55101f);
            this.f16817p = (TextView) this.f16815n.findViewById(l.f.f55100e);
            if (this.f16818q != 0) {
                this.f16816o.setTextAppearance(getContext(), this.f16818q);
            }
            if (this.f16819r != 0) {
                this.f16817p.setTextAppearance(getContext(), this.f16819r);
            }
        }
        this.f16816o.setText(this.f16810i);
        this.f16817p.setText(this.f16811j);
        boolean isEmpty = TextUtils.isEmpty(this.f16810i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f16811j);
        this.f16817p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f16815n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f16815n.getParent() == null) {
            addView(this.f16815n);
        }
    }

    public boolean j() {
        return this.f16820s;
    }

    public void k() {
        removeAllViews();
        this.f16814m = null;
        this.f17245c = null;
        this.f17246d = null;
        View view = this.f16813l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.f17246d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.M();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f17246d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.D();
            this.f17246d.E();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC2046a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = l0.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f16812k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16812k.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = AbstractC2046a.d(paddingRight, i14, b10);
            paddingRight = AbstractC2046a.d(d10 + e(this.f16812k, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f16815n;
        if (linearLayout != null && this.f16814m == null && linearLayout.getVisibility() != 8) {
            i16 += e(this.f16815n, i16, paddingTop, paddingTop2, b10);
        }
        View view2 = this.f16814m;
        if (view2 != null) {
            e(view2, i16, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f17245c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f17247e;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i13 = i12 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        View view = this.f16812k;
        if (view != null) {
            int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16812k.getLayoutParams();
            paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f17245c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f17245c, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f16815n;
        if (linearLayout != null && this.f16814m == null) {
            if (this.f16820s) {
                this.f16815n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f16815n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f16815n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f16814m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i14 >= 0) {
                paddingLeft = Math.min(i14, paddingLeft);
            }
            int i16 = layoutParams.height;
            int i17 = i16 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i16 >= 0) {
                i13 = Math.min(i16, i13);
            }
            this.f16814m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
        }
        if (this.f17247e > 0) {
            setMeasuredDimension(size, i12);
            return;
        }
        int childCount = getChildCount();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i18) {
                i18 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override // androidx.appcompat.widget.AbstractC2046a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC2046a
    public void setContentHeight(int i10) {
        this.f17247e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f16814m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f16814m = view;
        if (view != null && (linearLayout = this.f16815n) != null) {
            removeView(linearLayout);
            this.f16815n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f16811j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f16810i = charSequence;
        i();
        AbstractC2082d0.o0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f16820s) {
            requestLayout();
        }
        this.f16820s = z10;
    }

    @Override // androidx.appcompat.widget.AbstractC2046a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54992g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a0 v10 = a0.v(context, attributeSet, l.j.ActionMode, i10, 0);
        setBackground(v10.g(l.j.f55366u));
        this.f16818q = v10.n(l.j.f55382y, 0);
        this.f16819r = v10.n(l.j.f55378x, 0);
        this.f17247e = v10.m(l.j.f55374w, 0);
        this.f16821t = v10.n(l.j.f55370v, l.g.f55125d);
        v10.x();
    }
}
