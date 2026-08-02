package com.sofascore.results.mma.organisation.details;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.MmaEvent;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import com.sofascore.results.mma.organisation.details.MmaOrganisationDetailsFragment;
import com.sofascore.results.mma.organisation.details.view.MmaOrganisationFeaturedEventView;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.dividers.SofaDivider;
import com.sofascore.results.view.facts.MmaOrganisationInfoView;
import defpackage.a70;
import defpackage.duf;
import defpackage.fpc;
import defpackage.fuf;
import defpackage.gz8;
import defpackage.ipc;
import defpackage.jmc;
import defpackage.joa;
import defpackage.kpc;
import defpackage.krk;
import defpackage.llc;
import defpackage.mp8;
import defpackage.nq8;
import defpackage.otk;
import defpackage.qu1;
import defpackage.rq3;
import defpackage.un0;
import defpackage.wya;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mma/organisation/details/MmaOrganisationDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lmp8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaOrganisationDetailsFragment extends Hilt_MmaOrganisationDetailsFragment<mp8> {
    public final otk r;
    public final otk s;
    public UniqueTournament t;
    public MmaEvent u;
    public boolean v;

    public MmaOrganisationDetailsFragment() {
        joa a = ypa.a(ysa.c, new jmc(new ipc(this, 3), 11));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(kpc.class), new llc(a, 13), new wya(15, this, a), new llc(a, 14));
        this.s = new otk(fufVar.getOrCreateKotlinClass(fpc.class), new ipc(this, 0), new ipc(this, 2), new ipc(this, 1));
        this.v = true;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_organisation_details, (ViewGroup) null, false);
        int i = R.id.container_layout;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container_layout, inflate);
        if (linearLayout != null) {
            i = R.id.featured_event_view;
            MmaOrganisationFeaturedEventView mmaOrganisationFeaturedEventView = (MmaOrganisationFeaturedEventView) nq8.B(R.id.featured_event_view, inflate);
            if (mmaOrganisationFeaturedEventView != null) {
                i = R.id.info_view;
                MmaOrganisationInfoView mmaOrganisationInfoView = (MmaOrganisationInfoView) nq8.B(R.id.info_view, inflate);
                if (mmaOrganisationInfoView != null) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate;
                    return new mp8(swipeRefreshLayout, linearLayout, mmaOrganisationFeaturedEventView, mmaOrganisationInfoView, swipeRefreshLayout);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((mp8) krkVar).e;
        swipeRefreshLayout.getClass();
        otk otkVar = this.s;
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 4);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "ORGANISATION_DATA", UniqueTournament.class);
        if (M == null) {
            a70.p("Serializable ORGANISATION_DATA not found");
            return;
        }
        this.t = (UniqueTournament) M;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        mp8 mp8Var = (mp8) krkVar2;
        mp8Var.b.getLayoutTransition().enableTransitionType(4);
        MmaOrganisationInfoView mmaOrganisationInfoView = mp8Var.d;
        UniqueTournament uniqueTournament = this.t;
        if (uniqueTournament == null) {
            Intrinsics.i("organisation");
            throw null;
        }
        final int i = 1;
        mmaOrganisationInfoView.l(uniqueTournament, true);
        SofaDivider sofaDivider = mmaOrganisationInfoView.e;
        final int i2 = 0;
        if (sofaDivider != null) {
            sofaDivider.setDividerVisibility(false);
        }
        ((fpc) otkVar.getValue()).h.e(getViewLifecycleOwner(), new z1(26, new Function1(this) { // from class: hpc
            public final /* synthetic */ MmaOrganisationDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                MmaOrganisationDetailsFragment mmaOrganisationDetailsFragment = this.b;
                switch (i3) {
                    case 0:
                        UniqueTournament uniqueTournament2 = (UniqueTournament) obj;
                        uniqueTournament2.getClass();
                        mmaOrganisationDetailsFragment.t = uniqueTournament2;
                        break;
                    default:
                        MmaEvent mmaEvent = (MmaEvent) obj;
                        mmaOrganisationDetailsFragment.n();
                        mmaOrganisationDetailsFragment.u = mmaEvent;
                        krk krkVar3 = mmaOrganisationDetailsFragment.l;
                        if (mmaEvent != null) {
                            krkVar3.getClass();
                            ((mp8) krkVar3).c.l(mmaEvent);
                        } else {
                            krkVar3.getClass();
                            ((mp8) krkVar3).c.setVisibility(8);
                        }
                        break;
                }
                return Unit.a;
            }
        }));
        ((kpc) this.r.getValue()).g.e(getViewLifecycleOwner(), new z1(26, new Function1(this) { // from class: hpc
            public final /* synthetic */ MmaOrganisationDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                MmaOrganisationDetailsFragment mmaOrganisationDetailsFragment = this.b;
                switch (i3) {
                    case 0:
                        UniqueTournament uniqueTournament2 = (UniqueTournament) obj;
                        uniqueTournament2.getClass();
                        mmaOrganisationDetailsFragment.t = uniqueTournament2;
                        break;
                    default:
                        MmaEvent mmaEvent = (MmaEvent) obj;
                        mmaOrganisationDetailsFragment.n();
                        mmaOrganisationDetailsFragment.u = mmaEvent;
                        krk krkVar3 = mmaOrganisationDetailsFragment.l;
                        if (mmaEvent != null) {
                            krkVar3.getClass();
                            ((mp8) krkVar3).c.l(mmaEvent);
                        } else {
                            krkVar3.getClass();
                            ((mp8) krkVar3).c.setVisibility(8);
                        }
                        break;
                }
                return Unit.a;
            }
        }));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        if (!this.v && this.u == null) {
            n();
            return;
        }
        this.v = false;
        kpc kpcVar = (kpc) this.r.getValue();
        UniqueTournament uniqueTournament = this.t;
        rq3 rq3Var = null;
        if (uniqueTournament == null) {
            Intrinsics.i("organisation");
            throw null;
        }
        xw3.L(un0.z(kpcVar), null, null, new qu1(kpcVar, uniqueTournament.getId(), rq3Var, 19), 3);
    }
}
