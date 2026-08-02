package com.vk.catalog2.common.dto.api.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import java.util.Iterator;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.epx;
import xsna.fq;
import xsna.ho8;
import xsna.urd0;
import xsna.zrp;

/* compiled from: CatalogAudioContentCard.kt */
/* loaded from: classes16.dex */
public final class CatalogAudioContentCard extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogAudioContentCard> CREATOR = new b();
    public static final a i = new a();
    public static final CatalogAudioContentCard j;
    public final EntityType b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Image g;
    public final Image h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogAudioContentCard.kt */
    public static final class EntityType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntityType[] $VALUES;
        public static final EntityType AUDIOBOOKS;
        public static final a Companion;
        public static final EntityType PODCASTS;
        private final String value;

        /* compiled from: CatalogAudioContentCard.kt */
        public static final class a {
            public static EntityType a(String str) {
                Object obj;
                Iterator<E> it = EntityType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((EntityType) obj).i(), str)) {
                        break;
                    }
                }
                return (EntityType) obj;
            }
        }

        static {
            EntityType entityType = new EntityType("PODCASTS", 0, "podcasts");
            PODCASTS = entityType;
            EntityType entityType2 = new EntityType("AUDIOBOOKS", 1, "audiobooks");
            AUDIOBOOKS = entityType2;
            EntityType[] entityTypeArr = {entityType, entityType2};
            $VALUES = entityTypeArr;
            $ENTRIES = new asp(entityTypeArr);
            Companion = new a();
        }

        public EntityType(String str, int i, String str2) {
            this.value = str2;
        }

        public static zrp<EntityType> h() {
            return $ENTRIES;
        }

        public static EntityType valueOf(String str) {
            return (EntityType) Enum.valueOf(EntityType.class, str);
        }

        public static EntityType[] values() {
            return (EntityType[]) $VALUES.clone();
        }

        public final String i() {
            return this.value;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogAudioContentCard> {
        @Override // xsna.aay
        public final CatalogAudioContentCard a(JSONObject jSONObject) {
            return new CatalogAudioContentCard(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogAudioContentCard> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogAudioContentCard a(Serializer serializer) {
            return new CatalogAudioContentCard(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogAudioContentCard[i];
        }
    }

    static {
        Image image = Image.d;
        j = new CatalogAudioContentCard(null, "", "", "", "", image, image);
    }

    public CatalogAudioContentCard(EntityType entityType, String str, String str2, String str3, String str4, Image image, Image image2) {
        this.b = entityType;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = image;
        this.h = image2;
    }

    public static CatalogAudioContentCard zb(CatalogAudioContentCard catalogAudioContentCard) {
        EntityType entityType = catalogAudioContentCard.b;
        String str = catalogAudioContentCard.c;
        String str2 = catalogAudioContentCard.d;
        String str3 = catalogAudioContentCard.e;
        String str4 = catalogAudioContentCard.f;
        Image image = catalogAudioContentCard.g;
        Image image2 = catalogAudioContentCard.h;
        catalogAudioContentCard.getClass();
        return new CatalogAudioContentCard(entityType, str, str2, str3, str4, image, image2);
    }

    public final String Ab() {
        return this.d + '_' + this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        EntityType entityType = this.b;
        serializer.j0(entityType != null ? entityType.i() : null);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.i0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogAudioContentCard)) {
            return false;
        }
        CatalogAudioContentCard catalogAudioContentCard = (CatalogAudioContentCard) obj;
        return this.b == catalogAudioContentCard.b && epx.f(this.c, catalogAudioContentCard.c) && epx.f(this.d, catalogAudioContentCard.d) && epx.f(this.e, catalogAudioContentCard.e) && epx.f(this.f, catalogAudioContentCard.f) && epx.f(this.g, catalogAudioContentCard.g) && epx.f(this.h, catalogAudioContentCard.h);
    }

    public final int hashCode() {
        EntityType entityType = this.b;
        return this.h.hashCode() + fq.b(this.g, urd0.a(urd0.a(urd0.a(urd0.a((entityType == null ? 0 : entityType.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogAudioContentCard(entity_id=");
        sb.append(this.c);
        sb.append(", entity_type=");
        sb.append(this.b);
        sb.append(", entityOwnerId=");
        return ho8.a(sb, this.d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogAudioContentCard(JSONObject jSONObject) {
        this(EntityType.a.a(r1), jSONObject.optString("entity_id"), jSONObject.optString("entity_owner_id"), jSONObject.optString("editor_annotation"), jSONObject.optString("editor_tag"), new Image(jSONObject.getJSONArray("editor_background_image"), null, r2, 0 == true ? 1 : 0), new Image(jSONObject.getJSONArray("editor_gradient_image"), 0 == true ? 1 : 0, r2, 0 == true ? 1 : 0));
        EntityType.a aVar = EntityType.Companion;
        String optString = jSONObject.optString("entity_type");
        aVar.getClass();
        int i2 = 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogAudioContentCard(Serializer serializer) {
        this(r4, r5, r6, r7, r8, r9, r12 == null ? Image.d : r12);
        EntityType.a aVar = EntityType.Companion;
        String H = serializer.H();
        H = H == null ? "" : H;
        aVar.getClass();
        EntityType a2 = EntityType.a.a(H);
        String H2 = serializer.H();
        String str = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str2 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str3 = H4 == null ? "" : H4;
        String H5 = serializer.H();
        String str4 = H5 == null ? "" : H5;
        Image image = (Image) serializer.G(Image.class.getClassLoader());
        Image image2 = image == null ? Image.d : image;
        Image image3 = (Image) serializer.G(Image.class.getClassLoader());
    }
}
