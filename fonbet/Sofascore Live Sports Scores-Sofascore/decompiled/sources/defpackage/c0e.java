package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c0e extends a3 {
    public final e1d k;
    public Function1 l;
    public Player m;
    public Player n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0e(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.k = e.f(new a0e(null, null));
    }

    private final a0e getUiModel() {
        return (a0e) ((eoh) this.k).getValue();
    }

    private final void setUiModel(a0e a0eVar) {
        ((eoh) this.k).setValue(a0eVar);
    }

    @Override // defpackage.a3
    public final void a(int i, of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1991074804);
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        final int i3 = 1;
        final int i4 = 0;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, utc.a);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            zzd zzdVar = getUiModel().a;
            a99 a99Var = nf3.a;
            if (zzdVar == null) {
                av8Var.d0(-756073636);
                av8Var.s(false);
            } else {
                av8Var.d0(-756073635);
                boolean i5 = av8Var.i(this);
                Object O = av8Var.O();
                if (i5 || O == a99Var) {
                    O = new Function0(this) { // from class: b0e
                        public final /* synthetic */ c0e b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function1 function1;
                            Function1 function12;
                            int i6 = i4;
                            c0e c0eVar = this.b;
                            switch (i6) {
                                case 0:
                                    Player player = c0eVar.m;
                                    if (player != null && (function1 = c0eVar.l) != null) {
                                        function1.invoke(player);
                                    }
                                    break;
                                default:
                                    Player player2 = c0eVar.n;
                                    if (player2 != null && (function12 = c0eVar.l) != null) {
                                        function12.invoke(player2);
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(O);
                }
                mha.c(zzdVar, (Function0) O, av8Var, 0);
                av8Var.s(false);
            }
            zzd zzdVar2 = getUiModel().b;
            if (zzdVar2 == null) {
                av8Var.d0(-755824613);
                av8Var.s(false);
            } else {
                av8Var.d0(-755824612);
                boolean i6 = av8Var.i(this);
                Object O2 = av8Var.O();
                if (i6 || O2 == a99Var) {
                    O2 = new Function0(this) { // from class: b0e
                        public final /* synthetic */ c0e b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Function1 function1;
                            Function1 function12;
                            int i62 = i3;
                            c0e c0eVar = this.b;
                            switch (i62) {
                                case 0:
                                    Player player = c0eVar.m;
                                    if (player != null && (function1 = c0eVar.l) != null) {
                                        function1.invoke(player);
                                    }
                                    break;
                                default:
                                    Player player2 = c0eVar.n;
                                    if (player2 != null && (function12 = c0eVar.l) != null) {
                                        function12.invoke(player2);
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(O2);
                }
                mha.c(zzdVar2, (Function0) O2, av8Var, 0);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t1d(this, i, 5);
        }
    }

    public final zzd l(Incident.SubstitutionIncident substitutionIncident, boolean z, Player player) {
        Player playerIn;
        String playerNameIn;
        Player playerOut;
        Context context = getContext();
        context.getClass();
        String Q = hkg.Q(context, !z ? R.string.substituted_in : R.string.substituted_out, player != null ? player.getGender() : null, new Object[0]);
        String str = "-";
        if (!z ? !(((playerIn = substitutionIncident.getPlayerIn()) == null || (playerNameIn = tba.t(playerIn)) == null) && (playerNameIn = substitutionIncident.getPlayerNameIn()) == null) : !(((playerOut = substitutionIncident.getPlayerOut()) == null || (playerNameIn = tba.t(playerOut)) == null) && (playerNameIn = substitutionIncident.getPlayerNameOut()) == null)) {
            str = playerNameIn;
        }
        String i = wv8.i(Q, ": ", str);
        Map map = qz9.a;
        Context context2 = getContext();
        context2.getClass();
        return new zzd(z, i, qz9.a(context2, substitutionIncident), player != null ? Integer.valueOf(player.getId()) : null, substitutionIncident.getInjury() && z, (this.l == null || player == null) ? false : true);
    }

    public final void m(Incident.SubstitutionIncident substitutionIncident, Incident.SubstitutionIncident substitutionIncident2, Function1 function1) {
        this.l = function1;
        Player playerOut = substitutionIncident != null ? substitutionIncident.getPlayerOut() : null;
        Player playerIn = substitutionIncident2 != null ? substitutionIncident2.getPlayerIn() : null;
        zzd l = substitutionIncident != null ? l(substitutionIncident, true, playerOut) : null;
        zzd l2 = substitutionIncident2 != null ? l(substitutionIncident2, false, playerIn) : null;
        if (substitutionIncident == null || substitutionIncident2 == null || yid.m(substitutionIncident.getTime()) <= yid.m(substitutionIncident2.getTime())) {
            this.m = playerOut;
            this.n = playerIn;
            setUiModel(new a0e(l, l2));
        } else {
            this.m = playerIn;
            this.n = playerOut;
            setUiModel(new a0e(l2, l));
        }
    }
}
