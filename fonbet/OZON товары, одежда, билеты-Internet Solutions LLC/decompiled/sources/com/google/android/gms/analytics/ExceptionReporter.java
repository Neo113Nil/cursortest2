package com.google.android.gms.analytics;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzfa;
import java.lang.Thread;
import java.util.ArrayList;

@VisibleForTesting
/* loaded from: classes9.dex */
public class ExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler zza;
    private final Tracker zzb;
    private final Context zzc;
    private ExceptionParser zzd;
    private GoogleAnalytics zze;

    public ExceptionReporter(@RecentlyNonNull Tracker tracker, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @RecentlyNonNull Context context) {
        if (tracker == null) {
            throw new NullPointerException("tracker cannot be null");
        }
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.zza = uncaughtExceptionHandler;
        this.zzb = tracker;
        this.zzd = new StandardExceptionParser(context, new ArrayList());
        this.zzc = context.getApplicationContext();
        String name = uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName();
        zzfa.zzd(name.length() != 0 ? "ExceptionReporter created, original handler is ".concat(name) : new String("ExceptionReporter created, original handler is "));
    }

    @RecentlyNullable
    public ExceptionParser getExceptionParser() {
        return this.zzd;
    }

    public void setExceptionParser(ExceptionParser exceptionParser) {
        this.zzd = exceptionParser;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@RecentlyNonNull Thread thread, @RecentlyNonNull Throwable th2) {
        String str;
        if (this.zzd != null) {
            str = this.zzd.getDescription(thread != null ? thread.getName() : null, th2);
        } else {
            str = "UncaughtException";
        }
        String valueOf = String.valueOf(str);
        zzfa.zzd(valueOf.length() != 0 ? "Reporting uncaught exception: ".concat(valueOf) : new String("Reporting uncaught exception: "));
        Tracker tracker = this.zzb;
        HitBuilders.ExceptionBuilder exceptionBuilder = new HitBuilders.ExceptionBuilder();
        exceptionBuilder.setDescription(str);
        exceptionBuilder.setFatal(true);
        tracker.send(exceptionBuilder.build());
        if (this.zze == null) {
            this.zze = GoogleAnalytics.getInstance(this.zzc);
        }
        GoogleAnalytics googleAnalytics = this.zze;
        googleAnalytics.dispatchLocalHits();
        googleAnalytics.zzb().zzf().zzn();
        if (this.zza != null) {
            zzfa.zzd("Passing exception to the original handler");
            this.zza.uncaughtException(thread, th2);
        }
    }

    final Thread.UncaughtExceptionHandler zza() {
        return this.zza;
    }
}
