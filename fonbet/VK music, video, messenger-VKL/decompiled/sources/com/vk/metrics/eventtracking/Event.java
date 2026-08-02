package com.vk.metrics.eventtracking;

import io.jsonwebtoken.JwtParser;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import xsna.asp;
import xsna.el3;
import xsna.h5s;
import xsna.i5s;
import xsna.zk3;
import xsna.zrp;

/* compiled from: Event.kt */
/* loaded from: classes.dex */
public final class Event {
    public static final el3 b;
    public final a a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Event.kt */
    public static final class LogType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LogType[] $VALUES;
        public static final LogType DEFAULT;
        public static final LogType ONCE;
        public static final LogType ONCE_PER_DAY;
        public static final LogType ONCE_PER_SESSION;
        public static final LogType ONCE_PER_VERSION;

        static {
            LogType logType = new LogType("DEFAULT", 0);
            DEFAULT = logType;
            LogType logType2 = new LogType("ONCE", 1);
            ONCE = logType2;
            LogType logType3 = new LogType("ONCE_PER_SESSION", 2);
            ONCE_PER_SESSION = logType3;
            LogType logType4 = new LogType("ONCE_PER_VERSION", 3);
            ONCE_PER_VERSION = logType4;
            LogType logType5 = new LogType("ONCE_PER_DAY", 4);
            ONCE_PER_DAY = logType5;
            LogType[] logTypeArr = {logType, logType2, logType3, logType4, logType5};
            $VALUES = logTypeArr;
            $ENTRIES = new asp(logTypeArr);
        }

        public LogType() {
            throw null;
        }

        public static LogType valueOf(String str) {
            return (LogType) Enum.valueOf(LogType.class, str);
        }

        public static LogType[] values() {
            return (LogType[]) $VALUES.clone();
        }
    }

    /* compiled from: Event.kt */
    public static final class a {
        public el3 b;
        public boolean f;
        public boolean g;
        public final Event a = new Event(this);
        public String c = "";
        public final zk3 d = new zk3();
        public LogType e = LogType.DEFAULT;

        public final void a(Object obj, String str) {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            if (obj instanceof Number) {
                b(str, (Number) obj);
                return;
            }
            boolean z = obj instanceof Boolean;
            zk3 zk3Var = this.d;
            if (z) {
                zk3Var.put(str, obj);
            } else if (obj instanceof JSONArray) {
                zk3Var.put(str, obj);
            } else {
                zk3Var.put(str, obj.toString());
            }
        }

        public final void b(String str, Number number) {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            this.d.put(str, number);
        }

        public final void c(String str, String str2) {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            this.d.put(str, str2);
        }

        public final void d(Map map) {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            this.d.putAll(map);
        }

        public final Event e() {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            Event event = this.a;
            a aVar = event.a;
            a aVar2 = event.a;
            if (aVar.c.length() >= 100) {
                throw new IllegalArgumentException(i5s.a(new StringBuilder("Event name "), aVar2.c, " is longer then 100 symbols"));
            }
            el3 el3Var = this.b;
            if (el3Var == null || !el3Var.contains("FirebaseTracker") || aVar2.d.d < 20) {
                this.f = true;
                return event;
            }
            throw new IllegalArgumentException(h5s.c(aVar2.d.d, " is larger than allowed 20", new StringBuilder("Params count ")));
        }

        public final void f() {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            this.d.put("vk_tracking_enhanced_enabled", Boolean.TRUE);
        }

        public final void g(String str) {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            this.c = str;
        }

        public final void h() {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            this.g = true;
        }

        public final void i(String str) {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            el3 el3Var = new el3(1);
            el3Var.add(str);
            this.b = el3Var;
        }

        public final void j(Collection collection) {
            if (this.f) {
                throw new IllegalStateException("Already builded!");
            }
            if (collection.isEmpty()) {
                this.b = null;
                return;
            }
            el3 el3Var = new el3(0);
            el3Var.addAll(collection);
            this.b = el3Var;
        }
    }

    /* compiled from: Event.kt */
    public static final class b {
        public static String a(String str) {
            return str.replace(JwtParser.SEPARATOR_CHAR, '_').toLowerCase(Locale.ROOT);
        }
    }

    static {
        el3 el3Var = new el3(2);
        el3Var.add("FirebaseTracker");
        el3Var.add("LoggingTracker");
        b = el3Var;
    }

    public Event(a aVar) {
        this.a = aVar;
    }

    public final Set<String> a() {
        el3 el3Var = this.a.b;
        return el3Var == null ? b : el3Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event(name=");
        a aVar = this.a;
        sb.append(aVar.c);
        sb.append(",params=");
        sb.append(aVar.d);
        sb.append(",type=");
        sb.append(aVar.e);
        sb.append(')');
        return sb.toString();
    }
}
