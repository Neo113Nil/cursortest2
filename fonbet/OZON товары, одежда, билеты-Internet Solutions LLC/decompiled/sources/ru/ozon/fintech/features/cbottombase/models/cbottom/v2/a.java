package ru.ozon.fintech.features.cbottombase.models.cbottom.v2;

import F40.b;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.widgets.v2.LazyColumnDTO;

/* loaded from: classes3.dex */
public interface a extends Parcelable, A40.a, B40.a {

    /* renamed from: ru.ozon.fintech.features.cbottombase.models.cbottom.v2.a$a, reason: collision with other inner class name */
    public static final class C1999a {
        public static boolean a(@NotNull a aVar, List<? extends F40.a> list, boolean z11, String str, List<String> list2) {
            List<F40.a> list3;
            if (str == null || list2 == null) {
                return false;
            }
            if (!z11) {
                list = aVar.getAllWidgets();
            }
            if (list == null) {
                return false;
            }
            for (F40.a aVar2 : list) {
                if (aVar2 instanceof LazyColumnDTO) {
                    LazyColumnDTO lazyColumnDTO = (LazyColumnDTO) aVar2;
                    List<F40.a> widgets = lazyColumnDTO.getWidgets();
                    if (Intrinsics.d(lazyColumnDTO.getId(), str) && (list3 = widgets) != null && !list3.isEmpty()) {
                        List<F40.a> widgets2 = lazyColumnDTO.getWidgets();
                        int h11 = U.h(C7714v.z(widgets2, 10));
                        if (h11 < 16) {
                            h11 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                        for (Object obj : widgets2) {
                            linkedHashMap.put(((F40.a) obj).getId(), obj);
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            F40.a aVar3 = (F40.a) linkedHashMap.get((String) it.next());
                            if (aVar3 != null) {
                                arrayList.add(aVar3);
                            }
                        }
                        lazyColumnDTO.getWidgets().clear();
                        lazyColumnDTO.getWidgets().addAll(arrayList);
                        return true;
                    }
                } else if ((aVar2 instanceof b) && aVar.updateLazyColumnWidgetsOrder(((b) aVar2).getWidgets(), true, str, list2)) {
                    return true;
                }
            }
            return false;
        }
    }
}
