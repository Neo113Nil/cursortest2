package defpackage;

import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzgka;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vdo extends zzgka {
    @Override // com.google.android.gms.internal.ads.zzgka
    public final void a(Method method, zzaya zzayaVar) {
        synchronized (zzayaVar) {
            zzayaVar.n();
            ((zzaza) zzayaVar.b).I0("E");
            zzayaVar.n();
            ((zzaza) zzayaVar.b).P(0L);
            zzayaVar.n();
            ((zzaza) zzayaVar.b).k0("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (zzayaVar) {
            String str = (String) objArr[0];
            zzayaVar.n();
            ((zzaza) zzayaVar.b).I0(str);
            long longValue = ((Long) objArr[1]).longValue();
            zzayaVar.n();
            ((zzaza) zzayaVar.b).P(longValue);
            String str2 = (String) objArr[2];
            zzayaVar.n();
            ((zzaza) zzayaVar.b).k0(str2);
        }
    }
}
