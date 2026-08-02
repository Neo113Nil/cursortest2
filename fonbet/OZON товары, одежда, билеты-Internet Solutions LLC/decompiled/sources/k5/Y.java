package k5;

import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import k5.InterfaceC7576v1;

/* loaded from: classes8.dex */
abstract class Y extends AbstractC7560r1 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: e, reason: collision with root package name */
    private final U1 f70674e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f70675f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f70676g;

    /* renamed from: h, reason: collision with root package name */
    private int f70677h;

    Y(@NonNull AudioManager audioManager, @NonNull U1 u12) {
        super(audioManager);
        this.f70674e = u12;
    }

    public static void k(Y y11) {
        synchronized (y11) {
            if (y11.i(y11.e().getMode(), true)) {
                y11.f70674e.d();
                y11.n();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void m() {
        try {
            if (!this.f70675f) {
                if (o(this) != 0) {
                    this.f70675f = true;
                } else {
                    int i11 = this.f70677h + 1;
                    this.f70677h = i11;
                    if (i11 < 6) {
                        if (this.f70676g == null) {
                            this.f70676g = d();
                        }
                        this.f70676g.postDelayed(new Runnable() { // from class: k5.V
                            @Override // java.lang.Runnable
                            public final void run() {
                                Y.this.m();
                            }
                        }, TimeUnit.SECONDS.toMillis(10L));
                    } else {
                        f();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // k5.AbstractC7560r1, k5.InterfaceC7576v1
    public final void a(@NonNull InterfaceC7576v1.a aVar) {
        super.a(aVar);
        if (g() && this.f70675f) {
            p(this);
            this.f70675f = false;
        }
    }

    @Override // k5.AbstractC7560r1, k5.InterfaceC7576v1
    public final void b(@NonNull InterfaceC7576v1.a aVar) {
        super.b(aVar);
        c();
    }

    @Override // k5.InterfaceC7576v1
    public final void c() {
        if (g()) {
            return;
        }
        this.f70677h = 0;
        m();
    }

    @Override // k5.AbstractC7560r1
    protected final void j() {
        super.j();
        this.f70674e.d();
        if (this.f70675f) {
            p(this);
            this.f70675f = false;
        }
    }

    final void n() {
        if (this.f70675f) {
            p(this);
            this.f70675f = false;
        }
        m();
    }

    abstract int o(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [k5.W] */
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i11) {
        i(e().getMode(), true);
        this.f70674e.d();
        this.f70674e.f(new Runnable() { // from class: k5.W
            @Override // java.lang.Runnable
            public final void run() {
                Y.k(Y.this);
            }
        }, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MINUTES.toMillis(1L), new X(this));
    }

    abstract void p(@NonNull AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener);
}
