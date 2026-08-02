package com.sofascore.results.stagesport.fragments.team.driver;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.stagesport.fragments.team.driver.StageDriverEventsFragment;
import defpackage.duf;
import defpackage.e1d;
import defpackage.f54;
import defpackage.fvg;
import defpackage.h8i;
import defpackage.ioe;
import defpackage.j5i;
import defpackage.joa;
import defpackage.km5;
import defpackage.krk;
import defpackage.mqi;
import defpackage.oo8;
import defpackage.otk;
import defpackage.pte;
import defpackage.s7i;
import defpackage.tc3;
import defpackage.un0;
import defpackage.w4i;
import defpackage.xhh;
import defpackage.xw3;
import defpackage.y4i;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/team/driver/StageDriverEventsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageDriverEventsFragment extends Hilt_StageDriverEventsFragment<oo8> {
    public final joa r;
    public final otk s;
    public final mqi t;
    public final mqi u;
    public final e1d v;
    public final e1d w;
    public final joa x;

    public StageDriverEventsFragment() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: x4i
            public final /* synthetic */ StageDriverEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StageDriverEventsFragment stageDriverEventsFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = stageDriverEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "STANDINGS_TYPE", j5i.class);
                        if (M != null) {
                            return (j5i) M;
                        }
                        a70.p("Serializable STANDINGS_TYPE not found");
                        return null;
                    case 1:
                        Context requireContext = stageDriverEventsFragment.requireContext();
                        requireContext.getClass();
                        return new s7i(requireContext);
                    case 2:
                        LayoutInflater layoutInflater = stageDriverEventsFragment.getLayoutInflater();
                        krk krkVar = stageDriverEventsFragment.l;
                        krkVar.getClass();
                        xhh a = xhh.a(layoutInflater, ((oo8) krkVar).d);
                        a.b.setVisibility(0);
                        return a;
                    default:
                        Context requireContext2 = stageDriverEventsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(requireContext2.getDrawable(R.drawable.race_start));
                        String string = requireContext2.getString(R.string.no_data_available);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        return graphicLarge;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.r = ypa.a(ysaVar, function0);
        final int i2 = 1;
        final int i3 = 2;
        this.s = new otk(duf.a.getOrCreateKotlinClass(h8i.class), new y4i(this, i), new y4i(this, i3), new y4i(this, i2));
        this.t = ypa.b(new Function0(this) { // from class: x4i
            public final /* synthetic */ StageDriverEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StageDriverEventsFragment stageDriverEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = stageDriverEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "STANDINGS_TYPE", j5i.class);
                        if (M != null) {
                            return (j5i) M;
                        }
                        a70.p("Serializable STANDINGS_TYPE not found");
                        return null;
                    case 1:
                        Context requireContext = stageDriverEventsFragment.requireContext();
                        requireContext.getClass();
                        return new s7i(requireContext);
                    case 2:
                        LayoutInflater layoutInflater = stageDriverEventsFragment.getLayoutInflater();
                        krk krkVar = stageDriverEventsFragment.l;
                        krkVar.getClass();
                        xhh a = xhh.a(layoutInflater, ((oo8) krkVar).d);
                        a.b.setVisibility(0);
                        return a;
                    default:
                        Context requireContext2 = stageDriverEventsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(requireContext2.getDrawable(R.drawable.race_start));
                        String string = requireContext2.getString(R.string.no_data_available);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        return graphicLarge;
                }
            }
        });
        this.u = ypa.b(new Function0(this) { // from class: x4i
            public final /* synthetic */ StageDriverEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StageDriverEventsFragment stageDriverEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = stageDriverEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "STANDINGS_TYPE", j5i.class);
                        if (M != null) {
                            return (j5i) M;
                        }
                        a70.p("Serializable STANDINGS_TYPE not found");
                        return null;
                    case 1:
                        Context requireContext = stageDriverEventsFragment.requireContext();
                        requireContext.getClass();
                        return new s7i(requireContext);
                    case 2:
                        LayoutInflater layoutInflater = stageDriverEventsFragment.getLayoutInflater();
                        krk krkVar = stageDriverEventsFragment.l;
                        krkVar.getClass();
                        xhh a = xhh.a(layoutInflater, ((oo8) krkVar).d);
                        a.b.setVisibility(0);
                        return a;
                    default:
                        Context requireContext2 = stageDriverEventsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(requireContext2.getDrawable(R.drawable.race_start));
                        String string = requireContext2.getString(R.string.no_data_available);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        return graphicLarge;
                }
            }
        });
        this.v = e.f(km5.a);
        this.w = e.f(null);
        final int i4 = 3;
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: x4i
            public final /* synthetic */ StageDriverEventsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                StageDriverEventsFragment stageDriverEventsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = stageDriverEventsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "STANDINGS_TYPE", j5i.class);
                        if (M != null) {
                            return (j5i) M;
                        }
                        a70.p("Serializable STANDINGS_TYPE not found");
                        return null;
                    case 1:
                        Context requireContext = stageDriverEventsFragment.requireContext();
                        requireContext.getClass();
                        return new s7i(requireContext);
                    case 2:
                        LayoutInflater layoutInflater = stageDriverEventsFragment.getLayoutInflater();
                        krk krkVar = stageDriverEventsFragment.l;
                        krkVar.getClass();
                        xhh a = xhh.a(layoutInflater, ((oo8) krkVar).d);
                        a.b.setVisibility(0);
                        return a;
                    default:
                        Context requireContext2 = stageDriverEventsFragment.requireContext();
                        requireContext2.getClass();
                        GraphicLarge graphicLarge = new GraphicLarge(requireContext2, null, 6);
                        graphicLarge.setLargeDrawableResource(requireContext2.getDrawable(R.drawable.race_start));
                        String string = requireContext2.getString(R.string.no_data_available);
                        string.getClass();
                        graphicLarge.setTitleResource(string);
                        return graphicLarge;
                }
            }
        });
    }

    public final s7i C() {
        return (s7i) this.t.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "RacesTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((oo8) krkVar).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 26);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((oo8) krkVar2).d.setAdapter(C());
        s7i C = C();
        pte pteVar = new pte(this, 25);
        C.getClass();
        C.a.d = pteVar;
        ((xhh) this.u.getValue()).c.setContent(new tc3(1409577490, new fvg(this, 25), true));
        otk otkVar = this.s;
        ((h8i) otkVar.getValue()).o.e(getViewLifecycleOwner(), new ioe(14, new w4i(this, 0)));
        krk krkVar3 = this.l;
        krkVar3.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar3).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        ((h8i) otkVar.getValue()).q.e(getViewLifecycleOwner(), new ioe(14, new w4i(this, 1)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        h8i h8iVar = (h8i) this.s.getValue();
        j5i j5iVar = (j5i) this.r.getValue();
        j5iVar.getClass();
        xw3.L(un0.z(h8iVar), null, null, new f54(h8iVar, j5iVar, null, 8), 3);
    }
}
