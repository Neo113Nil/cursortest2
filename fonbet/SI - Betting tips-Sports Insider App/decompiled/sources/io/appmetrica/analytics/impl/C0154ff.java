package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0154ff implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0457rf f13735a;

    /* renamed from: b, reason: collision with root package name */
    public final C0025af f13736b;

    public C0154ff() {
        this(new C0457rf(), new C0025af());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0358nf fromModel(@NonNull C0103df c0103df) {
        C0358nf c0358nf = new C0358nf();
        c0358nf.f14359a = this.f13735a.fromModel(c0103df.f13592a);
        c0358nf.f14360b = new C0333mf[c0103df.f13593b.size()];
        Iterator<C0077cf> it = c0103df.f13593b.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            c0358nf.f14360b[i5] = this.f13736b.fromModel(it.next());
            i5++;
        }
        return c0358nf;
    }

    public C0154ff(C0457rf c0457rf, C0025af c0025af) {
        this.f13735a = c0457rf;
        this.f13736b = c0025af;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0103df toModel(@NonNull C0358nf c0358nf) {
        C0433qf model;
        ArrayList arrayList = new ArrayList(c0358nf.f14360b.length);
        for (C0333mf c0333mf : c0358nf.f14360b) {
            arrayList.add(this.f13736b.toModel(c0333mf));
        }
        C0308lf c0308lf = c0358nf.f14359a;
        if (c0308lf == null) {
            model = this.f13735a.toModel(new C0308lf());
        } else {
            model = this.f13735a.toModel(c0308lf);
        }
        return new C0103df(model, arrayList);
    }
}
