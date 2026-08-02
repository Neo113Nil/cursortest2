package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406pd implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0612xk f14475a = C0353na.k().p();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0489sm[] fromModel(@NotNull Map<String, ? extends Object> map) {
        C0489sm c0489sm;
        Map<String, Yc> c2 = this.f14475a.c();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Yc yc2 = c2.get(key);
            if (yc2 == null || value == null) {
                c0489sm = null;
            } else {
                c0489sm = new C0489sm();
                c0489sm.f14648a = key;
                c0489sm.f14649b = (byte[]) yc2.f13224c.fromModel(value);
            }
            if (c0489sm != null) {
                arrayList.add(c0489sm);
            }
        }
        Object[] array = arrayList.toArray(new C0489sm[0]);
        if (array != null) {
            return (C0489sm[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, Object> toModel(@NotNull C0489sm[] c0489smArr) {
        Map<String, Yc> c2 = this.f14475a.c();
        ArrayList arrayList = new ArrayList();
        for (C0489sm c0489sm : c0489smArr) {
            Yc yc2 = c2.get(c0489sm.f14648a);
            Pair pair = yc2 != null ? new Pair(c0489sm.f14648a, yc2.f13224c.toModel(c0489sm.f14649b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return kotlin.collections.n0.h(arrayList);
    }
}
