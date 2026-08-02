package v3;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import j3.C7263e;
import java.util.Objects;

/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10207c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f101884a;

    /* renamed from: b, reason: collision with root package name */
    private final com.appsflyer.internal.c f101885b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f101886c;

    /* renamed from: d, reason: collision with root package name */
    private final a f101887d;

    /* renamed from: e, reason: collision with root package name */
    private final BroadcastReceiver f101888e;

    /* renamed from: f, reason: collision with root package name */
    private final b f101889f;

    /* renamed from: g, reason: collision with root package name */
    private C10205a f101890g;

    /* renamed from: h, reason: collision with root package name */
    private C10208d f101891h;

    /* renamed from: i, reason: collision with root package name */
    private C7263e f101892i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f101893j;

    /* renamed from: v3.c$a */
    private final class a extends AudioDeviceCallback {
        a() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C10207c c10207c = C10207c.this;
            c10207c.f(C10205a.c(c10207c.f101884a, c10207c.f101892i, c10207c.f101891h));
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            C10207c c10207c = C10207c.this;
            if (m3.N.l(audioDeviceInfoArr, c10207c.f101891h)) {
                c10207c.f101891h = null;
            }
            c10207c.f(C10205a.c(c10207c.f101884a, c10207c.f101892i, c10207c.f101891h));
        }
    }

    /* renamed from: v3.c$b */
    /* loaded from: classes8.dex */
    private final class b extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f101895a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f101896b;

        public b(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f101895a = contentResolver;
            this.f101896b = uri;
        }

        public final void a() {
            this.f101895a.registerContentObserver(this.f101896b, false, this);
        }

        public final void b() {
            this.f101895a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z11) {
            C10207c c10207c = C10207c.this;
            c10207c.f(C10205a.c(c10207c.f101884a, c10207c.f101892i, c10207c.f101891h));
        }
    }

    /* renamed from: v3.c$c, reason: collision with other inner class name */
    private final class C2219c extends BroadcastReceiver {
        C2219c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C10207c c10207c = C10207c.this;
            c10207c.f(C10205a.b(context, intent, c10207c.f101892i, c10207c.f101891h));
        }
    }

    C10207c(Context context, com.appsflyer.internal.c cVar, C7263e c7263e, C10208d c10208d) {
        Context applicationContext = context.getApplicationContext();
        this.f101884a = applicationContext;
        this.f101885b = cVar;
        this.f101892i = c7263e;
        this.f101891h = c10208d;
        Handler q11 = m3.N.q(null);
        this.f101886c = q11;
        this.f101887d = new a();
        this.f101888e = new C2219c();
        C10205a c10205a = C10205a.f101875c;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f101889f = uriFor != null ? new b(q11, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(C10205a c10205a) {
        if (!this.f101893j || c10205a.equals(this.f101890g)) {
            return;
        }
        this.f101890g = c10205a;
        ((C10201C) this.f101885b.f57505a).H(c10205a);
    }

    public final void g(C10205a c10205a) {
        f(c10205a);
    }

    public final C10205a h() {
        if (this.f101893j) {
            C10205a c10205a = this.f101890g;
            c10205a.getClass();
            return c10205a;
        }
        this.f101893j = true;
        b bVar = this.f101889f;
        if (bVar != null) {
            bVar.a();
        }
        Handler handler = this.f101886c;
        Context context = this.f101884a;
        a aVar = this.f101887d;
        if (aVar != null) {
            k3.c.c(context).registerAudioDeviceCallback(aVar, handler);
        }
        C10205a b11 = C10205a.b(context, context.registerReceiver(this.f101888e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.f101892i, this.f101891h);
        this.f101890g = b11;
        return b11;
    }

    public final void i(C7263e c7263e) {
        this.f101892i = c7263e;
        f(C10205a.c(this.f101884a, c7263e, this.f101891h));
    }

    public final void j(AudioDeviceInfo audioDeviceInfo) {
        C10208d c10208d = this.f101891h;
        if (Objects.equals(audioDeviceInfo, c10208d == null ? null : c10208d.f101899a)) {
            return;
        }
        C10208d c10208d2 = audioDeviceInfo != null ? new C10208d(audioDeviceInfo) : null;
        this.f101891h = c10208d2;
        f(C10205a.c(this.f101884a, this.f101892i, c10208d2));
    }

    public final void k() {
        if (this.f101893j) {
            this.f101890g = null;
            Context context = this.f101884a;
            a aVar = this.f101887d;
            if (aVar != null) {
                k3.c.c(context).unregisterAudioDeviceCallback(aVar);
            }
            context.unregisterReceiver(this.f101888e);
            b bVar = this.f101889f;
            if (bVar != null) {
                bVar.b();
            }
            this.f101893j = false;
        }
    }
}
