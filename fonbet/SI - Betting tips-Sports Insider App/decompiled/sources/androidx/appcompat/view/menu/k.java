package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final n f508a;

    /* renamed from: b, reason: collision with root package name */
    public int f509b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f510c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f511d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f512e;

    /* renamed from: f, reason: collision with root package name */
    public final int f513f;

    public k(n nVar, LayoutInflater layoutInflater, boolean z5, int i5) {
        this.f511d = z5;
        this.f512e = layoutInflater;
        this.f508a = nVar;
        this.f513f = i5;
        a();
    }

    public final void a() {
        n nVar = this.f508a;
        p expandedItem = nVar.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<p> nonActionItems = nVar.getNonActionItems();
            int size = nonActionItems.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (nonActionItems.get(i5) == expandedItem) {
                    this.f509b = i5;
                    return;
                }
            }
        }
        this.f509b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p getItem(int i5) {
        boolean z5 = this.f511d;
        n nVar = this.f508a;
        ArrayList<p> nonActionItems = z5 ? nVar.getNonActionItems() : nVar.getVisibleItems();
        int i10 = this.f509b;
        if (i10 >= 0 && i5 >= i10) {
            i5++;
        }
        return nonActionItems.get(i5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        boolean z5 = this.f511d;
        n nVar = this.f508a;
        return this.f509b < 0 ? (z5 ? nVar.getNonActionItems() : nVar.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f512e.inflate(this.f513f, viewGroup, false);
        }
        int i10 = getItem(i5).f518b;
        int i11 = i5 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f508a.isGroupDividerEnabled() && i10 != (i11 >= 0 ? getItem(i11).f518b : i10));
        a0 a0Var = (a0) view;
        if (this.f510c) {
            listMenuItemView.setForceShowIcon(true);
        }
        a0Var.initialize(getItem(i5), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
