package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Hm implements ProtobufConverter {
    @NonNull
    public final C0564vm a(@NonNull Gm gm) {
        C0564vm c0564vm = new C0564vm();
        c0564vm.f14805a = gm.f12285a;
        return c0564vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C0564vm c0564vm = new C0564vm();
        c0564vm.f14805a = ((Gm) obj).f12285a;
        return c0564vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new Gm(((C0564vm) obj).f14805a);
    }

    @NonNull
    public final Gm a(@NonNull C0564vm c0564vm) {
        return new Gm(c0564vm.f14805a);
    }
}
