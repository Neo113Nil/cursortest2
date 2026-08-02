package af;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import od.w;

/* renamed from: af.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1935a {
    public static final List a(List list) {
        List list2;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Se.a aVar = ((w) obj).f61180h;
                if (aVar == Se.a.CHAT || aVar == Se.a.CHAT_AND_CALL) {
                    arrayList.add(obj);
                }
            }
            list2 = CollectionsKt.toList(arrayList);
        } else {
            list2 = null;
        }
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }
}
