package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzcaq;
import java.lang.Thread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class grn implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;
    public final /* synthetic */ zzcaq c;

    public /* synthetic */ grn(zzcaq zzcaqVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i) {
        this.a = i;
        this.b = uncaughtExceptionHandler;
        this.c = zzcaqVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        int i = this.a;
        zzcaq zzcaqVar = this.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        switch (i) {
            case 0:
                try {
                    try {
                        zzcaqVar.g(th);
                    } catch (Throwable unused) {
                        zzo.zzf("AdMob exception reporter failed reporting the exception.");
                    }
                    if (uncaughtExceptionHandler != null) {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    }
                    return;
                } finally {
                }
            default:
                try {
                    try {
                        zzcaqVar.g(th);
                    } finally {
                    }
                } catch (Throwable unused2) {
                    zzo.zzf("AdMob exception reporter failed reporting the exception.");
                }
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }
}
