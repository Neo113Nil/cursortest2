package com.google.protobuf.kotlin;

import java.util.Collection;
import java.util.Set;

/* compiled from: UnmodifiableCollections.kt */
/* loaded from: classes13.dex */
public final class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E> {
    public UnmodifiableSet(Collection<? extends E> collection) {
        super(collection);
    }
}
