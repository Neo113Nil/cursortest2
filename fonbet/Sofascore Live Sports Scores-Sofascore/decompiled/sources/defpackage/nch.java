package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nch extends a3 {
    public final fdi k;
    public final fdi l;
    public final fdi m;
    public Function1 n;
    public Function0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nch(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.k = gdi.a(null);
        this.l = gdi.a(r8b.b);
        this.m = gdi.a(bnf.d);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1046581173);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            haa.f(yqo.H(-764597242, av8Var, new mch(this)), av8Var, 6);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new mch(this, i);
        }
    }

    @Nullable
    public final Function0<Unit> getOnPlayFantasyClick() {
        return this.o;
    }

    @Nullable
    public final Function1<Integer, Unit> getPlayerClickListener() {
        return this.n;
    }

    public final void setOnPlayFantasyClick(@Nullable Function0<Unit> function0) {
        this.o = function0;
    }

    public final void setPlayerClickListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.n = function1;
    }
}
