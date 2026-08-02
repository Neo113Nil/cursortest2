package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator implements SchemeStat$TypeClick.b {

    @pmi0("object_type")
    private final ObjectType objectType;

    @pmi0("screen_mode")
    private final MobileOfficialAppsVideoStat$TypeScreenMode screenMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class ObjectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ObjectType[] $VALUES;

        @pmi0("cancel_action_banner")
        public static final ObjectType CANCEL_ACTION_BANNER;

        @pmi0("cancel_action_placeholder")
        public static final ObjectType CANCEL_ACTION_PLACEHOLDER;

        @pmi0("cancel_action_snackbar")
        public static final ObjectType CANCEL_ACTION_SNACKBAR;

        static {
            ObjectType objectType = new ObjectType("CANCEL_ACTION_BANNER", 0);
            CANCEL_ACTION_BANNER = objectType;
            ObjectType objectType2 = new ObjectType("CANCEL_ACTION_PLACEHOLDER", 1);
            CANCEL_ACTION_PLACEHOLDER = objectType2;
            ObjectType objectType3 = new ObjectType("CANCEL_ACTION_SNACKBAR", 2);
            CANCEL_ACTION_SNACKBAR = objectType3;
            ObjectType[] objectTypeArr = {objectType, objectType2, objectType3};
            $VALUES = objectTypeArr;
            $ENTRIES = new asp(objectTypeArr);
        }

        private ObjectType(String str, int i) {
        }

        public static ObjectType valueOf(String str) {
            return (ObjectType) Enum.valueOf(ObjectType.class, str);
        }

        public static ObjectType[] values() {
            return (ObjectType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator(ObjectType objectType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode) {
        this.objectType = objectType;
        this.screenMode = mobileOfficialAppsVideoStat$TypeScreenMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator)) {
            return false;
        }
        MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator = (MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator) obj;
        return this.objectType == mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator.objectType && this.screenMode == mobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator.screenMode;
    }

    public final int hashCode() {
        int hashCode = this.objectType.hashCode() * 31;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = this.screenMode;
        return hashCode + (mobileOfficialAppsVideoStat$TypeScreenMode == null ? 0 : mobileOfficialAppsVideoStat$TypeScreenMode.hashCode());
    }

    public final String toString() {
        return "TypeVideoUndoStopRecommendingCreator(objectType=" + this.objectType + ", screenMode=" + this.screenMode + ')';
    }

    public /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoUndoStopRecommendingCreator(ObjectType objectType, MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode, int i, zcl zclVar) {
        this(objectType, (i & 2) != 0 ? null : mobileOfficialAppsVideoStat$TypeScreenMode);
    }
}
