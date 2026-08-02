package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsEcommStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsEcommStat$TypeBannerClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("type")
    private final Type type;

    /* compiled from: MobileOfficialAppsEcommStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsEcommStat$TypeBannerClick>, a9y<MobileOfficialAppsEcommStat$TypeBannerClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("type");
            return new MobileOfficialAppsEcommStat$TypeBannerClick((Type) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Type.class)), fai.C(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsEcommStat$TypeBannerClick mobileOfficialAppsEcommStat$TypeBannerClick = (MobileOfficialAppsEcommStat$TypeBannerClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("type", tru.a().toJson(mobileOfficialAppsEcommStat$TypeBannerClick.a()));
            x9yVar.o("track_code", mobileOfficialAppsEcommStat$TypeBannerClick.a);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsEcommStat.kt */
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("click_major_link")
        public static final Type CLICK_MAJOR_LINK;

        @pmi0("hide_banner")
        public static final Type HIDE_BANNER;

        static {
            Type type = new Type("CLICK_MAJOR_LINK", 0);
            CLICK_MAJOR_LINK = type;
            Type type2 = new Type("HIDE_BANNER", 1);
            HIDE_BANNER = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsEcommStat$TypeBannerClick() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Type a() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsEcommStat$TypeBannerClick)) {
            return false;
        }
        MobileOfficialAppsEcommStat$TypeBannerClick mobileOfficialAppsEcommStat$TypeBannerClick = (MobileOfficialAppsEcommStat$TypeBannerClick) obj;
        return this.type == mobileOfficialAppsEcommStat$TypeBannerClick.type && epx.f(this.a, mobileOfficialAppsEcommStat$TypeBannerClick.a);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeBannerClick(type=");
        sb.append(this.type);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }

    public MobileOfficialAppsEcommStat$TypeBannerClick(Type type, String str) {
        this.type = type;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ MobileOfficialAppsEcommStat$TypeBannerClick(Type type, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : str);
    }
}
