package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dc implements yfc {
    public final Context a;
    public Context b;
    public vec c;
    public final LayoutInflater d;
    public xfc e;
    public cgc f;
    public cc g;
    public Drawable h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public ac q;
    public ac r;
    public pyn s;
    public bc t;
    public final SparseBooleanArray p = new SparseBooleanArray();
    public final de0 u = new de0(this, 5);

    public dc(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [bgc] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(efc efcVar, View view, ViewGroup viewGroup) {
        View actionView = efcVar.getActionView();
        if (actionView == null || efcVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof bgc ? (bgc) view : (bgc) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            actionMenuItemView.b(efcVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f);
            bc bcVar = this.t;
            if (bcVar == null) {
                bcVar = new bc(this);
                this.t = bcVar;
            }
            actionMenuItemView2.setPopupCallback(bcVar);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(efcVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof fc)) {
            actionView.setLayoutParams(ActionMenuView.e(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.yfc
    public final void b(vec vecVar, boolean z) {
        j();
        ac acVar = this.r;
        if (acVar != null && acVar.b()) {
            acVar.j.dismiss();
        }
        xfc xfcVar = this.e;
        if (xfcVar != null) {
            xfcVar.b(vecVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yfc
    public final boolean c(sji sjiVar) {
        boolean z;
        if (sjiVar.hasVisibleItems()) {
            sji sjiVar2 = sjiVar;
            while (true) {
                vec vecVar = sjiVar2.z;
                if (vecVar == this.c) {
                    break;
                }
                sjiVar2 = (sji) vecVar;
            }
            efc efcVar = sjiVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.f;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof bgc) && ((bgc) childAt).getItemData() == efcVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                int size = sjiVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = sjiVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                ac acVar = new ac(this, this.b, sjiVar, view);
                this.r = acVar;
                acVar.h = z;
                ofc ofcVar = acVar.j;
                if (ofcVar != null) {
                    ofcVar.m(z);
                }
                ac acVar2 = this.r;
                if (!acVar2.b()) {
                    if (acVar2.f == null) {
                        a70.r("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    acVar2.d(0, 0, false, false);
                }
                xfc xfcVar = this.e;
                if (xfcVar != null) {
                    xfcVar.k(sjiVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yfc
    public final boolean d(efc efcVar) {
        return false;
    }

    @Override // defpackage.yfc
    public final void e(xfc xfcVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yfc
    public final void f() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            vec vecVar = this.c;
            if (vecVar != null) {
                vecVar.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    efc efcVar = (efc) l.get(i2);
                    if ((efcVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        efc itemData = childAt instanceof bgc ? ((bgc) childAt).getItemData() : null;
                        View a = a(efcVar, childAt, viewGroup);
                        if (efcVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.g) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        vec vecVar2 = this.c;
        if (vecVar2 != null) {
            vecVar2.i();
            ArrayList arrayList2 = vecVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                gfc gfcVar = ((efc) arrayList2.get(i3)).A;
            }
        }
        vec vecVar3 = this.c;
        if (vecVar3 != null) {
            vecVar3.i();
            arrayList = vecVar3.j;
        }
        if (this.j && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((efc) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        cc ccVar = this.g;
        if (z) {
            if (ccVar == null) {
                ccVar = new cc(this, this.a);
                this.g = ccVar;
            }
            ViewGroup viewGroup3 = (ViewGroup) ccVar.getParent();
            if (viewGroup3 != this.f) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                cc ccVar2 = this.g;
                actionMenuView.getClass();
                fc d = ActionMenuView.d();
                d.a = true;
                actionMenuView.addView(ccVar2, d);
            }
        } else if (ccVar != null) {
            Object parent = ccVar.getParent();
            Object obj = this.f;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.g);
            }
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.j);
    }

    @Override // defpackage.yfc
    public final boolean g() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        dc dcVar = this;
        vec vecVar = dcVar.c;
        if (vecVar != null) {
            arrayList = vecVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = dcVar.n;
        int i4 = dcVar.m;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) dcVar.f;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            efc efcVar = (efc) arrayList.get(i5);
            int i8 = efcVar.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (dcVar.o && efcVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (dcVar.j && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = dcVar.p;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            efc efcVar2 = (efc) arrayList.get(i10);
            int i12 = efcVar2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = efcVar2.b;
            if (z3) {
                View a = dcVar.a(efcVar2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                efcVar2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View a2 = dcVar.a(efcVar2, null, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        efc efcVar3 = (efc) arrayList.get(i14);
                        if (efcVar3.b == i13) {
                            if ((efcVar3.x & 32) == 32) {
                                i9++;
                            }
                            efcVar3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                efcVar2.f(z5);
            } else {
                efcVar2.f(false);
                i10++;
                i2 = 2;
                dcVar = this;
                z = true;
            }
            i10++;
            i2 = 2;
            dcVar = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.yfc
    public final boolean h(efc efcVar) {
        return false;
    }

    @Override // defpackage.yfc
    public final void i(Context context, vec vecVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = vecVar;
        Resources resources = context.getResources();
        if (!this.k) {
            this.j = true;
        }
        int i = 2;
        this.l = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.n = i;
        int i4 = this.l;
        if (this.j) {
            if (this.g == null) {
                cc ccVar = new cc(this, this.a);
                this.g = ccVar;
                if (this.i) {
                    ccVar.setImageDrawable(this.h);
                    this.h = null;
                    this.i = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.g.getMeasuredWidth();
        } else {
            this.g = null;
        }
        this.m = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean j() {
        Object obj;
        pyn pynVar = this.s;
        if (pynVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(pynVar);
            this.s = null;
            return true;
        }
        ac acVar = this.q;
        if (acVar == null) {
            return false;
        }
        if (acVar.b()) {
            acVar.j.dismiss();
        }
        return true;
    }

    public final boolean k() {
        ac acVar = this.q;
        return acVar != null && acVar.b();
    }

    public final boolean l() {
        vec vecVar;
        boolean z = false;
        if (this.j && !k() && (vecVar = this.c) != null && this.f != null && this.s == null) {
            vecVar.i();
            if (!vecVar.j.isEmpty()) {
                pyn pynVar = new pyn(this, new ac(this, this.b, this.c, this.g), z, 1);
                this.s = pynVar;
                ((View) this.f).post(pynVar);
                return true;
            }
        }
        return false;
    }
}
