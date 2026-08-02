package defpackage;

import com.google.android.gms.internal.measurement.zzabt;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.google.android.gms.internal.measurement.zzzo;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jfp implements zzzo {
    public final /* synthetic */ int a;

    @Override // com.google.android.gms.internal.measurement.zzzo
    public final void a(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (!zzylVar.c) {
                    a70.r("non repeating key");
                    break;
                } else if (zzylVar.d && ((zzabt) zzabt.b.get()).a > 20) {
                    while (it.hasNext()) {
                        zzzcVar.a(it.next(), zzylVar.a);
                    }
                    break;
                } else {
                    zzylVar.a(it, zzzcVar);
                    break;
                }
                break;
        }
    }

    private final void b(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
    }
}
