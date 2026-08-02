package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeGameAppView implements SchemeStat$TypeView.b {

    @pmi0("app_id")
    private final int appId;

    @pmi0("track_code")
    private final CommonStat$TypeTrackCodeItem trackCode;

    @pmi0("type")
    private final Type type;

    @pmi0("view_percentage")
    private final Integer viewPercentage;

    @pmi0("vk_ref")
    private final String vkRef;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("app_view")
        public static final Type APP_VIEW;

        @pmi0("app_view_part")
        public static final Type APP_VIEW_PART;

        static {
            Type type = new Type("APP_VIEW", 0);
            APP_VIEW = type;
            Type type2 = new Type("APP_VIEW_PART", 1);
            APP_VIEW_PART = type2;
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

    public MobileOfficialAppsMiniappsStat$TypeGameAppView(Type type, int i, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, String str, Integer num) {
        this.type = type;
        this.appId = i;
        this.trackCode = commonStat$TypeTrackCodeItem;
        this.vkRef = str;
        this.viewPercentage = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeGameAppView)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeGameAppView mobileOfficialAppsMiniappsStat$TypeGameAppView = (MobileOfficialAppsMiniappsStat$TypeGameAppView) obj;
        return this.type == mobileOfficialAppsMiniappsStat$TypeGameAppView.type && this.appId == mobileOfficialAppsMiniappsStat$TypeGameAppView.appId && epx.f(this.trackCode, mobileOfficialAppsMiniappsStat$TypeGameAppView.trackCode) && epx.f(this.vkRef, mobileOfficialAppsMiniappsStat$TypeGameAppView.vkRef) && epx.f(this.viewPercentage, mobileOfficialAppsMiniappsStat$TypeGameAppView.viewPercentage);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.appId, this.type.hashCode() * 31, 31), 31, this.trackCode.a);
        String str = this.vkRef;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.viewPercentage;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeGameAppView(type=");
        sb.append(this.type);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", vkRef=");
        sb.append(this.vkRef);
        sb.append(", viewPercentage=");
        return uqi.b(sb, this.viewPercentage, ')');
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeGameAppView(Type type, int i, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, String str, Integer num, int i2, zcl zclVar) {
        this(type, i, commonStat$TypeTrackCodeItem, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : num);
    }
}
