package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.referee.details.RefereeDetailsFragment;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ftf extends s8 {
    public Referee r;

    @Override // defpackage.d41
    public final Fragment C(Enum r5) {
        dtf dtfVar = (dtf) r5;
        dtfVar.getClass();
        int ordinal = dtfVar.ordinal();
        if (ordinal == 0) {
            Referee referee = this.r;
            if (referee == null) {
                Intrinsics.i(SearchResponseKt.REFEREE_ENTITY);
                throw null;
            }
            RefereeDetailsFragment refereeDetailsFragment = new RefereeDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("REFEREE", referee);
            refereeDetailsFragment.setArguments(bundle);
            return refereeDetailsFragment;
        }
        if (ordinal != 1) {
            zzl.b();
            return null;
        }
        Referee referee2 = this.r;
        if (referee2 == null) {
            Intrinsics.i(SearchResponseKt.REFEREE_ENTITY);
            throw null;
        }
        RefereeEventsFragment refereeEventsFragment = new RefereeEventsFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("REFEREE", referee2);
        refereeEventsFragment.setArguments(bundle2);
        return refereeEventsFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r3) {
        int i;
        dtf dtfVar = (dtf) r3;
        dtfVar.getClass();
        if (etf.a[dtfVar.ordinal()] == 2) {
            mqi mqiVar = bii.a;
            Referee referee = this.r;
            if (referee == null) {
                Intrinsics.i(SearchResponseKt.REFEREE_ENTITY);
                throw null;
            }
            i = bii.b(referee.getSportSlug(), false);
        } else {
            i = dtfVar.a;
        }
        String string = y().getString(i);
        string.getClass();
        return string;
    }
}
