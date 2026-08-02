package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class m9b {
    static {
        ypa.a(ysa.c, new ila(24));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        if (r13 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d2, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
    
        r0 = defpackage.xth.a;
        defpackage.udj.c(r7, null, defpackage.lz.D(com.sofascore.results.R.color.n_lv_1, r11), null, 0, null, 0, null, null, 0, 0, false, 0, 0, null, defpackage.xth.e(), r11, 0, 0, 131066);
        r11 = r11;
        r11.s(false);
        r0 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00de, code lost:
    
        if (r13 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e7, code lost:
    
        if (r13 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f0, code lost:
    
        if (r13 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f9, code lost:
    
        if (r13 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r8b r8bVar, bnf bnfVar, k9b k9bVar, q9b q9bVar, of3 of3Var, int i) {
        int i2;
        x9b x9bVar;
        int ordinal;
        boolean z;
        String str;
        boolean showTestRating;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(547787713);
        if ((i & 6) == 0) {
            i2 = (av8Var.e(r8bVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.e(bnfVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(k9bVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(q9bVar) ? a.o : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) av8Var.k(f5a.a)).booleanValue();
            Object O = av8Var.O();
            if (O == nf3.a) {
                if (booleanValue) {
                    showTestRating = true;
                } else {
                    ia0 ia0Var = ia0.q;
                    showTestRating = ok3.p().e().getShowTestRating();
                }
                O = Boolean.valueOf(showTestRating);
                av8Var.n0(O);
            }
            boolean booleanValue2 = ((Boolean) O).booleanValue();
            int ordinal2 = r8bVar.ordinal();
            utc utcVar = utc.a;
            if (ordinal2 == 0) {
                av8Var.d0(-1731425896);
                int ordinal3 = bnfVar.ordinal();
                if (ordinal3 == 1) {
                    if (q9bVar != null) {
                        x9bVar = q9bVar.b;
                        ordinal = bnfVar.ordinal();
                        if (ordinal != 0) {
                        }
                        av8Var.s(false);
                    }
                    x9bVar = null;
                    ordinal = bnfVar.ordinal();
                    if (ordinal != 0) {
                    }
                    av8Var.s(false);
                } else if (ordinal3 == 2) {
                    if (q9bVar != null) {
                        x9bVar = q9bVar.c;
                        ordinal = bnfVar.ordinal();
                        if (ordinal != 0) {
                        }
                        av8Var.s(false);
                    }
                    x9bVar = null;
                    ordinal = bnfVar.ordinal();
                    if (ordinal != 0) {
                    }
                    av8Var.s(false);
                } else if (ordinal3 == 3) {
                    if (q9bVar != null) {
                        x9bVar = q9bVar.d;
                        ordinal = bnfVar.ordinal();
                        if (ordinal != 0) {
                        }
                        av8Var.s(false);
                    }
                    x9bVar = null;
                    ordinal = bnfVar.ordinal();
                    if (ordinal != 0) {
                    }
                    av8Var.s(false);
                } else if (ordinal3 != 4) {
                    if (ordinal3 == 5 && q9bVar != null) {
                        x9bVar = q9bVar.f;
                        ordinal = bnfVar.ordinal();
                        if (ordinal != 0) {
                            av8Var.d0(-1730217702);
                            if (k9bVar == null) {
                                av8Var.d0(-1730217703);
                                av8Var.s(false);
                            } else {
                                Double d = k9bVar.e;
                                av8Var.d0(-1730217702);
                                l8g a = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
                                int hashCode = Long.hashCode(av8Var.T);
                                aee m = av8Var.m();
                                xtc C = fqj.C(av8Var, utcVar);
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
                                if (k9bVar.a) {
                                    av8Var.d0(828630718);
                                    z = true;
                                    boolean z2 = k9bVar.d;
                                    i9a.j(z2 ? k9bVar.c : k9bVar.b, z2, false, null, false, true, null, av8Var, 196992, 88);
                                    av8Var = av8Var;
                                    av8Var.s(false);
                                } else {
                                    z = true;
                                    av8Var.d0(829026650);
                                    av8Var.s(false);
                                }
                                if (!booleanValue2 || d == null) {
                                    av8Var.d0(829414522);
                                    av8Var.s(false);
                                } else {
                                    av8Var.d0(829139831);
                                    String valueOf = String.valueOf(d.doubleValue());
                                    yf8 yf8Var = xth.a;
                                    av8 av8Var2 = av8Var;
                                    udj.c(valueOf, null, kpg.x(d.doubleValue(), av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.n(), av8Var2, 0, 0, 131066);
                                    av8Var = av8Var2;
                                    av8Var.s(false);
                                }
                                av8Var.s(z);
                                av8Var.s(false);
                            }
                            av8Var.s(false);
                        } else {
                            if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5) {
                                throw dmi.h(av8Var, -1856949672, false);
                            }
                            av8Var.d0(-1730578046);
                            if (x9bVar == null) {
                                av8Var.d0(-1730578047);
                                av8Var.s(false);
                            } else {
                                av8Var.d0(-1730578046);
                                g(x9bVar, Intrinsics.c(q9bVar != null ? Boolean.valueOf(q9bVar.a) : null, Boolean.TRUE), av8Var, 0);
                                av8Var.s(false);
                            }
                            av8Var.s(false);
                        }
                        av8Var.s(false);
                    }
                    x9bVar = null;
                    ordinal = bnfVar.ordinal();
                    if (ordinal != 0) {
                    }
                    av8Var.s(false);
                } else {
                    if (q9bVar != null) {
                        x9bVar = q9bVar.e;
                        ordinal = bnfVar.ordinal();
                        if (ordinal != 0) {
                        }
                        av8Var.s(false);
                    }
                    x9bVar = null;
                    ordinal = bnfVar.ordinal();
                    if (ordinal != 0) {
                    }
                    av8Var.s(false);
                }
            } else if (ordinal2 == 3) {
                av8Var.d0(-1729089550);
                Integer num = k9bVar != null ? k9bVar.f : null;
                if (num == null) {
                    av8Var.d0(-1729089551);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1729089550);
                    td4.G(num.intValue(), bkh.l(utcVar, 24.0f), false, 0L, av8Var, 48, 12);
                    av8Var = av8Var;
                    av8Var.s(false);
                }
                av8Var.s(false);
            } else if (ordinal2 != 4) {
                av8Var.d0(-1728705553);
                int ordinal4 = r8bVar.ordinal();
                String str2 = "-";
                if (ordinal4 == 1) {
                    str = k9bVar != null ? k9bVar.h : null;
                    Regex regex = yid.a;
                } else if (ordinal4 == 2) {
                    str = k9bVar != null ? k9bVar.k : null;
                    Regex regex2 = yid.a;
                } else if (ordinal4 == 5) {
                    str = k9bVar != null ? k9bVar.g : null;
                    Regex regex3 = yid.a;
                } else if (ordinal4 == 6) {
                    str = k9bVar != null ? k9bVar.i : null;
                    Regex regex4 = yid.a;
                } else if (ordinal4 != 7) {
                    zzl.b();
                    return;
                } else {
                    str = k9bVar != null ? k9bVar.j : null;
                    Regex regex5 = yid.a;
                }
            } else {
                av8Var.d0(-1728885942);
                String str3 = k9bVar != null ? k9bVar.l : null;
                if (str3 == null) {
                    av8Var.d0(-1728885943);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1728885942);
                    td4.k(str3, bkh.l(utcVar, 24.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, 48, 12);
                    av8Var.s(false);
                }
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bk1(i, 21, r8bVar, bnfVar, k9bVar, q9bVar);
        }
    }

    public static final void b(n9b n9bVar, of3 of3Var, int i) {
        long j;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-170336653);
        int i2 = i | (av8Var.g(n9bVar) ? 4 : 2);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            l8g a = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc l = bkh.l(utcVar, 16.0f);
            int i3 = n9bVar.b;
            r9k r9kVar = n9bVar.e;
            int i4 = n9bVar.c;
            ImageVector N = s6a.N(i3, 6, av8Var);
            if (n9bVar.d) {
                j = ljg.f(av8Var, 721055833, i4, av8Var, false);
            } else {
                av8Var.d0(721057282);
                av8Var.s(false);
                j = r13.i;
            }
            kq9.b(N, null, l, j, av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            String a2 = n9bVar.a.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, null, lz.D(i4, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            if (r9kVar == null) {
                av8Var.d0(878333614);
                av8Var.s(false);
            } else {
                ljg.r(8.0f, 878333615, av8Var, av8Var, utcVar);
                udj.c(r9kVar.a(av8Var), new goa(1.0f, false), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110584);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new faa(n9bVar, i, 16);
        }
    }

    public static final void c(p9b p9bVar, Function0 function0, xtc xtcVar, r8b r8bVar, bnf bnfVar, of3 of3Var, int i, int i2) {
        int i3;
        int i4;
        av8 av8Var;
        r8b r8bVar2;
        bnf bnfVar2;
        utc utcVar;
        utc utcVar2;
        r8b r8bVar3;
        bnf bnfVar3;
        float f;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1733339262);
        int i5 = i | (av8Var2.g(p9bVar) ? 4 : 2) | (av8Var2.i(function0) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
        } else {
            i3 = i5 | (av8Var2.e(r8bVar == null ? -1 : r8bVar.ordinal()) ? a.o : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
        } else {
            i4 = i3 | (av8Var2.e(bnfVar != null ? bnfVar.ordinal() : -1) ? 16384 : 8192);
        }
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            r8b r8bVar4 = i6 != 0 ? null : r8bVar;
            bnf bnfVar4 = i7 != 0 ? null : bnfVar;
            long D = lz.D(R.color.n_lv_4, av8Var2);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = jxa.i;
                av8Var2.n0(O2);
            }
            p28 p28Var = new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var2, 48), 12);
            av8Var = av8Var2;
            xtc y = tol.y(xtcVar, true, true, true, D, wzcVar, p28Var, av8Var, 0);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a = t23.a(p4hVar, kv1Var, av8Var, 0);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar3 = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar3, 1.0f), 16.0f, 8.0f);
            int i8 = i4;
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i9 = p9bVar.a;
            gv9 gv9Var = p9bVar.f;
            String str = p9bVar.j;
            n9b n9bVar = p9bVar.i;
            boolean z = p9bVar.d;
            k9b k9bVar = p9bVar.g;
            e(i9, z, k9bVar != null ? k9bVar.b : null, av8Var, 0);
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            d(p9bVar.b, p9bVar.c, p9bVar.e, av8Var, 0);
            if (str != null) {
                utcVar = utcVar3;
                bf3.r(4.0f, 1588424670, av8Var, av8Var, utcVar);
                f(str, av8Var, 0);
                av8Var.s(false);
            } else {
                utcVar = utcVar3;
                av8Var.d0(1588538068);
                av8Var.s(false);
            }
            if (gv9Var.isEmpty() && n9bVar == null) {
                av8Var.d0(1588687860);
                av8Var.s(false);
            } else {
                bf3.r(4.0f, 1588621551, av8Var, av8Var, utcVar);
                av8Var.s(false);
            }
            if (n9bVar != null) {
                av8Var.d0(1588736530);
                b(n9bVar, av8Var, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(1588811116);
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    j((o9b) it.next(), av8Var, 0);
                }
                av8Var.s(false);
            }
            av8Var.s(true);
            if (!p9bVar.k || r8bVar4 == null || bnfVar4 == null) {
                utcVar2 = utcVar;
                r8bVar3 = r8bVar4;
                bnfVar3 = bnfVar4;
                f = 16.0f;
                av8Var.d0(-464696086);
                av8Var.s(false);
            } else {
                av8Var.d0(-464974776);
                k9b k9bVar2 = p9bVar.g;
                q9b q9bVar = p9bVar.h;
                int i10 = (i8 >> 9) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                utcVar2 = utcVar;
                r8b r8bVar5 = r8bVar4;
                bnf bnfVar5 = bnfVar4;
                f = 16.0f;
                a(r8bVar5, bnfVar5, k9bVar2, q9bVar, av8Var, i10);
                r8bVar3 = r8bVar5;
                bnfVar3 = bnfVar5;
                av8Var.s(false);
            }
            av8Var.s(true);
            if (p9bVar.l) {
                av8Var.d0(432004217);
                td4.w(l98.f0(utcVar2, 72.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lz.D(R.color.n_lv_4, av8Var), av8Var, 6, 2);
                av8Var.s(false);
            } else {
                av8Var.d0(432116654);
                av8Var.s(false);
            }
            av8Var.s(true);
            bnfVar2 = bnfVar3;
            r8bVar2 = r8bVar3;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            r8bVar2 = r8bVar;
            bnfVar2 = bnfVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(p9bVar, function0, xtcVar, r8bVar2, bnfVar2, i, i2);
        }
    }

    public static final void d(String str, String str2, gv9 gv9Var, of3 of3Var, int i) {
        gv9 gv9Var2;
        av8 av8Var;
        int i2;
        ry ryVar;
        f50 f50Var;
        utc utcVar;
        zg3 zg3Var;
        f50 f50Var2;
        f50 f50Var3;
        ff3 ff3Var;
        lv1 lv1Var;
        av8 av8Var2;
        boolean z;
        boolean z2;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(866655285);
        int i3 = i | (av8Var3.g(str) ? 4 : 2) | (av8Var3.g(str2) ? 32 : 16) | (av8Var3.g(gv9Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var3.T(i3 & 1, (i3 & 147) != 146)) {
            lv1 lv1Var2 = uxf.m;
            l8g a = k8g.a(new ng0(4.0f, true, new a70(6)), lv1Var2, av8Var3, 54);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            utc utcVar2 = utc.a;
            xtc C = fqj.C(av8Var3, utcVar2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var3, a, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var3, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var3, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var3, C, f50Var6);
            if (str2 == null) {
                av8Var3.d0(1335917028);
                av8Var3.s(false);
                av8Var2 = av8Var3;
                i2 = i3;
                lv1Var = lv1Var2;
                ff3Var = ff3Var2;
                z = false;
                ryVar = ryVar2;
                f50Var = f50Var5;
                utcVar = utcVar2;
                zg3Var = zg3Var2;
                f50Var2 = f50Var4;
                f50Var3 = f50Var6;
            } else {
                av8Var3.d0(1335917029);
                yf8 yf8Var = xth.a;
                i2 = i3;
                ryVar = ryVar2;
                f50Var = f50Var5;
                utcVar = utcVar2;
                zg3Var = zg3Var2;
                f50Var2 = f50Var4;
                f50Var3 = f50Var6;
                ff3Var = ff3Var2;
                lv1Var = lv1Var2;
                udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var3, (i3 >> 3) & 14, 0, 131066);
                av8Var2 = av8Var3;
                z = false;
                av8Var2.s(false);
            }
            goa goaVar = new goa(1.0f, z);
            yf8 yf8Var2 = xth.a;
            av8 av8Var4 = av8Var2;
            udj.c(str, goaVar, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var4, i2 & 14, 24960, 110584);
            av8Var = av8Var4;
            if (gv9Var.isEmpty()) {
                gv9Var2 = gv9Var;
                z2 = true;
                av8Var.d0(1336620977);
                av8Var.s(false);
            } else {
                av8Var.d0(1336385532);
                l8g a2 = k8g.a(ww9.b, lv1Var, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, f50Var2);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var, av8Var, ryVar);
                gv9Var2 = gv9Var;
                Iterator p = ljg.p(av8Var, C2, f50Var3, -216236145, gv9Var2);
                while (p.hasNext()) {
                    fcp.U((f9b) p.next(), null, av8Var, 0);
                }
                z2 = true;
                ljg.t(av8Var, false, true, false);
            }
            av8Var.s(z2);
        } else {
            gv9Var2 = gv9Var;
            av8Var = av8Var3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(str, str2, gv9Var2, i, 27);
        }
    }

    public static final void e(int i, boolean z, Double d, of3 of3Var, int i2) {
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1878490091);
        int i3 = (av8Var.e(i) ? 4 : 2) | i2 | (av8Var.h(z) ? 32 : 16) | (av8Var.g(d) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.C(i, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i3 & 14) | 48, 12);
            if (z) {
                av8Var.d0(-665480027);
                z2 = true;
                c5n.c(16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 384, 24, kpg.x(yid.k(d), av8Var), 0L, av8Var, n12.a.a(utcVar, uxf.i));
                av8Var.s(false);
            } else {
                z2 = true;
                av8Var.d0(-665253231);
                av8Var.s(false);
            }
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new l9b(i, z, d, i2);
        }
    }

    public static final void f(String str, of3 of3Var, int i) {
        av8 av8Var;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1684376446);
        int i2 = i | (av8Var2.g(str) ? 4 : 2);
        if (av8Var2.T(i2 & 1, (i2 & 3) != 2)) {
            yf8 yf8Var = xth.a;
            av8Var = av8Var2;
            udj.c(str, null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, i2 & 14, 24960, 110586);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tk1(str, i, 8);
        }
    }

    public static final void g(x9b x9bVar, boolean z, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1510909798);
        int i2 = (av8Var.g(x9bVar) ? 4 : 2) | i | (av8Var.h(z) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc p = bkh.p(utcVar, 58.0f);
            u23 a = t23.a(ww9.d, uxf.q, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, p);
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
            t9b t9bVar = x9bVar.b;
            if (t9bVar == null) {
                av8Var.d0(1669498312);
                av8Var.s(false);
            } else {
                av8Var.d0(1669498313);
                h(t9bVar, av8Var, 0);
                av8Var.s(false);
            }
            t9b t9bVar2 = x9bVar.c;
            if (t9bVar2 == null) {
                av8Var.d0(1669615368);
                av8Var.s(false);
            } else {
                av8Var.d0(1669615369);
                h(t9bVar2, av8Var, 0);
                av8Var.s(false);
            }
            if (z) {
                av8Var.d0(1669723621);
                i(x9bVar.a, bkh.d(bkh.e(utcVar, 8.0f), 1.0f), av8Var, 48);
                av8Var.s(false);
            } else {
                av8Var.d0(1669951378);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new m81(i, 9, x9bVar, z);
        }
    }

    public static final void h(t9b t9bVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1954177693);
        int i2 = i | (av8Var.g(t9bVar) ? 4 : 2);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            l8g a = k8g.a(new ng0(2.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, utc.a);
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
            goa g = ljg.g(av8Var, C, hf3.d, 1.0f, false);
            String v = oea.v(t9bVar.a, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, g, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110584);
            String str = t9bVar.b;
            Regex regex = yid.a;
            if (str == null) {
                str = "-";
            }
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new faa(t9bVar, i, 17);
        }
    }

    public static final void i(Double d, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        r13 e;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(673782883);
        int i3 = (av8Var.g(d) ? 4 : 2) | i;
        boolean z = true;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            if (av8Var.k(dh3.n) != ema.b) {
                z = false;
            }
            float H0 = kx4Var.H0(1.0f);
            float H02 = kx4Var.H0(4.0f);
            long D = lz.D(R.color.surface_2, av8Var);
            boolean z2 = z;
            cdi b = a60.b(d != null ? (float) d.doubleValue() : -1.0f, null, null, av8Var, 0, 30);
            if (d == null) {
                av8Var.d0(-2010721289);
                av8Var.s(false);
                e = null;
            } else {
                av8Var.d0(-2010721288);
                double doubleValue = d.doubleValue();
                e = vxd.e(av8Var, false, lz.D(doubleValue < -0.5d ? R.color.rating_10 : doubleValue < 0.0d ? R.color.rating_60 : doubleValue < 0.25d ? R.color.rating_65 : doubleValue < 0.5d ? R.color.rating_70 : doubleValue < 0.75d ? R.color.rating_80 : R.color.rating_90, av8Var));
            }
            cdi a = wih.a(e != null ? e.a : r13.h, null, null, av8Var, 0, 14);
            av8Var = av8Var;
            boolean f = av8Var.f(D) | ((i3 & 14) == 4) | av8Var.g(b) | av8Var.d(H0) | av8Var.d(H02) | av8Var.h(z2) | av8Var.g(a);
            Object O = av8Var.O();
            if (f || O == nf3.a) {
                i2 = 2;
                xe7 xe7Var = new xe7(D, d, H0, H02, z2, b, a);
                av8Var.n0(xe7Var);
                O = xe7Var;
            } else {
                i2 = 2;
            }
            lz.d(6, av8Var, xtcVar, (Function1) O);
        } else {
            i2 = 2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nw6(d, xtcVar, i, i2);
        }
    }

    public static final void j(o9b o9bVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(353265075);
        int i2 = i | (av8Var.g(o9bVar) ? 4 : 2);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            l8g a = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
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
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc l = bkh.l(utcVar, 16.0f);
            boolean z = o9bVar.c;
            kq9.b(s6a.N(z ? R.drawable.ic_transfer_in_16 : o9bVar.d ? R.drawable.ic_swap_injured_16 : R.drawable.ic_transfer_out_16, 6, av8Var), null, l, z ? ljg.f(av8Var, 176250851, R.color.success, av8Var, false) : ljg.f(av8Var, 176251425, R.color.error, av8Var, false), av8Var, 432, 0);
            String str = o9bVar.a;
            yf8 yf8Var = xth.a;
            udj.c(str, null, z ? ljg.f(av8Var, 176258691, R.color.success, av8Var, false) : ljg.f(av8Var, 176259265, R.color.error, av8Var, false), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            udj.c(o9bVar.b, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new faa(o9bVar, i, 15);
        }
    }
}
