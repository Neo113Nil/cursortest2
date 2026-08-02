package defpackage;

import com.google.android.gms.internal.ads.zzhfm;
import com.google.android.gms.internal.ads.zzhia;
import com.google.android.gms.internal.ads.zzhib;
import com.google.android.gms.internal.ads.zzhic;
import com.google.android.gms.internal.ads.zzhpd;
import com.google.android.gms.internal.ads.zzich;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class nmo {
    public static final jno a;
    public static final hno b;
    public static final bno c;
    public static final ano d;

    static {
        zzich a2 = zzhpd.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        a = new jno(zzhic.class, fff.m);
        b = new hno(a2, haf.m);
        c = new bno(zzhia.class, ubf.k);
        d = new ano(a2, dff.l);
    }

    public static zzhfm a(zzhib zzhibVar) {
        if (zzhibVar.equals(zzhib.b)) {
            return zzhfm.c;
        }
        if (zzhibVar == zzhib.c) {
            return zzhfm.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzhibVar.a));
    }
}
