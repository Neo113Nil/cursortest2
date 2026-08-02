package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class W implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0615xn f13073a;

    public W(@NonNull C0615xn c0615xn) {
        this.f13073a = c0615xn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final R5 fromModel(@NonNull V v5) {
        R5 r5 = new R5();
        C0590wn c0590wn = v5.f12994a;
        if (c0590wn != null) {
            r5.f12804a = this.f13073a.fromModel(c0590wn);
        }
        r5.f12805b = new C0016a6[v5.f12995b.size()];
        Iterator it = v5.f12995b.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            r5.f12805b[i5] = this.f13073a.fromModel((C0590wn) it.next());
            i5++;
        }
        String str = v5.f12996c;
        if (str != null) {
            r5.f12806c = str;
        }
        return r5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final V a(@NonNull R5 r5) {
        throw new UnsupportedOperationException();
    }
}
