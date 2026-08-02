package com.braze.triggers.managers;

import android.content.Context;
import android.net.Uri;
import androidx.datastore.preferences.core.Preferences;
import com.braze.Constants;
import com.braze.storage.j3;
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

/* loaded from: classes6.dex */
public final class a {
    public static final String b(File file) {
        return "Deleting obsolete asset '" + file.getPath() + "' from filesystem.";
    }

    public static final String c(File file) {
        return "Deleting triggers directory at: " + file.getAbsolutePath();
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final File file = new File(context.getCacheDir(), Constants.TRIGGERS_ASSETS_FOLDER);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.c(file);
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.a(Ref.ObjectRef.this, remoteAssetUrl);
                }
            }, 6, (Object) null);
        }
        int requestCode = IntentUtils.getRequestCode();
        Object obj = objectRef.element;
        StringBuilder sb = new StringBuilder();
        sb.append(requestCode);
        sb.append(obj);
        return sb.toString();
    }

    public final void a(File triggeredAssetDirectory, ConcurrentHashMap remoteToLocalAssetsMap, LinkedHashMap preservedLocalAssetMap) {
        Intrinsics.checkNotNullParameter(triggeredAssetDirectory, "triggeredAssetDirectory");
        Intrinsics.checkNotNullParameter(remoteToLocalAssetsMap, "remoteToLocalAssetsMap");
        Intrinsics.checkNotNullParameter(preservedLocalAssetMap, "preservedLocalAssetMap");
        final File[] listFiles = triggeredAssetDirectory.listFiles();
        if (listFiles == null) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a.a(listFiles);
            }
        }, 6, (Object) null);
        try {
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                if (!remoteToLocalAssetsMap.containsValue(file.getPath())) {
                    arrayList.add(file);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!preservedLocalAssetMap.containsValue(((File) next).getPath())) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                final File file2 = (File) it2.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b.e, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a.b(file2);
                    }
                }, 7, (Object) null);
                Intrinsics.checkNotNull(file2);
                BrazeFileUtils.deleteFileOrDirectory(file2);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a(File[] fileArr) {
        return "Local triggered asset directory contains files: " + ArraysKt.joinToString$default(fileArr, " , ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a.a((File) obj);
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

    public final ConcurrentHashMap a(j3 dataStoreProvider) {
        Intrinsics.checkNotNullParameter(dataStoreProvider, "dataStoreProvider");
        try {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<Preferences.Key<?>, Object> entry : dataStoreProvider.readAllData().entrySet()) {
                final Preferences.Key<?> key = entry.getKey();
                final Object value = entry.getValue();
                if (!StringsKt.isBlank(key.getName()) && (value instanceof String) && !StringsKt.isBlank((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a.a(value, key);
                        }
                    }, 7, (Object) null);
                    concurrentHashMap.put(key.getName(), value);
                }
            }
            return concurrentHashMap;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.b();
                }
            }, 4, (Object) null);
            return new ConcurrentHashMap();
        }
    }

    public static final String a(Object obj, Preferences.Key key) {
        return "Retrieving trigger local asset path '" + obj + "' from DataStore for remote path '" + key.getName() + "'";
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a.a(str);
                    }
                }, 7, (Object) null);
            } else if (!newRemotePathStrings.contains(str)) {
                final String str2 = (String) localAssetPaths.remove(str);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a.a(str2, str);
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
            final com.braze.triggers.actions.a aVar = (com.braze.triggers.actions.a) it.next();
            if (!((com.braze.triggers.actions.g) aVar).c) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a.a(com.braze.triggers.actions.a.this);
                    }
                }, 7, (Object) null);
            } else {
                Iterator it2 = aVar.b().iterator();
                while (it2.hasNext()) {
                    com.braze.triggers.utils.a aVar2 = (com.braze.triggers.utils.a) it2.next();
                    final String str = aVar2.b;
                    if (!StringsKt.isBlank(str)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.triggers.managers.a$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return a.a(com.braze.triggers.actions.a.this, str);
                            }
                        }, 7, (Object) null);
                        linkedHashSet.add(aVar2);
                        linkedHashSet2.add(str);
                    }
                }
            }
        }
        return new Pair(linkedHashSet, linkedHashSet2);
    }

    public static final String a(com.braze.triggers.actions.a aVar) {
        return "Pre-fetch off for triggered action " + ((com.braze.triggers.actions.g) aVar).c() + ". Not pre-fetching assets.";
    }

    public static final String a(com.braze.triggers.actions.a aVar, String str) {
        return "Received new remote path for triggered action " + ((com.braze.triggers.actions.g) aVar).c() + " at " + str + ".";
    }

    public static final String a(Ref.ObjectRef objectRef, String str) {
        return "Using file extension " + objectRef.element + " for remote asset url: " + str;
    }
}
