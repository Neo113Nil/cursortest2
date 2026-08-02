package com.vk.clips.sdk.shared.feed.model;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivities;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import defpackage.q0;
import java.util.ArrayList;
import xsna.asp;
import xsna.c9l;
import xsna.epx;
import xsna.hfz;
import xsna.ho8;
import xsna.iq;
import xsna.j0f;
import xsna.kih0;
import xsna.nlh0;
import xsna.oi5;
import xsna.qr;
import xsna.urd0;
import xsna.vzm;
import xsna.wih0;
import xsna.wp50;
import xsna.y0r;
import xsna.zrp;

/* compiled from: FeedItem.kt */
/* loaded from: classes17.dex */
public interface FeedItem extends hfz, c9l {

    /* compiled from: FeedItem.kt */
    public static abstract class Pagination implements FeedItem, j0f.a {

        /* compiled from: FeedItem.kt */
        public static final class Empty extends Pagination {
            public final EmptyType b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: FeedItem.kt */
            public static final class EmptyType {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ EmptyType[] $VALUES;
                public static final EmptyType COAUTHOR_INVITATIONS;
                public static final EmptyType DEFAULT;
                public static final EmptyType PLAYLIST;
                public static final EmptyType USER_SUBSCRIPTIONS;

                static {
                    EmptyType emptyType = new EmptyType("USER_SUBSCRIPTIONS", 0);
                    USER_SUBSCRIPTIONS = emptyType;
                    EmptyType emptyType2 = new EmptyType("PLAYLIST", 1);
                    PLAYLIST = emptyType2;
                    EmptyType emptyType3 = new EmptyType("COAUTHOR_INVITATIONS", 2);
                    COAUTHOR_INVITATIONS = emptyType3;
                    EmptyType emptyType4 = new EmptyType("DEFAULT", 3);
                    DEFAULT = emptyType4;
                    EmptyType[] emptyTypeArr = {emptyType, emptyType2, emptyType3, emptyType4};
                    $VALUES = emptyTypeArr;
                    $ENTRIES = new asp(emptyTypeArr);
                }

                public EmptyType() {
                    throw null;
                }

                public static EmptyType valueOf(String str) {
                    return (EmptyType) Enum.valueOf(EmptyType.class, str);
                }

                public static EmptyType[] values() {
                    return (EmptyType[]) $VALUES.clone();
                }
            }

            public Empty(EmptyType emptyType) {
                this.b = emptyType;
            }

            @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
            public final String F() {
                return "pagination_empty";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Empty) && this.b == ((Empty) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Empty(emptyType=" + this.b + ')';
            }
        }

        /* compiled from: FeedItem.kt */
        public static final class a extends Pagination {
            public final boolean b;
            public final String c;

            public a(boolean z) {
                this.b = z;
                this.c = "pagination_error:".concat(z ? ToolBar.FORWARD : "backward");
            }

            @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
            public final String F() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("Error(isForward="), this.b, ')');
            }
        }

        /* compiled from: FeedItem.kt */
        public static final class b extends Pagination implements vzm {
            public final boolean b;
            public final String c;

            public b(boolean z) {
                this.b = z;
                this.c = "pagination_loading:".concat(z ? ToolBar.FORWARD : "backward");
            }

            @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
            public final String F() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            @Override // xsna.vzm
            public final boolean n() {
                return this.b;
            }

            public final String toString() {
                return q0.a(new StringBuilder("Loading(isForward="), this.b, ')');
            }
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final boolean W3() {
            return this instanceof c;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
        public final String b1() {
            return F();
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(F().hashCode());
        }
    }

    /* compiled from: FeedItem.kt */
    public static final class a implements l, c {
        public final String b;
        public final String c;
        public final ClipFeedTab d;
        public final SdkClipVideoFile e;
        public final nlh0 f;
        public final kih0 g;
        public final oi5 h;
        public final wp50 i;

        public a(String str, String str2, ClipFeedTab clipFeedTab, SdkClipVideoFile sdkClipVideoFile, nlh0 nlh0Var, kih0 kih0Var, oi5 oi5Var, wp50 wp50Var) {
            this.b = str;
            this.c = str2;
            this.d = clipFeedTab;
            this.e = sdkClipVideoFile;
            this.f = nlh0Var;
            this.g = kih0Var;
            this.h = oi5Var;
            this.i = wp50Var;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final String F() {
            return d.a.a(this);
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.n
        public final y0r J4() {
            return null;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final nlh0 W() {
            return this.f;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final boolean W3() {
            return true;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
        public final String b1() {
            return F();
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final d e7(SdkVideoFile sdkVideoFile) {
            return new a(this.b, this.c, this.d, (SdkClipVideoFile) sdkVideoFile, this.f, this.g, this.h, this.i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d, xsna.hfz
        public final Integer getItemId() {
            return Integer.valueOf(F().hashCode());
        }

        public final int hashCode() {
            int hashCode = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31)) * 31)) * 31)) * 31;
            wp50 wp50Var = this.i;
            return hashCode + (wp50Var == null ? 0 : wp50Var.hashCode());
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final kih0 j() {
            return this.g;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.l, com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final SdkClipVideoFile k() {
            return this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ads(analyticRef=");
            sb.append(this.b);
            sb.append(", analyticContext=");
            sb.append(this.c);
            sb.append(", commonParams=");
            sb.append(this.d);
            sb.append(", video=");
            sb.append(this.e);
            sb.append(", videoFileController=");
            sb.append(this.f);
            sb.append(", autoPlay=");
            sb.append(this.g);
            sb.append(", autoPlayTrackingData=");
            sb.append(this.h);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.i, ')');
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(F().hashCode());
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final SdkVideoFile k() {
            return this.e;
        }
    }

    /* compiled from: FeedItem.kt */
    public static final class b implements FeedItem {
        public static final String b;

        static {
            new b();
            b = "ads_controls_item_key";
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final String F() {
            return b;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final boolean W3() {
            return this instanceof c;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
        public final String b1() {
            return F();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(b.hashCode());
        }

        public final int hashCode() {
            return 1996331667;
        }

        public final String toString() {
            return "AdsControlsItem";
        }
    }

    /* compiled from: FeedItem.kt */
    public interface c {
    }

    /* compiled from: FeedItem.kt */
    public interface d extends FeedItem {

        /* compiled from: FeedItem.kt */
        public static final class a {
            public static String a(d dVar) {
                return dVar.k().r1();
            }
        }

        nlh0 W();

        d e7(SdkVideoFile sdkVideoFile);

        @Override // xsna.hfz
        Integer getItemId();

        kih0 j();

        SdkVideoFile k();
    }

    /* compiled from: FeedItem.kt */
    public interface e extends FeedItem {

        /* compiled from: FeedItem.kt */
        public static final class a implements e {
            public final SdkExternalNpsCondition b;
            public final String c;

            public a(SdkExternalNpsCondition sdkExternalNpsCondition) {
                this.b = sdkExternalNpsCondition;
                this.c = sdkExternalNpsCondition.h();
            }

            @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
            public final String F() {
                return this.c;
            }

            @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
            public final boolean W3() {
                return this instanceof c;
            }

            @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
            public final String b1() {
                return F();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            @Override // xsna.hfz
            public final Number getItemId() {
                return Integer.valueOf(this.c.hashCode());
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ExternalNps(condition=" + this.b + ')';
            }
        }
    }

    /* compiled from: FeedItem.kt */
    public static final class f implements l {
        public final String b;
        public final String c;
        public final ClipFeedTab d;
        public final SdkClipVideoFile e;
        public final y0r f;
        public final nlh0 g;
        public final kih0 h;
        public final oi5 i;
        public final wp50 j;
        public final SdkClipActivities k;
        public final ClipsFeedDecorationPayload l;
        public final String m;

        public f(String str, String str2, ClipFeedTab clipFeedTab, SdkClipVideoFile sdkClipVideoFile, y0r y0rVar, nlh0 nlh0Var, kih0 kih0Var, oi5 oi5Var, wp50 wp50Var, SdkClipActivities sdkClipActivities, ClipsFeedDecorationPayload clipsFeedDecorationPayload) {
            this.b = str;
            this.c = str2;
            this.d = clipFeedTab;
            this.e = sdkClipVideoFile;
            this.f = y0rVar;
            this.g = nlh0Var;
            this.h = kih0Var;
            this.i = oi5Var;
            this.j = wp50Var;
            this.k = sdkClipActivities;
            this.l = clipsFeedDecorationPayload;
            StringBuilder sb = new StringBuilder();
            sb.append(sdkClipVideoFile.a1());
            sb.append(clipsFeedDecorationPayload.hashCode());
            sb.append(sdkClipVideoFile.X0() == null ? null : sdkClipVideoFile.r());
            this.m = sb.toString();
        }

        public static f a(f fVar, SdkClipVideoFile sdkClipVideoFile, y0r y0rVar, SdkClipActivities sdkClipActivities, int i) {
            String str = fVar.b;
            String str2 = fVar.c;
            ClipFeedTab clipFeedTab = fVar.d;
            if ((i & 8) != 0) {
                sdkClipVideoFile = fVar.e;
            }
            SdkClipVideoFile sdkClipVideoFile2 = sdkClipVideoFile;
            if ((i & 16) != 0) {
                y0rVar = fVar.f;
            }
            y0r y0rVar2 = y0rVar;
            nlh0 nlh0Var = fVar.g;
            kih0 kih0Var = fVar.h;
            oi5 oi5Var = fVar.i;
            wp50 wp50Var = fVar.j;
            SdkClipActivities sdkClipActivities2 = (i & 512) != 0 ? fVar.k : sdkClipActivities;
            ClipsFeedDecorationPayload clipsFeedDecorationPayload = fVar.l;
            fVar.getClass();
            return new f(str, str2, clipFeedTab, sdkClipVideoFile2, y0rVar2, nlh0Var, kih0Var, oi5Var, wp50Var, sdkClipActivities2, clipsFeedDecorationPayload);
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final String F() {
            return d.a.a(this);
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.n
        public final y0r J4() {
            return this.f;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final nlh0 W() {
            return this.g;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final boolean W3() {
            return this instanceof c;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
        public final String b1() {
            return this.m;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final d e7(SdkVideoFile sdkVideoFile) {
            return a(this, (SdkClipVideoFile) sdkVideoFile, null, null, 2039);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && epx.f(this.g, fVar.g) && epx.f(this.h, fVar.h) && epx.f(this.i, fVar.i) && epx.f(this.j, fVar.j) && epx.f(this.k, fVar.k) && epx.f(this.l, fVar.l);
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31;
            y0r y0rVar = this.f;
            int hashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((hashCode + (y0rVar == null ? 0 : y0rVar.hashCode())) * 31)) * 31)) * 31)) * 31;
            wp50 wp50Var = this.j;
            int hashCode3 = (hashCode2 + (wp50Var == null ? 0 : wp50Var.hashCode())) * 31;
            SdkClipActivities sdkClipActivities = this.k;
            return this.l.hashCode() + ((hashCode3 + (sdkClipActivities != null ? sdkClipActivities.hashCode() : 0)) * 31);
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final kih0 j() {
            return this.h;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.l, com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final SdkClipVideoFile k() {
            return this.e;
        }

        public final String toString() {
            return "Clip(analyticRef=" + this.b + ", analyticContext=" + this.c + ", commonParams=" + this.d + ", video=" + this.e + ", cacheInfo=" + this.f + ", videoFileController=" + this.g + ", autoPlay=" + this.h + ", autoPlayTrackingData=" + this.i + ", myTargetFacade=" + this.j + ", activities=" + this.k + ", decorationPayload=" + this.l + ')';
        }

        @Override // xsna.hfz
        public final Integer getItemId() {
            return Integer.valueOf(this.e.r1().hashCode());
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final SdkVideoFile k() {
            return this.e;
        }
    }

    /* compiled from: FeedItem.kt */
    public static final class g implements FeedItem {
        public static final String b;

        static {
            new g();
            b = "clip_controls_item_key";
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final String F() {
            return b;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final boolean W3() {
            return this instanceof c;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
        public final String b1() {
            return F();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(b.hashCode());
        }

        public final int hashCode() {
            return -1830790465;
        }

        public final String toString() {
            return "ClipControlsItem";
        }
    }

    /* compiled from: FeedItem.kt */
    public interface h extends FeedItem {

        /* compiled from: FeedItem.kt */
        public static final class a implements h {
            public final String b;
            public final ArrayList c;
            public final String d;
            public final String e;

            public a(String str, String str2, String str3, ArrayList arrayList) {
                this.b = str;
                this.c = arrayList;
                this.d = str2;
                this.e = str3;
            }

            @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
            public final String F() {
                String str = this.d;
                return str == null ? this.b : str;
            }

            @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
            public final boolean W3() {
                return this instanceof c;
            }

            @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
            public final String b1() {
                return F();
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
            }

            @Override // xsna.hfz
            public final Number getItemId() {
                return Integer.valueOf(F().hashCode());
            }

            public final int hashCode() {
                int a = qr.a(this.c, this.b.hashCode() * 31, 31);
                String str = this.d;
                int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.e;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Shops(id=");
                sb.append(this.b);
                sb.append(", items=");
                sb.append(this.c);
                sb.append(", trackCode=");
                sb.append(this.d);
                sb.append(", nextFrom=");
                return ho8.a(sb, this.e, ')');
            }
        }
    }

    /* compiled from: FeedItem.kt */
    public static final class i implements d {
        public final String b;
        public final String c;
        public final SdkVideoFile d;
        public final nlh0 e;
        public final kih0 f;
        public final oi5 g;
        public final boolean h;

        public i(String str, String str2, SdkVideoFile sdkVideoFile, nlh0 nlh0Var, kih0 kih0Var, oi5 oi5Var, boolean z) {
            this.b = str;
            this.c = str2;
            this.d = sdkVideoFile;
            this.e = nlh0Var;
            this.f = kih0Var;
            this.g = oi5Var;
            this.h = z;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final String F() {
            return k().r1();
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final nlh0 W() {
            return this.e;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final boolean W3() {
            return this instanceof c;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
        public final String b1() {
            return F();
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final d e7(SdkVideoFile sdkVideoFile) {
            return new i(this.b, this.c, sdkVideoFile, this.e, this.f, this.g, this.h);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!i.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            i iVar = (i) obj;
            if (!epx.f(this.b, iVar.b) || !epx.f(this.c, iVar.c)) {
                return false;
            }
            SdkVideoFile sdkVideoFile = this.d;
            return sdkVideoFile.z0() == iVar.d.z0() && sdkVideoFile.x0() == iVar.d.x0() && sdkVideoFile.q0() == iVar.d.q0() && epx.f(sdkVideoFile.r1(), iVar.d.r1()) && sdkVideoFile.c0() == iVar.d.c0();
        }

        @Override // xsna.hfz
        public final Integer getItemId() {
            return Integer.valueOf(F().hashCode());
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final kih0 j() {
            return this.f;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final SdkVideoFile k() {
            return this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Live(analyticRef=");
            sb.append(this.b);
            sb.append(", analyticContext=");
            sb.append(this.c);
            sb.append(", video=");
            sb.append(this.d);
            sb.append(", videoFileController=");
            sb.append(this.e);
            sb.append(", autoPlay=");
            sb.append(this.f);
            sb.append(", autoPlayTrackingData=");
            sb.append(this.g);
            sb.append(", isDislikeEnabled=");
            return q0.a(sb, this.h, ')');
        }
    }

    /* compiled from: FeedItem.kt */
    public static final class j implements FeedItem, c {
        public final String b;
        public final ArrayList c;
        public final ImageUrl d;
        public final wih0.b.a e;
        public final SdkActionLink f;
        public final String g;
        public final String h;
        public final wp50 i;

        public j(ImageUrl imageUrl, SdkActionLink sdkActionLink, String str, String str2, String str3, ArrayList arrayList, wp50 wp50Var, wih0.b.a aVar) {
            this.b = str;
            this.c = arrayList;
            this.d = imageUrl;
            this.e = aVar;
            this.f = sdkActionLink;
            this.g = str2;
            this.h = str3;
            this.i = wp50Var;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final String F() {
            String str = this.h;
            return str == null ? this.b : str;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final boolean W3() {
            return true;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
        public final String b1() {
            return F();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.b, jVar.b) && this.c.equals(jVar.c) && epx.f(this.d, jVar.d) && this.e.equals(jVar.e) && epx.f(this.f, jVar.f) && epx.f(this.g, jVar.g) && epx.f(this.h, jVar.h) && epx.f(this.i, jVar.i);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(F().hashCode());
        }

        public final int hashCode() {
            int a = qr.a(this.c, this.b.hashCode() * 31, 31);
            ImageUrl imageUrl = this.d;
            int hashCode = (this.e.hashCode() + ((a + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31)) * 31;
            SdkActionLink sdkActionLink = this.f;
            int a2 = urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.g);
            String str = this.h;
            int hashCode2 = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            wp50 wp50Var = this.i;
            return hashCode2 + (wp50Var != null ? wp50Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarketAds(id=");
            sb.append(this.b);
            sb.append(", cards=");
            sb.append(this.c);
            sb.append(", image=");
            sb.append(this.d);
            sb.append(", adInfo=");
            sb.append(this.e);
            sb.append(", actionLink=");
            sb.append(this.f);
            sb.append(", description=");
            sb.append(this.g);
            sb.append(", trackCode=");
            sb.append(this.h);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.i, ')');
        }
    }

    /* compiled from: FeedItem.kt */
    public static final class k implements n {
        public final String b;
        public final String c;
        public final ClipFeedTab d;
        public final SdkClipVideoFile e;
        public final y0r f;
        public final nlh0 g;
        public final kih0 h;
        public final oi5 i;

        public k(String str, String str2, ClipFeedTab clipFeedTab, SdkClipVideoFile sdkClipVideoFile, y0r y0rVar, nlh0 nlh0Var, kih0 kih0Var, oi5 oi5Var) {
            this.b = str;
            this.c = str2;
            this.d = clipFeedTab;
            this.e = sdkClipVideoFile;
            this.f = y0rVar;
            this.g = nlh0Var;
            this.h = kih0Var;
            this.i = oi5Var;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final String F() {
            return d.a.a(this);
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.n
        public final y0r J4() {
            return this.f;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final nlh0 W() {
            return this.g;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final boolean W3() {
            return this instanceof c;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
        public final String b1() {
            return F();
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final d e7(SdkVideoFile sdkVideoFile) {
            return new k(this.b, this.c, this.d, (SdkClipVideoFile) sdkVideoFile, this.f, this.g, this.h, this.i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && epx.f(this.c, kVar.c) && epx.f(this.d, kVar.d) && epx.f(this.e, kVar.e) && epx.f(this.f, kVar.f) && epx.f(this.g, kVar.g) && epx.f(this.h, kVar.h) && epx.f(this.i, kVar.i);
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d, xsna.hfz
        public final Integer getItemId() {
            return Integer.valueOf(F().hashCode());
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31;
            y0r y0rVar = this.f;
            return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((hashCode + (y0rVar == null ? 0 : y0rVar.hashCode())) * 31)) * 31)) * 31);
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final kih0 j() {
            return this.h;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        public final SdkVideoFile k() {
            return this.e;
        }

        public final String toString() {
            return "MusicTemplate(analyticRef=" + this.b + ", analyticContext=" + this.c + ", commonParams=" + this.d + ", video=" + this.e + ", cacheInfo=" + this.f + ", videoFileController=" + this.g + ", autoPlay=" + this.h + ", autoPlayTrackingData=" + this.i + ')';
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(F().hashCode());
        }
    }

    /* compiled from: FeedItem.kt */
    public interface l extends n {
        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem.d
        SdkClipVideoFile k();
    }

    /* compiled from: FeedItem.kt */
    public static final class m implements FeedItem, c {
        public final String b;
        public final ImageUrl c;
        public final wih0.d.a d;
        public final SdkActionLink e;
        public final String f;
        public final String g;
        public final wp50 h;

        public m(ImageUrl imageUrl, SdkActionLink sdkActionLink, String str, String str2, String str3, wp50 wp50Var, wih0.d.a aVar) {
            this.b = str;
            this.c = imageUrl;
            this.d = aVar;
            this.e = sdkActionLink;
            this.f = str2;
            this.g = str3;
            this.h = wp50Var;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final String F() {
            String str = this.g;
            return str == null ? this.b : str;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem
        public final boolean W3() {
            return true;
        }

        @Override // com.vk.clips.sdk.shared.feed.model.FeedItem, xsna.c9l
        public final String b1() {
            return F();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c) && epx.f(this.d, mVar.d) && epx.f(this.e, mVar.e) && epx.f(this.f, mVar.f) && epx.f(this.g, mVar.g) && epx.f(this.h, mVar.h);
        }

        @Override // xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(F().hashCode());
        }

        public final int hashCode() {
            int hashCode = (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31;
            SdkActionLink sdkActionLink = this.e;
            int a = urd0.a((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.f);
            String str = this.g;
            int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
            wp50 wp50Var = this.h;
            return hashCode2 + (wp50Var != null ? wp50Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StaticAds(id=");
            sb.append(this.b);
            sb.append(", image=");
            sb.append(this.c);
            sb.append(", adInfo=");
            sb.append(this.d);
            sb.append(", actionLink=");
            sb.append(this.e);
            sb.append(", description=");
            sb.append(this.f);
            sb.append(", trackCode=");
            sb.append(this.g);
            sb.append(", myTargetFacade=");
            return iq.c(sb, this.h, ')');
        }
    }

    /* compiled from: FeedItem.kt */
    public interface n extends d {
        y0r J4();
    }

    String F();

    boolean W3();

    @Override // xsna.c9l
    String b1();
}
