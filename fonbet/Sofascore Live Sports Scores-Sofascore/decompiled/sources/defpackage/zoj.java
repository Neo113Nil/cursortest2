package defpackage;

import com.sofascore.model.newNetwork.topperformance.response.FutsalTopTeamsStatistics;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FutsalTopTeamsStatisticsItem;
import com.sofascore.results.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zoj implements ipj {
    public static final /* synthetic */ zoj[] d;
    public static final /* synthetic */ kp5 e;
    public final int a;
    public final Function1 b;
    public final Function1 c;

    static {
        zoj[] zojVarArr = {new zoj("GOALS_SCORED", 0, R.string.futsal_goals_scored, new xoj(3), new xoj(4)), new zoj("GOALS_CONCEDED", 1, R.string.futsal_goals_conceded, new xoj(5), new xoj(6)), new zoj("CLEAN_SHEETS", 2, R.string.football_clean_sheets, new xoj(7), new xoj(8)), new zoj("YELLOW_CARDS", 3, R.string.football_yellow_cards, new xoj(9), new xoj(10)), new zoj("RED_CARDS", 4, R.string.futsal_red_cards, new xoj(11), new xoj(12))};
        d = zojVarArr;
        e = new kp5(zojVarArr);
    }

    public zoj(String str, int i, int i2, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = function1;
        this.c = function12;
    }

    public static zoj valueOf(String str) {
        return (zoj) Enum.valueOf(zoj.class, str);
    }

    public static zoj[] values() {
        return (zoj[]) d.clone();
    }

    @Override // defpackage.ipj
    public final /* bridge */ String a(Object obj) {
        return super.a((FutsalTopTeamsStatisticsItem) obj);
    }

    @Override // defpackage.ipj
    public final /* bridge */ List b(Object obj) {
        return super.b((FutsalTopTeamsStatistics) obj);
    }

    @Override // defpackage.ipj
    public final int d() {
        return this.a;
    }

    @Override // defpackage.ipj
    public final Function1 g() {
        return this.c;
    }

    @Override // defpackage.ipj
    public final Function1 h() {
        return this.b;
    }
}
