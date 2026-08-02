package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class w7 extends BaseAdapter {
    public final Context a;
    public List b;
    public int c;
    public final LayoutInflater d;

    public w7(Context context, List list) {
        context.getClass();
        list.getClass();
        this.a = context;
        this.b = list;
        this.c = -1;
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.d = from;
    }

    public static void a(View view, krk krkVar) {
        view.getClass();
        if (view.getTag() == null) {
            view.setTag(krkVar);
        }
    }

    public abstract View b(Context context, ViewGroup viewGroup, Object obj, View view);

    public abstract View c(Context context, ViewGroup viewGroup, Object obj, View view);

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        View b = b(this.a, viewGroup, this.b.get(i), view);
        if (this.c == i) {
            aba.H(b);
            aba.y(b, 0, 3);
            return b;
        }
        aba.I(b);
        aba.y(b, 0, 3);
        return b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        return c(this.a, viewGroup, this.b.get(i), view);
    }
}
