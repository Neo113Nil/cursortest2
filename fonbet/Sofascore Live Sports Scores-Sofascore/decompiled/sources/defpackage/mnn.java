package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzbje;
import com.google.android.gms.internal.ads.zzblx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mnn implements zzblx {
    public final /* synthetic */ SharedPreferences a;

    public mnn(zzbje zzbjeVar, SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final String a(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final Double b(String str, double d) {
        SharedPreferences sharedPreferences = this.a;
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final Boolean c(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final Long d(long j, String str) {
        SharedPreferences sharedPreferences = this.a;
        try {
            return Long.valueOf(sharedPreferences.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(sharedPreferences.getInt(str, (int) j));
        }
    }
}
