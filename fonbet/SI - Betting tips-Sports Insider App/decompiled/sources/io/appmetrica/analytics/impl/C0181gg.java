package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181gg implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Yi f13830a;

    /* renamed from: b, reason: collision with root package name */
    public final C0477sa f13831b;

    /* renamed from: c, reason: collision with root package name */
    public final C0477sa f13832c;

    public C0181gg() {
        this(new Yi(), new C0477sa(100), new C0477sa(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(@NonNull C0608xg c0608xg) {
        Di di2;
        C0401p8 c0401p8 = new C0401p8();
        Mn a7 = this.f13831b.a(c0608xg.f14922a);
        c0401p8.f14465a = StringUtils.getUTF8Bytes((String) a7.f12615a);
        Mn a10 = this.f13832c.a(c0608xg.f14923b);
        c0401p8.f14466b = StringUtils.getUTF8Bytes((String) a10.f12615a);
        C0081cj c0081cj = c0608xg.f14924c;
        if (c0081cj != null) {
            di2 = this.f13830a.fromModel(c0081cj);
            c0401p8.f14467c = (C0426q8) di2.f12148a;
        } else {
            di2 = null;
        }
        return new Di(c0401p8, new C0013a3(C0013a3.b(a7, a10, di2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0181gg(Yi yi, C0477sa c0477sa, C0477sa c0477sa2) {
        this.f13830a = yi;
        this.f13831b = c0477sa;
        this.f13832c = c0477sa2;
    }

    @NonNull
    public final C0608xg a(@NonNull Di di2) {
        throw new UnsupportedOperationException();
    }
}
