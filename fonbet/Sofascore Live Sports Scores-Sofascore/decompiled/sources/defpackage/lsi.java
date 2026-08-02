package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.tabs.TabLayout;
import com.sofascore.results.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lsi extends LinearLayout {
    public static final /* synthetic */ int l = 0;
    public jsi a;
    public TextView b;
    public ImageView c;
    public View d;
    public cz0 e;
    public View f;
    public TextView g;
    public ImageView h;
    public Drawable i;
    public int j;
    public final /* synthetic */ TabLayout k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsi(TabLayout tabLayout, Context context) {
        super(context);
        this.k = tabLayout;
        this.j = 2;
        d(context);
        setPaddingRelative(tabLayout.e, tabLayout.f, tabLayout.g, tabLayout.h);
        setGravity(17);
        setOrientation(!tabLayout.D ? 1 : 0);
        setClickable(true);
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        WeakHashMap weakHashMap = bsk.a;
        urk.a(this, systemIcon);
    }

    @Nullable
    private cz0 getBadge() {
        return this.e;
    }

    @NonNull
    private cz0 getOrCreateBadge() {
        if (this.e == null) {
            this.e = new cz0(getContext());
        }
        b();
        cz0 cz0Var = this.e;
        if (cz0Var != null) {
            return cz0Var;
        }
        a70.r("Unable to create badge");
        return null;
    }

    public final void a() {
        if (this.e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.d;
            if (view != null) {
                cz0 cz0Var = this.e;
                if (cz0Var != null) {
                    if (cz0Var.d() != null) {
                        cz0Var.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(cz0Var);
                    }
                }
                this.d = null;
            }
        }
    }

    public final void b() {
        if (this.e != null) {
            if (this.f != null) {
                a();
                return;
            }
            TextView textView = this.b;
            if (textView == null || this.a == null) {
                a();
                return;
            }
            if (this.d == textView) {
                c(textView);
                return;
            }
            a();
            TextView textView2 = this.b;
            if (this.e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            cz0 cz0Var = this.e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            cz0Var.setBounds(rect);
            cz0Var.i(textView2, null);
            if (cz0Var.d() != null) {
                cz0Var.d().setForeground(cz0Var);
            } else {
                textView2.getOverlay().add(cz0Var);
            }
            this.d = textView2;
        }
    }

    public final void c(View view) {
        cz0 cz0Var = this.e;
        if (cz0Var == null || view != this.d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        cz0Var.setBounds(rect);
        cz0Var.i(view, null);
    }

    public final void d(Context context) {
        TabLayout tabLayout = this.k;
        int i = tabLayout.t;
        if (i != 0) {
            Drawable d0 = td4.d0(i, context);
            this.i = d0;
            if (d0 != null && d0.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable drawable = gradientDrawable;
        if (tabLayout.n != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.n;
            int[] iArr = rfo.l;
            int D = rfo.D(colorStateList, rfo.k);
            int[] iArr2 = rfo.j;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{D, rfo.D(colorStateList, iArr2), rfo.D(colorStateList, rfo.i)});
            if (tabLayout.H) {
                RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, null, null);
                ColorDrawable colorDrawable = FocusRingDrawable.p;
                drawable = rippleDrawable;
                if (x2a.L(context.getTheme(), R.attr.focusRingsEnabled, false)) {
                    drawable = new FocusRingDrawable(context, rippleDrawable);
                }
            } else {
                RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable, gradientDrawable2);
                FocusRingDrawable.f(context, rippleDrawable2, null);
                drawable = rippleDrawable2;
            }
        }
        setBackground(drawable);
        tabLayout.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
            invalidate();
            this.k.invalidate();
        }
    }

    public final void e() {
        int i;
        ViewParent parent;
        jsi jsiVar = this.a;
        View view = jsiVar != null ? jsiVar.c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f);
                }
                addView(view);
            }
            this.f = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.j = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view3 = this.f;
            if (view3 != null) {
                removeView(view3);
                this.f = null;
            }
            this.g = null;
            this.h = null;
        }
        if (this.f == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.b = textView3;
                addView(textView3);
                this.j = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.k;
            textView4.setTextAppearance(tabLayout.i);
            if (!isSelected() || (i = tabLayout.k) == -1) {
                this.b.setTextAppearance(tabLayout.j);
            } else {
                this.b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.l;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            f(this.b, this.c, true);
            b();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new v03(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new v03(this, textView5));
            }
        } else {
            TextView textView6 = this.g;
            if (textView6 != null || this.h != null) {
                f(textView6, this.h, false);
            }
        }
        if (jsiVar == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void f(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        jsi jsiVar = this.a;
        CharSequence charSequence = jsiVar != null ? jsiVar.a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (isEmpty) {
                z2 = false;
            } else {
                this.a.getClass();
                z2 = true;
            }
            textView.setText(!isEmpty ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int p = (z2 && imageView.getVisibility() == 0) ? (int) vha.p(8, getContext()) : 0;
            if (this.k.D) {
                if (p != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(p);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (p != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = p;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        qkj.a(this, isEmpty ? null : charSequence);
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.f};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return i - i2;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.f};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                i = z ? Math.max(i, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return i - i2;
    }

    @Nullable
    public jsi getTab() {
        return this.a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cz0 cz0Var = this.e;
        if (cz0Var != null && cz0Var.isVisible()) {
            cz0 cz0Var2 = this.e;
            dz0 dz0Var = cz0Var2.e;
            CharSequence charSequence = null;
            if (cz0Var2.isVisible()) {
                BadgeState$State badgeState$State = dz0Var.b;
                if (badgeState$State.j != null) {
                    charSequence = badgeState$State.o;
                    if (charSequence == null) {
                        charSequence = cz0Var2.e.b.j;
                    }
                } else if (!cz0Var2.g()) {
                    charSequence = badgeState$State.p;
                } else if (badgeState$State.q != 0 && (context = (Context) cz0Var2.a.get()) != null) {
                    if (cz0Var2.h != -2) {
                        int e = cz0Var2.e();
                        int i = cz0Var2.h;
                        if (e > i) {
                            charSequence = context.getString(badgeState$State.r, Integer.valueOf(i));
                        }
                    }
                    charSequence = context.getResources().getQuantityString(badgeState$State.q, cz0Var2.e(), Integer.valueOf(cz0Var2.e()));
                }
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) dad.w(0, 1, this.a.b, 1, isSelected()).b);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) x9.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.u, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.q;
            if (isSelected() && tabLayout.k != -1) {
                f = tabLayout.r;
            }
            int i3 = this.j;
            ImageView imageView = this.c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.s;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.C == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.a == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        jsi jsiVar = this.a;
        TabLayout tabLayout = jsiVar.d;
        if (tabLayout != null) {
            tabLayout.l(jsiVar, true);
            return true;
        }
        a70.p("Tab not attached to a TabLayout");
        return false;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(@Nullable jsi jsiVar) {
        if (jsiVar != this.a) {
            this.a = jsiVar;
            e();
            jsi jsiVar2 = this.a;
            setSelected(jsiVar2 != null && jsiVar2.a());
        }
    }
}
