package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick implements SchemeStat$TypeClick.b {

    @pmi0("carousel_image_index")
    private final Integer carouselImageIndex;

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    @pmi0("video_track_code")
    private final String videoTrackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("author_menu")
        public static final EntryPoint AUTHOR_MENU;

        @pmi0("modal_card")
        public static final EntryPoint MODAL_CARD;

        @pmi0("photo_viewer_author_menu")
        public static final EntryPoint PHOTO_VIEWER_AUTHOR_MENU;

        @pmi0("photo_viewer_pin")
        public static final EntryPoint PHOTO_VIEWER_PIN;

        @pmi0("pin")
        public static final EntryPoint PIN;

        @pmi0("product_snippet")
        public static final EntryPoint PRODUCT_SNIPPET;

        @pmi0("product_tile")
        public static final EntryPoint PRODUCT_TILE;

        static {
            EntryPoint entryPoint = new EntryPoint("PIN", 0);
            PIN = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("AUTHOR_MENU", 1);
            AUTHOR_MENU = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("PHOTO_VIEWER_PIN", 2);
            PHOTO_VIEWER_PIN = entryPoint3;
            EntryPoint entryPoint4 = new EntryPoint("PHOTO_VIEWER_AUTHOR_MENU", 3);
            PHOTO_VIEWER_AUTHOR_MENU = entryPoint4;
            EntryPoint entryPoint5 = new EntryPoint("MODAL_CARD", 4);
            MODAL_CARD = entryPoint5;
            EntryPoint entryPoint6 = new EntryPoint("PRODUCT_SNIPPET", 5);
            PRODUCT_SNIPPET = entryPoint6;
            EntryPoint entryPoint7 = new EntryPoint("PRODUCT_TILE", 6);
            PRODUCT_TILE = entryPoint7;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3, entryPoint4, entryPoint5, entryPoint6, entryPoint7};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        private EntryPoint(String str, int i) {
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick(EntryPoint entryPoint, Integer num, String str) {
        this.entryPoint = entryPoint;
        this.carouselImageIndex = num;
        this.videoTrackCode = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick = (MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick) obj;
        return this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.entryPoint && epx.f(this.carouselImageIndex, mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.carouselImageIndex) && epx.f(this.videoTrackCode, mobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.videoTrackCode);
    }

    public final int hashCode() {
        int hashCode = this.entryPoint.hashCode() * 31;
        Integer num = this.carouselImageIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.videoTrackCode;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedOpenMarketItemClick(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", carouselImageIndex=");
        sb.append(this.carouselImageIndex);
        sb.append(", videoTrackCode=");
        return ho8.a(sb, this.videoTrackCode, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick(EntryPoint entryPoint, Integer num, String str, int i, zcl zclVar) {
        this(entryPoint, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str);
    }
}
