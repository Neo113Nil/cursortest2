package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.a70;
import defpackage.d28;
import defpackage.lnb;
import defpackage.n4o;
import defpackage.o13;
import defpackage.o93;
import defpackage.ph0;
import defpackage.tub;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1tSDK implements AFc1sSDK {

    @NotNull
    private final AFc1kSDK AFKeystoreWrapper;

    @NotNull
    private final AFc1pSDK d;

    @NotNull
    private final Map<String, Integer> registerClient;

    @NotNull
    private final AFc1cSDK unregisterClient;

    public AFc1tSDK(@NotNull AFc1cSDK aFc1cSDK, @NotNull AFc1pSDK aFc1pSDK) {
        aFc1cSDK.getClass();
        aFc1pSDK.getClass();
        this.unregisterClient = aFc1cSDK;
        this.d = aFc1pSDK;
        this.AFKeystoreWrapper = new AFc1kSDK(kotlin.collections.b.j(new AFc1oSDK("ConversionsCache", kotlin.collections.a.c(AFd1aSDK.unregisterClient), 1), new AFc1oSDK("AttrCache", kotlin.collections.a.c(AFd1aSDK.force), 1), new AFc1oSDK("OtherCache", kotlin.collections.b.j(AFd1aSDK.afInfoLog, AFd1aSDK.afWarnLog, AFd1aSDK.AppsFlyerLib, AFd1aSDK.getEntries, AFd1aSDK.valueOf, AFd1aSDK.AFLoggerLogLevel), 40)));
        this.registerClient = tub.i(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private final void AFKeystoreWrapper() {
        for (AFc1oSDK aFc1oSDK : this.AFKeystoreWrapper.AFLogger) {
            String str = aFc1oSDK.d;
            Context context = this.unregisterClient.d;
            context.getClass();
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.registerClient;
                String str2 = aFc1oSDK.d;
                File[] listFiles = file.listFiles();
                map.put(str2, Integer.valueOf(listFiles != null ? listFiles.length : 0));
            } else {
                file.mkdirs();
                this.registerClient.put(aFc1oSDK.d, 0);
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.appsflyer.internal.AFc1sSDK
    @Nullable
    public final String AFLogger(@NotNull AFc1vSDK aFc1vSDK) {
        Exception exc;
        File file;
        String str;
        List<File> L0;
        aFc1vSDK.getClass();
        try {
            AFe1zSDK aFe1zSDK = aFc1vSDK.d;
            aFe1zSDK.getClass();
            Context context = this.unregisterClient.d;
            context.getClass();
            File file2 = new File(new File(context.getFilesDir(), "AFRequestCache"), d(aFe1zSDK));
            if (!file2.exists()) {
                file2.mkdirs();
            }
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.CACHE;
            AFLoggerBase.i$default(aFLogger, logTag, "Caching request with URL: " + aFc1vSDK.AFLogger, false, 4, null);
            String valueOf = String.valueOf(System.currentTimeMillis());
            file = new File(file2, valueOf);
            try {
                file.createNewFile();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFc1vSDK.unregisterClient);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFc1vSDK.AFLogger);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFc1vSDK.registerClient, 2));
                    outputStreamWriter.write(10);
                    AFe1zSDK aFe1zSDK2 = aFc1vSDK.d;
                    outputStreamWriter.write("type=");
                    outputStreamWriter.write(aFe1zSDK2.AFKeystoreWrapper());
                    outputStreamWriter.write(10);
                    Map<String, String> map = aFc1vSDK.v;
                    if (map != null && !map.isEmpty()) {
                        outputStreamWriter.write("headers=");
                        Map<String, String> map2 = aFc1vSDK.v;
                        map2.getClass();
                        String jSONObject = new JSONObject(map2).toString();
                        jSONObject.getClass();
                        byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    Unit unit = Unit.a;
                    outputStreamWriter.close();
                    AFLoggerBase.i$default(aFLogger, logTag, "Cache request: done, cacheKey: " + valueOf, false, 4, null);
                    AFe1zSDK aFe1zSDK3 = aFc1vSDK.d;
                    aFe1zSDK3.getClass();
                    AFc1oSDK registerClient = registerClient(aFe1zSDK3);
                    Integer valueOf2 = registerClient != null ? Integer.valueOf(registerClient.AFLogger) : null;
                    if (valueOf2 == null) {
                        return valueOf;
                    }
                    int intValue = valueOf2.intValue();
                    Map<String, Integer> map3 = this.registerClient;
                    AFc1oSDK registerClient2 = registerClient(aFe1zSDK3);
                    if (registerClient2 == null || (str = registerClient2.d) == null) {
                        throw new UnsupportedOperationException("Cache do not support this type of events");
                    }
                    Integer num = map3.get(str);
                    int intValue2 = num != null ? num.intValue() : 0;
                    if (intValue2 >= intValue) {
                        int i = (intValue2 + 1) - intValue;
                        AFLoggerBase.i$default(aFLogger, logTag, "Cache overflown for type " + aFe1zSDK3 + ", removing " + i + " item(s)", false, 4, null);
                        Context context2 = this.unregisterClient.d;
                        context2.getClass();
                        File file3 = new File(new File(context2.getFilesDir(), "AFRequestCache"), d(aFe1zSDK3));
                        if (!file3.exists()) {
                            file3.mkdirs();
                        }
                        File[] listFiles = file3.listFiles();
                        if (listFiles != null && (L0 = CollectionsKt.L0(ph0.R(new Comparator() { // from class: com.appsflyer.internal.AFc1tSDK.1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return o93.b(((File) t).getName(), ((File) t2).getName());
                            }
                        }, listFiles), i)) != null) {
                            for (File file4 : L0) {
                                file4.delete();
                                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Cache entry " + file4.getName() + " removed", false, 4, null);
                            }
                        }
                    }
                    AFKeystoreWrapper();
                    return valueOf;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        n4o.x(outputStreamWriter, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                exc = e;
                if (file != null) {
                    file.delete();
                }
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                return null;
            }
        } catch (Exception e2) {
            exc = e2;
            file = null;
        }
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final void d() {
        try {
            if (this.d.d("AF_CACHE_VERSION", -1) == 3) {
                Context context = this.unregisterClient.d;
                context.getClass();
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.unregisterClient.d;
                    context2.getClass();
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.d.AFKeystoreWrapper("AF_CACHE_VERSION", 3);
                Context context3 = this.unregisterClient.d;
                context3.getClass();
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.unregisterClient.d;
                    context4.getClass();
                    d28.g(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.unregisterClient.d;
                    context5.getClass();
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            AFKeystoreWrapper();
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not init cache", e, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final void registerClient() {
        try {
            Context context = this.unregisterClient.d;
            context.getClass();
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.unregisterClient.d;
                context2.getClass();
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.AFKeystoreWrapper.AFLogger.iterator();
            while (it.hasNext()) {
                String str = ((AFc1oSDK) it.next()).d;
                Context context3 = this.unregisterClient.d;
                context3.getClass();
                File[] listFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.CACHE;
                        AFLoggerBase.i$default(aFLogger, logTag, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFLoggerBase.i$default(aFLogger, logTag, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.unregisterClient.d;
            context4.getClass();
            d28.g(new File(context4.getFilesDir(), "AFRequestCache"));
            AFKeystoreWrapper();
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not clearCache request", e, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    @NotNull
    public final List<AFc1vSDK> unregisterClient() {
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Context context = this.unregisterClient.d;
            context.getClass();
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.unregisterClient.d;
                context2.getClass();
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.AFKeystoreWrapper.AFLogger.iterator();
            while (it.hasNext()) {
                String str = ((AFc1oSDK) it.next()).d;
                Context context3 = this.unregisterClient.d;
                context3.getClass();
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                o13.w(arrayList2, listFiles);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                File file2 = (File) it2.next();
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1vSDK AFLogger = AFLogger(file2);
                if (AFLogger != null) {
                    arrayList.add(AFLogger);
                }
            }
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, "Could not get cached requests", e, false, false, false, false, 120, null);
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, lnb.k(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    private final boolean d(File file) {
        try {
            file.delete();
            AFKeystoreWrapper();
            return true;
        } catch (Exception e) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.CACHE, lnb.o("Could not delete ", file.getName(), " from cache"), e, false, false, false, false, 120, null);
            return false;
        }
    }

    private final String d(AFe1zSDK aFe1zSDK) {
        String str;
        AFc1oSDK registerClient = registerClient(aFe1zSDK);
        if (registerClient != null && (str = registerClient.d) != null) {
            return str;
        }
        a70.m("Cache do not support this type of events");
        return null;
    }

    private final AFc1oSDK registerClient(AFe1zSDK aFe1zSDK) {
        Object obj;
        Iterator<T> it = this.AFKeystoreWrapper.AFLogger.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AFc1oSDK) obj).registerClient.contains(aFe1zSDK)) {
                break;
            }
        }
        return (AFc1oSDK) obj;
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final boolean registerClient(@Nullable String str) {
        if (str == null) {
            return false;
        }
        Context context = this.unregisterClient.d;
        context.getClass();
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.unregisterClient.d;
            context2.getClass();
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, lnb.o("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.AFKeystoreWrapper.AFLogger.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1oSDK) it.next()).d;
            Context context3 = this.unregisterClient.d;
            context3.getClass();
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return d(file);
            }
        }
        return true;
    }

    private static AFc1vSDK AFLogger(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1vSDK aFc1vSDK = new AFc1vSDK(cArr);
                aFc1vSDK.AFKeystoreWrapper = file.getName();
                inputStreamReader.close();
                return aFc1vSDK;
            } finally {
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.CACHE, "Error while loading request from cache", e, false, false, true, false);
            return null;
        }
    }
}
