package com.braze.storage;

import I0.C1339d;
import I0.InterfaceC1342g;
import I0.InterfaceC1344i;
import L0.f;
import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.G0;
import Ph.P;
import Ph.Q;
import Ph.X0;
import android.content.Context;
import bo.app.jf;
import bo.app.m9;
import bo.app.r7;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.facebook.hermes.intl.Constants;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 S2\u00020\u0001:\u0001SB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030$\u0012\u0004\u0012\u00020\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J1\u0010.\u001a\u00020\n2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060,H\u0016¢\u0006\u0004\b.\u0010/J+\u00103\u001a\u00020\n\"\u0004\b\u0000\u001002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b1\u00102J3\u00107\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u00100*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000$2\b\u00104\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b5\u00106J'\u0010:\u001a\u00020\u0015\"\b\b\u0000\u00100*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0001¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030$\u0012\u0004\u0012\u00020\u00010#H\u0001¢\u0006\u0004\b<\u0010&J#\u0010@\u001a\u00020\n\"\u0004\b\u0000\u001002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0001¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020\nH\u0001¢\u0006\u0004\bA\u0010*J1\u0010D\u001a\u00020\n2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060,H\u0001¢\u0006\u0004\bC\u0010/J+\u0010J\u001a\b\u0012\u0004\u0012\u00020G0I2\u0014\b\u0002\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0F0EH\u0004¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020O8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/braze/storage/DataStoreProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "message", "", "throwable", "", "publishException", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/braze/enums/DataStoreKey;", "key", EventKeys.VALUE_KEY, "writeData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)V", Constants.COLLATION_DEFAULT, "readData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)Ljava/lang/Object;", "", "readBoolean", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "readString", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/String;)Ljava/lang/String;", "", "readInt", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "readFloat", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Float;)Ljava/lang/Float;", "", "readLong", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Long;)Ljava/lang/Long;", "", "LL0/f$a;", "readAllData", "()Ljava/util/Map;", "clearData", "(Lcom/braze/enums/DataStoreKey;)V", "clearAllData", "()V", "updates", "", "removals", "batchUpdate", "(Ljava/util/Map;Ljava/util/Set;)V", "T", "write$android_sdk_base_release", "(LL0/f$a;Ljava/lang/Object;)V", "write", "defaultValue", "read$android_sdk_base_release", "(LL0/f$a;Ljava/lang/Object;)Ljava/lang/Object;", "read", "contains$android_sdk_base_release", "(LL0/f$a;)Z", "contains", "(Lcom/braze/enums/DataStoreKey;)Z", "readAll$android_sdk_base_release", "readAll", "clear$android_sdk_base_release", "(LL0/f$a;)V", "clear", "clearAll$android_sdk_base_release", "clearAll", "batchUpdates$android_sdk_base_release", "batchUpdates", "", "LI0/g;", "LL0/f;", "migrations", "LI0/i;", "createOrGetDataStore", "(Ljava/util/List;)LI0/i;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "LPh/P;", "getDataStoreScope$android_sdk_base_release", "()LPh/P;", "dataStoreScope", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DataStoreProvider {
    private static m9 eventPublisher;
    private final Context context;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DataStoreProvider.class);
    private static final ConcurrentHashMap<String, InterfaceC1344i> dataStoreInstanceCache = new ConcurrentHashMap<>();
    private static final Object scopeCreationLock = new Object();
    private static final ConcurrentHashMap<String, P> dataStoreScopeMap = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R2\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u0003\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u001dR\u0014\u00100\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u001dR\u0014\u00101\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u001dR\u0014\u00102\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010+¨\u00069"}, d2 = {"Lcom/braze/storage/DataStoreProvider$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "deleteDataStoreFiles", "(Landroid/content/Context;)V", "Ljava/io/File;", "file", "", "maxRetries", "", "delayMs", "deleteFileWithRetry", "(Ljava/io/File;IJ)V", "", "fileName", "", "isWipeableDataStoreFileName", "(Ljava/lang/String;)Z", "key", "LPh/P;", "getOrCreateScopeForKey$android_sdk_base_release", "(Ljava/lang/String;)LPh/P;", "getOrCreateScopeForKey", "shutdownAllDataStores", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lbo/app/m9;", "eventPublisher", "Lbo/app/m9;", "getEventPublisher$android_sdk_base_release", "()Lbo/app/m9;", "setEventPublisher$android_sdk_base_release", "(Lbo/app/m9;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "LI0/i;", "LL0/f;", "dataStoreInstanceCache", "Ljava/util/concurrent/ConcurrentHashMap;", "getDataStoreInstanceCache$android_sdk_base_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "getDataStoreInstanceCache$android_sdk_base_release$annotations", "PERSISTENT_DATASTORE_PREFIX", "BRAZE_DATASTORE_PREFIX", "RUNTIME_CONFIG_PREFIX", "FILE_DELETE_MAX_RETRIES", "I", "FILE_DELETE_RETRY_DELAY_MS", "J", "scopeCreationLock", "Ljava/lang/Object;", "dataStoreScopeMap", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void deleteDataStoreFiles(Context context) {
            File[] listFiles;
            try {
                File file = new File(context.getFilesDir(), "datastore");
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        Companion companion = DataStoreProvider.INSTANCE;
                        String name = file2.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        if (companion.isWipeableDataStoreFileName(name)) {
                            Intrinsics.checkNotNull(file2);
                            deleteFileWithRetry$default(companion, file2, 0, 0L, 6, null);
                        }
                    }
                }
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String deleteDataStoreFiles$lambda$1;
                        deleteDataStoreFiles$lambda$1 = DataStoreProvider.Companion.deleteDataStoreFiles$lambda$1();
                        return deleteDataStoreFiles$lambda$1;
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteDataStoreFiles$lambda$1() {
            return "Failed to delete DataStore files";
        }

        private final void deleteFileWithRetry(final File file, final int maxRetries, long delayMs) {
            for (final int i10 = 0; i10 < maxRetries; i10++) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.INSTANCE, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: X3.E
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String deleteFileWithRetry$lambda$0$0;
                        deleteFileWithRetry$lambda$0$0 = DataStoreProvider.Companion.deleteFileWithRetry$lambda$0$0(file, i10);
                        return deleteFileWithRetry$lambda$0$0;
                    }
                }, 6, (Object) null);
                if (file.delete() || !file.exists()) {
                    return;
                }
                if (i10 < maxRetries - 1) {
                    Thread.sleep(delayMs);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) null, false, new Function0() { // from class: X3.F
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteFileWithRetry$lambda$1;
                    deleteFileWithRetry$lambda$1 = DataStoreProvider.Companion.deleteFileWithRetry$lambda$1(maxRetries, file);
                    return deleteFileWithRetry$lambda$1;
                }
            }, 6, (Object) null);
        }

        public static /* synthetic */ void deleteFileWithRetry$default(Companion companion, File file, int i10, long j10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 3;
            }
            if ((i11 & 4) != 0) {
                j10 = 50;
            }
            companion.deleteFileWithRetry(file, i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$0$0(File file, int i10) {
            return "Deleting DataStore file: " + file.getName() + " (attempt " + (i10 + 1) + ")";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$1(int i10, File file) {
            return "Failed to delete DataStore file after " + i10 + " attempts: " + file.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getOrCreateScopeForKey$lambda$1$1(String str, P p10) {
            return "Creating new CoroutineScope for DataStore for key: " + str + " scope: " + p10;
        }

        public final ConcurrentHashMap<String, InterfaceC1344i> getDataStoreInstanceCache$android_sdk_base_release() {
            return DataStoreProvider.dataStoreInstanceCache;
        }

        public final P getOrCreateScopeForKey$android_sdk_base_release(final String key) {
            final P p10;
            Intrinsics.checkNotNullParameter(key, "key");
            P p11 = (P) DataStoreProvider.dataStoreScopeMap.get(key);
            if (p11 != null && Q.i(p11)) {
                return p11;
            }
            synchronized (DataStoreProvider.scopeCreationLock) {
                try {
                    p10 = (P) DataStoreProvider.dataStoreScopeMap.get(key);
                    if (p10 == null || !Q.i(p10)) {
                        p10 = Q.a(BrazeCoroutineScope.INSTANCE.getCoroutineContext().plus(X0.b(null, 1, null)));
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.INSTANCE, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: X3.C
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String orCreateScopeForKey$lambda$1$1;
                                orCreateScopeForKey$lambda$1$1 = DataStoreProvider.Companion.getOrCreateScopeForKey$lambda$1$1(key, p10);
                                return orCreateScopeForKey$lambda$1$1;
                            }
                        }, 6, (Object) null);
                        DataStoreProvider.dataStoreScopeMap.put(key, p10);
                    }
                } finally {
                }
            }
            return p10;
        }

        public final String getTAG() {
            return DataStoreProvider.TAG;
        }

        public final boolean isWipeableDataStoreFileName(String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return (!StringsKt.startsWith$default(fileName, "com.braze", false, 2, (Object) null) || StringsKt.startsWith$default(fileName, "com.braze.override.runtime_config", false, 2, (Object) null) || StringsKt.startsWith$default(fileName, "persistent", false, 2, (Object) null)) ? false : true;
        }

        public final void setEventPublisher$android_sdk_base_release(m9 m9Var) {
            DataStoreProvider.eventPublisher = m9Var;
        }

        public final void shutdownAllDataStores(Context context) {
            synchronized (DataStoreProvider.scopeCreationLock) {
                try {
                    Collection<P> values = DataStoreProvider.dataStoreScopeMap.values();
                    Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                    for (P p10 : values) {
                        CoroutineContext coroutineContext = p10.getCoroutineContext();
                        C0.b bVar = C0.f9001U2;
                        C0 c02 = (C0) coroutineContext.get(bVar);
                        if (c02 != null) {
                            G0.i(c02, null, 1, null);
                        }
                        C0 c03 = (C0) p10.getCoroutineContext().get(bVar);
                        if (c03 != null) {
                            C0.a.b(c03, null, 1, null);
                        }
                    }
                    DataStoreProvider.dataStoreScopeMap.clear();
                    Companion companion = DataStoreProvider.INSTANCE;
                    companion.getDataStoreInstanceCache$android_sdk_base_release().clear();
                    if (context != null) {
                        companion.deleteDataStoreFiles(context);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29319a;

        static {
            int[] iArr = new int[DataStoreValueType.values().length];
            try {
                iArr[DataStoreValueType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataStoreValueType.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataStoreValueType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataStoreValueType.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DataStoreValueType.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DataStoreValueType.LONG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DataStoreValueType.MAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DataStoreValueType.LIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f29319a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$batchUpdates$1", f = "DataStoreProvider.kt", i = {}, l = {512}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements Function2<P, Continuation<? super Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29320a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f29322c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set<String> f29323d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/c;", "preferences", "", "<anonymous>", "(LL0/c;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.braze.storage.DataStoreProvider$batchUpdates$1$1", f = "DataStoreProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements Function2<L0.c, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f29324a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29325b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Set<String> f29326c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Map<String, Object> f29327d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Set<String> set, Map<String, ? extends Object> map, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f29326c = set;
                this.f29327d = map;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String b(String str, Object obj) {
                return "Unsupported value type for key '" + str + "': " + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName();
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(L0.c cVar, Continuation<? super Unit> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f29326c, this.f29327d, continuation);
                aVar.f29325b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                L0.c cVar = (L0.c) this.f29325b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f29324a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                for (final String str : this.f29326c) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.v
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String a10;
                            a10 = DataStoreProvider.b.a.a(str);
                            return a10;
                        }
                    }, 12, (Object) null);
                    cVar.j(L0.i.g(str));
                    cVar.j(L0.i.e(str));
                    cVar.j(L0.i.f(str));
                    cVar.j(L0.i.d(str));
                    cVar.j(L0.i.c(str));
                    cVar.j(L0.i.a(str));
                }
                for (Map.Entry<String, Object> entry : this.f29327d.entrySet()) {
                    final String key = entry.getKey();
                    final Object value = entry.getValue();
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    Companion companion = DataStoreProvider.INSTANCE;
                    BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String a10;
                            a10 = DataStoreProvider.b.a.a(key, value);
                            return a10;
                        }
                    }, 12, (Object) null);
                    if (value instanceof String) {
                        cVar.k(L0.i.g(key), value);
                    } else if (value instanceof Integer) {
                        cVar.k(L0.i.e(key), value);
                    } else if (value instanceof Long) {
                        cVar.k(L0.i.f(key), value);
                    } else if (value instanceof Float) {
                        cVar.k(L0.i.d(key), value);
                    } else if (value instanceof Double) {
                        cVar.k(L0.i.c(key), value);
                    } else if (value instanceof Boolean) {
                        cVar.k(L0.i.a(key), value);
                    } else {
                        BrazeLogger.brazelog$default(brazeLogger, companion.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, new Function0() { // from class: com.braze.storage.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                String b10;
                                b10 = DataStoreProvider.b.a.b(key, value);
                                return b10;
                            }
                        }, 12, (Object) null);
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String a(String str) {
                return "Removing key: " + str + " from DataStore.";
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String a(String str, Object obj) {
                return "Adding/updating key: " + str + " with value: " + obj + " in DataStore.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Map<String, ? extends Object> map, Set<String> set, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f29322c = map;
            this.f29323d = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new b(this.f29322c, this.f29323d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f29320a;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                InterfaceC1344i dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(this.f29323d, this.f29322c, null);
                this.f29320a = 1;
                Object a10 = L0.j.a(dataStore, aVar, this);
                return a10 == coroutine_suspended ? coroutine_suspended : a10;
            } catch (Exception e10) {
                final String str = "Failed to perform batch update with updates:" + this.f29322c + " and removals:" + this.f29323d;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: com.braze.storage.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a11;
                        a11 = DataStoreProvider.b.a(str);
                        return a11;
                    }
                }, 8, (Object) null);
                DataStoreProvider.this.publishException(str, e10);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P p10, Continuation<Object> continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$clear$1", f = "DataStoreProvider.kt", i = {0}, l = {473}, m = "invokeSuspend", n = {"dataStore"}, s = {"L$0"}, v = 1)
    public static final class c extends SuspendLambda implements Function2<P, Continuation<? super Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29328a;

        /* renamed from: b, reason: collision with root package name */
        int f29329b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.a f29331d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/c;", "storage", "", "<anonymous>", "(LL0/c;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.braze.storage.DataStoreProvider$clear$1$2", f = "DataStoreProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements Function2<L0.c, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f29332a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29333b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f29334c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f29334c = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(L0.c cVar, Continuation<? super Unit> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f29334c, continuation);
                aVar.f29333b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                L0.c cVar = (L0.c) this.f29333b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f29332a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                cVar.j(this.f29334c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f29331d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new c(this.f29331d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f29329b;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String tag = DataStoreProvider.INSTANCE.getTAG();
                BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
                final f.a aVar = this.f29331d;
                BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a10;
                        a10 = DataStoreProvider.c.a(f.a.this);
                        return a10;
                    }
                }, 12, (Object) null);
                InterfaceC1344i dataStore = DataStoreProvider.this.getDataStore();
                a aVar2 = new a(this.f29331d, null);
                this.f29328a = SpillingKt.nullOutSpilledVariable(dataStore);
                this.f29329b = 1;
                Object a10 = L0.j.a(dataStore, aVar2, this);
                return a10 == coroutine_suspended ? coroutine_suspended : a10;
            } catch (Exception e10) {
                final String str = "Failed to clear data for key: " + this.f29331d + ".";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: com.braze.storage.z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a11;
                        a11 = DataStoreProvider.c.a(str);
                        return a11;
                    }
                }, 8, (Object) null);
                DataStoreProvider.this.publishException(str, e10);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P p10, Continuation<Object> continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(f.a aVar) {
            return "Clearing all data for key: " + aVar + ".";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$clearAll$1", f = "DataStoreProvider.kt", i = {0}, l = {490}, m = "invokeSuspend", n = {"dataStore"}, s = {"L$0"}, v = 1)
    public static final class d extends SuspendLambda implements Function2<P, Continuation<? super Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29335a;

        /* renamed from: b, reason: collision with root package name */
        int f29336b;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/c;", "storage", "", "<anonymous>", "(LL0/c;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.braze.storage.DataStoreProvider$clearAll$1$2", f = "DataStoreProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements Function2<L0.c, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f29338a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29339b;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(L0.c cVar, Continuation<? super Unit> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(continuation);
                aVar.f29339b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                L0.c cVar = (L0.c) this.f29339b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f29338a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                cVar.g();
                return Unit.INSTANCE;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new d(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f29336b;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.A
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a10;
                        a10 = DataStoreProvider.d.a();
                        return a10;
                    }
                }, 12, (Object) null);
                InterfaceC1344i dataStore = DataStoreProvider.this.getDataStore();
                a aVar = new a(null);
                this.f29335a = SpillingKt.nullOutSpilledVariable(dataStore);
                this.f29336b = 1;
                Object a10 = L0.j.a(dataStore, aVar, this);
                return a10 == coroutine_suspended ? coroutine_suspended : a10;
            } catch (Exception e10) {
                final String str = "Failed to clear all data in file.";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: com.braze.storage.B
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a11;
                        a11 = DataStoreProvider.d.a(str);
                        return a11;
                    }
                }, 8, (Object) null);
                DataStoreProvider.this.publishException("Failed to clear all data in file.", e10);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P p10, Continuation<Object> continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a() {
            return "Clearing all data in file.";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)Z"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$contains$1", f = "DataStoreProvider.kt", i = {0}, l = {429}, m = "invokeSuspend", n = {"dataStore"}, s = {"L$0"}, v = 1)
    public static final class e extends SuspendLambda implements Function2<P, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29340a;

        /* renamed from: b, reason: collision with root package name */
        int f29341b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.a f29343d;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements InterfaceC5321f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5321f f29344a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f.a f29345b;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.braze.storage.DataStoreProvider$e$a$a, reason: collision with other inner class name */
            public static final class C0461a<T> implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5322g f29346a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ f.a f29347b;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @DebugMetadata(c = "com.braze.storage.DataStoreProvider$contains$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreProvider.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {EventKeys.VALUE_KEY, "$completion", EventKeys.VALUE_KEY, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.braze.storage.DataStoreProvider$e$a$a$a, reason: collision with other inner class name */
                public static final class C0462a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f29348a;

                    /* renamed from: b, reason: collision with root package name */
                    int f29349b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f29350c;

                    /* renamed from: e, reason: collision with root package name */
                    Object f29352e;

                    /* renamed from: f, reason: collision with root package name */
                    Object f29353f;

                    /* renamed from: g, reason: collision with root package name */
                    Object f29354g;

                    /* renamed from: h, reason: collision with root package name */
                    int f29355h;

                    public C0462a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29348a = obj;
                        this.f29349b |= Integer.MIN_VALUE;
                        return C0461a.this.emit(null, this);
                    }
                }

                public C0461a(InterfaceC5322g interfaceC5322g, f.a aVar) {
                    this.f29346a = interfaceC5322g;
                    this.f29347b = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C0462a c0462a;
                    int i10;
                    if (continuation instanceof C0462a) {
                        c0462a = (C0462a) continuation;
                        int i11 = c0462a.f29349b;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c0462a.f29349b = i11 - Integer.MIN_VALUE;
                            Object obj2 = c0462a.f29348a;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i10 = c0462a.f29349b;
                            if (i10 != 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC5322g interfaceC5322g = this.f29346a;
                                Object c10 = ((L0.f) obj).c(this.f29347b);
                                c0462a.f29350c = SpillingKt.nullOutSpilledVariable(obj);
                                c0462a.f29352e = SpillingKt.nullOutSpilledVariable(c0462a);
                                c0462a.f29353f = SpillingKt.nullOutSpilledVariable(obj);
                                c0462a.f29354g = SpillingKt.nullOutSpilledVariable(interfaceC5322g);
                                c0462a.f29355h = 0;
                                c0462a.f29349b = 1;
                                if (interfaceC5322g.emit(c10, c0462a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c0462a = new C0462a(continuation);
                    Object obj22 = c0462a.f29348a;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0462a.f29349b;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public a(InterfaceC5321f interfaceC5321f, f.a aVar) {
                this.f29344a = interfaceC5321f;
                this.f29345b = aVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5321f
            public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
                Object collect = this.f29344a.collect(new C0461a(interfaceC5322g, this.f29345b), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f.a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f29343d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new e(this.f29343d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f29341b;
            boolean z10 = false;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    String tag = DataStoreProvider.INSTANCE.getTAG();
                    BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
                    final f.a aVar = this.f29343d;
                    BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String a10;
                            a10 = DataStoreProvider.e.a(f.a.this);
                            return a10;
                        }
                    }, 12, (Object) null);
                    InterfaceC1344i dataStore = DataStoreProvider.this.getDataStore();
                    a aVar2 = new a(dataStore.getData(), this.f29343d);
                    this.f29340a = SpillingKt.nullOutSpilledVariable(dataStore);
                    this.f29341b = 1;
                    obj = AbstractC5323h.t(aVar2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (obj != null) {
                    z10 = true;
                }
            } catch (Exception e10) {
                final String str = "Failed to check if data store contains key: " + this.f29343d.a() + ". Using default value: false.";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: com.braze.storage.D
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a10;
                        a10 = DataStoreProvider.e.a(str);
                        return a10;
                    }
                }, 8, (Object) null);
                DataStoreProvider.this.publishException(str, e10);
            }
            return Boxing.boxBoolean(z10);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P p10, Continuation<? super Boolean> continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(f.a aVar) {
            return "Checking if data store contains data for key: " + aVar.a() + ".";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$publishException$1", f = "DataStoreProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29356a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m9 f29357b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29358c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Throwable f29359d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m9 m9Var, String str, Throwable th2, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f29357b = m9Var;
            this.f29358c = str;
            this.f29359d = th2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P p10, Continuation<? super Unit> continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f29357b, this.f29358c, this.f29359d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f29356a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((r7) this.f29357b).b(new jf(this.f29358c, this.f29359d), jf.class);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n"}, d2 = {"", "T", "LPh/P;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$read$1", f = "DataStoreProvider.kt", i = {0}, l = {411}, m = "invokeSuspend", n = {"dataStore"}, s = {"L$0"}, v = 1)
    public static final class g<T> extends SuspendLambda implements Function2<P, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29360a;

        /* renamed from: b, reason: collision with root package name */
        int f29361b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.a f29363d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f29364e;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/g;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements InterfaceC5321f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC5321f f29365a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f.a f29366b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f29367c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            /* renamed from: com.braze.storage.DataStoreProvider$g$a$a, reason: collision with other inner class name */
            public static final class C0463a<T> implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5322g f29368a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ f.a f29369b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Object f29370c;

                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @DebugMetadata(c = "com.braze.storage.DataStoreProvider$read$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreProvider.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {EventKeys.VALUE_KEY, "$completion", EventKeys.VALUE_KEY, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.braze.storage.DataStoreProvider$g$a$a$a, reason: collision with other inner class name */
                public static final class C0464a extends ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f29371a;

                    /* renamed from: b, reason: collision with root package name */
                    int f29372b;

                    /* renamed from: c, reason: collision with root package name */
                    Object f29373c;

                    /* renamed from: e, reason: collision with root package name */
                    Object f29375e;

                    /* renamed from: f, reason: collision with root package name */
                    Object f29376f;

                    /* renamed from: g, reason: collision with root package name */
                    Object f29377g;

                    /* renamed from: h, reason: collision with root package name */
                    int f29378h;

                    public C0464a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29371a = obj;
                        this.f29372b |= Integer.MIN_VALUE;
                        return C0463a.this.emit(null, this);
                    }
                }

                public C0463a(InterfaceC5322g interfaceC5322g, f.a aVar, Object obj) {
                    this.f29368a = interfaceC5322g;
                    this.f29369b = aVar;
                    this.f29370c = obj;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    C0464a c0464a;
                    int i10;
                    if (continuation instanceof C0464a) {
                        c0464a = (C0464a) continuation;
                        int i11 = c0464a.f29372b;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c0464a.f29372b = i11 - Integer.MIN_VALUE;
                            Object obj2 = c0464a.f29371a;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i10 = c0464a.f29372b;
                            if (i10 != 0) {
                                ResultKt.throwOnFailure(obj2);
                                InterfaceC5322g interfaceC5322g = this.f29368a;
                                Object c10 = ((L0.f) obj).c(this.f29369b);
                                if (c10 == null) {
                                    c10 = this.f29370c;
                                }
                                c0464a.f29373c = SpillingKt.nullOutSpilledVariable(obj);
                                c0464a.f29375e = SpillingKt.nullOutSpilledVariable(c0464a);
                                c0464a.f29376f = SpillingKt.nullOutSpilledVariable(obj);
                                c0464a.f29377g = SpillingKt.nullOutSpilledVariable(interfaceC5322g);
                                c0464a.f29378h = 0;
                                c0464a.f29372b = 1;
                                if (interfaceC5322g.emit(c10, c0464a) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    c0464a = new C0464a(continuation);
                    Object obj22 = c0464a.f29371a;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0464a.f29372b;
                    if (i10 != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            public a(InterfaceC5321f interfaceC5321f, f.a aVar, Object obj) {
                this.f29365a = interfaceC5321f;
                this.f29366b = aVar;
                this.f29367c = obj;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5321f
            public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
                Object collect = this.f29365a.collect(new C0463a(interfaceC5322g, this.f29366b, this.f29367c), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f.a aVar, T t10, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f29363d = aVar;
            this.f29364e = t10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new g(this.f29363d, this.f29364e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f29361b;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String tag = DataStoreProvider.INSTANCE.getTAG();
                BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
                final f.a aVar = this.f29363d;
                BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.E
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a10;
                        a10 = DataStoreProvider.g.a(f.a.this);
                        return a10;
                    }
                }, 12, (Object) null);
                InterfaceC1344i dataStore = DataStoreProvider.this.getDataStore();
                a aVar2 = new a(dataStore.getData(), this.f29363d, this.f29364e);
                this.f29360a = SpillingKt.nullOutSpilledVariable(dataStore);
                this.f29361b = 1;
                Object r10 = AbstractC5323h.r(aVar2, this);
                return r10 == coroutine_suspended ? coroutine_suspended : r10;
            } catch (Exception e10) {
                final String str = "Failed to read data for key: " + this.f29363d.a() + ". Using default value: " + this.f29364e + ".";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: com.braze.storage.F
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a10;
                        a10 = DataStoreProvider.g.a(str);
                        return a10;
                    }
                }, 8, (Object) null);
                DataStoreProvider.this.publishException(str, e10);
                return this.f29364e;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P p10, Continuation<? super T> continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(f.a aVar) {
            return "Reading data for key: " + aVar.a() + ".";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LPh/P;", "", "LL0/f$a;", "", "<anonymous>", "(LPh/P;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$readAll$1", f = "DataStoreProvider.kt", i = {}, l = {457}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements Function2<P, Continuation<? super Map<f.a, ? extends Object>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f29379a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new h(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f29379a;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.G
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String a10;
                            a10 = DataStoreProvider.h.a();
                            return a10;
                        }
                    }, 12, (Object) null);
                    InterfaceC5321f data = DataStoreProvider.this.getDataStore().getData();
                    this.f29379a = 1;
                    obj = AbstractC5323h.r(data, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((L0.f) obj).a();
            } catch (Exception e10) {
                final String str = "Failed to read all data from DataStore";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: com.braze.storage.H
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a10;
                        a10 = DataStoreProvider.h.a(str);
                        return a10;
                    }
                }, 8, (Object) null);
                DataStoreProvider.this.publishException("Failed to read all data from DataStore", e10);
                return MapsKt.emptyMap();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P p10, Continuation<? super Map<f.a, ? extends Object>> continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a() {
            return "Reading all data from DataStore.";
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class i implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStoreKey f29381a;

        public i(DataStoreKey dataStoreKey) {
            this.f29381a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Key " + this.f29381a.getKey() + " is not a LIST type. Returning empty list.";
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class j implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStoreKey f29382a;

        public j(DataStoreKey dataStoreKey) {
            this.f29382a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to read list from DataStore for key: " + this.f29382a.getKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class l implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStoreKey f29383a;

        public l(DataStoreKey dataStoreKey) {
            this.f29383a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Key " + this.f29383a.getKey() + " is not a MAP type. Returning empty map.";
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class m implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStoreKey f29384a;

        public m(DataStoreKey dataStoreKey) {
            this.f29384a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to read map from DataStore for key: " + this.f29384a.getKey();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    @DebugMetadata(c = "com.braze.storage.DataStoreProvider$write$1", f = "DataStoreProvider.kt", i = {0}, l = {392}, m = "invokeSuspend", n = {"dataStore"}, s = {"L$0"}, v = 1)
    public static final class n extends SuspendLambda implements Function2<P, Continuation<? super Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f29385a;

        /* renamed from: b, reason: collision with root package name */
        int f29386b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f29388d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f.a f29389e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/c;", "storage", "", "<anonymous>", "(LL0/c;)V"}, k = 3, mv = {2, 2, 0})
        @DebugMetadata(c = "com.braze.storage.DataStoreProvider$write$1$2", f = "DataStoreProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements Function2<L0.c, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f29390a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29391b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ f.a f29392c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f29393d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, T t10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f29392c = aVar;
                this.f29393d = t10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(L0.c cVar, Continuation<? super Unit> continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f29392c, this.f29393d, continuation);
                aVar.f29391b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                L0.c cVar = (L0.c) this.f29391b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f29390a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                cVar.k(this.f29392c, this.f29393d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(T t10, f.a aVar, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f29388d = t10;
            this.f29389e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(String str) {
            return str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DataStoreProvider.this.new n(this.f29388d, this.f29389e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f29386b;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                String tag = DataStoreProvider.INSTANCE.getTAG();
                BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
                final T t10 = this.f29388d;
                final f.a aVar = this.f29389e;
                BrazeLogger.brazelog$default(brazeLogger, tag, priority, (Throwable) null, false, new Function0() { // from class: com.braze.storage.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a10;
                        a10 = DataStoreProvider.n.a(t10, aVar);
                        return a10;
                    }
                }, 12, (Object) null);
                InterfaceC1344i dataStore = DataStoreProvider.this.getDataStore();
                a aVar2 = new a(this.f29389e, this.f29388d, null);
                this.f29385a = SpillingKt.nullOutSpilledVariable(dataStore);
                this.f29386b = 1;
                Object a10 = L0.j.a(dataStore, aVar2, this);
                return a10 == coroutine_suspended ? coroutine_suspended : a10;
            } catch (Exception e10) {
                final String str = "Failed to write data:" + this.f29388d + " for key: " + this.f29389e.a() + ".";
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: com.braze.storage.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String a11;
                        a11 = DataStoreProvider.n.a(str);
                        return a11;
                    }
                }, 8, (Object) null);
                DataStoreProvider.this.publishException(str, e10);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(P p10, Continuation<Object> continuation) {
            return ((n) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String a(Object obj, f.a aVar) {
            return "Writing data:" + obj + " for key: " + aVar.a() + ".";
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class o implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStoreKey f29394a;

        public o(DataStoreKey dataStoreKey) {
            this.f29394a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Key " + this.f29394a.getKey() + " is not a LIST type. Cannot write key:" + this.f29394a.getKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class p implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStoreKey f29395a;

        public p(DataStoreKey dataStoreKey) {
            this.f29395a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to write list to DataStore for key: " + this.f29395a.getKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class q implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStoreKey f29396a;

        public q(DataStoreKey dataStoreKey) {
            this.f29396a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Key " + this.f29396a.getKey() + " is not a MAP type. Cannot write key:" + this.f29396a.getKey();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    public final class r implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DataStoreKey f29397a;

        public r(DataStoreKey dataStoreKey) {
            this.f29397a = dataStoreKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to write map to DataStore for key: " + this.f29397a.getKey();
        }
    }

    public DataStoreProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC1344i createOrGetDataStore$default(DataStoreProvider dataStoreProvider, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOrGetDataStore");
        }
        if ((i10 & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        return dataStoreProvider.createOrGetDataStore(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createOrGetDataStore$lambda$0$0(DataStoreProvider dataStoreProvider, String str) {
        File filesDir = dataStoreProvider.context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        return FilesKt.resolve(filesDir, "datastore/" + str + ".preferences_pb");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0.f createOrGetDataStore$lambda$0$1(String str, DataStoreProvider dataStoreProvider, C1339d exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        final String str2 = "DataStore file corrupted for " + str + ", resetting to empty preferences";
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) exception, false, new Function0() { // from class: X3.A
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String createOrGetDataStore$lambda$0$1$0;
                createOrGetDataStore$lambda$0$1$0 = DataStoreProvider.createOrGetDataStore$lambda$0$1$0(str2);
                return createOrGetDataStore$lambda$0$1$0;
            }
        }, 8, (Object) null);
        dataStoreProvider.publishException(str2, exception);
        return L0.g.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createOrGetDataStore$lambda$0$1$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishException(String message, Throwable throwable) {
        m9 m9Var = eventPublisher;
        if (m9Var == null) {
            return;
        }
        try {
            AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new f(m9Var, message, throwable, null), 3, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String publishException$lambda$0;
                    publishException$lambda$0 = DataStoreProvider.publishException$lambda$0();
                    return publishException$lambda$0;
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishException$lambda$0() {
        return "Failed to publish exception";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readBoolean$lambda$0(DataStoreKey dataStoreKey, Boolean bool) {
        return "Not reading data with with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected boolean. Returning default value:'" + bool + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readData$lambda$0(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readFloat$lambda$0(DataStoreKey dataStoreKey, Float f10) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected float. Returning default value:'" + f10 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readInt$lambda$0(DataStoreKey dataStoreKey, Integer num) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected int. Returning default value:'" + num + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readLong$lambda$0(DataStoreKey dataStoreKey, Long l10) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected long. Returning default value:'" + l10 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readString$lambda$0(DataStoreKey dataStoreKey, String str) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected string. Returning default value:'" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String writeData$lambda$0(String str) {
        return str;
    }

    public void batchUpdate(Map<String, ? extends Object> updates, Set<String> removals) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(removals, "removals");
        batchUpdates$android_sdk_base_release(updates, removals);
    }

    public final void batchUpdates$android_sdk_base_release(Map<String, ? extends Object> updates, Set<String> removals) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(removals, "removals");
        AbstractC1455i.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new b(updates, removals, null));
    }

    public final <T> void clear$android_sdk_base_release(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        AbstractC1455i.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new c(key, null));
    }

    public final void clearAll$android_sdk_base_release() {
        AbstractC1455i.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new d(null));
    }

    public void clearAllData() {
        clearAll$android_sdk_base_release();
    }

    public void clearData(DataStoreKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        switch (a.f29319a[key.getType().ordinal()]) {
            case 1:
                clear$android_sdk_base_release(L0.i.e(key.getKey()));
                return;
            case 2:
                clear$android_sdk_base_release(L0.i.c(key.getKey()));
                return;
            case 3:
                clear$android_sdk_base_release(L0.i.g(key.getKey()));
                return;
            case 4:
                clear$android_sdk_base_release(L0.i.a(key.getKey()));
                return;
            case 5:
                clear$android_sdk_base_release(L0.i.d(key.getKey()));
                return;
            case 6:
                clear$android_sdk_base_release(L0.i.f(key.getKey()));
                return;
            case 7:
                clear$android_sdk_base_release(L0.i.g(key.getKey()));
                return;
            case 8:
                clear$android_sdk_base_release(L0.i.g(key.getKey()));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean contains(DataStoreKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        switch (a.f29319a[key.getType().ordinal()]) {
            case 1:
                return contains$android_sdk_base_release(L0.i.e(key.getKey()));
            case 2:
                return contains$android_sdk_base_release(L0.i.c(key.getKey()));
            case 3:
                return contains$android_sdk_base_release(L0.i.g(key.getKey()));
            case 4:
                return contains$android_sdk_base_release(L0.i.a(key.getKey()));
            case 5:
                return contains$android_sdk_base_release(L0.i.d(key.getKey()));
            case 6:
                return contains$android_sdk_base_release(L0.i.f(key.getKey()));
            case 7:
                return contains$android_sdk_base_release(L0.i.g(key.getKey()));
            case 8:
                return contains$android_sdk_base_release(L0.i.g(key.getKey()));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final <T> boolean contains$android_sdk_base_release(f.a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Boolean) AbstractC1455i.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new e(key, null))).booleanValue();
    }

    public final InterfaceC1344i createOrGetDataStore(List<? extends InterfaceC1342g> migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        final String dataStoreFileName = getDataStoreFileName();
        ConcurrentHashMap<String, InterfaceC1344i> concurrentHashMap = dataStoreInstanceCache;
        InterfaceC1344i interfaceC1344i = concurrentHashMap.get(dataStoreFileName);
        if (interfaceC1344i == null) {
            interfaceC1344i = L0.e.f6748a.b(new J0.b(new Function1() { // from class: X3.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    L0.f createOrGetDataStore$lambda$0$1;
                    createOrGetDataStore$lambda$0$1 = DataStoreProvider.createOrGetDataStore$lambda$0$1(dataStoreFileName, this, (C1339d) obj);
                    return createOrGetDataStore$lambda$0$1;
                }
            }), migrations, getDataStoreScope$android_sdk_base_release(), new Function0() { // from class: X3.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    File createOrGetDataStore$lambda$0$0;
                    createOrGetDataStore$lambda$0$0 = DataStoreProvider.createOrGetDataStore$lambda$0$0(DataStoreProvider.this, dataStoreFileName);
                    return createOrGetDataStore$lambda$0$0;
                }
            });
            InterfaceC1344i putIfAbsent = concurrentHashMap.putIfAbsent(dataStoreFileName, interfaceC1344i);
            if (putIfAbsent != null) {
                interfaceC1344i = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(interfaceC1344i, "getOrPut(...)");
        return interfaceC1344i;
    }

    public final Context getContext() {
        return this.context;
    }

    public abstract /* synthetic */ InterfaceC1344i getDataStore();

    public abstract /* synthetic */ String getDataStoreFileName();

    public final P getDataStoreScope$android_sdk_base_release() {
        return INSTANCE.getOrCreateScopeForKey$android_sdk_base_release(getDataStoreFileName());
    }

    public final <T> T read$android_sdk_base_release(f.a key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) AbstractC1455i.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new g(key, defaultValue, null));
    }

    public final Map<f.a, Object> readAll$android_sdk_base_release() {
        return (Map) AbstractC1455i.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new h(null));
    }

    public Map<f.a, Object> readAllData() {
        return readAll$android_sdk_base_release();
    }

    public Boolean readBoolean(final DataStoreKey key, final Boolean r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (Boolean) read$android_sdk_base_release(L0.i.a(key.getKey()), r11);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readBoolean$lambda$0;
                    readBoolean$lambda$0 = DataStoreProvider.readBoolean$lambda$0(DataStoreKey.this, r11);
                    return readBoolean$lambda$0;
                }
            }, 8, (Object) null);
            return r11;
        }
    }

    public Object readData(DataStoreKey key, Object r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            switch (a.f29319a[key.getType().ordinal()]) {
                case 1:
                    f.a e10 = L0.i.e(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Int");
                    return read$android_sdk_base_release(e10, (Integer) r11);
                case 2:
                    f.a c10 = L0.i.c(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Double");
                    return read$android_sdk_base_release(c10, (Double) r11);
                case 3:
                    f.a g10 = L0.i.g(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.String");
                    return read$android_sdk_base_release(g10, (String) r11);
                case 4:
                    f.a a10 = L0.i.a(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Boolean");
                    return read$android_sdk_base_release(a10, (Boolean) r11);
                case 5:
                    f.a d10 = L0.i.d(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Float");
                    return read$android_sdk_base_release(d10, (Float) r11);
                case 6:
                    f.a f10 = L0.i.f(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Long");
                    return read$android_sdk_base_release(f10, (Long) r11);
                case 7:
                    f.a g11 = L0.i.g(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.String");
                    return read$android_sdk_base_release(g11, (String) r11);
                case 8:
                    f.a g12 = L0.i.g(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.String");
                    return read$android_sdk_base_release(g12, (String) r11);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e11) {
            final String str = "Not reading data with key:'" + key + "' type:'" + key.getType() + "' due to mismatched data type. Returning default value:'" + r11 + "'";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: X3.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readData$lambda$0;
                    readData$lambda$0 = DataStoreProvider.readData$lambda$0(str);
                    return readData$lambda$0;
                }
            }, 8, (Object) null);
            publishException(str, e11);
            return r11;
        }
    }

    public Float readFloat(final DataStoreKey key, final Float r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (Float) read$android_sdk_base_release(L0.i.d(key.getKey()), r11);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readFloat$lambda$0;
                    readFloat$lambda$0 = DataStoreProvider.readFloat$lambda$0(DataStoreKey.this, r11);
                    return readFloat$lambda$0;
                }
            }, 8, (Object) null);
            return r11;
        }
    }

    public Integer readInt(final DataStoreKey key, final Integer r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (Integer) read$android_sdk_base_release(L0.i.e(key.getKey()), r11);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readInt$lambda$0;
                    readInt$lambda$0 = DataStoreProvider.readInt$lambda$0(DataStoreKey.this, r11);
                    return readInt$lambda$0;
                }
            }, 8, (Object) null);
            return r11;
        }
    }

    public Long readLong(final DataStoreKey key, final Long r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (Long) read$android_sdk_base_release(L0.i.f(key.getKey()), r11);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readLong$lambda$0;
                    readLong$lambda$0 = DataStoreProvider.readLong$lambda$0(DataStoreKey.this, r11);
                    return readLong$lambda$0;
                }
            }, 4, (Object) null);
            return r11;
        }
    }

    public String readString(final DataStoreKey key, final String r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (String) read$android_sdk_base_release(L0.i.g(key.getKey()), r11);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readString$lambda$0;
                    readString$lambda$0 = DataStoreProvider.readString$lambda$0(DataStoreKey.this, r11);
                    return readString$lambda$0;
                }
            }, 8, (Object) null);
            return r11;
        }
    }

    public final <T> void write$android_sdk_base_release(f.a key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        AbstractC1455i.e(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new n(value, key, null));
    }

    public void writeData(DataStoreKey key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            switch (a.f29319a[key.getType().ordinal()]) {
                case 1:
                    write$android_sdk_base_release(L0.i.e(key.getKey()), (Integer) value);
                    return;
                case 2:
                    write$android_sdk_base_release(L0.i.c(key.getKey()), (Double) value);
                    return;
                case 3:
                    write$android_sdk_base_release(L0.i.g(key.getKey()), (String) value);
                    return;
                case 4:
                    write$android_sdk_base_release(L0.i.a(key.getKey()), (Boolean) value);
                    return;
                case 5:
                    write$android_sdk_base_release(L0.i.d(key.getKey()), (Float) value);
                    return;
                case 6:
                    write$android_sdk_base_release(L0.i.f(key.getKey()), (Long) value);
                    return;
                case 7:
                    write$android_sdk_base_release(L0.i.g(key.getKey()), (String) value);
                    return;
                case 8:
                    write$android_sdk_base_release(L0.i.g(key.getKey()), (String) value);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e10) {
            final String str = "Not storing data with key:'" + key + "' value:'" + value + "' type:'" + key.getType() + "' due to mismatched data type.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: X3.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String writeData$lambda$0;
                    writeData$lambda$0 = DataStoreProvider.writeData$lambda$0(str);
                    return writeData$lambda$0;
                }
            }, 8, (Object) null);
            publishException(str, e10);
        }
    }
}
