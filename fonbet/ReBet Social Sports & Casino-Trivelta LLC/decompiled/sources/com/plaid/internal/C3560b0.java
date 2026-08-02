package com.plaid.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.react.devsupport.StackTraceHelper;
import com.plaid.internal.core.crashreporting.internal.models.Breadcrumb;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions;
import com.plaid.internal.core.crashreporting.internal.models.CrashContext;
import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import com.plaid.internal.core.crashreporting.internal.models.DebugImage;
import com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface;
import com.plaid.internal.core.crashreporting.internal.models.ExceptionInterface;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nCrashReportFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashReportFactory.kt\ncom/plaid/internal/core/crashreporting/internal/CrashReportFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,150:1\n13309#2,2:151\n*S KotlinDebug\n*F\n+ 1 CrashReportFactory.kt\ncom/plaid/internal/core/crashreporting/internal/CrashReportFactory\n*L\n88#1:151,2\n*E\n"})
/* renamed from: com.plaid.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3560b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f39827a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final CrashApiOptions f39828b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Y f39829c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final H0 f39830d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final P6<Breadcrumb> f39831e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public UUID f39832f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f39833g;

    public C3560b0(Context application, CrashApiOptions crashApiOptions, Y crashEnvironmentProvider) {
        O4 deviceInfo = O4.f39477a;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(crashApiOptions, "crashApiOptions");
        Intrinsics.checkNotNullParameter(crashEnvironmentProvider, "crashEnvironmentProvider");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.f39827a = application;
        this.f39828b = crashApiOptions;
        this.f39829c = crashEnvironmentProvider;
        this.f39830d = deviceInfo;
        this.f39831e = new P6<>();
        this.f39833g = LazyKt.lazy(new C3550a0(this));
    }

    @NotNull
    public final Crash a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        UUID randomUUID = UUID.randomUUID();
        this.f39832f = randomUUID;
        Intrinsics.checkNotNull(randomUUID);
        String uuid = randomUUID.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String replace$default = StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null);
        String format = ((SimpleDateFormat) this.f39833g.getValue()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String message = throwable.getMessage();
        CrashLogLevel crashLogLevel = CrashLogLevel.ERROR;
        String release = this.f39828b.getRelease();
        String a10 = this.f39829c.a();
        ExceptionInterface exceptionInterface = new ExceptionInterface(throwable);
        DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
        debugMetaInterface.getDebugImages().add(new DebugImage(new String[]{"5641b9b3-9d23-51b6-bf80-f3d7843a9b55"}[0], null, 2, null));
        return a(new Crash(replace$default, message, format, crashLogLevel, null, null, null, null, null, null, null, release, null, a10, null, null, null, exceptionInterface, debugMetaInterface, 120816, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Crash a(Crash crash) {
        String str;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        crash.getBreadcrumbs$crash_reporting_release().clear();
        crash.getBreadcrumbs$crash_reporting_release().addAll(this.f39831e.a());
        crash.getContexts$crash_reporting_release().clear();
        Map<String, CrashContext> contexts$crash_reporting_release = crash.getContexts$crash_reporting_release();
        UUID uuid = this.f39832f;
        Context application = this.f39827a;
        Intrinsics.checkNotNullParameter(application, "application");
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                str2 = String.valueOf(packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException e10) {
                e = e10;
                str2 = null;
            }
            try {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                str3 = String.valueOf(applicationInfo != null ? applicationInfo.loadLabel(application.getPackageManager()) : null);
            } catch (PackageManager.NameNotFoundException e11) {
                e = e11;
                e.printStackTrace();
                str3 = null;
                if (str != null) {
                }
                if (str2 != null) {
                }
                if (str3 != null) {
                }
                if (linkedHashMap3.isEmpty()) {
                }
                contexts$crash_reporting_release.put("app", new CrashContext(0, uuid, null, null, linkedHashMap3 == null ? MapsKt.toMutableMap(linkedHashMap3) : null, 13, null));
                Map<String, CrashContext> contexts$crash_reporting_release2 = crash.getContexts$crash_reporting_release();
                UUID uuid2 = this.f39832f;
                H0 build = this.f39830d;
                Intrinsics.checkNotNullParameter(build, "build");
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(StackTraceHelper.ID_KEY, build.getId());
                linkedHashMap.put("manufacturer", build.a());
                linkedHashMap.put("model", build.b());
                linkedHashMap.put("name", build.g());
                linkedHashMap.put("type", build.d());
                linkedHashMap.put("version", build.e());
                if (linkedHashMap.isEmpty()) {
                }
                contexts$crash_reporting_release2.put("device", new CrashContext(0, uuid2, null, null, linkedHashMap == null ? MapsKt.toMutableMap(linkedHashMap) : null, 13, null));
                Map<String, CrashContext> contexts$crash_reporting_release3 = crash.getContexts$crash_reporting_release();
                UUID uuid3 = this.f39832f;
                H0 build2 = this.f39830d;
                Intrinsics.checkNotNullParameter(build2, "build");
                linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("name", build2.c());
                linkedHashMap2.put("version", C3569c.a(build2));
                if (linkedHashMap2.isEmpty()) {
                }
                contexts$crash_reporting_release3.put("os", new CrashContext(0, uuid3, null, null, linkedHashMap2 != null ? MapsKt.toMutableMap(linkedHashMap2) : null, 13, null));
                return crash;
            }
        } catch (PackageManager.NameNotFoundException e12) {
            e = e12;
            str = null;
            str2 = null;
        }
        if (str != null) {
            linkedHashMap3.put("version", str);
        }
        if (str2 != null) {
            linkedHashMap3.put("build", str2);
        }
        if (str3 != null) {
            linkedHashMap3.put("name", str3);
        }
        if (linkedHashMap3.isEmpty()) {
            linkedHashMap3 = null;
        }
        contexts$crash_reporting_release.put("app", new CrashContext(0, uuid, null, null, linkedHashMap3 == null ? MapsKt.toMutableMap(linkedHashMap3) : null, 13, null));
        Map<String, CrashContext> contexts$crash_reporting_release22 = crash.getContexts$crash_reporting_release();
        UUID uuid22 = this.f39832f;
        H0 build3 = this.f39830d;
        Intrinsics.checkNotNullParameter(build3, "build");
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(StackTraceHelper.ID_KEY, build3.getId());
        linkedHashMap.put("manufacturer", build3.a());
        linkedHashMap.put("model", build3.b());
        linkedHashMap.put("name", build3.g());
        linkedHashMap.put("type", build3.d());
        linkedHashMap.put("version", build3.e());
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        contexts$crash_reporting_release22.put("device", new CrashContext(0, uuid22, null, null, linkedHashMap == null ? MapsKt.toMutableMap(linkedHashMap) : null, 13, null));
        Map<String, CrashContext> contexts$crash_reporting_release32 = crash.getContexts$crash_reporting_release();
        UUID uuid32 = this.f39832f;
        H0 build22 = this.f39830d;
        Intrinsics.checkNotNullParameter(build22, "build");
        linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("name", build22.c());
        linkedHashMap2.put("version", C3569c.a(build22));
        if (linkedHashMap2.isEmpty()) {
            linkedHashMap2 = null;
        }
        contexts$crash_reporting_release32.put("os", new CrashContext(0, uuid32, null, null, linkedHashMap2 != null ? MapsKt.toMutableMap(linkedHashMap2) : null, 13, null));
        return crash;
    }
}
