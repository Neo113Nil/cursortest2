package defpackage;

import com.blaze.blazesdk.features.moments.widgets.compose.BlazeComposeWidgetMomentsStateHandler;
import com.blaze.blazesdk.features.moments.widgets.compose.row.BlazeComposeMomentsWidgetRowViewKt;
import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.blaze.blazesdk.features.stories.widgets.compose.row.BlazeComposeStoriesWidgetRowViewKt;
import com.blaze.blazesdk.features.videos.widgets.compose.BlazeComposeWidgetVideosStateHandler;
import com.blaze.blazesdk.features.videos.widgets.compose.row.BlazeComposeVideosWidgetRowViewKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerOrTeam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class x80 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x80(int i, v75 v75Var, boolean z, xtc xtcVar, int i2) {
        this.a = 5;
        this.c = i;
        this.e = v75Var;
        this.b = z;
        this.f = xtcVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i3 | 1);
                ao2.a((y80) obj4, (a6e) obj3, this.b, (of3) obj, K, this.d);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int K2 = aba.K(i3 | 1);
                BlazeComposeMomentsWidgetRowViewKt.BlazeComposeMomentsWidgetRowView((xtc) obj4, (BlazeComposeWidgetMomentsStateHandler) obj3, this.b, (of3) obj, K2, this.d);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int K3 = aba.K(i3 | 1);
                BlazeComposeStoriesWidgetRowViewKt.BlazeComposeStoriesWidgetRowView((xtc) obj4, (BlazeComposeWidgetStoriesStateHandler) obj3, this.b, (of3) obj, K3, this.d);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int K4 = aba.K(i3 | 1);
                BlazeComposeVideosWidgetRowViewKt.BlazeComposeVideosWidgetRowView((xtc) obj4, (BlazeComposeWidgetVideosStateHandler) obj3, this.b, (of3) obj, K4, this.d);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int K5 = aba.K(i3 | 1);
                ml4.n((b94) obj4, (a6e) obj3, this.b, (of3) obj, K5, this.d);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int K6 = aba.K(i2 | 1);
                rz8.h(this.c, (v75) obj4, this.b, (xtc) obj3, (of3) obj, K6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int K7 = aba.K(i2 | 1);
                td4.q((Integer) obj4, this.c, this.b, (xtc) obj3, (of3) obj, K7);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int K8 = aba.K(1);
                aik.c((cn2) obj4, this.b, this.c, this.d, (Function0) obj3, utc.a, (of3) obj, K8);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int K9 = aba.K(i3 | 1);
                t62.m(this.b, (xtc) obj4, (tc3) obj3, (of3) obj, K9, this.d);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int K10 = aba.K(i3 | 1);
                int i4 = this.d;
                mha.i(K10, i4, (of3) obj, (Function0) obj4, (Function0) obj3, this.b);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int K11 = aba.K(1);
                c6o.p(this.c, (PlayerOrTeam) obj4, this.b, (xtc) obj3, (of3) obj, K11, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int K12 = aba.K(1);
                rfo.j(this.c, (Team) obj4, this.b, (xtc) obj3, (of3) obj, K12, this.d);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x80(int i, int i2, int i3, Object obj, Object obj2, boolean z) {
        this.a = i3;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ x80(int i, Object obj, boolean z, xtc xtcVar, int i2, int i3, int i4) {
        this.a = i4;
        this.c = i;
        this.e = obj;
        this.b = z;
        this.f = xtcVar;
        this.d = i3;
    }

    public /* synthetic */ x80(cn2 cn2Var, boolean z, int i, int i2, Function0 function0, int i3) {
        this.a = 7;
        this.e = cn2Var;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.f = function0;
    }

    public /* synthetic */ x80(Integer num, int i, boolean z, xtc xtcVar, int i2) {
        this.a = 6;
        this.e = num;
        this.c = i;
        this.b = z;
        this.f = xtcVar;
        this.d = i2;
    }

    public /* synthetic */ x80(boolean z, Object obj, dt8 dt8Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.e = obj;
        this.f = dt8Var;
        this.c = i;
        this.d = i2;
    }
}
