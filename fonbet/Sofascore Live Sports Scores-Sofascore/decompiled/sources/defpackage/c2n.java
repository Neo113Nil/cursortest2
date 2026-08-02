package defpackage;

import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.api.internal.zabr;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class c2n extends zabr {
    public final WeakReference a;

    public c2n(zaaz zaazVar) {
        this.a = new WeakReference(zaazVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabr
    public final void a() {
        zaaz zaazVar = (zaaz) this.a.get();
        if (zaazVar == null) {
            return;
        }
        zaazVar.l();
    }
}
