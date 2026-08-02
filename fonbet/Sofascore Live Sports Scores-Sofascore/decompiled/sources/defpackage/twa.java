package defpackage;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Team;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class twa extends ArrayAdapter {
    public final ArrayList a;
    public final ArrayList b;

    public twa(Context context) {
        super(context, R.layout.simple_list_item_1);
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    @Override // android.widget.ArrayAdapter
    public final void add(Object obj) {
        this.b.add(obj);
    }

    @Override // android.widget.ArrayAdapter
    public final void addAll(Collection collection) {
        collection.getClass();
        this.b.addAll(collection);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new zk2(this, 5);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return CollectionsKt.a0(i, this.b);
    }

    @Override // android.widget.ArrayAdapter
    public final int getPosition(Object obj) {
        return this.b.indexOf(obj);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        nfc b = view == null ? nfc.b(LayoutInflater.from(viewGroup.getContext()), viewGroup) : nfc.a(view);
        ImageView imageView = b.b;
        ConstraintLayout constraintLayout = b.a;
        Team team = (Team) CollectionsKt.a0(i, this.b);
        if (team == null) {
            constraintLayout.getClass();
            return constraintLayout;
        }
        TextView textView = b.c;
        Context context = getContext();
        context.getClass();
        textView.setText(tba.p(context, team));
        imageView.setVisibility(0);
        as9.o(imageView, team.getId());
        constraintLayout.getClass();
        return constraintLayout;
    }
}
