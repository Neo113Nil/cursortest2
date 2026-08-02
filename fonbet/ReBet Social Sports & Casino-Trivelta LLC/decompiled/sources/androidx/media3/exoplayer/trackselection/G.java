package androidx.media3.exoplayer.trackselection;

import b1.T;
import e1.AbstractC4134a;
import java.util.Objects;
import m1.k1;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f21913a;

    /* renamed from: b, reason: collision with root package name */
    public final T f21914b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21915c;
    public final k1[] rendererConfigurations;
    public final y[] selections;

    public G(k1[] k1VarArr, y[] yVarArr, T t10, Object obj) {
        AbstractC4134a.a(k1VarArr.length == yVarArr.length);
        this.rendererConfigurations = k1VarArr;
        this.selections = (y[]) yVarArr.clone();
        this.f21914b = t10;
        this.f21915c = obj;
        this.f21913a = k1VarArr.length;
    }

    public boolean a(G g10) {
        if (g10 == null || g10.selections.length != this.selections.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.selections.length; i10++) {
            if (!b(g10, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(G g10, int i10) {
        return g10 != null && Objects.equals(this.rendererConfigurations[i10], g10.rendererConfigurations[i10]) && Objects.equals(this.selections[i10], g10.selections[i10]);
    }

    public boolean c(int i10) {
        return this.rendererConfigurations[i10] != null;
    }
}
