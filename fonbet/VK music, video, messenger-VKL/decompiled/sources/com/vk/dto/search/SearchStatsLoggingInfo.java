package com.vk.dto.search;

import com.vk.core.serialize.Serializer;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.zcl;

/* compiled from: SearchStatsLoggingInfo.kt */
/* loaded from: classes18.dex */
public final class SearchStatsLoggingInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<SearchStatsLoggingInfo> CREATOR = new a();
    public final String b;
    public final int c;
    public final SchemeStat$EventItem.Type d;
    public final long e;
    public final String f;
    public final MobileOfficialAppsCoreNavStat$EventScreen g;
    public final String h;
    public final boolean i;
    public final boolean j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<SearchStatsLoggingInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SearchStatsLoggingInfo a(Serializer serializer) {
            SchemeStat$EventItem.Type type;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
            String H = serializer.H();
            int u = serializer.u();
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            try {
                type = SchemeStat$EventItem.Type.valueOf(H2);
            } catch (Throwable unused) {
                type = SchemeStat$EventItem.Type.CLICK_ITEM;
            }
            long w = serializer.w();
            String H3 = serializer.H();
            Serializer.c<SearchStatsLoggingInfo> cVar = SearchStatsLoggingInfo.CREATOR;
            String H4 = serializer.H();
            try {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.valueOf(H4 != null ? H4 : "");
            } catch (Throwable unused2) {
                mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
            }
            return new SearchStatsLoggingInfo(H, u, type, w, H3, mobileOfficialAppsCoreNavStat$EventScreen, serializer.H(), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SearchStatsLoggingInfo[i];
        }
    }

    public /* synthetic */ SearchStatsLoggingInfo(String str, int i, SchemeStat$EventItem.Type type, long j, String str2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str3, boolean z, boolean z2, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? -1 : i, type, (i2 & 8) != 0 ? 0L : j, str2, mobileOfficialAppsCoreNavStat$EventScreen, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? false : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SchemeStat$TypeClick Ab(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action, String str) {
        MobileOfficialAppsSearchStat$TypeSearchClickItem mobileOfficialAppsSearchStat$TypeSearchClickItem = new MobileOfficialAppsSearchStat$TypeSearchClickItem(action, null, null, null, this.g, 14, null);
        SchemeStat$EventItem.Type type = this.d;
        String str2 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        return SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str2, str, objArr, 46, null), mobileOfficialAppsSearchStat$TypeSearchClickItem, 2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d.name());
        serializer.Y(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g.name());
        serializer.j0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
    }

    public final boolean zb() {
        return this.i;
    }

    public SearchStatsLoggingInfo(String str, int i, SchemeStat$EventItem.Type type, long j, String str2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str3, boolean z, boolean z2) {
        this.b = str;
        this.c = i;
        this.d = type;
        this.e = j;
        this.f = str2;
        this.g = mobileOfficialAppsCoreNavStat$EventScreen;
        this.h = str3;
        this.i = z;
        this.j = z2;
    }
}
