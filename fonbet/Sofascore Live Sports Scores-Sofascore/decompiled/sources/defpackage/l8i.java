package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class l8i extends g7 {
    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 14);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((i8i) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.driver_career_stats_row_layout, viewGroup, false);
        int i2 = R.id.stat_name;
        TextView textView = (TextView) nq8.B(R.id.stat_name, inflate);
        if (textView != null) {
            i2 = R.id.stat_value;
            TextView textView2 = (TextView) nq8.B(R.id.stat_value, inflate);
            if (textView2 != null) {
                return new vh(this, new t22((LinearLayout) inflate, textView, textView2, 3));
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
