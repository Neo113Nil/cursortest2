package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.zzno;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzrf;
import com.google.android.gms.internal.measurement.zzro;
import com.google.android.gms.internal.measurement.zzru;
import com.google.android.gms.internal.measurement.zzse;
import com.google.android.gms.internal.measurement.zzsv;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nub implements xs8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nub(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xs8
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                pub pubVar = (pub) this.b;
                entry.getClass();
                return new mub(entry, pubVar);
            case 1:
                "Failed to commit to updated flags for ".concat(String.valueOf(((zzpg) this.b).c));
                return null;
            default:
                zzrf zzrfVar = (zzrf) this.b;
                zzno zznoVar = (zzno) obj;
                zzse zzseVar = new zzse();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (zzrf.j) {
                            zzru zzruVar = (zzru) zzrfVar.d.get();
                            Uri uri = zzrfVar.g;
                            zzsv zzsvVar = new zzsv(zznoVar.y());
                            zzsvVar.b = new zzro[]{zzseVar};
                            zzruVar.a(uri, zzsvVar);
                            zzrfVar.h = zznoVar.y();
                        }
                        synchronized (zzrf.k) {
                            zzru zzruVar2 = (zzru) zzrfVar.d.get();
                            Uri uri2 = zzrfVar.i;
                            zzsv zzsvVar2 = new zzsv(zznoVar.z());
                            zzsvVar2.b = new zzro[]{zzseVar};
                            zzruVar2.a(uri2, zzsvVar2);
                            zznoVar.z();
                        }
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
        }
    }
}
