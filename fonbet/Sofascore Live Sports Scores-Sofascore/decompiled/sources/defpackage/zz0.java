package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zziem;
import com.google.android.gms.internal.ads.zziew;
import com.google.android.gms.internal.ads.zzify;
import com.google.android.gms.internal.ads.zzigd;
import com.google.android.gms.internal.ads.zzige;
import com.google.android.gms.internal.ads.zzigh;
import com.google.android.gms.internal.ads.zzigq;
import com.google.android.gms.internal.ads.zziin;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzacv;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzaeg;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzaen;
import com.google.android.gms.internal.measurement.zzaew;
import com.google.android.gms.internal.measurement.zzagm;
import com.google.android.gms.internal.wearable.zzcg;
import com.google.android.gms.internal.wearable.zzcj;
import com.google.android.gms.internal.wearable.zzcs;
import com.google.android.gms.internal.wearable.zzdp;
import com.google.android.gms.internal.wearable.zzdv;
import com.google.android.gms.internal.wearable.zzdx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zz0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public zz0(m41 m41Var) {
        this.a = 6;
        Context context = (Context) m41Var.a;
        float f = m41Var.b;
        this.e = context;
        ActivityManager activityManager = (ActivityManager) m41Var.c;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.d = i;
        int round = Math.round(activityManager.getMemoryClass() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) ((e3c) m41Var.d).b;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int round2 = Math.round(f2 * f);
        int round3 = Math.round(f2 * 2.0f);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.c = round3;
            this.b = round2;
        } else {
            float f3 = i2 / (f + 2.0f);
            int round4 = Math.round(2.0f * f3);
            this.c = round4;
            int round5 = Math.round(f3 * f);
            this.b = round5;
            round2 = round5;
            round3 = round4;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, round3);
            Formatter.formatFileSize(context, round2);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, round);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }

    public static final void D1(int i) {
        if ((i & 3) == 0) {
            return;
        }
        hbo.o("Failed to parse the message.");
    }

    public static final void E1(int i) {
        if ((i & 3) == 0) {
            return;
        }
        hbo.i("Failed to parse the message.");
    }

    public static final void F1(int i) {
        if ((i & 7) == 0) {
            return;
        }
        hbo.o("Failed to parse the message.");
    }

    public static final void G1(int i) {
        if ((i & 7) == 0) {
            return;
        }
        hbo.i("Failed to parse the message.");
    }

    public static final void u1(int i) {
        if ((i & 3) == 0) {
            return;
        }
        hbo.m("Failed to parse the message.");
    }

    public static final void v1(int i) {
        if ((i & 3) != 0) {
            throw new zzdv("Failed to parse the message.");
        }
    }

    public static final void w1(int i) {
        if ((i & 7) == 0) {
            return;
        }
        hbo.m("Failed to parse the message.");
    }

    public static final void z1(int i) {
        if ((i & 7) != 0) {
            throw new zzdv("Failed to parse the message.");
        }
    }

    public void A(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((lff) s7aVar).add(Long.valueOf(qo2Var.p()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int A = qo2Var.A();
        if ((A & 7) != 0) {
            throw new maa("Failed to parse the message.");
        }
        int b = qo2Var.b() + A;
        do {
            ((lff) s7aVar).add(Long.valueOf(qo2Var.p()));
        } while (qo2Var.b() < b);
    }

    public void A0(ian ianVar, pcn pcnVar, z8n z8nVar) {
        int g;
        int i = this.b;
        if ((i & 7) != 2) {
            zzl.u();
            return;
        }
        do {
            y9n zza = pcnVar.zza();
            m1(zza, pcnVar, z8nVar);
            pcnVar.c(zza);
            ianVar.add(zza);
            m8n m8nVar = (m8n) this.e;
            if (m8nVar.c() || this.d != 0) {
                return;
            } else {
                g = m8nVar.g();
            }
        } while (g == i);
        this.d = g;
    }

    public Object A1(zziin zziinVar, Class cls, zziew zziewVar) {
        zziem zziemVar = (zziem) this.e;
        zziin zziinVar2 = zziin.c;
        switch (zziinVar.ordinal()) {
            case 0:
                o1(1);
                return Double.valueOf(zziemVar.m());
            case 1:
                o1(5);
                return Float.valueOf(zziemVar.n());
            case 2:
                o1(0);
                return Long.valueOf(zziemVar.p());
            case 3:
                o1(0);
                return Long.valueOf(zziemVar.o());
            case 4:
                o1(0);
                return Integer.valueOf(zziemVar.q());
            case 5:
                o1(1);
                return Long.valueOf(zziemVar.r());
            case 6:
                o1(5);
                return Integer.valueOf(zziemVar.s());
            case 7:
                o1(0);
                return Boolean.valueOf(zziemVar.t());
            case 8:
                o1(2);
                return zziemVar.v();
            case 9:
            default:
                a70.p("unsupported field type.");
                return null;
            case 10:
                o1(2);
                nqo a = jqo.c.a(cls);
                Object zza = a.zza();
                t1(zza, a, zziewVar);
                a.c(zza);
                return zza;
            case 11:
                return J1();
            case 12:
                o1(0);
                return Integer.valueOf(zziemVar.x());
            case 13:
                o1(0);
                return Integer.valueOf(zziemVar.y());
            case 14:
                o1(5);
                return Integer.valueOf(zziemVar.z());
            case 15:
                o1(1);
                return Long.valueOf(zziemVar.A());
            case 16:
                o1(0);
                return Integer.valueOf(zziemVar.B());
            case 17:
                o1(0);
                return Long.valueOf(zziemVar.C());
        }
    }

    public void B(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((mff) t7aVar).add(Long.valueOf(qo2Var.p()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int A = qo2Var.A();
        if ((A & 7) != 0) {
            throw new naa("Failed to parse the message.");
        }
        int b = qo2Var.b() + A;
        do {
            ((mff) t7aVar).add(Long.valueOf(qo2Var.p()));
        } while (qo2Var.b() < b);
    }

    public void B0(zzify zzifyVar, nqo nqoVar, zziew zziewVar) {
        int j;
        int i = this.b;
        if ((i & 7) != 2) {
            hbo.e();
            return;
        }
        do {
            Object zza = nqoVar.zza();
            t1(zza, nqoVar, zziewVar);
            nqoVar.c(zza);
            zzifyVar.add(zza);
            zziem zziemVar = (zziem) this.e;
            if (zziemVar.c() || this.d != 0) {
                return;
            } else {
                j = zziemVar.j();
            }
        } while (j == i);
        this.d = j;
    }

    public Object B1(zzagm zzagmVar, Class cls, zzadf zzadfVar) {
        zzacv zzacvVar = (zzacv) this.e;
        zzagm zzagmVar2 = zzagm.c;
        switch (zzagmVar.ordinal()) {
            case 0:
                o1(1);
                return Double.valueOf(zzacvVar.o());
            case 1:
                o1(5);
                return Float.valueOf(zzacvVar.p());
            case 2:
                o1(0);
                return Long.valueOf(zzacvVar.r());
            case 3:
                o1(0);
                return Long.valueOf(zzacvVar.q());
            case 4:
                o1(0);
                return Integer.valueOf(zzacvVar.s());
            case 5:
                o1(1);
                return Long.valueOf(zzacvVar.t());
            case 6:
                o1(5);
                return Integer.valueOf(zzacvVar.u());
            case 7:
                o1(0);
                return Boolean.valueOf(zzacvVar.v());
            case 8:
                o1(2);
                return zzacvVar.x();
            case 9:
            default:
                a70.p("unsupported field type.");
                return null;
            case 10:
                o1(2);
                odn a = jdn.c.a(cls);
                Object zza = a.zza();
                s1(zza, a, zzadfVar);
                a.c(zza);
                return zza;
            case 11:
                return K1();
            case 12:
                o1(0);
                return Integer.valueOf(zzacvVar.A());
            case 13:
                o1(0);
                return Integer.valueOf(zzacvVar.B());
            case 14:
                o1(5);
                return Integer.valueOf(zzacvVar.C());
            case 15:
                o1(1);
                return Long.valueOf(zzacvVar.D());
            case 16:
                o1(0);
                return Integer.valueOf(zzacvVar.E());
            case 17:
                o1(0);
                return Long.valueOf(zzacvVar.F());
        }
    }

    public void C(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = qo2Var.A();
            if ((A & 3) != 0) {
                throw new maa("Failed to parse the message.");
            }
            int b = qo2Var.b() + A;
            do {
                ((lff) s7aVar).add(Float.valueOf(qo2Var.q()));
            } while (qo2Var.b() < b);
            return;
        }
        if (i != 5) {
            throw maa.g();
        }
        do {
            ((lff) s7aVar).add(Float.valueOf(qo2Var.q()));
            if (qo2Var.c()) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void C0(zzaef zzaefVar, odn odnVar, zzadf zzadfVar) {
        int l;
        int i = this.b;
        if ((i & 7) != 2) {
            zzl.w();
            return;
        }
        do {
            Object zza = odnVar.zza();
            s1(zza, odnVar, zzadfVar);
            odnVar.c(zza);
            zzaefVar.add(zza);
            zzacv zzacvVar = (zzacv) this.e;
            if (zzacvVar.d() || this.d != 0) {
                return;
            } else {
                l = zzacvVar.l();
            }
        } while (l == i);
        this.d = l;
    }

    public void C1(int i) {
        switch (this.a) {
            case 11:
                if (((zzacv) this.e).e() != i) {
                    hbo.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    break;
                }
                break;
            default:
                if (((zziem) this.e).d() != i) {
                    hbo.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    break;
                }
                break;
        }
    }

    public void D(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = qo2Var.A();
            if ((A & 3) != 0) {
                throw new naa("Failed to parse the message.");
            }
            int b = qo2Var.b() + A;
            do {
                ((mff) t7aVar).add(Float.valueOf(qo2Var.q()));
            } while (qo2Var.b() < b);
            return;
        }
        if (i != 5) {
            throw naa.g();
        }
        do {
            ((mff) t7aVar).add(Float.valueOf(qo2Var.q()));
            if (qo2Var.c()) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void D0(zzdp zzdpVar, s6o s6oVar, zzcs zzcsVar) {
        int e;
        int i = this.b;
        if ((i & 7) != 3) {
            zzl.y();
            return;
        }
        do {
            Object zza = s6oVar.zza();
            q1(zza, s6oVar, zzcsVar);
            s6oVar.c(zza);
            zzdpVar.add(zza);
            zzcj zzcjVar = (zzcj) this.e;
            if (zzcjVar.c() || this.d != 0) {
                return;
            } else {
                e = zzcjVar.e();
            }
        } while (e == i);
        this.d = e;
    }

    public void E(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((lff) s7aVar).add(Integer.valueOf(qo2Var.r()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((lff) s7aVar).add(Integer.valueOf(qo2Var.r()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void E0(ian ianVar, pcn pcnVar, z8n z8nVar) {
        int g;
        int i = this.b;
        if ((i & 7) != 3) {
            zzl.u();
            return;
        }
        do {
            y9n zza = pcnVar.zza();
            p1(zza, pcnVar, z8nVar);
            pcnVar.c(zza);
            ianVar.add(zza);
            m8n m8nVar = (m8n) this.e;
            if (m8nVar.c() || this.d != 0) {
                return;
            } else {
                g = m8nVar.g();
            }
        } while (g == i);
        this.d = g;
    }

    public void F(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mff) t7aVar).add(Integer.valueOf(qo2Var.r()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((mff) t7aVar).add(Integer.valueOf(qo2Var.r()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void F0(zzify zzifyVar, nqo nqoVar, zziew zziewVar) {
        int j;
        int i = this.b;
        if ((i & 7) != 3) {
            hbo.e();
            return;
        }
        do {
            Object zza = nqoVar.zza();
            y1(zza, nqoVar, zziewVar);
            nqoVar.c(zza);
            zzifyVar.add(zza);
            zziem zziemVar = (zziem) this.e;
            if (zziemVar.c() || this.d != 0) {
                return;
            } else {
                j = zziemVar.j();
            }
        } while (j == i);
        this.d = j;
    }

    public void G(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((lff) s7aVar).add(Long.valueOf(qo2Var.s()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((lff) s7aVar).add(Long.valueOf(qo2Var.s()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void G0(zzaef zzaefVar, odn odnVar, zzadf zzadfVar) {
        int l;
        int i = this.b;
        if ((i & 7) != 3) {
            zzl.w();
            return;
        }
        do {
            Object zza = odnVar.zza();
            x1(zza, odnVar, zzadfVar);
            odnVar.c(zza);
            zzaefVar.add(zza);
            zzacv zzacvVar = (zzacv) this.e;
            if (zzacvVar.d() || this.d != 0) {
                return;
            } else {
                l = zzacvVar.l();
            }
        } while (l == i);
        this.d = l;
    }

    public void H(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mff) t7aVar).add(Long.valueOf(qo2Var.s()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((mff) t7aVar).add(Long.valueOf(qo2Var.s()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void H0(zzdp zzdpVar) {
        int e;
        if ((this.b & 7) != 2) {
            zzl.y();
            return;
        }
        do {
            zzdpVar.add(I1());
            zzcj zzcjVar = (zzcj) this.e;
            if (zzcjVar.c()) {
                return;
            } else {
                e = zzcjVar.e();
            }
        } while (e == this.b);
        this.d = e;
    }

    public int H1() {
        switch (this.a) {
            case 10:
                int i = this.d;
                if (i != 0) {
                    this.b = i;
                    this.d = 0;
                } else {
                    i = ((m8n) this.e).g();
                    this.b = i;
                }
                if (i == 0 || i == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i >>> 3;
            case 11:
                int i2 = this.d;
                if (i2 != 0) {
                    this.b = i2;
                    this.d = 0;
                } else {
                    i2 = ((zzacv) this.e).l();
                    this.b = i2;
                }
                if (i2 == 0 || i2 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i2 >>> 3;
            case 12:
                int i3 = this.d;
                if (i3 != 0) {
                    this.b = i3;
                    this.d = 0;
                } else {
                    i3 = ((zzcj) this.e).e();
                    this.b = i3;
                }
                if (i3 == 0 || i3 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i3 >>> 3;
            default:
                int i4 = this.d;
                if (i4 != 0) {
                    this.b = i4;
                    this.d = 0;
                } else {
                    i4 = ((zziem) this.e).j();
                    this.b = i4;
                }
                if (i4 == 0 || i4 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i4 >>> 3;
        }
    }

    public void I(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = qo2Var.A();
            if ((A & 3) != 0) {
                throw new maa("Failed to parse the message.");
            }
            int b = qo2Var.b() + A;
            do {
                ((lff) s7aVar).add(Integer.valueOf(qo2Var.t()));
            } while (qo2Var.b() < b);
            return;
        }
        if (i != 5) {
            throw maa.g();
        }
        do {
            ((lff) s7aVar).add(Integer.valueOf(qo2Var.t()));
            if (qo2Var.c()) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void I0(ian ianVar) {
        int g;
        m8n m8nVar = (m8n) this.e;
        if ((this.b & 7) != 2) {
            zzl.u();
            return;
        }
        do {
            h1(2);
            ianVar.add(m8nVar.s());
            if (m8nVar.c()) {
                return;
            } else {
                g = m8nVar.g();
            }
        } while (g == this.b);
        this.d = g;
    }

    public zzcg I1() {
        h1(2);
        return ((zzcj) this.e).q();
    }

    public void J(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = qo2Var.A();
            if ((A & 3) != 0) {
                throw new naa("Failed to parse the message.");
            }
            int b = qo2Var.b() + A;
            do {
                ((mff) t7aVar).add(Integer.valueOf(qo2Var.t()));
            } while (qo2Var.b() < b);
            return;
        }
        if (i != 5) {
            throw naa.g();
        }
        do {
            ((mff) t7aVar).add(Integer.valueOf(qo2Var.t()));
            if (qo2Var.c()) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void J0(zzify zzifyVar) {
        int j;
        if ((this.b & 7) != 2) {
            hbo.e();
            return;
        }
        do {
            zzifyVar.add(J1());
            zziem zziemVar = (zziem) this.e;
            if (zziemVar.c()) {
                return;
            } else {
                j = zziemVar.j();
            }
        } while (j == this.b);
        this.d = j;
    }

    public zziei J1() {
        o1(2);
        return ((zziem) this.e).w();
    }

    public void K(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((lff) s7aVar).add(Long.valueOf(qo2Var.u()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int A = qo2Var.A();
        if ((A & 7) != 0) {
            throw new maa("Failed to parse the message.");
        }
        int b = qo2Var.b() + A;
        do {
            ((lff) s7aVar).add(Long.valueOf(qo2Var.u()));
        } while (qo2Var.b() < b);
    }

    public void K0(zzaef zzaefVar) {
        int l;
        if ((this.b & 7) != 2) {
            zzl.w();
            return;
        }
        do {
            zzaefVar.add(K1());
            zzacv zzacvVar = (zzacv) this.e;
            if (zzacvVar.d()) {
                return;
            } else {
                l = zzacvVar.l();
            }
        } while (l == this.b);
        this.d = l;
    }

    public zzacr K1() {
        o1(2);
        return ((zzacv) this.e).y();
    }

    public void L(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((mff) t7aVar).add(Long.valueOf(qo2Var.u()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int A = qo2Var.A();
        if ((A & 7) != 0) {
            throw new naa("Failed to parse the message.");
        }
        int b = qo2Var.b() + A;
        do {
            ((mff) t7aVar).add(Long.valueOf(qo2Var.u()));
        } while (qo2Var.b() < b);
    }

    public void L0(zzdp zzdpVar) {
        int e;
        zzcj zzcjVar = (zzcj) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                zzdpVar.add(Integer.valueOf(zzcjVar.r()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            this.d = e;
            return;
        }
        if (i != 2) {
            zzl.y();
            return;
        }
        int d = zzcjVar.d() + zzcjVar.r();
        do {
            zzdpVar.add(Integer.valueOf(zzcjVar.r()));
        } while (zzcjVar.d() < d);
        r1(d);
    }

    public void L1(zzdp zzdpVar) {
        int e;
        zzcj zzcjVar = (zzcj) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                zzdpVar.add(Double.valueOf(zzcjVar.g()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            this.d = e;
            return;
        }
        if (i != 2) {
            zzl.y();
            return;
        }
        int r = zzcjVar.r();
        z1(r);
        int d = zzcjVar.d() + r;
        do {
            zzdpVar.add(Double.valueOf(zzcjVar.g()));
        } while (zzcjVar.d() < d);
    }

    public void M(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((lff) s7aVar).add(Integer.valueOf(qo2Var.v()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((lff) s7aVar).add(Integer.valueOf(qo2Var.v()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void M0(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof aan;
        int i2 = this.b;
        if (z) {
            aan aanVar = (aan) ianVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int d = m8nVar.d() + m8nVar.t();
                do {
                    aanVar.g(m8nVar.t());
                } while (m8nVar.d() < d);
                r1(d);
                return;
            }
            do {
                aanVar.g(m8nVar.t());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int d2 = m8nVar.d() + m8nVar.t();
                do {
                    ianVar.add(Integer.valueOf(m8nVar.t()));
                } while (m8nVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                ianVar.add(Integer.valueOf(m8nVar.t()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void M1(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof u8n;
        int i2 = this.b;
        if (z) {
            u8n u8nVar = (u8n) ianVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int t = m8nVar.t();
                w1(t);
                int d = m8nVar.d() + t;
                do {
                    u8nVar.d(m8nVar.i());
                } while (m8nVar.d() < d);
                return;
            }
            do {
                u8nVar.d(m8nVar.i());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int t2 = m8nVar.t();
                w1(t2);
                int d2 = m8nVar.d() + t2;
                do {
                    ianVar.add(Double.valueOf(m8nVar.i()));
                } while (m8nVar.d() < d2);
                return;
            }
            do {
                ianVar.add(Double.valueOf(m8nVar.i()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void N(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mff) t7aVar).add(Integer.valueOf(qo2Var.v()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((mff) t7aVar).add(Integer.valueOf(qo2Var.v()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void N0(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof wpo;
        int i2 = this.b;
        if (z) {
            wpo wpoVar = (wpo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    hbo.e();
                    return;
                }
                int d = zziemVar.d() + zziemVar.x();
                do {
                    wpoVar.h(zziemVar.x());
                } while (zziemVar.d() < d);
                C1(d);
                return;
            }
            do {
                wpoVar.h(zziemVar.x());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    hbo.e();
                    return;
                }
                int d2 = zziemVar.d() + zziemVar.x();
                do {
                    zzifyVar.add(Integer.valueOf(zziemVar.x()));
                } while (zziemVar.d() < d2);
                C1(d2);
                return;
            }
            do {
                zzifyVar.add(Integer.valueOf(zziemVar.x()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public void N1(zzify zzifyVar) {
        int j;
        zziem zziemVar = (zziem) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                zzifyVar.add(Double.valueOf(zziemVar.m()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            this.d = j;
            return;
        }
        if (i != 2) {
            hbo.e();
            return;
        }
        int x = zziemVar.x();
        G1(x);
        int d = zziemVar.d() + x;
        do {
            zzifyVar.add(Double.valueOf(zziemVar.m()));
        } while (zziemVar.d() < d);
    }

    public void O(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((lff) s7aVar).add(Long.valueOf(qo2Var.w()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((lff) s7aVar).add(Long.valueOf(qo2Var.w()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void O0(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof tan;
        int i2 = this.b;
        if (z) {
            tan tanVar = (tan) zzaefVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.w();
                    return;
                }
                int e = zzacvVar.e() + zzacvVar.A();
                do {
                    tanVar.g(zzacvVar.A());
                } while (zzacvVar.e() < e);
                C1(e);
                return;
            }
            do {
                tanVar.g(zzacvVar.A());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.w();
                    return;
                }
                int e2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.A()));
                } while (zzacvVar.e() < e2);
                C1(e2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.A()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void O1(zzaef zzaefVar) {
        int l;
        zzacv zzacvVar = (zzacv) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                zzaefVar.add(Double.valueOf(zzacvVar.o()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            this.d = l;
            return;
        }
        if (i != 2) {
            zzl.w();
            return;
        }
        int A = zzacvVar.A();
        F1(A);
        int e = zzacvVar.e() + A;
        do {
            zzaefVar.add(Double.valueOf(zzacvVar.o()));
        } while (zzacvVar.e() < e);
    }

    public void P(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mff) t7aVar).add(Long.valueOf(qo2Var.w()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((mff) t7aVar).add(Long.valueOf(qo2Var.w()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void P0(zzdp zzdpVar) {
        int e;
        zzcj zzcjVar = (zzcj) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                zzdpVar.add(Integer.valueOf(zzcjVar.s()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            this.d = e;
            return;
        }
        if (i != 2) {
            zzl.y();
            return;
        }
        int d = zzcjVar.d() + zzcjVar.r();
        do {
            zzdpVar.add(Integer.valueOf(zzcjVar.s()));
        } while (zzcjVar.d() < d);
        r1(d);
    }

    public void P1(zzdp zzdpVar) {
        int e;
        int i;
        zzcj zzcjVar = (zzcj) this.e;
        boolean z = zzdpVar instanceof txn;
        int i2 = this.b;
        if (z) {
            txn txnVar = (txn) zzdpVar;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int r = zzcjVar.r();
                v1(r);
                int d = zzcjVar.d() + r;
                do {
                    txnVar.d(zzcjVar.h());
                } while (zzcjVar.d() < d);
                return;
            }
            if (i3 != 5) {
                zzl.y();
                return;
            }
            do {
                txnVar.d(zzcjVar.h());
                if (zzcjVar.c()) {
                    return;
                } else {
                    i = zzcjVar.e();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int r2 = zzcjVar.r();
                v1(r2);
                int d2 = zzcjVar.d() + r2;
                do {
                    zzdpVar.add(Float.valueOf(zzcjVar.h()));
                } while (zzcjVar.d() < d2);
                return;
            }
            if (i4 != 5) {
                zzl.y();
                return;
            }
            do {
                zzdpVar.add(Float.valueOf(zzcjVar.h()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            i = e;
        }
        this.d = i;
    }

    public void Q(s7a s7aVar, boolean z) {
        String x;
        int z2;
        qo2 qo2Var = (qo2) this.e;
        if ((this.b & 7) != 2) {
            throw maa.g();
        }
        do {
            if (z) {
                Z(2);
                x = qo2Var.y();
            } else {
                Z(2);
                x = qo2Var.x();
            }
            ((lff) s7aVar).add(x);
            if (qo2Var.c()) {
                return;
            } else {
                z2 = qo2Var.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    public void Q0(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof aan;
        int i2 = this.b;
        if (z) {
            aan aanVar = (aan) ianVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int d = m8nVar.d() + m8nVar.t();
                do {
                    aanVar.g(m8nVar.u());
                } while (m8nVar.d() < d);
                r1(d);
                return;
            }
            do {
                aanVar.g(m8nVar.u());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int d2 = m8nVar.d() + m8nVar.t();
                do {
                    ianVar.add(Integer.valueOf(m8nVar.u()));
                } while (m8nVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                ianVar.add(Integer.valueOf(m8nVar.u()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void Q1(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof l9n;
        int i2 = this.b;
        if (z) {
            l9n l9nVar = (l9n) ianVar;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int t = m8nVar.t();
                u1(t);
                int d = m8nVar.d() + t;
                do {
                    l9nVar.d(m8nVar.j());
                } while (m8nVar.d() < d);
                return;
            }
            if (i3 != 5) {
                zzl.u();
                return;
            }
            do {
                l9nVar.d(m8nVar.j());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int t2 = m8nVar.t();
                u1(t2);
                int d2 = m8nVar.d() + t2;
                do {
                    ianVar.add(Float.valueOf(m8nVar.j()));
                } while (m8nVar.d() < d2);
                return;
            }
            if (i4 != 5) {
                zzl.u();
                return;
            }
            do {
                ianVar.add(Float.valueOf(m8nVar.j()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void R(t7a t7aVar, boolean z) {
        String x;
        int z2;
        qo2 qo2Var = (qo2) this.e;
        if ((this.b & 7) != 2) {
            throw naa.g();
        }
        do {
            if (z) {
                Z(2);
                x = qo2Var.y();
            } else {
                Z(2);
                x = qo2Var.x();
            }
            ((mff) t7aVar).add(x);
            if (qo2Var.c()) {
                return;
            } else {
                z2 = qo2Var.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    public void R0(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof wpo;
        int i2 = this.b;
        if (z) {
            wpo wpoVar = (wpo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    hbo.e();
                    return;
                }
                int d = zziemVar.d() + zziemVar.x();
                do {
                    wpoVar.h(zziemVar.y());
                } while (zziemVar.d() < d);
                C1(d);
                return;
            }
            do {
                wpoVar.h(zziemVar.y());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    hbo.e();
                    return;
                }
                int d2 = zziemVar.d() + zziemVar.x();
                do {
                    zzifyVar.add(Integer.valueOf(zziemVar.y()));
                } while (zziemVar.d() < d2);
                C1(d2);
                return;
            }
            do {
                zzifyVar.add(Integer.valueOf(zziemVar.y()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public void R1(zzify zzifyVar) {
        int j;
        zziem zziemVar = (zziem) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int x = zziemVar.x();
            E1(x);
            int d = zziemVar.d() + x;
            do {
                zzifyVar.add(Float.valueOf(zziemVar.n()));
            } while (zziemVar.d() < d);
            return;
        }
        if (i != 5) {
            hbo.e();
            return;
        }
        do {
            zzifyVar.add(Float.valueOf(zziemVar.n()));
            if (zziemVar.c()) {
                return;
            } else {
                j = zziemVar.j();
            }
        } while (j == this.b);
        this.d = j;
    }

    public void S(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((lff) s7aVar).add(Integer.valueOf(qo2Var.A()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((lff) s7aVar).add(Integer.valueOf(qo2Var.A()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void S0(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof tan;
        int i2 = this.b;
        if (z) {
            tan tanVar = (tan) zzaefVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.w();
                    return;
                }
                int e = zzacvVar.e() + zzacvVar.A();
                do {
                    tanVar.g(zzacvVar.B());
                } while (zzacvVar.e() < e);
                C1(e);
                return;
            }
            do {
                tanVar.g(zzacvVar.B());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.w();
                    return;
                }
                int e2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.B()));
                } while (zzacvVar.e() < e2);
                C1(e2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.B()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void S1(zzaef zzaefVar) {
        int l;
        zzacv zzacvVar = (zzacv) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = zzacvVar.A();
            D1(A);
            int e = zzacvVar.e() + A;
            do {
                zzaefVar.add(Float.valueOf(zzacvVar.p()));
            } while (zzacvVar.e() < e);
            return;
        }
        if (i != 5) {
            zzl.w();
            return;
        }
        do {
            zzaefVar.add(Float.valueOf(zzacvVar.p()));
            if (zzacvVar.d()) {
                return;
            } else {
                l = zzacvVar.l();
            }
        } while (l == this.b);
        this.d = l;
    }

    public void T(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mff) t7aVar).add(Integer.valueOf(qo2Var.A()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((mff) t7aVar).add(Integer.valueOf(qo2Var.A()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void T0(zzdp zzdpVar) {
        int e;
        zzcj zzcjVar = (zzcj) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int r = zzcjVar.r();
            v1(r);
            int d = zzcjVar.d() + r;
            do {
                zzdpVar.add(Integer.valueOf(zzcjVar.t()));
            } while (zzcjVar.d() < d);
            return;
        }
        if (i != 5) {
            zzl.y();
            return;
        }
        do {
            zzdpVar.add(Integer.valueOf(zzcjVar.t()));
            if (zzcjVar.c()) {
                return;
            } else {
                e = zzcjVar.e();
            }
        } while (e == this.b);
        this.d = e;
    }

    public void T1(zzdp zzdpVar) {
        int e;
        int i;
        zzcj zzcjVar = (zzcj) this.e;
        boolean z = zzdpVar instanceof k2o;
        int i2 = this.b;
        if (z) {
            k2o k2oVar = (k2o) zzdpVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.y();
                    return;
                }
                int d = zzcjVar.d() + zzcjVar.r();
                do {
                    k2oVar.e(zzcjVar.i());
                } while (zzcjVar.d() < d);
                r1(d);
                return;
            }
            do {
                k2oVar.e(zzcjVar.i());
                if (zzcjVar.c()) {
                    return;
                } else {
                    i = zzcjVar.e();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.y();
                    return;
                }
                int d2 = zzcjVar.d() + zzcjVar.r();
                do {
                    zzdpVar.add(Long.valueOf(zzcjVar.i()));
                } while (zzcjVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                zzdpVar.add(Long.valueOf(zzcjVar.i()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            i = e;
        }
        this.d = i;
    }

    public void U(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((lff) s7aVar).add(Long.valueOf(qo2Var.B()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((lff) s7aVar).add(Long.valueOf(qo2Var.B()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void U0(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof aan;
        int i2 = this.b;
        if (z) {
            aan aanVar = (aan) ianVar;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int t = m8nVar.t();
                u1(t);
                int d = m8nVar.d() + t;
                do {
                    aanVar.g(m8nVar.v());
                } while (m8nVar.d() < d);
                return;
            }
            if (i3 != 5) {
                zzl.u();
                return;
            }
            do {
                aanVar.g(m8nVar.v());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int t2 = m8nVar.t();
                u1(t2);
                int d2 = m8nVar.d() + t2;
                do {
                    ianVar.add(Integer.valueOf(m8nVar.v()));
                } while (m8nVar.d() < d2);
                return;
            }
            if (i4 != 5) {
                zzl.u();
                return;
            }
            do {
                ianVar.add(Integer.valueOf(m8nVar.v()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void U1(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof zan;
        int i2 = this.b;
        if (z) {
            zan zanVar = (zan) ianVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int d = m8nVar.d() + m8nVar.t();
                do {
                    zanVar.e(m8nVar.k());
                } while (m8nVar.d() < d);
                r1(d);
                return;
            }
            do {
                zanVar.e(m8nVar.k());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int d2 = m8nVar.d() + m8nVar.t();
                do {
                    ianVar.add(Long.valueOf(m8nVar.k()));
                } while (m8nVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                ianVar.add(Long.valueOf(m8nVar.k()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void V(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mff) t7aVar).add(Long.valueOf(qo2Var.B()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((mff) t7aVar).add(Long.valueOf(qo2Var.B()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void V0(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof wpo;
        int i2 = this.b;
        if (z) {
            wpo wpoVar = (wpo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int x = zziemVar.x();
                E1(x);
                int d = zziemVar.d() + x;
                do {
                    wpoVar.h(zziemVar.z());
                } while (zziemVar.d() < d);
                return;
            }
            if (i3 != 5) {
                hbo.e();
                return;
            }
            do {
                wpoVar.h(zziemVar.z());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int x2 = zziemVar.x();
                E1(x2);
                int d2 = zziemVar.d() + x2;
                do {
                    zzifyVar.add(Integer.valueOf(zziemVar.z()));
                } while (zziemVar.d() < d2);
                return;
            }
            if (i4 != 5) {
                hbo.e();
                return;
            }
            do {
                zzifyVar.add(Integer.valueOf(zziemVar.z()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public void V1(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof cqo;
        int i2 = this.b;
        if (z) {
            cqo cqoVar = (cqo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    hbo.e();
                    return;
                }
                int d = zziemVar.d() + zziemVar.x();
                do {
                    cqoVar.l(zziemVar.o());
                } while (zziemVar.d() < d);
                C1(d);
                return;
            }
            do {
                cqoVar.l(zziemVar.o());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    hbo.e();
                    return;
                }
                int d2 = zziemVar.d() + zziemVar.x();
                do {
                    zzifyVar.add(Long.valueOf(zziemVar.o()));
                } while (zziemVar.d() < d2);
                C1(d2);
                return;
            }
            do {
                zzifyVar.add(Long.valueOf(zziemVar.o()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public synchronized void W(c78 c78Var) {
        while (c78Var != null) {
            ap[] apVarArr = (ap[]) this.e;
            int i = this.d;
            this.d = i + 1;
            ap apVar = (ap) c78Var.d;
            apVar.getClass();
            apVarArr[i] = apVar;
            this.c--;
            c78Var = (c78) c78Var.e;
            if (c78Var == null || ((ap) c78Var.d) == null) {
                c78Var = null;
            }
        }
    }

    public void W0(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof tan;
        int i2 = this.b;
        if (z) {
            tan tanVar = (tan) zzaefVar;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int A = zzacvVar.A();
                D1(A);
                int e = zzacvVar.e() + A;
                do {
                    tanVar.g(zzacvVar.C());
                } while (zzacvVar.e() < e);
                return;
            }
            if (i3 != 5) {
                zzl.w();
                return;
            }
            do {
                tanVar.g(zzacvVar.C());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int A2 = zzacvVar.A();
                D1(A2);
                int e2 = zzacvVar.e() + A2;
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.C()));
                } while (zzacvVar.e() < e2);
                return;
            }
            if (i4 != 5) {
                zzl.w();
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.C()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void W1(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof hcn;
        int i2 = this.b;
        if (z) {
            hcn hcnVar = (hcn) zzaefVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.w();
                    return;
                }
                int e = zzacvVar.e() + zzacvVar.A();
                do {
                    hcnVar.d(zzacvVar.q());
                } while (zzacvVar.e() < e);
                C1(e);
                return;
            }
            do {
                hcnVar.d(zzacvVar.q());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.w();
                    return;
                }
                int e2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.q()));
                } while (zzacvVar.e() < e2);
                C1(e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.q()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void X(int i, int i2, Object[] objArr) {
        int i3;
        Object obj;
        this.c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * (-1640531527);
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i > i3) {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < i5 && i5 <= i3) {
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public void X0(zzdp zzdpVar) {
        int e;
        int i;
        zzcj zzcjVar = (zzcj) this.e;
        boolean z = zzdpVar instanceof k2o;
        int i2 = this.b;
        if (z) {
            k2o k2oVar = (k2o) zzdpVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    zzl.y();
                    return;
                }
                int r = zzcjVar.r();
                z1(r);
                int d = zzcjVar.d() + r;
                do {
                    k2oVar.e(zzcjVar.u());
                } while (zzcjVar.d() < d);
                return;
            }
            do {
                k2oVar.e(zzcjVar.u());
                if (zzcjVar.c()) {
                    return;
                } else {
                    i = zzcjVar.e();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    zzl.y();
                    return;
                }
                int r2 = zzcjVar.r();
                z1(r2);
                int d2 = zzcjVar.d() + r2;
                do {
                    zzdpVar.add(Long.valueOf(zzcjVar.u()));
                } while (zzcjVar.d() < d2);
                return;
            }
            do {
                zzdpVar.add(Long.valueOf(zzcjVar.u()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            i = e;
        }
        this.d = i;
    }

    public void X1(zzdp zzdpVar) {
        int e;
        int i;
        zzcj zzcjVar = (zzcj) this.e;
        boolean z = zzdpVar instanceof k2o;
        int i2 = this.b;
        if (z) {
            k2o k2oVar = (k2o) zzdpVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.y();
                    return;
                }
                int d = zzcjVar.d() + zzcjVar.r();
                do {
                    k2oVar.e(zzcjVar.j());
                } while (zzcjVar.d() < d);
                r1(d);
                return;
            }
            do {
                k2oVar.e(zzcjVar.j());
                if (zzcjVar.c()) {
                    return;
                } else {
                    i = zzcjVar.e();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.y();
                    return;
                }
                int d2 = zzcjVar.d() + zzcjVar.r();
                do {
                    zzdpVar.add(Long.valueOf(zzcjVar.j()));
                } while (zzcjVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                zzdpVar.add(Long.valueOf(zzcjVar.j()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            i = e;
        }
        this.d = i;
    }

    public void Y(int i) {
        switch (this.a) {
            case 2:
                if (((qo2) this.e).b() != i) {
                    throw maa.j();
                }
                return;
            default:
                if (((qo2) this.e).b() != i) {
                    throw naa.j();
                }
                return;
        }
    }

    public void Y0(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof zan;
        int i2 = this.b;
        if (z) {
            zan zanVar = (zan) ianVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int t = m8nVar.t();
                w1(t);
                int d = m8nVar.d() + t;
                do {
                    zanVar.e(m8nVar.w());
                } while (m8nVar.d() < d);
                return;
            }
            do {
                zanVar.e(m8nVar.w());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int t2 = m8nVar.t();
                w1(t2);
                int d2 = m8nVar.d() + t2;
                do {
                    ianVar.add(Long.valueOf(m8nVar.w()));
                } while (m8nVar.d() < d2);
                return;
            }
            do {
                ianVar.add(Long.valueOf(m8nVar.w()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void Y1(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof zan;
        int i2 = this.b;
        if (z) {
            zan zanVar = (zan) ianVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int d = m8nVar.d() + m8nVar.t();
                do {
                    zanVar.e(m8nVar.l());
                } while (m8nVar.d() < d);
                r1(d);
                return;
            }
            do {
                zanVar.e(m8nVar.l());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int d2 = m8nVar.d() + m8nVar.t();
                do {
                    ianVar.add(Long.valueOf(m8nVar.l()));
                } while (m8nVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                ianVar.add(Long.valueOf(m8nVar.l()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void Z(int i) {
        switch (this.a) {
            case 2:
                if ((this.b & 7) != i) {
                    throw maa.g();
                }
                return;
            default:
                if ((this.b & 7) != i) {
                    throw naa.g();
                }
                return;
        }
    }

    public void Z0(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof cqo;
        int i2 = this.b;
        if (z) {
            cqo cqoVar = (cqo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    hbo.e();
                    return;
                }
                int x = zziemVar.x();
                G1(x);
                int d = zziemVar.d() + x;
                do {
                    cqoVar.l(zziemVar.A());
                } while (zziemVar.d() < d);
                return;
            }
            do {
                cqoVar.l(zziemVar.A());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    hbo.e();
                    return;
                }
                int x2 = zziemVar.x();
                G1(x2);
                int d2 = zziemVar.d() + x2;
                do {
                    zzifyVar.add(Long.valueOf(zziemVar.A()));
                } while (zziemVar.d() < d2);
                return;
            }
            do {
                zzifyVar.add(Long.valueOf(zziemVar.A()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public void a(Object obj) {
        Object obj2;
        Object obj3;
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        int hashCode = obj.hashCode() * (-1640531527);
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        Object obj4 = objArr[i2];
        if (obj4 != null) {
            if (obj4.equals(obj)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj3 = objArr[i2];
                if (obj3 == null) {
                }
            } while (!obj3.equals(obj));
            return;
        }
        objArr[i2] = obj;
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 < this.d) {
            return;
        }
        Object[] objArr2 = (Object[]) this.e;
        int length = objArr2.length;
        int i4 = length << 1;
        int i5 = i4 - 1;
        Object[] objArr3 = new Object[i4];
        while (true) {
            int i6 = i3 - 1;
            if (i3 == 0) {
                this.b = i5;
                this.d = (int) (i4 * 0.75f);
                this.e = objArr3;
                return;
            }
            do {
                length--;
                obj2 = objArr2[length];
            } while (obj2 == null);
            int hashCode2 = obj2.hashCode() * (-1640531527);
            int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
            if (objArr3[i7] != null) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (objArr3[i7] != null);
            }
            objArr3[i7] = objArr2[length];
            i3 = i6;
        }
    }

    public synchronized void a0(int i) {
        int i2 = this.a;
        synchronized (this) {
            switch (i2) {
                case 4:
                    boolean z = i < this.b;
                    this.b = i;
                    if (z) {
                        c0();
                    }
                    return;
                default:
                    boolean z2 = i < this.b;
                    this.b = i;
                    if (z2) {
                        c0();
                    }
                    return;
            }
        }
    }

    public void a1(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof hcn;
        int i2 = this.b;
        if (z) {
            hcn hcnVar = (hcn) zzaefVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    zzl.w();
                    return;
                }
                int A = zzacvVar.A();
                F1(A);
                int e = zzacvVar.e() + A;
                do {
                    hcnVar.d(zzacvVar.D());
                } while (zzacvVar.e() < e);
                return;
            }
            do {
                hcnVar.d(zzacvVar.D());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    zzl.w();
                    return;
                }
                int A2 = zzacvVar.A();
                F1(A2);
                int e2 = zzacvVar.e() + A2;
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.D()));
                } while (zzacvVar.e() < e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.D()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void b(int i) {
        int[] iArr = (int[]) this.e;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy((int[]) this.e, 0, iArr2, i5, this.b);
            this.e = iArr2;
            this.b = 0;
            this.c = length;
            this.d = i6 - 1;
        }
    }

    public boolean b0() {
        int i;
        qo2 qo2Var = (qo2) this.e;
        if (qo2Var.c() || (i = this.b) == this.c) {
            return false;
        }
        return qo2Var.D(i);
    }

    public void b1(zzdp zzdpVar) {
        int e;
        zzcj zzcjVar = (zzcj) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                zzdpVar.add(Integer.valueOf(zzcjVar.v()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            this.d = e;
            return;
        }
        if (i != 2) {
            zzl.y();
            return;
        }
        int d = zzcjVar.d() + zzcjVar.r();
        do {
            zzdpVar.add(Integer.valueOf(zzcjVar.v()));
        } while (zzcjVar.d() < d);
        r1(d);
    }

    public synchronized ap c() {
        ap apVar;
        try {
            int i = this.c + 1;
            this.c = i;
            int i2 = this.d;
            if (i2 > 0) {
                ap[] apVarArr = (ap[]) this.e;
                int i3 = i2 - 1;
                this.d = i3;
                apVar = apVarArr[i3];
                apVar.getClass();
                ((ap[]) this.e)[this.d] = null;
            } else {
                ap apVar2 = new ap(new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
                ap[] apVarArr2 = (ap[]) this.e;
                if (i > apVarArr2.length) {
                    this.e = (ap[]) Arrays.copyOf(apVarArr2, apVarArr2.length * 2);
                }
                apVar = apVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return apVar;
    }

    public synchronized void c0() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 4:
                    int max = Math.max(0, lik.f(this.b, C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.c);
                    int i2 = this.d;
                    if (max >= i2) {
                        return;
                    }
                    Arrays.fill((zo[]) this.e, max, i2, (Object) null);
                    this.d = max;
                    return;
                default:
                    int max2 = Math.max(0, nik.g(this.b, C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.c);
                    int i3 = this.d;
                    if (max2 >= i3) {
                        return;
                    }
                    Arrays.fill((ap[]) this.e, max2, i3, (Object) null);
                    this.d = max2;
                    return;
            }
        }
    }

    public void c1(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof aan;
        int i2 = this.b;
        if (z) {
            aan aanVar = (aan) ianVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int d = m8nVar.d() + m8nVar.t();
                do {
                    aanVar.g(m8nVar.x());
                } while (m8nVar.d() < d);
                r1(d);
                return;
            }
            do {
                aanVar.g(m8nVar.x());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int d2 = m8nVar.d() + m8nVar.t();
                do {
                    ianVar.add(Integer.valueOf(m8nVar.x()));
                } while (m8nVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                ianVar.add(Integer.valueOf(m8nVar.x()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public v2h d(int i) {
        return new v2h(bea.z((aej) this.e, i), i, 1L);
    }

    public void d0(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof cqo;
        int i2 = this.b;
        if (z) {
            cqo cqoVar = (cqo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    hbo.e();
                    return;
                }
                int d = zziemVar.d() + zziemVar.x();
                do {
                    cqoVar.l(zziemVar.p());
                } while (zziemVar.d() < d);
                C1(d);
                return;
            }
            do {
                cqoVar.l(zziemVar.p());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    hbo.e();
                    return;
                }
                int d2 = zziemVar.d() + zziemVar.x();
                do {
                    zzifyVar.add(Long.valueOf(zziemVar.p()));
                } while (zziemVar.d() < d2);
                C1(d2);
                return;
            }
            do {
                zzifyVar.add(Long.valueOf(zziemVar.p()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public void d1(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof wpo;
        int i2 = this.b;
        if (z) {
            wpo wpoVar = (wpo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    hbo.e();
                    return;
                }
                int d = zziemVar.d() + zziemVar.x();
                do {
                    wpoVar.h(zziemVar.B());
                } while (zziemVar.d() < d);
                C1(d);
                return;
            }
            do {
                wpoVar.h(zziemVar.B());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    hbo.e();
                    return;
                }
                int d2 = zziemVar.d() + zziemVar.x();
                do {
                    zzifyVar.add(Integer.valueOf(zziemVar.B()));
                } while (zziemVar.d() < d2);
                C1(d2);
                return;
            }
            do {
                zzifyVar.add(Integer.valueOf(zziemVar.B()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public a01 e() {
        return ((a01[]) this.e)[this.b];
    }

    public void e0(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof hcn;
        int i2 = this.b;
        if (z) {
            hcn hcnVar = (hcn) zzaefVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.w();
                    return;
                }
                int e = zzacvVar.e() + zzacvVar.A();
                do {
                    hcnVar.d(zzacvVar.r());
                } while (zzacvVar.e() < e);
                C1(e);
                return;
            }
            do {
                hcnVar.d(zzacvVar.r());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.w();
                    return;
                }
                int e2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.r()));
                } while (zzacvVar.e() < e2);
                C1(e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.r()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void e1(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof tan;
        int i2 = this.b;
        if (z) {
            tan tanVar = (tan) zzaefVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.w();
                    return;
                }
                int e = zzacvVar.e() + zzacvVar.A();
                do {
                    tanVar.g(zzacvVar.E());
                } while (zzacvVar.e() < e);
                C1(e);
                return;
            }
            do {
                tanVar.g(zzacvVar.E());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.w();
                    return;
                }
                int e2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.E()));
                } while (zzacvVar.e() < e2);
                C1(e2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.E()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public int f() {
        switch (this.a) {
            case 2:
                int i = this.d;
                if (i != 0) {
                    this.b = i;
                    this.d = 0;
                } else {
                    i = ((qo2) this.e).z();
                    this.b = i;
                }
                if (i == 0 || i == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i >>> 3;
            default:
                int i2 = this.d;
                if (i2 != 0) {
                    this.b = i2;
                    this.d = 0;
                } else {
                    i2 = ((qo2) this.e).z();
                    this.b = i2;
                }
                if (i2 == 0 || i2 == this.c) {
                    return Integer.MAX_VALUE;
                }
                return i2 >>> 3;
        }
    }

    public void f0(zzdp zzdpVar) {
        int e;
        zzcj zzcjVar = (zzcj) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                zzdpVar.add(Integer.valueOf(zzcjVar.k()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            this.d = e;
            return;
        }
        if (i != 2) {
            zzl.y();
            return;
        }
        int d = zzcjVar.d() + zzcjVar.r();
        do {
            zzdpVar.add(Integer.valueOf(zzcjVar.k()));
        } while (zzcjVar.d() < d);
        r1(d);
    }

    public void f1(zzdp zzdpVar) {
        int e;
        int i;
        zzcj zzcjVar = (zzcj) this.e;
        boolean z = zzdpVar instanceof k2o;
        int i2 = this.b;
        if (z) {
            k2o k2oVar = (k2o) zzdpVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.y();
                    return;
                }
                int d = zzcjVar.d() + zzcjVar.r();
                do {
                    k2oVar.e(zzcjVar.w());
                } while (zzcjVar.d() < d);
                r1(d);
                return;
            }
            do {
                k2oVar.e(zzcjVar.w());
                if (zzcjVar.c()) {
                    return;
                } else {
                    i = zzcjVar.e();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.y();
                    return;
                }
                int d2 = zzcjVar.d() + zzcjVar.r();
                do {
                    zzdpVar.add(Long.valueOf(zzcjVar.w()));
                } while (zzcjVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                zzdpVar.add(Long.valueOf(zzcjVar.w()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            i = e;
        }
        this.d = i;
    }

    public int g(int i) {
        return ((evd) this.e).e[this.c + i];
    }

    public void g0(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof aan;
        int i2 = this.b;
        if (z) {
            aan aanVar = (aan) ianVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int d = m8nVar.d() + m8nVar.t();
                do {
                    aanVar.g(m8nVar.m());
                } while (m8nVar.d() < d);
                r1(d);
                return;
            }
            do {
                aanVar.g(m8nVar.m());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int d2 = m8nVar.d() + m8nVar.t();
                do {
                    ianVar.add(Integer.valueOf(m8nVar.m()));
                } while (m8nVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                ianVar.add(Integer.valueOf(m8nVar.m()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void g1(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof zan;
        int i2 = this.b;
        if (z) {
            zan zanVar = (zan) ianVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int d = m8nVar.d() + m8nVar.t();
                do {
                    zanVar.e(m8nVar.y());
                } while (m8nVar.d() < d);
                r1(d);
                return;
            }
            do {
                zanVar.e(m8nVar.y());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int d2 = m8nVar.d() + m8nVar.t();
                do {
                    ianVar.add(Long.valueOf(m8nVar.y()));
                } while (m8nVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                ianVar.add(Long.valueOf(m8nVar.y()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public Object h(int i) {
        return ((evd) this.e).g[this.d + i];
    }

    public void h0(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof wpo;
        int i2 = this.b;
        if (z) {
            wpo wpoVar = (wpo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    hbo.e();
                    return;
                }
                int d = zziemVar.d() + zziemVar.x();
                do {
                    wpoVar.h(zziemVar.q());
                } while (zziemVar.d() < d);
                C1(d);
                return;
            }
            do {
                wpoVar.h(zziemVar.q());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    hbo.e();
                    return;
                }
                int d2 = zziemVar.d() + zziemVar.x();
                do {
                    zzifyVar.add(Integer.valueOf(zziemVar.q()));
                } while (zziemVar.d() < d2);
                C1(d2);
                return;
            }
            do {
                zzifyVar.add(Integer.valueOf(zziemVar.q()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public void h1(int i) {
        switch (this.a) {
            case 10:
                if ((this.b & 7) != i) {
                    zzl.u();
                    break;
                }
                break;
            default:
                if ((this.b & 7) != i) {
                    zzl.y();
                    break;
                }
                break;
        }
    }

    public byte[][] i(int i, int i2) {
        int i3 = this.c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, this.d * i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            byte[] bArr2 = ((a01[]) this.e)[i4 / i2].a;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = bArr2[i6 / i];
            }
            bArr[i5] = bArr3;
        }
        return bArr;
    }

    public void i0(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof tan;
        int i2 = this.b;
        if (z) {
            tan tanVar = (tan) zzaefVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.w();
                    return;
                }
                int e = zzacvVar.e() + zzacvVar.A();
                do {
                    tanVar.g(zzacvVar.s());
                } while (zzacvVar.e() < e);
                C1(e);
                return;
            }
            do {
                tanVar.g(zzacvVar.s());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.w();
                    return;
                }
                int e2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.s()));
                } while (zzacvVar.e() < e2);
                C1(e2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.s()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void i1(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof cqo;
        int i2 = this.b;
        if (z) {
            cqo cqoVar = (cqo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    hbo.e();
                    return;
                }
                int d = zziemVar.d() + zziemVar.x();
                do {
                    cqoVar.l(zziemVar.C());
                } while (zziemVar.d() < d);
                C1(d);
                return;
            }
            do {
                cqoVar.l(zziemVar.C());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    hbo.e();
                    return;
                }
                int d2 = zziemVar.d() + zziemVar.x();
                do {
                    zzifyVar.add(Long.valueOf(zziemVar.C()));
                } while (zziemVar.d() < d2);
                C1(d2);
                return;
            }
            do {
                zzifyVar.add(Long.valueOf(zziemVar.C()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public void j(Object obj, usg usgVar, nk6 nk6Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            usgVar.e(obj, this, nk6Var);
            if (this.b == this.c) {
            } else {
                throw new maa("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public void j0(zzdp zzdpVar) {
        int e;
        int i;
        zzcj zzcjVar = (zzcj) this.e;
        boolean z = zzdpVar instanceof k2o;
        int i2 = this.b;
        if (z) {
            k2o k2oVar = (k2o) zzdpVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    zzl.y();
                    return;
                }
                int r = zzcjVar.r();
                z1(r);
                int d = zzcjVar.d() + r;
                do {
                    k2oVar.e(zzcjVar.l());
                } while (zzcjVar.d() < d);
                return;
            }
            do {
                k2oVar.e(zzcjVar.l());
                if (zzcjVar.c()) {
                    return;
                } else {
                    i = zzcjVar.e();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    zzl.y();
                    return;
                }
                int r2 = zzcjVar.r();
                z1(r2);
                int d2 = zzcjVar.d() + r2;
                do {
                    zzdpVar.add(Long.valueOf(zzcjVar.l()));
                } while (zzcjVar.d() < d2);
                return;
            }
            do {
                zzdpVar.add(Long.valueOf(zzcjVar.l()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            i = e;
        }
        this.d = i;
    }

    public void j1(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof hcn;
        int i2 = this.b;
        if (z) {
            hcn hcnVar = (hcn) zzaefVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.w();
                    return;
                }
                int e = zzacvVar.e() + zzacvVar.A();
                do {
                    hcnVar.d(zzacvVar.F());
                } while (zzacvVar.e() < e);
                C1(e);
                return;
            }
            do {
                hcnVar.d(zzacvVar.F());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.w();
                    return;
                }
                int e2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.F()));
                } while (zzacvVar.e() < e2);
                C1(e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.F()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void k(Object obj, wsg wsgVar, ok6 ok6Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            wsgVar.h(obj, this, ok6Var);
            if (this.b == this.c) {
            } else {
                throw new naa("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public void k0(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof zan;
        int i2 = this.b;
        if (z) {
            zan zanVar = (zan) ianVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int t = m8nVar.t();
                w1(t);
                int d = m8nVar.d() + t;
                do {
                    zanVar.e(m8nVar.n());
                } while (m8nVar.d() < d);
                return;
            }
            do {
                zanVar.e(m8nVar.n());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int t2 = m8nVar.t();
                w1(t2);
                int d2 = m8nVar.d() + t2;
                do {
                    ianVar.add(Long.valueOf(m8nVar.n()));
                } while (m8nVar.d() < d2);
                return;
            }
            do {
                ianVar.add(Long.valueOf(m8nVar.n()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        r1.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k1(zzigq zzigqVar, h5o h5oVar, zziew zziewVar) {
        int i;
        boolean z;
        int i2;
        o1(2);
        zziem zziemVar = (zziem) this.e;
        int a = zziemVar.a(zziemVar.x());
        Object obj = h5oVar.c;
        Object obj2 = "";
        Object obj3 = obj;
        while (true) {
            try {
                int H1 = H1();
                if (H1 == Integer.MAX_VALUE || zziemVar.c()) {
                    break;
                }
                boolean z2 = false;
                if (H1 == 1) {
                    obj2 = A1((zziin) h5oVar.a, null, null);
                } else if (H1 != 2) {
                    try {
                        if (!zziemVar.c() && (i2 = this.b) != this.c) {
                            z = zziemVar.l(i2);
                            if (z) {
                                throw new zzige("Unable to parse map entry.");
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    } catch (zzigd e) {
                        if (!zziemVar.c() && (i = this.b) != this.c) {
                            z2 = zziemVar.l(i);
                        }
                        throw new zzige("Unable to parse map entry.", e);
                    }
                } else {
                    obj3 = A1((zziin) h5oVar.b, obj.getClass(), zziewVar);
                }
            } catch (Throwable th) {
                zziemVar.b(a);
                throw th;
            }
        }
    }

    public void l(Object obj, usg usgVar, nk6 nk6Var) {
        qo2 qo2Var = (qo2) this.e;
        int A = qo2Var.A();
        if (qo2Var.a >= 100) {
            throw new maa("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = qo2Var.i(A);
        qo2Var.a++;
        usgVar.e(obj, this, nk6Var);
        qo2Var.a(0);
        qo2Var.a--;
        qo2Var.h(i);
    }

    public void l0(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof cqo;
        int i2 = this.b;
        if (z) {
            cqo cqoVar = (cqo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    hbo.e();
                    return;
                }
                int x = zziemVar.x();
                G1(x);
                int d = zziemVar.d() + x;
                do {
                    cqoVar.l(zziemVar.r());
                } while (zziemVar.d() < d);
                return;
            }
            do {
                cqoVar.l(zziemVar.r());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    hbo.e();
                    return;
                }
                int x2 = zziemVar.x();
                G1(x2);
                int d2 = zziemVar.d() + x2;
                do {
                    zzifyVar.add(Long.valueOf(zziemVar.r()));
                } while (zziemVar.d() < d2);
                return;
            }
            do {
                zzifyVar.add(Long.valueOf(zziemVar.r()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        r1.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l1(zzaew zzaewVar, l2a l2aVar, zzadf zzadfVar) {
        int i;
        boolean z;
        int i2;
        o1(2);
        zzacv zzacvVar = (zzacv) this.e;
        int a = zzacvVar.a(zzacvVar.A());
        Object obj = l2aVar.d;
        Object obj2 = "";
        Object obj3 = obj;
        while (true) {
            try {
                int H1 = H1();
                if (H1 == Integer.MAX_VALUE || zzacvVar.d()) {
                    break;
                }
                boolean z2 = false;
                if (H1 == 1) {
                    obj2 = B1((zzagm) l2aVar.b, null, null);
                } else if (H1 != 2) {
                    try {
                        if (!zzacvVar.d() && (i2 = this.b) != this.c) {
                            z = zzacvVar.n(i2);
                            if (z) {
                                throw new zzaeh("Unable to parse map entry.");
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    } catch (zzaeg e) {
                        if (!zzacvVar.d() && (i = this.b) != this.c) {
                            z2 = zzacvVar.n(i);
                        }
                        throw new zzaeh("Unable to parse map entry.", e);
                    }
                } else {
                    obj3 = B1((zzagm) l2aVar.c, obj.getClass(), zzadfVar);
                }
            } catch (Throwable th) {
                zzacvVar.b(a);
                throw th;
            }
        }
    }

    public void m(Object obj, wsg wsgVar, ok6 ok6Var) {
        qo2 qo2Var = (qo2) this.e;
        int A = qo2Var.A();
        if (qo2Var.a >= 100) {
            throw new naa("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i = qo2Var.i(A);
        qo2Var.a++;
        wsgVar.h(obj, this, ok6Var);
        qo2Var.a(0);
        qo2Var.a--;
        qo2Var.h(i);
    }

    public void m0(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof hcn;
        int i2 = this.b;
        if (z) {
            hcn hcnVar = (hcn) zzaefVar;
            int i3 = i2 & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    zzl.w();
                    return;
                }
                int A = zzacvVar.A();
                F1(A);
                int e = zzacvVar.e() + A;
                do {
                    hcnVar.d(zzacvVar.t());
                } while (zzacvVar.e() < e);
                return;
            }
            do {
                hcnVar.d(zzacvVar.t());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    zzl.w();
                    return;
                }
                int A2 = zzacvVar.A();
                F1(A2);
                int e2 = zzacvVar.e() + A2;
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.t()));
                } while (zzacvVar.e() < e2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.t()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void m1(Object obj, pcn pcnVar, z8n z8nVar) {
        m8n m8nVar = (m8n) this.e;
        int t = m8nVar.t();
        if (m8nVar.a >= 100) {
            hbo.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int a = m8nVar.a(t);
        m8nVar.a++;
        pcnVar.i(obj, this, z8nVar);
        m8nVar.h();
        m8nVar.a--;
        m8nVar.b(a);
    }

    public void n(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((lff) s7aVar).add(Boolean.valueOf(qo2Var.j()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((lff) s7aVar).add(Boolean.valueOf(qo2Var.j()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void n0(zzdp zzdpVar) {
        int e;
        zzcj zzcjVar = (zzcj) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int r = zzcjVar.r();
            v1(r);
            int d = zzcjVar.d() + r;
            do {
                zzdpVar.add(Integer.valueOf(zzcjVar.m()));
            } while (zzcjVar.d() < d);
            return;
        }
        if (i != 5) {
            zzl.y();
            return;
        }
        do {
            zzdpVar.add(Integer.valueOf(zzcjVar.m()));
            if (zzcjVar.c()) {
                return;
            } else {
                e = zzcjVar.e();
            }
        } while (e == this.b);
        this.d = e;
    }

    public void n1(Object obj, s6o s6oVar, zzcs zzcsVar) {
        zzcj zzcjVar = (zzcj) this.e;
        int r = zzcjVar.r();
        if (zzcjVar.a >= 100) {
            throw new zzdv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int a = zzcjVar.a(r);
        zzcjVar.a++;
        s6oVar.e(obj, this, zzcsVar);
        zzcjVar.f();
        zzcjVar.a--;
        zzcjVar.b(a);
    }

    public void o(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mff) t7aVar).add(Boolean.valueOf(qo2Var.j()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((mff) t7aVar).add(Boolean.valueOf(qo2Var.j()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void o0(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof aan;
        int i2 = this.b;
        if (z) {
            aan aanVar = (aan) ianVar;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int t = m8nVar.t();
                u1(t);
                int d = m8nVar.d() + t;
                do {
                    aanVar.g(m8nVar.o());
                } while (m8nVar.d() < d);
                return;
            }
            if (i3 != 5) {
                zzl.u();
                return;
            }
            do {
                aanVar.g(m8nVar.o());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int t2 = m8nVar.t();
                u1(t2);
                int d2 = m8nVar.d() + t2;
                do {
                    ianVar.add(Integer.valueOf(m8nVar.o()));
                } while (m8nVar.d() < d2);
                return;
            }
            if (i4 != 5) {
                zzl.u();
                return;
            }
            do {
                ianVar.add(Integer.valueOf(m8nVar.o()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void o1(int i) {
        switch (this.a) {
            case 11:
                if ((this.b & 7) != i) {
                    zzl.w();
                    break;
                }
                break;
            default:
                if ((this.b & 7) != i) {
                    hbo.e();
                    break;
                }
                break;
        }
    }

    public cc2 p() {
        Z(2);
        return ((qo2) this.e).k();
    }

    public void p0(zzify zzifyVar) {
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        boolean z = zzifyVar instanceof wpo;
        int i2 = this.b;
        if (z) {
            wpo wpoVar = (wpo) zzifyVar;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int x = zziemVar.x();
                E1(x);
                int d = zziemVar.d() + x;
                do {
                    wpoVar.h(zziemVar.s());
                } while (zziemVar.d() < d);
                return;
            }
            if (i3 != 5) {
                hbo.e();
                return;
            }
            do {
                wpoVar.h(zziemVar.s());
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int x2 = zziemVar.x();
                E1(x2);
                int d2 = zziemVar.d() + x2;
                do {
                    zzifyVar.add(Integer.valueOf(zziemVar.s()));
                } while (zziemVar.d() < d2);
                return;
            }
            if (i4 != 5) {
                hbo.e();
                return;
            }
            do {
                zzifyVar.add(Integer.valueOf(zziemVar.s()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public void p1(Object obj, pcn pcnVar, z8n z8nVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            pcnVar.i(obj, this, z8nVar);
            if (this.b == this.c) {
            } else {
                throw new lan("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public ec2 q() {
        Z(2);
        return ((qo2) this.e).l();
    }

    public void q0(zzaef zzaefVar) {
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        boolean z = zzaefVar instanceof tan;
        int i2 = this.b;
        if (z) {
            tan tanVar = (tan) zzaefVar;
            int i3 = i2 & 7;
            if (i3 == 2) {
                int A = zzacvVar.A();
                D1(A);
                int e = zzacvVar.e() + A;
                do {
                    tanVar.g(zzacvVar.u());
                } while (zzacvVar.e() < e);
                return;
            }
            if (i3 != 5) {
                zzl.w();
                return;
            }
            do {
                tanVar.g(zzacvVar.u());
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 == 2) {
                int A2 = zzacvVar.A();
                D1(A2);
                int e2 = zzacvVar.e() + A2;
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.u()));
                } while (zzacvVar.e() < e2);
                return;
            }
            if (i4 != 5) {
                zzl.w();
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.u()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void q1(Object obj, s6o s6oVar, zzcs zzcsVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            s6oVar.e(obj, this, zzcsVar);
            if (this.b == this.c) {
            } else {
                throw new zzdv("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public void r(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        if ((this.b & 7) != 2) {
            throw maa.g();
        }
        do {
            ((lff) s7aVar).add(p());
            if (qo2Var.c()) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void r0(zzdp zzdpVar) {
        int e;
        zzcj zzcjVar = (zzcj) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                zzdpVar.add(Boolean.valueOf(zzcjVar.n()));
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            this.d = e;
            return;
        }
        if (i != 2) {
            zzl.y();
            return;
        }
        int d = zzcjVar.d() + zzcjVar.r();
        do {
            zzdpVar.add(Boolean.valueOf(zzcjVar.n()));
        } while (zzcjVar.d() < d);
        r1(d);
    }

    public void r1(int i) {
        switch (this.a) {
            case 10:
                if (((m8n) this.e).d() == i) {
                    return;
                }
                hbo.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return;
            default:
                if (((zzcj) this.e).d() != i) {
                    throw new zzdv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                return;
        }
    }

    public void s(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        if ((this.b & 7) != 2) {
            throw naa.g();
        }
        do {
            ((mff) t7aVar).add(q());
            if (qo2Var.c()) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void s0(ian ianVar) {
        int g;
        int i;
        m8n m8nVar = (m8n) this.e;
        boolean z = ianVar instanceof s7n;
        int i2 = this.b;
        if (z) {
            s7n s7nVar = (s7n) ianVar;
            int i3 = i2 & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    zzl.u();
                    return;
                }
                int d = m8nVar.d() + m8nVar.t();
                do {
                    s7nVar.d(m8nVar.p());
                } while (m8nVar.d() < d);
                r1(d);
                return;
            }
            do {
                s7nVar.d(m8nVar.p());
                if (m8nVar.c()) {
                    return;
                } else {
                    i = m8nVar.g();
                }
            } while (i == this.b);
        } else {
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    zzl.u();
                    return;
                }
                int d2 = m8nVar.d() + m8nVar.t();
                do {
                    ianVar.add(Boolean.valueOf(m8nVar.p()));
                } while (m8nVar.d() < d2);
                r1(d2);
                return;
            }
            do {
                ianVar.add(Boolean.valueOf(m8nVar.p()));
                if (m8nVar.c()) {
                    return;
                } else {
                    g = m8nVar.g();
                }
            } while (g == this.b);
            i = g;
        }
        this.d = i;
    }

    public void s1(Object obj, odn odnVar, zzadf zzadfVar) {
        zzacv zzacvVar = (zzacv) this.e;
        int A = zzacvVar.A();
        if (zzacvVar.a + zzacvVar.b >= 100) {
            hbo.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int a = zzacvVar.a(A);
        zzacvVar.a++;
        odnVar.f(obj, this, zzadfVar);
        zzacvVar.m(0);
        zzacvVar.a--;
        zzacvVar.b(a);
    }

    public void t(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((lff) s7aVar).add(Double.valueOf(qo2Var.m()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int A = qo2Var.A();
        if ((A & 7) != 0) {
            throw new maa("Failed to parse the message.");
        }
        int b = qo2Var.b() + A;
        do {
            ((lff) s7aVar).add(Double.valueOf(qo2Var.m()));
        } while (qo2Var.b() < b);
    }

    public void t0(zzify zzifyVar) {
        int j;
        zziem zziemVar = (zziem) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                zzifyVar.add(Boolean.valueOf(zziemVar.t()));
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            this.d = j;
            return;
        }
        if (i != 2) {
            hbo.e();
            return;
        }
        int d = zziemVar.d() + zziemVar.x();
        do {
            zzifyVar.add(Boolean.valueOf(zziemVar.t()));
        } while (zziemVar.d() < d);
        C1(d);
    }

    public void t1(Object obj, nqo nqoVar, zziew zziewVar) {
        zziem zziemVar = (zziem) this.e;
        int x = zziemVar.x();
        if (zziemVar.a + zziemVar.b >= 100) {
            hbo.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int a = zziemVar.a(x);
        zziemVar.a++;
        nqoVar.e(obj, this, zziewVar);
        zziemVar.k(0);
        zziemVar.a--;
        zziemVar.b(a);
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                aej aejVar = (aej) this.e;
                sb.append(bea.z(aejVar, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(bea.z(aejVar, i2));
                sb.append("), prevOffset=");
                return wv8.j(sb, this.d, ')');
            default:
                return super.toString();
        }
    }

    public void u(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((mff) t7aVar).add(Double.valueOf(qo2Var.m()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int A = qo2Var.A();
        if ((A & 7) != 0) {
            throw new naa("Failed to parse the message.");
        }
        int b = qo2Var.b() + A;
        do {
            ((mff) t7aVar).add(Double.valueOf(qo2Var.m()));
        } while (qo2Var.b() < b);
    }

    public void u0(zzaef zzaefVar) {
        int l;
        zzacv zzacvVar = (zzacv) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                zzaefVar.add(Boolean.valueOf(zzacvVar.v()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            this.d = l;
            return;
        }
        if (i != 2) {
            zzl.w();
            return;
        }
        int e = zzacvVar.e() + zzacvVar.A();
        do {
            zzaefVar.add(Boolean.valueOf(zzacvVar.v()));
        } while (zzacvVar.e() < e);
        C1(e);
    }

    public void v(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((lff) s7aVar).add(Integer.valueOf(qo2Var.n()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw maa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((lff) s7aVar).add(Integer.valueOf(qo2Var.n()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void v0(zzdp zzdpVar, boolean z) {
        String o;
        int e;
        int i;
        zzcj zzcjVar = (zzcj) this.e;
        if ((this.b & 7) != 2) {
            zzl.y();
            return;
        }
        if ((zzdpVar instanceof zzdx) && !z) {
            zzdx zzdxVar = (zzdx) zzdpVar;
            do {
                I1();
                zzdxVar.zzb();
                if (zzcjVar.c()) {
                    return;
                } else {
                    i = zzcjVar.e();
                }
            } while (i == this.b);
        } else {
            do {
                if (z) {
                    h1(2);
                    o = zzcjVar.p();
                } else {
                    h1(2);
                    o = zzcjVar.o();
                }
                zzdpVar.add(o);
                if (zzcjVar.c()) {
                    return;
                } else {
                    e = zzcjVar.e();
                }
            } while (e == this.b);
            i = e;
        }
        this.d = i;
    }

    public void w(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((mff) t7aVar).add(Integer.valueOf(qo2Var.n()));
                if (qo2Var.c()) {
                    return;
                } else {
                    z = qo2Var.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw naa.g();
        }
        int b = qo2Var.b() + qo2Var.A();
        do {
            ((mff) t7aVar).add(Integer.valueOf(qo2Var.n()));
        } while (qo2Var.b() < b);
        Y(b);
    }

    public void w0(ian ianVar, boolean z) {
        String q;
        int g;
        m8n m8nVar = (m8n) this.e;
        if ((this.b & 7) != 2) {
            zzl.u();
            return;
        }
        do {
            if (z) {
                h1(2);
                q = m8nVar.r();
            } else {
                h1(2);
                q = m8nVar.q();
            }
            ianVar.add(q);
            if (m8nVar.c()) {
                return;
            } else {
                g = m8nVar.g();
            }
        } while (g == this.b);
        this.d = g;
    }

    public Object x(yal yalVar, Class cls, ok6 ok6Var) {
        qo2 qo2Var = (qo2) this.e;
        switch (yalVar.ordinal()) {
            case 0:
                Z(1);
                return Double.valueOf(qo2Var.m());
            case 1:
                Z(5);
                return Float.valueOf(qo2Var.q());
            case 2:
                Z(0);
                return Long.valueOf(qo2Var.s());
            case 3:
                Z(0);
                return Long.valueOf(qo2Var.B());
            case 4:
                Z(0);
                return Integer.valueOf(qo2Var.r());
            case 5:
                Z(1);
                return Long.valueOf(qo2Var.p());
            case 6:
                Z(5);
                return Integer.valueOf(qo2Var.o());
            case 7:
                Z(0);
                return Boolean.valueOf(qo2Var.j());
            case 8:
                Z(2);
                return qo2Var.y();
            case 9:
            default:
                a70.p("unsupported field type.");
                return null;
            case 10:
                Z(2);
                wsg a = kff.c.a(cls);
                hw8 d = a.d();
                m(d, a, ok6Var);
                a.b(d);
                return d;
            case 11:
                return q();
            case 12:
                Z(0);
                return Integer.valueOf(qo2Var.A());
            case 13:
                Z(0);
                return Integer.valueOf(qo2Var.n());
            case 14:
                Z(5);
                return Integer.valueOf(qo2Var.t());
            case 15:
                Z(1);
                return Long.valueOf(qo2Var.u());
            case 16:
                Z(0);
                return Integer.valueOf(qo2Var.v());
            case 17:
                Z(0);
                return Long.valueOf(qo2Var.w());
        }
    }

    public void x0(zzify zzifyVar, boolean z) {
        String u;
        int j;
        int i;
        zziem zziemVar = (zziem) this.e;
        if ((this.b & 7) != 2) {
            hbo.e();
            return;
        }
        if ((zzifyVar instanceof zzigh) && !z) {
            zzigh zzighVar = (zzigh) zzifyVar;
            do {
                J1();
                zzighVar.zzb();
                if (zziemVar.c()) {
                    return;
                } else {
                    i = zziemVar.j();
                }
            } while (i == this.b);
        } else {
            do {
                if (z) {
                    o1(2);
                    u = zziemVar.v();
                } else {
                    o1(2);
                    u = zziemVar.u();
                }
                zzifyVar.add(u);
                if (zziemVar.c()) {
                    return;
                } else {
                    j = zziemVar.j();
                }
            } while (j == this.b);
            i = j;
        }
        this.d = i;
    }

    public void x1(Object obj, odn odnVar, zzadf zzadfVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            odnVar.f(obj, this, zzadfVar);
            if (this.b == this.c) {
            } else {
                throw new zzaeh("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public void y(s7a s7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = qo2Var.A();
            if ((A & 3) != 0) {
                throw new maa("Failed to parse the message.");
            }
            int b = qo2Var.b() + A;
            do {
                ((lff) s7aVar).add(Integer.valueOf(qo2Var.o()));
            } while (qo2Var.b() < b);
            return;
        }
        if (i != 5) {
            throw maa.g();
        }
        do {
            ((lff) s7aVar).add(Integer.valueOf(qo2Var.o()));
            if (qo2Var.c()) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void y0(zzaef zzaefVar, boolean z) {
        String w;
        int l;
        int i;
        zzacv zzacvVar = (zzacv) this.e;
        if ((this.b & 7) != 2) {
            zzl.w();
            return;
        }
        if ((zzaefVar instanceof zzaen) && !z) {
            zzaen zzaenVar = (zzaen) zzaefVar;
            do {
                K1();
                zzaenVar.zzb();
                if (zzacvVar.d()) {
                    return;
                } else {
                    i = zzacvVar.l();
                }
            } while (i == this.b);
        } else {
            do {
                if (z) {
                    o1(2);
                    w = zzacvVar.x();
                } else {
                    o1(2);
                    w = zzacvVar.w();
                }
                zzaefVar.add(w);
                if (zzacvVar.d()) {
                    return;
                } else {
                    l = zzacvVar.l();
                }
            } while (l == this.b);
            i = l;
        }
        this.d = i;
    }

    public void y1(Object obj, nqo nqoVar, zziew zziewVar) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            nqoVar.e(obj, this, zziewVar);
            if (this.b == this.c) {
            } else {
                throw new zzige("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public void z(t7a t7aVar) {
        int z;
        qo2 qo2Var = (qo2) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = qo2Var.A();
            if ((A & 3) != 0) {
                throw new naa("Failed to parse the message.");
            }
            int b = qo2Var.b() + A;
            do {
                ((mff) t7aVar).add(Integer.valueOf(qo2Var.o()));
            } while (qo2Var.b() < b);
            return;
        }
        if (i != 5) {
            throw naa.g();
        }
        do {
            ((mff) t7aVar).add(Integer.valueOf(qo2Var.o()));
            if (qo2Var.c()) {
                return;
            } else {
                z = qo2Var.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void z0(zzdp zzdpVar, s6o s6oVar, zzcs zzcsVar) {
        int e;
        int i = this.b;
        if ((i & 7) != 2) {
            zzl.y();
            return;
        }
        do {
            Object zza = s6oVar.zza();
            n1(zza, s6oVar, zzcsVar);
            s6oVar.c(zza);
            zzdpVar.add(zza);
            zzcj zzcjVar = (zzcj) this.e;
            if (zzcjVar.c() || this.d != 0) {
                return;
            } else {
                e = zzcjVar.e();
            }
        } while (e == i);
        this.d = e;
    }

    public zz0(zziem zziemVar) {
        this.a = 13;
        this.d = 0;
        zziemVar.getClass();
        this.e = zziemVar;
        zziemVar.c = this;
    }

    public zz0(zzacv zzacvVar) {
        this.a = 11;
        this.d = 0;
        this.e = zzacvVar;
        zzacvVar.c = this;
    }

    public zz0(zzcj zzcjVar) {
        this.a = 12;
        this.d = 0;
        this.e = zzcjVar;
        zzcjVar.b = this;
    }

    public zz0(m8n m8nVar) {
        this.a = 10;
        this.d = 0;
        Charset charset = jan.a;
        this.e = m8nVar;
        m8nVar.b = this;
    }

    public zz0(int i, int i2) {
        this.a = 0;
        this.e = new a01[i];
        for (int i3 = 0; i3 < i; i3++) {
            ((a01[]) this.e)[i3] = new a01(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    public /* synthetic */ zz0(int i, boolean z) {
        this.a = i;
    }

    public zz0(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.d = 0;
                this.e = new ap[100];
                break;
            default:
                this.d = 7;
                this.e = new int[8];
                break;
        }
    }

    public zz0(qo2 qo2Var) {
        this.a = 2;
        this.d = 0;
        Charset charset = u7a.a;
        this.e = qo2Var;
        qo2Var.b = this;
    }

    public zz0(qo2 qo2Var, byte b) {
        this.a = 3;
        this.d = 0;
        Charset charset = w7a.a;
        this.e = qo2Var;
        qo2Var.b = this;
    }

    public zz0(evd evdVar) {
        this.a = 8;
        this.e = evdVar;
    }

    public zz0(int i, int i2, int i3, aej aejVar) {
        this.a = 9;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = aejVar;
    }
}
