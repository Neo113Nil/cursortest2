package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1jSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFd1iSDK implements AFd1gSDK {
    private final AFd1lSDK getMediationNetwork;

    public AFd1iSDK(AFd1lSDK aFd1lSDK) {
        Intrinsics.checkNotNullParameter(aFd1lSDK, "");
        this.getMediationNetwork = aFd1lSDK;
    }

    private final File getRevenue() {
        Context context = this.getMediationNetwork.getCurrencyIso4217Code;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final String getCurrencyIso4217Code(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File revenue = getRevenue();
            str2 = null;
            if (revenue != null) {
                file = new File(revenue, "6.15.1");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    AFd1jSDK currencyIso4217Code = AFd1bSDK.getCurrencyIso4217Code(th, str);
                    String str3 = currencyIso4217Code.AFAdRevenueData;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        AFd1jSDK.Companion companion = AFd1jSDK.INSTANCE;
                        AFd1jSDK mediationNetwork = AFd1jSDK.Companion.getMediationNetwork(FilesKt.readText$default(file2, null, 1, null));
                        if (mediationNetwork != null) {
                            mediationNetwork.getCurrencyIso4217Code++;
                            currencyIso4217Code = mediationNetwork;
                        }
                    }
                    FilesKt.writeText$default(file2, currencyIso4217Code.getMonetizationNetwork(), null, 2, null);
                    str2 = str3;
                } catch (Exception e) {
                    AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: all -> 0x008c, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x001b, B:24:0x0076, B:26:0x0079, B:31:0x0051, B:33:0x007c, B:35:0x0086, B:11:0x001d, B:13:0x0023, B:15:0x0033, B:17:0x0047, B:19:0x004a, B:22:0x004d), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1gSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFd1jSDK> getCurrencyIso4217Code() {
        List<AFd1jSDK> list;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            File revenue = getRevenue();
            list = null;
            if (revenue != null && (listFiles = revenue.listFiles()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file : listFiles) {
                    try {
                        listFiles2 = file.listFiles();
                    } catch (Throwable th) {
                        AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                    }
                    if (listFiles2 != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles2, "");
                        ArrayList arrayList3 = new ArrayList();
                        for (File file2 : listFiles2) {
                            AFd1jSDK.Companion companion = AFd1jSDK.INSTANCE;
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            AFd1jSDK mediationNetwork = AFd1jSDK.Companion.getMediationNetwork(FilesKt.readText$default(file2, null, 1, null));
                            if (mediationNetwork != null) {
                                arrayList3.add(mediationNetwork);
                            }
                        }
                        arrayList = arrayList3;
                        if (arrayList == null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    arrayList = null;
                    if (arrayList == null) {
                    }
                }
                list = CollectionsKt.flatten(arrayList2);
            }
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final int getMonetizationNetwork() {
        Iterator<T> it = getCurrencyIso4217Code().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AFd1jSDK) it.next()).getCurrencyIso4217Code;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean getMediationNetwork() {
        return getCurrencyIso4217Code(new String[0]);
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean getCurrencyIso4217Code(String... strArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            File revenue = getRevenue();
            z = true;
            if (revenue != null) {
                if (strArr.length == 0) {
                    AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                    z = FilesKt.deleteRecursively(revenue);
                } else {
                    AFh1wSDK.v$default(AFLogger.INSTANCE, AFh1xSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + ArraysKt.joinToString$default(strArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), false, 4, null);
                    File[] listFiles = revenue.listFiles();
                    if (listFiles != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles, "");
                        ArrayList arrayList = new ArrayList();
                        for (File file : listFiles) {
                            if (!ArraysKt.contains(strArr, file.getName())) {
                                arrayList.add(file);
                            }
                        }
                        ArrayList<File> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        for (File file2 : arrayList2) {
                            Intrinsics.checkNotNullExpressionValue(file2, "");
                            arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                        }
                        Set set = CollectionsKt.toSet(arrayList3);
                        if (set.isEmpty()) {
                            set = SetsKt.setOf(Boolean.TRUE);
                        }
                        Set set2 = set;
                        if (set2.size() != 1 || !((Boolean) CollectionsKt.first(set2)).booleanValue()) {
                            z = false;
                        }
                    }
                }
            }
        }
        return z;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final void AFAdRevenueData(int i, int i2) {
        File[] listFiles;
        synchronized (this) {
            File revenue = getRevenue();
            if (revenue != null && (listFiles = revenue.listFiles()) != null) {
                Intrinsics.checkNotNullExpressionValue(listFiles, "");
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    int AFAdRevenueData = AFc1tSDK.AFAdRevenueData(name);
                    if (i > AFAdRevenueData || AFAdRevenueData > i2) {
                        arrayList.add(file);
                    }
                }
                ArrayList<File> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (File file2 : arrayList2) {
                    Intrinsics.checkNotNullExpressionValue(file2, "");
                    arrayList3.add(Boolean.valueOf(FilesKt.deleteRecursively(file2)));
                }
                ArrayList arrayList4 = arrayList3;
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
