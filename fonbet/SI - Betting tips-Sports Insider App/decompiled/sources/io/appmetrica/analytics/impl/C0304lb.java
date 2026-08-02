package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304lb implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Mc f14193a;

    public C0304lb() {
        this(new Mc(new Rn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NonNull Qn qn) {
        return MessageNano.toByteArray((MessageNano) this.f14193a.f12583a.fromModel(qn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0304lb(Mc mc2) {
        this.f14193a = mc2;
    }

    @NonNull
    public final Qn a(@NonNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
