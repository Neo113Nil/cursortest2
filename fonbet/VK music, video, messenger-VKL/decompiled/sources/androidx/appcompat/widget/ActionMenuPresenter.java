package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.a5p0;
import xsna.b820;
import xsna.i40;
import xsna.sjj0;
import xsna.v9s;

/* loaded from: classes11.dex */
public final class ActionMenuPresenter extends androidx.appcompat.view.menu.a {
    public d k;
    public Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final SparseBooleanArray t;
    public e u;
    public a v;
    public c w;
    public b x;
    public final f y;
    public int z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int b;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.b = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    public class a extends i {
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if ((mVar.A.x & 32) != 32) {
                View view2 = ActionMenuPresenter.this.k;
                this.e = view2 == null ? (View) ActionMenuPresenter.this.i : view2;
            }
            f fVar = ActionMenuPresenter.this.y;
            this.h = fVar;
            b820 b820Var = this.i;
            if (b820Var != null) {
                b820Var.i(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.v = null;
            actionMenuPresenter.z = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    public class c implements Runnable {
        public final e b;

        public c(e eVar) {
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.d;
            if (fVar != null && (aVar = fVar.e) != null) {
                aVar.a(fVar);
            }
            View view = (View) actionMenuPresenter.i;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.b;
                if (!eVar.b()) {
                    if (eVar.e != null) {
                        eVar.d(0, 0, false, false);
                    }
                }
                actionMenuPresenter.u = eVar;
            }
            actionMenuPresenter.w = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends v9s {
            public a(d dVar) {
                super(dVar);
            }

            @Override // xsna.v9s
            public final sjj0 b() {
                e eVar = ActionMenuPresenter.this.u;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // xsna.v9s
            public final boolean c() {
                ActionMenuPresenter.this.n();
                return true;
            }

            @Override // xsna.v9s
            public final boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.w != null) {
                    return false;
                }
                actionMenuPresenter.l();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            a5p0.a.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean F() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean d() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, View view) {
            super(context, fVar, view, true, R.attr.actionOverflowMenuStyle, 0);
            this.f = 8388613;
            f fVar2 = ActionMenuPresenter.this.y;
            this.h = fVar2;
            b820 b820Var = this.i;
            if (b820Var != null) {
                b820Var.i(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            androidx.appcompat.view.menu.f fVar = actionMenuPresenter.d;
            if (fVar != null) {
                fVar.c(true);
            }
            actionMenuPresenter.u = null;
            super.c();
        }
    }

    public class f implements j.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(@NonNull androidx.appcompat.view.menu.f fVar, boolean z) {
            if (fVar instanceof m) {
                ((m) fVar).z.k().c(false);
            }
            j.a aVar = ActionMenuPresenter.this.f;
            if (aVar != null) {
                aVar.a(fVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(@NonNull androidx.appcompat.view.menu.f fVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (fVar == actionMenuPresenter.d) {
                return false;
            }
            actionMenuPresenter.z = ((m) fVar).A.a;
            j.a aVar = actionMenuPresenter.f;
            if (aVar != null) {
                return aVar.b(fVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        this.b = context;
        this.e = LayoutInflater.from(context);
        this.g = R.layout.abc_action_menu_layout;
        this.h = R.layout.abc_action_menu_item_layout;
        this.t = new SparseBooleanArray();
        this.y = new f();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(androidx.appcompat.view.menu.f fVar, boolean z) {
        l();
        a aVar = this.v;
        if (aVar != null && aVar.b()) {
            aVar.i.dismiss();
        }
        j.a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.a(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable b() {
        SavedState savedState = new SavedState();
        savedState.b = this.z;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final void c(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.i;
        ArrayList<h> arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.d;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> l = this.d.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    h hVar = l.get(i2);
                    if ((hVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        h itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View k = k(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            k.setPressed(false);
                            k.jumpDrawablesToCurrentState();
                        }
                        if (k != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) k.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(k);
                            }
                            ((ViewGroup) this.i).addView(k, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.k) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.i).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.d;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                i40 i40Var = arrayList2.get(i3).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.d;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.j;
        }
        if (this.n && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.k == null) {
                this.k = new d(this.b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.k.getParent();
            if (viewGroup3 != this.i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.i;
                d dVar = this.k;
                actionMenuView.getClass();
                ActionMenuView.c l2 = ActionMenuView.l();
                l2.a = true;
                actionMenuView.addView(dVar, l2);
            }
        } else {
            d dVar2 = this.k;
            if (dVar2 != null) {
                Object parent = dVar2.getParent();
                Object obj = this.i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.k);
                }
            }
        }
        ((ActionMenuView) this.i).setOverflowReserved(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public final boolean e(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            m mVar2 = mVar;
            while (true) {
                androidx.appcompat.view.menu.f fVar = mVar2.z;
                if (fVar == this.d) {
                    break;
                }
                mVar2 = (m) fVar;
            }
            h hVar = mVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.i;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == hVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.z = mVar.A.a;
                int size = mVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = mVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                a aVar = new a(this.c, mVar, view);
                this.v = aVar;
                aVar.g = z;
                b820 b820Var = aVar.i;
                if (b820Var != null) {
                    b820Var.n(z);
                }
                a aVar2 = this.v;
                if (!aVar2.b()) {
                    if (aVar2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    aVar2.d(0, 0, false, false);
                }
                j.a aVar3 = this.f;
                if (aVar3 != null) {
                    aVar3.b(mVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g() {
        int i;
        ArrayList<h> arrayList;
        int i2;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.f fVar = actionMenuPresenter.d;
        if (fVar != null) {
            arrayList = fVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = actionMenuPresenter.r;
        int i4 = actionMenuPresenter.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.i;
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
            h hVar = arrayList.get(i5);
            int i8 = hVar.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.s && hVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (actionMenuPresenter.n && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.t;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            h hVar2 = arrayList.get(i10);
            int i12 = hVar2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = hVar2.b;
            if (z3) {
                View k = actionMenuPresenter.k(hVar2, null, viewGroup);
                k.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = k.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                hVar2.g(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View k2 = actionMenuPresenter.k(hVar2, null, viewGroup);
                    k2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = k2.getMeasuredWidth();
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
                        h hVar3 = arrayList.get(i14);
                        if (hVar3.b == i13) {
                            if ((hVar3.x & 32) == 32) {
                                i9++;
                            }
                            hVar3.g(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                hVar2.g(z5);
            } else {
                hVar2.g(false);
                i10++;
                i2 = 2;
                actionMenuPresenter = this;
                z = true;
            }
            i10++;
            i2 = 2;
            actionMenuPresenter = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(@NonNull Context context, @Nullable androidx.appcompat.view.menu.f fVar) {
        this.c = context;
        LayoutInflater.from(context);
        this.d = fVar;
        Resources resources = context.getResources();
        if (!this.o) {
            this.n = true;
        }
        int i = 2;
        this.p = context.getResources().getDisplayMetrics().widthPixels / 2;
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
        this.r = i;
        int i4 = this.p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.b);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).b) > 0 && (findItem = this.d.findItem(i)) != null) {
            e((m) findItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.appcompat.view.menu.k$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View k(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof k.a ? (k.a) view : (k.a) this.e.inflate(this.h, viewGroup, false);
            actionMenuItemView.c(hVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.i);
            if (this.x == null) {
                this.x = new b();
            }
            actionMenuItemView2.setPopupCallback(this.x);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(hVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.c)) {
            actionView.setLayoutParams(ActionMenuView.m(layoutParams));
        }
        return actionView;
    }

    public final boolean l() {
        Object obj;
        c cVar = this.w;
        if (cVar != null && (obj = this.i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.w = null;
            return true;
        }
        e eVar = this.u;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.i.dismiss();
        }
        return true;
    }

    public final boolean m() {
        e eVar = this.u;
        return eVar != null && eVar.b();
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.n || m() || (fVar = this.d) == null || this.i == null || this.w != null) {
            return false;
        }
        fVar.i();
        if (fVar.j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.c, this.d, this.k));
        this.w = cVar;
        ((View) this.i).post(cVar);
        return true;
    }
}
