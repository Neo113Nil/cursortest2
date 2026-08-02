package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final P fromModel(@NotNull a0 a0Var) {
        P p10 = new P();
        p10.f15323a = a0Var.f15347a;
        p10.f15324b = a0Var.f15348b;
        return p10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P p10 = (P) obj;
        return new a0(p10.f15323a, p10.f15324b);
    }

    @NotNull
    public final a0 a(@NotNull P p10) {
        return new a0(p10.f15323a, p10.f15324b);
    }
}
