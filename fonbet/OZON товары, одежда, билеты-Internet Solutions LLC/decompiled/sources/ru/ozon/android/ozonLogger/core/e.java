package ru.ozon.android.ozonLogger.core;

import I1.w;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.LogEntry;

/* loaded from: classes6.dex */
public abstract class e<E extends LogEntry> {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f92041l = {w.c(e.class, "appVersion", "getAppVersion()Ljava/lang/String;", 0), w.c(e.class, "env", "getEnv()Ljava/lang/String;", 0), w.c(e.class, "sessionId", "getSessionId()Ljava/lang/String;", 0)};

    /* renamed from: e, reason: collision with root package name */
    private boolean f92046e;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final id.f f92050i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final id.f f92051j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final f f92052k;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f92042a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f92043b = b.f92053a;

    /* renamed from: c, reason: collision with root package name */
    private long f92044c = 172800000;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Set<? extends c> f92045d = ru.ozon.android.ozonLogger.core.b.a();

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private i f92047f = i.FULL;

    /* renamed from: g, reason: collision with root package name */
    private int f92048g = 20;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private String f92049h = "OzonLogger";

    public interface a {
        void a(boolean z11);

        boolean b();

        boolean c();

        boolean isDebugEnabled();
    }

    private static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f92053a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static boolean f92054b;

        /* renamed from: c, reason: collision with root package name */
        private static boolean f92055c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f92056d;

        static {
            String property = System.getProperty("ru.ozon.android.ozonLogger.selflogging.debug");
            f92054b = property != null ? Boolean.parseBoolean(property) : false;
            String property2 = System.getProperty("ru.ozon.android.ozonLogger.selflogging.error");
            f92055c = property2 != null ? Boolean.parseBoolean(property2) : true;
            String property3 = System.getProperty("ru.ozon.android.ozonLogger.selflogging.assert");
            f92056d = property3 != null ? Boolean.parseBoolean(property3) : true;
        }

        @Override // ru.ozon.android.ozonLogger.core.e.a
        public final void a(boolean z11) {
            f92054b = z11;
        }

        @Override // ru.ozon.android.ozonLogger.core.e.a
        public final boolean b() {
            return f92055c;
        }

        @Override // ru.ozon.android.ozonLogger.core.e.a
        public final boolean c() {
            return f92056d;
        }

        @Override // ru.ozon.android.ozonLogger.core.e.a
        public final boolean isDebugEnabled() {
            return f92054b;
        }
    }

    protected e() {
        m<Object>[] mVarArr = f92041l;
        this.f92050i = a(this, null, mVarArr[0]);
        this.f92051j = a(this, null, mVarArr[1]);
        this.f92052k = a(this, UUID.randomUUID().toString(), mVarArr[2]);
    }

    public static f a(e eVar, String str, m property) {
        Intrinsics.checkNotNullParameter(property, "property");
        eVar.f92042a.put(property.getName(), str);
        return new f(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String c() {
        return (String) this.f92050i.getValue(this, f92041l[0]);
    }

    public abstract String d();

    public final int e() {
        return this.f92048g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f() {
        return (String) this.f92051j.getValue(this, f92041l[1]);
    }

    @NotNull
    public final Set<c> g() {
        return this.f92045d;
    }

    public final long h() {
        return this.f92044c;
    }

    @NotNull
    public final a i() {
        return this.f92043b;
    }

    @NotNull
    public final String j() {
        return (String) this.f92052k.getValue(this, f92041l[2]);
    }

    @NotNull
    public final i k() {
        return this.f92047f;
    }

    @NotNull
    public final String l() {
        return this.f92049h;
    }

    public final boolean m() {
        return this.f92046e;
    }

    public final void n(String str) {
        this.f92050i.setValue(this, f92041l[0], str);
    }

    public final void o() {
        this.f92048g = 10;
    }

    public final void p(boolean z11) {
        this.f92046e = z11;
    }

    public final void q(String str) {
        this.f92051j.setValue(this, f92041l[1], str);
    }

    public final void r(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f92052k.setValue(this, f92041l[2], str);
    }

    public final void s(@NotNull Ej.c consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        consumer.invoke(this.f92043b);
    }
}
