package com.appsflyer.internal;

import android.content.Context;
import android.util.Base64;
import androidx.appcompat.widget.c1;
import com.appsflyer.AFLogger;
import io.sentry.d4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.t;
import kotlin.collections.u;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@SourceDebugExtension({"SMAP\nFileCacheManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1855#2,2:336\n1855#2,2:339\n1855#2:341\n1856#2:344\n1855#2,2:346\n1855#2:348\n1856#2:351\n6442#3:338\n13579#3,2:349\n18#4:342\n26#5:343\n1#6:345\n*S KotlinDebug\n*F\n+ 1 FileCacheManager.kt\ncom/appsflyer/internal/cache/FileCacheManager\n*L\n106#1:336,2\n189#1:339,2\n207#1:341\n207#1:344\n263#1:346,2\n296#1:348\n296#1:351\n187#1:338\n299#1:349,2\n213#1:342\n213#1:343\n*E\n"})
/* loaded from: classes.dex */
public final class AFc1vSDK implements AFc1tSDK {

    @NotNull
    private final AFc1hSDK AFAdRevenueData;

    @NotNull
    private final AFc1qSDK getMediationNetwork;

    @NotNull
    private final Map<String, Integer> getMonetizationNetwork;

    @NotNull
    private final AFc1rSDK getRevenue;

    public AFc1vSDK(@NotNull AFc1hSDK aFc1hSDK, @NotNull AFc1qSDK aFc1qSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        this.AFAdRevenueData = aFc1hSDK;
        this.getMediationNetwork = aFc1qSDK;
        this.getRevenue = new AFc1rSDK(u.f(new AFc1sSDK("ConversionsCache", t.c(AFe1pSDK.CONVERSION), 1), new AFc1sSDK("AttrCache", t.c(AFe1pSDK.ATTR), 1), new AFc1sSDK("OtherCache", u.f(AFe1pSDK.LAUNCH, AFe1pSDK.INAPP, AFe1pSDK.ADREVENUE, AFe1pSDK.ARS_VALIDATE, AFe1pSDK.PURCHASE_VALIDATE, AFe1pSDK.MANUAL_PURCHASE_VALIDATION, AFe1pSDK.SDK_SERVICES), 40)));
        this.getMonetizationNetwork = n0.f(new Pair("ConversionsCache", 0), new Pair("AttrCache", 0), new Pair("OtherCache", 0));
    }

    private static AFc1uSDK AFAdRevenueData(File file) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(y4.a.m(new FileInputStream(file), file), Charset.defaultCharset());
            try {
                char[] cArr = new char[(int) file.length()];
                inputStreamReader.read(cArr);
                AFc1uSDK aFc1uSDK = new AFc1uSDK(cArr);
                aFc1uSDK.getMediationNetwork = file.getName();
                inputStreamReader.close();
                return aFc1uSDK;
            } finally {
            }
        } catch (Exception e7) {
            AFLogger.INSTANCE.e(AFg1cSDK.CACHE, "Error while loading request from cache", e7, false, false, true, false);
            return null;
        }
    }

    private final void getMonetizationNetwork() {
        for (AFc1sSDK aFc1sSDK : this.getRevenue.getMediationNetwork) {
            String str = aFc1sSDK.AFAdRevenueData;
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
            if (file.exists()) {
                Map<String, Integer> map = this.getMonetizationNetwork;
                String str2 = aFc1sSDK.AFAdRevenueData;
                File[] listFiles = file.listFiles();
                map.put(str2, Integer.valueOf(listFiles != null ? listFiles.length : 0));
            } else {
                file.mkdirs();
                this.getMonetizationNetwork.put(aFc1sSDK.AFAdRevenueData, 0);
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    @NotNull
    public final List<AFc1uSDK> getCurrencyIso4217Code() {
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Get Cached Requests", false, 4, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (it.hasNext()) {
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                File file = new File(new File(context3.getFilesDir(), "AFRequestCache"), str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                z.o(arrayList2, listFiles);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                File file2 = (File) it2.next();
                AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Found cached request: " + file2.getName(), false, 4, null);
                AFc1uSDK AFAdRevenueData = AFAdRevenueData(file2);
                if (AFAdRevenueData != null) {
                    arrayList.add(AFAdRevenueData);
                }
            }
        } catch (Exception e7) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not get cached requests", e7, false, false, false, false, 120, null);
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, d9.e.f(arrayList.size(), "Found ", " Cached Requests"), false, 4, null);
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getMediationNetwork() {
        try {
            if (this.getMediationNetwork.getRevenue("AF_CACHE_VERSION", -1) == 2) {
                Context context = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context);
                if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                    Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context2);
                    new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                }
            } else {
                this.getMediationNetwork.getMediationNetwork("AF_CACHE_VERSION", 2);
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                if (new File(context3.getFilesDir(), "AFRequestCache").exists()) {
                    Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context4);
                    rf.n.e(new File(context4.getFilesDir(), "AFRequestCache"));
                    Context context5 = this.AFAdRevenueData.getMonetizationNetwork;
                    Intrinsics.checkNotNull(context5);
                    new File(context5.getFilesDir(), "AFRequestCache").mkdir();
                }
            }
            getMonetizationNetwork();
        } catch (Exception e7) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not init cache", e7, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final void getRevenue() {
        try {
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
                Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context2);
                new File(context2.getFilesDir(), "AFRequestCache").mkdir();
                return;
            }
            Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
            while (it.hasNext()) {
                String str = ((AFc1sSDK) it.next()).AFAdRevenueData;
                Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
                Intrinsics.checkNotNull(context3);
                File[] listFiles = new File(new File(context3.getFilesDir(), "AFRequestCache"), str).listFiles();
                if (listFiles != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    for (File file : listFiles) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "ClearCache : Found cached request " + file.getName(), false, 4, null);
                        AFh1ySDK.i$default(aFLogger, aFg1cSDK, "Deleting " + file.getName() + " from cache", false, 4, null);
                        file.delete();
                    }
                }
            }
            Context context4 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context4);
            rf.n.e(new File(context4.getFilesDir(), "AFRequestCache"));
            getMonetizationNetwork();
        } catch (Exception e7) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not clearCache request", e7, false, false, false, false, 120, null);
        }
    }

    private final String AFAdRevenueData(AFe1pSDK aFe1pSDK) {
        String str;
        AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK);
        if (mediationNetwork == null || (str = mediationNetwork.AFAdRevenueData) == null) {
            throw new UnsupportedOperationException("Cache do not support this type of events");
        }
        return str;
    }

    private final boolean getMediationNetwork(File file) {
        try {
            file.delete();
            getMonetizationNetwork();
            return true;
        } catch (Exception e7) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, c1.n("Could not delete ", file.getName(), " from cache"), e7, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1tSDK
    public final boolean getRevenue(@Nullable String str) {
        if (str == null) {
            return false;
        }
        Context context = this.AFAdRevenueData.getMonetizationNetwork;
        Intrinsics.checkNotNull(context);
        if (!new File(context.getFilesDir(), "AFRequestCache").exists()) {
            Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context2);
            new File(context2.getFilesDir(), "AFRequestCache").mkdir();
            return true;
        }
        AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, c1.n("Deleting ", str, " from cache"), false, 4, null);
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (it.hasNext()) {
            String str2 = ((AFc1sSDK) it.next()).AFAdRevenueData;
            Context context3 = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context3);
            File file = new File(new File(new File(context3.getFilesDir(), "AFRequestCache"), str2), str);
            if (file.exists()) {
                return getMediationNetwork(file);
            }
        }
        return true;
    }

    private final AFc1sSDK getMediationNetwork(AFe1pSDK aFe1pSDK) {
        Object obj;
        Iterator<T> it = this.getRevenue.getMediationNetwork.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AFc1sSDK) obj).getMediationNetwork.contains(aFe1pSDK)) {
                break;
            }
        }
        return (AFc1sSDK) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026e  */
    @Override // com.appsflyer.internal.AFc1tSDK
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getMediationNetwork(@NotNull AFc1uSDK aFc1uSDK) {
        String str;
        Exception exc;
        File file;
        AFLogger aFLogger;
        Throwable th2;
        String str2;
        List<File> S;
        File file2;
        String str3 = "Cache request: done, cacheKey: ";
        Intrinsics.checkNotNullParameter(aFc1uSDK, "");
        try {
            AFe1pSDK aFe1pSDK = aFc1uSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(aFe1pSDK, "");
            Context context = this.AFAdRevenueData.getMonetizationNetwork;
            Intrinsics.checkNotNull(context);
            File file3 = new File(new File(context.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK));
            if (!file3.exists()) {
                try {
                    file3.mkdirs();
                } catch (Exception e7) {
                    exc = e7;
                    file = 0;
                    str = null;
                    if (file != 0) {
                    }
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                    return str;
                }
            }
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
            AFh1ySDK.i$default(aFLogger2, aFg1cSDK, "Caching request with URL: " + aFc1uSDK.getRevenue, false, 4, null);
            String valueOf = String.valueOf(System.currentTimeMillis());
            File file4 = new File(file3, valueOf);
            try {
                file4.createNewFile();
                String path = file4.getPath();
                str = null;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(path, true);
                    try {
                        if (d4.d().m().isTracingEnabled()) {
                            if (path != null) {
                                aFLogger = aFLogger2;
                                file2 = new File(path);
                            } else {
                                aFLogger = aFLogger2;
                                file2 = null;
                            }
                            fileOutputStream = new io.sentry.instrumentation.file.f(io.sentry.instrumentation.file.f.c(file2, fileOutputStream, true));
                        } else {
                            aFLogger = aFLogger2;
                        }
                        try {
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, Charset.defaultCharset());
                            try {
                                outputStreamWriter.write("version=");
                                outputStreamWriter.write(aFc1uSDK.getCurrencyIso4217Code);
                                outputStreamWriter.write(10);
                                outputStreamWriter.write("url=");
                                outputStreamWriter.write(aFc1uSDK.getRevenue);
                                outputStreamWriter.write(10);
                                outputStreamWriter.write("data=");
                                outputStreamWriter.write(Base64.encodeToString(aFc1uSDK.getMediationNetwork(), 2));
                                outputStreamWriter.write(10);
                                AFe1pSDK aFe1pSDK2 = aFc1uSDK.AFAdRevenueData;
                                outputStreamWriter.write("type=");
                                outputStreamWriter.write(aFe1pSDK2.name());
                                outputStreamWriter.write(10);
                                Map<String, String> map = aFc1uSDK.getMonetizationNetwork;
                                if (map != null) {
                                    try {
                                        if (!map.isEmpty()) {
                                            outputStreamWriter.write("headers=");
                                            Map<String, String> map2 = aFc1uSDK.getMonetizationNetwork;
                                            Intrinsics.checkNotNull(map2, "");
                                            String jSONObject = new JSONObject(map2).toString();
                                            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                                            byte[] bytes = jSONObject.getBytes(Charsets.UTF_8);
                                            Intrinsics.checkNotNullExpressionValue(bytes, "");
                                            outputStreamWriter.write(Base64.encodeToString(bytes, 2));
                                            outputStreamWriter.write(10);
                                        }
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        str3 = file4;
                                        try {
                                            throw th2;
                                        } catch (Throwable th4) {
                                            com.google.android.play.core.appupdate.b.g(outputStreamWriter, th2);
                                            throw th4;
                                        }
                                    }
                                }
                                outputStreamWriter.flush();
                                Unit unit = Unit.f19194a;
                                outputStreamWriter.close();
                                AFLogger aFLogger3 = aFLogger;
                                AFh1ySDK.i$default(aFLogger3, aFg1cSDK, "Cache request: done, cacheKey: " + valueOf, false, 4, null);
                                AFe1pSDK aFe1pSDK3 = aFc1uSDK.AFAdRevenueData;
                                Intrinsics.checkNotNullExpressionValue(aFe1pSDK3, "");
                                AFc1sSDK mediationNetwork = getMediationNetwork(aFe1pSDK3);
                                Integer valueOf2 = mediationNetwork != null ? Integer.valueOf(mediationNetwork.getMonetizationNetwork) : null;
                                if (valueOf2 == null) {
                                    return valueOf;
                                }
                                int intValue = valueOf2.intValue();
                                Map<String, Integer> map3 = this.getMonetizationNetwork;
                                AFc1sSDK mediationNetwork2 = getMediationNetwork(aFe1pSDK3);
                                if (mediationNetwork2 != null && (str2 = mediationNetwork2.AFAdRevenueData) != null) {
                                    Integer num = map3.get(str2);
                                    int intValue2 = num != null ? num.intValue() : 0;
                                    if (intValue2 >= intValue) {
                                        int i5 = (intValue2 + 1) - intValue;
                                        AFh1ySDK.i$default(aFLogger3, aFg1cSDK, "Cache overflown for type " + aFe1pSDK3 + ", removing " + i5 + " item(s)", false, 4, null);
                                        Context context2 = this.AFAdRevenueData.getMonetizationNetwork;
                                        Intrinsics.checkNotNull(context2);
                                        File file5 = new File(new File(context2.getFilesDir(), "AFRequestCache"), AFAdRevenueData(aFe1pSDK3));
                                        if (!file5.exists()) {
                                            file5.mkdirs();
                                        }
                                        Object[] listFiles = file5.listFiles();
                                        if (listFiles != null) {
                                            Comparator comparator = new Comparator() { // from class: com.appsflyer.internal.AFc1vSDK.4
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // java.util.Comparator
                                                public final int compare(T t3, T t5) {
                                                    return jf.a.a(((File) t3).getName(), ((File) t5).getName());
                                                }
                                            };
                                            Intrinsics.checkNotNullParameter(listFiles, "<this>");
                                            Intrinsics.checkNotNullParameter(comparator, "comparator");
                                            Intrinsics.checkNotNullParameter(listFiles, "<this>");
                                            Intrinsics.checkNotNullParameter(comparator, "comparator");
                                            if (listFiles.length != 0) {
                                                listFiles = Arrays.copyOf(listFiles, listFiles.length);
                                                Intrinsics.checkNotNullExpressionValue(listFiles, "copyOf(...)");
                                                Intrinsics.checkNotNullParameter(listFiles, "<this>");
                                                Intrinsics.checkNotNullParameter(comparator, "comparator");
                                                if (listFiles.length > 1) {
                                                    Arrays.sort(listFiles, comparator);
                                                }
                                            }
                                            List c2 = kotlin.collections.o.c(listFiles);
                                            if (c2 != null && (S = CollectionsKt.S(i5, c2)) != null) {
                                                for (File file6 : S) {
                                                    file6.delete();
                                                    AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Cache entry " + file6.getName() + " removed", false, 4, null);
                                                }
                                            }
                                        }
                                    }
                                    getMonetizationNetwork();
                                    return valueOf;
                                }
                                throw new UnsupportedOperationException("Cache do not support this type of events");
                            } catch (Throwable th5) {
                                str3 = file4;
                                th2 = th5;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            exc = e;
                            file = str3;
                            if (file != 0) {
                                file.delete();
                            }
                            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                            return str;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        str3 = file4;
                    }
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    file = file4;
                    if (file != 0) {
                    }
                    AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.CACHE, "Could not cache request", exc, false, false, false, false, 120, null);
                    return str;
                }
            } catch (Exception e12) {
                e = e12;
                str = null;
            }
        } catch (Exception e13) {
            str = null;
            exc = e13;
            file = 0;
        }
    }
}
