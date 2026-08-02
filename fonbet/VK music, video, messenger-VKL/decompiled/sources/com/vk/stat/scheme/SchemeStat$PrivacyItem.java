package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.ms9;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$PrivacyItem {

    @pmi0("privacy_type")
    private final PrivacyType privacyType;

    @pmi0(ApiProtocol.PARAM_UIDS)
    private final List<Long> uids;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public static final class PrivacyType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PrivacyType[] $VALUES;
        public static final PrivacyType ALL_USERS;
        public static final PrivacyType FRIENDS_AND_FRIENDS_OF_FRIENDS;
        public static final PrivacyType FRIENDS_ONLY;
        public static final PrivacyType ONLY_FOR_ME;
        public static final PrivacyType SOME_FRIENDS;
        public static final PrivacyType UNKNOWN;
        private final int value;

        /* compiled from: SchemeStat.kt */
        public static final class Serializer implements uay<PrivacyType> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((PrivacyType) obj).value));
            }
        }

        static {
            PrivacyType privacyType = new PrivacyType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = privacyType;
            PrivacyType privacyType2 = new PrivacyType("ALL_USERS", 1, 1);
            ALL_USERS = privacyType2;
            PrivacyType privacyType3 = new PrivacyType("FRIENDS_ONLY", 2, 2);
            FRIENDS_ONLY = privacyType3;
            PrivacyType privacyType4 = new PrivacyType("FRIENDS_AND_FRIENDS_OF_FRIENDS", 3, 3);
            FRIENDS_AND_FRIENDS_OF_FRIENDS = privacyType4;
            PrivacyType privacyType5 = new PrivacyType("ONLY_FOR_ME", 4, 4);
            ONLY_FOR_ME = privacyType5;
            PrivacyType privacyType6 = new PrivacyType("SOME_FRIENDS", 5, 5);
            SOME_FRIENDS = privacyType6;
            PrivacyType[] privacyTypeArr = {privacyType, privacyType2, privacyType3, privacyType4, privacyType5, privacyType6};
            $VALUES = privacyTypeArr;
            $ENTRIES = new asp(privacyTypeArr);
        }

        public PrivacyType(String str, int i, int i2) {
            this.value = i2;
        }

        public static PrivacyType valueOf(String str) {
            return (PrivacyType) Enum.valueOf(PrivacyType.class, str);
        }

        public static PrivacyType[] values() {
            return (PrivacyType[]) $VALUES.clone();
        }
    }

    public SchemeStat$PrivacyItem(PrivacyType privacyType, List<Long> list) {
        this.privacyType = privacyType;
        this.uids = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$PrivacyItem)) {
            return false;
        }
        SchemeStat$PrivacyItem schemeStat$PrivacyItem = (SchemeStat$PrivacyItem) obj;
        return this.privacyType == schemeStat$PrivacyItem.privacyType && epx.f(this.uids, schemeStat$PrivacyItem.uids);
    }

    public final int hashCode() {
        int hashCode = this.privacyType.hashCode() * 31;
        List<Long> list = this.uids;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacyItem(privacyType=");
        sb.append(this.privacyType);
        sb.append(", uids=");
        return ms9.a(')', sb, this.uids);
    }

    public /* synthetic */ SchemeStat$PrivacyItem(PrivacyType privacyType, List list, int i, zcl zclVar) {
        this(privacyType, (i & 2) != 0 ? null : list);
    }
}
