package com.vk.stat.scheme;

import com.mbridge.msdk.MBridgeConstans;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$EventCustomMain {

    @pmi0("actor")
    private final Actor actor;

    @pmi0("id")
    private final int id;

    @pmi0("sequence_id")
    private final String sequenceId;

    @pmi0("sequence_number")
    private final Integer sequenceNumber;

    @pmi0("timestamp")
    private final String timestamp;

    @pmi0("type")
    private final Type type;

    @pmi0("type_dev_null_item")
    private final SchemeStat$TypeDevNullItem typeDevNullItem;

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

        @pmi0("type_dev_null_item")
        public static final Type TYPE_DEV_NULL_ITEM;

        static {
            Type type = new Type("TYPE_DEV_NULL_ITEM", 0);
            TYPE_DEV_NULL_ITEM = type;
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

    public /* synthetic */ SchemeStat$EventCustomMain(int i, String str, Type type, String str2, Actor actor, String str3, Integer num, SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem, zcl zclVar) {
        this(i, str, type, str2, actor, str3, num, schemeStat$TypeDevNullItem);
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
        if (!(obj instanceof SchemeStat$EventCustomMain)) {
            return false;
        }
        SchemeStat$EventCustomMain schemeStat$EventCustomMain = (SchemeStat$EventCustomMain) obj;
        return this.id == schemeStat$EventCustomMain.id && epx.f(this.timestamp, schemeStat$EventCustomMain.timestamp) && this.type == schemeStat$EventCustomMain.type && epx.f(this.uuid, schemeStat$EventCustomMain.uuid) && this.actor == schemeStat$EventCustomMain.actor && epx.f(this.sequenceId, schemeStat$EventCustomMain.sequenceId) && epx.f(this.sequenceNumber, schemeStat$EventCustomMain.sequenceNumber) && epx.f(this.typeDevNullItem, schemeStat$EventCustomMain.typeDevNullItem);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.timestamp)) * 31;
        String str = this.uuid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Actor actor = this.actor;
        int hashCode3 = (hashCode2 + (actor == null ? 0 : actor.hashCode())) * 31;
        String str2 = this.sequenceId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.sequenceNumber;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = this.typeDevNullItem;
        return hashCode5 + (schemeStat$TypeDevNullItem != null ? schemeStat$TypeDevNullItem.hashCode() : 0);
    }

    public final String toString() {
        return "EventCustomMain(id=" + this.id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", uuid=" + this.uuid + ", actor=" + this.actor + ", sequenceId=" + this.sequenceId + ", sequenceNumber=" + this.sequenceNumber + ", typeDevNullItem=" + this.typeDevNullItem + ')';
    }

    private SchemeStat$EventCustomMain(int i, String str, Type type, String str2, Actor actor, String str3, Integer num, SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem) {
        this.id = i;
        this.timestamp = str;
        this.type = type;
        this.uuid = str2;
        this.actor = actor;
        this.sequenceId = str3;
        this.sequenceNumber = num;
        this.typeDevNullItem = schemeStat$TypeDevNullItem;
    }

    public /* synthetic */ SchemeStat$EventCustomMain(int i, String str, Type type, String str2, Actor actor, String str3, Integer num, SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem, int i2, zcl zclVar) {
        this(i, str, type, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : actor, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : schemeStat$TypeDevNullItem);
    }
}
