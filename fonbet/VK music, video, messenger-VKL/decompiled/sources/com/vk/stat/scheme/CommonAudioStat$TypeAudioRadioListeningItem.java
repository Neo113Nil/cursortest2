package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioRadioListeningItem {

    @pmi0("content_type")
    private final ContentType contentType;

    @pmi0("radio_id")
    private final int radioId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @pmi0("radio")
        public static final ContentType RADIO;

        static {
            ContentType contentType = new ContentType("RADIO", 0);
            RADIO = contentType;
            ContentType[] contentTypeArr = {contentType};
            $VALUES = contentTypeArr;
            $ENTRIES = new asp(contentTypeArr);
        }

        private ContentType(String str, int i) {
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudioRadioListeningItem(int i, ContentType contentType) {
        this.radioId = i;
        this.contentType = contentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioRadioListeningItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioRadioListeningItem commonAudioStat$TypeAudioRadioListeningItem = (CommonAudioStat$TypeAudioRadioListeningItem) obj;
        return this.radioId == commonAudioStat$TypeAudioRadioListeningItem.radioId && this.contentType == commonAudioStat$TypeAudioRadioListeningItem.contentType;
    }

    public final int hashCode() {
        return this.contentType.hashCode() + (Integer.hashCode(this.radioId) * 31);
    }

    public final String toString() {
        return "TypeAudioRadioListeningItem(radioId=" + this.radioId + ", contentType=" + this.contentType + ')';
    }
}
