package com.vk.catalog2.common.ui.core.cache;

import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.core.serialize.Serializer;
import xsna.xuo0;
import xsna.zcl;

/* compiled from: CatalogCacheEntry.kt */
/* loaded from: classes16.dex */
public final class CatalogCatalogCacheEntry extends CatalogCacheEntry {
    public static final Serializer.c<CatalogCatalogCacheEntry> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogCatalogCacheEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogCatalogCacheEntry a(Serializer serializer) {
            return new CatalogCatalogCacheEntry((CatalogCatalog) serializer.G(CatalogCatalog.class.getClassLoader()), (CatalogExtendedData) serializer.G(CatalogExtendedData.class.getClassLoader()), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogCatalogCacheEntry[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CatalogCatalogCacheEntry(CatalogCatalog catalogCatalog, CatalogExtendedData catalogExtendedData, long j, int i, zcl zclVar) {
        this(catalogCatalog, catalogExtendedData, j);
        if ((i & 4) != 0) {
            xuo0.a.getClass();
            j = xuo0.a();
        }
    }

    public CatalogCatalogCacheEntry(CatalogCatalog catalogCatalog, CatalogExtendedData catalogExtendedData, long j) {
        super(catalogCatalog, catalogExtendedData, j);
    }
}
