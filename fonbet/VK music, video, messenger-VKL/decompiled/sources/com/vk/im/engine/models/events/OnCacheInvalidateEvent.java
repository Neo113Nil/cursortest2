package com.vk.im.engine.models.events;

import xsna.asp;
import xsna.epx;
import xsna.sxp;
import xsna.zrp;

/* compiled from: OnCacheInvalidateEvent.kt */
/* loaded from: classes2.dex */
public final class OnCacheInvalidateEvent extends sxp {
    public final Object b;
    public final Reason c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnCacheInvalidateEvent.kt */
    public static final class Reason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Reason[] $VALUES;
        public static final Reason COMPLICATED_DB_CHANGE;
        public static final Reason FORCED_FROM_CMD;
        public static final Reason SPACE;
        public static final Reason STORAGE_TRIM;

        static {
            Reason reason = new Reason("SPACE", 0);
            SPACE = reason;
            Reason reason2 = new Reason("COMPLICATED_DB_CHANGE", 1);
            COMPLICATED_DB_CHANGE = reason2;
            Reason reason3 = new Reason("STORAGE_TRIM", 2);
            STORAGE_TRIM = reason3;
            Reason reason4 = new Reason("FORCED_FROM_CMD", 3);
            FORCED_FROM_CMD = reason4;
            Reason[] reasonArr = {reason, reason2, reason3, reason4};
            $VALUES = reasonArr;
            $ENTRIES = new asp(reasonArr);
        }

        public Reason() {
            throw null;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) $VALUES.clone();
        }
    }

    public OnCacheInvalidateEvent(Object obj, Reason reason) {
        this.b = obj;
        this.c = reason;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final Reason c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnCacheInvalidateEvent)) {
            return false;
        }
        OnCacheInvalidateEvent onCacheInvalidateEvent = (OnCacheInvalidateEvent) obj;
        return epx.f(this.b, onCacheInvalidateEvent.b) && this.c == onCacheInvalidateEvent.c;
    }

    public final int hashCode() {
        Object obj = this.b;
        return this.c.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "OnCacheInvalidateEvent(reason=" + this.c + ')';
    }
}
