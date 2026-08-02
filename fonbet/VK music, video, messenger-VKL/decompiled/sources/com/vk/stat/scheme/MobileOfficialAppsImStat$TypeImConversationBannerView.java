package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.iq;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsImStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsImStat$TypeImConversationBannerView implements SchemeStat$TypeView.b {
    public final transient String a;

    @pmi0("banner_name")
    private final FilteredString filteredBannerName;

    @pmi0("user2_id")
    private final Long user2Id;

    /* compiled from: MobileOfficialAppsImStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsImStat$TypeImConversationBannerView>, a9y<MobileOfficialAppsImStat$TypeImConversationBannerView> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsImStat$TypeImConversationBannerView(fai.s(x9yVar, "banner_name"), fai.B(x9yVar, "user2_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsImStat$TypeImConversationBannerView mobileOfficialAppsImStat$TypeImConversationBannerView = (MobileOfficialAppsImStat$TypeImConversationBannerView) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("banner_name", mobileOfficialAppsImStat$TypeImConversationBannerView.a);
            x9yVar.n("user2_id", mobileOfficialAppsImStat$TypeImConversationBannerView.a());
            return x9yVar;
        }
    }

    public MobileOfficialAppsImStat$TypeImConversationBannerView(String str, Long l) {
        this.a = str;
        this.user2Id = l;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredBannerName = filteredString;
        filteredString.a(str);
    }

    public final Long a() {
        return this.user2Id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsImStat$TypeImConversationBannerView)) {
            return false;
        }
        MobileOfficialAppsImStat$TypeImConversationBannerView mobileOfficialAppsImStat$TypeImConversationBannerView = (MobileOfficialAppsImStat$TypeImConversationBannerView) obj;
        return epx.f(this.a, mobileOfficialAppsImStat$TypeImConversationBannerView.a) && epx.f(this.user2Id, mobileOfficialAppsImStat$TypeImConversationBannerView.user2Id);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.user2Id;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeImConversationBannerView(bannerName=");
        sb.append(this.a);
        sb.append(", user2Id=");
        return iq.b(sb, this.user2Id, ')');
    }

    public /* synthetic */ MobileOfficialAppsImStat$TypeImConversationBannerView(String str, Long l, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : l);
    }
}
