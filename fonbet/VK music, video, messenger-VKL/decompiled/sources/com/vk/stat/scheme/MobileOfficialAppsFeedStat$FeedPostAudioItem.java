package com.vk.stat.scheme;

import com.ironsource.Ad;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$FeedPostAudioItem {

    @pmi0("item_id")
    private final int itemId;

    @pmi0("item_owner_id")
    private final long itemOwnerId;

    @pmi0("item_type")
    private final ItemType itemType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class ItemType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;

        @pmi0("album")
        public static final ItemType ALBUM;

        @pmi0("audio")
        public static final ItemType AUDIO;

        @pmi0("playlist")
        public static final ItemType PLAYLIST;

        @pmi0(Ad.d)
        public static final ItemType SINGLE;

        static {
            ItemType itemType = new ItemType(SignalingProtocol.MEDIA_OPTION_AUDIO, 0);
            AUDIO = itemType;
            ItemType itemType2 = new ItemType("PLAYLIST", 1);
            PLAYLIST = itemType2;
            ItemType itemType3 = new ItemType("ALBUM", 2);
            ALBUM = itemType3;
            ItemType itemType4 = new ItemType("SINGLE", 3);
            SINGLE = itemType4;
            ItemType[] itemTypeArr = {itemType, itemType2, itemType3, itemType4};
            $VALUES = itemTypeArr;
            $ENTRIES = new asp(itemTypeArr);
        }

        private ItemType(String str, int i) {
        }

        public static ItemType valueOf(String str) {
            return (ItemType) Enum.valueOf(ItemType.class, str);
        }

        public static ItemType[] values() {
            return (ItemType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$FeedPostAudioItem(int i, long j, ItemType itemType) {
        this.itemId = i;
        this.itemOwnerId = j;
        this.itemType = itemType;
    }

    public final int a() {
        return this.itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedPostAudioItem)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedPostAudioItem mobileOfficialAppsFeedStat$FeedPostAudioItem = (MobileOfficialAppsFeedStat$FeedPostAudioItem) obj;
        return this.itemId == mobileOfficialAppsFeedStat$FeedPostAudioItem.itemId && this.itemOwnerId == mobileOfficialAppsFeedStat$FeedPostAudioItem.itemOwnerId && this.itemType == mobileOfficialAppsFeedStat$FeedPostAudioItem.itemType;
    }

    public final int hashCode() {
        return this.itemType.hashCode() + bh10.a(Integer.hashCode(this.itemId) * 31, 31, this.itemOwnerId);
    }

    public final String toString() {
        return "FeedPostAudioItem(itemId=" + this.itemId + ", itemOwnerId=" + this.itemOwnerId + ", itemType=" + this.itemType + ')';
    }
}
