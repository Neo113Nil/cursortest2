package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.sofascore.model.profile.PlayerSubscription;
import com.sofascore.model.profile.TeamSubscription;
import com.sofascore.model.profile.UniqueTournamentSubscription;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r9f extends g7 {
    public final boolean l;
    public final joa m;
    public final LayoutInflater n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9f(Context context, boolean z) {
        super(context);
        context.getClass();
        this.l = z;
        this.m = ypa.a(ysa.c, new k9f(context, 2));
        LayoutInflater from = LayoutInflater.from(context);
        from.getClass();
        this.n = from;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return i != 5;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 7);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof PlayerSubscription) {
            return 1;
        }
        if (obj instanceof TeamSubscription) {
            return 2;
        }
        if (obj instanceof UniqueTournamentSubscription) {
            return 3;
        }
        if (obj instanceof wm5) {
            return 5;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.n;
        if (i != 1 && i != 2) {
            int i2 = 3;
            if (i != 3) {
                if (i != 5) {
                    ilg.c();
                    return null;
                }
                View inflate = layoutInflater.inflate(R.layout.profile_followed_item_empty_state, viewGroup, false);
                TextView textView = (TextView) nq8.B(R.id.empty_state_text, inflate);
                if (textView != null) {
                    return new ja9(new o16((FrameLayout) inflate, textView, i2), (char) 0);
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.empty_state_text)));
                return null;
            }
        }
        View inflate2 = layoutInflater.inflate(R.layout.profile_followed_item, viewGroup, false);
        int i3 = R.id.item_img;
        ImageView imageView = (ImageView) nq8.B(R.id.item_img, inflate2);
        if (imageView != null) {
            i3 = R.id.item_name;
            TextView textView2 = (TextView) nq8.B(R.id.item_name, inflate2);
            if (textView2 != null) {
                i3 = R.id.sport_team_img;
                ImageView imageView2 = (ImageView) nq8.B(R.id.sport_team_img, inflate2);
                if (imageView2 != null) {
                    return new vh(this, new rfe((CardView) inflate2, imageView, textView2, imageView2, 3));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        return null;
    }
}
