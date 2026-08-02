package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class C9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0440qm fromModel(@Nullable B9 b92) {
        C0440qm c0440qm = new C0440qm();
        if (b92 != null) {
            c0440qm.f14526a = b92.f12042a;
        }
        return c0440qm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new B9(((C0440qm) obj).f14526a);
    }

    @NotNull
    public final B9 a(@NotNull C0440qm c0440qm) {
        return new B9(c0440qm.f14526a);
    }
}
