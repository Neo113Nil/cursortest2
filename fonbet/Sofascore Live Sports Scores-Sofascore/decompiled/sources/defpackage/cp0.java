package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cp0 {
    public final AudioTrack a;
    public final AudioTimestamp b;
    public long c;
    public long d;
    public long e;

    public cp0(AudioTrack audioTrack, int i) {
        switch (i) {
            case 1:
                this.a = audioTrack;
                this.b = new AudioTimestamp();
                break;
            default:
                this.a = audioTrack;
                this.b = new AudioTimestamp();
                break;
        }
    }
}
