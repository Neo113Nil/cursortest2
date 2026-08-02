package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeCommunitiesView implements SchemeStat$TypeView.b {

    @pmi0("community_id")
    private final long communityId;

    @pmi0("source")
    private final Source source;

    @pmi0("type")
    private final Type type;

    @pmi0("type_statistic_dashboard_view")
    private final CommonCommunitiesStat$TypeStatisticDashboardViewItem typeStatisticDashboardView;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("business_tools")
        public static final Source BUSINESS_TOOLS;

        @pmi0("clips_block")
        public static final Source CLIPS_BLOCK;

        @pmi0("community_header_block")
        public static final Source COMMUNITY_HEADER_BLOCK;

        @pmi0("creation_onboarding_block")
        public static final Source CREATION_ONBOARDING_BLOCK;

        @pmi0("group")
        public static final Source GROUP;

        @pmi0("other")
        public static final Source OTHER;

        @pmi0("statistic_dashboard")
        public static final Source STATISTIC_DASHBOARD;

        static {
            Source source = new Source("COMMUNITY_HEADER_BLOCK", 0);
            COMMUNITY_HEADER_BLOCK = source;
            Source source2 = new Source("CREATION_ONBOARDING_BLOCK", 1);
            CREATION_ONBOARDING_BLOCK = source2;
            Source source3 = new Source("CLIPS_BLOCK", 2);
            CLIPS_BLOCK = source3;
            Source source4 = new Source("STATISTIC_DASHBOARD", 3);
            STATISTIC_DASHBOARD = source4;
            Source source5 = new Source("GROUP", 4);
            GROUP = source5;
            Source source6 = new Source("BUSINESS_TOOLS", 5);
            BUSINESS_TOOLS = source6;
            Source source7 = new Source(NativeAdContent.ViewTag.OTHER, 6);
            OTHER = source7;
            Source[] sourceArr = {source, source2, source3, source4, source5, source6, source7};
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
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_statistic_dashboard_view")
        public static final Type TYPE_STATISTIC_DASHBOARD_VIEW;

        static {
            Type type = new Type("TYPE_STATISTIC_DASHBOARD_VIEW", 0);
            TYPE_STATISTIC_DASHBOARD_VIEW = type;
            Type[] typeArr = {type};
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

    public /* synthetic */ CommonCommunitiesStat$TypeCommunitiesView(Type type, long j, Source source, CommonCommunitiesStat$TypeStatisticDashboardViewItem commonCommunitiesStat$TypeStatisticDashboardViewItem, zcl zclVar) {
        this(type, j, source, commonCommunitiesStat$TypeStatisticDashboardViewItem);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeCommunitiesView)) {
            return false;
        }
        CommonCommunitiesStat$TypeCommunitiesView commonCommunitiesStat$TypeCommunitiesView = (CommonCommunitiesStat$TypeCommunitiesView) obj;
        return this.type == commonCommunitiesStat$TypeCommunitiesView.type && this.communityId == commonCommunitiesStat$TypeCommunitiesView.communityId && this.source == commonCommunitiesStat$TypeCommunitiesView.source && epx.f(this.typeStatisticDashboardView, commonCommunitiesStat$TypeCommunitiesView.typeStatisticDashboardView);
    }

    public final int hashCode() {
        int hashCode = (this.source.hashCode() + bh10.a(this.type.hashCode() * 31, 31, this.communityId)) * 31;
        CommonCommunitiesStat$TypeStatisticDashboardViewItem commonCommunitiesStat$TypeStatisticDashboardViewItem = this.typeStatisticDashboardView;
        return hashCode + (commonCommunitiesStat$TypeStatisticDashboardViewItem == null ? 0 : commonCommunitiesStat$TypeStatisticDashboardViewItem.hashCode());
    }

    public final String toString() {
        return "TypeCommunitiesView(type=" + this.type + ", communityId=" + this.communityId + ", source=" + this.source + ", typeStatisticDashboardView=" + this.typeStatisticDashboardView + ')';
    }

    private CommonCommunitiesStat$TypeCommunitiesView(Type type, long j, Source source, CommonCommunitiesStat$TypeStatisticDashboardViewItem commonCommunitiesStat$TypeStatisticDashboardViewItem) {
        this.type = type;
        this.communityId = j;
        this.source = source;
        this.typeStatisticDashboardView = commonCommunitiesStat$TypeStatisticDashboardViewItem;
    }

    public /* synthetic */ CommonCommunitiesStat$TypeCommunitiesView(Type type, long j, Source source, CommonCommunitiesStat$TypeStatisticDashboardViewItem commonCommunitiesStat$TypeStatisticDashboardViewItem, int i, zcl zclVar) {
        this(type, j, source, (i & 8) != 0 ? null : commonCommunitiesStat$TypeStatisticDashboardViewItem);
    }
}
