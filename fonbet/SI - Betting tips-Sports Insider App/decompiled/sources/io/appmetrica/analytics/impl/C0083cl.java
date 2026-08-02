package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083cl implements InterfaceC0044b8 {

    /* renamed from: a, reason: collision with root package name */
    public final Yi f13540a;

    /* renamed from: b, reason: collision with root package name */
    public final Gf f13541b;

    public C0083cl() {
        this(new Yi(), new Gf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(@NonNull C0057bl c0057bl) {
        C0525u8 c0525u8 = new C0525u8();
        c0525u8.f14715a = 2;
        c0525u8.f14717c = new C0450r8();
        Di fromModel = this.f13540a.fromModel(c0057bl.f13461b);
        c0525u8.f14717c.f14552b = (C0426q8) fromModel.f12148a;
        Di fromModel2 = this.f13541b.fromModel(c0057bl.f13460a);
        c0525u8.f14717c.f14551a = (C0351n8) fromModel2.f12148a;
        return Collections.singletonList(new Di(c0525u8, new C0013a3(C0013a3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0083cl(Yi yi, Gf gf2) {
        this.f13540a = yi;
        this.f13541b = gf2;
    }

    @NonNull
    public final C0057bl a(@NonNull List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
