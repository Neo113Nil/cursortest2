package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346n3 implements InterfaceC0060bo {
    @Override // io.appmetrica.analytics.impl.InterfaceC0060bo, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C0445r3> invoke(@NotNull List<C0445r3> list, @NotNull C0445r3 c0445r3) {
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                S7 s72 = ((C0445r3) it.next()).f14542b;
                S7 s73 = c0445r3.f14542b;
                if (s72 == s73) {
                    if (s73 != S7.f12862c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C0445r3) obj).f14542b != S7.f12862c) {
                            arrayList.add(obj);
                        }
                    }
                    return CollectionsKt.O(arrayList, c0445r3);
                }
            }
        }
        return CollectionsKt.O(list, c0445r3);
    }
}
