package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0245j3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Gf f13995a;

    /* renamed from: b, reason: collision with root package name */
    public final C0549v7 f13996b;

    /* renamed from: c, reason: collision with root package name */
    public final C0607xf f13997c;

    /* renamed from: d, reason: collision with root package name */
    public final C0181gg f13998d;

    public C0245j3() {
        this(new Gf(), new C0549v7(), new C0607xf(), new C0181gg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(@NonNull C0271k3 c0271k3) {
        Di di2;
        C0121e8 c0121e8 = new C0121e8();
        Di fromModel = this.f13995a.fromModel(c0271k3.f14088a);
        c0121e8.f13650a = (C0351n8) fromModel.f12148a;
        c0121e8.f13652c = this.f13996b.fromModel(c0271k3.f14089b);
        Di fromModel2 = this.f13997c.fromModel(c0271k3.f14090c);
        c0121e8.f13653d = (C0326m8) fromModel2.f12148a;
        C0608xg c0608xg = c0271k3.f14091d;
        if (c0608xg != null) {
            di2 = this.f13998d.fromModel(c0608xg);
            c0121e8.f13651b = (C0401p8) di2.f12148a;
        } else {
            di2 = null;
        }
        return new Di(c0121e8, new C0013a3(C0013a3.b(fromModel, fromModel2, di2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0245j3(Gf gf2, C0549v7 c0549v7, C0607xf c0607xf, C0181gg c0181gg) {
        this.f13995a = gf2;
        this.f13996b = c0549v7;
        this.f13997c = c0607xf;
        this.f13998d = c0181gg;
    }

    @NonNull
    public final C0271k3 a(@NonNull Di di2) {
        throw new UnsupportedOperationException();
    }
}
