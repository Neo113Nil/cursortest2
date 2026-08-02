package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548v6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Eg f14770a;

    public C0548v6() {
        this(new Eg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 fromModel(@NonNull C0523u6 c0523u6) {
        X5 fromModel = this.f14770a.fromModel(c0523u6.f14704a);
        fromModel.f13173g = 1;
        W5 w52 = new W5();
        fromModel.f13174h = w52;
        w52.f13082a = StringUtils.correctIllFormedString(c0523u6.f14705b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0548v6(Eg eg2) {
        this.f14770a = eg2;
    }

    @NonNull
    public final C0523u6 a(@NonNull X5 x52) {
        throw new UnsupportedOperationException();
    }
}
