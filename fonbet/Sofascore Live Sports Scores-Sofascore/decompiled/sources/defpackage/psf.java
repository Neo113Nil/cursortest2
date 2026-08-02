package defpackage;

import com.sofascore.model.newNetwork.RefereeStatisticsItem;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class psf implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ rs2 b;

    public /* synthetic */ psf(rs2 rs2Var, int i) {
        this.a = i;
        this.b = rs2Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        rs2 rs2Var = this.b;
        switch (i) {
            case 0:
                int compare = rs2Var.compare(obj, obj2);
                if (compare == 0) {
                    break;
                }
                break;
            case 1:
                int compare2 = rs2Var.compare(obj, obj2);
                if (compare2 == 0) {
                    break;
                }
                break;
            default:
                int compare3 = rs2Var.compare(obj, obj2);
                if (compare3 == 0) {
                    break;
                }
                break;
        }
        return o93.b(((RefereeStatisticsItem) obj2).getUniqueTournament().getName(), ((RefereeStatisticsItem) obj).getUniqueTournament().getName());
    }
}
