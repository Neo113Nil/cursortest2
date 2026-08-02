package Ld;

import com.zoho.livechat.android.modules.brand.data.remote.entities.BrandStatus;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import og.i;

/* loaded from: classes4.dex */
public abstract class a {
    public static final Channel.Department a(BrandStatus.Component.Department department) {
        Intrinsics.checkNotNullParameter(department, "<this>");
        String displayName = department.getDisplayName();
        String str = displayName == null ? "" : displayName;
        String id2 = department.getId();
        String str2 = id2 == null ? "" : id2;
        String name = department.getName();
        String str3 = name == null ? "" : name;
        boolean i10 = i.i(department.getOnline());
        List<String> operators = department.getOperators();
        if (operators == null) {
            operators = CollectionsKt.emptyList();
        }
        return new Channel.Department(str, department.getEngaged(), str2, str3, Boolean.valueOf(i10), operators, null, null, null);
    }

    public static final List b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List filterNotNull = CollectionsKt.filterNotNull(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterNotNull, 10));
        Iterator it = filterNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add(a((BrandStatus.Component.Department) it.next()));
        }
        return arrayList;
    }
}
