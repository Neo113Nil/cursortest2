package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.media3.common.b;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzga;
import com.google.android.gms.internal.ads.zzv;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class und implements wl0, i12, qf0, nnd, pmk, ygn {
    public static final byte[] e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    public static final byte[] f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;

    public und(zzga zzgaVar, zzv zzvVar) {
        this.a = 11;
        zzeu zzeuVar = zzgaVar.b;
        this.d = zzeuVar;
        zzeuVar.D(12);
        int h = zzeuVar.h();
        if (MimeTypes.AUDIO_RAW.equals(zzvVar.o)) {
            int f2 = zzfm.f(zzvVar.K) * zzvVar.H;
            if (h % f2 != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(f2).length() + 66 + String.valueOf(h).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(f2);
                sb.append(", stsz sample size: ");
                sb.append(h);
                zzeh.c(sb.toString());
                h = f2;
            }
        }
        this.b = h == 0 ? -1 : h;
        this.c = zzeuVar.h();
    }

    public static void h(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(i9a.t(i2));
    }

    @Override // defpackage.qf0
    public void A() {
        if (this.c <= 0) {
            sf3.a("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        ((qf0) this.d).A();
    }

    @Override // defpackage.wl0, defpackage.i12
    public int a() {
        switch (this.a) {
        }
        return this.b;
    }

    public byte c(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public void e(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public void f(int i, int i2, boolean z) {
        ((byte[][]) this.d)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    @Override // defpackage.qf0
    public Object g() {
        return ((qf0) this.d).g();
    }

    @Override // defpackage.wl0, defpackage.i12
    public int getSampleCount() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.nnd
    public int i(int i) {
        int i2 = ((nnd) this.d).i(i);
        if (i >= 0 && i <= this.c) {
            ckk.c(i2, this.b, i);
        }
        return i2;
    }

    @Override // defpackage.qf0
    public void k(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        ((qf0) this.d).k(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.pmk
    public int l() {
        return this.c;
    }

    @Override // defpackage.pmk
    public int m() {
        return this.b;
    }

    @Override // defpackage.qf0
    public void p(int i, int i2) {
        ((qf0) this.d).p(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.qf0
    public void r(Object obj, Function2 function2) {
        ((qf0) this.d).r(obj, function2);
    }

    @Override // defpackage.wl0, defpackage.i12
    public int readNextSampleSize() {
        switch (this.a) {
            case 1:
                int i = this.b;
                return i == -1 ? ((nkk) this.d).v() : i;
            default:
                int i2 = this.b;
                return i2 == -1 ? ((j9e) this.d).E() : i2;
        }
    }

    @Override // defpackage.qf0
    public void s(int i, Object obj) {
        ((qf0) this.d).s(i + (this.c == 0 ? this.b : 0), obj);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nmk
    public j80 u(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return ((ujg) this.d).u(j, j80Var, j80Var2, j80Var3);
    }

    @Override // defpackage.nnd
    public int v(int i) {
        int v = ((nnd) this.d).v(i);
        if (i >= 0 && i <= this.b) {
            ckk.b(v, this.c, i);
        }
        return v;
    }

    @Override // defpackage.qf0
    public void w(int i, Object obj) {
        ((qf0) this.d).w(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.qf0
    public void x(Object obj) {
        this.c++;
        ((qf0) this.d).x(obj);
    }

    @Override // defpackage.qf0
    public void y() {
        ((qf0) this.d).y();
    }

    @Override // defpackage.nmk
    public j80 z(long j, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        return ((ujg) this.d).z(j, j80Var, j80Var2, j80Var3);
    }

    @Override // defpackage.ygn
    public int zza() {
        return this.c;
    }

    @Override // defpackage.ygn
    public int zzb() {
        return this.b;
    }

    @Override // defpackage.ygn
    public int zzc() {
        int i = this.b;
        return i == -1 ? ((zzeu) this.d).h() : i;
    }

    public /* synthetic */ und(int i, int i2, int i3, Object obj) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public und(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 4:
                this.d = null;
                this.b = i;
                int i4 = i2 & 7;
                this.c = i4 == 0 ? 8 : i4;
                break;
            case 5:
                this.d = null;
                this.b = i;
                int i5 = i2 & 7;
                this.c = i5 == 0 ? 8 : i5;
                break;
            default:
                this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
                this.b = i;
                this.c = i2;
                break;
        }
    }

    public und(nnd nndVar, int i, int i2) {
        this.a = 8;
        this.d = nndVar;
        this.b = i;
        this.c = i2;
    }

    public und(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.d = new und[NotificationCompat.FLAG_LOCAL_ONLY];
                this.b = 0;
                this.c = 0;
                break;
            case 5:
                this.d = new und[NotificationCompat.FLAG_LOCAL_ONLY];
                this.b = 0;
                this.c = 0;
                break;
        }
    }

    public und(qf0 qf0Var, int i) {
        this.a = 6;
        this.d = qf0Var;
        this.b = i;
    }

    public und(int i, int i2, ig5 ig5Var) {
        this.a = 9;
        this.b = i;
        this.c = i2;
        this.d = new ujg(new f88(i, i2, ig5Var));
    }

    public und(sl0 sl0Var, sm8 sm8Var) {
        this.a = 1;
        nkk nkkVar = sl0Var.g;
        this.d = nkkVar;
        nkkVar.E(12);
        int v = nkkVar.v();
        if (MimeTypes.AUDIO_RAW.equals(sm8Var.l)) {
            int p = lik.p(sm8Var.A, sm8Var.y);
            if (v == 0 || v % p != 0) {
                m6k.f0();
                v = p;
            }
        }
        this.b = v == 0 ? -1 : v;
        this.c = nkkVar.v();
    }

    public und(bxc bxcVar, b bVar) {
        this.a = 2;
        j9e j9eVar = bxcVar.g;
        this.d = j9eVar;
        j9eVar.N(12);
        int E = j9eVar.E();
        if (MimeTypes.AUDIO_RAW.equals(bVar.o)) {
            int v = nik.v(bVar.I) * bVar.G;
            if (E % v != 0) {
                tgj.d0("Audio sample size mismatch. stsd sample size: " + v + ", stsz sample size: " + E);
                E = v;
            }
        }
        this.b = E == 0 ? -1 : E;
        this.c = j9eVar.E();
    }
}
