package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.database.MediaReactionType;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import com.sofascore.results.country.CountryListBottomSheet;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.feed.MediaShortsVideoDialog;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.media.highlights.MediaHighlightsActivity;
import com.sofascore.results.media.news.TopNewsActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.settings.SettingsActivity;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.venue.VenueActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class cy7 {
    /* JADX WARN: Removed duplicated region for block: B:107:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x048c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(osa osaVar, final koh kohVar, final dy7 dy7Var, final ct8 ct8Var, final tc3 tc3Var, of3 of3Var, int i) {
        av8 av8Var;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ghf ghfVar;
        boolean z;
        Object k50Var;
        int i7;
        u6b u6bVar;
        ksa ksaVar;
        h9d h9dVar;
        osa osaVar2;
        boolean z2;
        boolean i8;
        Object O;
        xtc xtcVar;
        boolean z3;
        n12 n12Var;
        utc utcVar;
        ng0 ng0Var;
        tc3 tc3Var2;
        osaVar.getClass();
        kohVar.getClass();
        dy7Var.getClass();
        ct8Var.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2053805294);
        int i9 = i | (av8Var2.i(osaVar) ? 4 : 2) | (av8Var2.g(kohVar) ? 32 : 16) | (av8Var2.g(dy7Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(ct8Var) ? 2048 : 1024);
        if (av8Var2.T(i9 & 1, (i9 & 9363) != 9362)) {
            ksa a = msa.a(0, 0, av8Var2, 0, 3);
            boolean c = Intrinsics.c(osaVar.d().a, ofb.b);
            int i10 = i9 & 7168;
            boolean z4 = i10 == 2048;
            Object O2 = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z4 || O2 == a99Var) {
                O2 = new xx7(ct8Var, 0);
                av8Var2.n0(O2);
            }
            Function0 function0 = (Function0) O2;
            if (p75.a(52.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= 0) {
                a70.p("The refresh trigger must be greater than zero!");
                return;
            }
            Object O3 = av8Var2.O();
            if (O3 == a99Var) {
                O3 = hz8.G(g.a, av8Var2);
                av8Var2.n0(O3);
            }
            ku3 ku3Var = (ku3) O3;
            e1d g = e.g(function0, av8Var2);
            csf csfVar = new csf();
            csf csfVar2 = new csf();
            kx4 kx4Var = (kx4) av8Var2.k(dh3.h);
            csfVar.a = kx4Var.H0(52.0f);
            csfVar2.a = kx4Var.H0(56.0f);
            boolean g2 = av8Var2.g(ku3Var);
            Object O4 = av8Var2.O();
            if (g2 || O4 == a99Var) {
                O4 = new ghf(ku3Var, g, csfVar2.a, csfVar.a);
                av8Var2.n0(O4);
            }
            ghf ghfVar2 = (ghf) O4;
            boolean i11 = av8Var2.i(ghfVar2) | av8Var2.d(csfVar.a) | av8Var2.d(csfVar2.a);
            Object O5 = av8Var2.O();
            if (i11 || O5 == a99Var) {
                O5 = new l97(25, ghfVar2, csfVar, csfVar2);
                av8Var2.n0(O5);
            }
            hz8.t((Function0) O5, av8Var2);
            final h4d D = d2a.D(l6g.L(new Pair("page", "feed")), av8Var2, 6);
            final e1d x = rfo.x(D.e, av8Var2, 0);
            int c2 = osaVar.c();
            if (c2 == 0) {
                i6 = 0;
            } else {
                ia0 ia0Var = ia0.q;
                if (!mz1.C() || c2 <= 7) {
                    i2 = 1;
                    i3 = 0;
                } else {
                    i2 = 1;
                    i3 = wt3.f(c2, 7, 10, 1);
                }
                int i12 = i3 + c2;
                if (!mz1.C() || i12 <= 7) {
                    i4 = c2;
                    i5 = 0;
                } else {
                    i4 = c2;
                    i5 = wt3.f(i12, 7, 10, i2);
                }
                i6 = i5 + i4;
            }
            float u = hkg.u(32.0f, av8Var2, 0);
            k6c k6cVar = dy7Var.f;
            boolean g3 = av8Var2.g(a);
            Object O6 = av8Var2.O();
            if (g3 || O6 == a99Var) {
                ghfVar = ghfVar2;
                O6 = new ck1(8, null, a);
                av8Var2.n0(O6);
            } else {
                ghfVar = ghfVar2;
            }
            hz8.o(av8Var2, k6cVar, (Function2) O6);
            Object O7 = av8Var2.O();
            if (O7 == a99Var) {
                O7 = hz8.G(g.a, av8Var2);
                av8Var2.n0(O7);
            }
            ku3 ku3Var2 = (ku3) O7;
            u6b u6bVar2 = (u6b) av8Var2.k(mhb.a);
            boolean i13 = av8Var2.i(u6bVar2) | av8Var2.i(ku3Var2) | av8Var2.g(a);
            Object O8 = av8Var2.O();
            if (i13 || O8 == a99Var) {
                z = c;
                i7 = i10;
                u6bVar = u6bVar2;
                k50Var = new k50(u6bVar, ku3Var2, a, null, 9);
                ksaVar = a;
                h9dVar = null;
                av8Var2.n0(k50Var);
            } else {
                k50Var = O8;
                z = c;
                ksaVar = a;
                i7 = i10;
                h9dVar = null;
                u6bVar = u6bVar2;
            }
            hz8.o(av8Var2, u6bVar, (Function2) k50Var);
            ghf ghfVar3 = ghfVar;
            xtc J = lz.J(bkh.c, new ehf(new chf(1, ghfVar, ghf.class, "onPull", "onPull$material(F)F", 0, 0), new sc3(2, ghfVar, ghf.class, "onRelease", "onRelease$material(F)F", 4, 1)), h9dVar);
            mv1 mv1Var = uxf.c;
            k1c c3 = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, J);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c3, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            Object O9 = av8Var2.O();
            if (O9 == a99Var) {
                O9 = new wla();
                av8Var2.n0(O9);
            }
            final wla wlaVar = (wla) O9;
            long D2 = lz.D(R.color.surface_0, av8Var2);
            Object O10 = av8Var2.O();
            if (O10 == a99Var) {
                O10 = e.c(48);
                av8Var2.n0(O10);
            }
            znh znhVar = (znh) O10;
            final Context context = (Context) av8Var2.k(nz.b);
            boolean z5 = dy7Var.e;
            utc utcVar2 = utc.a;
            n12 n12Var2 = n12.a;
            if (z5) {
                av8Var2.d0(-343916010);
                wx7.b(0, av8Var2, l98.f0(n12Var2.a(utcVar2, uxf.g), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, u, 7));
                av8Var2.s(false);
                utcVar = utcVar2;
                av8Var = av8Var2;
                n12Var = n12Var2;
            } else {
                av8Var2.d0(-343402030);
                final int i14 = i6;
                final boolean z6 = z;
                xtc p = n9e.p(bkh.d(n12Var2.a(mha.G(utcVar2, 1.0f), mv1Var), 1.0f), wxf.D(new Pair[]{new Pair(Float.valueOf(0.65f), new r13(D2)), new Pair(Float.valueOf(1.0f), new r13(r13.h))}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.POSITIVE_INFINITY), null, 6);
                boolean i15 = av8Var2.i(context);
                Object O11 = av8Var2.O();
                if (i15 || O11 == a99Var) {
                    O11 = new w47(23, (Object) context, (Object) znhVar);
                    av8Var2.n0(O11);
                }
                xtc A = un0.A(p, (Function1) O11);
                av8Var2.d0(958761874);
                gv9<k6c> gv9Var = dy7Var.g;
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                for (k6c k6cVar2 : gv9Var) {
                    String name = k6cVar2.name();
                    String v = oea.v(k6cVar2.a, av8Var2);
                    k6c k6cVar3 = k6c.f;
                    if (k6cVar2 == k6cVar3) {
                        av8Var2.d0(1258317718);
                        tc3 H = yqo.H(-1088569082, av8Var2, new g31(dy7Var, 3));
                        av8Var2.s(false);
                        tc3Var2 = H;
                    } else {
                        av8Var2.d0(1258437006);
                        av8Var2.s(false);
                        tc3Var2 = null;
                    }
                    arrayList.add(new vt2(name, v, false, tc3Var2, (k6cVar2 == k6cVar3 && Intrinsics.c(k6cVar2.name(), k6cVar.name())) ? od3.a : null, jrh.m, null, 196));
                }
                av8Var2.s(false);
                gv9 W = l6g.W(arrayList);
                String name2 = k6cVar.name();
                boolean z7 = i7 == 2048;
                Object O12 = av8Var2.O();
                if (z7 || O12 == a99Var) {
                    O12 = new yx7(ct8Var, 0);
                    av8Var2.n0(O12);
                }
                int i16 = i7;
                trh.a(W, name2, (Function1) O12, A, null, null, null, false, false, true, null, null, av8Var2, 805306368, 3568);
                Object O13 = av8Var2.O();
                if (O13 == a99Var) {
                    O13 = new ArrayList();
                    av8Var2.n0(O13);
                }
                final List list = (List) O13;
                xtc s = b6a.s(n12Var2.b(utcVar2), wlaVar);
                boolean z8 = !z6;
                ng0 ng0Var2 = new ng0(8.0f, true, new a70(6));
                t3e C2 = l98.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, znhVar.h(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, u, 5);
                boolean h = av8Var2.h(z6) | ((i9 & 896) == 256);
                if ((i9 & 14) != 4) {
                    osaVar2 = osaVar;
                    if (!av8Var2.i(osaVar2)) {
                        z2 = false;
                        i8 = h | z2 | av8Var2.i(wlaVar) | av8Var2.i(list) | av8Var2.i(context) | (i16 != 2048) | av8Var2.e(i14) | av8Var2.g(x) | av8Var2.g(D) | ((i9 & 112) != 32);
                        O = av8Var2.O();
                        if (!i8 || O == a99Var) {
                            final osa osaVar3 = osaVar2;
                            xtcVar = s;
                            z3 = z8;
                            n12Var = n12Var2;
                            utcVar = utcVar2;
                            ng0Var = ng0Var2;
                            Function1 function1 = new Function1() { // from class: zx7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    osa osaVar4;
                                    esa esaVar = (esa) obj;
                                    esaVar.getClass();
                                    esa.d(esaVar, null, null, new tc3(-373080305, new cv5(z6, 2), true), 3);
                                    dy7 dy7Var2 = dy7.this;
                                    k6c k6cVar4 = dy7Var2.f;
                                    k6c k6cVar5 = k6c.d;
                                    tc3 tc3Var3 = tc3Var;
                                    if (k6cVar4 == k6cVar5 && dy7Var2.b) {
                                        esa.d(esaVar, null, null, new tc3(143273300, new ay7(tc3Var3, 0), true), 3);
                                    }
                                    osa osaVar5 = osaVar3;
                                    if ((osaVar5.d().a instanceof pfb) && (osaVar5.d().c instanceof pfb) && (osaVar5.d().b instanceof pfb) && osaVar5.c() == 0) {
                                        esa.d(esaVar, null, null, new tc3(1057241341, new qm4(23, dy7Var2, tc3Var3), true), 3);
                                        osaVar4 = osaVar5;
                                    } else {
                                        wla wlaVar2 = wlaVar;
                                        List list2 = list;
                                        Context context2 = context;
                                        ct8 ct8Var2 = ct8Var;
                                        esa.d(esaVar, null, null, new tc3(-990905900, new ff7(dy7Var2, wlaVar2, list2, context2, ct8Var2, 11), true), 3);
                                        osaVar4 = osaVar5;
                                        esaVar.a(i14, new x83(osaVar5, 1), new gl7(10), new tc3(-1989586773, new dl1(D, osaVar4, x, kohVar, wlaVar2, ct8Var2), true));
                                    }
                                    if (Intrinsics.c(osaVar4.d().c, ofb.b)) {
                                        esa.d(esaVar, null, null, od3.c, 3);
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var2.n0(function1);
                            O = function1;
                        } else {
                            xtcVar = s;
                            z3 = z8;
                            n12Var = n12Var2;
                            utcVar = utcVar2;
                            ng0Var = ng0Var2;
                        }
                        av8Var = av8Var2;
                        v8a.a(xtcVar, ksaVar, C2, ng0Var, null, null, z3, null, (Function1) O, av8Var, 100687872, 104);
                        av8Var.s(false);
                    }
                } else {
                    osaVar2 = osaVar;
                }
                z2 = true;
                i8 = h | z2 | av8Var2.i(wlaVar) | av8Var2.i(list) | av8Var2.i(context) | (i16 != 2048) | av8Var2.e(i14) | av8Var2.g(x) | av8Var2.g(D) | ((i9 & 112) != 32);
                O = av8Var2.O();
                if (i8) {
                }
                final osa osaVar32 = osaVar2;
                xtcVar = s;
                z3 = z8;
                n12Var = n12Var2;
                utcVar = utcVar2;
                ng0Var = ng0Var2;
                Function1 function12 = new Function1() { // from class: zx7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        osa osaVar4;
                        esa esaVar = (esa) obj;
                        esaVar.getClass();
                        esa.d(esaVar, null, null, new tc3(-373080305, new cv5(z6, 2), true), 3);
                        dy7 dy7Var2 = dy7.this;
                        k6c k6cVar4 = dy7Var2.f;
                        k6c k6cVar5 = k6c.d;
                        tc3 tc3Var3 = tc3Var;
                        if (k6cVar4 == k6cVar5 && dy7Var2.b) {
                            esa.d(esaVar, null, null, new tc3(143273300, new ay7(tc3Var3, 0), true), 3);
                        }
                        osa osaVar5 = osaVar32;
                        if ((osaVar5.d().a instanceof pfb) && (osaVar5.d().c instanceof pfb) && (osaVar5.d().b instanceof pfb) && osaVar5.c() == 0) {
                            esa.d(esaVar, null, null, new tc3(1057241341, new qm4(23, dy7Var2, tc3Var3), true), 3);
                            osaVar4 = osaVar5;
                        } else {
                            wla wlaVar2 = wlaVar;
                            List list2 = list;
                            Context context2 = context;
                            ct8 ct8Var2 = ct8Var;
                            esa.d(esaVar, null, null, new tc3(-990905900, new ff7(dy7Var2, wlaVar2, list2, context2, ct8Var2, 11), true), 3);
                            osaVar4 = osaVar5;
                            esaVar.a(i14, new x83(osaVar5, 1), new gl7(10), new tc3(-1989586773, new dl1(D, osaVar4, x, kohVar, wlaVar2, ct8Var2), true));
                        }
                        if (Intrinsics.c(osaVar4.d().c, ofb.b)) {
                            esa.d(esaVar, null, null, od3.c, 3);
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(function12);
                O = function12;
                av8Var = av8Var2;
                v8a.a(xtcVar, ksaVar, C2, ng0Var, null, null, z3, null, (Function1) O, av8Var, 100687872, 104);
                av8Var.s(false);
            }
            bhf.b(ghfVar3, l98.f0(n12Var.a(mha.G(utcVar, 2.0f), uxf.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, lz.D(R.color.primary_default, av8Var), av8Var, 70);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ere(osaVar, kohVar, dy7Var, ct8Var, tc3Var, i, 18);
        }
    }

    public static final void b(final my7 my7Var, zqb zqbVar, rr7 rr7Var, Function1 function1, final Function1 function12, final Function2 function2, Function0 function0, of3 of3Var, int i) {
        Context context;
        boh bohVar;
        e1d e1dVar;
        int i2;
        boolean z;
        av8 av8Var;
        koh kohVar;
        dy7 dy7Var;
        my7Var.getClass();
        function1.getClass();
        function12.getClass();
        function2.getClass();
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1198761034);
        int i3 = i | (av8Var2.i(my7Var) ? 4 : 2) | (av8Var2.i(zqbVar) ? 32 : 16) | (av8Var2.i(rr7Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024) | (av8Var2.i(function12) ? 16384 : 8192) | (av8Var2.i(function2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var2.T(i3 & 1, (599187 & i3) != 599186)) {
            u6b u6bVar = (u6b) av8Var2.k(mhb.a);
            final Context context2 = (Context) av8Var2.k(nz.b);
            final Activity activity = (Activity) av8Var2.k(ngb.a);
            Object O = av8Var2.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = e.d(0L);
                av8Var2.n0(O);
            }
            final boh bohVar2 = (boh) O;
            Object O2 = av8Var2.O();
            if (O2 == obj) {
                O2 = e.d(0L);
                av8Var2.n0(O2);
            }
            final boh bohVar3 = (boh) O2;
            Object O3 = av8Var2.O();
            if (O3 == obj) {
                O3 = e.d(0L);
                av8Var2.n0(O3);
            }
            final boh bohVar4 = (boh) O3;
            Object O4 = av8Var2.O();
            if (O4 == obj) {
                O4 = yqo.B(my7Var.p, u6bVar.getLifecycle(), e6b.e);
                av8Var2.n0(O4);
            }
            z88 z88Var = (z88) O4;
            final e1d x = rfo.x(my7Var.n, av8Var2, 0);
            hof hofVar = zqbVar.G;
            boolean i4 = av8Var2.i(my7Var);
            Object O5 = av8Var2.O();
            if (i4 || O5 == obj) {
                O5 = new yx7(my7Var, 1);
                av8Var2.n0(O5);
            }
            w1a.c(hofVar, null, (Function1) O5, av8Var2, 0, 14);
            nn2 nn2Var = my7Var.j;
            boolean z2 = (i3 & 7168) == 2048;
            Object O6 = av8Var2.O();
            if (z2 || O6 == obj) {
                O6 = new k46(27, function1);
                av8Var2.n0(O6);
            }
            w1a.c(nn2Var, null, (Function1) O6, av8Var2, 0, 14);
            if (((dy7) x.getValue()).a) {
                av8Var2.d0(-361724146);
                osa a = rsa.a(z88Var, av8Var2);
                koh kohVar2 = my7Var.k;
                dy7 dy7Var2 = (dy7) x.getValue();
                boolean g = av8Var2.g(x) | av8Var2.i(context2) | av8Var2.i(my7Var) | av8Var2.i(activity) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
                Object O7 = av8Var2.O();
                if (g || O7 == obj) {
                    av8Var = av8Var2;
                    kohVar = kohVar2;
                    i2 = i3;
                    ct8 ct8Var = new ct8() { // from class: by7
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            Intent d;
                            txb txbVar;
                            Integer num;
                            String str;
                            String str2;
                            String str3;
                            Object value;
                            SharedPreferences d2;
                            Object obj5;
                            Context context3 = context2;
                            my7 my7Var2 = my7Var;
                            Activity activity2 = activity;
                            Function1 function13 = function12;
                            Function2 function22 = function2;
                            e1d e1dVar2 = x;
                            boh bohVar5 = bohVar3;
                            boh bohVar6 = bohVar4;
                            boh bohVar7 = bohVar2;
                            pw7 pw7Var = (pw7) obj2;
                            Integer num2 = (Integer) obj3;
                            Integer num3 = (Integer) obj4;
                            pw7Var.getClass();
                            if (pw7Var instanceof uv7) {
                                hjg hjgVar = k6c.c;
                                String str4 = ((uv7) pw7Var).a;
                                hjgVar.getClass();
                                Iterator<E> it = k6c.h.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = it.next();
                                    if (Intrinsics.c(((k6c) obj5).name(), str4)) {
                                        break;
                                    }
                                }
                                k6c k6cVar = (k6c) obj5;
                                if (k6cVar == null) {
                                    k6cVar = k6c.d;
                                }
                                if (((dy7) e1dVar2.getValue()).f != k6cVar) {
                                    if (bohVar5.h() != 0) {
                                        nv.C(context3, ((dy7) e1dVar2.getValue()).f, yaa.v() - bohVar5.h());
                                    }
                                    bohVar5.i(yaa.v());
                                    context3.getClass();
                                    SharedPreferences sharedPreferences = uic.j;
                                    if (sharedPreferences == null) {
                                        Context applicationContext = context3.getApplicationContext();
                                        synchronized (uic.i) {
                                            sharedPreferences = a5f.d(applicationContext);
                                            uic.j = sharedPreferences;
                                        }
                                        sharedPreferences.getClass();
                                    }
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.getClass();
                                    edit.putInt("PREF_FEED_DEFAULT_FILTER", k6cVar.ordinal());
                                    Unit unit = Unit.a;
                                    edit.apply();
                                    my7Var2.getClass();
                                    fdi fdiVar = my7Var2.l;
                                    if (fdiVar.getValue() != k6cVar) {
                                        fdiVar.m(null, k6cVar);
                                        fdi fdiVar2 = my7Var2.m;
                                        while (true) {
                                            Object value2 = fdiVar2.getValue();
                                            k6c k6cVar2 = k6cVar;
                                            if (fdiVar2.k(value2, dy7.a((dy7) value2, false, false, k6cVar2, null, false, null, 991))) {
                                                break;
                                            }
                                            k6cVar = k6cVar2;
                                        }
                                    }
                                } else if (((dy7) e1dVar2.getValue()).f == k6c.f && yaa.v() - bohVar6.h() > 500) {
                                    bohVar6.i(yaa.v());
                                    if (activity2 != null) {
                                        CountryListBottomSheet countryListBottomSheet = new CountryListBottomSheet();
                                        AppCompatActivity appCompatActivity = activity2 instanceof AppCompatActivity ? (AppCompatActivity) activity2 : null;
                                        if (appCompatActivity != null) {
                                            wca.x(appCompatActivity.getLifecycle()).b(new r1(countryListBottomSheet, appCompatActivity, null, 3));
                                        }
                                    }
                                }
                            } else if (pw7Var instanceof yv7) {
                                function13.invoke(((yv7) pw7Var).a);
                            } else {
                                if (pw7Var instanceof lw7) {
                                    int intValue = num3 != null ? num3.intValue() : 0;
                                    kv kvVar = kv.REACTION;
                                    int intValue2 = num2 != null ? num2.intValue() : 0;
                                    lw7 lw7Var = (lw7) pw7Var;
                                    MediaReactionType mediaReactionType = lw7Var.d;
                                    if (mediaReactionType == null) {
                                        mediaReactionType = MediaReactionType.REMOVE_THUMBS_UP;
                                    }
                                    nv.Y(context3, intValue, kvVar, intValue2, mediaReactionType, lw7Var.e, null, 64);
                                    int i5 = lw7Var.a;
                                    int i6 = lw7Var.b;
                                    MediaReactionType mediaReactionType2 = lw7Var.c;
                                    MediaReactionType mediaReactionType3 = lw7Var.d;
                                    my7Var2.getClass();
                                    xw3.L(un0.z(my7Var2), null, null, new ly7(my7Var2, i5, mediaReactionType2, mediaReactionType3, i6, (rq3) null), 3);
                                } else if (pw7Var instanceof mw7) {
                                    mw7 mw7Var = (mw7) pw7Var;
                                    int i7 = mw7Var.a;
                                    int i8 = mw7Var.b;
                                    my7Var2.getClass();
                                    xw3.L(un0.z(my7Var2), null, null, new du1(my7Var2, i7, i8, null, 3), 3);
                                } else if (pw7Var instanceof xv7) {
                                    if (((dy7) e1dVar2.getValue()).f == k6c.d && ((dy7) e1dVar2.getValue()).b) {
                                        Context context4 = my7Var2.f;
                                        context4.getClass();
                                        SharedPreferences sharedPreferences2 = uic.j;
                                        if (sharedPreferences2 == null) {
                                            Context applicationContext2 = context4.getApplicationContext();
                                            synchronized (uic.i) {
                                                d2 = a5f.d(applicationContext2);
                                                uic.j = d2;
                                            }
                                            d2.getClass();
                                            sharedPreferences2 = d2;
                                        }
                                        SharedPreferences.Editor i9 = dmi.i(sharedPreferences2, "media_show_welcome", false);
                                        Unit unit2 = Unit.a;
                                        i9.apply();
                                        fdi fdiVar3 = my7Var2.m;
                                        do {
                                            value = fdiVar3.getValue();
                                        } while (!fdiVar3.k(value, dy7.a((dy7) value, false, false, null, null, false, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT)));
                                    }
                                    if (bohVar7.h() == 0 || yaa.v() - bohVar7.h() > 1000) {
                                        bohVar7.i(yaa.v());
                                        my7Var2.h();
                                    }
                                } else if (pw7Var instanceof wv7) {
                                    my7Var2.g();
                                } else if (pw7Var instanceof hw7) {
                                    nv.z0(context3, kv.CLICK, "primary_card", "feed");
                                    int i10 = SettingsActivity.L;
                                    Intent intent = new Intent(context3, (Class<?>) SettingsActivity.class);
                                    intent.putExtra("open", "openPrimaryTabPreference");
                                    context3.startActivity(intent);
                                    my7Var2.g();
                                } else {
                                    int intValue3 = num2 != null ? num2.intValue() : 0;
                                    int intValue4 = num3 != null ? num3.intValue() : 0;
                                    context3.getClass();
                                    function22.getClass();
                                    if (pw7Var instanceof dw7) {
                                        int i11 = intValue4;
                                        nv.Y(context3, i11, kv.CLICK, intValue3, null, "stacked_card", null, 80);
                                        int i12 = MediaHighlightsActivity.a0;
                                        dw7 dw7Var = (dw7) pw7Var;
                                        q1f.u(context3, i11, dw7Var.a, dw7Var.b, dw7Var.c, dw7Var.d, dw7Var.e, dw7Var.f, null, 3712);
                                    } else {
                                        int i13 = intValue4;
                                        int i14 = 1;
                                        boolean z3 = 1;
                                        if (pw7Var instanceof iw7) {
                                            iw7 iw7Var = (iw7) pw7Var;
                                            String str5 = iw7Var.d;
                                            nv.Y(context3, iw7Var.a, kv.CLICK, iw7Var.b, null, "stacked_card", null, 80);
                                            if (!bea.b) {
                                                try {
                                                    if (WebView.getCurrentWebViewPackage() == null) {
                                                        z3 = 0;
                                                    }
                                                    bea.b = z3;
                                                    i14 = z3;
                                                } catch (Exception unused) {
                                                }
                                            }
                                            r12 = i14;
                                            if (r12 != 0) {
                                                FragmentActivity fragmentActivity = activity2 instanceof FragmentActivity ? (FragmentActivity) activity2 : null;
                                                if (fragmentActivity != null) {
                                                    List list = iw7Var.c;
                                                    list.getClass();
                                                    MediaShortsVideoDialog mediaShortsVideoDialog = new MediaShortsVideoDialog();
                                                    Bundle bundle = new Bundle();
                                                    bundle.putParcelableArrayList("YT_SHORT_VIDEOS", new ArrayList<>(list));
                                                    bundle.putString("CLICKED_SHORT_URL", str5);
                                                    mediaShortsVideoDialog.setArguments(bundle);
                                                    mediaShortsVideoDialog.p(fragmentActivity.k(), "");
                                                }
                                            } else {
                                                bea.G(context3, str5);
                                            }
                                        } else if (pw7Var instanceof nw7) {
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, "stacked_card", null, 80);
                                            mqi mqiVar = qhi.a;
                                            nw7 nw7Var = (nw7) pw7Var;
                                            Highlight highlight = nw7Var.c;
                                            if (qhi.c(highlight.getUrl(), false) != null || qhi.c(highlight.getUrl(), true) != null) {
                                                function22.invoke(Integer.valueOf(nw7Var.a), highlight);
                                            } else if (activity2 != null) {
                                                rfo.G(highlight, activity2, new go7(16), "Event - media fragment");
                                            }
                                        } else if (pw7Var instanceof cw7) {
                                            cw7 cw7Var = (cw7) pw7Var;
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, cw7Var.b ? "stacked_card" : "non_stacked_card", null, 80);
                                            wxf wxfVar = EventActivity.h0;
                                            wxf.B(context3, cw7Var.a, rd6.n, null, null, null, 120);
                                        } else if (pw7Var instanceof gw7) {
                                            gw7 gw7Var = (gw7) pw7Var;
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, gw7Var.e ? "stacked_card" : "non_stacked_card", null, 80);
                                            Integer num4 = gw7Var.c;
                                            if (num4 == null || gw7Var.b == null) {
                                                int i15 = PlayerActivity.Z;
                                                jle.q(context3, gw7Var.a, 0, null, gw7Var.d ? zxe.e : null, false, null, null, 488);
                                            } else {
                                                wxf wxfVar2 = EventActivity.h0;
                                                wxf.B(context3, num4.intValue(), null, Integer.valueOf(gw7Var.a), gw7Var.b, null, 76);
                                            }
                                        } else if (pw7Var instanceof aw7) {
                                            aw7 aw7Var = (aw7) pw7Var;
                                            boolean z4 = aw7Var.e;
                                            if (aw7Var.c) {
                                                str2 = "stacked_card";
                                            } else {
                                                if (aw7Var.b) {
                                                    str3 = "main_stacked_card";
                                                } else if (z4) {
                                                    str3 = "analyst_card";
                                                } else if (aw7Var.d) {
                                                    str3 = "end_stacked_card";
                                                } else {
                                                    str2 = null;
                                                }
                                                str2 = str3;
                                            }
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, str2, null, 80);
                                            wxf wxfVar3 = EventActivity.h0;
                                            wxf.B(context3, aw7Var.a, z4 ? rd6.d : null, null, null, null, 120);
                                        } else if (pw7Var instanceof jw7) {
                                            jw7 jw7Var = (jw7) pw7Var;
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, jw7Var.b ? "stacked_card" : "non_stacked_card", null, 80);
                                            int i16 = TeamActivity.Z;
                                            jle.r(context3, jw7Var.a, t4j.d, null, null, 120);
                                        } else if (pw7Var instanceof ew7) {
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, "stacked_card", null, 80);
                                            a99.A(LeagueActivity.h0, context3, Integer.valueOf(((ew7) pw7Var).a), 0, null, y4b.d, null, null, 4056);
                                        } else if (pw7Var instanceof kw7) {
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, "venue_stacked_card", null, 80);
                                            int i17 = VenueActivity.Q;
                                            int i18 = ((kw7) pw7Var).a;
                                            Intent intent2 = new Intent(context3, (Class<?>) VenueActivity.class);
                                            intent2.putExtra("venue_id", i18);
                                            context3.startActivity(intent2);
                                        } else if (pw7Var instanceof vv7) {
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, "non_stacked_card", null, 80);
                                            vv7 vv7Var = (vv7) pw7Var;
                                            Integer num5 = vv7Var.a;
                                            if (num5 != null) {
                                                wxf wxfVar4 = EventActivity.h0;
                                                wxf.B(context3, num5.intValue(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                            } else {
                                                Integer num6 = vv7Var.b;
                                                if (num6 != null) {
                                                    a99.A(LeagueActivity.h0, context3, num6, 0, null, y4b.d, null, null, 4056);
                                                } else {
                                                    Integer num7 = vv7Var.c;
                                                    if (num7 != null) {
                                                        fff.i(StageDetailsActivity.T, context3, num7.intValue());
                                                    }
                                                }
                                            }
                                        } else if (pw7Var instanceof zv7) {
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, "non_stacked_card", null, 80);
                                            String str6 = ((zv7) pw7Var).a;
                                            str6.getClass();
                                            Uri parse = Uri.parse(str6);
                                            parse.getClass();
                                            List<String> pathSegments = parse.getPathSegments();
                                            String lastPathSegment = parse.getLastPathSegment();
                                            String str7 = lastPathSegment != null ? lastPathSegment : "";
                                            if (pathSegments.contains("event")) {
                                                Integer intOrNull = StringsKt.toIntOrNull(str7);
                                                if (intOrNull != null) {
                                                    context3.startActivity(wxf.o(EventActivity.h0, context3, intOrNull.intValue(), null, null, null, null, null, false, 252));
                                                } else {
                                                    p4h.w(context3, str6);
                                                }
                                            } else if (pathSegments.contains("tournament")) {
                                                txb e = new Regex(".*/tournament/(.*/)?(\\d+)(#id:(\\d+))?").e(str6);
                                                if (e == null || (str = (String) CollectionsKt.a0(2, e.a())) == null) {
                                                    txbVar = e;
                                                    num = null;
                                                } else {
                                                    Integer intOrNull2 = StringsKt.toIntOrNull(str);
                                                    txbVar = e;
                                                    num = intOrNull2;
                                                }
                                                if (num != null) {
                                                    String str8 = (String) CollectionsKt.a0(5, txbVar.a());
                                                    context3.startActivity(a99.x(LeagueActivity.h0, context3, num, null, str8 != null ? StringsKt.toIntOrNull(str8) : null, null, null, false, false, null, null, null, null, null, 8176));
                                                } else {
                                                    p4h.w(context3, str6);
                                                }
                                            } else if (pathSegments.contains(SearchResponseKt.PLAYER_ENTITY)) {
                                                Integer intOrNull3 = StringsKt.toIntOrNull(str7);
                                                if (intOrNull3 != null) {
                                                    int i19 = PlayerActivity.Z;
                                                    int intValue5 = intOrNull3.intValue();
                                                    zxe zxeVar = zxe.d;
                                                    if (!StringsKt.J(str6, "target=player-season", false)) {
                                                        zxeVar = null;
                                                    }
                                                    d = jle.d(context3, intValue5, (r15 & 4) != 0 ? 0 : 16, (r15 & 8) != 0 ? null : null, zxeVar, false, null, (r15 & 128) != 0 ? null : null, null);
                                                    context3.startActivity(d);
                                                } else {
                                                    p4h.w(context3, str6);
                                                }
                                            } else {
                                                p4h.w(context3, str6);
                                            }
                                        } else if (pw7Var instanceof bw7) {
                                            nv.Y(context3, i13, kv.CLICK, intValue3, null, "non_stacked_card", null, 80);
                                            wxf wxfVar5 = EventActivity.h0;
                                            wxf.B(context3, ((bw7) pw7Var).a, rd6.j, null, null, null, 120);
                                        } else if (pw7Var instanceof fw7) {
                                            fw7 fw7Var = (fw7) pw7Var;
                                            nv.Y(context3, fw7Var.a, kv.CLICK, intValue3, null, "non_stacked_card", null, 80);
                                            int i20 = TopNewsActivity.O;
                                            dff.i(context3, Integer.valueOf(fw7Var.a), 28);
                                        }
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    };
                    e1dVar = x;
                    dy7Var = dy7Var2;
                    bohVar = bohVar3;
                    context = context2;
                    av8Var.n0(ct8Var);
                    O7 = ct8Var;
                } else {
                    av8Var = av8Var2;
                    kohVar = kohVar2;
                    e1dVar = x;
                    context = context2;
                    dy7Var = dy7Var2;
                    bohVar = bohVar3;
                    i2 = i3;
                }
                av8Var2 = av8Var;
                a(a, kohVar, dy7Var, (ct8) O7, yqo.H(-1155351840, av8Var, new hl7(rr7Var, 12)), av8Var2, 24584);
                z = false;
                av8Var2.s(false);
            } else {
                av8Var2 = av8Var2;
                context = context2;
                bohVar = bohVar3;
                e1dVar = x;
                i2 = i3;
                z = false;
                av8Var2.d0(-357778280);
                av8Var2.s(false);
            }
            Unit unit = Unit.a;
            boolean g2 = av8Var2.g(e1dVar) | ((3670016 & i2) == 1048576 ? true : z) | av8Var2.i(context);
            Object O8 = av8Var2.O();
            if (g2 || O8 == obj) {
                O8 = new l50(function0, bohVar, e1dVar, context, 25);
                av8Var2.n0(O8);
            }
            jca.c(unit, null, (Function1) O8, av8Var2, 6);
        } else {
            av8Var2.W();
        }
        eqf u = av8Var2.u();
        if (u != null) {
            u.d = new el1(my7Var, zqbVar, rr7Var, function1, function12, function2, function0, i, 3);
        }
    }
}
