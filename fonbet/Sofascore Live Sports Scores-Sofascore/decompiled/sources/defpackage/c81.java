package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c81 implements lk2 {
    public final uj1 a;

    public c81(uj1 uj1Var) {
        uj1Var.getClass();
        this.a = uj1Var;
    }

    @Override // defpackage.lk2
    public final Function1 d() {
        return new b81(this, 3);
    }

    @Override // defpackage.lk2
    public final Function1 g() {
        return new b81(this, 0);
    }

    @Override // defpackage.lk2
    public final Function1 h() {
        return new b81(this, 2);
    }

    @Override // defpackage.lk2
    public final Function1 i() {
        return new b81(this, 3);
    }

    @Override // defpackage.lk2
    public final Function1 j() {
        return new b81(this, 1);
    }

    @Override // defpackage.lk2
    public final boolean k(AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, String str) {
        return true;
    }
}
