package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wm4 implements pdb, qdb, wn3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wm4(ami amiVar, long j, int i) {
        this.a = 2;
        this.d = amiVar;
        this.c = j;
        this.b = i;
    }

    @Override // defpackage.wn3
    public void accept(Object obj) {
        ami amiVar = (ami) this.d;
        q74 q74Var = (q74) obj;
        amiVar.h.getClass();
        byte[] A = uxf.A(q74Var.a, q74Var.c);
        j9e j9eVar = amiVar.c;
        j9eVar.L(A, A.length);
        amiVar.a.g(A.length, j9eVar);
        long j = q74Var.b;
        b bVar = amiVar.h;
        long j2 = this.c;
        if (j == C.TIME_UNSET) {
            z1a.E(bVar.t == Long.MAX_VALUE);
        } else {
            long j3 = bVar.t;
            j2 = j3 == Long.MAX_VALUE ? j2 + j : j + j3;
        }
        amiVar.a.a(j2, this.b | 1, A.length, 0, null);
    }

    @Override // defpackage.pdb
    public void invoke(Object obj) {
        int i = this.a;
        long j = this.c;
        int i2 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                pv pvVar = (pv) obj2;
                r6c r6cVar = (r6c) ((rv) obj);
                HashMap hashMap = r6cVar.g;
                HashMap hashMap2 = r6cVar.h;
                rcc rccVar = pvVar.d;
                if (rccVar != null) {
                    String b = r6cVar.b.b(pvVar.b, rccVar);
                    Long l = (Long) hashMap2.get(b);
                    Long l2 = (Long) hashMap.get(b);
                    hashMap2.put(b, Long.valueOf((l == null ? 0L : l.longValue()) + j));
                    hashMap.put(b, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i2));
                    break;
                }
                break;
            default:
                qv qvVar = (qv) obj2;
                s6c s6cVar = (s6c) ((sv) obj);
                HashMap hashMap3 = s6cVar.h;
                HashMap hashMap4 = s6cVar.i;
                scc sccVar = qvVar.d;
                if (sccVar != null) {
                    String c = s6cVar.c.c(qvVar.b, sccVar);
                    Long l3 = (Long) hashMap4.get(c);
                    Long l4 = (Long) hashMap3.get(c);
                    hashMap4.put(c, Long.valueOf((l3 == null ? 0L : l3.longValue()) + j));
                    hashMap3.put(c, Long.valueOf((l4 != null ? l4.longValue() : 0L) + i2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wm4(Object obj, int i, long j, long j2, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = i;
        this.c = j;
    }
}
