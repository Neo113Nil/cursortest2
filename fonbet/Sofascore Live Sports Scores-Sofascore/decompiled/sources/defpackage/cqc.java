package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.mma.organisation.details.MmaOrganisationDetailsFragment;
import com.sofascore.results.mma.organisation.events.MmaOrganisationEventsFragment;
import com.sofascore.results.mma.organisation.rankings.MmaOrganisationRankingsFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cqc extends s8 {
    public UniqueTournament r;

    @Override // defpackage.d41
    public final Fragment C(Enum r5) {
        bqc bqcVar = (bqc) r5;
        bqcVar.getClass();
        int ordinal = bqcVar.ordinal();
        if (ordinal == 0) {
            UniqueTournament uniqueTournament = this.r;
            if (uniqueTournament == null) {
                Intrinsics.i(SearchResponseKt.LEAGUE_ENTITY);
                throw null;
            }
            MmaOrganisationDetailsFragment mmaOrganisationDetailsFragment = new MmaOrganisationDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ORGANISATION_DATA", uniqueTournament);
            mmaOrganisationDetailsFragment.setArguments(bundle);
            return mmaOrganisationDetailsFragment;
        }
        if (ordinal == 1) {
            UniqueTournament uniqueTournament2 = this.r;
            if (uniqueTournament2 == null) {
                Intrinsics.i(SearchResponseKt.LEAGUE_ENTITY);
                throw null;
            }
            MmaOrganisationEventsFragment mmaOrganisationEventsFragment = new MmaOrganisationEventsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("ORGANISATION_DATA", uniqueTournament2);
            mmaOrganisationEventsFragment.setArguments(bundle2);
            return mmaOrganisationEventsFragment;
        }
        if (ordinal != 2) {
            zzl.b();
            return null;
        }
        UniqueTournament uniqueTournament3 = this.r;
        if (uniqueTournament3 == null) {
            Intrinsics.i(SearchResponseKt.LEAGUE_ENTITY);
            throw null;
        }
        MmaOrganisationRankingsFragment mmaOrganisationRankingsFragment = new MmaOrganisationRankingsFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putSerializable("ORGANISATION_DATA", uniqueTournament3);
        mmaOrganisationRankingsFragment.setArguments(bundle3);
        return mmaOrganisationRankingsFragment;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        bqc bqcVar = (bqc) r1;
        bqcVar.getClass();
        String string = y().getString(bqcVar.a);
        string.getClass();
        return string;
    }
}
