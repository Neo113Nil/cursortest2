package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
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

/* compiled from: CommonVasStat.kt */
/* loaded from: classes11.dex */
public final class CommonVasStat$TypeBadgesScreenItem implements SchemeStat$NavigationScreenInfoItem.b, SchemeStat$TypeView.b, SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("badge_id")
    private final Integer badgeId;

    @pmi0("content_id")
    private final Integer contentId;

    @pmi0("content_owner_id")
    private final Long contentOwnerId;

    @pmi0("content_type")
    private final Integer contentType;

    @pmi0("badges_store_tab_id")
    private final FilteredString filteredBadgesStoreTabId;

    @pmi0("type")
    private final Type type;

    @pmi0("type_badges_event")
    private final CommonVasStat$TypeBadgesEvent typeBadgesEvent;

    @pmi0("type_badges_event_ref")
    private final CommonVasStat$TypeBadgesEventRef typeBadgesEventRef;

    /* compiled from: CommonVasStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVasStat$TypeBadgesScreenItem>, a9y<CommonVasStat$TypeBadgesScreenItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("type");
            Object obj = null;
            Type type = (Type) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Type.class));
            Long B = fai.B(x9yVar, "content_owner_id");
            Integer A = fai.A(x9yVar, "content_type");
            Integer A2 = fai.A(x9yVar, "content_id");
            Integer A3 = fai.A(x9yVar, "badge_id");
            String C = fai.C(x9yVar, "badges_store_tab_id");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("type_badges_event");
            CommonVasStat$TypeBadgesEvent commonVasStat$TypeBadgesEvent = (CommonVasStat$TypeBadgesEvent) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), CommonVasStat$TypeBadgesEvent.class));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("type_badges_event_ref");
            if (q3 != null && !(q3 instanceof u9y)) {
                obj = a3.fromJson(q3.k(), (Class<Object>) CommonVasStat$TypeBadgesEventRef.class);
            }
            return new CommonVasStat$TypeBadgesScreenItem(type, B, A, A2, A3, C, commonVasStat$TypeBadgesEvent, (CommonVasStat$TypeBadgesEventRef) obj, null);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem = (CommonVasStat$TypeBadgesScreenItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("type", tru.a().toJson(commonVasStat$TypeBadgesScreenItem.e()));
            x9yVar.n("content_owner_id", commonVasStat$TypeBadgesScreenItem.c());
            x9yVar.n("content_type", commonVasStat$TypeBadgesScreenItem.d());
            x9yVar.n("content_id", commonVasStat$TypeBadgesScreenItem.b());
            x9yVar.n("badge_id", commonVasStat$TypeBadgesScreenItem.a());
            x9yVar.o("badges_store_tab_id", commonVasStat$TypeBadgesScreenItem.a);
            x9yVar.o("type_badges_event", tru.a().toJson(commonVasStat$TypeBadgesScreenItem.f()));
            x9yVar.o("type_badges_event_ref", tru.a().toJson(commonVasStat$TypeBadgesScreenItem.g()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVasStat.kt */
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_badges_event")
        public static final Type TYPE_BADGES_EVENT;

        static {
            Type type = new Type("TYPE_BADGES_EVENT", 0);
            TYPE_BADGES_EVENT = type;
            Type[] typeArr = {type};
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

    public /* synthetic */ CommonVasStat$TypeBadgesScreenItem(Type type, Long l, Integer num, Integer num2, Integer num3, String str, CommonVasStat$TypeBadgesEvent commonVasStat$TypeBadgesEvent, CommonVasStat$TypeBadgesEventRef commonVasStat$TypeBadgesEventRef, zcl zclVar) {
        this(type, l, num, num2, num3, str, commonVasStat$TypeBadgesEvent, commonVasStat$TypeBadgesEventRef);
    }

    public final Integer a() {
        return this.badgeId;
    }

    public final Integer b() {
        return this.contentId;
    }

    public final Long c() {
        return this.contentOwnerId;
    }

    public final Integer d() {
        return this.contentType;
    }

    public final Type e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVasStat$TypeBadgesScreenItem)) {
            return false;
        }
        CommonVasStat$TypeBadgesScreenItem commonVasStat$TypeBadgesScreenItem = (CommonVasStat$TypeBadgesScreenItem) obj;
        return this.type == commonVasStat$TypeBadgesScreenItem.type && epx.f(this.contentOwnerId, commonVasStat$TypeBadgesScreenItem.contentOwnerId) && epx.f(this.contentType, commonVasStat$TypeBadgesScreenItem.contentType) && epx.f(this.contentId, commonVasStat$TypeBadgesScreenItem.contentId) && epx.f(this.badgeId, commonVasStat$TypeBadgesScreenItem.badgeId) && epx.f(this.a, commonVasStat$TypeBadgesScreenItem.a) && epx.f(this.typeBadgesEvent, commonVasStat$TypeBadgesScreenItem.typeBadgesEvent) && epx.f(this.typeBadgesEventRef, commonVasStat$TypeBadgesScreenItem.typeBadgesEventRef);
    }

    public final CommonVasStat$TypeBadgesEvent f() {
        return this.typeBadgesEvent;
    }

    public final CommonVasStat$TypeBadgesEventRef g() {
        return this.typeBadgesEventRef;
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        Long l = this.contentOwnerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.contentType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.contentId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.badgeId;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.a;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        CommonVasStat$TypeBadgesEvent commonVasStat$TypeBadgesEvent = this.typeBadgesEvent;
        int hashCode7 = (hashCode6 + (commonVasStat$TypeBadgesEvent == null ? 0 : commonVasStat$TypeBadgesEvent.hashCode())) * 31;
        CommonVasStat$TypeBadgesEventRef commonVasStat$TypeBadgesEventRef = this.typeBadgesEventRef;
        return hashCode7 + (commonVasStat$TypeBadgesEventRef != null ? commonVasStat$TypeBadgesEventRef.hashCode() : 0);
    }

    public final String toString() {
        return "TypeBadgesScreenItem(type=" + this.type + ", contentOwnerId=" + this.contentOwnerId + ", contentType=" + this.contentType + ", contentId=" + this.contentId + ", badgeId=" + this.badgeId + ", badgesStoreTabId=" + this.a + ", typeBadgesEvent=" + this.typeBadgesEvent + ", typeBadgesEventRef=" + this.typeBadgesEventRef + ')';
    }

    private CommonVasStat$TypeBadgesScreenItem(Type type, Long l, Integer num, Integer num2, Integer num3, String str, CommonVasStat$TypeBadgesEvent commonVasStat$TypeBadgesEvent, CommonVasStat$TypeBadgesEventRef commonVasStat$TypeBadgesEventRef) {
        this.type = type;
        this.contentOwnerId = l;
        this.contentType = num;
        this.contentId = num2;
        this.badgeId = num3;
        this.a = str;
        this.typeBadgesEvent = commonVasStat$TypeBadgesEvent;
        this.typeBadgesEventRef = commonVasStat$TypeBadgesEventRef;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredBadgesStoreTabId = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ CommonVasStat$TypeBadgesScreenItem(Type type, Long l, Integer num, Integer num2, Integer num3, String str, CommonVasStat$TypeBadgesEvent commonVasStat$TypeBadgesEvent, CommonVasStat$TypeBadgesEventRef commonVasStat$TypeBadgesEventRef, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : commonVasStat$TypeBadgesEvent, (i & 128) != 0 ? null : commonVasStat$TypeBadgesEventRef);
    }
}
