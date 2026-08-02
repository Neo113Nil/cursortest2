package com.vk.dto.profile;

import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.zrp;

/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class DonutBanner {
    public final String a;
    public final String b;
    public final String c;
    public final a d;
    public final a e;
    public final DonutRegularSupport f;
    public final b g;
    public final DonutInfoBanner h;

    /* compiled from: DonutBanner.kt */
    public static final class DonutInfoBanner {
        public final Icon a;
        public final String b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DonutBanner.kt */
        public static final class Icon {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Icon[] $VALUES;
            public static final Icon ERROR;

            static {
                Icon icon = new Icon("ERROR", 0);
                ERROR = icon;
                Icon[] iconArr = {icon};
                $VALUES = iconArr;
                $ENTRIES = new asp(iconArr);
            }

            public Icon() {
                throw null;
            }

            public static Icon valueOf(String str) {
                return (Icon) Enum.valueOf(Icon.class, str);
            }

            public static Icon[] values() {
                return (Icon[]) $VALUES.clone();
            }
        }

        public DonutInfoBanner(Icon icon, String str) {
            this.a = icon;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DonutInfoBanner)) {
                return false;
            }
            DonutInfoBanner donutInfoBanner = (DonutInfoBanner) obj;
            return this.a == donutInfoBanner.a && epx.f(this.b, donutInfoBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutInfoBanner(icon=");
            sb.append(this.a);
            sb.append(", subhead=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: DonutBanner.kt */
    public static final class DonutRegularSupport {
        public final String a;
        public final a b;
        public final String c;
        public final String d;
        public final List<DonutBenefitBlock> e;

        /* compiled from: DonutBanner.kt */
        public static final class DonutBenefitBlock {
            public final String a;
            public final Type b;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: DonutBanner.kt */
            public static final class Type {
                private static final /* synthetic */ zrp $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type ARTICLE;
                public static final Type CHAT;
                public static final Type PODCAST;
                public static final Type POST;
                public static final Type VIDEO;
                private final String value;

                static {
                    Type type = new Type("ARTICLE", 0, "article");
                    ARTICLE = type;
                    Type type2 = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 1, "video");
                    VIDEO = type2;
                    Type type3 = new Type("PODCAST", 2, "podcast");
                    PODCAST = type3;
                    Type type4 = new Type("POST", 3, "post");
                    POST = type4;
                    Type type5 = new Type("CHAT", 4, "chat");
                    CHAT = type5;
                    Type[] typeArr = {type, type2, type3, type4, type5};
                    $VALUES = typeArr;
                    $ENTRIES = new asp(typeArr);
                }

                public Type(String str, int i, String str2) {
                    this.value = str2;
                }

                public static zrp<Type> h() {
                    return $ENTRIES;
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }

                public final String i() {
                    return this.value;
                }
            }

            public DonutBenefitBlock(String str, Type type) {
                this.a = str;
                this.b = type;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DonutBenefitBlock)) {
                    return false;
                }
                DonutBenefitBlock donutBenefitBlock = (DonutBenefitBlock) obj;
                return epx.f(this.a, donutBenefitBlock.a) && this.b == donutBenefitBlock.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "DonutBenefitBlock(description=" + this.a + ", type=" + this.b + ')';
            }
        }

        public DonutRegularSupport(String str, a aVar, String str2, String str3, ArrayList arrayList) {
            this.a = str;
            this.b = aVar;
            this.c = str2;
            this.d = str3;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DonutRegularSupport)) {
                return false;
            }
            DonutRegularSupport donutRegularSupport = (DonutRegularSupport) obj;
            return epx.f(this.a, donutRegularSupport.a) && epx.f(this.b, donutRegularSupport.b) && epx.f(this.c, donutRegularSupport.c) && epx.f(this.d, donutRegularSupport.d) && epx.f(this.e, donutRegularSupport.e);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<DonutBenefitBlock> list = this.e;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutRegularSupport(title=");
            sb.append(this.a);
            sb.append(", actionButton=");
            sb.append(this.b);
            sb.append(", subtitle=");
            sb.append(this.c);
            sb.append(", accessibilitySubtitle=");
            sb.append(this.d);
            sb.append(", benefits=");
            return ms9.a(')', sb, this.e);
        }
    }

    /* compiled from: DonutBanner.kt */
    public static final class a {
        public final String a;
        public final Action b;
        public final String c;

        public a(String str, ActionOpenUrl actionOpenUrl, String str2) {
            this.a = str;
            this.b = actionOpenUrl;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Action action = this.b;
            int hashCode2 = (hashCode + (action == null ? 0 : action.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutBannerNewButton(title=");
            sb.append(this.a);
            sb.append(", action=");
            sb.append(this.b);
            sb.append(", accessibilityTitle=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: DonutBanner.kt */
    public static final class b {
        public final String a;
        public final a b;
        public final String c;

        public b(String str, a aVar, String str2) {
            this.a = str;
            this.b = aVar;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutGoalsInfo(title=");
            sb.append(this.a);
            sb.append(", actionButton=");
            sb.append(this.b);
            sb.append(", subtitle=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public DonutBanner(String str, String str2, String str3, a aVar, a aVar2, DonutRegularSupport donutRegularSupport, b bVar, DonutInfoBanner donutInfoBanner) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = aVar2;
        this.f = donutRegularSupport;
        this.g = bVar;
        this.h = donutInfoBanner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutBanner)) {
            return false;
        }
        DonutBanner donutBanner = (DonutBanner) obj;
        return epx.f(this.a, donutBanner.a) && epx.f(this.b, donutBanner.b) && epx.f(this.c, donutBanner.c) && epx.f(this.d, donutBanner.d) && epx.f(this.e, donutBanner.e) && epx.f(this.f, donutBanner.f) && epx.f(this.g, donutBanner.g) && epx.f(this.h, donutBanner.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.d;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.e;
        int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        DonutRegularSupport donutRegularSupport = this.f;
        int hashCode6 = (hashCode5 + (donutRegularSupport == null ? 0 : donutRegularSupport.hashCode())) * 31;
        b bVar = this.g;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        DonutInfoBanner donutInfoBanner = this.h;
        return hashCode7 + (donutInfoBanner != null ? donutInfoBanner.hashCode() : 0);
    }

    public final String toString() {
        return "DonutBanner(title=" + this.a + ", description=" + this.b + ", discount=" + this.c + ", aboutButton=" + this.d + ", settingsButton=" + this.e + ", regularSupport=" + this.f + ", goalsInfo=" + this.g + ", infoBanner=" + this.h + ')';
    }
}
