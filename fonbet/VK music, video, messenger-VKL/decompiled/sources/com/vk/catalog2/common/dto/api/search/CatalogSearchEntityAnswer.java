package com.vk.catalog2.common.dto.api.search;

import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: CatalogSearchEntityAnswer.kt */
/* loaded from: classes16.dex */
public final class CatalogSearchEntityAnswer extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogSearchEntityAnswer> CREATOR = new c();
    public static final b d = new b();
    public final EntityType b;
    public final SearchEntity c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogSearchEntityAnswer.kt */
    public static final class EntityType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntityType[] $VALUES;
        public static final a Companion;
        public static final EntityType Person;
        public static final EntityType VideoPlaylist;
        private final String apiName;

        /* compiled from: CatalogSearchEntityAnswer.kt */
        public static final class a {
            public static EntityType a(String str) {
                Object obj;
                Iterator<E> it = EntityType.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((EntityType) obj).h(), str)) {
                        break;
                    }
                }
                return (EntityType) obj;
            }
        }

        static {
            EntityType entityType = new EntityType("Person", 0, "vk_person");
            Person = entityType;
            EntityType entityType2 = new EntityType("VideoPlaylist", 1, "video_playlist");
            VideoPlaylist = entityType2;
            EntityType[] entityTypeArr = {entityType, entityType2};
            $VALUES = entityTypeArr;
            $ENTRIES = new asp(entityTypeArr);
            Companion = new a();
        }

        public EntityType(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static zrp<EntityType> i() {
            return $ENTRIES;
        }

        public static EntityType valueOf(String str) {
            return (EntityType) Enum.valueOf(EntityType.class, str);
        }

        public static EntityType[] values() {
            return (EntityType[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    /* compiled from: CatalogSearchEntityAnswer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EntityType.values().length];
            try {
                iArr[EntityType.Person.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EntityType.VideoPlaylist.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<CatalogSearchEntityAnswer> {
        @Override // xsna.aay
        public final CatalogSearchEntityAnswer a(JSONObject jSONObject) {
            SearchEntity catalogSearchEntityPerson;
            EntityType.a aVar = EntityType.Companion;
            String string = jSONObject.getString("type");
            aVar.getClass();
            EntityType a = EntityType.a.a(string);
            if (a == null) {
                return null;
            }
            int i = a.$EnumSwitchMapping$0[a.ordinal()];
            if (i == 1) {
                catalogSearchEntityPerson = new CatalogSearchEntityPerson(jSONObject);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                catalogSearchEntityPerson = new CatalogSearchEntityVideoPlaylist(jSONObject);
            }
            return new CatalogSearchEntityAnswer(a, catalogSearchEntityPerson);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<CatalogSearchEntityAnswer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogSearchEntityAnswer a(Serializer serializer) {
            return new CatalogSearchEntityAnswer(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogSearchEntityAnswer[i];
        }
    }

    public CatalogSearchEntityAnswer(EntityType entityType, SearchEntity searchEntity) {
        this.b = entityType;
        this.c = searchEntity;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.h());
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSearchEntityAnswer)) {
            return false;
        }
        CatalogSearchEntityAnswer catalogSearchEntityAnswer = (CatalogSearchEntityAnswer) obj;
        return this.b == catalogSearchEntityAnswer.b && epx.f(this.c, catalogSearchEntityAnswer.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CatalogSearchEntityAnswer(type=" + this.b + ", entity=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogSearchEntityAnswer(Serializer serializer) {
        this(EntityType.a.a(r1), (SearchEntity) serializer.G(SearchEntity.class.getClassLoader()));
        EntityType.a aVar = EntityType.Companion;
        String H = serializer.H();
        aVar.getClass();
    }
}
