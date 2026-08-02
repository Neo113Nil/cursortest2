package g9;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* renamed from: g9.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C6673e extends zzeh implements zzfn {
    private static final C6673e zzb;
    private zzeo zzd = zzeh.zzP();

    static {
        C6673e c6673e = new C6673e();
        zzb = c6673e;
        zzeh.zzV(C6673e.class, c6673e);
    }

    private C6673e() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C6672d.class});
        }
        if (i12 == 3) {
            return new C6673e();
        }
        if (i12 == 4) {
            return new C6670b();
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
