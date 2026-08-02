package defpackage;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gr4 implements pcc {
    public final p03 a;
    public final ne4 b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;

    public gr4(ne4 ne4Var, gp4 gp4Var) {
        this.b = ne4Var;
        p03 p03Var = new p03(gp4Var);
        this.a = p03Var;
        if (ne4Var != ((ne4) p03Var.d)) {
            p03Var.d = ne4Var;
            ((HashMap) p03Var.f).clear();
            ((HashMap) p03Var.c).clear();
        }
        this.c = C.TIME_UNSET;
        this.d = C.TIME_UNSET;
        this.e = C.TIME_UNSET;
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
    }

    public static pcc b(Class cls, ne4 ne4Var) {
        try {
            return (pcc) cls.getConstructor(ne4.class).newInstance(ne4Var);
        } catch (Exception e) {
            yhk.q(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    @Override // defpackage.pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a51 a(f6c f6cVar) {
        tmi tmiVar;
        tmi tmiVar2;
        tmi tmiVar3;
        f6c f6cVar2 = f6cVar;
        x5c x5cVar = f6cVar2.b;
        t5c t5cVar = f6cVar2.c;
        x5cVar.getClass();
        x5c x5cVar2 = f6cVar2.b;
        String scheme = x5cVar2.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int u = lik.u(x5cVar2.a);
        p03 p03Var = this.a;
        HashMap hashMap = (HashMap) p03Var.c;
        pcc pccVar = (pcc) hashMap.get(Integer.valueOf(u));
        final int i = 0;
        final int i2 = 1;
        if (pccVar == null) {
            HashMap hashMap2 = (HashMap) p03Var.f;
            if (hashMap2.containsKey(Integer.valueOf(u))) {
                tmiVar2 = (tmi) hashMap2.get(Integer.valueOf(u));
            } else {
                final ne4 ne4Var = (ne4) p03Var.d;
                ne4Var.getClass();
                if (u == 0) {
                    final Class<? extends U> asSubclass = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(pcc.class);
                    tmiVar3 = new tmi() { // from class: cr4
                        @Override // defpackage.tmi
                        public final Object get() {
                            switch (i) {
                            }
                            return gr4.b(asSubclass, ne4Var);
                        }
                    };
                } else if (u != 1) {
                    final int i3 = 2;
                    if (u == 2) {
                        final Class<? extends U> asSubclass2 = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(pcc.class);
                        tmiVar = new tmi() { // from class: cr4
                            @Override // defpackage.tmi
                            public final Object get() {
                                switch (i3) {
                                }
                                return gr4.b(asSubclass2, ne4Var);
                            }
                        };
                    } else if (u != 3) {
                        if (u == 4) {
                            tmiVar = new fr4(i, p03Var, ne4Var);
                        }
                        tmiVar = null;
                    } else {
                        tmiVar = new er4(i, Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(pcc.class));
                    }
                    hashMap2.put(Integer.valueOf(u), tmiVar);
                    if (tmiVar != null) {
                        ((HashSet) p03Var.e).add(Integer.valueOf(u));
                    }
                    tmiVar2 = tmiVar;
                } else {
                    final Class<? extends U> asSubclass3 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(pcc.class);
                    tmiVar3 = new tmi() { // from class: cr4
                        @Override // defpackage.tmi
                        public final Object get() {
                            switch (i2) {
                            }
                            return gr4.b(asSubclass3, ne4Var);
                        }
                    };
                }
                tmiVar = tmiVar3;
                hashMap2.put(Integer.valueOf(u), tmiVar);
                if (tmiVar != null) {
                }
                tmiVar2 = tmiVar;
            }
            if (tmiVar2 == null) {
                pccVar = null;
            } else {
                pccVar = (pcc) tmiVar2.get();
                hashMap.put(Integer.valueOf(u), pccVar);
            }
        }
        qx9.v(pccVar, "No suitable media source factory found for content type: " + u);
        s5c a = t5cVar.a();
        if (t5cVar.a == C.TIME_UNSET) {
            a.a = this.c;
        }
        if (t5cVar.d == -3.4028235E38f) {
            a.d = this.f;
        }
        if (t5cVar.e == -3.4028235E38f) {
            a.e = this.g;
        }
        if (t5cVar.b == C.TIME_UNSET) {
            a.b = this.d;
        }
        if (t5cVar.c == C.TIME_UNSET) {
            a.c = this.e;
        }
        t5c a2 = a.a();
        if (!a2.equals(t5cVar)) {
            new tnf();
            List list = Collections.EMPTY_LIST;
            av9 av9Var = hv9.b;
            vvf vvfVar = vvf.e;
            y5c y5cVar = y5c.c;
            l5c l5cVar = f6cVar2.e;
            i5c i5cVar = new i5c();
            i5cVar.a = l5cVar.a;
            i5cVar.b = l5cVar.b;
            i5cVar.c = l5cVar.c;
            i5cVar.d = l5cVar.d;
            i5cVar.e = l5cVar.e;
            String str = f6cVar2.a;
            p6c p6cVar = f6cVar2.d;
            t5cVar.a();
            y5c y5cVar2 = f6cVar2.f;
            Uri uri = x5cVar2.a;
            List list2 = x5cVar2.b;
            hv9 hv9Var = x5cVar2.c;
            new tnf();
            s5c a3 = a2.a();
            x5c x5cVar3 = uri != null ? new x5c(uri, null, list2, hv9Var) : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            l5c l5cVar2 = new l5c(i5cVar);
            t5c a4 = a3.a();
            if (p6cVar == null) {
                p6cVar = p6c.G;
            }
            f6cVar2 = new f6c(str2, l5cVar2, x5cVar3, a4, p6cVar, y5cVar2);
        }
        x5c x5cVar4 = f6cVar2.b;
        a51 a5 = pccVar.a(f6cVar2);
        hv9 hv9Var2 = x5cVar4.c;
        if (!hv9Var2.isEmpty()) {
            a51[] a51VarArr = new a51[hv9Var2.size() + 1];
            a51VarArr[0] = a5;
            if (hv9Var2.size() > 0) {
                this.b.getClass();
                b6c b6cVar = (b6c) hv9Var2.get(0);
                new ArrayList(1);
                new HashSet(1);
                new bc5(1);
                new bc5(0);
                av9 av9Var2 = hv9.b;
                vvf vvfVar2 = vvf.e;
                List list3 = Collections.EMPTY_LIST;
                av9 av9Var3 = hv9.b;
                vvf vvfVar3 = vvf.e;
                y5c y5cVar3 = y5c.c;
                Uri uri2 = Uri.EMPTY;
                b6cVar.getClass();
                throw null;
            }
            a5 = new pgc(a51VarArr);
        }
        a51 a51Var = a5;
        l5c l5cVar3 = f6cVar2.e;
        long j = l5cVar3.a;
        long j2 = l5cVar3.b;
        return (j == 0 && j2 == Long.MIN_VALUE && !l5cVar3.d) ? a51Var : new ty2(a51Var, lik.y(j), lik.y(j2), !l5cVar3.e, l5cVar3.c, l5cVar3.d);
    }

    public gr4(ne4 ne4Var) {
        this(ne4Var, new gp4());
    }
}
