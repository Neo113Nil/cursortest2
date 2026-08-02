package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzhn;
import com.google.android.gms.internal.ads.zzhs;
import com.google.android.gms.internal.ads.zzhw;
import com.google.android.gms.internal.ads.zziq;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jtn implements zzhs {
    public final zzhn a;
    public final long b;
    public final zzhs c;
    public long d;
    public Uri e;

    public jtn(zzhn zzhnVar, int i, zzhs zzhsVar) {
        this.a = zzhnVar;
        this.b = i;
        this.c = zzhsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        zzhw zzhwVar2;
        zzhw zzhwVar3;
        zzhw zzhwVar4;
        Uri uri = zzhwVar.a;
        long j = zzhwVar.d;
        this.e = uri;
        long j2 = zzhwVar.c;
        long j3 = this.b;
        if (j2 >= j3) {
            zzhwVar2 = null;
        } else {
            long j4 = j3 - j2;
            if (j != -1) {
                j4 = Math.min(j, j4);
            }
            zzhwVar2 = new zzhw(uri, j2, j4);
        }
        if (j == -1 || j2 + j > j3) {
            zzhwVar3 = zzhwVar2;
            zzhwVar4 = new zzhw(uri, Math.max(j3, j2), j != -1 ? Math.min(j, (j2 + j) - j3) : -1L);
        } else {
            zzhwVar3 = zzhwVar2;
            zzhwVar4 = null;
        }
        long a = zzhwVar3 != null ? this.a.a(zzhwVar3) : 0L;
        long a2 = zzhwVar4 != null ? this.c.a(zzhwVar4) : 0L;
        this.d = j2;
        if (a == -1 || a2 == -1) {
            return -1L;
        }
        return a + a2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        int i3;
        long j = this.d;
        long j2 = this.b;
        if (j < j2) {
            int b = this.a.b(i, (int) Math.min(i2, j2 - j), bArr);
            long j3 = this.d + b;
            this.d = j3;
            i3 = b;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int b2 = this.c.b(i + i3, i2 - i3, bArr);
        int i4 = i3 + b2;
        this.d += b2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        this.a.zzd();
        this.c.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Map zzj() {
        return njo.g;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void c(zziq zziqVar) {
    }
}
