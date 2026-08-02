package o1;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import b1.C2350d;
import e1.AbstractC4134a;
import java.util.Objects;

/* renamed from: o1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5757i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f58829a;

    /* renamed from: b, reason: collision with root package name */
    public final f f58830b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f58831c;

    /* renamed from: d, reason: collision with root package name */
    public final c f58832d;

    /* renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f58833e;

    /* renamed from: f, reason: collision with root package name */
    public final d f58834f;

    /* renamed from: g, reason: collision with root package name */
    public C5753e f58835g;

    /* renamed from: h, reason: collision with root package name */
    public C5758j f58836h;

    /* renamed from: i, reason: collision with root package name */
    public C2350d f58837i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f58838j;

    /* renamed from: o1.i$b */
    public static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            c1.m.c(context).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            c1.m.c(context).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* renamed from: o1.i$c */
    public final class c extends AudioDeviceCallback {
        public c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C5757i c5757i = C5757i.this;
            c5757i.f(C5753e.f(c5757i.f58829a, C5757i.this.f58837i, C5757i.this.f58836h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (e1.Z.r(audioDeviceInfoArr, C5757i.this.f58836h)) {
                C5757i.this.f58836h = null;
            }
            C5757i c5757i = C5757i.this;
            c5757i.f(C5753e.f(c5757i.f58829a, C5757i.this.f58837i, C5757i.this.f58836h));
        }
    }

    /* renamed from: o1.i$d */
    public final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f58840a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f58841b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f58840a = contentResolver;
            this.f58841b = uri;
        }

        public void a() {
            this.f58840a.registerContentObserver(this.f58841b, false, this);
        }

        public void b() {
            this.f58840a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            C5757i c5757i = C5757i.this;
            c5757i.f(C5753e.f(c5757i.f58829a, C5757i.this.f58837i, C5757i.this.f58836h));
        }
    }

    /* renamed from: o1.i$e */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C5757i c5757i = C5757i.this;
            c5757i.f(C5753e.e(context, intent, c5757i.f58837i, C5757i.this.f58836h));
        }
    }

    /* renamed from: o1.i$f */
    public interface f {
        void a(C5753e c5753e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5757i(Context context, f fVar, C2350d c2350d, C5758j c5758j) {
        Context applicationContext = context.getApplicationContext();
        this.f58829a = applicationContext;
        this.f58830b = (f) AbstractC4134a.e(fVar);
        this.f58837i = c2350d;
        this.f58836h = c5758j;
        Handler B10 = e1.Z.B();
        this.f58831c = B10;
        this.f58832d = new c();
        this.f58833e = new e();
        Uri i10 = C5753e.i();
        this.f58834f = i10 != null ? new d(B10, applicationContext.getContentResolver(), i10) : null;
    }

    public final void f(C5753e c5753e) {
        if (!this.f58838j || c5753e.equals(this.f58835g)) {
            return;
        }
        this.f58835g = c5753e;
        this.f58830b.a(c5753e);
    }

    public void g(C5753e c5753e) {
        f(c5753e);
    }

    public C5753e h() {
        if (this.f58838j) {
            return (C5753e) AbstractC4134a.e(this.f58835g);
        }
        this.f58838j = true;
        d dVar = this.f58834f;
        if (dVar != null) {
            dVar.a();
        }
        c cVar = this.f58832d;
        if (cVar != null) {
            b.a(this.f58829a, cVar, this.f58831c);
        }
        C5753e e10 = C5753e.e(this.f58829a, this.f58829a.registerReceiver(this.f58833e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f58831c), this.f58837i, this.f58836h);
        this.f58835g = e10;
        return e10;
    }

    public void i(C2350d c2350d) {
        this.f58837i = c2350d;
        f(C5753e.f(this.f58829a, c2350d, this.f58836h));
    }

    public void j(AudioDeviceInfo audioDeviceInfo) {
        C5758j c5758j = this.f58836h;
        if (Objects.equals(audioDeviceInfo, c5758j == null ? null : c5758j.f58844a)) {
            return;
        }
        C5758j c5758j2 = audioDeviceInfo != null ? new C5758j(audioDeviceInfo) : null;
        this.f58836h = c5758j2;
        f(C5753e.f(this.f58829a, this.f58837i, c5758j2));
    }

    public void k() {
        if (this.f58838j) {
            this.f58835g = null;
            c cVar = this.f58832d;
            if (cVar != null) {
                b.b(this.f58829a, cVar);
            }
            this.f58829a.unregisterReceiver(this.f58833e);
            d dVar = this.f58834f;
            if (dVar != null) {
                dVar.b();
            }
            this.f58838j = false;
        }
    }
}
