package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.TeamUniqueTournament;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q6f extends g7 {
    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new r6f(arrayList2, arrayList);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((TeamUniqueTournament) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) e92.b(LayoutInflater.from(this.b).inflate(R.layout.list_item_label_tournament, viewGroup, false)).e;
        constraintLayout.getClass();
        return new ja9(constraintLayout);
    }
}
