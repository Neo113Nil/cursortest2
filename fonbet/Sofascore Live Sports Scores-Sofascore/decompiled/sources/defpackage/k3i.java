package defpackage;

import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k3i {
    public static final k3i e;
    public static final /* synthetic */ k3i[] f;
    public static final /* synthetic */ kp5 g;
    public final int a;
    public final Integer b;
    public final Function1 c;
    public final Function1 d;

    static {
        k3i k3iVar = new k3i("Wins", 0, R.string.win_short, Integer.valueOf(R.string.wins), new l2i(6), new l2i(15));
        k3i k3iVar2 = new k3i("PolePositions", 1, R.string.motorsport_pole_positions_short, Integer.valueOf(R.string.pole_positions), new l2i(16), new l2i(17));
        k3i k3iVar3 = new k3i("Podiums", 2, R.string.motorsport_podiums_short, Integer.valueOf(R.string.podiums), new l2i(18), new l2i(19));
        Integer valueOf = Integer.valueOf(R.string.points);
        k3i k3iVar4 = new k3i("Points", 3, R.string.points_short, valueOf, new l2i(7), new l2i(8));
        k3i k3iVar5 = new k3i("PointsSprint", 4, R.string.points_short, valueOf, new l2i(9), new l2i(10));
        k3i k3iVar6 = new k3i("PointsClimb", 5, R.string.points_short, valueOf, new l2i(11), new l2i(12));
        k3i k3iVar7 = new k3i("Time", 6, R.string.time, null, new l2i(13), new l2i(14));
        e = k3iVar7;
        k3i[] k3iVarArr = {k3iVar, k3iVar2, k3iVar3, k3iVar4, k3iVar5, k3iVar6, k3iVar7};
        f = k3iVarArr;
        g = new kp5(k3iVarArr);
    }

    public k3i(String str, int i, int i2, Integer num, Function1 function1, Function1 function12) {
        this.a = i2;
        this.b = num;
        this.c = function1;
        this.d = function12;
    }

    public static k3i valueOf(String str) {
        return (k3i) Enum.valueOf(k3i.class, str);
    }

    public static k3i[] values() {
        return (k3i[]) f.clone();
    }
}
