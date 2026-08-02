package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.Y1;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzceg implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final com.google.android.gms.ads.internal.util.zzg c;
    public String d = Y1.f;
    public int e = -1;

    public zzceg(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = zzgVar;
        this.a = context;
    }

    public final void a(int i, String str) {
        Context context;
        boolean z = true;
        boolean z2 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r1)).booleanValue() && this.b.getInt("IABTCF_gdprApplies", -1) == 0) ? false : true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o1)).booleanValue() ? !((str.isEmpty() || str.charAt(0) != '1') && z2) : !(i == 0 || ((str.isEmpty() || (str.charAt(0) != '1' && !str.equals(Y1.f))) && z2))) {
            z = false;
        }
        this.c.zzw(z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.n7)).booleanValue() && z && (context = this.a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.q1)).booleanValue()) {
                boolean equals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.a;
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.c;
                if (equals) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i != zzgVar.zzD()) {
                        zzgVar.zzw(true);
                        com.google.android.gms.ads.internal.util.zzac.zza(context);
                    }
                    zzgVar.zzC(i);
                    return;
                }
                if (Objects.equals(str, AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
                    String string = sharedPreferences.getString(str, Y1.f);
                    String zzB = zzgVar.zzB();
                    zzgVar.zzA(string);
                    if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r1)).booleanValue() && sharedPreferences.getInt("IABTCF_gdprApplies", -1) == 0) || Objects.equals(string, zzB)) {
                        return;
                    }
                    zzgVar.zzw(true);
                    com.google.android.gms.ads.internal.util.zzac.zza(context);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", Y1.f);
            int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode == -2004976699) {
                if (!valueOf.equals("IABTCF_PurposeConsents") || string2.equals(Y1.f) || this.d.equals(string2)) {
                    return;
                }
                this.d = string2;
                a(i2, string2);
                return;
            }
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.o1)).booleanValue() || i2 == -1 || this.e == i2) {
                    return;
                }
                this.e = i2;
                a(i2, string2);
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().d("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
