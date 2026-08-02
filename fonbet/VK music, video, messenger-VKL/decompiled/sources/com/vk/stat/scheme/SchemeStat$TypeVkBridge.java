package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
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

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeVkBridge implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("app_id")
    private final Integer appId;
    public final transient String b;
    public final transient String c;

    @pmi0("error")
    private final SchemeStat$VkbridgeErrorItem error;

    @pmi0("event_name")
    private final String eventName;

    @pmi0("call_arguments")
    private final FilteredString filteredCallArguments;

    @pmi0("session_uuid")
    private final FilteredString filteredSessionUuid;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("internal_arguments")
    private final String internalArguments;

    @pmi0("success")
    private final Boolean success;

    @pmi0("type")
    private final Type type;

    @pmi0("type_vk_bridge_share_item")
    private final SchemeStat$TypeVkBridgeShareItem typeVkBridgeShareItem;

    @pmi0("type_vk_bridge_show_native_ads_item")
    private final SchemeStat$TypeVkBridgeShowNativeAdsItem typeVkBridgeShowNativeAdsItem;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeVkBridge>, a9y<SchemeStat$TypeVkBridge> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("type");
            Object obj = null;
            Type type = (Type) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Type.class));
            String C = fai.C(x9yVar, "event_name");
            Integer A = fai.A(x9yVar, "app_id");
            String C2 = fai.C(x9yVar, "webview_url");
            Boolean y = fai.y(x9yVar, "success");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("error");
            SchemeStat$VkbridgeErrorItem schemeStat$VkbridgeErrorItem = (SchemeStat$VkbridgeErrorItem) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), SchemeStat$VkbridgeErrorItem.class));
            String C3 = fai.C(x9yVar, "call_arguments");
            String C4 = fai.C(x9yVar, "internal_arguments");
            String C5 = fai.C(x9yVar, "track_code");
            String C6 = fai.C(x9yVar, "session_uuid");
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("type_vk_bridge_show_native_ads_item");
            SchemeStat$TypeVkBridgeShowNativeAdsItem schemeStat$TypeVkBridgeShowNativeAdsItem = (SchemeStat$TypeVkBridgeShowNativeAdsItem) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(q3.k(), SchemeStat$TypeVkBridgeShowNativeAdsItem.class));
            Gson a4 = tru.a();
            b9y q4 = x9yVar.q("type_vk_bridge_share_item");
            if (q4 != null && !(q4 instanceof u9y)) {
                obj = a4.fromJson(q4.k(), (Class<Object>) SchemeStat$TypeVkBridgeShareItem.class);
            }
            return new SchemeStat$TypeVkBridge(type, C, A, C2, y, schemeStat$VkbridgeErrorItem, C3, C4, C5, C6, schemeStat$TypeVkBridgeShowNativeAdsItem, (SchemeStat$TypeVkBridgeShareItem) obj, null);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeVkBridge schemeStat$TypeVkBridge = (SchemeStat$TypeVkBridge) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("type", tru.a().toJson(schemeStat$TypeVkBridge.g()));
            x9yVar.o("event_name", schemeStat$TypeVkBridge.d());
            x9yVar.n("app_id", schemeStat$TypeVkBridge.b());
            x9yVar.o("webview_url", schemeStat$TypeVkBridge.j());
            x9yVar.m(schemeStat$TypeVkBridge.f(), "success");
            x9yVar.o("error", tru.a().toJson(schemeStat$TypeVkBridge.c()));
            x9yVar.o("call_arguments", schemeStat$TypeVkBridge.a);
            x9yVar.o("internal_arguments", schemeStat$TypeVkBridge.e());
            x9yVar.o("track_code", schemeStat$TypeVkBridge.b);
            x9yVar.o("session_uuid", schemeStat$TypeVkBridge.c);
            x9yVar.o("type_vk_bridge_show_native_ads_item", tru.a().toJson(schemeStat$TypeVkBridge.i()));
            x9yVar.o("type_vk_bridge_share_item", tru.a().toJson(schemeStat$TypeVkBridge.h()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_vk_bridge_common_item")
        public static final Type TYPE_VK_BRIDGE_COMMON_ITEM;

        @pmi0("type_vk_bridge_share_item")
        public static final Type TYPE_VK_BRIDGE_SHARE_ITEM;

        @pmi0("type_vk_bridge_show_native_ads_item")
        public static final Type TYPE_VK_BRIDGE_SHOW_NATIVE_ADS_ITEM;

        static {
            Type type = new Type("TYPE_VK_BRIDGE_COMMON_ITEM", 0);
            TYPE_VK_BRIDGE_COMMON_ITEM = type;
            Type type2 = new Type("TYPE_VK_BRIDGE_SHOW_NATIVE_ADS_ITEM", 1);
            TYPE_VK_BRIDGE_SHOW_NATIVE_ADS_ITEM = type2;
            Type type3 = new Type("TYPE_VK_BRIDGE_SHARE_ITEM", 2);
            TYPE_VK_BRIDGE_SHARE_ITEM = type3;
            Type[] typeArr = {type, type2, type3};
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

    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static SchemeStat$TypeVkBridge a(String str, Integer num, String str2, Boolean bool, SchemeStat$VkbridgeErrorItem schemeStat$VkbridgeErrorItem, String str3, String str4, String str5, b bVar, int i) {
            SchemeStat$VkbridgeErrorItem schemeStat$VkbridgeErrorItem2 = (i & 16) != 0 ? null : schemeStat$VkbridgeErrorItem;
            String str6 = (i & 32) != 0 ? null : str3;
            String str7 = (i & 128) != 0 ? null : str4;
            String str8 = (i & 256) != 0 ? null : str5;
            b bVar2 = (i & 512) == 0 ? bVar : null;
            String str9 = null;
            if (bVar2 == null) {
                return new SchemeStat$TypeVkBridge(null, str, num, str2, bool, schemeStat$VkbridgeErrorItem2, str6, str9, str7, str8, null, null, 3072, null);
            }
            if (bVar2 instanceof SchemeStat$TypeVkBridgeShowNativeAdsItem) {
                return new SchemeStat$TypeVkBridge(Type.TYPE_VK_BRIDGE_SHOW_NATIVE_ADS_ITEM, str, num, str2, bool, schemeStat$VkbridgeErrorItem2, str6, str9, str7, str8, (SchemeStat$TypeVkBridgeShowNativeAdsItem) bVar2, null, 2048, null);
            }
            if (bVar2 instanceof SchemeStat$TypeVkBridgeShareItem) {
                return new SchemeStat$TypeVkBridge(Type.TYPE_VK_BRIDGE_SHARE_ITEM, str, num, str2, bool, schemeStat$VkbridgeErrorItem2, str6, str9, str7, str8, null, (SchemeStat$TypeVkBridgeShareItem) bVar2, 1024, null);
            }
            throw new IllegalArgumentException("payload must be one of(TypeVkBridgeShowNativeAdsItem, TypeVkBridgeShareItem)");
        }
    }

    /* compiled from: SchemeStat.kt */
    public interface b {
    }

    public /* synthetic */ SchemeStat$TypeVkBridge(Type type, String str, Integer num, String str2, Boolean bool, SchemeStat$VkbridgeErrorItem schemeStat$VkbridgeErrorItem, String str3, String str4, String str5, String str6, SchemeStat$TypeVkBridgeShowNativeAdsItem schemeStat$TypeVkBridgeShowNativeAdsItem, SchemeStat$TypeVkBridgeShareItem schemeStat$TypeVkBridgeShareItem, zcl zclVar) {
        this(type, str, num, str2, bool, schemeStat$VkbridgeErrorItem, str3, str4, str5, str6, schemeStat$TypeVkBridgeShowNativeAdsItem, schemeStat$TypeVkBridgeShareItem);
    }

    public static SchemeStat$TypeVkBridge a(SchemeStat$TypeVkBridge schemeStat$TypeVkBridge, Type type) {
        return new SchemeStat$TypeVkBridge(type, schemeStat$TypeVkBridge.eventName, schemeStat$TypeVkBridge.appId, schemeStat$TypeVkBridge.webviewUrl, schemeStat$TypeVkBridge.success, schemeStat$TypeVkBridge.error, schemeStat$TypeVkBridge.a, schemeStat$TypeVkBridge.internalArguments, schemeStat$TypeVkBridge.b, schemeStat$TypeVkBridge.c, schemeStat$TypeVkBridge.typeVkBridgeShowNativeAdsItem, schemeStat$TypeVkBridge.typeVkBridgeShareItem);
    }

    public final Integer b() {
        return this.appId;
    }

    public final SchemeStat$VkbridgeErrorItem c() {
        return this.error;
    }

    public final String d() {
        return this.eventName;
    }

    public final String e() {
        return this.internalArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeVkBridge)) {
            return false;
        }
        SchemeStat$TypeVkBridge schemeStat$TypeVkBridge = (SchemeStat$TypeVkBridge) obj;
        return this.type == schemeStat$TypeVkBridge.type && epx.f(this.eventName, schemeStat$TypeVkBridge.eventName) && epx.f(this.appId, schemeStat$TypeVkBridge.appId) && epx.f(this.webviewUrl, schemeStat$TypeVkBridge.webviewUrl) && epx.f(this.success, schemeStat$TypeVkBridge.success) && epx.f(this.error, schemeStat$TypeVkBridge.error) && epx.f(this.a, schemeStat$TypeVkBridge.a) && epx.f(this.internalArguments, schemeStat$TypeVkBridge.internalArguments) && epx.f(this.b, schemeStat$TypeVkBridge.b) && epx.f(this.c, schemeStat$TypeVkBridge.c) && epx.f(this.typeVkBridgeShowNativeAdsItem, schemeStat$TypeVkBridge.typeVkBridgeShowNativeAdsItem) && epx.f(this.typeVkBridgeShareItem, schemeStat$TypeVkBridge.typeVkBridgeShareItem);
    }

    public final Boolean f() {
        return this.success;
    }

    public final Type g() {
        return this.type;
    }

    public final SchemeStat$TypeVkBridgeShareItem h() {
        return this.typeVkBridgeShareItem;
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        String str = this.eventName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.appId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.webviewUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.success;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        SchemeStat$VkbridgeErrorItem schemeStat$VkbridgeErrorItem = this.error;
        int hashCode6 = (hashCode5 + (schemeStat$VkbridgeErrorItem == null ? 0 : schemeStat$VkbridgeErrorItem.hashCode())) * 31;
        String str3 = this.a;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.internalArguments;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.b;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.c;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SchemeStat$TypeVkBridgeShowNativeAdsItem schemeStat$TypeVkBridgeShowNativeAdsItem = this.typeVkBridgeShowNativeAdsItem;
        int hashCode11 = (hashCode10 + (schemeStat$TypeVkBridgeShowNativeAdsItem == null ? 0 : schemeStat$TypeVkBridgeShowNativeAdsItem.hashCode())) * 31;
        SchemeStat$TypeVkBridgeShareItem schemeStat$TypeVkBridgeShareItem = this.typeVkBridgeShareItem;
        return hashCode11 + (schemeStat$TypeVkBridgeShareItem != null ? schemeStat$TypeVkBridgeShareItem.hashCode() : 0);
    }

    public final SchemeStat$TypeVkBridgeShowNativeAdsItem i() {
        return this.typeVkBridgeShowNativeAdsItem;
    }

    public final String j() {
        return this.webviewUrl;
    }

    public final String toString() {
        return "TypeVkBridge(type=" + this.type + ", eventName=" + this.eventName + ", appId=" + this.appId + ", webviewUrl=" + this.webviewUrl + ", success=" + this.success + ", error=" + this.error + ", callArguments=" + this.a + ", internalArguments=" + this.internalArguments + ", trackCode=" + this.b + ", sessionUuid=" + this.c + ", typeVkBridgeShowNativeAdsItem=" + this.typeVkBridgeShowNativeAdsItem + ", typeVkBridgeShareItem=" + this.typeVkBridgeShareItem + ')';
    }

    private SchemeStat$TypeVkBridge(Type type, String str, Integer num, String str2, Boolean bool, SchemeStat$VkbridgeErrorItem schemeStat$VkbridgeErrorItem, String str3, String str4, String str5, String str6, SchemeStat$TypeVkBridgeShowNativeAdsItem schemeStat$TypeVkBridgeShowNativeAdsItem, SchemeStat$TypeVkBridgeShareItem schemeStat$TypeVkBridgeShareItem) {
        this.type = type;
        this.eventName = str;
        this.appId = num;
        this.webviewUrl = str2;
        this.success = bool;
        this.error = schemeStat$VkbridgeErrorItem;
        this.a = str3;
        this.internalArguments = str4;
        this.b = str5;
        this.c = str6;
        this.typeVkBridgeShowNativeAdsItem = schemeStat$TypeVkBridgeShowNativeAdsItem;
        this.typeVkBridgeShareItem = schemeStat$TypeVkBridgeShareItem;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredCallArguments = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(36));
        this.filteredSessionUuid = filteredString3;
        filteredString.a(str3);
        filteredString2.a(str5);
        filteredString3.a(str6);
    }

    public /* synthetic */ SchemeStat$TypeVkBridge(Type type, String str, Integer num, String str2, Boolean bool, SchemeStat$VkbridgeErrorItem schemeStat$VkbridgeErrorItem, String str3, String str4, String str5, String str6, SchemeStat$TypeVkBridgeShowNativeAdsItem schemeStat$TypeVkBridgeShowNativeAdsItem, SchemeStat$TypeVkBridgeShareItem schemeStat$TypeVkBridgeShareItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : schemeStat$VkbridgeErrorItem, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : schemeStat$TypeVkBridgeShowNativeAdsItem, (i & 2048) != 0 ? null : schemeStat$TypeVkBridgeShareItem);
    }
}
