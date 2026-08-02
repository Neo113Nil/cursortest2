package bo.app;

import L0.f;
import android.content.Context;
import android.net.Uri;
import bo.app.yf;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class yf {
    public static final String b(File file) {
        return "Deleting obsolete asset '" + file.getPath() + "' from filesystem.";
    }

    public static final String c(File file) {
        return "Deleting triggers directory at: " + file.getAbsolutePath();
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final File file = new File(context.getCacheDir(), "ab_triggers");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.kd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return yf.c(file);
            }
        }, 6, (Object) null);
        BrazeFileUtils.deleteFileOrDirectory(file);
    }

    public static final String b() {
        return "Failed to retrieve local assets from DataStore";
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object, java.lang.String] */
    public final String b(final String remoteAssetUrl) {
        int lastIndexOf$default;
        Intrinsics.checkNotNullParameter(remoteAssetUrl, "remoteAssetUrl");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        String lastPathSegment = Uri.parse(remoteAssetUrl).getLastPathSegment();
        if (lastPathSegment != null && lastPathSegment.length() != 0 && (lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) lastPathSegment, '.', 0, false, 6, (Object) null)) > -1) {
            ?? substring = lastPathSegment.substring(lastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            objectRef.element = substring;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.ld
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return yf.a(Ref.ObjectRef.this, remoteAssetUrl);
                }
            }, 6, (Object) null);
        }
        int requestCode = IntentUtils.getRequestCode();
        Object obj = objectRef.element;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(requestCode);
        sb2.append(obj);
        return sb2.toString();
    }

    public final void a(File triggeredAssetDirectory, ConcurrentHashMap remoteToLocalAssetsMap, LinkedHashMap preservedLocalAssetMap) {
        Intrinsics.checkNotNullParameter(triggeredAssetDirectory, "triggeredAssetDirectory");
        Intrinsics.checkNotNullParameter(remoteToLocalAssetsMap, "remoteToLocalAssetsMap");
        Intrinsics.checkNotNullParameter(preservedLocalAssetMap, "preservedLocalAssetMap");
        final File[] listFiles = triggeredAssetDirectory.listFiles();
        if (listFiles == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.pd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return yf.a(listFiles);
            }
        }, 6, (Object) null);
        try {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (File file : listFiles) {
                if (!remoteToLocalAssetsMap.containsValue(file.getPath())) {
                    arrayList.add(file);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (!preservedLocalAssetMap.containsValue(((File) obj).getPath())) {
                    arrayList2.add(obj);
                }
            }
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                final File file2 = (File) obj2;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) zf.f26359e, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.qd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return yf.b(file2);
                    }
                }, 7, (Object) null);
                Intrinsics.checkNotNull(file2);
                BrazeFileUtils.deleteFileOrDirectory(file2);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.rd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return yf.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(File[] fileArr) {
        return "Local triggered asset directory contains files: " + ArraysKt.joinToString$default(fileArr, " , ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: c3.md
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return yf.a((File) obj);
            }
        }, 30, (Object) null);
    }

    public static final CharSequence a(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public static final String a() {
        return "Exception while deleting obsolete assets from filesystem.";
    }

    public final ConcurrentHashMap a(com.braze.storage.s dataStoreProvider) {
        Intrinsics.checkNotNullParameter(dataStoreProvider, "dataStoreProvider");
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<f.a, Object> entry : dataStoreProvider.readAllData().entrySet()) {
                final f.a key = entry.getKey();
                final Object value = entry.getValue();
                if (!StringsKt.isBlank(key.a()) && (value instanceof String) && !StringsKt.isBlank((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.nd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return yf.a(value, key);
                        }
                    }, 7, (Object) null);
                    concurrentHashMap.put(key.a(), value);
                }
            }
            return concurrentHashMap;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.od
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return yf.b();
                }
            }, 4, (Object) null);
            return new ConcurrentHashMap();
        }
    }

    public static final String a(Object obj, f.a aVar) {
        return "Retrieving trigger local asset path '" + obj + "' from DataStore for remote path '" + aVar.a() + "'";
    }

    public final LinkedHashSet a(ConcurrentHashMap localAssetPaths, Set newRemotePathStrings, LinkedHashMap preservedLocalAssetPathMap) {
        Intrinsics.checkNotNullParameter(localAssetPaths, "localAssetPaths");
        Intrinsics.checkNotNullParameter(newRemotePathStrings, "newRemotePathStrings");
        Intrinsics.checkNotNullParameter(preservedLocalAssetPathMap, "preservedLocalAssetPathMap");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = new HashSet(localAssetPaths.keySet()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            final String str = (String) it.next();
            if (preservedLocalAssetPathMap.containsKey(str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ud
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return yf.a(str);
                    }
                }, 7, (Object) null);
            } else if (!newRemotePathStrings.contains(str)) {
                final String str2 = (String) localAssetPaths.remove(str);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.vd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return yf.a(str2, str);
                        }
                    }, 7, (Object) null);
                    BrazeFileUtils.deleteFileOrDirectory(new File(str2));
                }
            }
        }
        return linkedHashSet;
    }

    public static final String a(String str) {
        return "Not removing local path for remote path " + str + " from cache because it is being preserved until the end of the app run.";
    }

    public static final String a(String str, String str2) {
        return "Removing obsolete local path " + str + " for obsolete remote path " + str2 + " from cache.";
    }

    public final Pair a(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = triggeredActions.iterator();
        while (it.hasNext()) {
            final y9 y9Var = (y9) it.next();
            if (!((rg) y9Var).f26030c) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.sd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return yf.a(bo.app.y9.this);
                    }
                }, 7, (Object) null);
            } else {
                ArrayList a10 = y9Var.a();
                int size = a10.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = a10.get(i10);
                    i10++;
                    wc wcVar = (wc) obj;
                    final String str = wcVar.f26202b;
                    if (!StringsKt.isBlank(str)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.td
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return yf.a(bo.app.y9.this, str);
                            }
                        }, 7, (Object) null);
                        linkedHashSet.add(wcVar);
                        linkedHashSet2.add(str);
                    }
                }
            }
        }
        return new Pair(linkedHashSet, linkedHashSet2);
    }

    public static final String a(y9 y9Var) {
        return "Pre-fetch off for triggered action " + ((rg) y9Var).f26028a + ". Not pre-fetching assets.";
    }

    public static final String a(y9 y9Var, String str) {
        return "Received new remote path for triggered action " + ((rg) y9Var).f26028a + " at " + str + ".";
    }

    public static final String a(Ref.ObjectRef objectRef, String str) {
        return "Using file extension " + objectRef.element + " for remote asset url: " + str;
    }
}
