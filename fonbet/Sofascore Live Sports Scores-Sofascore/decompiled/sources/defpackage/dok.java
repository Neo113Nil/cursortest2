package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.venue.matches.VenueMatchesFragment;
import com.sofascore.results.venue.summary.VenueSummaryFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dok extends s8 {
    @Override // defpackage.d41
    public final Fragment C(Enum r1) {
        bok bokVar = (bok) r1;
        bokVar.getClass();
        int ordinal = bokVar.ordinal();
        if (ordinal == 0) {
            return new VenueSummaryFragment();
        }
        if (ordinal == 1) {
            return new VenueMatchesFragment();
        }
        zzl.b();
        return null;
    }

    @Override // defpackage.s8
    public final String H(Enum r3) {
        int i;
        bok bokVar = (bok) r3;
        bokVar.getClass();
        if (cok.a[bokVar.ordinal()] == 1) {
            mqi mqiVar = bii.a;
            i = bii.b(null, false);
        } else {
            i = bokVar.a;
        }
        String string = y().getString(i);
        string.getClass();
        return string;
    }
}
