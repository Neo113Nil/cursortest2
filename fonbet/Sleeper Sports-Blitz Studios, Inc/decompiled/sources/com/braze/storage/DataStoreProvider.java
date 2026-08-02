package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.exifinterface.media.ExifInterface;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.models.AttributeType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kotlinx.serialization.modules.SerializersModule;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 b2\u00020\u0001:\u0001bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0004\u0012\u00020\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J4\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*\"\u0006\b\u0000\u0010(\u0018\u0001\"\u0006\b\u0001\u0010)\u0018\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0086\b¢\u0006\u0004\b+\u0010,J&\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0006\b\u0000\u0010-\u0018\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0086\b¢\u0006\u0004\b/\u00100J<\u00102\u001a\u00020\n\"\u0006\b\u0000\u0010(\u0018\u0001\"\u0006\b\u0001\u0010)\u0018\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 H\u0086\b¢\u0006\u0004\b2\u00103J.\u00106\u001a\u00020\n\"\u0006\b\u0000\u0010-\u0018\u00012\u0006\u0010\u000e\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0086\b¢\u0006\u0004\b6\u00107J1\u0010;\u001a\u00020\n2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010 2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000609H\u0016¢\u0006\u0004\b;\u0010<J+\u0010?\u001a\u00020\n\"\u0004\b\u0000\u0010-2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b=\u0010>J3\u0010C\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010-*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000!2\b\u0010@\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\bA\u0010BJ'\u0010F\u001a\u00020\u0015\"\b\b\u0000\u0010-*\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0001¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\bF\u0010GJ\u001f\u0010I\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0004\u0012\u00020\u00010 H\u0001¢\u0006\u0004\bH\u0010#J#\u0010L\u001a\u00020\n\"\u0004\b\u0000\u0010-2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0001¢\u0006\u0004\bJ\u0010KJ\u000f\u0010N\u001a\u00020\nH\u0001¢\u0006\u0004\bM\u0010'J1\u0010P\u001a\u00020\n2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010 2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000609H\u0001¢\u0006\u0004\bO\u0010<J+\u0010U\u001a\b\u0012\u0004\u0012\u00020R0T2\u0014\b\u0002\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0Q04H\u0004¢\u0006\u0004\bU\u0010VR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010W\u001a\u0004\bX\u0010YR&\u0010]\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0T0Z8$X¤\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010a\u001a\u00020^8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`¨\u0006c"}, d2 = {"Lcom/braze/storage/DataStoreProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "message", "", "throwable", "", "publishException", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcom/braze/enums/DataStoreKey;", SDKConstants.PARAM_KEY, "value", "writeData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)V", "default", "readData", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Object;)Ljava/lang/Object;", "", "readBoolean", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "readString", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/String;)Ljava/lang/String;", "", "readInt", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "readLong", "(Lcom/braze/enums/DataStoreKey;Ljava/lang/Long;)Ljava/lang/Long;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "readAllData", "()Ljava/util/Map;", "clearData", "(Lcom/braze/enums/DataStoreKey;)V", "clearAllData", "()V", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "readMap", "(Lcom/braze/enums/DataStoreKey;)Ljava/util/Map;", ExifInterface.GPS_DIRECTION_TRUE, "", "readList", "(Lcom/braze/enums/DataStoreKey;)Ljava/util/List;", "map", "writeMap", "(Lcom/braze/enums/DataStoreKey;Ljava/util/Map;)V", "", AttributeType.LIST, "writeList", "(Lcom/braze/enums/DataStoreKey;Ljava/util/List;)V", "updates", "", "removals", "batchUpdate", "(Ljava/util/Map;Ljava/util/Set;)V", "write$android_sdk_base_release", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "write", "defaultValue", "read$android_sdk_base_release", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)Ljava/lang/Object;", "read", "contains$android_sdk_base_release", "(Landroidx/datastore/preferences/core/Preferences$Key;)Z", "contains", "(Lcom/braze/enums/DataStoreKey;)Z", "readAll$android_sdk_base_release", "readAll", "clear$android_sdk_base_release", "(Landroidx/datastore/preferences/core/Preferences$Key;)V", "clear", "clearAll$android_sdk_base_release", "clearAll", "batchUpdates$android_sdk_base_release", "batchUpdates", "Landroidx/datastore/core/DataMigration;", "Landroidx/datastore/preferences/core/Preferences;", "migrations", "Landroidx/datastore/core/DataStore;", "createOrGetDataStore", "(Ljava/util/List;)Landroidx/datastore/core/DataStore;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/concurrent/ConcurrentHashMap;", "getDataStoreCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "dataStoreCache", "Lkotlinx/coroutines/CoroutineScope;", "getDataStoreScope$android_sdk_base_release", "()Lkotlinx/coroutines/CoroutineScope;", "dataStoreScope", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class DataStoreProvider {
    private static final String BRAZE_DATASTORE_PREFIX = "com.braze";
    private static final int FILE_DELETE_MAX_RETRIES = 3;
    private static final long FILE_DELETE_RETRY_DELAY_MS = 50;
    public static final String PERSISTENT_DATASTORE_PREFIX = "persistent";
    private static final String RUNTIME_CONFIG_PREFIX = "com.braze.override.runtime_config";
    private static com.braze.events.e eventPublisher;
    private final Context context;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) DataStoreProvider.class);
    private static final List<ConcurrentHashMap<String, DataStore<Preferences>>> allCaches = new ArrayList();
    private static final Object scopeCreationLock = new Object();
    private static final ConcurrentHashMap<String, CoroutineScope> dataStoreScopeMap = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001d\u001a\u00020\u00062\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010$\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010 R\u0014\u0010+\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010 R\u0014\u0010,\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010 R\u0014\u0010-\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100R,\u00102\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/braze/storage/DataStoreProvider$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "deleteDataStoreFiles", "(Landroid/content/Context;)V", "Ljava/io/File;", "file", "", "maxRetries", "", "delayMs", "deleteFileWithRetry", "(Ljava/io/File;IJ)V", "", SDKConstants.PARAM_KEY, "Lkotlinx/coroutines/CoroutineScope;", "getOrCreateScopeForKey$android_sdk_base_release", "(Ljava/lang/String;)Lkotlinx/coroutines/CoroutineScope;", "getOrCreateScopeForKey", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "cache", "registerCache$android_sdk_base_release", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "registerCache", "shutdownAllDataStores", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/braze/events/e;", "eventPublisher", "Lcom/braze/events/e;", "getEventPublisher$android_sdk_base_release", "()Lcom/braze/events/e;", "setEventPublisher$android_sdk_base_release", "(Lcom/braze/events/e;)V", "PERSISTENT_DATASTORE_PREFIX", "BRAZE_DATASTORE_PREFIX", "RUNTIME_CONFIG_PREFIX", "FILE_DELETE_MAX_RETRIES", "I", "FILE_DELETE_RETRY_DELAY_MS", "J", "", "allCaches", "Ljava/util/List;", "scopeCreationLock", "Ljava/lang/Object;", "dataStoreScopeMap", "Ljava/util/concurrent/ConcurrentHashMap;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                        String name = file2.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        if (StringsKt.startsWith$default(name, DataStoreProvider.BRAZE_DATASTORE_PREFIX, false, 2, (Object) null)) {
                            String name2 = file2.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            if (!StringsKt.startsWith$default(name2, DataStoreProvider.RUNTIME_CONFIG_PREFIX, false, 2, (Object) null)) {
                                String name3 = file2.getName();
                                Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                                if (!StringsKt.startsWith$default(name3, DataStoreProvider.PERSISTENT_DATASTORE_PREFIX, false, 2, (Object) null)) {
                                    Companion companion = DataStoreProvider.INSTANCE;
                                    Intrinsics.checkNotNull(file2);
                                    deleteFileWithRetry$default(companion, file2, 0, 0L, 6, null);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String deleteDataStoreFiles$lambda$9;
                        deleteDataStoreFiles$lambda$9 = DataStoreProvider.Companion.deleteDataStoreFiles$lambda$9();
                        return deleteDataStoreFiles$lambda$9;
                    }
                }, 4, (Object) null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteDataStoreFiles$lambda$9() {
            return "Failed to delete DataStore files";
        }

        private final void deleteFileWithRetry(final File file, final int maxRetries, long delayMs) {
            for (final int i = 0; i < maxRetries; i++) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String deleteFileWithRetry$lambda$11$lambda$10;
                        deleteFileWithRetry$lambda$11$lambda$10 = DataStoreProvider.Companion.deleteFileWithRetry$lambda$11$lambda$10(file, i);
                        return deleteFileWithRetry$lambda$11$lambda$10;
                    }
                }, 6, (Object) null);
                if (file.delete() || !file.exists()) {
                    return;
                }
                if (i < maxRetries - 1) {
                    Thread.sleep(delayMs);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String deleteFileWithRetry$lambda$12;
                    deleteFileWithRetry$lambda$12 = DataStoreProvider.Companion.deleteFileWithRetry$lambda$12(maxRetries, file);
                    return deleteFileWithRetry$lambda$12;
                }
            }, 6, (Object) null);
        }

        public static /* synthetic */ void deleteFileWithRetry$default(Companion companion, File file, int i, long j, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 3;
            }
            if ((i2 & 4) != 0) {
                j = 50;
            }
            companion.deleteFileWithRetry(file, i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$11$lambda$10(File file, int i) {
            return "Deleting DataStore file: " + file.getName() + " (attempt " + (i + 1) + ")";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String deleteFileWithRetry$lambda$12(int i, File file) {
            return "Failed to delete DataStore file after " + i + " attempts: " + file.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getOrCreateScopeForKey$lambda$3$lambda$2(String str, CoroutineScope coroutineScope) {
            return "Creating new CoroutineScope for DataStore for key: " + str + " scope: " + coroutineScope;
        }

        public static /* synthetic */ void shutdownAllDataStores$default(Companion companion, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = null;
            }
            companion.shutdownAllDataStores(context);
        }

        public final com.braze.events.e getEventPublisher$android_sdk_base_release() {
            return DataStoreProvider.eventPublisher;
        }

        public final CoroutineScope getOrCreateScopeForKey$android_sdk_base_release(final String key) {
            final CoroutineScope coroutineScope;
            Intrinsics.checkNotNullParameter(key, "key");
            CoroutineScope coroutineScope2 = (CoroutineScope) DataStoreProvider.dataStoreScopeMap.get(key);
            if (coroutineScope2 != null && CoroutineScopeKt.isActive(coroutineScope2)) {
                return coroutineScope2;
            }
            synchronized (DataStoreProvider.scopeCreationLock) {
                coroutineScope = (CoroutineScope) DataStoreProvider.dataStoreScopeMap.get(key);
                if (coroutineScope == null || !CoroutineScopeKt.isActive(coroutineScope)) {
                    coroutineScope = CoroutineScopeKt.CoroutineScope(BrazeCoroutineScope.INSTANCE.getCoroutineContext().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) DataStoreProvider.INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$Companion$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String orCreateScopeForKey$lambda$3$lambda$2;
                            orCreateScopeForKey$lambda$3$lambda$2 = DataStoreProvider.Companion.getOrCreateScopeForKey$lambda$3$lambda$2(key, coroutineScope);
                            return orCreateScopeForKey$lambda$3$lambda$2;
                        }
                    }, 6, (Object) null);
                    DataStoreProvider.dataStoreScopeMap.put(key, coroutineScope);
                }
            }
            return coroutineScope;
        }

        public final String getTAG() {
            return DataStoreProvider.TAG;
        }

        public final void registerCache$android_sdk_base_release(ConcurrentHashMap<String, DataStore<Preferences>> cache) {
            Intrinsics.checkNotNullParameter(cache, "cache");
            if (DataStoreProvider.allCaches.contains(cache)) {
                return;
            }
            DataStoreProvider.allCaches.add(cache);
        }

        public final void setEventPublisher$android_sdk_base_release(com.braze.events.e eVar) {
            DataStoreProvider.eventPublisher = eVar;
        }

        public final void shutdownAllDataStores(Context context) {
            Collection<CoroutineScope> values = DataStoreProvider.dataStoreScopeMap.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            for (CoroutineScope coroutineScope : values) {
                CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
                Job.Companion companion = Job.INSTANCE;
                Job job = (Job) coroutineContext.get(companion);
                if (job != null) {
                    JobKt__JobKt.cancelChildren$default(job, (CancellationException) null, 1, (Object) null);
                }
                Job job2 = (Job) coroutineScope.getCoroutineContext().get(companion);
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
            }
            synchronized (DataStoreProvider.scopeCreationLock) {
                DataStoreProvider.dataStoreScopeMap.clear();
                Unit unit = Unit.INSTANCE;
            }
            Iterator it = DataStoreProvider.allCaches.iterator();
            while (it.hasNext()) {
                ((ConcurrentHashMap) it.next()).clear();
            }
            if (context != null) {
                DataStoreProvider.INSTANCE.deleteDataStoreFiles(context);
            }
        }

        private Companion() {
        }
    }

    public DataStoreProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
        INSTANCE.registerCache$android_sdk_base_release(getDataStoreCache());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore createOrGetDataStore$default(DataStoreProvider dataStoreProvider, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOrGetDataStore");
        }
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        return dataStoreProvider.createOrGetDataStore(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File createOrGetDataStore$lambda$9$lambda$6(DataStoreProvider dataStoreProvider, String str) {
        File filesDir = dataStoreProvider.context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        return FilesKt.resolve(filesDir, "datastore/" + str + ".preferences_pb");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences createOrGetDataStore$lambda$9$lambda$8(String str, DataStoreProvider dataStoreProvider, CorruptionException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        final String str2 = "DataStore file corrupted for " + str + ", resetting to empty preferences";
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) exception, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String createOrGetDataStore$lambda$9$lambda$8$lambda$7;
                createOrGetDataStore$lambda$9$lambda$8$lambda$7 = DataStoreProvider.createOrGetDataStore$lambda$9$lambda$8$lambda$7(str2);
                return createOrGetDataStore$lambda$9$lambda$8$lambda$7;
            }
        }, 8, (Object) null);
        dataStoreProvider.publishException(str2, exception);
        return PreferencesFactory.createEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createOrGetDataStore$lambda$9$lambda$8$lambda$7(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishException(String message, Throwable throwable) {
        com.braze.events.e eVar = eventPublisher;
        if (eVar == null) {
            return;
        }
        try {
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new b0(eVar, message, throwable, null), 3, null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String publishException$lambda$10;
                    publishException$lambda$10 = DataStoreProvider.publishException$lambda$10();
                    return publishException$lambda$10;
                }
            }, 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String publishException$lambda$10() {
        return "Failed to publish exception";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readBoolean$lambda$2(DataStoreKey dataStoreKey, Boolean bool) {
        return "Not reading data with with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected boolean. Returning default value:'" + bool + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readData$lambda$1(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readInt$lambda$4(DataStoreKey dataStoreKey, Integer num) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected int. Returning default value:'" + num + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readLong$lambda$5(DataStoreKey dataStoreKey, Long l) {
        return "Not reading data with key:'" + dataStoreKey + "' type:'" + dataStoreKey.getType() + "' due to mismatched data type - expected long. Returning default value:'" + l + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String readString$lambda$3(DataStoreKey dataStoreKey, String str) {
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
        BuildersKt.runBlocking(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new s(this, updates, removals, null));
    }

    public final <T> void clear$android_sdk_base_release(Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        BuildersKt.runBlocking(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new u(this, key, null));
    }

    public final void clearAll$android_sdk_base_release() {
        BuildersKt.runBlocking(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new w(this, null));
    }

    public void clearAllData() {
        clearAll$android_sdk_base_release();
    }

    public void clearData(DataStoreKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        switch (q.f742a[key.getType().ordinal()]) {
            case 1:
                clear$android_sdk_base_release(PreferencesKeys.intKey(key.getKey()));
                return;
            case 2:
                clear$android_sdk_base_release(PreferencesKeys.doubleKey(key.getKey()));
                return;
            case 3:
                clear$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()));
                return;
            case 4:
                clear$android_sdk_base_release(PreferencesKeys.booleanKey(key.getKey()));
                return;
            case 5:
                clear$android_sdk_base_release(PreferencesKeys.floatKey(key.getKey()));
                return;
            case 6:
                clear$android_sdk_base_release(PreferencesKeys.longKey(key.getKey()));
                return;
            case 7:
                clear$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()));
                return;
            case 8:
                clear$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean contains(DataStoreKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        switch (q.f742a[key.getType().ordinal()]) {
            case 1:
                return contains$android_sdk_base_release(PreferencesKeys.intKey(key.getKey()));
            case 2:
                return contains$android_sdk_base_release(PreferencesKeys.doubleKey(key.getKey()));
            case 3:
                return contains$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()));
            case 4:
                return contains$android_sdk_base_release(PreferencesKeys.booleanKey(key.getKey()));
            case 5:
                return contains$android_sdk_base_release(PreferencesKeys.floatKey(key.getKey()));
            case 6:
                return contains$android_sdk_base_release(PreferencesKeys.longKey(key.getKey()));
            case 7:
                return contains$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()));
            case 8:
                return contains$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final <T> boolean contains$android_sdk_base_release(Preferences.Key<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Boolean) BuildersKt.runBlocking(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new a0(this, key, null))).booleanValue();
    }

    public final DataStore<Preferences> createOrGetDataStore(List<? extends DataMigration<Preferences>> migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        final String dataStoreFileName = getDataStoreFileName();
        ConcurrentHashMap<String, DataStore<Preferences>> dataStoreCache = getDataStoreCache();
        DataStore<Preferences> dataStore = dataStoreCache.get(dataStoreFileName);
        if (dataStore == null) {
            dataStore = PreferenceDataStoreFactory.INSTANCE.create(new ReplaceFileCorruptionHandler<>(new Function1() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Preferences createOrGetDataStore$lambda$9$lambda$8;
                    createOrGetDataStore$lambda$9$lambda$8 = DataStoreProvider.createOrGetDataStore$lambda$9$lambda$8(dataStoreFileName, this, (CorruptionException) obj);
                    return createOrGetDataStore$lambda$9$lambda$8;
                }
            }), migrations, getDataStoreScope$android_sdk_base_release(), new Function0() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    File createOrGetDataStore$lambda$9$lambda$6;
                    createOrGetDataStore$lambda$9$lambda$6 = DataStoreProvider.createOrGetDataStore$lambda$9$lambda$6(DataStoreProvider.this, dataStoreFileName);
                    return createOrGetDataStore$lambda$9$lambda$6;
                }
            });
            DataStore<Preferences> putIfAbsent = dataStoreCache.putIfAbsent(dataStoreFileName, dataStore);
            if (putIfAbsent != null) {
                dataStore = putIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(dataStore, "getOrPut(...)");
        return dataStore;
    }

    public final Context getContext() {
        return this.context;
    }

    public abstract /* synthetic */ DataStore getDataStore();

    public abstract ConcurrentHashMap<String, DataStore<Preferences>> getDataStoreCache();

    public abstract /* synthetic */ String getDataStoreFileName();

    public final CoroutineScope getDataStoreScope$android_sdk_base_release() {
        return INSTANCE.getOrCreateScopeForKey$android_sdk_base_release(getDataStoreFileName());
    }

    public final <T> T read$android_sdk_base_release(Preferences.Key<T> key, T defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) BuildersKt.runBlocking(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new f0(this, key, defaultValue, null));
    }

    public final Map<Preferences.Key<?>, Object> readAll$android_sdk_base_release() {
        return (Map) BuildersKt.runBlocking(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new g0(this, null));
    }

    public Map<Preferences.Key<?>, Object> readAllData() {
        return readAll$android_sdk_base_release();
    }

    public Boolean readBoolean(final DataStoreKey key, final Boolean r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (Boolean) read$android_sdk_base_release(PreferencesKeys.booleanKey(key.getKey()), r11);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readBoolean$lambda$2;
                    readBoolean$lambda$2 = DataStoreProvider.readBoolean$lambda$2(DataStoreKey.this, r11);
                    return readBoolean$lambda$2;
                }
            }, 8, (Object) null);
            return r11;
        }
    }

    public Object readData(DataStoreKey key, Object r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            switch (q.f742a[key.getType().ordinal()]) {
                case 1:
                    Preferences.Key<Integer> intKey = PreferencesKeys.intKey(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Int");
                    return read$android_sdk_base_release(intKey, (Integer) r11);
                case 2:
                    Preferences.Key<Double> doubleKey = PreferencesKeys.doubleKey(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Double");
                    return read$android_sdk_base_release(doubleKey, (Double) r11);
                case 3:
                    Preferences.Key<String> stringKey = PreferencesKeys.stringKey(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.String");
                    return read$android_sdk_base_release(stringKey, (String) r11);
                case 4:
                    Preferences.Key<Boolean> booleanKey = PreferencesKeys.booleanKey(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Boolean");
                    return read$android_sdk_base_release(booleanKey, (Boolean) r11);
                case 5:
                    Preferences.Key<Float> floatKey = PreferencesKeys.floatKey(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Float");
                    return read$android_sdk_base_release(floatKey, (Float) r11);
                case 6:
                    Preferences.Key<Long> longKey = PreferencesKeys.longKey(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.Long");
                    return read$android_sdk_base_release(longKey, (Long) r11);
                case 7:
                    Preferences.Key<String> stringKey2 = PreferencesKeys.stringKey(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.String");
                    return read$android_sdk_base_release(stringKey2, (String) r11);
                case 8:
                    Preferences.Key<String> stringKey3 = PreferencesKeys.stringKey(key.getKey());
                    Intrinsics.checkNotNull(r11, "null cannot be cast to non-null type kotlin.String");
                    return read$android_sdk_base_release(stringKey3, (String) r11);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            final String str = "Not reading data with key:'" + key + "' type:'" + key.getType() + "' due to mismatched data type. Returning default value:'" + r11 + "'";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readData$lambda$1;
                    readData$lambda$1 = DataStoreProvider.readData$lambda$1(str);
                    return readData$lambda$1;
                }
            }, 8, (Object) null);
            publishException(str, e);
            return r11;
        }
    }

    public Integer readInt(final DataStoreKey key, final Integer r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (Integer) read$android_sdk_base_release(PreferencesKeys.intKey(key.getKey()), r11);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readInt$lambda$4;
                    readInt$lambda$4 = DataStoreProvider.readInt$lambda$4(DataStoreKey.this, r11);
                    return readInt$lambda$4;
                }
            }, 8, (Object) null);
            return r11;
        }
    }

    public Long readLong(final DataStoreKey key, final Long r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (Long) read$android_sdk_base_release(PreferencesKeys.longKey(key.getKey()), r11);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readLong$lambda$5;
                    readLong$lambda$5 = DataStoreProvider.readLong$lambda$5(DataStoreKey.this, r11);
                    return readLong$lambda$5;
                }
            }, 4, (Object) null);
            return r11;
        }
    }

    public String readString(final DataStoreKey key, final String r11) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return (String) read$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()), r11);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String readString$lambda$3;
                    readString$lambda$3 = DataStoreProvider.readString$lambda$3(DataStoreKey.this, r11);
                    return readString$lambda$3;
                }
            }, 8, (Object) null);
            return r11;
        }
    }

    public final <T> void write$android_sdk_base_release(Preferences.Key<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        BuildersKt.runBlocking(getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new n0(this, value, key, null));
    }

    public void writeData(DataStoreKey key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            switch (q.f742a[key.getType().ordinal()]) {
                case 1:
                    write$android_sdk_base_release(PreferencesKeys.intKey(key.getKey()), (Integer) value);
                    return;
                case 2:
                    write$android_sdk_base_release(PreferencesKeys.doubleKey(key.getKey()), (Double) value);
                    return;
                case 3:
                    write$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()), (String) value);
                    return;
                case 4:
                    write$android_sdk_base_release(PreferencesKeys.booleanKey(key.getKey()), (Boolean) value);
                    return;
                case 5:
                    write$android_sdk_base_release(PreferencesKeys.floatKey(key.getKey()), (Float) value);
                    return;
                case 6:
                    write$android_sdk_base_release(PreferencesKeys.longKey(key.getKey()), (Long) value);
                    return;
                case 7:
                    write$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()), (String) value);
                    return;
                case 8:
                    write$android_sdk_base_release(PreferencesKeys.stringKey(key.getKey()), (String) value);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            final String str = "Not storing data with key:'" + key + "' value:'" + value + "' type:'" + key.getType() + "' due to mismatched data type.";
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.storage.DataStoreProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String writeData$lambda$0;
                    writeData$lambda$0 = DataStoreProvider.writeData$lambda$0(str);
                    return writeData$lambda$0;
                }
            }, 8, (Object) null);
            publishException(str, e);
        }
    }

    public final /* synthetic */ <K, V> Map<K, V> readMap(DataStoreKey key) {
        Map emptyMap;
        KSerializer MapSerializer;
        LinkedHashMap asMutableMap;
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new k0(key), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object readData = readData(key, "");
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
            String str = (String) readData;
            if (StringsKt.isBlank(str)) {
                asMutableMap = new LinkedHashMap();
            } else {
                Intrinsics.reifiedOperationMarker(4, "K");
                if (Object.class != String.class) {
                    Intrinsics.reifiedOperationMarker(4, "K");
                    throw new UnsupportedOperationException("Non-String keys not yet supported. Key type: " + Reflection.getOrCreateKotlinClass(Object.class).getSimpleName());
                }
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                if (StringsKt.isBlank(str)) {
                    emptyMap = MapsKt.emptyMap();
                } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                    emptyMap = MapsKt.emptyMap();
                } else {
                    try {
                        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
                        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Long.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Boolean.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Integer.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(Float.TYPE))) {
                            MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                        } else {
                            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                            BrazeLogger.Priority priority = BrazeLogger.Priority.E;
                            Intrinsics.needClassReification();
                            BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, priority, (Throwable) null, false, (Function0) j0.f720a, 6, (Object) null);
                            emptyMap = MapsKt.emptyMap();
                        }
                        Object decodeFromString = Json.INSTANCE.decodeFromString(MapSerializer, str);
                        Intrinsics.checkNotNull(decodeFromString, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, T of com.braze.support.DataStoreUtils.jsonStringToStringMap>");
                        emptyMap = (Map) decodeFromString;
                        Map map = emptyMap;
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.f(str), 4, (Object) null);
                        emptyMap = MapsKt.emptyMap();
                    }
                    Map map2 = emptyMap;
                }
                Map mutableMap = MapsKt.toMutableMap(emptyMap);
                Intrinsics.checkNotNull(mutableMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<K of com.braze.storage.DataStoreProvider.readMap, V of com.braze.storage.DataStoreProvider.readMap>");
                asMutableMap = TypeIntrinsics.asMutableMap(mutableMap);
                Map<K, V> map3 = asMutableMap;
            }
            Map<K, V> map4 = asMutableMap;
            return asMutableMap;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new l0(key), 8, (Object) null);
            return new LinkedHashMap();
        }
    }

    public final /* synthetic */ <T> List<T> readList(DataStoreKey key) {
        List emptyList;
        ArrayList mutableList;
        Intrinsics.checkNotNullParameter(key, "key");
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new h0(key), 12, (Object) null);
            return new ArrayList();
        }
        try {
            Object readData = readData(key, "");
            Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
            String str = (String) readData;
            if (StringsKt.isBlank(str)) {
                mutableList = new ArrayList();
            } else {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                if (StringsKt.isBlank(str)) {
                    emptyList = CollectionsKt.emptyList();
                } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                    emptyList = CollectionsKt.emptyList();
                } else {
                    try {
                        Json.Companion companion = Json.INSTANCE;
                        SerializersModule serializersModule = companion.getSerializersModule();
                        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                        emptyList = (List) companion.decodeFromString(new ArrayListSerializer(SerializersKt.serializer(serializersModule, (KType) null)), str);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                        emptyList = CollectionsKt.emptyList();
                    }
                    List list = emptyList;
                }
                mutableList = CollectionsKt.toMutableList((Collection) emptyList);
            }
            List<T> list2 = mutableList;
            return mutableList;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new i0(key), 8, (Object) null);
            return new ArrayList();
        }
    }

    public final /* synthetic */ <K, V> void writeMap(DataStoreKey key, Map<K, ? extends V> map) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(map, "map");
        if (key.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new q0(key), 12, (Object) null);
            return;
        }
        try {
            Intrinsics.reifiedOperationMarker(4, "K");
        } catch (Exception e) {
            e = e;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new r0(key), 8, (Object) null);
        }
        try {
            if (Object.class != String.class) {
                Intrinsics.reifiedOperationMarker(4, "K");
                throw new UnsupportedOperationException("Non-String keys not yet supported. Key type: " + Reflection.getOrCreateKotlinClass(Object.class).getSimpleName());
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                SerializersModule serializersModule = companion.getSerializersModule();
                Intrinsics.reifiedOperationMarker(6, "K");
                MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                KSerializer<Object> serializer = SerializersKt.serializer(serializersModule, (KType) null);
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
                MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                str = companion.encodeToString(new LinkedHashMapSerializer(serializer, SerializersKt.serializer(serializersModule, (KType) null)), map);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = "{}";
            }
            writeData(key, str);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new r0(key), 8, (Object) null);
        }
    }

    public final /* synthetic */ <T> void writeList(DataStoreKey key, List<? extends T> list) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(list, "list");
        if (key.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new o0(key), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Companion companion = Json.INSTANCE;
                SerializersModule serializersModule = companion.getSerializersModule();
                Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
                MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
                str = companion.encodeToString(new ArrayListSerializer(SerializersKt.serializer(serializersModule, (KType) null)), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                str = list instanceof Map ? "{}" : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            writeData(key, str);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new p0(key), 8, (Object) null);
        }
    }
}
