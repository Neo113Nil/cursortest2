package defpackage;

import com.google.android.gms.internal.ads.zzaht;
import com.google.android.gms.internal.ads.zzguk;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f59 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;
    public final Object i;

    public /* synthetic */ f59(Object obj, int i) {
        this.a = i;
        this.i = obj;
    }

    public void a(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                if (this.c) {
                    int i3 = this.f;
                    int i4 = (i + 1) - i3;
                    if (i4 >= i2) {
                        this.f = (i2 - i) + i3;
                        break;
                    } else {
                        this.d = ((bArr[i4] & 192) >> 6) == 0;
                        this.c = false;
                        break;
                    }
                }
                break;
            default:
                if (this.c) {
                    int i5 = this.f;
                    int i6 = (i + 1) - i5;
                    if (i6 >= i2) {
                        this.f = (i2 - i) + i5;
                        break;
                    } else {
                        this.d = ((bArr[i6] & 192) >> 6) == 0;
                        this.c = false;
                        break;
                    }
                }
                break;
        }
    }

    public void b(long j, int i, boolean z) {
        z1a.E(this.h != C.TIME_UNSET);
        if (this.e == 182 && z && this.b) {
            ((vsj) this.i).a(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }

    public void c(int i, int i2, byte[] bArr) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = (i2 - i) + i3;
            } else {
                this.d = ((bArr[i4] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }

    public void d(long j, int i, boolean z) {
        zzguk.f(this.h != C.TIME_UNSET);
        if (this.e == 182 && z && this.b) {
            ((zzaht) this.i).f(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
        }
        if (this.e != 179) {
            this.g = j;
        }
    }
}
