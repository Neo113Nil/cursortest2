package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class al2 extends ArrayAdapter {
    public final kp5 a;
    public int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al2(Context context) {
        super(context, R.layout.menu_panel_item, R.id.item_text);
        context.getClass();
        this.a = vk2.e;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new zk2(this, 0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return (vk2) this.a.get(i);
    }

    @Override // android.widget.ArrayAdapter
    public final int getPosition(Object obj) {
        return CollectionsKt.c0(this.a, (vk2) obj);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        nfc b = view == null ? nfc.b(LayoutInflater.from(viewGroup.getContext()), viewGroup) : nfc.a(view);
        TextView textView = b.c;
        ConstraintLayout constraintLayout = b.a;
        textView.setText(getContext().getString(((vk2) this.a.get(i)).b));
        b.b.setVisibility(8);
        if (this.b == i) {
            haa.G(textView);
            constraintLayout.getClass();
            aba.H(constraintLayout);
        } else {
            haa.C(textView);
            constraintLayout.getClass();
            aba.I(constraintLayout);
        }
        constraintLayout.getClass();
        return constraintLayout;
    }
}
