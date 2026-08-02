package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uo0 extends Exception {
    public final int a;
    public final boolean b;
    public final sm8 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uo0(int i, int i2, int i3, int i4, sm8 sm8Var, boolean z, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder s = lnb.s(i, i2, "AudioTrack init failed ", " Config(", ", ");
        me4.q(s, i3, ", ", i4, ")");
        s.append(z ? " (recoverable)" : "");
        this.a = i;
        this.b = z;
        this.c = sm8Var;
    }
}
