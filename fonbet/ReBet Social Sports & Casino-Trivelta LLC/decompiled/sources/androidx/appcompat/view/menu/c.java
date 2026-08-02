package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f16682a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f16683b;

    /* renamed from: c, reason: collision with root package name */
    public e f16684c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f16685d;

    /* renamed from: e, reason: collision with root package name */
    public int f16686e;

    /* renamed from: f, reason: collision with root package name */
    public int f16687f;

    /* renamed from: g, reason: collision with root package name */
    public int f16688g;

    /* renamed from: h, reason: collision with root package name */
    public i.a f16689h;

    /* renamed from: i, reason: collision with root package name */
    public a f16690i;

    /* renamed from: j, reason: collision with root package name */
    public int f16691j;

    public class a extends BaseAdapter {

        /* renamed from: a, reason: collision with root package name */
        public int f16692a = -1;

        public a() {
            a();
        }

        public void a() {
            g x10 = c.this.f16684c.x();
            if (x10 != null) {
                ArrayList B10 = c.this.f16684c.B();
                int size = B10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((g) B10.get(i10)) == x10) {
                        this.f16692a = i10;
                        return;
                    }
                }
            }
            this.f16692a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList B10 = c.this.f16684c.B();
            int i11 = i10 + c.this.f16686e;
            int i12 = this.f16692a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (g) B10.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f16684c.B().size() - c.this.f16686e;
            return this.f16692a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f16683b.inflate(cVar.f16688g, viewGroup, false);
            }
            ((j.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f16682a = context;
        this.f16683b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(e eVar, boolean z10) {
        i.a aVar = this.f16689h;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean b(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(i.a aVar) {
        this.f16689h = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        new f(lVar).d(null);
        i.a aVar = this.f16689h;
        if (aVar == null) {
            return true;
        }
        aVar.b(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable f() {
        if (this.f16685d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(boolean z10) {
        a aVar = this.f16690i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return this.f16691j;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Context context, e eVar) {
        if (this.f16687f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f16687f);
            this.f16682a = contextThemeWrapper;
            this.f16683b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f16682a != null) {
            this.f16682a = context;
            if (this.f16683b == null) {
                this.f16683b = LayoutInflater.from(context);
            }
        }
        this.f16684c = eVar;
        a aVar = this.f16690i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public ListAdapter k() {
        if (this.f16690i == null) {
            this.f16690i = new a();
        }
        return this.f16690i;
    }

    public j l(ViewGroup viewGroup) {
        if (this.f16685d == null) {
            this.f16685d = (ExpandedMenuView) this.f16683b.inflate(l.g.f55128g, viewGroup, false);
            if (this.f16690i == null) {
                this.f16690i = new a();
            }
            this.f16685d.setAdapter((ListAdapter) this.f16690i);
            this.f16685d.setOnItemClickListener(this);
        }
        return this.f16685d;
    }

    public void m(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f16685d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f16685d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f16684c.P(this.f16690i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f16688g = i10;
        this.f16687f = i11;
    }
}
