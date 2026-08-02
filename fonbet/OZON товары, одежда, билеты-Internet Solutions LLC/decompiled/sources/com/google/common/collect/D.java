package com.google.common.collect;

import Bl0.k0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class D implements Iterator<Object> {
    private static final /* synthetic */ D[] $VALUES;
    public static final D INSTANCE;

    static {
        D d11 = new D("INSTANCE", 0);
        INSTANCE = d11;
        $VALUES = new D[]{d11};
    }

    private D() {
        throw null;
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        k0.l("no calls to next() since the last call to remove()", false);
    }
}
