package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.sofascore.results.R;
import com.sofascore.results.event.matches.view.WinningOddsView;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l0k extends g7 {
    public zu1 l;
    public final LinkedHashMap m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0k(Context context) {
        super(context);
        context.getClass();
        this.m = new LinkedHashMap();
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 21);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((vd6) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = hkg.S(this.b).inflate(R.layout.viewholder_trending_odds, viewGroup, false);
        int i2 = R.id.tournament_details;
        View B = nq8.B(R.id.tournament_details, inflate);
        if (B != null) {
            zl d = zl.d(B);
            WinningOddsView winningOddsView = (WinningOddsView) nq8.B(R.id.winning_odds, inflate);
            if (winningOddsView != null) {
                return new k04(this, new z3f(16, winningOddsView, (LinearLayout) inflate, d));
            }
            i2 = R.id.winning_odds;
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
