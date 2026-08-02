package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.media3.exoplayer.a;
import e1.InterfaceC4143j;
import e1.InterfaceC4152t;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20892a;

    /* renamed from: b, reason: collision with root package name */
    public final C0390a f20893b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4152t f20894c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20895d;

    /* renamed from: androidx.media3.exoplayer.a$a, reason: collision with other inner class name */
    public final class C0390a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final b f20896a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC4152t f20897b;

        public C0390a(InterfaceC4152t interfaceC4152t, b bVar) {
            this.f20897b = interfaceC4152t;
            this.f20896a = bVar;
        }

        public final void b() {
            if (a.this.f20895d) {
                this.f20896a.m();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f20897b.j(new Runnable() { // from class: m1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0390a.this.b();
                    }
                });
            }
        }
    }

    public interface b {
        void m();
    }

    public a(Context context, Looper looper, Looper looper2, b bVar, InterfaceC4143j interfaceC4143j) {
        this.f20892a = context.getApplicationContext();
        this.f20894c = interfaceC4143j.d(looper, null);
        this.f20893b = new C0390a(interfaceC4143j.d(looper2, null), bVar);
    }

    public void d(boolean z10) {
        if (z10 == this.f20895d) {
            return;
        }
        if (z10) {
            this.f20894c.j(new Runnable() { // from class: m1.b
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f20892a.registerReceiver(androidx.media3.exoplayer.a.this.f20893b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f20895d = true;
        } else {
            this.f20894c.j(new Runnable() { // from class: m1.c
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f20892a.unregisterReceiver(androidx.media3.exoplayer.a.this.f20893b);
                }
            });
            this.f20895d = false;
        }
    }
}
