package defpackage;

import android.media.AudioTrack;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class en4 {
    public static void a(AudioTrack audioTrack, @Nullable gn4 gn4Var) {
        audioTrack.setPreferredDevice(gn4Var == null ? null : gn4Var.a);
    }
}
