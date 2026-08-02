package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vea implements kl6 {
    public ol6 b;
    public int c;
    public int d;
    public int e;
    public MotionPhotoMetadata g;
    public ml6 h;
    public am0 i;
    public fxc j;
    public final nkk a = new nkk(6);
    public long f = -1;

    public final void a() {
        e(new Metadata.Entry[0]);
        ol6 ol6Var = this.b;
        ol6Var.getClass();
        ol6Var.endTracks();
        this.b.d(new aw0(C.TIME_UNSET));
        this.c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ml6 ml6Var, b78 b78Var) {
        String n;
        xvc xvcVar;
        vvf vvfVar;
        int i;
        MotionPhotoMetadata motionPhotoMetadata;
        long j;
        int i2 = this.c;
        nkk nkkVar = this.a;
        if (i2 == 0) {
            nkkVar.B(2);
            ((ap4) ml6Var).readFully(nkkVar.a, 0, 2, false);
            int x = nkkVar.x();
            this.d = x;
            if (x == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((x < 65488 || x > 65497) && x != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            nkkVar.B(2);
            ((ap4) ml6Var).readFully(nkkVar.a, 0, 2, false);
            this.e = nkkVar.x() - 2;
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
                if (this.i == null || ml6Var != this.h) {
                    this.h = ml6Var;
                    this.i = new am0(ml6Var, this.f);
                }
                fxc fxcVar = this.j;
                fxcVar.getClass();
                int b = fxcVar.b(this.i, b78Var);
                if (b == 1) {
                    b78Var.a += this.f;
                }
                return b;
            }
            long j2 = ((ap4) ml6Var).d;
            long j3 = this.f;
            if (j2 != j3) {
                b78Var.a = j3;
                return 1;
            }
            ap4 ap4Var = (ap4) ml6Var;
            if (!ap4Var.peekFully(nkkVar.a, 0, 1, true)) {
                a();
                return 0;
            }
            ap4Var.f = 0;
            if (this.j == null) {
                this.j = new fxc(0);
            }
            am0 am0Var = new am0(ml6Var, this.f);
            this.i = am0Var;
            this.j.getClass();
            if (!xw3.P(am0Var, false, false)) {
                a();
                return 0;
            }
            fxc fxcVar2 = this.j;
            long j4 = this.f;
            ol6 ol6Var = this.b;
            ol6Var.getClass();
            fxcVar2.q = new am0(j4, ol6Var, 8);
            MotionPhotoMetadata motionPhotoMetadata2 = this.g;
            motionPhotoMetadata2.getClass();
            e(motionPhotoMetadata2);
            this.c = 5;
            return 0;
        }
        int i3 = this.d;
        int i4 = this.e;
        if (i3 == 65505) {
            nkk nkkVar2 = new nkk(i4);
            ((ap4) ml6Var).readFully(nkkVar2.a, 0, this.e, false);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(nkkVar2.n()) && (n = nkkVar2.n()) != null) {
                long j5 = ((ap4) ml6Var).c;
                if (j5 != -1) {
                    try {
                        xvcVar = hz8.T(n);
                    } catch (NumberFormatException | XmlPullParserException | r9e unused) {
                        m6k.f0();
                        xvcVar = null;
                    }
                    if (xvcVar != null && (i = (vvfVar = xvcVar.b).d) >= 2) {
                        int i5 = i - 1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        long j9 = -1;
                        boolean z = false;
                        while (i5 >= 0) {
                            vvc vvcVar = (vvc) vvfVar.get(i5);
                            boolean equals = MimeTypes.VIDEO_MP4.equals(vvcVar.a) | z;
                            if (i5 == 0) {
                                j5 -= vvcVar.c;
                                j = 0;
                            } else {
                                j = j5 - vvcVar.b;
                            }
                            long j10 = j;
                            long j11 = j5;
                            j5 = j10;
                            if (equals && j5 != j11) {
                                j9 = j11 - j5;
                                j8 = j5;
                                equals = false;
                            }
                            if (i5 == 0) {
                                j6 = j5;
                                j7 = j11;
                            }
                            i5--;
                            z = equals;
                        }
                        if (j8 != -1 && j9 != -1 && j6 != -1 && j7 != -1) {
                            motionPhotoMetadata = new MotionPhotoMetadata(j6, j7, xvcVar.a, j8, j9);
                            this.g = motionPhotoMetadata;
                            if (motionPhotoMetadata != null) {
                                this.f = motionPhotoMetadata.d;
                            }
                        }
                    }
                }
                motionPhotoMetadata = null;
                this.g = motionPhotoMetadata;
                if (motionPhotoMetadata != null) {
                }
            }
        } else {
            ((ap4) ml6Var).skipFully(i4);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.b = ol6Var;
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        ap4 ap4Var = (ap4) ml6Var;
        nkk nkkVar = this.a;
        nkkVar.B(2);
        ap4Var.peekFully(nkkVar.a, 0, 2, false);
        if (nkkVar.x() == 65496) {
            nkkVar.B(2);
            ap4Var.peekFully(nkkVar.a, 0, 2, false);
            int x = nkkVar.x();
            this.d = x;
            if (x == 65504) {
                nkkVar.B(2);
                ap4Var.peekFully(nkkVar.a, 0, 2, false);
                ap4Var.b(nkkVar.x() - 2, false);
                nkkVar.B(2);
                ap4Var.peekFully(nkkVar.a, 0, 2, false);
                x = nkkVar.x();
                this.d = x;
            }
            if (x == 65505) {
                ap4Var.b(2, false);
                nkkVar.B(6);
                ap4Var.peekFully(nkkVar.a, 0, 6, false);
                if (nkkVar.t() == 1165519206 && nkkVar.x() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(Metadata.Entry... entryArr) {
        ol6 ol6Var = this.b;
        ol6Var.getClass();
        usj track = ol6Var.track(1024, 4);
        pm8 pm8Var = new pm8();
        pm8Var.j = "image/jpeg";
        pm8Var.i = new Metadata(entryArr);
        track.a(new sm8(pm8Var));
    }

    @Override // defpackage.kl6
    public final void release() {
        fxc fxcVar = this.j;
        if (fxcVar != null) {
            fxcVar.getClass();
        }
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            fxc fxcVar = this.j;
            fxcVar.getClass();
            fxcVar.seek(j, j2);
        }
    }
}
