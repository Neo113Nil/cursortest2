package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGroupsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGroupsStat$TypeGroupsEventItem implements SchemeStat$TypeClick.b {

    @pmi0("block_type")
    private final BlockType blockType;

    @pmi0("click_event")
    private final CommonCommunitiesStat$ClickEvent clickEvent;

    @pmi0("cta_click")
    private final MobileOfficialAppsGroupsStat$CtaClick ctaClick;

    @pmi0("group_id")
    private final long groupId;

    @pmi0("live_cover_event")
    private final MobileOfficialAppsGroupsStat$LiveCoverEvent liveCoverEvent;

    @pmi0("onboarding_event")
    private final MobileOfficialAppsGroupsStat$OnboardingEvent onboardingEvent;

    @pmi0("open_community")
    private final d0 openCommunity;

    @pmi0("open_screen_event")
    private final MobileOfficialAppsGroupsStat$OpenScreenEvent openScreenEvent;

    @pmi0("source")
    private final Source source;

    @pmi0("tab_event")
    private final MobileOfficialAppsGroupsStat$TabEvent tabEvent;

    @pmi0("type")
    private final Type type;

    @pmi0("video_subscribe_event")
    private final MobileOfficialAppsGroupsStat$VideoSubscribeEvent videoSubscribeEvent;

    @pmi0("watching_content_event")
    private final CommonProfileStat$WatchingContentEvent watchingContentEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class BlockType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockType[] $VALUES;

        @pmi0("external_integration")
        public static final BlockType EXTERNAL_INTEGRATION;

        @pmi0("free_delivery")
        public static final BlockType FREE_DELIVERY;

        @pmi0("friends_trust_mark")
        public static final BlockType FRIENDS_TRUST_MARK;

        @pmi0("has_delivery")
        public static final BlockType HAS_DELIVERY;

        @pmi0("many_years_in_vk")
        public static final BlockType MANY_YEARS_IN_VK;

        @pmi0("popular_shop")
        public static final BlockType POPULAR_SHOP;

        @pmi0("purchase_info")
        public static final BlockType PURCHASE_INFO;

        @pmi0("self_delivery")
        public static final BlockType SELF_DELIVERY;

        @pmi0("verified_business")
        public static final BlockType VERIFIED_BUSINESS;

        @pmi0("yc_integration")
        public static final BlockType YC_INTEGRATION;

        static {
            BlockType blockType = new BlockType("POPULAR_SHOP", 0);
            POPULAR_SHOP = blockType;
            BlockType blockType2 = new BlockType("FRIENDS_TRUST_MARK", 1);
            FRIENDS_TRUST_MARK = blockType2;
            BlockType blockType3 = new BlockType("VERIFIED_BUSINESS", 2);
            VERIFIED_BUSINESS = blockType3;
            BlockType blockType4 = new BlockType("EXTERNAL_INTEGRATION", 3);
            EXTERNAL_INTEGRATION = blockType4;
            BlockType blockType5 = new BlockType("YC_INTEGRATION", 4);
            YC_INTEGRATION = blockType5;
            BlockType blockType6 = new BlockType("FREE_DELIVERY", 5);
            FREE_DELIVERY = blockType6;
            BlockType blockType7 = new BlockType("SELF_DELIVERY", 6);
            SELF_DELIVERY = blockType7;
            BlockType blockType8 = new BlockType("HAS_DELIVERY", 7);
            HAS_DELIVERY = blockType8;
            BlockType blockType9 = new BlockType("PURCHASE_INFO", 8);
            PURCHASE_INFO = blockType9;
            BlockType blockType10 = new BlockType("MANY_YEARS_IN_VK", 9);
            MANY_YEARS_IN_VK = blockType10;
            BlockType[] blockTypeArr = {blockType, blockType2, blockType3, blockType4, blockType5, blockType6, blockType7, blockType8, blockType9, blockType10};
            $VALUES = blockTypeArr;
            $ENTRIES = new asp(blockTypeArr);
        }

        private BlockType(String str, int i) {
        }

        public static BlockType valueOf(String str) {
            return (BlockType) Enum.valueOf(BlockType.class, str);
        }

        public static BlockType[] values() {
            return (BlockType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("messenger_recommendation")
        public static final Source MESSENGER_RECOMMENDATION;

        @pmi0("qr_campaign_1")
        public static final Source QR_CAMPAIGN_1;

        @pmi0("qr_campaign_2")
        public static final Source QR_CAMPAIGN_2;

        @pmi0("qr_campaign_3")
        public static final Source QR_CAMPAIGN_3;

        static {
            Source source = new Source("QR_CAMPAIGN_1", 0);
            QR_CAMPAIGN_1 = source;
            Source source2 = new Source("QR_CAMPAIGN_2", 1);
            QR_CAMPAIGN_2 = source2;
            Source source3 = new Source("QR_CAMPAIGN_3", 2);
            QR_CAMPAIGN_3 = source3;
            Source source4 = new Source("MESSENGER_RECOMMENDATION", 3);
            MESSENGER_RECOMMENDATION = source4;
            Source[] sourceArr = {source, source2, source3, source4};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("click_event")
        public static final Type CLICK_EVENT;

        @pmi0("cta_click")
        public static final Type CTA_CLICK;

        @pmi0("join")
        public static final Type JOIN;

        @pmi0("leave")
        public static final Type LEAVE;

        @pmi0("live_cover_event")
        public static final Type LIVE_COVER_EVENT;

        @pmi0("onboarding_event")
        public static final Type ONBOARDING_EVENT;

        @pmi0("open_community")
        public static final Type OPEN_COMMUNITY;

        @pmi0("open_screen_event")
        public static final Type OPEN_SCREEN_EVENT;

        @pmi0("video_subscribe_event")
        public static final Type VIDEO_SUBSCRIBE_EVENT;

        static {
            Type type = new Type("ONBOARDING_EVENT", 0);
            ONBOARDING_EVENT = type;
            Type type2 = new Type("LIVE_COVER_EVENT", 1);
            LIVE_COVER_EVENT = type2;
            Type type3 = new Type("OPEN_SCREEN_EVENT", 2);
            OPEN_SCREEN_EVENT = type3;
            Type type4 = new Type("CTA_CLICK", 3);
            CTA_CLICK = type4;
            Type type5 = new Type("JOIN", 4);
            JOIN = type5;
            Type type6 = new Type("LEAVE", 5);
            LEAVE = type6;
            Type type7 = new Type("OPEN_COMMUNITY", 6);
            OPEN_COMMUNITY = type7;
            Type type8 = new Type("VIDEO_SUBSCRIBE_EVENT", 7);
            VIDEO_SUBSCRIBE_EVENT = type8;
            Type type9 = new Type("CLICK_EVENT", 8);
            CLICK_EVENT = type9;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9};
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

    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class a {
        public static MobileOfficialAppsGroupsStat$TypeGroupsEventItem a(long j, Source source, MobileOfficialAppsGroupsStat$TabEvent mobileOfficialAppsGroupsStat$TabEvent, b bVar, int i) {
            Source source2 = (i & 2) != 0 ? null : source;
            MobileOfficialAppsGroupsStat$TabEvent mobileOfficialAppsGroupsStat$TabEvent2 = (i & 16) != 0 ? null : mobileOfficialAppsGroupsStat$TabEvent;
            b bVar2 = (i & 32) == 0 ? bVar : null;
            CommonProfileStat$WatchingContentEvent commonProfileStat$WatchingContentEvent = null;
            BlockType blockType = null;
            if (bVar2 == null) {
                return new MobileOfficialAppsGroupsStat$TypeGroupsEventItem(j, source2, blockType, null, null, null, null, commonProfileStat$WatchingContentEvent, null, null, null, mobileOfficialAppsGroupsStat$TabEvent2, null, RtpSenderHelper.AUDIO_BITRATE_MIN, null);
            }
            if (bVar2 instanceof MobileOfficialAppsGroupsStat$OnboardingEvent) {
                return new MobileOfficialAppsGroupsStat$TypeGroupsEventItem(j, source2, blockType, Type.ONBOARDING_EVENT, (MobileOfficialAppsGroupsStat$OnboardingEvent) bVar2, null, null, commonProfileStat$WatchingContentEvent, null, null, null, mobileOfficialAppsGroupsStat$TabEvent2, null, 5984, null);
            }
            if (bVar2 instanceof MobileOfficialAppsGroupsStat$LiveCoverEvent) {
                return new MobileOfficialAppsGroupsStat$TypeGroupsEventItem(j, source2, blockType, Type.LIVE_COVER_EVENT, null, null, (MobileOfficialAppsGroupsStat$LiveCoverEvent) bVar2, commonProfileStat$WatchingContentEvent, null, null, null, mobileOfficialAppsGroupsStat$TabEvent2, null, 5936, null);
            }
            if (bVar2 instanceof MobileOfficialAppsGroupsStat$OpenScreenEvent) {
                return new MobileOfficialAppsGroupsStat$TypeGroupsEventItem(j, source2, blockType, Type.OPEN_SCREEN_EVENT, null, null, null, commonProfileStat$WatchingContentEvent, (MobileOfficialAppsGroupsStat$OpenScreenEvent) bVar2, null, null, mobileOfficialAppsGroupsStat$TabEvent2, null, 5744, null);
            }
            if (bVar2 instanceof MobileOfficialAppsGroupsStat$CtaClick) {
                return new MobileOfficialAppsGroupsStat$TypeGroupsEventItem(j, source2, blockType, Type.CTA_CLICK, null, null, null, commonProfileStat$WatchingContentEvent, null, (MobileOfficialAppsGroupsStat$CtaClick) bVar2, null, mobileOfficialAppsGroupsStat$TabEvent2, null, 5488, null);
            }
            if (bVar2 instanceof d0) {
                return new MobileOfficialAppsGroupsStat$TypeGroupsEventItem(j, source2, blockType, Type.OPEN_COMMUNITY, null, (d0) bVar2, null, commonProfileStat$WatchingContentEvent, null, null, null, mobileOfficialAppsGroupsStat$TabEvent2, null, 5968, null);
            }
            if (bVar2 instanceof MobileOfficialAppsGroupsStat$VideoSubscribeEvent) {
                return new MobileOfficialAppsGroupsStat$TypeGroupsEventItem(j, source2, blockType, Type.VIDEO_SUBSCRIBE_EVENT, null, null, null, commonProfileStat$WatchingContentEvent, null, null, (MobileOfficialAppsGroupsStat$VideoSubscribeEvent) bVar2, mobileOfficialAppsGroupsStat$TabEvent2, null, 4976, null);
            }
            if (bVar2 instanceof CommonCommunitiesStat$ClickEvent) {
                return new MobileOfficialAppsGroupsStat$TypeGroupsEventItem(j, source2, blockType, Type.CLICK_EVENT, null, null, null, commonProfileStat$WatchingContentEvent, null, null, null, mobileOfficialAppsGroupsStat$TabEvent2, (CommonCommunitiesStat$ClickEvent) bVar2, 1904, null);
            }
            throw new IllegalArgumentException("payload must be one of(OnboardingEvent, LiveCoverEvent, OpenScreenEvent, CtaClick, OpenCommunity, VideoSubscribeEvent, ClickEvent)");
        }
    }

    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public interface b {
    }

    private MobileOfficialAppsGroupsStat$TypeGroupsEventItem(long j, Source source, BlockType blockType, Type type, MobileOfficialAppsGroupsStat$OnboardingEvent mobileOfficialAppsGroupsStat$OnboardingEvent, d0 d0Var, MobileOfficialAppsGroupsStat$LiveCoverEvent mobileOfficialAppsGroupsStat$LiveCoverEvent, CommonProfileStat$WatchingContentEvent commonProfileStat$WatchingContentEvent, MobileOfficialAppsGroupsStat$OpenScreenEvent mobileOfficialAppsGroupsStat$OpenScreenEvent, MobileOfficialAppsGroupsStat$CtaClick mobileOfficialAppsGroupsStat$CtaClick, MobileOfficialAppsGroupsStat$VideoSubscribeEvent mobileOfficialAppsGroupsStat$VideoSubscribeEvent, MobileOfficialAppsGroupsStat$TabEvent mobileOfficialAppsGroupsStat$TabEvent, CommonCommunitiesStat$ClickEvent commonCommunitiesStat$ClickEvent) {
        this.groupId = j;
        this.source = source;
        this.blockType = blockType;
        this.type = type;
        this.onboardingEvent = mobileOfficialAppsGroupsStat$OnboardingEvent;
        this.openCommunity = d0Var;
        this.liveCoverEvent = mobileOfficialAppsGroupsStat$LiveCoverEvent;
        this.watchingContentEvent = commonProfileStat$WatchingContentEvent;
        this.openScreenEvent = mobileOfficialAppsGroupsStat$OpenScreenEvent;
        this.ctaClick = mobileOfficialAppsGroupsStat$CtaClick;
        this.videoSubscribeEvent = mobileOfficialAppsGroupsStat$VideoSubscribeEvent;
        this.tabEvent = mobileOfficialAppsGroupsStat$TabEvent;
        this.clickEvent = commonCommunitiesStat$ClickEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGroupsStat$TypeGroupsEventItem)) {
            return false;
        }
        MobileOfficialAppsGroupsStat$TypeGroupsEventItem mobileOfficialAppsGroupsStat$TypeGroupsEventItem = (MobileOfficialAppsGroupsStat$TypeGroupsEventItem) obj;
        return this.groupId == mobileOfficialAppsGroupsStat$TypeGroupsEventItem.groupId && this.source == mobileOfficialAppsGroupsStat$TypeGroupsEventItem.source && this.blockType == mobileOfficialAppsGroupsStat$TypeGroupsEventItem.blockType && this.type == mobileOfficialAppsGroupsStat$TypeGroupsEventItem.type && epx.f(this.onboardingEvent, mobileOfficialAppsGroupsStat$TypeGroupsEventItem.onboardingEvent) && epx.f(this.openCommunity, mobileOfficialAppsGroupsStat$TypeGroupsEventItem.openCommunity) && epx.f(this.liveCoverEvent, mobileOfficialAppsGroupsStat$TypeGroupsEventItem.liveCoverEvent) && epx.f(this.watchingContentEvent, mobileOfficialAppsGroupsStat$TypeGroupsEventItem.watchingContentEvent) && epx.f(this.openScreenEvent, mobileOfficialAppsGroupsStat$TypeGroupsEventItem.openScreenEvent) && epx.f(this.ctaClick, mobileOfficialAppsGroupsStat$TypeGroupsEventItem.ctaClick) && epx.f(this.videoSubscribeEvent, mobileOfficialAppsGroupsStat$TypeGroupsEventItem.videoSubscribeEvent) && epx.f(this.tabEvent, mobileOfficialAppsGroupsStat$TypeGroupsEventItem.tabEvent) && epx.f(this.clickEvent, mobileOfficialAppsGroupsStat$TypeGroupsEventItem.clickEvent);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.groupId) * 31;
        Source source = this.source;
        int hashCode2 = (hashCode + (source == null ? 0 : source.hashCode())) * 31;
        BlockType blockType = this.blockType;
        int hashCode3 = (hashCode2 + (blockType == null ? 0 : blockType.hashCode())) * 31;
        Type type = this.type;
        int hashCode4 = (hashCode3 + (type == null ? 0 : type.hashCode())) * 31;
        MobileOfficialAppsGroupsStat$OnboardingEvent mobileOfficialAppsGroupsStat$OnboardingEvent = this.onboardingEvent;
        int hashCode5 = (hashCode4 + (mobileOfficialAppsGroupsStat$OnboardingEvent == null ? 0 : mobileOfficialAppsGroupsStat$OnboardingEvent.hashCode())) * 31;
        d0 d0Var = this.openCommunity;
        int hashCode6 = (hashCode5 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        MobileOfficialAppsGroupsStat$LiveCoverEvent mobileOfficialAppsGroupsStat$LiveCoverEvent = this.liveCoverEvent;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsGroupsStat$LiveCoverEvent == null ? 0 : mobileOfficialAppsGroupsStat$LiveCoverEvent.hashCode())) * 31;
        CommonProfileStat$WatchingContentEvent commonProfileStat$WatchingContentEvent = this.watchingContentEvent;
        int hashCode8 = (hashCode7 + (commonProfileStat$WatchingContentEvent == null ? 0 : commonProfileStat$WatchingContentEvent.hashCode())) * 31;
        MobileOfficialAppsGroupsStat$OpenScreenEvent mobileOfficialAppsGroupsStat$OpenScreenEvent = this.openScreenEvent;
        int hashCode9 = (hashCode8 + (mobileOfficialAppsGroupsStat$OpenScreenEvent == null ? 0 : mobileOfficialAppsGroupsStat$OpenScreenEvent.hashCode())) * 31;
        MobileOfficialAppsGroupsStat$CtaClick mobileOfficialAppsGroupsStat$CtaClick = this.ctaClick;
        int hashCode10 = (hashCode9 + (mobileOfficialAppsGroupsStat$CtaClick == null ? 0 : mobileOfficialAppsGroupsStat$CtaClick.hashCode())) * 31;
        MobileOfficialAppsGroupsStat$VideoSubscribeEvent mobileOfficialAppsGroupsStat$VideoSubscribeEvent = this.videoSubscribeEvent;
        int hashCode11 = (hashCode10 + (mobileOfficialAppsGroupsStat$VideoSubscribeEvent == null ? 0 : mobileOfficialAppsGroupsStat$VideoSubscribeEvent.hashCode())) * 31;
        MobileOfficialAppsGroupsStat$TabEvent mobileOfficialAppsGroupsStat$TabEvent = this.tabEvent;
        int hashCode12 = (hashCode11 + (mobileOfficialAppsGroupsStat$TabEvent == null ? 0 : mobileOfficialAppsGroupsStat$TabEvent.hashCode())) * 31;
        CommonCommunitiesStat$ClickEvent commonCommunitiesStat$ClickEvent = this.clickEvent;
        return hashCode12 + (commonCommunitiesStat$ClickEvent != null ? commonCommunitiesStat$ClickEvent.hashCode() : 0);
    }

    public final String toString() {
        return "TypeGroupsEventItem(groupId=" + this.groupId + ", source=" + this.source + ", blockType=" + this.blockType + ", type=" + this.type + ", onboardingEvent=" + this.onboardingEvent + ", openCommunity=" + this.openCommunity + ", liveCoverEvent=" + this.liveCoverEvent + ", watchingContentEvent=" + this.watchingContentEvent + ", openScreenEvent=" + this.openScreenEvent + ", ctaClick=" + this.ctaClick + ", videoSubscribeEvent=" + this.videoSubscribeEvent + ", tabEvent=" + this.tabEvent + ", clickEvent=" + this.clickEvent + ')';
    }

    public /* synthetic */ MobileOfficialAppsGroupsStat$TypeGroupsEventItem(long j, Source source, BlockType blockType, Type type, MobileOfficialAppsGroupsStat$OnboardingEvent mobileOfficialAppsGroupsStat$OnboardingEvent, d0 d0Var, MobileOfficialAppsGroupsStat$LiveCoverEvent mobileOfficialAppsGroupsStat$LiveCoverEvent, CommonProfileStat$WatchingContentEvent commonProfileStat$WatchingContentEvent, MobileOfficialAppsGroupsStat$OpenScreenEvent mobileOfficialAppsGroupsStat$OpenScreenEvent, MobileOfficialAppsGroupsStat$CtaClick mobileOfficialAppsGroupsStat$CtaClick, MobileOfficialAppsGroupsStat$VideoSubscribeEvent mobileOfficialAppsGroupsStat$VideoSubscribeEvent, MobileOfficialAppsGroupsStat$TabEvent mobileOfficialAppsGroupsStat$TabEvent, CommonCommunitiesStat$ClickEvent commonCommunitiesStat$ClickEvent, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : source, (i & 4) != 0 ? null : blockType, (i & 8) != 0 ? null : type, (i & 16) != 0 ? null : mobileOfficialAppsGroupsStat$OnboardingEvent, (i & 32) != 0 ? null : d0Var, (i & 64) != 0 ? null : mobileOfficialAppsGroupsStat$LiveCoverEvent, (i & 128) != 0 ? null : commonProfileStat$WatchingContentEvent, (i & 256) != 0 ? null : mobileOfficialAppsGroupsStat$OpenScreenEvent, (i & 512) != 0 ? null : mobileOfficialAppsGroupsStat$CtaClick, (i & 1024) != 0 ? null : mobileOfficialAppsGroupsStat$VideoSubscribeEvent, (i & 2048) != 0 ? null : mobileOfficialAppsGroupsStat$TabEvent, (i & 4096) != 0 ? null : commonCommunitiesStat$ClickEvent);
    }
}
