package defpackage;

import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z1n extends zac {
    public final WeakReference a;

    public z1n(zaar zaarVar) {
        this.a = new WeakReference(zaarVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void p0(zak zakVar) {
        zaar zaarVar = (zaar) this.a.get();
        if (zaarVar == null) {
            return;
        }
        v1n v1nVar = new v1n(this, zaarVar, zaarVar, zakVar);
        b2n b2nVar = zaarVar.a.e;
        b2nVar.sendMessage(b2nVar.obtainMessage(1, v1nVar));
    }
}
