package com.vk.catalog2.common.ui.core.cache;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.core.serialize.Serializer;

/* compiled from: CatalogCacheEntry.kt */
/* loaded from: classes16.dex */
public abstract class CatalogCacheEntry extends Serializer.StreamParcelableAdapter {
    public final Serializer.StreamParcelableAdapter b;
    public final CatalogExtendedData c;
    public final long d;

    public CatalogCacheEntry(Serializer.StreamParcelableAdapter streamParcelableAdapter, CatalogExtendedData catalogExtendedData, long j) {
        this.b = streamParcelableAdapter;
        this.c = catalogExtendedData;
        this.d = j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.Y(this.d);
    }
}
