package com.vk.profile.design.compose.header;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import defpackage.q0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.mr;
import xsna.shy;
import xsna.thl0;
import xsna.wow;
import xsna.zrp;

/* compiled from: AuthorHeaderConfig.kt */
/* loaded from: classes5.dex */
public final class AuthorHeaderConfig {
    public final Header a;
    public final Info b;
    public final Viewer c;
    public final Author d;

    /* compiled from: AuthorHeaderConfig.kt */
    public static final class Author {
        public final AuthorType a;
        public final AuthorState b;
        public final AuthorSex c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AuthorHeaderConfig.kt */
        public static final class AuthorSex {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AuthorSex[] $VALUES;
            public static final AuthorSex Female;
            public static final AuthorSex Male;
            public static final AuthorSex Unknown;

            static {
                AuthorSex authorSex = new AuthorSex("Male", 0);
                Male = authorSex;
                AuthorSex authorSex2 = new AuthorSex("Female", 1);
                Female = authorSex2;
                AuthorSex authorSex3 = new AuthorSex(DeviceInfo.STR_TYPE_UNKNOWN, 2);
                Unknown = authorSex3;
                AuthorSex[] authorSexArr = {authorSex, authorSex2, authorSex3};
                $VALUES = authorSexArr;
                $ENTRIES = new asp(authorSexArr);
            }

            public AuthorSex() {
                throw null;
            }

            public static AuthorSex valueOf(String str) {
                return (AuthorSex) Enum.valueOf(AuthorSex.class, str);
            }

            public static AuthorSex[] values() {
                return (AuthorSex[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AuthorHeaderConfig.kt */
        public static final class AuthorState {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AuthorState[] $VALUES;
            public static final AuthorState Adult;
            public static final AuthorState Blocked;
            public static final AuthorState Closed;
            public static final AuthorState Default;
            public static final AuthorState Private;

            static {
                AuthorState authorState = new AuthorState("Default", 0);
                Default = authorState;
                AuthorState authorState2 = new AuthorState("Adult", 1);
                Adult = authorState2;
                AuthorState authorState3 = new AuthorState("Blocked", 2);
                Blocked = authorState3;
                AuthorState authorState4 = new AuthorState("Private", 3);
                Private = authorState4;
                AuthorState authorState5 = new AuthorState("Closed", 4);
                Closed = authorState5;
                AuthorState[] authorStateArr = {authorState, authorState2, authorState3, authorState4, authorState5};
                $VALUES = authorStateArr;
                $ENTRIES = new asp(authorStateArr);
            }

            public AuthorState() {
                throw null;
            }

            public static AuthorState valueOf(String str) {
                return (AuthorState) Enum.valueOf(AuthorState.class, str);
            }

            public static AuthorState[] values() {
                return (AuthorState[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AuthorHeaderConfig.kt */
        public static final class AuthorType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ AuthorType[] $VALUES;
            public static final AuthorType Community;
            public static final AuthorType Profile;

            static {
                AuthorType authorType = new AuthorType("Profile", 0);
                Profile = authorType;
                AuthorType authorType2 = new AuthorType("Community", 1);
                Community = authorType2;
                AuthorType[] authorTypeArr = {authorType, authorType2};
                $VALUES = authorTypeArr;
                $ENTRIES = new asp(authorTypeArr);
            }

            public AuthorType() {
                throw null;
            }

            public static AuthorType valueOf(String str) {
                return (AuthorType) Enum.valueOf(AuthorType.class, str);
            }

            public static AuthorType[] values() {
                return (AuthorType[]) $VALUES.clone();
            }
        }

        public Author(AuthorType authorType, AuthorState authorState, AuthorSex authorSex) {
            this.a = authorType;
            this.b = authorState;
            this.c = authorSex;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Author)) {
                return false;
            }
            Author author = (Author) obj;
            return this.a == author.a && this.b == author.b && this.c == author.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Author(type=" + this.a + ", state=" + this.b + ", authorSex=" + this.c + ')';
        }
    }

    /* compiled from: AuthorHeaderConfig.kt */
    public static final class Header {
        public final com.vk.profile.design.compose.header.a a;
        public final b b;
        public final Main c;
        public final List d;
        public final boolean e;

        /* compiled from: AuthorHeaderConfig.kt */
        public static final class Main {
            public final Name a;
            public final Subtitle b;
            public final a c;
            public final ProfileButtons d;

            /* compiled from: AuthorHeaderConfig.kt */
            public interface Name {

                /* compiled from: AuthorHeaderConfig.kt */
                public static final class Default implements Name {
                    public final String a;
                    public final String b;
                    public final String c;
                    public final Verification d;

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    /* compiled from: AuthorHeaderConfig.kt */
                    public static final class Verification {
                        private static final /* synthetic */ zrp $ENTRIES;
                        private static final /* synthetic */ Verification[] $VALUES;
                        public static final Verification Confirmed;
                        public static final Verification ConfirmedBusiness;
                        public static final Verification Government;
                        public static final Verification NcoOrganization;
                        public static final Verification PremiumBusiness;
                        public static final Verification Verified;
                        public static final Verification VkKindness;

                        static {
                            Verification verification = new Verification("Verified", 0);
                            Verified = verification;
                            Verification verification2 = new Verification("Confirmed", 1);
                            Confirmed = verification2;
                            Verification verification3 = new Verification("PremiumBusiness", 2);
                            PremiumBusiness = verification3;
                            Verification verification4 = new Verification("ConfirmedBusiness", 3);
                            ConfirmedBusiness = verification4;
                            Verification verification5 = new Verification("NcoOrganization", 4);
                            NcoOrganization = verification5;
                            Verification verification6 = new Verification("Government", 5);
                            Government = verification6;
                            Verification verification7 = new Verification("VkKindness", 6);
                            VkKindness = verification7;
                            Verification[] verificationArr = {verification, verification2, verification3, verification4, verification5, verification6, verification7};
                            $VALUES = verificationArr;
                            $ENTRIES = new asp(verificationArr);
                        }

                        public Verification() {
                            throw null;
                        }

                        public static Verification valueOf(String str) {
                            return (Verification) Enum.valueOf(Verification.class, str);
                        }

                        public static Verification[] values() {
                            return (Verification[]) $VALUES.clone();
                        }
                    }

                    public Default(String str, String str2, String str3, Verification verification) {
                        this.a = str;
                        this.b = str2;
                        this.c = str3;
                        this.d = verification;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Default)) {
                            return false;
                        }
                        Default r5 = (Default) obj;
                        return epx.f(this.a, r5.a) && epx.f(this.b, r5.b) && epx.f(this.c, r5.c) && this.d == r5.d;
                    }

                    public final int hashCode() {
                        int hashCode = this.a.hashCode() * 31;
                        String str = this.b;
                        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                        String str2 = this.c;
                        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        Verification verification = this.d;
                        return hashCode3 + (verification != null ? verification.hashCode() : 0);
                    }

                    public final String toString() {
                        return "Default(name=" + this.a + ", imageStatusUrl=" + this.b + ", imageStatusTitle=" + this.c + ", verification=" + this.d + ')';
                    }
                }

                /* compiled from: AuthorHeaderConfig.kt */
                public static final class a implements Name {
                    public static final a a = new a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof a);
                    }

                    public final int hashCode() {
                        return 58485639;
                    }

                    public final String toString() {
                        return "PrivateCommunity";
                    }
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public interface Subtitle {

                /* compiled from: AuthorHeaderConfig.kt */
                public static final class Promo implements Subtitle {

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    /* compiled from: AuthorHeaderConfig.kt */
                    public static final class SubscriptionPromo {
                        private static final /* synthetic */ zrp $ENTRIES;
                        private static final /* synthetic */ SubscriptionPromo[] $VALUES;
                        public static final SubscriptionPromo CanBeFriend;
                        public static final SubscriptionPromo Follow;
                        public static final SubscriptionPromo ReplyRequest;

                        static {
                            SubscriptionPromo subscriptionPromo = new SubscriptionPromo("Follow", 0);
                            Follow = subscriptionPromo;
                            SubscriptionPromo subscriptionPromo2 = new SubscriptionPromo("ReplyRequest", 1);
                            ReplyRequest = subscriptionPromo2;
                            SubscriptionPromo subscriptionPromo3 = new SubscriptionPromo("CanBeFriend", 2);
                            CanBeFriend = subscriptionPromo3;
                            SubscriptionPromo[] subscriptionPromoArr = {subscriptionPromo, subscriptionPromo2, subscriptionPromo3};
                            $VALUES = subscriptionPromoArr;
                            $ENTRIES = new asp(subscriptionPromoArr);
                        }

                        public SubscriptionPromo() {
                            throw null;
                        }

                        public static SubscriptionPromo valueOf(String str) {
                            return (SubscriptionPromo) Enum.valueOf(SubscriptionPromo.class, str);
                        }

                        public static SubscriptionPromo[] values() {
                            return (SubscriptionPromo[]) $VALUES.clone();
                        }
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Promo)) {
                            return false;
                        }
                        ((Promo) obj).getClass();
                        return true;
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return "Promo(type=" + ((Object) null) + ')';
                    }
                }

                /* compiled from: AuthorHeaderConfig.kt */
                public static final class a implements Subtitle {
                    public final String a;

                    public a(String str) {
                        this.a = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                    }

                    public final int hashCode() {
                        return this.a.hashCode();
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("Custom(text="), this.a, ')');
                    }
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public interface a {

                /* compiled from: AuthorHeaderConfig.kt */
                /* renamed from: com.vk.profile.design.compose.header.AuthorHeaderConfig$Header$Main$a$a, reason: collision with other inner class name */
                public static final class C1654a implements a {
                }

                /* compiled from: AuthorHeaderConfig.kt */
                public static final class b implements a {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        ((b) obj).getClass();
                        return epx.f(null, null);
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("Offline(text="), null, ')');
                    }
                }

                /* compiled from: AuthorHeaderConfig.kt */
                public static final class c implements a {
                }
            }

            public Main(Name name, Subtitle subtitle, a aVar, ProfileButtons profileButtons) {
                this.a = name;
                this.b = subtitle;
                this.c = aVar;
                this.d = profileButtons;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Main)) {
                    return false;
                }
                Main main = (Main) obj;
                return epx.f(this.a, main.a) && epx.f(this.b, main.b) && epx.f(this.c, main.c) && epx.f(this.d, main.d);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                Subtitle subtitle = this.b;
                int hashCode2 = (hashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31;
                a aVar = this.c;
                int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                ProfileButtons profileButtons = this.d;
                return hashCode3 + (profileButtons != null ? profileButtons.hashCode() : 0);
            }

            public final String toString() {
                return "Main(name=" + this.a + ", subtitle=" + this.b + ", status=" + this.c + ", buttons=" + this.d + ')';
            }
        }

        /* compiled from: AuthorHeaderConfig.kt */
        public interface a {

            /* compiled from: AuthorHeaderConfig.kt */
            /* renamed from: com.vk.profile.design.compose.header.AuthorHeaderConfig$Header$a$a, reason: collision with other inner class name */
            public static final class C1655a implements a {
                public static final C1655a a = new C1655a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1655a);
                }

                public final int hashCode() {
                    return -2036075395;
                }

                public final String toString() {
                    return "APlus";
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class b implements a {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1741860695;
                }

                public final String toString() {
                    return "Over16";
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class c implements a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1741860697;
                }

                public final String toString() {
                    return "Over18";
                }
            }
        }

        public Header(com.vk.profile.design.compose.header.a aVar, b bVar, Main main, List list, boolean z) {
            this.a = aVar;
            this.b = bVar;
            this.c = main;
            this.d = list;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            boolean f;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            if (!epx.f(this.a, header.a) || !epx.f(this.b, header.b) || !epx.f(this.c, header.c)) {
                return false;
            }
            List list = header.d;
            List list2 = this.d;
            if (list2 == null) {
                if (list == null) {
                    f = true;
                }
                f = false;
            } else {
                if (list != null) {
                    f = epx.f(list2, list);
                }
                f = false;
            }
            return f && this.e == header.e;
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            List list = this.d;
            return Boolean.hashCode(this.e) + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Header(avatar=");
            sb.append(this.a);
            sb.append(", cover=");
            sb.append(this.b);
            sb.append(", main=");
            sb.append(this.c);
            sb.append(", badges=");
            List list = this.d;
            sb.append((Object) (list == null ? "null" : wow.c(list)));
            sb.append(", isHeaderPictureExpanded=");
            return q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: AuthorHeaderConfig.kt */
    public static final class Info {
        public static final Info g = new Info(0);
        public final b a;
        public final a b;
        public final InfoSlotData c;
        public final InfoSlotData d;
        public final InfoSlotData e;
        public final InfoSlotData f;

        /* compiled from: AuthorHeaderConfig.kt */
        public interface InfoSlotData {

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class TrustTag implements InfoSlotData {
                public final String a;
                public final Type b;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: AuthorHeaderConfig.kt */
                public static final class Type {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Type[] $VALUES;
                    public static final Type Delivery;
                    public static final Type FreeDelivery;
                    public static final Type FriendsBuy;
                    public static final Type None;
                    public static final Type Ozon;
                    public static final Type Popular;
                    public static final Type SelfPickup;
                    public static final Type ShopCondition;
                    public static final Type VKAge;
                    public static final Type VerifyBusiness;
                    public static final Type YClients;

                    static {
                        Type type = new Type("None", 0);
                        None = type;
                        Type type2 = new Type("Popular", 1);
                        Popular = type2;
                        Type type3 = new Type("FriendsBuy", 2);
                        FriendsBuy = type3;
                        Type type4 = new Type("VerifyBusiness", 3);
                        VerifyBusiness = type4;
                        Type type5 = new Type("Ozon", 4);
                        Ozon = type5;
                        Type type6 = new Type("YClients", 5);
                        YClients = type6;
                        Type type7 = new Type("FreeDelivery", 6);
                        FreeDelivery = type7;
                        Type type8 = new Type("SelfPickup", 7);
                        SelfPickup = type8;
                        Type type9 = new Type("Delivery", 8);
                        Delivery = type9;
                        Type type10 = new Type("ShopCondition", 9);
                        ShopCondition = type10;
                        Type type11 = new Type("VKAge", 10);
                        VKAge = type11;
                        Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11};
                        $VALUES = typeArr;
                        $ENTRIES = new asp(typeArr);
                    }

                    public Type() {
                        throw null;
                    }

                    public static Type valueOf(String str) {
                        return (Type) Enum.valueOf(Type.class, str);
                    }

                    public static Type[] values() {
                        return (Type[]) $VALUES.clone();
                    }
                }

                public TrustTag(String str, Type type) {
                    this.a = str;
                    this.b = type;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TrustTag)) {
                        return false;
                    }
                    TrustTag trustTag = (TrustTag) obj;
                    return epx.f(this.a, trustTag.a) && this.b == trustTag.b;
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "TrustTag(text=" + this.a + ", type=" + this.b + ')';
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class a implements InfoSlotData {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 768534402;
                }

                public final String toString() {
                    return "AboutCommunity";
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class b implements InfoSlotData {
                public final a a = null;
                public final a b = null;

                /* compiled from: AuthorHeaderConfig.kt */
                public interface a {

                    /* compiled from: AuthorHeaderConfig.kt */
                    /* renamed from: com.vk.profile.design.compose.header.AuthorHeaderConfig$Info$InfoSlotData$b$a$a, reason: collision with other inner class name */
                    public static final class C1656a implements a {
                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C1656a)) {
                                return false;
                            }
                            ((C1656a) obj).getClass();
                            return epx.f(null, null);
                        }

                        public final int hashCode() {
                            throw null;
                        }

                        public final String toString() {
                            return ho8.a(new StringBuilder("City(city="), null, ')');
                        }
                    }

                    /* compiled from: AuthorHeaderConfig.kt */
                    /* renamed from: com.vk.profile.design.compose.header.AuthorHeaderConfig$Info$InfoSlotData$b$a$b, reason: collision with other inner class name */
                    public static final class C1657b implements a {
                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C1657b)) {
                                return false;
                            }
                            ((C1657b) obj).getClass();
                            return epx.f(null, null);
                        }

                        public final int hashCode() {
                            throw null;
                        }

                        public final String toString() {
                            return ho8.a(new StringBuilder("Education(education="), null, ')');
                        }
                    }

                    /* compiled from: AuthorHeaderConfig.kt */
                    public static final class c implements a {
                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof c)) {
                                return false;
                            }
                            ((c) obj).getClass();
                            return epx.f(null, null) && epx.f(null, null);
                        }

                        public final int hashCode() {
                            throw null;
                        }

                        public final String toString() {
                            StringBuilder sb = new StringBuilder("Work(title=");
                            sb.append((String) null);
                            sb.append(", image=");
                            return ho8.a(sb, null, ')');
                        }
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
                }

                public final int hashCode() {
                    a aVar = this.a;
                    int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
                    a aVar2 = this.b;
                    return hashCode + (aVar2 != null ? aVar2.hashCode() : 0);
                }

                public final String toString() {
                    return "AboutProfile(first=" + this.a + ", second=" + this.b + ')';
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public interface c extends InfoSlotData {

                /* compiled from: AuthorHeaderConfig.kt */
                public static final class a implements c {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof a)) {
                            return false;
                        }
                        ((a) obj).getClass();
                        return epx.f(null, null) && epx.f(null, null);
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("CustomBadge(id=, title=");
                        sb.append((String) null);
                        sb.append(", iconUrl=");
                        return ho8.a(sb, null, ')');
                    }
                }

                /* compiled from: AuthorHeaderConfig.kt */
                public static final class b implements c {
                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        ((b) obj).getClass();
                        return epx.f(null, null);
                    }

                    public final int hashCode() {
                        throw null;
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("MusicTrack(track="), null, ')');
                    }
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class d implements InfoSlotData {
                public final String a;

                public d(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("ArtistCard(artistId="), this.a, ')');
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class e implements InfoSlotData {
                public final String a;

                public e(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("CuratorCard(curatorId="), this.a, ')');
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class f implements InfoSlotData {
                public static final f a = new f();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof f);
                }

                public final int hashCode() {
                    return 1028748122;
                }

                public final String toString() {
                    return "EmptyContacts";
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class g implements InfoSlotData {
                public final String a;

                public g(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("EventDate(date="), this.a, ')');
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class h implements InfoSlotData {
                public final String a;

                public h(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Link(link="), this.a, ')');
                }
            }
        }

        /* compiled from: AuthorHeaderConfig.kt */
        public interface a {

            /* compiled from: AuthorHeaderConfig.kt */
            /* renamed from: com.vk.profile.design.compose.header.AuthorHeaderConfig$Info$a$a, reason: collision with other inner class name */
            public static final class C1658a implements a {
                public static final C1658a a = new C1658a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1658a);
                }

                public final int hashCode() {
                    return -2029230893;
                }

                public final String toString() {
                    return "EmptyDescription";
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class b implements a {
                public final CharSequence a;

                public b(CharSequence charSequence) {
                    this.a = charSequence;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return thl0.a(new StringBuilder("FilledDescription(description="), this.a, ')');
                }
            }
        }

        /* compiled from: AuthorHeaderConfig.kt */
        public interface b {

            /* compiled from: AuthorHeaderConfig.kt */
            public static final class a implements b {
                public final int a;
                public final int b;
                public final int c;
                public final List d;
                public final boolean e;

                public a(int i, int i2, int i3, List list, boolean z) {
                    this.a = i;
                    this.b = i2;
                    this.c = i3;
                    this.d = list;
                    this.e = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.e) + fw3.a(shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("DefaultSubscribers(friendsCount=");
                    sb.append(this.a);
                    sb.append(", subscribersCount=");
                    sb.append(this.b);
                    sb.append(", sharedFriendsCount=");
                    sb.append(this.c);
                    sb.append(", avatarUrls=");
                    mr.c(", isAudienceTargetNavigationEnabled=", sb, this.d);
                    return q0.a(sb, this.e, ')');
                }
            }

            /* compiled from: AuthorHeaderConfig.kt */
            /* renamed from: com.vk.profile.design.compose.header.AuthorHeaderConfig$Info$b$b, reason: collision with other inner class name */
            public static final class C1659b implements b {
                public static final C1659b a = new C1659b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1659b);
                }

                public final int hashCode() {
                    return -397364936;
                }

                public final String toString() {
                    return "Empty";
                }
            }
        }

        public Info() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return epx.f(this.a, info.a) && epx.f(this.b, info.b) && epx.f(this.c, info.c) && epx.f(this.d, info.d) && epx.f(this.e, info.e) && epx.f(this.f, info.f);
        }

        public final int hashCode() {
            b bVar = this.a;
            int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            a aVar = this.b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            InfoSlotData infoSlotData = this.c;
            int hashCode3 = (hashCode2 + (infoSlotData == null ? 0 : infoSlotData.hashCode())) * 31;
            InfoSlotData infoSlotData2 = this.d;
            int hashCode4 = (hashCode3 + (infoSlotData2 == null ? 0 : infoSlotData2.hashCode())) * 31;
            InfoSlotData infoSlotData3 = this.e;
            int hashCode5 = (hashCode4 + (infoSlotData3 == null ? 0 : infoSlotData3.hashCode())) * 31;
            InfoSlotData infoSlotData4 = this.f;
            return hashCode5 + (infoSlotData4 != null ? infoSlotData4.hashCode() : 0);
        }

        public final String toString() {
            return "Info(subscribers=" + this.a + ", description=" + this.b + ", firstSlotData=" + this.c + ", secondSlotData=" + this.d + ", thirdSlotData=" + this.e + ", fourSlotData=" + this.f + ')';
        }

        public /* synthetic */ Info(int i) {
            this(null, null, null, null, null, null);
        }

        public Info(b bVar, a aVar, InfoSlotData infoSlotData, InfoSlotData infoSlotData2, InfoSlotData infoSlotData3, InfoSlotData infoSlotData4) {
            this.a = bVar;
            this.b = aVar;
            this.c = infoSlotData;
            this.d = infoSlotData2;
            this.e = infoSlotData3;
            this.f = infoSlotData4;
        }
    }

    /* compiled from: AuthorHeaderConfig.kt */
    public static final class Viewer {
        public final ViewerRole a;
        public final RelationToAuthor b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AuthorHeaderConfig.kt */
        public static final class RelationToAuthor {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ RelationToAuthor[] $VALUES;
            public static final RelationToAuthor Blacklisted;
            public static final RelationToAuthor Friend;
            public static final RelationToAuthor IncomingRequest;
            public static final RelationToAuthor None;
            public static final RelationToAuthor Subscriber;

            static {
                RelationToAuthor relationToAuthor = new RelationToAuthor("None", 0);
                None = relationToAuthor;
                RelationToAuthor relationToAuthor2 = new RelationToAuthor("Subscriber", 1);
                Subscriber = relationToAuthor2;
                RelationToAuthor relationToAuthor3 = new RelationToAuthor("Friend", 2);
                Friend = relationToAuthor3;
                RelationToAuthor relationToAuthor4 = new RelationToAuthor("IncomingRequest", 3);
                IncomingRequest = relationToAuthor4;
                RelationToAuthor relationToAuthor5 = new RelationToAuthor("Blacklisted", 4);
                Blacklisted = relationToAuthor5;
                RelationToAuthor[] relationToAuthorArr = {relationToAuthor, relationToAuthor2, relationToAuthor3, relationToAuthor4, relationToAuthor5};
                $VALUES = relationToAuthorArr;
                $ENTRIES = new asp(relationToAuthorArr);
            }

            public RelationToAuthor() {
                throw null;
            }

            public static RelationToAuthor valueOf(String str) {
                return (RelationToAuthor) Enum.valueOf(RelationToAuthor.class, str);
            }

            public static RelationToAuthor[] values() {
                return (RelationToAuthor[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AuthorHeaderConfig.kt */
        public static final class ViewerRole {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ViewerRole[] $VALUES;
            public static final ViewerRole Admin;
            public static final ViewerRole Editor;
            public static final ViewerRole Moderator;
            public static final ViewerRole None;
            public static final ViewerRole Owner;

            /* compiled from: AuthorHeaderConfig.kt */
            public static final /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ViewerRole.values().length];
                    try {
                        iArr[ViewerRole.Owner.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ViewerRole.Admin.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ViewerRole.Moderator.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ViewerRole.Editor.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ViewerRole.None.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            static {
                ViewerRole viewerRole = new ViewerRole("Owner", 0);
                Owner = viewerRole;
                ViewerRole viewerRole2 = new ViewerRole("Admin", 1);
                Admin = viewerRole2;
                ViewerRole viewerRole3 = new ViewerRole("Moderator", 2);
                Moderator = viewerRole3;
                ViewerRole viewerRole4 = new ViewerRole("Editor", 3);
                Editor = viewerRole4;
                ViewerRole viewerRole5 = new ViewerRole("None", 4);
                None = viewerRole5;
                ViewerRole[] viewerRoleArr = {viewerRole, viewerRole2, viewerRole3, viewerRole4, viewerRole5};
                $VALUES = viewerRoleArr;
                $ENTRIES = new asp(viewerRoleArr);
            }

            public ViewerRole() {
                throw null;
            }

            public static ViewerRole valueOf(String str) {
                return (ViewerRole) Enum.valueOf(ViewerRole.class, str);
            }

            public static ViewerRole[] values() {
                return (ViewerRole[]) $VALUES.clone();
            }

            public final boolean h() {
                int i = a.$EnumSwitchMapping$0[ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    return true;
                }
                if (i == 5) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        public Viewer(ViewerRole viewerRole, RelationToAuthor relationToAuthor) {
            this.a = viewerRole;
            this.b = relationToAuthor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Viewer)) {
                return false;
            }
            Viewer viewer = (Viewer) obj;
            return this.a == viewer.a && this.b == viewer.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Viewer(viewerRole=" + this.a + ", relationToAuthor=" + this.b + ')';
        }
    }

    /* compiled from: AuthorHeaderConfig.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Author.AuthorType.values().length];
            try {
                iArr[Author.AuthorType.Profile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Author.AuthorType.Community.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AuthorHeaderConfig(Header header, Info info, Viewer viewer, Author author) {
        this.a = header;
        this.b = info;
        this.c = viewer;
        this.d = author;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorHeaderConfig)) {
            return false;
        }
        AuthorHeaderConfig authorHeaderConfig = (AuthorHeaderConfig) obj;
        return epx.f(this.a, authorHeaderConfig.a) && epx.f(this.b, authorHeaderConfig.b) && epx.f(this.c, authorHeaderConfig.c) && epx.f(this.d, authorHeaderConfig.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AuthorHeaderConfig(header=" + this.a + ", info=" + this.b + ", viewer=" + this.c + ", author=" + this.d + ')';
    }
}
