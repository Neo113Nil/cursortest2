package xe;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class L0 extends I {
    @Override // xe.I
    @NotNull
    public String toString() {
        L0 l02;
        String str;
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 l03 = De.s.f6650a;
        if (this == l03) {
            str = "Dispatchers.Main";
        } else {
            try {
                l02 = l03.x();
            } catch (UnsupportedOperationException unused) {
                l02 = null;
            }
            str = this == l02 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + Q.a(this);
    }

    @NotNull
    public abstract L0 x();
}
