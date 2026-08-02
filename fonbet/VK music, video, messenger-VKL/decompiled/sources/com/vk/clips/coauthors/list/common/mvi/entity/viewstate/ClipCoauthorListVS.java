package com.vk.clips.coauthors.list.common.mvi.entity.viewstate;

import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.ArrayList;
import xsna.asp;
import xsna.epx;
import xsna.kr;
import xsna.lm50;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ClipCoauthorListVS.kt */
/* loaded from: classes16.dex */
public final class ClipCoauthorListVS implements lm50 {
    public final ArrayList b;
    public final String c;
    public final boolean d;
    public final boolean e;

    /* compiled from: ClipCoauthorListVS.kt */
    public static final class Owner {
        public final UserId a;
        public final String b;
        public final String c;
        public final a d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final Type h;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipCoauthorListVS.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type Community;
            public static final Type Female;
            public static final Type Male;

            static {
                Type type = new Type("Male", 0);
                Male = type;
                Type type2 = new Type("Female", 1);
                Female = type2;
                Type type3 = new Type("Community", 2);
                Community = type3;
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

        /* compiled from: ClipCoauthorListVS.kt */
        public interface a {

            /* compiled from: ClipCoauthorListVS.kt */
            /* renamed from: com.vk.clips.coauthors.list.common.mvi.entity.viewstate.ClipCoauthorListVS$Owner$a$a, reason: collision with other inner class name */
            public static final class C0550a implements a {
                public static final C0550a a = new C0550a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0550a);
                }

                public final int hashCode() {
                    return -2080415934;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: ClipCoauthorListVS.kt */
            public static final class b implements a {
                public final boolean a;
                public final boolean b;

                public b(boolean z, boolean z2) {
                    this.a = z;
                    this.b = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a == bVar.a && this.b == bVar.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Visible(subscribed=");
                    sb.append(this.a);
                    sb.append(", enabled=");
                    return q0.a(sb, this.b, ')');
                }
            }
        }

        public Owner(UserId userId, String str, String str2, a aVar, boolean z, boolean z2, boolean z3, Type type) {
            this.a = userId;
            this.b = str;
            this.c = str2;
            this.d = aVar;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Owner)) {
                return false;
            }
            Owner owner = (Owner) obj;
            return epx.f(this.a, owner.a) && epx.f(this.b, owner.b) && epx.f(this.c, owner.c) && epx.f(this.d, owner.d) && this.e == owner.e && this.f == owner.f && this.g == owner.g && this.h == owner.h;
        }

        public final int hashCode() {
            return this.h.hashCode() + qoy.b(qoy.b(qoy.b((this.d.hashCode() + urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            return "Owner(id=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", subscribeState=" + this.d + ", isMain=" + this.e + ", canSetStatus=" + this.f + ", isApproved=" + this.g + ", type=" + this.h + ')';
        }
    }

    public ClipCoauthorListVS(String str, ArrayList arrayList, boolean z, boolean z2) {
        this.b = arrayList;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipCoauthorListVS)) {
            return false;
        }
        ClipCoauthorListVS clipCoauthorListVS = (ClipCoauthorListVS) obj;
        return this.b.equals(clipCoauthorListVS.b) && epx.f(this.c, clipCoauthorListVS.c) && this.d == clipCoauthorListVS.d && this.e == clipCoauthorListVS.e;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return Boolean.hashCode(this.e) + qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipCoauthorListVS(owners=");
        kr.d(this.b, sb, ", onboardingText=");
        sb.append(this.c);
        sb.append(", canEditCoowners=");
        sb.append(this.d);
        sb.append(", isCoauthorsRedesign=");
        return q0.a(sb, this.e, ')');
    }
}
