package a1;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.u3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f15c;

    /* renamed from: d, reason: collision with root package name */
    public int f16d;

    /* renamed from: e, reason: collision with root package name */
    public a f17e;

    /* renamed from: f, reason: collision with root package name */
    public b f18f;

    /* renamed from: g, reason: collision with root package name */
    public d f19g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f15c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f17e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f18f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f15c = cursor;
            if (cursor != null) {
                a aVar2 = this.f17e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f18f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f16d = cursor.getColumnIndexOrThrow("_id");
                this.f13a = true;
                notifyDataSetChanged();
            } else {
                this.f16d = -1;
                this.f13a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f13a || (cursor = this.f15c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f13a) {
            return null;
        }
        this.f15c.moveToPosition(i5);
        if (view == null) {
            u3 u3Var = (u3) this;
            view = u3Var.j.inflate(u3Var.f969i, viewGroup, false);
        }
        a(view, this.f15c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f19g == null) {
            d dVar = new d();
            dVar.f20a = this;
            this.f19g = dVar;
        }
        return this.f19g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i5) {
        Cursor cursor;
        if (!this.f13a || (cursor = this.f15c) == null) {
            return null;
        }
        cursor.moveToPosition(i5);
        return this.f15c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        Cursor cursor;
        if (this.f13a && (cursor = this.f15c) != null && cursor.moveToPosition(i5)) {
            return this.f15c.getLong(this.f16d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f13a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f15c.moveToPosition(i5)) {
            throw new IllegalStateException(c1.i(i5, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f15c);
        return view;
    }
}
