package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.location.IBrazeLocationApi;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0001~B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010\u0019J\u0017\u00100\u001a\u00020\u00112\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u00020#02H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0013J\u0019\u00107\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b7\u0010,J\u000f\u00108\u001a\u00020\u0011H\u0007¢\u0006\u0004\b8\u0010\u0013J%\u00109\u001a\u00020\u00112\f\u00103\u001a\b\u0012\u0004\u0012\u00020#022\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020#02¢\u0006\u0004\b;\u0010<R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010@R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010H\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010\u0013\u001a\u0004\bJ\u0010KR \u0010N\u001a\u00020M8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010\u0013\u001a\u0004\bP\u0010QR\u001c\u0010T\u001a\n S*\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR&\u0010Z\u001a\b\u0012\u0004\u0012\u00020#0Y8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u0010[\u0012\u0004\b]\u0010\u0013\u001a\u0004\b\\\u0010<R\"\u0010^\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b^\u0010_\u0012\u0004\bb\u0010\u0013\u001a\u0004\b`\u0010aR(\u0010d\u001a\u00020c8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bd\u0010e\u0012\u0004\bj\u0010\u0013\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR*\u0010k\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bk\u0010l\u0012\u0004\bp\u0010\u0013\u001a\u0004\bm\u0010n\"\u0004\bo\u0010,R(\u0010q\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bq\u0010r\u0012\u0004\bu\u0010\u0013\u001a\u0004\bq\u0010s\"\u0004\bt\u0010\u0019R(\u0010w\u001a\u00020v8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bw\u0010x\u0012\u0004\b}\u0010\u0013\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006\u007f"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager;", "", "Lcom/braze/managers/IBrazeGeofenceLocationUpdateListener;", "Landroid/content/Context;", "context", "", "apiKey", "Lcom/braze/managers/m0;", "brazeManager", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/storage/b3;", "serverConfigStorageProvider", "Lcom/braze/events/e;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/braze/managers/m0;Lcom/braze/configuration/BrazeConfigurationProvider;Lcom/braze/storage/b3;Lcom/braze/events/e;)V", "", "initializeGeofences", "()V", "", "isGeofencesEnabledFromEnvironment", "(Landroid/content/Context;)Z", "reRegisterGeofences", "setUpGeofences", "(Z)V", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "tearDownGeofences", "(Landroid/app/PendingIntent;)V", "geofenceId", "Lcom/braze/enums/GeofenceTransitionType;", "geofenceTransitionType", "analyticsEnabledForGeofenceId", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)Z", "Lcom/braze/models/BrazeGeofence;", "getBrazeGeofenceForGeofenceId", "(Ljava/lang/String;)Lcom/braze/models/BrazeGeofence;", "transitionType", "postGeofenceReport", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)V", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "requestGeofenceRefresh", "(Lcom/braze/models/IBrazeLocation;)V", "ignoreRateLimit", "Lcom/braze/models/response/m;", "serverConfig", "configureFromServerConfig", "(Lcom/braze/models/response/m;)V", "", "geofenceList", "registerGeofences", "(Ljava/util/List;)V", "unregisterGeofences", "onLocationRequestComplete", "requestSingleLocationUpdateFromGooglePlay", "registerGeofencesWithGooglePlay", "(Ljava/util/List;Landroid/app/PendingIntent;)V", "retrieveBrazeGeofencesFromLocalStorage", "()Ljava/util/List;", "Lcom/braze/managers/m0;", "getBrazeManager", "()Lcom/braze/managers/m0;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/storage/b3;", "Lcom/braze/storage/GeofenceDataStoreProvider;", "geofenceDataStoreProvider", "Lcom/braze/storage/GeofenceDataStoreProvider;", "getGeofenceDataStoreProvider", "()Lcom/braze/storage/GeofenceDataStoreProvider;", "Lcom/braze/location/a;", "brazeGeofenceApi", "Lcom/braze/location/a;", "getBrazeGeofenceApi", "()Lcom/braze/location/a;", "getBrazeGeofenceApi$annotations", "Lcom/braze/location/b;", "brazeLocationApi", "Lcom/braze/location/b;", "getBrazeLocationApi", "()Lcom/braze/location/b;", "getBrazeLocationApi$annotations", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "geofenceListLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "brazeGeofences", "Ljava/util/List;", "getBrazeGeofences", "getBrazeGeofences$annotations", "geofenceTransitionPendingIntent", "Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent", "()Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent$annotations", "Lcom/braze/managers/n;", "brazeGeofenceReEligibilityManager", "Lcom/braze/managers/n;", "getBrazeGeofenceReEligibilityManager", "()Lcom/braze/managers/n;", "setBrazeGeofenceReEligibilityManager", "(Lcom/braze/managers/n;)V", "getBrazeGeofenceReEligibilityManager$annotations", "geofenceRequestLocation", "Lcom/braze/models/IBrazeLocation;", "getGeofenceRequestLocation", "()Lcom/braze/models/IBrazeLocation;", "setGeofenceRequestLocation", "getGeofenceRequestLocation$annotations", "isGeofencesEnabled", "Z", "()Z", "setGeofencesEnabled", "isGeofencesEnabled$annotations", "", "maxNumToRegister", "I", "getMaxNumToRegister", "()I", "setMaxNumToRegister", "(I)V", "getMaxNumToRegister$annotations", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeGeofenceManager implements IBrazeGeofenceLocationUpdateListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context applicationContext;
    private final com.braze.location.a brazeGeofenceApi;
    private n brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final com.braze.location.b brazeLocationApi;
    private final m0 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final GeofenceDataStoreProvider geofenceDataStoreProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final b3 serverConfigStorageProvider;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager$Companion;", "", "<init>", "()V", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getGeofencesEnabledFromConfiguration", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Z", "Lcom/braze/storage/b3;", "serverConfigStorageProvider", "getGeofencesEnabledFromServerConfig", "(Lcom/braze/storage/b3;)Z", "", "getMaxNumToRegister", "(Lcom/braze/storage/b3;)I", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$0() {
            return "Geofences enabled in server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$1() {
            return "Geofences explicitly disabled via server configuration.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getGeofencesEnabledFromServerConfig$lambda$2() {
            return "Geofences implicitly disabled via server configuration.";
        }

        @JvmStatic
        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            return configurationProvider.isGeofencesEnabled();
        }

        @JvmStatic
        public final boolean getGeofencesEnabledFromServerConfig(b3 serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (!serverConfigStorageProvider.J()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$Companion$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String geofencesEnabledFromServerConfig$lambda$2;
                        geofencesEnabledFromServerConfig$lambda$2 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$2();
                        return geofencesEnabledFromServerConfig$lambda$2;
                    }
                }, 6, (Object) null);
                return false;
            }
            if (serverConfigStorageProvider.I()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String geofencesEnabledFromServerConfig$lambda$0;
                        geofencesEnabledFromServerConfig$lambda$0 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$0();
                        return geofencesEnabledFromServerConfig$lambda$0;
                    }
                }, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String geofencesEnabledFromServerConfig$lambda$1;
                    geofencesEnabledFromServerConfig$lambda$1 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$1();
                    return geofencesEnabledFromServerConfig$lambda$1;
                }
            }, 6, (Object) null);
            return false;
        }

        @JvmStatic
        public final int getMaxNumToRegister(b3 serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (serverConfigStorageProvider.q() > 0) {
                return serverConfigStorageProvider.q();
            }
            return 20;
        }

        private Companion() {
        }
    }

    public BrazeGeofenceManager(Context context, String apiKey, m0 brazeManager, BrazeConfigurationProvider configurationProvider, b3 serverConfigStorageProvider, com.braze.events.e internalIEventMessenger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        this.brazeManager = brazeManager;
        this.configurationProvider = configurationProvider;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        GeofenceDataStoreProvider geofenceDataStoreProvider = new GeofenceDataStoreProvider(context, apiKey);
        this.geofenceDataStoreProvider = geofenceDataStoreProvider;
        com.braze.location.a aVar = new com.braze.location.a(geofenceDataStoreProvider);
        this.brazeGeofenceApi = aVar;
        this.brazeLocationApi = new com.braze.location.b(context, p.d.a(configurationProvider), configurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        this.brazeGeofences = CollectionsKt.toMutableList((Collection) retrieveBrazeGeofencesFromLocalStorage());
        Intrinsics.checkNotNullParameter(context, "context");
        IBrazeGeofenceApi iBrazeGeofenceApi = aVar.b;
        this.geofenceTransitionPendingIntent = iBrazeGeofenceApi != null ? iBrazeGeofenceApi.getGeofenceTransitionPendingIntent(context) : null;
        this.brazeGeofenceReEligibilityManager = new n(serverConfigStorageProvider, internalIEventMessenger, geofenceDataStoreProvider);
        Companion companion = INSTANCE;
        this.isGeofencesEnabled = companion.getGeofencesEnabledFromServerConfig(serverConfigStorageProvider) && isGeofencesEnabledFromEnvironment(context) && aVar.b != null;
        this.maxNumToRegister = companion.getMaxNumToRegister(serverConfigStorageProvider);
        if (aVar.b == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _init_$lambda$0;
                    _init_$lambda$0 = BrazeGeofenceManager._init_$lambda$0();
                    return _init_$lambda$0;
                }
            }, 6, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String _init_$lambda$1;
                _init_$lambda$1 = BrazeGeofenceManager._init_$lambda$1();
                return _init_$lambda$1;
            }
        }, 6, (Object) null);
        setUpGeofences(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return "***Geofence API not found. Please include the android-sdk-location module***";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1() {
        return "Calling setUpGeofences on geofence manager init";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$27(boolean z) {
        return "Geofences enabled server config value " + z + " received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$28(BrazeGeofenceManager brazeGeofenceManager) {
        return "Geofences enabled status newly set to " + brazeGeofenceManager.isGeofencesEnabled + " during server config update.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$29(boolean z) {
        return "Geofences enabled status of `" + z + "` was unchanged during server config update.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$30(BrazeGeofenceManager brazeGeofenceManager) {
        return "Max number to register newly set to " + brazeGeofenceManager.maxNumToRegister + " via server config.";
    }

    public static /* synthetic */ void getBrazeGeofenceApi$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofenceReEligibilityManager$annotations() {
    }

    public static /* synthetic */ void getBrazeGeofences$annotations() {
    }

    public static /* synthetic */ void getBrazeLocationApi$annotations() {
    }

    public static /* synthetic */ void getGeofenceRequestLocation$annotations() {
    }

    public static /* synthetic */ void getGeofenceTransitionPendingIntent$annotations() {
    }

    @JvmStatic
    public static final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider brazeConfigurationProvider) {
        return INSTANCE.getGeofencesEnabledFromConfiguration(brazeConfigurationProvider);
    }

    @JvmStatic
    public static final boolean getGeofencesEnabledFromServerConfig(b3 b3Var) {
        return INSTANCE.getGeofencesEnabledFromServerConfig(b3Var);
    }

    @JvmStatic
    public static final int getMaxNumToRegister(b3 b3Var) {
        return INSTANCE.getMaxNumToRegister(b3Var);
    }

    public static /* synthetic */ void getMaxNumToRegister$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$2() {
        return "Request to set up geofences received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$3() {
        return "Not automatically requesting Geofences on initialization due to configuration.";
    }

    public static /* synthetic */ void isGeofencesEnabled$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$10() {
        return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$4() {
        return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$5() {
        return "Fine grained location permissions not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$6() {
        return "Background location access permission not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$7() {
        return "Google Play Services not available. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$8() {
        return "Braze Geofence API is not available";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$9() {
        return "Google Play Services Location API not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$40(IBrazeLocation iBrazeLocation) {
        return "Single location request was successful, requesting Geofence refresh. Location:\n " + iBrazeLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$41() {
        return "Single location request was unsuccessful, not storing last updated time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String postGeofenceReport$lambda$22() {
        return "Braze geofences not enabled. Not posting geofence report.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String postGeofenceReport$lambda$23(String str, GeofenceTransitionType geofenceTransitionType) {
        return "Failed to record geofence " + str + " transition with transition type " + geofenceTransitionType + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$31() {
        return "Braze geofences not enabled. Not adding new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$33(List list) {
        return "Received new geofence list of size: " + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$34(BrazeGeofenceManager brazeGeofenceManager) {
        return "Reached maximum number of new geofences: " + brazeGeofenceManager.maxNumToRegister;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$35(BrazeGeofence brazeGeofence) {
        return "Adding new geofence to local storage: " + brazeGeofence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$37$lambda$36(BrazeGeofenceManager brazeGeofenceManager) {
        return "Added " + brazeGeofenceManager.brazeGeofences.size() + " new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$24() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$26() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSingleLocationUpdateFromGooglePlay$lambda$42(BrazeGeofenceManager brazeGeofenceManager, IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        brazeGeofenceManager.onLocationRequestComplete(location);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$43() {
        return "Did not find stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$11() {
        return "Braze geofences not enabled. Geofences not set up.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$12(boolean z) {
        return "Setting up geofences in setUpGeofences with reRegisterGeofences: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$13() {
        return "Could not get pending intent to setup geofences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$15() {
        return "Tearing down geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$16() {
        return "Unregistering any Braze geofences from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$18$lambda$17() {
        return "Deleting locally stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$38() {
        return "Braze geofences not enabled. Not un-registering geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$39() {
        return "Tearing down all geofences.";
    }

    public final boolean analyticsEnabledForGeofenceId(String geofenceId, GeofenceTransitionType geofenceTransitionType) {
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(geofenceTransitionType, "geofenceTransitionType");
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(geofenceId);
            if (brazeGeofenceForGeofenceId != null) {
                if (geofenceTransitionType == GeofenceTransitionType.ENTER) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledEnter();
                }
                if (geofenceTransitionType == GeofenceTransitionType.EXIT) {
                    return brazeGeofenceForGeofenceId.getAnalyticsEnabledExit();
                }
            }
            reentrantLock.unlock();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void configureFromServerConfig(com.braze.models.response.m serverConfig) {
        final boolean z;
        int i;
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        final boolean z2 = serverConfig.i;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String configureFromServerConfig$lambda$27;
                configureFromServerConfig$lambda$27 = BrazeGeofenceManager.configureFromServerConfig$lambda$27(z2);
                return configureFromServerConfig$lambda$27;
            }
        }, 7, (Object) null);
        if (z2) {
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext) && this.brazeGeofenceApi.b != null) {
                z = true;
                if (z == this.isGeofencesEnabled) {
                    this.isGeofencesEnabled = z;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configureFromServerConfig$lambda$28;
                            configureFromServerConfig$lambda$28 = BrazeGeofenceManager.configureFromServerConfig$lambda$28(BrazeGeofenceManager.this);
                            return configureFromServerConfig$lambda$28;
                        }
                    }, 6, (Object) null);
                    if (this.isGeofencesEnabled) {
                        setUpGeofences(false);
                        if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                            requestGeofenceRefresh(true);
                        }
                    } else {
                        tearDownGeofences(this.geofenceTransitionPendingIntent);
                    }
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configureFromServerConfig$lambda$29;
                            configureFromServerConfig$lambda$29 = BrazeGeofenceManager.configureFromServerConfig$lambda$29(z);
                            return configureFromServerConfig$lambda$29;
                        }
                    }, 7, (Object) null);
                }
                i = serverConfig.g;
                if (i >= 0) {
                    this.maxNumToRegister = i;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configureFromServerConfig$lambda$30;
                            configureFromServerConfig$lambda$30 = BrazeGeofenceManager.configureFromServerConfig$lambda$30(BrazeGeofenceManager.this);
                            return configureFromServerConfig$lambda$30;
                        }
                    }, 6, (Object) null);
                }
                this.brazeGeofenceReEligibilityManager.a(serverConfig);
            }
        }
        z = false;
        if (z == this.isGeofencesEnabled) {
        }
        i = serverConfig.g;
        if (i >= 0) {
        }
        this.brazeGeofenceReEligibilityManager.a(serverConfig);
    }

    public final com.braze.location.a getBrazeGeofenceApi() {
        return this.brazeGeofenceApi;
    }

    public final BrazeGeofence getBrazeGeofenceForGeofenceId(String geofenceId) {
        Object obj;
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.brazeGeofences.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((BrazeGeofence) obj).getId(), geofenceId)) {
                    break;
                }
            }
            return (BrazeGeofence) obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final n getBrazeGeofenceReEligibilityManager() {
        return this.brazeGeofenceReEligibilityManager;
    }

    public final List<BrazeGeofence> getBrazeGeofences() {
        return this.brazeGeofences;
    }

    public final com.braze.location.b getBrazeLocationApi() {
        return this.brazeLocationApi;
    }

    public final m0 getBrazeManager() {
        return this.brazeManager;
    }

    public final GeofenceDataStoreProvider getGeofenceDataStoreProvider() {
        return this.geofenceDataStoreProvider;
    }

    public final IBrazeLocation getGeofenceRequestLocation() {
        return this.geofenceRequestLocation;
    }

    public final PendingIntent getGeofenceTransitionPendingIntent() {
        return this.geofenceTransitionPendingIntent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initializeGeofences() {
        boolean z;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String initializeGeofences$lambda$2;
                initializeGeofences$lambda$2 = BrazeGeofenceManager.initializeGeofences$lambda$2();
                return initializeGeofences$lambda$2;
            }
        }, 7, (Object) null);
        if (INSTANCE.getGeofencesEnabledFromServerConfig(this.serverConfigStorageProvider)) {
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext) && this.brazeGeofenceApi.b != null) {
                z = true;
                this.isGeofencesEnabled = z;
                if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String initializeGeofences$lambda$3;
                            initializeGeofences$lambda$3 = BrazeGeofenceManager.initializeGeofences$lambda$3();
                            return initializeGeofences$lambda$3;
                        }
                    }, 7, (Object) null);
                    return;
                } else {
                    requestGeofenceRefresh(true);
                    return;
                }
            }
        }
        z = false;
        this.isGeofencesEnabled = z;
        if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
        }
    }

    /* renamed from: isGeofencesEnabled, reason: from getter */
    public final boolean getIsGeofencesEnabled() {
        return this.isGeofencesEnabled;
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!INSTANCE.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$4;
                    isGeofencesEnabledFromEnvironment$lambda$4 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$4();
                    return isGeofencesEnabledFromEnvironment$lambda$4;
                }
            }, 7, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$5;
                    isGeofencesEnabledFromEnvironment$lambda$5 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$5();
                    return isGeofencesEnabledFromEnvironment$lambda$5;
                }
            }, 6, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$6;
                    isGeofencesEnabledFromEnvironment$lambda$6 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$6();
                    return isGeofencesEnabledFromEnvironment$lambda$6;
                }
            }, 6, (Object) null);
            return false;
        }
        if (!com.braze.support.p.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$7;
                    isGeofencesEnabledFromEnvironment$lambda$7 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$7();
                    return isGeofencesEnabledFromEnvironment$lambda$7;
                }
            }, 7, (Object) null);
            return false;
        }
        if (this.brazeGeofenceApi.b == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$8;
                    isGeofencesEnabledFromEnvironment$lambda$8 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$8();
                    return isGeofencesEnabledFromEnvironment$lambda$8;
                }
            }, 7, (Object) null);
            return false;
        }
        try {
            Class.forName("com.google.android.gms.location.LocationServices", false, BrazeGeofenceManager.class.getClassLoader());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$10;
                    isGeofencesEnabledFromEnvironment$lambda$10 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$10();
                    return isGeofencesEnabledFromEnvironment$lambda$10;
                }
            }, 7, (Object) null);
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$9;
                    isGeofencesEnabledFromEnvironment$lambda$9 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$9();
                    return isGeofencesEnabledFromEnvironment$lambda$9;
                }
            }, 7, (Object) null);
            return false;
        }
    }

    @Override // com.braze.managers.IBrazeGeofenceLocationUpdateListener
    public void onLocationRequestComplete(final IBrazeLocation location) {
        if (location == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onLocationRequestComplete$lambda$41;
                    onLocationRequestComplete$lambda$41 = BrazeGeofenceManager.onLocationRequestComplete$lambda$41();
                    return onLocationRequestComplete$lambda$41;
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onLocationRequestComplete$lambda$40;
                onLocationRequestComplete$lambda$40 = BrazeGeofenceManager.onLocationRequestComplete$lambda$40(IBrazeLocation.this);
                return onLocationRequestComplete$lambda$40;
            }
        }, 7, (Object) null);
        requestGeofenceRefresh(location);
        this.brazeGeofenceReEligibilityManager.b(DateTimeUtils.nowInSeconds());
    }

    public void postGeofenceReport(final String geofenceId, final GeofenceTransitionType transitionType) {
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String postGeofenceReport$lambda$22;
                    postGeofenceReport$lambda$22 = BrazeGeofenceManager.postGeofenceReport$lambda$22();
                    return postGeofenceReport$lambda$22;
                }
            }, 6, (Object) null);
            return;
        }
        com.braze.models.outgoing.event.a aVar = com.braze.models.outgoing.event.b.g;
        String obj = transitionType.toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        com.braze.models.k g = aVar.g(geofenceId, lowerCase);
        if (g == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String postGeofenceReport$lambda$23;
                    postGeofenceReport$lambda$23 = BrazeGeofenceManager.postGeofenceReport$lambda$23(geofenceId, transitionType);
                    return postGeofenceReport$lambda$23;
                }
            }, 6, (Object) null);
            return;
        }
        if (analyticsEnabledForGeofenceId(geofenceId, transitionType)) {
            ((r) this.brazeManager).a(g);
        }
        BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(geofenceId);
        if (brazeGeofenceForGeofenceId != null && this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds(), brazeGeofenceForGeofenceId, transitionType)) {
            ((r) this.brazeManager).g(g);
        }
    }

    public void registerGeofences(List<BrazeGeofence> geofenceList) {
        String str;
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        final List<BrazeGeofence> mutableList = CollectionsKt.toMutableList((Collection) geofenceList);
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofences$lambda$31;
                    registerGeofences$lambda$31 = BrazeGeofenceManager.registerGeofences$lambda$31();
                    return registerGeofences$lambda$31;
                }
            }, 6, (Object) null);
            return;
        }
        if (this.geofenceRequestLocation != null) {
            for (BrazeGeofence brazeGeofence : mutableList) {
                IBrazeLocation iBrazeLocation = this.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    double latitude = iBrazeLocation.getLatitude();
                    double longitude = iBrazeLocation.getLongitude();
                    double latitude2 = brazeGeofence.getLatitude();
                    double longitude2 = brazeGeofence.getLongitude();
                    double radians = Math.toRadians(latitude2 - latitude);
                    double radians2 = Math.toRadians(longitude2 - longitude);
                    double d = 2;
                    brazeGeofence.setDistanceFromGeofenceRefresh(Math.asin(Math.sqrt((Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(latitude)) * Math.pow(Math.sin(radians2 / d), 2.0d)) + Math.pow(Math.sin(radians / d), 2.0d))) * 1.2742E7d);
                }
            }
            CollectionsKt.sort(mutableList);
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofences$lambda$37$lambda$33;
                    registerGeofences$lambda$37$lambda$33 = BrazeGeofenceManager.registerGeofences$lambda$37$lambda$33(mutableList);
                    return registerGeofences$lambda$37$lambda$33;
                }
            }, 7, (Object) null);
            this.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            this.brazeGeofences.clear();
            Iterator it = mutableList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final BrazeGeofence brazeGeofence2 = (BrazeGeofence) it.next();
                if (i == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerGeofences$lambda$37$lambda$34;
                            registerGeofences$lambda$37$lambda$34 = BrazeGeofenceManager.registerGeofences$lambda$37$lambda$34(BrazeGeofenceManager.this);
                            return registerGeofences$lambda$37$lambda$34;
                        }
                    }, 7, (Object) null);
                    break;
                } else {
                    this.brazeGeofences.add(brazeGeofence2);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerGeofences$lambda$37$lambda$35;
                            registerGeofences$lambda$37$lambda$35 = BrazeGeofenceManager.registerGeofences$lambda$37$lambda$35(BrazeGeofence.this);
                            return registerGeofences$lambda$37$lambda$35;
                        }
                    }, 7, (Object) null);
                    i++;
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofences$lambda$37$lambda$36;
                    registerGeofences$lambda$37$lambda$36 = BrazeGeofenceManager.registerGeofences$lambda$37$lambda$36(BrazeGeofenceManager.this);
                    return registerGeofences$lambda$37$lambda$36;
                }
            }, 7, (Object) null);
            GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
            DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
            List<BrazeGeofence> list = this.brazeGeofences;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.o0(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        Json.Companion companion = Json.INSTANCE;
                        companion.getSerializersModule();
                        str = companion.encodeToString(new ArrayListSerializer(BrazeGeofence.Companion.serializer()), list);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) com.braze.support.i.f781a, 4, (Object) null);
                        str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    geofenceDataStoreProvider.writeData(dataStoreKey, str);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.storage.p0(dataStoreKey), 8, (Object) null);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.brazeGeofenceReEligibilityManager.a(mutableList);
            setUpGeofences(true);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        com.braze.location.a aVar = this.brazeGeofenceApi;
        Context context = this.applicationContext;
        Intrinsics.checkNotNullExpressionValue(context, "applicationContext");
        aVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        IBrazeGeofenceApi iBrazeGeofenceApi = aVar.b;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.registerGeofences(context, geofenceList, geofenceRequestIntent, aVar.f560a);
        }
    }

    public void requestGeofenceRefresh(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofenceRefresh$lambda$24;
                    requestGeofenceRefresh$lambda$24 = BrazeGeofenceManager.requestGeofenceRefresh$lambda$24();
                    return requestGeofenceRefresh$lambda$24;
                }
            }, 7, (Object) null);
            return;
        }
        this.geofenceRequestLocation = location;
        if (location != null) {
            ((r) this.brazeManager).a(location);
        }
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        com.braze.location.b bVar = this.brazeLocationApi;
        Function1<? super IBrazeLocation, Unit> locationUpdateCallback = new Function1() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit requestSingleLocationUpdateFromGooglePlay$lambda$42;
                requestSingleLocationUpdateFromGooglePlay$lambda$42 = BrazeGeofenceManager.requestSingleLocationUpdateFromGooglePlay$lambda$42(BrazeGeofenceManager.this, (IBrazeLocation) obj);
                return requestSingleLocationUpdateFromGooglePlay$lambda$42;
            }
        };
        bVar.getClass();
        Intrinsics.checkNotNullParameter(locationUpdateCallback, "locationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = bVar.f561a;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.requestSingleLocationUpdate(locationUpdateCallback);
        }
    }

    public final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage() {
        List<BrazeGeofence> arrayList;
        List emptyList;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
        DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new com.braze.storage.h0(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList<>();
        } else {
            try {
                Object readData = geofenceDataStoreProvider.readData(dataStoreKey, "");
                Intrinsics.checkNotNull(readData, "null cannot be cast to non-null type kotlin.String");
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList<>();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        emptyList = CollectionsKt.emptyList();
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), AbstractJsonLexerKt.NULL)) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            Json.Companion companion = Json.INSTANCE;
                            companion.getSerializersModule();
                            emptyList = (List) companion.decodeFromString(new ArrayListSerializer(BrazeGeofence.Companion.serializer()), str);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new com.braze.support.e(str), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new com.braze.storage.i0(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList<>();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String retrieveBrazeGeofencesFromLocalStorage$lambda$43;
                    retrieveBrazeGeofencesFromLocalStorage$lambda$43 = BrazeGeofenceManager.retrieveBrazeGeofencesFromLocalStorage$lambda$43();
                    return retrieveBrazeGeofencesFromLocalStorage$lambda$43;
                }
            }, 7, (Object) null);
        }
        return arrayList;
    }

    public final void setBrazeGeofenceReEligibilityManager(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        this.brazeGeofenceReEligibilityManager = nVar;
    }

    public final void setGeofenceRequestLocation(IBrazeLocation iBrazeLocation) {
        this.geofenceRequestLocation = iBrazeLocation;
    }

    public final void setGeofencesEnabled(boolean z) {
        this.isGeofencesEnabled = z;
    }

    public final void setMaxNumToRegister(int i) {
        this.maxNumToRegister = i;
    }

    public final void setUpGeofences(final boolean reRegisterGeofences) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String upGeofences$lambda$11;
                    upGeofences$lambda$11 = BrazeGeofenceManager.setUpGeofences$lambda$11();
                    return upGeofences$lambda$11;
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String upGeofences$lambda$12;
                upGeofences$lambda$12 = BrazeGeofenceManager.setUpGeofences$lambda$12(reRegisterGeofences);
                return upGeofences$lambda$12;
            }
        }, 6, (Object) null);
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String upGeofences$lambda$13;
                    upGeofences$lambda$13 = BrazeGeofenceManager.setUpGeofences$lambda$13();
                    return upGeofences$lambda$13;
                }
            }, 7, (Object) null);
            return;
        }
        if (reRegisterGeofences) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(this.brazeGeofences, pendingIntent);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void tearDownGeofences(PendingIntent geofenceRequestIntent) {
        BrazeGeofenceManager brazeGeofenceManager;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String tearDownGeofences$lambda$15;
                tearDownGeofences$lambda$15 = BrazeGeofenceManager.tearDownGeofences$lambda$15();
                return tearDownGeofences$lambda$15;
            }
        }, 7, (Object) null);
        if (geofenceRequestIntent != null) {
            brazeGeofenceManager = this;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String tearDownGeofences$lambda$16;
                    tearDownGeofences$lambda$16 = BrazeGeofenceManager.tearDownGeofences$lambda$16();
                    return tearDownGeofences$lambda$16;
                }
            }, 7, (Object) null);
            com.braze.location.a aVar = brazeGeofenceManager.brazeGeofenceApi;
            Context applicationContext = brazeGeofenceManager.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            aVar.getClass();
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(geofenceRequestIntent, "intent");
            IBrazeGeofenceApi iBrazeGeofenceApi = aVar.b;
            if (iBrazeGeofenceApi != null) {
                iBrazeGeofenceApi.teardownGeofences(applicationContext, geofenceRequestIntent);
            }
        } else {
            brazeGeofenceManager = this;
        }
        ReentrantLock reentrantLock = brazeGeofenceManager.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String tearDownGeofences$lambda$18$lambda$17;
                    tearDownGeofences$lambda$18$lambda$17 = BrazeGeofenceManager.tearDownGeofences$lambda$18$lambda$17();
                    return tearDownGeofences$lambda$18$lambda$17;
                }
            }, 7, (Object) null);
            brazeGeofenceManager.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            brazeGeofenceManager.brazeGeofences.clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterGeofences() {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterGeofences$lambda$38;
                    unregisterGeofences$lambda$38 = BrazeGeofenceManager.unregisterGeofences$lambda$38();
                    return unregisterGeofences$lambda$38;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterGeofences$lambda$39;
                    unregisterGeofences$lambda$39 = BrazeGeofenceManager.unregisterGeofences$lambda$39();
                    return unregisterGeofences$lambda$39;
                }
            }, 7, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }

    public final int getMaxNumToRegister() {
        return this.maxNumToRegister;
    }

    public void requestGeofenceRefresh(boolean ignoreRateLimit) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.BrazeGeofenceManager$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofenceRefresh$lambda$26;
                    requestGeofenceRefresh$lambda$26 = BrazeGeofenceManager.requestGeofenceRefresh$lambda$26();
                    return requestGeofenceRefresh$lambda$26;
                }
            }, 7, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(ignoreRateLimit, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }
}
