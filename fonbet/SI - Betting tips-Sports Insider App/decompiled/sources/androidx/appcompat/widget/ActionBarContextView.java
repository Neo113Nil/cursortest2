package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final a f571a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f572b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f573c;

    /* renamed from: d, reason: collision with root package name */
    public n f574d;

    /* renamed from: e, reason: collision with root package name */
    public int f575e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.core.view.g1 f576f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f577g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f578h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f579i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public View f580k;

    /* renamed from: l, reason: collision with root package name */
    public View f581l;

    /* renamed from: m, reason: collision with root package name */
    public View f582m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f583n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f584o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f585p;
    public final int q;

    /* renamed from: r, reason: collision with root package name */
    public final int f586r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f587s;

    /* renamed from: t, reason: collision with root package name */
    public final int f588t;

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f571a = new a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f572b = context;
        } else {
            this.f572b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f10833d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : h8.b.n(context, resourceId));
        this.q = obtainStyledAttributes.getResourceId(5, 0);
        this.f586r = obtainStyledAttributes.getResourceId(4, 0);
        this.f575e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f588t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i5, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), i10);
        return Math.max(0, i5 - view.getMeasuredWidth());
    }

    public static int g(int i5, int i10, int i11, View view, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z5) {
            view.layout(i5 - measuredWidth, i12, i5, measuredHeight + i12);
        } else {
            view.layout(i5, i12, i5 + measuredWidth, measuredHeight + i12);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    public final void c(n.b bVar) {
        View view = this.f580k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f588t, (ViewGroup) this, false);
            this.f580k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f580k);
        }
        View findViewById = this.f580k.findViewById(R.id.action_mode_close_button);
        this.f581l = findViewById;
        findViewById.setOnClickListener(new c(0, bVar));
        androidx.appcompat.view.menu.n c2 = bVar.c();
        n nVar = this.f574d;
        if (nVar != null) {
            nVar.b();
            i iVar = nVar.f853u;
            if (iVar != null && iVar.b()) {
                iVar.f560i.dismiss();
            }
        }
        n nVar2 = new n(getContext());
        this.f574d = nVar2;
        nVar2.f846m = true;
        nVar2.f847n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.addMenuPresenter(this.f574d, this.f572b);
        n nVar3 = this.f574d;
        androidx.appcompat.view.menu.b0 b0Var = nVar3.f842h;
        if (b0Var == null) {
            androidx.appcompat.view.menu.b0 b0Var2 = (androidx.appcompat.view.menu.b0) nVar3.f838d.inflate(nVar3.f840f, (ViewGroup) this, false);
            nVar3.f842h = b0Var2;
            b0Var2.initialize(nVar3.f837c);
            nVar3.updateMenuView(true);
        }
        androidx.appcompat.view.menu.b0 b0Var3 = nVar3.f842h;
        if (b0Var != b0Var3) {
            ((ActionMenuView) b0Var3).setPresenter(nVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) b0Var3;
        this.f573c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f573c, layoutParams);
    }

    public final void d() {
        if (this.f583n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f583n = linearLayout;
            this.f584o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f585p = (TextView) this.f583n.findViewById(R.id.action_bar_subtitle);
            int i5 = this.q;
            if (i5 != 0) {
                this.f584o.setTextAppearance(getContext(), i5);
            }
            int i10 = this.f586r;
            if (i10 != 0) {
                this.f585p.setTextAppearance(getContext(), i10);
            }
        }
        this.f584o.setText(this.f579i);
        this.f585p.setText(this.j);
        boolean isEmpty = TextUtils.isEmpty(this.f579i);
        boolean isEmpty2 = TextUtils.isEmpty(this.j);
        this.f585p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f583n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f583n.getParent() == null) {
            addView(this.f583n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f582m = null;
        this.f573c = null;
        this.f574d = null;
        View view = this.f581l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f576f != null ? this.f571a.f676a : getVisibility();
    }

    public int getContentHeight() {
        return this.f575e;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.f579i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i5) {
        if (i5 != getVisibility()) {
            androidx.core.view.g1 g1Var = this.f576f;
            if (g1Var != null) {
                g1Var.b();
            }
            super.setVisibility(i5);
        }
    }

    public final androidx.core.view.g1 i(int i5, long j) {
        androidx.core.view.g1 g1Var = this.f576f;
        if (g1Var != null) {
            g1Var.b();
        }
        a aVar = this.f571a;
        if (i5 != 0) {
            androidx.core.view.g1 a7 = androidx.core.view.z0.a(this);
            a7.a(0.0f);
            a7.c(j);
            ((ActionBarContextView) aVar.f678c).f576f = a7;
            aVar.f676a = i5;
            a7.d(aVar);
            return a7;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.g1 a10 = androidx.core.view.z0.a(this);
        a10.a(1.0f);
        a10.c(j);
        ((ActionBarContextView) aVar.f678c).f576f = a10;
        aVar.f676a = i5;
        a10.d(aVar);
        return a10;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, i.a.f10830a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        n nVar = this.f574d;
        if (nVar != null) {
            Configuration configuration2 = nVar.f836b.getResources().getConfiguration();
            int i5 = configuration2.screenWidthDp;
            int i10 = configuration2.screenHeightDp;
            nVar.q = (configuration2.smallestScreenWidthDp > 600 || i5 > 600 || (i5 > 960 && i10 > 720) || (i5 > 720 && i10 > 960)) ? 5 : (i5 >= 500 || (i5 > 640 && i10 > 480) || (i5 > 480 && i10 > 640)) ? 4 : i5 >= 360 ? 3 : 2;
            androidx.appcompat.view.menu.n nVar2 = nVar.f837c;
            if (nVar2 != null) {
                nVar2.onItemsChanged(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n nVar = this.f574d;
        if (nVar != null) {
            nVar.b();
            i iVar = this.f574d.f853u;
            if (iVar == null || !iVar.b()) {
                return;
            }
            iVar.f560i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f578h = false;
        }
        if (!this.f578h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f578h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f578h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        boolean z7 = u4.f982a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? (i11 - i5) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f580k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f580k.getLayoutParams();
            int i13 = z10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = z10 ? paddingRight - i13 : paddingRight + i13;
            int g10 = g(i15, paddingTop, paddingTop2, this.f580k, z10) + i15;
            paddingRight = z10 ? g10 - i14 : g10 + i14;
        }
        LinearLayout linearLayout = this.f583n;
        if (linearLayout != null && this.f582m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(paddingRight, paddingTop, paddingTop2, this.f583n, z10);
        }
        View view2 = this.f582m;
        if (view2 != null) {
            g(paddingRight, paddingTop, paddingTop2, view2, z10);
        }
        int paddingLeft = z10 ? getPaddingLeft() : (i11 - i5) - getPaddingRight();
        ActionMenuView actionMenuView = this.f573c;
        if (actionMenuView != null) {
            g(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i5);
        int i11 = this.f575e;
        if (i11 <= 0) {
            i11 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i12 = i11 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        View view = this.f580k;
        if (view != null) {
            int f6 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f580k.getLayoutParams();
            paddingLeft = f6 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f573c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f573c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f583n;
        if (linearLayout != null && this.f582m == null) {
            if (this.f587s) {
                this.f583n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f583n.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f583n.setVisibility(z5 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f582m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = i13 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i13 >= 0) {
                paddingLeft = Math.min(i13, paddingLeft);
            }
            int i15 = layoutParams.height;
            int i16 = i15 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i15 >= 0) {
                i12 = Math.min(i15, i12);
            }
            this.f582m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i14), View.MeasureSpec.makeMeasureSpec(i12, i16));
        }
        if (this.f575e > 0) {
            setMeasuredDimension(size, i11);
            return;
        }
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i17) {
                i17 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i17);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f577g = false;
        }
        if (!this.f577g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f577g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f577g = false;
        return true;
    }

    public void setContentHeight(int i5) {
        this.f575e = i5;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f582m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f582m = view;
        if (view != null && (linearLayout = this.f583n) != null) {
            removeView(linearLayout);
            this.f583n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f579i = charSequence;
        d();
        androidx.core.view.z0.p(this, charSequence);
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.f587s) {
            requestLayout();
        }
        this.f587s = z5;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
