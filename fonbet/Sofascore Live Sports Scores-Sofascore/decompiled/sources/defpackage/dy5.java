package defpackage;

import com.sofascore.model.network.response.EventStatisticsItem;
import java.util.Comparator;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dy5 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;

    public /* synthetic */ dy5(int i, Set set) {
        this.a = i;
        this.b = set;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Set set = this.b;
        switch (i) {
            case 0:
                String name = ((EventStatisticsItem) obj).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                lowerCase.getClass();
                Integer valueOf = Integer.valueOf(CollectionsKt.b0(set, lowerCase));
                String lowerCase2 = ((EventStatisticsItem) obj2).getName().toLowerCase(locale);
                lowerCase2.getClass();
                return valueOf.compareTo(Integer.valueOf(CollectionsKt.b0(set, lowerCase2)));
            default:
                return Integer.valueOf(CollectionsKt.b0(set, ((s4c) obj).a)).compareTo(Integer.valueOf(CollectionsKt.b0(set, ((s4c) obj2).a)));
        }
    }
}
