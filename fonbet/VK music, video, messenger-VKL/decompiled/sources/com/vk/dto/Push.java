package com.vk.dto;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import java.util.Iterator;
import java.util.Map;
import xsna.asp;
import xsna.bpn0;
import xsna.cqm0;
import xsna.epx;
import xsna.jgp;
import xsna.re40;
import xsna.zrp;

/* compiled from: Push.kt */
/* loaded from: classes18.dex */
public final class Push {
    public final Map<String, String> a;
    public final Priority b;
    public final boolean c;
    public final bpn0 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Push.kt */
    public static final class Priority {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        public static final a Companion;
        public static final Priority HIGH;
        public static final Priority NORMAL;
        public static final Priority UNKNOWN;
        private final int value;

        /* compiled from: Push.kt */
        public static final class a {
            public static Priority a(int i) {
                Object obj;
                Iterator<E> it = Priority.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Priority) obj).i() == i) {
                        break;
                    }
                }
                Priority priority = (Priority) obj;
                return priority == null ? Priority.UNKNOWN : priority;
            }
        }

        static {
            Priority priority = new Priority(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = priority;
            Priority priority2 = new Priority("HIGH", 1, 1);
            HIGH = priority2;
            Priority priority3 = new Priority("NORMAL", 2, 2);
            NORMAL = priority3;
            Priority[] priorityArr = {priority, priority2, priority3};
            $VALUES = priorityArr;
            $ENTRIES = new asp(priorityArr);
            Companion = new a();
        }

        public Priority(String str, int i, int i2) {
            this.value = i2;
        }

        public static zrp<Priority> h() {
            return $ENTRIES;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }

        public final int i() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Push() {
        this((Map) null, (Priority) (0 == true ? 1 : 0), 7);
    }

    public final String a() {
        return (String) this.d.getValue();
    }

    public final UserId b() {
        return new UserId(cqm0.l(this.a.get("to_id")));
    }

    public final String c() {
        return this.a.get("type");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Push)) {
            return false;
        }
        Push push = (Push) obj;
        return epx.f(this.a, push.a) && this.b == push.b && this.c == push.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Push(rawData=");
        sb.append(this.a);
        sb.append(", priority=");
        sb.append(this.b);
        sb.append(", isRestored=");
        return q0.a(sb, this.c, ')');
    }

    public Push(Map<String, String> map, Priority priority, boolean z) {
        this.a = map;
        this.b = priority;
        this.c = z;
        this.d = new bpn0(new re40(this, 18));
    }

    public /* synthetic */ Push(Map map, Priority priority, int i) {
        this((Map<String, String>) ((i & 1) != 0 ? jgp.b : map), (i & 2) != 0 ? Priority.UNKNOWN : priority, (i & 4) == 0);
    }
}
