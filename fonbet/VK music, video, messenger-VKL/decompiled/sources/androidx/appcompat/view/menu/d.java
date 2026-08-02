package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes11.dex */
public final class d implements j, AdapterView.OnItemClickListener {
    public Context b;
    public LayoutInflater c;
    public f d;
    public ExpandedMenuView e;
    public j.a f;
    public a g;

    /* compiled from: ListMenuPresenter.java */
    public class a extends BaseAdapter {
        public int b = -1;

        public a() {
            a();
        }

        public final void a() {
            f fVar = d.this.d;
            h hVar = fVar.v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == hVar) {
                        this.b = i;
                        return;
                    }
                }
            }
            this.b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h getItem(int i) {
            d dVar = d.this;
            f fVar = dVar.d;
            fVar.i();
            ArrayList<h> arrayList = fVar.j;
            dVar.getClass();
            int i2 = this.b;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.d;
            fVar.i();
            int size = fVar.j.size();
            dVar.getClass();
            return this.b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).c(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context) {
        this.b = context;
        this.c = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(f fVar, boolean z) {
        j.a aVar = this.f;
        if (aVar != null) {
            aVar.a(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable b() {
        if (this.e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(boolean z) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e(m mVar) {
        boolean hasVisibleItems = mVar.hasVisibleItems();
        Context context = mVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        g gVar = new g();
        gVar.b = mVar;
        d.a aVar = new d.a(context);
        d dVar = new d(aVar.getContext());
        gVar.d = dVar;
        dVar.f = gVar;
        mVar.b(dVar, context);
        ListAdapter k = gVar.d.k();
        AlertController.b bVar = aVar.a;
        bVar.r = k;
        bVar.s = gVar;
        View view = mVar.o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.c = mVar.n;
            aVar.setTitle(mVar.m);
        }
        bVar.p = gVar;
        androidx.appcompat.app.d create = aVar.create();
        gVar.c = create;
        create.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.c.show();
        j.a aVar2 = this.f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.b(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean f(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, f fVar) {
        if (this.b != null) {
            this.b = context;
            if (this.c == null) {
                this.c = LayoutInflater.from(context);
            }
        }
        this.d = fVar;
        a aVar = this.g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(j.a aVar) {
        this.f = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public final ListAdapter k() {
        if (this.g == null) {
            this.g = new a();
        }
        return this.g;
    }

    public final k l(ViewGroup viewGroup) {
        if (this.e == null) {
            this.e = (ExpandedMenuView) this.c.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.g == null) {
                this.g = new a();
            }
            this.e.setAdapter((ListAdapter) this.g);
            this.e.setOnItemClickListener(this);
        }
        return this.e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.d.q(this.g.getItem(i), this, 0);
    }
}
