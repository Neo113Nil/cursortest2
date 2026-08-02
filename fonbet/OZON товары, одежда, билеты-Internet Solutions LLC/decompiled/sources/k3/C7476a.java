package k3;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.media3.exoplayer.C5442d;
import j3.C7263e;
import java.util.Objects;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7476a {

    /* renamed from: a, reason: collision with root package name */
    private final int f70364a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f70365b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f70366c;

    /* renamed from: d, reason: collision with root package name */
    private final C7263e f70367d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f70368e;

    /* renamed from: f, reason: collision with root package name */
    private final AudioFocusRequest f70369f;

    C7476a(int i11, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C7263e c7263e, boolean z11) {
        this.f70364a = i11;
        this.f70366c = handler;
        this.f70367d = c7263e;
        this.f70368e = z11;
        this.f70365b = onAudioFocusChangeListener;
        this.f70369f = new AudioFocusRequest.Builder(i11).setAudioAttributes(c7263e.a().f69059a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public final C1153a a() {
        return new C1153a(this);
    }

    public final C7263e b() {
        return this.f70367d;
    }

    final AudioFocusRequest c() {
        AudioFocusRequest audioFocusRequest = this.f70369f;
        audioFocusRequest.getClass();
        return audioFocusRequest;
    }

    public final Handler d() {
        return this.f70366c;
    }

    public final int e() {
        return this.f70364a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7476a)) {
            return false;
        }
        C7476a c7476a = (C7476a) obj;
        return this.f70364a == c7476a.f70364a && this.f70368e == c7476a.f70368e && Objects.equals(this.f70365b, c7476a.f70365b) && Objects.equals(this.f70366c, c7476a.f70366c) && Objects.equals(this.f70367d, c7476a.f70367d);
    }

    public final AudioManager.OnAudioFocusChangeListener f() {
        return this.f70365b;
    }

    public final boolean g() {
        return this.f70368e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f70364a), this.f70365b, this.f70366c, this.f70367d, Boolean.valueOf(this.f70368e));
    }

    /* renamed from: k3.a$a, reason: collision with other inner class name */
    public static final class C1153a {

        /* renamed from: a, reason: collision with root package name */
        private int f70370a;

        /* renamed from: b, reason: collision with root package name */
        private AudioManager.OnAudioFocusChangeListener f70371b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f70372c;

        /* renamed from: d, reason: collision with root package name */
        private C7263e f70373d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f70374e;

        public C1153a(int i11) {
            this.f70373d = C7263e.f69057b;
            this.f70370a = i11;
        }

        public final C7476a a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f70371b;
            if (onAudioFocusChangeListener == null) {
                throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
            }
            Handler handler = this.f70372c;
            handler.getClass();
            return new C7476a(this.f70370a, onAudioFocusChangeListener, handler, this.f70373d, this.f70374e);
        }

        public final void b(C7263e c7263e) {
            c7263e.getClass();
            this.f70373d = c7263e;
        }

        public final void c(C5442d c5442d, Handler handler) {
            handler.getClass();
            this.f70371b = c5442d;
            this.f70372c = handler;
        }

        public final void d(boolean z11) {
            this.f70374e = z11;
        }

        C1153a(C7476a c7476a) {
            this.f70370a = c7476a.e();
            this.f70371b = c7476a.f();
            this.f70372c = c7476a.d();
            this.f70373d = c7476a.b();
            this.f70374e = c7476a.g();
        }
    }
}
