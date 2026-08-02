package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zbuu implements Iterator {
    private final Iterator zba;

    public zbuu(Iterator it) {
        this.zba = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zba.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zba.next();
        return entry.getValue() instanceof zbuv ? new zbut(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zba.remove();
    }
}
