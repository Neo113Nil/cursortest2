package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(@NotNull C0681p c0681p) {
        O o3 = new O();
        o3.f15319a = c0681p.f15389a;
        Object[] array = c0681p.f15390b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o3.f15321c = (String[]) array;
        o3.f15320b = c0681p.f15391c;
        return o3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0681p toModel(@NotNull O o3) {
        return new C0681p(o3.f15319a, kotlin.collections.p.z(o3.f15321c), o3.f15320b);
    }
}
