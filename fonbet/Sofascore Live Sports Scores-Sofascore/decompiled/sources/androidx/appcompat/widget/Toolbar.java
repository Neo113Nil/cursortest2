package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.view.AbsSavedState;
import com.sofascore.results.R;
import defpackage.afc;
import defpackage.akj;
import defpackage.ani;
import defpackage.bc0;
import defpackage.bkj;
import defpackage.bsk;
import defpackage.cb;
import defpackage.ckj;
import defpackage.cqa;
import defpackage.d4a;
import defpackage.dc;
import defpackage.dkf;
import defpackage.dkj;
import defpackage.e3c;
import defpackage.e6b;
import defpackage.efc;
import defpackage.ekj;
import defpackage.fjg;
import defpackage.g9g;
import defpackage.kac;
import defpackage.l2a;
import defpackage.lvk;
import defpackage.okj;
import defpackage.pm4;
import defpackage.qkj;
import defpackage.td4;
import defpackage.u6b;
import defpackage.vec;
import defpackage.yec;
import defpackage.zfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements yec {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final afc G;
    public ArrayList H;
    public ekj I;
    public final d4a J;
    public okj K;
    public dc L;
    public ckj M;
    public fjg N;
    public cqa O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final kac T;
    public ActionMenuView a;
    public AppCompatTextView b;
    public AppCompatTextView c;
    public bc0 d;
    public AppCompatImageView e;
    public final Drawable f;
    public final CharSequence g;
    public bc0 h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public g9g t;
    public int u;
    public int v;
    public final int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j();
        public int c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new afc(new akj(this, 1));
        this.H = new ArrayList();
        this.J = new d4a(this, 19);
        this.T = new kac(this, 22);
        Context context2 = getContext();
        int[] iArr = dkf.z;
        l2a y = l2a.y(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        bsk.p(this, context, iArr, attributeSet, (TypedArray) y.c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) y.c;
        this.l = typedArray.getResourceId(28, 0);
        this.m = typedArray.getResourceId(19, 0);
        this.w = typedArray.getInteger(0, 8388627);
        this.n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.s = dimensionPixelOffset;
        this.r = dimensionPixelOffset;
        this.q = dimensionPixelOffset;
        this.p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.s = dimensionPixelOffset5;
        }
        this.o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        g9g g9gVar = this.t;
        g9gVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            g9gVar.e = dimensionPixelSize;
            g9gVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            g9gVar.f = dimensionPixelSize2;
            g9gVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            g9gVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f = y.q(4);
        this.g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable q = y.q(16);
        if (q != null) {
            setNavigationIcon(q);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable q2 = y.q(11);
        if (q2 != null) {
            setLogo(q2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(y.m(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(y.m(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        y.F();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new ani(getContext());
    }

    public static dkj h() {
        dkj dkjVar = new dkj(-2, -2);
        dkjVar.b = 0;
        dkjVar.a = 8388627;
        return dkjVar;
    }

    public static dkj i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof dkj;
        if (z) {
            dkj dkjVar = (dkj) layoutParams;
            dkj dkjVar2 = new dkj(dkjVar);
            dkjVar2.b = 0;
            dkjVar2.b = dkjVar.b;
            return dkjVar2;
        }
        if (z) {
            dkj dkjVar3 = new dkj((dkj) layoutParams);
            dkjVar3.b = 0;
            return dkjVar3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            dkj dkjVar4 = new dkj(layoutParams);
            dkjVar4.b = 0;
            return dkjVar4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        dkj dkjVar5 = new dkj(marginLayoutParams);
        dkjVar5.b = 0;
        ((ViewGroup.MarginLayoutParams) dkjVar5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) dkjVar5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) dkjVar5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) dkjVar5).bottomMargin = marginLayoutParams.bottomMargin;
        return dkjVar5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                dkj dkjVar = (dkj) childAt.getLayoutParams();
                if (dkjVar.b == 0 && t(childAt)) {
                    int i3 = dkjVar.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            dkj dkjVar2 = (dkj) childAt2.getLayoutParams();
            if (dkjVar2.b == 0 && t(childAt2)) {
                int i5 = dkjVar2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // defpackage.yec
    public final void addMenuProvider(zfc zfcVar) {
        afc afcVar = this.G;
        afcVar.b.add(zfcVar);
        afcVar.a.run();
    }

    @Override // defpackage.yec
    public final void addMenuProvider(zfc zfcVar, u6b u6bVar, e6b e6bVar) {
        throw null;
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        dkj h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (dkj) layoutParams;
        h.b = 1;
        if (!z || this.i == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            bc0 bc0Var = new bc0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = bc0Var;
            bc0Var.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            dkj h = h();
            h.a = (this.n & 112) | 8388611;
            h.b = 2;
            this.h.setLayoutParams(h);
            this.h.setOnClickListener(new cb(this, 10));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof dkj);
    }

    public final void d() {
        if (this.t == null) {
            g9g g9gVar = new g9g();
            g9gVar.a = 0;
            g9gVar.b = 0;
            g9gVar.c = Integer.MIN_VALUE;
            g9gVar.d = Integer.MIN_VALUE;
            g9gVar.e = 0;
            g9gVar.f = 0;
            g9gVar.g = false;
            g9gVar.h = false;
            this.t = g9gVar;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            vec vecVar = (vec) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new ckj(this);
            }
            this.a.setExpandedActionViewsExclusive(true);
            vecVar.b(this.M, this.j);
            v();
        }
    }

    public final void f() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.a.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.a;
            fjg fjgVar = this.N;
            e3c e3cVar = new e3c(this, 16);
            actionMenuView2.f = fjgVar;
            actionMenuView2.g = e3cVar;
            dkj h = h();
            h.a = (this.n & 112) | 8388613;
            this.a.setLayoutParams(h);
            b(this.a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new bc0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            dkj h = h();
            h.a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        dkj dkjVar = new dkj(context, attributeSet);
        dkjVar.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dkf.b);
        dkjVar.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        dkjVar.b = 0;
        return dkjVar;
    }

    @Nullable
    public CharSequence getCollapseContentDescription() {
        bc0 bc0Var = this.h;
        if (bc0Var != null) {
            return bc0Var.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getCollapseIcon() {
        bc0 bc0Var = this.h;
        if (bc0Var != null) {
            return bc0Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        g9g g9gVar = this.t;
        if (g9gVar != null) {
            return g9gVar.g ? g9gVar.a : g9gVar.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        g9g g9gVar = this.t;
        if (g9gVar != null) {
            return g9gVar.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        g9g g9gVar = this.t;
        if (g9gVar != null) {
            return g9gVar.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        g9g g9gVar = this.t;
        if (g9gVar != null) {
            return g9gVar.g ? g9gVar.b : g9gVar.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.u;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        vec vecVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (vecVar = actionMenuView.a) == null || !vecVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.a.getMenu();
    }

    @Nullable
    public View getNavButtonView() {
        return this.d;
    }

    @Nullable
    public CharSequence getNavigationContentDescription() {
        bc0 bc0Var = this.d;
        if (bc0Var != null) {
            return bc0Var.getContentDescription();
        }
        return null;
    }

    @Nullable
    public Drawable getNavigationIcon() {
        bc0 bc0Var = this.d;
        if (bc0Var != null) {
            return bc0Var.getDrawable();
        }
        return null;
    }

    public dc getOuterActionMenuPresenter() {
        return this.L;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        e();
        return this.a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    @Nullable
    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    @Nullable
    public final TextView getTitleTextView() {
        return this.b;
    }

    public pm4 getWrapper() {
        okj okjVar = this.K;
        if (okjVar != null) {
            return okjVar;
        }
        okj okjVar2 = new okj(this, true);
        this.K = okjVar2;
        return okjVar2;
    }

    public final int j(int i, View view) {
        dkj dkjVar = (dkj) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = dkjVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.w & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) dkjVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) dkjVar).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) dkjVar).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void m() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.G.b.iterator();
        while (it2.hasNext()) {
            ((zfc) it2.next()).d(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final boolean o() {
        dc dcVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (dcVar = actionMenuView.e) == null || !dcVar.k()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.C = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0285 A[LOOP:0: B:44:0x0283->B:45:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029d A[LOOP:1: B:48:0x029b->B:49:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd A[LOOP:2: B:52:0x02bb->B:53:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0310 A[LOOP:3: B:61:0x030e->B:62:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int max;
        boolean t;
        boolean t2;
        boolean z2;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int i10;
        int i11;
        int i12;
        int size;
        int i13;
        int i14;
        int size2;
        int i15;
        int size3;
        int i16;
        int i17;
        int i18;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.F;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = bsk.a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (t(this.d)) {
            bc0 bc0Var = this.d;
            if (z3) {
                i6 = q(bc0Var, i19, min, iArr);
                i5 = paddingLeft;
                if (t(this.h)) {
                    bc0 bc0Var2 = this.h;
                    if (z3) {
                        i6 = q(bc0Var2, i6, min, iArr);
                    } else {
                        i5 = p(bc0Var2, i5, min, iArr);
                    }
                }
                if (t(this.a)) {
                    ActionMenuView actionMenuView = this.a;
                    if (z3) {
                        i5 = p(actionMenuView, i5, min, iArr);
                    } else {
                        i6 = q(actionMenuView, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (t(this.i)) {
                    View view = this.i;
                    if (z3) {
                        min2 = q(view, min2, min, iArr);
                    } else {
                        max = p(view, max, min, iArr);
                    }
                }
                if (t(this.e)) {
                    AppCompatImageView appCompatImageView = this.e;
                    if (z3) {
                        min2 = q(appCompatImageView, min2, min, iArr);
                    } else {
                        max = p(appCompatImageView, max, min, iArr);
                    }
                }
                t = t(this.b);
                t2 = t(this.c);
                if (t) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    dkj dkjVar = (dkj) this.b.getLayoutParams();
                    z2 = z3;
                    i7 = this.b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dkjVar).topMargin + ((ViewGroup.MarginLayoutParams) dkjVar).bottomMargin;
                }
                if (!t2) {
                    dkj dkjVar2 = (dkj) this.c.getLayoutParams();
                    i7 = this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) dkjVar2).topMargin + ((ViewGroup.MarginLayoutParams) dkjVar2).bottomMargin + i7;
                }
                if (!t || t2) {
                    AppCompatTextView appCompatTextView = !t ? this.b : this.c;
                    AppCompatTextView appCompatTextView2 = !t2 ? this.c : this.b;
                    dkj dkjVar3 = (dkj) appCompatTextView.getLayoutParams();
                    dkj dkjVar4 = (dkj) appCompatTextView2.getLayoutParams();
                    int i20 = i7;
                    boolean z4 = (!t && this.b.getMeasuredWidth() > 0) || (t2 && this.c.getMeasuredWidth() > 0);
                    i8 = this.w & 112;
                    int i21 = max;
                    if (i8 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) dkjVar3).topMargin + this.r;
                    } else if (i8 != 80) {
                        int i22 = (((height - paddingTop2) - paddingBottom) - i20) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) dkjVar3).topMargin + this.r;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i20) - i22) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) dkjVar3).bottomMargin;
                            int i26 = this.s;
                            if (i24 < i25 + i26) {
                                i22 = Math.max(0, i22 - ((((ViewGroup.MarginLayoutParams) dkjVar4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + i22;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) dkjVar4).bottomMargin) - this.s) - i20;
                    }
                    if (z2) {
                        int i27 = (z4 ? this.p : 0) - iArr[0];
                        max = Math.max(0, i27) + i21;
                        iArr[0] = Math.max(0, -i27);
                        if (t) {
                            dkj dkjVar5 = (dkj) this.b.getLayoutParams();
                            int measuredWidth = this.b.getMeasuredWidth() + max;
                            int measuredHeight = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i9 = measuredWidth + this.q;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) dkjVar5).bottomMargin;
                        } else {
                            i9 = max;
                        }
                        if (t2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((dkj) this.c.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.c.getMeasuredWidth() + max;
                            this.c.layout(max, i28, measuredWidth2, this.c.getMeasuredHeight() + i28);
                            i10 = measuredWidth2 + this.q;
                        } else {
                            i10 = max;
                        }
                        if (z4) {
                            max = Math.max(i9, i10);
                        }
                    } else {
                        int i29 = (z4 ? this.p : 0) - iArr[1];
                        min2 -= Math.max(0, i29);
                        iArr[1] = Math.max(0, -i29);
                        if (t) {
                            dkj dkjVar6 = (dkj) this.b.getLayoutParams();
                            int measuredWidth3 = min2 - this.b.getMeasuredWidth();
                            int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                            this.b.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i11 = measuredWidth3 - this.q;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) dkjVar6).bottomMargin;
                        } else {
                            i11 = min2;
                        }
                        if (t2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((dkj) this.c.getLayoutParams())).topMargin;
                            this.c.layout(min2 - this.c.getMeasuredWidth(), i30, min2, this.c.getMeasuredHeight() + i30);
                            i12 = min2 - this.q;
                        } else {
                            i12 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i11, i12);
                        }
                        max = i21;
                    }
                }
                ArrayList arrayList = this.D;
                a(arrayList, 3);
                size = arrayList.size();
                i13 = max;
                for (i14 = 0; i14 < size; i14++) {
                    i13 = p((View) arrayList.get(i14), i13, min, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i15 = 0; i15 < size2; i15++) {
                    min2 = q((View) arrayList.get(i15), min2, min, iArr);
                }
                a(arrayList, 1);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i16 = 0;
                int i34 = 0;
                while (i16 < size3) {
                    View view2 = (View) arrayList.get(i16);
                    dkj dkjVar7 = (dkj) view2.getLayoutParams();
                    int i35 = i32;
                    int i36 = ((ViewGroup.MarginLayoutParams) dkjVar7).leftMargin - i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) dkjVar7).rightMargin - i35;
                    int max2 = Math.max(0, i36);
                    int max3 = Math.max(0, i37);
                    int max4 = Math.max(0, -i36);
                    int max5 = Math.max(0, -i37);
                    i34 += view2.getMeasuredWidth() + max2 + max3;
                    i16++;
                    i33 = max4;
                    i32 = max5;
                }
                i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i34 / 2);
                int i38 = i34 + i18;
                if (i18 >= i13) {
                    i13 = i38 > min2 ? i18 - (i38 - min2) : i18;
                }
                size4 = arrayList.size();
                for (i17 = 0; i17 < size4; i17++) {
                    i13 = p((View) arrayList.get(i17), i13, min, iArr);
                }
                arrayList.clear();
            }
            i5 = p(bc0Var, paddingLeft, min, iArr);
        } else {
            i5 = paddingLeft;
        }
        i6 = i19;
        if (t(this.h)) {
        }
        if (t(this.a)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        max = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (t(this.i)) {
        }
        if (t(this.e)) {
        }
        t = t(this.b);
        t2 = t(this.c);
        if (t) {
        }
        if (!t2) {
        }
        if (!t) {
        }
        if (!t) {
        }
        if (!t2) {
        }
        dkj dkjVar32 = (dkj) appCompatTextView.getLayoutParams();
        dkj dkjVar42 = (dkj) appCompatTextView2.getLayoutParams();
        int i202 = i7;
        if (t) {
        }
        i8 = this.w & 112;
        int i212 = max;
        if (i8 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList2 = this.D;
        a(arrayList2, 3);
        size = arrayList2.size();
        i13 = max;
        while (i14 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i15 < size2) {
        }
        a(arrayList2, 1);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i312;
        i16 = 0;
        int i342 = 0;
        while (i16 < size3) {
        }
        i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i342 / 2);
        int i382 = i342 + i18;
        if (i18 >= i13) {
        }
        size4 = arrayList2.size();
        while (i17 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z = lvk.a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (t(this.d)) {
            s(this.d, i, 0, i2, this.o);
            i3 = k(this.d) + this.d.getMeasuredWidth();
            i4 = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.h)) {
            s(this.h, i, 0, i2, this.o);
            i3 = k(this.h) + this.h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.h) + this.h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.F;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (t(this.a)) {
            s(this.a, i, max, i2, this.o);
            i6 = k(this.a) + this.a.getMeasuredWidth();
            i4 = Math.max(i4, l(this.a) + this.a.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (t(this.i)) {
            max3 += r(this.i, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.i) + this.i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
        }
        if (t(this.e)) {
            max3 += r(this.e, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.e) + this.e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((dkj) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.r + this.s;
        int i14 = this.p + this.q;
        if (t(this.b)) {
            r(this.b, i, i12 + i14, i2, i13, iArr);
            int k = k(this.b) + this.b.getMeasuredWidth();
            i7 = l(this.b) + this.b.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
            i9 = k;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.c)) {
            i9 = Math.max(i9, r(this.c, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += l(this.c) + this.c.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.c.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.P) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        ActionMenuView actionMenuView = this.a;
        vec vecVar = actionMenuView != null ? actionMenuView.a : null;
        int i = savedState.c;
        if (i != 0 && this.M != null && vecVar != null && (findItem = vecVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.d) {
            kac kacVar = this.T;
            removeCallbacks(kacVar);
            post(kacVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        g9g g9gVar = this.t;
        boolean z = i == 1;
        if (z == g9gVar.g) {
            return;
        }
        g9gVar.g = z;
        if (!g9gVar.h) {
            g9gVar.a = g9gVar.e;
            g9gVar.b = g9gVar.f;
            return;
        }
        if (z) {
            int i2 = g9gVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = g9gVar.e;
            }
            g9gVar.a = i2;
            int i3 = g9gVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = g9gVar.f;
            }
            g9gVar.b = i3;
            return;
        }
        int i4 = g9gVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = g9gVar.e;
        }
        g9gVar.a = i4;
        int i5 = g9gVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = g9gVar.f;
        }
        g9gVar.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        efc efcVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        ckj ckjVar = this.M;
        if (ckjVar != null && (efcVar = ckjVar.b) != null) {
            savedState.c = efcVar.a;
        }
        savedState.d = o();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.B = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        dkj dkjVar = (dkj) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) dkjVar).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) dkjVar).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        dkj dkjVar = (dkj) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) dkjVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) dkjVar).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // defpackage.yec
    public final void removeMenuProvider(zfc zfcVar) {
        this.G.a(zfcVar);
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.S != z) {
            this.S = z;
            v();
        }
    }

    public void setCollapseContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        bc0 bc0Var = this.h;
        if (bc0Var != null) {
            bc0Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            bc0 bc0Var = this.h;
            if (bc0Var != null) {
                bc0Var.setImageDrawable(this.f);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.u) {
            this.u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.e;
        if (drawable != null) {
            if (appCompatImageView == null) {
                appCompatImageView = new AppCompatImageView(getContext());
                this.e = appCompatImageView;
            }
            if (!n(appCompatImageView)) {
                b(this.e, true);
            }
        } else if (appCompatImageView != null && n(appCompatImageView)) {
            removeView(this.e);
            this.E.remove(this.e);
        }
        AppCompatImageView appCompatImageView2 = this.e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@Nullable CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        bc0 bc0Var = this.d;
        if (bc0Var != null) {
            bc0Var.setContentDescription(charSequence);
            qkj.a(this.d, charSequence);
        }
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            bc0 bc0Var = this.d;
            if (bc0Var != null && n(bc0Var)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        bc0 bc0Var2 = this.d;
        if (bc0Var2 != null) {
            bc0Var2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(ekj ekjVar) {
        this.I = ekjVar;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        e();
        this.a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.c;
        if (!isEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!n(this.c)) {
                b(this.c, true);
            }
        } else if (appCompatTextView != null && n(appCompatTextView)) {
            removeView(this.c);
            this.E.remove(this.c);
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(@NonNull ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        AppCompatTextView appCompatTextView = this.b;
        if (!isEmpty) {
            if (appCompatTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!n(this.b)) {
                b(this.b, true);
            }
        } else if (appCompatTextView != null && n(appCompatTextView)) {
            removeView(this.b);
            this.E.remove(this.b);
        }
        AppCompatTextView appCompatTextView3 = this.b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleTextColor(@NonNull ColorStateList colorStateList) {
        this.z = colorStateList;
        AppCompatTextView appCompatTextView = this.b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        dc dcVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (dcVar = actionMenuView.e) == null || !dcVar.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = bkj.a(this);
            ckj ckjVar = this.M;
            int i = 0;
            boolean z = (ckjVar == null || ckjVar.b == null || a == null || !isAttachedToWindow() || !this.S) ? false : true;
            if (!z || this.R != null) {
                if (z || (onBackInvokedDispatcher = this.R) == null) {
                    return;
                }
                bkj.d(onBackInvokedDispatcher, this.Q);
                this.R = null;
                return;
            }
            OnBackInvokedCallback onBackInvokedCallback = this.Q;
            if (onBackInvokedCallback == null) {
                onBackInvokedCallback = bkj.b(new akj(this, i));
                this.Q = onBackInvokedCallback;
            }
            bkj.c(a, onBackInvokedCallback);
            this.R = a;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(td4.d0(i, getContext()));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(td4.d0(i, getContext()));
    }

    public void setLogo(int i) {
        setLogo(td4.d0(i, getContext()));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
