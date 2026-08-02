package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Cl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 fromModel(@NonNull Dl dl) {
        Z5 z5 = new Z5();
        z5.f13260a = (String) WrapUtils.getOrDefault(dl.f12163a, z5.f13260a);
        z5.f13261b = (String) WrapUtils.getOrDefault(dl.f12164b, z5.f13261b);
        z5.f13262c = ((Integer) WrapUtils.getOrDefault(dl.f12165c, Integer.valueOf(z5.f13262c))).intValue();
        z5.f13265f = ((Integer) WrapUtils.getOrDefault(dl.f12166d, Integer.valueOf(z5.f13265f))).intValue();
        z5.f13263d = (String) WrapUtils.getOrDefault(dl.f12167e, z5.f13263d);
        z5.f13264e = ((Boolean) WrapUtils.getOrDefault(dl.f12168f, Boolean.valueOf(z5.f13264e))).booleanValue();
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Dl a(@NonNull Z5 z5) {
        throw new UnsupportedOperationException();
    }
}
