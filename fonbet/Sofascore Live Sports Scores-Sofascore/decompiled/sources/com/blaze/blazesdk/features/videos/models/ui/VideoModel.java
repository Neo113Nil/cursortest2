package com.blaze.blazesdk.features.videos.models.ui;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeAdInfoModel;
import com.blaze.blazesdk.features.shared.models.ui_shared.BaseLayerType;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.interactions.models.ui.InteractionModel;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.atm;
import defpackage.dmi;
import defpackage.eqm;
import defpackage.g7a;
import defpackage.gbm;
import defpackage.hzk;
import defpackage.l4a;
import defpackage.llm;
import defpackage.o6a;
import defpackage.rvl;
import defpackage.tjk;
import defpackage.trm;
import defpackage.u0a;
import defpackage.wv8;
import defpackage.xvm;
import defpackage.ytm;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u009d\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016\u0012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010%\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010#\u0012\u0006\u0010,\u001a\u00020\u001a\u0012\u0006\u0010-\u001a\u00020\u001e\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0016\u0012\u0006\u00100\u001a\u00020\u001e¢\u0006\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u00103¨\u00064"}, d2 = {"Lcom/blaze/blazesdk/features/videos/models/ui/VideoModel;", "", "Lytm;", "Lhzk;", "Leqm;", "Ltjk;", "", "id", "title", "subtitle", "description", "", IronSourceConstants.EVENTS_DURATION, "Ltrm;", "poster", "Lcom/blaze/blazesdk/features/shared/models/ui_shared/i;", U3.i.G0, "Lrvl;", "baseLayer", "Ljava/util/Date;", "updateTime", "assetsExpiryTime", "", "Lxvm;", "thumbnails", "createTime", "", "isRead", "", "lastViewedMs", "", "serverIndex", "Lcom/blaze/blazesdk/interactions/models/ui/InteractionModel;", "interaction", "geoRestriction", "", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;", "defaultAdsInfo", "adInfo", "Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamStatus;", "streamStatus", "streamStartTime", "retrievedLanguages", "isLiked", "likesCount", "Lgbm;", "closedCaptions", "likesCounterDisplayThreshold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLtrm;Lcom/blaze/blazesdk/features/shared/models/ui_shared/i;Lrvl;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/Date;ZFLjava/lang/Integer;Lcom/blaze/blazesdk/interactions/models/ui/InteractionModel;Ljava/util/List;Ljava/util/Map;Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLiveStreamStatus;Ljava/lang/String;Ljava/util/Map;ZILjava/util/List;I)V", "Ljava/lang/String;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VideoModel implements ytm, hzk, eqm, tjk {
    public final String a;
    public final String b;
    public final double c;
    public final trm d;
    public final com.blaze.blazesdk.features.shared.models.ui_shared.i e;
    public final rvl f;
    public final Date g;
    public Date h;
    public final List i;

    @Keep
    @NotNull
    public final String id;
    public final Date j;
    public boolean k;
    public float l;
    public Integer m;
    public final InteractionModel n;
    public final List o;
    public final Map p;
    public final BlazeAdInfoModel q;
    public final BlazeAdInfoModel r;
    public final BlazeLiveStreamStatus s;
    public final String t;

    @Keep
    @NotNull
    public final String title;
    public final Map u;
    public boolean v;
    public int w;
    public final List x;
    public final int y;

    public VideoModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, double d, @NotNull trm trmVar, @NotNull com.blaze.blazesdk.features.shared.models.ui_shared.i iVar, @NotNull rvl rvlVar, @NotNull Date date, @Nullable Date date2, @NotNull List<xvm> list, @NotNull Date date3, boolean z, float f, @Nullable Integer num, @Nullable InteractionModel interactionModel, @Nullable List<String> list2, @NotNull Map<String, String> map, @Nullable BlazeAdInfoModel blazeAdInfoModel, @Nullable BlazeAdInfoModel blazeAdInfoModel2, @Nullable BlazeLiveStreamStatus blazeLiveStreamStatus, @Nullable String str5, @Nullable Map<String, String> map2, boolean z2, int i, @Nullable List<gbm> list3, int i2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        trmVar.getClass();
        iVar.getClass();
        rvlVar.getClass();
        date.getClass();
        list.getClass();
        date3.getClass();
        map.getClass();
        this.id = str;
        this.title = str2;
        this.a = str3;
        this.b = str4;
        this.c = d;
        this.d = trmVar;
        this.e = iVar;
        this.f = rvlVar;
        this.g = date;
        this.h = date2;
        this.i = list;
        this.j = date3;
        this.k = z;
        this.l = f;
        this.m = num;
        this.n = interactionModel;
        this.o = list2;
        this.p = map;
        this.q = blazeAdInfoModel;
        this.r = blazeAdInfoModel2;
        this.s = blazeLiveStreamStatus;
        this.t = str5;
        this.u = map2;
        this.v = z2;
        this.w = i;
        this.x = list3;
        this.y = i2;
    }

    public static VideoModel copy$default(VideoModel videoModel, String str, String str2, String str3, String str4, double d, trm trmVar, com.blaze.blazesdk.features.shared.models.ui_shared.i iVar, rvl rvlVar, Date date, Date date2, List list, Date date3, boolean z, float f, Integer num, InteractionModel interactionModel, List list2, Map map, BlazeAdInfoModel blazeAdInfoModel, BlazeAdInfoModel blazeAdInfoModel2, BlazeLiveStreamStatus blazeLiveStreamStatus, String str5, Map map2, boolean z2, int i, List list3, int i2, int i3, Object obj) {
        String str6 = (i3 & 1) != 0 ? videoModel.id : str;
        String str7 = (i3 & 2) != 0 ? videoModel.title : str2;
        String str8 = (i3 & 4) != 0 ? videoModel.a : str3;
        String str9 = (i3 & 8) != 0 ? videoModel.b : str4;
        double d2 = (i3 & 16) != 0 ? videoModel.c : d;
        trm trmVar2 = (i3 & 32) != 0 ? videoModel.d : trmVar;
        com.blaze.blazesdk.features.shared.models.ui_shared.i iVar2 = (i3 & 64) != 0 ? videoModel.e : iVar;
        rvl rvlVar2 = (i3 & 128) != 0 ? videoModel.f : rvlVar;
        Date date4 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? videoModel.g : date;
        Date date5 = (i3 & 512) != 0 ? videoModel.h : date2;
        List list4 = (i3 & 1024) != 0 ? videoModel.i : list;
        Date date6 = (i3 & com.ironsource.mediationsdk.metadata.a.o) != 0 ? videoModel.j : date3;
        boolean z3 = (i3 & 4096) != 0 ? videoModel.k : z;
        String str10 = str6;
        float f2 = (i3 & 8192) != 0 ? videoModel.l : f;
        Integer num2 = (i3 & 16384) != 0 ? videoModel.m : num;
        InteractionModel interactionModel2 = (i3 & 32768) != 0 ? videoModel.n : interactionModel;
        List list5 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? videoModel.o : list2;
        Map map3 = (i3 & 131072) != 0 ? videoModel.p : map;
        BlazeAdInfoModel blazeAdInfoModel3 = (i3 & 262144) != 0 ? videoModel.q : blazeAdInfoModel;
        BlazeAdInfoModel blazeAdInfoModel4 = (i3 & 524288) != 0 ? videoModel.r : blazeAdInfoModel2;
        BlazeLiveStreamStatus blazeLiveStreamStatus2 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? videoModel.s : blazeLiveStreamStatus;
        String str11 = (i3 & 2097152) != 0 ? videoModel.t : str5;
        Map map4 = (i3 & 4194304) != 0 ? videoModel.u : map2;
        boolean z4 = (i3 & 8388608) != 0 ? videoModel.v : z2;
        int i4 = (i3 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? videoModel.w : i;
        List list6 = (i3 & 33554432) != 0 ? videoModel.x : list3;
        int i5 = (i3 & 67108864) != 0 ? videoModel.y : i2;
        videoModel.getClass();
        str10.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        trmVar2.getClass();
        iVar2.getClass();
        rvlVar2.getClass();
        date4.getClass();
        list4.getClass();
        date6.getClass();
        map3.getClass();
        return new VideoModel(str10, str7, str8, str9, d2, trmVar2, iVar2, rvlVar2, date4, date5, list4, date6, z3, f2, num2, interactionModel2, list5, map3, blazeAdInfoModel3, blazeAdInfoModel4, blazeLiveStreamStatus2, str11, map4, z4, i4, list6, i5);
    }

    @Override // defpackage.ytm
    public final void a(boolean z) {
        this.v = z;
    }

    @Override // defpackage.ytm
    /* renamed from: c, reason: from getter */
    public final boolean getU() {
        return this.v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoModel)) {
            return false;
        }
        VideoModel videoModel = (VideoModel) obj;
        return Intrinsics.c(this.id, videoModel.id) && Intrinsics.c(this.title, videoModel.title) && Intrinsics.c(this.a, videoModel.a) && Intrinsics.c(this.b, videoModel.b) && Double.compare(this.c, videoModel.c) == 0 && Intrinsics.c(this.d, videoModel.d) && Intrinsics.c(this.e, videoModel.e) && Intrinsics.c(this.f, videoModel.f) && Intrinsics.c(this.g, videoModel.g) && Intrinsics.c(this.h, videoModel.h) && Intrinsics.c(this.i, videoModel.i) && Intrinsics.c(this.j, videoModel.j) && this.k == videoModel.k && Float.compare(this.l, videoModel.l) == 0 && Intrinsics.c(this.m, videoModel.m) && Intrinsics.c(this.n, videoModel.n) && Intrinsics.c(this.o, videoModel.o) && Intrinsics.c(this.p, videoModel.p) && Intrinsics.c(this.q, videoModel.q) && Intrinsics.c(this.r, videoModel.r) && this.s == videoModel.s && Intrinsics.c(this.t, videoModel.t) && Intrinsics.c(this.u, videoModel.u) && this.v == videoModel.v && this.w == videoModel.w && Intrinsics.c(this.x, videoModel.x) && this.y == videoModel.y;
    }

    @Override // defpackage.tjk
    public final String f() {
        String str;
        rvl rvlVar = this.f;
        atm atmVar = (atm) CollectionsKt.firstOrNull(rvlVar.b.a);
        if (atmVar == null || (str = atmVar.a) == null) {
            return null;
        }
        BaseLayerType baseLayerType = rvlVar.a;
        int i = baseLayerType == null ? -1 : llm.a[baseLayerType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return str;
        }
        atm atmVar2 = (atm) CollectionsKt.firstOrNull(this.d.a);
        if (atmVar2 != null) {
            return atmVar2.a;
        }
        return null;
    }

    @Override // defpackage.tjk
    /* renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // defpackage.eqm
    /* renamed from: h, reason: from getter */
    public final List getW() {
        return this.x;
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + dmi.b(o6a.k(this.b, o6a.k(this.a, o6a.k(this.title, this.id.hashCode() * 31))), 31, this.c)) * 31)) * 31)) * 31)) * 31;
        Date date = this.h;
        int o = g7a.o(this.l, u0a.t((this.j.hashCode() + dmi.d((hashCode + (date == null ? 0 : date.hashCode())) * 31, 31, this.i)) * 31, this.k));
        Integer num = this.m;
        int hashCode2 = (o + (num == null ? 0 : num.hashCode())) * 31;
        InteractionModel interactionModel = this.n;
        int hashCode3 = (hashCode2 + (interactionModel == null ? 0 : interactionModel.hashCode())) * 31;
        List list = this.o;
        int g = dmi.g(this.p, (hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31);
        BlazeAdInfoModel blazeAdInfoModel = this.q;
        int hashCode4 = (g + (blazeAdInfoModel == null ? 0 : blazeAdInfoModel.hashCode())) * 31;
        BlazeAdInfoModel blazeAdInfoModel2 = this.r;
        int hashCode5 = (hashCode4 + (blazeAdInfoModel2 == null ? 0 : blazeAdInfoModel2.hashCode())) * 31;
        BlazeLiveStreamStatus blazeLiveStreamStatus = this.s;
        int hashCode6 = (hashCode5 + (blazeLiveStreamStatus == null ? 0 : blazeLiveStreamStatus.hashCode())) * 31;
        String str = this.t;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.u;
        int e = l4a.e(this.w, u0a.t((hashCode7 + (map == null ? 0 : map.hashCode())) * 31, this.v));
        List list2 = this.x;
        return Integer.hashCode(this.y) + ((e + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.ytm
    /* renamed from: i, reason: from getter */
    public final int getV() {
        return this.w;
    }

    @Override // defpackage.ytm
    /* renamed from: j, reason: from getter */
    public final int getX() {
        return this.y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoModel(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", poster=");
        sb.append(this.d);
        sb.append(", cta=");
        sb.append(this.e);
        sb.append(", baseLayer=");
        sb.append(this.f);
        sb.append(", updateTime=");
        sb.append(this.g);
        sb.append(", assetsExpiryTime=");
        sb.append(this.h);
        sb.append(", thumbnails=");
        sb.append(this.i);
        sb.append(", createTime=");
        sb.append(this.j);
        sb.append(", isRead=");
        sb.append(this.k);
        sb.append(", lastViewedMs=");
        sb.append(this.l);
        sb.append(", serverIndex=");
        sb.append(this.m);
        sb.append(", interaction=");
        sb.append(this.n);
        sb.append(", geoRestriction=");
        sb.append(this.o);
        sb.append(", extraInfo=");
        sb.append(this.p);
        sb.append(", defaultAdsInfo=");
        sb.append(this.q);
        sb.append(", adInfo=");
        sb.append(this.r);
        sb.append(", streamStatus=");
        sb.append(this.s);
        sb.append(", streamStartTime=");
        sb.append(this.t);
        sb.append(", retrievedLanguages=");
        sb.append(this.u);
        sb.append(", isLiked=");
        sb.append(this.v);
        sb.append(", likesCount=");
        sb.append(this.w);
        sb.append(", closedCaptions=");
        sb.append(this.x);
        sb.append(", likesCounterDisplayThreshold=");
        return wv8.j(sb, this.y, ')');
    }

    @Override // defpackage.ytm
    public final void a(int i) {
        this.w = i;
    }
}
