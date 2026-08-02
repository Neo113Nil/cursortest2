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
public final class s5e extends g7 {
    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((t5e) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 1) {
            ilg.c();
            return null;
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.chat_intro_view, viewGroup, false);
        int i2 = R.id.description;
        TextView textView = (TextView) nq8.B(R.id.description, inflate);
        if (textView != null) {
            i2 = R.id.subtitle;
            TextView textView2 = (TextView) nq8.B(R.id.subtitle, inflate);
            if (textView2 != null) {
                i2 = R.id.title;
                TextView textView3 = (TextView) nq8.B(R.id.title, inflate);
                if (textView3 != null) {
                    return new ja9(new hs1((LinearLayout) inflate, textView, textView2, textView3, 1));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
