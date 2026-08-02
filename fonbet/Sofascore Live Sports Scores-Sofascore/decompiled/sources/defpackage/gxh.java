package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gxh {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final fxh d;

    public gxh(Context context, Runnable runnable, Boolean bool) {
        AudioManager y = context == null ? null : un0.y(context);
        if (y == null || (bool != null && bool.booleanValue())) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            return;
        }
        Spatializer spatializer = y.getSpatializer();
        this.a = spatializer;
        this.b = spatializer.getImmersiveAudioLevel() != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.c = handler;
        fxh fxhVar = new fxh(runnable, 0);
        this.d = fxhVar;
        spatializer.addOnSpatializerStateChangedListener(new ip0(handler, 0), fxhVar);
    }

    public final boolean a(an0 an0Var, b bVar) {
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = bVar.o;
        int i = bVar.G;
        if (Objects.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int t = nik.t(i);
        if (t == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t);
        int i2 = bVar.H;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(an0Var.a(), channelMask.build());
    }

    public final List b() {
        if (this.a == null || !this.b || !c() || !d()) {
            av9 av9Var = hv9.b;
            return vvf.e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return hv9.z(252);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean d() {
        Spatializer spatializer = this.a;
        return spatializer != null && spatializer.isEnabled();
    }

    public final void e() {
        fxh fxhVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (fxhVar = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(fxhVar);
        handler.removeCallbacksAndMessages(null);
    }
}
