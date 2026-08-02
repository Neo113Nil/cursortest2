package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549v7 implements ProtobufConverter {
    @NonNull
    public final BigDecimal a(@NonNull C0173g8 c0173g8) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0173g8 fromModel(@NonNull BigDecimal bigDecimal) {
        BigInteger bigInteger = AbstractC0599x7.f14912a;
        int i5 = -bigDecimal.scale();
        BigInteger unscaledValue = bigDecimal.unscaledValue();
        while (true) {
            if (unscaledValue.compareTo(AbstractC0599x7.f14912a) <= 0 && unscaledValue.compareTo(AbstractC0599x7.f14913b) >= 0) {
                C0574w7 c0574w7 = new C0574w7(Long.valueOf(unscaledValue.longValue()).longValue(), Integer.valueOf(i5).intValue());
                C0173g8 c0173g8 = new C0173g8();
                c0173g8.f13810a = c0574w7.f14823a;
                c0173g8.f13811b = c0574w7.f14824b;
                return c0173g8;
            }
            unscaledValue = unscaledValue.divide(BigInteger.TEN);
            i5++;
        }
    }
}
