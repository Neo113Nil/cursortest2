package sj;

import Am.C2438a;
import B0.A0;
import Ej.p;
import I1.w;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.android.AndroidLogEntry;

/* loaded from: classes6.dex */
public final class c extends ru.ozon.android.ozonLogger.core.e<AndroidLogEntry> {

    /* renamed from: x, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f98805x = {C2438a.c(c.class, "platform", "getPlatform()Ljava/lang/String;", 0), w.c(c.class, "uuid", "getUuid()Ljava/lang/String;", 0), w.c(c.class, "ozonId", "getOzonId()Ljava/lang/String;", 0), w.c(c.class, "userId", "getUserId()Ljava/lang/String;", 0), C2438a.c(c.class, "model", "getModel()Ljava/lang/String;", 0), C2438a.c(c.class, "manufacturer", "getManufacturer()Ljava/lang/String;", 0)};

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final Application f98806m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final String f98807n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final String f98808o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final String f98809p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.ozonLogger.core.f f98810q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.ozonLogger.core.f f98811r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final id.f f98812s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final id.f f98813t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.ozonLogger.core.f f98814u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.ozonLogger.core.f f98815v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f98816w;

    public c(Application application, String authBearer, String service) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(authBearer, "authBearer");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter("ozon_logger.db", "logDatabaseName");
        this.f98806m = application;
        this.f98807n = authBearer;
        this.f98808o = service;
        this.f98809p = "ozon_logger.db";
        m<Object>[] mVarArr = f98805x;
        this.f98810q = ru.ozon.android.ozonLogger.core.e.a(this, "android", mVarArr[0]);
        this.f98811r = ru.ozon.android.ozonLogger.core.e.a(this, "", mVarArr[1]);
        this.f98812s = ru.ozon.android.ozonLogger.core.e.a(this, null, mVarArr[2]);
        this.f98813t = ru.ozon.android.ozonLogger.core.e.a(this, null, mVarArr[3]);
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        this.f98814u = ru.ozon.android.ozonLogger.core.e.a(this, MODEL, mVarArr[4]);
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        this.f98815v = ru.ozon.android.ozonLogger.core.e.a(this, MANUFACTURER, mVarArr[5]);
        this.f98816w = k.b(new b(this));
    }

    @Override // ru.ozon.android.ozonLogger.core.e
    @NotNull
    public final String d() {
        return this.f98807n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(AndroidLogEntry logEntry) {
        Intrinsics.checkNotNullParameter(logEntry, "logEntry");
        logEntry.setService$ozon_logger_android_release(this.f98808o);
        String h11 = xj.c.f105596a.h();
        m<?>[] mVarArr = f98805x;
        String str = (String) this.f98811r.getValue(this, mVarArr[1]);
        if (m() && str.length() == 0) {
            p.a(new IllegalStateException(), A0.b("Field '", h11, "' MUST be not empty!"));
        }
        logEntry.setAppUuid$ozon_logger_android_release(str);
        logEntry.setOzonId$ozon_logger_android_release((String) this.f98812s.getValue(this, mVarArr[2]));
        logEntry.setUserId$ozon_logger_android_release((String) this.f98813t.getValue(this, mVarArr[3]));
        logEntry.setSessionId$ozon_logger_android_release(j());
        logEntry.setAppVersion$ozon_logger_android_release(c());
        logEntry.setEnv$ozon_logger_android_release(f());
        logEntry.setModel$ozon_logger_android_release((String) this.f98814u.getValue(this, mVarArr[4]));
        logEntry.setManufacturer$ozon_logger_android_release((String) this.f98815v.getValue(this, mVarArr[5]));
        logEntry.setPlatform$ozon_logger_android_release((String) this.f98810q.getValue(this, mVarArr[0]));
        Boolean bool = (Boolean) this.f98816w.getValue();
        bool.getClass();
        logEntry.setFirstLaunch$ozon_logger_android_release(bool);
        if (logEntry.getIsLocal() == null) {
            logEntry.setLocal(Boolean.valueOf(g().contains(logEntry.getLevel())));
        }
        if (logEntry.getTag() == null) {
            logEntry.setTag(l());
        }
    }

    @NotNull
    public final Application u() {
        return this.f98806m;
    }

    @NotNull
    public final String v() {
        return this.f98809p;
    }

    public final void w(String str) {
        this.f98812s.setValue(this, f98805x[2], str);
    }

    public final void x(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f98811r.setValue(this, f98805x[1], str);
    }
}
