package com.vk.profile.design.view.profileheader;

import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import xsna.asp;
import xsna.baf0;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.ho8;
import xsna.j5g;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: UserProfileBaseInfoState.kt */
/* loaded from: classes5.dex */
public final class UserProfileBaseInfoState {
    public final d a;
    public final a b;
    public final String c;
    public final b d;
    public final String e;
    public final c f;
    public final VerifyInfo g;
    public final String h;
    public final String i;

    /* compiled from: UserProfileBaseInfoState.kt */
    public static final class VerifyInfo {
        public final baf0 a;
        public final boolean b;
        public final String c;
        public final VerificationType d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UserProfileBaseInfoState.kt */
        public static final class VerificationType {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ VerificationType[] $VALUES;
            public static final VerificationType ServiceVerified;
            public static final VerificationType VkVerified;

            static {
                VerificationType verificationType = new VerificationType("VkVerified", 0);
                VkVerified = verificationType;
                VerificationType verificationType2 = new VerificationType("ServiceVerified", 1);
                ServiceVerified = verificationType2;
                VerificationType[] verificationTypeArr = {verificationType, verificationType2};
                $VALUES = verificationTypeArr;
                $ENTRIES = new asp(verificationTypeArr);
            }

            public VerificationType() {
                throw null;
            }

            public static VerificationType valueOf(String str) {
                return (VerificationType) Enum.valueOf(VerificationType.class, str);
            }

            public static VerificationType[] values() {
                return (VerificationType[]) $VALUES.clone();
            }
        }

        public VerifyInfo(baf0 baf0Var, boolean z, String str, VerificationType verificationType) {
            this.a = baf0Var;
            this.b = z;
            this.c = str;
            this.d = verificationType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerifyInfo)) {
                return false;
            }
            VerifyInfo verifyInfo = (VerifyInfo) obj;
            return this.a.equals(verifyInfo.a) && this.b == verifyInfo.b && epx.f(this.c, verifyInfo.c) && this.d == verifyInfo.d;
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            VerificationType verificationType = this.d;
            return hashCode + (verificationType != null ? verificationType.hashCode() : 0);
        }

        public final String toString() {
            return "VerifyInfo(icon=" + this.a + ", iconAlignedLeft=" + this.b + ", contentDescription=" + this.c + ", verificationType=" + this.d + ')';
        }
    }

    /* compiled from: UserProfileBaseInfoState.kt */
    public static final class a {
        public final CharSequence a;
        public final String b;

        public a() {
            this("", "");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Description(text=");
            sb.append((Object) this.a);
            sb.append(", contentDescription=");
            return ho8.a(sb, this.b, ')');
        }

        public a(CharSequence charSequence, String str) {
            this.a = charSequence;
            this.b = str;
        }
    }

    /* compiled from: UserProfileBaseInfoState.kt */
    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
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
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageStatus(url=");
            sb.append(this.a);
            sb.append(", contentDescription=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: UserProfileBaseInfoState.kt */
    public static final class c {
        public final String a;
        public final String b;
        public final a c;
        public final boolean d;
        public final String e;

        /* compiled from: UserProfileBaseInfoState.kt */
        public static final class a {
            public final String a;
            public final int b;
            public final String c;

            public a(String str, int i, String str2) {
                this.a = str;
                this.b = i;
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
                return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int a = shy.a(this.b, this.a.hashCode() * 31, 31);
                String str = this.c;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Activity(title=");
                sb.append(this.a);
                sb.append(", drawableResId=");
                sb.append(this.b);
                sb.append(", imageUrl=");
                return ho8.a(sb, this.c, ')');
            }
        }

        public c() {
            this(null, null, null, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            a aVar = this.c;
            return Boolean.hashCode(this.d) + ((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SecondaryUserInfo(detailedInfoText=");
            sb.append(this.a);
            sb.append(", location=");
            sb.append(this.b);
            sb.append(", activity=");
            sb.append(this.c);
            sb.append(", hasInfo=");
            return q0.a(sb, this.d, ')');
        }

        public c(String str, String str2, a aVar, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = aVar;
            this.d = z;
            List l = e43.l(str2, aVar != null ? aVar.a : null, z ? str : null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : l) {
                String str3 = (String) obj;
                if (str3 != null && !drm0.N(str3)) {
                    arrayList.add(obj);
                }
            }
            this.e = j5g.g0(arrayList, " ", null, null, 0, null, 62);
        }
    }

    /* compiled from: UserProfileBaseInfoState.kt */
    public static final class d {
        public final String a;
        public final String b;

        public d() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserName(fullName=");
            sb.append(this.a);
            sb.append(", contentDescription=");
            return ho8.a(sb, this.b, ')');
        }

        public /* synthetic */ d(int i) {
            this("", "");
        }

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public UserProfileBaseInfoState() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileBaseInfoState)) {
            return false;
        }
        UserProfileBaseInfoState userProfileBaseInfoState = (UserProfileBaseInfoState) obj;
        return epx.f(this.a, userProfileBaseInfoState.a) && epx.f(this.b, userProfileBaseInfoState.b) && epx.f(this.c, userProfileBaseInfoState.c) && epx.f(this.d, userProfileBaseInfoState.d) && epx.f(this.e, userProfileBaseInfoState.e) && epx.f(this.f, userProfileBaseInfoState.f) && epx.f(this.g, userProfileBaseInfoState.g) && epx.f(this.h, userProfileBaseInfoState.h) && epx.f(this.i, userProfileBaseInfoState.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.d;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.f;
        int hashCode6 = (hashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        VerifyInfo verifyInfo = this.g;
        int hashCode7 = (hashCode6 + (verifyInfo == null ? 0 : verifyInfo.hashCode())) * 31;
        String str3 = this.h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return hashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserProfileBaseInfoState(userName=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", screenName=");
        sb.append(this.c);
        sb.append(", imageStatus=");
        sb.append(this.d);
        sb.append(", musicTrack=");
        sb.append(this.e);
        sb.append(", secondaryInfo=");
        sb.append(this.f);
        sb.append(", verifyInfo=");
        sb.append(this.g);
        sb.append(", deadUserText=");
        sb.append(this.h);
        sb.append(", emptyInfoText=");
        return ho8.a(sb, this.i, ')');
    }

    public UserProfileBaseInfoState(d dVar, a aVar, String str, b bVar, String str2, c cVar, VerifyInfo verifyInfo, String str3, String str4) {
        this.a = dVar;
        this.b = aVar;
        this.c = str;
        this.d = bVar;
        this.e = str2;
        this.f = cVar;
        this.g = verifyInfo;
        this.h = str3;
        this.i = str4;
    }

    public /* synthetic */ UserProfileBaseInfoState(int i) {
        this(new d(0), null, null, null, null, null, null, null, null);
    }
}
