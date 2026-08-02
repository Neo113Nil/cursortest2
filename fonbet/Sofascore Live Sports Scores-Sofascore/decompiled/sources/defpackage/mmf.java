package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.results.ranking.RankingFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mmf extends s8 {
    public int r;

    @Override // defpackage.d41
    public final Fragment C(Enum r4) {
        amf amfVar = (amf) r4;
        amfVar.getClass();
        int i = this.r;
        RankingFragment rankingFragment = new RankingFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ARG_TYPE", amfVar);
        bundle.putInt("ARG_INITIAL_POSITION", i);
        rankingFragment.setArguments(bundle);
        return rankingFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        amf amfVar = (amf) r1;
        amfVar.getClass();
        String string = y().getString(amfVar.c);
        string.getClass();
        return string;
    }
}
