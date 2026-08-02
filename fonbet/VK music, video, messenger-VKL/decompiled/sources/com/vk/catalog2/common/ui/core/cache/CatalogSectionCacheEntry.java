package com.vk.catalog2.common.ui.core.cache;

import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.core.serialize.Serializer;
import xsna.xuo0;
import xsna.zcl;

/* compiled from: CatalogCacheEntry.kt */
/* loaded from: classes16.dex */
public final class CatalogSectionCacheEntry extends CatalogCacheEntry {
    public static final Serializer.c<CatalogSectionCacheEntry> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogSectionCacheEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSectionCacheEntry a(Serializer serializer) {
            return new CatalogSectionCacheEntry((CatalogSection) serializer.G(CatalogSection.class.getClassLoader()), (CatalogExtendedData) serializer.G(CatalogExtendedData.class.getClassLoader()), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSectionCacheEntry[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CatalogSectionCacheEntry(CatalogSection catalogSection, CatalogExtendedData catalogExtendedData, long j, int i, zcl zclVar) {
        this(catalogSection, catalogExtendedData, j);
        if ((i & 4) != 0) {
            xuo0.a.getClass();
            j = xuo0.a();
        }
    }

    public CatalogSectionCacheEntry(CatalogSection catalogSection, CatalogExtendedData catalogExtendedData, long j) {
        super(catalogSection, catalogExtendedData, j);
    }
}
