package com.google.android.gms.internal.ads;

import android.util.Base64;
import defpackage.g2p;
import java.util.HashMap;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzpy implements zzqh {
    public static final Random h = new Random();
    public final zzbe a;
    public final zzbd b;
    public final HashMap c;
    public zzqf d;
    public zzbf e;
    public String f;
    public long g;

    public zzpy(int i) {
        this.a = new zzbe();
        this.b = new zzbd();
        this.c = new HashMap();
        this.e = zzbf.a;
        this.g = -1L;
    }

    public final synchronized String a(zzbf zzbfVar, zzxo zzxoVar) {
        return e(zzbfVar.o(zzxoVar.a, this.b).c, zzxoVar).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r6 < r10) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(zznr zznrVar) {
        long j;
        long t = zzfm.t(0L);
        synchronized (this) {
            try {
                if (this.d == null) {
                    throw null;
                }
                zzbf zzbfVar = zznrVar.b;
                if (!zzbfVar.g()) {
                    zzxo zzxoVar = zznrVar.d;
                    if (zzxoVar != null) {
                        long j2 = zzxoVar.d;
                        if (j2 != -1) {
                            g2p g2pVar = (g2p) this.c.get(this.f);
                            if (g2pVar != null) {
                                j = g2pVar.c;
                                if (j != -1) {
                                }
                            }
                            j = this.g + 1;
                        }
                        g2p g2pVar2 = (g2p) this.c.get(this.f);
                        if (g2pVar2 != null) {
                            if (g2pVar2.c == -1) {
                                if (g2pVar2.b == zznrVar.c) {
                                }
                            }
                        }
                    }
                    int i = zznrVar.c;
                    g2p e = e(i, zzxoVar);
                    if (this.f == null) {
                        this.f = e.a;
                    }
                    if (zzxoVar != null && zzxoVar.b()) {
                        Object obj = zzxoVar.a;
                        long j3 = zzxoVar.d;
                        int i2 = zzxoVar.b;
                        g2p e2 = e(i, new zzxo(obj, j3, i2));
                        if (!e2.e) {
                            e2.e = true;
                            zzbd zzbdVar = this.b;
                            zzbfVar.o(obj, zzbdVar);
                            zzbdVar.f.a(i2).getClass();
                            Math.max(0L, t + t);
                        }
                    }
                    if (!e.e) {
                        e.e = true;
                    }
                    if (e.a.equals(this.f) && !e.f) {
                        e.f = true;
                        this.d.r(zznrVar, e.a);
                    }
                }
            } finally {
            }
        }
    }

    public final void c(zznr zznrVar) {
        zzxo zzxoVar;
        boolean g = zznrVar.b.g();
        String str = this.f;
        HashMap hashMap = this.c;
        if (g) {
            if (str != null) {
                g2p g2pVar = (g2p) hashMap.get(str);
                g2pVar.getClass();
                d(g2pVar);
                return;
            }
            return;
        }
        g2p g2pVar2 = (g2p) hashMap.get(str);
        int i = zznrVar.c;
        zzxo zzxoVar2 = zznrVar.d;
        this.f = e(i, zzxoVar2).a;
        b(zznrVar);
        if (zzxoVar2 != null) {
            long j = zzxoVar2.d;
            if (zzxoVar2.b()) {
                if (g2pVar2 != null && g2pVar2.c == j && (zzxoVar = g2pVar2.d) != null) {
                    if (zzxoVar.b == zzxoVar2.b) {
                        if (zzxoVar.c == zzxoVar2.c) {
                            return;
                        }
                    }
                }
                e(i, new zzxo(zzxoVar2.a, j));
            }
        }
    }

    public final void d(g2p g2pVar) {
        long j = g2pVar.c;
        if (j != -1 && g2pVar.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g2p e(int i, zzxo zzxoVar) {
        long j;
        long j2;
        long j3;
        HashMap hashMap = this.c;
        long j4 = Long.MAX_VALUE;
        g2p g2pVar = null;
        for (g2p g2pVar2 : hashMap.values()) {
            long j5 = g2pVar2.c;
            zzxo zzxoVar2 = g2pVar2.d;
            if (j5 == -1 && i == g2pVar2.b && zzxoVar != null) {
                zzpy zzpyVar = g2pVar2.g;
                long j6 = zzxoVar.d;
                j = -1;
                g2p g2pVar3 = (g2p) zzpyVar.c.get(zzpyVar.f);
                if (g2pVar3 != null) {
                    j3 = g2pVar3.c;
                }
                j3 = 1 + zzpyVar.g;
                if (j6 >= j3) {
                    g2pVar2.c = j6;
                }
            } else {
                j = -1;
            }
            if (zzxoVar != null) {
                long j7 = zzxoVar.d;
                if (j7 != j) {
                    if (zzxoVar2 == null) {
                        if (!zzxoVar.b() && j7 == g2pVar2.c) {
                            j2 = g2pVar2.c;
                            if (j2 == j || j2 < j4) {
                                g2pVar = g2pVar2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = zzfm.a;
                                if (g2pVar.d != null && zzxoVar2 != null) {
                                    g2pVar = g2pVar2;
                                }
                            }
                        }
                    } else if (j7 == zzxoVar2.d && zzxoVar.b == zzxoVar2.b && zzxoVar.c == zzxoVar2.c) {
                        j2 = g2pVar2.c;
                        if (j2 == j) {
                        }
                        g2pVar = g2pVar2;
                        j4 = j2;
                    }
                }
            }
            if (i == g2pVar2.b) {
                j2 = g2pVar2.c;
                if (j2 == j) {
                }
                g2pVar = g2pVar2;
                j4 = j2;
            }
        }
        if (g2pVar != null) {
            return g2pVar;
        }
        byte[] bArr = new byte[12];
        h.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 10);
        g2p g2pVar4 = new g2p(this, encodeToString, i, zzxoVar);
        hashMap.put(encodeToString, g2pVar4);
        return g2pVar4;
    }

    public zzpy() {
        throw null;
    }
}
