package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClipGridItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("audio_owner_id")
    private final Long audioOwnerId;

    @pmi0("hashtag")
    private final String hashtag;

    @pmi0("screen_type")
    private final ScreenType screenType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class ScreenType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScreenType[] $VALUES;

        @pmi0("trending_hashtag")
        public static final ScreenType TRENDING_HASHTAG;

        @pmi0("trending_music")
        public static final ScreenType TRENDING_MUSIC;

        static {
            ScreenType screenType = new ScreenType("TRENDING_HASHTAG", 0);
            TRENDING_HASHTAG = screenType;
            ScreenType screenType2 = new ScreenType("TRENDING_MUSIC", 1);
            TRENDING_MUSIC = screenType2;
            ScreenType[] screenTypeArr = {screenType, screenType2};
            $VALUES = screenTypeArr;
            $ENTRIES = new asp(screenTypeArr);
        }

        private ScreenType(String str, int i) {
        }

        public static ScreenType valueOf(String str) {
            return (ScreenType) Enum.valueOf(ScreenType.class, str);
        }

        public static ScreenType[] values() {
            return (ScreenType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeClipGridItem(ScreenType screenType, Long l, Integer num, String str) {
        this.screenType = screenType;
        this.audioOwnerId = l;
        this.audioId = num;
        this.hashtag = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClipGridItem)) {
            return false;
        }
        SchemeStat$TypeClipGridItem schemeStat$TypeClipGridItem = (SchemeStat$TypeClipGridItem) obj;
        return this.screenType == schemeStat$TypeClipGridItem.screenType && epx.f(this.audioOwnerId, schemeStat$TypeClipGridItem.audioOwnerId) && epx.f(this.audioId, schemeStat$TypeClipGridItem.audioId) && epx.f(this.hashtag, schemeStat$TypeClipGridItem.hashtag);
    }

    public final int hashCode() {
        int hashCode = this.screenType.hashCode() * 31;
        Long l = this.audioOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.audioId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.hashtag;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClipGridItem(screenType=");
        sb.append(this.screenType);
        sb.append(", audioOwnerId=");
        sb.append(this.audioOwnerId);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", hashtag=");
        return ho8.a(sb, this.hashtag, ')');
    }

    public /* synthetic */ SchemeStat$TypeClipGridItem(ScreenType screenType, Long l, Integer num, String str, int i, zcl zclVar) {
        this(screenType, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
