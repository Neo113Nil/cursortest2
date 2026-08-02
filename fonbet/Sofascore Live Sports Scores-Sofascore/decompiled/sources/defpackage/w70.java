package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w70 implements hn4 {
    public Object a;
    public Object b;

    public w70(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    public wn0 a(an0 an0Var, b bVar) {
        Boolean bool;
        boolean booleanValue;
        bVar.getClass();
        int i = bVar.H;
        an0Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return wn0.d;
        }
        Context context = (Context) this.a;
        Boolean bool2 = (Boolean) this.b;
        if (bool2 != null) {
            booleanValue = bool2.booleanValue();
        } else {
            if (context != null) {
                String parameters = un0.y(context).getParameters("offloadVariableRateSupported");
                bool = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                this.b = bool;
            } else {
                bool = Boolean.FALSE;
                this.b = bool;
            }
            booleanValue = bool.booleanValue();
        }
        String str = bVar.o;
        str.getClass();
        int d = sjc.d(str, bVar.k);
        if (d == 0 || i2 < nik.s(d)) {
            return wn0.d;
        }
        int t = nik.t(bVar.G);
        if (t == 0) {
            return wn0.d;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(t).setEncoding(d).build();
            if (i2 >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, an0Var.a());
                if ((directPlaybackSupport & 1) == 0) {
                    return wn0.d;
                }
                r4 = (directPlaybackSupport & 3) == 3;
                vn0 vn0Var = new vn0();
                vn0Var.a = true;
                vn0Var.b = r4;
                vn0Var.c = booleanValue;
                return vn0Var.a();
            }
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(build, an0Var.a())) {
                    return wn0.d;
                }
                vn0 vn0Var2 = new vn0();
                vn0Var2.a = true;
                vn0Var2.c = booleanValue;
                return vn0Var2.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, an0Var.a());
            if (playbackOffloadSupport == 0) {
                return wn0.d;
            }
            vn0 vn0Var3 = new vn0();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                r4 = true;
            }
            vn0Var3.a = true;
            vn0Var3.b = r4;
            vn0Var3.c = booleanValue;
            return vn0Var3.a();
        } catch (IllegalArgumentException unused) {
            return wn0.d;
        }
    }

    public boolean b() {
        boolean unregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener((v70) this.a);
        this.a = null;
        return unregisterDurationScaleChangeListener;
    }
}
