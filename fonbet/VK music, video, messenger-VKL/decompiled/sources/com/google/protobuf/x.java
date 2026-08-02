package com.google.protobuf;

import com.google.protobuf.FieldSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes13.dex */
public final class x extends y<Object, Object> {
    @Override // com.google.protobuf.y
    public final void f() {
        if (!this.e) {
            for (int i = 0; i < this.c.size(); i++) {
                Map.Entry<Object, Object> c = c(i);
                if (((FieldSet.FieldDescriptorLite) c.getKey()).isRepeated()) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : d()) {
                if (((FieldSet.FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.f();
    }

    @Override // com.google.protobuf.y, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
