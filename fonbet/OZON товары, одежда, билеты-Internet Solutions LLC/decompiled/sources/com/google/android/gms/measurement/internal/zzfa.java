package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzfa extends zzhe {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzey zzd;
    private final zzey zze;
    private final zzey zzf;
    private final zzey zzg;
    private final zzey zzh;
    private final zzey zzi;
    private final zzey zzj;
    private final zzey zzk;
    private final zzey zzl;

    zzfa(zzgk zzgkVar) {
        super(zzgkVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzey(this, 6, false, false);
        this.zze = new zzey(this, 6, true, false);
        this.zzf = new zzey(this, 6, false, true);
        this.zzg = new zzey(this, 5, false, false);
        this.zzh = new zzey(this, 5, true, false);
        this.zzi = new zzey(this, 5, false, true);
        this.zzj = new zzey(this, 4, false, false);
        this.zzk = new zzey(this, 3, false, false);
        this.zzl = new zzey(this, 2, false, false);
    }

    protected static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzez(str);
    }

    static String zzo(boolean z11, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zzp = zzp(z11, obj);
        String zzp2 = zzp(z11, obj2);
        String zzp3 = zzp(z11, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb2.append(str2);
            sb2.append(zzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb2.append(str3);
            sb2.append(zzp3);
        }
        return sb2.toString();
    }

    @VisibleForTesting
    static String zzp(boolean z11, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i11 = 0;
        if (obj instanceof Long) {
            if (!z11) {
                return obj.toString();
            }
            Long l11 = (Long) obj;
            if (Math.abs(l11.longValue()) < 100) {
                return obj.toString();
            }
            String str2 = obj.toString().charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l11.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (!(obj instanceof zzez)) {
                return z11 ? "-" : obj.toString();
            }
            str = ((zzez) obj).zza;
            return str;
        }
        Throwable th2 = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z11 ? th2.getClass().getName() : th2.toString());
        String zzy = zzy(zzgk.class.getCanonicalName());
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i11];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzy(className).equals(zzy)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i11++;
        }
        return sb2.toString();
    }

    private static String zzy(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final zzey zzc() {
        return this.zzk;
    }

    public final zzey zzd() {
        return this.zzd;
    }

    public final zzey zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzhe
    protected final boolean zzf() {
        return false;
    }

    public final zzey zzh() {
        return this.zze;
    }

    public final zzey zzi() {
        return this.zzj;
    }

    public final zzey zzj() {
        return this.zzl;
    }

    public final zzey zzk() {
        return this.zzg;
    }

    public final zzey zzl() {
        return this.zzi;
    }

    public final zzey zzm() {
        return this.zzh;
    }

    @VisibleForTesting
    protected final String zzq() {
        String str;
        synchronized (this) {
            try {
                if (this.zzc == null) {
                    if (this.zzs.zzy() != null) {
                        this.zzc = this.zzs.zzy();
                    } else {
                        this.zzc = this.zzs.zzf().zzn();
                    }
                }
                Preconditions.checkNotNull(this.zzc);
                str = this.zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    protected final void zzt(int i11, boolean z11, boolean z12, String str, Object obj, Object obj2, Object obj3) {
        if (!z11 && Log.isLoggable(zzq(), i11)) {
            Log.println(i11, zzq(), zzo(false, str, obj, obj2, obj3));
        }
        if (z12 || i11 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzgh zzo = this.zzs.zzo();
        if (zzo == null) {
            Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzo.zzx()) {
                Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i11 >= 9) {
                i11 = 8;
            }
            zzo.zzp(new zzex(this, i11, str, obj, obj2, obj3));
        }
    }
}
