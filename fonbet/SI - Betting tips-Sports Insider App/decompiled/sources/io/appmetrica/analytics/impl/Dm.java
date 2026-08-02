package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Dm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0539um fromModel(@NotNull Cm cm) {
        C0539um c0539um = new C0539um();
        c0539um.f14755a = cm.f12119a;
        return c0539um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Cm(((C0539um) obj).f14755a);
    }

    @NotNull
    public final Cm a(@NotNull C0539um c0539um) {
        return new Cm(c0539um.f14755a);
    }
}
