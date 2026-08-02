package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC2077b;
import java.util.ArrayList;
import l.AbstractC5335a;
import n0.AbstractC5597a;

/* loaded from: classes.dex */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements AbstractC2077b.a {

    /* renamed from: A, reason: collision with root package name */
    public c f16861A;

    /* renamed from: B, reason: collision with root package name */
    public b f16862B;

    /* renamed from: C, reason: collision with root package name */
    public final f f16863C;

    /* renamed from: D, reason: collision with root package name */
    public int f16864D;

    /* renamed from: k, reason: collision with root package name */
    public d f16865k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f16866l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16867m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16868n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16869o;

    /* renamed from: p, reason: collision with root package name */
    public int f16870p;

    /* renamed from: q, reason: collision with root package name */
    public int f16871q;

    /* renamed from: r, reason: collision with root package name */
    public int f16872r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16873s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f16874t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16875u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f16876v;

    /* renamed from: w, reason: collision with root package name */
    public int f16877w;

    /* renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f16878x;

    /* renamed from: y, reason: collision with root package name */
    public e f16879y;

    /* renamed from: z, reason: collision with root package name */
    public a f16880z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f16881a;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f16881a);
        }

        public SavedState(Parcel parcel) {
            this.f16881a = parcel.readInt();
        }
    }

    public class a extends androidx.appcompat.view.menu.h {
        public a(Context context, androidx.appcompat.view.menu.l lVar, View view) {
            super(context, lVar, view, false, AbstractC5335a.f54994i);
            if (!((androidx.appcompat.view.menu.g) lVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.f16865k;
                f(view2 == null ? (View) ActionMenuPresenter.this.f16643i : view2);
            }
            j(ActionMenuPresenter.this.f16863C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f16880z = null;
            actionMenuPresenter.f16864D = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public r.f a() {
            a aVar = ActionMenuPresenter.this.f16880z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public e f16884a;

        public c(e eVar) {
            this.f16884a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.f16637c != null) {
                ActionMenuPresenter.this.f16637c.d();
            }
            View view = (View) ActionMenuPresenter.this.f16643i;
            if (view != null && view.getWindowToken() != null && this.f16884a.m()) {
                ActionMenuPresenter.this.f16879y = this.f16884a;
            }
            ActionMenuPresenter.this.f16861A = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends L {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ ActionMenuPresenter f16887i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f16887i = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.L
            public r.f b() {
                e eVar = ActionMenuPresenter.this.f16879y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.L
            public boolean c() {
                ActionMenuPresenter.this.M();
                return true;
            }

            @Override // androidx.appcompat.widget.L
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f16861A != null) {
                    return false;
                }
                actionMenuPresenter.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC5335a.f54993h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            f0.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.M();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC5597a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends androidx.appcompat.view.menu.h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, AbstractC5335a.f54994i);
            h(8388613);
            j(ActionMenuPresenter.this.f16863C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (ActionMenuPresenter.this.f16637c != null) {
                ActionMenuPresenter.this.f16637c.close();
            }
            ActionMenuPresenter.this.f16879y = null;
            super.e();
        }
    }

    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.l) {
                eVar.F().e(false);
            }
            i.a o10 = ActionMenuPresenter.this.o();
            if (o10 != null) {
                o10.a(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ActionMenuPresenter.this.f16637c) {
                return false;
            }
            ActionMenuPresenter.this.f16864D = ((androidx.appcompat.view.menu.l) eVar).getItem().getItemId();
            i.a o10 = ActionMenuPresenter.this.o();
            if (o10 != null) {
                return o10.b(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, l.g.f55124c, l.g.f55123b);
        this.f16878x = new SparseBooleanArray();
        this.f16863C = new f();
    }

    public boolean A() {
        return D() | E();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f16643i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable C() {
        d dVar = this.f16865k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f16867m) {
            return this.f16866l;
        }
        return null;
    }

    public boolean D() {
        Object obj;
        c cVar = this.f16861A;
        if (cVar != null && (obj = this.f16643i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f16861A = null;
            return true;
        }
        e eVar = this.f16879y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean E() {
        a aVar = this.f16880z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.f16861A != null || G();
    }

    public boolean G() {
        e eVar = this.f16879y;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f16873s) {
            this.f16872r = androidx.appcompat.view.a.b(this.f16636b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f16637c;
        if (eVar != null) {
            eVar.N(true);
        }
    }

    public void I(boolean z10) {
        this.f16876v = z10;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f16643i = actionMenuView;
        actionMenuView.a(this.f16637c);
    }

    public void K(Drawable drawable) {
        d dVar = this.f16865k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f16867m = true;
            this.f16866l = drawable;
        }
    }

    public void L(boolean z10) {
        this.f16868n = z10;
        this.f16869o = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f16868n || G() || (eVar = this.f16637c) == null || this.f16643i == null || this.f16861A != null || eVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f16636b, this.f16637c, this.f16865k, true));
        this.f16861A = cVar;
        ((View) this.f16643i).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        A();
        super.a(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f16881a) > 0 && (findItem = this.f16637c.findItem(i10)) != null) {
            e((androidx.appcompat.view.menu.l) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean e(androidx.appcompat.view.menu.l lVar) {
        boolean z10 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.l lVar2 = lVar;
        while (lVar2.j0() != this.f16637c) {
            lVar2 = (androidx.appcompat.view.menu.l) lVar2.j0();
        }
        View B10 = B(lVar2.getItem());
        if (B10 == null) {
            return false;
        }
        this.f16864D = lVar.getItem().getItemId();
        int size = lVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f16636b, lVar, B10);
        this.f16880z = aVar;
        aVar.g(z10);
        this.f16880z.k();
        super.e(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable f() {
        SavedState savedState = new SavedState();
        savedState.f16881a = this.f16864D;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void g(boolean z10) {
        super.g(z10);
        ((View) this.f16643i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f16637c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList u10 = eVar.u();
            int size = u10.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC2077b a10 = ((androidx.appcompat.view.menu.g) u10.get(i10)).a();
                if (a10 != null) {
                    a10.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f16637c;
        ArrayList B10 = eVar2 != null ? eVar2.B() : null;
        if (this.f16868n && B10 != null) {
            int size2 = B10.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.g) B10.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f16865k == null) {
                this.f16865k = new d(this.f16635a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f16865k.getParent();
            if (viewGroup != this.f16643i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f16865k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f16643i;
                actionMenuView.addView(this.f16865k, actionMenuView.D());
            }
        } else {
            d dVar = this.f16865k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f16643i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f16865k);
                }
            }
        }
        ((ActionMenuView) this.f16643i).setOverflowReserved(this.f16868n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.i
    public boolean h() {
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.e eVar = actionMenuPresenter.f16637c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayList = eVar.G();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = actionMenuPresenter.f16872r;
        int i15 = actionMenuPresenter.f16871q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f16643i;
        boolean z11 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayList.get(i18);
            if (gVar.o()) {
                i16++;
            } else if (gVar.n()) {
                i17++;
            } else {
                z11 = true;
            }
            if (actionMenuPresenter.f16876v && gVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (actionMenuPresenter.f16868n && (z11 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f16878x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f16874t) {
            int i20 = actionMenuPresenter.f16877w;
            i12 = i15 / i20;
            i11 = i20 + ((i15 % i20) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayList.get(i21);
            if (gVar2.o()) {
                View p10 = actionMenuPresenter.p(gVar2, view, viewGroup);
                if (actionMenuPresenter.f16874t) {
                    i12 -= ActionMenuView.J(p10, i11, i12, makeMeasureSpec, r32);
                } else {
                    p10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = p10.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z10 = r32;
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i19 > 0 || z12) && i15 > 0 && (!actionMenuPresenter.f16874t || i12 > 0);
                boolean z14 = z13;
                i13 = i10;
                if (z13) {
                    View p11 = actionMenuPresenter.p(gVar2, null, viewGroup);
                    if (actionMenuPresenter.f16874t) {
                        int J10 = ActionMenuView.J(p11, i11, i12, makeMeasureSpec, 0);
                        i12 -= J10;
                        if (J10 == 0) {
                            z14 = false;
                        }
                    } else {
                        p11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = p11.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z13 = z15 & (!actionMenuPresenter.f16874t ? i15 + i22 <= 0 : i15 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i23 = 0; i23 < i21; i23++) {
                        androidx.appcompat.view.menu.g gVar3 = (androidx.appcompat.view.menu.g) arrayList.get(i23);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i19++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i19--;
                }
                gVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i13 = i10;
                gVar2.u(z10);
            }
            i21++;
            r32 = z10;
            i10 = i13;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        super.j(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(context);
        if (!this.f16869o) {
            this.f16868n = b10.f();
        }
        if (!this.f16875u) {
            this.f16870p = b10.c();
        }
        if (!this.f16873s) {
            this.f16872r = b10.d();
        }
        int i10 = this.f16870p;
        if (this.f16868n) {
            if (this.f16865k == null) {
                d dVar = new d(this.f16635a);
                this.f16865k = dVar;
                if (this.f16867m) {
                    dVar.setImageDrawable(this.f16866l);
                    this.f16866l = null;
                    this.f16867m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f16865k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f16865k.getMeasuredWidth();
        } else {
            this.f16865k = null;
        }
        this.f16871q = i10;
        this.f16877w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void l(androidx.appcompat.view.menu.g gVar, j.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f16643i);
        if (this.f16862B == null) {
            this.f16862B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f16862B);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f16865k) {
            return false;
        }
        return super.n(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View p(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.p(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.j q(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.j jVar = this.f16643i;
        androidx.appcompat.view.menu.j q10 = super.q(viewGroup);
        if (jVar != q10) {
            ((ActionMenuView) q10).setPresenter(this);
        }
        return q10;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean s(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }
}
