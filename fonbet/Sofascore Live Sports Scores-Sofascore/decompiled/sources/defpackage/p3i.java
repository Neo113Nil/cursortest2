package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.StageTeamPlacement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p3i implements Comparator {
    public final /* synthetic */ List a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ ArrayList c;

    public p3i(List list, Integer num, ArrayList arrayList) {
        this.a = list;
        this.b = num;
        this.c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i;
        Stage stage;
        StageTeamPlacement stageTeamPlacement;
        StageTeamPlacement stageTeamPlacement2;
        l3i l3iVar = (l3i) obj;
        Integer num = this.b;
        int intValue = num.intValue();
        ArrayList arrayList = this.c;
        int size = intValue - arrayList.size();
        List list = this.a;
        Stage stage2 = (Stage) CollectionsKt.a0(size, list);
        int i2 = Integer.MAX_VALUE;
        Integer num2 = null;
        if (stage2 != null) {
            Map map = l3iVar.b;
            Integer position = (map == null || (stageTeamPlacement2 = (StageTeamPlacement) map.get(Integer.valueOf(stage2.getId()))) == null) ? null : stageTeamPlacement2.getPosition();
            if (position != null) {
                i = position.intValue();
                Integer valueOf = Integer.valueOf(i);
                l3i l3iVar2 = (l3i) obj2;
                stage = (Stage) CollectionsKt.a0(num.intValue() - arrayList.size(), list);
                if (stage != null) {
                    Map map2 = l3iVar2.b;
                    if (map2 != null && (stageTeamPlacement = (StageTeamPlacement) map2.get(Integer.valueOf(stage.getId()))) != null) {
                        num2 = stageTeamPlacement.getPosition();
                    }
                    if (num2 != null) {
                        i2 = num2.intValue();
                    }
                }
                return valueOf.compareTo(Integer.valueOf(i2));
            }
        }
        i = Integer.MAX_VALUE;
        Integer valueOf2 = Integer.valueOf(i);
        l3i l3iVar22 = (l3i) obj2;
        stage = (Stage) CollectionsKt.a0(num.intValue() - arrayList.size(), list);
        if (stage != null) {
        }
        return valueOf2.compareTo(Integer.valueOf(i2));
    }
}
