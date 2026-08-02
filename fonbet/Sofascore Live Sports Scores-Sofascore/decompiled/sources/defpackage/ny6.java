package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class ny6 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ny6(ale aleVar, boolean z, boolean z2, boolean z3, xtc xtcVar, int i) {
        this.g = aleVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = xtcVar;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int K = aba.K(i2 | 1);
                boolean z = this.b;
                boolean z2 = this.c;
                dy0.h((FantasyRoundPlayerUiModel) obj4, z, z2, (xtc) obj3, this.d, (of3) obj, K);
                break;
            case 1:
                ((Integer) obj2).getClass();
                t62.v((ale) obj4, this.b, this.c, this.d, (xtc) obj3, (of3) obj, aba.K(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(1);
                mha.d(this.b, this.c, this.d, this.f, (ox1) obj4, (Function0) obj3, (of3) obj, K2);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ny6(FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, boolean z, boolean z2, xtc xtcVar, boolean z3, int i) {
        this.g = fantasyRoundPlayerUiModel;
        this.b = z;
        this.c = z2;
        this.e = xtcVar;
        this.d = z3;
        this.f = i;
    }

    public /* synthetic */ ny6(boolean z, boolean z2, boolean z3, int i, ox1 ox1Var, Function0 function0, int i2) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = i;
        this.g = ox1Var;
        this.e = function0;
    }
}
