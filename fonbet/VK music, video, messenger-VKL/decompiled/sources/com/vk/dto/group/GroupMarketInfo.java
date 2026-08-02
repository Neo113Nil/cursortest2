package com.vk.dto.group;

import com.ironsource.C4217a2;
import com.ironsource.C4572u;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Price;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.aay;
import xsna.asp;
import xsna.epx;
import xsna.f370;
import xsna.ms9;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GroupMarketInfo.kt */
/* loaded from: classes18.dex */
public final class GroupMarketInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupMarketInfo> CREATOR = new d();
    public static final c j = new c();
    public final Integer b;
    public final Price c;
    public final Integer d;
    public final String e;
    public final String f;
    public final MarketAvitoBadge g;
    public final String h;
    public final CommunityTrustMarks i;

    /* compiled from: GroupMarketInfo.kt */
    public static final class CommunityTrustMarks extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<CommunityTrustMarks> CREATOR = new a();
        public final CommunityTrustMark b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final String g;
        public final String h;
        public final String i;
        public final CommunityTrustMark j;
        public final CommunityTrustMark k;
        public final CommunityTrustMark l;
        public final CommunityTrustMark m;
        public final CommunityTrustMark n;
        public final CommunityTrustMark o;
        public final CommunityTrustMark p;
        public final CommunityTrustMark q;
        public final CommunityTrustMark r;
        public final CommunityTrustMark s;
        public final CommunityTrustMark t;
        public final CommunityTrustMark u;
        public final CommunityTrustMark v;
        public final CommunityTrustMark w;
        public final CommunityTrustMark x;

        /* compiled from: GroupMarketInfo.kt */
        public static final class CommunityTrustMark extends Serializer.StreamParcelableAdapter {
            public static final Serializer.c<CommunityTrustMark> CREATOR = new b();
            public final Code b;
            public final String c;
            public final String d;
            public final String e;
            public List<? extends ExtendedUserProfile.Link> f;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: GroupMarketInfo.kt */
            public static final class Code {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Code[] $VALUES;
                public static final a Companion;
                public static final Code DATE;
                public static final Code DELIVERY_FREE;
                public static final Code DELIVERY_INFO;
                public static final Code DELIVERY_SELF;
                public static final Code DELIVERY_TEXT;
                public static final Code DOCS;
                public static final Code FRIENDS;
                public static final Code LINKS;
                public static final Code NONE;
                public static final Code OZON;
                public static final Code PAYMENT_TEXT;
                public static final Code PAYMENT_VKPAY;
                public static final Code PHONE;
                public static final Code POPULAR;
                public static final Code REFUND;
                public static final Code YCLIENTS;
                private final String value;

                /* compiled from: GroupMarketInfo.kt */
                public static final class a {
                    public static Code a(String str) {
                        Object obj;
                        Iterator<E> it = Code.h().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (epx.f(((Code) obj).i(), str)) {
                                break;
                            }
                        }
                        Code code = (Code) obj;
                        return code == null ? Code.NONE : code;
                    }
                }

                static {
                    Code code = new Code("NONE", 0, "none");
                    NONE = code;
                    Code code2 = new Code("DOCS", 1, "docs");
                    DOCS = code2;
                    Code code3 = new Code("POPULAR", 2, "popular");
                    POPULAR = code3;
                    Code code4 = new Code(Privacy.FRIENDS, 3, "friends");
                    FRIENDS = code4;
                    Code code5 = new Code("DATE", 4, "date");
                    DATE = code5;
                    Code code6 = new Code("YCLIENTS", 5, "y_clients");
                    YCLIENTS = code6;
                    Code code7 = new Code("OZON", 6, "ozon");
                    OZON = code7;
                    Code code8 = new Code("DELIVERY_TEXT", 7, "delivery_text");
                    DELIVERY_TEXT = code8;
                    Code code9 = new Code("DELIVERY_FREE", 8, "delivery_free");
                    DELIVERY_FREE = code9;
                    Code code10 = new Code("DELIVERY_INFO", 9, "delivery_info");
                    DELIVERY_INFO = code10;
                    Code code11 = new Code("DELIVERY_SELF", 10, "delivery_self");
                    DELIVERY_SELF = code11;
                    Code code12 = new Code("PAYMENT_TEXT", 11, "payment_text");
                    PAYMENT_TEXT = code12;
                    Code code13 = new Code("PAYMENT_VKPAY", 12, "payment_vkpay");
                    PAYMENT_VKPAY = code13;
                    Code code14 = new Code("REFUND", 13, "refund");
                    REFUND = code14;
                    Code code15 = new Code("PHONE", 14, "phone");
                    PHONE = code15;
                    Code code16 = new Code("LINKS", 15, "links");
                    LINKS = code16;
                    Code[] codeArr = {code, code2, code3, code4, code5, code6, code7, code8, code9, code10, code11, code12, code13, code14, code15, code16};
                    $VALUES = codeArr;
                    $ENTRIES = new asp(codeArr);
                    Companion = new a();
                }

                public Code(String str, int i, String str2) {
                    this.value = str2;
                }

                public static zrp<Code> h() {
                    return $ENTRIES;
                }

                public static Code valueOf(String str) {
                    return (Code) Enum.valueOf(Code.class, str);
                }

                public static Code[] values() {
                    return (Code[]) $VALUES.clone();
                }

                public final String i() {
                    return this.value;
                }
            }

            /* compiled from: GroupMarketInfo.kt */
            public static final class a {
                public static CommunityTrustMark a(JSONObject jSONObject) {
                    Code.Companion.getClass();
                    return new CommunityTrustMark(Code.a.a(jSONObject.getString("code")), jSONObject.optString("title", ""), jSONObject.optString("text", ""), jSONObject.optString(CampaignEx.JSON_KEY_DESC, ""), null, 16, null);
                }
            }

            /* compiled from: Serializer.kt */
            public static final class b extends Serializer.c<CommunityTrustMark> {
                @Override // com.vk.core.serialize.Serializer.c
                public final CommunityTrustMark a(Serializer serializer) {
                    return new CommunityTrustMark((Code) serializer.C(), serializer.H(), serializer.H(), serializer.H(), null, 16, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CommunityTrustMark[i];
                }
            }

            public /* synthetic */ CommunityTrustMark(Code code, String str, String str2, String str3, List list, int i, zcl zclVar) {
                this(code, str, str2, str3, (i & 16) != 0 ? null : list);
            }

            @Override // com.vk.core.serialize.Serializer.StreamParcelable
            public final void O7(Serializer serializer) {
                serializer.g0(this.b);
                serializer.j0(this.c);
                serializer.j0(this.d);
                serializer.j0(this.e);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CommunityTrustMark)) {
                    return false;
                }
                CommunityTrustMark communityTrustMark = (CommunityTrustMark) obj;
                return this.b == communityTrustMark.b && epx.f(this.c, communityTrustMark.c) && epx.f(this.d, communityTrustMark.d) && epx.f(this.e, communityTrustMark.e) && epx.f(this.f, communityTrustMark.f);
            }

            public final int hashCode() {
                int a2 = urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
                String str = this.e;
                int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
                List<? extends ExtendedUserProfile.Link> list = this.f;
                return hashCode + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CommunityTrustMark(code=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", text=");
                sb.append(this.d);
                sb.append(", description=");
                sb.append(this.e);
                sb.append(", linkItems=");
                return ms9.a(')', sb, this.f);
            }

            public CommunityTrustMark(Code code, String str, String str2, String str3, List<? extends ExtendedUserProfile.Link> list) {
                this.b = code;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = list;
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<CommunityTrustMarks> {
            @Override // com.vk.core.serialize.Serializer.c
            public final CommunityTrustMarks a(Serializer serializer) {
                return new CommunityTrustMarks((CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.H(), serializer.H(), serializer.H(), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()), (CommunityTrustMark) serializer.G(CommunityTrustMark.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommunityTrustMarks[i];
            }
        }

        public CommunityTrustMarks(CommunityTrustMark communityTrustMark, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, CommunityTrustMark communityTrustMark2, CommunityTrustMark communityTrustMark3, CommunityTrustMark communityTrustMark4, CommunityTrustMark communityTrustMark5, CommunityTrustMark communityTrustMark6, CommunityTrustMark communityTrustMark7, CommunityTrustMark communityTrustMark8, CommunityTrustMark communityTrustMark9, CommunityTrustMark communityTrustMark10, CommunityTrustMark communityTrustMark11, CommunityTrustMark communityTrustMark12, CommunityTrustMark communityTrustMark13, CommunityTrustMark communityTrustMark14, CommunityTrustMark communityTrustMark15, CommunityTrustMark communityTrustMark16) {
            this.b = communityTrustMark;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = str;
            this.h = str2;
            this.i = str3;
            this.j = communityTrustMark2;
            this.k = communityTrustMark3;
            this.l = communityTrustMark4;
            this.m = communityTrustMark5;
            this.n = communityTrustMark6;
            this.o = communityTrustMark7;
            this.p = communityTrustMark8;
            this.q = communityTrustMark9;
            this.r = communityTrustMark10;
            this.s = communityTrustMark11;
            this.t = communityTrustMark12;
            this.u = communityTrustMark13;
            this.v = communityTrustMark14;
            this.w = communityTrustMark15;
            this.x = communityTrustMark16;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.L(this.c ? (byte) 1 : (byte) 0);
            serializer.L(this.d ? (byte) 1 : (byte) 0);
            serializer.L(this.e ? (byte) 1 : (byte) 0);
            serializer.L(this.f ? (byte) 1 : (byte) 0);
            serializer.j0(this.g);
            serializer.j0(this.h);
            serializer.j0(this.i);
            serializer.i0(this.j);
            serializer.i0(this.k);
            serializer.i0(this.l);
            serializer.i0(this.m);
            serializer.i0(this.n);
            serializer.i0(this.o);
            serializer.i0(this.p);
            serializer.i0(this.q);
            serializer.i0(this.r);
            serializer.i0(this.s);
            serializer.i0(this.t);
            serializer.i0(this.u);
            serializer.i0(this.v);
            serializer.i0(this.w);
            serializer.i0(this.x);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommunityTrustMarks)) {
                return false;
            }
            CommunityTrustMarks communityTrustMarks = (CommunityTrustMarks) obj;
            return epx.f(this.b, communityTrustMarks.b) && this.c == communityTrustMarks.c && this.d == communityTrustMarks.d && this.e == communityTrustMarks.e && this.f == communityTrustMarks.f && epx.f(this.g, communityTrustMarks.g) && epx.f(this.h, communityTrustMarks.h) && epx.f(this.i, communityTrustMarks.i) && epx.f(this.j, communityTrustMarks.j) && epx.f(this.k, communityTrustMarks.k) && epx.f(this.l, communityTrustMarks.l) && epx.f(this.m, communityTrustMarks.m) && epx.f(this.n, communityTrustMarks.n) && epx.f(this.o, communityTrustMarks.o) && epx.f(this.p, communityTrustMarks.p) && epx.f(this.q, communityTrustMarks.q) && epx.f(this.r, communityTrustMarks.r) && epx.f(this.s, communityTrustMarks.s) && epx.f(this.t, communityTrustMarks.t) && epx.f(this.u, communityTrustMarks.u) && epx.f(this.v, communityTrustMarks.v) && epx.f(this.w, communityTrustMarks.w) && epx.f(this.x, communityTrustMarks.x);
        }

        public final int hashCode() {
            int a2 = urd0.a(urd0.a(urd0.a(qoy.b(qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            CommunityTrustMark communityTrustMark = this.j;
            int hashCode = (a2 + (communityTrustMark == null ? 0 : communityTrustMark.hashCode())) * 31;
            CommunityTrustMark communityTrustMark2 = this.k;
            int hashCode2 = (hashCode + (communityTrustMark2 == null ? 0 : communityTrustMark2.hashCode())) * 31;
            CommunityTrustMark communityTrustMark3 = this.l;
            int hashCode3 = (hashCode2 + (communityTrustMark3 == null ? 0 : communityTrustMark3.hashCode())) * 31;
            CommunityTrustMark communityTrustMark4 = this.m;
            int hashCode4 = (hashCode3 + (communityTrustMark4 == null ? 0 : communityTrustMark4.hashCode())) * 31;
            CommunityTrustMark communityTrustMark5 = this.n;
            int hashCode5 = (hashCode4 + (communityTrustMark5 == null ? 0 : communityTrustMark5.hashCode())) * 31;
            CommunityTrustMark communityTrustMark6 = this.o;
            int hashCode6 = (hashCode5 + (communityTrustMark6 == null ? 0 : communityTrustMark6.hashCode())) * 31;
            CommunityTrustMark communityTrustMark7 = this.p;
            int hashCode7 = (hashCode6 + (communityTrustMark7 == null ? 0 : communityTrustMark7.hashCode())) * 31;
            CommunityTrustMark communityTrustMark8 = this.q;
            int hashCode8 = (hashCode7 + (communityTrustMark8 == null ? 0 : communityTrustMark8.hashCode())) * 31;
            CommunityTrustMark communityTrustMark9 = this.r;
            int hashCode9 = (hashCode8 + (communityTrustMark9 == null ? 0 : communityTrustMark9.hashCode())) * 31;
            CommunityTrustMark communityTrustMark10 = this.s;
            int hashCode10 = (hashCode9 + (communityTrustMark10 == null ? 0 : communityTrustMark10.hashCode())) * 31;
            CommunityTrustMark communityTrustMark11 = this.t;
            int hashCode11 = (hashCode10 + (communityTrustMark11 == null ? 0 : communityTrustMark11.hashCode())) * 31;
            CommunityTrustMark communityTrustMark12 = this.u;
            int hashCode12 = (hashCode11 + (communityTrustMark12 == null ? 0 : communityTrustMark12.hashCode())) * 31;
            CommunityTrustMark communityTrustMark13 = this.v;
            int hashCode13 = (hashCode12 + (communityTrustMark13 == null ? 0 : communityTrustMark13.hashCode())) * 31;
            CommunityTrustMark communityTrustMark14 = this.w;
            int hashCode14 = (hashCode13 + (communityTrustMark14 == null ? 0 : communityTrustMark14.hashCode())) * 31;
            CommunityTrustMark communityTrustMark15 = this.x;
            return hashCode14 + (communityTrustMark15 != null ? communityTrustMark15.hashCode() : 0);
        }

        public final String toString() {
            return "CommunityTrustMarks(main=" + this.b + ", hasYcButton=" + this.c + ", hasGoodButton=" + this.d + ", hasServiceButton=" + this.e + ", hasAddresses=" + this.f + ", deliveryButtonUrl=" + this.g + ", paymentButtonUrl=" + this.h + ", refundButtonUrl=" + this.i + ", docs=" + this.j + ", popular=" + this.k + ", friends=" + this.l + ", date=" + this.m + ", yClients=" + this.n + ", ozon=" + this.o + ", deliveryText=" + this.p + ", deliveryFree=" + this.q + ", deliveryInfo=" + this.r + ", deliverySelf=" + this.s + ", paymentText=" + this.t + ", paymentVkpay=" + this.u + ", refund=" + this.v + ", phone=" + this.w + ", links=" + this.x + ')';
        }
    }

    /* compiled from: GroupMarketInfo.kt */
    public static final class MarketAvitoBadge extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<MarketAvitoBadge> CREATOR = new a();
        public final Image b;
        public final String c;
        public final Status d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GroupMarketInfo.kt */
        public static final class Status {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Status[] $VALUES;
            public static final Status ACTIVE;
            public static final a Companion;
            public static final Status INACTIVE;
            public static final Status PENDING;
            private final int value;

            /* compiled from: GroupMarketInfo.kt */
            public static final class a {
            }

            static {
                Status status = new Status(SignalingProtocol.STATE_ACTIVE, 0, 0);
                ACTIVE = status;
                Status status2 = new Status("INACTIVE", 1, 1);
                INACTIVE = status2;
                Status status3 = new Status("PENDING", 2, 2);
                PENDING = status3;
                Status[] statusArr = {status, status2, status3};
                $VALUES = statusArr;
                $ENTRIES = new asp(statusArr);
                Companion = new a();
            }

            public Status(String str, int i, int i2) {
                this.value = i2;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) $VALUES.clone();
            }

            public final int h() {
                return this.value;
            }
        }

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<MarketAvitoBadge> {
            @Override // com.vk.core.serialize.Serializer.c
            public final MarketAvitoBadge a(Serializer serializer) {
                return new MarketAvitoBadge((Image) serializer.G(Image.class.getClassLoader()), serializer.H(), (Status) serializer.C());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketAvitoBadge[i];
            }
        }

        public MarketAvitoBadge(Image image, String str, Status status) {
            this.b = image;
            this.c = str;
            this.d = status;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.i0(this.b);
            serializer.j0(this.c);
            serializer.g0(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketAvitoBadge)) {
                return false;
            }
            MarketAvitoBadge marketAvitoBadge = (MarketAvitoBadge) obj;
            return epx.f(this.b, marketAvitoBadge.b) && epx.f(this.c, marketAvitoBadge.c) && this.d == marketAvitoBadge.d;
        }

        public final int hashCode() {
            Image image = this.b;
            int a2 = urd0.a((image == null ? 0 : image.hashCode()) * 31, 31, this.c);
            Status status = this.d;
            return a2 + (status != null ? status.hashCode() : 0);
        }

        public final String toString() {
            return "MarketAvitoBadge(logo=" + this.b + ", title=" + this.c + ", status=" + this.d + ')';
        }
    }

    /* compiled from: GroupMarketInfo.kt */
    public static final class a {
    }

    /* compiled from: GroupMarketInfo.kt */
    public static abstract class b {
        public final String a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        /* compiled from: GroupMarketInfo.kt */
        public static final class a extends b {
            public static final a f = new a(false, false, false, false, C4217a2.e);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -863202509;
            }

            public final String toString() {
                return "Disabled";
            }
        }

        /* compiled from: GroupMarketInfo.kt */
        /* renamed from: com.vk.dto.group.GroupMarketInfo$b$b, reason: collision with other inner class name */
        public static final class C0909b extends b {
            public static final C0909b f = new C0909b(true, true, true, true, "enabled");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0909b);
            }

            public final int hashCode() {
                return -676347990;
            }

            public final String toString() {
                return PeerConnectionFactory.TRIAL_ENABLED;
            }
        }

        /* compiled from: GroupMarketInfo.kt */
        public static final class c extends b {
            public static final c f = new c(true, false, false, false, "group_enabled");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -527724452;
            }

            public final String toString() {
                return "OnlyGroup";
            }
        }

        /* compiled from: GroupMarketInfo.kt */
        public static final class d extends b {
            public static final d f = new d(true, false, true, false, "ozon_enabled");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1996088381;
            }

            public final String toString() {
                return "OnlyOzonCard";
            }
        }

        /* compiled from: GroupMarketInfo.kt */
        public static final class e extends b {
            public static final e f = new e(true, false, false, true, "integration_enabled");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1427622111;
            }

            public final String toString() {
                return "OnlyPartnerIntegrationCard";
            }
        }

        /* compiled from: GroupMarketInfo.kt */
        public static final class f extends b {
            public static final f f = new f(false, true, false, false, "product_card_enabled");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1637569348;
            }

            public final String toString() {
                return "OnlyProductCard";
            }
        }

        public b(boolean z, boolean z2, boolean z3, boolean z4, String str) {
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class c extends aay<GroupMarketInfo> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.aay
        public final GroupMarketInfo a(JSONObject jSONObject) {
            Price price;
            MarketAvitoBadge marketAvitoBadge;
            CommunityTrustMarks communityTrustMarks;
            JSONObject optJSONObject = jSONObject.optJSONObject(InAppPurchaseMetaData.KEY_CURRENCY);
            Integer x = f370.x(jSONObject, "contact_id");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("min_order_price");
            String str = null;
            Object[] objArr = 0;
            if (optJSONObject2 != null) {
                Serializer.c<Price> cVar = Price.CREATOR;
                price = Price.a.a(optJSONObject2);
            } else {
                price = null;
            }
            Integer valueOf = optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("id")) : null;
            String optString = optJSONObject != null ? optJSONObject.optString("name") : null;
            String optString2 = jSONObject.optString("currency_text");
            JSONObject optJSONObject3 = jSONObject.optJSONObject("avito_badge");
            if (optJSONObject3 != null) {
                Serializer.c<MarketAvitoBadge> cVar2 = MarketAvitoBadge.CREATOR;
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("icon");
                ImageSize imageSize = optJSONObject4 != null ? new ImageSize(optJSONObject4, str, 2, (zcl) (objArr == true ? 1 : 0)) : null;
                Image image = imageSize != null ? new Image((List<ImageSize>) Collections.singletonList(imageSize)) : null;
                String optString3 = optJSONObject3.optString("title", "");
                MarketAvitoBadge.Status.Companion.getClass();
                Integer x2 = f370.x(optJSONObject3, "link_status");
                marketAvitoBadge = new MarketAvitoBadge(image, optString3, (x2 != null && x2.intValue() == 0) ? MarketAvitoBadge.Status.ACTIVE : (x2 != null && x2.intValue() == 1) ? MarketAvitoBadge.Status.INACTIVE : (x2 != null && x2.intValue() == 2) ? MarketAvitoBadge.Status.PENDING : null);
            } else {
                marketAvitoBadge = null;
            }
            String optString4 = jSONObject.optString("integration_type");
            JSONObject optJSONObject5 = jSONObject.optJSONObject("trust_marks");
            if (optJSONObject5 != null) {
                Serializer.c<CommunityTrustMarks> cVar3 = CommunityTrustMarks.CREATOR;
                JSONObject jSONObject2 = optJSONObject5.getJSONObject("action_buttons");
                JSONObject jSONObject3 = optJSONObject5.getJSONObject("marks");
                JSONObject jSONObject4 = optJSONObject5.getJSONObject("admin_buttons");
                JSONObject optJSONObject6 = jSONObject3.optJSONObject("addresses");
                boolean optBoolean = optJSONObject6 != null ? optJSONObject6.optBoolean("is_enabled", false) : false;
                boolean z = (optJSONObject6 != null ? optJSONObject6.optJSONObject("main_address") : null) != null;
                Serializer.c<CommunityTrustMarks.CommunityTrustMark> cVar4 = CommunityTrustMarks.CommunityTrustMark.CREATOR;
                CommunityTrustMarks.CommunityTrustMark a = CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject5.getJSONObject("main_mark"));
                boolean optBoolean2 = jSONObject2.optBoolean("y_clients", false);
                boolean optBoolean3 = jSONObject2.optBoolean("goods", false);
                boolean optBoolean4 = jSONObject2.optBoolean("services", false);
                boolean z2 = optBoolean && z;
                String optString5 = jSONObject4.optString(C4572u.g);
                String optString6 = jSONObject4.optString("payment");
                String optString7 = jSONObject4.optString("refund");
                JSONObject optJSONObject7 = jSONObject3.optJSONObject("docs");
                CommunityTrustMarks.CommunityTrustMark a2 = optJSONObject7 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject7) : null;
                JSONObject optJSONObject8 = jSONObject3.optJSONObject("popular");
                CommunityTrustMarks.CommunityTrustMark a3 = optJSONObject8 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject8) : null;
                JSONObject optJSONObject9 = jSONObject3.optJSONObject("friends");
                CommunityTrustMarks.CommunityTrustMark a4 = optJSONObject9 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject9) : null;
                JSONObject optJSONObject10 = jSONObject3.optJSONObject("date");
                CommunityTrustMarks.CommunityTrustMark a5 = optJSONObject10 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject10) : null;
                JSONObject optJSONObject11 = jSONObject3.optJSONObject("y_clients");
                CommunityTrustMarks.CommunityTrustMark a6 = optJSONObject11 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject11) : null;
                JSONObject optJSONObject12 = jSONObject3.optJSONObject("ozon");
                CommunityTrustMarks.CommunityTrustMark a7 = optJSONObject12 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject12) : null;
                JSONObject optJSONObject13 = jSONObject3.optJSONObject("delivery_text");
                CommunityTrustMarks.CommunityTrustMark a8 = optJSONObject13 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject13) : null;
                JSONObject optJSONObject14 = jSONObject3.optJSONObject("delivery_free");
                CommunityTrustMarks.CommunityTrustMark a9 = optJSONObject14 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject14) : null;
                JSONObject optJSONObject15 = jSONObject3.optJSONObject("delivery_info");
                CommunityTrustMarks.CommunityTrustMark a10 = optJSONObject15 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject15) : null;
                JSONObject optJSONObject16 = jSONObject3.optJSONObject("delivery_self");
                CommunityTrustMarks.CommunityTrustMark a11 = optJSONObject16 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject16) : null;
                JSONObject optJSONObject17 = jSONObject3.optJSONObject("payment_text");
                CommunityTrustMarks.CommunityTrustMark a12 = optJSONObject17 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject17) : null;
                JSONObject optJSONObject18 = jSONObject3.optJSONObject("payment_vkpay");
                CommunityTrustMarks.CommunityTrustMark a13 = optJSONObject18 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject18) : null;
                JSONObject optJSONObject19 = jSONObject3.optJSONObject("refund");
                CommunityTrustMarks.CommunityTrustMark a14 = optJSONObject19 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject19) : null;
                JSONObject optJSONObject20 = optJSONObject5.optJSONObject("phone");
                CommunityTrustMarks.CommunityTrustMark a15 = optJSONObject20 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject20) : null;
                JSONObject optJSONObject21 = optJSONObject5.optJSONObject("links");
                communityTrustMarks = new CommunityTrustMarks(a, optBoolean2, optBoolean3, optBoolean4, z2, optString5, optString6, optString7, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, optJSONObject21 != null ? CommunityTrustMarks.CommunityTrustMark.a.a(optJSONObject21) : null);
            } else {
                communityTrustMarks = null;
            }
            return new GroupMarketInfo(x, price, valueOf, optString, optString2, marketAvitoBadge, optString4, communityTrustMarks);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class d extends Serializer.c<GroupMarketInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupMarketInfo a(Serializer serializer) {
            return new GroupMarketInfo(serializer.v(), (Price) serializer.G(Price.class.getClassLoader()), Integer.valueOf(serializer.u()), serializer.H(), serializer.H(), (MarketAvitoBadge) serializer.G(MarketAvitoBadge.class.getClassLoader()), serializer.H(), (CommunityTrustMarks) serializer.G(CommunityTrustMarks.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupMarketInfo[i];
        }
    }

    public GroupMarketInfo(Integer num, Price price, Integer num2, String str, String str2, MarketAvitoBadge marketAvitoBadge, String str3, CommunityTrustMarks communityTrustMarks) {
        this.b = num;
        this.c = price;
        this.d = num2;
        this.e = str;
        this.f = str2;
        this.g = marketAvitoBadge;
        this.h = str3;
        this.i = communityTrustMarks;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.i0(this.c);
        Integer num = this.d;
        serializer.S(num != null ? num.intValue() : 0);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.i0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupMarketInfo)) {
            return false;
        }
        GroupMarketInfo groupMarketInfo = (GroupMarketInfo) obj;
        return epx.f(this.b, groupMarketInfo.b) && epx.f(this.c, groupMarketInfo.c) && epx.f(this.d, groupMarketInfo.d) && epx.f(this.e, groupMarketInfo.e) && epx.f(this.f, groupMarketInfo.f) && epx.f(this.g, groupMarketInfo.g) && epx.f(this.h, groupMarketInfo.h) && epx.f(this.i, groupMarketInfo.i);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Price price = this.c;
        int hashCode2 = (hashCode + (price == null ? 0 : price.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MarketAvitoBadge marketAvitoBadge = this.g;
        int hashCode6 = (hashCode5 + (marketAvitoBadge == null ? 0 : marketAvitoBadge.hashCode())) * 31;
        String str3 = this.h;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CommunityTrustMarks communityTrustMarks = this.i;
        return hashCode7 + (communityTrustMarks != null ? communityTrustMarks.hashCode() : 0);
    }

    public final String toString() {
        return "GroupMarketInfo(contactId=" + this.b + ", minOrderPrice=" + this.c + ", currencyId=" + this.d + ", currencyName=" + this.e + ", currencyText=" + this.f + ", avitoBadge=" + this.g + ", integrationType=" + this.h + ", trustMarks=" + this.i + ')';
    }
}
