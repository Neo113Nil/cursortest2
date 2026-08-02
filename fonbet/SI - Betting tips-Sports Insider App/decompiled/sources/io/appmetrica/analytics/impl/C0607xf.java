package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607xf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Y f14920a;

    /* renamed from: b, reason: collision with root package name */
    public final C0632yf f14921b;

    public C0607xf() {
        this(new Y(), new C0632yf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(@NonNull C0657zf c0657zf) {
        int i5;
        C0326m8 c0326m8 = new C0326m8();
        Di fromModel = this.f14920a.fromModel(c0657zf.f14995a);
        c0326m8.f14251a = (C0070c8) fromModel.f12148a;
        Mn a7 = this.f14921b.a(c0657zf.f14996b);
        if (lo.a((Collection) a7.f12615a)) {
            i5 = 0;
        } else {
            c0326m8.f14252b = new C0070c8[((List) a7.f12615a).size()];
            i5 = 0;
            for (int i10 = 0; i10 < ((List) a7.f12615a).size(); i10++) {
                Di fromModel2 = this.f14920a.fromModel((Z) ((List) a7.f12615a).get(i10));
                c0326m8.f14252b[i10] = (C0070c8) fromModel2.f12148a;
                i5 += fromModel2.f12149b.getBytesTruncated();
            }
        }
        return new Di(c0326m8, new C0013a3(C0013a3.b(fromModel, a7, new C0013a3(i5))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0607xf(Y y5, C0632yf c0632yf) {
        this.f14920a = y5;
        this.f14921b = c0632yf;
    }

    @NonNull
    public final C0657zf a(@NonNull Di di2) {
        throw new UnsupportedOperationException();
    }
}
