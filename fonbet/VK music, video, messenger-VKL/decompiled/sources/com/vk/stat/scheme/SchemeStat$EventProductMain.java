package com.vk.stat.scheme;

import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$EventProductMain {

    @pmi0("actor")
    private final Actor actor;

    @pmi0("id")
    private final int id;

    @pmi0("prev_event_id")
    private final int prevEventId;

    @pmi0("prev_nav_id")
    private final int prevNavId;

    @pmi0("screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen screen;

    @pmi0("sequence_id")
    private final String sequenceId;

    @pmi0("sequence_number")
    private final Integer sequenceNumber;

    @pmi0("timestamp")
    private final String timestamp;

    @pmi0("type")
    private final Type type;

    @pmi0("type_action")
    private final SchemeStat$TypeAction typeAction;

    @pmi0("type_click")
    private final SchemeStat$TypeClick typeClick;

    @pmi0("type_navgo")
    private final SchemeStat$TypeNavgo typeNavgo;

    @pmi0("type_view")
    private final SchemeStat$TypeView typeView;

    @pmi0("type_vitrina_tv")
    private final CommonVideoVitrinaTvStat$TypeVitrinaTv typeVitrinaTv;

    @pmi0("uuid")
    private final String uuid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Actor {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Actor[] $VALUES;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final Actor APP;

        @pmi0("backend")
        public static final Actor BACKEND;

        @pmi0("system")
        public static final Actor SYSTEM;

        @pmi0("user")
        public static final Actor USER;

        static {
            Actor actor = new Actor("APP", 0);
            APP = actor;
            Actor actor2 = new Actor("BACKEND", 1);
            BACKEND = actor2;
            Actor actor3 = new Actor("SYSTEM", 2);
            SYSTEM = actor3;
            Actor actor4 = new Actor("USER", 3);
            USER = actor4;
            Actor[] actorArr = {actor, actor2, actor3, actor4};
            $VALUES = actorArr;
            $ENTRIES = new asp(actorArr);
        }

        private Actor(String str, int i) {
        }

        public static Actor valueOf(String str) {
            return (Actor) Enum.valueOf(Actor.class, str);
        }

        public static Actor[] values() {
            return (Actor[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
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

        @pmi0("type_vitrina_tv")
        public static final Type TYPE_VITRINA_TV;

        static {
            Type type = new Type("TYPE_NAVGO", 0);
            TYPE_NAVGO = type;
            Type type2 = new Type("TYPE_VIEW", 1);
            TYPE_VIEW = type2;
            Type type3 = new Type("TYPE_CLICK", 2);
            TYPE_CLICK = type3;
            Type type4 = new Type("TYPE_ACTION", 3);
            TYPE_ACTION = type4;
            Type type5 = new Type("TYPE_VITRINA_TV", 4);
            TYPE_VITRINA_TV = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
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
    public static final class a {
        public static SchemeStat$EventProductMain a(int i, String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i2, int i3, String str2, Actor actor, String str3, Integer num, b bVar) {
            if (bVar instanceof SchemeStat$TypeNavgo) {
                return new SchemeStat$EventProductMain(i, str, mobileOfficialAppsCoreNavStat$EventScreen, i2, i3, Type.TYPE_NAVGO, str2, actor, str3, num, (SchemeStat$TypeNavgo) bVar, null, null, null, null, 30720, null);
            }
            if (bVar instanceof SchemeStat$TypeView) {
                return new SchemeStat$EventProductMain(i, str, mobileOfficialAppsCoreNavStat$EventScreen, i2, i3, Type.TYPE_VIEW, str2, actor, str3, num, null, (SchemeStat$TypeView) bVar, null, null, null, 29696, null);
            }
            if (bVar instanceof SchemeStat$TypeClick) {
                return new SchemeStat$EventProductMain(i, str, mobileOfficialAppsCoreNavStat$EventScreen, i2, i3, Type.TYPE_CLICK, str2, actor, str3, num, null, null, (SchemeStat$TypeClick) bVar, null, null, 27648, null);
            }
            if (bVar instanceof SchemeStat$TypeAction) {
                return new SchemeStat$EventProductMain(i, str, mobileOfficialAppsCoreNavStat$EventScreen, i2, i3, Type.TYPE_ACTION, str2, actor, str3, num, null, null, null, (SchemeStat$TypeAction) bVar, null, 23552, null);
            }
            if (!(bVar instanceof CommonVideoVitrinaTvStat$TypeVitrinaTv)) {
                throw new IllegalArgumentException("payload must be one of(TypeNavgo, TypeView, TypeClick, TypeAction, TypeVitrinaTv)");
            }
            return new SchemeStat$EventProductMain(i, str, mobileOfficialAppsCoreNavStat$EventScreen, i2, i3, Type.TYPE_VITRINA_TV, str2, actor, str3, num, null, null, null, null, (CommonVideoVitrinaTvStat$TypeVitrinaTv) bVar, 15360, null);
        }
    }

    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public interface b {
    }

    private SchemeStat$EventProductMain(int i, String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i2, int i3, Type type, String str2, Actor actor, String str3, Integer num, SchemeStat$TypeNavgo schemeStat$TypeNavgo, SchemeStat$TypeView schemeStat$TypeView, SchemeStat$TypeClick schemeStat$TypeClick, SchemeStat$TypeAction schemeStat$TypeAction, CommonVideoVitrinaTvStat$TypeVitrinaTv commonVideoVitrinaTvStat$TypeVitrinaTv) {
        this.id = i;
        this.timestamp = str;
        this.screen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.prevEventId = i2;
        this.prevNavId = i3;
        this.type = type;
        this.uuid = str2;
        this.actor = actor;
        this.sequenceId = str3;
        this.sequenceNumber = num;
        this.typeNavgo = schemeStat$TypeNavgo;
        this.typeView = schemeStat$TypeView;
        this.typeClick = schemeStat$TypeClick;
        this.typeAction = schemeStat$TypeAction;
        this.typeVitrinaTv = commonVideoVitrinaTvStat$TypeVitrinaTv;
    }

    public final int a() {
        return this.id;
    }

    public final String b() {
        return this.timestamp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$EventProductMain)) {
            return false;
        }
        SchemeStat$EventProductMain schemeStat$EventProductMain = (SchemeStat$EventProductMain) obj;
        return this.id == schemeStat$EventProductMain.id && epx.f(this.timestamp, schemeStat$EventProductMain.timestamp) && this.screen == schemeStat$EventProductMain.screen && this.prevEventId == schemeStat$EventProductMain.prevEventId && this.prevNavId == schemeStat$EventProductMain.prevNavId && this.type == schemeStat$EventProductMain.type && epx.f(this.uuid, schemeStat$EventProductMain.uuid) && this.actor == schemeStat$EventProductMain.actor && epx.f(this.sequenceId, schemeStat$EventProductMain.sequenceId) && epx.f(this.sequenceNumber, schemeStat$EventProductMain.sequenceNumber) && epx.f(this.typeNavgo, schemeStat$EventProductMain.typeNavgo) && epx.f(this.typeView, schemeStat$EventProductMain.typeView) && epx.f(this.typeClick, schemeStat$EventProductMain.typeClick) && epx.f(this.typeAction, schemeStat$EventProductMain.typeAction) && epx.f(this.typeVitrinaTv, schemeStat$EventProductMain.typeVitrinaTv);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + shy.a(this.prevNavId, shy.a(this.prevEventId, (this.screen.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.timestamp)) * 31, 31), 31)) * 31;
        String str = this.uuid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Actor actor = this.actor;
        int hashCode3 = (hashCode2 + (actor == null ? 0 : actor.hashCode())) * 31;
        String str2 = this.sequenceId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sequenceNumber;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        SchemeStat$TypeNavgo schemeStat$TypeNavgo = this.typeNavgo;
        int hashCode6 = (hashCode5 + (schemeStat$TypeNavgo == null ? 0 : schemeStat$TypeNavgo.hashCode())) * 31;
        SchemeStat$TypeView schemeStat$TypeView = this.typeView;
        int hashCode7 = (hashCode6 + (schemeStat$TypeView == null ? 0 : schemeStat$TypeView.hashCode())) * 31;
        SchemeStat$TypeClick schemeStat$TypeClick = this.typeClick;
        int hashCode8 = (hashCode7 + (schemeStat$TypeClick == null ? 0 : schemeStat$TypeClick.hashCode())) * 31;
        SchemeStat$TypeAction schemeStat$TypeAction = this.typeAction;
        int hashCode9 = (hashCode8 + (schemeStat$TypeAction == null ? 0 : schemeStat$TypeAction.hashCode())) * 31;
        CommonVideoVitrinaTvStat$TypeVitrinaTv commonVideoVitrinaTvStat$TypeVitrinaTv = this.typeVitrinaTv;
        return hashCode9 + (commonVideoVitrinaTvStat$TypeVitrinaTv != null ? commonVideoVitrinaTvStat$TypeVitrinaTv.hashCode() : 0);
    }

    public final String toString() {
        return "EventProductMain(id=" + this.id + ", timestamp=" + this.timestamp + ", screen=" + this.screen + ", prevEventId=" + this.prevEventId + ", prevNavId=" + this.prevNavId + ", type=" + this.type + ", uuid=" + this.uuid + ", actor=" + this.actor + ", sequenceId=" + this.sequenceId + ", sequenceNumber=" + this.sequenceNumber + ", typeNavgo=" + this.typeNavgo + ", typeView=" + this.typeView + ", typeClick=" + this.typeClick + ", typeAction=" + this.typeAction + ", typeVitrinaTv=" + this.typeVitrinaTv + ')';
    }

    public /* synthetic */ SchemeStat$EventProductMain(int i, String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i2, int i3, Type type, String str2, Actor actor, String str3, Integer num, SchemeStat$TypeNavgo schemeStat$TypeNavgo, SchemeStat$TypeView schemeStat$TypeView, SchemeStat$TypeClick schemeStat$TypeClick, SchemeStat$TypeAction schemeStat$TypeAction, CommonVideoVitrinaTvStat$TypeVitrinaTv commonVideoVitrinaTvStat$TypeVitrinaTv, int i4, zcl zclVar) {
        this(i, str, mobileOfficialAppsCoreNavStat$EventScreen, i2, i3, type, (i4 & 64) != 0 ? null : str2, (i4 & 128) != 0 ? null : actor, (i4 & 256) != 0 ? null : str3, (i4 & 512) != 0 ? null : num, (i4 & 1024) != 0 ? null : schemeStat$TypeNavgo, (i4 & 2048) != 0 ? null : schemeStat$TypeView, (i4 & 4096) != 0 ? null : schemeStat$TypeClick, (i4 & 8192) != 0 ? null : schemeStat$TypeAction, (i4 & 16384) != 0 ? null : commonVideoVitrinaTvStat$TypeVitrinaTv);
    }
}
