package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class r84 extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public Context d;
    public int e;
    public p84 f;
    public q84 g;
    public zk2 h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                p84 p84Var = this.f;
                if (p84Var != null) {
                    cursor2.unregisterContentObserver(p84Var);
                }
                q84 q84Var = this.g;
                if (q84Var != null) {
                    cursor2.unregisterDataSetObserver(q84Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                p84 p84Var2 = this.f;
                if (p84Var2 != null) {
                    cursor.registerContentObserver(p84Var2);
                }
                q84 q84Var2 = this.g;
                if (q84Var2 != null) {
                    cursor.registerDataSetObserver(q84Var2);
                }
                this.e = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.e = -1;
                this.a = false;
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
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            kmi kmiVar = (kmi) this;
            view = kmiVar.k.inflate(kmiVar.j, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        zk2 zk2Var = this.h;
        if (zk2Var != null) {
            return zk2Var;
        }
        zk2 zk2Var2 = new zk2();
        zk2Var2.b = this;
        this.h = zk2Var2;
        return zk2Var2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            a70.r("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.c.moveToPosition(i)) {
            a70.r(ljg.j(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.c);
        return view;
    }
}
