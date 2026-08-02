package com.vk.games.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.zrp;

/* compiled from: GamesCatalogSection.kt */
/* loaded from: classes17.dex */
public final class GamesCatalogUser {
    public final UserId a;
    public final BaseSex b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GamesCatalogSection.kt */
    public static final class BaseSex {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BaseSex[] $VALUES;
        public static final BaseSex FEMALE;
        public static final BaseSex MALE;
        public static final BaseSex UNKNOWN;

        static {
            BaseSex baseSex = new BaseSex(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = baseSex;
            BaseSex baseSex2 = new BaseSex("MALE", 1);
            MALE = baseSex2;
            BaseSex baseSex3 = new BaseSex("FEMALE", 2);
            FEMALE = baseSex3;
            BaseSex[] baseSexArr = {baseSex, baseSex2, baseSex3};
            $VALUES = baseSexArr;
            $ENTRIES = new asp(baseSexArr);
        }

        public BaseSex() {
            throw null;
        }

        public static BaseSex valueOf(String str) {
            return (BaseSex) Enum.valueOf(BaseSex.class, str);
        }

        public static BaseSex[] values() {
            return (BaseSex[]) $VALUES.clone();
        }
    }

    public GamesCatalogUser(UserId userId, BaseSex baseSex, String str, String str2, String str3, String str4, String str5) {
        this.a = userId;
        this.b = baseSex;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesCatalogUser)) {
            return false;
        }
        GamesCatalogUser gamesCatalogUser = (GamesCatalogUser) obj;
        return epx.f(this.a, gamesCatalogUser.a) && this.b == gamesCatalogUser.b && epx.f(this.c, gamesCatalogUser.c) && epx.f(this.d, gamesCatalogUser.d) && epx.f(this.e, gamesCatalogUser.e) && epx.f(this.f, gamesCatalogUser.f) && epx.f(this.g, gamesCatalogUser.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogUser(id=");
        sb.append(this.a);
        sb.append(", sex=");
        sb.append(this.b);
        sb.append(", firstName=");
        sb.append(this.c);
        sb.append(", lastName=");
        sb.append(this.d);
        sb.append(", photo100=");
        sb.append(this.e);
        sb.append(", photo200=");
        sb.append(this.f);
        sb.append(", photoBase=");
        return ho8.a(sb, this.g, ')');
    }
}
