package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573w6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0415pm[] fromModel(@NotNull Map<String, ? extends List<String>> map) {
        C0415pm[] c0415pmArr = new C0415pm[map.size()];
        int i5 = 0;
        for (Object obj : map.entrySet()) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.u.j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0415pm c0415pm = new C0415pm();
            c0415pm.f14490a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c0415pm.f14491b = (String[]) array;
            c0415pmArr[i5] = c0415pm;
            i5 = i10;
        }
        return c0415pmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(@NotNull C0415pm[] c0415pmArr) {
        int a7 = kotlin.collections.m0.a(c0415pmArr.length);
        if (a7 < 16) {
            a7 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        for (C0415pm c0415pm : c0415pmArr) {
            linkedHashMap.put(c0415pm.f14490a, kotlin.collections.p.z(c0415pm.f14491b));
        }
        return linkedHashMap;
    }
}
