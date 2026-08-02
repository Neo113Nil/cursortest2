package defpackage;

import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vo0 extends Exception {
    public final boolean a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vo0(int i, int i2, int i3, int i4, b bVar, boolean z, bo0 bo0Var) {
        super(r3.toString(), bo0Var);
        StringBuilder s = lnb.s(i, i2, "AudioTrack init failed 0 Config(", ", ", ", ");
        me4.q(s, i3, ", ", i4, ") ");
        s.append(bVar);
        s.append(z ? " (recoverable)" : "");
        this.a = z;
    }
}
