package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qn0 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler a;
    public final /* synthetic */ rn0 b;

    public qn0(rn0 rn0Var, Handler handler) {
        this.b = rn0Var;
        this.a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.a.post(new pn0(this, i, 0));
    }
}
