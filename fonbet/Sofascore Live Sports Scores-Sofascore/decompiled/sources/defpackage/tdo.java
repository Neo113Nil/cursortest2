package defpackage;

import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzaza;
import com.google.android.gms.internal.ads.zzazp;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzgjz;
import com.google.android.gms.internal.ads.zzgrf;
import com.google.android.gms.internal.ads.zzgrh;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tdo implements zzgjz {
    public final Map a;
    public final zzaya b;
    public final zzgrf c;
    public final long d;

    public tdo(zzaya zzayaVar, Map map, zzgei zzgeiVar, zzgrh zzgrhVar) {
        this.a = map;
        this.b = zzayaVar;
        this.c = zzgrhVar.a(112);
        this.d = zzgeiVar.c0();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzaza zzazaVar;
        try {
            try {
                this.c.a();
                ddb ddbVar = (ddb) this.a.get("gs");
                if (ddbVar != null && (zzazaVar = (zzaza) ddbVar.get(this.d, TimeUnit.MILLISECONDS)) != null) {
                    zzaya zzayaVar = this.b;
                    synchronized (zzayaVar) {
                        zzazp E0 = zzazaVar.E0();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).s0(E0);
                        long B0 = zzazaVar.B0();
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).b0(B0);
                    }
                }
            } catch (Throwable th) {
                this.c.c();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.c.b(e);
        }
        this.c.c();
        return null;
    }
}
