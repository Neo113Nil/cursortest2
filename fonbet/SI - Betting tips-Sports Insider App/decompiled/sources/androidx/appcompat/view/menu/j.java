package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements z, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f502a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f503b;

    /* renamed from: c, reason: collision with root package name */
    public n f504c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f505d;

    /* renamed from: e, reason: collision with root package name */
    public y f506e;

    /* renamed from: f, reason: collision with root package name */
    public i f507f;

    public j(Context context) {
        this.f502a = context;
        this.f503b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean collapseItemActionView(n nVar, p pVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean expandItemActionView(n nVar, p pVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.z
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void initForMenu(Context context, n nVar) {
        if (this.f502a != null) {
            this.f502a = context;
            if (this.f503b == null) {
                this.f503b = LayoutInflater.from(context);
            }
        }
        this.f504c = nVar;
        i iVar = this.f507f;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onCloseMenu(n nVar, boolean z5) {
        y yVar = this.f506e;
        if (yVar != null) {
            yVar.onCloseMenu(nVar, z5);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i5, long j) {
        this.f504c.performItemAction(this.f507f.getItem(i5), this, 0);
    }

    @Override // androidx.appcompat.view.menu.z
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f505d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.z
    public final Parcelable onSaveInstanceState() {
        if (this.f505d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f505d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.z
    public final boolean onSubMenuSelected(f0 f0Var) {
        if (!f0Var.hasVisibleItems()) {
            return false;
        }
        o oVar = new o();
        oVar.f514a = f0Var;
        androidx.appcompat.app.k kVar = new androidx.appcompat.app.k(f0Var.getContext());
        j jVar = new j(kVar.getContext());
        oVar.f516c = jVar;
        jVar.f506e = oVar;
        f0Var.addMenuPresenter(jVar);
        j jVar2 = oVar.f516c;
        if (jVar2.f507f == null) {
            jVar2.f507f = new i(jVar2);
        }
        kVar.setAdapter(jVar2.f507f, oVar);
        View headerView = f0Var.getHeaderView();
        if (headerView != null) {
            kVar.setCustomTitle(headerView);
        } else {
            kVar.setIcon(f0Var.getHeaderIcon());
            kVar.setTitle(f0Var.getHeaderTitle());
        }
        kVar.setOnKeyListener(oVar);
        androidx.appcompat.app.l create = kVar.create();
        oVar.f515b = create;
        create.setOnDismissListener(oVar);
        WindowManager.LayoutParams attributes = oVar.f515b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        oVar.f515b.show();
        y yVar = this.f506e;
        if (yVar == null) {
            return true;
        }
        yVar.c(f0Var);
        return true;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void setCallback(y yVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.z
    public final void updateMenuView(boolean z5) {
        i iVar = this.f507f;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }
}
