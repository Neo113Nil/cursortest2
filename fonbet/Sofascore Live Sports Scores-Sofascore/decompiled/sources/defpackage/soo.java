package defpackage;

import com.google.android.gms.internal.ads.zzibh;
import com.google.android.gms.internal.ads.zzibw;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class soo extends ThreadLocal {
    public final /* synthetic */ zzibw a;

    public soo(zzibw zzibwVar) {
        this.a = zzibwVar;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            zzibh zzibhVar = zzibh.c;
            zzibw zzibwVar = this.a;
            Mac mac = (Mac) zzibhVar.a.zza(zzibwVar.b);
            mac.init(zzibwVar.c);
            return mac;
        } catch (GeneralSecurityException e) {
            yhk.q(e);
            return null;
        }
    }
}
