package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.Gson;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.c9h0;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.uqi;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeShareItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("external_app_package_name")
    private final FilteredString filteredExternalAppPackageName;

    @pmi0("share_item")
    private final SchemeStat$EventItem shareItem;

    @pmi0("share_result_ids")
    private final List<String> shareResultIds;

    @pmi0("share_type")
    private final ShareType shareType;

    @pmi0("targets_count")
    private final Integer targetsCount;

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeShareItem>, a9y<SchemeStat$TypeShareItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            ShareType shareType = (ShareType) dq.f(x9yVar, "share_type", tru.a(), ShareType.class);
            String C = fai.C(x9yVar, "external_app_package_name");
            Gson a = tru.a();
            b9y q = x9yVar.q("share_item");
            Object obj = null;
            SchemeStat$EventItem schemeStat$EventItem = (SchemeStat$EventItem) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), SchemeStat$EventItem.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("share_result_ids");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(x9yVar.q("share_result_ids").k(), new c9h0().getType());
            }
            return new SchemeStat$TypeShareItem(shareType, C, schemeStat$EventItem, (List) obj, fai.A(x9yVar, "targets_count"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeShareItem schemeStat$TypeShareItem = (SchemeStat$TypeShareItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("share_type", tru.a().toJson(schemeStat$TypeShareItem.c()));
            x9yVar.o("external_app_package_name", schemeStat$TypeShareItem.a);
            x9yVar.o("share_item", tru.a().toJson(schemeStat$TypeShareItem.a()));
            x9yVar.o("share_result_ids", tru.a().toJson(schemeStat$TypeShareItem.b()));
            x9yVar.n("targets_count", schemeStat$TypeShareItem.d());
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class ShareType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ShareType[] $VALUES;

        @pmi0("add_fave")
        public static final ShareType ADD_FAVE;

        @pmi0("community_wall")
        public static final ShareType COMMUNITY_WALL;

        @pmi0("copy_link")
        public static final ShareType COPY_LINK;

        @pmi0("create_chat")
        public static final ShareType CREATE_CHAT;

        @pmi0("email")
        public static final ShareType EMAIL;

        @pmi0("external_app")
        public static final ShareType EXTERNAL_APP;

        @pmi0("external_dialog")
        public static final ShareType EXTERNAL_DIALOG;

        @pmi0("message")
        public static final ShareType MESSAGE;

        @pmi0("other")
        public static final ShareType OTHER;

        @pmi0("own_wall")
        public static final ShareType OWN_WALL;

        @pmi0("qr")
        public static final ShareType QR;

        @pmi0("remove_fave")
        public static final ShareType REMOVE_FAVE;

        @pmi0("sms")
        public static final ShareType SMS;

        @pmi0("story")
        public static final ShareType STORY;

        static {
            ShareType shareType = new ShareType("COPY_LINK", 0);
            COPY_LINK = shareType;
            ShareType shareType2 = new ShareType("OWN_WALL", 1);
            OWN_WALL = shareType2;
            ShareType shareType3 = new ShareType("COMMUNITY_WALL", 2);
            COMMUNITY_WALL = shareType3;
            ShareType shareType4 = new ShareType("MESSAGE", 3);
            MESSAGE = shareType4;
            ShareType shareType5 = new ShareType("QR", 4);
            QR = shareType5;
            ShareType shareType6 = new ShareType(NativeAdContent.ViewTag.OTHER, 5);
            OTHER = shareType6;
            ShareType shareType7 = new ShareType(CommonConstant.RETKEY.EMAIL, 6);
            EMAIL = shareType7;
            ShareType shareType8 = new ShareType("SMS", 7);
            SMS = shareType8;
            ShareType shareType9 = new ShareType("STORY", 8);
            STORY = shareType9;
            ShareType shareType10 = new ShareType("EXTERNAL_APP", 9);
            EXTERNAL_APP = shareType10;
            ShareType shareType11 = new ShareType("EXTERNAL_DIALOG", 10);
            EXTERNAL_DIALOG = shareType11;
            ShareType shareType12 = new ShareType("CREATE_CHAT", 11);
            CREATE_CHAT = shareType12;
            ShareType shareType13 = new ShareType("ADD_FAVE", 12);
            ADD_FAVE = shareType13;
            ShareType shareType14 = new ShareType("REMOVE_FAVE", 13);
            REMOVE_FAVE = shareType14;
            ShareType[] shareTypeArr = {shareType, shareType2, shareType3, shareType4, shareType5, shareType6, shareType7, shareType8, shareType9, shareType10, shareType11, shareType12, shareType13, shareType14};
            $VALUES = shareTypeArr;
            $ENTRIES = new asp(shareTypeArr);
        }

        private ShareType(String str, int i) {
        }

        public static zrp<ShareType> h() {
            return $ENTRIES;
        }

        public static ShareType valueOf(String str) {
            return (ShareType) Enum.valueOf(ShareType.class, str);
        }

        public static ShareType[] values() {
            return (ShareType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeShareItem(ShareType shareType, String str, SchemeStat$EventItem schemeStat$EventItem, List<String> list, Integer num) {
        this.shareType = shareType;
        this.a = str;
        this.shareItem = schemeStat$EventItem;
        this.shareResultIds = list;
        this.targetsCount = num;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredExternalAppPackageName = filteredString;
        filteredString.a(str);
    }

    public final SchemeStat$EventItem a() {
        return this.shareItem;
    }

    public final List<String> b() {
        return this.shareResultIds;
    }

    public final ShareType c() {
        return this.shareType;
    }

    public final Integer d() {
        return this.targetsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeShareItem)) {
            return false;
        }
        SchemeStat$TypeShareItem schemeStat$TypeShareItem = (SchemeStat$TypeShareItem) obj;
        return this.shareType == schemeStat$TypeShareItem.shareType && epx.f(this.a, schemeStat$TypeShareItem.a) && epx.f(this.shareItem, schemeStat$TypeShareItem.shareItem) && epx.f(this.shareResultIds, schemeStat$TypeShareItem.shareResultIds) && epx.f(this.targetsCount, schemeStat$TypeShareItem.targetsCount);
    }

    public final int hashCode() {
        int hashCode = this.shareType.hashCode() * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SchemeStat$EventItem schemeStat$EventItem = this.shareItem;
        int hashCode3 = (hashCode2 + (schemeStat$EventItem == null ? 0 : schemeStat$EventItem.hashCode())) * 31;
        List<String> list = this.shareResultIds;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.targetsCount;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeShareItem(shareType=");
        sb.append(this.shareType);
        sb.append(", externalAppPackageName=");
        sb.append(this.a);
        sb.append(", shareItem=");
        sb.append(this.shareItem);
        sb.append(", shareResultIds=");
        sb.append(this.shareResultIds);
        sb.append(", targetsCount=");
        return uqi.b(sb, this.targetsCount, ')');
    }

    public /* synthetic */ SchemeStat$TypeShareItem(ShareType shareType, String str, SchemeStat$EventItem schemeStat$EventItem, List list, Integer num, int i, zcl zclVar) {
        this(shareType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : schemeStat$EventItem, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : num);
    }
}
