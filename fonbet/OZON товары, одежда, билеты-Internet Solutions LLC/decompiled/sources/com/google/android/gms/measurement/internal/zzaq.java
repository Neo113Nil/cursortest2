package com.google.android.gms.measurement.internal;

import G.g;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzaq extends zzhe {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    zzaq(zzgk zzgkVar) {
        super(zzgkVar);
    }

    final long zza() {
        zzg();
        return this.zze;
    }

    public final long zzb() {
        zzu();
        return this.zza;
    }

    public final String zzc() {
        zzu();
        return this.zzb;
    }

    final void zzd() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    final boolean zze() {
        Account[] result;
        zzg();
        long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
        if (currentTimeMillis - this.zze > 86400000) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.checkSelfPermission(this.zzs.zzau(), "android.permission.GET_ACCOUNTS") != 0) {
            this.zzs.zzay().zzm().zza("Permission error checking for dasher/unicorn accounts");
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        if (this.zzc == null) {
            this.zzc = AccountManager.get(this.zzs.zzau());
        }
        try {
            result = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e11) {
            e = e11;
            this.zzs.zzay().zzh().zzb("Exception checking account types", e);
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e12) {
            e = e12;
            this.zzs.zzay().zzh().zzb("Exception checking account types", e);
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        } catch (IOException e13) {
            e = e13;
            this.zzs.zzay().zzh().zzb("Exception checking account types", e);
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        if (result != null && result.length > 0) {
            this.zzd = Boolean.TRUE;
            this.zze = currentTimeMillis;
            return true;
        }
        Account[] result2 = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.zzd = Boolean.TRUE;
            this.zze = currentTimeMillis;
            return true;
        }
        this.zze = currentTimeMillis;
        this.zzd = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzhe
    protected final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.zzb = g.c(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }
}
