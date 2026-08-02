package com.vk.dto.newsfeed.entries;

import android.os.Parcel;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.common.Image;
import com.vk.dto.common.actions.Action;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.attachments.AdHideReason;
import com.vkontakte.android.attachments.AdSource;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dqa0;
import xsna.epx;
import xsna.fq;
import xsna.qoy;
import xsna.s3q0;
import xsna.urd0;
import xsna.wsx0;
import xsna.zcl;

/* compiled from: Html5Entry.kt */
/* loaded from: classes18.dex */
public final class Html5Entry extends NewsEntry implements DeprecatedStatisticInterface, b.h, dqa0, wsx0 {
    public static final Serializer.c<Html5Entry> CREATOR = new a();
    public final DeprecatedStatisticInterface.a A;
    public final String B;
    public final String C;
    public final ArrayList<AdHideReason> D;
    public final AdSource E;
    public final PixelStatsDelegate F;
    public final String G;
    public final String H;
    public final AdsChoices I;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final EntryHeader q;
    public final String r;
    public final String s;
    public final Image t;
    public final Image u;
    public final Action v;
    public final Html5App w;
    public final String x;
    public DeprecatedStatisticUrl y;
    public final NewsEntry.TrackData z;

    /* compiled from: Html5Entry.kt */
    public static final class Html5App implements Serializer.StreamParcelable {
        public static final Serializer.c<Html5App> CREATOR = new a();
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final float f;
        public final Image g;
        public final ArrayList<Html5Action> h;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Html5App> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Html5App a(Serializer serializer) {
                return new Html5App(serializer.H(), serializer.H(), serializer.m(), serializer.H(), serializer.s(), (Image) serializer.G(Image.class.getClassLoader()), serializer.j(Html5Action.CREATOR));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Html5App[i];
            }
        }

        public Html5App(String str, String str2, boolean z, String str3, float f, Image image, ArrayList<Html5Action> arrayList) {
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = str3;
            this.f = f;
            this.g = image;
            this.h = arrayList;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
            serializer.j0(this.e);
            serializer.P(this.f);
            serializer.i0(this.g);
            serializer.o0(this.h);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Html5App)) {
                return false;
            }
            Html5App html5App = (Html5App) obj;
            return epx.f(this.b, html5App.b) && epx.f(this.c, html5App.c) && this.d == html5App.d && epx.f(this.e, html5App.e) && Float.compare(this.f, html5App.f) == 0 && epx.f(this.g, html5App.g) && epx.f(this.h, html5App.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + fq.b(this.g, io.reactivex.rxjava3.subjects.b.a(this.f, urd0.a(qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Html5App(trackCode=");
            sb.append(this.b);
            sb.append(", launchButtonText=");
            sb.append(this.c);
            sb.append(", autolaunch=");
            sb.append(this.d);
            sb.append(", sourceUrl=");
            sb.append(this.e);
            sb.append(", viewportRatio=");
            sb.append(this.f);
            sb.append(", teaserPhoto=");
            sb.append(this.g);
            sb.append(", inappActions=");
            return j.b(')', sb, this.h);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Html5Entry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Html5Entry a(Serializer serializer) {
            int u = serializer.u();
            int u2 = serializer.u();
            int u3 = serializer.u();
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            String H4 = serializer.H();
            String H5 = serializer.H();
            EntryHeader entryHeader = (EntryHeader) serializer.G(EntryHeader.class.getClassLoader());
            String H6 = serializer.H();
            String H7 = serializer.H();
            Image image = (Image) serializer.G(Image.class.getClassLoader());
            Image image2 = (Image) serializer.G(Image.class.getClassLoader());
            Action action = (Action) serializer.G(Action.class.getClassLoader());
            Html5App html5App = (Html5App) serializer.G(Html5App.class.getClassLoader());
            String H8 = serializer.H();
            DeprecatedStatisticUrl deprecatedStatisticUrl = (DeprecatedStatisticUrl) serializer.G(DeprecatedStatisticUrl.class.getClassLoader());
            NewsEntry.TrackData trackData = (NewsEntry.TrackData) serializer.G(NewsEntry.TrackData.class.getClassLoader());
            DeprecatedStatisticInterface.a aVar = new DeprecatedStatisticInterface.a();
            aVar.d(serializer);
            s3q0 s3q0Var = s3q0.a;
            String H9 = serializer.H();
            String H10 = serializer.H();
            ArrayList j = serializer.j(AdHideReason.CREATOR);
            AdSource.a aVar2 = AdSource.Companion;
            String H11 = serializer.H();
            aVar2.getClass();
            AdSource a = AdSource.a.a(H11);
            Serializer.StreamParcelable G = serializer.G(PixelStatsDelegate.class.getClassLoader());
            if (G != null) {
                return new Html5Entry(u, u2, u3, H, H2, H3, H4, H5, entryHeader, H6, H7, image, image2, action, html5App, H8, deprecatedStatisticUrl, trackData, aVar, H9, H10, j, a, (PixelStatsDelegate) G, serializer.H(), serializer.H(), (AdsChoices) serializer.G(AdsChoices.class.getClassLoader()));
            }
            throw new IllegalArgumentException("Can't get value!");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Html5Entry[i];
        }
    }

    public /* synthetic */ Html5Entry(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, EntryHeader entryHeader, String str6, String str7, Image image, Image image2, Action action, Html5App html5App, String str8, DeprecatedStatisticUrl deprecatedStatisticUrl, NewsEntry.TrackData trackData, DeprecatedStatisticInterface.a aVar, String str9, String str10, ArrayList arrayList, AdSource adSource, PixelStatsDelegate pixelStatsDelegate, String str11, String str12, AdsChoices adsChoices, int i4, zcl zclVar) {
        this(i, i2, i3, str, str2, str3, str4, str5, entryHeader, str6, str7, image, image2, action, html5App, str8, (i4 & 65536) != 0 ? null : deprecatedStatisticUrl, trackData, (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? new DeprecatedStatisticInterface.a() : aVar, str9, str10, arrayList, adSource, (i4 & 8388608) != 0 ? new PixelStatsDelegate() : pixelStatsDelegate, (i4 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str11, (i4 & 33554432) != 0 ? null : str12, adsChoices);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final NewsEntry.TrackData Cb() {
        return this.z;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    public final String Eb() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.j);
        sb.append('_');
        sb.append(this.i);
        return sb.toString();
    }

    @Override // xsna.dqa0
    public final void F7(PixelStats pixelStats) {
        this.F.F7(pixelStats);
    }

    public final String Fb() {
        return this.x;
    }

    public final void Gb() {
        DeprecatedStatisticInterface.a aVar = this.A;
        Iterator it = aVar.b("load").iterator();
        while (it.hasNext()) {
            b.p((DeprecatedStatisticUrl) it.next());
        }
        Iterator it2 = aVar.b("viewability_measurable").iterator();
        while (it2.hasNext()) {
            b.p((DeprecatedStatisticUrl) it2.next());
        }
        Iterator it3 = aVar.b("render").iterator();
        while (it3.hasNext()) {
            b.p((DeprecatedStatisticUrl) it3.next());
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.i);
        serializer.S(this.j);
        serializer.S(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
        serializer.i0(this.q);
        serializer.j0(this.r);
        serializer.j0(this.s);
        serializer.i0(this.t);
        serializer.i0(this.u);
        serializer.i0(this.v);
        serializer.i0(this.w);
        serializer.j0(this.x);
        serializer.i0(this.y);
        serializer.i0(this.z);
        this.A.e(serializer);
        serializer.j0(this.B);
        serializer.j0(this.C);
        serializer.o0(this.D);
        AdSource adSource = this.E;
        serializer.j0(adSource != null ? adSource.h() : null);
        serializer.i0(this.F);
        serializer.j0(this.G);
        serializer.j0(this.H);
        serializer.i0(this.I);
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final List<DeprecatedStatisticUrl> R6(String str) {
        return this.A.b(str);
    }

    @Override // com.vkontakte.android.data.b.h
    public final DeprecatedStatisticUrl T6() {
        return this.y;
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final int Wa() {
        return this.A.hashCode();
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final int Y7(String str) {
        return this.A.c(str);
    }

    @Override // xsna.dqa0
    public final int b6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
        return this.F.b6(typeDto);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Html5Entry)) {
            return false;
        }
        Html5Entry html5Entry = (Html5Entry) obj;
        return this.i == html5Entry.i && this.j == html5Entry.j;
    }

    @Override // xsna.wsx0
    public final EntryHeader getHeader() {
        return this.q;
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final void h(DeprecatedStatisticUrl deprecatedStatisticUrl) {
        this.A.a(deprecatedStatisticUrl);
    }

    public final int hashCode() {
        return (this.i * 31) + this.j;
    }

    public final String toString() {
        return "Html5Entry(adsId1=" + this.i + ", adsId2=" + this.j + ", timeToLive=" + this.k + ", adsTitle=" + this.l + ", ageRestriction=" + this.m + ", title=" + this.n + ", description=" + this.o + ", disclaimer=" + this.p + ", header=" + this.q + ", linkUrlTarget=" + this.r + ", linkUrl=" + this.s + ", photoIcon=" + this.t + ", photoMain=" + this.u + ", action=" + this.v + ", html5App=" + this.w + ", data=" + this.x + ", dataImpression=" + this.y + ", trackData=" + this.z + ", statistics=" + this.A + ", advertiserInfoUrl=" + this.B + ", adMarker=" + this.C + ", hideReasons=" + this.D + ", adSource=" + this.E + ", pixelStatsDelegate=" + this.F + ", recommendationInfoUrl=" + this.G + ", adsUrl=" + this.H + ", adsChoices=" + this.I + ')';
    }

    @Override // xsna.dqa0
    public final List<PixelStats> u6(AdsItemBlockAdStatPixelDto.TypeDto typeDto) {
        return this.F.u6(typeDto);
    }

    @Override // com.vk.statistic.DeprecatedStatisticInterface
    public final void x4(String str) {
        this.A.a.remove(str);
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 29;
    }

    public Html5Entry(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, EntryHeader entryHeader, String str6, String str7, Image image, Image image2, Action action, Html5App html5App, String str8, DeprecatedStatisticUrl deprecatedStatisticUrl, NewsEntry.TrackData trackData, DeprecatedStatisticInterface.a aVar, String str9, String str10, ArrayList<AdHideReason> arrayList, AdSource adSource, PixelStatsDelegate pixelStatsDelegate, String str11, String str12, AdsChoices adsChoices) {
        super(trackData);
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.o = str4;
        this.p = str5;
        this.q = entryHeader;
        this.r = str6;
        this.s = str7;
        this.t = image;
        this.u = image2;
        this.v = action;
        this.w = html5App;
        this.x = str8;
        this.y = deprecatedStatisticUrl;
        this.z = trackData;
        this.A = aVar;
        this.B = str9;
        this.C = str10;
        this.D = arrayList;
        this.E = adSource;
        this.F = pixelStatsDelegate;
        this.G = str11;
        this.H = str12;
        this.I = adsChoices;
    }
}
