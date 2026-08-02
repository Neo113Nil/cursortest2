package Gj;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f4239a;

    /* renamed from: b, reason: collision with root package name */
    public final n f4240b;

    /* renamed from: c, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f4241c;

    /* renamed from: d, reason: collision with root package name */
    public AudioFocusRequest f4242d;

    public l(AudioManager audioManager, n requestFactory) {
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        this.f4239a = audioManager;
        this.f4240b = requestFactory;
        this.f4241c = new AudioManager.OnAudioFocusChangeListener() { // from class: Gj.k
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                l.d(i10);
            }
        };
    }

    @Override // Gj.f
    public void a() {
        AudioFocusRequest a10 = this.f4240b.a(this.f4241c);
        this.f4242d = a10;
        AudioManager audioManager = this.f4239a;
        Intrinsics.checkNotNull(a10);
        audioManager.requestAudioFocus(a10);
    }

    @Override // Gj.f
    public void b() {
        AudioFocusRequest audioFocusRequest = this.f4242d;
        if (audioFocusRequest != null) {
            this.f4239a.abandonAudioFocusRequest(audioFocusRequest);
        }
        this.f4242d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(int i10) {
    }
}
