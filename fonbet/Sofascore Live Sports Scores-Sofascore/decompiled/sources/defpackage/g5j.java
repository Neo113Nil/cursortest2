package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g5j extends o8 {
    public final cva d;
    public final LayoutInflater e;
    public final int f;
    public final int g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5j(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.compare_button;
        TextView textView = (TextView) nq8.B(R.id.compare_button, root);
        if (textView != null) {
            i = R.id.statistics_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.statistics_container, root);
            if (linearLayout != null) {
                this.d = new cva((LinearLayout) root, textView, linearLayout);
                this.e = LayoutInflater.from(context);
                this.f = context.getColor(R.color.secondary_default);
                this.g = context.getColor(R.color.primary_default);
                setVisibility(8);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.tennis_compare_layout;
    }

    public final void j(Event event, List list) {
        cva cvaVar;
        Double d;
        if (event.isDoublesMatch() || this.h) {
            return;
        }
        if (list != null) {
            setVisibility(list.isEmpty() ? 8 : 0);
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                cvaVar = this.d;
                if (!hasNext) {
                    break;
                }
                i8g i8gVar = (i8g) it.next();
                LinearLayout linearLayout = cvaVar.d;
                View inflate = this.e.inflate(R.layout.comparison_value_item, (ViewGroup) linearLayout, false);
                linearLayout.addView(inflate);
                z82 a = z82.a(inflate);
                joa joaVar = iyg.a;
                q9k q9kVar = i8gVar.c;
                String str = i8gVar.a;
                String str2 = i8gVar.b;
                Double d2 = i8gVar.e;
                iyg.a(a, q9kVar, str, str2, (str.equals(str2) || (d = i8gVar.d) == null || d2 == null) ? 0 : Double.compare(d.doubleValue(), d2.doubleValue()), this.f, this.g, Boolean.FALSE);
            }
            z8e.a0(cvaVar.c, 1000L, new deh(22, this, event));
        } else {
            setVisibility(8);
        }
        this.h = true;
    }
}
