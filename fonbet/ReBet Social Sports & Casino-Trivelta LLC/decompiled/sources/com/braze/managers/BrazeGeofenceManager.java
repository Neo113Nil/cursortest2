package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import bo.app.a2;
import bo.app.a9;
import bo.app.c2;
import bo.app.e2;
import bo.app.j1;
import bo.app.k1;
import bo.app.m9;
import bo.app.re;
import bo.app.u1;
import bo.app.ue;
import bo.app.y1;
import bo.app.y8;
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
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.g;
import di.C4087f;
import ei.AbstractC4212b;
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
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 }2\u00020\u00012\u00020\u0001:\u0001}B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010\u0018J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\u00020\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020\"01H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u0010\u0012J\u0019\u00106\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b6\u0010+J\u000f\u00107\u001a\u00020\u0010H\u0007¢\u0006\u0004\b7\u0010\u0012J%\u00108\u001a\u00020\u00102\f\u00102\u001a\b\u0012\u0004\u0012\u00020\"012\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\b\u0012\u0004\u0012\u00020\"01¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010@R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010G\u001a\u00020F8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010\u0012\u001a\u0004\bI\u0010JR \u0010M\u001a\u00020L8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bQ\u0010\u0012\u001a\u0004\bO\u0010PR\u001c\u0010S\u001a\n R*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR&\u0010Y\u001a\b\u0012\u0004\u0012\u00020\"0X8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bY\u0010Z\u0012\u0004\b\\\u0010\u0012\u001a\u0004\b[\u0010;R\"\u0010]\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010\u0012\u001a\u0004\b_\u0010`R(\u0010c\u001a\u00020b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bc\u0010d\u0012\u0004\bi\u0010\u0012\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR*\u0010j\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bj\u0010k\u0012\u0004\bo\u0010\u0012\u001a\u0004\bl\u0010m\"\u0004\bn\u0010+R(\u0010p\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bp\u0010q\u0012\u0004\bt\u0010\u0012\u001a\u0004\bp\u0010r\"\u0004\bs\u0010\u0018R(\u0010v\u001a\u00020u8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bv\u0010w\u0012\u0004\b|\u0010\u0012\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006~"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager;", "", "Landroid/content/Context;", "context", "", "apiKey", "Lbo/app/a9;", "brazeManager", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lbo/app/ue;", "serverConfigStorageProvider", "Lbo/app/m9;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbo/app/a9;Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/ue;Lbo/app/m9;)V", "", "initializeGeofences", "()V", "", "isGeofencesEnabledFromEnvironment", "(Landroid/content/Context;)Z", "reRegisterGeofences", "setUpGeofences", "(Z)V", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "tearDownGeofences", "(Landroid/app/PendingIntent;)V", "geofenceId", "Lcom/braze/enums/GeofenceTransitionType;", "geofenceTransitionType", "analyticsEnabledForGeofenceId", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)Z", "Lcom/braze/models/BrazeGeofence;", "getBrazeGeofenceForGeofenceId", "(Ljava/lang/String;)Lcom/braze/models/BrazeGeofence;", "transitionType", "postGeofenceReport", "(Ljava/lang/String;Lcom/braze/enums/GeofenceTransitionType;)V", "Lcom/braze/models/IBrazeLocation;", "location", "requestGeofenceRefresh", "(Lcom/braze/models/IBrazeLocation;)V", "ignoreRateLimit", "Lbo/app/re;", "serverConfig", "configureFromServerConfig", "(Lbo/app/re;)V", "", "geofenceList", "registerGeofences", "(Ljava/util/List;)V", "unregisterGeofences", "onLocationRequestComplete", "requestSingleLocationUpdateFromGooglePlay", "registerGeofencesWithGooglePlay", "(Ljava/util/List;Landroid/app/PendingIntent;)V", "retrieveBrazeGeofencesFromLocalStorage", "()Ljava/util/List;", "Lbo/app/a9;", "getBrazeManager", "()Lbo/app/a9;", "Lcom/braze/configuration/BrazeConfigurationProvider;", "Lbo/app/ue;", "Lcom/braze/storage/GeofenceDataStoreProvider;", "geofenceDataStoreProvider", "Lcom/braze/storage/GeofenceDataStoreProvider;", "getGeofenceDataStoreProvider", "()Lcom/braze/storage/GeofenceDataStoreProvider;", "Lbo/app/u1;", "brazeGeofenceApi", "Lbo/app/u1;", "getBrazeGeofenceApi", "()Lbo/app/u1;", "getBrazeGeofenceApi$annotations", "Lbo/app/a2;", "brazeLocationApi", "Lbo/app/a2;", "getBrazeLocationApi", "()Lbo/app/a2;", "getBrazeLocationApi$annotations", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "geofenceListLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "brazeGeofences", "Ljava/util/List;", "getBrazeGeofences", "getBrazeGeofences$annotations", "geofenceTransitionPendingIntent", "Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent", "()Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent$annotations", "Lbo/app/y1;", "brazeGeofenceReEligibilityManager", "Lbo/app/y1;", "getBrazeGeofenceReEligibilityManager", "()Lbo/app/y1;", "setBrazeGeofenceReEligibilityManager", "(Lbo/app/y1;)V", "getBrazeGeofenceReEligibilityManager$annotations", "geofenceRequestLocation", "Lcom/braze/models/IBrazeLocation;", "getGeofenceRequestLocation", "()Lcom/braze/models/IBrazeLocation;", "setGeofenceRequestLocation", "getGeofenceRequestLocation$annotations", "isGeofencesEnabled", "Z", "()Z", "setGeofencesEnabled", "isGeofencesEnabled$annotations", "", "maxNumToRegister", "I", "getMaxNumToRegister", "()I", "setMaxNumToRegister", "(I)V", "getMaxNumToRegister$annotations", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeGeofenceManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context applicationContext;
    private final u1 brazeGeofenceApi;
    private y1 brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final a2 brazeLocationApi;
    private final a9 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final GeofenceDataStoreProvider geofenceDataStoreProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final ue serverConfigStorageProvider;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager$Companion;", "", "<init>", "()V", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getGeofencesEnabledFromConfiguration", "(Lcom/braze/configuration/BrazeConfigurationProvider;)Z", "Lbo/app/ue;", "serverConfigStorageProvider", "getGeofencesEnabledFromServerConfig", "(Lbo/app/ue;)Z", "", "getMaxNumToRegister", "(Lbo/app/ue;)I", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public final boolean getGeofencesEnabledFromServerConfig(ue serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (!serverConfigStorageProvider.K()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: N3.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String geofencesEnabledFromServerConfig$lambda$2;
                        geofencesEnabledFromServerConfig$lambda$2 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$2();
                        return geofencesEnabledFromServerConfig$lambda$2;
                    }
                }, 6, (Object) null);
                return false;
            }
            if (serverConfigStorageProvider.J()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: N3.K
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String geofencesEnabledFromServerConfig$lambda$0;
                        geofencesEnabledFromServerConfig$lambda$0 = BrazeGeofenceManager.Companion.getGeofencesEnabledFromServerConfig$lambda$0();
                        return geofencesEnabledFromServerConfig$lambda$0;
                    }
                }, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: N3.L
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
        public final int getMaxNumToRegister(ue serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (serverConfigStorageProvider.r() > 0) {
                return serverConfigStorageProvider.r();
            }
            return 20;
        }

        private Companion() {
        }
    }

    public BrazeGeofenceManager(Context context, String apiKey, a9 brazeManager, BrazeConfigurationProvider configurationProvider, ue serverConfigStorageProvider, m9 internalIEventMessenger) {
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
        u1 u1Var = new u1(geofenceDataStoreProvider);
        this.brazeGeofenceApi = u1Var;
        this.brazeLocationApi = new a2(context, c2.f25308d.a(configurationProvider), configurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        this.brazeGeofences = CollectionsKt.toMutableList((Collection) retrieveBrazeGeofencesFromLocalStorage());
        Intrinsics.checkNotNullParameter(context, "context");
        IBrazeGeofenceApi iBrazeGeofenceApi = u1Var.f26096b;
        this.geofenceTransitionPendingIntent = iBrazeGeofenceApi != null ? iBrazeGeofenceApi.getGeofenceTransitionPendingIntent(context) : null;
        this.brazeGeofenceReEligibilityManager = new y1(serverConfigStorageProvider, internalIEventMessenger, geofenceDataStoreProvider);
        Companion companion = INSTANCE;
        this.isGeofencesEnabled = companion.getGeofencesEnabledFromServerConfig(serverConfigStorageProvider) && isGeofencesEnabledFromEnvironment(context) && u1Var.f26096b != null;
        this.maxNumToRegister = companion.getMaxNumToRegister(serverConfigStorageProvider);
        if (u1Var.f26096b == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: N3.F
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String _init_$lambda$0;
                    _init_$lambda$0 = BrazeGeofenceManager._init_$lambda$0();
                    return _init_$lambda$0;
                }
            }, 6, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: N3.G
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
    public static final String configureFromServerConfig$lambda$0(boolean z10) {
        return "Geofences enabled server config value " + z10 + " received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$1(BrazeGeofenceManager brazeGeofenceManager) {
        return "Geofences enabled status newly set to " + brazeGeofenceManager.isGeofencesEnabled + " during server config update.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$2(boolean z10) {
        return "Geofences enabled status of `" + z10 + "` was unchanged during server config update.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String configureFromServerConfig$lambda$3(BrazeGeofenceManager brazeGeofenceManager) {
        return "Max number to register newly set to " + brazeGeofenceManager.maxNumToRegister + " via server config.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$0() {
        return "Request to set up geofences received.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initializeGeofences$lambda$1() {
        return "Not automatically requesting Geofences on initialization due to configuration.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$0() {
        return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$1() {
        return "Fine grained location permissions not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$2() {
        return "Background location access permission not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$3() {
        return "Google Play Services not available. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$4() {
        return "Braze Geofence API is not available";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$5() {
        return "Google Play Services Location API not found. Geofences not enabled.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isGeofencesEnabledFromEnvironment$lambda$6() {
        return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$0(IBrazeLocation iBrazeLocation) {
        return "Single location request was successful, requesting Geofence refresh. Location:\n " + iBrazeLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLocationRequestComplete$lambda$1() {
        return "Single location request was unsuccessful, not storing last updated time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String postGeofenceReport$lambda$0() {
        return "Braze geofences not enabled. Not posting geofence report.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String postGeofenceReport$lambda$1(String str, GeofenceTransitionType geofenceTransitionType) {
        return "Failed to record geofence " + str + " transition with transition type " + geofenceTransitionType + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$0() {
        return "Braze geofences not enabled. Not adding new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$0(List list) {
        return "Received new geofence list of size: " + list.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$1(BrazeGeofenceManager brazeGeofenceManager) {
        return "Reached maximum number of new geofences: " + brazeGeofenceManager.maxNumToRegister;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$2(BrazeGeofence brazeGeofence) {
        return "Adding new geofence to local storage: " + brazeGeofence;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerGeofences$lambda$2$3(BrazeGeofenceManager brazeGeofenceManager) {
        return "Added " + brazeGeofenceManager.brazeGeofences.size() + " new geofences to local storage.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$0() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestGeofenceRefresh$lambda$2() {
        return "Braze geofences not enabled. Not requesting geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestSingleLocationUpdateFromGooglePlay$lambda$0(BrazeGeofenceManager brazeGeofenceManager, IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        brazeGeofenceManager.onLocationRequestComplete(location);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String retrieveBrazeGeofencesFromLocalStorage$lambda$0() {
        return "Did not find stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$0() {
        return "Braze geofences not enabled. Geofences not set up.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$1(boolean z10) {
        return "Setting up geofences in setUpGeofences with reRegisterGeofences: " + z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setUpGeofences$lambda$2() {
        return "Could not get pending intent to setup geofences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$0() {
        return "Tearing down geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$1() {
        return "Unregistering any Braze geofences from Google Play Services.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String tearDownGeofences$lambda$2$0() {
        return "Deleting locally stored geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$0() {
        return "Braze geofences not enabled. Not un-registering geofences.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterGeofences$lambda$1() {
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void configureFromServerConfig(re serverConfig) {
        final boolean z10;
        int i10;
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        final boolean z11 = serverConfig.f26009i;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String configureFromServerConfig$lambda$0;
                configureFromServerConfig$lambda$0 = BrazeGeofenceManager.configureFromServerConfig$lambda$0(z11);
                return configureFromServerConfig$lambda$0;
            }
        }, 7, (Object) null);
        if (z11) {
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext) && this.brazeGeofenceApi.f26096b != null) {
                z10 = true;
                if (z10 == this.isGeofencesEnabled) {
                    this.isGeofencesEnabled = z10;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: N3.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configureFromServerConfig$lambda$1;
                            configureFromServerConfig$lambda$1 = BrazeGeofenceManager.configureFromServerConfig$lambda$1(BrazeGeofenceManager.this);
                            return configureFromServerConfig$lambda$1;
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
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configureFromServerConfig$lambda$2;
                            configureFromServerConfig$lambda$2 = BrazeGeofenceManager.configureFromServerConfig$lambda$2(z10);
                            return configureFromServerConfig$lambda$2;
                        }
                    }, 7, (Object) null);
                }
                i10 = serverConfig.f26007g;
                if (i10 >= 0) {
                    this.maxNumToRegister = i10;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: N3.u
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String configureFromServerConfig$lambda$3;
                            configureFromServerConfig$lambda$3 = BrazeGeofenceManager.configureFromServerConfig$lambda$3(BrazeGeofenceManager.this);
                            return configureFromServerConfig$lambda$3;
                        }
                    }, 6, (Object) null);
                }
                this.brazeGeofenceReEligibilityManager.a(serverConfig);
            }
        }
        z10 = false;
        if (z10 == this.isGeofencesEnabled) {
        }
        i10 = serverConfig.f26007g;
        if (i10 >= 0) {
        }
        this.brazeGeofenceReEligibilityManager.a(serverConfig);
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
            BrazeGeofence brazeGeofence = (BrazeGeofence) obj;
            reentrantLock.unlock();
            return brazeGeofence;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final GeofenceDataStoreProvider getGeofenceDataStoreProvider() {
        return this.geofenceDataStoreProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initializeGeofences() {
        boolean z10;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String initializeGeofences$lambda$0;
                initializeGeofences$lambda$0 = BrazeGeofenceManager.initializeGeofences$lambda$0();
                return initializeGeofences$lambda$0;
            }
        }, 7, (Object) null);
        if (INSTANCE.getGeofencesEnabledFromServerConfig(this.serverConfigStorageProvider)) {
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext) && this.brazeGeofenceApi.f26096b != null) {
                z10 = true;
                this.isGeofencesEnabled = z10;
                if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String initializeGeofences$lambda$1;
                            initializeGeofences$lambda$1 = BrazeGeofenceManager.initializeGeofences$lambda$1();
                            return initializeGeofences$lambda$1;
                        }
                    }, 7, (Object) null);
                    return;
                } else {
                    requestGeofenceRefresh(true);
                    return;
                }
            }
        }
        z10 = false;
        this.isGeofencesEnabled = z10;
        if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
        }
    }

    public final boolean isGeofencesEnabledFromEnvironment(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!INSTANCE.getGeofencesEnabledFromConfiguration(this.configurationProvider)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$0;
                    isGeofencesEnabledFromEnvironment$lambda$0 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$0();
                    return isGeofencesEnabledFromEnvironment$lambda$0;
                }
            }, 7, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: N3.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$1;
                    isGeofencesEnabledFromEnvironment$lambda$1 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$1();
                    return isGeofencesEnabledFromEnvironment$lambda$1;
                }
            }, 6, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: N3.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$2;
                    isGeofencesEnabledFromEnvironment$lambda$2 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$2();
                    return isGeofencesEnabledFromEnvironment$lambda$2;
                }
            }, 6, (Object) null);
            return false;
        }
        if (!g.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$3;
                    isGeofencesEnabledFromEnvironment$lambda$3 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$3();
                    return isGeofencesEnabledFromEnvironment$lambda$3;
                }
            }, 7, (Object) null);
            return false;
        }
        if (this.brazeGeofenceApi.f26096b == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$4;
                    isGeofencesEnabledFromEnvironment$lambda$4 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$4();
                    return isGeofencesEnabledFromEnvironment$lambda$4;
                }
            }, 7, (Object) null);
            return false;
        }
        try {
            Class.forName("com.google.android.gms.location.LocationServices", false, BrazeGeofenceManager.class.getClassLoader());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$6;
                    isGeofencesEnabledFromEnvironment$lambda$6 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$6();
                    return isGeofencesEnabledFromEnvironment$lambda$6;
                }
            }, 7, (Object) null);
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String isGeofencesEnabledFromEnvironment$lambda$5;
                    isGeofencesEnabledFromEnvironment$lambda$5 = BrazeGeofenceManager.isGeofencesEnabledFromEnvironment$lambda$5();
                    return isGeofencesEnabledFromEnvironment$lambda$5;
                }
            }, 7, (Object) null);
            return false;
        }
    }

    public void onLocationRequestComplete(final IBrazeLocation location) {
        if (location == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.C
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onLocationRequestComplete$lambda$1;
                    onLocationRequestComplete$lambda$1 = BrazeGeofenceManager.onLocationRequestComplete$lambda$1();
                    return onLocationRequestComplete$lambda$1;
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onLocationRequestComplete$lambda$0;
                onLocationRequestComplete$lambda$0 = BrazeGeofenceManager.onLocationRequestComplete$lambda$0(IBrazeLocation.this);
                return onLocationRequestComplete$lambda$0;
            }
        }, 7, (Object) null);
        requestGeofenceRefresh(location);
        this.brazeGeofenceReEligibilityManager.b(DateTimeUtils.nowInSeconds());
    }

    public void postGeofenceReport(final String geofenceId, final GeofenceTransitionType transitionType) {
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: N3.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String postGeofenceReport$lambda$0;
                    postGeofenceReport$lambda$0 = BrazeGeofenceManager.postGeofenceReport$lambda$0();
                    return postGeofenceReport$lambda$0;
                }
            }, 6, (Object) null);
            return;
        }
        j1 j1Var = k1.f25630g;
        String obj = transitionType.toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        y8 g10 = j1Var.g(geofenceId, lowerCase);
        if (g10 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) null, false, new Function0() { // from class: N3.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String postGeofenceReport$lambda$1;
                    postGeofenceReport$lambda$1 = BrazeGeofenceManager.postGeofenceReport$lambda$1(geofenceId, transitionType);
                    return postGeofenceReport$lambda$1;
                }
            }, 6, (Object) null);
            return;
        }
        if (analyticsEnabledForGeofenceId(geofenceId, transitionType)) {
            ((e2) this.brazeManager).a(g10);
        }
        BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(geofenceId);
        if (brazeGeofenceForGeofenceId != null && this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds(), brazeGeofenceForGeofenceId, transitionType)) {
            ((e2) this.brazeManager).g(g10);
        }
    }

    public void registerGeofences(List<BrazeGeofence> geofenceList) {
        String str;
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        final List<BrazeGeofence> mutableList = CollectionsKt.toMutableList((Collection) geofenceList);
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: N3.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofences$lambda$0;
                    registerGeofences$lambda$0 = BrazeGeofenceManager.registerGeofences$lambda$0();
                    return registerGeofences$lambda$0;
                }
            }, 6, (Object) null);
            return;
        }
        if (this.geofenceRequestLocation != null) {
            for (BrazeGeofence brazeGeofence : mutableList) {
                IBrazeLocation iBrazeLocation = this.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    double d10 = iBrazeLocation.get_latitude();
                    double d11 = iBrazeLocation.get_longitude();
                    double latitude = brazeGeofence.getLatitude();
                    double longitude = brazeGeofence.getLongitude();
                    double radians = Math.toRadians(latitude - d10);
                    double radians2 = Math.toRadians(longitude - d11);
                    double d12 = 2;
                    brazeGeofence.setDistanceFromGeofenceRefresh(Math.asin(Math.sqrt((Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(d10)) * Math.pow(Math.sin(radians2 / d12), 2.0d)) + Math.pow(Math.sin(radians / d12), 2.0d))) * 1.2742E7d);
                }
            }
            CollectionsKt.sort(mutableList);
        }
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofences$lambda$2$0;
                    registerGeofences$lambda$2$0 = BrazeGeofenceManager.registerGeofences$lambda$2$0(mutableList);
                    return registerGeofences$lambda$2$0;
                }
            }, 7, (Object) null);
            this.geofenceDataStoreProvider.clearData(DataStoreKey.GEOFENCES);
            this.brazeGeofences.clear();
            Iterator it = mutableList.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                final BrazeGeofence brazeGeofence2 = (BrazeGeofence) it.next();
                if (i10 == this.maxNumToRegister) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerGeofences$lambda$2$1;
                            registerGeofences$lambda$2$1 = BrazeGeofenceManager.registerGeofences$lambda$2$1(BrazeGeofenceManager.this);
                            return registerGeofences$lambda$2$1;
                        }
                    }, 7, (Object) null);
                    break;
                } else {
                    this.brazeGeofences.add(brazeGeofence2);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String registerGeofences$lambda$2$2;
                            registerGeofences$lambda$2$2 = BrazeGeofenceManager.registerGeofences$lambda$2$2(BrazeGeofence.this);
                            return registerGeofences$lambda$2$2;
                        }
                    }, 7, (Object) null);
                    i10++;
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.A
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String registerGeofences$lambda$2$3;
                    registerGeofences$lambda$2$3 = BrazeGeofenceManager.registerGeofences$lambda$2$3(BrazeGeofenceManager.this);
                    return registerGeofences$lambda$2$3;
                }
            }, 7, (Object) null);
            GeofenceDataStoreProvider geofenceDataStoreProvider = this.geofenceDataStoreProvider;
            DataStoreKey dataStoreKey = DataStoreKey.GEOFENCES;
            List<BrazeGeofence> list = this.brazeGeofences;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                        aVar.a();
                        str = aVar.b(new C4087f(BrazeGeofence.Companion.serializer()), list);
                    } catch (Exception e10) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) DataStoreUtils.e.f29476a, 4, (Object) null);
                        str = (!(list instanceof Map) && (list instanceof List)) ? HttpUrl.PATH_SEGMENT_ENCODE_SET_URI : "{}";
                    }
                    geofenceDataStoreProvider.writeData(dataStoreKey, str);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.brazeGeofenceReEligibilityManager.a(mutableList);
            setUpGeofences(true);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        u1 u1Var = this.brazeGeofenceApi;
        Context context = this.applicationContext;
        Intrinsics.checkNotNullExpressionValue(context, "applicationContext");
        u1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        IBrazeGeofenceApi iBrazeGeofenceApi = u1Var.f26096b;
        if (iBrazeGeofenceApi != null) {
            iBrazeGeofenceApi.registerGeofences(context, geofenceList, geofenceRequestIntent, u1Var.f26095a);
        }
    }

    public void requestGeofenceRefresh(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofenceRefresh$lambda$0;
                    requestGeofenceRefresh$lambda$0 = BrazeGeofenceManager.requestGeofenceRefresh$lambda$0();
                    return requestGeofenceRefresh$lambda$0;
                }
            }, 7, (Object) null);
            return;
        }
        this.geofenceRequestLocation = location;
        if (location != null) {
            ((e2) this.brazeManager).a(location);
        }
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        a2 a2Var = this.brazeLocationApi;
        Function1<? super IBrazeLocation, Unit> locationUpdateCallback = new Function1() { // from class: N3.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit requestSingleLocationUpdateFromGooglePlay$lambda$0;
                requestSingleLocationUpdateFromGooglePlay$lambda$0 = BrazeGeofenceManager.requestSingleLocationUpdateFromGooglePlay$lambda$0(BrazeGeofenceManager.this, (IBrazeLocation) obj);
                return requestSingleLocationUpdateFromGooglePlay$lambda$0;
            }
        };
        a2Var.getClass();
        Intrinsics.checkNotNullParameter(locationUpdateCallback, "locationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = a2Var.f25242a;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
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
                    } else if (Intrinsics.areEqual(StringsKt.trim((CharSequence) str).toString(), "null")) {
                        emptyList = CollectionsKt.emptyList();
                    } else {
                        try {
                            AbstractC4212b.a aVar = AbstractC4212b.f46079d;
                            aVar.a();
                            emptyList = (List) aVar.d(new C4087f(BrazeGeofence.Companion.serializer()), str);
                        } catch (Exception e10) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.f29470E, (Throwable) e10, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                            emptyList = CollectionsKt.emptyList();
                        }
                    }
                    arrayList = CollectionsKt.toMutableList((Collection) emptyList);
                }
            } catch (Exception e11) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.f29470E, (Throwable) e11, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList<>();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String retrieveBrazeGeofencesFromLocalStorage$lambda$0;
                    retrieveBrazeGeofencesFromLocalStorage$lambda$0 = BrazeGeofenceManager.retrieveBrazeGeofencesFromLocalStorage$lambda$0();
                    return retrieveBrazeGeofencesFromLocalStorage$lambda$0;
                }
            }, 7, (Object) null);
        }
        return arrayList;
    }

    public final void setUpGeofences(final boolean reRegisterGeofences) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String upGeofences$lambda$0;
                    upGeofences$lambda$0 = BrazeGeofenceManager.setUpGeofences$lambda$0();
                    return upGeofences$lambda$0;
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: N3.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String upGeofences$lambda$1;
                upGeofences$lambda$1 = BrazeGeofenceManager.setUpGeofences$lambda$1(reRegisterGeofences);
                return upGeofences$lambda$1;
            }
        }, 6, (Object) null);
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String upGeofences$lambda$2;
                    upGeofences$lambda$2 = BrazeGeofenceManager.setUpGeofences$lambda$2();
                    return upGeofences$lambda$2;
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
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.H
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String tearDownGeofences$lambda$0;
                tearDownGeofences$lambda$0 = BrazeGeofenceManager.tearDownGeofences$lambda$0();
                return tearDownGeofences$lambda$0;
            }
        }, 7, (Object) null);
        if (geofenceRequestIntent != null) {
            brazeGeofenceManager = this;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.I
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String tearDownGeofences$lambda$1;
                    tearDownGeofences$lambda$1 = BrazeGeofenceManager.tearDownGeofences$lambda$1();
                    return tearDownGeofences$lambda$1;
                }
            }, 7, (Object) null);
            u1 u1Var = brazeGeofenceManager.brazeGeofenceApi;
            Context applicationContext = brazeGeofenceManager.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            u1Var.getClass();
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(geofenceRequestIntent, "intent");
            IBrazeGeofenceApi iBrazeGeofenceApi = u1Var.f26096b;
            if (iBrazeGeofenceApi != null) {
                iBrazeGeofenceApi.teardownGeofences(applicationContext, geofenceRequestIntent);
            }
        } else {
            brazeGeofenceManager = this;
        }
        ReentrantLock reentrantLock = brazeGeofenceManager.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.J
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String tearDownGeofences$lambda$2$0;
                    tearDownGeofences$lambda$2$0 = BrazeGeofenceManager.tearDownGeofences$lambda$2$0();
                    return tearDownGeofences$lambda$2$0;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.D
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterGeofences$lambda$0;
                    unregisterGeofences$lambda$0 = BrazeGeofenceManager.unregisterGeofences$lambda$0();
                    return unregisterGeofences$lambda$0;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unregisterGeofences$lambda$1;
                    unregisterGeofences$lambda$1 = BrazeGeofenceManager.unregisterGeofences$lambda$1();
                    return unregisterGeofences$lambda$1;
                }
            }, 7, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }

    public void requestGeofenceRefresh(boolean ignoreRateLimit) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: N3.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String requestGeofenceRefresh$lambda$2;
                    requestGeofenceRefresh$lambda$2 = BrazeGeofenceManager.requestGeofenceRefresh$lambda$2();
                    return requestGeofenceRefresh$lambda$2;
                }
            }, 7, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(ignoreRateLimit, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }
}
