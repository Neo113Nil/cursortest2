package defpackage;

import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.blaze.blazesdk.features.stories.widgets.compose.grid.BlazeComposeStoriesWidgetGridViewKt;
import com.blaze.blazesdk.features.videos.widgets.compose.BlazeComposeWidgetVideosStateHandler;
import com.blaze.blazesdk.features.videos.widgets.compose.grid.BlazeComposeVideosWidgetGridViewKt;
import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.sofascore.model.profile.InvitedUser;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lj(int i, old oldVar, xtc xtcVar, int i2) {
        this.a = 0;
        vmd vmdVar = vmd.EVENT_DETAILS;
        this.b = i;
        this.c = oldVar;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                vmd vmdVar = vmd.EVENT_DETAILS;
                ((Integer) obj2).getClass();
                gz8.l(i2, (old) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                t80.a((q80) obj4, (List) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                td4.c((sm1) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                BlazeComposeStoriesWidgetGridViewKt.BlazeComposeStoriesWidgetGridView((xtc) obj3, (BlazeComposeWidgetStoriesStateHandler) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                BlazeComposeVideosWidgetGridViewKt.BlazeComposeVideosWidgetGridView((xtc) obj3, (BlazeComposeWidgetVideosStateHandler) obj4, (of3) obj, aba.K(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                lz.d(aba.K(i2 | 1), (of3) obj, (xtc) obj3, (Function1) obj4);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ml4.u((e83) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ml4.t((d83) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ml4.z((g83) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ml4.d((a83) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ml4.v((f83) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ml4.B((h83) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                tol.c((gb0[]) obj4, (Function2) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                tol.b((gb0) obj4, (Function2) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                pco.n((g38) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 15:
                Function0 function0 = (Function0) obj4;
                e1d e1dVar = (e1d) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    xtc r = m6k.r(utc.a, "LoginModal", new su(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null, Integer.valueOf(i2)));
                    boolean g = av8Var.g(function0);
                    Object O = av8Var.O();
                    if (g || O == nf3.a) {
                        O = new u54(0, e1dVar, function0);
                        av8Var.n0(O);
                    }
                    fcp.K(0, av8Var, r, (Function0) O);
                } else {
                    av8Var.W();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                hkg.f((CrowdsourcingContribution) obj4, (xtc) obj3, (of3) obj, aba.K(1), i2);
                break;
            case 17:
                ((Integer) obj2).getClass();
                o02.A((eci) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                oj4.l((ci4) obj4, (kg2) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                c5n.d((FantasyRemoteAnnouncement) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                fz8.o((qp9) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                td4.n(i2, (xtc) obj3, (mv1) obj4, (of3) obj, aba.K(433));
                break;
            case 22:
                ((Integer) obj2).getClass();
                waa.h((InvitedUser) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                waa.d((InvitedUser) obj4, i2, (Function0) obj3, (of3) obj, aba.K(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((zoa) obj4).a(i2, obj3, (of3) obj, aba.K(1));
                break;
            case 25:
                uqa uqaVar = (uqa) obj4;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    uqaVar.a(i2, obj3, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                ((sra) obj4).a(i2, obj3, (of3) obj, aba.K(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                w3a.i(i2, (jrj) obj4, (xtc) obj3, (of3) obj, aba.K(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                u6h.q((e9i) obj4, (v8b) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                u6h.r((v23) obj4, (v8b) obj3, (of3) obj, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lj(int i, uqa uqaVar, Object obj) {
        this.a = 25;
        this.c = uqaVar;
        this.b = i;
        this.d = obj;
    }

    public /* synthetic */ lj(int i, xtc xtcVar, mv1 mv1Var, int i2) {
        this.a = 21;
        this.b = i;
        this.d = xtcVar;
        this.c = mv1Var;
    }

    public /* synthetic */ lj(int i, e1d e1dVar, Function0 function0) {
        this.a = 15;
        this.b = i;
        this.c = function0;
        this.d = e1dVar;
    }

    public /* synthetic */ lj(int i, int i2, int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ lj(int i, jrj jrjVar, xtc xtcVar, int i2) {
        this.a = 27;
        this.b = i;
        this.c = jrjVar;
        this.d = xtcVar;
    }

    public /* synthetic */ lj(xtc xtcVar, Object obj, int i, int i2) {
        this.a = i2;
        this.d = xtcVar;
        this.c = obj;
        this.b = i;
    }

    public /* synthetic */ lj(CrowdsourcingContribution crowdsourcingContribution, xtc xtcVar, int i, int i2) {
        this.a = 16;
        this.c = crowdsourcingContribution;
        this.d = xtcVar;
        this.b = i2;
    }

    public /* synthetic */ lj(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
