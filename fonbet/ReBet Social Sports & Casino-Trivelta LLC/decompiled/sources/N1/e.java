package N1;

import H1.O;
import b1.C2338G;
import e1.J;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final O f7875a;

    public static final class a extends C2338G {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public e(O o10) {
        this.f7875a = o10;
    }

    public final boolean a(J j10, long j11) {
        return b(j10) && c(j10, j11);
    }

    public abstract boolean b(J j10);

    public abstract boolean c(J j10, long j11);
}
