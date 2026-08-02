package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class If implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0452ra f12383a;

    public If() {
        this(new C0452ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(@NonNull List<String> list) {
        Mn a7 = this.f12383a.a((List<Object>) list);
        List list2 = (List) a7.f12615a;
        C0376o8[] c0376o8Arr = new C0376o8[0];
        if (list2 != null) {
            c0376o8Arr = new C0376o8[list2.size()];
            for (int i5 = 0; i5 < list2.size(); i5++) {
                C0376o8 c0376o8 = new C0376o8();
                c0376o8Arr[i5] = c0376o8;
                c0376o8.f14403a = StringUtils.getUTF8Bytes((String) list2.get(i5));
            }
        }
        a7.f12616b.getBytesTruncated();
        return new Di(c0376o8Arr, a7.f12616b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public If(@NonNull C0452ra c0452ra) {
        this.f12383a = c0452ra;
    }

    @NonNull
    public final List<String> a(@NonNull Di di2) {
        throw new UnsupportedOperationException();
    }
}
