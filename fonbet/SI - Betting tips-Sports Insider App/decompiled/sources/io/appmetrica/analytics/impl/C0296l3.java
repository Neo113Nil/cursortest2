package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296l3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0452ra f14163a;

    public C0296l3() {
        this(new C0452ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(@NonNull List<String> list) {
        Mn a7 = this.f14163a.a((List<Object>) list);
        C0147f8 c0147f8 = new C0147f8();
        c0147f8.f13721a = StringUtils.getUTF8Bytes((List<String>) a7.f12615a);
        InterfaceC0039b3 interfaceC0039b3 = a7.f12616b;
        int i5 = ((C0347n4) interfaceC0039b3).f13333a;
        return new Di(c0147f8, interfaceC0039b3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0296l3(@NonNull C0452ra c0452ra) {
        this.f14163a = c0452ra;
    }

    @NonNull
    public final List<String> a(@NonNull Di di2) {
        throw new UnsupportedOperationException();
    }
}
