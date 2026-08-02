package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wg5 extends ArrayAdapter {
    public final /* synthetic */ int a;
    public final List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg5(Context context, int i) {
        super(context, R.layout.menu_panel_item, R.id.item_text);
        this.a = i;
        context.getClass();
        switch (i) {
            case 1:
                super(context, R.layout.menu_panel_item, R.id.item_text);
                this.b = b.j(PlayerKt.PREFERRED_FOOT_RIGHT, PlayerKt.PREFERRED_FOOT_LEFT, "Both", "");
                break;
            case 2:
                super(context, android.R.layout.simple_list_item_1);
                this.b = b.j(qvj.c, qvj.g, qvj.a, qvj.b, qvj.d, qvj.e, qvj.f);
                break;
            default:
                this.b = b.j(new Pair("€", Integer.valueOf(R.string.currency_euro)), new Pair("$", Integer.valueOf(R.string.currency_dollar)), new Pair("£", Integer.valueOf(R.string.currency_pound)));
                break;
        }
    }

    public int a(String str) {
        Object obj;
        List list = this.b;
        Iterator it = b.h(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((Pair) list.get(((Number) obj).intValue())).a, str)) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public String b(int i, boolean z) {
        String str = (String) CollectionsKt.a0(i, this.b);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 2076577) {
                if (hashCode != 2364455) {
                    if (hashCode == 78959100 && str.equals(PlayerKt.PREFERRED_FOOT_RIGHT)) {
                        String string = getContext().getString(R.string.attribute_dominant_foot_right);
                        string.getClass();
                        return string;
                    }
                } else if (str.equals(PlayerKt.PREFERRED_FOOT_LEFT)) {
                    String string2 = getContext().getString(R.string.attribute_dominant_foot_left);
                    string2.getClass();
                    return string2;
                }
            } else if (str.equals("Both")) {
                String string3 = getContext().getString(R.string.preferred_foot_both);
                string3.getClass();
                return string3;
            }
        }
        if (!z) {
            return "";
        }
        String string4 = getContext().getString(R.string.value_unknown);
        string4.getClass();
        return string4;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        switch (this.a) {
        }
        return this.b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        switch (this.a) {
            case 2:
                return new zk2(this, 4);
            default:
                return super.getFilter();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.a;
        List list = this.b;
        switch (i2) {
            case 0:
                return (String) ((Pair) list.get(i)).a;
            case 1:
                return b(i, true);
            default:
                return (qvj) list.get(i);
        }
    }

    @Override // android.widget.ArrayAdapter
    public final int getPosition(Object obj) {
        switch (this.a) {
            case 0:
                return a((String) obj);
            case 1:
                return CollectionsKt.c0(this.b, (String) obj);
            default:
                return CollectionsKt.c0(this.b, (qvj) obj);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = this.a;
        List list = this.b;
        switch (i2) {
            case 0:
                viewGroup.getClass();
                nfc b = view == null ? nfc.b(LayoutInflater.from(viewGroup.getContext()), viewGroup) : nfc.a(view);
                Pair pair = (Pair) list.get(i);
                l4a.K(b.c, pair.a + " - " + getContext().getString(((Number) pair.b).intValue()));
                ConstraintLayout constraintLayout = b.a;
                constraintLayout.getClass();
                return constraintLayout;
            case 1:
            default:
                return super.getView(i, view, viewGroup);
            case 2:
                viewGroup.getClass();
                nfc b2 = view == null ? nfc.b(LayoutInflater.from(viewGroup.getContext()), viewGroup) : nfc.a(view);
                qvj qvjVar = (qvj) list.get(i);
                TextView textView = b2.c;
                int ordinal = qvjVar.ordinal();
                Context context = getContext();
                context.getClass();
                textView.setText(v8a.C(ordinal, context));
                ConstraintLayout constraintLayout2 = b2.a;
                constraintLayout2.getClass();
                return constraintLayout2;
        }
    }
}
