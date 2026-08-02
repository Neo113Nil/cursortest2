package com.sofascore.results.main.fantasy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ironsource.InterfaceC4060ee;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.main.fantasy.MainFantasyFragment;
import defpackage.ad2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.ce;
import defpackage.de;
import defpackage.duf;
import defpackage.e6b;
import defpackage.faa;
import defpackage.fdi;
import defpackage.fuf;
import defpackage.g9i;
import defpackage.h52;
import defpackage.hpb;
import defpackage.ipb;
import defpackage.joa;
import defpackage.o42;
import defpackage.otk;
import defpackage.qpb;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.spb;
import defpackage.sr8;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.un0;
import defpackage.vpb;
import defpackage.wca;
import defpackage.xd;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ypb;
import defpackage.ysa;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/main/fantasy/MainFantasyFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "", "shouldDraw", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MainFantasyFragment extends Hilt_MainFantasyFragment {
    public final otk r = new otk(duf.a.getOrCreateKotlinClass(ypb.class), new ipb(this, 0), new ipb(this, 2), new ipb(this, 1));
    public final joa s = ypa.a(ysa.c, new sr8(this, 28));
    public final de t;
    public final de u;
    public final de v;
    public final de w;

    public MainFantasyFragment() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        final int i4 = 3;
        de registerForActivityResult = registerForActivityResult(new ce(3), new xd(this) { // from class: dpb
            public final /* synthetic */ MainFantasyFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Intent intent;
                int i5 = i;
                rq3 rq3Var = null;
                MainFantasyFragment mainFantasyFragment = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i5) {
                    case 0:
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            ia0 ia0Var = ia0.q;
                            if (!ok3.p().e().getFantasyUser()) {
                                int i6 = FantasyOnboardingActivity.M;
                                Context requireContext = mainFantasyFragment.requireContext();
                                requireContext.getClass();
                                uic.x(requireContext, null, 6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        activityResult.getClass();
                        if (activityResult.a == 1) {
                            int i7 = l94.C;
                            Context requireContext2 = mainFantasyFragment.requireContext();
                            requireContext2.getClass();
                            krk krkVar = mainFantasyFragment.l;
                            krkVar.getClass();
                            CoordinatorLayout coordinatorLayout = ((yrh) krkVar).a;
                            coordinatorLayout.getClass();
                            String string = mainFantasyFragment.getString(R.string.error_message_title);
                            string.getClass();
                            wxf.x(requireContext2, coordinatorLayout, string, mainFantasyFragment.requireContext().getColor(R.color.on_color_primary), mainFantasyFragment.requireContext().getColor(R.color.error), null, 2000, null, InterfaceC4060ee.c.g).i();
                            break;
                        }
                        break;
                    case 2:
                        activityResult.getClass();
                        if (activityResult.a == 98) {
                            mainFantasyFragment.l();
                            Intent intent2 = activityResult.b;
                            if (intent2 != null) {
                                Serializable y = g7a.y(intent2, "competitionId", Integer.class);
                                if (y == null) {
                                    a70.p("Serializable competitionId not found");
                                    break;
                                } else {
                                    ypb.m(mainFantasyFragment.D(), new q13(((Number) y).intValue(), 29));
                                }
                            }
                            xw3.L(wca.x(mainFantasyFragment.getLifecycle()), null, null, new ppa(mainFantasyFragment, rq3Var, 7), 3);
                            break;
                        }
                        break;
                    default:
                        activityResult.getClass();
                        if (activityResult.a == 101 && (intent = activityResult.b) != null) {
                            Serializable y2 = g7a.y(intent, "userCompetition", do7.class);
                            if (y2 == null) {
                                a70.p("Serializable userCompetition not found");
                                break;
                            } else {
                                do7 do7Var = (do7) y2;
                                ypb D = mainFantasyFragment.D();
                                xw3.L(un0.z(D), null, null, new gjb(D, do7Var, rq3Var, 2), 3);
                                de deVar = mainFantasyFragment.v;
                                int i8 = FantasyCompetitionActivity.R;
                                Context requireContext3 = mainFantasyFragment.requireContext();
                                requireContext3.getClass();
                                deVar.a(mx9.t(requireContext3, do7Var, ip6.c), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        registerForActivityResult.getClass();
        this.t = registerForActivityResult;
        de registerForActivityResult2 = registerForActivityResult(new ce(4), new xd(this) { // from class: dpb
            public final /* synthetic */ MainFantasyFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Intent intent;
                int i5 = i2;
                rq3 rq3Var = null;
                MainFantasyFragment mainFantasyFragment = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i5) {
                    case 0:
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            ia0 ia0Var = ia0.q;
                            if (!ok3.p().e().getFantasyUser()) {
                                int i6 = FantasyOnboardingActivity.M;
                                Context requireContext = mainFantasyFragment.requireContext();
                                requireContext.getClass();
                                uic.x(requireContext, null, 6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        activityResult.getClass();
                        if (activityResult.a == 1) {
                            int i7 = l94.C;
                            Context requireContext2 = mainFantasyFragment.requireContext();
                            requireContext2.getClass();
                            krk krkVar = mainFantasyFragment.l;
                            krkVar.getClass();
                            CoordinatorLayout coordinatorLayout = ((yrh) krkVar).a;
                            coordinatorLayout.getClass();
                            String string = mainFantasyFragment.getString(R.string.error_message_title);
                            string.getClass();
                            wxf.x(requireContext2, coordinatorLayout, string, mainFantasyFragment.requireContext().getColor(R.color.on_color_primary), mainFantasyFragment.requireContext().getColor(R.color.error), null, 2000, null, InterfaceC4060ee.c.g).i();
                            break;
                        }
                        break;
                    case 2:
                        activityResult.getClass();
                        if (activityResult.a == 98) {
                            mainFantasyFragment.l();
                            Intent intent2 = activityResult.b;
                            if (intent2 != null) {
                                Serializable y = g7a.y(intent2, "competitionId", Integer.class);
                                if (y == null) {
                                    a70.p("Serializable competitionId not found");
                                    break;
                                } else {
                                    ypb.m(mainFantasyFragment.D(), new q13(((Number) y).intValue(), 29));
                                }
                            }
                            xw3.L(wca.x(mainFantasyFragment.getLifecycle()), null, null, new ppa(mainFantasyFragment, rq3Var, 7), 3);
                            break;
                        }
                        break;
                    default:
                        activityResult.getClass();
                        if (activityResult.a == 101 && (intent = activityResult.b) != null) {
                            Serializable y2 = g7a.y(intent, "userCompetition", do7.class);
                            if (y2 == null) {
                                a70.p("Serializable userCompetition not found");
                                break;
                            } else {
                                do7 do7Var = (do7) y2;
                                ypb D = mainFantasyFragment.D();
                                xw3.L(un0.z(D), null, null, new gjb(D, do7Var, rq3Var, 2), 3);
                                de deVar = mainFantasyFragment.v;
                                int i8 = FantasyCompetitionActivity.R;
                                Context requireContext3 = mainFantasyFragment.requireContext();
                                requireContext3.getClass();
                                deVar.a(mx9.t(requireContext3, do7Var, ip6.c), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.u = registerForActivityResult2;
        de registerForActivityResult3 = registerForActivityResult(new ce(3), new xd(this) { // from class: dpb
            public final /* synthetic */ MainFantasyFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Intent intent;
                int i5 = i3;
                rq3 rq3Var = null;
                MainFantasyFragment mainFantasyFragment = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i5) {
                    case 0:
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            ia0 ia0Var = ia0.q;
                            if (!ok3.p().e().getFantasyUser()) {
                                int i6 = FantasyOnboardingActivity.M;
                                Context requireContext = mainFantasyFragment.requireContext();
                                requireContext.getClass();
                                uic.x(requireContext, null, 6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        activityResult.getClass();
                        if (activityResult.a == 1) {
                            int i7 = l94.C;
                            Context requireContext2 = mainFantasyFragment.requireContext();
                            requireContext2.getClass();
                            krk krkVar = mainFantasyFragment.l;
                            krkVar.getClass();
                            CoordinatorLayout coordinatorLayout = ((yrh) krkVar).a;
                            coordinatorLayout.getClass();
                            String string = mainFantasyFragment.getString(R.string.error_message_title);
                            string.getClass();
                            wxf.x(requireContext2, coordinatorLayout, string, mainFantasyFragment.requireContext().getColor(R.color.on_color_primary), mainFantasyFragment.requireContext().getColor(R.color.error), null, 2000, null, InterfaceC4060ee.c.g).i();
                            break;
                        }
                        break;
                    case 2:
                        activityResult.getClass();
                        if (activityResult.a == 98) {
                            mainFantasyFragment.l();
                            Intent intent2 = activityResult.b;
                            if (intent2 != null) {
                                Serializable y = g7a.y(intent2, "competitionId", Integer.class);
                                if (y == null) {
                                    a70.p("Serializable competitionId not found");
                                    break;
                                } else {
                                    ypb.m(mainFantasyFragment.D(), new q13(((Number) y).intValue(), 29));
                                }
                            }
                            xw3.L(wca.x(mainFantasyFragment.getLifecycle()), null, null, new ppa(mainFantasyFragment, rq3Var, 7), 3);
                            break;
                        }
                        break;
                    default:
                        activityResult.getClass();
                        if (activityResult.a == 101 && (intent = activityResult.b) != null) {
                            Serializable y2 = g7a.y(intent, "userCompetition", do7.class);
                            if (y2 == null) {
                                a70.p("Serializable userCompetition not found");
                                break;
                            } else {
                                do7 do7Var = (do7) y2;
                                ypb D = mainFantasyFragment.D();
                                xw3.L(un0.z(D), null, null, new gjb(D, do7Var, rq3Var, 2), 3);
                                de deVar = mainFantasyFragment.v;
                                int i8 = FantasyCompetitionActivity.R;
                                Context requireContext3 = mainFantasyFragment.requireContext();
                                requireContext3.getClass();
                                deVar.a(mx9.t(requireContext3, do7Var, ip6.c), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        registerForActivityResult3.getClass();
        this.v = registerForActivityResult3;
        de registerForActivityResult4 = registerForActivityResult(new ce(3), new xd(this) { // from class: dpb
            public final /* synthetic */ MainFantasyFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Intent intent;
                int i5 = i4;
                rq3 rq3Var = null;
                MainFantasyFragment mainFantasyFragment = this.b;
                ActivityResult activityResult = (ActivityResult) obj;
                switch (i5) {
                    case 0:
                        activityResult.getClass();
                        if (activityResult.a == -1) {
                            ia0 ia0Var = ia0.q;
                            if (!ok3.p().e().getFantasyUser()) {
                                int i6 = FantasyOnboardingActivity.M;
                                Context requireContext = mainFantasyFragment.requireContext();
                                requireContext.getClass();
                                uic.x(requireContext, null, 6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        activityResult.getClass();
                        if (activityResult.a == 1) {
                            int i7 = l94.C;
                            Context requireContext2 = mainFantasyFragment.requireContext();
                            requireContext2.getClass();
                            krk krkVar = mainFantasyFragment.l;
                            krkVar.getClass();
                            CoordinatorLayout coordinatorLayout = ((yrh) krkVar).a;
                            coordinatorLayout.getClass();
                            String string = mainFantasyFragment.getString(R.string.error_message_title);
                            string.getClass();
                            wxf.x(requireContext2, coordinatorLayout, string, mainFantasyFragment.requireContext().getColor(R.color.on_color_primary), mainFantasyFragment.requireContext().getColor(R.color.error), null, 2000, null, InterfaceC4060ee.c.g).i();
                            break;
                        }
                        break;
                    case 2:
                        activityResult.getClass();
                        if (activityResult.a == 98) {
                            mainFantasyFragment.l();
                            Intent intent2 = activityResult.b;
                            if (intent2 != null) {
                                Serializable y = g7a.y(intent2, "competitionId", Integer.class);
                                if (y == null) {
                                    a70.p("Serializable competitionId not found");
                                    break;
                                } else {
                                    ypb.m(mainFantasyFragment.D(), new q13(((Number) y).intValue(), 29));
                                }
                            }
                            xw3.L(wca.x(mainFantasyFragment.getLifecycle()), null, null, new ppa(mainFantasyFragment, rq3Var, 7), 3);
                            break;
                        }
                        break;
                    default:
                        activityResult.getClass();
                        if (activityResult.a == 101 && (intent = activityResult.b) != null) {
                            Serializable y2 = g7a.y(intent, "userCompetition", do7.class);
                            if (y2 == null) {
                                a70.p("Serializable userCompetition not found");
                                break;
                            } else {
                                do7 do7Var = (do7) y2;
                                ypb D = mainFantasyFragment.D();
                                xw3.L(un0.z(D), null, null, new gjb(D, do7Var, rq3Var, 2), 3);
                                de deVar = mainFantasyFragment.v;
                                int i8 = FantasyCompetitionActivity.R;
                                Context requireContext3 = mainFantasyFragment.requireContext();
                                requireContext3.getClass();
                                deVar.a(mx9.t(requireContext3, do7Var, ip6.c), null);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        registerForActivityResult4.getClass();
        this.w = registerForActivityResult4;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(187840808, new faa(this, 19), true);
    }

    public final ypb D() {
        return (ypb) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        e6b e6bVar = e6b.a;
        ad2 ad2Var = qv5.a;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(h52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new hpb(viewLifecycleOwner, (b1d) obj, this, null, this, 0), 3);
        u6b viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(o42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(viewLifecycleOwner2.getLifecycle()), null, null, new hpb(viewLifecycleOwner2, (b1d) obj2, this, null, this, 1), 3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return D().j.a.getValue() instanceof spb ? "FantasyWelcomeTab" : "FantasyCenterTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        Object value;
        if (!((Boolean) D().n.a.getValue()).booleanValue()) {
            fdi fdiVar = D().m;
            do {
                value = fdiVar.getValue();
                ((Boolean) value).getClass();
            } while (!fdiVar.k(value, Boolean.TRUE));
        }
        if (D().j.a.getValue() instanceof qpb) {
            ypb D = D();
            g9i g9iVar = D.r;
            rq3 rq3Var = null;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            D.r = xw3.L(un0.z(D), null, null, new vpb(D, rq3Var, 1), 3);
        }
    }
}
