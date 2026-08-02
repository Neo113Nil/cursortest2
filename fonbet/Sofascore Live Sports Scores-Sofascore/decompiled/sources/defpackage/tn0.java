package defpackage;

import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tn0 {
    public final int a;
    public final nn0 b;
    public final Handler c;
    public final an0 d;
    public final AudioFocusRequest e;

    public tn0(int i, nn0 nn0Var, Handler handler, an0 an0Var, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = an0Var;
        this.b = nn0Var;
        this.e = new AudioFocusRequest.Builder(i).setAudioAttributes(an0Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(nn0Var, handler).setAcceptsDelayedFocusGain(z).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tn0) {
            tn0 tn0Var = (tn0) obj;
            if (this.a == tn0Var.a && this.b == tn0Var.b && this.c.equals(tn0Var.c) && Objects.equals(this.d, tn0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.FALSE);
    }
}
