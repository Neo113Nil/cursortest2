package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;

/* loaded from: classes.dex */
final class G implements F {
    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final C5919z.d a(long j11, Object obj) {
        C5919z.d dVar = (C5919z.d) p0.v(obj, j11);
        if (dVar.isModifiable()) {
            return dVar;
        }
        int size = dVar.size();
        C5919z.d mutableCopyWithCapacity = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        p0.H(obj, j11, mutableCopyWithCapacity);
        return mutableCopyWithCapacity;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final void makeImmutableListAt(Object obj, long j11) {
        ((C5919z.d) p0.v(obj, j11)).makeImmutable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.F
    public final <E> void mergeListsAt(Object obj, Object obj2, long j11) {
        C5919z.d dVar = (C5919z.d) p0.v(obj, j11);
        C5919z.d dVar2 = (C5919z.d) p0.v(obj2, j11);
        int size = dVar.size();
        int size2 = dVar2.size();
        if (size > 0 && size2 > 0) {
            if (!dVar.isModifiable()) {
                dVar = dVar.mutableCopyWithCapacity(size2 + size);
            }
            dVar.addAll(dVar2);
        }
        if (size > 0) {
            dVar2 = dVar;
        }
        p0.H(obj, j11, dVar2);
    }
}
