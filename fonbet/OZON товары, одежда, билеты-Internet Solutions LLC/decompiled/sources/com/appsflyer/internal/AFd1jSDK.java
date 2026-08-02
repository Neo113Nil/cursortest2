package com.appsflyer.internal;

import Sc.C4001c;
import android.content.Context;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1aSDK;
import com.appsflyer.internal.AFd1fSDK;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFd1jSDK implements AFd1gSDK {

    @NotNull
    private final AFd1kSDK valueOf;

    public AFd1jSDK(@NotNull AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.valueOf = aFd1kSDK;
    }

    private final File valueOf() {
        Context context = this.valueOf.valueOf;
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
    public final boolean AFInAppEventParameterName() {
        return valueOf(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069 A[Catch: all -> 0x006d, TryCatch #1 {all -> 0x006d, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0018, B:23:0x0069, B:25:0x006f, B:30:0x004a, B:32:0x0072, B:34:0x0078, B:11:0x001a, B:13:0x0020, B:15:0x002e, B:17:0x0041), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFd1gSDK
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AFd1fSDK> AFInAppEventType() {
        List<AFd1fSDK> list;
        File[] listFiles;
        ArrayList arrayList;
        File[] listFiles2;
        synchronized (this) {
            try {
                File valueOf = valueOf();
                list = null;
                if (valueOf != null && (listFiles = valueOf.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : listFiles) {
                        try {
                            listFiles2 = file.listFiles();
                        } catch (Throwable th2) {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1gSDK aFg1gSDK = AFg1gSDK.EXCEPTION_MANAGER;
                            StringBuilder sb2 = new StringBuilder("Could not get stored exceptions\n ");
                            sb2.append(th2.getMessage());
                            AFg1hSDK.v$default(aFLogger, aFg1gSDK, sb2.toString(), false, 4, null);
                        }
                        if (listFiles2 != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles2, "");
                            arrayList = new ArrayList();
                            for (File file2 : listFiles2) {
                                AFd1fSDK.Companion companion = AFd1fSDK.INSTANCE;
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                AFd1fSDK AFInAppEventParameterName = AFd1fSDK.Companion.AFInAppEventParameterName(bd.h.l(file2));
                                if (AFInAppEventParameterName != null) {
                                    arrayList.add(AFInAppEventParameterName);
                                }
                            }
                            if (arrayList == null) {
                                arrayList2.add(arrayList);
                            }
                        }
                        arrayList = null;
                        if (arrayList == null) {
                        }
                    }
                    list = C7714v.N(arrayList2);
                }
                if (list == null) {
                    list = K.f71697a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return list;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final int AFKeystoreWrapper() {
        Iterator<T> it = AFInAppEventType().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((AFd1fSDK) it.next()).values;
        }
        return i11;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final void AFKeystoreWrapper(int i11, int i12) {
        File[] listFiles;
        synchronized (this) {
            try {
                File valueOf = valueOf();
                if (valueOf != null && (listFiles = valueOf.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(listFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : listFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int valueOf2 = AFc1tSDK.valueOf(name);
                        if (i11 > valueOf2 || valueOf2 > i12) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(bd.h.h(file2)));
                    }
                }
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final String valueOf(@NotNull Throwable th2, @NotNull String str) {
        String str2;
        File file;
        AFd1fSDK AFInAppEventParameterName;
        Intrinsics.checkNotNullParameter(th2, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File valueOf = valueOf();
            str2 = null;
            if (valueOf != null) {
                file = new File(valueOf, "6.13.1");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    Intrinsics.checkNotNullParameter(th2, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    StringBuilder sb2 = new StringBuilder();
                    Intrinsics.checkNotNullParameter(th2, "");
                    String name = th2.getClass().getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    sb2.append(name);
                    sb2.append(": ");
                    sb2.append(str);
                    String obj = sb2.toString();
                    Intrinsics.checkNotNullParameter(th2, "");
                    Intrinsics.checkNotNullParameter(th2, "");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(th2);
                    sb3.append('\n');
                    sb3.append(C7714v.V(AFd1aSDK.AFInAppEventParameterName(th2), "\n", null, null, AFd1aSDK.AnonymousClass3.valueOf, 30));
                    String obj2 = sb3.toString();
                    Intrinsics.checkNotNullParameter(obj2, "");
                    AFd1fSDK aFd1fSDK = new AFd1fSDK(obj, AFe1zSDK.AFKeystoreWrapper(obj2, "SHA-256"), C4001c.b(th2), 0, 8, null);
                    String str3 = aFd1fSDK.AFInAppEventParameterName;
                    File file2 = new File(file, str3);
                    if (file2.exists() && (AFInAppEventParameterName = AFd1fSDK.Companion.AFInAppEventParameterName(bd.h.l(file2))) != null) {
                        AFInAppEventParameterName.values++;
                        aFd1fSDK = AFInAppEventParameterName;
                    }
                    StringBuilder sb4 = new StringBuilder("label=");
                    String str4 = aFd1fSDK.AFInAppEventType;
                    Intrinsics.checkNotNullParameter(str4, "");
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = str4.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    sb4.append(Base64.encodeToString(bytes, 2));
                    sb4.append("\nhashName=");
                    String str5 = aFd1fSDK.AFInAppEventParameterName;
                    Intrinsics.checkNotNullParameter(str5, "");
                    byte[] bytes2 = str5.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    sb4.append(Base64.encodeToString(bytes2, 2));
                    sb4.append("\nstackTrace=");
                    String str6 = aFd1fSDK.valueOf;
                    Intrinsics.checkNotNullParameter(str6, "");
                    byte[] bytes3 = str6.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "");
                    sb4.append(Base64.encodeToString(bytes3, 2));
                    sb4.append("\nc=");
                    sb4.append(aFd1fSDK.values);
                    bd.h.o(file2, sb4.toString(), Charsets.UTF_8);
                    str2 = str3;
                } catch (Exception e11) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1gSDK aFg1gSDK = AFg1gSDK.EXCEPTION_MANAGER;
                    StringBuilder sb5 = new StringBuilder("Could not cache exception\n ");
                    sb5.append(e11.getMessage());
                    AFg1hSDK.v$default(aFLogger, aFg1gSDK, sb5.toString(), false, 4, null);
                }
            }
        }
        return str2;
    }

    @Override // com.appsflyer.internal.AFd1gSDK
    public final boolean valueOf(@NotNull String... strArr) {
        boolean z11;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File valueOf = valueOf();
                z11 = true;
                if (valueOf != null) {
                    if (strArr.length == 0) {
                        AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1gSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        z11 = bd.h.h(valueOf);
                    } else {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1gSDK aFg1gSDK = AFg1gSDK.EXCEPTION_MANAGER;
                        StringBuilder sb2 = new StringBuilder("delete all exceptions except for: ");
                        sb2.append(C7705l.P(strArr, ", ", null, null, null, 62));
                        AFg1hSDK.v$default(aFLogger, aFg1gSDK, sb2.toString(), false, 4, null);
                        File[] listFiles = valueOf.listFiles();
                        if (listFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(listFiles, "");
                            ArrayList arrayList = new ArrayList();
                            for (File file : listFiles) {
                                if (!C7705l.m(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                File file2 = (File) it.next();
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(bd.h.h(file2)));
                            }
                            Set Y02 = C7714v.Y0(arrayList2);
                            if (Y02.isEmpty()) {
                                Y02 = e0.h(Boolean.TRUE);
                            }
                            Set set = Y02;
                            if (set.size() != 1 || !((Boolean) C7714v.J(set)).booleanValue()) {
                                z11 = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }
}
