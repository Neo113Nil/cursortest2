package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class xdd {
    public static final h0d a;

    static {
        h0d h0dVar = vjd.a;
        a = new h0d();
    }

    public static final void a(wtc wtcVar, int i, int i2) {
        if (!(wtcVar instanceof bw4)) {
            b(wtcVar, i & wtcVar.c, i2);
            return;
        }
        bw4 bw4Var = (bw4) wtcVar;
        int i3 = bw4Var.o;
        b(wtcVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (wtc wtcVar2 = bw4Var.p; wtcVar2 != null; wtcVar2 = wtcVar2.f) {
            a(wtcVar2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(wtc wtcVar, int i, int i2) {
        if (i2 != 0 || wtcVar.Z0()) {
            if ((i & 2) != 0 && (wtcVar instanceof oma)) {
                y6a.E((oma) wtcVar);
                if (i2 == 2) {
                    c6o.a0(wtcVar, 2).q1();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                c6o.c0(wtcVar).E();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                c6o.c0(wtcVar).U(false);
            }
            if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && (wtcVar instanceof a09)) {
                if (i2 == 1) {
                    wma c0 = c6o.c0(wtcVar);
                    c0.b0(c0.P + 1);
                } else if (i2 == 2) {
                    c6o.c0(wtcVar).b0(r0.P - 1);
                }
                if (i2 != 2) {
                    wma c02 = c6o.c0(wtcVar);
                    if (c02.P != 0 && !c02.q() && !c02.r() && !c02.O) {
                        xy xyVar = (xy) zma.a(c02);
                        k1d k1dVar = (k1d) xyVar.W.f;
                        if (c02.P > 0) {
                            ((i1d) k1dVar.b).b(c02);
                            c02.O = true;
                        }
                        xyVar.K(null);
                    }
                }
            }
            if ((i & 4) != 0 && (wtcVar instanceof ga5)) {
                n9e.E((ga5) wtcVar);
            }
            if ((i & 8) != 0 && (wtcVar instanceof p3h)) {
                c6o.c0(wtcVar).r = true;
            }
            if ((i & 64) != 0 && (wtcVar instanceof d9e)) {
                ana anaVar = c6o.c0((d9e) wtcVar).G;
                anaVar.p.r = true;
                zkb zkbVar = anaVar.q;
                if (zkbVar != null) {
                    zkbVar.x = true;
                }
            }
            if ((i & a.o) != 0 && (wtcVar instanceof be8)) {
                be8 be8Var = (be8) wtcVar;
                cj2.b = null;
                be8Var.I(cj2.a);
                if (cj2.b != null) {
                    wtc wtcVar2 = (wtc) be8Var;
                    if (!wtcVar2.a.n) {
                        r3a.b("visitChildren called on an unattached node");
                    }
                    i1d i1dVar = new i1d(new wtc[16], 0);
                    wtc wtcVar3 = wtcVar2.a;
                    wtc wtcVar4 = wtcVar3.f;
                    if (wtcVar4 == null) {
                        c6o.x(i1dVar, wtcVar3);
                    } else {
                        i1dVar.b(wtcVar4);
                    }
                    while (true) {
                        int i3 = i1dVar.c;
                        if (i3 == 0) {
                            break;
                        }
                        wtc wtcVar5 = (wtc) i1dVar.r(i3 - 1);
                        if ((wtcVar5.d & 1024) == 0) {
                            c6o.x(i1dVar, wtcVar5);
                        } else {
                            while (true) {
                                if (wtcVar5 == null) {
                                    break;
                                }
                                if ((wtcVar5.c & 1024) != 0) {
                                    i1d i1dVar2 = null;
                                    while (wtcVar5 != null) {
                                        if (wtcVar5 instanceof ne8) {
                                            ne8 ne8Var = (ne8) wtcVar5;
                                            ud8 ud8Var = ((yd8) ((xy) c6o.d0(ne8Var)).getFocusOwner()).d;
                                            if (ud8Var.c.a(ne8Var)) {
                                                ud8Var.a();
                                            }
                                        } else if ((wtcVar5.c & 1024) != 0 && (wtcVar5 instanceof bw4)) {
                                            int i4 = 0;
                                            for (wtc wtcVar6 = ((bw4) wtcVar5).p; wtcVar6 != null; wtcVar6 = wtcVar6.f) {
                                                if ((wtcVar6.c & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        wtcVar5 = wtcVar6;
                                                    } else {
                                                        if (i1dVar2 == null) {
                                                            i1dVar2 = new i1d(new wtc[16], 0);
                                                        }
                                                        if (wtcVar5 != null) {
                                                            i1dVar2.b(wtcVar5);
                                                            wtcVar5 = null;
                                                        }
                                                        i1dVar2.b(wtcVar6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        wtcVar5 = c6o.X(i1dVar2);
                                    }
                                } else {
                                    wtcVar5 = wtcVar5.f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (wtcVar instanceof nd8)) {
                nd8 nd8Var = (nd8) wtcVar;
                ud8 ud8Var2 = ((yd8) ((xy) c6o.d0(nd8Var)).getFocusOwner()).d;
                if (ud8Var2.d.a(nd8Var)) {
                    ud8Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (wtcVar instanceof a2a) && i2 == 2) {
                ((a2a) wtcVar).K0();
            }
        }
    }

    public static final void c(wtc wtcVar) {
        if (!wtcVar.n) {
            r3a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(wtcVar, -1, 0);
    }

    public static final int d(vtc vtcVar) {
        int i = vtcVar instanceof mma ? 3 : 1;
        if (vtcVar instanceof fa5) {
            i |= 4;
        }
        if (vtcVar instanceof n3h) {
            i |= 8;
        }
        if (vtcVar instanceof tze) {
            i |= 16;
        }
        if (vtcVar instanceof cbj) {
            i |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (vtcVar instanceof c9e) {
            i |= 64;
        }
        return vtcVar instanceof p32 ? 524288 | i : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int e(wtc wtcVar) {
        int i;
        int i2 = wtcVar.c;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = wtcVar.getClass();
        h0d h0dVar = a;
        int d = h0dVar.d(cls);
        if (d >= 0) {
            return h0dVar.c[d];
        }
        int i3 = wtcVar instanceof oma ? 3 : 1;
        if (wtcVar instanceof ga5) {
            i3 |= 4;
        }
        if (wtcVar instanceof p3h) {
            i3 |= 8;
        }
        if (wtcVar instanceof pze) {
            i3 |= 16;
        }
        if (wtcVar instanceof ztc) {
            i3 |= 32;
        }
        if (wtcVar instanceof d9e) {
            i3 |= 64;
        }
        if (wtcVar instanceof lqd) {
            i = 4194304;
        } else {
            if (!(wtcVar instanceof ula)) {
                if (wtcVar instanceof o1c) {
                    i3 |= 128;
                }
                if (wtcVar instanceof a09) {
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                }
                if (wtcVar instanceof ne8) {
                    i3 |= 1024;
                }
                if (wtcVar instanceof be8) {
                    i3 |= a.o;
                }
                if (wtcVar instanceof nd8) {
                    i3 |= 4096;
                }
                if (wtcVar instanceof wia) {
                    i3 |= 8192;
                }
                if (wtcVar instanceof ky) {
                    i3 |= 16384;
                }
                if (wtcVar instanceof ug3) {
                    i3 |= 32768;
                }
                if (wtcVar instanceof jyj) {
                    i3 |= 262144;
                }
                if (wtcVar instanceof p32) {
                    i3 |= 524288;
                }
                if (wtcVar instanceof zqd) {
                    i3 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                }
                if (wtcVar instanceof a2a) {
                    i3 |= 2097152;
                }
                if (wtcVar instanceof gqa) {
                    i3 |= 8388608;
                }
                h0dVar.g(i3, cls);
                return i3;
            }
            i = 4194432;
        }
        i3 |= i;
        if (wtcVar instanceof a09) {
        }
        if (wtcVar instanceof ne8) {
        }
        if (wtcVar instanceof be8) {
        }
        if (wtcVar instanceof nd8) {
        }
        if (wtcVar instanceof wia) {
        }
        if (wtcVar instanceof ky) {
        }
        if (wtcVar instanceof ug3) {
        }
        if (wtcVar instanceof jyj) {
        }
        if (wtcVar instanceof p32) {
        }
        if (wtcVar instanceof zqd) {
        }
        if (wtcVar instanceof a2a) {
        }
        if (wtcVar instanceof gqa) {
        }
        h0dVar.g(i3, cls);
        return i3;
    }

    public static final int f(wtc wtcVar) {
        if (!(wtcVar instanceof bw4)) {
            return e(wtcVar);
        }
        bw4 bw4Var = (bw4) wtcVar;
        int i = bw4Var.o;
        for (wtc wtcVar2 = bw4Var.p; wtcVar2 != null; wtcVar2 = wtcVar2.f) {
            i |= f(wtcVar2);
        }
        return i;
    }

    public static final boolean g(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }
}
