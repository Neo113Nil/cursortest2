package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402p9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0352n9 fromModel(@NonNull C0377o9 c0377o9) {
        C0352n9 c0352n9 = new C0352n9();
        String str = c0377o9.f14404a;
        if (str != null) {
            c0352n9.f14320a = str.getBytes();
        }
        return c0352n9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0377o9 toModel(@NonNull C0352n9 c0352n9) {
        return new C0377o9(new String(c0352n9.f14320a));
    }
}
