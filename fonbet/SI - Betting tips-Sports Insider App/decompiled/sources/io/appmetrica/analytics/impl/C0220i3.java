package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220i3 implements InterfaceC0044b8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0245j3 f13920a;

    public C0220i3() {
        this(new C0245j3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(@NonNull C0194h3 c0194h3) {
        C0525u8 c0525u8 = new C0525u8();
        c0525u8.f14719e = new C0096d8();
        Di fromModel = this.f13920a.fromModel(c0194h3.f13870b);
        c0525u8.f14719e.f13582a = (C0121e8) fromModel.f12148a;
        c0525u8.f14715a = c0194h3.f13869a;
        return Collections.singletonList(new Di(c0525u8, new C0013a3(C0013a3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0220i3(C0245j3 c0245j3) {
        this.f13920a = c0245j3;
    }

    @NonNull
    public final C0194h3 a(@NonNull List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
