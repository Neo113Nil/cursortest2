package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m1 implements Map.Entry {
    public final Map.Entry a;
    public final /* synthetic */ Internal.MapAdapter b;

    public m1(Internal.MapAdapter mapAdapter, Map.Entry entry) {
        this.b = mapAdapter;
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && this.a.getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Internal.MapAdapter.Converter converter;
        converter = this.b.valueConverter;
        return converter.doForward(this.a.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Internal.MapAdapter.Converter converter;
        Internal.MapAdapter.Converter converter2;
        Internal.MapAdapter mapAdapter = this.b;
        converter = mapAdapter.valueConverter;
        Object value = this.a.setValue(converter.doBackward(obj));
        if (value == null) {
            return null;
        }
        converter2 = mapAdapter.valueConverter;
        return converter2.doForward(value);
    }
}
