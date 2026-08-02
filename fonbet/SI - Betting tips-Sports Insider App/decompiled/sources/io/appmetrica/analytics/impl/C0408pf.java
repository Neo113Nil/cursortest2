package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408pf implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer fromModel(@NonNull S7 s72) {
        int ordinal = s72.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S7 toModel(@NonNull Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return S7.f12862c;
        }
        if (intValue == 2) {
            return S7.f12864e;
        }
        if (intValue != 3) {
            return S7.f12861b;
        }
        return S7.f12863d;
    }
}
