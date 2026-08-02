package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.GridItem;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ofe extends BaseAdapter {
    public final Context a;
    public final t39 b;
    public final ArrayList c;

    public ofe(Context context) {
        t39 t39Var = t39.a;
        context.getClass();
        this.a = context;
        this.b = t39Var;
        this.c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (GridItem) this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        GridItem gridItem = (GridItem) this.c.get(i);
        Context context = this.a;
        e92 d = view == null ? e92.d(LayoutInflater.from(context).inflate(R.layout.person_grid_item, viewGroup, false)) : e92.d(view);
        ImageView imageView = (ImageView) d.c;
        TextView textView = (TextView) d.f;
        TextView textView2 = (TextView) d.b;
        imageView.setVisibility(8);
        textView.setText(gridItem.getFirst());
        ((TextView) d.d).setText(gridItem.getDescription());
        if (gridItem.getType() == GridItem.Type.IMAGE) {
            imageView.setVisibility(0);
            as9.c(imageView, gridItem.getCountryCode(), false, null, 6);
        }
        if (gridItem.isGrayedSecondText()) {
            textView2.setText(gridItem.getSecond());
        }
        if (gridItem.getType() == GridItem.Type.MARKET) {
            textView.setTextColor(context.getColor(R.color.value));
            textView2.setTextColor(context.getColor(R.color.value));
            textView2.setAllCaps(true);
            textView2.setText(gridItem.getSecond());
        }
        if (gridItem.getType() == GridItem.Type.DISABLED_ALL_CAPS) {
            textView.setAllCaps(false);
            textView2.setAllCaps(false);
        }
        if (this.b == t39.b) {
            textView.setTextAppearance(R.style.DisplaySmall);
        }
        LinearLayout linearLayout = (LinearLayout) d.e;
        linearLayout.getClass();
        return linearLayout;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((GridItem) this.c.get(i)).isEnabled();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofe(Context context, int i) {
        this(context);
        t39 t39Var = t39.a;
    }
}
