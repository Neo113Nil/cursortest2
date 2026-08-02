package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gn0 {
    public static final AudioAttributes a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        zu9 s = hv9.s();
        cck it = in0.e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), a)) {
                s.c(num);
            }
        }
        s.c(2);
        return jaa.O(s.g());
    }

    public static int b(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(lik.k(i3)).build(), a)) {
                return i3;
            }
        }
        return 0;
    }
}
