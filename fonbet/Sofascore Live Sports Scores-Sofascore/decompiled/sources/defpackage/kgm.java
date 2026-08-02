package defpackage;

import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.models.F;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.g0;
import com.blaze.blazesdk.shared.results.w;
import com.blaze.blazesdk.shared.results.x;
import defpackage.stl;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kgm extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgm(String str, String str2, Function1 function1, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = str;
        this.t = str2;
        this.u = function1;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new kgm(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((kgm) create((rq3) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x02a6, code lost:
    
        if (defpackage.evl.b(r6, r0, r26) == r2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0029, code lost:
    
        if (r0.a(r26) == r2) goto L91;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object xVar;
        List list;
        Object dVar;
        List split$default;
        wul wulVar;
        wul wulVar2;
        wul wulVar3;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            bwm bwmVar = bwm.a;
            this.r = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        String str = this.s;
        str.getClass();
        tul tulVar = jdm.d;
        q5m q5mVar = tulVar != null ? tulVar.d : null;
        if (q5mVar == null || (list = q5mVar.e) == null) {
            xVar = new x();
        } else {
            try {
                if (!new Regex(String.format("(%s)?([(w|W)]{3}+\\.)?+(.)+\\.+[A-Za-z]{2,63}+(\\.)?+(/(.)*)?", Arrays.copyOf(new Object[]{CollectionsKt.f0(list, "|", null, "://", null, 58)}, 1))).f(str)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                String a = m1m.a(str);
                if (a != null) {
                    tul tulVar2 = jdm.d;
                    q5m q5mVar2 = tulVar2 != null ? tulVar2.d : null;
                    String str2 = (q5mVar2 == null || (wulVar3 = q5mVar2.b) == null) ? null : wulVar3.b;
                    q5m q5mVar3 = tulVar2 != null ? tulVar2.d : null;
                    String str3 = (q5mVar3 == null || (wulVar2 = q5mVar3.b) == null) ? null : wulVar2.a;
                    q5m q5mVar4 = tulVar2 != null ? tulVar2.d : null;
                    String str4 = (q5mVar4 == null || (wulVar = q5mVar4.b) == null) ? null : wulVar.c;
                    if (StringsKt.J(str, "/" + str3 + '/', false)) {
                        String V = StringsKt.V(str, a + str3 + '/');
                        if (StringsKt.J(V, "/", false)) {
                            split$default = StringsKt__StringsKt.split$default(V, new String[]{"/"}, false, 0, 6, null);
                            dVar = new stl.c((String) split$default.get(0), (String) split$default.get(1));
                        } else {
                            dVar = new stl.b(V);
                        }
                    } else {
                        if (StringsKt.J(str, "/" + str2 + '/', false)) {
                            dVar = new stl.a(StringsKt.V(str, a + str2 + '/'));
                        } else {
                            if (StringsKt.J(str, "/" + str4 + '/', false)) {
                                dVar = new stl.d(StringsKt.V(str, a + str4 + '/'));
                            } else {
                                xVar = new x();
                            }
                        }
                    }
                    xVar = new ihm(dVar);
                } else {
                    xVar = new w();
                }
            } catch (Exception e) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
                xVar = new x();
            }
        }
        boolean z = xVar instanceof ihm;
        Function1 function1 = this.u;
        if (z) {
            stl stlVar = (stl) ((ihm) xVar).a;
            boolean z2 = stlVar instanceof stl.c;
            String str5 = this.t;
            if (z2) {
                stl.c cVar = (stl.c) stlVar;
                bxm.fetchAndPlayStory$blazesdk_release$default(bxm.a, cVar.a, cVar.b, null, null, true, new B(F.DEEPLINK, null, null, null, null, null, 62, null), "playStory failed", str5, new fuj(24, function1), 12, null);
            } else if (stlVar instanceof stl.b) {
                bxm.fetchAndPlayStory$blazesdk_release$default(bxm.a, ((stl.b) stlVar).a, null, null, null, true, new B(F.DEEPLINK, null, null, null, null, null, 62, null), "playPageStory failed", str5, new fuj(25, function1), 14, null);
            } else if (stlVar instanceof stl.a) {
                rsm.fetchAndPlayMoment$default(rsm.a, ((stl.a) stlVar).a, null, null, "playMoment failed", new B(F.DEEPLINK, null, null, null, null, null, 62, null), true, str5, new fuj(26, function1), 6, null);
            } else {
                if (!(stlVar instanceof stl.d)) {
                    zzl.b();
                    return null;
                }
                n0n n0nVar = n0n.a;
                String str6 = ((stl.d) stlVar).a;
                B b = new B(F.DEEPLINK, null, null, null, null, null, 62, null);
                BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration = n0n.c;
                blazeVideosPlaybackConfiguration.getClass();
                n0n.fetchAndPlayVideo$default(n0nVar, str6, null, "playVideo failed", b, true, str5, new i(blazeVideosPlaybackConfiguration.getMultiAspectRatio(), blazeVideosPlaybackConfiguration.getShouldOpenOnLandscape(), blazeVideosPlaybackConfiguration.getPip()), new fuj(27, function1), 2, null);
            }
        }
        if (xVar instanceof g0) {
            g0 g0Var = (g0) xVar;
            j1m.a(g0Var);
            BlazeResult.Error d = g0Var.d();
            this.r = 2;
        }
        return Unit.a;
    }
}
