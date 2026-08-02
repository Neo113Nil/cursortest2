package defpackage;

import android.content.Context;
import android.graphics.Color;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.newNetwork.TrendingGridTile;
import com.sofascore.model.newNetwork.TrendingGridTileImage;
import com.sofascore.model.newNetwork.TrendingGridTileType;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class xzj {
    public static final void a(TrendingGridTile trendingGridTile, float f, xtc xtcVar, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-832343180);
        int i2 = (av8Var2.i(trendingGridTile) ? 4 : 2) | i | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var2.T(i2 & 1, (i2 & 147) != 146)) {
            Event event = trendingGridTile.getEvent();
            if (event == null) {
                av8Var2.d0(-1489323361);
                av8Var2.s(false);
                av8Var = av8Var2;
            } else {
                av8Var2.d0(-1489323360);
                boolean z = (Event.getHomeTeam$default(event, null, 1, null).getSubTeam1() == null || Event.getHomeTeam$default(event, null, 1, null).getSubTeam2() == null) ? false : true;
                boolean z2 = (Event.getAwayTeam$default(event, null, 1, null).getSubTeam1() == null || Event.getAwayTeam$default(event, null, 1, null).getSubTeam2() == null) ? false : true;
                l8g a = k8g.a(new ng0(f, true, new a70(6)), uxf.m, av8Var2, 48);
                int hashCode = Long.hashCode(av8Var2.T);
                aee m = av8Var2.m();
                xtc C = fqj.C(av8Var2, xtcVar);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a, hf3.g);
                waa.K(av8Var2, m, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C, hf3.d);
                int id = Event.getHomeTeam$default(event, null, 1, null).getId();
                String sportSlug = event.getSportSlug();
                SubTeam subTeam1 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam1();
                Integer valueOf = subTeam1 != null ? Integer.valueOf(subTeam1.getId()) : null;
                SubTeam subTeam2 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam2();
                td4.H(id, sportSlug, null, false, null, null, valueOf, subTeam2 != null ? Integer.valueOf(subTeam2.getId()) : null, null, null, false, z, 48.0f, false, av8Var2, 0, 3456, 1852);
                int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
                String sportSlug2 = event.getSportSlug();
                SubTeam subTeam12 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam1();
                Integer valueOf2 = subTeam12 != null ? Integer.valueOf(subTeam12.getId()) : null;
                SubTeam subTeam22 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam2();
                td4.H(id2, sportSlug2, null, false, null, null, valueOf2, subTeam22 != null ? Integer.valueOf(subTeam22.getId()) : null, null, null, false, z2, 48.0f, false, av8Var2, 0, 3456, 1852);
                av8Var = av8Var2;
                av8Var.s(true);
                av8Var.s(false);
            }
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new oc7(trendingGridTile, f, xtcVar, i);
        }
    }

    public static final void b(syj syjVar, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        TrendingGridTile trendingGridTile = syjVar.b;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1740739889);
        int i2 = i | (av8Var.g(syjVar) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            mv1 mv1Var = uxf.j;
            g28 g28Var = bkh.c;
            xtc A = wnn.A(xtcVar.z(g28Var), o7g.a(16.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = wzj.b;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, true, true, true, D, wzcVar, new cyg((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 22), av8Var, 0);
            k1c c = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            TrendingGridTileImage image = trendingGridTile.getImage();
            String md5 = image != null ? image.getMd5() : null;
            if (md5 == null) {
                av8Var.d0(-1484546422);
                av8Var.s(false);
            } else {
                av8Var.d0(-1484546421);
                boolean g = av8Var.g(md5);
                Object O3 = av8Var.O();
                if (g || O3 == a99Var) {
                    O3 = f(md5);
                    av8Var.n0(O3);
                }
                haa.a((String) O3, null, g28Var, null, mp3.a, av8Var, 1573296, 1976);
                av8Var.s(false);
            }
            TrendingGridTileType type = trendingGridTile.getType();
            TrendingGridTileType trendingGridTileType = TrendingGridTileType.AI_INSIGHTS;
            utc utcVar = utc.a;
            if (type == trendingGridTileType) {
                av8Var.d0(-1484165648);
                a(trendingGridTile, 76.0f, n12.a.a(utcVar, uxf.g), av8Var, 48);
                av8Var.s(false);
            } else {
                av8Var.d0(-1483984019);
                av8Var.s(false);
            }
            String text = trendingGridTile.getText();
            if (text == null) {
                text = "";
            }
            String str = text;
            yf8 yf8Var = xth.a;
            q5a.w(str, l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), lz.D(R.color.on_color_primary, av8Var), null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.j(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mfh(syjVar, function0, xtcVar, i, 16);
        }
    }

    public static final void c(final yyj yyjVar, tee teeVar, h4d h4dVar, wla wlaVar, Function0 function0, Function0 function02, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        Function0 function03;
        yyjVar.getClass();
        teeVar.getClass();
        wlaVar.getClass();
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1471953526);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var.g(yyjVar) : av8Var.i(yyjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(teeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(h4dVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? av8Var.g(wlaVar) : av8Var.i(wlaVar) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function03 = function02;
            i2 |= av8Var.i(function03) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        } else {
            function03 = function02;
        }
        if ((1572864 & i) == 0) {
            i2 |= av8Var.g(xtcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i3 = i2;
        final int i4 = 1;
        final int i5 = 0;
        if (av8Var.T(i3 & 1, (599187 & i3) != 599186)) {
            final Context context = (Context) av8Var.k(nz.b);
            if (yyjVar instanceof vyj) {
                av8Var.d0(-648176314);
                int i6 = ((vyj) yyjVar).a;
                int i7 = i3 << 3;
                b4d.a(i6, AdType.Native.TrendingGridMedium, (wg) teeVar.get(Integer.valueOf(i6)), h4dVar, bkh.e(xtcVar, 192.0f), true, function03, av8Var, (i7 & 7168) | 196656 | (i7 & 3670016), 0);
                av8Var.s(false);
                av8Var = av8Var;
            } else {
                boolean z = yyjVar instanceof wyj;
                a99 a99Var = nf3.a;
                if (z) {
                    av8Var.d0(-647737261);
                    wyj wyjVar = (wyj) yyjVar;
                    boolean i8 = av8Var.i(context);
                    int i9 = i3 & 14;
                    if (i9 != 4 && ((i3 & 8) == 0 || !av8Var.i(yyjVar))) {
                        i4 = 0;
                    }
                    int i10 = (i8 ? 1 : 0) | i4;
                    Object O = av8Var.O();
                    if (i10 != 0 || O == a99Var) {
                        O = new Function0() { // from class: vzj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i11 = i5;
                                yyj yyjVar2 = yyjVar;
                                Context context2 = context;
                                switch (i11) {
                                    case 0:
                                        wyj wyjVar2 = (wyj) yyjVar2;
                                        wyjVar2.getClass();
                                        o0k N = bea.N(wyjVar2.a, wyjVar2.b);
                                        context2.getClass();
                                        nv.V(context2, "trending_tile_impression", N);
                                        break;
                                    default:
                                        int i12 = ((xyj) yyjVar2).a + 1;
                                        context2.getClass();
                                        FirebaseBundle firebaseBundle = new FirebaseBundle();
                                        firebaseBundle.putInt("index", i12);
                                        firebaseBundle.putString("type", "no_fill");
                                        nv.N(context2, firebaseBundle, "trending_tile_impression");
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O);
                    }
                    av8Var = av8Var;
                    d(wyjVar, function0, bea.P(xtcVar, wlaVar, (Function0) O, av8Var, ((i3 >> 18) & 14) | 384 | ((i3 >> 6) & 112), 4), av8Var, ((i3 >> 9) & 112) | i9);
                    av8Var.s(false);
                } else {
                    av8Var = av8Var;
                    if (!(yyjVar instanceof xyj)) {
                        throw dmi.h(av8Var, 1503109737, false);
                    }
                    av8Var.d0(1503142312);
                    boolean i11 = av8Var.i(context) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && av8Var.i(yyjVar)));
                    Object O2 = av8Var.O();
                    if (i11 || O2 == a99Var) {
                        O2 = new Function0() { // from class: vzj
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i112 = i4;
                                yyj yyjVar2 = yyjVar;
                                Context context2 = context;
                                switch (i112) {
                                    case 0:
                                        wyj wyjVar2 = (wyj) yyjVar2;
                                        wyjVar2.getClass();
                                        o0k N = bea.N(wyjVar2.a, wyjVar2.b);
                                        context2.getClass();
                                        nv.V(context2, "trending_tile_impression", N);
                                        break;
                                    default:
                                        int i12 = ((xyj) yyjVar2).a + 1;
                                        context2.getClass();
                                        FirebaseBundle firebaseBundle = new FirebaseBundle();
                                        firebaseBundle.putInt("index", i12);
                                        firebaseBundle.putString("type", "no_fill");
                                        nv.N(context2, firebaseBundle, "trending_tile_impression");
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O2);
                    }
                    e(0, av8Var, bea.P(xtcVar, wlaVar, (Function0) O2, av8Var, ((i3 >> 18) & 14) | 384 | ((i3 >> 6) & 112), 4));
                    av8Var.s(false);
                }
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new rc3(yyjVar, teeVar, h4dVar, wlaVar, function0, function02, xtcVar, i, 4);
        }
    }

    public static final void d(wyj wyjVar, Function0 function0, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        utc utcVar;
        n12 n12Var;
        boolean z;
        Object u2gVar;
        TrendingGridTile trendingGridTile = wyjVar.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1204912555);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(wyjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            mv1 mv1Var = uxf.j;
            g28 g28Var = bkh.c;
            xtc A = wnn.A(xtcVar.z(g28Var), o7g.a(16.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = wzj.c;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, true, true, true, D, wzcVar, new cyg((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 23), av8Var, 0);
            av8 av8Var2 = av8Var;
            k1c c = e12.c(mv1Var, false);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            TrendingGridTileImage image = trendingGridTile.getImage();
            String md5 = image != null ? image.getMd5() : null;
            if (md5 == null) {
                av8Var2.d0(1160618926);
                av8Var2.s(false);
            } else {
                av8Var2.d0(1160618927);
                boolean g = av8Var2.g(md5);
                Object O3 = av8Var2.O();
                if (g || O3 == a99Var) {
                    O3 = f(md5);
                    av8Var2.n0(O3);
                }
                haa.a((String) O3, null, g28Var, null, mp3.a, av8Var2, 1573296, 1976);
                Unit unit = Unit.a;
                av8Var2.s(false);
            }
            boolean F = n9e.F(trendingGridTile.getLabelText());
            utc utcVar2 = utc.a;
            n12 n12Var2 = n12.a;
            if (F) {
                av8Var2.d0(1161017060);
                boolean g2 = av8Var2.g(trendingGridTile.getLabelColor());
                Object O4 = av8Var2.O();
                if (g2 || O4 == a99Var) {
                    String labelColor = trendingGridTile.getLabelColor();
                    if (labelColor != null) {
                        try {
                            p2g p2gVar = w2g.b;
                            u2gVar = new r13(hkg.b(Color.parseColor(labelColor)));
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        r14 = (r13) (u2gVar instanceof u2g ? null : u2gVar);
                    }
                    av8Var2.n0(r14);
                    O4 = r14;
                }
                r13 r13Var = (r13) O4;
                mv1 mv1Var2 = uxf.c;
                xtc A2 = wnn.A(l98.f0(n12Var2.a(utcVar2, mv1Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9));
                if (r13Var != null) {
                    r13Var.getClass();
                    A2 = A2.z(n9e.q(utcVar2, r13Var.a, oyn.e));
                }
                xtc c0 = l98.c0(A2, 8.0f, 4.0f);
                k1c c2 = e12.c(mv1Var2, false);
                int hashCode2 = Long.hashCode(av8Var2.T);
                aee m2 = av8Var2.m();
                xtc C2 = fqj.C(av8Var2, c0);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var2);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, c2, hf3.g);
                waa.K(av8Var2, m2, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C2, hf3.d);
                String labelText = trendingGridTile.getLabelText();
                if (labelText == null) {
                    labelText = "";
                }
                yf8 yf8Var = xth.a;
                utcVar = utcVar2;
                n12Var = n12Var2;
                q5a.w(labelText, null, lz.D(R.color.on_color_primary, av8Var2), null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.c(), av8Var2, 0, 0, 130042);
                av8Var2 = av8Var2;
                z = true;
                av8Var2.s(true);
                av8Var2.s(false);
            } else {
                utcVar = utcVar2;
                n12Var = n12Var2;
                z = true;
                av8Var2.d0(1162075121);
                av8Var2.s(false);
            }
            if (trendingGridTile.getType() == TrendingGridTileType.AI_INSIGHTS) {
                av8Var2.d0(1162146452);
                a(trendingGridTile, 32.0f, n12Var.a(utcVar, uxf.g), av8Var2, 48);
                av8Var2.s(false);
            } else {
                av8Var2.d0(1162328081);
                av8Var2.s(false);
            }
            String text = trendingGridTile.getText();
            String str = text != null ? text : "";
            yf8 yf8Var2 = xth.a;
            av8 av8Var3 = av8Var2;
            boolean z2 = z;
            q5a.w(str, l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), lz.D(R.color.on_color_primary, av8Var2), null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.l(), av8Var3, 48, 0, 130040);
            av8Var = av8Var3;
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(wyjVar, function0, xtcVar, i, 15);
        }
    }

    public static final void e(int i, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1989004959);
        int i2 = (av8Var.g(xtcVar) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            xtc q = n9e.q(wnn.A(xtcVar.z(bkh.c), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), oyn.e);
            k1c c = e12.c(uxf.g, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.logo_sofascore_new, 6, av8Var), null, bkh.e(bkh.d(l98.d0(utc.a, 30.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), 16.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new oqj(xtcVar, i, 1);
        }
    }

    public static final String f(String str) {
        String o = lnb.o(dmi.q("https://", uaa.c), "i/", str);
        if (!StringsKt.J("https://" + uaa.c, "api.sofascore1.com/", false)) {
            return o;
        }
        yea yeaVar = j58.a;
        e58 f = e58.f();
        f.getClass();
        return c.r(o, "sofascore.com", f.g("vpn_browser_host"), false);
    }
}
