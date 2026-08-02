package defpackage;

import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ehd {
    static {
        ypa.a(ysa.c, new ivc(25));
    }

    public static final void a(boolean z, boolean z2, Function0 function0, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(248498887);
        int i2 = (av8Var.h(z) ? 4 : 2) | i | (av8Var.h(z2) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            e(R.drawable.ic_download, oea.v(R.string.import_sounds, av8Var), oea.v(z ? R.string.button_imported : R.string.button_import, av8Var), function0, null, oea.v(z ? R.string.sounds_imported_body : R.string.import_sounds_body, av8Var), Boolean.valueOf(z).equals(Boolean.TRUE) ? Integer.valueOf(R.drawable.ic_done) : null, !z, z2, av8Var, ((i2 << 3) & 7168) | ((i2 << 21) & 234881024), 16);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sfd(z, z2, function0, i);
        }
    }

    public static final void b(vnb vnbVar, Function1 function1, of3 of3Var, int i) {
        int i2;
        vnbVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(362129844);
        int i3 = (av8Var.g(vnbVar) ? 4 : 2) | i | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            boolean booleanValue = ((Boolean) av8Var.k(f5a.a)).booleanValue();
            xtc f0 = ml4.f0(bkh.c);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String v = oea.v(R.string.profile_notifications, av8Var);
            boolean z = (i3 & 112) == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = new vbc(4, function1);
                av8Var.n0(O);
            }
            pea.k(v, (Function0) O, null, 0L, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object O2 = av8Var.O();
            if (z2 || O2 == a99Var) {
                O2 = new k4b(vnbVar, 1);
                av8Var.n0(O2);
            }
            i2 = 0;
            av8Var = av8Var;
            wkn.a(vnbVar, null, null, (Function1) O2, yqo.H(1279548968, av8Var, new hs5(function1, booleanValue, 3)), av8Var, i4 | 24576, 6);
            av8Var.s(true);
        } else {
            i2 = 0;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new chd(vnbVar, function1, i, i2);
        }
    }

    public static final void c(long j, Function1 function1, of3 of3Var, int i) {
        Pair pair;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1629296843);
        int i2 = i | (av8Var.f(j) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc d0 = l98.d0(n9e.q(wnn.A(l98.d0(utc.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            boolean z = j != 0;
            if (j != 0) {
                av8Var.d0(436608942);
                ChronoLocalDateTime<LocalDate> localDateTime = Instant.ofEpochSecond(j).atZone(ZoneId.systemDefault()).toLocalDateTime();
                localDateTime.getClass();
                pair = new Pair(new q9k(R.string.notifications_muted_until, l6g.K(new DateTimeFormatterBuilder().appendLocalized(null, FormatStyle.SHORT).toFormatter(Locale.getDefault()).format(localDateTime))), new r13(lz.D(R.color.alert, av8Var)));
                av8Var.s(false);
            } else {
                av8Var.d0(436884098);
                pair = new Pair(new q9k(R.string.mute_notifications_body), new r13(lz.D(R.color.n_lv_3, av8Var)));
                av8Var.s(false);
            }
            q9k q9kVar = (q9k) pair.a;
            long j2 = ((r13) pair.b).a;
            q9k q9kVar2 = new q9k(R.string.mute_notifications);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                O = new vbc(7, function1);
                av8Var.n0(O);
            }
            f(R.drawable.ic_notification_mute, q9kVar2, (Function0) O, null, q9kVar, j2, z ? null : new q9k(R.string.notifications_off), false, false, av8Var, 0, 392);
            q9k q9kVar3 = new q9k(R.string.notification_sounds);
            boolean z3 = i3 == 32;
            Object O2 = av8Var.O();
            if (z3 || O2 == a99Var) {
                O2 = new vbc(8, function1);
                av8Var.n0(O2);
            }
            f(R.drawable.ic_sound, q9kVar3, (Function0) O2, null, new q9k(R.string.notification_sounds_body), 0L, null, false, false, av8Var, 0, 488);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new v64(j, function1, i, 2);
        }
    }

    public static final void d(Function0 function0, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1832636385);
        int i2 = (av8Var2.i(function0) ? 4 : 2) | i;
        if (av8Var2.T(i2 & 1, (i2 & 3) != 2)) {
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            String v = oea.v(R.string.reset_notification_settings, av8Var2);
            String v2 = oea.v(R.string.button_reset, av8Var2);
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = new tra(6, e1dVar);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            e(R.drawable.ic_reset_notification, v, v2, (Function0) O2, null, null, null, false, false, av8Var, 3072, 496);
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new tra(7, e1dVar);
                av8Var.n0(O3);
            }
            un0.f(booleanValue, (Function0) O3, false, false, yqo.H(652511248, av8Var, new op9(19, function0, e1dVar)), av8Var, 24624, 12);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f91(i, 9, function0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(int i, String str, String str2, Function0 function0, xtc xtcVar, String str3, Integer num, boolean z, boolean z2, of3 of3Var, int i2, int i3) {
        int i4;
        int i5;
        Integer num2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        String str4;
        av8 av8Var;
        boolean z5;
        Integer num3;
        xtc xtcVar2;
        eqf u;
        boolean z6;
        String str5;
        bqh bqhVar;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(487811686);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var2.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var2.i(function0) ? a.o : 1024;
        }
        int i9 = i4 | 24576;
        int i10 = i3 & 32;
        if (i10 != 0) {
            i9 = 221184 | i4;
        } else if ((196608 & i2) == 0) {
            i9 |= av8Var2.g(str3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            i5 = i3 & 64;
            if (i5 == 0) {
                i9 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                num2 = num;
                i9 |= av8Var2.g(num2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                i6 = i3 & 128;
                if (i6 != 0) {
                    i9 |= 12582912;
                } else if ((12582912 & i2) == 0) {
                    z3 = z;
                    i9 |= av8Var2.h(z3) ? 8388608 : 4194304;
                    i7 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i7 == 0) {
                        i9 |= 100663296;
                    } else if ((100663296 & i2) == 0) {
                        z4 = z2;
                        i9 |= av8Var2.h(z4) ? 67108864 : 33554432;
                        i8 = i9;
                        if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
                            String str6 = i10 != 0 ? null : str3;
                            Integer num4 = i5 != 0 ? null : num2;
                            boolean z7 = i6 != 0 ? true : z3;
                            boolean z8 = i7 != 0 ? false : z4;
                            utc utcVar = utc.a;
                            xtc c0 = l98.c0(n9e.q(wnn.A(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var2), oyn.e), 16.0f, 20.0f);
                            l8g a = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var2, 54);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m = av8Var2.m();
                            xtc C = fqj.C(av8Var2, c0);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.l(zg3Var);
                            } else {
                                av8Var2.q0();
                            }
                            f50 f50Var = hf3.g;
                            waa.K(av8Var2, a, f50Var);
                            ff3 ff3Var = hf3.f;
                            waa.K(av8Var2, m, ff3Var);
                            Integer valueOf = Integer.valueOf(hashCode);
                            f50 f50Var2 = hf3.j;
                            waa.K(av8Var2, valueOf, f50Var2);
                            ry ryVar = hf3.k;
                            waa.J(av8Var2, ryVar);
                            f50 f50Var3 = hf3.d;
                            waa.K(av8Var2, C, f50Var3);
                            kq9.b(s6a.N(i, ((i8 << 3) & 112) | 6, av8Var2), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var2), av8Var2, 432, 0);
                            goa goaVar = new goa(1.0f, true);
                            u23 a2 = t23.a(ww9.f, uxf.o, av8Var2, 6);
                            int hashCode2 = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C2 = fqj.C(av8Var2, goaVar);
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.l(zg3Var);
                            } else {
                                av8Var2.q0();
                            }
                            waa.K(av8Var2, a2, f50Var);
                            waa.K(av8Var2, m2, ff3Var);
                            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                            waa.K(av8Var2, C2, f50Var3);
                            yf8 yf8Var = xth.a;
                            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, xth.e(), av8Var2, (i8 >> 3) & 14, 24960, 110586);
                            if (str6 == null) {
                                av8Var2.d0(-673152681);
                                z6 = false;
                                av8Var2.s(false);
                                str5 = str6;
                            } else {
                                z6 = false;
                                av8Var2.d0(-673152680);
                                nq8.h(av8Var2, bkh.e(utcVar, 2.0f));
                                String str7 = str6;
                                udj.c(str7, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var2, (i8 >> 15) & 14, 24960, 110586);
                                str5 = str7;
                                av8Var2.s(false);
                            }
                            av8Var2.s(true);
                            if (num4 == null) {
                                av8Var2.d0(544567128);
                                av8Var2.s(z6);
                                bqhVar = null;
                            } else {
                                av8Var2.d0(544567129);
                                bqh bqhVar2 = new bqh(s6a.N(num4.intValue(), ((i8 >> 15) & 112) | 6, av8Var2), uxf.q);
                                av8Var2.s(z6);
                                bqhVar = bqhVar2;
                            }
                            int i11 = i8 >> 6;
                            boolean z9 = z7;
                            boolean z10 = z8;
                            mha.h(str2, function0, null, tqh.a, bqhVar, z9, z10, false, 0L, 0, 0, av8Var2, (i11 & 14) | 3072 | (i11 & 112) | (458752 & i11) | (i11 & 3670016), 0, 1924);
                            av8Var2.s(true);
                            xtcVar2 = utcVar;
                            str4 = str5;
                            av8Var = av8Var2;
                            z3 = z9;
                            z5 = z10;
                            num3 = num4;
                        } else {
                            av8Var2.W();
                            str4 = str3;
                            av8Var = av8Var2;
                            z5 = z4;
                            num3 = num2;
                            xtcVar2 = xtcVar;
                        }
                        u = av8Var.u();
                        if (u != null) {
                            u.d = new du7(i, str, str2, function0, xtcVar2, str4, num3, z3, z5, i2, i3);
                            return;
                        }
                        return;
                    }
                    z4 = z2;
                    i8 = i9;
                    if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
                    }
                    u = av8Var.u();
                    if (u != null) {
                    }
                }
                z3 = z;
                i7 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i7 == 0) {
                }
                z4 = z2;
                i8 = i9;
                if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
            num2 = num;
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
            if (i7 == 0) {
            }
            z4 = z2;
            i8 = i9;
            if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        num2 = num;
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i7 == 0) {
        }
        z4 = z2;
        i8 = i9;
        if (av8Var2.T(i8 & 1, (i8 & 38347923) != 38347922)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final int i, r9k r9kVar, final Function0 function0, xtc xtcVar, final r9k r9kVar2, long j, r9k r9kVar3, boolean z, boolean z2, of3 of3Var, final int i2, final int i3) {
        xtc xtcVar2;
        int i4;
        long j2;
        int i5;
        int i6;
        r9k r9kVar4;
        int i7;
        int i8;
        int i9;
        int i10;
        av8 av8Var;
        boolean z3;
        final boolean z4;
        final r9k r9kVar5;
        eqf u;
        r9k r9kVar6;
        boolean z5;
        boolean z6;
        int i11;
        boolean z7;
        boolean z8;
        Object O;
        a99 a99Var;
        Object O2;
        r9k r9kVar7;
        boolean z9;
        r9k r9kVar8 = r9kVar;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-981210562);
        int i12 = i2 | (av8Var2.e(i) ? 4 : 2) | (av8Var2.g(r9kVar8) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 = i12 | 3072;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i4 = i12 | (av8Var2.g(xtcVar2) ? a.o : 1024);
        }
        int i14 = i4 | (av8Var2.g(r9kVar2) ? 16384 : 8192);
        if ((i3 & 32) == 0) {
            j2 = j;
            if (av8Var2.f(j2)) {
                i5 = 131072;
                int i15 = i14 | i5;
                i6 = i3 & 64;
                if (i6 == 0) {
                    i7 = i15 | 1572864;
                    r9kVar4 = r9kVar3;
                } else {
                    r9kVar4 = r9kVar3;
                    i7 = i15 | (av8Var2.g(r9kVar4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                    i7 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i7 |= av8Var2.h(z) ? 8388608 : 4194304;
                    i9 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                    if (i9 != 0) {
                        i10 = i7 | 100663296;
                    } else {
                        int i16 = i7;
                        if ((i2 & 100663296) == 0) {
                            i10 = i16 | (av8Var2.h(z2) ? 67108864 : 33554432);
                        } else {
                            i10 = i16;
                        }
                    }
                    if (av8Var2.T(i10 & 1, (i10 & 38347923) != 38347922)) {
                        av8Var2.Y();
                        int i17 = i2 & 1;
                        utc utcVar = utc.a;
                        if (i17 == 0 || av8Var2.B()) {
                            if (i13 != 0) {
                                xtcVar2 = utcVar;
                            }
                            if ((i3 & 32) != 0) {
                                j2 = lz.D(R.color.n_lv_3, av8Var2);
                                i10 &= -458753;
                            }
                            r9kVar6 = i6 != 0 ? null : r9kVar4;
                            z5 = i8 != 0 ? false : z;
                            if (i9 != 0) {
                                i11 = i10;
                                z6 = false;
                                av8Var2.t();
                                z7 = z5;
                                xtc q = n9e.q(xtcVar2, lz.D(R.color.surface_1, av8Var2), oyn.e);
                                p4h p4hVar = ww9.d;
                                kv1 kv1Var = uxf.o;
                                xtc xtcVar3 = xtcVar2;
                                u23 a = t23.a(p4hVar, kv1Var, av8Var2, 0);
                                long j3 = j2;
                                int hashCode = Long.hashCode(av8Var2.T);
                                aee m = av8Var2.m();
                                xtc C = fqj.C(av8Var2, q);
                                if3.k7.getClass();
                                zg3 zg3Var = hf3.b;
                                av8Var2.h0();
                                if (av8Var2.S) {
                                    av8Var2.q0();
                                } else {
                                    av8Var2.l(zg3Var);
                                }
                                f50 f50Var = hf3.g;
                                waa.K(av8Var2, a, f50Var);
                                ff3 ff3Var = hf3.f;
                                waa.K(av8Var2, m, ff3Var);
                                Integer valueOf = Integer.valueOf(hashCode);
                                f50 f50Var2 = hf3.j;
                                waa.K(av8Var2, valueOf, f50Var2);
                                ry ryVar = hf3.k;
                                waa.J(av8Var2, ryVar);
                                f50 f50Var3 = hf3.d;
                                waa.K(av8Var2, C, f50Var3);
                                if (z7) {
                                    z8 = z6;
                                    av8Var2.d0(370459342);
                                    av8Var2.s(false);
                                } else {
                                    z8 = z6;
                                    bf3.r(8.0f, 370408409, av8Var2, av8Var2, utcVar);
                                    av8Var2.s(false);
                                }
                                long D = lz.D(R.color.n_lv_4, av8Var2);
                                O = av8Var2.O();
                                a99Var = nf3.a;
                                if (O == a99Var) {
                                    O = mz1.e(av8Var2);
                                }
                                wzc wzcVar = (wzc) O;
                                int i18 = i11;
                                Object[] objArr = new Object[0];
                                O2 = av8Var2.O();
                                if (O2 == a99Var) {
                                    O2 = jxa.o;
                                    av8Var2.n0(O2);
                                }
                                xtc c0 = l98.c0(tol.y(utcVar, true, true, true, D, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), 17), av8Var2, 0), 16.0f, 12.0f);
                                r9kVar7 = r9kVar6;
                                l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                                int hashCode2 = Long.hashCode(av8Var2.T);
                                aee m2 = av8Var2.m();
                                xtc C2 = fqj.C(av8Var2, c0);
                                av8Var2.h0();
                                if (av8Var2.S) {
                                    av8Var2.q0();
                                } else {
                                    av8Var2.l(zg3Var);
                                }
                                waa.K(av8Var2, a2, f50Var);
                                waa.K(av8Var2, m2, ff3Var);
                                bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                                waa.K(av8Var2, C2, f50Var3);
                                kq9.b(s6a.N(i, ((i18 << 3) & 112) | 6, av8Var2), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var2), av8Var2, 432, 0);
                                goa d = bf3.d(utcVar, 16.0f, av8Var2, 1.0f, true);
                                u23 a3 = t23.a(ww9.f, kv1Var, av8Var2, 6);
                                int hashCode3 = Long.hashCode(av8Var2.T);
                                aee m3 = av8Var2.m();
                                xtc C3 = fqj.C(av8Var2, d);
                                av8Var2.h0();
                                if (av8Var2.S) {
                                    av8Var2.q0();
                                } else {
                                    av8Var2.l(zg3Var);
                                }
                                waa.K(av8Var2, a3, f50Var);
                                waa.K(av8Var2, m3, ff3Var);
                                bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                                waa.K(av8Var2, C3, f50Var3);
                                r9k r9kVar9 = r9kVar;
                                String a4 = r9kVar9.a(av8Var2);
                                yf8 yf8Var = xth.a;
                                udj.c(a4, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var2, 0, 24960, 110586);
                                av8 av8Var3 = av8Var2;
                                if (r9kVar2 != null) {
                                    av8Var3.d0(-81634228);
                                    z9 = false;
                                    av8Var3.s(false);
                                    j2 = j3;
                                } else {
                                    z9 = false;
                                    bf3.r(2.0f, -81634227, av8Var3, av8Var3, utcVar);
                                    udj.c(r9kVar2.a(av8Var3), null, j3, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, (i18 >> 9) & 896, 24960, 110586);
                                    j2 = j3;
                                    av8Var3 = av8Var3;
                                    av8Var3.s(false);
                                }
                                i.o(av8Var3, true, utcVar, 16.0f, av8Var3);
                                if (r9kVar7 != null) {
                                    av8Var3.d0(1430104516);
                                    av8Var3.s(z9);
                                    r9kVar4 = r9kVar7;
                                } else {
                                    av8Var3.d0(1430104517);
                                    r9kVar4 = r9kVar7;
                                    av8 av8Var4 = av8Var3;
                                    udj.c(r9kVar4.a(av8Var3), null, lz.D(R.color.primary_default, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var4, 0, 0, 131066);
                                    av8Var3 = av8Var4;
                                    bf3.u(utcVar, 2.0f, av8Var3, z9);
                                }
                                av8 av8Var5 = av8Var3;
                                kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var3), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var3), av8Var5, 432, 0);
                                av8Var = av8Var5;
                                av8Var.s(true);
                                if (z8) {
                                    av8Var.d0(372474094);
                                    av8Var.s(z9);
                                } else {
                                    bf3.r(8.0f, 372423161, av8Var, av8Var, utcVar);
                                    av8Var.s(z9);
                                }
                                av8Var.s(true);
                                z3 = z7;
                                xtcVar2 = xtcVar3;
                                z4 = z8;
                                r9kVar5 = r9kVar9;
                            } else {
                                z6 = z2;
                            }
                        } else {
                            av8Var2.W();
                            if ((i3 & 32) != 0) {
                                i10 &= -458753;
                            }
                            z5 = z;
                            z6 = z2;
                            r9kVar6 = r9kVar4;
                        }
                        i11 = i10;
                        av8Var2.t();
                        z7 = z5;
                        xtc q2 = n9e.q(xtcVar2, lz.D(R.color.surface_1, av8Var2), oyn.e);
                        p4h p4hVar2 = ww9.d;
                        kv1 kv1Var2 = uxf.o;
                        xtc xtcVar32 = xtcVar2;
                        u23 a5 = t23.a(p4hVar2, kv1Var2, av8Var2, 0);
                        long j32 = j2;
                        int hashCode4 = Long.hashCode(av8Var2.T);
                        aee m4 = av8Var2.m();
                        xtc C4 = fqj.C(av8Var2, q2);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var2.h0();
                        if (av8Var2.S) {
                        }
                        f50 f50Var4 = hf3.g;
                        waa.K(av8Var2, a5, f50Var4);
                        ff3 ff3Var2 = hf3.f;
                        waa.K(av8Var2, m4, ff3Var2);
                        Integer valueOf2 = Integer.valueOf(hashCode4);
                        f50 f50Var22 = hf3.j;
                        waa.K(av8Var2, valueOf2, f50Var22);
                        ry ryVar2 = hf3.k;
                        waa.J(av8Var2, ryVar2);
                        f50 f50Var32 = hf3.d;
                        waa.K(av8Var2, C4, f50Var32);
                        if (z7) {
                        }
                        long D2 = lz.D(R.color.n_lv_4, av8Var2);
                        O = av8Var2.O();
                        a99Var = nf3.a;
                        if (O == a99Var) {
                        }
                        wzc wzcVar2 = (wzc) O;
                        int i182 = i11;
                        Object[] objArr2 = new Object[0];
                        O2 = av8Var2.O();
                        if (O2 == a99Var) {
                        }
                        xtc c02 = l98.c0(tol.y(utcVar, true, true, true, D2, wzcVar2, new p28(function0, (boh) o3a.N(objArr2, (Function0) O2, av8Var2, 48), 17), av8Var2, 0), 16.0f, 12.0f);
                        r9kVar7 = r9kVar6;
                        l8g a22 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                        int hashCode22 = Long.hashCode(av8Var2.T);
                        aee m22 = av8Var2.m();
                        xtc C22 = fqj.C(av8Var2, c02);
                        av8Var2.h0();
                        if (av8Var2.S) {
                        }
                        waa.K(av8Var2, a22, f50Var4);
                        waa.K(av8Var2, m22, ff3Var2);
                        bf3.s(hashCode22, av8Var2, f50Var22, av8Var2, ryVar2);
                        waa.K(av8Var2, C22, f50Var32);
                        kq9.b(s6a.N(i, ((i182 << 3) & 112) | 6, av8Var2), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var2), av8Var2, 432, 0);
                        goa d2 = bf3.d(utcVar, 16.0f, av8Var2, 1.0f, true);
                        u23 a32 = t23.a(ww9.f, kv1Var2, av8Var2, 6);
                        int hashCode32 = Long.hashCode(av8Var2.T);
                        aee m32 = av8Var2.m();
                        xtc C32 = fqj.C(av8Var2, d2);
                        av8Var2.h0();
                        if (av8Var2.S) {
                        }
                        waa.K(av8Var2, a32, f50Var4);
                        waa.K(av8Var2, m32, ff3Var2);
                        bf3.s(hashCode32, av8Var2, f50Var22, av8Var2, ryVar2);
                        waa.K(av8Var2, C32, f50Var32);
                        r9k r9kVar92 = r9kVar;
                        String a42 = r9kVar92.a(av8Var2);
                        yf8 yf8Var2 = xth.a;
                        udj.c(a42, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var2, 0, 24960, 110586);
                        av8 av8Var32 = av8Var2;
                        if (r9kVar2 != null) {
                        }
                        i.o(av8Var32, true, utcVar, 16.0f, av8Var32);
                        if (r9kVar7 != null) {
                        }
                        av8 av8Var52 = av8Var32;
                        kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var32), null, bkh.l(utcVar, 16.0f), lz.D(R.color.primary_default, av8Var32), av8Var52, 432, 0);
                        av8Var = av8Var52;
                        av8Var.s(true);
                        if (z8) {
                        }
                        av8Var.s(true);
                        z3 = z7;
                        xtcVar2 = xtcVar32;
                        z4 = z8;
                        r9kVar5 = r9kVar92;
                    } else {
                        av8Var = av8Var2;
                        av8Var.W();
                        z3 = z;
                        z4 = z2;
                        r9kVar5 = r9kVar8;
                    }
                    u = av8Var.u();
                    if (u != null) {
                        final xtc xtcVar4 = xtcVar2;
                        final long j4 = j2;
                        final boolean z10 = z3;
                        final r9k r9kVar10 = r9kVar4;
                        u.d = new Function2() { // from class: bhd
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                ehd.f(i, r9kVar5, function0, xtcVar4, r9kVar2, j4, r9kVar10, z10, z4, (of3) obj, aba.K(i2 | 1), i3);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i9 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
                if (i9 != 0) {
                }
                if (av8Var2.T(i10 & 1, (i10 & 38347923) != 38347922)) {
                }
                u = av8Var.u();
                if (u != null) {
                }
            }
        } else {
            j2 = j;
        }
        i5 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
        int i152 = i14 | i5;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i3 & NotificationCompat.FLAG_LOCAL_ONLY;
        if (i9 != 0) {
        }
        if (av8Var2.T(i10 & 1, (i10 & 38347923) != 38347922)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final boolean g(String str) {
        return CollectionsKt.R(Sports.INSTANCE.getEntries(), str) || Intrinsics.c(str, SearchResponseKt.PLAYER_ENTITY);
    }
}
