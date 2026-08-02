package com.vk.stat.scheme;

import com.huawei.hms.android.SystemUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick implements SchemeStat$TypeClick.b {

    @pmi0("click_type")
    private final ClickType clickType;

    @pmi0("object_subtype")
    private final ObjectSubtype objectSubtype;

    @pmi0("source_type")
    private final MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem sourceType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class ClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickType[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final ClickType CLOSE;

        @pmi0("negative")
        public static final ClickType NEGATIVE;

        @pmi0("outside")
        public static final ClickType OUTSIDE;

        @pmi0("positive")
        public static final ClickType POSITIVE;

        static {
            ClickType clickType = new ClickType("POSITIVE", 0);
            POSITIVE = clickType;
            ClickType clickType2 = new ClickType("NEGATIVE", 1);
            NEGATIVE = clickType2;
            ClickType clickType3 = new ClickType("CLOSE", 2);
            CLOSE = clickType3;
            ClickType clickType4 = new ClickType("OUTSIDE", 3);
            OUTSIDE = clickType4;
            ClickType[] clickTypeArr = {clickType, clickType2, clickType3, clickType4};
            $VALUES = clickTypeArr;
            $ENTRIES = new asp(clickTypeArr);
        }

        private ClickType(String str, int i) {
        }

        public static ClickType valueOf(String str) {
            return (ClickType) Enum.valueOf(ClickType.class, str);
        }

        public static ClickType[] values() {
            return (ClickType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class ObjectSubtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectSubtype[] $VALUES;

        @pmi0("google_play")
        public static final ObjectSubtype GOOGLE_PLAY;

        @pmi0("huawei")
        public static final ObjectSubtype HUAWEI;

        @pmi0("rustore")
        public static final ObjectSubtype RUSTORE;

        @pmi0("samsung")
        public static final ObjectSubtype SAMSUNG;

        @pmi0("xiaomi")
        public static final ObjectSubtype XIAOMI;

        static {
            ObjectSubtype objectSubtype = new ObjectSubtype("RUSTORE", 0);
            RUSTORE = objectSubtype;
            ObjectSubtype objectSubtype2 = new ObjectSubtype("GOOGLE_PLAY", 1);
            GOOGLE_PLAY = objectSubtype2;
            ObjectSubtype objectSubtype3 = new ObjectSubtype(SystemUtils.PRODUCT_HUAWEI, 2);
            HUAWEI = objectSubtype3;
            ObjectSubtype objectSubtype4 = new ObjectSubtype("SAMSUNG", 3);
            SAMSUNG = objectSubtype4;
            ObjectSubtype objectSubtype5 = new ObjectSubtype("XIAOMI", 4);
            XIAOMI = objectSubtype5;
            ObjectSubtype[] objectSubtypeArr = {objectSubtype, objectSubtype2, objectSubtype3, objectSubtype4, objectSubtype5};
            $VALUES = objectSubtypeArr;
            $ENTRIES = new asp(objectSubtypeArr);
        }

        private ObjectSubtype(String str, int i) {
        }

        public static ObjectSubtype valueOf(String str) {
            return (ObjectSubtype) Enum.valueOf(ObjectSubtype.class, str);
        }

        public static ObjectSubtype[] values() {
            return (ObjectSubtype[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick(MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem, ClickType clickType, ObjectSubtype objectSubtype) {
        this.sourceType = mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem;
        this.clickType = clickType;
        this.objectSubtype = objectSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick = (MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick) obj;
        return this.sourceType == mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick.sourceType && this.clickType == mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick.clickType && this.objectSubtype == mobileOfficialAppsVideoStat$TypeVideoInAppReviewClick.objectSubtype;
    }

    public final int hashCode() {
        int hashCode = (this.clickType.hashCode() + (this.sourceType.hashCode() * 31)) * 31;
        ObjectSubtype objectSubtype = this.objectSubtype;
        return hashCode + (objectSubtype == null ? 0 : objectSubtype.hashCode());
    }

    public final String toString() {
        return "TypeVideoInAppReviewClick(sourceType=" + this.sourceType + ", clickType=" + this.clickType + ", objectSubtype=" + this.objectSubtype + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoInAppReviewClick(MobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem, ClickType clickType, ObjectSubtype objectSubtype, int i, zcl zclVar) {
        this(mobileOfficialAppsVideoStat$TypeVideoInAppReviewSourceItem, clickType, (i & 4) != 0 ? null : objectSubtype);
    }
}
