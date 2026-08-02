package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ik implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Kk fromModel(@NotNull Map<String, byte[]> map) {
        Kk kk = new Kk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Lk lk = new Lk();
            lk.f12551a = entry.getKey().getBytes(Charsets.UTF_8);
            lk.f12552b = entry.getValue();
            arrayList.add(lk);
        }
        Object[] array = arrayList.toArray(new Lk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kk.f12487a = (Lk[]) array;
        return kk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull Kk kk) {
        Lk[] lkArr = kk.f12487a;
        int a7 = kotlin.collections.m0.a(lkArr.length);
        if (a7 < 16) {
            a7 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        for (Lk lk : lkArr) {
            linkedHashMap.put(new String(lk.f12551a, Charsets.UTF_8), lk.f12552b);
        }
        return linkedHashMap;
    }
}
