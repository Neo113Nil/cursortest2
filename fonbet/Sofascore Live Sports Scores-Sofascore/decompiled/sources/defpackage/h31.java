package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.ESportsGamePlayerStatistics;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h31 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ h31(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        List list = this.b;
        switch (i2) {
            case 0:
                return Integer.valueOf(list.indexOf((String) obj)).compareTo(Integer.valueOf(list.indexOf((String) obj2)));
            case 1:
                ESportsGamePlayerStatistics eSportsGamePlayerStatistics = (ESportsGamePlayerStatistics) obj;
                String role = eSportsGamePlayerStatistics.getRole();
                if (role == null) {
                    role = eSportsGamePlayerStatistics.getPlayer().getPosition();
                }
                Integer valueOf = Integer.valueOf(CollectionsKt.c0(list, role));
                if (valueOf.intValue() < 0) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    valueOf = r0;
                }
                ESportsGamePlayerStatistics eSportsGamePlayerStatistics2 = (ESportsGamePlayerStatistics) obj2;
                String role2 = eSportsGamePlayerStatistics2.getRole();
                if (role2 == null) {
                    role2 = eSportsGamePlayerStatistics2.getPlayer().getPosition();
                }
                Integer valueOf2 = Integer.valueOf(CollectionsKt.c0(list, role2));
                Integer num = valueOf2.intValue() >= 0 ? valueOf2 : null;
                return valueOf.compareTo(num != null ? num : Integer.MAX_VALUE);
            case 2:
                return Integer.valueOf(list.indexOf(Integer.valueOf(((Event) obj).getId()))).compareTo(Integer.valueOf(list.indexOf(Integer.valueOf(((Event) obj2).getId()))));
            case 3:
                return Integer.valueOf(list.indexOf(Integer.valueOf(((Event) obj).getId()))).compareTo(Integer.valueOf(list.indexOf(Integer.valueOf(((Event) obj2).getId()))));
            default:
                String str = (String) obj;
                Iterator it = list.iterator();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i4 = -1;
                    } else if (!Intrinsics.c((String) it.next(), str)) {
                        i4++;
                    }
                }
                Integer valueOf3 = Integer.valueOf(i4);
                String str2 = (String) obj2;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.c((String) it2.next(), str2)) {
                            i = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                return valueOf3.compareTo(Integer.valueOf(i));
        }
    }
}
