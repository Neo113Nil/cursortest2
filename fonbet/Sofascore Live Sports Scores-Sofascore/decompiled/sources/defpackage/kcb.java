package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kcb extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ lcb b;

    public kcb(lcb lcbVar) {
        this.b = lcbVar;
        a();
    }

    public final void a() {
        vec vecVar = this.b.c;
        efc efcVar = vecVar.v;
        if (efcVar != null) {
            vecVar.i();
            ArrayList arrayList = vecVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((efc) arrayList.get(i)) == efcVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final efc getItem(int i) {
        vec vecVar = this.b.c;
        vecVar.i();
        ArrayList arrayList = vecVar.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (efc) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        vec vecVar = this.b.c;
        vecVar.i();
        int size = vecVar.j.size();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((bgc) view).b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
