package ru.ozon.android.messenger.framework.presentation.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {
    @NotNull
    public static final ArrayList a(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7714v.p(b((q) it.next()), arrayList);
        }
        return arrayList;
    }

    @NotNull
    public static final ArrayList b(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        List<u> b11 = qVar.b();
        ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
        for (u uVar : b11) {
            p newItemInfo = qVar.c();
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            Intrinsics.checkNotNullParameter(newItemInfo, "newItemInfo");
            arrayList.add(new e(uVar.c(), uVar.e(), uVar.d(), newItemInfo, uVar.b()));
        }
        return arrayList;
    }
}
