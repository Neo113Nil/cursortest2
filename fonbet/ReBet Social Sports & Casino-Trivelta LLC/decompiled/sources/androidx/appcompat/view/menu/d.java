package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public e f16694a;

    /* renamed from: b, reason: collision with root package name */
    public int f16695b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16696c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16697d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f16698e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16699f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f16697d = z10;
        this.f16698e = layoutInflater;
        this.f16694a = eVar;
        this.f16699f = i10;
        a();
    }

    public void a() {
        g x10 = this.f16694a.x();
        if (x10 != null) {
            ArrayList B10 = this.f16694a.B();
            int size = B10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) B10.get(i10)) == x10) {
                    this.f16695b = i10;
                    return;
                }
            }
        }
        this.f16695b = -1;
    }

    public e b() {
        return this.f16694a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList B10 = this.f16697d ? this.f16694a.B() : this.f16694a.G();
        int i11 = this.f16695b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) B10.get(i10);
    }

    public void d(boolean z10) {
        this.f16696c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f16695b < 0 ? (this.f16697d ? this.f16694a.B() : this.f16694a.G()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f16698e.inflate(this.f16699f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f16694a.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        j.a aVar = (j.a) view;
        if (this.f16696c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
