package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCorePhotoEditorStat$StickerData {

    @pmi0("id")
    private final Integer id;

    @pmi0("pack_id")
    private final Long packId;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCorePhotoEditorStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("animated")
        public static final Type ANIMATED;

        @pmi0("emoji")
        public static final Type EMOJI;

        @pmi0("from_pack")
        public static final Type FROM_PACK;

        @pmi0("gif")
        public static final Type GIF;

        @pmi0("individual")
        public static final Type INDIVIDUAL;

        @pmi0("vmoji")
        public static final Type VMOJI;

        static {
            Type type = new Type("INDIVIDUAL", 0);
            INDIVIDUAL = type;
            Type type2 = new Type("FROM_PACK", 1);
            FROM_PACK = type2;
            Type type3 = new Type("ANIMATED", 2);
            ANIMATED = type3;
            Type type4 = new Type("GIF", 3);
            GIF = type4;
            Type type5 = new Type("VMOJI", 4);
            VMOJI = type5;
            Type type6 = new Type("EMOJI", 5);
            EMOJI = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsCorePhotoEditorStat$StickerData() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCorePhotoEditorStat$StickerData)) {
            return false;
        }
        MobileOfficialAppsCorePhotoEditorStat$StickerData mobileOfficialAppsCorePhotoEditorStat$StickerData = (MobileOfficialAppsCorePhotoEditorStat$StickerData) obj;
        return this.type == mobileOfficialAppsCorePhotoEditorStat$StickerData.type && epx.f(this.id, mobileOfficialAppsCorePhotoEditorStat$StickerData.id) && epx.f(this.packId, mobileOfficialAppsCorePhotoEditorStat$StickerData.packId);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.packId;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerData(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", packId=");
        return iq.b(sb, this.packId, ')');
    }

    public MobileOfficialAppsCorePhotoEditorStat$StickerData(Type type, Integer num, Long l) {
        this.type = type;
        this.id = num;
        this.packId = l;
    }

    public /* synthetic */ MobileOfficialAppsCorePhotoEditorStat$StickerData(Type type, Integer num, Long l, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l);
    }
}
