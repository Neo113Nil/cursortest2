package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n4c extends a3 {
    public final e1d k;
    public Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4c(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
        setVisibility(8);
    }

    private final m4c getMediaCtaState() {
        return (m4c) ((eoh) this.k).getValue();
    }

    private final void setMediaCtaState(m4c m4cVar) {
        ((eoh) this.k).setValue(m4cVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(266989507);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            m4c mediaCtaState = getMediaCtaState();
            if (mediaCtaState == null) {
                av8Var.d0(-394986870);
                av8Var.s(false);
            } else {
                av8Var.d0(-394986869);
                haa.f(yqo.H(-1568208562, av8Var, new op9(15, mediaCtaState, this)), av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new faa(this, i, 22);
        }
    }

    public final void l(m4c m4cVar, Function0 function0) {
        this.l = function0;
        setVisibility(0);
        setMediaCtaState(m4cVar);
    }
}
