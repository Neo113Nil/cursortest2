package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.flags.zzd;
import xsna.ba01;
import xsna.bq70;
import xsna.g101;
import xsna.g501;
import xsna.q601;
import xsna.qsz0;
import xsna.r601;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
@DynamiteApi
/* loaded from: classes12.dex */
public class FlagProviderImpl extends q601 {
    public boolean a = false;
    public SharedPreferences b;

    @Override // xsna.h801
    public boolean getBooleanFlagValue(@NonNull String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) zzd.zza(new qsz0(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            }
        }
        return valueOf.booleanValue();
    }

    @Override // xsna.h801
    public int getIntFlagValue(@NonNull String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) zzd.zza(new g101(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            }
        }
        return valueOf.intValue();
    }

    @Override // xsna.h801
    public long getLongFlagValue(@NonNull String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) zzd.zza(new g501(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            }
        }
        return valueOf.longValue();
    }

    @Override // xsna.h801
    @NonNull
    public String getStringFlagValue(@NonNull String str, @NonNull String str2, int i) {
        if (this.a) {
            try {
                return (String) zzd.zza(new r601(this.b, str, str2));
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Flag value not available, returning default: ".concat(valueOf);
                }
            }
        }
        return str2;
    }

    @Override // xsna.h801
    public void init(@NonNull vnv vnvVar) {
        Context context = (Context) bq70.g(vnvVar);
        if (this.a) {
            return;
        }
        try {
            this.b = ba01.a(context.createPackageContext("com.google.android.gms", 0));
            this.a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
            }
        }
    }
}
