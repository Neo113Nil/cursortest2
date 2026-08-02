package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzd {
    public static final zzd b = new zzd();
    public AudioAttributes a;

    static {
        String str = zzfm.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public final AudioAttributes a() {
        AudioAttributes audioAttributes = this.a;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(1);
            usage.setHapticChannelsMuted(true);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(0);
            usage.setIsContentSpatialized(false);
        }
        AudioAttributes build = usage.build();
        this.a = build;
        return build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzd.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436042064;
    }
}
