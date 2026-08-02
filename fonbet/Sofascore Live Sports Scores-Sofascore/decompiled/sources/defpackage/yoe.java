package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yoe extends g7 {
    public int l;

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 15);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((xoe) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i != 1) {
            ilg.c();
            return null;
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.player_event_statistics_footer_player_layout, viewGroup, false);
        int i2 = R.id.player_image;
        ImageView imageView = (ImageView) nq8.B(R.id.player_image, inflate);
        if (imageView != null) {
            i2 = R.id.player_name;
            TextView textView = (TextView) nq8.B(R.id.player_name, inflate);
            if (textView != null) {
                i2 = R.id.player_team_logo;
                ImageView imageView2 = (ImageView) nq8.B(R.id.player_team_logo, inflate);
                if (imageView2 != null) {
                    return new vh(this, new s63((ConstraintLayout) inflate, imageView, textView, imageView2));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
