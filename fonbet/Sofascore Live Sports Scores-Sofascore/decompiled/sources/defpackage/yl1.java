package defpackage;

import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class yl1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ yl1(Map map, int i) {
        this.a = i;
        this.b = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(yid.m((Integer) map.get(((l91) obj2).name()))).compareTo(Integer.valueOf(yid.m((Integer) map.get(((l91) obj).name()))));
            case 1:
                return Integer.valueOf(yid.m((Integer) map.get(((m91) obj2).name()))).compareTo(Integer.valueOf(yid.m((Integer) map.get(((m91) obj).name()))));
            default:
                return Integer.valueOf(yid.m((Integer) map.get(((l91) obj2).name()))).compareTo(Integer.valueOf(yid.m((Integer) map.get(((l91) obj).name()))));
        }
    }
}
