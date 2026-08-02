package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.SizeF;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4427z5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public abstract class l98 {
    public static final tc3 d;
    public static final k8k h;
    public static final k8k j;
    public static final k8k k;
    public static final k8a o;
    public static final k8a p;
    public static final /* synthetic */ int s = 0;
    public static final /* synthetic */ int t = 0;
    public static final /* synthetic */ int u = 0;
    public static final /* synthetic */ int v = 0;
    public static final tc3 a = new tc3(2042465378, new qs2(9), false);
    public static final tc3 b = new tc3(-1703215449, new qs2(10), false);
    public static final tc3 c = new tc3(1238919761, new qd3(25), false);
    public static final int[] e = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] f = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] g = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, a.o, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final k8k i = new k8k(1 == true ? 1 : 0, 1 == true ? 1 : 0);
    public static final k8k l = new k8k(1 == true ? 1 : 0, 4);
    public static final k8k m = new k8k(1 == true ? 1 : 0, 6);
    public static final k8k n = new k8k(0 == true ? 1 : 0, 7);
    public static final k8a q = new k8a(1 == true ? 1 : 0, 0 == true ? 1 : 0);
    public static final k8a r = new k8a(1 == true ? 1 : 0, 1 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i2 = 5;
        d = new tc3(1374115483, new pd3(i2), false);
        h = new k8k(true, i2);
        int i3 = 3;
        j = new k8k(false, i3);
        int i4 = 2;
        k = new k8k(1 == true ? 1 : 0, i4);
        o = new k8a(1 == true ? 1 : 0, i4);
        p = new k8a(1 == true ? 1 : 0, i3);
    }

    public static final void A(final String str, final String str2, final int i2, final int i3, final boolean z, final int i4, final Function0 function0, of3 of3Var, final int i5) {
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var;
        zg3 zg3Var;
        f50 f50Var2;
        f50 f50Var3;
        int i6;
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1050105437);
        int i7 = i5 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.e(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i3) ? a.o : 1024) | (av8Var.h(z) ? 16384 : 8192) | (av8Var.e(i4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(function0) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i7 & 1, (599187 & i7) != 599186)) {
            boolean z3 = (i7 & 112) == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z3 || O == a99Var) {
                mqi mqiVar = qhi.a;
                O = Boolean.valueOf(qhi.c(str2, false) != null);
                av8Var.n0(O);
            }
            boolean booleanValue = ((Boolean) O).booleanValue();
            utc utcVar = utc.a;
            xtc A = wnn.A(qx9.p(bkh.d(utcVar, 1.0f), 1.7777778f), o7g.a(8.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = wzj.o;
                av8Var.n0(O3);
            }
            xtc y = tol.y(A, true, true, true, D, wzcVar, new cyg(function0, (boh) o3a.N(objArr, (Function0) O3, av8Var, 48), 29), av8Var, 0);
            av8Var = av8Var;
            xtc O4 = kda.O(y, "matchday_highlight_video_" + i4, av8Var);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, O4);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, c2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var, C, f50Var6);
            if (booleanValue) {
                av8Var.d0(-1174244401);
                f50Var = f50Var5;
                f50Var2 = f50Var4;
                f50Var3 = f50Var6;
                i6 = 6;
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                zg3Var = zg3Var2;
                td4.O(str, null, 0L, false, true, av8Var, (i7 & 14) | 27648, 6);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                f50Var = f50Var5;
                zg3Var = zg3Var2;
                f50Var2 = f50Var4;
                f50Var3 = f50Var6;
                i6 = 6;
                av8Var.d0(-1174057192);
                int i8 = i7 >> 6;
                z(i2, i3, (i8 & 112) | (i8 & 14) | 384, av8Var, bkh.c);
                av8Var.s(false);
            }
            kq9.b(s6a.N(R.drawable.ic_highlights_white, i6, av8Var), null, bkh.l(bkh.s(bkh.c, 2), 48.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 432, 0);
            if (z) {
                av8Var.d0(-1173474857);
                xtc O5 = kda.O(c0(n9e.q(wnn.A(b0(n12.a.a(utcVar, uxf.e), 8.0f), o7g.a(4.0f)), lz.D(R.color.on_color_primary, av8Var), oyn.e), 8.0f, 4.0f), "matchday_highlight_seen_badge", av8Var);
                l8g a2 = k8g.a(new ng0(8.0f, true, new a70(i6)), uxf.m, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, O5);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, f50Var2);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                z2 = true;
                kq9.b(s6a.N(R.drawable.ic_tv_channel_checkmark_16, i6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.graphics_dark, av8Var), av8Var, 432, 0);
                String v2 = oea.v(R.string.seen, av8Var);
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(v2, null, lz.D(R.color.graphics_dark, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
                av8Var.s(true);
                av8Var.s(false);
            } else {
                z2 = true;
                av8Var.d0(-1172477339);
                av8Var.s(false);
            }
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(str, str2, i2, i3, z, i4, function0, i5) { // from class: mfl
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ int f;
                public final /* synthetic */ Function0 g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    l98.A(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static t3e B(float f2, int i2) {
        int i3 = i2 & 1;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i3 != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) == 0) {
            f3 = 42.0f;
        }
        return new t3e(f2, f3, f2, f3);
    }

    public static t3e C(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new t3e(f2, f3, f4, f5);
    }

    public static final void D(float f2, int i2, int i3, int i4, of3 of3Var, xtc xtcVar) {
        int i5 = i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-982512671);
        int i6 = i4 | (av8Var.e(i5) ? 4 : 2) | (av8Var.e(i3) ? 32 : 16) | (av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        boolean z = false;
        boolean z2 = true;
        if (av8Var.T(i6 & 1, (i6 & 1171) != 1170)) {
            float f3 = 1.0f;
            xtc d2 = bkh.d(xtcVar, 1.0f);
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-1197002966);
            int i7 = 0;
            while (i7 < i5) {
                float f4 = i7 < i3 ? f3 : i7 == i3 ? f2 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                xtc A = wnn.A(bkh.e(new goa(f3, z2), 2.0f), o7g.a(8.0f));
                boolean z3 = z;
                long D = lz.D(R.color.on_color_primary, av8Var);
                long c2 = r13.c(lz.D(R.color.on_color_primary, av8Var), 0.5f);
                boolean d3 = av8Var.d(f4);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (d3 || O == a99Var) {
                    O = new va6(f4);
                    av8Var.n0(O);
                }
                Function0 function0 = (Function0) O;
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = new z1h(18);
                    av8Var.n0(O2);
                }
                ncf.c(function0, A, D, c2, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Function1) O2, av8Var, 1769472);
                i7++;
                z = z3;
                f3 = 1.0f;
                z2 = true;
                i5 = i2;
            }
            av8Var.s(z);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new v07(i2, i3, f2, xtcVar, i4);
        }
    }

    public static final void E(tbj tbjVar, boolean z, of3 of3Var, int i2) {
        bej d2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(626339208);
        int i3 = (av8Var.i(tbjVar) ? 4 : 2) | i2 | (av8Var.h(z) ? 32 : 16);
        if (!av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            av8Var.W();
        } else if (z) {
            av8Var.d0(1530097388);
            q5b q5bVar = tbjVar.d;
            aej aejVar = null;
            if (q5bVar != null && (d2 = q5bVar.d()) != null) {
                aej aejVar2 = d2.a;
                q5b q5bVar2 = tbjVar.d;
                if (!(q5bVar2 != null ? q5bVar2.p : true)) {
                    aejVar = aejVar2;
                }
            }
            if (aejVar == null) {
                av8Var.d0(1530097387);
                av8Var.s(false);
            } else {
                av8Var.d0(1530097388);
                if (pej.d(tbjVar.l().b)) {
                    av8Var.d0(2110860558);
                    av8Var.s(false);
                } else {
                    av8Var.d0(2109807302);
                    int v2 = tbjVar.b.v((int) (tbjVar.l().b >> 32));
                    int v3 = tbjVar.b.v((int) (tbjVar.l().b & 4294967295L));
                    d1g a2 = aejVar.a(v2);
                    d1g a3 = aejVar.a(Math.max(v3 - 1, 0));
                    q5b q5bVar3 = tbjVar.d;
                    if (q5bVar3 == null || !((Boolean) ((eoh) q5bVar3.m).getValue()).booleanValue()) {
                        av8Var.d0(2110490542);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(2110225306);
                        u0a.o(true, a2, tbjVar, av8Var, ((i3 << 6) & 896) | 6);
                        av8Var.s(false);
                    }
                    q5b q5bVar4 = tbjVar.d;
                    if (q5bVar4 == null || !((Boolean) ((eoh) q5bVar4.n).getValue()).booleanValue()) {
                        av8Var.d0(2110838734);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(2110574459);
                        u0a.o(false, a3, tbjVar, av8Var, ((i3 << 6) & 896) | 6);
                        av8Var.s(false);
                    }
                    av8Var.s(false);
                }
                q5b q5bVar5 = tbjVar.d;
                if (q5bVar5 != null) {
                    e1d e1dVar = q5bVar5.l;
                    if (!Intrinsics.c(tbjVar.t.a.b, tbjVar.l().a.b)) {
                        ((eoh) e1dVar).setValue(Boolean.FALSE);
                    }
                    if (q5bVar5.b()) {
                        if (((Boolean) ((eoh) e1dVar).getValue()).booleanValue()) {
                            tbjVar.s();
                        } else {
                            tbjVar.m();
                        }
                    }
                    Unit unit = Unit.a;
                }
                av8Var.s(false);
            }
            av8Var.s(false);
        } else {
            av8Var.d0(1989076778);
            av8Var.s(false);
            tbjVar.m();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new m81(i2, 3, tbjVar, z);
        }
    }

    public static final void F(int i2, of3 of3Var, xtc xtcVar, Function0 function0) {
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1229889893);
        int i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            lv1 lv1Var = uxf.m;
            int i4 = 6;
            ng0 ng0Var = new ng0(12.0f, true, new a70(i4));
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
                O2 = mce.B;
                av8Var.n0(O2);
            }
            xtc y = tol.y(xtcVar, true, true, true, D, wzcVar, new cyg((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, i4), av8Var, 0);
            av8Var = av8Var;
            xtcVar2 = xtcVar;
            xtc b0 = b0(y, 12.0f);
            l8g a2 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(R.drawable.ic_menu_list_share, 6, av8Var), "Share Icon", b0(n9e.q(bkh.l(utc.a, 40.0f), lz.D(R.color.on_color_primary, av8Var), o7g.a), 8.0f), lz.D(R.color.graphics_dark, av8Var), av8Var, 48, 0);
            String v2 = oea.v(R.string.season_25_share_this_story, av8Var);
            long D2 = lz.D(R.color.on_color_primary, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v2, null, D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.d(), av8Var, 0, 0, 131066);
            av8Var.s(true);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new fm(xtcVar2, function0, i2, 10);
        }
    }

    public static kkh G(int i2) {
        return new kkh((i2 & 1) != 0, f50.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0288, code lost:
    
        if (r2.g(r53) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x033a, code lost:
    
        if (r1 == r0) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void H(hth hthVar, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function1 function12, Function0 function04, of3 of3Var, int i2) {
        Function1 function13;
        av8 av8Var;
        boolean z;
        boolean g2;
        Object O;
        Object obj;
        fm8 fm8Var;
        int i3;
        float f2;
        hsk hskVar;
        tfi tfiVar;
        gv9 gv9Var;
        Boolean bool;
        Boolean bool2;
        q50 q50Var;
        q50 q50Var2;
        q50 q50Var3;
        q50 q50Var4;
        q50 q50Var5;
        q50 q50Var6;
        q50 q50Var7;
        q50 q50Var8;
        boolean g3;
        Object obj2;
        Object O2;
        e1d e1dVar;
        Object O3;
        fm8 fm8Var2;
        boolean g4;
        Object O4;
        xtc r2;
        int i4;
        tfi tfiVar2;
        v7b v7bVar;
        function0.getClass();
        function02.getClass();
        function1.getClass();
        function03.getClass();
        function12.getClass();
        function04.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1232328653);
        int i5 = i2 | (av8Var2.g(hthVar) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024) | (av8Var2.i(function03) ? 16384 : 8192) | (av8Var2.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.i(function04) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var2.T(i5 & 1, (599187 & i5) != 599186)) {
            hsk hskVar2 = (hsk) av8Var2.k(dh3.t);
            tfi c2 = hthVar.c();
            gv9 gv9Var2 = hthVar.a;
            fm8 b2 = hthVar.b();
            Object O5 = av8Var2.O();
            Object obj3 = nf3.a;
            if (O5 == obj3) {
                O5 = e.f(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                av8Var2.n0(O5);
            }
            e1d e1dVar2 = (e1d) O5;
            Object O6 = av8Var2.O();
            if (O6 == obj3) {
                O6 = e.f(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                av8Var2.n0(O6);
            }
            e1d e1dVar3 = (e1d) O6;
            p75 p75Var = (p75) e1dVar2.getValue();
            float f3 = p75Var.a;
            p75 p75Var2 = (p75) e1dVar3.getValue();
            float f4 = p75Var2.a;
            int i6 = (i5 & 14) | ((i5 >> 9) & 7168);
            if (p75Var.compareTo(p75Var2) > 0) {
                p75Var = p75Var2;
            }
            float f5 = (1.0f / (120.0f / p75Var.a)) * 4.0f;
            Iterator it = CollectionsKt.L0(t2k.a, 13).iterator();
            float f6 = 1.0f;
            while (it.hasNext()) {
                f6 *= 1.0f - (((Number) it.next()).floatValue() * 2.0f);
            }
            float f7 = f3 / (f3 * f6);
            float f8 = f4 / (f6 * f4);
            float max = Math.max(f7, f8);
            Object O7 = av8Var2.O();
            if (O7 == obj3) {
                O7 = ml4.b(1.0f);
                av8Var2.n0(O7);
            }
            q50 q50Var9 = (q50) O7;
            Object O8 = av8Var2.O();
            if (O8 == obj3) {
                O8 = ml4.b(0.1f);
                av8Var2.n0(O8);
            }
            q50 q50Var10 = (q50) O8;
            Object O9 = av8Var2.O();
            if (O9 == obj3) {
                O9 = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var2.n0(O9);
            }
            q50 q50Var11 = (q50) O9;
            Object O10 = av8Var2.O();
            if (O10 == obj3) {
                O10 = ml4.b(max);
                av8Var2.n0(O10);
            }
            q50 q50Var12 = (q50) O10;
            Object O11 = av8Var2.O();
            if (O11 == obj3) {
                O11 = ml4.b(f7);
                av8Var2.n0(O11);
            }
            q50 q50Var13 = (q50) O11;
            Object O12 = av8Var2.O();
            if (O12 == obj3) {
                O12 = ml4.b(f8);
                av8Var2.n0(O12);
            }
            q50 q50Var14 = (q50) O12;
            Object O13 = av8Var2.O();
            if (O13 == obj3) {
                O13 = ml4.b(1.0f);
                av8Var2.n0(O13);
            }
            q50 q50Var15 = (q50) O13;
            Object O14 = av8Var2.O();
            if (O14 == obj3) {
                O14 = ml4.b(0.1f);
                av8Var2.n0(O14);
            }
            q50 q50Var16 = (q50) O14;
            Object O15 = av8Var2.O();
            if (O15 == obj3) {
                O15 = ml4.b(0.1f);
                av8Var2.n0(O15);
            }
            q50 q50Var17 = (q50) O15;
            Object O16 = av8Var2.O();
            if (O16 == obj3) {
                O16 = ml4.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                av8Var2.n0(O16);
            }
            q50 q50Var18 = (q50) O16;
            tfi tfiVar3 = (tfi) CollectionsKt.a0(hthVar.b - 1, gv9Var2);
            tfi c3 = hthVar.c();
            Boolean valueOf = Boolean.valueOf(hthVar.f);
            Boolean valueOf2 = Boolean.valueOf(hthVar.e);
            boolean i7 = ((((i6 & 14) ^ 6) > 4 && av8Var2.g(hthVar)) || (i6 & 6) == 4) | av8Var2.i(q50Var9) | av8Var2.i(q50Var10) | av8Var2.i(q50Var11) | av8Var2.i(q50Var12) | av8Var2.i(q50Var13) | av8Var2.i(q50Var14) | av8Var2.i(q50Var15) | av8Var2.i(q50Var16) | av8Var2.i(q50Var17) | av8Var2.i(q50Var18) | av8Var2.d(max) | av8Var2.g(tfiVar3) | av8Var2.d(f7) | av8Var2.d(f8) | av8Var2.d(f5);
            if (((i6 & 7168) ^ 3072) <= 2048) {
            }
            if ((i6 & 3072) != 2048) {
                z = false;
                g2 = i7 | z | av8Var2.g(c3);
                O = av8Var2.O();
                if (!g2 || O == obj3) {
                    obj = obj3;
                    fm8Var = b2;
                    i3 = i5;
                    f2 = 0.0f;
                    hskVar = hskVar2;
                    tfiVar = c2;
                    gv9Var = gv9Var2;
                    bool = valueOf;
                    bool2 = valueOf2;
                    q50Var = q50Var13;
                    q50Var2 = q50Var16;
                    q50Var3 = q50Var15;
                    q50Var4 = q50Var10;
                    q50Var5 = q50Var9;
                    q50Var6 = q50Var17;
                    q50Var7 = q50Var11;
                    q50Var8 = q50Var12;
                    O = new dgi(hthVar, tfiVar3, c3, f8, f7, q50Var5, q50Var4, q50Var7, q50Var8, q50Var, q50Var14, q50Var3, q50Var2, q50Var6, q50Var18, max, f5, function04, null);
                    q50Var18 = q50Var18;
                    q50Var14 = q50Var14;
                    av8Var = av8Var2;
                    av8Var.n0(O);
                } else {
                    obj = obj3;
                    q50Var = q50Var13;
                    i3 = i5;
                    fm8Var = b2;
                    f2 = 0.0f;
                    hskVar = hskVar2;
                    tfiVar = c2;
                    gv9Var = gv9Var2;
                    bool = valueOf;
                    bool2 = valueOf2;
                    q50Var2 = q50Var16;
                    q50Var3 = q50Var15;
                    q50Var4 = q50Var10;
                    q50Var5 = q50Var9;
                    q50Var6 = q50Var17;
                    q50Var7 = q50Var11;
                    q50Var8 = q50Var12;
                    av8Var = av8Var2;
                }
                hz8.p(c3, bool, bool2, (Function2) O, av8Var);
                g3 = av8Var.g(q50Var5) | av8Var.g(q50Var4) | av8Var.g(q50Var7) | av8Var.g(q50Var8) | av8Var.g(q50Var) | av8Var.g(q50Var14) | av8Var.g(q50Var3) | av8Var.g(q50Var18);
                Object O17 = av8Var.O();
                if (g3) {
                    obj2 = obj;
                } else {
                    obj2 = obj;
                }
                O17 = new vfi(q50Var5, q50Var4, q50Var7, q50Var8, q50Var, q50Var14, q50Var3, q50Var2, q50Var6, q50Var18);
                av8Var.n0(O17);
                vfi vfiVar = (vfi) O17;
                O2 = av8Var.O();
                if (O2 == obj2) {
                    O2 = e.f(Boolean.FALSE);
                    av8Var.n0(O2);
                }
                e1dVar = (e1d) O2;
                O3 = av8Var.O();
                if (O3 == obj2) {
                    O3 = ml4.b(f2);
                    av8Var.n0(O3);
                }
                q50 q50Var19 = (q50) O3;
                boolean z2 = ((ema) av8Var.k(dh3.n)) != ema.b;
                fm8Var2 = fm8Var;
                g4 = av8Var.g(fm8Var2) | av8Var.i(q50Var19);
                O4 = av8Var.O();
                rq3 rq3Var = null;
                if (!g4 || O4 == obj2) {
                    O4 = new big(fm8Var2, q50Var19, rq3Var, 15);
                    av8Var.n0(O4);
                }
                hz8.o(av8Var, fm8Var2, (Function2) O4);
                r2 = m6k.r(utc.a, "SeasonTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                k1c c4 = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, r2);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.q0();
                } else {
                    av8Var.l(zg3Var);
                }
                waa.K(av8Var, c4, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                if (((Boolean) e1dVar.getValue()).booleanValue() || fm8Var2 == null || !(fm8Var2 instanceof rdh)) {
                    function13 = function12;
                    i4 = i3;
                    av8Var.d0(1628390063);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1628166150);
                    i4 = i3;
                    boolean z3 = (458752 & i4) == 131072;
                    Object O18 = av8Var.O();
                    if (z3 || O18 == obj2) {
                        function13 = function12;
                        O18 = new xz4(function13, e1dVar, 3);
                        av8Var.n0(O18);
                    } else {
                        function13 = function12;
                    }
                    l6g.b(fm8Var2, (Function1) O18, av8Var, 0);
                    av8Var.s(false);
                }
                av8Var.d0(-640189858);
                g28 g28Var = bkh.c;
                tfiVar2 = tfiVar;
                if (tfiVar2 instanceof n2k) {
                    v7bVar = new v7b(b.j(new r13(hkg.d(4279374354L)), new r13(hkg.d(4281814517L)), new r13(hkg.d(4279374354L))), null, 0L, 9187343241974906880L);
                } else {
                    float f9 = f2;
                    v7bVar = wxf.E(((n2k) tfiVar2).d(), f9, f9, 14);
                }
                xtc p2 = n9e.p(g28Var, v7bVar, null, 6);
                if (!gv9Var.isEmpty()) {
                    Unit unit = Unit.a;
                    hsk hskVar3 = hskVar;
                    boolean i8 = ((i4 & 7168) == 2048) | av8Var.i(hskVar3) | av8Var.h(z2) | ((i4 & 112) == 32) | ((i4 & 896) == 256);
                    Object O19 = av8Var.O();
                    if (i8 || O19 == obj2) {
                        kug kugVar = new kug(function1, hskVar3, z2, function0, function02);
                        av8Var.n0(kugVar);
                        O19 = kugVar;
                    }
                    p2 = p2.z(koi.a(utc.a, unit, (PointerInputEventHandler) O19));
                }
                av8Var.s(false);
                dy0.b(p2, null, yqo.H(1179499177, av8Var, new fth(hthVar, e1dVar2, e1dVar3, q50Var19, function03, vfiVar, e1dVar)), av8Var, 3072, 6);
                av8Var.s(true);
            }
            z = true;
            g2 = i7 | z | av8Var2.g(c3);
            O = av8Var2.O();
            if (g2) {
            }
            obj = obj3;
            fm8Var = b2;
            i3 = i5;
            f2 = 0.0f;
            hskVar = hskVar2;
            tfiVar = c2;
            gv9Var = gv9Var2;
            bool = valueOf;
            bool2 = valueOf2;
            q50Var = q50Var13;
            q50Var2 = q50Var16;
            q50Var3 = q50Var15;
            q50Var4 = q50Var10;
            q50Var5 = q50Var9;
            q50Var6 = q50Var17;
            q50Var7 = q50Var11;
            q50Var8 = q50Var12;
            O = new dgi(hthVar, tfiVar3, c3, f8, f7, q50Var5, q50Var4, q50Var7, q50Var8, q50Var, q50Var14, q50Var3, q50Var2, q50Var6, q50Var18, max, f5, function04, null);
            q50Var18 = q50Var18;
            q50Var14 = q50Var14;
            av8Var = av8Var2;
            av8Var.n0(O);
            hz8.p(c3, bool, bool2, (Function2) O, av8Var);
            g3 = av8Var.g(q50Var5) | av8Var.g(q50Var4) | av8Var.g(q50Var7) | av8Var.g(q50Var8) | av8Var.g(q50Var) | av8Var.g(q50Var14) | av8Var.g(q50Var3) | av8Var.g(q50Var18);
            Object O172 = av8Var.O();
            if (g3) {
            }
            O172 = new vfi(q50Var5, q50Var4, q50Var7, q50Var8, q50Var, q50Var14, q50Var3, q50Var2, q50Var6, q50Var18);
            av8Var.n0(O172);
            vfi vfiVar2 = (vfi) O172;
            O2 = av8Var.O();
            if (O2 == obj2) {
            }
            e1dVar = (e1d) O2;
            O3 = av8Var.O();
            if (O3 == obj2) {
            }
            q50 q50Var192 = (q50) O3;
            if (((ema) av8Var.k(dh3.n)) != ema.b) {
            }
            fm8Var2 = fm8Var;
            g4 = av8Var.g(fm8Var2) | av8Var.i(q50Var192);
            O4 = av8Var.O();
            rq3 rq3Var2 = null;
            if (!g4) {
            }
            O4 = new big(fm8Var2, q50Var192, rq3Var2, 15);
            av8Var.n0(O4);
            hz8.o(av8Var, fm8Var2, (Function2) O4);
            r2 = m6k.r(utc.a, "SeasonTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
            k1c c42 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m22 = av8Var.m();
            xtc C2 = fqj.C(av8Var, r2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, c42, hf3.g);
            waa.K(av8Var, m22, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C2, hf3.d);
            if (((Boolean) e1dVar.getValue()).booleanValue()) {
            }
            function13 = function12;
            i4 = i3;
            av8Var.d0(1628390063);
            av8Var.s(false);
            av8Var.d0(-640189858);
            g28 g28Var2 = bkh.c;
            tfiVar2 = tfiVar;
            if (tfiVar2 instanceof n2k) {
            }
            xtc p22 = n9e.p(g28Var2, v7bVar, null, 6);
            if (!gv9Var.isEmpty()) {
            }
            av8Var.s(false);
            dy0.b(p22, null, yqo.H(1179499177, av8Var, new fth(hthVar, e1dVar2, e1dVar3, q50Var192, function03, vfiVar2, e1dVar)), av8Var, 3072, 6);
            av8Var.s(true);
        } else {
            function13 = function12;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new el1(hthVar, function0, function02, function1, function03, function13, function04, i2);
        }
    }

    public static final void I(tbj tbjVar, of3 of3Var, int i2) {
        q80 k2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1436003720);
        int i3 = 4;
        int i4 = (av8Var.i(tbjVar) ? 4 : 2) | i2;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 3) != 2)) {
            q5b q5bVar = tbjVar.d;
            if (q5bVar == null || !((Boolean) ((eoh) q5bVar.o).getValue()).booleanValue() || (k2 = tbjVar.k()) == null || k2.b.length() <= 0) {
                av8Var.d0(-2111042550);
                av8Var.s(false);
            } else {
                av8Var.d0(-2112351432);
                boolean g2 = av8Var.g(tbjVar);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (g2 || O == a99Var) {
                    O = new pbj(tbjVar);
                    av8Var.n0(O);
                }
                b9j b9jVar = (b9j) O;
                kx4 kx4Var = (kx4) av8Var.k(dh3.h);
                nnd nndVar = tbjVar.b;
                long j2 = tbjVar.l().b;
                int i6 = pej.c;
                int v2 = nndVar.v((int) (j2 >> 32));
                q5b q5bVar2 = tbjVar.d;
                bej d2 = q5bVar2 != null ? q5bVar2.d() : null;
                d2.getClass();
                aej aejVar = d2.a;
                oqf c2 = aejVar.c(llf.c(v2, 0, aejVar.a.a.b.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((kx4Var.H0(2.0f) / 2.0f) + c2.a) << 32) | (4294967295L & Float.floatToRawIntBits(c2.d));
                boolean f2 = av8Var.f(floatToRawIntBits);
                Object O2 = av8Var.O();
                if (f2 || O2 == a99Var) {
                    O2 = new mt3(floatToRawIntBits);
                    av8Var.n0(O2);
                }
                pnd pndVar = (pnd) O2;
                boolean i7 = av8Var.i(b9jVar) | av8Var.i(tbjVar);
                Object O3 = av8Var.O();
                if (i7 || O3 == a99Var) {
                    O3 = new ot3(i5, b9jVar, tbjVar);
                    av8Var.n0(O3);
                }
                xtc a2 = koi.a(utc.a, b9jVar, (PointerInputEventHandler) O3);
                boolean f3 = av8Var.f(floatToRawIntBits);
                Object O4 = av8Var.O();
                if (f3 || O4 == a99Var) {
                    O4 = new yz(floatToRawIntBits, 10);
                    av8Var.n0(O4);
                }
                a00.a(pndVar, o3h.a(a2, false, (Function1) O4), 0L, av8Var, 0, 4);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new fv2(tbjVar, i2, i3);
        }
    }

    public static final void J(final gv9 gv9Var, final Function1 function1, final Function1 function12, final xtc xtcVar, final boolean z, final Integer num, final r13 r13Var, final String str, final String str2, final wla wlaVar, of3 of3Var, final int i2) {
        av8 av8Var;
        int i3;
        final pr4 pr4Var;
        gv9Var.getClass();
        function1.getClass();
        function12.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-773081254);
        int i4 = i2 | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024) | (av8Var2.h(z) ? 16384 : 8192) | (av8Var2.g(num) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.g(r13Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.g(str) ? 8388608 : 4194304) | (av8Var2.g(str2) ? 67108864 : 33554432) | (av8Var2.g(wlaVar) ? 536870912 : 268435456);
        if (av8Var2.T(i4 & 1, (306783379 & i4) != 306783378)) {
            int size = gv9Var.size() - 1;
            if (size < 0) {
                size = 0;
            }
            int i5 = i4 & 14;
            boolean z2 = i5 == 4;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                i3 = i4;
                O = new b61(4, gv9Var);
                av8Var2.n0(O);
            } else {
                i3 = i4;
            }
            pr4 b2 = c6e.b(size, (Function0) O, av8Var2, 0, 2);
            e1d g2 = e.g(gv9Var, av8Var2);
            Integer valueOf = Integer.valueOf(gv9Var.size());
            boolean g3 = (i5 == 4) | av8Var2.g(b2);
            Object O2 = av8Var2.O();
            rq3 rq3Var = null;
            if (g3 || O2 == a99Var) {
                O2 = new i3l(b2, gv9Var, rq3Var, 8);
                av8Var2.n0(O2);
            }
            hz8.o(av8Var2, valueOf, (Function2) O2);
            boolean g4 = av8Var2.g(b2) | av8Var2.g(g2) | ((i3 & 112) == 32);
            Object O3 = av8Var2.O();
            if (g4 || O3 == a99Var) {
                fdl fdlVar = new fdl(b2, function1, g2, rq3Var, 2);
                pr4Var = b2;
                av8Var2.n0(fdlVar);
                O3 = fdlVar;
            } else {
                pr4Var = b2;
            }
            hz8.o(av8Var2, pr4Var, (Function2) O3);
            xtc f0 = f0(bkh.d(xtcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var2, 6);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m2, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            utc utcVar = utc.a;
            xtc O4 = kda.O(c0(utcVar, 16.0f, 8.0f), "matchday_highlights_header", av8Var2);
            String v2 = oea.v(R.string.football_match_highlights, av8Var2);
            yf8 yf8Var = xth.a;
            udj.c(v2, O4, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 0, 0, 131064);
            av8Var = av8Var2;
            dy0.b(bkh.d(utcVar, 1.0f), null, yqo.H(1549541390, av8Var, new ct8() { // from class: jfl
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s22 s22Var = (s22) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    s22Var.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                    }
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 19) != 18)) {
                        float c2 = s22Var.c() - 48.0f;
                        a6e a6eVar = pr4Var;
                        int n2 = a6eVar.n();
                        int k2 = a6eVar.k();
                        f6a.a(a6eVar, bkh.d(utc.a, 1.0f), n2 <= 1 ? l98.B(24.0f, 2) : k2 == 0 ? l98.C(8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10) : k2 == n2 - 1 ? l98.C(40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10) : l98.B(24.0f, 2), new d5e(c2), 0, 8.0f, uxf.l, null, false, null, null, null, yqo.H(-1117633939, av8Var3, new yj7(gv9Var, z, num, r13Var, str, str2, function12, wlaVar)), av8Var3, 1769520, 24576, 16272);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            }), av8Var, 3078, 6);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(function1, function12, xtcVar, z, num, r13Var, str, str2, wlaVar, i2) { // from class: kfl
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ xtc d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Integer f;
                public final /* synthetic */ r13 g;
                public final /* synthetic */ String h;
                public final /* synthetic */ String i;
                public final /* synthetic */ wla j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    l98.J(gv9.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final float K(p3e p3eVar, ema emaVar) {
        return emaVar == ema.a ? p3eVar.c(emaVar) : p3eVar.b(emaVar);
    }

    public static final float L(p3e p3eVar, ema emaVar) {
        return emaVar == ema.a ? p3eVar.b(emaVar) : p3eVar.c(emaVar);
    }

    public static final String M(int i2) {
        return ljg.j(i2, "appWidget-");
    }

    public static void N(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (ra4 ra4Var : (Set) it2.next()) {
                        for (qx4 qx4Var : ra4Var.a.c) {
                            if (qx4Var.c == 0) {
                                Set<ra4> set = (Set) hashMap.get(new sa4(qx4Var.a, qx4Var.b == 2));
                                if (set != null) {
                                    for (ra4 ra4Var2 : set) {
                                        ra4Var.b.add(ra4Var2);
                                        ra4Var2.c.add(ra4Var);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    ra4 ra4Var3 = (ra4) it4.next();
                    if (ra4Var3.c.isEmpty()) {
                        hashSet2.add(ra4Var3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    ra4 ra4Var4 = (ra4) hashSet2.iterator().next();
                    hashSet2.remove(ra4Var4);
                    i2++;
                    Iterator it5 = ra4Var4.b.iterator();
                    while (it5.hasNext()) {
                        ra4 ra4Var5 = (ra4) it5.next();
                        ra4Var5.c.remove(ra4Var4);
                        if (ra4Var5.c.isEmpty()) {
                            hashSet2.add(ra4Var5);
                        }
                    }
                }
                if (i2 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    ra4 ra4Var6 = (ra4) it6.next();
                    if (!ra4Var6.c.isEmpty() && !ra4Var6.b.isEmpty()) {
                        arrayList2.add(ra4Var6.a);
                    }
                }
                throw new sx4("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 3);
            }
            kb3 kb3Var = (kb3) it.next();
            ra4 ra4Var7 = new ra4(kb3Var);
            for (oif oifVar : kb3Var.b) {
                boolean z = kb3Var.e == 0;
                sa4 sa4Var = new sa4(oifVar, !z);
                if (!hashMap.containsKey(sa4Var)) {
                    hashMap.put(sa4Var, new HashSet());
                }
                Set set2 = (Set) hashMap.get(sa4Var);
                if (!set2.isEmpty() && z) {
                    sw9.o(oifVar, ".", "Multiple components provide ");
                    return;
                }
                set2.add(ra4Var7);
            }
        }
    }

    public static final void O(q5b q5bVar) {
        jdj jdjVar = q5bVar.e;
        if (jdjVar != null) {
            q5bVar.v.invoke(wcj.a((wcj) q5bVar.d.b, null, 0L, 3));
            gdj gdjVar = jdjVar.a;
            AtomicReference atomicReference = gdjVar.b;
            while (true) {
                if (atomicReference.compareAndSet(jdjVar, null)) {
                    gdjVar.a.b();
                    break;
                } else if (atomicReference.get() != jdjVar) {
                    break;
                }
            }
        }
        q5bVar.e = null;
    }

    public static final Object P(pof pofVar, sq3 sq3Var) {
        int i2 = 1;
        lj2 lj2Var = new lj2(1, z9a.b(sq3Var));
        lj2Var.t();
        lj2Var.v(new yh2(pofVar, i2));
        pofVar.c(new ai2(lj2Var, i2));
        Object q2 = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q2;
    }

    public static final List Q(Bundle bundle, Function0 function0) {
        ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            int i2 = bundle.getInt("appWidgetMinHeight", 0);
            int i3 = bundle.getInt("appWidgetMaxHeight", 0);
            int i4 = bundle.getInt("appWidgetMinWidth", 0);
            int i5 = bundle.getInt("appWidgetMaxWidth", 0);
            return (i2 == 0 || i3 == 0 || i4 == 0 || i5 == 0) ? kotlin.collections.a.c(function0.invoke()) : b.j(new s75(hz8.i(i4, i3)), new s75(hz8.i(i5, i2)));
        }
        ArrayList arrayList = new ArrayList(k13.r(parcelableArrayList, 10));
        for (SizeF sizeF : parcelableArrayList) {
            arrayList.add(new s75(hz8.i(sizeF.getWidth(), sizeF.getHeight())));
        }
        return arrayList;
    }

    public static final ne8 R(ne8 ne8Var) {
        ne8 g2 = ((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).g();
        if (g2 == null || !g2.n) {
            return null;
        }
        return g2;
    }

    public static final oqf S(ne8 ne8Var) {
        wdd wddVar;
        if (ne8Var.n && (wddVar = ne8Var.h) != null) {
            dma y = o6a.y(wddVar);
            if (!y.f()) {
                y = null;
            }
            if (y != null) {
                return ne8Var.n1(y);
            }
        }
        return oqf.e;
    }

    public static final Object T(Context context, Class cls) {
        context.getClass();
        return fz8.Q(cls, pd0.s(context.getApplicationContext()));
    }

    public static Exception U(e0 e0Var, String str, Exception exc) {
        if (!(exc instanceof gy3)) {
            if (exc instanceof nx8) {
                return new nx8(e0Var, str);
            }
            throw new lr8();
        }
        String concat = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(e0Var.a);
        gy3 gy3Var = new gy3(str, concat);
        if (concat.length() > 0) {
            return gy3Var;
        }
        a70.p("type must not be empty");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0027, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ne8 V(ne8 ne8Var) {
        boolean z = ne8Var.a.n;
        if (z) {
            if (!z) {
                r3a.b("visitChildren called on an unattached node");
            }
            i1d i1dVar = new i1d(new wtc[16], 0);
            wtc wtcVar = ne8Var.a;
            wtc wtcVar2 = wtcVar.f;
            if (wtcVar2 == null) {
                c6o.x(i1dVar, wtcVar);
            } else {
                i1dVar.b(wtcVar2);
            }
            loop0: while (true) {
                int i2 = i1dVar.c;
                if (i2 == 0) {
                    break;
                }
                wtc wtcVar3 = (wtc) i1dVar.r(i2 - 1);
                if ((wtcVar3.d & 1024) == 0) {
                    c6o.x(i1dVar, wtcVar3);
                } else {
                    while (true) {
                        if (wtcVar3 == null) {
                            break;
                        }
                        if ((wtcVar3.c & 1024) != 0) {
                            i1d i1dVar2 = null;
                            while (wtcVar3 != null) {
                                if (wtcVar3 instanceof ne8) {
                                    ne8 ne8Var2 = (ne8) wtcVar3;
                                    if (ne8Var2.a.n) {
                                        int ordinal = ne8Var2.p1().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            zzl.b();
                                            return null;
                                        }
                                    }
                                } else if ((wtcVar3.c & 1024) != 0 && (wtcVar3 instanceof bw4)) {
                                    int i3 = 0;
                                    for (wtc wtcVar4 = ((bw4) wtcVar3).p; wtcVar4 != null; wtcVar4 = wtcVar4.f) {
                                        if ((wtcVar4.c & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                wtcVar3 = wtcVar4;
                                            } else {
                                                if (i1dVar2 == null) {
                                                    i1dVar2 = new i1d(new wtc[16], 0);
                                                }
                                                if (wtcVar3 != null) {
                                                    i1dVar2.b(wtcVar3);
                                                    wtcVar3 = null;
                                                }
                                                i1dVar2.b(wtcVar4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                wtcVar3 = c6o.X(i1dVar2);
                            }
                        } else {
                            wtcVar3 = wtcVar3.f;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final KSerializer W(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.getDescriptor().b() ? kSerializer : new uid(kSerializer);
    }

    public static vy8 X(vy8 vy8Var, Context context, int i2) {
        float f2 = (i2 & 2) != 0 ? 0.0f : 4.0f;
        float f3 = (i2 & 4) != 0 ? 0.0f : 4.0f;
        vy8Var.getClass();
        context.getClass();
        return z9.u(context) != hkg.c0(context) ? h5a.P(vy8Var, f3, f2) : h5a.P(vy8Var, f2, f3);
    }

    public static final boolean Y(ne8 ne8Var) {
        wma wmaVar;
        wdd wddVar;
        wma wmaVar2;
        wdd wddVar2 = ne8Var.h;
        return (wddVar2 == null || (wmaVar = wddVar2.o) == null || !wmaVar.I() || (wddVar = ne8Var.h) == null || (wmaVar2 = wddVar.o) == null || !wmaVar2.H()) ? false : true;
    }

    public static final void Z(q5b q5bVar, wcj wcjVar, nnd nndVar) {
        nnh w = bea.w();
        Function1 e2 = w != null ? w.e() : null;
        nnh C = bea.C(w);
        try {
            bej d2 = q5bVar.d();
            if (d2 == null) {
                return;
            }
            jdj jdjVar = q5bVar.e;
            if (jdjVar == null) {
                return;
            }
            dma c2 = q5bVar.c();
            if (c2 == null) {
                return;
            }
            aik.c0(wcjVar, q5bVar.a, d2.a, c2, jdjVar, q5bVar.b(), nndVar);
            Unit unit = Unit.a;
        } finally {
            bea.K(w, C, e2);
        }
    }

    public static final void a(axj axjVar, xtc xtcVar, Function1 function1, io ioVar, Function1 function12, tc3 tc3Var, of3 of3Var, int i2) {
        int i3;
        Function1 function13;
        av8 av8Var;
        r60 r60Var;
        SnapshotStateList snapshotStateList;
        r60 r60Var2;
        pwj pwjVar;
        boolean z;
        axj axjVar2 = axjVar;
        Function1 function14 = function1;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(511725103);
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(axjVar2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.i(function14) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var2.g(ioVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var2.i(function12) ? 16384 : 8192;
        }
        tc3 tc3Var2 = tc3Var;
        if ((196608 & i2) == 0) {
            i3 |= av8Var2.i(tc3Var2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if (av8Var2.T(i3 & 1, (74899 & i3) != 74898)) {
            ema emaVar = (ema) av8Var2.k(dh3.n);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object O = av8Var2.O();
            Object obj = nf3.a;
            if (z2 || O == obj) {
                O = new r60(axjVar2, ioVar, emaVar);
                av8Var2.n0(O);
            }
            r60 r60Var3 = (r60) O;
            boolean z3 = i4 == 4;
            Object O2 = av8Var2.O();
            Object obj2 = O2;
            if (z3 || O2 == obj) {
                Object[] objArr = {axjVar2.a.w()};
                SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                snapshotStateList2.addAll(ph0.X(objArr));
                av8Var2.n0(snapshotStateList2);
                obj2 = snapshotStateList2;
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) obj2;
            boolean z4 = i4 == 4;
            Object O3 = av8Var2.O();
            if (z4 || O3 == obj) {
                long[] jArr = qrg.a;
                O3 = new x0d();
                av8Var2.n0(O3);
            }
            x0d x0dVar = (x0d) O3;
            t01 t01Var = axjVar2.a;
            e1d e1dVar = axjVar2.d;
            if (!snapshotStateList3.contains(t01Var.w())) {
                snapshotStateList3.clear();
                snapshotStateList3.add(t01Var.w());
            }
            eoh eohVar = (eoh) e1dVar;
            if (Intrinsics.c(t01Var.w(), eohVar.getValue())) {
                if (snapshotStateList3.size() != 1 || !Intrinsics.c(snapshotStateList3.get(0), t01Var.w())) {
                    snapshotStateList3.clear();
                    snapshotStateList3.add(t01Var.w());
                }
                if (x0dVar.e != 1 || x0dVar.c(t01Var.w())) {
                    x0dVar.a();
                }
                r60Var3.b = ioVar;
                r60Var3.c = emaVar;
            }
            if (!Intrinsics.c(t01Var.w(), eohVar.getValue()) && !snapshotStateList3.contains(eohVar.getValue())) {
                ListIterator listIterator = snapshotStateList3.listIterator();
                int i5 = 0;
                while (true) {
                    hc9 hc9Var = (hc9) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (!hc9Var.hasNext()) {
                        i5 = -1;
                        break;
                    } else {
                        if (Intrinsics.c(function12.invoke(hc9Var.next()), function12.invoke(eohVar.getValue()))) {
                            break;
                        }
                        i5++;
                        listIterator = listIterator2;
                    }
                }
                if (i5 == -1) {
                    snapshotStateList3.add(eohVar.getValue());
                } else {
                    snapshotStateList3.set(i5, eohVar.getValue());
                }
            }
            if (x0dVar.c(eohVar.getValue()) && x0dVar.c(t01Var.w())) {
                av8Var2.d0(1968995539);
                av8Var2.s(false);
                function13 = function14;
                r60Var = r60Var3;
            } else {
                av8Var2.d0(1966410449);
                x0dVar.a();
                int size = snapshotStateList3.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj3 = snapshotStateList3.get(i6);
                    r60 r60Var4 = r60Var3;
                    x0dVar.m(obj3, yqo.H(-23915175, av8Var2, new g60(axjVar2, obj3, function14, r60Var4, snapshotStateList3, tc3Var2)));
                    r60Var3 = r60Var4;
                    i6++;
                    function14 = function14;
                    axjVar2 = axjVar;
                    tc3Var2 = tc3Var;
                }
                function13 = function14;
                r60Var = r60Var3;
                av8Var2.s(false);
            }
            boolean g2 = av8Var2.g(axjVar.f()) | av8Var2.g(r60Var);
            Object O4 = av8Var2.O();
            if (g2 || O4 == obj) {
                O4 = (pp3) function13.invoke(r60Var);
                av8Var2.n0(O4);
            }
            pp3 pp3Var = (pp3) O4;
            axj axjVar3 = r60Var.a;
            boolean g3 = av8Var2.g(r60Var);
            Object O5 = av8Var2.O();
            if (g3 || O5 == obj) {
                O5 = e.f(Boolean.FALSE);
                av8Var2.n0(O5);
            }
            e1d e1dVar2 = (e1d) O5;
            e1d g4 = e.g(pp3Var.d, av8Var2);
            if (Intrinsics.c(axjVar3.a.w(), ((eoh) axjVar3.d).getValue())) {
                e1dVar2.setValue(Boolean.FALSE);
            } else if (g4.getValue() != null) {
                e1dVar2.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) e1dVar2.getValue()).booleanValue();
            xtc xtcVar2 = utc.a;
            if (booleanValue) {
                av8Var2.d0(1353077497);
                r60 r60Var5 = r60Var;
                snapshotStateList = snapshotStateList3;
                av8Var = av8Var2;
                r60Var2 = r60Var5;
                pwjVar = yso.v(r60Var5.a, lz.m, null, av8Var, 0, 2);
                boolean g5 = av8Var.g(pwjVar);
                Object O6 = av8Var.O();
                if (g5 || O6 == obj) {
                    kkh kkhVar = (kkh) g4.getValue();
                    if (kkhVar == null || kkhVar.a) {
                        xtcVar2 = wnn.B(xtcVar2);
                    }
                    av8Var.n0(xtcVar2);
                    O6 = xtcVar2;
                }
                xtcVar2 = (xtc) O6;
                av8Var.s(false);
            } else {
                snapshotStateList = snapshotStateList3;
                av8Var = av8Var2;
                r60Var2 = r60Var;
                av8Var.d0(1353343539);
                av8Var.s(false);
                pwjVar = null;
                r60Var2.f = null;
            }
            xtc z5 = xtcVar.z(xtcVar2.z(new m60(pwjVar, g4, r60Var2)));
            Object O7 = av8Var.O();
            if (O7 == obj) {
                O7 = new j60(r60Var2);
                av8Var.n0(O7);
            }
            j60 j60Var = (j60) O7;
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, z5);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(function0);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, j60Var, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.C(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-860173498);
            int size2 = snapshotStateList.size();
            int i7 = 0;
            while (i7 < size2) {
                SnapshotStateList snapshotStateList4 = snapshotStateList;
                Object obj4 = snapshotStateList4.get(i7);
                av8Var.a0(-2026002954, function12.invoke(obj4));
                Function2 function2 = (Function2) x0dVar.g(obj4);
                if (function2 == null) {
                    av8Var.d0(1618454323);
                    z = false;
                } else {
                    z = false;
                    av8Var.d0(-2026001778);
                    function2.invoke(av8Var, 0);
                }
                av8Var.s(z);
                av8Var.s(z);
                i7++;
                snapshotStateList = snapshotStateList4;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            function13 = function14;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new h60(axjVar, xtcVar, function13, ioVar, function12, tc3Var, i2);
        }
    }

    public static final xtc a0(xtc xtcVar, p3e p3eVar) {
        return xtcVar.z(new s3e(p3eVar, new etd(13)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Object obj, xtc xtcVar, Function1 function1, io ioVar, String str, Function1 function12, tc3 tc3Var, of3 of3Var, int i2, int i3) {
        int i4;
        int i5;
        Function1 function13;
        int i6;
        io ioVar2;
        int i7;
        int i8;
        xtc xtcVar2;
        Function1 function14;
        Function1 function15;
        io ioVar3;
        String str2;
        eqf u2;
        int i9;
        Function1 function16;
        Function1 function17;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1501828832);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? av8Var.g(obj) : av8Var.i(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= av8Var.g(xtcVar) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                function13 = function1;
                i4 |= av8Var.i(function13) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    ioVar2 = ioVar;
                    i4 |= av8Var.g(ioVar2) ? a.o : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i4 |= av8Var.g(str) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((196608 & i2) == 0) {
                            i4 |= av8Var.i(function12) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            if ((1572864 & i2) == 0) {
                                i4 |= av8Var.i(tc3Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                            }
                            if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
                                av8Var.W();
                                xtcVar2 = xtcVar;
                                function14 = function12;
                                function15 = function13;
                                ioVar3 = ioVar2;
                                str2 = str;
                            } else {
                                xtc xtcVar3 = i10 != 0 ? utc.a : xtcVar;
                                Object obj2 = nf3.a;
                                if (i5 != 0) {
                                    Object O = av8Var.O();
                                    if (O == obj2) {
                                        O = ry.w;
                                        av8Var.n0(O);
                                    }
                                    function16 = (Function1) O;
                                    i9 = i8;
                                } else {
                                    i9 = i8;
                                    function16 = function13;
                                }
                                io ioVar4 = i6 != 0 ? uxf.c : ioVar2;
                                str2 = i7 != 0 ? "AnimatedContent" : str;
                                if (i9 != 0) {
                                    Object O2 = av8Var.O();
                                    if (O2 == obj2) {
                                        O2 = ry.x;
                                        av8Var.n0(O2);
                                    }
                                    function17 = (Function1) O2;
                                } else {
                                    function17 = function12;
                                }
                                axj L = yso.L(obj, str2, av8Var, (i4 & 14) | ((i4 >> 9) & 112), 0);
                                int i11 = i4 & 8176;
                                int i12 = i4 >> 3;
                                a(L, xtcVar3, function16, ioVar4, function17, tc3Var, av8Var, i11 | (57344 & i12) | (i12 & 458752));
                                xtcVar2 = xtcVar3;
                                function15 = function16;
                                ioVar3 = ioVar4;
                                function14 = function17;
                            }
                            u2 = av8Var.u();
                            if (u2 == null) {
                                u2.d = new d60(obj, xtcVar2, function15, ioVar3, str2, function14, tc3Var, i2, i3);
                                return;
                            }
                            return;
                        }
                        if ((1572864 & i2) == 0) {
                        }
                        if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
                        }
                        u2 = av8Var.u();
                        if (u2 == null) {
                        }
                    }
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((1572864 & i2) == 0) {
                    }
                    if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
                    }
                    u2 = av8Var.u();
                    if (u2 == null) {
                    }
                }
                ioVar2 = ioVar;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((1572864 & i2) == 0) {
                }
                if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
                }
                u2 = av8Var.u();
                if (u2 == null) {
                }
            }
            function13 = function1;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            ioVar2 = ioVar;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
            }
            u2 = av8Var.u();
            if (u2 == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function13 = function1;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        ioVar2 = ioVar;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static final xtc b0(xtc xtcVar, float f2) {
        return xtcVar.z(new m3e(f2, f2, f2, f2, new etd(12)));
    }

    public static final htf c(KClass kClass, KSerializer kSerializer) {
        kClass.getClass();
        kSerializer.getClass();
        return new htf(kClass, kSerializer);
    }

    public static final xtc c0(xtc xtcVar, float f2, float f3) {
        return xtcVar.z(new m3e(f2, f3, f2, f3, new etd(11)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [r9k] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v5, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r7v7, types: [av8] */
    /* JADX WARN: Type inference failed for: r7v8, types: [av8, of3] */
    public static final void d(en1 en1Var, xtc xtcVar, of3 of3Var, int i2) {
        en1 en1Var2;
        xtc xtcVar2;
        av8 av8Var;
        Integer num;
        gv9 gv9Var;
        f50 f50Var;
        ?? r1;
        ff3 ff3Var;
        ry ryVar;
        f50 f50Var2;
        zg3 zg3Var;
        f50 f50Var3;
        q9k q9kVar;
        p4h p4hVar;
        kv1 kv1Var;
        float f2;
        float f3;
        ?? r7;
        zg3 zg3Var2;
        lv1 lv1Var;
        ff3 ff3Var2;
        ry ryVar2;
        zg3 zg3Var3;
        f50 f50Var4;
        f50 f50Var5;
        f50 f50Var6;
        utc utcVar;
        ?? r72;
        boolean z;
        av8 av8Var2;
        boolean z2;
        long j2;
        boolean z3;
        en1Var.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-867150865);
        int i3 = i2 | (av8Var3.g(en1Var) ? 4 : 2) | 48;
        if (av8Var3.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar2 = utc.a;
            xtc d2 = bkh.d(utcVar2, 1.0f);
            p4h p4hVar2 = ww9.d;
            kv1 kv1Var2 = uxf.o;
            u23 a2 = t23.a(p4hVar2, kv1Var2, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C = fqj.C(av8Var3, d2);
            if3.k7.getClass();
            zg3 zg3Var4 = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var4);
            } else {
                av8Var3.q0();
            }
            f50 f50Var7 = hf3.g;
            waa.K(av8Var3, a2, f50Var7);
            ff3 ff3Var3 = hf3.f;
            waa.K(av8Var3, m2, ff3Var3);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var8 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var8);
            ry ryVar3 = hf3.k;
            waa.J(av8Var3, ryVar3);
            f50 f50Var9 = hf3.d;
            waa.K(av8Var3, C, f50Var9);
            q9k q9kVar2 = en1Var.a;
            Integer num2 = en1Var.d;
            q9k q9kVar3 = en1Var.b;
            gv9 gv9Var2 = en1Var.f;
            if (q9kVar2 == null) {
                av8Var3.d0(1761693755);
                av8Var3.s(false);
                f50Var = f50Var9;
                f2 = 8.0f;
                r1 = 0;
                f3 = 16.0f;
                ff3Var = ff3Var3;
                ryVar = ryVar3;
                f50Var2 = f50Var8;
                zg3Var = zg3Var4;
                f50Var3 = f50Var7;
                num = num2;
                q9kVar = q9kVar3;
                gv9Var = gv9Var2;
                p4hVar = p4hVar2;
                kv1Var = kv1Var2;
                r7 = av8Var3;
            } else {
                av8Var3.d0(1761693756);
                String a3 = q9kVar2.a(av8Var3);
                yf8 yf8Var = xth.a;
                num = num2;
                gv9Var = gv9Var2;
                f50Var = f50Var9;
                r1 = 0;
                ff3Var = ff3Var3;
                ryVar = ryVar3;
                f50Var2 = f50Var8;
                zg3Var = zg3Var4;
                f50Var3 = f50Var7;
                q9kVar = q9kVar3;
                p4hVar = p4hVar2;
                kv1Var = kv1Var2;
                udj.c(a3, e0(utcVar2, 16.0f, 16.0f, 16.0f, 8.0f), Intrinsics.c(en1Var.c, Boolean.TRUE) ? ljg.f(av8Var3, -1021585857, R.color.error, av8Var3, false) : ljg.f(av8Var3, -1021585346, R.color.n_lv_1, av8Var3, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var3, 0, 0, 131064);
                av8 av8Var4 = av8Var3;
                Unit unit = Unit.a;
                av8Var4.s(false);
                utcVar2 = utcVar2;
                f2 = 8.0f;
                f3 = 16.0f;
                r7 = av8Var4;
            }
            xtc c0 = c0(utcVar2, f3, f2);
            lv1 lv1Var2 = uxf.m;
            l8g a4 = k8g.a(ww9.b, lv1Var2, r7, 48);
            int hashCode2 = Long.hashCode(r7.T);
            aee m3 = r7.m();
            xtc C2 = fqj.C(r7, c0);
            r7.h0();
            if (r7.S) {
                zg3Var2 = zg3Var;
                r7.l(zg3Var2);
            } else {
                zg3Var2 = zg3Var;
                r7.q0();
            }
            f50 f50Var10 = f50Var3;
            waa.K(r7, a4, f50Var10);
            ff3 ff3Var4 = ff3Var;
            waa.K(r7, m3, ff3Var4);
            f50 f50Var11 = f50Var2;
            ry ryVar4 = ryVar;
            bf3.s(hashCode2, r7, f50Var11, r7, ryVar4);
            f50 f50Var12 = f50Var;
            goa g2 = ljg.g(r7, C2, f50Var12, 1.0f, true);
            u23 a5 = t23.a(p4hVar, kv1Var, r7, r1);
            int hashCode3 = Long.hashCode(r7.T);
            aee m4 = r7.m();
            xtc C3 = fqj.C(r7, g2);
            r7.h0();
            if (r7.S) {
                r7.l(zg3Var2);
            } else {
                r7.q0();
            }
            waa.K(r7, a5, f50Var10);
            waa.K(r7, m4, ff3Var4);
            bf3.s(hashCode3, r7, f50Var11, r7, ryVar4);
            waa.K(r7, C3, f50Var12);
            ?? r3 = q9kVar;
            if (r3 == 0) {
                r7.d0(-1672865001);
                r7.s(r1);
                lv1Var = lv1Var2;
                utcVar = utcVar2;
                ff3Var2 = ff3Var4;
                f50Var6 = f50Var12;
                f50Var5 = f50Var11;
                zg3Var3 = zg3Var2;
                f50Var4 = f50Var10;
                ryVar2 = ryVar4;
                r72 = r7;
            } else {
                r7.d0(-1672865000);
                String a6 = r3.a(r7);
                yf8 yf8Var2 = xth.a;
                of3 of3Var2 = r7;
                lv1Var = lv1Var2;
                ff3Var2 = ff3Var4;
                ryVar2 = ryVar4;
                zg3Var3 = zg3Var2;
                f50Var4 = f50Var10;
                f50Var5 = f50Var11;
                f50Var6 = f50Var12;
                utcVar = utcVar2;
                udj.c(a6, null, lz.D(R.color.n_lv_1, r7), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), of3Var2, 0, 24960, 110586);
                ?? r73 = of3Var2;
                Unit unit2 = Unit.a;
                r73.s(r1);
                r72 = r73;
            }
            int i4 = 6;
            if (gv9Var.isEmpty()) {
                xtcVar2 = utcVar;
                z = true;
                r72.d0(-1671110493);
                r72.s(r1);
                z2 = r1;
                av8Var2 = r72;
            } else {
                r72.d0(-1672447244);
                xtcVar2 = utcVar;
                nq8.h(r72, bkh.e(xtcVar2, 2.0f));
                ?? r12 = 1;
                l8g a7 = k8g.a(new ng0(4.0f, true, new a70(i4)), lv1Var, r72, 54);
                int hashCode4 = Long.hashCode(r72.T);
                aee m5 = r72.m();
                xtc C4 = fqj.C(r72, xtcVar2);
                r72.h0();
                if (r72.S) {
                    r72.l(zg3Var3);
                } else {
                    r72.q0();
                }
                waa.K(r72, a7, f50Var4);
                waa.K(r72, m5, ff3Var2);
                bf3.s(hashCode4, r72, f50Var5, r72, ryVar2);
                gv9 gv9Var3 = gv9Var;
                Iterator p2 = ljg.p(r72, C4, f50Var6, 1238261044, gv9Var3);
                int i5 = r1;
                boolean z4 = r1;
                av8 av8Var5 = r72;
                while (p2.hasNext()) {
                    Object next = p2.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    fn1 fn1Var = (fn1) next;
                    kq9.b(s6a.N(fn1Var.a, i4, av8Var5), null, bkh.l(xtcVar2, 16.0f), lz.D(R.color.n_lv_3, av8Var5), av8Var5, 432, 0);
                    String str = fn1Var.b;
                    yf8 yf8Var3 = xth.a;
                    av8 av8Var6 = av8Var5;
                    xtc xtcVar3 = xtcVar2;
                    int i7 = r12;
                    gv9 gv9Var4 = gv9Var3;
                    int i8 = i5;
                    udj.c(str, null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var6, 0, 24960, 110586);
                    av8 av8Var7 = av8Var6;
                    if (i8 != gv9Var4.size() - i7) {
                        av8Var7.d0(1254603294);
                        xtcVar2 = xtcVar3;
                        td4.N(bkh.e(xtcVar2, 12.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_3, av8Var7), av8Var7, 6, 2);
                        av8Var7 = av8Var7;
                        z3 = false;
                        av8Var7.s(false);
                    } else {
                        xtcVar2 = xtcVar3;
                        z3 = false;
                        av8Var7.d0(1254801229);
                        av8Var7.s(false);
                    }
                    i4 = 6;
                    r12 = i7;
                    i5 = i6;
                    gv9Var3 = gv9Var4;
                    z4 = z3;
                    av8Var5 = av8Var7;
                }
                boolean z5 = r12;
                ljg.t(av8Var5, z4, z5, z4);
                z = z5;
                z2 = z4;
                av8Var2 = av8Var5;
            }
            av8Var2.s(z);
            if (num == null) {
                av8Var2.d0(-271367904);
                av8Var2.s(z2);
                en1Var2 = en1Var;
            } else {
                av8Var2.d0(-271367903);
                ImageVector N = s6a.N(num.intValue(), 6, av8Var2);
                en1Var2 = en1Var;
                if (en1Var2.e) {
                    j2 = ljg.f(av8Var2, 963339014, R.color.primary_default, av8Var2, z2);
                } else {
                    av8Var2.d0(963339998);
                    av8Var2.s(z2);
                    j2 = r13.i;
                }
                kq9.b(N, null, bkh.l(xtcVar2, 32.0f), j2, av8Var2, 432, 0);
                Unit unit3 = Unit.a;
                av8Var2.s(z2);
            }
            av8Var2.s(z);
            av8Var2.s(z);
            av8Var = av8Var2;
        } else {
            en1Var2 = en1Var;
            av8Var3.W();
            xtcVar2 = xtcVar;
            av8Var = av8Var3;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new vn6(en1Var2, xtcVar2, i2, 16);
        }
    }

    public static xtc d0(xtc xtcVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return c0(xtcVar, f2, f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0486, code lost:
    
        if (r5 > ((r7 != null ? r7.longValue() : 0) + 5000)) goto L237;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x063e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0738 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0792 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x082f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x087d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0421  */
    /* JADX WARN: Type inference failed for: r15v5, types: [av8, of3] */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v31, types: [xtc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final wcj wcjVar, final Function1 function1, final xtc xtcVar, final dfj dfjVar, final jwk jwkVar, final Function1 function12, final wzc wzcVar, final pvh pvhVar, final boolean z, final int i2, final int i3, final qu9 qu9Var, final ija ijaVar, final boolean z2, final boolean z3, final tc3 tc3Var, of3 of3Var, final int i4, final int i5) {
        int i6;
        int i7;
        av8 av8Var;
        i10 i10Var;
        int i8;
        mbj mbjVar;
        int i9;
        gwj gwjVar;
        wd8 wd8Var;
        s8l s8lVar;
        Object obj;
        boolean z4;
        av8 av8Var2;
        kx4 kx4Var;
        sf8 sf8Var;
        nnd nndVar;
        Object q5bVar;
        q80 q80Var;
        dfj dfjVar2;
        boolean z5;
        boolean z6;
        wd8 wd8Var2;
        wcj a2;
        Object O;
        Object obj2;
        final aak aakVar;
        Object O2;
        Object O3;
        Object O4;
        int i10;
        int i11;
        qu9 qu9Var2;
        boolean z7;
        boolean z8;
        boolean i12;
        Object obj3;
        ce8 ce8Var;
        final q5b q5bVar2;
        wd8 wd8Var3;
        int i13;
        Object obj4;
        t32 t32Var;
        nnd nndVar2;
        tbj tbjVar;
        wcj wcjVar2;
        ku3 ku3Var;
        boolean z9;
        gdj gdjVar;
        qu9 qu9Var3;
        q5b q5bVar3;
        boolean z10;
        boolean z11;
        Object h10Var;
        tbj tbjVar2;
        Unit unit;
        ku3 ku3Var2;
        nnd nndVar3;
        xtc xtcVar2;
        q5b q5bVar4;
        utc utcVar;
        ce8 ce8Var2;
        wzc wzcVar2;
        gdj gdjVar2;
        nnd nndVar4;
        s8l s8lVar2;
        boolean g2;
        Object O5;
        s8l s8lVar3;
        final q5b q5bVar5;
        nnd nndVar5;
        utc utcVar2;
        boolean i14;
        Object O6;
        boolean i15;
        Object O7;
        qu9 qu9Var4;
        boolean z12;
        boolean h2;
        Object O8;
        n52 pvhVar2;
        boolean i16;
        Object O9;
        int i17;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(31062401);
        if ((i4 & 6) == 0) {
            i6 = i4 | (av8Var3.g(wcjVar) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= av8Var3.i(function1) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= av8Var3.g(xtcVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= av8Var3.g(dfjVar) ? a.o : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= av8Var3.g(jwkVar) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= av8Var3.i(function12) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= av8Var3.g(wzcVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= av8Var3.g(pvhVar) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= av8Var3.h(z) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= av8Var3.e(i2) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (av8Var3.e(i3) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= av8Var3.g(qu9Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= av8Var3.g(ijaVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= av8Var3.h(z2) ? a.o : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= av8Var3.h(z3) ? 16384 : 8192;
        }
        if ((i5 & 196608) == 0) {
            i7 |= av8Var3.i(tc3Var) ? 131072 : 65536;
        }
        int i18 = i7 | 1572864;
        if (av8Var3.T(i6 & 1, ((i6 & 306783379) == 306783378 && (599187 & i18) == 599186) ? false : true)) {
            av8Var3.Y();
            if ((i4 & 1) != 0 && !av8Var3.B()) {
                av8Var3.W();
            }
            av8Var3.t();
            Object O10 = av8Var3.O();
            Object obj5 = nf3.a;
            if (O10 == obj5) {
                O10 = new ce8();
                av8Var3.n0(O10);
            }
            ce8 ce8Var3 = (ce8) O10;
            Object O11 = av8Var3.O();
            if (O11 == obj5) {
                m5b m5bVar = n5b.a;
                O11 = new i10();
                av8Var3.n0(O11);
            }
            i10 i10Var2 = (i10) O11;
            Object O12 = av8Var3.O();
            if (O12 == obj5) {
                O12 = new gdj(i10Var2);
                av8Var3.n0(O12);
            }
            final gdj gdjVar3 = (gdj) O12;
            kx4 kx4Var2 = (kx4) av8Var3.k(dh3.h);
            sf8 sf8Var2 = (sf8) av8Var3.k(dh3.k);
            long j2 = ((wej) av8Var3.k(xej.a)).b;
            wd8 wd8Var4 = (wd8) av8Var3.k(dh3.i);
            s8l s8lVar4 = (s8l) av8Var3.k(dh3.u);
            mvh mvhVar = (mvh) av8Var3.k(dh3.q);
            ewd ewdVar = (i2 == 1 && !z && qu9Var.a) ? ewd.b : ewd.a;
            av8Var3.d0(-213744626);
            Object[] objArr = {ewdVar};
            y3g y3gVar = mbj.g;
            boolean e2 = av8Var3.e(ewdVar.ordinal());
            Object O13 = av8Var3.O();
            if (e2 || O13 == obj5) {
                i10Var = i10Var2;
                O13 = new h63(ewdVar, 6);
                av8Var3.n0(O13);
            } else {
                i10Var = i10Var2;
            }
            mbj mbjVar2 = (mbj) o3a.M(objArr, y3gVar, (Function0) O13, av8Var3, 0);
            av8Var3.s(false);
            if (((ewd) ((eoh) mbjVar2.f).getValue()) != ewdVar) {
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(ewdVar == ewd.a ? "only single-line, non-wrap text fields can scroll horizontally" : "single-line, non-wrap text fields can only scroll horizontally"));
            }
            int i19 = i6 & 14;
            boolean z13 = ((i6 & 57344) == 16384) | (i19 == 4);
            Object O14 = av8Var3.O();
            if (z13 || O14 == obj5) {
                gwj a3 = ckk.a(jwkVar, wcjVar.a);
                nnd nndVar6 = a3.b;
                pej pejVar = wcjVar.c;
                if (pejVar != null) {
                    i8 = i19;
                    long j3 = pejVar.a;
                    int i20 = pej.c;
                    int v2 = nndVar6.v((int) (j3 >> 32));
                    int v3 = nndVar6.v((int) (j3 & 4294967295L));
                    int min = Math.min(v2, v3);
                    int max = Math.max(v2, v3);
                    o80 o80Var = new o80(a3.a);
                    o80Var.a(new pwh(0L, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, v8j.c, (qah) null, 61439), min, max);
                    O14 = new gwj(o80Var.h(), nndVar6);
                } else {
                    i8 = i19;
                    O14 = a3;
                }
                av8Var3.n0(O14);
            } else {
                i8 = i19;
            }
            gwj gwjVar2 = (gwj) O14;
            q80 q80Var2 = gwjVar2.a;
            nnd nndVar7 = gwjVar2.b;
            eqf A = av8Var3.A();
            if (A == null) {
                a70.r("no recompose scope found");
                return;
            }
            A.b |= 1;
            boolean g3 = av8Var3.g(mvhVar);
            Object O15 = av8Var3.O();
            if (g3 || O15 == obj5) {
                mbjVar = mbjVar2;
                i9 = i18;
                gwjVar = gwjVar2;
                wd8Var = wd8Var4;
                s8lVar = s8lVar4;
                obj = obj5;
                z4 = z;
                av8Var2 = av8Var3;
                kx4Var = kx4Var2;
                sf8Var = sf8Var2;
                nndVar = nndVar7;
                q80Var = q80Var2;
                dfjVar2 = dfjVar;
                q5bVar = new q5b(new z05(q80Var, dfjVar2, z4, kx4Var, sf8Var, km5.a), A, mvhVar);
                av8Var2.n0(q5bVar);
            } else {
                obj = obj5;
                mbjVar = mbjVar2;
                i9 = i18;
                gwjVar = gwjVar2;
                kx4Var = kx4Var2;
                wd8Var = wd8Var4;
                s8lVar = s8lVar4;
                z4 = z;
                av8Var2 = av8Var3;
                nndVar = nndVar7;
                sf8Var = sf8Var2;
                q5bVar = O15;
                q80Var = q80Var2;
                dfjVar2 = dfjVar;
            }
            q5b q5bVar6 = (q5b) q5bVar;
            q80 q80Var3 = wcjVar.a;
            ?? r15 = av8Var2;
            long j4 = wcjVar.b;
            q5bVar6.u = function1;
            q5bVar6.z = j2;
            gja gjaVar = q5bVar6.r;
            gjaVar.b = ijaVar;
            gjaVar.c = wd8Var;
            q5bVar6.j = q80Var3;
            z05 z05Var = q5bVar6.a;
            km5 km5Var = km5.a;
            z05 z05Var2 = (Intrinsics.c((q80) z05Var.b, q80Var) && Intrinsics.c((dfj) z05Var.c, dfjVar2) && z05Var.a == z4 && Intrinsics.c((kx4) z05Var.d, kx4Var) && Intrinsics.c((List) z05Var.f, km5Var) && ((sf8) z05Var.e) == sf8Var) ? z05Var : new z05(q80Var, dfjVar2, z4, kx4Var, sf8Var, km5Var);
            dfj dfjVar3 = dfjVar2;
            final kx4 kx4Var3 = kx4Var;
            if (q5bVar6.a != z05Var2) {
                q5bVar6.p = true;
            }
            q5bVar6.a = z05Var2;
            fp4 fp4Var = q5bVar6.d;
            jdj jdjVar = q5bVar6.e;
            fp4Var.getClass();
            pej pejVar2 = wcjVar.c;
            boolean c2 = Intrinsics.c(pejVar2, ((xl0) fp4Var.c).e());
            String str = ((wcj) fp4Var.b).a.b;
            q80 q80Var4 = wcjVar.a;
            if (!Intrinsics.c(str, q80Var4.b)) {
                fp4Var.c = new xl0(q80Var4, j4);
                z5 = true;
            } else if (pej.c(((wcj) fp4Var.b).b, j4)) {
                z5 = false;
            } else {
                ((xl0) fp4Var.c).j(pej.g(j4), pej.f(j4));
                z5 = false;
                z6 = true;
                if (pejVar2 != null) {
                    xl0 xl0Var = (xl0) fp4Var.c;
                    xl0Var.d = -1;
                    xl0Var.e = -1;
                } else {
                    long j5 = pejVar2.a;
                    if (!pej.d(j5)) {
                        wd8Var2 = wd8Var;
                        ((xl0) fp4Var.c).i(pej.g(j5), pej.f(j5));
                        if (z5 && (z6 || c2)) {
                            a2 = wcjVar;
                        } else {
                            xl0 xl0Var2 = (xl0) fp4Var.c;
                            xl0Var2.d = -1;
                            xl0Var2.e = -1;
                            a2 = wcj.a(wcjVar, null, 0L, 3);
                        }
                        wcj wcjVar3 = (wcj) fp4Var.b;
                        fp4Var.b = a2;
                        if (jdjVar != null) {
                            jdjVar.a(wcjVar3, a2);
                        }
                        O = r15.O();
                        obj2 = obj;
                        if (O == obj2) {
                            O = new aak();
                            r15.n0(O);
                        }
                        aakVar = (aak) O;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!aakVar.e) {
                            Long l2 = aakVar.d;
                        }
                        aakVar.d = Long.valueOf(currentTimeMillis);
                        aakVar.a(wcjVar);
                        O2 = r15.O();
                        if (O2 == obj2) {
                            O2 = hz8.G(g.a, r15);
                            r15.n0(O2);
                        }
                        final ku3 ku3Var3 = (ku3) O2;
                        O3 = r15.O();
                        if (O3 == obj2) {
                            O3 = new t32();
                            r15.n0(O3);
                        }
                        final t32 t32Var2 = (t32) O3;
                        O4 = r15.O();
                        if (O4 == obj2) {
                            O4 = new tbj(aakVar);
                            r15.n0(O4);
                        }
                        final tbj tbjVar3 = (tbj) O4;
                        final nnd nndVar8 = nndVar;
                        tbjVar3.b = nndVar8;
                        tbjVar3.c = q5bVar6.v;
                        tbjVar3.d = q5bVar6;
                        ((eoh) tbjVar3.e).setValue(wcjVar);
                        tbjVar3.v = new pej(j4);
                        tbjVar3.g = (iy2) r15.k(dh3.f);
                        tbjVar3.h = ku3Var3;
                        tbjVar3.j = (z69) r15.k(dh3.l);
                        tbjVar3.k = ce8Var3;
                        final boolean z14 = !z3;
                        ((eoh) tbjVar3.l).setValue(Boolean.valueOf(z14));
                        ((eoh) tbjVar3.m).setValue(Boolean.valueOf(z2));
                        r15.d0(1966756105);
                        u2h u2hVar = u2h.a;
                        tbjVar3.i = lje.b(dfjVar3.a.k, r15);
                        r15.s(false);
                        q5bVar6.b();
                        i10 = i9;
                        int i21 = i10 & 7168;
                        int i22 = i8;
                        boolean i23 = (i21 == 2048) | r15.i(q5bVar6) | ((i10 & 57344) == 16384) | r15.i(gdjVar3) | (i22 == 4);
                        i11 = (i10 & 112) ^ 48;
                        if (i11 > 32) {
                            qu9Var2 = qu9Var;
                            if (r15.g(qu9Var2)) {
                                z7 = i23;
                                z8 = true;
                                i12 = z7 | z8 | r15.i(nndVar8) | r15.i(ku3Var3) | r15.i(t32Var2) | r15.i(tbjVar3);
                                Object O16 = r15.O();
                                if (!i12 || O16 == obj2) {
                                    final qu9 qu9Var5 = qu9Var2;
                                    ce8Var = ce8Var3;
                                    q5bVar2 = q5bVar6;
                                    wd8Var3 = wd8Var2;
                                    i13 = i22;
                                    obj4 = obj2;
                                    obj3 = new Function1() { // from class: jt3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            bej d2;
                                            ie8 ie8Var = (ie8) obj6;
                                            q5b q5bVar7 = q5b.this;
                                            if (q5bVar7.b() == ie8Var.g()) {
                                                return Unit.a;
                                            }
                                            ((eoh) q5bVar7.f).setValue(Boolean.valueOf(ie8Var.g()));
                                            boolean b2 = q5bVar7.b();
                                            wcj wcjVar4 = wcjVar;
                                            nnd nndVar9 = nndVar8;
                                            if (b2 && z2 && !z3) {
                                                l98.i0(gdjVar3, q5bVar7, wcjVar4, qu9Var5, nndVar9);
                                            } else {
                                                l98.O(q5bVar7);
                                            }
                                            if (ie8Var.g() && (d2 = q5bVar7.d()) != null) {
                                                xw3.L(ku3Var3, null, null, new h10(t32Var2, wcjVar4, q5bVar7, d2, nndVar9, null, 3), 3);
                                            }
                                            if (!ie8Var.g()) {
                                                tbjVar3.d(null);
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    t32Var = t32Var2;
                                    nndVar2 = nndVar8;
                                    tbjVar = tbjVar3;
                                    wcjVar2 = wcjVar;
                                    ku3Var = ku3Var3;
                                    z9 = z2;
                                    gdjVar = gdjVar3;
                                    qu9Var3 = qu9Var5;
                                    r15.n0(obj3);
                                } else {
                                    obj3 = O16;
                                    gdjVar = gdjVar3;
                                    t32Var = t32Var2;
                                    q5bVar2 = q5bVar6;
                                    wd8Var3 = wd8Var2;
                                    wcjVar2 = wcjVar;
                                    nndVar2 = nndVar8;
                                    i13 = i22;
                                    obj4 = obj2;
                                    qu9Var3 = qu9Var2;
                                    ce8Var = ce8Var3;
                                    tbjVar = tbjVar3;
                                    ku3Var = ku3Var3;
                                    z9 = z2;
                                }
                                utc utcVar3 = utc.a;
                                xtc r2 = pd0.r(kik.L(lz.G(utcVar3, ce8Var), (Function1) obj3), z9, wzcVar);
                                e1d g4 = e.g(Boolean.valueOf((z9 || z3) ? false : true), r15);
                                Unit unit2 = Unit.a;
                                boolean g5 = r15.g(g4) | r15.i(q5bVar2) | r15.i(gdjVar) | r15.i(tbjVar);
                                if (i11 > 32 || !r15.g(qu9Var3)) {
                                    q5bVar3 = q5bVar2;
                                    if ((i10 & 48) != 32) {
                                        z10 = false;
                                        z11 = g5 | z10;
                                        Object O17 = r15.O();
                                        if (!z11 || O17 == obj4) {
                                            tbjVar2 = tbjVar;
                                            unit = unit2;
                                            ku3Var2 = ku3Var;
                                            nndVar3 = nndVar2;
                                            xtcVar2 = r2;
                                            q5bVar4 = q5bVar3;
                                            utcVar = utcVar3;
                                            ce8Var2 = ce8Var;
                                            wzcVar2 = wzcVar;
                                            gdj gdjVar4 = gdjVar;
                                            h10Var = new h10(q5bVar4, g4, gdjVar4, tbjVar2, qu9Var, null, 2);
                                            gdjVar2 = gdjVar4;
                                            r15.n0(h10Var);
                                        } else {
                                            h10Var = O17;
                                            ku3Var2 = ku3Var;
                                            unit = unit2;
                                            tbjVar2 = tbjVar;
                                            nndVar3 = nndVar2;
                                            xtcVar2 = r2;
                                            q5bVar4 = q5bVar3;
                                            gdjVar2 = gdjVar;
                                            utcVar = utcVar3;
                                            ce8Var2 = ce8Var;
                                            wzcVar2 = wzcVar;
                                        }
                                        hz8.o(r15, unit, (Function2) h10Var);
                                        int i24 = 4;
                                        xtc a4 = koi.a(utcVar, 8675309, new m00(new gt3(q5bVar4, i24), i24));
                                        final tbj tbjVar4 = tbjVar2;
                                        nndVar4 = nndVar3;
                                        rrh rrhVar = new rrh(q5bVar4, ce8Var2, z3, z2, tbjVar4, nndVar4);
                                        if (z2) {
                                            a4 = fqj.q(a4, new e6i(11, rrhVar, wzcVar2));
                                        }
                                        xtc b2 = koi.b(a4, tbjVar4.z, tbjVar4.y, new m00(tbjVar4, 8));
                                        kze.a.getClass();
                                        xtc w = sea.w(b2, n9e.f);
                                        final xtc X = td4.X(utcVar, new fa(13, q5bVar4, wcjVar2, nndVar4));
                                        boolean i25 = r15.i(q5bVar4) | (i21 != 2048);
                                        s8lVar2 = s8lVar;
                                        int i26 = i13;
                                        g2 = i25 | r15.g(s8lVar2) | r15.i(tbjVar4) | (i26 != 4) | r15.i(nndVar4);
                                        O5 = r15.O();
                                        if (!g2 || O5 == obj4) {
                                            hk hkVar = new hk(q5bVar4, z2, s8lVar2, tbjVar4, wcjVar2, nndVar4);
                                            s8lVar3 = s8lVar2;
                                            r15.n0(hkVar);
                                            O5 = hkVar;
                                        } else {
                                            s8lVar3 = s8lVar2;
                                        }
                                        final xtc A2 = un0.A(utcVar, (Function1) O5);
                                        q5b q5bVar7 = q5bVar4;
                                        gdj gdjVar5 = gdjVar2;
                                        pt3 pt3Var = new pt3(gwjVar, wcjVar, q5bVar7, z3, z2, nndVar4, tbjVar4, qu9Var, ce8Var2);
                                        q5bVar5 = q5bVar7;
                                        if (!z2 && !z3 && ((ata) s8lVar3).b() && pej.d(((pej) ((eoh) q5bVar5.A).getValue()).a) && pej.d(((pej) ((eoh) q5bVar5.B).getValue()).a)) {
                                            nndVar5 = nndVar4;
                                            utcVar2 = utcVar;
                                        } else {
                                            er6 er6Var = new er6(pvhVar, q5bVar5, wcjVar, nndVar4, 27);
                                            q5bVar5 = q5bVar5;
                                            nndVar5 = nndVar4;
                                            utcVar2 = fqj.q(utcVar, er6Var);
                                        }
                                        i14 = r15.i(tbjVar4);
                                        O6 = r15.O();
                                        if (!i14 || O6 == obj4) {
                                            O6 = new kt3(tbjVar4, 0);
                                            r15.n0(O6);
                                        }
                                        hz8.d(tbjVar4, (Function1) O6, r15);
                                        i15 = r15.i(q5bVar5) | r15.i(gdjVar5) | (i26 != 4) | ((i11 <= 32 && r15.g(qu9Var)) || (i10 & 48) == 32);
                                        O7 = r15.O();
                                        if (!i15 || O7 == obj4) {
                                            l50 l50Var = new l50(q5bVar5, gdjVar5, wcjVar, qu9Var, 6);
                                            qu9Var4 = qu9Var;
                                            r15.n0(l50Var);
                                            O7 = l50Var;
                                        } else {
                                            qu9Var4 = qu9Var;
                                        }
                                        hz8.d(qu9Var4, (Function1) O7, r15);
                                        final gt3 gt3Var = q5bVar5.v;
                                        final boolean z15 = i2 != 1;
                                        final int i27 = qu9Var4.e;
                                        final nnd nndVar9 = nndVar5;
                                        xtc q2 = fqj.q(utcVar, new ct8() { // from class: saj
                                            @Override // defpackage.ct8
                                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                                ((Integer) obj8).getClass();
                                                av8 av8Var4 = (av8) ((of3) obj7);
                                                av8Var4.d0(851809892);
                                                Object O18 = av8Var4.O();
                                                a99 a99Var = nf3.a;
                                                if (O18 == a99Var) {
                                                    O18 = new oej();
                                                    av8Var4.n0(O18);
                                                }
                                                oej oejVar = (oej) O18;
                                                Object O19 = av8Var4.O();
                                                if (O19 == a99Var) {
                                                    O19 = new gl4();
                                                    av8Var4.n0(O19);
                                                }
                                                raj rajVar = new raj(q5b.this, tbjVar4, wcjVar, z14, z15, oejVar, nndVar9, aakVar, (gl4) O19, gt3Var, i27);
                                                boolean i28 = av8Var4.i(rajVar);
                                                Object O20 = av8Var4.O();
                                                if (i28 || O20 == a99Var) {
                                                    chf chfVar = new chf(1, rajVar, raj.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                                                    av8Var4.n0(chfVar);
                                                    O20 = chfVar;
                                                }
                                                xtc y = iz8.y((Function1) ((KFunction) O20));
                                                av8Var4.s(false);
                                                return y;
                                            }
                                        });
                                        int i28 = qu9Var4.d;
                                        z12 = (i28 == 7 || i28 == 8) ? false : true;
                                        boolean booleanValue = ((Boolean) g4.getValue()).booleanValue();
                                        i10 i10Var3 = i10Var;
                                        h2 = r15.h(z12) | r15.i(i10Var3);
                                        O8 = r15.O();
                                        if (!h2 || O8 == obj4) {
                                            O8 = new m1(z12, i10Var3, 5);
                                            r15.n0(O8);
                                        }
                                        xtc H = iz8.H(utcVar, booleanValue, z12, (Function0) O8);
                                        n52 n52Var = (n52) r15.k(mv0.a);
                                        long j6 = ((r13) r15.k(mv0.b)).a;
                                        long b3 = hkg.b(1308617531);
                                        int i29 = r13.j;
                                        pvhVar2 = !e8k.a(j6, b3) ? new pvh(j6) : n52Var;
                                        i16 = r15.i(q5bVar5) | r15.g(pvhVar2);
                                        O9 = r15.O();
                                        if (!i16 || O9 == obj4) {
                                            O9 = new r82(7, q5bVar5, pvhVar2);
                                            r15.n0(O9);
                                        }
                                        xtc z16 = iz8.z(v9g.F(xtcVar.z(td4.Z(utcVar, (Function1) O9)), i10Var3, q5bVar5, tbjVar4).z(H).z(xtcVar2), new wsd(13, wd8Var3, q5bVar5));
                                        int i30 = 10;
                                        final mbj mbjVar3 = mbjVar;
                                        i17 = 0;
                                        xtc u2 = v9g.u(un0.A(fqj.q(iz8.z(z16, new zi(i30, q5bVar5, tbjVar4)).z(q2), new l4b(mbjVar3, z2, wzcVar, 7)).z(w).z(pt3Var), new gt3(q5bVar5, i17)), new s5h(24, tbjVar4, ku3Var2));
                                        if (z2 && q5bVar5.b() && ((Boolean) ((eoh) q5bVar5.q).getValue()).booleanValue() && ((ata) s8lVar3).b()) {
                                            i17 = 1;
                                        }
                                        final xtc q3 = (i17 == 0 && fob.a()) ? fqj.q(utcVar, new uri(tbjVar4, i30)) : utcVar;
                                        final t32 t32Var3 = t32Var;
                                        final utc utcVar4 = utcVar2;
                                        final q5b q5bVar8 = q5bVar5;
                                        final ?? r152 = i17;
                                        Function2 function2 = new Function2() { // from class: ht3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                of3 of3Var2 = (of3) obj6;
                                                int intValue = ((Integer) obj7).intValue();
                                                av8 av8Var4 = (av8) of3Var2;
                                                if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                                    final q5b q5bVar9 = q5bVar8;
                                                    final dfj dfjVar4 = dfjVar;
                                                    final int i31 = i3;
                                                    final int i32 = i2;
                                                    final mbj mbjVar4 = mbjVar3;
                                                    final wcj wcjVar4 = wcjVar;
                                                    final jwk jwkVar2 = jwkVar;
                                                    final xtc xtcVar3 = utcVar4;
                                                    final xtc xtcVar4 = X;
                                                    final xtc xtcVar5 = A2;
                                                    final xtc xtcVar6 = q3;
                                                    final t32 t32Var4 = t32Var3;
                                                    final tbj tbjVar5 = tbjVar4;
                                                    final boolean z17 = r152;
                                                    final boolean z18 = z3;
                                                    final Function1 function13 = function12;
                                                    final nnd nndVar10 = nndVar9;
                                                    final kx4 kx4Var4 = kx4Var3;
                                                    tc3.this.invoke(yqo.H(-44346382, av8Var4, new Function2() { // from class: et3
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(Object obj8, Object obj9) {
                                                            xtc tokVar;
                                                            of3 of3Var3 = (of3) obj8;
                                                            int intValue2 = ((Integer) obj9).intValue();
                                                            av8 av8Var5 = (av8) of3Var3;
                                                            if (av8Var5.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                                q5b q5bVar10 = q5b.this;
                                                                xtc g6 = bkh.g(utc.a, ((p75) ((eoh) q5bVar10.g).getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                                                int i33 = i31;
                                                                int i34 = i32;
                                                                wnn.K(i33, i34);
                                                                dfj dfjVar5 = dfjVar4;
                                                                if (i33 != 1 || i34 != Integer.MAX_VALUE) {
                                                                    g6 = g6.z(new n99(dfjVar5, i33, i34));
                                                                }
                                                                boolean i35 = av8Var5.i(q5bVar10);
                                                                Object O18 = av8Var5.O();
                                                                if (i35 || O18 == nf3.a) {
                                                                    O18 = new h63(q5bVar10, 5);
                                                                    av8Var5.n0(O18);
                                                                }
                                                                Function0 function0 = (Function0) O18;
                                                                mbj mbjVar5 = mbjVar4;
                                                                ewd ewdVar2 = (ewd) ((eoh) mbjVar5.f).getValue();
                                                                wcj wcjVar5 = wcjVar4;
                                                                long j7 = wcjVar5.b;
                                                                int i36 = pej.c;
                                                                int i37 = (int) (j7 >> 32);
                                                                long j8 = mbjVar5.e;
                                                                if (i37 == ((int) (j8 >> 32)) && (i37 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                                                    i37 = pej.g(j7);
                                                                }
                                                                mbjVar5.e = wcjVar5.b;
                                                                gwj a5 = ckk.a(jwkVar2, wcjVar5.a);
                                                                int ordinal = ewdVar2.ordinal();
                                                                if (ordinal == 0) {
                                                                    tokVar = new tok(mbjVar5, i37, a5, function0);
                                                                } else {
                                                                    if (ordinal != 1) {
                                                                        zzl.b();
                                                                        return null;
                                                                    }
                                                                    tokVar = new if9(mbjVar5, i37, a5, function0);
                                                                }
                                                                d7a.j(c5n.u(wnn.B(g6).z(tokVar).z(xtcVar3).z(xtcVar4).z(new qcj(dfjVar5)).z(xtcVar5).z(xtcVar6), t32Var4), yqo.H(1412697320, av8Var5, new ft3(tbjVar5, q5bVar10, z17, z18, function13, wcjVar5, nndVar10, kx4Var4, i34)), av8Var5, 48);
                                                            } else {
                                                                av8Var5.W();
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }), av8Var4, 6);
                                                } else {
                                                    av8Var4.W();
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        av8Var = r15;
                                        f(u2, tbjVar4, yqo.H(-814563849, av8Var, function2), av8Var, 384);
                                    }
                                } else {
                                    q5bVar3 = q5bVar2;
                                }
                                z10 = true;
                                z11 = g5 | z10;
                                Object O172 = r15.O();
                                if (z11) {
                                }
                                tbjVar2 = tbjVar;
                                unit = unit2;
                                ku3Var2 = ku3Var;
                                nndVar3 = nndVar2;
                                xtcVar2 = r2;
                                q5bVar4 = q5bVar3;
                                utcVar = utcVar3;
                                ce8Var2 = ce8Var;
                                wzcVar2 = wzcVar;
                                gdj gdjVar42 = gdjVar;
                                h10Var = new h10(q5bVar4, g4, gdjVar42, tbjVar2, qu9Var, null, 2);
                                gdjVar2 = gdjVar42;
                                r15.n0(h10Var);
                                hz8.o(r15, unit, (Function2) h10Var);
                                int i242 = 4;
                                xtc a42 = koi.a(utcVar, 8675309, new m00(new gt3(q5bVar4, i242), i242));
                                final tbj tbjVar42 = tbjVar2;
                                nndVar4 = nndVar3;
                                rrh rrhVar2 = new rrh(q5bVar4, ce8Var2, z3, z2, tbjVar42, nndVar4);
                                if (z2) {
                                }
                                xtc b22 = koi.b(a42, tbjVar42.z, tbjVar42.y, new m00(tbjVar42, 8));
                                kze.a.getClass();
                                xtc w2 = sea.w(b22, n9e.f);
                                final xtc X2 = td4.X(utcVar, new fa(13, q5bVar4, wcjVar2, nndVar4));
                                boolean i252 = r15.i(q5bVar4) | (i21 != 2048);
                                s8lVar2 = s8lVar;
                                int i262 = i13;
                                g2 = i252 | r15.g(s8lVar2) | r15.i(tbjVar42) | (i262 != 4) | r15.i(nndVar4);
                                O5 = r15.O();
                                if (g2) {
                                }
                                hk hkVar2 = new hk(q5bVar4, z2, s8lVar2, tbjVar42, wcjVar2, nndVar4);
                                s8lVar3 = s8lVar2;
                                r15.n0(hkVar2);
                                O5 = hkVar2;
                                final xtc A22 = un0.A(utcVar, (Function1) O5);
                                q5b q5bVar72 = q5bVar4;
                                gdj gdjVar52 = gdjVar2;
                                pt3 pt3Var2 = new pt3(gwjVar, wcjVar, q5bVar72, z3, z2, nndVar4, tbjVar42, qu9Var, ce8Var2);
                                q5bVar5 = q5bVar72;
                                if (!z2 && !z3 && ((ata) s8lVar3).b() && pej.d(((pej) ((eoh) q5bVar5.A).getValue()).a) && pej.d(((pej) ((eoh) q5bVar5.B).getValue()).a)) {
                                }
                                i14 = r15.i(tbjVar42);
                                O6 = r15.O();
                                if (!i14) {
                                }
                                O6 = new kt3(tbjVar42, 0);
                                r15.n0(O6);
                                hz8.d(tbjVar42, (Function1) O6, r15);
                                i15 = r15.i(q5bVar5) | r15.i(gdjVar52) | (i262 != 4) | ((i11 <= 32 && r15.g(qu9Var)) || (i10 & 48) == 32);
                                O7 = r15.O();
                                if (i15) {
                                }
                                l50 l50Var2 = new l50(q5bVar5, gdjVar52, wcjVar, qu9Var, 6);
                                qu9Var4 = qu9Var;
                                r15.n0(l50Var2);
                                O7 = l50Var2;
                                hz8.d(qu9Var4, (Function1) O7, r15);
                                final Function1 gt3Var2 = q5bVar5.v;
                                if (i2 != 1) {
                                }
                                final int i272 = qu9Var4.e;
                                final nnd nndVar92 = nndVar5;
                                xtc q22 = fqj.q(utcVar, new ct8() { // from class: saj
                                    @Override // defpackage.ct8
                                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                        ((Integer) obj8).getClass();
                                        av8 av8Var4 = (av8) ((of3) obj7);
                                        av8Var4.d0(851809892);
                                        Object O18 = av8Var4.O();
                                        a99 a99Var = nf3.a;
                                        if (O18 == a99Var) {
                                            O18 = new oej();
                                            av8Var4.n0(O18);
                                        }
                                        oej oejVar = (oej) O18;
                                        Object O19 = av8Var4.O();
                                        if (O19 == a99Var) {
                                            O19 = new gl4();
                                            av8Var4.n0(O19);
                                        }
                                        raj rajVar = new raj(q5b.this, tbjVar42, wcjVar, z14, z15, oejVar, nndVar92, aakVar, (gl4) O19, gt3Var2, i272);
                                        boolean i282 = av8Var4.i(rajVar);
                                        Object O20 = av8Var4.O();
                                        if (i282 || O20 == a99Var) {
                                            chf chfVar = new chf(1, rajVar, raj.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                                            av8Var4.n0(chfVar);
                                            O20 = chfVar;
                                        }
                                        xtc y = iz8.y((Function1) ((KFunction) O20));
                                        av8Var4.s(false);
                                        return y;
                                    }
                                });
                                int i282 = qu9Var4.d;
                                if (i282 == 7) {
                                    boolean booleanValue2 = ((Boolean) g4.getValue()).booleanValue();
                                    i10 i10Var32 = i10Var;
                                    h2 = r15.h(z12) | r15.i(i10Var32);
                                    O8 = r15.O();
                                    if (!h2) {
                                    }
                                    O8 = new m1(z12, i10Var32, 5);
                                    r15.n0(O8);
                                    xtc H2 = iz8.H(utcVar, booleanValue2, z12, (Function0) O8);
                                    n52 n52Var2 = (n52) r15.k(mv0.a);
                                    long j62 = ((r13) r15.k(mv0.b)).a;
                                    long b32 = hkg.b(1308617531);
                                    int i292 = r13.j;
                                    if (!e8k.a(j62, b32)) {
                                    }
                                    i16 = r15.i(q5bVar5) | r15.g(pvhVar2);
                                    O9 = r15.O();
                                    if (!i16) {
                                    }
                                    O9 = new r82(7, q5bVar5, pvhVar2);
                                    r15.n0(O9);
                                    xtc z162 = iz8.z(v9g.F(xtcVar.z(td4.Z(utcVar, (Function1) O9)), i10Var32, q5bVar5, tbjVar42).z(H2).z(xtcVar2), new wsd(13, wd8Var3, q5bVar5));
                                    int i302 = 10;
                                    final mbj mbjVar32 = mbjVar;
                                    i17 = 0;
                                    xtc u22 = v9g.u(un0.A(fqj.q(iz8.z(z162, new zi(i302, q5bVar5, tbjVar42)).z(q22), new l4b(mbjVar32, z2, wzcVar, 7)).z(w2).z(pt3Var2), new gt3(q5bVar5, i17)), new s5h(24, tbjVar42, ku3Var2));
                                    if (z2) {
                                        i17 = 1;
                                    }
                                    final xtc q32 = (i17 == 0 && fob.a()) ? fqj.q(utcVar, new uri(tbjVar42, i302)) : utcVar;
                                    final t32 t32Var32 = t32Var;
                                    final xtc utcVar42 = utcVar2;
                                    final q5b q5bVar82 = q5bVar5;
                                    final boolean r1522 = i17;
                                    Function2 function22 = new Function2() { // from class: ht3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            of3 of3Var2 = (of3) obj6;
                                            int intValue = ((Integer) obj7).intValue();
                                            av8 av8Var4 = (av8) of3Var2;
                                            if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                                final q5b q5bVar9 = q5bVar82;
                                                final dfj dfjVar4 = dfjVar;
                                                final int i31 = i3;
                                                final int i32 = i2;
                                                final mbj mbjVar4 = mbjVar32;
                                                final wcj wcjVar4 = wcjVar;
                                                final jwk jwkVar2 = jwkVar;
                                                final xtc xtcVar3 = utcVar42;
                                                final xtc xtcVar4 = X2;
                                                final xtc xtcVar5 = A22;
                                                final xtc xtcVar6 = q32;
                                                final t32 t32Var4 = t32Var32;
                                                final tbj tbjVar5 = tbjVar42;
                                                final boolean z17 = r1522;
                                                final boolean z18 = z3;
                                                final Function1 function13 = function12;
                                                final nnd nndVar10 = nndVar92;
                                                final kx4 kx4Var4 = kx4Var3;
                                                tc3.this.invoke(yqo.H(-44346382, av8Var4, new Function2() { // from class: et3
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj8, Object obj9) {
                                                        xtc tokVar;
                                                        of3 of3Var3 = (of3) obj8;
                                                        int intValue2 = ((Integer) obj9).intValue();
                                                        av8 av8Var5 = (av8) of3Var3;
                                                        if (av8Var5.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                            q5b q5bVar10 = q5b.this;
                                                            xtc g6 = bkh.g(utc.a, ((p75) ((eoh) q5bVar10.g).getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                                            int i33 = i31;
                                                            int i34 = i32;
                                                            wnn.K(i33, i34);
                                                            dfj dfjVar5 = dfjVar4;
                                                            if (i33 != 1 || i34 != Integer.MAX_VALUE) {
                                                                g6 = g6.z(new n99(dfjVar5, i33, i34));
                                                            }
                                                            boolean i35 = av8Var5.i(q5bVar10);
                                                            Object O18 = av8Var5.O();
                                                            if (i35 || O18 == nf3.a) {
                                                                O18 = new h63(q5bVar10, 5);
                                                                av8Var5.n0(O18);
                                                            }
                                                            Function0 function0 = (Function0) O18;
                                                            mbj mbjVar5 = mbjVar4;
                                                            ewd ewdVar2 = (ewd) ((eoh) mbjVar5.f).getValue();
                                                            wcj wcjVar5 = wcjVar4;
                                                            long j7 = wcjVar5.b;
                                                            int i36 = pej.c;
                                                            int i37 = (int) (j7 >> 32);
                                                            long j8 = mbjVar5.e;
                                                            if (i37 == ((int) (j8 >> 32)) && (i37 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                                                i37 = pej.g(j7);
                                                            }
                                                            mbjVar5.e = wcjVar5.b;
                                                            gwj a5 = ckk.a(jwkVar2, wcjVar5.a);
                                                            int ordinal = ewdVar2.ordinal();
                                                            if (ordinal == 0) {
                                                                tokVar = new tok(mbjVar5, i37, a5, function0);
                                                            } else {
                                                                if (ordinal != 1) {
                                                                    zzl.b();
                                                                    return null;
                                                                }
                                                                tokVar = new if9(mbjVar5, i37, a5, function0);
                                                            }
                                                            d7a.j(c5n.u(wnn.B(g6).z(tokVar).z(xtcVar3).z(xtcVar4).z(new qcj(dfjVar5)).z(xtcVar5).z(xtcVar6), t32Var4), yqo.H(1412697320, av8Var5, new ft3(tbjVar5, q5bVar10, z17, z18, function13, wcjVar5, nndVar10, kx4Var4, i34)), av8Var5, 48);
                                                        } else {
                                                            av8Var5.W();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }), av8Var4, 6);
                                            } else {
                                                av8Var4.W();
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    av8Var = r15;
                                    f(u22, tbjVar42, yqo.H(-814563849, av8Var, function22), av8Var, 384);
                                }
                                boolean booleanValue22 = ((Boolean) g4.getValue()).booleanValue();
                                i10 i10Var322 = i10Var;
                                h2 = r15.h(z12) | r15.i(i10Var322);
                                O8 = r15.O();
                                if (!h2) {
                                }
                                O8 = new m1(z12, i10Var322, 5);
                                r15.n0(O8);
                                xtc H22 = iz8.H(utcVar, booleanValue22, z12, (Function0) O8);
                                n52 n52Var22 = (n52) r15.k(mv0.a);
                                long j622 = ((r13) r15.k(mv0.b)).a;
                                long b322 = hkg.b(1308617531);
                                int i2922 = r13.j;
                                if (!e8k.a(j622, b322)) {
                                }
                                i16 = r15.i(q5bVar5) | r15.g(pvhVar2);
                                O9 = r15.O();
                                if (!i16) {
                                }
                                O9 = new r82(7, q5bVar5, pvhVar2);
                                r15.n0(O9);
                                xtc z1622 = iz8.z(v9g.F(xtcVar.z(td4.Z(utcVar, (Function1) O9)), i10Var322, q5bVar5, tbjVar42).z(H22).z(xtcVar2), new wsd(13, wd8Var3, q5bVar5));
                                int i3022 = 10;
                                final mbj mbjVar322 = mbjVar;
                                i17 = 0;
                                xtc u222 = v9g.u(un0.A(fqj.q(iz8.z(z1622, new zi(i3022, q5bVar5, tbjVar42)).z(q22), new l4b(mbjVar322, z2, wzcVar, 7)).z(w2).z(pt3Var2), new gt3(q5bVar5, i17)), new s5h(24, tbjVar42, ku3Var2));
                                if (z2) {
                                }
                                final xtc q322 = (i17 == 0 && fob.a()) ? fqj.q(utcVar, new uri(tbjVar42, i3022)) : utcVar;
                                final t32 t32Var322 = t32Var;
                                final xtc utcVar422 = utcVar2;
                                final q5b q5bVar822 = q5bVar5;
                                final boolean r15222 = i17;
                                Function2 function222 = new Function2() { // from class: ht3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj6, Object obj7) {
                                        of3 of3Var2 = (of3) obj6;
                                        int intValue = ((Integer) obj7).intValue();
                                        av8 av8Var4 = (av8) of3Var2;
                                        if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                            final q5b q5bVar9 = q5bVar822;
                                            final dfj dfjVar4 = dfjVar;
                                            final int i31 = i3;
                                            final int i32 = i2;
                                            final mbj mbjVar4 = mbjVar322;
                                            final wcj wcjVar4 = wcjVar;
                                            final jwk jwkVar2 = jwkVar;
                                            final xtc xtcVar3 = utcVar422;
                                            final xtc xtcVar4 = X2;
                                            final xtc xtcVar5 = A22;
                                            final xtc xtcVar6 = q322;
                                            final t32 t32Var4 = t32Var322;
                                            final tbj tbjVar5 = tbjVar42;
                                            final boolean z17 = r15222;
                                            final boolean z18 = z3;
                                            final Function1 function13 = function12;
                                            final nnd nndVar10 = nndVar92;
                                            final kx4 kx4Var4 = kx4Var3;
                                            tc3.this.invoke(yqo.H(-44346382, av8Var4, new Function2() { // from class: et3
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj8, Object obj9) {
                                                    xtc tokVar;
                                                    of3 of3Var3 = (of3) obj8;
                                                    int intValue2 = ((Integer) obj9).intValue();
                                                    av8 av8Var5 = (av8) of3Var3;
                                                    if (av8Var5.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                        q5b q5bVar10 = q5b.this;
                                                        xtc g6 = bkh.g(utc.a, ((p75) ((eoh) q5bVar10.g).getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                                        int i33 = i31;
                                                        int i34 = i32;
                                                        wnn.K(i33, i34);
                                                        dfj dfjVar5 = dfjVar4;
                                                        if (i33 != 1 || i34 != Integer.MAX_VALUE) {
                                                            g6 = g6.z(new n99(dfjVar5, i33, i34));
                                                        }
                                                        boolean i35 = av8Var5.i(q5bVar10);
                                                        Object O18 = av8Var5.O();
                                                        if (i35 || O18 == nf3.a) {
                                                            O18 = new h63(q5bVar10, 5);
                                                            av8Var5.n0(O18);
                                                        }
                                                        Function0 function0 = (Function0) O18;
                                                        mbj mbjVar5 = mbjVar4;
                                                        ewd ewdVar2 = (ewd) ((eoh) mbjVar5.f).getValue();
                                                        wcj wcjVar5 = wcjVar4;
                                                        long j7 = wcjVar5.b;
                                                        int i36 = pej.c;
                                                        int i37 = (int) (j7 >> 32);
                                                        long j8 = mbjVar5.e;
                                                        if (i37 == ((int) (j8 >> 32)) && (i37 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                                            i37 = pej.g(j7);
                                                        }
                                                        mbjVar5.e = wcjVar5.b;
                                                        gwj a5 = ckk.a(jwkVar2, wcjVar5.a);
                                                        int ordinal = ewdVar2.ordinal();
                                                        if (ordinal == 0) {
                                                            tokVar = new tok(mbjVar5, i37, a5, function0);
                                                        } else {
                                                            if (ordinal != 1) {
                                                                zzl.b();
                                                                return null;
                                                            }
                                                            tokVar = new if9(mbjVar5, i37, a5, function0);
                                                        }
                                                        d7a.j(c5n.u(wnn.B(g6).z(tokVar).z(xtcVar3).z(xtcVar4).z(new qcj(dfjVar5)).z(xtcVar5).z(xtcVar6), t32Var4), yqo.H(1412697320, av8Var5, new ft3(tbjVar5, q5bVar10, z17, z18, function13, wcjVar5, nndVar10, kx4Var4, i34)), av8Var5, 48);
                                                    } else {
                                                        av8Var5.W();
                                                    }
                                                    return Unit.a;
                                                }
                                            }), av8Var4, 6);
                                        } else {
                                            av8Var4.W();
                                        }
                                        return Unit.a;
                                    }
                                };
                                av8Var = r15;
                                f(u222, tbjVar42, yqo.H(-814563849, av8Var, function222), av8Var, 384);
                            }
                        } else {
                            qu9Var2 = qu9Var;
                        }
                        z7 = i23;
                        if ((i10 & 48) != 32) {
                            z8 = false;
                            i12 = z7 | z8 | r15.i(nndVar8) | r15.i(ku3Var3) | r15.i(t32Var2) | r15.i(tbjVar3);
                            Object O162 = r15.O();
                            if (i12) {
                            }
                            final qu9 qu9Var52 = qu9Var2;
                            ce8Var = ce8Var3;
                            q5bVar2 = q5bVar6;
                            wd8Var3 = wd8Var2;
                            i13 = i22;
                            obj4 = obj2;
                            obj3 = new Function1() { // from class: jt3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    bej d2;
                                    ie8 ie8Var = (ie8) obj6;
                                    q5b q5bVar73 = q5b.this;
                                    if (q5bVar73.b() == ie8Var.g()) {
                                        return Unit.a;
                                    }
                                    ((eoh) q5bVar73.f).setValue(Boolean.valueOf(ie8Var.g()));
                                    boolean b23 = q5bVar73.b();
                                    wcj wcjVar4 = wcjVar;
                                    nnd nndVar93 = nndVar8;
                                    if (b23 && z2 && !z3) {
                                        l98.i0(gdjVar3, q5bVar73, wcjVar4, qu9Var52, nndVar93);
                                    } else {
                                        l98.O(q5bVar73);
                                    }
                                    if (ie8Var.g() && (d2 = q5bVar73.d()) != null) {
                                        xw3.L(ku3Var3, null, null, new h10(t32Var2, wcjVar4, q5bVar73, d2, nndVar93, null, 3), 3);
                                    }
                                    if (!ie8Var.g()) {
                                        tbjVar3.d(null);
                                    }
                                    return Unit.a;
                                }
                            };
                            t32Var = t32Var2;
                            nndVar2 = nndVar8;
                            tbjVar = tbjVar3;
                            wcjVar2 = wcjVar;
                            ku3Var = ku3Var3;
                            z9 = z2;
                            gdjVar = gdjVar3;
                            qu9Var3 = qu9Var52;
                            r15.n0(obj3);
                            utc utcVar32 = utc.a;
                            xtc r22 = pd0.r(kik.L(lz.G(utcVar32, ce8Var), (Function1) obj3), z9, wzcVar);
                            e1d g42 = e.g(Boolean.valueOf((z9 || z3) ? false : true), r15);
                            Unit unit22 = Unit.a;
                            boolean g52 = r15.g(g42) | r15.i(q5bVar2) | r15.i(gdjVar) | r15.i(tbjVar);
                            if (i11 > 32) {
                            }
                            q5bVar3 = q5bVar2;
                            if ((i10 & 48) != 32) {
                            }
                            z10 = true;
                            z11 = g52 | z10;
                            Object O1722 = r15.O();
                            if (z11) {
                            }
                            tbjVar2 = tbjVar;
                            unit = unit22;
                            ku3Var2 = ku3Var;
                            nndVar3 = nndVar2;
                            xtcVar2 = r22;
                            q5bVar4 = q5bVar3;
                            utcVar = utcVar32;
                            ce8Var2 = ce8Var;
                            wzcVar2 = wzcVar;
                            gdj gdjVar422 = gdjVar;
                            h10Var = new h10(q5bVar4, g42, gdjVar422, tbjVar2, qu9Var, null, 2);
                            gdjVar2 = gdjVar422;
                            r15.n0(h10Var);
                            hz8.o(r15, unit, (Function2) h10Var);
                            int i2422 = 4;
                            xtc a422 = koi.a(utcVar, 8675309, new m00(new gt3(q5bVar4, i2422), i2422));
                            final tbj tbjVar422 = tbjVar2;
                            nndVar4 = nndVar3;
                            rrh rrhVar22 = new rrh(q5bVar4, ce8Var2, z3, z2, tbjVar422, nndVar4);
                            if (z2) {
                            }
                            xtc b222 = koi.b(a422, tbjVar422.z, tbjVar422.y, new m00(tbjVar422, 8));
                            kze.a.getClass();
                            xtc w22 = sea.w(b222, n9e.f);
                            final xtc X22 = td4.X(utcVar, new fa(13, q5bVar4, wcjVar2, nndVar4));
                            boolean i2522 = r15.i(q5bVar4) | (i21 != 2048);
                            s8lVar2 = s8lVar;
                            int i2622 = i13;
                            g2 = i2522 | r15.g(s8lVar2) | r15.i(tbjVar422) | (i2622 != 4) | r15.i(nndVar4);
                            O5 = r15.O();
                            if (g2) {
                            }
                            hk hkVar22 = new hk(q5bVar4, z2, s8lVar2, tbjVar422, wcjVar2, nndVar4);
                            s8lVar3 = s8lVar2;
                            r15.n0(hkVar22);
                            O5 = hkVar22;
                            final xtc A222 = un0.A(utcVar, (Function1) O5);
                            q5b q5bVar722 = q5bVar4;
                            gdj gdjVar522 = gdjVar2;
                            pt3 pt3Var22 = new pt3(gwjVar, wcjVar, q5bVar722, z3, z2, nndVar4, tbjVar422, qu9Var, ce8Var2);
                            q5bVar5 = q5bVar722;
                            if (!z2 && !z3 && ((ata) s8lVar3).b() && pej.d(((pej) ((eoh) q5bVar5.A).getValue()).a) && pej.d(((pej) ((eoh) q5bVar5.B).getValue()).a)) {
                            }
                            i14 = r15.i(tbjVar422);
                            O6 = r15.O();
                            if (!i14) {
                            }
                            O6 = new kt3(tbjVar422, 0);
                            r15.n0(O6);
                            hz8.d(tbjVar422, (Function1) O6, r15);
                            i15 = r15.i(q5bVar5) | r15.i(gdjVar522) | (i2622 != 4) | ((i11 <= 32 && r15.g(qu9Var)) || (i10 & 48) == 32);
                            O7 = r15.O();
                            if (i15) {
                            }
                            l50 l50Var22 = new l50(q5bVar5, gdjVar522, wcjVar, qu9Var, 6);
                            qu9Var4 = qu9Var;
                            r15.n0(l50Var22);
                            O7 = l50Var22;
                            hz8.d(qu9Var4, (Function1) O7, r15);
                            final Function1 gt3Var22 = q5bVar5.v;
                            if (i2 != 1) {
                            }
                            final int i2722 = qu9Var4.e;
                            final nnd nndVar922 = nndVar5;
                            xtc q222 = fqj.q(utcVar, new ct8() { // from class: saj
                                @Override // defpackage.ct8
                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                    ((Integer) obj8).getClass();
                                    av8 av8Var4 = (av8) ((of3) obj7);
                                    av8Var4.d0(851809892);
                                    Object O18 = av8Var4.O();
                                    a99 a99Var = nf3.a;
                                    if (O18 == a99Var) {
                                        O18 = new oej();
                                        av8Var4.n0(O18);
                                    }
                                    oej oejVar = (oej) O18;
                                    Object O19 = av8Var4.O();
                                    if (O19 == a99Var) {
                                        O19 = new gl4();
                                        av8Var4.n0(O19);
                                    }
                                    raj rajVar = new raj(q5b.this, tbjVar422, wcjVar, z14, z15, oejVar, nndVar922, aakVar, (gl4) O19, gt3Var22, i2722);
                                    boolean i2822 = av8Var4.i(rajVar);
                                    Object O20 = av8Var4.O();
                                    if (i2822 || O20 == a99Var) {
                                        chf chfVar = new chf(1, rajVar, raj.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                                        av8Var4.n0(chfVar);
                                        O20 = chfVar;
                                    }
                                    xtc y = iz8.y((Function1) ((KFunction) O20));
                                    av8Var4.s(false);
                                    return y;
                                }
                            });
                            int i2822 = qu9Var4.d;
                            if (i2822 == 7) {
                            }
                            boolean booleanValue222 = ((Boolean) g42.getValue()).booleanValue();
                            i10 i10Var3222 = i10Var;
                            h2 = r15.h(z12) | r15.i(i10Var3222);
                            O8 = r15.O();
                            if (!h2) {
                            }
                            O8 = new m1(z12, i10Var3222, 5);
                            r15.n0(O8);
                            xtc H222 = iz8.H(utcVar, booleanValue222, z12, (Function0) O8);
                            n52 n52Var222 = (n52) r15.k(mv0.a);
                            long j6222 = ((r13) r15.k(mv0.b)).a;
                            long b3222 = hkg.b(1308617531);
                            int i29222 = r13.j;
                            if (!e8k.a(j6222, b3222)) {
                            }
                            i16 = r15.i(q5bVar5) | r15.g(pvhVar2);
                            O9 = r15.O();
                            if (!i16) {
                            }
                            O9 = new r82(7, q5bVar5, pvhVar2);
                            r15.n0(O9);
                            xtc z16222 = iz8.z(v9g.F(xtcVar.z(td4.Z(utcVar, (Function1) O9)), i10Var3222, q5bVar5, tbjVar422).z(H222).z(xtcVar2), new wsd(13, wd8Var3, q5bVar5));
                            int i30222 = 10;
                            final mbj mbjVar3222 = mbjVar;
                            i17 = 0;
                            xtc u2222 = v9g.u(un0.A(fqj.q(iz8.z(z16222, new zi(i30222, q5bVar5, tbjVar422)).z(q222), new l4b(mbjVar3222, z2, wzcVar, 7)).z(w22).z(pt3Var22), new gt3(q5bVar5, i17)), new s5h(24, tbjVar422, ku3Var2));
                            if (z2) {
                            }
                            final xtc q3222 = (i17 == 0 && fob.a()) ? fqj.q(utcVar, new uri(tbjVar422, i30222)) : utcVar;
                            final t32 t32Var3222 = t32Var;
                            final xtc utcVar4222 = utcVar2;
                            final q5b q5bVar8222 = q5bVar5;
                            final boolean r152222 = i17;
                            Function2 function2222 = new Function2() { // from class: ht3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj6, Object obj7) {
                                    of3 of3Var2 = (of3) obj6;
                                    int intValue = ((Integer) obj7).intValue();
                                    av8 av8Var4 = (av8) of3Var2;
                                    if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                        final q5b q5bVar9 = q5bVar8222;
                                        final dfj dfjVar4 = dfjVar;
                                        final int i31 = i3;
                                        final int i32 = i2;
                                        final mbj mbjVar4 = mbjVar3222;
                                        final wcj wcjVar4 = wcjVar;
                                        final jwk jwkVar2 = jwkVar;
                                        final xtc xtcVar3 = utcVar4222;
                                        final xtc xtcVar4 = X22;
                                        final xtc xtcVar5 = A222;
                                        final xtc xtcVar6 = q3222;
                                        final t32 t32Var4 = t32Var3222;
                                        final tbj tbjVar5 = tbjVar422;
                                        final boolean z17 = r152222;
                                        final boolean z18 = z3;
                                        final Function1 function13 = function12;
                                        final nnd nndVar10 = nndVar922;
                                        final kx4 kx4Var4 = kx4Var3;
                                        tc3.this.invoke(yqo.H(-44346382, av8Var4, new Function2() { // from class: et3
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj8, Object obj9) {
                                                xtc tokVar;
                                                of3 of3Var3 = (of3) obj8;
                                                int intValue2 = ((Integer) obj9).intValue();
                                                av8 av8Var5 = (av8) of3Var3;
                                                if (av8Var5.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                    q5b q5bVar10 = q5b.this;
                                                    xtc g6 = bkh.g(utc.a, ((p75) ((eoh) q5bVar10.g).getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                                    int i33 = i31;
                                                    int i34 = i32;
                                                    wnn.K(i33, i34);
                                                    dfj dfjVar5 = dfjVar4;
                                                    if (i33 != 1 || i34 != Integer.MAX_VALUE) {
                                                        g6 = g6.z(new n99(dfjVar5, i33, i34));
                                                    }
                                                    boolean i35 = av8Var5.i(q5bVar10);
                                                    Object O18 = av8Var5.O();
                                                    if (i35 || O18 == nf3.a) {
                                                        O18 = new h63(q5bVar10, 5);
                                                        av8Var5.n0(O18);
                                                    }
                                                    Function0 function0 = (Function0) O18;
                                                    mbj mbjVar5 = mbjVar4;
                                                    ewd ewdVar2 = (ewd) ((eoh) mbjVar5.f).getValue();
                                                    wcj wcjVar5 = wcjVar4;
                                                    long j7 = wcjVar5.b;
                                                    int i36 = pej.c;
                                                    int i37 = (int) (j7 >> 32);
                                                    long j8 = mbjVar5.e;
                                                    if (i37 == ((int) (j8 >> 32)) && (i37 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                                        i37 = pej.g(j7);
                                                    }
                                                    mbjVar5.e = wcjVar5.b;
                                                    gwj a5 = ckk.a(jwkVar2, wcjVar5.a);
                                                    int ordinal = ewdVar2.ordinal();
                                                    if (ordinal == 0) {
                                                        tokVar = new tok(mbjVar5, i37, a5, function0);
                                                    } else {
                                                        if (ordinal != 1) {
                                                            zzl.b();
                                                            return null;
                                                        }
                                                        tokVar = new if9(mbjVar5, i37, a5, function0);
                                                    }
                                                    d7a.j(c5n.u(wnn.B(g6).z(tokVar).z(xtcVar3).z(xtcVar4).z(new qcj(dfjVar5)).z(xtcVar5).z(xtcVar6), t32Var4), yqo.H(1412697320, av8Var5, new ft3(tbjVar5, q5bVar10, z17, z18, function13, wcjVar5, nndVar10, kx4Var4, i34)), av8Var5, 48);
                                                } else {
                                                    av8Var5.W();
                                                }
                                                return Unit.a;
                                            }
                                        }), av8Var4, 6);
                                    } else {
                                        av8Var4.W();
                                    }
                                    return Unit.a;
                                }
                            };
                            av8Var = r15;
                            f(u2222, tbjVar422, yqo.H(-814563849, av8Var, function2222), av8Var, 384);
                        }
                        z8 = true;
                        i12 = z7 | z8 | r15.i(nndVar8) | r15.i(ku3Var3) | r15.i(t32Var2) | r15.i(tbjVar3);
                        Object O1622 = r15.O();
                        if (i12) {
                        }
                        final qu9 qu9Var522 = qu9Var2;
                        ce8Var = ce8Var3;
                        q5bVar2 = q5bVar6;
                        wd8Var3 = wd8Var2;
                        i13 = i22;
                        obj4 = obj2;
                        obj3 = new Function1() { // from class: jt3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                bej d2;
                                ie8 ie8Var = (ie8) obj6;
                                q5b q5bVar73 = q5b.this;
                                if (q5bVar73.b() == ie8Var.g()) {
                                    return Unit.a;
                                }
                                ((eoh) q5bVar73.f).setValue(Boolean.valueOf(ie8Var.g()));
                                boolean b23 = q5bVar73.b();
                                wcj wcjVar4 = wcjVar;
                                nnd nndVar93 = nndVar8;
                                if (b23 && z2 && !z3) {
                                    l98.i0(gdjVar3, q5bVar73, wcjVar4, qu9Var522, nndVar93);
                                } else {
                                    l98.O(q5bVar73);
                                }
                                if (ie8Var.g() && (d2 = q5bVar73.d()) != null) {
                                    xw3.L(ku3Var3, null, null, new h10(t32Var2, wcjVar4, q5bVar73, d2, nndVar93, null, 3), 3);
                                }
                                if (!ie8Var.g()) {
                                    tbjVar3.d(null);
                                }
                                return Unit.a;
                            }
                        };
                        t32Var = t32Var2;
                        nndVar2 = nndVar8;
                        tbjVar = tbjVar3;
                        wcjVar2 = wcjVar;
                        ku3Var = ku3Var3;
                        z9 = z2;
                        gdjVar = gdjVar3;
                        qu9Var3 = qu9Var522;
                        r15.n0(obj3);
                        utc utcVar322 = utc.a;
                        xtc r222 = pd0.r(kik.L(lz.G(utcVar322, ce8Var), (Function1) obj3), z9, wzcVar);
                        e1d g422 = e.g(Boolean.valueOf((z9 || z3) ? false : true), r15);
                        Unit unit222 = Unit.a;
                        boolean g522 = r15.g(g422) | r15.i(q5bVar2) | r15.i(gdjVar) | r15.i(tbjVar);
                        if (i11 > 32) {
                        }
                        q5bVar3 = q5bVar2;
                        if ((i10 & 48) != 32) {
                        }
                        z10 = true;
                        z11 = g522 | z10;
                        Object O17222 = r15.O();
                        if (z11) {
                        }
                        tbjVar2 = tbjVar;
                        unit = unit222;
                        ku3Var2 = ku3Var;
                        nndVar3 = nndVar2;
                        xtcVar2 = r222;
                        q5bVar4 = q5bVar3;
                        utcVar = utcVar322;
                        ce8Var2 = ce8Var;
                        wzcVar2 = wzcVar;
                        gdj gdjVar4222 = gdjVar;
                        h10Var = new h10(q5bVar4, g422, gdjVar4222, tbjVar2, qu9Var, null, 2);
                        gdjVar2 = gdjVar4222;
                        r15.n0(h10Var);
                        hz8.o(r15, unit, (Function2) h10Var);
                        int i24222 = 4;
                        xtc a4222 = koi.a(utcVar, 8675309, new m00(new gt3(q5bVar4, i24222), i24222));
                        final tbj tbjVar4222 = tbjVar2;
                        nndVar4 = nndVar3;
                        rrh rrhVar222 = new rrh(q5bVar4, ce8Var2, z3, z2, tbjVar4222, nndVar4);
                        if (z2) {
                        }
                        xtc b2222 = koi.b(a4222, tbjVar4222.z, tbjVar4222.y, new m00(tbjVar4222, 8));
                        kze.a.getClass();
                        xtc w222 = sea.w(b2222, n9e.f);
                        final xtc X222 = td4.X(utcVar, new fa(13, q5bVar4, wcjVar2, nndVar4));
                        boolean i25222 = r15.i(q5bVar4) | (i21 != 2048);
                        s8lVar2 = s8lVar;
                        int i26222 = i13;
                        g2 = i25222 | r15.g(s8lVar2) | r15.i(tbjVar4222) | (i26222 != 4) | r15.i(nndVar4);
                        O5 = r15.O();
                        if (g2) {
                        }
                        hk hkVar222 = new hk(q5bVar4, z2, s8lVar2, tbjVar4222, wcjVar2, nndVar4);
                        s8lVar3 = s8lVar2;
                        r15.n0(hkVar222);
                        O5 = hkVar222;
                        final xtc A2222 = un0.A(utcVar, (Function1) O5);
                        q5b q5bVar7222 = q5bVar4;
                        gdj gdjVar5222 = gdjVar2;
                        pt3 pt3Var222 = new pt3(gwjVar, wcjVar, q5bVar7222, z3, z2, nndVar4, tbjVar4222, qu9Var, ce8Var2);
                        q5bVar5 = q5bVar7222;
                        if (!z2 && !z3 && ((ata) s8lVar3).b() && pej.d(((pej) ((eoh) q5bVar5.A).getValue()).a) && pej.d(((pej) ((eoh) q5bVar5.B).getValue()).a)) {
                        }
                        i14 = r15.i(tbjVar4222);
                        O6 = r15.O();
                        if (!i14) {
                        }
                        O6 = new kt3(tbjVar4222, 0);
                        r15.n0(O6);
                        hz8.d(tbjVar4222, (Function1) O6, r15);
                        i15 = r15.i(q5bVar5) | r15.i(gdjVar5222) | (i26222 != 4) | ((i11 <= 32 && r15.g(qu9Var)) || (i10 & 48) == 32);
                        O7 = r15.O();
                        if (i15) {
                        }
                        l50 l50Var222 = new l50(q5bVar5, gdjVar5222, wcjVar, qu9Var, 6);
                        qu9Var4 = qu9Var;
                        r15.n0(l50Var222);
                        O7 = l50Var222;
                        hz8.d(qu9Var4, (Function1) O7, r15);
                        final Function1 gt3Var222 = q5bVar5.v;
                        if (i2 != 1) {
                        }
                        final int i27222 = qu9Var4.e;
                        final nnd nndVar9222 = nndVar5;
                        xtc q2222 = fqj.q(utcVar, new ct8() { // from class: saj
                            @Override // defpackage.ct8
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                ((Integer) obj8).getClass();
                                av8 av8Var4 = (av8) ((of3) obj7);
                                av8Var4.d0(851809892);
                                Object O18 = av8Var4.O();
                                a99 a99Var = nf3.a;
                                if (O18 == a99Var) {
                                    O18 = new oej();
                                    av8Var4.n0(O18);
                                }
                                oej oejVar = (oej) O18;
                                Object O19 = av8Var4.O();
                                if (O19 == a99Var) {
                                    O19 = new gl4();
                                    av8Var4.n0(O19);
                                }
                                raj rajVar = new raj(q5b.this, tbjVar4222, wcjVar, z14, z15, oejVar, nndVar9222, aakVar, (gl4) O19, gt3Var222, i27222);
                                boolean i28222 = av8Var4.i(rajVar);
                                Object O20 = av8Var4.O();
                                if (i28222 || O20 == a99Var) {
                                    chf chfVar = new chf(1, rajVar, raj.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                                    av8Var4.n0(chfVar);
                                    O20 = chfVar;
                                }
                                xtc y = iz8.y((Function1) ((KFunction) O20));
                                av8Var4.s(false);
                                return y;
                            }
                        });
                        int i28222 = qu9Var4.d;
                        if (i28222 == 7) {
                        }
                        boolean booleanValue2222 = ((Boolean) g422.getValue()).booleanValue();
                        i10 i10Var32222 = i10Var;
                        h2 = r15.h(z12) | r15.i(i10Var32222);
                        O8 = r15.O();
                        if (!h2) {
                        }
                        O8 = new m1(z12, i10Var32222, 5);
                        r15.n0(O8);
                        xtc H2222 = iz8.H(utcVar, booleanValue2222, z12, (Function0) O8);
                        n52 n52Var2222 = (n52) r15.k(mv0.a);
                        long j62222 = ((r13) r15.k(mv0.b)).a;
                        long b32222 = hkg.b(1308617531);
                        int i292222 = r13.j;
                        if (!e8k.a(j62222, b32222)) {
                        }
                        i16 = r15.i(q5bVar5) | r15.g(pvhVar2);
                        O9 = r15.O();
                        if (!i16) {
                        }
                        O9 = new r82(7, q5bVar5, pvhVar2);
                        r15.n0(O9);
                        xtc z162222 = iz8.z(v9g.F(xtcVar.z(td4.Z(utcVar, (Function1) O9)), i10Var32222, q5bVar5, tbjVar4222).z(H2222).z(xtcVar2), new wsd(13, wd8Var3, q5bVar5));
                        int i302222 = 10;
                        final mbj mbjVar32222 = mbjVar;
                        i17 = 0;
                        xtc u22222 = v9g.u(un0.A(fqj.q(iz8.z(z162222, new zi(i302222, q5bVar5, tbjVar4222)).z(q2222), new l4b(mbjVar32222, z2, wzcVar, 7)).z(w222).z(pt3Var222), new gt3(q5bVar5, i17)), new s5h(24, tbjVar4222, ku3Var2));
                        if (z2) {
                        }
                        final xtc q32222 = (i17 == 0 && fob.a()) ? fqj.q(utcVar, new uri(tbjVar4222, i302222)) : utcVar;
                        final t32 t32Var32222 = t32Var;
                        final xtc utcVar42222 = utcVar2;
                        final q5b q5bVar82222 = q5bVar5;
                        final boolean r1522222 = i17;
                        Function2 function22222 = new Function2() { // from class: ht3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                of3 of3Var2 = (of3) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                av8 av8Var4 = (av8) of3Var2;
                                if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                                    final q5b q5bVar9 = q5bVar82222;
                                    final dfj dfjVar4 = dfjVar;
                                    final int i31 = i3;
                                    final int i32 = i2;
                                    final mbj mbjVar4 = mbjVar32222;
                                    final wcj wcjVar4 = wcjVar;
                                    final jwk jwkVar2 = jwkVar;
                                    final xtc xtcVar3 = utcVar42222;
                                    final xtc xtcVar4 = X222;
                                    final xtc xtcVar5 = A2222;
                                    final xtc xtcVar6 = q32222;
                                    final t32 t32Var4 = t32Var32222;
                                    final tbj tbjVar5 = tbjVar4222;
                                    final boolean z17 = r1522222;
                                    final boolean z18 = z3;
                                    final Function1 function13 = function12;
                                    final nnd nndVar10 = nndVar9222;
                                    final kx4 kx4Var4 = kx4Var3;
                                    tc3.this.invoke(yqo.H(-44346382, av8Var4, new Function2() { // from class: et3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj8, Object obj9) {
                                            xtc tokVar;
                                            of3 of3Var3 = (of3) obj8;
                                            int intValue2 = ((Integer) obj9).intValue();
                                            av8 av8Var5 = (av8) of3Var3;
                                            if (av8Var5.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                q5b q5bVar10 = q5b.this;
                                                xtc g6 = bkh.g(utc.a, ((p75) ((eoh) q5bVar10.g).getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                                int i33 = i31;
                                                int i34 = i32;
                                                wnn.K(i33, i34);
                                                dfj dfjVar5 = dfjVar4;
                                                if (i33 != 1 || i34 != Integer.MAX_VALUE) {
                                                    g6 = g6.z(new n99(dfjVar5, i33, i34));
                                                }
                                                boolean i35 = av8Var5.i(q5bVar10);
                                                Object O18 = av8Var5.O();
                                                if (i35 || O18 == nf3.a) {
                                                    O18 = new h63(q5bVar10, 5);
                                                    av8Var5.n0(O18);
                                                }
                                                Function0 function0 = (Function0) O18;
                                                mbj mbjVar5 = mbjVar4;
                                                ewd ewdVar2 = (ewd) ((eoh) mbjVar5.f).getValue();
                                                wcj wcjVar5 = wcjVar4;
                                                long j7 = wcjVar5.b;
                                                int i36 = pej.c;
                                                int i37 = (int) (j7 >> 32);
                                                long j8 = mbjVar5.e;
                                                if (i37 == ((int) (j8 >> 32)) && (i37 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                                    i37 = pej.g(j7);
                                                }
                                                mbjVar5.e = wcjVar5.b;
                                                gwj a5 = ckk.a(jwkVar2, wcjVar5.a);
                                                int ordinal = ewdVar2.ordinal();
                                                if (ordinal == 0) {
                                                    tokVar = new tok(mbjVar5, i37, a5, function0);
                                                } else {
                                                    if (ordinal != 1) {
                                                        zzl.b();
                                                        return null;
                                                    }
                                                    tokVar = new if9(mbjVar5, i37, a5, function0);
                                                }
                                                d7a.j(c5n.u(wnn.B(g6).z(tokVar).z(xtcVar3).z(xtcVar4).z(new qcj(dfjVar5)).z(xtcVar5).z(xtcVar6), t32Var4), yqo.H(1412697320, av8Var5, new ft3(tbjVar5, q5bVar10, z17, z18, function13, wcjVar5, nndVar10, kx4Var4, i34)), av8Var5, 48);
                                            } else {
                                                av8Var5.W();
                                            }
                                            return Unit.a;
                                        }
                                    }), av8Var4, 6);
                                } else {
                                    av8Var4.W();
                                }
                                return Unit.a;
                            }
                        };
                        av8Var = r15;
                        f(u22222, tbjVar4222, yqo.H(-814563849, av8Var, function22222), av8Var, 384);
                    }
                }
                wd8Var2 = wd8Var;
                if (z5) {
                }
                xl0 xl0Var22 = (xl0) fp4Var.c;
                xl0Var22.d = -1;
                xl0Var22.e = -1;
                a2 = wcj.a(wcjVar, null, 0L, 3);
                wcj wcjVar32 = (wcj) fp4Var.b;
                fp4Var.b = a2;
                if (jdjVar != null) {
                }
                O = r15.O();
                obj2 = obj;
                if (O == obj2) {
                }
                aakVar = (aak) O;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (!aakVar.e) {
                }
                aakVar.d = Long.valueOf(currentTimeMillis2);
                aakVar.a(wcjVar);
                O2 = r15.O();
                if (O2 == obj2) {
                }
                final ku3 ku3Var32 = (ku3) O2;
                O3 = r15.O();
                if (O3 == obj2) {
                }
                final t32 t32Var22 = (t32) O3;
                O4 = r15.O();
                if (O4 == obj2) {
                }
                final tbj tbjVar32 = (tbj) O4;
                final nnd nndVar82 = nndVar;
                tbjVar32.b = nndVar82;
                tbjVar32.c = q5bVar6.v;
                tbjVar32.d = q5bVar6;
                ((eoh) tbjVar32.e).setValue(wcjVar);
                tbjVar32.v = new pej(j4);
                tbjVar32.g = (iy2) r15.k(dh3.f);
                tbjVar32.h = ku3Var32;
                tbjVar32.j = (z69) r15.k(dh3.l);
                tbjVar32.k = ce8Var3;
                final boolean z142 = !z3;
                ((eoh) tbjVar32.l).setValue(Boolean.valueOf(z142));
                ((eoh) tbjVar32.m).setValue(Boolean.valueOf(z2));
                r15.d0(1966756105);
                u2h u2hVar2 = u2h.a;
                tbjVar32.i = lje.b(dfjVar3.a.k, r15);
                r15.s(false);
                q5bVar6.b();
                i10 = i9;
                int i212 = i10 & 7168;
                int i222 = i8;
                boolean i232 = (i212 == 2048) | r15.i(q5bVar6) | ((i10 & 57344) == 16384) | r15.i(gdjVar3) | (i222 == 4);
                i11 = (i10 & 112) ^ 48;
                if (i11 > 32) {
                }
                z7 = i232;
                if ((i10 & 48) != 32) {
                }
                z8 = true;
                i12 = z7 | z8 | r15.i(nndVar82) | r15.i(ku3Var32) | r15.i(t32Var22) | r15.i(tbjVar32);
                Object O16222 = r15.O();
                if (i12) {
                }
                final qu9 qu9Var5222 = qu9Var2;
                ce8Var = ce8Var3;
                q5bVar2 = q5bVar6;
                wd8Var3 = wd8Var2;
                i13 = i222;
                obj4 = obj2;
                obj3 = new Function1() { // from class: jt3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        bej d2;
                        ie8 ie8Var = (ie8) obj6;
                        q5b q5bVar73 = q5b.this;
                        if (q5bVar73.b() == ie8Var.g()) {
                            return Unit.a;
                        }
                        ((eoh) q5bVar73.f).setValue(Boolean.valueOf(ie8Var.g()));
                        boolean b23 = q5bVar73.b();
                        wcj wcjVar4 = wcjVar;
                        nnd nndVar93 = nndVar82;
                        if (b23 && z2 && !z3) {
                            l98.i0(gdjVar3, q5bVar73, wcjVar4, qu9Var5222, nndVar93);
                        } else {
                            l98.O(q5bVar73);
                        }
                        if (ie8Var.g() && (d2 = q5bVar73.d()) != null) {
                            xw3.L(ku3Var32, null, null, new h10(t32Var22, wcjVar4, q5bVar73, d2, nndVar93, null, 3), 3);
                        }
                        if (!ie8Var.g()) {
                            tbjVar32.d(null);
                        }
                        return Unit.a;
                    }
                };
                t32Var = t32Var22;
                nndVar2 = nndVar82;
                tbjVar = tbjVar32;
                wcjVar2 = wcjVar;
                ku3Var = ku3Var32;
                z9 = z2;
                gdjVar = gdjVar3;
                qu9Var3 = qu9Var5222;
                r15.n0(obj3);
                utc utcVar3222 = utc.a;
                xtc r2222 = pd0.r(kik.L(lz.G(utcVar3222, ce8Var), (Function1) obj3), z9, wzcVar);
                e1d g4222 = e.g(Boolean.valueOf((z9 || z3) ? false : true), r15);
                Unit unit2222 = Unit.a;
                boolean g5222 = r15.g(g4222) | r15.i(q5bVar2) | r15.i(gdjVar) | r15.i(tbjVar);
                if (i11 > 32) {
                }
                q5bVar3 = q5bVar2;
                if ((i10 & 48) != 32) {
                }
                z10 = true;
                z11 = g5222 | z10;
                Object O172222 = r15.O();
                if (z11) {
                }
                tbjVar2 = tbjVar;
                unit = unit2222;
                ku3Var2 = ku3Var;
                nndVar3 = nndVar2;
                xtcVar2 = r2222;
                q5bVar4 = q5bVar3;
                utcVar = utcVar3222;
                ce8Var2 = ce8Var;
                wzcVar2 = wzcVar;
                gdj gdjVar42222 = gdjVar;
                h10Var = new h10(q5bVar4, g4222, gdjVar42222, tbjVar2, qu9Var, null, 2);
                gdjVar2 = gdjVar42222;
                r15.n0(h10Var);
                hz8.o(r15, unit, (Function2) h10Var);
                int i242222 = 4;
                xtc a42222 = koi.a(utcVar, 8675309, new m00(new gt3(q5bVar4, i242222), i242222));
                final tbj tbjVar42222 = tbjVar2;
                nndVar4 = nndVar3;
                rrh rrhVar2222 = new rrh(q5bVar4, ce8Var2, z3, z2, tbjVar42222, nndVar4);
                if (z2) {
                }
                xtc b22222 = koi.b(a42222, tbjVar42222.z, tbjVar42222.y, new m00(tbjVar42222, 8));
                kze.a.getClass();
                xtc w2222 = sea.w(b22222, n9e.f);
                final xtc X2222 = td4.X(utcVar, new fa(13, q5bVar4, wcjVar2, nndVar4));
                boolean i252222 = r15.i(q5bVar4) | (i212 != 2048);
                s8lVar2 = s8lVar;
                int i262222 = i13;
                g2 = i252222 | r15.g(s8lVar2) | r15.i(tbjVar42222) | (i262222 != 4) | r15.i(nndVar4);
                O5 = r15.O();
                if (g2) {
                }
                hk hkVar2222 = new hk(q5bVar4, z2, s8lVar2, tbjVar42222, wcjVar2, nndVar4);
                s8lVar3 = s8lVar2;
                r15.n0(hkVar2222);
                O5 = hkVar2222;
                final xtc A22222 = un0.A(utcVar, (Function1) O5);
                q5b q5bVar72222 = q5bVar4;
                gdj gdjVar52222 = gdjVar2;
                pt3 pt3Var2222 = new pt3(gwjVar, wcjVar, q5bVar72222, z3, z2, nndVar4, tbjVar42222, qu9Var, ce8Var2);
                q5bVar5 = q5bVar72222;
                if (!z2 && !z3 && ((ata) s8lVar3).b() && pej.d(((pej) ((eoh) q5bVar5.A).getValue()).a) && pej.d(((pej) ((eoh) q5bVar5.B).getValue()).a)) {
                }
                i14 = r15.i(tbjVar42222);
                O6 = r15.O();
                if (!i14) {
                }
                O6 = new kt3(tbjVar42222, 0);
                r15.n0(O6);
                hz8.d(tbjVar42222, (Function1) O6, r15);
                i15 = r15.i(q5bVar5) | r15.i(gdjVar52222) | (i262222 != 4) | ((i11 <= 32 && r15.g(qu9Var)) || (i10 & 48) == 32);
                O7 = r15.O();
                if (i15) {
                }
                l50 l50Var2222 = new l50(q5bVar5, gdjVar52222, wcjVar, qu9Var, 6);
                qu9Var4 = qu9Var;
                r15.n0(l50Var2222);
                O7 = l50Var2222;
                hz8.d(qu9Var4, (Function1) O7, r15);
                final Function1 gt3Var2222 = q5bVar5.v;
                if (i2 != 1) {
                }
                final int i272222 = qu9Var4.e;
                final nnd nndVar92222 = nndVar5;
                xtc q22222 = fqj.q(utcVar, new ct8() { // from class: saj
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        ((Integer) obj8).getClass();
                        av8 av8Var4 = (av8) ((of3) obj7);
                        av8Var4.d0(851809892);
                        Object O18 = av8Var4.O();
                        a99 a99Var = nf3.a;
                        if (O18 == a99Var) {
                            O18 = new oej();
                            av8Var4.n0(O18);
                        }
                        oej oejVar = (oej) O18;
                        Object O19 = av8Var4.O();
                        if (O19 == a99Var) {
                            O19 = new gl4();
                            av8Var4.n0(O19);
                        }
                        raj rajVar = new raj(q5b.this, tbjVar42222, wcjVar, z142, z15, oejVar, nndVar92222, aakVar, (gl4) O19, gt3Var2222, i272222);
                        boolean i282222 = av8Var4.i(rajVar);
                        Object O20 = av8Var4.O();
                        if (i282222 || O20 == a99Var) {
                            chf chfVar = new chf(1, rajVar, raj.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                            av8Var4.n0(chfVar);
                            O20 = chfVar;
                        }
                        xtc y = iz8.y((Function1) ((KFunction) O20));
                        av8Var4.s(false);
                        return y;
                    }
                });
                int i282222 = qu9Var4.d;
                if (i282222 == 7) {
                }
                boolean booleanValue22222 = ((Boolean) g4222.getValue()).booleanValue();
                i10 i10Var322222 = i10Var;
                h2 = r15.h(z12) | r15.i(i10Var322222);
                O8 = r15.O();
                if (!h2) {
                }
                O8 = new m1(z12, i10Var322222, 5);
                r15.n0(O8);
                xtc H22222 = iz8.H(utcVar, booleanValue22222, z12, (Function0) O8);
                n52 n52Var22222 = (n52) r15.k(mv0.a);
                long j622222 = ((r13) r15.k(mv0.b)).a;
                long b322222 = hkg.b(1308617531);
                int i2922222 = r13.j;
                if (!e8k.a(j622222, b322222)) {
                }
                i16 = r15.i(q5bVar5) | r15.g(pvhVar2);
                O9 = r15.O();
                if (!i16) {
                }
                O9 = new r82(7, q5bVar5, pvhVar2);
                r15.n0(O9);
                xtc z1622222 = iz8.z(v9g.F(xtcVar.z(td4.Z(utcVar, (Function1) O9)), i10Var322222, q5bVar5, tbjVar42222).z(H22222).z(xtcVar2), new wsd(13, wd8Var3, q5bVar5));
                int i3022222 = 10;
                final mbj mbjVar322222 = mbjVar;
                i17 = 0;
                xtc u222222 = v9g.u(un0.A(fqj.q(iz8.z(z1622222, new zi(i3022222, q5bVar5, tbjVar42222)).z(q22222), new l4b(mbjVar322222, z2, wzcVar, 7)).z(w2222).z(pt3Var2222), new gt3(q5bVar5, i17)), new s5h(24, tbjVar42222, ku3Var2));
                if (z2) {
                }
                final xtc q322222 = (i17 == 0 && fob.a()) ? fqj.q(utcVar, new uri(tbjVar42222, i3022222)) : utcVar;
                final t32 t32Var322222 = t32Var;
                final xtc utcVar422222 = utcVar2;
                final q5b q5bVar822222 = q5bVar5;
                final boolean r15222222 = i17;
                Function2 function222222 = new Function2() { // from class: ht3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        of3 of3Var2 = (of3) obj6;
                        int intValue = ((Integer) obj7).intValue();
                        av8 av8Var4 = (av8) of3Var2;
                        if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                            final q5b q5bVar9 = q5bVar822222;
                            final dfj dfjVar4 = dfjVar;
                            final int i31 = i3;
                            final int i32 = i2;
                            final mbj mbjVar4 = mbjVar322222;
                            final wcj wcjVar4 = wcjVar;
                            final jwk jwkVar2 = jwkVar;
                            final xtc xtcVar3 = utcVar422222;
                            final xtc xtcVar4 = X2222;
                            final xtc xtcVar5 = A22222;
                            final xtc xtcVar6 = q322222;
                            final t32 t32Var4 = t32Var322222;
                            final tbj tbjVar5 = tbjVar42222;
                            final boolean z17 = r15222222;
                            final boolean z18 = z3;
                            final Function1 function13 = function12;
                            final nnd nndVar10 = nndVar92222;
                            final kx4 kx4Var4 = kx4Var3;
                            tc3.this.invoke(yqo.H(-44346382, av8Var4, new Function2() { // from class: et3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj8, Object obj9) {
                                    xtc tokVar;
                                    of3 of3Var3 = (of3) obj8;
                                    int intValue2 = ((Integer) obj9).intValue();
                                    av8 av8Var5 = (av8) of3Var3;
                                    if (av8Var5.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        q5b q5bVar10 = q5b.this;
                                        xtc g6 = bkh.g(utc.a, ((p75) ((eoh) q5bVar10.g).getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                        int i33 = i31;
                                        int i34 = i32;
                                        wnn.K(i33, i34);
                                        dfj dfjVar5 = dfjVar4;
                                        if (i33 != 1 || i34 != Integer.MAX_VALUE) {
                                            g6 = g6.z(new n99(dfjVar5, i33, i34));
                                        }
                                        boolean i35 = av8Var5.i(q5bVar10);
                                        Object O18 = av8Var5.O();
                                        if (i35 || O18 == nf3.a) {
                                            O18 = new h63(q5bVar10, 5);
                                            av8Var5.n0(O18);
                                        }
                                        Function0 function0 = (Function0) O18;
                                        mbj mbjVar5 = mbjVar4;
                                        ewd ewdVar2 = (ewd) ((eoh) mbjVar5.f).getValue();
                                        wcj wcjVar5 = wcjVar4;
                                        long j7 = wcjVar5.b;
                                        int i36 = pej.c;
                                        int i37 = (int) (j7 >> 32);
                                        long j8 = mbjVar5.e;
                                        if (i37 == ((int) (j8 >> 32)) && (i37 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                            i37 = pej.g(j7);
                                        }
                                        mbjVar5.e = wcjVar5.b;
                                        gwj a5 = ckk.a(jwkVar2, wcjVar5.a);
                                        int ordinal = ewdVar2.ordinal();
                                        if (ordinal == 0) {
                                            tokVar = new tok(mbjVar5, i37, a5, function0);
                                        } else {
                                            if (ordinal != 1) {
                                                zzl.b();
                                                return null;
                                            }
                                            tokVar = new if9(mbjVar5, i37, a5, function0);
                                        }
                                        d7a.j(c5n.u(wnn.B(g6).z(tokVar).z(xtcVar3).z(xtcVar4).z(new qcj(dfjVar5)).z(xtcVar5).z(xtcVar6), t32Var4), yqo.H(1412697320, av8Var5, new ft3(tbjVar5, q5bVar10, z17, z18, function13, wcjVar5, nndVar10, kx4Var4, i34)), av8Var5, 48);
                                    } else {
                                        av8Var5.W();
                                    }
                                    return Unit.a;
                                }
                            }), av8Var4, 6);
                        } else {
                            av8Var4.W();
                        }
                        return Unit.a;
                    }
                };
                av8Var = r15;
                f(u222222, tbjVar42222, yqo.H(-814563849, av8Var, function222222), av8Var, 384);
            }
            z6 = false;
            if (pejVar2 != null) {
            }
            wd8Var2 = wd8Var;
            if (z5) {
            }
            xl0 xl0Var222 = (xl0) fp4Var.c;
            xl0Var222.d = -1;
            xl0Var222.e = -1;
            a2 = wcj.a(wcjVar, null, 0L, 3);
            wcj wcjVar322 = (wcj) fp4Var.b;
            fp4Var.b = a2;
            if (jdjVar != null) {
            }
            O = r15.O();
            obj2 = obj;
            if (O == obj2) {
            }
            aakVar = (aak) O;
            long currentTimeMillis22 = System.currentTimeMillis();
            if (!aakVar.e) {
            }
            aakVar.d = Long.valueOf(currentTimeMillis22);
            aakVar.a(wcjVar);
            O2 = r15.O();
            if (O2 == obj2) {
            }
            final ku3 ku3Var322 = (ku3) O2;
            O3 = r15.O();
            if (O3 == obj2) {
            }
            final t32 t32Var222 = (t32) O3;
            O4 = r15.O();
            if (O4 == obj2) {
            }
            final tbj tbjVar322 = (tbj) O4;
            final nnd nndVar822 = nndVar;
            tbjVar322.b = nndVar822;
            tbjVar322.c = q5bVar6.v;
            tbjVar322.d = q5bVar6;
            ((eoh) tbjVar322.e).setValue(wcjVar);
            tbjVar322.v = new pej(j4);
            tbjVar322.g = (iy2) r15.k(dh3.f);
            tbjVar322.h = ku3Var322;
            tbjVar322.j = (z69) r15.k(dh3.l);
            tbjVar322.k = ce8Var3;
            final boolean z1422 = !z3;
            ((eoh) tbjVar322.l).setValue(Boolean.valueOf(z1422));
            ((eoh) tbjVar322.m).setValue(Boolean.valueOf(z2));
            r15.d0(1966756105);
            u2h u2hVar22 = u2h.a;
            tbjVar322.i = lje.b(dfjVar3.a.k, r15);
            r15.s(false);
            q5bVar6.b();
            i10 = i9;
            int i2122 = i10 & 7168;
            int i2222 = i8;
            boolean i2322 = (i2122 == 2048) | r15.i(q5bVar6) | ((i10 & 57344) == 16384) | r15.i(gdjVar3) | (i2222 == 4);
            i11 = (i10 & 112) ^ 48;
            if (i11 > 32) {
            }
            z7 = i2322;
            if ((i10 & 48) != 32) {
            }
            z8 = true;
            i12 = z7 | z8 | r15.i(nndVar822) | r15.i(ku3Var322) | r15.i(t32Var222) | r15.i(tbjVar322);
            Object O162222 = r15.O();
            if (i12) {
            }
            final qu9 qu9Var52222 = qu9Var2;
            ce8Var = ce8Var3;
            q5bVar2 = q5bVar6;
            wd8Var3 = wd8Var2;
            i13 = i2222;
            obj4 = obj2;
            obj3 = new Function1() { // from class: jt3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj6) {
                    bej d2;
                    ie8 ie8Var = (ie8) obj6;
                    q5b q5bVar73 = q5b.this;
                    if (q5bVar73.b() == ie8Var.g()) {
                        return Unit.a;
                    }
                    ((eoh) q5bVar73.f).setValue(Boolean.valueOf(ie8Var.g()));
                    boolean b23 = q5bVar73.b();
                    wcj wcjVar4 = wcjVar;
                    nnd nndVar93 = nndVar822;
                    if (b23 && z2 && !z3) {
                        l98.i0(gdjVar3, q5bVar73, wcjVar4, qu9Var52222, nndVar93);
                    } else {
                        l98.O(q5bVar73);
                    }
                    if (ie8Var.g() && (d2 = q5bVar73.d()) != null) {
                        xw3.L(ku3Var322, null, null, new h10(t32Var222, wcjVar4, q5bVar73, d2, nndVar93, null, 3), 3);
                    }
                    if (!ie8Var.g()) {
                        tbjVar322.d(null);
                    }
                    return Unit.a;
                }
            };
            t32Var = t32Var222;
            nndVar2 = nndVar822;
            tbjVar = tbjVar322;
            wcjVar2 = wcjVar;
            ku3Var = ku3Var322;
            z9 = z2;
            gdjVar = gdjVar3;
            qu9Var3 = qu9Var52222;
            r15.n0(obj3);
            utc utcVar32222 = utc.a;
            xtc r22222 = pd0.r(kik.L(lz.G(utcVar32222, ce8Var), (Function1) obj3), z9, wzcVar);
            e1d g42222 = e.g(Boolean.valueOf((z9 || z3) ? false : true), r15);
            Unit unit22222 = Unit.a;
            boolean g52222 = r15.g(g42222) | r15.i(q5bVar2) | r15.i(gdjVar) | r15.i(tbjVar);
            if (i11 > 32) {
            }
            q5bVar3 = q5bVar2;
            if ((i10 & 48) != 32) {
            }
            z10 = true;
            z11 = g52222 | z10;
            Object O1722222 = r15.O();
            if (z11) {
            }
            tbjVar2 = tbjVar;
            unit = unit22222;
            ku3Var2 = ku3Var;
            nndVar3 = nndVar2;
            xtcVar2 = r22222;
            q5bVar4 = q5bVar3;
            utcVar = utcVar32222;
            ce8Var2 = ce8Var;
            wzcVar2 = wzcVar;
            gdj gdjVar422222 = gdjVar;
            h10Var = new h10(q5bVar4, g42222, gdjVar422222, tbjVar2, qu9Var, null, 2);
            gdjVar2 = gdjVar422222;
            r15.n0(h10Var);
            hz8.o(r15, unit, (Function2) h10Var);
            int i2422222 = 4;
            xtc a422222 = koi.a(utcVar, 8675309, new m00(new gt3(q5bVar4, i2422222), i2422222));
            final tbj tbjVar422222 = tbjVar2;
            nndVar4 = nndVar3;
            rrh rrhVar22222 = new rrh(q5bVar4, ce8Var2, z3, z2, tbjVar422222, nndVar4);
            if (z2) {
            }
            xtc b222222 = koi.b(a422222, tbjVar422222.z, tbjVar422222.y, new m00(tbjVar422222, 8));
            kze.a.getClass();
            xtc w22222 = sea.w(b222222, n9e.f);
            final xtc X22222 = td4.X(utcVar, new fa(13, q5bVar4, wcjVar2, nndVar4));
            boolean i2522222 = r15.i(q5bVar4) | (i2122 != 2048);
            s8lVar2 = s8lVar;
            int i2622222 = i13;
            g2 = i2522222 | r15.g(s8lVar2) | r15.i(tbjVar422222) | (i2622222 != 4) | r15.i(nndVar4);
            O5 = r15.O();
            if (g2) {
            }
            hk hkVar22222 = new hk(q5bVar4, z2, s8lVar2, tbjVar422222, wcjVar2, nndVar4);
            s8lVar3 = s8lVar2;
            r15.n0(hkVar22222);
            O5 = hkVar22222;
            final xtc A222222 = un0.A(utcVar, (Function1) O5);
            q5b q5bVar722222 = q5bVar4;
            gdj gdjVar522222 = gdjVar2;
            pt3 pt3Var22222 = new pt3(gwjVar, wcjVar, q5bVar722222, z3, z2, nndVar4, tbjVar422222, qu9Var, ce8Var2);
            q5bVar5 = q5bVar722222;
            if (!z2 && !z3 && ((ata) s8lVar3).b() && pej.d(((pej) ((eoh) q5bVar5.A).getValue()).a) && pej.d(((pej) ((eoh) q5bVar5.B).getValue()).a)) {
            }
            i14 = r15.i(tbjVar422222);
            O6 = r15.O();
            if (!i14) {
            }
            O6 = new kt3(tbjVar422222, 0);
            r15.n0(O6);
            hz8.d(tbjVar422222, (Function1) O6, r15);
            i15 = r15.i(q5bVar5) | r15.i(gdjVar522222) | (i2622222 != 4) | ((i11 <= 32 && r15.g(qu9Var)) || (i10 & 48) == 32);
            O7 = r15.O();
            if (i15) {
            }
            l50 l50Var22222 = new l50(q5bVar5, gdjVar522222, wcjVar, qu9Var, 6);
            qu9Var4 = qu9Var;
            r15.n0(l50Var22222);
            O7 = l50Var22222;
            hz8.d(qu9Var4, (Function1) O7, r15);
            final Function1 gt3Var22222 = q5bVar5.v;
            if (i2 != 1) {
            }
            final int i2722222 = qu9Var4.e;
            final nnd nndVar922222 = nndVar5;
            xtc q222222 = fqj.q(utcVar, new ct8() { // from class: saj
                @Override // defpackage.ct8
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    av8 av8Var4 = (av8) ((of3) obj7);
                    av8Var4.d0(851809892);
                    Object O18 = av8Var4.O();
                    a99 a99Var = nf3.a;
                    if (O18 == a99Var) {
                        O18 = new oej();
                        av8Var4.n0(O18);
                    }
                    oej oejVar = (oej) O18;
                    Object O19 = av8Var4.O();
                    if (O19 == a99Var) {
                        O19 = new gl4();
                        av8Var4.n0(O19);
                    }
                    raj rajVar = new raj(q5b.this, tbjVar422222, wcjVar, z1422, z15, oejVar, nndVar922222, aakVar, (gl4) O19, gt3Var22222, i2722222);
                    boolean i2822222 = av8Var4.i(rajVar);
                    Object O20 = av8Var4.O();
                    if (i2822222 || O20 == a99Var) {
                        chf chfVar = new chf(1, rajVar, raj.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 26);
                        av8Var4.n0(chfVar);
                        O20 = chfVar;
                    }
                    xtc y = iz8.y((Function1) ((KFunction) O20));
                    av8Var4.s(false);
                    return y;
                }
            });
            int i2822222 = qu9Var4.d;
            if (i2822222 == 7) {
            }
            boolean booleanValue222222 = ((Boolean) g42222.getValue()).booleanValue();
            i10 i10Var3222222 = i10Var;
            h2 = r15.h(z12) | r15.i(i10Var3222222);
            O8 = r15.O();
            if (!h2) {
            }
            O8 = new m1(z12, i10Var3222222, 5);
            r15.n0(O8);
            xtc H222222 = iz8.H(utcVar, booleanValue222222, z12, (Function0) O8);
            n52 n52Var222222 = (n52) r15.k(mv0.a);
            long j6222222 = ((r13) r15.k(mv0.b)).a;
            long b3222222 = hkg.b(1308617531);
            int i29222222 = r13.j;
            if (!e8k.a(j6222222, b3222222)) {
            }
            i16 = r15.i(q5bVar5) | r15.g(pvhVar2);
            O9 = r15.O();
            if (!i16) {
            }
            O9 = new r82(7, q5bVar5, pvhVar2);
            r15.n0(O9);
            xtc z16222222 = iz8.z(v9g.F(xtcVar.z(td4.Z(utcVar, (Function1) O9)), i10Var3222222, q5bVar5, tbjVar422222).z(H222222).z(xtcVar2), new wsd(13, wd8Var3, q5bVar5));
            int i30222222 = 10;
            final mbj mbjVar3222222 = mbjVar;
            i17 = 0;
            xtc u2222222 = v9g.u(un0.A(fqj.q(iz8.z(z16222222, new zi(i30222222, q5bVar5, tbjVar422222)).z(q222222), new l4b(mbjVar3222222, z2, wzcVar, 7)).z(w22222).z(pt3Var22222), new gt3(q5bVar5, i17)), new s5h(24, tbjVar422222, ku3Var2));
            if (z2) {
            }
            final xtc q3222222 = (i17 == 0 && fob.a()) ? fqj.q(utcVar, new uri(tbjVar422222, i30222222)) : utcVar;
            final t32 t32Var3222222 = t32Var;
            final xtc utcVar4222222 = utcVar2;
            final q5b q5bVar8222222 = q5bVar5;
            final boolean r152222222 = i17;
            Function2 function2222222 = new Function2() { // from class: ht3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    of3 of3Var2 = (of3) obj6;
                    int intValue = ((Integer) obj7).intValue();
                    av8 av8Var4 = (av8) of3Var2;
                    if (av8Var4.T(intValue & 1, (intValue & 3) != 2)) {
                        final q5b q5bVar9 = q5bVar8222222;
                        final dfj dfjVar4 = dfjVar;
                        final int i31 = i3;
                        final int i32 = i2;
                        final mbj mbjVar4 = mbjVar3222222;
                        final wcj wcjVar4 = wcjVar;
                        final jwk jwkVar2 = jwkVar;
                        final xtc xtcVar3 = utcVar4222222;
                        final xtc xtcVar4 = X22222;
                        final xtc xtcVar5 = A222222;
                        final xtc xtcVar6 = q3222222;
                        final t32 t32Var4 = t32Var3222222;
                        final tbj tbjVar5 = tbjVar422222;
                        final boolean z17 = r152222222;
                        final boolean z18 = z3;
                        final Function1 function13 = function12;
                        final nnd nndVar10 = nndVar922222;
                        final kx4 kx4Var4 = kx4Var3;
                        tc3.this.invoke(yqo.H(-44346382, av8Var4, new Function2() { // from class: et3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj8, Object obj9) {
                                xtc tokVar;
                                of3 of3Var3 = (of3) obj8;
                                int intValue2 = ((Integer) obj9).intValue();
                                av8 av8Var5 = (av8) of3Var3;
                                if (av8Var5.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    q5b q5bVar10 = q5b.this;
                                    xtc g6 = bkh.g(utc.a, ((p75) ((eoh) q5bVar10.g).getValue()).a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                                    int i33 = i31;
                                    int i34 = i32;
                                    wnn.K(i33, i34);
                                    dfj dfjVar5 = dfjVar4;
                                    if (i33 != 1 || i34 != Integer.MAX_VALUE) {
                                        g6 = g6.z(new n99(dfjVar5, i33, i34));
                                    }
                                    boolean i35 = av8Var5.i(q5bVar10);
                                    Object O18 = av8Var5.O();
                                    if (i35 || O18 == nf3.a) {
                                        O18 = new h63(q5bVar10, 5);
                                        av8Var5.n0(O18);
                                    }
                                    Function0 function0 = (Function0) O18;
                                    mbj mbjVar5 = mbjVar4;
                                    ewd ewdVar2 = (ewd) ((eoh) mbjVar5.f).getValue();
                                    wcj wcjVar5 = wcjVar4;
                                    long j7 = wcjVar5.b;
                                    int i36 = pej.c;
                                    int i37 = (int) (j7 >> 32);
                                    long j8 = mbjVar5.e;
                                    if (i37 == ((int) (j8 >> 32)) && (i37 = (int) (j7 & 4294967295L)) == ((int) (j8 & 4294967295L))) {
                                        i37 = pej.g(j7);
                                    }
                                    mbjVar5.e = wcjVar5.b;
                                    gwj a5 = ckk.a(jwkVar2, wcjVar5.a);
                                    int ordinal = ewdVar2.ordinal();
                                    if (ordinal == 0) {
                                        tokVar = new tok(mbjVar5, i37, a5, function0);
                                    } else {
                                        if (ordinal != 1) {
                                            zzl.b();
                                            return null;
                                        }
                                        tokVar = new if9(mbjVar5, i37, a5, function0);
                                    }
                                    d7a.j(c5n.u(wnn.B(g6).z(tokVar).z(xtcVar3).z(xtcVar4).z(new qcj(dfjVar5)).z(xtcVar5).z(xtcVar6), t32Var4), yqo.H(1412697320, av8Var5, new ft3(tbjVar5, q5bVar10, z17, z18, function13, wcjVar5, nndVar10, kx4Var4, i34)), av8Var5, 48);
                                } else {
                                    av8Var5.W();
                                }
                                return Unit.a;
                            }
                        }), av8Var4, 6);
                    } else {
                        av8Var4.W();
                    }
                    return Unit.a;
                }
            };
            av8Var = r15;
            f(u2222222, tbjVar422222, yqo.H(-814563849, av8Var, function2222222), av8Var, 384);
        } else {
            av8Var = av8Var3;
            av8Var.W();
        }
        eqf u3 = av8Var.u();
        if (u3 != null) {
            u3.d = new Function2() { // from class: it3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int K = aba.K(i4 | 1);
                    int K2 = aba.K(i5);
                    l98.e(wcj.this, function1, xtcVar, dfjVar, jwkVar, function12, wzcVar, pvhVar, z, i2, i3, qu9Var, ijaVar, z2, z3, tc3Var, (of3) obj6, K, K2);
                    return Unit.a;
                }
            };
        }
    }

    public static final xtc e0(xtc xtcVar, float f2, float f3, float f4, float f5) {
        return xtcVar.z(new m3e(f2, f3, f4, f5, new etd(10)));
    }

    public static final void f(xtc xtcVar, tbj tbjVar, tc3 tc3Var, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2036174316);
        int i3 = (av8Var.g(xtcVar) ? 4 : 2) | i2 | (av8Var.i(tbjVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            k1c c2 = e12.c(uxf.c, true);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            lz.e(tbjVar, tc3Var, av8Var, (i3 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new cyb(xtcVar, tbjVar, tc3Var, i2, 15);
        }
    }

    public static xtc f0(xtc xtcVar, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return e0(xtcVar, f2, f3, f4, f5);
    }

    public static final void g(osa osaVar, e67 e67Var, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1679167149);
        int i3 = i2 | (av8Var2.i(osaVar) ? 4 : 2) | (av8Var2.g(e67Var) ? 32 : 16) | (av8Var2.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i4 = 0;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            av8Var = av8Var2;
            q5a.p(null, yqo.H(-282636943, av8Var2, new kz6(8, e67Var, function1)), null, null, null, 0, r13.h, 0L, null, yqo.H(-757635140, av8Var2, new d67(i4, (Object) osaVar, (Object) e67Var, (Object) function1)), av8Var, 806879280, 445);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new uu6(i2, 6, osaVar, e67Var, function1);
        }
    }

    public static final Set g0(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            e93 e93Var = (e93) entry.getKey();
            Number number = (Number) entry.getValue();
            Pair pair = number != null ? new Pair(e93Var, Double.valueOf(number.doubleValue())) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.size() < 2) {
            return rm5.a;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            yhk.d();
            return null;
        }
        double doubleValue = ((Number) ((Pair) it2.next()).b).doubleValue();
        while (it2.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) ((Pair) it2.next()).b).doubleValue());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((Number) ((Pair) next).b).doubleValue() == doubleValue) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add((e93) ((Pair) it4.next()).a);
        }
        return CollectionsKt.W0(arrayList3);
    }

    public static final void h(h67 h67Var, j37 j37Var, Function0 function0, of3 of3Var, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-620025071);
        int i3 = (av8Var.i(h67Var) ? 4 : 2) | i2 | (av8Var.i(j37Var) ? 32 : 16) | (av8Var.i(function0) ? 256 : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            nn2 nn2Var = h67Var.j;
            boolean i4 = av8Var.i(j37Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i4 || O == a99Var) {
                O = new x16(j37Var, 15);
                av8Var.n0(O);
            }
            w1a.c(nn2Var, null, (Function1) O, av8Var, 0, 14);
            osa a2 = rsa.a(h67Var.k, av8Var);
            e67 k2 = h67Var.k();
            boolean i5 = av8Var.i(h67Var) | ((i3 & 896) == 256) | av8Var.i(context);
            Object O2 = av8Var.O();
            if (i5 || O2 == a99Var) {
                O2 = new dr6(function0, h67Var, context, 7);
                av8Var.n0(O2);
            }
            g(a2, k2, (Function1) O2, av8Var, 8);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new uu6(h67Var, j37Var, function0, i2, 7);
        }
    }

    public static final void h0(phi phiVar) {
        phiVar.getClass();
        uhi uhiVar = uhi.a;
    }

    public static final void i(Function0 function0, xtc xtcVar, float f2, of3 of3Var, int i2) {
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(969254693);
        int i3 = i2 | (av8Var.i(function0) ? 4 : 2) | (av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            kv1 kv1Var = uxf.p;
            xtc h2 = ljg.h(12.0f, xtcVar, lz.D(R.color.surface_2, av8Var), 8.0f);
            u23 a2 = t23.a(ww9.d, kv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, h2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            utc utcVar = utc.a;
            nq8.h(av8Var, bkh.e(utcVar, 10.0f * f2));
            d7e t2 = haa.t(R.drawable.ic_plus, 0, av8Var);
            long D = lz.D(R.color.primary_default, av8Var);
            n7g n7gVar = o7g.a;
            xtc A = wnn.A(utcVar, n7gVar);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new v61(25, function0);
                av8Var.n0(O);
            }
            kq9.a(t2, null, bkh.l(b0(n9e.q(d2a.E(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), 2.0f, n7gVar, false, 0L, 28), lz.D(R.color.surface_1, av8Var), n7gVar), 12.0f), 24.0f), D, av8Var, 56, 0);
            nq8.h(av8Var, bkh.e(utcVar, 6.0f * f2));
            String v2 = oea.v(R.string.select_player, av8Var);
            yf8 yf8Var = xth.a;
            dfj l2 = xth.l();
            long j2 = xth.l().a.b;
            v8a.l(j2);
            dfj a3 = dfj.a(l2, 0L, v8a.E(1095216660480L & j2, lfj.c(j2) * f2), null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213);
            long D2 = lz.D(R.color.primary_default, av8Var);
            xtc A2 = wnn.A(utcVar, o7g.a(4.0f));
            boolean z2 = i4 == 4;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new v61(26, function0);
                av8Var.n0(O2);
            }
            udj.c(v2, bkh.g(b0(tol.y(A2, false, false, false, 0L, null, (Function0) O2, av8Var, 31), 2.0f * f2), 16.0f * f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), D2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, a3, av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 8.0f * f2));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new oc7(function0, xtcVar, f2, i2, 0);
        }
    }

    public static final void i0(gdj gdjVar, q5b q5bVar, wcj wcjVar, qu9 qu9Var, nnd nndVar) {
        fp4 fp4Var = q5bVar.d;
        gt3 gt3Var = q5bVar.v;
        gt3 gt3Var2 = q5bVar.w;
        fsf fsfVar = new fsf();
        vsc vscVar = new vsc(25, fp4Var, gt3Var, fsfVar);
        sje sjeVar = gdjVar.a;
        sjeVar.c(wcjVar, qu9Var, vscVar, gt3Var2);
        jdj jdjVar = new jdj(gdjVar, sjeVar);
        gdjVar.b.set(jdjVar);
        fsfVar.a = jdjVar;
        q5bVar.e = jdjVar;
        Z(q5bVar, wcjVar, nndVar);
    }

    public static final void j(zwi zwiVar, boolean z, xtc xtcVar, of3 of3Var, int i2) {
        boolean z2;
        xtc xtcVar2;
        utc utcVar;
        boolean z3;
        boolean z4;
        zwi zwiVar2 = zwiVar;
        ho1 ho1Var = zwiVar2.a;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1424272592);
        int i3 = i2 | (av8Var.g(zwiVar2) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | 384;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) av8Var.k(nz.b);
            lv1 lv1Var = uxf.m;
            utc utcVar2 = utc.a;
            xtc q2 = n9e.q(bkh.d(utcVar2, 1.0f), lz.D(R.color.surface_1, av8Var), oyn.e);
            boolean i4 = ((i3 & 14) == 4) | av8Var.i(context);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new n37(15, context, zwiVar2);
                av8Var.n0(O);
            }
            xtc y = tol.y(q2, false, false, false, 0L, null, (Function0) O, av8Var, 31);
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            xtc f0 = f0(ljg.g(av8Var, C, f50Var3, 1.0f, true), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            if (z) {
                utcVar = utcVar2;
                z3 = false;
                av8Var.d0(193151946);
                av8Var.s(false);
            } else {
                av8Var.d0(192952058);
                utcVar = utcVar2;
                td4.u(ho1Var.a, 48, av8Var, bkh.l(utcVar, 24.0f));
                z3 = false;
                bf3.u(utcVar, 16.0f, av8Var, false);
            }
            String str = ho1Var.b;
            yf8 yf8Var = xth.a;
            utc utcVar3 = utcVar;
            ho1 ho1Var2 = ho1Var;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.m(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            bf3.u(utcVar3, 4.0f, av8Var, true);
            ng0 ng0Var = new ng0(4.0f, true, new l1(uxf.q, 5));
            xtc f02 = f0(utcVar3, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a4 = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            av8Var.d0(1843871744);
            zwiVar2 = zwiVar;
            int i5 = 0;
            for (Object obj : zwiVar2.b) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                ho1 ho1Var3 = ho1Var2;
                av8Var.a0(715181825, ho1Var3.a + "_" + i5 + "}");
                gv9 gv9Var = ((tx6) obj).a;
                int size = gv9Var.size();
                if (size == 0) {
                    z4 = false;
                    av8Var.d0(695875427);
                    t62.r(null, z, d0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1), av8Var, (i3 & 112) | 390);
                    av8Var.s(false);
                    Unit unit = Unit.a;
                } else if (size == 1) {
                    z4 = false;
                    av8Var.d0(696141934);
                    t62.r((ux6) CollectionsKt.Y(gv9Var), z, d0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1), av8Var, (i3 & 112) | 384);
                    av8Var.s(false);
                    Unit unit2 = Unit.a;
                } else if (size == 2) {
                    z4 = false;
                    av8Var.d0(696430668);
                    t62.g((ux6) gv9Var.get(0), (ux6) gv9Var.get(1), z, d0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1), av8Var, ((i3 << 3) & 896) | 3072);
                    av8Var.s(false);
                    Unit unit3 = Unit.a;
                } else if (size != 3) {
                    av8Var.d0(697180496);
                    z4 = false;
                    av8Var.s(false);
                    Unit unit4 = Unit.a;
                } else {
                    z4 = false;
                    av8Var.d0(696784843);
                    t62.u((ux6) gv9Var.get(0), (ux6) gv9Var.get(1), (ux6) gv9Var.get(2), z, d0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 1), av8Var, ((i3 << 6) & 7168) | 24576);
                    av8Var.s(false);
                    Unit unit5 = Unit.a;
                }
                av8Var.s(z4);
                i5 = i6;
                ho1Var2 = ho1Var3;
            }
            z2 = z;
            ljg.t(av8Var, false, true, true);
            xtcVar2 = utcVar3;
        } else {
            z2 = z;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new t60((Object) zwiVar2, z2, xtcVar2, i2, 14);
        }
    }

    public static final cfj j0(dfj dfjVar, Integer num, of3 of3Var) {
        long j2;
        dfjVar.getClass();
        float f2 = ((Context) ((av8) of3Var).k(bh3.b)).getResources().getConfiguration().fontScale;
        float f3 = f2 > 1.3f ? 1.3f / f2 : 1.0f;
        pwh pwhVar = dfjVar.a;
        if (lfj.a(pwhVar.b, lfj.c)) {
            j2 = pwhVar.b;
        } else {
            long j3 = pwhVar.b;
            v8a.l(j3);
            j2 = v8a.E(1095216660480L & j3, lfj.c(j3) * f3);
        }
        h1g h1gVar = new h1g(num.intValue());
        wg8 wg8Var = pwhVar.c;
        vg8 vg8Var = wg8Var != null ? wg8Var.equals(wg8.j) ? new vg8(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED) : wg8Var.equals(wg8.h) ? new vg8(500) : wg8Var.equals(wg8.g) ? new vg8(400) : new vg8(400) : null;
        lfj lfjVar = new lfj(j2);
        if ((120 & 2) != 0) {
            lfjVar = null;
        }
        if ((120 & 4) != 0) {
            vg8Var = null;
        }
        return new cfj(h1gVar, lfjVar, vg8Var, null);
    }

    public static final void k(final fy7 fy7Var, final fy7 fy7Var2, final String str, final String str2, final int i2, final String str3, final Double d2, final Double d3, final boolean z, final String str4, xtc xtcVar, final boolean z2, dfj dfjVar, dfj dfjVar2, long j2, long j3, of3 of3Var, final int i3, final int i4, final int i5) {
        boolean z3;
        int i6;
        av8 av8Var;
        final xtc xtcVar2;
        final dfj dfjVar3;
        final dfj dfjVar4;
        final long j4;
        final long j5;
        xtc xtcVar3;
        dfj j6;
        int i7;
        long D;
        dfj dfjVar5;
        long j7;
        fy7Var.getClass();
        fy7Var2.getClass();
        str4.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1752620605);
        int i8 = i3 | (av8Var2.g(fy7Var) ? 4 : 2) | (av8Var2.g(fy7Var2) ? 32 : 16) | (av8Var2.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(str2) ? a.o : 1024) | (av8Var2.e(i2) ? 16384 : 8192) | (av8Var2.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.g(d2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.g(d3) ? 8388608 : 4194304) | (av8Var2.h(z) ? 67108864 : 33554432) | (av8Var2.g(str4) ? 536870912 : 268435456);
        int i9 = i5 & 1024;
        if (i9 != 0) {
            z3 = z2;
            i6 = 6;
        } else if ((i4 & 6) == 0) {
            i6 = i4 | (av8Var2.g(xtcVar) ? 4 : 2);
            z3 = z2;
        } else {
            z3 = z2;
            i6 = i4;
        }
        int i10 = i6 | (av8Var2.h(z3) ? 32 : 16) | 74880;
        if (av8Var2.T(i8 & 1, ((i8 & 306783379) == 306783378 && (i10 & 74899) == 74898) ? false : true)) {
            av8Var2.Y();
            int i11 = i3 & 1;
            utc utcVar = utc.a;
            if (i11 == 0 || av8Var2.B()) {
                xtcVar3 = i9 != 0 ? utcVar : xtcVar;
                yf8 yf8Var = xth.a;
                j6 = xth.j();
                dfj c2 = xth.c();
                long D2 = lz.D(R.color.n_lv_1, av8Var2);
                i7 = i10 & (-524161);
                D = lz.D(R.color.n_lv_3, av8Var2);
                dfjVar5 = c2;
                j7 = D2;
            } else {
                av8Var2.W();
                j6 = dfjVar;
                dfjVar5 = dfjVar2;
                j7 = j2;
                D = j3;
                i7 = i10 & (-524161);
                xtcVar3 = xtcVar;
            }
            av8Var2.t();
            lv1 lv1Var = uxf.m;
            dfj dfjVar6 = j6;
            xtc d4 = bkh.d(xtcVar3, 1.0f);
            xtc xtcVar4 = xtcVar3;
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d4);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            int i12 = i7;
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            xtc f0 = f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc z4 = f0.z(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            mv1 mv1Var = uxf.c;
            k1c c3 = e12.c(mv1Var, false);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, z4);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            mv1 mv1Var2 = uxf.f;
            n12 n12Var = n12.a;
            xtc a3 = n12Var.a(utcVar, mv1Var2);
            ng0 ng0Var = new ng0(2.0f, true, new a70(6));
            kv1 kv1Var = uxf.p;
            u23 a4 = t23.a(ng0Var, kv1Var, av8Var2, 54);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m4 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, a3);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var);
            waa.K(av8Var2, m4, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var3);
            int i13 = (i8 >> 18) & 7168;
            int i14 = (i8 >> 12) & 57344;
            int i15 = (i12 << 12) & 458752;
            w(null, fy7Var, false, str4, z, z2, d2 == null ? 40.0f : 32.0f, 0L, 0L, !str4.equals(Sports.TENNIS), av8Var2, ((i8 << 3) & 112) | 384 | i13 | i14 | i15, 385);
            av8 av8Var3 = av8Var2;
            if (d2 == null) {
                av8Var3.d0(1362125815);
                av8Var3.s(false);
            } else {
                av8Var3.d0(1362125816);
                i9a.i(Double.valueOf(d2.doubleValue()), false, null, null, null, null, false, av8Var3, 432, PglCryptUtils.BASE64_FAILED);
                av8Var3 = av8Var3;
                Unit unit = Unit.a;
                av8Var3.s(false);
            }
            av8Var3.s(true);
            av8Var3.s(true);
            Context context = (Context) av8Var3.k(nz.b);
            Object O = av8Var3.O();
            if (O == nf3.a) {
                O = z8e.u(context, str3, str4, false);
                av8Var3.n0(O);
            }
            String str5 = (String) O;
            av8 av8Var4 = av8Var3;
            xtc b0 = b0(utcVar, 8.0f);
            str5.getClass();
            int i16 = i8 >> 3;
            dfj dfjVar7 = dfjVar5;
            q(b0, str, str2, str5, j7, D, D, dfjVar6, dfjVar7, i2, av8Var4, (i16 & 896) | (i16 & 112) | 6 | ((i8 << 15) & 1879048192));
            xtc f02 = f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            xtc z5 = f02.z(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            k1c c4 = e12.c(mv1Var, false);
            int hashCode4 = Long.hashCode(av8Var4.T);
            aee m5 = av8Var4.m();
            xtc C4 = fqj.C(av8Var4, z5);
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var);
            } else {
                av8Var4.q0();
            }
            waa.K(av8Var4, c4, f50Var);
            waa.K(av8Var4, m5, ff3Var);
            bf3.s(hashCode4, av8Var4, f50Var2, av8Var4, ryVar);
            waa.K(av8Var4, C4, f50Var3);
            xtc a5 = n12Var.a(utcVar, uxf.h);
            u23 a6 = t23.a(new ng0(2.0f, true, new a70(6)), kv1Var, av8Var4, 54);
            int hashCode5 = Long.hashCode(av8Var4.T);
            aee m6 = av8Var4.m();
            xtc C5 = fqj.C(av8Var4, a5);
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(zg3Var);
            } else {
                av8Var4.q0();
            }
            waa.K(av8Var4, a6, f50Var);
            waa.K(av8Var4, m6, ff3Var);
            bf3.s(hashCode5, av8Var4, f50Var2, av8Var4, ryVar);
            waa.K(av8Var4, C5, f50Var3);
            w(null, fy7Var2, true, str4, z, z2, d3 == null ? 40.0f : 32.0f, 0L, 0L, !str4.equals(Sports.TENNIS), av8Var4, (i8 & 112) | 384 | i13 | i14 | i15, 385);
            av8Var = av8Var4;
            if (d3 == null) {
                av8Var.d0(-1683459392);
                av8Var.s(false);
            } else {
                av8Var.d0(-1683459391);
                i9a.i(Double.valueOf(d3.doubleValue()), false, null, null, null, null, false, av8Var, 432, PglCryptUtils.BASE64_FAILED);
                av8Var = av8Var;
                Unit unit2 = Unit.a;
                av8Var.s(false);
            }
            ljg.t(av8Var, true, true, true);
            j4 = j7;
            j5 = D;
            xtcVar2 = xtcVar4;
            dfjVar3 = dfjVar6;
            dfjVar4 = dfjVar7;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
            dfjVar3 = dfjVar;
            dfjVar4 = dfjVar2;
            j4 = j2;
            j5 = j3;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(fy7Var2, str, str2, i2, str3, d2, d3, z, str4, xtcVar2, z2, dfjVar3, dfjVar4, j4, j5, i3, i4, i5) { // from class: rw7
                public final /* synthetic */ fy7 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ int e;
                public final /* synthetic */ String f;
                public final /* synthetic */ Double g;
                public final /* synthetic */ Double h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ String j;
                public final /* synthetic */ xtc k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ dfj m;
                public final /* synthetic */ dfj n;
                public final /* synthetic */ long o;
                public final /* synthetic */ long p;
                public final /* synthetic */ int q;
                public final /* synthetic */ int r;

                {
                    this.q = i4;
                    this.r = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    int K2 = aba.K(this.q);
                    l98.k(fy7.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (of3) obj, K, K2, this.r);
                    return Unit.a;
                }
            };
        }
    }

    public static void k0(List list, StringBuilder sb) {
        kotlin.ranges.a i2 = llf.i(2, llf.j(0, list.size()));
        int i3 = i2.a;
        int i4 = i2.b;
        int i5 = i2.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i3);
            String str2 = (String) list.get(i3 + 1);
            if (i3 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(C4427z5.U);
                sb.append(str2);
            }
            if (i3 == i4) {
                return;
            } else {
                i3 += i5;
            }
        }
    }

    public static final void l(final fy7 fy7Var, final fy7 fy7Var2, final String str, final String str2, final int i2, final String str3, final boolean z, final boolean z2, xtc xtcVar, final long j2, final long j3, final dfj dfjVar, final dfj dfjVar2, final float f2, of3 of3Var, final int i3) {
        final xtc xtcVar2;
        xtc xtcVar3;
        fy7Var.getClass();
        fy7Var2.getClass();
        str3.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-923448821);
        int i4 = i3 | (av8Var.g(fy7Var) ? 4 : 2) | (av8Var.g(fy7Var2) ? 32 : 16) | (av8Var.g(str) ? 256 : 128) | (av8Var.g(str2) ? a.o : 1024) | (av8Var.e(i2) ? 16384 : 8192) | (av8Var.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.h(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.h(z2) ? 8388608 : 4194304) | 100663296 | (av8Var.f(j2) ? 536870912 : 268435456);
        int i5 = 3072 | (av8Var.f(j3) ? 4 : 2) | (av8Var.g(dfjVar) ? 32 : 16) | (av8Var.g(dfjVar2) ? 256 : 128);
        if (av8Var.T(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            av8Var.Y();
            int i6 = i3 & 1;
            utc utcVar = utc.a;
            if (i6 == 0 || av8Var.B()) {
                xtcVar3 = utcVar;
            } else {
                av8Var.W();
                xtcVar3 = xtcVar;
            }
            av8Var.t();
            lv1 lv1Var = uxf.m;
            xtc d2 = bkh.d(xtcVar3, 1.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            int i7 = (i4 >> 9) & 57344;
            int i8 = i4 >> 3;
            int i9 = i8 & 458752;
            int i10 = i4 >> 6;
            int i11 = i10 & 29360128;
            int i12 = (i5 << 24) & 234881024;
            xtc xtcVar4 = xtcVar3;
            w(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), fy7Var, false, Sports.TENNIS, z2, z, f2, j2, j3, false, av8Var, ((i4 << 3) & 112) | 3456 | i7 | i9 | 1572864 | i11 | i12, 512);
            int i13 = i5 << 18;
            q(f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 16.0f, 2), str, str2, str3, j2, j3, j3, dfjVar, dfjVar2, i2, av8Var, (i8 & 112) | 6 | (i8 & 896) | (i10 & 7168) | ((i4 >> 15) & 57344) | ((i5 << 15) & 458752) | (3670016 & i13) | (i13 & 29360128) | (i13 & 234881024) | (1879048192 & (i4 << 15)));
            av8Var = av8Var;
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            w(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), fy7Var2, true, Sports.TENNIS, z2, z, f2, j2, j3, false, av8Var, (i4 & 112) | 3456 | i7 | i9 | 1572864 | i11 | i12, 512);
            av8Var.s(true);
            xtcVar2 = xtcVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(fy7Var2, str, str2, i2, str3, z, z2, xtcVar2, j2, j3, dfjVar, dfjVar2, f2, i3) { // from class: ax7
                public final /* synthetic */ fy7 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ int e;
                public final /* synthetic */ String f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ xtc i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ dfj l;
                public final /* synthetic */ dfj m;
                public final /* synthetic */ float n;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    l98.l(fy7.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final pp3 l0(zo5 zo5Var, of6 of6Var) {
        return new pp3(zo5Var, of6Var, 12);
    }

    public static final void m(final int i2, final String str, final String str2, final String str3, final int i3, final Integer num, final Integer num2, final Integer num3, final Integer num4, final int i4, float f2, of3 of3Var, final int i5, final int i6, final int i7) {
        float f3;
        int i8;
        final float f4;
        lv1 lv1Var;
        str2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1461031308);
        int i9 = i5 | (av8Var.e(i2) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str3) ? a.o : 1024) | (av8Var.e(i3) ? 16384 : 8192);
        if ((i5 & 196608) == 0) {
            i9 |= av8Var.g(num) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((i5 & 1572864) == 0) {
            i9 |= av8Var.g(num2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i10 = i9 | (av8Var.g(num3) ? 8388608 : 4194304) | (av8Var.g(num4) ? 67108864 : 33554432) | (av8Var.e(i4) ? 536870912 : 268435456);
        int i11 = i7 & 1024;
        if (i11 != 0) {
            i8 = 6;
            f3 = f2;
        } else {
            f3 = f2;
            if ((i6 & 6) == 0) {
                i8 = i6 | (av8Var.d(f3) ? 4 : 2);
            } else {
                i8 = i6;
            }
        }
        if (av8Var.T(i10 & 1, ((i10 & 306783379) == 306783378 && (i8 & 3) == 2) ? false : true)) {
            if (i11 != 0) {
                f3 = 80.0f;
            }
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, c2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            float f5 = f3;
            xtc C2 = u6h.C(bkh.l(utcVar, f3), 0.1f);
            mv1 mv1Var = uxf.g;
            n12 n12Var = n12.a;
            td4.G(i3, n12Var.a(C2, mv1Var), false, 0L, av8Var, (i10 >> 12) & 14, 12);
            xtc b2 = n12Var.b(utcVar);
            lv1 lv1Var2 = uxf.m;
            l8g a2 = k8g.a(ww9.b, lv1Var2, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, b2);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            xtc f0 = f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 16.0f, 4.0f, 1);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            av8Var.d0(790340836);
            if (num == null || num2 == null || num3 == null || num4 == null) {
                lv1Var = lv1Var2;
            } else {
                lv1Var = lv1Var2;
                rha.d(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), Integer.valueOf(i4), null, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i10 >> 15) & 57344, 0, 2016);
                av8Var = av8Var;
                nq8.h(av8Var, bkh.e(utcVar, 16.0f));
                Unit unit = Unit.a;
            }
            av8Var.s(false);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            av8 av8Var2 = av8Var;
            udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, (i10 >> 3) & 14, 24960, 110586);
            udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.c(), av8Var2, (i10 >> 6) & 14, 24960, 110586);
            av8Var2.s(true);
            goa goaVar = new goa(1.0f, true);
            l8g a4 = k8g.a(ww9.c, lv1Var, av8Var2, 54);
            int hashCode4 = Long.hashCode(av8Var2.T);
            aee m5 = av8Var2.m();
            xtc C5 = fqj.C(av8Var2, goaVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var);
            waa.K(av8Var2, m5, ff3Var);
            bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C5, f50Var3);
            udj.c("#".concat(str3), f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var2, 48, 24960, 110584);
            av8Var = av8Var2;
            td4.C(i2, bkh.l(utcVar, 56.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i10 & 14) | 48, 12);
            ljg.t(av8Var, true, true, true);
            f4 = f5;
        } else {
            av8Var.W();
            f4 = f3;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2() { // from class: vw7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i5 | 1);
                    int K2 = aba.K(i6);
                    l98.m(i2, str, str2, str3, i3, num, num2, num3, num4, i4, f4, (of3) obj, K, K2, i7);
                    return Unit.a;
                }
            };
        }
    }

    public static final Object m0(l4h l4hVar, Object obj) {
        Object d2 = l4hVar.d(obj);
        if (!(d2 instanceof fo2)) {
            return Unit.a;
        }
        return ((go2) td4.t0(g.a, new g2(l4hVar, obj, null, 20))).a;
    }

    public static final void n(String str, int i2, String str2, String str3, int i3, int i4, String str4, String str5, String str6, String str7, dfj dfjVar, dfj dfjVar2, boolean z, of3 of3Var, int i5) {
        int i6;
        String str8 = str5;
        boolean z2 = z;
        str3.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1514320989);
        int i7 = i5 | (av8Var.g(str) ? 4 : 2) | (av8Var.e(i2) ? 32 : 16) | (av8Var.g(str2) ? 256 : 128) | (av8Var.g(str3) ? a.o : 1024) | (av8Var.e(i3) ? 16384 : 8192) | (av8Var.e(i4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.g(str4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(str8) ? 8388608 : 4194304) | (av8Var.g(str6) ? 67108864 : 33554432) | (av8Var.g(str7) ? 536870912 : 268435456);
        int i8 = (av8Var.g(dfjVar) ? 4 : 2) | (av8Var.g(dfjVar2) ? 32 : 16) | (av8Var.h(z2) ? 256 : 128);
        if (av8Var.T(i7 & 1, ((306783379 & i7) == 306783378 && (i8 & 147) == 146) ? false : true)) {
            av8Var.Y();
            if ((i5 & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            lv1 lv1Var = uxf.m;
            utc utcVar = utc.a;
            xtc d2 = bkh.d(utcVar, 1.0f);
            l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            kv1 kv1Var = uxf.p;
            p4h p4hVar = ww9.d;
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            td4.G(i3, bkh.l(utcVar, 48.0f), false, 0L, av8Var, ((i7 >> 12) & 14) | 48, 12);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            String str9 = str4 == null ? "" : str4;
            yf8 yf8Var = xth.a;
            udj.c(str9, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var, 0, 0, 130042);
            av8 av8Var2 = av8Var;
            if (str6 == null || str6.length() == 0) {
                i6 = R.color.on_color_secondary;
                av8Var2.d0(1635796569);
                av8Var2.s(false);
            } else {
                av8Var2.d0(1635669283);
                dfj k2 = xth.k();
                i6 = R.color.on_color_secondary;
                udj.c(str6, null, lz.D(R.color.on_color_secondary, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, k2, av8Var2, (i7 >> 24) & 14, 0, 130042);
                av8Var2 = av8Var2;
                av8Var2.s(false);
            }
            av8Var2.s(true);
            int i9 = i8 << 21;
            av8 av8Var3 = av8Var2;
            q(f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 16.0f, 2), str, str2, str3, lz.D(R.color.on_color_primary, av8Var2), lz.D(i6, av8Var2), lz.D(R.color.on_color_primary, av8Var2), dfjVar, dfjVar2, i2, av8Var3, (i7 & 896) | ((i7 << 3) & 112) | 6 | (i7 & 7168) | (i9 & 29360128) | (i9 & 234881024) | ((i7 << 24) & 1879048192));
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            u23 a4 = t23.a(p4hVar, kv1Var, av8Var3, 48);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m4 = av8Var3.m();
            xtc C3 = fqj.C(av8Var3, goaVar2);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var);
            waa.K(av8Var3, m4, ff3Var);
            bf3.s(hashCode3, av8Var3, f50Var2, av8Var3, ryVar);
            waa.K(av8Var3, C3, f50Var3);
            td4.G(i4, bkh.l(utcVar, 48.0f), false, 0L, av8Var3, ((i7 >> 15) & 14) | 48, 12);
            nq8.h(av8Var3, bkh.e(utcVar, 8.0f));
            str8 = str5;
            z2 = z;
            String K = qea.K(str8, z2);
            udj.c(K == null ? "" : K, null, lz.D(R.color.on_color_primary, av8Var3), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var3, 0, 0, 130042);
            av8Var = av8Var3;
            if (str7 == null || str7.length() == 0) {
                av8Var.d0(119557616);
                av8Var.s(false);
            } else {
                av8Var.d0(119430330);
                udj.c(str7, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var, (i7 >> 27) & 14, 0, 130042);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new tw7(str, i2, str2, str3, i3, i4, str4, str8, str6, str7, dfjVar, dfjVar2, z2, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(final int i2, final String str, xtc xtcVar, final Integer num, Double d2, String str2, boolean z, dfj dfjVar, of3 of3Var, final int i3, final int i4) {
        int i5;
        xtc xtcVar2;
        int i6;
        Double d3;
        int i7;
        String str3;
        int i8;
        int i9;
        boolean z2;
        dfj dfjVar2;
        int i10;
        int i11;
        av8 av8Var;
        final xtc xtcVar3;
        final Double d4;
        final String str4;
        final boolean z3;
        final dfj dfjVar3;
        eqf u2;
        dfj j2;
        int i12;
        String str5;
        boolean z4;
        String str6;
        av8 av8Var2;
        String str7;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-1399608641);
        if ((i3 & 6) == 0) {
            i5 = (av8Var3.e(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= av8Var3.g(str) ? 32 : 16;
        }
        int i13 = i4 & 4;
        if (i13 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            xtcVar2 = xtcVar;
            i5 |= av8Var3.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i3 & 3072) == 0) {
                i5 |= av8Var3.g(num) ? a.o : 1024;
            }
            i6 = i4 & 16;
            if (i6 == 0) {
                i5 |= 24576;
            } else if ((i3 & 24576) == 0) {
                d3 = d2;
                i5 |= av8Var3.g(d3) ? 16384 : 8192;
                i7 = i4 & 32;
                if (i7 != 0) {
                    i8 = i5 | 196608;
                    str3 = str2;
                } else {
                    str3 = str2;
                    i8 = i5 | (av8Var3.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
                }
                i9 = i4 & 64;
                if (i9 != 0) {
                    i8 |= 1572864;
                } else if ((1572864 & i3) == 0) {
                    z2 = z;
                    i8 |= av8Var3.h(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    if ((i4 & 128) != 0) {
                        dfjVar2 = dfjVar;
                        if (av8Var3.g(dfjVar2)) {
                            i10 = 8388608;
                            i11 = i8 | i10;
                            if (av8Var3.T(i11 & 1, (i11 & 4793491) != 4793490)) {
                                av8Var3.Y();
                                int i14 = i3 & 1;
                                utc utcVar = utc.a;
                                if (i14 == 0 || av8Var3.B()) {
                                    if (i13 != 0) {
                                        xtcVar2 = utcVar;
                                    }
                                    if (i6 != 0) {
                                        d3 = null;
                                    }
                                    if (i7 != 0) {
                                        str3 = null;
                                    }
                                    if (i9 != 0) {
                                        z2 = false;
                                    }
                                    if ((i4 & 128) != 0) {
                                        yf8 yf8Var = xth.a;
                                        j2 = xth.j();
                                        i12 = i11 & (-29360129);
                                        str5 = str3;
                                        z4 = z2;
                                        av8Var3.t();
                                        xtc d5 = bkh.d(xtcVar2, 1.0f);
                                        l8g a2 = k8g.a(ww9.b, uxf.m, av8Var3, 48);
                                        int hashCode = Long.hashCode(av8Var3.T);
                                        aee m2 = av8Var3.m();
                                        xtc C = fqj.C(av8Var3, d5);
                                        if3.k7.getClass();
                                        zg3 zg3Var = hf3.b;
                                        av8Var3.h0();
                                        if (av8Var3.S) {
                                            av8Var3.l(zg3Var);
                                        } else {
                                            av8Var3.q0();
                                        }
                                        f50 f50Var = hf3.g;
                                        waa.K(av8Var3, a2, f50Var);
                                        ff3 ff3Var = hf3.f;
                                        waa.K(av8Var3, m2, ff3Var);
                                        Integer valueOf = Integer.valueOf(hashCode);
                                        f50 f50Var2 = hf3.j;
                                        waa.K(av8Var3, valueOf, f50Var2);
                                        ry ryVar = hf3.k;
                                        waa.J(av8Var3, ryVar);
                                        str6 = str5;
                                        f50 f50Var3 = hf3.d;
                                        waa.K(av8Var3, C, f50Var3);
                                        boolean z5 = z4;
                                        k1c c2 = e12.c(uxf.c, false);
                                        int hashCode2 = Long.hashCode(av8Var3.T);
                                        aee m3 = av8Var3.m();
                                        xtc xtcVar4 = xtcVar2;
                                        xtc C2 = fqj.C(av8Var3, utcVar);
                                        av8Var3.h0();
                                        int i15 = i12;
                                        if (av8Var3.S) {
                                            av8Var3.l(zg3Var);
                                        } else {
                                            av8Var3.q0();
                                        }
                                        waa.K(av8Var3, c2, f50Var);
                                        waa.K(av8Var3, m3, ff3Var);
                                        bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar);
                                        waa.K(av8Var3, C2, f50Var3);
                                        td4.C(i2, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, (i15 & 14) | 48, 12);
                                        av8Var2 = av8Var3;
                                        if (num == null) {
                                            av8Var2.d0(-1182692315);
                                            av8Var2.s(false);
                                        } else {
                                            av8Var2.d0(-1182692314);
                                            td4.G(num.intValue(), n12.a.a(bkh.l(utcVar, 16.0f), uxf.i), false, 0L, av8Var2, (i15 >> 9) & 14, 12);
                                            av8Var2 = av8Var2;
                                            Unit unit = Unit.a;
                                            av8Var2.s(false);
                                        }
                                        av8Var2.s(true);
                                        nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
                                        goa goaVar = new goa(1.0f, true);
                                        u23 a3 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                                        int hashCode3 = Long.hashCode(av8Var2.T);
                                        aee m4 = av8Var2.m();
                                        xtc C3 = fqj.C(av8Var2, goaVar);
                                        av8Var2.h0();
                                        if (av8Var2.S) {
                                            av8Var2.l(zg3Var);
                                        } else {
                                            av8Var2.q0();
                                        }
                                        waa.K(av8Var2, a3, f50Var);
                                        waa.K(av8Var2, m4, ff3Var);
                                        bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                                        waa.K(av8Var2, C3, f50Var3);
                                        av8 av8Var4 = av8Var2;
                                        udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, j2, av8Var4, (i15 >> 3) & 14, (i15 & 29360128) | 384, 126970);
                                        dfj dfjVar4 = j2;
                                        av8Var = av8Var4;
                                        if (str6 != null) {
                                            av8Var.d0(-530757165);
                                            long D = lz.D(R.color.n_lv_3, av8Var);
                                            yf8 yf8Var2 = xth.a;
                                            udj.c(str6, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.b(), av8Var, (i15 >> 15) & 14, 384, 126970);
                                            str7 = str6;
                                            av8Var = av8Var;
                                            av8Var.s(false);
                                        } else {
                                            str7 = str6;
                                            av8Var.d0(-530520759);
                                            av8Var.s(false);
                                        }
                                        av8Var.s(true);
                                        if (d3 == null) {
                                            av8Var.d0(653359489);
                                            av8Var.s(false);
                                        } else {
                                            av8Var.d0(653359490);
                                            double doubleValue = d3.doubleValue();
                                            if (z5) {
                                                av8Var.d0(2142678609);
                                                av8 av8Var5 = av8Var;
                                                i9a.j(Double.valueOf(doubleValue), false, false, null, false, true, null, av8Var5, 197040, 88);
                                                av8Var = av8Var5;
                                                av8Var.s(false);
                                            } else {
                                                av8Var.d0(2142917154);
                                                av8 av8Var6 = av8Var;
                                                i9a.i(Double.valueOf(doubleValue), false, null, null, null, null, false, av8Var6, 432, PglCryptUtils.BASE64_FAILED);
                                                av8Var = av8Var6;
                                                av8Var.s(false);
                                            }
                                            Unit unit2 = Unit.a;
                                            av8Var.s(false);
                                        }
                                        av8Var.s(true);
                                        xtcVar3 = xtcVar4;
                                        dfjVar3 = dfjVar4;
                                        str4 = str7;
                                        d4 = d3;
                                        z3 = z5;
                                    }
                                } else {
                                    av8Var3.W();
                                    if ((i4 & 128) != 0) {
                                        i12 = i11 & (-29360129);
                                        str5 = str3;
                                        z4 = z2;
                                        j2 = dfjVar2;
                                        av8Var3.t();
                                        xtc d52 = bkh.d(xtcVar2, 1.0f);
                                        l8g a22 = k8g.a(ww9.b, uxf.m, av8Var3, 48);
                                        int hashCode4 = Long.hashCode(av8Var3.T);
                                        aee m22 = av8Var3.m();
                                        xtc C4 = fqj.C(av8Var3, d52);
                                        if3.k7.getClass();
                                        zg3 zg3Var2 = hf3.b;
                                        av8Var3.h0();
                                        if (av8Var3.S) {
                                        }
                                        f50 f50Var4 = hf3.g;
                                        waa.K(av8Var3, a22, f50Var4);
                                        ff3 ff3Var2 = hf3.f;
                                        waa.K(av8Var3, m22, ff3Var2);
                                        Integer valueOf2 = Integer.valueOf(hashCode4);
                                        f50 f50Var22 = hf3.j;
                                        waa.K(av8Var3, valueOf2, f50Var22);
                                        ry ryVar2 = hf3.k;
                                        waa.J(av8Var3, ryVar2);
                                        str6 = str5;
                                        f50 f50Var32 = hf3.d;
                                        waa.K(av8Var3, C4, f50Var32);
                                        boolean z52 = z4;
                                        k1c c22 = e12.c(uxf.c, false);
                                        int hashCode22 = Long.hashCode(av8Var3.T);
                                        aee m32 = av8Var3.m();
                                        xtc xtcVar42 = xtcVar2;
                                        xtc C22 = fqj.C(av8Var3, utcVar);
                                        av8Var3.h0();
                                        int i152 = i12;
                                        if (av8Var3.S) {
                                        }
                                        waa.K(av8Var3, c22, f50Var4);
                                        waa.K(av8Var3, m32, ff3Var2);
                                        bf3.s(hashCode22, av8Var3, f50Var22, av8Var3, ryVar2);
                                        waa.K(av8Var3, C22, f50Var32);
                                        td4.C(i2, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, (i152 & 14) | 48, 12);
                                        av8Var2 = av8Var3;
                                        if (num == null) {
                                        }
                                        av8Var2.s(true);
                                        nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
                                        goa goaVar2 = new goa(1.0f, true);
                                        u23 a32 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                                        int hashCode32 = Long.hashCode(av8Var2.T);
                                        aee m42 = av8Var2.m();
                                        xtc C32 = fqj.C(av8Var2, goaVar2);
                                        av8Var2.h0();
                                        if (av8Var2.S) {
                                        }
                                        waa.K(av8Var2, a32, f50Var4);
                                        waa.K(av8Var2, m42, ff3Var2);
                                        bf3.s(hashCode32, av8Var2, f50Var22, av8Var2, ryVar2);
                                        waa.K(av8Var2, C32, f50Var32);
                                        av8 av8Var42 = av8Var2;
                                        udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, j2, av8Var42, (i152 >> 3) & 14, (i152 & 29360128) | 384, 126970);
                                        dfj dfjVar42 = j2;
                                        av8Var = av8Var42;
                                        if (str6 != null) {
                                        }
                                        av8Var.s(true);
                                        if (d3 == null) {
                                        }
                                        av8Var.s(true);
                                        xtcVar3 = xtcVar42;
                                        dfjVar3 = dfjVar42;
                                        str4 = str7;
                                        d4 = d3;
                                        z3 = z52;
                                    }
                                }
                                i12 = i11;
                                str5 = str3;
                                z4 = z2;
                                j2 = dfjVar2;
                                av8Var3.t();
                                xtc d522 = bkh.d(xtcVar2, 1.0f);
                                l8g a222 = k8g.a(ww9.b, uxf.m, av8Var3, 48);
                                int hashCode42 = Long.hashCode(av8Var3.T);
                                aee m222 = av8Var3.m();
                                xtc C42 = fqj.C(av8Var3, d522);
                                if3.k7.getClass();
                                zg3 zg3Var22 = hf3.b;
                                av8Var3.h0();
                                if (av8Var3.S) {
                                }
                                f50 f50Var42 = hf3.g;
                                waa.K(av8Var3, a222, f50Var42);
                                ff3 ff3Var22 = hf3.f;
                                waa.K(av8Var3, m222, ff3Var22);
                                Integer valueOf22 = Integer.valueOf(hashCode42);
                                f50 f50Var222 = hf3.j;
                                waa.K(av8Var3, valueOf22, f50Var222);
                                ry ryVar22 = hf3.k;
                                waa.J(av8Var3, ryVar22);
                                str6 = str5;
                                f50 f50Var322 = hf3.d;
                                waa.K(av8Var3, C42, f50Var322);
                                boolean z522 = z4;
                                k1c c222 = e12.c(uxf.c, false);
                                int hashCode222 = Long.hashCode(av8Var3.T);
                                aee m322 = av8Var3.m();
                                xtc xtcVar422 = xtcVar2;
                                xtc C222 = fqj.C(av8Var3, utcVar);
                                av8Var3.h0();
                                int i1522 = i12;
                                if (av8Var3.S) {
                                }
                                waa.K(av8Var3, c222, f50Var42);
                                waa.K(av8Var3, m322, ff3Var22);
                                bf3.s(hashCode222, av8Var3, f50Var222, av8Var3, ryVar22);
                                waa.K(av8Var3, C222, f50Var322);
                                td4.C(i2, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var3, (i1522 & 14) | 48, 12);
                                av8Var2 = av8Var3;
                                if (num == null) {
                                }
                                av8Var2.s(true);
                                nq8.h(av8Var2, bkh.p(utcVar, 8.0f));
                                goa goaVar22 = new goa(1.0f, true);
                                u23 a322 = t23.a(ww9.d, uxf.o, av8Var2, 0);
                                int hashCode322 = Long.hashCode(av8Var2.T);
                                aee m422 = av8Var2.m();
                                xtc C322 = fqj.C(av8Var2, goaVar22);
                                av8Var2.h0();
                                if (av8Var2.S) {
                                }
                                waa.K(av8Var2, a322, f50Var42);
                                waa.K(av8Var2, m422, ff3Var22);
                                bf3.s(hashCode322, av8Var2, f50Var222, av8Var2, ryVar22);
                                waa.K(av8Var2, C322, f50Var322);
                                av8 av8Var422 = av8Var2;
                                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, j2, av8Var422, (i1522 >> 3) & 14, (i1522 & 29360128) | 384, 126970);
                                dfj dfjVar422 = j2;
                                av8Var = av8Var422;
                                if (str6 != null) {
                                }
                                av8Var.s(true);
                                if (d3 == null) {
                                }
                                av8Var.s(true);
                                xtcVar3 = xtcVar422;
                                dfjVar3 = dfjVar422;
                                str4 = str7;
                                d4 = d3;
                                z3 = z522;
                            } else {
                                av8Var = av8Var3;
                                av8Var.W();
                                xtcVar3 = xtcVar2;
                                d4 = d3;
                                str4 = str3;
                                z3 = z2;
                                dfjVar3 = dfjVar2;
                            }
                            u2 = av8Var.u();
                            if (u2 != null) {
                                u2.d = new Function2() { // from class: uw7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        l98.o(i2, str, xtcVar3, num, d4, str4, z3, dfjVar3, (of3) obj, aba.K(i3 | 1), i4);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                    } else {
                        dfjVar2 = dfjVar;
                    }
                    i10 = 4194304;
                    i11 = i8 | i10;
                    if (av8Var3.T(i11 & 1, (i11 & 4793491) != 4793490)) {
                    }
                    u2 = av8Var.u();
                    if (u2 != null) {
                    }
                }
                z2 = z;
                if ((i4 & 128) != 0) {
                }
                i10 = 4194304;
                i11 = i8 | i10;
                if (av8Var3.T(i11 & 1, (i11 & 4793491) != 4793490)) {
                }
                u2 = av8Var.u();
                if (u2 != null) {
                }
            }
            d3 = d2;
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            i9 = i4 & 64;
            if (i9 != 0) {
            }
            z2 = z;
            if ((i4 & 128) != 0) {
            }
            i10 = 4194304;
            i11 = i8 | i10;
            if (av8Var3.T(i11 & 1, (i11 & 4793491) != 4793490)) {
            }
            u2 = av8Var.u();
            if (u2 != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i3 & 3072) == 0) {
        }
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        d3 = d2;
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        i9 = i4 & 64;
        if (i9 != 0) {
        }
        z2 = z;
        if ((i4 & 128) != 0) {
        }
        i10 = 4194304;
        i11 = i8 | i10;
        if (av8Var3.T(i11 & 1, (i11 & 4793491) != 4793490)) {
        }
        u2 = av8Var.u();
        if (u2 != null) {
        }
    }

    public static final void p(final int i2, final String str, final Integer num, final Integer num2, final Integer num3, final Integer num4, final Integer num5, final int i3, String str2, Double d2, boolean z, of3 of3Var, final int i4, final int i5, final int i6) {
        Double d3;
        int i7;
        boolean z2;
        int i8;
        av8 av8Var;
        final boolean z3;
        final Double d4;
        Double d5;
        final String str3 = str2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1876333453);
        int i9 = i4 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.g(str) ? 32 : 16) | (av8Var2.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(num2) ? a.o : 1024) | (av8Var2.g(num3) ? 16384 : 8192) | (av8Var2.g(num4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.g(num5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.e(i3) ? 8388608 : 4194304) | (av8Var2.g(str3) ? 67108864 : 33554432);
        int i10 = i6 & 512;
        if (i10 != 0) {
            i7 = i9 | 805306368;
            d3 = d2;
        } else {
            d3 = d2;
            i7 = i9 | (av8Var2.g(d3) ? 536870912 : 268435456);
        }
        int i11 = i6 & 1024;
        if (i11 != 0) {
            z2 = z;
            i8 = 6;
        } else {
            z2 = z;
            if ((i5 & 6) == 0) {
                i8 = i5 | (av8Var2.h(z2) ? 4 : 2);
            } else {
                i8 = i5;
            }
        }
        int i12 = i7;
        if (av8Var2.T(i12 & 1, ((i7 & 306783379) == 306783378 && (i8 & 3) == 2) ? false : true)) {
            Double d6 = i10 != 0 ? null : d3;
            if (i11 != 0) {
                z2 = false;
            }
            utc utcVar = utc.a;
            xtc d0 = d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, d0);
            if3.k7.getClass();
            Double d7 = d6;
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, utcVar);
            av8Var2.h0();
            boolean z4 = z2;
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, c2, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            td4.C(i2, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, (i12 & 14) | 48, 12);
            av8Var = av8Var2;
            if (d7 == null) {
                av8Var.d0(-330980896);
                av8Var.s(false);
                d5 = d7;
            } else {
                av8Var.d0(-330980895);
                i9a.j(d7, false, false, bkh.l(n12.a.a(utcVar, uxf.i), 16.0f), false, false, new p75(12.0f), av8Var, ((i12 >> 27) & 14) | 1573296, 48);
                d5 = d7;
                Unit unit = Unit.a;
                av8Var.s(false);
            }
            av8Var.s(true);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            xtc f0 = f0(new goa(1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, (i12 >> 3) & 14, 24960, 110586);
            if (num == null || z4) {
                str3 = str2;
                if (z4) {
                    av8Var.d0(974817895);
                    udj.c(oea.v(R.string.statistics_snapshot, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                    av8Var.s(false);
                } else {
                    av8Var.d0(975023983);
                    av8Var.s(false);
                }
            } else {
                av8Var.d0(974701676);
                str3 = str2;
                t(num.intValue(), ((i12 >> 6) & 14) | ((i12 >> 21) & 112), av8Var, str3);
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.d0(-1809232590);
            if (num2 != null && num3 != null && num4 != null && num5 != null) {
                rha.d(num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), Integer.valueOf(i3), null, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i12 >> 9) & 57344, 0, 2016);
                Unit unit2 = Unit.a;
            }
            av8Var.s(false);
            av8Var.s(true);
            d4 = d5;
            z3 = z4;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            z3 = z2;
            d4 = d3;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(i2, str, num, num2, num3, num4, num5, i3, str3, d4, z3, i4, i5, i6) { // from class: ww7
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Integer c;
                public final /* synthetic */ Integer d;
                public final /* synthetic */ Integer e;
                public final /* synthetic */ Integer f;
                public final /* synthetic */ Integer g;
                public final /* synthetic */ int h;
                public final /* synthetic */ String i;
                public final /* synthetic */ Double j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ int l;
                public final /* synthetic */ int m;

                {
                    this.l = i5;
                    this.m = i6;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    int K2 = aba.K(this.l);
                    l98.p(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (of3) obj, K, K2, this.m);
                    return Unit.a;
                }
            };
        }
    }

    public static final void q(final xtc xtcVar, final String str, final String str2, final String str3, final long j2, final long j3, final long j4, final dfj dfjVar, final dfj dfjVar2, final int i2, of3 of3Var, final int i3) {
        int i4;
        dfj dfjVar3;
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(426352403);
        if ((i3 & 6) == 0) {
            i4 = (av8Var2.g(xtcVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var2.g(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var2.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= av8Var2.g(str3) ? a.o : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= av8Var2.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= av8Var2.f(j3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i3) == 0) {
            i4 |= av8Var2.f(j4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i3) == 0) {
            dfjVar3 = dfjVar;
            i4 |= av8Var2.g(dfjVar3) ? 8388608 : 4194304;
        } else {
            dfjVar3 = dfjVar;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= av8Var2.g(dfjVar2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= av8Var2.e(i2) ? 536870912 : 268435456;
        }
        int i5 = i4;
        if (av8Var2.T(i5 & 1, (i5 & 306783379) != 306783378)) {
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C = fqj.C(av8Var2, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var2, 0);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, utc.a);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a3, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            int i6 = i5 >> 3;
            int i7 = i5 & 29360128;
            udj.c(str, null, i2 == 1 ? j2 : j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfjVar3, av8Var2, i6 & 14, i7, 131066);
            int i8 = i5 >> 9;
            udj.c(" - ", null, j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfjVar, av8Var2, (i8 & 896) | 6, i7, 131066);
            udj.c(str2, null, i2 == 2 ? j2 : j3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfjVar, av8Var2, (i5 >> 6) & 14, i7, 131066);
            av8Var = av8Var2;
            av8Var.s(true);
            udj.c(str3, null, j4, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, dfjVar2, av8Var2, (i8 & 14) | ((i5 >> 12) & 896), i6 & 29360128, 131066);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2() { // from class: yw7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(i3 | 1);
                    l98.q(xtc.this, str, str2, str3, j2, j3, j4, dfjVar, dfjVar2, i2, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void r(String str, Integer num, Integer num2, String str2, of3 of3Var, int i2) {
        int i3;
        Integer num3;
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-924622783);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(num) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            num3 = num2;
            i3 |= av8Var.g(num3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            num3 = num2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(str2) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc o2 = bkh.o(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, o2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.a(haa.t(wyh.a(str), 0, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 440, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            String c2 = wyh.c(context, str);
            long D = lz.D(R.color.n_lv_3, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(c2, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.b(), av8Var, 0, 384, 126970);
            e12.a(0, av8Var, n9e.q(bkh.l(d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 6.0f), lz.D(R.color.n_lv_4, av8Var), o7g.a(6.0f)));
            td4.y(num != null ? num.intValue() : 0, (i3 & 896) | 48, 8, av8Var, bkh.l(utcVar, 16.0f), num3, false);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            udj.c(str2 == null ? "" : str2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 5, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new bk1(i2, 18, str, num, num2, str2);
        }
    }

    public static final void s(fy7 fy7Var, fy7 fy7Var2, boolean z, String str, boolean z2, of3 of3Var, int i2) {
        fy7Var.getClass();
        fy7Var2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(581517242);
        int i3 = i2 | (av8Var.g(fy7Var) ? 4 : 2) | (av8Var.g(fy7Var2) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(str) ? a.o : 1024) | (av8Var.h(z2) ? 16384 : 8192);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            xtc d2 = bkh.d(utc.a, 1.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i4 = i3 << 3;
            int i5 = i3 & 7168;
            int i6 = (i3 << 6) & 57344;
            int i7 = i4 & 458752;
            w(null, fy7Var, false, str, z, z2, 40.0f, 0L, 0L, true, av8Var, (i4 & 112) | 806879616 | i5 | i6 | i7, 385);
            Double d3 = fy7Var.h;
            if (d3 == null) {
                av8Var.d0(-2064662445);
                av8Var.s(false);
            } else {
                av8Var.d0(-2064662444);
                i9a.i(Double.valueOf(d3.doubleValue()), false, null, null, null, null, false, av8Var, 432, PglCryptUtils.BASE64_FAILED);
                av8Var.s(false);
            }
            w1l.o(1.0f, true, av8Var);
            Double d4 = fy7Var2.h;
            if (d4 == null) {
                av8Var.d0(-2064445197);
                av8Var.s(false);
            } else {
                av8Var.d0(-2064445196);
                i9a.i(Double.valueOf(d4.doubleValue()), false, null, null, null, null, false, av8Var, 432, PglCryptUtils.BASE64_FAILED);
                av8Var.s(false);
            }
            w(null, fy7Var2, true, str, z, z2, 40.0f, 0L, 0L, true, av8Var, (i3 & 112) | 806879616 | i5 | i6 | i7, 385);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new u93(fy7Var, fy7Var2, z, str, z2, i2);
        }
    }

    public static final void t(int i2, int i3, of3 of3Var, String str) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1943875909);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.g(str) ? 32 : 16;
        }
        int i5 = i4;
        if (av8Var.T(i5 & 1, (i5 & 19) != 18)) {
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.G(i2, bkh.l(utcVar, 16.0f), false, 0L, av8Var, (i5 & 14) | 48, 12);
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, (i5 >> 3) & 14, 0, 131066);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new vo(i2, str, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void u(int i2, String str, xtc xtcVar, String str2, Double d2, of3 of3Var, int i3, int i4) {
        xtc xtcVar2;
        int i5;
        Double d3;
        int i6;
        int i7;
        xtc xtcVar3;
        Double d4;
        eqf u2;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(210467226);
        int i8 = (av8Var.e(i2) ? 4 : 2) | i3 | (av8Var.g(str) ? 32 : 16);
        int i9 = i4 & 4;
        if (i9 != 0) {
            i8 |= 384;
        } else if ((i3 & 384) == 0) {
            xtcVar2 = xtcVar;
            i8 |= av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            int i10 = i8 | (!av8Var.g(str2) ? a.o : 1024);
            i5 = i4 & 16;
            if (i5 == 0) {
                i6 = i10 | 24576;
                d3 = d2;
            } else {
                d3 = d2;
                i6 = i10 | (av8Var.g(d3) ? 16384 : 8192);
            }
            i7 = i6;
            if (av8Var.T(i7 & 1, (i7 & 9363) == 9362)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
                d4 = d3;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i9 != 0 ? utcVar : xtcVar2;
                Double d5 = i5 != 0 ? null : d3;
                xtc d6 = bkh.d(xtcVar4, 1.0f);
                l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C = fqj.C(av8Var, d6);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, a2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m2, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                td4.G(i2, bkh.l(utcVar, 40.0f), false, 0L, av8Var, (i7 & 14) | 48, 12);
                goa d7 = bf3.d(utcVar, 8.0f, av8Var, 1.0f, true);
                u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, d7);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                long D = lz.D(R.color.n_lv_1, av8Var);
                yf8 yf8Var = xth.a;
                xtc xtcVar5 = xtcVar4;
                udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.l(), av8Var, (i7 >> 3) & 14, 384, 126970);
                av8Var = av8Var;
                if (str2 != null) {
                    av8Var.d0(832848344);
                    udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, xth.b(), av8Var, (i7 >> 9) & 14, 384, 126970);
                    av8Var = av8Var;
                    z = false;
                    av8Var.s(false);
                } else {
                    z = false;
                    av8Var.d0(833084750);
                    av8Var.s(false);
                }
                av8Var.s(true);
                if (d5 == null) {
                    av8Var.d0(-167881540);
                    av8Var.s(z);
                } else {
                    av8Var.d0(-167881539);
                    i9a.i(Double.valueOf(d5.doubleValue()), false, null, null, null, null, false, av8Var, 432, PglCryptUtils.BASE64_FAILED);
                    av8Var.s(z);
                }
                av8Var.s(true);
                d4 = d5;
                xtcVar3 = xtcVar5;
            }
            u2 = av8Var.u();
            if (u2 == null) {
                u2.d = new sw7(i2, str, xtcVar3, str2, d4, i3, i4);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        int i102 = i8 | (!av8Var.g(str2) ? a.o : 1024);
        i5 = i4 & 16;
        if (i5 == 0) {
        }
        i7 = i6;
        if (av8Var.T(i7 & 1, (i7 & 9363) == 9362)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static final void v(final int i2, final String str, final Integer num, final Integer num2, final Integer num3, final Integer num4, final int i3, Double d2, of3 of3Var, final int i4, final int i5) {
        Double d3;
        int i6;
        final Double d4;
        Double d5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1734242795);
        int i7 = i4 | (av8Var.e(i2) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(num2) ? a.o : 1024) | (av8Var.g(num3) ? 16384 : 8192) | (av8Var.g(num4) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.e(i3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i8 = i5 & 128;
        if (i8 != 0) {
            i6 = i7 | 12582912;
            d3 = d2;
        } else {
            d3 = d2;
            i6 = i7 | (av8Var.g(d3) ? 8388608 : 4194304);
        }
        if (av8Var.T(i6 & 1, (4793491 & i6) != 4793490)) {
            Double d6 = i8 != 0 ? null : d3;
            utc utcVar = utc.a;
            xtc d0 = d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            int i9 = i6;
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            td4.G(i2, bkh.l(utcVar, 40.0f), false, 0L, av8Var, (i9 & 14) | 48, 12);
            xtc f0 = f0(bf3.d(utcVar, 8.0f, av8Var, 1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            u23 a3 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, (i9 >> 3) & 14, 24960, 110586);
            av8Var = av8Var;
            if (d6 != null) {
                av8Var.d0(563909372);
                Double d7 = d6;
                i9a.i(d7, false, null, null, null, null, false, av8Var, ((i9 >> 21) & 14) | 432, PglCryptUtils.BASE64_FAILED);
                d5 = d7;
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                d5 = d6;
                av8Var.d0(564054483);
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.d0(-423973310);
            if (num != null && num2 != null && num3 != null && num4 != null) {
                int intValue = num4.intValue();
                av8 av8Var2 = av8Var;
                rha.d(num.intValue(), num2.intValue(), num3.intValue(), intValue, Integer.valueOf(i3), null, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, (i9 >> 6) & 57344, 0, 2016);
                av8Var = av8Var2;
                Unit unit = Unit.a;
            }
            av8Var.s(false);
            av8Var.s(true);
            d4 = d5;
        } else {
            av8Var.W();
            d4 = d3;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(i2, str, num, num2, num3, num4, i3, d4, i4, i5) { // from class: xw7
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Integer c;
                public final /* synthetic */ Integer d;
                public final /* synthetic */ Integer e;
                public final /* synthetic */ Integer f;
                public final /* synthetic */ int g;
                public final /* synthetic */ Double h;
                public final /* synthetic */ int i;

                {
                    this.i = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    l98.v(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (of3) obj, K, this.i);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void w(xtc xtcVar, final fy7 fy7Var, final boolean z, final String str, final boolean z2, final boolean z3, final float f2, long j2, long j3, boolean z4, of3 of3Var, final int i2, final int i3) {
        int i4;
        float f3;
        long j4;
        long j5;
        av8 av8Var;
        xtc xtcVar2;
        final boolean z5;
        final long j6;
        final long j7;
        xtc xtcVar3;
        long j8;
        boolean z6;
        long j9;
        int i5;
        long j10;
        long j11;
        long j12;
        boolean z7;
        int i6;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-355608413);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (av8Var2.g(xtcVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(fy7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var2.g(str) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= av8Var2.h(z3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            f3 = f2;
            i4 |= av8Var2.d(f3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            f3 = f2;
        }
        if ((12582912 & i2) == 0) {
            if ((i3 & 128) == 0) {
                j4 = j2;
                if (av8Var2.f(j4)) {
                    i6 = 8388608;
                    i4 |= i6;
                }
            } else {
                j4 = j2;
            }
            i6 = 4194304;
            i4 |= i6;
        } else {
            j4 = j2;
        }
        if ((100663296 & i2) == 0) {
            j5 = j3;
            i4 |= ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) == 0 && av8Var2.f(j5)) ? 67108864 : 33554432;
        } else {
            j5 = j3;
        }
        int i8 = i3 & 512;
        if (i8 != 0) {
            i4 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i4 |= av8Var2.h(z4) ? 536870912 : 268435456;
        }
        if (av8Var2.T(i4 & 1, (i4 & 306783379) != 306783378)) {
            av8Var2.Y();
            int i9 = i2 & 1;
            utc utcVar = utc.a;
            if (i9 == 0 || av8Var2.B()) {
                xtcVar3 = i7 != 0 ? utcVar : xtcVar;
                if ((i3 & 128) != 0) {
                    j4 = lz.D(R.color.n_lv_1, av8Var2);
                    i4 &= -29360129;
                }
                if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    j8 = lz.D(R.color.n_lv_3, av8Var2);
                    i4 &= -234881025;
                } else {
                    j8 = j5;
                }
                if (i8 != 0) {
                    j9 = j8;
                    i5 = i4;
                    j10 = j4;
                    z6 = false;
                    av8Var2.t();
                    xtc d0 = d0(xtcVar3, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    kv1 kv1Var = uxf.p;
                    u23 a2 = t23.a(ww9.d, kv1Var, av8Var2, 48);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C = fqj.C(av8Var2, d0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.q0();
                    } else {
                        av8Var2.l(zg3Var);
                    }
                    waa.K(av8Var2, a2, hf3.g);
                    waa.K(av8Var2, m2, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    we9 we9Var = new we9(kv1Var);
                    int i10 = fy7Var.a;
                    ey7 ey7Var = fy7Var.f;
                    ey7 ey7Var2 = fy7Var.e;
                    boolean z8 = fy7Var.l;
                    String str2 = fy7Var.i;
                    String str3 = fy7Var.k;
                    Integer valueOf = ey7Var2 == null ? Integer.valueOf(ey7Var2.a) : null;
                    Integer valueOf2 = ey7Var == null ? Integer.valueOf(ey7Var.a) : null;
                    xtc xtcVar4 = xtcVar3;
                    float f4 = f3;
                    Integer num = valueOf;
                    td4.H(i10, str, we9Var, z8, str2, str3, num, valueOf2, ey7Var2 == null ? ey7Var2.c : null, ey7Var == null ? ey7Var.c : null, false, z3, f4, false, av8Var2, (i5 >> 6) & 112, (i5 >> 12) & 1008, 9216);
                    av8Var = av8Var2;
                    if (z6) {
                        av8Var.d0(1648483689);
                        if (z3) {
                            av8Var.d0(1648493113);
                            xtc f0 = f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            String str4 = ey7Var2 != null ? ey7Var2.b : "";
                            yf8 yf8Var = xth.a;
                            long j13 = j10;
                            int i11 = (i5 >> 15) & 896;
                            udj.c(str4, f0, j13, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var, i11 | 48, 0, 130040);
                            udj.c(ey7Var != null ? ey7Var.b : "", null, j13, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var, i11, 0, 130042);
                            av8Var = av8Var;
                            z7 = false;
                            av8Var.s(false);
                            j11 = j13;
                            j12 = j9;
                        } else {
                            long j14 = j10;
                            av8Var.d0(1649040759);
                            xtc f02 = f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            String K = qea.K(fy7Var.c, z && z2);
                            String str5 = K != null ? K : "";
                            yf8 yf8Var2 = xth.a;
                            udj.c(str5, f02, j14, null, 0L, null, 0L, null, new p7j(3), 0L, 2, false, 1, 0, null, xth.k(), av8Var, ((i5 >> 15) & 896) | 48, 24960, 109560);
                            j11 = j14;
                            av8Var = av8Var;
                            if (fy7Var.g != null) {
                                av8Var.d0(1649549097);
                                j12 = j9;
                                udj.c(fy7Var.g, null, j12, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.k(), av8Var, (i5 >> 18) & 896, 0, 130042);
                                av8Var = av8Var;
                                z7 = false;
                                av8Var.s(false);
                            } else {
                                j12 = j9;
                                z7 = false;
                                av8Var.d0(1649732245);
                                av8Var.s(false);
                            }
                            av8Var.s(z7);
                        }
                        av8Var.s(z7);
                    } else {
                        j11 = j10;
                        j12 = j9;
                        av8Var.d0(1649756053);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    xtcVar2 = xtcVar4;
                    j6 = j12;
                    z5 = z6;
                    j7 = j11;
                } else {
                    z6 = z4;
                    j9 = j8;
                }
            } else {
                av8Var2.W();
                if ((i3 & 128) != 0) {
                    i4 &= -29360129;
                }
                if ((i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    i4 &= -234881025;
                }
                xtcVar3 = xtcVar;
                z6 = z4;
                j9 = j5;
            }
            i5 = i4;
            j10 = j4;
            av8Var2.t();
            xtc d02 = d0(xtcVar3, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            kv1 kv1Var2 = uxf.p;
            u23 a22 = t23.a(ww9.d, kv1Var2, av8Var2, 48);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m22 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, d02);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
            }
            waa.K(av8Var2, a22, hf3.g);
            waa.K(av8Var2, m22, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode2), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C2, hf3.d);
            we9 we9Var2 = new we9(kv1Var2);
            int i102 = fy7Var.a;
            ey7 ey7Var3 = fy7Var.f;
            ey7 ey7Var22 = fy7Var.e;
            boolean z82 = fy7Var.l;
            String str22 = fy7Var.i;
            String str32 = fy7Var.k;
            if (ey7Var22 == null) {
            }
            if (ey7Var3 == null) {
            }
            if (ey7Var22 == null) {
            }
            xtc xtcVar42 = xtcVar3;
            float f42 = f3;
            Integer num2 = valueOf;
            td4.H(i102, str, we9Var2, z82, str22, str32, num2, valueOf2, ey7Var22 == null ? ey7Var22.c : null, ey7Var3 == null ? ey7Var3.c : null, false, z3, f42, false, av8Var2, (i5 >> 6) & 112, (i5 >> 12) & 1008, 9216);
            av8Var = av8Var2;
            if (z6) {
            }
            av8Var.s(true);
            xtcVar2 = xtcVar42;
            j6 = j12;
            z5 = z6;
            j7 = j11;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            xtcVar2 = xtcVar;
            z5 = z4;
            j6 = j5;
            j7 = j4;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            final xtc xtcVar5 = xtcVar2;
            u2.d = new Function2() { // from class: zw7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K2 = aba.K(i2 | 1);
                    l98.w(xtc.this, fy7Var, z, str, z2, z3, f2, j7, j6, z5, (of3) obj, K2, i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final q79 x(KSerializer kSerializer, KSerializer kSerializer2) {
        kSerializer.getClass();
        kSerializer2.getClass();
        return new q79(kSerializer, kSerializer2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void y(rxb rxbVar, boolean z, Integer num, r13 r13Var, String str, String str2, Function1 function1, xtc xtcVar, wla wlaVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        a99 a99Var;
        ry ryVar;
        av8 av8Var;
        boolean g2;
        Object O;
        String b2;
        String str3;
        boolean g3;
        Object O2;
        String str4;
        av8 av8Var2;
        boolean e2;
        Object O3;
        rxb rxbVar2 = rxbVar;
        Function1 function12 = function1;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(1197747551);
        int i3 = i2 | (av8Var3.g(rxbVar2) ? 4 : 2) | (av8Var3.h(z) ? 32 : 16) | (av8Var3.g(num) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var3.g(r13Var) ? a.o : 1024) | (av8Var3.g(str) ? 16384 : 8192) | (av8Var3.g(str2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var3.i(function12) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | 12582912 | (av8Var3.g(wlaVar) ? 67108864 : 33554432);
        if (av8Var3.T(i3 & 1, (38347923 & i3) != 38347922)) {
            wn1 wn1Var = rxbVar2.b;
            Highlight highlight = rxbVar2.c;
            Integer num2 = rxbVar2.f;
            String str5 = rxbVar2.d;
            String str6 = rxbVar2.e;
            Event event = rxbVar2.a;
            Context context = (Context) av8Var3.k(nz.b);
            boolean z2 = (i3 & 14) == 4;
            Object O4 = av8Var3.O();
            a99 a99Var2 = nf3.a;
            if (z2 || O4 == a99Var2) {
                O4 = new lfl(rxbVar2, function12);
                av8Var3.n0(O4);
            }
            Function0 function0 = (Function0) O4;
            n7g a2 = o7g.a(16.0f);
            utc utcVar = utc.a;
            xtc q2 = n9e.q(wnn.A(utcVar, a2), lz.D(R.color.surface_1, av8Var3), oyn.e);
            long D = lz.D(R.color.n_lv_4, av8Var3);
            Object O5 = av8Var3.O();
            if (O5 == a99Var2) {
                O5 = mz1.e(av8Var3);
            }
            wzc wzcVar = (wzc) O5;
            Object[] objArr = new Object[0];
            Object O6 = av8Var3.O();
            if (O6 == a99Var2) {
                O6 = wzj.n;
                av8Var3.n0(O6);
            }
            xtc O7 = kda.O(tol.y(q2, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O6, av8Var3, 48), function12, wn1Var, 14), av8Var3, 0), "matchday_highlight_card_" + event.getId(), av8Var3);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C = fqj.C(av8Var3, O7);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var3, a3, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var3, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var2);
            ry ryVar2 = hf3.k;
            waa.J(av8Var3, ryVar2);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var3, C, f50Var3);
            xtc e0 = e0(bkh.d(utcVar, 1.0f), 16.0f, 16.0f, 16.0f, 8.0f);
            ng0 ng0Var = new ng0(16.0f, true, new a70(6));
            lv1 lv1Var = uxf.m;
            l8g a4 = k8g.a(ng0Var, lv1Var, av8Var3, 54);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, e0);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var);
            waa.K(av8Var3, m3, ff3Var);
            bf3.s(hashCode2, av8Var3, f50Var2, av8Var3, ryVar2);
            waa.K(av8Var3, C2, f50Var3);
            p8g p8gVar = p8g.a;
            xtc a5 = p8gVar.a(1.0f, utcVar, true);
            boolean f2 = av8Var3.f(event.getStartTimestamp());
            Object O8 = av8Var3.O();
            if (f2) {
                a99Var = a99Var2;
            } else {
                a99Var = a99Var2;
                if (O8 != a99Var) {
                    ryVar = ryVar2;
                    yf8 yf8Var = xth.a;
                    a99 a99Var3 = a99Var;
                    ry ryVar3 = ryVar;
                    udj.c((String) O8, a5, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 0, 0, 131064);
                    av8Var = av8Var3;
                    g2 = av8Var.g(event.getSportSlug()) | av8Var.g(str6);
                    O = av8Var.O();
                    if (!g2 || O == a99Var3) {
                        Regex regex = c7g.a;
                        O = c7g.a(str6, event.getSportSlug());
                        av8Var.n0(O);
                    }
                    b2 = ((r9k) O).b(context);
                    str3 = null;
                    if (b2.length() <= 0) {
                        b2 = null;
                    }
                    g3 = av8Var.g(str5) | av8Var.g(b2) | av8Var.g(num2);
                    O2 = av8Var.O();
                    if (!g3 || O2 == a99Var3) {
                        String string = context.getString(R.string.round);
                        string.getClass();
                        if (b2 == null) {
                            b2 = num2 != null ? mz1.j(num2.intValue(), string, " ") : null;
                        }
                        String str7 = (str5 != null || str5.length() <= 0) ? null : str5;
                        if (b2 != null && b2.length() > 0) {
                            str3 = b2;
                        }
                        O2 = CollectionsKt.f0(ph0.x(new String[]{str7, str3}), ", ", null, null, null, 62);
                        av8Var.n0(O2);
                    }
                    str4 = (String) O2;
                    if (str4.length() <= 0) {
                        av8Var.d0(1007206009);
                        udj.c(str4, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var, 0, 24960, 110586);
                        av8Var = av8Var;
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1007450537);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    xtc c0 = c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
                    l8g a6 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 54);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m4 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, c0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    waa.K(av8Var, a6, f50Var);
                    waa.K(av8Var, m4, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar3);
                    waa.K(av8Var, C3, f50Var3);
                    av8Var2 = av8Var;
                    udj.c(wn1Var.d, p8gVar.a(1.0f, utcVar, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110584);
                    int i4 = wn1Var.b;
                    int i5 = wn1Var.c;
                    Integer num3 = wn1Var.j;
                    int intValue = num3 == null ? num3.intValue() : 0;
                    Integer num4 = wn1Var.k;
                    rha.d(i4, i5, intValue, num4 == null ? num4.intValue() : 0, wn1Var.u, null, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 0, 2016);
                    udj.c(wn1Var.g, p8gVar.a(1.0f, utcVar, true), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 109560);
                    av8Var2.s(true);
                    xtc b0 = b0(bkh.d(utcVar, 1.0f), 8.0f);
                    u23 a7 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var2, 6);
                    int hashCode4 = Long.hashCode(av8Var2.T);
                    aee m5 = av8Var2.m();
                    xtc C4 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.q0();
                    } else {
                        av8Var2.l(zg3Var);
                    }
                    waa.K(av8Var2, a7, f50Var);
                    waa.K(av8Var2, m5, ff3Var);
                    bf3.s(hashCode4, av8Var2, f50Var2, av8Var2, ryVar3);
                    waa.K(av8Var2, C4, f50Var3);
                    String thumbnailUrl = highlight.getThumbnailUrl();
                    String url = highlight.getUrl();
                    int i6 = wn1Var.b;
                    int i7 = wn1Var.c;
                    rxbVar2 = rxbVar;
                    boolean z3 = rxbVar2.h;
                    int id = event.getId();
                    e2 = av8Var2.e(event.getId());
                    O3 = av8Var2.O();
                    if (!e2 || O3 == a99Var3) {
                        function12 = function1;
                        O3 = new lfl(function12, rxbVar2);
                        av8Var2.n0(O3);
                    } else {
                        function12 = function1;
                    }
                    A(thumbnailUrl, url, i6, i7, z3, id, (Function0) O3, av8Var2, 0);
                    u0a.j(event.getId(), rxbVar2.g, z, num, r13Var, str, str2, function0, null, wlaVar, av8Var2, (i3 << 3) & 1883242368);
                    av8Var3 = av8Var2;
                    av8Var3.s(true);
                    av8Var3.s(true);
                    xtcVar2 = utcVar;
                }
            }
            long startTimestamp = event.getStartTimestamp();
            bi4 bi4Var = bi4.PATTERN_DMM;
            ConcurrentHashMap concurrentHashMap = hk4.a;
            ryVar = ryVar2;
            O8 = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(startTimestamp));
            O8.getClass();
            av8Var3.n0(O8);
            yf8 yf8Var2 = xth.a;
            a99 a99Var32 = a99Var;
            ry ryVar32 = ryVar;
            udj.c((String) O8, a5, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var3, 0, 0, 131064);
            av8Var = av8Var3;
            g2 = av8Var.g(event.getSportSlug()) | av8Var.g(str6);
            O = av8Var.O();
            if (!g2) {
            }
            Regex regex2 = c7g.a;
            O = c7g.a(str6, event.getSportSlug());
            av8Var.n0(O);
            b2 = ((r9k) O).b(context);
            str3 = null;
            if (b2.length() <= 0) {
            }
            g3 = av8Var.g(str5) | av8Var.g(b2) | av8Var.g(num2);
            O2 = av8Var.O();
            if (!g3) {
            }
            String string2 = context.getString(R.string.round);
            string2.getClass();
            if (b2 == null) {
            }
            if (str5 != null) {
            }
            if (b2 != null) {
                str3 = b2;
            }
            O2 = CollectionsKt.f0(ph0.x(new String[]{str7, str3}), ", ", null, null, null, 62);
            av8Var.n0(O2);
            str4 = (String) O2;
            if (str4.length() <= 0) {
            }
            av8Var.s(true);
            xtc c02 = c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
            l8g a62 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var, 54);
            int hashCode32 = Long.hashCode(av8Var.T);
            aee m42 = av8Var.m();
            xtc C32 = fqj.C(av8Var, c02);
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a62, f50Var);
            waa.K(av8Var, m42, ff3Var);
            bf3.s(hashCode32, av8Var, f50Var2, av8Var, ryVar32);
            waa.K(av8Var, C32, f50Var3);
            av8Var2 = av8Var;
            udj.c(wn1Var.d, p8gVar.a(1.0f, utcVar, true), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 110584);
            int i42 = wn1Var.b;
            int i52 = wn1Var.c;
            Integer num32 = wn1Var.j;
            if (num32 == null) {
            }
            Integer num42 = wn1Var.k;
            rha.d(i42, i52, intValue, num42 == null ? num42.intValue() : 0, wn1Var.u, null, 0L, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 0, 2016);
            udj.c(wn1Var.g, p8gVar.a(1.0f, utcVar, true), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, new p7j(6), 0L, 2, false, 1, 0, null, xth.l(), av8Var2, 0, 24960, 109560);
            av8Var2.s(true);
            xtc b02 = b0(bkh.d(utcVar, 1.0f), 8.0f);
            u23 a72 = t23.a(new ng0(8.0f, true, new a70(6)), kv1Var, av8Var2, 6);
            int hashCode42 = Long.hashCode(av8Var2.T);
            aee m52 = av8Var2.m();
            xtc C42 = fqj.C(av8Var2, b02);
            av8Var2.h0();
            if (av8Var2.S) {
            }
            waa.K(av8Var2, a72, f50Var);
            waa.K(av8Var2, m52, ff3Var);
            bf3.s(hashCode42, av8Var2, f50Var2, av8Var2, ryVar32);
            waa.K(av8Var2, C42, f50Var3);
            String thumbnailUrl2 = highlight.getThumbnailUrl();
            String url2 = highlight.getUrl();
            int i62 = wn1Var.b;
            int i72 = wn1Var.c;
            rxbVar2 = rxbVar;
            boolean z32 = rxbVar2.h;
            int id2 = event.getId();
            e2 = av8Var2.e(event.getId());
            O3 = av8Var2.O();
            if (e2) {
            }
            function12 = function1;
            O3 = new lfl(function12, rxbVar2);
            av8Var2.n0(O3);
            A(thumbnailUrl2, url2, i62, i72, z32, id2, (Function0) O3, av8Var2, 0);
            u0a.j(event.getId(), rxbVar2.g, z, num, r13Var, str, str2, function0, null, wlaVar, av8Var2, (i3 << 3) & 1883242368);
            av8Var3 = av8Var2;
            av8Var3.s(true);
            av8Var3.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var3.W();
            xtcVar2 = xtcVar;
        }
        eqf u2 = av8Var3.u();
        if (u2 != null) {
            u2.d = new ub7(rxbVar2, z, num, r13Var, str, str2, function12, xtcVar2, wlaVar, i2);
        }
    }

    public static final void z(final int i2, final int i3, int i4, of3 of3Var, xtc xtcVar) {
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1085163207);
        if ((i4 & 6) == 0) {
            i5 = (av8Var.e(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= av8Var.e(i3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        boolean z = true;
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            if (((Boolean) av8Var.k(f5a.a)).booleanValue()) {
                av8Var.d0(121915445);
            } else {
                av8Var.d0(121943128);
                Object O = av8Var.O();
                if (O == nf3.a) {
                    yea yeaVar = j58.a;
                    e58 f2 = e58.f();
                    f2.getClass();
                    O = Boolean.valueOf(f2.c("should_use_official_world_cup_icon"));
                    av8Var.n0(O);
                }
                z = ((Boolean) O).booleanValue();
            }
            av8Var.s(false);
            final int i6 = z ? 2131233094 : R.drawable.ic_world_cup_fallback;
            dy0.b(xtcVar, null, yqo.H(-1795158365, av8Var, new ct8() { // from class: nfl
                @Override // defpackage.ct8
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s22 s22Var = (s22) obj;
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    s22Var.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((av8) of3Var2).g(s22Var) ? 4 : 2;
                    }
                    av8 av8Var2 = (av8) of3Var2;
                    if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                        float c2 = s22Var.c() * 0.21052632f;
                        float c3 = s22Var.c() * 0.10526316f;
                        g28 g28Var = bkh.c;
                        wkn.k(haa.t(R.drawable.wc_matchday_highlights_fifa_thumbnail, 0, av8Var2), null, g28Var, null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 25016, 104);
                        e12.a(6, av8Var2, n9e.q(g28Var, r13.c(r13.b, 0.25f), oyn.e));
                        mv1 mv1Var = uxf.d;
                        utc utcVar = utc.a;
                        xtc f0 = l98.f0(s22Var.a(utcVar, mv1Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s22Var.b() * 0.058479533f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        String v2 = oea.v(R.string.event_highlights, av8Var2);
                        yf8 yf8Var = xth.a;
                        udj.c(v2, f0, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 0, 0, 131064);
                        td4.G(i2, bkh.l(l98.f0(s22Var.a(utcVar, uxf.f), c3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), c2), false, 0L, av8Var2, 0, 12);
                        td4.G(i3, bkh.l(l98.f0(s22Var.a(utcVar, uxf.h), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), c2), false, 0L, av8Var2, 0, 12);
                        wkn.k(haa.t(i6, 0, av8Var2), null, bkh.e(l98.f0(s22Var.a(utcVar, uxf.j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, s22Var.b() * 0.05263158f, 7), s22Var.b() * 0.15204678f), null, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var2, 24632, 104);
                    } else {
                        av8Var2.W();
                    }
                    return Unit.a;
                }
            }), av8Var, ((i5 >> 6) & 14) | 3072, 6);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new cu7(i2, i3, xtcVar, i4, 2);
        }
    }
}
