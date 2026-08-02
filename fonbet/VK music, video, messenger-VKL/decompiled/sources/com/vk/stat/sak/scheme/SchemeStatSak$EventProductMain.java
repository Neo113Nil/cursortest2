package com.vk.stat.sak.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$EventProductMain {

    @pmi0("id")
    private final int id;

    @pmi0("prev_event_id")
    private final int prevEventId;

    @pmi0("prev_nav_id")
    private final int prevNavId;

    @pmi0("screen")
    private final SchemeStatSak$EventScreen screen;

    @pmi0("timestamp")
    private final String timestamp;

    @pmi0("type")
    private final Type type;

    @pmi0("type_action")
    private final SchemeStatSak$TypeAction typeAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_action")
        public static final Type TYPE_ACTION;

        static {
            Type type = new Type("TYPE_ACTION", 0);
            TYPE_ACTION = type;
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

    public /* synthetic */ SchemeStatSak$EventProductMain(int i, String str, SchemeStatSak$EventScreen schemeStatSak$EventScreen, int i2, int i3, Type type, SchemeStatSak$TypeAction schemeStatSak$TypeAction, zcl zclVar) {
        this(i, str, schemeStatSak$EventScreen, i2, i3, type, schemeStatSak$TypeAction);
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
        if (!(obj instanceof SchemeStatSak$EventProductMain)) {
            return false;
        }
        SchemeStatSak$EventProductMain schemeStatSak$EventProductMain = (SchemeStatSak$EventProductMain) obj;
        return this.id == schemeStatSak$EventProductMain.id && epx.f(this.timestamp, schemeStatSak$EventProductMain.timestamp) && this.screen == schemeStatSak$EventProductMain.screen && this.prevEventId == schemeStatSak$EventProductMain.prevEventId && this.prevNavId == schemeStatSak$EventProductMain.prevNavId && this.type == schemeStatSak$EventProductMain.type && epx.f(this.typeAction, schemeStatSak$EventProductMain.typeAction);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + shy.a(this.prevNavId, shy.a(this.prevEventId, (this.screen.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.timestamp)) * 31, 31), 31)) * 31;
        SchemeStatSak$TypeAction schemeStatSak$TypeAction = this.typeAction;
        return hashCode + (schemeStatSak$TypeAction == null ? 0 : schemeStatSak$TypeAction.hashCode());
    }

    public final String toString() {
        return "EventProductMain(id=" + this.id + ", timestamp=" + this.timestamp + ", screen=" + this.screen + ", prevEventId=" + this.prevEventId + ", prevNavId=" + this.prevNavId + ", type=" + this.type + ", typeAction=" + this.typeAction + ')';
    }

    private SchemeStatSak$EventProductMain(int i, String str, SchemeStatSak$EventScreen schemeStatSak$EventScreen, int i2, int i3, Type type, SchemeStatSak$TypeAction schemeStatSak$TypeAction) {
        this.id = i;
        this.timestamp = str;
        this.screen = schemeStatSak$EventScreen;
        this.prevEventId = i2;
        this.prevNavId = i3;
        this.type = type;
        this.typeAction = schemeStatSak$TypeAction;
    }

    public /* synthetic */ SchemeStatSak$EventProductMain(int i, String str, SchemeStatSak$EventScreen schemeStatSak$EventScreen, int i2, int i3, Type type, SchemeStatSak$TypeAction schemeStatSak$TypeAction, int i4, zcl zclVar) {
        this(i, str, schemeStatSak$EventScreen, i2, i3, type, (i4 & 64) != 0 ? null : schemeStatSak$TypeAction);
    }
}
