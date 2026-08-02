package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.internal.ads.zzcev;
import com.google.android.gms.internal.ads.zzeas;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vrn implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final /* synthetic */ Object c;

    public vrn(xrn xrnVar, String str) {
        Objects.requireNonNull(xrnVar);
        this.c = xrnVar;
        this.b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.a) {
            case 0:
                xrn xrnVar = (xrn) this.c;
                synchronized (xrnVar) {
                    try {
                        Iterator it = xrnVar.b.iterator();
                        while (it.hasNext()) {
                            ((zzcev) it.next()).zza(this.b, str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                zzeas zzeasVar = (zzeas) this.c;
                String str2 = this.b;
                zzeasVar.i.set(zzac.zzb(zzeasVar.b, str2));
                return;
        }
    }

    public /* synthetic */ vrn(zzeas zzeasVar, String str) {
        this.c = zzeasVar;
        this.b = str;
    }
}
