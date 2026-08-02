package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088d0 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final W f13550a;

    /* renamed from: b, reason: collision with root package name */
    public final C0197h6 f13551b;

    public C0088d0() {
        this(new W(new C0615xn()), new C0197h6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 fromModel(@NonNull C0062c0 c0062c0) {
        S5 s52 = new S5();
        s52.f12858a = this.f13550a.fromModel(c0062c0.f13477a);
        String str = c0062c0.f13478b;
        if (str != null) {
            s52.f12859b = str;
        }
        s52.f12860c = this.f13551b.a(c0062c0.f13479c);
        return s52;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0088d0(W w10, C0197h6 c0197h6) {
        this.f13550a = w10;
        this.f13551b = c0197h6;
    }

    @NonNull
    public final C0062c0 a(@NonNull S5 s52) {
        throw new UnsupportedOperationException();
    }
}
