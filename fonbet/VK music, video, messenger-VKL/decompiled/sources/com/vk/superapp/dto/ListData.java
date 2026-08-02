package com.vk.superapp.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import defpackage.q0;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.z8n0;
import xsna.zrp;

/* compiled from: ListData.kt */
/* loaded from: classes6.dex */
public final class ListData {
    public final List<z8n0> a;
    public final Cause b;
    public final int c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListData.kt */
    public static final class Cause {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Cause[] $VALUES;
        public static final Cause CACHE;
        public static final Cause DEFAULT;
        public static final Cause NETWORK_UPDATE;
        public static final Cause UNKNOWN;

        static {
            Cause cause = new Cause("NETWORK_UPDATE", 0);
            NETWORK_UPDATE = cause;
            Cause cause2 = new Cause("DEFAULT", 1);
            DEFAULT = cause2;
            Cause cause3 = new Cause(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            UNKNOWN = cause3;
            Cause cause4 = new Cause("CACHE", 3);
            CACHE = cause4;
            Cause[] causeArr = {cause, cause2, cause3, cause4};
            $VALUES = causeArr;
            $ENTRIES = new asp(causeArr);
        }

        public Cause() {
            throw null;
        }

        public static Cause valueOf(String str) {
            return (Cause) Enum.valueOf(Cause.class, str);
        }

        public static Cause[] values() {
            return (Cause[]) $VALUES.clone();
        }
    }

    public ListData() {
        throw null;
    }

    public ListData(List list, Cause cause, int i) {
        boolean z = (i & 32) != 0;
        this.a = list;
        this.b = cause;
        this.c = 4;
        this.d = z;
    }

    public final Cause a() {
        return this.b;
    }

    public final List<z8n0> b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListData)) {
            return false;
        }
        ListData listData = (ListData) obj;
        return epx.f(this.a, listData.a) && this.b == listData.b && this.c == listData.c && this.d == listData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(shy.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 961), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListData(items=");
        sb.append(this.a);
        sb.append(", cause=");
        sb.append(this.b);
        sb.append(", menuColumnCount=");
        sb.append(this.c);
        sb.append(", scrollToPosition=null, snapToCenter=false, canScroll=");
        return q0.a(sb, this.d, ')');
    }
}
