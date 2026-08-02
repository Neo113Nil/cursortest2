package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.flags.zzd;
import defpackage.t3n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@DynamiteApi
/* loaded from: classes3.dex */
public class FlagProviderImpl extends zzd {
    public boolean a = false;
    public SharedPreferences b;

    @Override // com.google.android.gms.flags.zze
    public boolean getBooleanFlagValue(@NonNull String str, boolean z, int i) {
        if (!this.a) {
            return z;
        }
        SharedPreferences sharedPreferences = this.b;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) com.google.android.gms.internal.flags.zzd.a(new t3n(0, sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            }
        }
        return valueOf.booleanValue();
    }

    @Override // com.google.android.gms.flags.zze
    public int getIntFlagValue(@NonNull String str, int i, int i2) {
        if (!this.a) {
            return i;
        }
        SharedPreferences sharedPreferences = this.b;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) com.google.android.gms.internal.flags.zzd.a(new t3n(1, sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            }
        }
        return valueOf.intValue();
    }

    @Override // com.google.android.gms.flags.zze
    public long getLongFlagValue(@NonNull String str, long j, int i) {
        if (!this.a) {
            return j;
        }
        SharedPreferences sharedPreferences = this.b;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) com.google.android.gms.internal.flags.zzd.a(new t3n(2, sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            }
        }
        return valueOf.longValue();
    }

    @Override // com.google.android.gms.flags.zze
    @NonNull
    public String getStringFlagValue(@NonNull String str, @NonNull String str2, int i) {
        if (this.a) {
            try {
                return (String) com.google.android.gms.internal.flags.zzd.a(new t3n(3, this.b, str, str2));
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Flag value not available, returning default: ".concat(valueOf);
                }
            }
        }
        return str2;
    }

    @Override // com.google.android.gms.flags.zze
    public void init(@NonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        if (this.a) {
            return;
        }
        try {
            this.b = zzf.a(context.createPackageContext("com.google.android.gms", 0));
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
