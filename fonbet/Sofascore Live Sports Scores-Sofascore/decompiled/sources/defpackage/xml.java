package defpackage;

import java.io.InvalidObjectException;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xml extends glf implements Serializable {

    @NotNull
    private static final wml i = new wml(null);
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    private final Object readResolve() {
        try {
            j();
            return this;
        } catch (Throwable th) {
            Throwable initCause = new InvalidObjectException(th.getMessage()).initCause(th);
            initCause.getClass();
            throw initCause;
        }
    }

    @Override // defpackage.glf
    public final int a(int i2) {
        return (d() >>> (32 - i2)) & ((-i2) >> 31);
    }

    @Override // defpackage.glf
    public final int d() {
        int i2 = this.c;
        int i3 = i2 ^ (i2 >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i4 = this.g;
        this.f = i4;
        int i5 = ((i3 ^ (i3 << 1)) ^ i4) ^ (i4 << 4);
        this.g = i5;
        int i6 = this.h + 362437;
        this.h = i6;
        return i5 + i6;
    }

    public final void j() {
        if ((this.g | this.c | this.d | this.e | this.f) != 0) {
            return;
        }
        a70.p("Initial state must have at least one non-zero element.");
    }
}
