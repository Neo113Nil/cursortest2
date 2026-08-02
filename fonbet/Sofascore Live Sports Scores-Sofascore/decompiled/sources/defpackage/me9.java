package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class me9 extends i7 {
    public final e1d e;
    public Function0 f;
    public Function1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me9(Context context) {
        super(context);
        context.getClass();
        this.e = e.f(rlh.b);
        setVisibility(8);
    }

    private final gv9 getStars() {
        return (gv9) ((eoh) this.e).getValue();
    }

    private final void setStars(gv9 gv9Var) {
        ((eoh) this.e).setValue(gv9Var);
    }

    @Nullable
    public final Function0<Unit> getOnBoxScoreClick() {
        return this.f;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnPlayerClick() {
        return this.g;
    }

    @Override // defpackage.i7
    public final void j(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1333929788);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            xtc c0 = l98.c0(utc.a, 8.0f, 4.0f);
            gv9 stars = getStars();
            boolean i3 = av8Var.i(this);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i3 || O == a99Var) {
                O = new sr8(this, 6);
                av8Var.n0(O);
            }
            Function0 function0 = (Function0) O;
            boolean i4 = av8Var.i(this);
            Object O2 = av8Var.O();
            if (i4 || O2 == a99Var) {
                O2 = new yx7(this, 21);
                av8Var.n0(O2);
            }
            dy0.m(3072, av8Var, stars, c0, function0, (Function1) O2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hl7(this, i, 27);
        }
    }

    public final void setData(@NotNull gv9 gv9Var) {
        gv9Var.getClass();
        setStars(gv9Var);
        setVisibility(!gv9Var.isEmpty() ? 0 : 8);
    }

    public final void setOnBoxScoreClick(@Nullable Function0<Unit> function0) {
        this.f = function0;
    }

    public final void setOnPlayerClick(@Nullable Function1<? super Integer, Unit> function1) {
        this.g = function1;
    }
}
