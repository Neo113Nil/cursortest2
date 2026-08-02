package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yt4 {
    public final Spatializer a;
    public final boolean b;
    public Handler c;
    public fxh d;

    public yt4(Spatializer spatializer) {
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static yt4 f(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new yt4(audioManager.getSpatializer());
    }

    public final boolean a(zm0 zm0Var, sm8 sm8Var) {
        String str = sm8Var.l;
        int i = sm8Var.y;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str) && i == 16) {
            i = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(lik.k(i));
        int i2 = sm8Var.z;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.a;
        dad dadVar = zm0Var.f;
        if (dadVar == null) {
            dadVar = new dad(zm0Var);
            zm0Var.f = dadVar;
        }
        return spatializer.canBeSpatialized((AudioAttributes) dadVar.b, channelMask.build());
    }

    public final void b(hu4 hu4Var, Looper looper) {
        if (this.d == null && this.c == null) {
            this.d = new fxh(hu4Var, 2);
            Handler handler = new Handler(looper);
            this.c = handler;
            this.a.addOnSpatializerStateChangedListener(new ip0(handler, 0), this.d);
        }
    }

    public final boolean c() {
        return this.a.isAvailable();
    }

    public final boolean d() {
        return this.a.isEnabled();
    }

    public final void e() {
        fxh fxhVar = this.d;
        if (fxhVar == null || this.c == null) {
            return;
        }
        this.a.removeOnSpatializerStateChangedListener(fxhVar);
        Handler handler = this.c;
        int i = lik.a;
        handler.removeCallbacksAndMessages(null);
        this.c = null;
        this.d = null;
    }
}
