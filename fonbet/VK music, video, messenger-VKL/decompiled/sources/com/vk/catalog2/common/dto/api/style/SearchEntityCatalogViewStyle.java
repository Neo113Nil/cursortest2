package com.vk.catalog2.common.dto.api.style;

import com.vk.catalog2.common.dto.api.search.CatalogSearchEntityAnswer;
import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.epx;
import xsna.rl3;
import xsna.zrp;

/* compiled from: SearchEntityCatalogViewStyle.kt */
/* loaded from: classes16.dex */
public final class SearchEntityCatalogViewStyle extends Serializer.StreamParcelableAdapter implements CatalogViewStyle {
    public static final Serializer.c<SearchEntityCatalogViewStyle> CREATOR = new a();
    public final EntityStyle b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchEntityCatalogViewStyle.kt */
    public static final class EntityStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntityStyle[] $VALUES;
        public static final EntityStyle Card;
        public static final a Companion;
        public static final EntityStyle Flat;
        public static final EntityStyle VideoPlaylist;
        private final String apiName;
        private final CatalogSearchEntityAnswer.EntityType entityType;

        /* compiled from: SearchEntityCatalogViewStyle.kt */
        public static final class a {
            public static EntityStyle a(String str, CatalogSearchEntityAnswer.EntityType entityType) {
                EntityStyle entityStyle;
                EntityStyle[] values = EntityStyle.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        entityStyle = null;
                        break;
                    }
                    entityStyle = values[i];
                    if (epx.f(entityStyle.h(), str) && entityStyle.i() == entityType) {
                        break;
                    }
                    i++;
                }
                return entityStyle == null ? EntityStyle.Card : entityStyle;
            }
        }

        static {
            CatalogSearchEntityAnswer.EntityType entityType = CatalogSearchEntityAnswer.EntityType.Person;
            EntityStyle entityStyle = new EntityStyle("Card", 0, "card", entityType);
            Card = entityStyle;
            EntityStyle entityStyle2 = new EntityStyle("Flat", 1, "flat", entityType);
            Flat = entityStyle2;
            EntityStyle entityStyle3 = new EntityStyle("VideoPlaylist", 2, "flat", CatalogSearchEntityAnswer.EntityType.VideoPlaylist);
            VideoPlaylist = entityStyle3;
            EntityStyle[] entityStyleArr = {entityStyle, entityStyle2, entityStyle3};
            $VALUES = entityStyleArr;
            $ENTRIES = new asp(entityStyleArr);
            Companion = new a();
        }

        public EntityStyle(String str, int i, String str2, CatalogSearchEntityAnswer.EntityType entityType) {
            this.apiName = str2;
            this.entityType = entityType;
        }

        public static EntityStyle valueOf(String str) {
            return (EntityStyle) Enum.valueOf(EntityStyle.class, str);
        }

        public static EntityStyle[] values() {
            return (EntityStyle[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }

        public final CatalogSearchEntityAnswer.EntityType i() {
            return this.entityType;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SearchEntityCatalogViewStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchEntityCatalogViewStyle a(Serializer serializer) {
            return new SearchEntityCatalogViewStyle(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchEntityCatalogViewStyle[i];
        }
    }

    public SearchEntityCatalogViewStyle(EntityStyle entityStyle) {
        this.b = entityStyle;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        EntityStyle entityStyle = this.b;
        serializer.j0(entityStyle.h());
        serializer.j0(entityStyle.i().h());
    }

    @Override // com.vk.catalog2.common.dto.api.style.CatalogViewStyle
    public final CatalogViewStyle copy() {
        return new SearchEntityCatalogViewStyle(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchEntityCatalogViewStyle) && this.b == ((SearchEntityCatalogViewStyle) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SearchEntityCatalogViewStyle(entityStyle=" + this.b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchEntityCatalogViewStyle(String str, CatalogSearchEntityAnswer.EntityType entityType) {
        this(EntityStyle.a.a(str, entityType));
        EntityStyle.Companion.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchEntityCatalogViewStyle(int i) {
        this(r2 == null ? EntityStyle.Card : r2);
        EntityStyle.Companion.getClass();
        EntityStyle entityStyle = (EntityStyle) rl3.S(i, EntityStyle.values());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchEntityCatalogViewStyle(Serializer serializer) {
        this(EntityStyle.a.a(r1, r4));
        EntityStyle.a aVar = EntityStyle.Companion;
        String H = serializer.H();
        CatalogSearchEntityAnswer.EntityType.a aVar2 = CatalogSearchEntityAnswer.EntityType.Companion;
        String H2 = serializer.H();
        aVar2.getClass();
        CatalogSearchEntityAnswer.EntityType a2 = CatalogSearchEntityAnswer.EntityType.a.a(H2);
        aVar.getClass();
    }
}
