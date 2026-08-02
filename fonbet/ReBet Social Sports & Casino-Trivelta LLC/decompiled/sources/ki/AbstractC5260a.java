package ki;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import li.AbstractC5470d;
import net.time4j.A;
import net.time4j.F;
import net.time4j.G;
import net.time4j.P;
import net.time4j.android.spi.AndroidResourceLoader;
import net.time4j.format.e;
import net.time4j.format.expert.C5709c;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.p;

/* renamed from: ki.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5260a {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f54519a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f54520b = new AtomicBoolean(false);

    /* renamed from: ki.a$b */
    public static class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long nanoTime = System.nanoTime();
            k p10 = p.p(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000);
            Locale locale = Locale.getDefault();
            try {
                A b10 = P.b();
                p10 = l.O().z();
                Log.i("TIME4A", "System time zone at start: [" + p10.a() + "]");
                Log.i("TIME4A", "System locale at start: [" + locale.toString() + "]");
                e eVar = e.FULL;
                Log.i("TIME4A", C5709c.B(eVar, eVar, locale, p10).l(b10));
                Log.i("TIME4A", "Prefetch thread consumed (in ms): " + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Throwable th2) {
                Log.e("TIME4A", "Error on prefetch thread with: time zone=" + p10.a() + ", locale=" + locale + "!", th2);
                throw new IllegalStateException(th2);
            }
        }
    }

    /* renamed from: ki.a$c */
    public static class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.b.a();
            Log.i("TIME4A", "Event ACTION_TIMEZONE_CHANGED received, system timezone changed to: [" + l.O().z().a() + "]. Original tz-id reported by Android: [" + intent.getStringExtra("time-zone") + "]");
        }
    }

    public static void a(Context context, Runnable runnable) {
        long nanoTime = System.nanoTime();
        c(context, null);
        d(context.getApplicationContext());
        Log.i("TIME4A", "Starting Time4A (v4.8-2021a published on " + F.B0(2021, 3, 27).i0(G.z0()).Z() + ")");
        if (runnable != null) {
            Executors.defaultThreadFactory().newThread(runnable).start();
        }
        Log.i("TIME4A", "Main-Thread consumed in ms: " + ((System.nanoTime() - nanoTime) / 1000000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Context context, boolean z10) {
        a(context, z10 ? new b() : null);
    }

    public static void c(Context context, InterfaceC5261b interfaceC5261b) {
        if (f54519a.getAndSet(true)) {
            return;
        }
        System.setProperty("net.time4j.base.ResourceLoader", "net.time4j.android.spi.AndroidResourceLoader");
        ((AndroidResourceLoader) AbstractC5470d.c()).j(context, interfaceC5261b);
    }

    public static void d(Context context) {
        if (context == null || f54520b.getAndSet(true)) {
            return;
        }
        System.setProperty("net.time4j.allow.system.tz.override", "true");
        context.registerReceiver(new c(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
    }
}
