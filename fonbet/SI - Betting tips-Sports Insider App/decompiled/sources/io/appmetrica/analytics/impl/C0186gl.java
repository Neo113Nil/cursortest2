package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186gl implements InterfaceC0044b8 {

    /* renamed from: a, reason: collision with root package name */
    public final Yi f13841a;

    public C0186gl() {
        this(new Yi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(@NonNull C0160fl c0160fl) {
        C0525u8 c0525u8 = new C0525u8();
        c0525u8.f14715a = 1;
        c0525u8.f14716b = new C0500t8();
        Di fromModel = this.f13841a.fromModel(c0160fl.f13751a);
        c0525u8.f14716b.f14671a = (C0426q8) fromModel.f12148a;
        C0013a3 c0013a3 = new C0013a3(C0013a3.b(fromModel));
        fromModel.f12149b.getBytesTruncated();
        return Collections.singletonList(new Di(c0525u8, c0013a3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0186gl(Yi yi) {
        this.f13841a = yi;
    }

    @NonNull
    public final C0160fl a(@NonNull List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
