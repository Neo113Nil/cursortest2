package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipCameraItem implements SchemeStat$TypeAction.b {

    @pmi0("clips_create_context")
    private final MobileOfficialAppsClipsStat$ClipsCreateContext clipsCreateContext;

    @pmi0("type")
    private final Type type;

    @pmi0("type_camera_timer")
    private final MobileOfficialAppsClipsStat$TypeCameraTimer typeCameraTimer;

    @pmi0("type_mask_choose")
    private final MobileOfficialAppsClipsStat$TypeMaskChoose typeMaskChoose;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsClipsStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_camera_timer")
        public static final Type TYPE_CAMERA_TIMER;

        @pmi0("type_mask_choose")
        public static final Type TYPE_MASK_CHOOSE;

        static {
            Type type = new Type("TYPE_CAMERA_TIMER", 0);
            TYPE_CAMERA_TIMER = type;
            Type type2 = new Type("TYPE_MASK_CHOOSE", 1);
            TYPE_MASK_CHOOSE = type2;
            Type[] typeArr = {type, type2};
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

    private MobileOfficialAppsClipsStat$TypeClipCameraItem(MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, Type type, MobileOfficialAppsClipsStat$TypeCameraTimer mobileOfficialAppsClipsStat$TypeCameraTimer, MobileOfficialAppsClipsStat$TypeMaskChoose mobileOfficialAppsClipsStat$TypeMaskChoose) {
        this.clipsCreateContext = mobileOfficialAppsClipsStat$ClipsCreateContext;
        this.type = type;
        this.typeCameraTimer = mobileOfficialAppsClipsStat$TypeCameraTimer;
        this.typeMaskChoose = mobileOfficialAppsClipsStat$TypeMaskChoose;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsClipsStat$TypeClipCameraItem)) {
            return false;
        }
        MobileOfficialAppsClipsStat$TypeClipCameraItem mobileOfficialAppsClipsStat$TypeClipCameraItem = (MobileOfficialAppsClipsStat$TypeClipCameraItem) obj;
        return epx.f(this.clipsCreateContext, mobileOfficialAppsClipsStat$TypeClipCameraItem.clipsCreateContext) && this.type == mobileOfficialAppsClipsStat$TypeClipCameraItem.type && epx.f(this.typeCameraTimer, mobileOfficialAppsClipsStat$TypeClipCameraItem.typeCameraTimer) && epx.f(this.typeMaskChoose, mobileOfficialAppsClipsStat$TypeClipCameraItem.typeMaskChoose);
    }

    public final int hashCode() {
        int hashCode = this.clipsCreateContext.hashCode() * 31;
        Type type = this.type;
        int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeCameraTimer mobileOfficialAppsClipsStat$TypeCameraTimer = this.typeCameraTimer;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsClipsStat$TypeCameraTimer == null ? 0 : mobileOfficialAppsClipsStat$TypeCameraTimer.hashCode())) * 31;
        MobileOfficialAppsClipsStat$TypeMaskChoose mobileOfficialAppsClipsStat$TypeMaskChoose = this.typeMaskChoose;
        return hashCode3 + (mobileOfficialAppsClipsStat$TypeMaskChoose != null ? mobileOfficialAppsClipsStat$TypeMaskChoose.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClipCameraItem(clipsCreateContext=" + this.clipsCreateContext + ", type=" + this.type + ", typeCameraTimer=" + this.typeCameraTimer + ", typeMaskChoose=" + this.typeMaskChoose + ')';
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipCameraItem(MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext, Type type, MobileOfficialAppsClipsStat$TypeCameraTimer mobileOfficialAppsClipsStat$TypeCameraTimer, MobileOfficialAppsClipsStat$TypeMaskChoose mobileOfficialAppsClipsStat$TypeMaskChoose, int i, zcl zclVar) {
        this(mobileOfficialAppsClipsStat$ClipsCreateContext, (i & 2) != 0 ? null : type, (i & 4) != 0 ? null : mobileOfficialAppsClipsStat$TypeCameraTimer, (i & 8) != 0 ? null : mobileOfficialAppsClipsStat$TypeMaskChoose);
    }
}
