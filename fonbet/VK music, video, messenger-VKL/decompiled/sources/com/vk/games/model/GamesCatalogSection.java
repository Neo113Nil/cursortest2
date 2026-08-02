package com.vk.games.model;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.external.miniapp.net.app.WebImage;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.lgt;
import xsna.ms9;
import xsna.n8t;
import xsna.o8t;
import xsna.qoy;
import xsna.sbt;
import xsna.shy;
import xsna.urd0;
import xsna.wdt;
import xsna.zrp;

/* compiled from: GamesCatalogSection.kt */
/* loaded from: classes17.dex */
public abstract class GamesCatalogSection {

    /* compiled from: GamesCatalogSection.kt */
    public static final class GamesNotificationSection extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final wdt c;
        public final ArrayList d;

        /* compiled from: GamesCatalogSection.kt */
        public static final class GamesNotificationInfo {
            public final sbt a;
            public final GamesCatalogUser b;
            public final Type c;
            public final String d;
            public final boolean e;
            public final int f;
            public final Long g;
            public final int h;
            public final String i;
            public final String j;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: GamesCatalogSection.kt */
            public static final class Type {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type Invite;
                public static final Type Request;
                public static final Type Unknown;

                static {
                    Type type = new Type("Request", 0);
                    Request = type;
                    Type type2 = new Type("Invite", 1);
                    Invite = type2;
                    Type type3 = new Type(DeviceInfo.STR_TYPE_UNKNOWN, 2);
                    Unknown = type3;
                    Type[] typeArr = {type, type2, type3};
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

            public GamesNotificationInfo(sbt sbtVar, GamesCatalogUser gamesCatalogUser, Type type, String str, boolean z, int i, Long l, int i2, String str2, String str3) {
                this.a = sbtVar;
                this.b = gamesCatalogUser;
                this.c = type;
                this.d = str;
                this.e = z;
                this.f = i;
                this.g = l;
                this.h = i2;
                this.i = str2;
                this.j = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GamesNotificationInfo)) {
                    return false;
                }
                GamesNotificationInfo gamesNotificationInfo = (GamesNotificationInfo) obj;
                return epx.f(this.a, gamesNotificationInfo.a) && epx.f(this.b, gamesNotificationInfo.b) && this.c == gamesNotificationInfo.c && epx.f(this.d, gamesNotificationInfo.d) && this.e == gamesNotificationInfo.e && this.f == gamesNotificationInfo.f && epx.f(this.g, gamesNotificationInfo.g) && this.h == gamesNotificationInfo.h && epx.f(this.i, gamesNotificationInfo.i) && epx.f(this.j, gamesNotificationInfo.j);
            }

            public final int hashCode() {
                int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
                String str = this.d;
                int a = shy.a(this.f, qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31);
                Long l = this.g;
                int a2 = shy.a(this.h, (a + (l == null ? 0 : l.hashCode())) * 31, 31);
                String str2 = this.i;
                int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.j;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GamesNotificationInfo(extendedAppItem=");
                sb.append(this.a);
                sb.append(", userProfile=");
                sb.append(this.b);
                sb.append(", type=");
                sb.append(this.c);
                sb.append(", text=");
                sb.append(this.d);
                sb.append(", unread=");
                sb.append(this.e);
                sb.append(", requestId=");
                sb.append(this.f);
                sb.append(", fromId=");
                sb.append(this.g);
                sb.append(", date=");
                sb.append(this.h);
                sb.append(", key=");
                sb.append(this.i);
                sb.append(", name=");
                return ho8.a(sb, this.j, ')');
            }
        }

        public GamesNotificationSection(int i, String str, wdt wdtVar, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = wdtVar;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GamesNotificationSection)) {
                return false;
            }
            GamesNotificationSection gamesNotificationSection = (GamesNotificationSection) obj;
            return this.a == gamesNotificationSection.a && this.b.equals(gamesNotificationSection.b) && epx.f(this.c, gamesNotificationSection.c) && this.d.equals(gamesNotificationSection.d);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            wdt wdtVar = this.c;
            return this.d.hashCode() + ((a + (wdtVar == null ? 0 : wdtVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesNotificationSection(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", header=");
            sb.append(this.c);
            sb.append(", notifications=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class a extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final wdt c;
        public final ArrayList d;

        /* compiled from: GamesCatalogSection.kt */
        /* renamed from: com.vk.games.model.GamesCatalogSection$a$a, reason: collision with other inner class name */
        public static final class C1078a {
            public final sbt a;
            public final GamesCatalogUser b;
            public final GamesCatalogActivityType c;
            public final int d;
            public final Integer e;
            public final Integer f;
            public final String g;
            public final WebImage h;

            public C1078a(sbt sbtVar, GamesCatalogUser gamesCatalogUser, GamesCatalogActivityType gamesCatalogActivityType, int i, Integer num, Integer num2, String str, WebImage webImage) {
                this.a = sbtVar;
                this.b = gamesCatalogUser;
                this.c = gamesCatalogActivityType;
                this.d = i;
                this.e = num;
                this.f = num2;
                this.g = str;
                this.h = webImage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1078a)) {
                    return false;
                }
                C1078a c1078a = (C1078a) obj;
                return epx.f(this.a, c1078a.a) && epx.f(this.b, c1078a.b) && this.c == c1078a.c && this.d == c1078a.d && epx.f(this.e, c1078a.e) && epx.f(this.f, c1078a.f) && epx.f(this.g, c1078a.g) && epx.f(this.h, c1078a.h);
            }

            public final int hashCode() {
                sbt sbtVar = this.a;
                int hashCode = (this.b.hashCode() + ((sbtVar == null ? 0 : sbtVar.hashCode()) * 31)) * 31;
                GamesCatalogActivityType gamesCatalogActivityType = this.c;
                int a = shy.a(this.d, (hashCode + (gamesCatalogActivityType == null ? 0 : gamesCatalogActivityType.hashCode())) * 31, 31);
                Integer num = this.e;
                int hashCode2 = (a + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.f;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str = this.g;
                int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                WebImage webImage = this.h;
                return hashCode4 + (webImage != null ? webImage.b.hashCode() : 0);
            }

            public final String toString() {
                return "ActivityInfo(extendedAppItem=" + this.a + ", userProfile=" + this.b + ", type=" + this.c + ", date=" + this.d + ", value=" + this.e + ", level=" + this.f + ", text=" + this.g + ", icon=" + this.h + ')';
            }
        }

        public a(int i, String str, wdt wdtVar, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = wdtVar;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            wdt wdtVar = this.c;
            return this.d.hashCode() + ((a + (wdtVar == null ? 0 : wdtVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActivitySection(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", header=");
            sb.append(this.c);
            sb.append(", activities=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class b extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final a c;

        /* compiled from: GamesCatalogSection.kt */
        public static final class a {
            public final String a;
            public final int b;
            public final WebImage c;

            public a(String str, int i, WebImage webImage) {
                this.a = str;
                this.b = i;
                this.c = webImage;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.b.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
            }

            public final String toString() {
                return "AchievementBanner(text=" + this.a + ", level=" + this.b + ", image=" + this.c + ')';
            }
        }

        public b(int i, String str, a aVar) {
            this.a = i;
            this.b = str;
            this.c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "AppAchievementBanner(sectionId=" + this.a + ", sectionTrackCode=" + this.b + ", banner=" + this.c + ')';
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class c extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final sbt c;
        public final String d;
        public final a e;

        /* compiled from: GamesCatalogSection.kt */
        public static final class a {
            public final WebImage a;
            public final String b;
            public final String c;
            public final String d;

            public a(String str, String str2, WebImage webImage, String str3) {
                this.a = webImage;
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + urd0.a(urd0.a(this.a.b.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Banner(backgroundImage=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", description=");
                sb.append(this.c);
                sb.append(", buttonTitle=");
                return ho8.a(sb, this.d, ')');
            }
        }

        public c(int i, String str, sbt sbtVar, String str2, a aVar) {
            this.a = i;
            this.b = str;
            this.c = sbtVar;
            this.d = str2;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            sbt sbtVar = this.c;
            int hashCode = (a2 + (sbtVar == null ? 0 : sbtVar.hashCode())) * 31;
            String str = this.d;
            return this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "AppPromoBanner(sectionId=" + this.a + ", sectionTrackCode=" + this.b + ", extendedAppItem=" + this.c + ", url=" + this.d + ", banner=" + this.e + ')';
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class d extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final String c;
        public final wdt d;
        public final ArrayList e;

        public d(int i, String str, String str2, wdt wdtVar, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = wdtVar;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b.equals(dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && this.e.equals(dVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            wdt wdtVar = this.d;
            return this.e.hashCode() + ((hashCode + (wdtVar != null ? wdtVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GameCategorySection(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", sectionRef=");
            sb.append(this.c);
            sb.append(", header=");
            sb.append(this.d);
            sb.append(", apps=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class e extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final wdt c;
        public final sbt d;
        public final a e;

        /* compiled from: GamesCatalogSection.kt */
        public static final class a {
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
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("SectionButton(title="), this.a, ')');
            }
        }

        public e(int i, String str, wdt wdtVar, sbt sbtVar, a aVar) {
            this.a = i;
            this.b = str;
            this.c = wdtVar;
            this.d = sbtVar;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e);
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            wdt wdtVar = this.c;
            return this.e.hashCode() + ((this.d.hashCode() + ((a2 + (wdtVar == null ? 0 : wdtVar.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "GameForYou(sectionId=" + this.a + ", sectionTrackCode=" + this.b + ", header=" + this.c + ", app=" + this.d + ", button=" + this.e + ')';
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class f extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final String c;
        public final GamesHeaderSectionInfo d;
        public final a e;
        public final List<sbt> f;

        /* compiled from: GamesCatalogSection.kt */
        public static final class a {
            public final String a;
            public final String b;
            public final Integer c;
            public final GamesAchievementType d;
            public final GamesAchievementState e;
            public final o8t f;
            public final List<WebImage> g;
            public final n8t h;
            public final lgt i;

            public a(String str, String str2, Integer num, GamesAchievementType gamesAchievementType, GamesAchievementState gamesAchievementState, o8t o8tVar, List<WebImage> list, n8t n8tVar, lgt lgtVar) {
                this.a = str;
                this.b = str2;
                this.c = num;
                this.d = gamesAchievementType;
                this.e = gamesAchievementState;
                this.f = o8tVar;
                this.g = list;
                this.h = n8tVar;
                this.i = lgtVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.c;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                GamesAchievementType gamesAchievementType = this.d;
                int hashCode4 = (hashCode3 + (gamesAchievementType == null ? 0 : gamesAchievementType.hashCode())) * 31;
                GamesAchievementState gamesAchievementState = this.e;
                int hashCode5 = (hashCode4 + (gamesAchievementState == null ? 0 : gamesAchievementState.hashCode())) * 31;
                o8t o8tVar = this.f;
                int hashCode6 = (hashCode5 + (o8tVar == null ? 0 : o8tVar.hashCode())) * 31;
                List<WebImage> list = this.g;
                int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
                n8t n8tVar = this.h;
                int hashCode8 = (hashCode7 + (n8tVar == null ? 0 : n8tVar.hashCode())) * 31;
                lgt lgtVar = this.i;
                return hashCode8 + (lgtVar != null ? lgtVar.hashCode() : 0);
            }

            public final String toString() {
                return "GamesAchievementInfo(title=" + this.a + ", subtitle=" + this.b + ", progress=" + this.c + ", achievementType=" + this.d + ", state=" + this.e + ", label=" + this.f + ", image=" + this.g + ", button=" + this.h + ", whatInsideModalInfo=" + this.i + ')';
            }
        }

        public f(int i, String str, String str2, GamesHeaderSectionInfo gamesHeaderSectionInfo, a aVar, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = gamesHeaderSectionInfo;
            this.e = aVar;
            this.f = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f);
        }

        public final int hashCode() {
            int a2 = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            GamesHeaderSectionInfo gamesHeaderSectionInfo = this.d;
            int hashCode2 = (this.e.hashCode() + ((hashCode + (gamesHeaderSectionInfo == null ? 0 : gamesHeaderSectionInfo.hashCode())) * 31)) * 31;
            List<sbt> list = this.f;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesAchievementBlock(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", sectionRef=");
            sb.append(this.c);
            sb.append(", sectionInfo=");
            sb.append(this.d);
            sb.append(", achievementsInfo=");
            sb.append(this.e);
            sb.append(", apps=");
            return ms9.a(')', sb, this.f);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class g extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final String c;
        public final wdt d;
        public final ArrayList e;

        public g(int i, String str, String str2, wdt wdtVar, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = wdtVar;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && this.b.equals(gVar.b) && epx.f(this.c, gVar.c) && epx.f(this.d, gVar.d) && this.e.equals(gVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            wdt wdtVar = this.d;
            return this.e.hashCode() + ((hashCode + (wdtVar != null ? wdtVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesBigHorizontalList(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", sectionRef=");
            sb.append(this.c);
            sb.append(", header=");
            sb.append(this.d);
            sb.append(", apps=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class h extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final ArrayList c;

        /* compiled from: GamesCatalogSection.kt */
        public static final class a {
            public final sbt a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;

            public a(sbt sbtVar, String str, String str2, String str3, String str4) {
                this.a = sbtVar;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
            }

            public final int hashCode() {
                int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
                String str = this.c;
                int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.e;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("BannerInfo(extendedAppItem=");
                sb.append(this.a);
                sb.append(", description=");
                sb.append(this.b);
                sb.append(", banner=");
                sb.append(this.c);
                sb.append(", bannerBig=");
                sb.append(this.d);
                sb.append(", buttonText=");
                return ho8.a(sb, this.e, ')');
            }
        }

        public h(String str, ArrayList arrayList, int i) {
            this.a = i;
            this.b = str;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b.equals(hVar.b) && this.c.equals(hVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesCatalogBanners(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", banners=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class i extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final wdt c;
        public final ArrayList d;

        public i(int i, String str, wdt wdtVar, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = wdtVar;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a == iVar.a && this.b.equals(iVar.b) && epx.f(this.c, iVar.c) && this.d.equals(iVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            wdt wdtVar = this.c;
            return this.d.hashCode() + ((a + (wdtVar == null ? 0 : wdtVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesCatalogHorizontalList(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", header=");
            sb.append(this.c);
            sb.append(", games=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class j extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final String c;
        public final wdt d;
        public final ArrayList e;

        public j(int i, String str, String str2, wdt wdtVar, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = wdtVar;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && this.b.equals(jVar.b) && epx.f(this.c, jVar.c) && epx.f(this.d, jVar.d) && this.e.equals(jVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            wdt wdtVar = this.d;
            return this.e.hashCode() + ((hashCode + (wdtVar != null ? wdtVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesCustomCollectionList(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", sectionRef=");
            sb.append(this.c);
            sb.append(", header=");
            sb.append(this.d);
            sb.append(", apps=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class k extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final String c;
        public final wdt d;
        public final ArrayList e;

        public k(int i, String str, String str2, wdt wdtVar, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = wdtVar;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a == kVar.a && this.b.equals(kVar.b) && epx.f(this.c, kVar.c) && epx.f(this.d, kVar.d) && this.e.equals(kVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            wdt wdtVar = this.d;
            return this.e.hashCode() + ((hashCode + (wdtVar != null ? wdtVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesVerticalHalfCardsList(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", sectionRef=");
            sb.append(this.c);
            sb.append(", header=");
            sb.append(this.d);
            sb.append(", apps=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class l extends GamesCatalogSection {
        public final int a;
        public final String b;
        public final String c;
        public final wdt d;
        public final ArrayList e;

        public l(int i, String str, String str2, wdt wdtVar, ArrayList arrayList) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = wdtVar;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a == lVar.a && this.b.equals(lVar.b) && epx.f(this.c, lVar.c) && epx.f(this.d, lVar.d) && this.e.equals(lVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            wdt wdtVar = this.d;
            return this.e.hashCode() + ((hashCode + (wdtVar != null ? wdtVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesVerticalList(sectionId=");
            sb.append(this.a);
            sb.append(", sectionTrackCode=");
            sb.append(this.b);
            sb.append(", sectionRef=");
            sb.append(this.c);
            sb.append(", header=");
            sb.append(this.d);
            sb.append(", apps=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
        }
    }

    /* compiled from: GamesCatalogSection.kt */
    public static final class m extends GamesCatalogSection {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1554559827;
        }

        public final String toString() {
            return "Stub";
        }
    }
}
