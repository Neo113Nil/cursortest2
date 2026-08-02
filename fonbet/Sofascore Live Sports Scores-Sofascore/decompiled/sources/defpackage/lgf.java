package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lgf implements fw1 {
    public final djj a;
    public final j9e b = new j9e();

    public lgf(djj djjVar) {
        this.a = djjVar;
    }

    @Override // defpackage.fw1
    public final dw1 a(nl6 nl6Var, long j) {
        long position = nl6Var.getPosition();
        int min = (int) Math.min(20000L, nl6Var.getLength() - position);
        j9e j9eVar = this.b;
        j9eVar.K(min);
        nl6Var.peekFully(j9eVar.a, 0, min);
        int i = -1;
        int i2 = -1;
        long j2 = -9223372036854775807L;
        while (j9eVar.a() >= 4) {
            if (y68.o(j9eVar.b, j9eVar.a) != 442) {
                j9eVar.O(1);
            } else {
                j9eVar.O(4);
                long c = ngf.c(j9eVar);
                if (c != C.TIME_UNSET) {
                    long b = this.a.b(c);
                    if (b > j) {
                        return j2 == C.TIME_UNSET ? new dw1(-1, 1, b, position) : new dw1(0, 1, C.TIME_UNSET, position + i2);
                    }
                    long j3 = b + 100000;
                    int i3 = j9eVar.b;
                    if (j3 > j) {
                        return new dw1(0, 1, C.TIME_UNSET, position + i3);
                    }
                    i2 = i3;
                    j2 = b;
                }
                int i4 = j9eVar.c;
                if (j9eVar.a() >= 10) {
                    j9eVar.O(9);
                    int A = j9eVar.A() & 7;
                    if (j9eVar.a() >= A) {
                        j9eVar.O(A);
                        if (j9eVar.a() >= 4) {
                            if (y68.o(j9eVar.b, j9eVar.a) == 443) {
                                j9eVar.O(4);
                                int H = j9eVar.H();
                                if (j9eVar.a() < H) {
                                    j9eVar.N(i4);
                                } else {
                                    j9eVar.O(H);
                                }
                            }
                            while (true) {
                                if (j9eVar.a() < 4) {
                                    break;
                                }
                                int o = y68.o(j9eVar.b, j9eVar.a);
                                if (o == 442 || o == 441 || (o >>> 8) != 1) {
                                    break;
                                }
                                j9eVar.O(4);
                                if (j9eVar.a() < 2) {
                                    j9eVar.N(i4);
                                    break;
                                }
                                j9eVar.N(Math.min(j9eVar.c, j9eVar.b + j9eVar.H()));
                            }
                        } else {
                            j9eVar.N(i4);
                        }
                    } else {
                        j9eVar.N(i4);
                    }
                } else {
                    j9eVar.N(i4);
                }
                i = j9eVar.b;
            }
        }
        return j2 != C.TIME_UNSET ? new dw1(-2, 1, j2, position + i) : dw1.f;
    }

    @Override // defpackage.fw1
    public final void e() {
        byte[] bArr = nik.b;
        this.b.L(bArr, bArr.length);
    }
}
