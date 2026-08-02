package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vb6 extends i7 {
    public final e1d e;
    public Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb6(Context context) {
        super(context);
        context.getClass();
        this.e = e.f(null);
        setVisibility(8);
    }

    private final gv9 getState() {
        return (gv9) ((eoh) this.e).getValue();
    }

    private final void setState(gv9 gv9Var) {
        ((eoh) this.e).setValue(gv9Var);
    }

    @Nullable
    public final Function0<Unit> getOnMoreStatsClick() {
        return this.f;
    }

    @Override // defpackage.i7
    public final void j(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(648274588);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            gv9 state = getState();
            if (state == null) {
                av8Var.d0(-1719640315);
                av8Var.s(false);
            } else {
                av8Var.d0(-1719640314);
                boolean i3 = av8Var.i(this);
                Object O = av8Var.O();
                if (i3 || O == nf3.a) {
                    O = new h63(this, 26);
                    av8Var.n0(O);
                }
                hkg.g(state, (Function0) O, l98.c0(utc.a, 8.0f, 4.0f), av8Var, 384);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fv2(this, i, 26);
        }
    }

    public final void l(gv9 gv9Var) {
        setState(gv9Var);
        setVisibility(gv9Var == null || gv9Var.isEmpty() ? 8 : 0);
    }

    public final void setOnMoreStatsClick(@Nullable Function0<Unit> function0) {
        this.f = function0;
    }
}
