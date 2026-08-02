package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wea implements ll6 {
    public pl6 b;
    public int c;
    public int d;
    public int e;
    public yvc g;
    public nl6 h;
    public am0 i;
    public gxc j;
    public final j9e a = new j9e(2);
    public long f = -1;

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        String v;
        bp4 bp4Var = (bp4) nl6Var;
        j9e j9eVar = this.a;
        j9eVar.K(2);
        bp4Var.peekFully(j9eVar.a, 0, 2, false);
        if (j9eVar.H() == 65496) {
            while (true) {
                j9eVar.K(2);
                bp4Var.peekFully(j9eVar.a, 0, 2, false);
                int H = j9eVar.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                j9eVar.K(2);
                bp4Var.peekFully(j9eVar.a, 0, 2);
                int H2 = j9eVar.H() - 2;
                if (H2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    bp4Var.c(H2, false);
                } else {
                    j9eVar.K(H2);
                    bp4Var.peekFully(j9eVar.a, 0, H2, false);
                    if (Objects.equals(j9eVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = j9eVar.v()) != null) {
                        String[] strArr = iz8.k;
                        for (int i = 0; i < 4; i++) {
                            if (v.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        String v;
        xvc xvcVar;
        vvf vvfVar;
        int i;
        yvc yvcVar;
        long j;
        long j2;
        int i2 = this.c;
        long j3 = -1;
        j9e j9eVar = this.a;
        if (i2 == 0) {
            j9eVar.K(2);
            nl6Var.readFully(j9eVar.a, 0, 2);
            int H = j9eVar.H();
            this.d = H;
            if (H == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                f();
                return 0;
            }
            if ((H < 65488 || H > 65497) && H != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            j9eVar.K(2);
            nl6Var.peekFully(j9eVar.a, 0, 2);
            this.e = j9eVar.H() - 2;
            nl6Var.skipFully(2);
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    zzl.s();
                    return 0;
                }
                if (this.i == null || nl6Var != this.h) {
                    this.h = nl6Var;
                    this.i = new am0(nl6Var, this.f);
                }
                gxc gxcVar = this.j;
                gxcVar.getClass();
                int b = gxcVar.b(this.i, b78Var);
                if (b == 1) {
                    b78Var.a += this.f;
                }
                return b;
            }
            long position = nl6Var.getPosition();
            long j4 = this.f;
            if (position != j4) {
                b78Var.a = j4;
                return 1;
            }
            if (!nl6Var.peekFully(j9eVar.a, 0, 1, true)) {
                f();
                return 0;
            }
            nl6Var.resetPeekPosition();
            if (this.j == null) {
                this.j = new gxc(xli.A7, 8);
            }
            am0 am0Var = new am0(nl6Var, this.f);
            this.i = am0Var;
            if (!this.j.a(am0Var)) {
                f();
                return 0;
            }
            gxc gxcVar2 = this.j;
            long j5 = this.f;
            pl6 pl6Var = this.b;
            pl6Var.getClass();
            gxcVar2.e(new am0(j5, pl6Var, 9));
            yvc yvcVar2 = this.g;
            yvcVar2.getClass();
            pl6 pl6Var2 = this.b;
            pl6Var2.getClass();
            vsj mo2track = pl6Var2.mo2track(1024, 4);
            qm8 qm8Var = new qm8();
            qm8Var.m = sjc.p("image/jpeg");
            qm8Var.k = new ric(yvcVar2);
            w1l.r(qm8Var, mo2track);
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            j9e j9eVar2 = new j9e(this.e);
            nl6Var.readFully(j9eVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(j9eVar2.v()) && (v = j9eVar2.v()) != null) {
                long length = nl6Var.getLength();
                if (length != -1) {
                    try {
                        xvcVar = iz8.A(v);
                    } catch (NumberFormatException | XmlPullParserException | s9e unused) {
                        tgj.d0("Ignoring unexpected XMP metadata");
                        xvcVar = null;
                    }
                    if (xvcVar != null && (i = (vvfVar = xvcVar.b).d) >= 2) {
                        int i3 = i - 1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        long j9 = -1;
                        while (i3 >= 0) {
                            wvc wvcVar = (wvc) vvfVar.get(i3);
                            String str = wvcVar.a;
                            boolean z = str.equals(MimeTypes.VIDEO_MP4) || str.equals("video/quicktime");
                            if (i3 == 0) {
                                j = j3;
                                length -= wvcVar.c;
                                j2 = 0;
                            } else {
                                j = j3;
                                j2 = length - wvcVar.b;
                            }
                            long j10 = length;
                            length = j2;
                            if (z && length != j10) {
                                j9 = j10 - length;
                                j8 = length;
                            }
                            if (i3 == 0) {
                                j7 = j10;
                                j6 = length;
                            }
                            i3--;
                            j3 = j;
                        }
                        long j11 = j3;
                        if (j8 != j11 && j9 != j11 && j6 != j11 && j7 != j11) {
                            yvcVar = new yvc(j6, j7, xvcVar.a, j8, j9);
                            this.g = yvcVar;
                            if (yvcVar != null) {
                                this.f = yvcVar.d;
                            }
                        }
                    }
                }
                yvcVar = null;
                this.g = yvcVar;
                if (yvcVar != null) {
                }
            }
        } else {
            nl6Var.skipFully(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.b = pl6Var;
    }

    public final void f() {
        pl6 pl6Var = this.b;
        pl6Var.getClass();
        pl6Var.endTracks();
        this.b.m(new bw0(C.TIME_UNSET));
        this.c = 6;
    }

    @Override // defpackage.ll6
    public final void release() {
        gxc gxcVar = this.j;
        if (gxcVar != null) {
            gxcVar.getClass();
        }
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            gxc gxcVar = this.j;
            gxcVar.getClass();
            gxcVar.seek(j, j2);
        }
    }
}
