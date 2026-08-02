package com.vk.voip.ui.broadcast.fragments.info;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.voip.ui.c;
import com.vk.voip.ui.utils.StaticBottomSheetFragment;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import xsna.ad0;
import xsna.asu0;
import xsna.av70;
import xsna.bdz;
import xsna.bnc0;
import xsna.bpn0;
import xsna.dhr0;
import xsna.dnz;
import xsna.eh8;
import xsna.evt0;
import xsna.gxj0;
import xsna.i0b0;
import xsna.jvq;
import xsna.l7s;
import xsna.mcl0;
import xsna.mdk0;
import xsna.mh40;
import xsna.ng8;
import xsna.nh40;
import xsna.nit;
import xsna.nr4;
import xsna.oi40;
import xsna.pdw;
import xsna.pg8;
import xsna.qg8;
import xsna.rkz;
import xsna.svk0;
import xsna.tj8;
import xsna.ujm0;
import xsna.ut30;
import xsna.utg0;
import xsna.uu60;
import xsna.vom0;
import xsna.w8i;
import xsna.wii0;
import xsna.wql0;
import xsna.yv2;

/* compiled from: StreamInfoFragment.kt */
/* loaded from: classes7.dex */
public class StreamInfoFragment extends StaticBottomSheetFragment implements w8i {
    public static final /* synthetic */ int S = 0;
    public final b P = new b();
    public pg8 Q;
    public tj8 R;

    /* compiled from: StreamInfoFragment.kt */
    public static final class a {
        public static void a(FragmentManager fragmentManager, ng8 ng8Var) {
            StreamInfoFragment streamInfoFragment = new StreamInfoFragment();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("force_title", ng8Var.a);
            bundle.putCharSequence("force_stats_section_title", ng8Var.b);
            bundle.putBoolean("can_show_views_total_count", ng8Var.c);
            bundle.putBoolean("can_show_views_unique_count", ng8Var.d);
            bundle.putBoolean("can_show_likes", ng8Var.e);
            bundle.putBoolean("can_show_comments", ng8Var.f);
            bundle.putBoolean("can_show_elapsed_time", ng8Var.g);
            bundle.putBoolean("can_show_spectators", ng8Var.h);
            bundle.putBoolean("can_share", ng8Var.i);
            bundle.putBoolean("can_finish", ng8Var.j);
            streamInfoFragment.setArguments(bundle);
            streamInfoFragment.Td(fragmentManager, "StreamInfoFragment");
        }
    }

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment
    public final View eo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ng8 ng8Var;
        if (getArguments() == null) {
            ng8Var = new ng8(null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        } else {
            Bundle requireArguments = requireArguments();
            ng8Var = new ng8(requireArguments.getCharSequence("force_title"), requireArguments.getCharSequence("force_stats_section_title"), requireArguments.getBoolean("can_show_views_total_count"), requireArguments.getBoolean("can_show_views_unique_count"), requireArguments.getBoolean("can_show_likes"), requireArguments.getBoolean("can_show_comments"), requireArguments.getBoolean("can_show_elapsed_time"), requireArguments.getBoolean("can_show_spectators"), requireArguments.getBoolean("can_share"), requireArguments.getBoolean("can_finish"));
        }
        pg8 pg8Var = new pg8(requireContext(), ng8Var.a, ng8Var.b);
        this.R = new tj8(requireContext(), nr4.b());
        jvq jvqVar = new jvq(ng8Var);
        eh8 fo = fo();
        b bVar = this.P;
        if (fo != null) {
            bVar.b(new i0(fo.c().a0(asu0.a.d()).U(new wii0(new mdk0(jvqVar, 2), 4)), new mh40(new mcl0(5), 14)).subscribe(new rkz(new ujm0(this, 1), 28)));
            bVar.b(new i0(fo.c(), new nh40(new gxj0(this), 18)).subscribe(new bdz(new svk0(this, 9), 24)));
        }
        evt0 evt0Var = new evt0();
        pg8Var.a();
        w d = asu0.a.d();
        f<qg8> fVar = pg8Var.l;
        bVar.b(new i0(fVar.a0(d).U(new utg0(new oi40(evt0Var, 25), 4)), new nit(new av70(18), 20)).subscribe(new uu60(new i0b0(this, 17), 22)));
        pg8Var.a();
        bVar.b(new i0(fVar, new dnz(new wql0(2), 15)).subscribe(new pdw(new bnc0(this, 14), 26)));
        pg8Var.a();
        bVar.b(fVar.b0(qg8.d.class).subscribe(new vom0(new ut30(this, 25), 0)));
        this.Q = pg8Var;
        return pg8Var.a;
    }

    public final eh8 fo() {
        if (ad0.e == null) {
            c.b.getClass();
            ad0.e = new eh8(c.r, ad0.d, new bpn0(new yv2(5)), c.I());
        }
        return ad0.e;
    }

    @Override // com.vk.voip.ui.utils.ContextHolderFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        dhr0.a.getClass();
        super.onAttach(new l7s(context, dhr0.u().c));
    }

    @Override // com.vk.voip.ui.utils.StaticBottomSheetFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fo() == null) {
            tn();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.P.dispose();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        pg8 pg8Var = this.Q;
        if (pg8Var != null) {
            pg8Var.k.a();
            pg8Var.m = false;
        }
        this.Q = null;
        tj8 tj8Var = this.R;
        if (tj8Var != null) {
            tj8Var.a();
        }
        this.R = null;
        this.P.e();
    }
}
