package com.blaze.blazesdk.features.stories.models.ui;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.ads.models.ui.BlazeBannerAdInfo;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.hzk;
import defpackage.l4a;
import defpackage.o6a;
import defpackage.srl;
import defpackage.u0a;
import defpackage.xvm;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0017\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"¨\u0006#"}, d2 = {"Lcom/blaze/blazesdk/features/stories/models/ui/StoryModel;", "Lhzk;", "", "id", "title", "", "isLive", "Ljava/util/Date;", "updateTime", "isRead", "assetsExpiryTime", "description", "", "Lxvm;", "thumbnails", "Lsrl;", "pages", "Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;", "adInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeBannerAdInfo;", "bannerAdInfo", "defaultAdsInfo", "geoRestriction", "", "extraInfo", "retrievedLanguages", "isFirstStory", "isLastStory", "", "pageIndex", "lastSeenPage", "serverIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;ZLjava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;Lcom/blaze/blazesdk/ads/models/ui/BlazeBannerAdInfo;Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ZZIILjava/lang/Integer;)V", "Ljava/lang/String;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StoryModel implements hzk {
    public final boolean a;
    public final Date b;
    public boolean c;
    public Date d;
    public final String e;
    public final List f;
    public final List g;
    public final BlazeAdInfoModel h;
    public final BlazeBannerAdInfo i;

    @Keep
    @NotNull
    public final String id;
    public final BlazeAdInfoModel j;
    public final List k;
    public final Map l;
    public final Map m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public Integer r;

    @Keep
    @NotNull
    public final String title;

    public StoryModel(@NotNull String str, @NotNull String str2, boolean z, @NotNull Date date, boolean z2, @NotNull Date date2, @NotNull String str3, @NotNull List<xvm> list, @NotNull List<srl> list2, @Nullable BlazeAdInfoModel blazeAdInfoModel, @Nullable BlazeBannerAdInfo blazeBannerAdInfo, @Nullable BlazeAdInfoModel blazeAdInfoModel2, @Nullable List<String> list3, @NotNull Map<String, String> map, @Nullable Map<String, String> map2, boolean z3, boolean z4, int i, int i2, @Nullable Integer num) {
        str.getClass();
        str2.getClass();
        date.getClass();
        date2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        map.getClass();
        this.id = str;
        this.title = str2;
        this.a = z;
        this.b = date;
        this.c = z2;
        this.d = date2;
        this.e = str3;
        this.f = list;
        this.g = list2;
        this.h = blazeAdInfoModel;
        this.i = blazeBannerAdInfo;
        this.j = blazeAdInfoModel2;
        this.k = list3;
        this.l = map;
        this.m = map2;
        this.n = z3;
        this.o = z4;
        this.p = i;
        this.q = i2;
        this.r = num;
    }

    public static StoryModel copy$default(StoryModel storyModel, String str, String str2, boolean z, Date date, boolean z2, Date date2, String str3, List list, List list2, BlazeAdInfoModel blazeAdInfoModel, BlazeBannerAdInfo blazeBannerAdInfo, BlazeAdInfoModel blazeAdInfoModel2, List list3, Map map, Map map2, boolean z3, boolean z4, int i, int i2, Integer num, int i3, Object obj) {
        String str4 = (i3 & 1) != 0 ? storyModel.id : str;
        String str5 = (i3 & 2) != 0 ? storyModel.title : str2;
        boolean z5 = (i3 & 4) != 0 ? storyModel.a : z;
        Date date3 = (i3 & 8) != 0 ? storyModel.b : date;
        boolean z6 = (i3 & 16) != 0 ? storyModel.c : z2;
        Date date4 = (i3 & 32) != 0 ? storyModel.d : date2;
        String str6 = (i3 & 64) != 0 ? storyModel.e : str3;
        List list4 = (i3 & 128) != 0 ? storyModel.f : list;
        List list5 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? storyModel.g : list2;
        BlazeAdInfoModel blazeAdInfoModel3 = (i3 & 512) != 0 ? storyModel.h : blazeAdInfoModel;
        BlazeBannerAdInfo blazeBannerAdInfo2 = (i3 & 1024) != 0 ? storyModel.i : blazeBannerAdInfo;
        BlazeAdInfoModel blazeAdInfoModel4 = (i3 & a.o) != 0 ? storyModel.j : blazeAdInfoModel2;
        List list6 = (i3 & 4096) != 0 ? storyModel.k : list3;
        Map map3 = (i3 & 8192) != 0 ? storyModel.l : map;
        String str7 = str4;
        Map map4 = (i3 & 16384) != 0 ? storyModel.m : map2;
        boolean z7 = (i3 & 32768) != 0 ? storyModel.n : z3;
        boolean z8 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? storyModel.o : z4;
        int i4 = (i3 & 131072) != 0 ? storyModel.p : i;
        int i5 = (i3 & 262144) != 0 ? storyModel.q : i2;
        Integer num2 = (i3 & 524288) != 0 ? storyModel.r : num;
        storyModel.getClass();
        str7.getClass();
        str5.getClass();
        date3.getClass();
        date4.getClass();
        str6.getClass();
        list4.getClass();
        list5.getClass();
        map3.getClass();
        return new StoryModel(str7, str5, z5, date3, z6, date4, str6, list4, list5, blazeAdInfoModel3, blazeBannerAdInfo2, blazeAdInfoModel4, list6, map3, map4, z7, z8, i4, i5, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryModel)) {
            return false;
        }
        StoryModel storyModel = (StoryModel) obj;
        return Intrinsics.c(this.id, storyModel.id) && Intrinsics.c(this.title, storyModel.title) && this.a == storyModel.a && Intrinsics.c(this.b, storyModel.b) && this.c == storyModel.c && Intrinsics.c(this.d, storyModel.d) && Intrinsics.c(this.e, storyModel.e) && Intrinsics.c(this.f, storyModel.f) && Intrinsics.c(this.g, storyModel.g) && Intrinsics.c(this.h, storyModel.h) && Intrinsics.c(this.i, storyModel.i) && Intrinsics.c(this.j, storyModel.j) && Intrinsics.c(this.k, storyModel.k) && Intrinsics.c(this.l, storyModel.l) && Intrinsics.c(this.m, storyModel.m) && this.n == storyModel.n && this.o == storyModel.o && this.p == storyModel.p && this.q == storyModel.q && Intrinsics.c(this.r, storyModel.r);
    }

    public final int hashCode() {
        int d = dmi.d(dmi.d(o6a.k(this.e, (this.d.hashCode() + u0a.t((this.b.hashCode() + u0a.t(o6a.k(this.title, this.id.hashCode() * 31), this.a)) * 31, this.c)) * 31), 31, this.f), 31, this.g);
        BlazeAdInfoModel blazeAdInfoModel = this.h;
        int hashCode = (d + (blazeAdInfoModel == null ? 0 : blazeAdInfoModel.hashCode())) * 31;
        BlazeBannerAdInfo blazeBannerAdInfo = this.i;
        int hashCode2 = (hashCode + (blazeBannerAdInfo == null ? 0 : blazeBannerAdInfo.hashCode())) * 31;
        BlazeAdInfoModel blazeAdInfoModel2 = this.j;
        int hashCode3 = (hashCode2 + (blazeAdInfoModel2 == null ? 0 : blazeAdInfoModel2.hashCode())) * 31;
        List list = this.k;
        int g = dmi.g(this.l, (hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31);
        Map map = this.m;
        int e = l4a.e(this.q, l4a.e(this.p, u0a.t(u0a.t((g + (map == null ? 0 : map.hashCode())) * 31, this.n), this.o)));
        Integer num = this.r;
        return e + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryModel(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isLive=");
        sb.append(this.a);
        sb.append(", updateTime=");
        sb.append(this.b);
        sb.append(", isRead=");
        sb.append(this.c);
        sb.append(", assetsExpiryTime=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", thumbnails=");
        sb.append(this.f);
        sb.append(", pages=");
        sb.append(this.g);
        sb.append(", adInfo=");
        sb.append(this.h);
        sb.append(", bannerAdInfo=");
        sb.append(this.i);
        sb.append(", defaultAdsInfo=");
        sb.append(this.j);
        sb.append(", geoRestriction=");
        sb.append(this.k);
        sb.append(", extraInfo=");
        sb.append(this.l);
        sb.append(", retrievedLanguages=");
        sb.append(this.m);
        sb.append(", isFirstStory=");
        sb.append(this.n);
        sb.append(", isLastStory=");
        sb.append(this.o);
        sb.append(", pageIndex=");
        sb.append(this.p);
        sb.append(", lastSeenPage=");
        sb.append(this.q);
        sb.append(", serverIndex=");
        return bf3.n(sb, this.r, ')');
    }
}
