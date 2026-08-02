package com.vk.utils.log;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Looper;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.Features;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.asp;
import xsna.cqm0;
import xsna.e8r;
import xsna.epx;
import xsna.f1j;
import xsna.f370;
import xsna.g620;
import xsna.j5g;
import xsna.ky6;
import xsna.o2l;
import xsna.pm1;
import xsna.rhr;
import xsna.s3q0;
import xsna.s63;
import xsna.sw1;
import xsna.wjy;
import xsna.x000;
import xsna.zhr;
import xsna.zrp;

/* compiled from: LogUploader.kt */
/* loaded from: classes11.dex */
public final class LogUploader {
    public static final LogUploader a = new LogUploader();
    public static final b b = new b(Preference.j());
    public static s63 c;
    public static sw1 d;
    public static Features.Type e;
    public static g620 f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogUploader.kt */
    /* loaded from: classes6.dex */
    public static final class CollectType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CollectType[] $VALUES;
        public static final CollectType CYCLE;
        public static final CollectType ONE_SHOT;

        static {
            CollectType collectType = new CollectType("CYCLE", 0);
            CYCLE = collectType;
            CollectType collectType2 = new CollectType("ONE_SHOT", 1);
            ONE_SHOT = collectType2;
            CollectType[] collectTypeArr = {collectType, collectType2};
            $VALUES = collectTypeArr;
            $ENTRIES = new asp(collectTypeArr);
        }

        public CollectType() {
            throw null;
        }

        public static CollectType valueOf(String str) {
            return (CollectType) Enum.valueOf(CollectType.class, str);
        }

        public static CollectType[] values() {
            return (CollectType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogUploader.kt */
    /* loaded from: classes6.dex */
    public static final class LogArtifact {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LogArtifact[] $VALUES;
        public static final LogArtifact APPLOG;
        public static final LogArtifact NETLOG;

        static {
            LogArtifact logArtifact = new LogArtifact("NETLOG", 0);
            NETLOG = logArtifact;
            LogArtifact logArtifact2 = new LogArtifact("APPLOG", 1);
            APPLOG = logArtifact2;
            LogArtifact[] logArtifactArr = {logArtifact, logArtifact2};
            $VALUES = logArtifactArr;
            $ENTRIES = new asp(logArtifactArr);
        }

        public LogArtifact() {
            throw null;
        }

        public static LogArtifact valueOf(String str) {
            return (LogArtifact) Enum.valueOf(LogArtifact.class, str);
        }

        public static LogArtifact[] values() {
            return (LogArtifact[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogUploader.kt */
    /* loaded from: classes6.dex */
    public static final class LogType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LogType[] $VALUES;
        public static final LogType FILE;
        public static final LogType LOGCAT;
        public static final LogType NETLOG;

        static {
            LogType logType = new LogType("NETLOG", 0);
            NETLOG = logType;
            LogType logType2 = new LogType("LOGCAT", 1);
            LOGCAT = logType2;
            LogType logType3 = new LogType("FILE", 2);
            FILE = logType3;
            LogType[] logTypeArr = {logType, logType2, logType3};
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

    /* compiled from: LogUploader.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final Set<LogType> a;
        public final CollectType b;

        /* compiled from: LogUploader.kt */
        /* renamed from: com.vk.utils.log.LogUploader$a$a, reason: collision with other inner class name */
        public static final class C1940a {
            public static a a(JSONObject jSONObject) {
                CollectType collectType;
                LogType logType;
                try {
                    ArrayList O = f370.O(jSONObject.getJSONArray("log_types"));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = O.iterator();
                    while (it.hasNext()) {
                        try {
                            logType = LogType.valueOf(cqm0.n((String) it.next()));
                        } catch (Exception unused) {
                            logType = null;
                        }
                        if (logType != null) {
                            arrayList.add(logType);
                        }
                    }
                    Set S0 = j5g.S0(arrayList);
                    try {
                        collectType = CollectType.valueOf(cqm0.n(jSONObject.optString("collection_type")));
                    } catch (Exception unused2) {
                        collectType = CollectType.ONE_SHOT;
                    }
                    return new a(S0, collectType);
                } catch (Exception e) {
                    L.i(e);
                    return null;
                }
            }

            public static String b(a aVar) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                Iterator<T> it = aVar.a.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((LogType) it.next()).name());
                }
                jSONObject.put("log_types", jSONArray);
                jSONObject.put("collection_type", aVar.b.name());
                return jSONObject.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Set<? extends LogType> set, CollectType collectType) {
            this.a = set;
            this.b = collectType;
        }

        public final boolean a() {
            LogType logType = LogType.LOGCAT;
            Set<LogType> set = this.a;
            return set.contains(logType) || set.contains(LogType.FILE);
        }

        public final boolean b() {
            return this.a.contains(LogType.NETLOG);
        }

        public final Set<LogType> c() {
            return this.a;
        }

        public final boolean d() {
            return this.b == CollectType.CYCLE;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Config(logTypes=" + this.a + ", collectType=" + this.b + ')';
        }
    }

    /* compiled from: LogUploader.kt */
    public static final class b {
        public final SharedPreferences a;
        public volatile a b;

        public b(ky6 ky6Var) {
            this.a = ky6Var;
        }

        public final a a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        String string = this.a.getString("log_collector_info_key", null);
                        if (string == null) {
                            return null;
                        }
                        try {
                            this.b = a.C1940a.a(new JSONObject(string));
                        } catch (Exception e) {
                            L.i(e);
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
            }
            return this.b;
        }

        public final synchronized void b(a aVar) {
            try {
                this.b = aVar;
                this.a.edit().putString("log_collector_info_key", aVar != null ? a.C1940a.b(aVar) : null).apply();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: LogUploader.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogArtifact.values().length];
            try {
                iArr[LogArtifact.APPLOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogArtifact.NETLOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static boolean d() {
        b bVar = b;
        a a2 = bVar.a();
        if (a2 != null && (!bVar.a.getBoolean("log_collector_is_app_sent_key", false) || a2.d())) {
            return a2.a();
        }
        return false;
    }

    public final synchronized void a(a aVar) {
        try {
            ArrayList arrayList = new ArrayList();
            if (aVar.c().contains(LogType.FILE)) {
                arrayList.add(LoggerOutputTarget.RING_FILE);
            }
            if (aVar.c().contains(LogType.LOGCAT)) {
                arrayList.add(LoggerOutputTarget.LOGCAT);
            }
            if ((!b.a.getBoolean("log_collector_is_app_sent_key", false) || aVar.d()) && !arrayList.isEmpty()) {
                L.y(arrayList);
            } else {
                sw1 sw1Var = d;
                if (sw1Var == null) {
                    sw1Var = null;
                }
                sw1Var.invoke();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x001f, B:11:0x0023, B:15:0x002b, B:17:0x0037, B:22:0x0043, B:24:0x0047, B:26:0x0056, B:28:0x005a, B:29:0x005d, B:31:0x0061), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(a aVar) {
        boolean z;
        g620 g620Var;
        g620 g620Var2;
        boolean z2 = false;
        if (!aVar.c().contains(LogType.NETLOG)) {
            if (f != null) {
                o2l.a.getClass();
                z2 = o2l.b("__dbg_network_netlog_write", false);
            }
            if (!z2 && (g620Var2 = f) != null) {
                g620Var2.C();
            }
            return;
        }
        if (b.a.getBoolean("log_collector_is_net_sent_key", false) && !aVar.d()) {
            z = false;
            if (z) {
                if (f != null) {
                    wjy.a.getClass();
                    z2 = wjy.b().a();
                }
                if (z2 && (g620Var = f) != null) {
                    g620Var.C();
                }
                if (f != null) {
                    wjy.a.getClass();
                    wjy.b().b();
                }
            }
        }
        z = true;
        if (z) {
        }
    }

    public final synchronized void c(a aVar) {
        a(aVar);
        b(aVar);
        b bVar = b;
        if (!epx.f(bVar.a(), aVar)) {
            bVar.b(aVar);
        }
    }

    public final synchronized void e(long j, File file, LogArtifact logArtifact) {
        PrivateFiles.a b2;
        if (epx.f(Looper.getMainLooper(), Looper.myLooper())) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Auto log from Main Thread!"));
            return;
        }
        if (file.exists() || file.isFile()) {
            b2 = e8r.a.b(r1, PrivateSubdir.INTERNAL_TEMP_UPLOADS.h(), true);
            File file2 = new File(b2.a, System.currentTimeMillis() + '-' + file.getName());
            Uri N = com.vk.core.files.a.N(file2);
            if (N == null) {
                return;
            }
            com.vk.core.files.a.a(file, file2);
            ((zhr) rhr.h.getValue()).a(j, N).o(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new x000(0, logArtifact, file2), new pm1(new f1j(file2, 23), 26));
        }
    }
}
