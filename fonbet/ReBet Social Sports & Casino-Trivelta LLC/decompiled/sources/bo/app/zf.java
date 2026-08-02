package bo.app;

import android.content.Context;
import android.net.Uri;
import bo.app.zf;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class zf {

    /* renamed from: e, reason: collision with root package name */
    public static final yf f26359e = new yf();

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.storage.s f26360a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f26361b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f26362c;

    /* renamed from: d, reason: collision with root package name */
    public final File f26363d;

    public zf(Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        com.braze.storage.s sVar = new com.braze.storage.s(context, apiKey);
        this.f26360a = sVar;
        this.f26361b = f26359e.a(sVar);
        this.f26362c = new LinkedHashMap();
        this.f26363d = new File(context.getCacheDir().getPath() + "/ab_triggers");
    }

    public static final String b(y9 y9Var) {
        return "Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: " + ((rg) y9Var).f26028a;
    }

    public static final String c(String str, String str2) {
        return "Adding new local path '" + str + "' for remote path '" + str2 + "' to cache.";
    }

    public static final String d(String str) {
        return "Could not find local asset for remote path " + str;
    }

    public static final String e(String str) {
        return "Failed to add new local path for remote path " + str;
    }

    public static final String f(String str) {
        return "Removed from DataStore: " + str;
    }

    public final String a(wc remotePath) {
        Long a10;
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        final String str = remotePath.f26202b;
        int ordinal = remotePath.f26201a.ordinal();
        if (ordinal == 0) {
            final String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(this.f26363d, str);
            if (localHtmlUrlFromRemoteUrl == null || StringsKt.isBlank(localHtmlUrlFromRemoteUrl)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Nd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zf.a(str);
                    }
                }, 7, (Object) null);
                return null;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Md
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zf.a(localHtmlUrlFromRemoteUrl, str);
                }
            }, 6, (Object) null);
            return localHtmlUrlFromRemoteUrl;
        }
        if (ordinal != 1 && ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String b10 = f26359e.b(str);
        try {
            String file = this.f26363d.toString();
            Intrinsics.checkNotNullExpressionValue(file, "toString(...)");
            Pair downloadFileToPath$default = BrazeFileUtils.downloadFileToPath$default(file, str, b10, null, 8, null);
            File file2 = (File) downloadFileToPath$default.component1();
            final Map map = (Map) downloadFileToPath$default.component2();
            String str2 = (String) map.get("expires");
            if (str2 != null && (a10 = com.braze.support.h.a(str2)) != null && a10.longValue() <= 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Wd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zf.a(str, map);
                    }
                }, 7, (Object) null);
                return null;
            }
            final Uri fromFile = Uri.fromFile(file2);
            if (fromFile != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.Jd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zf.a(fromFile, str);
                    }
                }, 6, (Object) null);
                return fromFile.getPath();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Kd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zf.c(str);
                }
            }, 7, (Object) null);
            return null;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Ld
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zf.b(str);
                }
            }, 4, (Object) null);
            return null;
        }
    }

    public static final String c(y9 y9Var) {
        return "No local assets found for action id: " + ((rg) y9Var).f26028a;
    }

    public static final String d(String str, String str2) {
        return "Added to DataStore: " + str + " -> " + str2;
    }

    public static final String b(String str, String str2) {
        return "Found local asset at path " + str + " for remote asset at path: " + str2;
    }

    public static final String b(String str) {
        return "Could not download " + str;
    }

    public static final String c(String str) {
        return "Failed to store asset for remote path " + str + ". Not storing local asset";
    }

    public final void a(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        yf yfVar = f26359e;
        Pair a10 = yfVar.a(triggeredActions);
        Set set = (Set) a10.component1();
        LinkedHashSet a11 = yfVar.a(this.f26361b, (Set) a10.component2(), this.f26362c);
        yfVar.a(this.f26363d, this.f26361b, this.f26362c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!this.f26361b.containsKey(((wc) obj).f26202b)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            wc wcVar = (wc) arrayList.get(i10);
            final String str = wcVar.f26202b;
            try {
                final String a12 = a(wcVar);
                if (a12 != null && !StringsKt.isBlank(a12)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Rd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return zf.c(a12, str);
                        }
                    }, 7, (Object) null);
                    this.f26361b.put(str, a12);
                    linkedHashMap.put(str, a12);
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Sd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zf.e(str);
                    }
                }, 4, (Object) null);
            }
            i10 = i11;
        }
        a(linkedHashMap, a11);
    }

    public final Map a(final y9 triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        if (!((rg) triggeredAction).f26030c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Id
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zf.b(bo.app.y9.this);
                }
            }, 7, (Object) null);
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList a10 = triggeredAction.a();
        int size = a10.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            final String str = ((wc) a10.get(i10)).f26202b;
            final String path = (String) this.f26361b.get(str);
            if (path != null) {
                Intrinsics.checkNotNullParameter(path, "path");
                if (new File(path).exists()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Od
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return zf.b(path, str);
                        }
                    }, 7, (Object) null);
                    this.f26362c.put(str, path);
                    linkedHashMap.put(str, path);
                    i10 = i11;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.Pd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zf.d(str);
                }
            }, 6, (Object) null);
            i10 = i11;
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.Qd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zf.c(bo.app.y9.this);
                }
            }, 6, (Object) null);
        }
        return linkedHashMap;
    }

    public static final String a(String str, String str2) {
        return "Storing local triggered action html zip asset at local path " + str + " for remote path " + str2;
    }

    public static final String a(String str) {
        return "Failed to store html zip asset for remote path " + str + ". Not storing local asset";
    }

    public static final String a(String str, Map map) {
        return "Not caching " + str + " due to headers " + map;
    }

    public static final String a(Uri uri, String str) {
        return "Storing local triggered action asset at local path " + uri.getPath() + " for remote path " + str;
    }

    public final void a(LinkedHashMap assetsToAdd, LinkedHashSet remoteUrlsToRemove) {
        Intrinsics.checkNotNullParameter(assetsToAdd, "assetsToAdd");
        Intrinsics.checkNotNullParameter(remoteUrlsToRemove, "remoteUrlsToRemove");
        if (assetsToAdd.isEmpty() && remoteUrlsToRemove.isEmpty()) {
            return;
        }
        try {
            this.f26360a.batchUpdate(assetsToAdd, remoteUrlsToRemove);
            for (Map.Entry entry : assetsToAdd.entrySet()) {
                final String str = (String) entry.getKey();
                final String str2 = (String) entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Td
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zf.d(str, str2);
                    }
                }, 7, (Object) null);
            }
            Iterator it = remoteUrlsToRemove.iterator();
            while (it.hasNext()) {
                final String str3 = (String) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Ud
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return zf.f(str3);
                    }
                }, 7, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Vd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zf.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to update DataStore";
    }
}
