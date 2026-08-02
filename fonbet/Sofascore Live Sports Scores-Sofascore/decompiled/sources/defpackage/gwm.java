package defpackage;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gwm implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
    public final WeakReference a;

    public gwm(pwm pwmVar) {
        this.a = new WeakReference(pwmVar);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        dem demVar;
        try {
            pwm pwmVar = (pwm) this.a.get();
            if (pwmVar == null || (demVar = pwmVar.c) == null) {
                return;
            }
            demVar.pcc(pwmVar, i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        hem hemVar;
        try {
            pwm pwmVar = (pwm) this.a.get();
            if (pwmVar == null || (hemVar = pwmVar.b) == null) {
                return;
            }
            hemVar.pcc(pwmVar);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        xdm xdmVar;
        try {
            pwm pwmVar = (pwm) this.a.get();
            if (pwmVar == null || (xdmVar = pwmVar.f) == null) {
                return false;
            }
            return xdmVar.pcc(pwmVar, i, i2);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        aem aemVar;
        try {
            pwm pwmVar = (pwm) this.a.get();
            if (pwmVar == null || (aemVar = pwmVar.g) == null) {
                return false;
            }
            return aemVar.sf(pwmVar, i, i2);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        lem lemVar;
        try {
            pwm pwmVar = (pwm) this.a.get();
            if (pwmVar == null || (lemVar = pwmVar.a) == null) {
                return;
            }
            lemVar.sf(pwmVar);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        mem memVar;
        try {
            pwm pwmVar = (pwm) this.a.get();
            if (pwmVar == null || (memVar = pwmVar.d) == null) {
                return;
            }
            memVar.gm(pwmVar);
        } catch (Throwable unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        gem gemVar;
        try {
            pwm pwmVar = (pwm) this.a.get();
            if (pwmVar == null || (gemVar = pwmVar.e) == null) {
                return;
            }
            gemVar.pcc(pwmVar, i, i2, 1, 1);
        } catch (Throwable unused) {
        }
    }
}
