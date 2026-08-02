package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeMiniAppCustomEventItem implements SchemeStat$TypeAction.b {
    public final transient String a;
    public final transient String b;
    public final transient String c;

    @pmi0("client_time")
    private final long clientTime;
    public final transient String d;
    public final transient String e;
    public final transient String f;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final FilteredString filteredEvent;

    @pmi0("json")
    private final FilteredString filteredJson;

    @pmi0("screen")
    private final FilteredString filteredScreen;

    @pmi0("session_uuid")
    private final FilteredString filteredSessionUuid;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("vk_platform")
    private final FilteredString filteredVkPlatform;

    @pmi0("mini_app_id")
    private final int miniAppId;

    @pmi0(AnalyticsBaseParamsConstantsKt.TIMEZONE)
    private final String timezone;

    @pmi0("type")
    private final Type type;

    @pmi0("url")
    private final String url;

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeMiniAppCustomEventItem>, a9y<SchemeStat$TypeMiniAppCustomEventItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new SchemeStat$TypeMiniAppCustomEventItem(fai.s(x9yVar, AnalyticsBaseParamsConstantsKt.TIMEZONE), fai.q(x9yVar, "client_time"), fai.p(x9yVar, "mini_app_id"), fai.s(x9yVar, "url"), fai.s(x9yVar, NotificationCompat.CATEGORY_EVENT), fai.s(x9yVar, "screen"), (Type) dq.f(x9yVar, "type", tru.a(), Type.class), fai.C(x9yVar, "json"), fai.C(x9yVar, "track_code"), fai.C(x9yVar, "session_uuid"), fai.C(x9yVar, "vk_platform"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeMiniAppCustomEventItem schemeStat$TypeMiniAppCustomEventItem = (SchemeStat$TypeMiniAppCustomEventItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o(AnalyticsBaseParamsConstantsKt.TIMEZONE, schemeStat$TypeMiniAppCustomEventItem.c());
            x9yVar.n("client_time", Long.valueOf(schemeStat$TypeMiniAppCustomEventItem.a()));
            x9yVar.n("mini_app_id", Integer.valueOf(schemeStat$TypeMiniAppCustomEventItem.b()));
            x9yVar.o("url", schemeStat$TypeMiniAppCustomEventItem.e());
            x9yVar.o(NotificationCompat.CATEGORY_EVENT, schemeStat$TypeMiniAppCustomEventItem.a);
            x9yVar.o("screen", schemeStat$TypeMiniAppCustomEventItem.b);
            x9yVar.o("type", tru.a().toJson(schemeStat$TypeMiniAppCustomEventItem.d()));
            x9yVar.o("json", schemeStat$TypeMiniAppCustomEventItem.c);
            x9yVar.o("track_code", schemeStat$TypeMiniAppCustomEventItem.d);
            x9yVar.o("session_uuid", schemeStat$TypeMiniAppCustomEventItem.e);
            x9yVar.o("vk_platform", schemeStat$TypeMiniAppCustomEventItem.f);
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

        @pmi0("type_action")
        public static final Type TYPE_ACTION;

        @pmi0("type_click")
        public static final Type TYPE_CLICK;

        @pmi0("type_navgo")
        public static final Type TYPE_NAVGO;

        @pmi0("type_view")
        public static final Type TYPE_VIEW;

        static {
            Type type = new Type("TYPE_NAVGO", 0);
            TYPE_NAVGO = type;
            Type type2 = new Type("TYPE_CLICK", 1);
            TYPE_CLICK = type2;
            Type type3 = new Type("TYPE_VIEW", 2);
            TYPE_VIEW = type3;
            Type type4 = new Type("TYPE_ACTION", 3);
            TYPE_ACTION = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    public SchemeStat$TypeMiniAppCustomEventItem(String str, long j, int i, String str2, String str3, String str4, Type type, String str5, String str6, String str7, String str8) {
        this.timezone = str;
        this.clientTime = j;
        this.miniAppId = i;
        this.url = str2;
        this.a = str3;
        this.b = str4;
        this.type = type;
        this.c = str5;
        this.d = str6;
        this.e = str7;
        this.f = str8;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredEvent = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredScreen = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(1024));
        this.filteredJson = filteredString3;
        FilteredString filteredString4 = new FilteredString(lhg.b(256));
        this.filteredTrackCode = filteredString4;
        FilteredString filteredString5 = new FilteredString(lhg.b(36));
        this.filteredSessionUuid = filteredString5;
        FilteredString filteredString6 = new FilteredString(lhg.b(20));
        this.filteredVkPlatform = filteredString6;
        filteredString.a(str3);
        filteredString2.a(str4);
        filteredString3.a(str5);
        filteredString4.a(str6);
        filteredString5.a(str7);
        filteredString6.a(str8);
    }

    public final long a() {
        return this.clientTime;
    }

    public final int b() {
        return this.miniAppId;
    }

    public final String c() {
        return this.timezone;
    }

    public final Type d() {
        return this.type;
    }

    public final String e() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMiniAppCustomEventItem)) {
            return false;
        }
        SchemeStat$TypeMiniAppCustomEventItem schemeStat$TypeMiniAppCustomEventItem = (SchemeStat$TypeMiniAppCustomEventItem) obj;
        return epx.f(this.timezone, schemeStat$TypeMiniAppCustomEventItem.timezone) && this.clientTime == schemeStat$TypeMiniAppCustomEventItem.clientTime && this.miniAppId == schemeStat$TypeMiniAppCustomEventItem.miniAppId && epx.f(this.url, schemeStat$TypeMiniAppCustomEventItem.url) && epx.f(this.a, schemeStat$TypeMiniAppCustomEventItem.a) && epx.f(this.b, schemeStat$TypeMiniAppCustomEventItem.b) && this.type == schemeStat$TypeMiniAppCustomEventItem.type && epx.f(this.c, schemeStat$TypeMiniAppCustomEventItem.c) && epx.f(this.d, schemeStat$TypeMiniAppCustomEventItem.d) && epx.f(this.e, schemeStat$TypeMiniAppCustomEventItem.e) && epx.f(this.f, schemeStat$TypeMiniAppCustomEventItem.f);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(urd0.a(urd0.a(shy.a(this.miniAppId, bh10.a(this.timezone.hashCode() * 31, 31, this.clientTime), 31), 31, this.url), 31, this.a), 31, this.b)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppCustomEventItem(timezone=");
        sb.append(this.timezone);
        sb.append(", clientTime=");
        sb.append(this.clientTime);
        sb.append(", miniAppId=");
        sb.append(this.miniAppId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", event=");
        sb.append(this.a);
        sb.append(", screen=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", json=");
        sb.append(this.c);
        sb.append(", trackCode=");
        sb.append(this.d);
        sb.append(", sessionUuid=");
        sb.append(this.e);
        sb.append(", vkPlatform=");
        return ho8.a(sb, this.f, ')');
    }

    public /* synthetic */ SchemeStat$TypeMiniAppCustomEventItem(String str, long j, int i, String str2, String str3, String str4, Type type, String str5, String str6, String str7, String str8, int i2, zcl zclVar) {
        this(str, j, i, str2, str3, str4, type, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? null : str8);
    }
}
