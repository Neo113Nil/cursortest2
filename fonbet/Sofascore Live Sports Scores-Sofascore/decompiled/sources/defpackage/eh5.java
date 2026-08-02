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
import com.sofascore.model.Country;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eh5 extends ArrayAdapter {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh5(Context context, int i) {
        super(context, R.layout.menu_panel_item);
        this.a = i;
        context.getClass();
        switch (i) {
            case 2:
                super(context, R.layout.menu_panel_item, R.id.item_text);
                this.b = j08.values();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public String a(String str) {
        Object obj;
        String name;
        Iterator it = ((ArrayList) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((Country) obj).getIso3Alpha(), str)) {
                break;
            }
        }
        Country country = (Country) obj;
        if (country == null || (name = country.getName()) == null) {
            return "";
        }
        Context context = getContext();
        context.getClass();
        return tv3.c(context, name);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ArrayList) obj).size();
            case 1:
            default:
                return super.getCount();
            case 2:
                return ((j08[]) obj).length;
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        switch (this.a) {
            case 0:
                return new zk2(this, 3);
            case 1:
                return new zk2(this, 6);
            default:
                return new zk2(this, 2);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                return (Country) ((ArrayList) obj).get(i);
            case 1:
            default:
                return super.getItem(i);
            case 2:
                return ((j08[]) obj)[i];
        }
    }

    @Override // android.widget.ArrayAdapter
    public int getPosition(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((ArrayList) obj2).indexOf((Country) obj);
            case 1:
            default:
                return super.getPosition(obj);
            case 2:
                j08 j08Var = (j08) obj;
                j08[] j08VarArr = (j08[]) obj2;
                int length = j08VarArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (j08VarArr[i2] == j08Var) {
                        return i2;
                    }
                }
                return -1;
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = this.a;
        Object obj = this.b;
        viewGroup.getClass();
        switch (i2) {
            case 0:
                nfc b = view == null ? nfc.b(LayoutInflater.from(viewGroup.getContext()), viewGroup) : nfc.a(view);
                Country country = (Country) ((ArrayList) obj).get(i);
                as9.c(b.b, country.getIso2Alpha(), true, null, 4);
                TextView textView = b.c;
                Context context = viewGroup.getContext();
                context.getClass();
                textView.setText(tv3.c(context, country.getName()));
                ConstraintLayout constraintLayout = b.a;
                constraintLayout.getClass();
                return constraintLayout;
            case 1:
                Country country2 = (Country) getItem(i);
                nfc a = view != null ? nfc.a(view) : nfc.b(LayoutInflater.from(getContext()), viewGroup);
                ImageView imageView = a.b;
                ConstraintLayout constraintLayout2 = a.a;
                constraintLayout2.getClass();
                aba.I(constraintLayout2);
                imageView.setVisibility(0);
                as9.c(imageView, country2 != null ? country2.getIso2Alpha() : null, false, null, 6);
                TextView textView2 = a.c;
                Context context2 = getContext();
                context2.getClass();
                textView2.setText(tv3.c(context2, country2 != null ? country2.getName() : null));
                return constraintLayout2;
            default:
                nfc b2 = view == null ? nfc.b(LayoutInflater.from(viewGroup.getContext()), viewGroup) : nfc.a(view);
                j08 j08Var = ((j08[]) obj)[i];
                b2.b.setVisibility(8);
                b2.c.setText(getContext().getString(j08Var.b));
                ConstraintLayout constraintLayout3 = b2.a;
                constraintLayout3.getClass();
                return constraintLayout3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh5(Context context, ArrayList arrayList) {
        super(context, R.layout.menu_panel_item, R.id.item_text);
        this.a = 0;
        context.getClass();
        this.b = arrayList;
    }
}
