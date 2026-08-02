package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ie implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5[] fromModel(@NotNull Map<String, String> map) {
        int size = map.size();
        T5[] t5Arr = new T5[size];
        int i5 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            t5Arr[i10] = new T5();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            T5 t5 = t5Arr[i5];
            String key = entry.getKey();
            Charset charset = Charsets.UTF_8;
            t5.f12905a = key.getBytes(charset);
            t5Arr[i5].f12906b = entry.getValue().getBytes(charset);
            i5++;
        }
        return t5Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Map<String, String> a(@NotNull T5[] t5Arr) {
        throw new UnsupportedOperationException();
    }
}
