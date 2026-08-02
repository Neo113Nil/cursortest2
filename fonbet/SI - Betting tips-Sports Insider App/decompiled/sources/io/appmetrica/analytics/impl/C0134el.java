package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134el implements InterfaceC0044b8 {

    /* renamed from: a, reason: collision with root package name */
    public final Gf f13705a;

    /* renamed from: b, reason: collision with root package name */
    public final C0181gg f13706b;

    public C0134el() {
        this(new Gf(), new C0181gg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(@NonNull C0109dl c0109dl) {
        Di di2;
        C0525u8 c0525u8 = new C0525u8();
        c0525u8.f14715a = 3;
        c0525u8.f14718d = new C0475s8();
        Di fromModel = this.f13705a.fromModel(c0109dl.f13596a);
        c0525u8.f14718d.f14621a = (C0351n8) fromModel.f12148a;
        C0608xg c0608xg = c0109dl.f13597b;
        if (c0608xg != null) {
            di2 = this.f13706b.fromModel(c0608xg);
            c0525u8.f14718d.f14622b = (C0401p8) di2.f12148a;
        } else {
            di2 = null;
        }
        return Collections.singletonList(new Di(c0525u8, new C0013a3(C0013a3.b(fromModel, di2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0134el(Gf gf2, C0181gg c0181gg) {
        this.f13705a = gf2;
        this.f13706b = c0181gg;
    }

    @NonNull
    public final C0109dl a(@NonNull List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
