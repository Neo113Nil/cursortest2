package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.sports.insider.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements androidx.appcompat.view.menu.z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f835a;

    /* renamed from: b, reason: collision with root package name */
    public Context f836b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.view.menu.n f837c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f838d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.view.menu.y f839e;

    /* renamed from: h, reason: collision with root package name */
    public androidx.appcompat.view.menu.b0 f842h;

    /* renamed from: i, reason: collision with root package name */
    public int f843i;
    public l j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f844k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f845l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f846m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f847n;

    /* renamed from: o, reason: collision with root package name */
    public int f848o;

    /* renamed from: p, reason: collision with root package name */
    public int f849p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f850r;

    /* renamed from: t, reason: collision with root package name */
    public i f852t;

    /* renamed from: u, reason: collision with root package name */
    public i f853u;

    /* renamed from: v, reason: collision with root package name */
    public k f854v;

    /* renamed from: w, reason: collision with root package name */
    public j f855w;

    /* renamed from: y, reason: collision with root package name */
    public int f857y;

    /* renamed from: f, reason: collision with root package name */
    public final int f840f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f841g = R.layout.abc_action_menu_item_layout;

    /* renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f851s = new SparseBooleanArray();

    /* renamed from: x, reason: collision with root package name */
    public final r f856x = new r(this);

    public n(Context context) {
        this.f835a = context;
        this.f838d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.appcompat.view.menu.a0] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(androidx.appcompat.view.menu.p pVar, View view, ViewGroup viewGroup) {
        View actionView = pVar.getActionView();
        if (actionView == null || pVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof androidx.appcompat.view.menu.a0 ? (androidx.appcompat.view.menu.a0) view : (androidx.appcompat.view.menu.a0) this.f838d.inflate(this.f841g, viewGroup, false);
            actionMenuItemView.initialize(pVar, 0);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f842h);
            if (this.f855w == null) {
                this.f855w = new j(this);
            }
            actionMenuItemView2.setPopupCallback(this.f855w);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(pVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof q)) {
            actionView.setLayoutParams(ActionMenuView.c(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        k kVar = this.f854v;
        if (kVar != null && (obj = this.f842h) != null) {
            ((View) obj).removeCallbacks(kVar);
            this.f854v = null;
            return true;
        }
        i iVar = this.f852t;
        if (iVar == null) {
            return false;
        }
        if (iVar.b()) {
            iVar.f560i.dismiss();
        }
        return true;
    }

    public final boolean c() {
        i iVar = this.f852t;
        return iVar != null && iVar.b();
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean collapseItemActionView(androidx.appcompat.view.menu.n nVar, androidx.appcompat.view.menu.p pVar) {
        return false;
    }

    public final boolean d() {
        androidx.appcompat.view.menu.n nVar;
        if (!this.f846m || c() || (nVar = this.f837c) == null || this.f842h == null || this.f854v != null || nVar.getNonActionItems().isEmpty()) {
            return false;
        }
        k kVar = new k(this, new i(this, this.f836b, this.f837c, this.j));
        this.f854v = kVar;
        ((View) this.f842h).post(kVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean expandItemActionView(androidx.appcompat.view.menu.n nVar, androidx.appcompat.view.menu.p pVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean flagActionItems() {
        int i5;
        ArrayList<androidx.appcompat.view.menu.p> arrayList;
        int i10;
        boolean z5;
        n nVar = this;
        androidx.appcompat.view.menu.n nVar2 = nVar.f837c;
        if (nVar2 != null) {
            arrayList = nVar2.getVisibleItems();
            i5 = arrayList.size();
        } else {
            i5 = 0;
            arrayList = null;
        }
        int i11 = nVar.q;
        int i12 = nVar.f849p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) nVar.f842h;
        int i13 = 0;
        boolean z7 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z5 = true;
            if (i13 >= i5) {
                break;
            }
            androidx.appcompat.view.menu.p pVar = arrayList.get(i13);
            int i16 = pVar.f539y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z7 = true;
            }
            if (nVar.f850r && pVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (nVar.f846m && (z7 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = nVar.f851s;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i5) {
            androidx.appcompat.view.menu.p pVar2 = arrayList.get(i18);
            int i20 = pVar2.f539y;
            boolean z10 = (i20 & 2) == i10 ? z5 : false;
            int i21 = pVar2.f518b;
            if (z10) {
                View a7 = nVar.a(pVar2, null, viewGroup);
                a7.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a7.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z5);
                }
                pVar2.g(z5);
            } else if ((i20 & 1) == z5) {
                boolean z11 = sparseBooleanArray.get(i21);
                boolean z12 = ((i17 > 0 || z11) && i12 > 0) ? z5 : false;
                if (z12) {
                    View a10 = nVar.a(pVar2, null, viewGroup);
                    a10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a10.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z12 &= i12 + i19 > 0;
                }
                if (z12 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z11) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        androidx.appcompat.view.menu.p pVar3 = arrayList.get(i22);
                        if (pVar3.f518b == i21) {
                            if ((pVar3.f538x & 32) == 32) {
                                i17++;
                            }
                            pVar3.g(false);
                        }
                    }
                }
                if (z12) {
                    i17--;
                }
                pVar2.g(z12);
            } else {
                pVar2.g(false);
                i18++;
                i10 = 2;
                nVar = this;
                z5 = true;
            }
            i18++;
            i10 = 2;
            nVar = this;
            z5 = true;
        }
        return z5;
    }

    @Override // androidx.appcompat.view.menu.z
    public final int getId() {
        return this.f843i;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void initForMenu(Context context, androidx.appcompat.view.menu.n nVar) {
        this.f836b = context;
        LayoutInflater.from(context);
        this.f837c = nVar;
        Resources resources = context.getResources();
        if (!this.f847n) {
            this.f846m = true;
        }
        int i5 = 2;
        this.f848o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i5 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i5 = 4;
        } else if (i10 >= 360) {
            i5 = 3;
        }
        this.q = i5;
        int i12 = this.f848o;
        if (this.f846m) {
            if (this.j == null) {
                l lVar = new l(this, this.f835a);
                this.j = lVar;
                if (this.f845l) {
                    lVar.setImageDrawable(this.f844k);
                    this.f844k = null;
                    this.f845l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.j.getMeasuredWidth();
        } else {
            this.j = null;
        }
        this.f849p = i12;
        float f6 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onCloseMenu(androidx.appcompat.view.menu.n nVar, boolean z5) {
        b();
        i iVar = this.f853u;
        if (iVar != null && iVar.b()) {
            iVar.f560i.dismiss();
        }
        androidx.appcompat.view.menu.y yVar = this.f839e;
        if (yVar != null) {
            yVar.onCloseMenu(nVar, z5);
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i5;
        MenuItem findItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i5 = ((ActionMenuPresenter$SavedState) parcelable).f613a) > 0 && (findItem = this.f837c.findItem(i5)) != null) {
            onSubMenuSelected((androidx.appcompat.view.menu.f0) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public final Parcelable onSaveInstanceState() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.f613a = this.f857y;
        return actionMenuPresenter$SavedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.z
    public final boolean onSubMenuSelected(androidx.appcompat.view.menu.f0 f0Var) {
        boolean z5;
        if (f0Var.hasVisibleItems()) {
            androidx.appcompat.view.menu.f0 f0Var2 = f0Var;
            while (f0Var2.getParentMenu() != this.f837c) {
                f0Var2 = (androidx.appcompat.view.menu.f0) f0Var2.getParentMenu();
            }
            MenuItem item = f0Var2.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f842h;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i5);
                    if ((childAt instanceof androidx.appcompat.view.menu.a0) && ((androidx.appcompat.view.menu.a0) childAt).getItemData() == item) {
                        view = childAt;
                        break;
                    }
                    i5++;
                }
            }
            if (view != null) {
                this.f857y = f0Var.getItem().getItemId();
                int size = f0Var.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z5 = false;
                        break;
                    }
                    MenuItem item2 = f0Var.getItem(i10);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z5 = true;
                        break;
                    }
                    i10++;
                }
                i iVar = new i(this, this.f836b, f0Var, view);
                this.f853u = iVar;
                iVar.f558g = z5;
                androidx.appcompat.view.menu.v vVar = iVar.f560i;
                if (vVar != null) {
                    vVar.e(z5);
                }
                i iVar2 = this.f853u;
                if (!iVar2.b()) {
                    if (iVar2.f556e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    iVar2.d(0, 0, false, false);
                }
                androidx.appcompat.view.menu.y yVar = this.f839e;
                if (yVar != null) {
                    yVar.c(f0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void setCallback(androidx.appcompat.view.menu.y yVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.z
    public final void updateMenuView(boolean z5) {
        int i5;
        ViewGroup viewGroup = (ViewGroup) this.f842h;
        boolean z7 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.n nVar = this.f837c;
            if (nVar != null) {
                nVar.flagActionItems();
                ArrayList<androidx.appcompat.view.menu.p> visibleItems = this.f837c.getVisibleItems();
                int size = visibleItems.size();
                i5 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    androidx.appcompat.view.menu.p pVar = visibleItems.get(i10);
                    if ((pVar.f538x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i5);
                        androidx.appcompat.view.menu.p itemData = childAt instanceof androidx.appcompat.view.menu.a0 ? ((androidx.appcompat.view.menu.a0) childAt).getItemData() : null;
                        View a7 = a(pVar, childAt, viewGroup);
                        if (pVar != itemData) {
                            a7.setPressed(false);
                            a7.jumpDrawablesToCurrentState();
                        }
                        if (a7 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a7.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a7);
                            }
                            ((ViewGroup) this.f842h).addView(a7, i5);
                        }
                        i5++;
                    }
                }
            } else {
                i5 = 0;
            }
            while (i5 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i5) == this.j) {
                    i5++;
                } else {
                    viewGroup.removeViewAt(i5);
                }
            }
        }
        ((View) this.f842h).requestLayout();
        androidx.appcompat.view.menu.n nVar2 = this.f837c;
        if (nVar2 != null) {
            ArrayList<androidx.appcompat.view.menu.p> actionItems = nVar2.getActionItems();
            int size2 = actionItems.size();
            for (int i11 = 0; i11 < size2; i11++) {
                androidx.appcompat.view.menu.q qVar = actionItems.get(i11).A;
            }
        }
        androidx.appcompat.view.menu.n nVar3 = this.f837c;
        ArrayList<androidx.appcompat.view.menu.p> nonActionItems = nVar3 != null ? nVar3.getNonActionItems() : null;
        if (this.f846m && nonActionItems != null) {
            int size3 = nonActionItems.size();
            if (size3 == 1) {
                z7 = !nonActionItems.get(0).C;
            } else if (size3 > 0) {
                z7 = true;
            }
        }
        if (z7) {
            if (this.j == null) {
                this.j = new l(this, this.f835a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.j.getParent();
            if (viewGroup3 != this.f842h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f842h;
                l lVar = this.j;
                actionMenuView.getClass();
                q b10 = ActionMenuView.b();
                b10.f883a = true;
                actionMenuView.addView(lVar, b10);
            }
        } else {
            l lVar2 = this.j;
            if (lVar2 != null) {
                Object parent = lVar2.getParent();
                Object obj = this.f842h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.j);
                }
            }
        }
        ((ActionMenuView) this.f842h).setOverflowReserved(this.f846m);
    }
}
