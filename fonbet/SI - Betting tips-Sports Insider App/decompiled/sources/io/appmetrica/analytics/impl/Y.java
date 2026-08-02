package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0549v7 f13200a;

    /* renamed from: b, reason: collision with root package name */
    public final C0477sa f13201b;

    public Y() {
        this(new C0549v7(), new C0477sa(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(@NonNull Z z5) {
        C0070c8 c0070c8 = new C0070c8();
        c0070c8.f13505b = this.f13200a.fromModel(z5.f13250a);
        Mn a7 = this.f13201b.a(z5.f13251b);
        c0070c8.f13504a = StringUtils.getUTF8Bytes((String) a7.f12615a);
        return new Di(c0070c8, new C0013a3(C0013a3.b(a7)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(C0549v7 c0549v7, C0477sa c0477sa) {
        this.f13200a = c0549v7;
        this.f13201b = c0477sa;
    }

    @NonNull
    public final Z a(@NonNull Di di2) {
        throw new UnsupportedOperationException();
    }
}
