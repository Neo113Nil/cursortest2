package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes9.dex */
final class zzhc extends Thread {
    private static zzhc zza;
    private final LinkedBlockingQueue<Runnable> zzb;
    private volatile boolean zzc;
    private volatile boolean zzd;
    private volatile zzhd zze;
    private final Context zzf;
    private final Clock zzg;

    private zzhc(Context context) {
        super("GAThread");
        this.zzb = new LinkedBlockingQueue<>();
        this.zzc = false;
        this.zzd = false;
        this.zzg = DefaultClock.getInstance();
        if (context != null) {
            this.zzf = context.getApplicationContext();
        } else {
            this.zzf = null;
        }
        start();
    }

    static zzhc zzb(Context context) {
        if (zza == null) {
            zza = new zzhc(context);
        }
        return zza;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                try {
                    Runnable take = this.zzb.take();
                    if (!this.zzc) {
                        take.run();
                    }
                } catch (InterruptedException e11) {
                    zzhl.zzc(e11.toString());
                }
            } catch (Exception e12) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                e12.printStackTrace(printStream);
                printStream.flush();
                String str = new String(byteArrayOutputStream.toByteArray());
                zzhl.zza(str.length() != 0 ? "Error on Google TagManager Thread: ".concat(str) : new String("Error on Google TagManager Thread: "));
                zzhl.zza("Google TagManager is shutting down.");
                this.zzc = true;
            }
        }
    }

    public final void zze(Runnable runnable) {
        this.zzb.add(runnable);
    }

    public final void zzf(String str, String str2, String str3, Map<String, String> map, String str4) {
        this.zzb.add(new zzhb(this, this, this.zzg.currentTimeMillis(), str, str2, str3, map, str4, null));
    }
}
