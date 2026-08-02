package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.sofascore.model.mvvm.model.Tournament;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class inc extends s8 {
    public Tournament r;

    @Override // defpackage.d41
    public final Fragment C(Enum r6) {
        hnc hncVar = (hnc) r6;
        hncVar.getClass();
        int ordinal = hncVar.ordinal();
        if (ordinal == 0) {
            g08 g08Var = g08.d;
            Tournament tournament = this.r;
            if (tournament == null) {
                Intrinsics.i("tournament");
                throw null;
            }
            MmaFightNightFragment mmaFightNightFragment = new MmaFightNightFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("MMA_FIGHT_NIGHT_FRAGMENT_TYPE", g08Var);
            bundle.putSerializable("ARG_TOURNAMENT", tournament);
            mmaFightNightFragment.setArguments(bundle);
            return mmaFightNightFragment;
        }
        if (ordinal == 1) {
            g08 g08Var2 = g08.e;
            Tournament tournament2 = this.r;
            if (tournament2 == null) {
                Intrinsics.i("tournament");
                throw null;
            }
            MmaFightNightFragment mmaFightNightFragment2 = new MmaFightNightFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("MMA_FIGHT_NIGHT_FRAGMENT_TYPE", g08Var2);
            bundle2.putSerializable("ARG_TOURNAMENT", tournament2);
            mmaFightNightFragment2.setArguments(bundle2);
            return mmaFightNightFragment2;
        }
        if (ordinal == 2) {
            g08 g08Var3 = g08.f;
            Tournament tournament3 = this.r;
            if (tournament3 == null) {
                Intrinsics.i("tournament");
                throw null;
            }
            MmaFightNightFragment mmaFightNightFragment3 = new MmaFightNightFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("MMA_FIGHT_NIGHT_FRAGMENT_TYPE", g08Var3);
            bundle3.putSerializable("ARG_TOURNAMENT", tournament3);
            mmaFightNightFragment3.setArguments(bundle3);
            return mmaFightNightFragment3;
        }
        if (ordinal != 3) {
            zzl.b();
            return null;
        }
        Tournament tournament4 = this.r;
        if (tournament4 == null) {
            Intrinsics.i("tournament");
            throw null;
        }
        MmaFightNightFragment mmaFightNightFragment4 = new MmaFightNightFragment();
        Bundle bundle4 = new Bundle();
        bundle4.putSerializable("MMA_FIGHT_NIGHT_FRAGMENT_TYPE", null);
        bundle4.putSerializable("ARG_TOURNAMENT", tournament4);
        mmaFightNightFragment4.setArguments(bundle4);
        return mmaFightNightFragment4;
    }

    @Override // defpackage.s8
    public final String H(Enum r1) {
        hnc hncVar = (hnc) r1;
        hncVar.getClass();
        String string = y().getString(hncVar.a);
        string.getClass();
        return string;
    }
}
