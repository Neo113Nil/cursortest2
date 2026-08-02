package c1;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import b1.C2350d;
import c1.C2483g;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Objects;

/* renamed from: c1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2483g {

    /* renamed from: a, reason: collision with root package name */
    public final int f26754a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f26755b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f26756c;

    /* renamed from: d, reason: collision with root package name */
    public final C2350d f26757d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26758e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f26759f;

    /* renamed from: c1.g$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f26760a;

        /* renamed from: b, reason: collision with root package name */
        public AudioManager.OnAudioFocusChangeListener f26761b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f26762c;

        /* renamed from: d, reason: collision with root package name */
        public C2350d f26763d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f26764e;

        public C2483g a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f26761b;
            if (onAudioFocusChangeListener != null) {
                return new C2483g(this.f26760a, onAudioFocusChangeListener, (Handler) AbstractC4134a.e(this.f26762c), this.f26763d, this.f26764e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(C2350d c2350d) {
            AbstractC4134a.e(c2350d);
            this.f26763d = c2350d;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            AbstractC4134a.e(onAudioFocusChangeListener);
            AbstractC4134a.e(handler);
            this.f26761b = onAudioFocusChangeListener;
            this.f26762c = handler;
            return this;
        }

        public b d(boolean z10) {
            this.f26764e = z10;
            return this;
        }

        public b(int i10) {
            this.f26763d = C2350d.f24567h;
            this.f26760a = i10;
        }

        public b(C2483g c2483g) {
            this.f26760a = c2483g.e();
            this.f26761b = c2483g.f();
            this.f26762c = c2483g.d();
            this.f26763d = c2483g.b();
            this.f26764e = c2483g.g();
        }
    }

    /* renamed from: c1.g$c */
    public static class c implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f26765a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioManager.OnAudioFocusChangeListener f26766b;

        public c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f26766b = onAudioFocusChangeListener;
            this.f26765a = Z.y(handler.getLooper(), null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            Z.l1(this.f26765a, new Runnable() { // from class: c1.h
                @Override // java.lang.Runnable
                public final void run() {
                    C2483g.c.this.f26766b.onAudioFocusChange(i10);
                }
            });
        }
    }

    public C2483g(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C2350d c2350d, boolean z10) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest build;
        this.f26754a = i10;
        this.f26756c = handler;
        this.f26757d = c2350d;
        this.f26758e = z10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            this.f26755b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.f26755b = onAudioFocusChangeListener;
        }
        if (i11 < 26) {
            this.f26759f = null;
            return;
        }
        audioAttributes = AbstractC2477a.a(i10).setAudioAttributes(c2350d.a().f24581a);
        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z10);
        onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
        build = onAudioFocusChangeListener2.build();
        this.f26759f = build;
    }

    public b a() {
        return new b();
    }

    public C2350d b() {
        return this.f26757d;
    }

    public AudioFocusRequest c() {
        return AbstractC2482f.a(AbstractC4134a.e(this.f26759f));
    }

    public Handler d() {
        return this.f26756c;
    }

    public int e() {
        return this.f26754a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2483g)) {
            return false;
        }
        C2483g c2483g = (C2483g) obj;
        return this.f26754a == c2483g.f26754a && this.f26758e == c2483g.f26758e && Objects.equals(this.f26755b, c2483g.f26755b) && Objects.equals(this.f26756c, c2483g.f26756c) && Objects.equals(this.f26757d, c2483g.f26757d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f26755b;
    }

    public boolean g() {
        return this.f26758e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26754a), this.f26755b, this.f26756c, this.f26757d, Boolean.valueOf(this.f26758e));
    }
}
