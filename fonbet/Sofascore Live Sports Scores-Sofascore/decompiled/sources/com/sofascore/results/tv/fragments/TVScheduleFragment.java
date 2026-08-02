package com.sofascore.results.tv.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import com.sofascore.results.tv.fragments.TVScheduleFragment;
import defpackage.asi;
import defpackage.csi;
import defpackage.duf;
import defpackage.g2i;
import defpackage.g4k;
import defpackage.krk;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.otk;
import defpackage.sq8;
import defpackage.uri;
import defpackage.ygi;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.yri;
import defpackage.z8e;
import java.io.Serializable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/tv/fragments/TVScheduleFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lsq8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TVScheduleFragment extends Hilt_TVScheduleFragment<sq8> {
    public final otk r;
    public final mqi s;
    public final mqi t;
    public View u;

    public TVScheduleFragment() {
        final int i = 0;
        final int i2 = 1;
        this.r = new otk(duf.a.getOrCreateKotlinClass(g4k.class), new asi(this, i), new asi(this, 2), new asi(this, i2));
        this.s = ypa.b(new Function0(this) { // from class: zri
            public final /* synthetic */ TVScheduleFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                TVScheduleFragment tVScheduleFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = tVScheduleFragment.requireContext();
                        requireContext.getClass();
                        return new csi(requireContext);
                    default:
                        Bundle requireArguments = tVScheduleFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DAY", Calendar.class);
                        if (M != null) {
                            return (Calendar) M;
                        }
                        a70.p("Serializable ARG_DAY not found");
                        return null;
                }
            }
        });
        this.t = ypa.b(new Function0(this) { // from class: zri
            public final /* synthetic */ TVScheduleFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                TVScheduleFragment tVScheduleFragment = this.b;
                switch (i3) {
                    case 0:
                        Context requireContext = tVScheduleFragment.requireContext();
                        requireContext.getClass();
                        return new csi(requireContext);
                    default:
                        Bundle requireArguments = tVScheduleFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_DAY", Calendar.class);
                        if (M != null) {
                            return (Calendar) M;
                        }
                        a70.p("Serializable ARG_DAY not found");
                        return null;
                }
            }
        });
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_tv_schedule, (ViewGroup) null, false);
        int i = R.id.tv_schedule_empty;
        ViewStub viewStub = (ViewStub) nq8.B(R.id.tv_schedule_empty, inflate);
        if (viewStub != null) {
            i = R.id.tv_schedule_list;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.tv_schedule_list, inflate);
            if (recyclerView != null) {
                return new sq8((FrameLayout) inflate, viewStub, recyclerView);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "TvScheduleTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        l();
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((sq8) krkVar).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView2 = ((sq8) krkVar2).c;
        mqi mqiVar = this.s;
        recyclerView2.setAdapter((csi) mqiVar.getValue());
        csi csiVar = (csi) mqiVar.getValue();
        uri uriVar = new uri(this, 1);
        csiVar.getClass();
        csiVar.a.d = uriVar;
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView3 = ((sq8) krkVar3).c;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView3.addItemDecoration(new yri(requireContext2, 0, 14));
        krk krkVar4 = this.l;
        krkVar4.getClass();
        this.u = ((sq8) krkVar4).b.inflate();
        ((g4k) this.r.getValue()).k.e(getViewLifecycleOwner(), new ygi(2, new g2i(this, 16)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
