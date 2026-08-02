package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Bl implements ListConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Cl f12070a = new Cl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5[] fromModel(@NonNull List<Dl> list) {
        Z5[] z5Arr = new Z5[list.size()];
        Iterator<Dl> it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            z5Arr[i5] = this.f12070a.fromModel(it.next());
            i5++;
        }
        return z5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Dl> a(Z5[] z5Arr) {
        throw new UnsupportedOperationException();
    }
}
