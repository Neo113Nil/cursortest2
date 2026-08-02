package ru.ozon.app.android.push.di.module;

import Cm.e;
import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import We.B;
import We.C4871m;
import We.C4876s;
import We.InterfaceC4875q;
import Yg0.a;
import Zg0.a;
import Zg0.c;
import Zg0.d;
import Zg0.e;
import Zg0.g;
import Zg0.h;
import Zg0.i;
import android.app.Application;
import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.n;
import gh0.C6737c;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.h;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.NetworkBaseTimeoutSec;
import ru.ozon.app.android.network.interceptors.CustomHeadersInterceptor;
import ru.ozon.app.android.push.R$string;
import ru.ozon.app.android.push.di.PushComponentConfig;
import ru.ozon.app.android.push.flags.ClearAppNotificationsAfterUpdateFlag;
import ru.ozon.app.android.push.flags.HandleOnlyOzonPushMessagesFlag;
import ru.ozon.app.android.push.flags.LogNonOzonPushMessagesDeliveriesFlag;
import ru.ozon.app.android.push.flags.PushDeliveryStatusFallbackSenderFlag;
import ru.ozon.app.android.push.flags.PushIncorrectHwIdsMigrationsLogging;
import ru.ozon.app.android.push.flags.PushLogHwIdFlag;
import ru.ozon.app.android.push.flags.PushLogHwIdsNoMigrationSendEventsFlag;
import ru.ozon.app.android.push.flags.PushLogHwIdsSuccessfulMigrationsFlag;
import ru.ozon.app.android.push.flags.PushLogLevelFlag;
import ru.ozon.app.android.push.flags.RuStorePushSdkFlag;
import ru.ozon.app.android.push.flags.TestAbFlakinessFlag;
import ru.ozon.app.android.push.flags.TrackOnDeletedMessagesCallsFlag;
import ru.ozon.app.android.push.flags.TrackPushProvidersFlag;
import ru.ozon.app.android.push.flags.TrackUndisplayedPushesFlag;
import ru.ozon.app.android.push.handlers.PartPaymentPushHandler;
import ru.ozon.app.android.push.providers.TeensModeProviderImpl;
import ru.ozon.app.android.storage.device.ApplicationInfoDataSource;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import sj.a;
import sj.d;
import ve.EnumC10311b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/push/di/module/OzonPushModule;", "", "Companion", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class OzonPushModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Companion.Migration MIGRATION = new Companion.Migration(0, 1);

    @NotNull
    private static final String[] CHANNEL_IDS = {"OzonMessagingService"};

    @NotNull
    private static final InterfaceC4008j<d> ozonLogger$delegate = k.b(OzonPushModule$Companion$ozonLogger$2.INSTANCE);

    @Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001OB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010(\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b(\u0010)J'\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b0\u00101J\u001d\u00106\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b6\u00107J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00070L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006P"}, d2 = {"Lru/ozon/app/android/push/di/module/OzonPushModule$Companion;", "", "<init>", "()V", "Landroidx/core/app/n;", "notificationManager", "", "", "runMigration", "(Landroidx/core/app/n;)Ljava/util/List;", "Lru/ozon/app/android/utils/AppType;", "appType", "LZg0/i;", "getRuStorePushConfig", "(Lru/ozon/app/android/utils/AppType;)LZg0/i;", "Lru/ozon/app/android/push/di/PushComponentConfig;", "config", "LWe/q;", "cookieJar", "LWe/B;", "mainInterceptors", "LWe/m;", "connectionPool", "LWe/s;", "dispatcher", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "LZg0/e;", "provideNetworkClientConfiguration", "(Lru/ozon/app/android/push/di/PushComponentConfig;LWe/q;Ljava/util/List;LWe/m;LWe/s;Lru/ozon/app/android/network/abtool/FeatureService;)LZg0/e;", "Landroid/content/Context;", "context", "networkClientConfig", "Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;", "applicationInfoDataSource", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LLd0/c;", "diStore", "LZg0/g;", "providePushConfiguration", "(Landroid/content/Context;Lru/ozon/app/android/push/di/PushComponentConfig;LZg0/e;Lru/ozon/app/android/storage/device/ApplicationInfoDataSource;Landroidx/core/app/n;Lru/ozon/app/android/network/abtool/FeatureChecker;LLd0/c;)LZg0/g;", "Landroid/app/Application;", "application", "configuration", "LZg0/d;", "logConfiguration", "LYg0/a;", "provideOzonPush", "(Landroid/app/Application;LZg0/g;LZg0/d;)LYg0/a;", "Lru/ozon/app/android/push/handlers/PartPaymentPushHandler;", "partPaymentPushHandler", "", "Leh0/b;", "providePostShowingPushNotificationHandlers", "(Lru/ozon/app/android/push/handlers/PartPaymentPushHandler;)Ljava/util/Set;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "LYg0/g;", "provideTeensModeProvider", "(Lru/ozon/app/android/storage/teensMode/TeensModeStorage;)LYg0/g;", "provideNotificationManager", "(Landroid/content/Context;)Landroidx/core/app/n;", "provideLogConfiguration", "(Lru/ozon/app/android/network/abtool/FeatureService;)LZg0/d;", "Lsj/d;", "ozonLogger$delegate", "LSc/j;", "getOzonLogger", "()Lsj/d;", "ozonLogger", "CHANNEL_ID", "Ljava/lang/String;", "Lru/ozon/app/android/push/di/module/OzonPushModule$Companion$Migration;", "MIGRATION", "Lru/ozon/app/android/push/di/module/OzonPushModule$Companion$Migration;", "", "CHANNEL_IDS", "[Ljava/lang/String;", "Migration", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/push/di/module/OzonPushModule$Companion$Migration;", "", "", "old", "new", "<init>", "(II)V", "component1", "()I", "component2", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOld", "getNew", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final /* data */ class Migration {
            private final int new;
            private final int old;

            public Migration(int i11, int i12) {
                this.old = i11;
                this.new = i12;
            }

            /* renamed from: component1, reason: from getter */
            public final int getOld() {
                return this.old;
            }

            /* renamed from: component2, reason: from getter */
            public final int getNew() {
                return this.new;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Migration)) {
                    return false;
                }
                Migration migration = (Migration) other;
                return this.old == migration.old && this.new == migration.new;
            }

            public int hashCode() {
                return Integer.hashCode(this.new) + (Integer.hashCode(this.old) * 31);
            }

            @NotNull
            public String toString() {
                return e.c("Migration(old=", this.old, ", new=", ")", this.new);
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AppType.values().length];
                try {
                    iArr[AppType.FRESH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AppType.SELECT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AppType.TRAVEL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final d getOzonLogger() {
            return (d) OzonPushModule.ozonLogger$delegate.getValue();
        }

        private final i getRuStorePushConfig(AppType appType) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[appType.ordinal()];
            return new i.b(i11 != 1 ? i11 != 2 ? i11 != 3 ? "U1sTeUbN-453KVGSY2lwLKRnBUv9U58X" : "06Oz5KBHElKr3bTtNBrWIOh09xiaoe-k" : "NS51qS7DdDkIWZCiN2ZDY53GPAqUQkkT" : "05EgMhDhPyXgk26aqb29npcelnVthp7c");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h providePushConfiguration$lambda$1() {
            return OzonPushModule.INSTANCE.getOzonLogger();
        }

        private final List<String> runMigration(n notificationManager) {
            String[] strArr = OzonPushModule.CHANNEL_IDS;
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                Migration migration = OzonPushModule.MIGRATION;
                int old = migration.getOld();
                int i11 = migration.getNew();
                notificationManager.d(old == 0 ? str : str + old);
                arrayList.add(str + i11);
            }
            return arrayList;
        }

        @NotNull
        public final Zg0.d provideLogConfiguration(@NotNull FeatureService featureService) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            Zg0.d bVar = (buildUtils.isQaFlavor() || buildUtils.isDebug()) ? new d.b(0) : d.a.f35927a;
            sj.d dVar = null;
            try {
                dVar = sj.e.f98817f.q(new a("Frameworks", "OzonPush", featureService.getIntKey(PushLogLevelFlag.INSTANCE) > 0 ? Boolean.FALSE : null));
            } catch (IllegalStateException e11) {
                a.b bVar2 = Lm0.a.f17149a;
                bVar2.b("OzonPush");
                bVar2.e("Failed to create logger for push", e11);
            }
            return new d.c(bVar, dVar);
        }

        @NotNull
        public final Zg0.e provideNetworkClientConfiguration(@NotNull PushComponentConfig config, @NotNull InterfaceC4875q cookieJar, @NotNull List<B> mainInterceptors, @NotNull C4871m connectionPool, @NotNull C4876s dispatcher, @NotNull FeatureService featureService) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            Intrinsics.checkNotNullParameter(mainInterceptors, "mainInterceptors");
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            b.Companion companion = b.INSTANCE;
            long h11 = c.h(featureService.getLongKey(NetworkBaseTimeoutSec.INSTANCE), EnumC10311b.SECONDS);
            return new Zg0.e(config.getAppDomain(), new e.a.C0681a(N.b(CustomHeadersInterceptor.class)), e.b.a.f35940a, new e.d(h11, h11, h11, h11), cookieJar, new e.c(mainInterceptors, 2), connectionPool, dispatcher);
        }

        @NotNull
        public final n provideNotificationManager(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            n e11 = n.e(context);
            Intrinsics.checkNotNullExpressionValue(e11, "from(...)");
            return e11;
        }

        @NotNull
        public final Yg0.a provideOzonPush(@NotNull Application application, @NotNull g configuration, @NotNull Zg0.d logConfiguration) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(logConfiguration, "logConfiguration");
            a.C0652a c0652a = Yg0.a.f35038y;
            Sh0.a compositeProvider = new Sh0.a(application);
            Intrinsics.checkNotNullParameter(compositeProvider, "compositeProvider");
            return c0652a.c(application, configuration, new C6737c(compositeProvider.a()), logConfiguration);
        }

        @NotNull
        public final Set<eh0.b> providePostShowingPushNotificationHandlers(@NotNull PartPaymentPushHandler partPaymentPushHandler) {
            Intrinsics.checkNotNullParameter(partPaymentPushHandler, "partPaymentPushHandler");
            return e0.h(partPaymentPushHandler);
        }

        @NotNull
        public final g providePushConfiguration(@NotNull Context context, @NotNull PushComponentConfig config, @NotNull Zg0.e networkClientConfig, @NotNull ApplicationInfoDataSource applicationInfoDataSource, @NotNull n notificationManager, @NotNull FeatureChecker featureChecker, @NotNull Ld0.c diStore) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(networkClientConfig, "networkClientConfig");
            Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
            Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
            Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
            Intrinsics.checkNotNullParameter(diStore, "diStore");
            List<NotificationChannel> i11 = notificationManager.i();
            Intrinsics.checkNotNullExpressionValue(i11, "getNotificationChannels(...)");
            for (NotificationChannel notificationChannel : i11) {
                if (!C7705l.m(OzonPushModule.CHANNEL_IDS, notificationChannel.getId())) {
                    notificationManager.d(notificationChannel.getId());
                }
            }
            List<String> runMigration = runMigration(notificationManager);
            a.C0680a c0680a = new a.C0680a(applicationInfoDataSource.getUniqueApplicationId());
            Zg0.a bVar = featureChecker.isEnabled(PushLogHwIdFlag.INSTANCE) ? new a.b(c0680a, new OF.a()) : c0680a;
            if (!featureChecker.isEnabled(TestAbFlakinessFlag.INSTANCE)) {
                h.a.d(getOzonLogger(), ru.ozon.android.ozonLogger.core.c.ERROR, "The value of TestAbFlakinessFlag is false.", null, Boolean.FALSE, 4);
            }
            String appName = config.getAppName();
            String appBuildType = config.getAppBuildType();
            int appIcon = config.getAppIcon();
            String str = runMigration.get(0);
            String string = context.getString(R$string.push_ozon_push_channel_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            List a02 = C7714v.a0(new Zg0.h(str, string, h.a.IMPORTANCE_HIGH));
            i ruStorePushConfig = featureChecker.isEnabled(RuStorePushSdkFlag.INSTANCE) ? getRuStorePushConfig(config.getAppType()) : i.a.f35965a;
            boolean isEnabled = featureChecker.isEnabled(PushIncorrectHwIdsMigrationsLogging.INSTANCE);
            c.a aVar = new c.a();
            aVar.c(featureChecker.isEnabled(HandleOnlyOzonPushMessagesFlag.INSTANCE));
            aVar.f(featureChecker.isEnabled(LogNonOzonPushMessagesDeliveriesFlag.INSTANCE));
            aVar.g(featureChecker.isEnabled(PushDeliveryStatusFallbackSenderFlag.INSTANCE));
            aVar.e(featureChecker.isEnabled(PushLogHwIdsSuccessfulMigrationsFlag.INSTANCE));
            aVar.d(featureChecker.isEnabled(PushLogHwIdsNoMigrationSendEventsFlag.INSTANCE));
            aVar.b(featureChecker.isEnabled(ClearAppNotificationsAfterUpdateFlag.INSTANCE));
            aVar.i(featureChecker.isEnabled(TrackPushProvidersFlag.INSTANCE));
            aVar.h(featureChecker.isEnabled(TrackOnDeletedMessagesCallsFlag.INSTANCE));
            aVar.j(featureChecker.isEnabled(TrackUndisplayedPushesFlag.INSTANCE));
            return new g(appName, appBuildType, bVar, appIcon, a02, networkClientConfig, ruStorePushConfig, isEnabled, aVar.a(), diStore);
        }

        @NotNull
        public final Yg0.g provideTeensModeProvider(@NotNull TeensModeStorage teensModeStorage) {
            Intrinsics.checkNotNullParameter(teensModeStorage, "teensModeStorage");
            return new TeensModeProviderImpl(teensModeStorage);
        }

        private Companion() {
        }
    }
}
