package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dl2 extends ArrayAdapter {
    public final ArrayList a;
    public int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl2(Context context) {
        super(context, R.layout.menu_panel_item, R.id.item_text);
        context.getClass();
        this.a = new ArrayList();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new cl2(0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        return (bl2) this.a.get(i);
    }

    @Override // android.widget.ArrayAdapter
    public final int getPosition(Object obj) {
        return this.a.indexOf((bl2) obj);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        nfc b = view == null ? nfc.b(LayoutInflater.from(viewGroup.getContext()), viewGroup) : nfc.a(view);
        ImageView imageView = b.b;
        TextView textView = b.c;
        ConstraintLayout constraintLayout = b.a;
        bl2 bl2Var = (bl2) this.a.get(i);
        String str = bl2Var.b;
        Integer num = bl2Var.a;
        textView.setText(str);
        imageView.setVisibility(num != null ? 0 : 8);
        if (num != null) {
            as9.o(imageView, num.intValue());
        }
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
