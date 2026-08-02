package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.sports.insider.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f500a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f501b;

    public i(j jVar) {
        this.f501b = jVar;
        a();
    }

    public final void a() {
        j jVar = this.f501b;
        p expandedItem = jVar.f504c.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<p> nonActionItems = jVar.f504c.getNonActionItems();
            int size = nonActionItems.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (nonActionItems.get(i5) == expandedItem) {
                    this.f500a = i5;
                    return;
                }
            }
        }
        this.f500a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p getItem(int i5) {
        j jVar = this.f501b;
        ArrayList<p> nonActionItems = jVar.f504c.getNonActionItems();
        jVar.getClass();
        int i10 = this.f500a;
        if (i10 >= 0 && i5 >= i10) {
            i5++;
        }
        return nonActionItems.get(i5);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        j jVar = this.f501b;
        int size = jVar.f504c.getNonActionItems().size();
        jVar.getClass();
        return this.f500a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f501b.f503b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((a0) view).initialize(getItem(i5), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
