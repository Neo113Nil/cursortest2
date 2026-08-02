package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class J8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NotNull Map<String, byte[]> map) {
        L8 l82 = new L8();
        K8[] k8Arr = new K8[map.size()];
        int i5 = 0;
        for (Object obj : map.entrySet()) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.u.j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            K8 k82 = new K8();
            k82.f12469a = (String) entry.getKey();
            k82.f12470b = (byte[]) entry.getValue();
            k8Arr[i5] = k82;
            i5 = i10;
        }
        l82.f12524a = k8Arr;
        return MessageNano.toByteArray(l82);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull byte[] bArr) {
        K8[] k8Arr = ((L8) MessageNano.mergeFrom(new L8(), bArr)).f12524a;
        int a7 = kotlin.collections.m0.a(k8Arr.length);
        if (a7 < 16) {
            a7 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a7);
        for (K8 k82 : k8Arr) {
            linkedHashMap.put(k82.f12469a, k82.f12470b);
        }
        return linkedHashMap;
    }
}
