package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lxa extends a3 {
    public final e1d k;
    public final znh l;
    public final e1d m;
    public zsk n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxa(Context context) {
        super(context, null, 0);
        context.getClass();
        this.k = e.f(null);
        this.l = e.c(-1);
        this.m = e.f(null);
        setVisibility(8);
    }

    private final exa getGoatPlayers() {
        return (exa) ((eoh) this.k).getValue();
    }

    private final Function0<Unit> getOnShareClick() {
        return (Function0) ((eoh) this.m).getValue();
    }

    private final int getUniqueTournamentId() {
        return this.l.h();
    }

    public static final Unit l(lxa lxaVar) {
        Function0<Unit> onShareClick = lxaVar.getOnShareClick();
        if (onShareClick != null) {
            onShareClick.invoke();
        }
        return Unit.a;
    }

    private final void setGoatPlayers(exa exaVar) {
        ((eoh) this.k).setValue(exaVar);
    }

    private final void setOnShareClick(Function0<Unit> function0) {
        ((eoh) this.m).setValue(function0);
    }

    private final void setUniqueTournamentId(int i) {
        this.l.i(i);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2042567743);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            exa goatPlayers = getGoatPlayers();
            if (goatPlayers == null) {
                av8Var.d0(-960972289);
                av8Var.s(false);
            } else {
                av8Var.d0(-960972288);
                int uniqueTournamentId = getUniqueTournamentId();
                boolean i3 = av8Var.i(this);
                Object O = av8Var.O();
                if (i3 || O == nf3.a) {
                    O = new sr8(this, 22);
                    av8Var.n0(O);
                }
                h5a.j(goatPlayers, uniqueTournamentId, (Function0) O, l98.c0(utc.a, 8.0f, 4.0f), av8Var, 0);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new faa(this, i, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function0] */
    public final void m(exa exaVar, int i, wua wuaVar) {
        gv9 gv9Var;
        exaVar.getClass();
        setVisibility(!exaVar.b.isEmpty() ? 0 : 8);
        setGoatPlayers(exaVar);
        setUniqueTournamentId(i);
        ?? onShareClick = getOnShareClick();
        if (onShareClick != 0) {
            wuaVar = onShareClick;
        }
        setOnShareClick(wuaVar);
        exa goatPlayers = getGoatPlayers();
        if (goatPlayers == null || (gv9Var = goatPlayers.b) == null || !(!gv9Var.isEmpty())) {
            zsk zskVar = this.n;
            if (zskVar != null) {
                zskVar.a();
            }
            this.n = null;
            return;
        }
        if (this.n != null) {
            return;
        }
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new a16(this, 2, this));
            return;
        }
        g6b t = qea.t(this);
        if (t != null) {
            zsk zskVar2 = new zsk(t, 30);
            zskVar2.b(this, new ps4(this, 7), null);
            this.n = zskVar2;
        }
    }
}
