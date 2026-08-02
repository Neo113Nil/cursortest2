package io.intercom.android.sdk;

import android.app.Application;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.intercom.twig.Twig;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.IntercomContent;
import io.intercom.android.sdk.IntercomPushManager;
import io.intercom.android.sdk.activities.IntercomCarouselActivity;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.api.UserUpdateRequest;
import io.intercom.android.sdk.api.UserUpdater;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.helpcenter.api.CollectionContentRequestCallback;
import io.intercom.android.sdk.helpcenter.api.CollectionRequestCallback;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApiWrapper;
import io.intercom.android.sdk.helpcenter.api.SearchRequestCallback;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.FeatureFlag;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.UnreadCountTracker;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.overlay.LauncherOpenBehaviour;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.survey.ui.IntercomSurveyActivity;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.ActivityFinisher;
import io.intercom.android.sdk.utilities.AttributeSanitiser;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.ValidatorUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Intercom.kt */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0084\u00012\u00020\u0001:\u0006\u0082\u0001\u0083\u0001\u0084\u0001B\u0099\u0001\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(H\u0007J\u000e\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+J\b\u0010,\u001a\u00020&H\u0007J\u0010\u0010-\u001a\u00020&2\b\b\u0002\u0010.\u001a\u00020/J\u0012\u00100\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u000102H\u0007J\u0018\u00103\u001a\u00020&2\u0006\u00101\u001a\u0002022\b\b\u0002\u0010.\u001a\u00020/J\u0018\u00104\u001a\u00020&2\u0006\u00101\u001a\u0002022\u0006\u0010.\u001a\u00020/H\u0002J\u0006\u00105\u001a\u00020$J\b\u00106\u001a\u0004\u0018\u000102J\b\u00107\u001a\u00020&H\u0002J\u000e\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020:J\u000e\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020:J\u001e\u0010=\u001a\u00020&2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\b\b\u0002\u0010.\u001a\u00020/J\u0012\u0010A\u001a\u00020&2\b\u0010B\u001a\u0004\u0018\u00010CH\u0007J\u0018\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010.\u001a\u00020/J&\u0010D\u001a\u00020&2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0006\u0012\u0004\u0018\u00010\u00010E2\u0006\u0010.\u001a\u00020/H\u0002J\u000e\u0010F\u001a\u00020&2\u0006\u0010G\u001a\u00020:J$\u0010F\u001a\u00020&2\b\u0010G\u001a\u0004\u0018\u00010:2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0002\b\u0003\u0018\u00010EJ$\u0010I\u001a\u00020&2\b\u0010G\u001a\u0004\u0018\u00010:2\u0010\u0010J\u001a\f\u0012\u0004\u0012\u00020:\u0012\u0002\b\u00030EH\u0002J\b\u0010K\u001a\u00020&H\u0007J\u0006\u0010L\u001a\u00020&J\u0010\u0010L\u001a\u00020&2\b\u0010M\u001a\u0004\u0018\u00010:J\b\u0010N\u001a\u00020$H\u0002J\u0010\u0010O\u001a\u00020&2\u0006\u0010P\u001a\u00020:H\u0002J\b\u0010Q\u001a\u00020&H\u0007J\b\u0010R\u001a\u00020&H\u0007J\u001a\u0010S\u001a\u00020&2\u0010\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010:\u0018\u00010?H\u0007J\u0012\u0010U\u001a\u00020&2\b\u0010V\u001a\u0004\u0018\u00010:H\u0007J\u0010\u0010W\u001a\u00020&2\u0006\u0010X\u001a\u00020:H\u0007J\u000e\u0010Y\u001a\u00020&2\u0006\u0010Z\u001a\u00020[J\u0010\u0010\\\u001a\u00020&2\b\u0010]\u001a\u0004\u0018\u00010^J\u0010\u0010_\u001a\u00020&2\b\u0010]\u001a\u0004\u0018\u00010^J\u0010\u0010`\u001a\u00020&2\b\u0010a\u001a\u0004\u0018\u00010bJ\u0006\u0010c\u001a\u00020&J\b\u0010d\u001a\u00020&H\u0007J\u0012\u0010d\u001a\u00020&2\b\u0010e\u001a\u0004\u0018\u00010fH\u0007J\u001c\u0010g\u001a\u00020&2\b\u0010h\u001a\u0004\u0018\u00010:2\b\u0010e\u001a\u0004\u0018\u00010fH\u0002J\b\u0010i\u001a\u00020&H\u0007J\u0006\u0010j\u001a\u00020&J\u000e\u0010n\u001a\u00020&2\u0006\u0010o\u001a\u00020pJ\u0010\u0010q\u001a\u00020&2\b\u0010o\u001a\u0004\u0018\u00010pJ\u0010\u0010r\u001a\u00020&2\u0006\u0010s\u001a\u00020:H\u0007J\u0010\u0010t\u001a\u00020&2\b\u0010u\u001a\u0004\u0018\u00010vJ\u001a\u0010w\u001a\u00020&2\b\u0010x\u001a\u0004\u0018\u00010:2\b\u0010y\u001a\u0004\u0018\u00010zJ\u001a\u0010{\u001a\u00020&2\b\u0010|\u001a\u0004\u0018\u00010:2\b\u0010}\u001a\u0004\u0018\u00010~J\u001c\u0010\u007f\u001a\u00020&2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010:2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010:R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010k\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006\u0085\u0001"}, d2 = {"Lio/intercom/android/sdk/Intercom;", "", "superDeDuper", "Lio/intercom/android/sdk/api/DeDuper;", "apiProvider", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/api/Api;", "nexusClientProvider", "Lio/intercom/android/nexus/NexusClient;", "unreadCountTracker", "Lio/intercom/android/sdk/m5/data/UnreadCountTracker;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "errorReporter", "Lio/intercom/android/sdk/errorreporting/ErrorReporter;", "context", "Landroid/app/Application;", "overlayPresenter", "Lio/intercom/android/sdk/overlay/OverlayPresenter;", "appConfigProvider", "Lio/intercom/android/sdk/identity/AppConfig;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "userUpdater", "Lio/intercom/android/sdk/api/UserUpdater;", "resetManager", "Lio/intercom/android/sdk/ResetManager;", "twig", "Lcom/intercom/twig/Twig;", "activityFinisher", "Lio/intercom/android/sdk/utilities/ActivityFinisher;", "dataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lio/intercom/android/sdk/api/DeDuper;Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/m5/data/UnreadCountTracker;Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/errorreporting/ErrorReporter;Landroid/app/Application;Lio/intercom/android/sdk/overlay/OverlayPresenter;Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/Provider;Lio/intercom/android/sdk/ResetManager;Lcom/intercom/twig/Twig;Lio/intercom/android/sdk/utilities/ActivityFinisher;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "shouldDisableErrorReporting", "", "present", "", "space", "Lio/intercom/android/sdk/IntercomSpace;", "presentContent", "content", "Lio/intercom/android/sdk/IntercomContent;", "registerUnidentifiedUser", "loginUnidentifiedUser", "intercomStatusCallback", "Lio/intercom/android/sdk/IntercomStatusCallback;", "registerIdentifiedUser", "userRegistration", "Lio/intercom/android/sdk/identity/Registration;", "loginIdentifiedUser", "registerNewIdentifiedUser", "isUserLoggedIn", "fetchLoggedInUserAttributes", "softRegister", "setUserHash", "userHash", "", "setUserJwt", MetricTracker.Object.JWT, "setAuthTokens", "authTokens", "", "Lio/intercom/android/sdk/AuthToken;", "updateUser", "userAttributes", "Lio/intercom/android/sdk/UserAttributes;", "performUpdate", "", "logEvent", "name", "metaData", "logEventWithValidation", "metadata", "displayMessenger", "displayMessageComposer", "initialMessage", "noUserRegistered", "logErrorAndOpenInbox", "error", "displayConversationsList", "displayHelpCenter", "displayHelpCenterCollections", "collectionIds", "displayCarousel", "carouselId", "displaySurvey", "surveyId", "setBottomPadding", "bottomPadding", "", "setInAppMessageVisibility", "visibility", "Lio/intercom/android/sdk/Intercom$Visibility;", "setLauncherVisibility", "setThemeMode", "themeMode", "Lio/intercom/android/sdk/ui/theme/ThemeMode;", "hideIntercom", "handlePushMessage", "customStack", "Landroid/app/TaskStackBuilder;", "openIntercomChatPush", "pushDataString", MetricTracker.Object.RESET, MetricTracker.Object.LOGOUT, "unreadConversationCount", "getUnreadConversationCount", "()I", "addUnreadConversationCountListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/intercom/android/sdk/UnreadConversationCountListener;", "removeUnreadConversationCountListener", "displayArticle", "articleId", "fetchHelpCenterCollections", "collectionRequestCallback", "Lio/intercom/android/sdk/helpcenter/api/CollectionRequestCallback;", "fetchHelpCenterCollection", "collectionId", "collectionContentRequestCallback", "Lio/intercom/android/sdk/helpcenter/api/CollectionContentRequestCallback;", "searchHelpCenter", "searchTerm", "searchRequestCallback", "Lio/intercom/android/sdk/helpcenter/api/SearchRequestCallback;", "changeWorkspace", "apiKey", RemoteConfigConstants.RequestFieldKey.APP_ID, "Visibility", "LogLevel", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Intercom {
    public static final String PUSH_RECEIVER = "intercom_sdk";
    private static Intercom instance;
    private final ActivityFinisher activityFinisher;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Application context;
    private final IntercomDataLayer dataLayer;
    private final MetricTracker metricTracker;
    private final Provider<NexusClient> nexusClientProvider;
    private final OverlayPresenter overlayPresenter;
    private final ResetManager resetManager;
    private final DeDuper superDeDuper;
    private final Twig twig;
    private final UnreadCountTracker unreadCountTracker;
    private final UserIdentity userIdentity;
    private final Provider<UserUpdater> userUpdater;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    public static final Visibility VISIBLE = Visibility.VISIBLE;
    public static final Visibility GONE = Visibility.GONE;
    private static final Twig TWIG = LumberMill.getLogger();

    /* compiled from: Intercom.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IntercomPushManager.IntercomPushIntegrationType.values().length];
            try {
                iArr[IntercomPushManager.IntercomPushIntegrationType.FCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IntercomSpace.values().length];
            try {
                iArr2[IntercomSpace.HelpCenter.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[IntercomSpace.Home.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IntercomSpace.Messages.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IntercomSpace.Tickets.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @JvmStatic
    public static final void setLogLevel(@LogLevel int i) {
        INSTANCE.setLogLevel(i);
    }

    @Deprecated(message = "Use initialize() instead. SDK will not communicate with Intercom until a user registration is made.")
    @JvmStatic
    public static final void unregisterForLateInitialisation(Application application) {
        INSTANCE.unregisterForLateInitialisation(application);
    }

    public final void present() {
        present$default(this, null, 1, null);
    }

    public Intercom(DeDuper superDeDuper, Provider<Api> apiProvider, Provider<NexusClient> nexusClientProvider, UnreadCountTracker unreadCountTracker, MetricTracker metricTracker, ErrorReporter errorReporter, Application context, OverlayPresenter overlayPresenter, Provider<AppConfig> appConfigProvider, UserIdentity userIdentity, Provider<UserUpdater> userUpdater, ResetManager resetManager, Twig twig, ActivityFinisher activityFinisher, IntercomDataLayer dataLayer) {
        Intrinsics.checkNotNullParameter(superDeDuper, "superDeDuper");
        Intrinsics.checkNotNullParameter(apiProvider, "apiProvider");
        Intrinsics.checkNotNullParameter(nexusClientProvider, "nexusClientProvider");
        Intrinsics.checkNotNullParameter(unreadCountTracker, "unreadCountTracker");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overlayPresenter, "overlayPresenter");
        Intrinsics.checkNotNullParameter(appConfigProvider, "appConfigProvider");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(userUpdater, "userUpdater");
        Intrinsics.checkNotNullParameter(resetManager, "resetManager");
        Intrinsics.checkNotNullParameter(twig, "twig");
        Intrinsics.checkNotNullParameter(activityFinisher, "activityFinisher");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        this.superDeDuper = superDeDuper;
        this.apiProvider = apiProvider;
        this.nexusClientProvider = nexusClientProvider;
        this.unreadCountTracker = unreadCountTracker;
        this.metricTracker = metricTracker;
        this.context = context;
        this.overlayPresenter = overlayPresenter;
        this.appConfigProvider = appConfigProvider;
        this.userIdentity = userIdentity;
        this.userUpdater = userUpdater;
        this.resetManager = resetManager;
        this.twig = twig;
        this.activityFinisher = activityFinisher;
        this.dataLayer = dataLayer;
        IntercomPushManager.IntercomPushIntegrationType installedModuleType = IntercomPushManager.getInstalledModuleType();
        if ((installedModuleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[installedModuleType.ordinal()]) == 1) {
            twig.i("Enabling FCM for cloud messaging", new Object[0]);
            IntercomPushClientHandler.INSTANCE.setUpNotificationChannels(context);
            IntercomPushManager.initializeFcmService(context);
        } else {
            twig.internal("No FCM integration detected");
        }
        if (shouldDisableErrorReporting()) {
            errorReporter.disableExceptionHandler();
        } else {
            errorReporter.enableExceptionHandler();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Intercom.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/Intercom$Visibility;", "", "<init>", "(Ljava/lang/String;I)V", "GONE", "VISIBLE", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Visibility {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Visibility[] $VALUES;
        public static final Visibility GONE = new Visibility("GONE", 0);
        public static final Visibility VISIBLE = new Visibility("VISIBLE", 1);

        private static final /* synthetic */ Visibility[] $values() {
            return new Visibility[]{GONE, VISIBLE};
        }

        public static EnumEntries<Visibility> getEntries() {
            return $ENTRIES;
        }

        private Visibility(String str, int i) {
        }

        static {
            Visibility[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) $VALUES.clone();
        }
    }

    /* compiled from: Intercom.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0086\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lio/intercom/android/sdk/Intercom$LogLevel;", "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LogLevel {
        public static final int ASSERT = 7;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int DEBUG = 3;
        public static final int DISABLED = 8;
        public static final int ERROR = 6;
        public static final int INFO = 4;
        public static final int VERBOSE = 2;
        public static final int WARN = 5;

        /* compiled from: Intercom.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/Intercom$LogLevel$Companion;", "", "<init>", "()V", "VERBOSE", "", "DEBUG", "INFO", "WARN", "ERROR", "ASSERT", "DISABLED", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int ASSERT = 7;
            public static final int DEBUG = 3;
            public static final int DISABLED = 8;
            public static final int ERROR = 6;
            public static final int INFO = 4;
            public static final int VERBOSE = 2;
            public static final int WARN = 5;

            private Companion() {
            }
        }
    }

    private final boolean shouldDisableErrorReporting() {
        return this.appConfigProvider.get().hasFeature(FeatureFlag.DISABLE_ERROR_REPORTING);
    }

    public static /* synthetic */ void present$default(Intercom intercom, IntercomSpace intercomSpace, int i, Object obj) {
        if ((i & 1) != 0) {
            intercomSpace = IntercomSpace.Home;
        }
        intercom.present(intercomSpace);
    }

    public final void present(IntercomSpace space) {
        Intrinsics.checkNotNullParameter(space, "space");
        if (noUserRegistered()) {
            TWIG.e("Intercom was presented but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).", new Object[0]);
            return;
        }
        Injector.get().getMetricTracker().presentAPICall(space);
        int i = WhenMappings.$EnumSwitchMapping$1[space.ordinal()];
        if (i == 1) {
            HelpCenterUrlUtilsKt.openCollections(this.context, CollectionsKt.emptyList(), MetricTracker.Place.API);
            return;
        }
        if (i == 2) {
            IntercomRootActivityLauncher.INSTANCE.startHome(this.context);
        } else if (i == 3) {
            IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            IntercomRootActivityLauncher.INSTANCE.startTickets(this.context);
        }
    }

    public final void presentContent(IntercomContent content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!Injector.isNotInitialised() && !noUserRegistered()) {
            Injector.get().getMetricTracker().presentContentAPICall(content);
        }
        if (content instanceof IntercomContent.Article) {
            this.context.startActivity(IntercomArticleActivity.INSTANCE.buildIntent(this.context, new IntercomArticleActivity.ArticleActivityArguments(((IntercomContent.Article) content).getId(), MetricTracker.Place.API, false, false, 12, null)));
            return;
        }
        if (content instanceof IntercomContent.Carousel) {
            Application application = this.context;
            application.startActivity(IntercomCarouselActivity.buildIntent(application, ((IntercomContent.Carousel) content).getId()));
            return;
        }
        if (content instanceof IntercomContent.Survey) {
            this.context.startActivity(IntercomSurveyActivity.INSTANCE.buildIntent(this.context, ((IntercomContent.Survey) content).getId()));
            return;
        }
        if (content instanceof IntercomContent.HelpCenterCollections) {
            HelpCenterUrlUtilsKt.openCollections(this.context, ((IntercomContent.HelpCenterCollections) content).getIds(), MetricTracker.Place.API);
        } else if (content instanceof IntercomContent.Conversation) {
            ConversationScreenOpenerKt.openComposer$default(this.context, "", true, null, ((IntercomContent.Conversation) content).getId(), 8, null);
        } else {
            if (!(content instanceof IntercomContent.Ticket)) {
                throw new NoWhenBranchMatchedException();
            }
            IntercomRootActivityLauncher.INSTANCE.startTicketDetails(this.context, ((IntercomContent.Ticket) content).getId(), MetricTracker.Context.FROM_PROGRAMMATIC);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use loginUnidentifiedUser instead.", replaceWith = @ReplaceWith(expression = "loginUnidentifiedUser()", imports = {}))
    public final void registerUnidentifiedUser() {
        loginUnidentifiedUser(IntercomStatusCallbackKt.getNoStatusCallback());
    }

    public static /* synthetic */ void loginUnidentifiedUser$default(Intercom intercom, IntercomStatusCallback intercomStatusCallback, int i, Object obj) {
        if ((i & 1) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginUnidentifiedUser(intercomStatusCallback);
    }

    public final void loginUnidentifiedUser(IntercomStatusCallback intercomStatusCallback) {
        Intrinsics.checkNotNullParameter(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginUnidentifiedUserAPICall();
        if (this.userIdentity.isUnidentified()) {
            this.twig.i("The unidentified user is already registered", new Object[0]);
            intercomStatusCallback.onSuccess();
        } else {
            if (this.userIdentity.isIdentified()) {
                this.twig.e("The identified user is already registered", new Object[0]);
                intercomStatusCallback.onFailure(new IntercomError(3002, "Failed to register user. We already have a registered user. If you are attempting to register a new user, call logout() before this. If you are attempting to register an identified user call: registerIdentifiedUser(Registration)"));
                return;
            }
            this.resetManager.hardReset();
            this.userIdentity.registerUnidentifiedUser();
            this.nexusClientProvider.get().disconnect();
            this.userUpdater.get().updateUser(UserUpdateRequest.create(!this.dataLayer.getHostAppState().getValue().getSessionStartedSinceLastBackgrounded(), this.dataLayer.getHostAppState().getValue().isBackgrounded(), true), intercomStatusCallback);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use loginIdentifiedUser with callback instead.", replaceWith = @ReplaceWith(expression = "loginIdentifiedUser(userRegistration)", imports = {}))
    public final void registerIdentifiedUser(Registration userRegistration) {
        if (userRegistration == null) {
            this.metricTracker.registerIdentifiedUserAPICall();
            this.twig.e("The registration object passed is null. An example successful call is registerIdentifiedUser(Registration.create().withEmail(email));", new Object[0]);
        } else {
            loginIdentifiedUser(userRegistration, IntercomStatusCallbackKt.getNoStatusCallback());
        }
    }

    public static /* synthetic */ void loginIdentifiedUser$default(Intercom intercom, Registration registration, IntercomStatusCallback intercomStatusCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.loginIdentifiedUser(registration, intercomStatusCallback);
    }

    public final void loginIdentifiedUser(Registration userRegistration, IntercomStatusCallback intercomStatusCallback) {
        Map<String, Object> emptyMap;
        Intrinsics.checkNotNullParameter(userRegistration, "userRegistration");
        Intrinsics.checkNotNullParameter(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.loginIdentifiedUserAPICall();
        String userId = userRegistration.getUserId();
        Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
        if (userId.length() == 0) {
            String email = userRegistration.getEmail();
            Intrinsics.checkNotNullExpressionValue(email, "getEmail(...)");
            if (email.length() == 0) {
                this.twig.e("Failed to register user. You need to provide a user identifier, an email address, or both. ", new Object[0]);
                intercomStatusCallback.onFailure(new IntercomError(1007, "Failed to register user. You need to provide unique user identifier, an email address, or both."));
                return;
            }
        }
        if (!this.userIdentity.identityExists()) {
            if (this.userIdentity.isSoftReset() && this.userIdentity.softIdentityIsSameUser(userRegistration)) {
                softRegister();
                intercomStatusCallback.onSuccess();
                return;
            } else {
                registerNewIdentifiedUser(userRegistration, intercomStatusCallback);
                return;
            }
        }
        if (Intrinsics.areEqual(userRegistration.getEmail(), this.userIdentity.getEmail()) && Intrinsics.areEqual(userRegistration.getUserId(), this.userIdentity.getUserId())) {
            if (this.userIdentity.registrationHasAttributes(userRegistration)) {
                this.twig.i("We already have a registered user. Updating this user with the attributes provided.", new Object[0]);
                UserAttributes attributes = userRegistration.getAttributes();
                if (attributes == null || (emptyMap = attributes.toMap()) == null) {
                    emptyMap = MapsKt.emptyMap();
                }
                performUpdate(emptyMap, intercomStatusCallback);
                return;
            }
            this.twig.i("The user is already registered with the same email and user id, skipping API call", new Object[0]);
            intercomStatusCallback.onSuccess();
            return;
        }
        this.twig.i("The user is already registered with a different email or user id", new Object[0]);
        registerNewIdentifiedUser(userRegistration, intercomStatusCallback);
    }

    private final void registerNewIdentifiedUser(Registration userRegistration, IntercomStatusCallback intercomStatusCallback) {
        UserUpdateRequest create;
        this.resetManager.hardReset();
        this.userIdentity.registerIdentifiedUser(userRegistration);
        this.nexusClientProvider.get().disconnect();
        boolean z = !this.dataLayer.getHostAppState().getValue().getSessionStartedSinceLastBackgrounded();
        boolean isBackgrounded = this.dataLayer.getHostAppState().getValue().isBackgrounded();
        if (userRegistration.getAttributes() != null) {
            UserAttributes attributes = userRegistration.getAttributes();
            Intrinsics.checkNotNull(attributes);
            create = UserUpdateRequest.create(z, isBackgrounded, attributes.toMap(), true);
            Intrinsics.checkNotNull(create);
        } else {
            create = UserUpdateRequest.create(z, isBackgrounded, true);
            Intrinsics.checkNotNull(create);
        }
        this.userUpdater.get().updateUser(create, intercomStatusCallback);
    }

    public final boolean isUserLoggedIn() {
        return this.userIdentity.identityExists();
    }

    public final Registration fetchLoggedInUserAttributes() {
        UserIdentity userIdentity = this.userIdentity;
        if (!userIdentity.identityExists()) {
            userIdentity = null;
        }
        if (userIdentity == null) {
            return null;
        }
        Registration registration = new Registration();
        String userId = userIdentity.getUserId();
        if (userId != null && userId.length() != 0) {
            registration.withUserId(userIdentity.getUserId());
        }
        String email = userIdentity.getEmail();
        if (email != null && email.length() != 0) {
            registration.withEmail(userIdentity.getEmail());
        }
        String anonymousId = userIdentity.getAnonymousId();
        if (anonymousId != null && anonymousId.length() != 0) {
            registration.withUserId(userIdentity.getAnonymousId());
        }
        return registration;
    }

    private final void softRegister() {
        this.nexusClientProvider.get().connect(this.appConfigProvider.get().getRealTimeConfig(), true);
        this.userIdentity.softRestart();
        this.resetManager.clear();
        Runnable runnable = new Runnable() { // from class: io.intercom.android.sdk.Intercom$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Intercom.softRegister$lambda$2(Intercom.this);
            }
        };
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void softRegister$lambda$2(Intercom this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.overlayPresenter.refreshStateBecauseUserIdentityIsNotInStoreYet();
    }

    public final void setUserHash(String userHash) {
        Intrinsics.checkNotNullParameter(userHash, "userHash");
        this.metricTracker.setUserHashAPICall();
        if (userHash.length() == 0) {
            this.twig.w("The user hash you sent us to verify was empty, we will not be able to authenticate your requests without a valid user hash.", new Object[0]);
        } else {
            if (Intrinsics.areEqual(this.userIdentity.getHmac(), userHash)) {
                this.twig.i("The user hash set matches the existing user identity hash value", new Object[0]);
                return;
            }
            if (this.userIdentity.softUserIdentityHmacDiffers(userHash)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setUserHash(userHash);
        }
    }

    public final void setUserJwt(String jwt) {
        Intrinsics.checkNotNullParameter(jwt, "jwt");
        this.metricTracker.setUserJwtAPICall();
        if (jwt.length() == 0) {
            this.twig.w("The JWT you sent us to verify was empty, we will not be able to authenticate your requests without a valid JWT.", new Object[0]);
        } else {
            if (Intrinsics.areEqual(this.userIdentity.getJwt(), jwt)) {
                this.twig.i("The JWT set matches the existing user identity JWT value", new Object[0]);
                return;
            }
            if (this.userIdentity.softUserIdentityJwtDiffers(jwt)) {
                this.resetManager.hardReset();
            }
            this.userIdentity.setJwt(jwt);
        }
    }

    public static /* synthetic */ void setAuthTokens$default(Intercom intercom, List list, IntercomStatusCallback intercomStatusCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.setAuthTokens(list, intercomStatusCallback);
    }

    public final void setAuthTokens(List<AuthToken> authTokens, IntercomStatusCallback intercomStatusCallback) {
        Intrinsics.checkNotNullParameter(authTokens, "authTokens");
        Intrinsics.checkNotNullParameter(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.authTokensAPICall();
        ArrayList arrayList = new ArrayList();
        for (Object obj : authTokens) {
            AuthToken authToken = (AuthToken) obj;
            if (authToken.getName().length() > 0 && authToken.getToken().length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            this.twig.e("All auth tokens in the map have empty keys or values.", new Object[0]);
            intercomStatusCallback.onFailure(new IntercomError(3003, "ERROR - Failed to set Auth Tokens. All keys or values passed were empty."));
        } else {
            this.apiProvider.get().setAuthTokens(arrayList2, intercomStatusCallback);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use updateUser with callback instead.", replaceWith = @ReplaceWith(expression = "updateUser(userAttributes, statusCallback)", imports = {}))
    public final void updateUser(UserAttributes userAttributes) {
        this.metricTracker.updateUserAPICall();
        if (userAttributes == null) {
            LumberMill.getLogger().e("updateUser method failed: the UserAttributes object provided is null", new Object[0]);
        } else {
            updateUser(userAttributes, IntercomStatusCallbackKt.getNoStatusCallback());
        }
    }

    public static /* synthetic */ void updateUser$default(Intercom intercom, UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            intercomStatusCallback = IntercomStatusCallbackKt.getNoStatusCallback();
        }
        intercom.updateUser(userAttributes, intercomStatusCallback);
    }

    public final void updateUser(UserAttributes userAttributes, IntercomStatusCallback intercomStatusCallback) {
        Intrinsics.checkNotNullParameter(userAttributes, "userAttributes");
        Intrinsics.checkNotNullParameter(intercomStatusCallback, "intercomStatusCallback");
        this.metricTracker.updateUserCallbackAPICall();
        Map<String, Object> map = userAttributes.toMap();
        Intrinsics.checkNotNullExpressionValue(map, "toMap(...)");
        performUpdate(map, intercomStatusCallback);
    }

    private final void performUpdate(Map<String, ? extends Object> userAttributes, IntercomStatusCallback intercomStatusCallback) {
        if (this.userIdentity.isUnidentified()) {
            AttributeSanitiser.anonymousSanitisation(userAttributes);
        }
        if (this.superDeDuper.shouldUpdateUser(userAttributes)) {
            this.superDeDuper.update(userAttributes);
            this.userUpdater.get().updateUser(UserUpdateRequest.create(false, this.dataLayer.getHostAppState().getValue().isBackgrounded(), userAttributes, false), intercomStatusCallback);
            this.twig.internal("dupe", "updated user");
            return;
        }
        intercomStatusCallback.onSuccess();
        this.twig.internal("dupe", "dropped dupe");
    }

    public final void logEvent(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.metricTracker.logEventAPICall();
        logEventWithValidation(name, MapsKt.emptyMap());
    }

    public final void logEvent(String name, Map<String, ?> metaData) {
        this.metricTracker.logEventMetadataAPICall();
        if (metaData == null) {
            this.twig.i("The metadata provided is null, logging event with no metadata", new Object[0]);
        } else if (metaData.isEmpty()) {
            this.twig.i("The metadata provided is empty, logging event with no metadata", new Object[0]);
        }
        Map<String, ?> map = metaData != null ? MapsKt.toMap(metaData) : null;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        logEventWithValidation(name, map);
    }

    private final void logEventWithValidation(String name, Map<String, ?> metadata) {
        String str = name;
        if (str == null || str.length() == 0) {
            this.twig.e("The event name is null or empty. We can't log an event with this string.", new Object[0]);
        } else {
            this.apiProvider.get().logEvent(name, metadata);
        }
    }

    @Deprecated(message = "Use present() instead.")
    public final void displayMessenger() {
        this.metricTracker.displayMessengerAPICall();
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device.Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
        } else {
            new LauncherOpenBehaviour().openMessenger(this.context);
        }
    }

    public final void displayMessageComposer() {
        this.metricTracker.displayMessageComposerAPICall();
        displayMessageComposer("");
    }

    public final void displayMessageComposer(String initialMessage) {
        String str = initialMessage;
        if (str != null && str.length() != 0) {
            this.metricTracker.displayMessageComposerInitialMessageAPICall();
        }
        if (noUserRegistered()) {
            logErrorAndOpenInbox("The messenger was opened but there was no user registered on this device. Please call registerUnidentifiedUser() or registerIdentifiedUser(Registration).");
            return;
        }
        if (!this.appConfigProvider.get().isReceivedFromServer()) {
            logErrorAndOpenInbox("It appears your app has not received a successful response from Intercom. Please check if you are using the correct Android app ID and API Key from the Intercom settings.");
            return;
        }
        if (!this.appConfigProvider.get().isInboundMessages()) {
            logErrorAndOpenInbox("It appears your app is not on a plan that allows message composing. As a fallback we are calling present(IntercomSpace.Messages)");
            return;
        }
        this.metricTracker.openedMessengerNewConversation(LauncherOpenBehaviour.LauncherType.CUSTOM);
        Application application = this.context;
        if (initialMessage == null) {
            initialMessage = "";
        }
        ConversationScreenOpenerKt.openComposer$default(application, initialMessage, true, null, null, 24, null);
    }

    private final boolean noUserRegistered() {
        return !this.userIdentity.identityExists() || this.userIdentity.isSoftReset();
    }

    private final void logErrorAndOpenInbox(String error) {
        this.twig.e(error, new Object[0]);
        present(IntercomSpace.Messages);
    }

    @Deprecated(message = "Use present(IntercomSpace.Messages) instead.")
    public final void displayConversationsList() {
        this.metricTracker.displayConversationsListAPICall();
        this.metricTracker.openedMessengerConversationList(LauncherOpenBehaviour.LauncherType.CUSTOM);
        IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
    }

    @Deprecated(message = "Use present(IntercomSpace.HelpCenter) instead.")
    public final void displayHelpCenter() {
        this.metricTracker.displayHelpCenterAPICall();
        displayHelpCenterCollections(CollectionsKt.emptyList());
    }

    @Deprecated(message = "Use presentContent(IntercomContent.HelpCenterCollections(ids)) instead.")
    public final void displayHelpCenterCollections(List<String> collectionIds) {
        this.metricTracker.displayHelpCenterCollectionsAPICall();
        Application application = this.context;
        List filterNotNull = collectionIds != null ? CollectionsKt.filterNotNull(collectionIds) : null;
        if (filterNotNull == null) {
            filterNotNull = CollectionsKt.emptyList();
        }
        HelpCenterUrlUtilsKt.openCollections(application, filterNotNull, MetricTracker.Place.API);
    }

    @Deprecated(message = "Use presentContent(IntercomContent.Carousel(id)) instead.")
    public final void displayCarousel(String carouselId) {
        this.metricTracker.displayCarouselAPICall();
        Application application = this.context;
        application.startActivity(IntercomCarouselActivity.buildIntent(application, carouselId));
    }

    @Deprecated(message = "Use presentContent(IntercomContent.Survey(id)) instead.")
    public final void displaySurvey(String surveyId) {
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        this.metricTracker.displaySurveyAPICall();
        this.context.startActivity(IntercomSurveyActivity.INSTANCE.buildIntent(this.context, surveyId));
    }

    public final void setBottomPadding(int bottomPadding) {
        this.metricTracker.setBottomPaddingAPICall();
        this.dataLayer.updateBottomPadding(bottomPadding);
    }

    public final void setInAppMessageVisibility(Visibility visibility) {
        this.metricTracker.setInAppMessageVisibilityAPICall();
        if (visibility != null) {
            this.dataLayer.updateInAppNotificationsVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setLauncherVisibility(Visibility visibility) {
        this.metricTracker.setLauncherVisibilityAPICall();
        if (visibility != null) {
            this.dataLayer.updateLauncherVisibility(visibility);
        } else {
            this.twig.i("The visibility provided is null, visibility won't be updated", new Object[0]);
        }
    }

    public final void setThemeMode(ThemeMode themeMode) {
        this.metricTracker.setThemeModeAPICall();
        if (themeMode != null) {
            ThemeManager.INSTANCE.setSessionOverride(themeMode);
            this.twig.i("Theme mode set to: " + themeMode + " (session only)", new Object[0]);
            return;
        }
        ThemeManager.INSTANCE.clearSessionOverride();
        this.twig.i("Theme mode cleared, using server-provided theme", new Object[0]);
    }

    public final void hideIntercom() {
        this.metricTracker.hideIntercomAPICall();
        this.activityFinisher.finishActivities();
    }

    @Deprecated(message = "Calling this API is no longer required. Intercom will directly open the chat screen when a push notification is clicked.")
    public final void handlePushMessage() {
        this.metricTracker.handlePushMessageAPICall();
        handlePushMessage(null);
    }

    @Deprecated(message = "Calling this API is no longer required. Intercom will directly open the chat screen when a push notification is clicked.")
    public final void handlePushMessage(TaskStackBuilder customStack) {
        if (customStack != null) {
            this.metricTracker.handlePushMessageCustomStackAPICall();
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PreferenceKeys.INTERCOM_PUSH_PREFS, 0);
        String string = sharedPreferences.getString(IntercomPushManager.INTERCOM_PUSH_PATH, "");
        String str = string;
        if (str == null || StringsKt.isBlank(str)) {
            this.twig.internal("No Uri found");
        } else {
            openIntercomChatPush(string, customStack);
            sharedPreferences.edit().clear().apply();
        }
    }

    private final void openIntercomChatPush(String pushDataString, TaskStackBuilder customStack) {
        if (Intrinsics.areEqual(pushDataString, IntercomPushManager.MULTIPLE_NOTIFICATIONS)) {
            IntercomRootActivityLauncher.INSTANCE.startMessages(this.context);
        } else {
            Intent conversationIntent = ConversationScreenOpenerKt.getConversationIntent(this.context, pushDataString);
            if (customStack != null) {
                customStack.addNextIntent(conversationIntent);
                this.context.startActivities(customStack.getIntents());
            } else {
                this.context.startActivity(conversationIntent);
            }
        }
        this.metricTracker.viewedPushNotification(pushDataString);
        IntercomPushClientHandler.INSTANCE.clear(this.context);
    }

    @Deprecated(message = "call {@link #logout()} instead")
    public final void reset() {
        this.metricTracker.resetAPICall();
        logout();
    }

    public final void logout() {
        this.metricTracker.logoutAPICall();
        if (this.userIdentity.isSoftReset()) {
            return;
        }
        this.resetManager.softReset();
    }

    public final int getUnreadConversationCount() {
        this.metricTracker.unreadConversationCountAPICall();
        return this.dataLayer.getUnreadConversationIds().getValue().size();
    }

    public final void addUnreadConversationCountListener(UnreadConversationCountListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.metricTracker.addUnreadConversationCountListenerAPICall();
        UnreadCountTracker.addListener$default(this.unreadCountTracker, listener, null, 2, null);
    }

    public final void removeUnreadConversationCountListener(UnreadConversationCountListener listener) {
        this.metricTracker.removeUnreadConversationCountListenerAPICall();
        if (listener != null) {
            this.unreadCountTracker.removeListener(listener);
        }
    }

    @Deprecated(message = "Use presentContent(IntercomContent.Article(id)) instead.")
    public final void displayArticle(String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.metricTracker.displayArticleAPICall();
        this.context.startActivity(IntercomArticleActivity.INSTANCE.buildIntent(this.context, new IntercomArticleActivity.ArticleActivityArguments(articleId, MetricTracker.Place.API, false, false, 12, null)));
    }

    public final void fetchHelpCenterCollections(CollectionRequestCallback collectionRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionsAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        Intrinsics.checkNotNull(collectionRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollections(metricTracker, collectionRequestCallback);
    }

    public final void fetchHelpCenterCollection(String collectionId, CollectionContentRequestCallback collectionContentRequestCallback) {
        this.metricTracker.fetchHelpCenterCollectionAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        Intrinsics.checkNotNull(collectionId);
        Intrinsics.checkNotNull(collectionContentRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterCollection(metricTracker, collectionId, collectionContentRequestCallback);
    }

    public final void searchHelpCenter(String searchTerm, SearchRequestCallback searchRequestCallback) {
        this.metricTracker.searchHelpCenterAPICall();
        HelpCenterApiWrapper helpCenterApiWrapper = HelpCenterApiWrapper.INSTANCE;
        MetricTracker metricTracker = this.metricTracker;
        Intrinsics.checkNotNull(searchTerm);
        Intrinsics.checkNotNull(searchRequestCallback);
        helpCenterApiWrapper.fetchHelpCenterResultsForSearchTerm(metricTracker, searchTerm, searchRequestCallback);
    }

    public final void changeWorkspace(String apiKey, String appId) {
        this.metricTracker.changeWorkspaceAPICall();
        if (apiKey != null && appId != null && ValidatorUtil.isValidAppIdParams(apiKey, appId)) {
            logout();
            Injector.get().changeWorkspace(apiKey, appId);
        } else {
            TWIG.e("Workspace has not been changed. Please make sure that you're passing in the correct app ID and API key", new Object[0]);
        }
    }

    /* compiled from: Intercom.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0015\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0017\u001a\u00020\u000eH\u0007J\u0012\u0010\u0018\u001a\u00020\u00102\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/Intercom$Companion;", "", "<init>", "()V", "VISIBLE", "Lio/intercom/android/sdk/Intercom$Visibility;", "GONE", "PUSH_RECEIVER", "", "TWIG", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "Lcom/intercom/twig/Twig;", "instance", "Lio/intercom/android/sdk/Intercom;", "initialize", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "apiKey", RemoteConfigConstants.RequestFieldKey.APP_ID, "registerForLaterInitialisation", "unregisterForLateInitialisation", AnalyticsConstantsKt.KEY_CLIENT, "setLogLevel", "logLevel", "", "create", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final synchronized void initialize(Application application, String apiKey, String appId) {
            if (Intercom.instance != null) {
                Intercom.TWIG.i("Intercom has already been initialized", new Object[0]);
                return;
            }
            if (application != null && apiKey != null && appId != null && ValidatorUtil.isValidConstructorParams(application, apiKey, appId)) {
                Intercom.instance = create(application, apiKey, appId);
                LateInitializationPreparer.getInstance().handlePastLifecycleEvents(application, Injector.get());
                Injector.get().getMetricTracker().initialiseAPICall();
                Injector.get().initializeIntercomEventsListeners();
            } else {
                Intercom.TWIG.e("Intercom has been initialized incorrectly. Please make sure that you're passing in the correct app ID and API key", new Object[0]);
            }
        }

        @Deprecated(message = "Use initialize() instead. SDK will not communicate with Intercom until a user registration is made.")
        @JvmStatic
        public final synchronized void registerForLaterInitialisation(Application application) {
            if (Intercom.instance != null) {
                Intercom.TWIG.i("Intercom has already been initialized", new Object[0]);
            } else {
                if (application == null) {
                    throw new NullPointerException("Cannot call registerForLaterInitialisation() with a null Application");
                }
                LateInitializationPreparer.getInstance().register(application);
            }
        }

        @Deprecated(message = "Use initialize() instead. SDK will not communicate with Intercom until a user registration is made.")
        @JvmStatic
        public final void unregisterForLateInitialisation(Application application) {
            Injector.get().getMetricTracker().unRegisterForLateInitialisationAPICall();
            if (application == null) {
                throw new NullPointerException("Cannot call unregisterForLateInitialisation() with a null Application");
            }
            LateInitializationPreparer.getInstance().unregister(application);
        }

        @JvmStatic
        public final synchronized Intercom client() {
            Intercom intercom;
            intercom = Intercom.instance;
            if (intercom == null) {
                throw new IllegalStateException("Intercom has been initialized incorrectly. Please make sure the first Intercom method you call is initialize() and that you're passing in the correct app ID and API key".toString());
            }
            return intercom;
        }

        @JvmStatic
        public final void setLogLevel(@LogLevel int logLevel) {
            Injector.get().getMetricTracker().setLogLevelAPICall();
            LumberMill.setLogLevel(logLevel);
        }

        private final Intercom create(Application application, String apiKey, String appId) {
            Injector.initWithAppCredentials(application, apiKey, appId);
            Injector injector = Injector.get();
            IntercomDataLayer dataLayer = injector.getDataLayer();
            ThemeManager.INSTANCE.initialize();
            DeDuper deDuper = injector.getDeDuper();
            Intrinsics.checkNotNullExpressionValue(deDuper, "getDeDuper(...)");
            Provider<Api> apiProvider = injector.getApiProvider();
            Intrinsics.checkNotNullExpressionValue(apiProvider, "getApiProvider(...)");
            Provider<NexusClient> nexusClientProvider = injector.getNexusClientProvider();
            Intrinsics.checkNotNullExpressionValue(nexusClientProvider, "getNexusClientProvider(...)");
            Intrinsics.checkNotNull(dataLayer);
            UnreadCountTracker unreadCountTracker = new UnreadCountTracker(dataLayer);
            MetricTracker metricTracker = injector.getMetricTracker();
            Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
            ErrorReporter errorReporter = injector.getErrorReporter();
            Intrinsics.checkNotNullExpressionValue(errorReporter, "getErrorReporter(...)");
            OverlayPresenter overlayPresenter = injector.getOverlayPresenter();
            Intrinsics.checkNotNullExpressionValue(overlayPresenter, "getOverlayPresenter(...)");
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            Intrinsics.checkNotNullExpressionValue(appConfigProvider, "getAppConfigProvider(...)");
            UserIdentity userIdentity = injector.getUserIdentity();
            Intrinsics.checkNotNullExpressionValue(userIdentity, "getUserIdentity(...)");
            Provider<UserUpdater> userUpdaterProvider = injector.getUserUpdaterProvider();
            Intrinsics.checkNotNullExpressionValue(userUpdaterProvider, "getUserUpdaterProvider(...)");
            ResetManager resetManager = injector.getResetManager();
            Intrinsics.checkNotNullExpressionValue(resetManager, "getResetManager(...)");
            Twig logger = LumberMill.getLogger();
            Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
            ActivityFinisher activityFinisher = injector.getActivityFinisher();
            Intrinsics.checkNotNullExpressionValue(activityFinisher, "getActivityFinisher(...)");
            return new Intercom(deDuper, apiProvider, nexusClientProvider, unreadCountTracker, metricTracker, errorReporter, application, overlayPresenter, appConfigProvider, userIdentity, userUpdaterProvider, resetManager, logger, activityFinisher, dataLayer);
        }
    }

    @JvmStatic
    public static final synchronized void initialize(Application application, String str, String str2) {
        synchronized (Intercom.class) {
            INSTANCE.initialize(application, str, str2);
        }
    }

    @Deprecated(message = "Use initialize() instead. SDK will not communicate with Intercom until a user registration is made.")
    @JvmStatic
    public static final synchronized void registerForLaterInitialisation(Application application) {
        synchronized (Intercom.class) {
            INSTANCE.registerForLaterInitialisation(application);
        }
    }

    @JvmStatic
    public static final synchronized Intercom client() {
        Intercom client;
        synchronized (Intercom.class) {
            client = INSTANCE.client();
        }
        return client;
    }
}
