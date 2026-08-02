package defpackage;

import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzguk;
import java.io.EOFException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wnd {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final Object g;

    public wnd(int i) {
        switch (i) {
            case 1:
                this.f = new int[255];
                this.g = new j9e(255);
                break;
            case 2:
                this.f = new int[255];
                this.g = new zzeu(255);
                break;
            default:
                this.f = new int[255];
                this.g = new nkk(255);
                break;
        }
    }

    public boolean a(ml6 ml6Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        nkk nkkVar = (nkk) this.g;
        nkkVar.B(27);
        try {
            z2 = ml6Var.peekFully(nkkVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && nkkVar.t() == 1332176723) {
            if (nkkVar.s() == 0) {
                this.a = nkkVar.s();
                this.b = nkkVar.i();
                nkkVar.j();
                nkkVar.j();
                nkkVar.j();
                int s = nkkVar.s();
                this.c = s;
                this.d = s + 27;
                nkkVar.B(s);
                try {
                    z3 = ml6Var.peekFully(nkkVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int s2 = nkkVar.s();
                        this.f[i] = s2;
                        this.e += s2;
                    }
                    return true;
                }
            } else if (!z) {
                throw r9e.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    public boolean b(nl6 nl6Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        j9e j9eVar = (j9e) this.g;
        j9eVar.K(27);
        try {
            z2 = nl6Var.peekFully(j9eVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && j9eVar.C() == 1332176723) {
            if (j9eVar.A() == 0) {
                this.a = j9eVar.A();
                this.b = j9eVar.p();
                j9eVar.r();
                j9eVar.r();
                j9eVar.r();
                int A = j9eVar.A();
                this.c = A;
                this.d = A + 27;
                j9eVar.K(A);
                try {
                    z3 = nl6Var.peekFully(j9eVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int A2 = j9eVar.A();
                        this.f[i] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            } else if (!z) {
                throw s9e.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    public boolean c(ml6 ml6Var, long j) {
        boolean z;
        nkk nkkVar = (nkk) this.g;
        qx9.r(ml6Var.getPosition() == ml6Var.getPeekPosition());
        nkkVar.B(4);
        while (true) {
            if (j != -1 && ml6Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                z = ml6Var.peekFully(nkkVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            nkkVar.E(0);
            if (nkkVar.t() == 1332176723) {
                ml6Var.resetPeekPosition();
                return true;
            }
            ml6Var.skipFully(1);
        }
        do {
            if (j != -1 && ml6Var.getPosition() >= j) {
                break;
            }
        } while (ml6Var.skip(1) != -1);
        return false;
    }

    public boolean d(nl6 nl6Var, long j) {
        boolean z;
        j9e j9eVar = (j9e) this.g;
        z1a.s(nl6Var.getPosition() == nl6Var.getPeekPosition());
        j9eVar.K(4);
        while (true) {
            if (j != -1 && nl6Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                z = nl6Var.peekFully(j9eVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            j9eVar.N(0);
            if (j9eVar.C() == 1332176723) {
                nl6Var.resetPeekPosition();
                return true;
            }
            nl6Var.skipFully(1);
        }
        do {
            if (j != -1 && nl6Var.getPosition() >= j) {
                break;
            }
        } while (nl6Var.skip(1) != -1);
        return false;
    }

    public boolean e(zzagi zzagiVar, long j) {
        boolean z;
        zzguk.a(zzagiVar.zzn() == zzagiVar.zzm());
        zzeu zzeuVar = (zzeu) this.g;
        zzeuVar.y(4);
        while (true) {
            if (j != -1 && zzagiVar.zzn() + 4 >= j) {
                break;
            }
            try {
                z = zzagiVar.f(zzeuVar.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            zzeuVar.D(0);
            if (zzeuVar.N() == 1332176723) {
                zzagiVar.zzl();
                return true;
            }
            zzagiVar.zzf(1);
        }
        do {
            if (j != -1 && zzagiVar.zzn() >= j) {
                break;
            }
        } while (zzagiVar.zzd() != -1);
        return false;
    }

    public boolean f(zzagi zzagiVar, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        zzeu zzeuVar = (zzeu) this.g;
        zzeuVar.y(27);
        try {
            z2 = zzagiVar.f(zzeuVar.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && zzeuVar.N() == 1332176723) {
            if (zzeuVar.I() == 0) {
                this.a = zzeuVar.I();
                this.b = zzeuVar.e();
                zzeuVar.a();
                zzeuVar.a();
                zzeuVar.a();
                int I = zzeuVar.I();
                this.c = I;
                this.d = I + 27;
                zzeuVar.y(I);
                try {
                    z3 = zzagiVar.f(zzeuVar.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int I2 = zzeuVar.I();
                        this.f[i] = I2;
                        this.e += I2;
                    }
                    return true;
                }
            } else if (!z) {
                throw zzat.b("unsupported bit stream revision");
            }
        }
        return false;
    }
}
