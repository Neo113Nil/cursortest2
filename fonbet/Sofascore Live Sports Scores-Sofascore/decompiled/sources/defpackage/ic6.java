package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.results.R;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ic6 extends a3 {
    public final e1d k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic6(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1681475094);
        int i2 = (av8Var.g(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            ny5 data = getData();
            if (data == null) {
                av8Var.d0(-620913293);
                av8Var.s(false);
            } else {
                av8Var.d0(-620913292);
                un0.i(data, n9e.q(l98.c0(utc.a, 8.0f, 4.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), av8Var, 0);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fv2(this, i, 28);
        }
    }

    @Nullable
    public final ny5 getData() {
        return (ny5) ((eoh) this.k).getValue();
    }

    public final void setData(@Nullable ny5 ny5Var) {
        ((eoh) this.k).setValue(ny5Var);
    }
}
