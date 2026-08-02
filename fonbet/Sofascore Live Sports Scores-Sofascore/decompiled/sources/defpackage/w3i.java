package defpackage;

import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.results.R;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w3i {
    public static final w3i d;
    public static final /* synthetic */ w3i[] e;
    public static final /* synthetic */ kp5 f;
    public final int a;
    public final List b;
    public final Integer c;

    static {
        w3i w3iVar = new w3i("PRACTICE", 0, R.string.motorsport_f1_free_practice, b.j(ServerType.PRACTICE, ServerType.PRACTICE_PART), null);
        w3i w3iVar2 = new w3i("SPRINT", 1, R.string.formula_sprint, b.j(ServerType.SPRINT, ServerType.SPRINT_QUALIFYING, ServerType.SPRINT_QUALIFYING_PART), null);
        w3i w3iVar3 = new w3i("QUALIFYING", 2, R.string.motorsport_qualifying, b.j(ServerType.QUALIFYING, ServerType.QUALIFYING_PART), null);
        w3i w3iVar4 = new w3i("RACE", 3, R.string.formula_race, a.c(ServerType.RACE), null);
        w3i w3iVar5 = new w3i("SUMMARY", 4, R.string.summary, b.j(ServerType.AFTER_STAGE, ServerType.DAY, ServerType.CUSTOM), null);
        d = w3iVar5;
        w3i[] w3iVarArr = {w3iVar, w3iVar2, w3iVar3, w3iVar4, w3iVar5, new w3i("STANDINGS", 5, R.string.motorsport_overall_results, a.c(ServerType.CYCLING_OVERALL), null), new w3i("STAGE", 6, R.string.stages, a.c(ServerType.STAGE), Integer.valueOf(R.string.cycling_stages))};
        e = w3iVarArr;
        f = new kp5(w3iVarArr);
    }

    public w3i(String str, int i, int i2, List list, Integer num) {
        this.a = i2;
        this.b = list;
        this.c = num;
    }

    public static w3i valueOf(String str) {
        return (w3i) Enum.valueOf(w3i.class, str);
    }

    public static w3i[] values() {
        return (w3i[]) e.clone();
    }
}
