package com.sofascore.results.referee.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.GridItem;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.referee.details.RefereeDetailsFragment;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.ah5;
import defpackage.ao2;
import defpackage.bi4;
import defpackage.bte;
import defpackage.dla;
import defpackage.duf;
import defpackage.dv3;
import defpackage.eqb;
import defpackage.fc6;
import defpackage.joa;
import defpackage.krk;
import defpackage.loe;
import defpackage.lsf;
import defpackage.mqi;
import defpackage.ofe;
import defpackage.oo8;
import defpackage.otk;
import defpackage.qsf;
import defpackage.qu1;
import defpackage.rq3;
import defpackage.rsf;
import defpackage.sea;
import defpackage.un0;
import defpackage.vce;
import defpackage.vxd;
import defpackage.x2e;
import defpackage.xw3;
import defpackage.yaa;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/referee/details/RefereeDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefereeDetailsFragment extends Hilt_RefereeDetailsFragment<oo8> {
    public final mqi r;
    public final otk s;
    public final mqi t;
    public final mqi u;

    public RefereeDetailsFragment() {
        final int i = 0;
        this.r = ypa.b(new Function0(this) { // from class: msf
            public final /* synthetic */ RefereeDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RefereeDetailsFragment refereeDetailsFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = refereeDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "REFEREE", Referee.class);
                        if (M != null) {
                            return (Referee) M;
                        }
                        a70.p("Serializable REFEREE not found");
                        return null;
                    case 1:
                        Context requireContext = refereeDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new qsf(requireContext);
                    default:
                        LayoutInflater layoutInflater = refereeDetailsFragment.getLayoutInflater();
                        krk krkVar = refereeDetailsFragment.l;
                        krkVar.getClass();
                        loe a = loe.a(layoutInflater, ((oo8) krkVar).d);
                        ((ConstraintLayout) a.d.b).setVisibility(8);
                        ConstraintLayout constraintLayout = (ConstraintLayout) a.e.j;
                        constraintLayout.getClass();
                        constraintLayout.setVisibility(8);
                        return a;
                }
            }
        });
        joa a = ypa.a(ysa.c, new vce(new vce(this, 22), 23));
        this.s = new otk(duf.a.getOrCreateKotlinClass(rsf.class), new x2e(a, 27), new bte(this, a, 6), new x2e(a, 28));
        final int i2 = 1;
        this.t = ypa.b(new Function0(this) { // from class: msf
            public final /* synthetic */ RefereeDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RefereeDetailsFragment refereeDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = refereeDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "REFEREE", Referee.class);
                        if (M != null) {
                            return (Referee) M;
                        }
                        a70.p("Serializable REFEREE not found");
                        return null;
                    case 1:
                        Context requireContext = refereeDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new qsf(requireContext);
                    default:
                        LayoutInflater layoutInflater = refereeDetailsFragment.getLayoutInflater();
                        krk krkVar = refereeDetailsFragment.l;
                        krkVar.getClass();
                        loe a2 = loe.a(layoutInflater, ((oo8) krkVar).d);
                        ((ConstraintLayout) a2.d.b).setVisibility(8);
                        ConstraintLayout constraintLayout = (ConstraintLayout) a2.e.j;
                        constraintLayout.getClass();
                        constraintLayout.setVisibility(8);
                        return a2;
                }
            }
        });
        final int i3 = 2;
        this.u = ypa.b(new Function0(this) { // from class: msf
            public final /* synthetic */ RefereeDetailsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RefereeDetailsFragment refereeDetailsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = refereeDetailsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "REFEREE", Referee.class);
                        if (M != null) {
                            return (Referee) M;
                        }
                        a70.p("Serializable REFEREE not found");
                        return null;
                    case 1:
                        Context requireContext = refereeDetailsFragment.requireContext();
                        requireContext.getClass();
                        return new qsf(requireContext);
                    default:
                        LayoutInflater layoutInflater = refereeDetailsFragment.getLayoutInflater();
                        krk krkVar = refereeDetailsFragment.l;
                        krkVar.getClass();
                        loe a2 = loe.a(layoutInflater, ((oo8) krkVar).d);
                        ((ConstraintLayout) a2.d.b).setVisibility(8);
                        ConstraintLayout constraintLayout = (ConstraintLayout) a2.e.j;
                        constraintLayout.getClass();
                        constraintLayout.setVisibility(8);
                        return a2;
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        l();
        int i = 0;
        ((rsf) this.s.getValue()).g.e(getViewLifecycleOwner(), new eqb(20, new lsf(this, 0)));
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter((qsf) this.t.getValue());
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        ofe ofeVar = new ofe(requireContext3, 0);
        ArrayList arrayList = new ArrayList();
        new SimpleDateFormat("yyyy-MM-dd", Locale.UK).setTimeZone(TimeZone.getTimeZone("GMT"));
        krk krkVar3 = this.l;
        krkVar3.getClass();
        mqi mqiVar = this.u;
        GridView gridView = ((loe) mqiVar.getValue()).b;
        sea.v(gridView, true, true, 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
        gridView.setAdapter((ListAdapter) ofeVar);
        ArrayList arrayList2 = dv3.a;
        mqi mqiVar2 = this.r;
        Country country = ((Referee) mqiVar2.getValue()).getCountry();
        com.sofascore.model.Country a = dv3.a(country != null ? country.getAlpha2() : null);
        gridView.setOnItemClickListener(new ah5(5, this, a));
        if (a != null) {
            GridItem gridItem = new GridItem(GridItem.Type.IMAGE, getString(R.string.nationality));
            gridItem.setFirst(a.getIoc());
            gridItem.setIsEnabled(true);
            gridItem.setCountryCode(a.getIso2Alpha());
            arrayList.add(gridItem);
            i = 1;
        }
        Long dateOfBirthTimestamp = ((Referee) mqiVar2.getValue()).getDateOfBirthTimestamp();
        if (dateOfBirthTimestamp != null) {
            long longValue = dateOfBirthTimestamp.longValue();
            GridItem.Type type = GridItem.Type.SPLIT;
            bi4 bi4Var = bi4.PATTERN_DMMY;
            Locale d = dla.d();
            ZoneId of = ZoneId.of("GMT");
            of.getClass();
            GridItem gridItem2 = new GridItem(type, fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var.d(), d).withZone(of).withDecimalStyle(DecimalStyle.of(d))));
            int between = (int) ChronoUnit.YEARS.between(vxd.o(Instant.ofEpochMilli(longValue * 1000)), vxd.o(Instant.ofEpochMilli(yaa.v())));
            gridItem2.setFirst(gridView.getResources().getQuantityString(R.plurals.years_short, between, String.valueOf(between)));
            arrayList.add(gridItem2);
            i++;
        }
        int ceil = (int) Math.ceil(i / 2.0d);
        Context requireContext4 = requireContext();
        requireContext4.getClass();
        gridView.getLayoutParams().height = ceil * ao2.s(56, requireContext4);
        ((loe) mqiVar.getValue()).b.setNumColumns(Math.min(i, 3));
        ofeVar.a(arrayList);
        t(view, new lsf(this, 1));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        rsf rsfVar = (rsf) this.s.getValue();
        xw3.L(un0.z(rsfVar), null, null, new qu1(rsfVar, ((Referee) this.r.getValue()).getId(), (rq3) null, 27), 3);
    }
}
