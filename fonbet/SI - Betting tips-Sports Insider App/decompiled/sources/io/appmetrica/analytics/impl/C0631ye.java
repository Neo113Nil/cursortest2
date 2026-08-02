package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631ye implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0514tm fromModel(@NonNull C0606xe c0606xe) {
        C0514tm c0514tm = new C0514tm();
        c0514tm.f14688a = c0606xe.f14918a;
        c0514tm.f14689b = c0606xe.f14919b;
        return c0514tm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C0514tm c0514tm = (C0514tm) obj;
        return new C0606xe(c0514tm.f14688a, c0514tm.f14689b);
    }

    @NonNull
    public final C0606xe a(@NonNull C0514tm c0514tm) {
        return new C0606xe(c0514tm.f14688a, c0514tm.f14689b);
    }
}
