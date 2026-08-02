package defpackage;

import android.content.Context;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class iya extends kya {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iya(UniqueTournamentGroup uniqueTournamentGroup) {
        super(uniqueTournamentGroup);
        uniqueTournamentGroup.getClass();
    }

    @Override // defpackage.kya
    public final String a(Context context) {
        return ((UniqueTournamentGroup) this.a).getGroupName();
    }

    @Override // defpackage.kya
    public final int b() {
        return R.string.select_group;
    }
}
