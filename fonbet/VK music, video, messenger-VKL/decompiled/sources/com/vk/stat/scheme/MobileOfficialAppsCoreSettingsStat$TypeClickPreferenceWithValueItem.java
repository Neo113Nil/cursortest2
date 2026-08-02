package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem implements SchemeStat$TypeClick.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_settings_application_by_default")
    private final MobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault typeSettingsApplicationByDefault;

    @pmi0("type_settings_background_play")
    private final MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay typeSettingsBackgroundPlay;

    @pmi0("type_settings_video_quality_download")
    private final MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload typeSettingsVideoQualityDownload;

    @pmi0("type_settings_video_quality_playback")
    private final MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback typeSettingsVideoQualityPlayback;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsCoreSettingsStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_settings_application_by_default")
        public static final Type TYPE_SETTINGS_APPLICATION_BY_DEFAULT;

        @pmi0("type_settings_background_play")
        public static final Type TYPE_SETTINGS_BACKGROUND_PLAY;

        @pmi0("type_settings_video_quality_download")
        public static final Type TYPE_SETTINGS_VIDEO_QUALITY_DOWNLOAD;

        @pmi0("type_settings_video_quality_playback")
        public static final Type TYPE_SETTINGS_VIDEO_QUALITY_PLAYBACK;

        static {
            Type type = new Type("TYPE_SETTINGS_VIDEO_QUALITY_PLAYBACK", 0);
            TYPE_SETTINGS_VIDEO_QUALITY_PLAYBACK = type;
            Type type2 = new Type("TYPE_SETTINGS_VIDEO_QUALITY_DOWNLOAD", 1);
            TYPE_SETTINGS_VIDEO_QUALITY_DOWNLOAD = type2;
            Type type3 = new Type("TYPE_SETTINGS_APPLICATION_BY_DEFAULT", 2);
            TYPE_SETTINGS_APPLICATION_BY_DEFAULT = type3;
            Type type4 = new Type("TYPE_SETTINGS_BACKGROUND_PLAY", 3);
            TYPE_SETTINGS_BACKGROUND_PLAY = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    private MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem(Type type, MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback, MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload, MobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault, MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay) {
        this.type = type;
        this.typeSettingsVideoQualityPlayback = mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback;
        this.typeSettingsVideoQualityDownload = mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload;
        this.typeSettingsApplicationByDefault = mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault;
        this.typeSettingsBackgroundPlay = mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem)) {
            return false;
        }
        MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem = (MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem) obj;
        return this.type == mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem.type && epx.f(this.typeSettingsVideoQualityPlayback, mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem.typeSettingsVideoQualityPlayback) && epx.f(this.typeSettingsVideoQualityDownload, mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem.typeSettingsVideoQualityDownload) && epx.f(this.typeSettingsApplicationByDefault, mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem.typeSettingsApplicationByDefault) && epx.f(this.typeSettingsBackgroundPlay, mobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem.typeSettingsBackgroundPlay);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback = this.typeSettingsVideoQualityPlayback;
        int hashCode2 = (hashCode + (mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback == null ? 0 : mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback.hashCode())) * 31;
        MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload = this.typeSettingsVideoQualityDownload;
        int hashCode3 = (hashCode2 + (mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload == null ? 0 : mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload.hashCode())) * 31;
        MobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault = this.typeSettingsApplicationByDefault;
        int hashCode4 = (hashCode3 + (mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault == null ? 0 : mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault.hashCode())) * 31;
        MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay = this.typeSettingsBackgroundPlay;
        return hashCode4 + (mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay != null ? mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClickPreferenceWithValueItem(type=" + this.type + ", typeSettingsVideoQualityPlayback=" + this.typeSettingsVideoQualityPlayback + ", typeSettingsVideoQualityDownload=" + this.typeSettingsVideoQualityDownload + ", typeSettingsApplicationByDefault=" + this.typeSettingsApplicationByDefault + ", typeSettingsBackgroundPlay=" + this.typeSettingsBackgroundPlay + ')';
    }

    public /* synthetic */ MobileOfficialAppsCoreSettingsStat$TypeClickPreferenceWithValueItem(Type type, MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback, MobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload, MobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault, MobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityPlayback, (i & 4) != 0 ? null : mobileOfficialAppsCoreSettingsStat$TypeSettingsVideoQualityDownload, (i & 8) != 0 ? null : mobileOfficialAppsCoreSettingsStat$TypeSettingsApplicationByDefault, (i & 16) != 0 ? null : mobileOfficialAppsCoreSettingsStat$TypeSettingsBackgroundPlay);
    }
}
