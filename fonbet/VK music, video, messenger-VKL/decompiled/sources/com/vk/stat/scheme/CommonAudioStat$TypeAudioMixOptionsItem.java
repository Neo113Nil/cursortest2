package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.iq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioMixOptionsItem implements SchemeStat$TypeAction.b {

    @pmi0("additional_setting")
    private final List<CommonAudioStat$TypeAdditionalSettingEnum> additionalSetting;

    @pmi0("client_event_microsec")
    private final Long clientEventMicrosec;

    @pmi0("language_setting")
    private final List<CommonAudioStat$TypeLanguageSettingEnum> languageSetting;

    @pmi0("mix_options_id")
    private final Long mixOptionsId;

    @pmi0("mix_type")
    private final MixType mixType;

    @pmi0("recognition_setting")
    private final List<CommonAudioStat$TypeRecognitionSettingEnum> recognitionSetting;

    @pmi0("vibe_setting")
    private final List<CommonAudioStat$TypeVibeSettingEnum> vibeSetting;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class MixType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MixType[] $VALUES;

        @pmi0("artist_mix")
        public static final MixType ARTIST_MIX;

        @pmi0("child_track_mix")
        public static final MixType CHILD_TRACK_MIX;

        @pmi0("common")
        public static final MixType COMMON;

        @pmi0("my_music")
        public static final MixType MY_MUSIC;

        @pmi0("track_mix")
        public static final MixType TRACK_MIX;

        @pmi0("vk_mix_album")
        public static final MixType VK_MIX_ALBUM;

        @pmi0("vk_mix_playlist")
        public static final MixType VK_MIX_PLAYLIST;

        static {
            MixType mixType = new MixType("COMMON", 0);
            COMMON = mixType;
            MixType mixType2 = new MixType("MY_MUSIC", 1);
            MY_MUSIC = mixType2;
            MixType mixType3 = new MixType("TRACK_MIX", 2);
            TRACK_MIX = mixType3;
            MixType mixType4 = new MixType("CHILD_TRACK_MIX", 3);
            CHILD_TRACK_MIX = mixType4;
            MixType mixType5 = new MixType("ARTIST_MIX", 4);
            ARTIST_MIX = mixType5;
            MixType mixType6 = new MixType("VK_MIX_PLAYLIST", 5);
            VK_MIX_PLAYLIST = mixType6;
            MixType mixType7 = new MixType("VK_MIX_ALBUM", 6);
            VK_MIX_ALBUM = mixType7;
            MixType[] mixTypeArr = {mixType, mixType2, mixType3, mixType4, mixType5, mixType6, mixType7};
            $VALUES = mixTypeArr;
            $ENTRIES = new asp(mixTypeArr);
        }

        private MixType(String str, int i) {
        }

        public static MixType valueOf(String str) {
            return (MixType) Enum.valueOf(MixType.class, str);
        }

        public static MixType[] values() {
            return (MixType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonAudioStat$TypeAudioMixOptionsItem(MixType mixType, List<? extends CommonAudioStat$TypeVibeSettingEnum> list, List<? extends CommonAudioStat$TypeLanguageSettingEnum> list2, List<? extends CommonAudioStat$TypeRecognitionSettingEnum> list3, List<? extends CommonAudioStat$TypeAdditionalSettingEnum> list4, Long l, Long l2) {
        this.mixType = mixType;
        this.vibeSetting = list;
        this.languageSetting = list2;
        this.recognitionSetting = list3;
        this.additionalSetting = list4;
        this.clientEventMicrosec = l;
        this.mixOptionsId = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioMixOptionsItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioMixOptionsItem commonAudioStat$TypeAudioMixOptionsItem = (CommonAudioStat$TypeAudioMixOptionsItem) obj;
        return this.mixType == commonAudioStat$TypeAudioMixOptionsItem.mixType && epx.f(this.vibeSetting, commonAudioStat$TypeAudioMixOptionsItem.vibeSetting) && epx.f(this.languageSetting, commonAudioStat$TypeAudioMixOptionsItem.languageSetting) && epx.f(this.recognitionSetting, commonAudioStat$TypeAudioMixOptionsItem.recognitionSetting) && epx.f(this.additionalSetting, commonAudioStat$TypeAudioMixOptionsItem.additionalSetting) && epx.f(this.clientEventMicrosec, commonAudioStat$TypeAudioMixOptionsItem.clientEventMicrosec) && epx.f(this.mixOptionsId, commonAudioStat$TypeAudioMixOptionsItem.mixOptionsId);
    }

    public final int hashCode() {
        int hashCode = this.mixType.hashCode() * 31;
        List<CommonAudioStat$TypeVibeSettingEnum> list = this.vibeSetting;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<CommonAudioStat$TypeLanguageSettingEnum> list2 = this.languageSetting;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CommonAudioStat$TypeRecognitionSettingEnum> list3 = this.recognitionSetting;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<CommonAudioStat$TypeAdditionalSettingEnum> list4 = this.additionalSetting;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Long l = this.clientEventMicrosec;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.mixOptionsId;
        return hashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioMixOptionsItem(mixType=");
        sb.append(this.mixType);
        sb.append(", vibeSetting=");
        sb.append(this.vibeSetting);
        sb.append(", languageSetting=");
        sb.append(this.languageSetting);
        sb.append(", recognitionSetting=");
        sb.append(this.recognitionSetting);
        sb.append(", additionalSetting=");
        sb.append(this.additionalSetting);
        sb.append(", clientEventMicrosec=");
        sb.append(this.clientEventMicrosec);
        sb.append(", mixOptionsId=");
        return iq.b(sb, this.mixOptionsId, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeAudioMixOptionsItem(MixType mixType, List list, List list2, List list3, List list4, Long l, Long l2, int i, zcl zclVar) {
        this(mixType, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2);
    }
}
