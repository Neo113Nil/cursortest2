package Aa;

import L2.C1376a;
import L2.v;
import L2.y;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.NavigationBarPresenter;
import com.google.android.material.shape.n;
import ja.AbstractC5104a;
import java.util.HashSet;
import l.AbstractC5335a;
import n.AbstractC5596a;
import x0.C6776e;
import x0.InterfaceC6775d;
import y0.z;

/* loaded from: classes3.dex */
public abstract class i extends ViewGroup implements androidx.appcompat.view.menu.j {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};

    /* renamed from: A, reason: collision with root package name */
    public int f363A;

    /* renamed from: B, reason: collision with root package name */
    public int f364B;

    /* renamed from: C, reason: collision with root package name */
    public int f365C;

    /* renamed from: D, reason: collision with root package name */
    public int f366D;

    /* renamed from: E, reason: collision with root package name */
    public int f367E;

    /* renamed from: F, reason: collision with root package name */
    public int f368F;

    /* renamed from: G, reason: collision with root package name */
    public int f369G;

    /* renamed from: H, reason: collision with root package name */
    public n f370H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f371I;

    /* renamed from: J, reason: collision with root package name */
    public ColorStateList f372J;

    /* renamed from: K, reason: collision with root package name */
    public NavigationBarPresenter f373K;

    /* renamed from: L, reason: collision with root package name */
    public g f374L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f375O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f376P;

    /* renamed from: R, reason: collision with root package name */
    public int f377R;

    /* renamed from: T, reason: collision with root package name */
    public int f378T;

    /* renamed from: V, reason: collision with root package name */
    public boolean f379V;

    /* renamed from: W, reason: collision with root package name */
    public MenuItem f380W;

    /* renamed from: a, reason: collision with root package name */
    public final y f381a;

    /* renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f382b;

    /* renamed from: b1, reason: collision with root package name */
    public int f383b1;
    private h[] buttons;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC6775d f384c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f385d;

    /* renamed from: e, reason: collision with root package name */
    public int f386e;

    /* renamed from: f, reason: collision with root package name */
    public int f387f;

    /* renamed from: g, reason: collision with root package name */
    public int f388g;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f389g1;

    /* renamed from: h, reason: collision with root package name */
    public int f390h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f391i;

    /* renamed from: j, reason: collision with root package name */
    public int f392j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f393k;

    /* renamed from: l, reason: collision with root package name */
    public final ColorStateList f394l;

    /* renamed from: m, reason: collision with root package name */
    public int f395m;

    /* renamed from: n, reason: collision with root package name */
    public int f396n;

    /* renamed from: o, reason: collision with root package name */
    public int f397o;

    /* renamed from: p, reason: collision with root package name */
    public int f398p;

    /* renamed from: p1, reason: collision with root package name */
    public final Rect f399p1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f400q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f401r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f402s;

    /* renamed from: t, reason: collision with root package name */
    public int f403t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f404u;

    /* renamed from: v, reason: collision with root package name */
    public int f405v;

    /* renamed from: w, reason: collision with root package name */
    public int f406w;

    /* renamed from: x, reason: collision with root package name */
    public int f407x;

    /* renamed from: y, reason: collision with root package name */
    public int f408y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f409z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            androidx.appcompat.view.menu.g itemData = ((e) view).getItemData();
            boolean e10 = i.this.f374L.e(itemData, i.this.f373K, 0);
            if (itemData == null || !itemData.isCheckable()) {
                return;
            }
            if (!e10 || itemData.isChecked()) {
                i.this.setCheckedItem(itemData);
            }
        }
    }

    public i(Context context) {
        super(context);
        this.f385d = new SparseArray();
        this.f388g = -1;
        this.f390h = -1;
        this.f404u = new SparseArray();
        this.f405v = -1;
        this.f406w = -1;
        this.f407x = -1;
        this.f408y = -1;
        this.f369G = 49;
        this.f371I = false;
        this.f377R = 1;
        this.f378T = 0;
        this.f380W = null;
        this.f383b1 = 7;
        this.f389g1 = false;
        this.f399p1 = new Rect();
        this.f394l = e(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.f381a = null;
        } else {
            C1376a c1376a = new C1376a();
            this.f381a = c1376a;
            c1376a.B0(0);
            c1376a.s(TextView.class, true);
            c1376a.h0(za.h.f(getContext(), ia.c.f48217V, getResources().getInteger(ia.h.f48462b)));
            c1376a.j0(za.h.g(getContext(), ia.c.f48229d0, AbstractC5104a.f53859b));
            c1376a.r0(new xa.j());
        }
        this.f382b = new a();
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.f383b1, this.f374L.d());
    }

    private e getNewItem() {
        InterfaceC6775d interfaceC6775d = this.f384c;
        e eVar = interfaceC6775d != null ? (e) interfaceC6775d.acquire() : null;
        return eVar == null ? h(getContext()) : eVar;
    }

    private void setBadgeIfNeeded(@NonNull e eVar) {
        com.google.android.material.badge.a aVar;
        int id2 = eVar.getId();
        if (n(id2) && (aVar = (com.google.android.material.badge.a) this.f404u.get(id2)) != null) {
            eVar.setBadge(aVar);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f374L = new g(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d() {
        e eVar;
        removeAllViews();
        o();
        this.f373K.m(true);
        this.f374L.f();
        this.f373K.m(false);
        int a10 = this.f374L.a();
        if (a10 == 0) {
            this.f388g = 0;
            this.f390h = 0;
            this.buttons = null;
            this.f384c = null;
            return;
        }
        if (this.f384c == null || this.f378T != a10) {
            this.f378T = a10;
            this.f384c = new C6776e(a10);
        }
        p();
        int g10 = this.f374L.g();
        this.buttons = new h[g10];
        boolean m10 = m(this.f386e, getCurrentVisibleContentItemCount());
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < g10; i12++) {
            MenuItem b10 = this.f374L.b(i12);
            boolean z10 = b10 instanceof Aa.a;
            if (z10) {
                b bVar = new b(getContext());
                bVar.setOnlyShowWhenExpanded(true);
                bVar.setDividersEnabled(this.f389g1);
                eVar = bVar;
            } else if (b10.hasSubMenu()) {
                if (i10 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                k kVar = new k(getContext());
                int i13 = this.f398p;
                if (i13 == 0) {
                    i13 = this.f396n;
                }
                kVar.setTextAppearance(i13);
                kVar.setTextColor(this.f393k);
                kVar.setOnlyShowWhenExpanded(true);
                kVar.c((androidx.appcompat.view.menu.g) b10, 0);
                i10 = b10.getSubMenu().size();
                eVar = kVar;
            } else if (i10 > 0) {
                i10--;
                eVar = g(i12, (androidx.appcompat.view.menu.g) b10, m10, true);
            } else {
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) b10;
                boolean z11 = i11 >= this.f383b1;
                i11++;
                eVar = g(i12, gVar, m10, z11);
            }
            if (!z10 && b10.isCheckable() && this.f390h == -1) {
                this.f390h = i12;
            }
            this.buttons[i12] = eVar;
            addView(eVar);
        }
        int min = Math.min(g10 - 1, this.f390h);
        this.f390h = min;
        setCheckedItem(this.buttons[min].getItemData());
    }

    public ColorStateList e(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList a10 = AbstractC5596a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(AbstractC5335a.f55008w, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = a10.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, ViewGroup.EMPTY_STATE_SET}, new int[]{a10.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    public final Drawable f() {
        if (this.f370H == null || this.f372J == null) {
            return null;
        }
        com.google.android.material.shape.i iVar = new com.google.android.material.shape.i(this.f370H);
        iVar.f0(this.f372J);
        return iVar;
    }

    public final e g(int i10, androidx.appcompat.view.menu.g gVar, boolean z10, boolean z11) {
        this.f373K.m(true);
        gVar.setCheckable(true);
        this.f373K.m(false);
        e newItem = getNewItem();
        newItem.setShifting(z10);
        newItem.setLabelMaxLines(this.f377R);
        newItem.setIconTintList(this.f391i);
        newItem.setIconSize(this.f392j);
        newItem.setTextColor(this.f394l);
        newItem.setTextAppearanceInactive(this.f395m);
        newItem.setTextAppearanceActive(this.f396n);
        newItem.setHorizontalTextAppearanceInactive(this.f397o);
        newItem.setHorizontalTextAppearanceActive(this.f398p);
        newItem.setTextAppearanceActiveBoldEnabled(this.f400q);
        newItem.setTextColor(this.f393k);
        int i11 = this.f405v;
        if (i11 != -1) {
            newItem.setItemPaddingTop(i11);
        }
        int i12 = this.f406w;
        if (i12 != -1) {
            newItem.setItemPaddingBottom(i12);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.f375O);
        newItem.setLabelFontScalingEnabled(this.f376P);
        int i13 = this.f407x;
        if (i13 != -1) {
            newItem.setActiveIndicatorLabelPadding(i13);
        }
        int i14 = this.f408y;
        if (i14 != -1) {
            newItem.setIconLabelHorizontalSpacing(i14);
        }
        newItem.setActiveIndicatorWidth(this.f363A);
        newItem.setActiveIndicatorHeight(this.f364B);
        newItem.setActiveIndicatorExpandedWidth(this.f365C);
        newItem.setActiveIndicatorExpandedHeight(this.f366D);
        newItem.setActiveIndicatorMarginHorizontal(this.f367E);
        newItem.setItemGravity(this.f369G);
        newItem.setActiveIndicatorExpandedPadding(this.f399p1);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.f368F);
        newItem.setActiveIndicatorDrawable(f());
        newItem.setActiveIndicatorResizeable(this.f371I);
        newItem.setActiveIndicatorEnabled(this.f409z);
        Drawable drawable = this.f401r;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.f403t);
        }
        newItem.setItemRippleColor(this.f402s);
        newItem.setLabelVisibilityMode(this.f386e);
        newItem.setItemIconGravity(this.f387f);
        newItem.setOnlyShowWhenExpanded(z11);
        newItem.setExpanded(this.f379V);
        newItem.c(gVar, 0);
        newItem.setItemPosition(i10);
        int itemId = gVar.getItemId();
        newItem.setOnTouchListener((View.OnTouchListener) this.f385d.get(itemId));
        newItem.setOnClickListener(this.f382b);
        int i15 = this.f388g;
        if (i15 != 0 && itemId == i15) {
            this.f390h = i10;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f407x;
    }

    public SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.f404u;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.f379V ? this.f374L.c() : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f398p;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f397o;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f408y;
    }

    public ColorStateList getIconTintList() {
        return this.f391i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f372J;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f409z;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f366D;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f368F;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f365C;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f364B;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f367E;
    }

    public n getItemActiveIndicatorShapeAppearance() {
        return this.f370H;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f363A;
    }

    public Drawable getItemBackground() {
        h[] hVarArr = this.buttons;
        if (hVarArr != null && hVarArr.length > 0) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    return ((e) hVar).getBackground();
                }
            }
        }
        return this.f401r;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f403t;
    }

    public int getItemGravity() {
        return this.f369G;
    }

    public int getItemIconGravity() {
        return this.f387f;
    }

    public int getItemIconSize() {
        return this.f392j;
    }

    public int getItemPaddingBottom() {
        return this.f406w;
    }

    public int getItemPaddingTop() {
        return this.f405v;
    }

    public ColorStateList getItemRippleColor() {
        return this.f402s;
    }

    public int getItemTextAppearanceActive() {
        return this.f396n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f395m;
    }

    public ColorStateList getItemTextColor() {
        return this.f393k;
    }

    public int getLabelMaxLines() {
        return this.f377R;
    }

    public int getLabelVisibilityMode() {
        return this.f386e;
    }

    public g getMenu() {
        return this.f374L;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f376P;
    }

    public int getSelectedItemId() {
        return this.f388g;
    }

    public int getSelectedItemPosition() {
        return this.f390h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public abstract e h(Context context);

    public e i(int i10) {
        u(i10);
        h[] hVarArr = this.buttons;
        if (hVarArr == null) {
            return null;
        }
        for (h hVar : hVarArr) {
            if (hVar instanceof e) {
                e eVar = (e) hVar;
                if (eVar.getId() == i10) {
                    return eVar;
                }
            }
        }
        return null;
    }

    public com.google.android.material.badge.a j(int i10) {
        return (com.google.android.material.badge.a) this.f404u.get(i10);
    }

    public com.google.android.material.badge.a k(int i10) {
        u(i10);
        com.google.android.material.badge.a aVar = (com.google.android.material.badge.a) this.f404u.get(i10);
        if (aVar == null) {
            aVar = com.google.android.material.badge.a.g(getContext());
            this.f404u.put(i10, aVar);
        }
        e i11 = i(i10);
        if (i11 != null) {
            i11.setBadge(aVar);
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l() {
        g gVar;
        if (this.buttons == null || (gVar = this.f374L) == null || gVar.g() != this.buttons.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.buttons.length) {
                return true;
            }
            if ((this.f374L.b(i10) instanceof Aa.a) && !(this.buttons[i10] instanceof b)) {
                return false;
            }
            boolean z10 = this.f374L.b(i10).hasSubMenu() && !(this.buttons[i10] instanceof k);
            boolean z11 = (this.f374L.b(i10).hasSubMenu() || (this.buttons[i10] instanceof e)) ? false : true;
            if ((this.f374L.b(i10) instanceof Aa.a) || (!z10 && !z11)) {
                i10++;
            }
        }
    }

    public boolean m(int i10, int i11) {
        return i10 == -1 ? i11 > 3 : i10 == 0;
    }

    public final boolean n(int i10) {
        return i10 != -1;
    }

    public final void o() {
        h[] hVarArr = this.buttons;
        if (hVarArr == null || this.f384c == null) {
            return;
        }
        for (h hVar : hVarArr) {
            if (hVar instanceof e) {
                e eVar = (e) hVar;
                this.f384c.release(eVar);
                eVar.g();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.f1(accessibilityNodeInfo).y0(z.f.b(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    public final void p() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.f374L.g(); i10++) {
            hashSet.add(Integer.valueOf(this.f374L.b(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f404u.size(); i11++) {
            int keyAt = this.f404u.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f404u.delete(keyAt);
            }
        }
    }

    public void q(SparseArray sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int keyAt = sparseArray.keyAt(i10);
            if (this.f404u.indexOfKey(keyAt) < 0) {
                this.f404u.append(keyAt, (com.google.android.material.badge.a) sparseArray.get(keyAt));
            }
        }
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    e eVar = (e) hVar;
                    com.google.android.material.badge.a aVar = (com.google.android.material.badge.a) this.f404u.get(eVar.getId());
                    if (aVar != null) {
                        eVar.setBadge(aVar);
                    }
                }
            }
        }
    }

    public void r(int i10, int i11, int i12, int i13) {
        Rect rect = this.f399p1;
        rect.left = i10;
        rect.top = i11;
        rect.right = i12;
        rect.bottom = i13;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedPadding(this.f399p1);
                }
            }
        }
    }

    public void s(int i10) {
        int g10 = this.f374L.g();
        for (int i11 = 0; i11 < g10; i11++) {
            MenuItem b10 = this.f374L.b(i11);
            if (i10 == b10.getItemId()) {
                this.f388g = i10;
                this.f390h = i11;
                setCheckedItem(b10);
                return;
            }
        }
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f407x = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorLabelPadding(i10);
                }
            }
        }
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        if (this.f380W == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.f380W;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.f380W.setChecked(false);
        }
        menuItem.setChecked(true);
        this.f380W = menuItem;
    }

    public void setCollapsedMaxItemCount(int i10) {
        this.f383b1 = i10;
    }

    public void setExpanded(boolean z10) {
        this.f379V = z10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                hVar.setExpanded(z10);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f398p = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f397o = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setHorizontalTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f408y = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconLabelHorizontalSpacing(i10);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f391i = colorStateList;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f372J = colorStateList;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f409z = z10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorEnabled(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f366D = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f368F = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedMarginHorizontal(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f365C = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorExpandedWidth(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f364B = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorHeight(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f367E = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorMarginHorizontal(i10);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.f371I = z10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorResizeable(z10);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(n nVar) {
        this.f370H = nVar;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorDrawable(f());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f363A = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setActiveIndicatorWidth(i10);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f401r = drawable;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f403t = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemBackground(i10);
                }
            }
        }
    }

    public void setItemGravity(int i10) {
        this.f369G = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemGravity(i10);
                }
            }
        }
    }

    public void setItemIconGravity(int i10) {
        this.f387f = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemIconGravity(i10);
                }
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f392j = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setIconSize(i10);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f406w = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingBottom(this.f406w);
                }
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f405v = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemPaddingTop(i10);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f402s = colorStateList;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f396n = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActive(i10);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f400q = z10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceActiveBoldEnabled(z10);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f395m = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextAppearanceInactive(i10);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f393k = colorStateList;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f376P = z10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelFontScalingEnabled(z10);
                }
            }
        }
    }

    public void setLabelMaxLines(int i10) {
        this.f377R = i10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setLabelMaxLines(i10);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f386e = i10;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z10) {
        this.f375O = z10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof e) {
                    ((e) hVar).setMeasureBottomPaddingFromLabelBaseline(z10);
                }
            }
        }
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.f373K = navigationBarPresenter;
    }

    public void setSubmenuDividersEnabled(boolean z10) {
        if (this.f389g1 == z10) {
            return;
        }
        this.f389g1 = z10;
        h[] hVarArr = this.buttons;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                if (hVar instanceof b) {
                    ((b) hVar).setDividersEnabled(z10);
                }
            }
        }
    }

    public void t() {
        y yVar;
        if (this.f374L == null || this.buttons == null) {
            return;
        }
        this.f373K.m(true);
        this.f374L.f();
        this.f373K.m(false);
        if (!l()) {
            d();
            return;
        }
        int i10 = this.f388g;
        int g10 = this.f374L.g();
        for (int i11 = 0; i11 < g10; i11++) {
            MenuItem b10 = this.f374L.b(i11);
            if (b10.isChecked()) {
                setCheckedItem(b10);
                this.f388g = b10.getItemId();
                this.f390h = i11;
            }
        }
        if (i10 != this.f388g && (yVar = this.f381a) != null) {
            v.a(this, yVar);
        }
        boolean m10 = m(this.f386e, getCurrentVisibleContentItemCount());
        for (int i12 = 0; i12 < g10; i12++) {
            this.f373K.m(true);
            this.buttons[i12].setExpanded(this.f379V);
            h hVar = this.buttons[i12];
            if (hVar instanceof e) {
                e eVar = (e) hVar;
                eVar.setLabelVisibilityMode(this.f386e);
                eVar.setItemIconGravity(this.f387f);
                eVar.setItemGravity(this.f369G);
                eVar.setShifting(m10);
            }
            if (this.f374L.b(i12) instanceof androidx.appcompat.view.menu.g) {
                this.buttons[i12].c((androidx.appcompat.view.menu.g) this.f374L.b(i12), 0);
            }
            this.f373K.m(false);
        }
    }

    public final void u(int i10) {
        if (n(i10)) {
            return;
        }
        throw new IllegalArgumentException(i10 + " is not a valid view id");
    }
}
