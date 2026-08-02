package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142f3 implements ProtobufConverter {
    @NonNull
    public final C0390om a(@NonNull C0091d3 c0091d3) {
        C0390om c0390om = new C0390om();
        c0390om.f14431a = c0091d3.f13560a;
        return c0390om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object fromModel(@NonNull Object obj) {
        C0390om c0390om = new C0390om();
        c0390om.f14431a = ((C0091d3) obj).f13560a;
        return c0390om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        return new C0091d3(((C0390om) obj).f14431a);
    }

    @NonNull
    public final C0091d3 a(@NonNull C0390om c0390om) {
        return new C0091d3(c0390om.f14431a);
    }
}
