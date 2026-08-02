package com.vk.libvideo.api.ad;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: AdvertBannerState.kt */
/* loaded from: classes2.dex */
public final class AdChoice {
    public final String a;
    public final Type b;
    public final a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertBannerState.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ABOUT;
        public static final Type AGE;
        public static final Type COMPLAIN;
        public static final Type COPY_ERID;
        public static final Type OTHER;
        public static final Type RULES;

        static {
            Type type = new Type("AGE", 0);
            AGE = type;
            Type type2 = new Type("ABOUT", 1);
            ABOUT = type2;
            Type type3 = new Type("RULES", 2);
            RULES = type3;
            Type type4 = new Type("COPY_ERID", 3);
            COPY_ERID = type4;
            Type type5 = new Type(NativeAdContent.ViewTag.OTHER, 4);
            OTHER = type5;
            Type type6 = new Type("COMPLAIN", 5);
            COMPLAIN = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
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

    /* compiled from: AdvertBannerState.kt */
    public interface a {

        /* compiled from: AdvertBannerState.kt */
        /* renamed from: com.vk.libvideo.api.ad.AdChoice$a$a, reason: collision with other inner class name */
        public static final class C1193a implements a {
            public static final C1193a a = new C1193a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1193a);
            }

            public final int hashCode() {
                return -949260702;
            }

            public final String toString() {
                return "Complain";
            }
        }

        /* compiled from: AdvertBannerState.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
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
                return ho8.a(new StringBuilder("CopyERID(erid="), this.a, ')');
            }
        }

        /* compiled from: AdvertBannerState.kt */
        public static final class c implements a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CopyLink(url="), this.a, ')');
            }
        }

        /* compiled from: AdvertBannerState.kt */
        public static final class d implements a {
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
                return ho8.a(new StringBuilder("Redirect(url="), this.a, ')');
            }
        }
    }

    public AdChoice(String str, Type type, a aVar) {
        this.a = str;
        this.b = type;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdChoice)) {
            return false;
        }
        AdChoice adChoice = (AdChoice) obj;
        return epx.f(this.a, adChoice.a) && this.b == adChoice.b && epx.f(this.c, adChoice.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "AdChoice(text=" + this.a + ", type=" + this.b + ", action=" + this.c + ')';
    }
}
