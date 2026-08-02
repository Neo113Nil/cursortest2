package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.view.TopH2HStreakView;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hlj extends g7 {
    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 19);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((ud6) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = hkg.S(this.b).inflate(R.layout.viewholder_h2h, viewGroup, false);
        TopH2HStreakView topH2HStreakView = (TopH2HStreakView) nq8.B(R.id.top_h2h_streak, inflate);
        if (topH2HStreakView != null) {
            return new j8i(new rvk((FrameLayout) inflate, topH2HStreakView, 1));
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.top_h2h_streak)));
        return null;
    }
}
