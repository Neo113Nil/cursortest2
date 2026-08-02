package defpackage;

import com.google.android.gms.internal.play_billing.zzo;
import com.google.android.gms.internal.play_billing.zzp;
import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e5p extends zzo {
    public final /* synthetic */ k6p h;

    public e5p(k6p k6pVar) {
        this.h = k6pVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    public final String b() {
        zzp zzpVar = (zzp) this.h.a.get();
        return zzpVar == null ? "Completer object has been garbage collected, future will fail soon" : lnb.o("tag=[", String.valueOf(zzpVar.a), U3.j.e);
    }
}
