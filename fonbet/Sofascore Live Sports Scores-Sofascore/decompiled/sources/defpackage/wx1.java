package defpackage;

import com.blaze.blazesdk.features.moments.container.tabs.compose.BlazeMomentsPlayerContainerTabsComposeKt;
import com.blaze.blazesdk.features.moments.container.tabs.compose.BlazeMomentsPlayerContainerTabsComposeStateHandler;
import com.blaze.blazesdk.features.videos.inline.compose.BlazeVideosInlinePlayerComposeKt;
import com.blaze.blazesdk.features.videos.inline.compose.BlazeVideosInlinePlayerComposeStateHandler;
import com.facebook.appevents.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.PlayerOrTeam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wx1 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wx1(int i, int i2, gv9 gv9Var, Function1 function1) {
        this.a = 9;
        this.b = gv9Var;
        this.c = i;
        this.e = function1;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                BlazeMomentsPlayerContainerTabsComposeKt.BlazeMomentsPlayerContainerTabsCompose((xtc) obj3, (BlazeMomentsPlayerContainerTabsComposeStateHandler) obj4, (of3) obj, aba.K(i3 | 1), i2);
                break;
            case 1:
                ((Integer) obj2).intValue();
                BlazeVideosInlinePlayerComposeKt.BlazeVideosInlinePlayerCompose((xtc) obj3, (BlazeVideosInlinePlayerComposeStateHandler) obj4, (of3) obj, aba.K(i3 | 1), i2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ml4.j((Double) obj4, (xtc) obj3, (of3) obj, aba.K(i3 | 1), i2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ww9.b(i3, (w75) obj4, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                o6a.d((xtc) obj3, (p4b) obj4, (of3) obj, aba.K(i3 | 1), i2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                b9b.g((t9b) obj4, (xtc) obj3, (of3) obj, aba.K(i3 | 1), i2);
                break;
            case 6:
                ((Integer) obj2).getClass();
                jgb.c((xtc) obj3, (n7g) obj4, (of3) obj, aba.K(i3 | 1), i2);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int K = aba.K(1);
                o3a.d(this.c, (Boolean) obj4, (xtc) obj3, (of3) obj, K, this.d);
                break;
            case 8:
                ((Integer) obj2).getClass();
                hda.d((ale) obj4, (xtc) obj3, i3, (of3) obj, aba.K(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                int K2 = aba.K(i2 | 1);
                aik.i(i3, K2, (of3) obj, (gv9) obj3, (Function1) obj4);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int K3 = aba.K(1);
                c6o.o(this.c, (PlayerOrTeam) obj4, (xtc) obj3, (of3) obj, K3, this.d);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int K4 = aba.K(1);
                rfo.i(this.c, (Team) obj4, (xtc) obj3, (of3) obj, K4, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                j.l((q) obj4, (xtc) obj3, (of3) obj, i3 | 1, i2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ wx1(int i, w75 w75Var, xtc xtcVar, int i2) {
        this.a = 3;
        this.c = i;
        this.e = w75Var;
        this.b = xtcVar;
        this.d = i2;
    }

    public /* synthetic */ wx1(int i, Object obj, xtc xtcVar, int i2, int i3, int i4) {
        this.a = i4;
        this.c = i;
        this.e = obj;
        this.b = xtcVar;
        this.d = i3;
    }

    public /* synthetic */ wx1(xtc xtcVar, Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.b = xtcVar;
        this.e = obj;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ wx1(Object obj, xtc xtcVar, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = xtcVar;
        this.c = i;
        this.d = i2;
    }
}
