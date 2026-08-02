package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ayh extends v7a {
    public final j9e h = new j9e();
    public final nm2 i = new nm2(3);
    public djj j;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r5 != r7) goto L14;
     */
    @Override // defpackage.v7a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ric l(wic wicVar, ByteBuffer byteBuffer) {
        lic eyhVar;
        long j;
        j9e j9eVar = this.h;
        nm2 nm2Var = this.i;
        djj djjVar = this.j;
        if (djjVar != null) {
            long j2 = wicVar.n;
            synchronized (djjVar) {
                long j3 = djjVar.b;
            }
        }
        djj djjVar2 = new djj(wicVar.k);
        this.j = djjVar2;
        djjVar2.a(wicVar.k - wicVar.n);
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        j9eVar.L(array, limit);
        nm2Var.p(array, limit);
        nm2Var.t(39);
        long i = (nm2Var.i(1) << 32) | nm2Var.i(32);
        nm2Var.t(20);
        int i2 = nm2Var.i(12);
        int i3 = nm2Var.i(8);
        j9eVar.O(14);
        if (i3 == 0) {
            eyhVar = new eyh();
        } else if (i3 == 255) {
            long C = j9eVar.C();
            int i4 = i2 - 4;
            j9eVar.k(new byte[i4], 0, i4);
            eyhVar = new s7f(C, i, 0);
        } else if (i3 == 4) {
            int A = j9eVar.A();
            ArrayList arrayList = new ArrayList(A);
            for (int i5 = 0; i5 < A; i5++) {
                j9eVar.C();
                boolean z = (j9eVar.A() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int A2 = j9eVar.A();
                    boolean z2 = (A2 & 64) != 0;
                    boolean z3 = (A2 & 32) != 0;
                    if (z2) {
                        j9eVar.C();
                    }
                    if (!z2) {
                        int A3 = j9eVar.A();
                        ArrayList arrayList3 = new ArrayList(A3);
                        for (int i6 = 0; i6 < A3; i6++) {
                            j9eVar.A();
                            j9eVar.C();
                            arrayList3.add(new y9f(2));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        j9eVar.A();
                        j9eVar.C();
                    }
                    j9eVar.H();
                    j9eVar.A();
                    j9eVar.A();
                }
                arrayList.add(new wm2(arrayList2));
            }
            eyhVar = new hyh(arrayList);
        } else if (i3 == 5) {
            djj djjVar3 = this.j;
            j9eVar.C();
            boolean z4 = (j9eVar.A() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = C.TIME_UNSET;
            } else {
                int A4 = j9eVar.A();
                boolean z5 = (A4 & 64) != 0;
                boolean z6 = (A4 & 32) != 0;
                boolean z7 = (A4 & 16) != 0;
                long a = (!z5 || z7) ? C.TIME_UNSET : s7f.a(i, j9eVar);
                if (!z5) {
                    int A5 = j9eVar.A();
                    ArrayList arrayList4 = new ArrayList(A5);
                    for (int i7 = 0; i7 < A5; i7++) {
                        j9eVar.A();
                        djjVar3.b(!z7 ? s7f.a(i, j9eVar) : C.TIME_UNSET);
                        arrayList4.add(new w9f(2));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    j9eVar.A();
                    j9eVar.C();
                }
                j9eVar.H();
                j9eVar.A();
                j9eVar.A();
                j = a;
            }
            eyhVar = new cyh(list, j, djjVar3.b(j));
        } else if (i3 != 6) {
            eyhVar = null;
        } else {
            djj djjVar4 = this.j;
            long a2 = s7f.a(i, j9eVar);
            eyhVar = new s7f(a2, djjVar4.b(a2), 1);
        }
        return eyhVar == null ? new ric(new lic[0]) : new ric(eyhVar);
    }
}
