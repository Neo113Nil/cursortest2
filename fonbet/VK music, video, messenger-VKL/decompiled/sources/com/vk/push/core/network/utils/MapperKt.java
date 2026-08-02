package com.vk.push.core.network.utils;

import com.vk.push.common.AppInfo;
import com.vk.push.core.network.data.model.AppInfoRemote;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.j5g;
import xsna.jw5;

/* compiled from: Mapper.kt */
/* loaded from: classes5.dex */
public final class MapperKt {
    public static final List<AppInfo> getSortedAppInfoListByArbiter(List<AppInfoRemote> list) {
        List D0 = j5g.D0(new Comparator() { // from class: com.vk.push.core.network.utils.MapperKt$getSortedAppInfoListByArbiter$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return jw5.b(Boolean.valueOf(!((AppInfoRemote) t).isArbiter()), Boolean.valueOf(!((AppInfoRemote) t2).isArbiter()));
            }
        }, list);
        ArrayList arrayList = new ArrayList(c5g.u(D0, 10));
        Iterator it = D0.iterator();
        while (it.hasNext()) {
            arrayList.add(toAppInfo((AppInfoRemote) it.next()));
        }
        return arrayList;
    }

    public static final AppInfo toAppInfo(AppInfoRemote appInfoRemote) {
        return new AppInfo(appInfoRemote.getPackageName(), appInfoRemote.getPubKey());
    }
}
