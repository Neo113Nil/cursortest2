package defpackage;

import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zziy;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e9p extends zziy {
    public long h;
    public int i;
    public int j;

    @Override // com.google.android.gms.internal.ads.zziy
    public final void c() {
        super.c();
        this.i = 0;
    }

    public final boolean h() {
        return this.i > 0;
    }

    public final boolean i(zziy zziyVar) {
        ByteBuffer byteBuffer;
        zzguk.a(!zziyVar.b(1073741824));
        zzguk.a(!zziyVar.b(268435456));
        zzguk.a(!zziyVar.b(4));
        if (h()) {
            if (this.i >= this.j) {
                return false;
            }
            ByteBuffer byteBuffer2 = zziyVar.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.i;
        this.i = i + 1;
        if (i == 0) {
            this.e = zziyVar.e;
            if (zziyVar.b(1)) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = zziyVar.d;
        if (byteBuffer3 != null) {
            d(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.h = zziyVar.e;
        return true;
    }
}
