package defpackage;

import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import com.sofascore.model.newNetwork.statistics.season.player.FootballPlayerSeasonStatistics;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eh8 extends vi8 {
    public final gl7 O;
    public final gl7 P;
    public final gl7 Q;

    public eh8() {
        super("ACCURATE_CROSSES", 19, new gl7(19), new gl7(20));
        this.O = new gl7(21);
        this.P = new gl7(22);
        this.Q = new gl7(23);
    }

    @Override // defpackage.vi8
    /* renamed from: a */
    public final boolean k(FootballPlayerSeasonStatistics footballPlayerSeasonStatistics, String str) {
        return !Intrinsics.c(str, "G");
    }

    @Override // defpackage.lk2
    public final Function1 d() {
        return this.O;
    }

    @Override // defpackage.lk2
    public final Function1 g() {
        return this.Q;
    }

    @Override // defpackage.lk2
    public final Function1 i() {
        return this.P;
    }

    @Override // defpackage.vi8, defpackage.lk2
    public final boolean k(AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, String str) {
        return !Intrinsics.c(str, "G");
    }
}
