package F0;

import F0.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3218a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3219b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f3220c;

    /* renamed from: d, reason: collision with root package name */
    public Context f3221d;

    /* renamed from: e, reason: collision with root package name */
    public int f3222e;

    /* renamed from: f, reason: collision with root package name */
    public C0074a f3223f;

    /* renamed from: g, reason: collision with root package name */
    public DataSetObserver f3224g;

    /* renamed from: h, reason: collision with root package name */
    public F0.b f3225h;

    /* renamed from: F0.a$a, reason: collision with other inner class name */
    public class C0074a extends ContentObserver {
        public C0074a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.h();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f3218a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f3218a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    @Override // F0.b.a
    public void a(Cursor cursor) {
        Cursor i10 = i(cursor);
        if (i10 != null) {
            i10.close();
        }
    }

    @Override // F0.b.a
    public Cursor c() {
        return this.f3220c;
    }

    @Override // F0.b.a
    public abstract CharSequence convertToString(Cursor cursor);

    public abstract void d(View view, Context context, Cursor cursor);

    public void e(Context context, Cursor cursor, int i10) {
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f3219b = true;
        } else {
            this.f3219b = false;
        }
        boolean z10 = cursor != null;
        this.f3220c = cursor;
        this.f3218a = z10;
        this.f3221d = context;
        this.f3222e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f3223f = new C0074a();
            this.f3224g = new b();
        } else {
            this.f3223f = null;
            this.f3224g = null;
        }
        if (z10) {
            C0074a c0074a = this.f3223f;
            if (c0074a != null) {
                cursor.registerContentObserver(c0074a);
            }
            DataSetObserver dataSetObserver = this.f3224g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View f(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f3218a || (cursor = this.f3220c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f3218a) {
            return null;
        }
        this.f3220c.moveToPosition(i10);
        if (view == null) {
            view = f(this.f3221d, this.f3220c, viewGroup);
        }
        d(view, this.f3221d, this.f3220c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f3225h == null) {
            this.f3225h = new F0.b(this);
        }
        return this.f3225h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f3218a || (cursor = this.f3220c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f3220c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f3218a && (cursor = this.f3220c) != null && cursor.moveToPosition(i10)) {
            return this.f3220c.getLong(this.f3222e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f3218a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f3220c.moveToPosition(i10)) {
            if (view == null) {
                view = g(this.f3221d, this.f3220c, viewGroup);
            }
            d(view, this.f3221d, this.f3220c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i10);
    }

    public void h() {
        Cursor cursor;
        if (!this.f3219b || (cursor = this.f3220c) == null || cursor.isClosed()) {
            return;
        }
        this.f3218a = this.f3220c.requery();
    }

    public Cursor i(Cursor cursor) {
        Cursor cursor2 = this.f3220c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0074a c0074a = this.f3223f;
            if (c0074a != null) {
                cursor2.unregisterContentObserver(c0074a);
            }
            DataSetObserver dataSetObserver = this.f3224g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f3220c = cursor;
        if (cursor == null) {
            this.f3222e = -1;
            this.f3218a = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0074a c0074a2 = this.f3223f;
        if (c0074a2 != null) {
            cursor.registerContentObserver(c0074a2);
        }
        DataSetObserver dataSetObserver2 = this.f3224g;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f3222e = cursor.getColumnIndexOrThrow("_id");
        this.f3218a = true;
        notifyDataSetChanged();
        return cursor2;
    }
}
