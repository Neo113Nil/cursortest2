package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class s2c {
    public static void a(zo0 zo0Var, @Nullable Object obj) {
        gn4 gn4Var;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        on4 on4Var = (on4) zo0Var;
        if (audioDeviceInfo == null) {
            gn4Var = null;
        } else {
            on4Var.getClass();
            gn4Var = new gn4(audioDeviceInfo);
        }
        on4Var.Y = gn4Var;
        AudioTrack audioTrack = on4Var.u;
        if (audioTrack != null) {
            en4.a(audioTrack, gn4Var);
        }
    }
}
