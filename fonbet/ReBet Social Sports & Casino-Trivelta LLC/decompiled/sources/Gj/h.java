package Gj;

import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f4231a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f4232b;

    public h(AudioManager audioManager) {
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        this.f4231a = audioManager;
        this.f4232b = new AudioManager.OnAudioFocusChangeListener() { // from class: Gj.g
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                h.d(i10);
            }
        };
    }

    @Override // Gj.f
    public void a() {
        this.f4231a.requestAudioFocus(this.f4232b, 0, 1);
    }

    @Override // Gj.f
    public void b() {
        this.f4231a.abandonAudioFocus(this.f4232b);
    }

    public static final void d(int i10) {
    }
}
