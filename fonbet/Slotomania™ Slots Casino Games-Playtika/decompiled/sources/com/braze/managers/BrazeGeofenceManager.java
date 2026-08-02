package com.braze.managers;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import bo.app.h2;
import bo.app.i3;
import bo.app.i5;
import bo.app.j;
import bo.app.k5;
import bo.app.s1;
import bo.app.x1;
import bo.app.z1;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.GeofenceTransitionType;
import com.braze.models.BrazeGeofence;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001uB7\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010n\u001a\u00020\u000e\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010p\u001a\u00020o\u0012\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bs\u0010tJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0016\u0010 \u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001eH\u0016J\b\u0010!\u001a\u00020\u0003H\u0016J\u0012\u0010\"\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010#\u001a\u00020\u0003H\u0007J\u001e\u0010$\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0007R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\n (*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u0010/\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R&\u00106\u001a\b\u0012\u0004\u0012\u00020\u0013058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u00104\u001a\u0004\b8\u00109R\"\u0010;\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u00104\u001a\u0004\b=\u0010>R*\u0010@\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b@\u0010A\u0012\u0004\bF\u00104\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010G\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bG\u0010H\u0012\u0004\bL\u00104\u001a\u0004\bG\u0010I\"\u0004\bJ\u0010KR(\u0010N\u001a\u00020M8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010O\u0012\u0004\bT\u00104\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0017\u0010V\u001a\u00020U8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010[\u001a\u00020Z8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b[\u0010\\\u0012\u0004\b_\u00104\u001a\u0004\b]\u0010^R \u0010a\u001a\u00020`8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\ba\u0010b\u0012\u0004\be\u00104\u001a\u0004\bc\u0010dR(\u0010g\u001a\u00020f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bg\u0010h\u0012\u0004\bm\u00104\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006v"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager;", "", "Lcom/braze/managers/IBrazeGeofenceLocationUpdateListener;", "", "initializeGeofences", "Landroid/content/Context;", "context", "", "isGeofencesEnabledFromEnvironment", "reRegisterGeofences", "setUpGeofences", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "tearDownGeofences", "", "geofenceId", "Lcom/braze/enums/GeofenceTransitionType;", "geofenceTransitionType", "analyticsEnabledForGeofenceId", "Lcom/braze/models/BrazeGeofence;", "getBrazeGeofenceForGeofenceId", "transitionType", "postGeofenceReport", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "requestGeofenceRefresh", "ignoreRateLimit", "Lbo/app/i5;", "serverConfig", "configureFromServerConfig", "", "geofenceList", "registerGeofences", "unregisterGeofences", "onLocationRequestComplete", "requestSingleLocationUpdateFromGooglePlay", "registerGeofencesWithGooglePlay", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "geofenceListLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/content/SharedPreferences;", "geofenceStorageSharedPreferences", "Landroid/content/SharedPreferences;", "getGeofenceStorageSharedPreferences", "()Landroid/content/SharedPreferences;", "getGeofenceStorageSharedPreferences$annotations", "()V", "", "brazeGeofences", "Ljava/util/List;", "getBrazeGeofences", "()Ljava/util/List;", "getBrazeGeofences$annotations", "geofenceTransitionPendingIntent", "Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent", "()Landroid/app/PendingIntent;", "getGeofenceTransitionPendingIntent$annotations", "geofenceRequestLocation", "Lcom/braze/models/IBrazeLocation;", "getGeofenceRequestLocation", "()Lcom/braze/models/IBrazeLocation;", "setGeofenceRequestLocation", "(Lcom/braze/models/IBrazeLocation;)V", "getGeofenceRequestLocation$annotations", "isGeofencesEnabled", "Z", "()Z", "setGeofencesEnabled", "(Z)V", "isGeofencesEnabled$annotations", "", "maxNumToRegister", "I", "getMaxNumToRegister", "()I", "setMaxNumToRegister", "(I)V", "getMaxNumToRegister$annotations", "Lbo/app/z1;", "brazeManager", "Lbo/app/z1;", "getBrazeManager", "()Lbo/app/z1;", "Lbo/app/l;", "brazeGeofenceApi", "Lbo/app/l;", "getBrazeGeofenceApi", "()Lbo/app/l;", "getBrazeGeofenceApi$annotations", "Lbo/app/n;", "brazeLocationApi", "Lbo/app/n;", "getBrazeLocationApi", "()Lbo/app/n;", "getBrazeLocationApi$annotations", "Lbo/app/m;", "brazeGeofenceReEligibilityManager", "Lbo/app/m;", "getBrazeGeofenceReEligibilityManager", "()Lbo/app/m;", "setBrazeGeofenceReEligibilityManager", "(Lbo/app/m;)V", "getBrazeGeofenceReEligibilityManager$annotations", "apiKey", "Lbo/app/k5;", "serverConfigStorageProvider", "Lbo/app/h2;", "internalIEventMessenger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lbo/app/z1;Lcom/braze/configuration/BrazeConfigurationProvider;Lbo/app/k5;Lbo/app/h2;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class BrazeGeofenceManager implements IBrazeGeofenceLocationUpdateListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String GEOFENCE_STORAGE_SHARED_PREFS_LOCATION = "com.appboy.managers.geofences.storage";
    private final Context applicationContext;
    private final bo.app.l brazeGeofenceApi;
    private bo.app.m brazeGeofenceReEligibilityManager;
    private final List<BrazeGeofence> brazeGeofences;
    private final bo.app.n brazeLocationApi;
    private final z1 brazeManager;
    private final BrazeConfigurationProvider configurationProvider;
    private final ReentrantLock geofenceListLock;
    private IBrazeLocation geofenceRequestLocation;
    private final SharedPreferences geofenceStorageSharedPreferences;
    private final PendingIntent geofenceTransitionPendingIntent;
    private boolean isGeofencesEnabled;
    private int maxNumToRegister;
    private final k5 serverConfigStorageProvider;

    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/braze/managers/BrazeGeofenceManager$Companion;", "", "", "apiKey", "getGeofenceSharedPreferencesName", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getGeofencesEnabledFromConfiguration", "Lbo/app/k5;", "serverConfigStorageProvider", "getGeofencesEnabledFromServerConfig", "", "getMaxNumToRegister", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "Lcom/braze/models/BrazeGeofence;", "retrieveBrazeGeofencesFromLocalStorage", "GEOFENCE_STORAGE_SHARED_PREFS_LOCATION", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class a extends Lambda implements Function0<String> {
            public static final a b = new a();

            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Geofences enabled in server configuration.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<String> {
            public static final b b = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Geofences explicitly disabled via server configuration.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<String> {
            public static final c b = new c();

            c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Geofences implicitly disabled via server configuration.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class d extends Lambda implements Function0<String> {
            public static final d b = new d();

            d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Did not find stored geofences.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class e extends Lambda implements Function0<String> {
            public static final e b = new e();

            e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to find stored geofence keys.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class f extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Received null or blank serialized geofence string for geofence id " + this.b + " from shared preferences. Not parsing.";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class g extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Encountered Json exception while parsing stored geofence: ", this.b);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class h extends Lambda implements Function0<String> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return Intrinsics.stringPlus("Encountered unexpected exception while parsing stored geofence: ", this.b);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final String getGeofenceSharedPreferencesName(String apiKey) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            return Intrinsics.stringPlus("com.appboy.managers.geofences.storage.", apiKey);
        }

        @JvmStatic
        public final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider configurationProvider) {
            Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
            return configurationProvider.isGeofencesEnabled();
        }

        @JvmStatic
        public final boolean getGeofencesEnabledFromServerConfig(k5 serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (!serverConfigStorageProvider.u()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
                return false;
            }
            if (serverConfigStorageProvider.t()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, b.b, 2, (Object) null);
            return false;
        }

        @JvmStatic
        public final int getMaxNumToRegister(k5 serverConfigStorageProvider) {
            Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
            if (serverConfigStorageProvider.i() > 0) {
                return serverConfigStorageProvider.i();
            }
            return 20;
        }

        @JvmStatic
        public final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage(SharedPreferences sharedPreferences) {
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            ArrayList arrayList = new ArrayList();
            Map<String, ?> all = sharedPreferences.getAll();
            if (all == null || all.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
                return arrayList;
            }
            Set<String> keySet = all.keySet();
            if (keySet.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e.b, 2, (Object) null);
                return arrayList;
            }
            for (String str : keySet) {
                String string = sharedPreferences.getString(str, null);
                if (string != null) {
                    try {
                    } catch (JSONException e2) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new g(string));
                    } catch (Exception e3) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e3, new h(string));
                    }
                    if (!StringsKt.isBlank(string)) {
                        arrayList.add(new BrazeGeofence(new JSONObject(string)));
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new f(str), 2, (Object) null);
            }
            return arrayList;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "***Geofence API not found. Please include the android-sdk-location module***";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a0 extends Lambda implements Function0<String> {
        public static final a0 b = new a0();

        a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Geofences not set up.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofences enabled server config value " + this.b + " received.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b0 extends Lambda implements Function0<String> {
        public static final b0 b = new b0();

        b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not get pending intent to setup geofences";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofences enabled status newly set to " + BrazeGeofenceManager.this.getIsGeofencesEnabled() + " during server config update.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c0 extends Lambda implements Function0<String> {
        public static final c0 b = new c0();

        c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Tearing down geofences.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Geofences enabled status of `" + this.b + "` was unchanged during server config update.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d0 extends Lambda implements Function0<String> {
        public static final d0 b = new d0();

        d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unregistering any Braze geofences from Google Play Services.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Max number to register newly set to " + BrazeGeofenceManager.this.getMaxNumToRegister() + " via server config.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e0 extends Lambda implements Function0<String> {
        public static final e0 b = new e0();

        e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Deleting locally stored geofences.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Request to set up geofences received.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f0 extends Lambda implements Function0<String> {
        public static final f0 b = new f0();

        f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not un-registering geofences.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        public static final g b = new g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Not automatically requesting Geofences on initialization due to configuration.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g0 extends Lambda implements Function0<String> {
        public static final g0 b = new g0();

        g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Tearing down all geofences.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze Geofences disabled or Braze location collection disabled in local configuration. Geofences not enabled.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Fine grained location permissions not found. Geofences not enabled.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        public static final j b = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Background location access permission not found. Geofences not enabled.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        public static final k b = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Google Play Services not available. Geofences not enabled.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        public static final l b = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze Geofence API is not available";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        public static final m b = new m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Google Play Services Location API not found. Geofences not enabled.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        public static final n b = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Location permissions granted and Google Play Services available. Braze Geofencing enabled via config.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        final /* synthetic */ IBrazeLocation b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(IBrazeLocation iBrazeLocation) {
            super(0);
            this.b = iBrazeLocation;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Single location request was successful, requesting Geofence refresh. Location:\n ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        public static final p b = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Single location request was unsuccessful, not storing last updated time.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<String> {
        public static final q b = new q();

        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not posting geofence report.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ GeofenceTransitionType c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, GeofenceTransitionType geofenceTransitionType) {
            super(0);
            this.b = str;
            this.c = geofenceTransitionType;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to record geofence " + this.b + " transition with transition type " + this.c + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s extends Lambda implements Function0<String> {
        public static final s b = new s();

        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not adding new geofences to local storage.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t extends Lambda implements Function0<String> {
        final /* synthetic */ List<BrazeGeofence> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(List<BrazeGeofence> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Received new geofence list of size: ", Integer.valueOf(this.b.size()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u extends Lambda implements Function0<String> {
        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Reached maximum number of new geofences: ", Integer.valueOf(BrazeGeofenceManager.this.getMaxNumToRegister()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v extends Lambda implements Function0<String> {
        final /* synthetic */ BrazeGeofence b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(BrazeGeofence brazeGeofence) {
            super(0);
            this.b = brazeGeofence;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding new geofence to local storage: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class w extends Lambda implements Function0<String> {
        w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Added " + BrazeGeofenceManager.this.getBrazeGeofences().size() + " new geofences to local storage.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x extends Lambda implements Function0<String> {
        public static final x b = new x();

        x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class y extends Lambda implements Function0<String> {
        public static final y b = new y();

        y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Braze geofences not enabled. Not requesting geofences.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "", Constants.BRAZE_PUSH_CONTENT_KEY, "(Lcom/braze/models/IBrazeLocation;)V"}, k = 3, mv = {1, 6, 0})
    static final class z extends Lambda implements Function1<IBrazeLocation, Unit> {
        z() {
            super(1);
        }

        public final void a(IBrazeLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            BrazeGeofenceManager.this.onLocationRequestComplete(location);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IBrazeLocation iBrazeLocation) {
            a(iBrazeLocation);
            return Unit.INSTANCE;
        }
    }

    public BrazeGeofenceManager(Context context, String apiKey, z1 brazeManager, BrazeConfigurationProvider configurationProvider, k5 serverConfigStorageProvider, h2 internalIEventMessenger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalIEventMessenger, "internalIEventMessenger");
        this.brazeManager = brazeManager;
        this.configurationProvider = configurationProvider;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        bo.app.l lVar = new bo.app.l();
        this.brazeGeofenceApi = lVar;
        this.brazeLocationApi = new bo.app.n(context, bo.app.o.d.a(configurationProvider), configurationProvider);
        this.applicationContext = context.getApplicationContext();
        this.geofenceListLock = new ReentrantLock();
        Companion companion = INSTANCE;
        boolean z2 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(companion.getGeofenceSharedPreferencesName(apiKey), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ontext.MODE_PRIVATE\n    )");
        this.geofenceStorageSharedPreferences = sharedPreferences;
        this.brazeGeofences = CollectionsKt.toMutableList((Collection) companion.retrieveBrazeGeofencesFromLocalStorage(sharedPreferences));
        this.geofenceTransitionPendingIntent = lVar.b(context);
        this.brazeGeofenceReEligibilityManager = new bo.app.m(context, apiKey, serverConfigStorageProvider, internalIEventMessenger);
        if (companion.getGeofencesEnabledFromServerConfig(serverConfigStorageProvider) && isGeofencesEnabledFromEnvironment(context) && lVar.a()) {
            z2 = true;
        }
        this.isGeofencesEnabled = z2;
        this.maxNumToRegister = companion.getMaxNumToRegister(serverConfigStorageProvider);
        if (!lVar.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
        }
        setUpGeofences(true);
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

    @JvmStatic
    public static final String getGeofenceSharedPreferencesName(String str) {
        return INSTANCE.getGeofenceSharedPreferencesName(str);
    }

    public static /* synthetic */ void getGeofenceStorageSharedPreferences$annotations() {
    }

    public static /* synthetic */ void getGeofenceTransitionPendingIntent$annotations() {
    }

    @JvmStatic
    public static final boolean getGeofencesEnabledFromConfiguration(BrazeConfigurationProvider brazeConfigurationProvider) {
        return INSTANCE.getGeofencesEnabledFromConfiguration(brazeConfigurationProvider);
    }

    @JvmStatic
    public static final boolean getGeofencesEnabledFromServerConfig(k5 k5Var) {
        return INSTANCE.getGeofencesEnabledFromServerConfig(k5Var);
    }

    @JvmStatic
    public static final int getMaxNumToRegister(k5 k5Var) {
        return INSTANCE.getMaxNumToRegister(k5Var);
    }

    public static /* synthetic */ void getMaxNumToRegister$annotations() {
    }

    public static /* synthetic */ void isGeofencesEnabled$annotations() {
    }

    @JvmStatic
    public static final List<BrazeGeofence> retrieveBrazeGeofencesFromLocalStorage(SharedPreferences sharedPreferences) {
        return INSTANCE.retrieveBrazeGeofencesFromLocalStorage(sharedPreferences);
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void configureFromServerConfig(i5 serverConfig) {
        boolean z2;
        int g2;
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        boolean i2 = serverConfig.getI();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new b(i2), 3, (Object) null);
        if (i2) {
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext) && this.brazeGeofenceApi.a()) {
                z2 = true;
                if (z2 == this.isGeofencesEnabled) {
                    this.isGeofencesEnabled = z2;
                    BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new c(), 2, (Object) null);
                    if (this.isGeofencesEnabled) {
                        setUpGeofences(false);
                        if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                            requestGeofenceRefresh(true);
                        }
                    } else {
                        tearDownGeofences(this.geofenceTransitionPendingIntent);
                    }
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new d(z2), 3, (Object) null);
                }
                g2 = serverConfig.getG();
                if (g2 >= 0) {
                    this.maxNumToRegister = g2;
                    BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new e(), 2, (Object) null);
                }
                this.brazeGeofenceReEligibilityManager.a(serverConfig);
            }
        }
        z2 = false;
        if (z2 == this.isGeofencesEnabled) {
        }
        g2 = serverConfig.getG();
        if (g2 >= 0) {
        }
        this.brazeGeofenceReEligibilityManager.a(serverConfig);
    }

    public final bo.app.l getBrazeGeofenceApi() {
        return this.brazeGeofenceApi;
    }

    public final BrazeGeofence getBrazeGeofenceForGeofenceId(String geofenceId) {
        Object obj;
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        ReentrantLock reentrantLock = this.geofenceListLock;
        reentrantLock.lock();
        try {
            Iterator<T> it = getBrazeGeofences().iterator();
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

    public final bo.app.m getBrazeGeofenceReEligibilityManager() {
        return this.brazeGeofenceReEligibilityManager;
    }

    public final List<BrazeGeofence> getBrazeGeofences() {
        return this.brazeGeofences;
    }

    public final bo.app.n getBrazeLocationApi() {
        return this.brazeLocationApi;
    }

    public final z1 getBrazeManager() {
        return this.brazeManager;
    }

    public final IBrazeLocation getGeofenceRequestLocation() {
        return this.geofenceRequestLocation;
    }

    public final SharedPreferences getGeofenceStorageSharedPreferences() {
        return this.geofenceStorageSharedPreferences;
    }

    public final PendingIntent getGeofenceTransitionPendingIntent() {
        return this.geofenceTransitionPendingIntent;
    }

    public final int getMaxNumToRegister() {
        return this.maxNumToRegister;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initializeGeofences() {
        boolean z2;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, f.b, 3, (Object) null);
        if (INSTANCE.getGeofencesEnabledFromServerConfig(this.serverConfigStorageProvider)) {
            Context applicationContext = this.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            if (isGeofencesEnabledFromEnvironment(applicationContext) && this.brazeGeofenceApi.a()) {
                z2 = true;
                this.isGeofencesEnabled = z2;
                if (this.configurationProvider.isAutomaticGeofenceRequestsEnabled()) {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, g.b, 3, (Object) null);
                    return;
                } else {
                    requestGeofenceRefresh(true);
                    return;
                }
            }
        }
        z2 = false;
        this.isGeofencesEnabled = z2;
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
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
            return false;
        }
        if (!PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, i.b, 2, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && !PermissionUtils.hasPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, j.b, 2, (Object) null);
            return false;
        }
        if (!s1.a(context)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, k.b, 3, (Object) null);
            return false;
        }
        if (!this.brazeGeofenceApi.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, l.b, 3, (Object) null);
            return false;
        }
        try {
            Class.forName("com.google.android.gms.location.LocationServices", false, BrazeGeofenceManager.class.getClassLoader());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.b, 3, (Object) null);
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, m.b, 3, (Object) null);
            return false;
        }
    }

    @Override // com.braze.managers.IBrazeGeofenceLocationUpdateListener
    public void onLocationRequestComplete(IBrazeLocation location) {
        if (location == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, p.b, 3, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new o(location), 3, (Object) null);
        requestGeofenceRefresh(location);
        this.brazeGeofenceReEligibilityManager.a(DateTimeUtils.nowInSeconds());
    }

    public void postGeofenceReport(String geofenceId, GeofenceTransitionType transitionType) {
        Unit unit;
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, q.b, 2, (Object) null);
            return;
        }
        j.a aVar = bo.app.j.h;
        String str = transitionType.toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        x1 c2 = aVar.c(geofenceId, lowerCase);
        if (c2 == null) {
            unit = null;
        } else {
            if (analyticsEnabledForGeofenceId(geofenceId, transitionType)) {
                getBrazeManager().a(c2);
            }
            BrazeGeofence brazeGeofenceForGeofenceId = getBrazeGeofenceForGeofenceId(geofenceId);
            if (brazeGeofenceForGeofenceId != null && getBrazeGeofenceReEligibilityManager().a(DateTimeUtils.nowInSeconds(), brazeGeofenceForGeofenceId, transitionType)) {
                getBrazeManager().b(c2);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.E, (Throwable) null, new r(geofenceId, transitionType), 2, (Object) null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        com.braze.support.BrazeLogger.brazelog$default(com.braze.support.BrazeLogger.INSTANCE, r1, (com.braze.support.BrazeLogger.Priority) null, (java.lang.Throwable) null, new com.braze.managers.BrazeGeofenceManager.u(r1), 3, (java.lang.Object) null);
        r1 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void registerGeofences(List<BrazeGeofence> geofenceList) {
        SharedPreferences.Editor edit;
        Iterator<BrazeGeofence> it;
        int i2;
        BrazeGeofenceManager brazeGeofenceManager = this;
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        List<BrazeGeofence> mutableList = CollectionsKt.toMutableList((Collection) geofenceList);
        if (!brazeGeofenceManager.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeGeofenceManager, BrazeLogger.Priority.W, (Throwable) null, s.b, 2, (Object) null);
            return;
        }
        if (brazeGeofenceManager.geofenceRequestLocation != null) {
            for (BrazeGeofence brazeGeofence : mutableList) {
                IBrazeLocation iBrazeLocation = brazeGeofenceManager.geofenceRequestLocation;
                if (iBrazeLocation != null) {
                    brazeGeofence.setDistanceFromGeofenceRefresh(i3.a(iBrazeLocation.getLatitude(), iBrazeLocation.getLongitude(), brazeGeofence.getLatitude(), brazeGeofence.getLongitude()));
                }
            }
            CollectionsKt.sort(mutableList);
        }
        ReentrantLock reentrantLock = brazeGeofenceManager.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, new t(mutableList), 3, (Object) null);
            edit = brazeGeofenceManager.getGeofenceStorageSharedPreferences().edit();
            edit.clear();
            brazeGeofenceManager.getBrazeGeofences().clear();
            it = mutableList.iterator();
            i2 = 0;
        } catch (Throwable th) {
            th = th;
        }
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BrazeGeofence next = it.next();
            if (i2 == brazeGeofenceManager.getMaxNumToRegister()) {
                break;
            }
            try {
                getBrazeGeofences().add(next);
                brazeGeofenceManager = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, new v(next), 3, (Object) null);
                edit.putString(next.getId(), next.getKey().toString());
                i2++;
            } catch (Throwable th2) {
                th = th2;
            }
            th = th2;
            reentrantLock.unlock();
            throw th;
        }
        edit.apply();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, brazeGeofenceManager.new w(), 3, (Object) null);
        Unit unit = Unit.INSTANCE;
        reentrantLock.unlock();
        brazeGeofenceManager.brazeGeofenceReEligibilityManager.a(mutableList);
        brazeGeofenceManager.setUpGeofences(true);
    }

    public final void registerGeofencesWithGooglePlay(List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        bo.app.l lVar = this.brazeGeofenceApi;
        Context applicationContext = this.applicationContext;
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        lVar.a(applicationContext, geofenceList, geofenceRequestIntent);
    }

    public void requestGeofenceRefresh(IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, x.b, 3, (Object) null);
            return;
        }
        this.geofenceRequestLocation = location;
        if (location == null) {
            return;
        }
        getBrazeManager().a(location);
    }

    public final void requestSingleLocationUpdateFromGooglePlay() {
        this.brazeLocationApi.a(new z());
    }

    public final void setBrazeGeofenceReEligibilityManager(bo.app.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<set-?>");
        this.brazeGeofenceReEligibilityManager = mVar;
    }

    public final void setGeofenceRequestLocation(IBrazeLocation iBrazeLocation) {
        this.geofenceRequestLocation = iBrazeLocation;
    }

    public final void setGeofencesEnabled(boolean z2) {
        this.isGeofencesEnabled = z2;
    }

    public final void setMaxNumToRegister(int i2) {
        this.maxNumToRegister = i2;
    }

    public final void setUpGeofences(boolean reRegisterGeofences) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, a0.b, 3, (Object) null);
            return;
        }
        PendingIntent pendingIntent = this.geofenceTransitionPendingIntent;
        if (pendingIntent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b0.b, 3, (Object) null);
            return;
        }
        if (reRegisterGeofences) {
            ReentrantLock reentrantLock = this.geofenceListLock;
            reentrantLock.lock();
            try {
                registerGeofencesWithGooglePlay(getBrazeGeofences(), pendingIntent);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void tearDownGeofences(PendingIntent geofenceRequestIntent) {
        BrazeGeofenceManager brazeGeofenceManager;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, c0.b, 3, (Object) null);
        if (geofenceRequestIntent != null) {
            brazeGeofenceManager = this;
            BrazeLogger.brazelog$default(brazeLogger, brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, d0.b, 3, (Object) null);
            bo.app.l lVar = brazeGeofenceManager.brazeGeofenceApi;
            Context applicationContext = brazeGeofenceManager.applicationContext;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            lVar.a(applicationContext, geofenceRequestIntent);
        } else {
            brazeGeofenceManager = this;
        }
        ReentrantLock reentrantLock = brazeGeofenceManager.geofenceListLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(brazeLogger, brazeGeofenceManager, (BrazeLogger.Priority) null, (Throwable) null, e0.b, 3, (Object) null);
            getGeofenceStorageSharedPreferences().edit().clear().apply();
            getBrazeGeofences().clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterGeofences() {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f0.b, 3, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, g0.b, 3, (Object) null);
            tearDownGeofences(this.geofenceTransitionPendingIntent);
        }
    }

    public void requestGeofenceRefresh(boolean ignoreRateLimit) {
        if (!this.isGeofencesEnabled) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, y.b, 3, (Object) null);
        } else if (this.brazeGeofenceReEligibilityManager.a(ignoreRateLimit, DateTimeUtils.nowInSeconds())) {
            requestSingleLocationUpdateFromGooglePlay();
        }
    }
}
