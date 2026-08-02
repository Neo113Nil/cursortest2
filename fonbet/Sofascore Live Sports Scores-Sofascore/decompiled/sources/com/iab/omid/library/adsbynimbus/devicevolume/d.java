package com.iab.omid.library.adsbynimbus.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class d extends ContentObserver {
    private final Handler a;
    private final Context b;
    private final AudioManager c;
    private final com.iab.omid.library.adsbynimbus.devicevolume.a d;
    private final c e;
    private final AtomicReference<Float> f;
    private final AtomicBoolean g;
    private final ExecutorService h;

    public class a implements Runnable {

        /* renamed from: com.iab.omid.library.adsbynimbus.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0138a implements Runnable {
            final /* synthetic */ float a;

            public RunnableC0138a(float f) {
                this.a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.e.a(this.a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float a = d.this.a();
            d.this.g.set(false);
            if (((Float) d.this.f.getAndSet(Float.valueOf(a))).floatValue() != a) {
                d.this.a.post(new RunnableC0138a(a));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.adsbynimbus.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.g = new AtomicBoolean(false);
        this.h = Executors.newSingleThreadExecutor();
        this.a = handler;
        this.b = context;
        this.c = (AudioManager) context.getSystemService("audio");
        this.d = aVar;
        this.e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.d.a(this.c.getStreamVolume(3), this.c.getStreamMaxVolume(3));
    }

    private void d() {
        this.h.submit(new a());
    }

    public void b() {
        d();
        this.b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        if (this.g.getAndSet(true)) {
            return;
        }
        d();
    }
}
