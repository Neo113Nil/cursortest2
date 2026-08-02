package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.k73;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoAdsStat.kt */
/* loaded from: classes5.dex */
public final class CommonVideoAdsStat$TypeOverlayAdConfigBlocked implements SchemeStat$TypeAction.b {

    @pmi0("block_reason")
    private final BlockReason blockReason;

    @pmi0("common_fields")
    private final Object commonFields;

    @pmi0("expected_banner_type")
    private final ExpectedBannerType expectedBannerType;

    @pmi0("tvt_bucket")
    private final TvtBucket tvtBucket;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoAdsStat.kt */
    public static final class BlockReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockReason[] $VALUES;

        @pmi0("ad_subscription_active")
        public static final BlockReason AD_SUBSCRIPTION_ACTIVE;

        @pmi0("age_block")
        public static final BlockReason AGE_BLOCK;

        @pmi0("bad_ads_catid")
        public static final BlockReason BAD_ADS_CATID;

        @pmi0("brandsafety_stopword")
        public static final BlockReason BRANDSAFETY_STOPWORD;

        @pmi0("child_mode")
        public static final BlockReason CHILD_MODE;

        @pmi0("frequency_cap_reached")
        public static final BlockReason FREQUENCY_CAP_REACHED;

        @pmi0("geo_block")
        public static final BlockReason GEO_BLOCK;

        @pmi0("no_ad_offer_active")
        public static final BlockReason NO_AD_OFFER_ACTIVE;

        @pmi0("other")
        public static final BlockReason OTHER;

        @pmi0("too_small_player")
        public static final BlockReason TOO_SMALL_PLAYER;

        static {
            BlockReason blockReason = new BlockReason("CHILD_MODE", 0);
            CHILD_MODE = blockReason;
            BlockReason blockReason2 = new BlockReason("BAD_ADS_CATID", 1);
            BAD_ADS_CATID = blockReason2;
            BlockReason blockReason3 = new BlockReason("BRANDSAFETY_STOPWORD", 2);
            BRANDSAFETY_STOPWORD = blockReason3;
            BlockReason blockReason4 = new BlockReason("TOO_SMALL_PLAYER", 3);
            TOO_SMALL_PLAYER = blockReason4;
            BlockReason blockReason5 = new BlockReason("FREQUENCY_CAP_REACHED", 4);
            FREQUENCY_CAP_REACHED = blockReason5;
            BlockReason blockReason6 = new BlockReason("GEO_BLOCK", 5);
            GEO_BLOCK = blockReason6;
            BlockReason blockReason7 = new BlockReason("AGE_BLOCK", 6);
            AGE_BLOCK = blockReason7;
            BlockReason blockReason8 = new BlockReason("NO_AD_OFFER_ACTIVE", 7);
            NO_AD_OFFER_ACTIVE = blockReason8;
            BlockReason blockReason9 = new BlockReason("AD_SUBSCRIPTION_ACTIVE", 8);
            AD_SUBSCRIPTION_ACTIVE = blockReason9;
            BlockReason blockReason10 = new BlockReason(NativeAdContent.ViewTag.OTHER, 9);
            OTHER = blockReason10;
            BlockReason[] blockReasonArr = {blockReason, blockReason2, blockReason3, blockReason4, blockReason5, blockReason6, blockReason7, blockReason8, blockReason9, blockReason10};
            $VALUES = blockReasonArr;
            $ENTRIES = new asp(blockReasonArr);
        }

        private BlockReason(String str, int i) {
        }

        public static BlockReason valueOf(String str) {
            return (BlockReason) Enum.valueOf(BlockReason.class, str);
        }

        public static BlockReason[] values() {
            return (BlockReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoAdsStat.kt */
    public static final class ExpectedBannerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ExpectedBannerType[] $VALUES;

        @pmi0("freebet")
        public static final ExpectedBannerType FREEBET;

        @pmi0("odds")
        public static final ExpectedBannerType ODDS;

        static {
            ExpectedBannerType expectedBannerType = new ExpectedBannerType("FREEBET", 0);
            FREEBET = expectedBannerType;
            ExpectedBannerType expectedBannerType2 = new ExpectedBannerType("ODDS", 1);
            ODDS = expectedBannerType2;
            ExpectedBannerType[] expectedBannerTypeArr = {expectedBannerType, expectedBannerType2};
            $VALUES = expectedBannerTypeArr;
            $ENTRIES = new asp(expectedBannerTypeArr);
        }

        private ExpectedBannerType(String str, int i) {
        }

        public static ExpectedBannerType valueOf(String str) {
            return (ExpectedBannerType) Enum.valueOf(ExpectedBannerType.class, str);
        }

        public static ExpectedBannerType[] values() {
            return (ExpectedBannerType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoAdsStat.kt */
    public static final class TvtBucket {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TvtBucket[] $VALUES;

        @pmi0("early")
        public static final TvtBucket EARLY;

        @pmi0("late")
        public static final TvtBucket LATE;

        @pmi0("middle")
        public static final TvtBucket MIDDLE;

        @pmi0("other")
        public static final TvtBucket OTHER;

        static {
            TvtBucket tvtBucket = new TvtBucket("EARLY", 0);
            EARLY = tvtBucket;
            TvtBucket tvtBucket2 = new TvtBucket("MIDDLE", 1);
            MIDDLE = tvtBucket2;
            TvtBucket tvtBucket3 = new TvtBucket("LATE", 2);
            LATE = tvtBucket3;
            TvtBucket tvtBucket4 = new TvtBucket(NativeAdContent.ViewTag.OTHER, 3);
            OTHER = tvtBucket4;
            TvtBucket[] tvtBucketArr = {tvtBucket, tvtBucket2, tvtBucket3, tvtBucket4};
            $VALUES = tvtBucketArr;
            $ENTRIES = new asp(tvtBucketArr);
        }

        private TvtBucket(String str, int i) {
        }

        public static TvtBucket valueOf(String str) {
            return (TvtBucket) Enum.valueOf(TvtBucket.class, str);
        }

        public static TvtBucket[] values() {
            return (TvtBucket[]) $VALUES.clone();
        }
    }

    public CommonVideoAdsStat$TypeOverlayAdConfigBlocked() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoAdsStat$TypeOverlayAdConfigBlocked)) {
            return false;
        }
        CommonVideoAdsStat$TypeOverlayAdConfigBlocked commonVideoAdsStat$TypeOverlayAdConfigBlocked = (CommonVideoAdsStat$TypeOverlayAdConfigBlocked) obj;
        return this.blockReason == commonVideoAdsStat$TypeOverlayAdConfigBlocked.blockReason && this.expectedBannerType == commonVideoAdsStat$TypeOverlayAdConfigBlocked.expectedBannerType && this.tvtBucket == commonVideoAdsStat$TypeOverlayAdConfigBlocked.tvtBucket && epx.f(this.commonFields, commonVideoAdsStat$TypeOverlayAdConfigBlocked.commonFields);
    }

    public final int hashCode() {
        BlockReason blockReason = this.blockReason;
        int hashCode = (blockReason == null ? 0 : blockReason.hashCode()) * 31;
        ExpectedBannerType expectedBannerType = this.expectedBannerType;
        int hashCode2 = (hashCode + (expectedBannerType == null ? 0 : expectedBannerType.hashCode())) * 31;
        TvtBucket tvtBucket = this.tvtBucket;
        int hashCode3 = (hashCode2 + (tvtBucket == null ? 0 : tvtBucket.hashCode())) * 31;
        Object obj = this.commonFields;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOverlayAdConfigBlocked(blockReason=");
        sb.append(this.blockReason);
        sb.append(", expectedBannerType=");
        sb.append(this.expectedBannerType);
        sb.append(", tvtBucket=");
        sb.append(this.tvtBucket);
        sb.append(", commonFields=");
        return k73.c(sb, this.commonFields, ')');
    }

    public CommonVideoAdsStat$TypeOverlayAdConfigBlocked(BlockReason blockReason, ExpectedBannerType expectedBannerType, TvtBucket tvtBucket, Object obj) {
        this.blockReason = blockReason;
        this.expectedBannerType = expectedBannerType;
        this.tvtBucket = tvtBucket;
        this.commonFields = obj;
    }

    public /* synthetic */ CommonVideoAdsStat$TypeOverlayAdConfigBlocked(BlockReason blockReason, ExpectedBannerType expectedBannerType, TvtBucket tvtBucket, Object obj, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : blockReason, (i & 2) != 0 ? null : expectedBannerType, (i & 4) != 0 ? null : tvtBucket, (i & 8) != 0 ? null : obj);
    }
}
