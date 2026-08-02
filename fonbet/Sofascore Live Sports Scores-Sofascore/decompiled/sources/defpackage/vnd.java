package defpackage;

import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzeu;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.EOFException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vnd {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public final Object e;
    public final Object f;

    public vnd(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.e = new wnd(1);
                this.f = new j9e(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
                this.b = -1;
                break;
            case 2:
                this.e = new wnd(2);
                this.f = new zzeu(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
                this.b = -1;
                break;
            default:
                this.e = new wnd(0);
                this.f = new nkk(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
                this.b = -1;
                break;
        }
    }

    public int a(int i) {
        int i2;
        int i3;
        int i4 = this.a;
        Object obj = this.e;
        int i5 = 0;
        switch (i4) {
            case 0:
                this.c = 0;
                do {
                    int i6 = this.c;
                    int i7 = i + i6;
                    wnd wndVar = (wnd) obj;
                    if (i7 >= wndVar.c) {
                        break;
                    } else {
                        int[] iArr = wndVar.f;
                        this.c = i6 + 1;
                        i2 = iArr[i7];
                        i5 += i2;
                    }
                } while (i2 == 255);
            default:
                this.c = 0;
                do {
                    int i8 = this.c;
                    int i9 = i + i8;
                    wnd wndVar2 = (wnd) obj;
                    if (i9 >= wndVar2.c) {
                        break;
                    } else {
                        int[] iArr2 = wndVar2.f;
                        this.c = i8 + 1;
                        i3 = iArr2[i9];
                        i5 += i3;
                    }
                } while (i3 == 255);
        }
        return i5;
    }

    public boolean b(ml6 ml6Var) {
        int i;
        wnd wndVar = (wnd) this.e;
        nkk nkkVar = (nkk) this.f;
        qx9.t(ml6Var != null);
        if (this.d) {
            this.d = false;
            nkkVar.B(0);
        }
        while (!this.d) {
            int i2 = this.b;
            if (i2 < 0) {
                if (wndVar.c(ml6Var, -1L) && wndVar.a(ml6Var, true)) {
                    int i3 = wndVar.d;
                    if ((wndVar.a & 1) == 1 && nkkVar.c == 0) {
                        i3 += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        ml6Var.skipFully(i3);
                        this.b = i;
                        i2 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a = a(i2);
            int i4 = this.b + this.c;
            if (a > 0) {
                nkkVar.d(nkkVar.c + a);
                try {
                    ml6Var.readFully(nkkVar.a, nkkVar.c, a);
                    nkkVar.D(nkkVar.c + a);
                    this.d = wndVar.f[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == wndVar.c) {
                i4 = -1;
            }
            this.b = i4;
        }
        return true;
    }

    public boolean c(nl6 nl6Var) {
        int i;
        wnd wndVar = (wnd) this.e;
        j9e j9eVar = (j9e) this.f;
        z1a.E(nl6Var != null);
        if (this.d) {
            this.d = false;
            j9eVar.K(0);
        }
        while (!this.d) {
            int i2 = this.b;
            if (i2 < 0) {
                if (wndVar.d(nl6Var, -1L) && wndVar.b(nl6Var, true)) {
                    int i3 = wndVar.d;
                    if ((wndVar.a & 1) == 1 && j9eVar.c == 0) {
                        i3 += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        nl6Var.skipFully(i3);
                        this.b = i;
                        i2 = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a = a(i2);
            int i4 = this.b + this.c;
            if (a > 0) {
                j9eVar.c(j9eVar.c + a);
                try {
                    nl6Var.readFully(j9eVar.a, j9eVar.c, a);
                    j9eVar.M(j9eVar.c + a);
                    this.d = wndVar.f[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == wndVar.c) {
                i4 = -1;
            }
            this.b = i4;
        }
        return true;
    }

    public boolean d(zzagi zzagiVar) {
        int i;
        wnd wndVar = (wnd) this.e;
        zzeu zzeuVar = (zzeu) this.f;
        if (this.d) {
            this.d = false;
            zzeuVar.y(0);
        }
        while (true) {
            if (this.d) {
                return true;
            }
            int i2 = this.b;
            if (i2 < 0) {
                if (!wndVar.e(zzagiVar, -1L) || !wndVar.f(zzagiVar, true)) {
                    break;
                }
                int i3 = wndVar.d;
                if ((wndVar.a & 1) == 1 && zzeuVar.c == 0) {
                    i3 += e(0);
                    i = this.c;
                } else {
                    i = 0;
                }
                try {
                    zzagiVar.zzf(i3);
                    this.b = i;
                    i2 = i;
                } catch (EOFException unused) {
                }
            }
            int e = e(i2);
            int i4 = this.b + this.c;
            if (e > 0) {
                zzeuVar.A(zzeuVar.c + e);
                try {
                    zzagiVar.g(zzeuVar.c, e, zzeuVar.a);
                    zzeuVar.C(zzeuVar.c + e);
                    this.d = wndVar.f[i4 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == wndVar.c) {
                i4 = -1;
            }
            this.b = i4;
        }
        return false;
    }

    public int e(int i) {
        int i2;
        int i3 = 0;
        this.c = 0;
        do {
            int i4 = this.c;
            int i5 = i + i4;
            wnd wndVar = (wnd) this.e;
            if (i5 >= wndVar.c) {
                break;
            }
            this.c = i4 + 1;
            i2 = wndVar.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
