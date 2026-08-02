package com.vk.sdk.api.ads.dto;

import xsna.cgn;
import xsna.epx;
import xsna.odj;
import xsna.oq;
import xsna.pmi0;
import xsna.shy;
import xsna.sq;
import xsna.zcl;

/* compiled from: AdsPromotedPostReachDto.kt */
/* loaded from: classes5.dex */
public final class AdsPromotedPostReachDto {

    @pmi0("hide")
    private final int hide;

    @pmi0("id")
    private final int id;

    @pmi0("join_group")
    private final int joinGroup;

    @pmi0("links")
    private final int links;

    @pmi0("pretty_cards_clicks")
    private final Integer prettyCardsClicks;

    @pmi0("reach_subscribers")
    private final int reachSubscribers;

    @pmi0("reach_total")
    private final int reachTotal;

    @pmi0("report")
    private final int report;

    @pmi0("to_group")
    private final int toGroup;

    @pmi0("unsubscribe")
    private final int unsubscribe;

    @pmi0("video_views_100p")
    private final Integer videoViews100p;

    @pmi0("video_views_10s")
    private final Integer videoViews10s;

    @pmi0("video_views_25p")
    private final Integer videoViews25p;

    @pmi0("video_views_3s")
    private final Integer videoViews3s;

    @pmi0("video_views_50p")
    private final Integer videoViews50p;

    @pmi0("video_views_75p")
    private final Integer videoViews75p;

    @pmi0("video_views_start")
    private final Integer videoViewsStart;

    public AdsPromotedPostReachDto(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8) {
        this.hide = i;
        this.id = i2;
        this.joinGroup = i3;
        this.links = i4;
        this.reachSubscribers = i5;
        this.reachTotal = i6;
        this.report = i7;
        this.toGroup = i8;
        this.unsubscribe = i9;
        this.videoViews100p = num;
        this.videoViews25p = num2;
        this.videoViews3s = num3;
        this.videoViews10s = num4;
        this.videoViews50p = num5;
        this.videoViews75p = num6;
        this.videoViewsStart = num7;
        this.prettyCardsClicks = num8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsPromotedPostReachDto)) {
            return false;
        }
        AdsPromotedPostReachDto adsPromotedPostReachDto = (AdsPromotedPostReachDto) obj;
        return this.hide == adsPromotedPostReachDto.hide && this.id == adsPromotedPostReachDto.id && this.joinGroup == adsPromotedPostReachDto.joinGroup && this.links == adsPromotedPostReachDto.links && this.reachSubscribers == adsPromotedPostReachDto.reachSubscribers && this.reachTotal == adsPromotedPostReachDto.reachTotal && this.report == adsPromotedPostReachDto.report && this.toGroup == adsPromotedPostReachDto.toGroup && this.unsubscribe == adsPromotedPostReachDto.unsubscribe && epx.f(this.videoViews100p, adsPromotedPostReachDto.videoViews100p) && epx.f(this.videoViews25p, adsPromotedPostReachDto.videoViews25p) && epx.f(this.videoViews3s, adsPromotedPostReachDto.videoViews3s) && epx.f(this.videoViews10s, adsPromotedPostReachDto.videoViews10s) && epx.f(this.videoViews50p, adsPromotedPostReachDto.videoViews50p) && epx.f(this.videoViews75p, adsPromotedPostReachDto.videoViews75p) && epx.f(this.videoViewsStart, adsPromotedPostReachDto.videoViewsStart) && epx.f(this.prettyCardsClicks, adsPromotedPostReachDto.prettyCardsClicks);
    }

    public final int hashCode() {
        int a = shy.a(this.unsubscribe, shy.a(this.toGroup, shy.a(this.report, shy.a(this.reachTotal, shy.a(this.reachSubscribers, shy.a(this.links, shy.a(this.joinGroup, shy.a(this.id, Integer.hashCode(this.hide) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.videoViews100p;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.videoViews25p;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoViews3s;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoViews10s;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.videoViews50p;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.videoViews75p;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.videoViewsStart;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.prettyCardsClicks;
        return hashCode7 + (num8 != null ? num8.hashCode() : 0);
    }

    public final String toString() {
        int i = this.hide;
        int i2 = this.id;
        int i3 = this.joinGroup;
        int i4 = this.links;
        int i5 = this.reachSubscribers;
        int i6 = this.reachTotal;
        int i7 = this.report;
        int i8 = this.toGroup;
        int i9 = this.unsubscribe;
        Integer num = this.videoViews100p;
        Integer num2 = this.videoViews25p;
        Integer num3 = this.videoViews3s;
        Integer num4 = this.videoViews10s;
        Integer num5 = this.videoViews50p;
        Integer num6 = this.videoViews75p;
        Integer num7 = this.videoViewsStart;
        Integer num8 = this.prettyCardsClicks;
        StringBuilder a = odj.a(i, i2, "AdsPromotedPostReachDto(hide=", ", id=", ", joinGroup=");
        cgn.a(i3, i4, ", links=", ", reachSubscribers=", a);
        cgn.a(i5, i6, ", reachTotal=", ", report=", a);
        cgn.a(i7, i8, ", toGroup=", ", unsubscribe=", a);
        a.append(i9);
        a.append(", videoViews100p=");
        a.append(num);
        a.append(", videoViews25p=");
        sq.b(a, num2, ", videoViews3s=", num3, ", videoViews10s=");
        sq.b(a, num4, ", videoViews50p=", num5, ", videoViews75p=");
        sq.b(a, num6, ", videoViewsStart=", num7, ", prettyCardsClicks=");
        return oq.b(a, num8, ")");
    }

    public /* synthetic */ AdsPromotedPostReachDto(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i10, zcl zclVar) {
        this(i, i2, i3, i4, i5, i6, i7, i8, i9, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : num2, (i10 & 2048) != 0 ? null : num3, (i10 & 4096) != 0 ? null : num4, (i10 & 8192) != 0 ? null : num5, (i10 & 16384) != 0 ? null : num6, (32768 & i10) != 0 ? null : num7, (i10 & 65536) != 0 ? null : num8);
    }
}
