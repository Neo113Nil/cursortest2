package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import java.util.List;
import java.util.Map;

/* compiled from: InternalJvm.kt */
/* loaded from: classes14.dex */
final /* synthetic */ class Internal__InternalJvmKt {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E extends WireEnum> E getIdentityOrNull(Class<E> cls) {
        E e;
        E[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                e = null;
                break;
            }
            e = enumConstants[i];
            i++;
            E e2 = e;
            if (e2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.WireEnum");
            }
            if (e2.getValue() == 0) {
                break;
            }
        }
    }

    public static final <T> void redactElements(List<T> list, ProtoAdapter<T> protoAdapter) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, protoAdapter.redact(list.get(i)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void redactElements(Map<?, T> map, ProtoAdapter<T> protoAdapter) {
        for (Map.Entry entry : map.entrySet()) {
            entry.setValue(protoAdapter.redact(entry.getValue()));
        }
    }
}
