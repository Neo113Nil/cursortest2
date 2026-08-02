package io.intercom.android.sdk.api;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.RetryInterceptor;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponseAdapterFactory;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketApi;
import io.intercom.android.sdk.utilities.UtilsKt;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import io.intercom.android.sdk.utilities.gson.RuntimeTypeAdapterFactory;
import io.sentry.SentryReplayEvent;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: ApiFactory.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020'J\u000e\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020'J\u000e\u0010,\u001a\u00020#2\u0006\u0010&\u001a\u00020'J\u000e\u0010-\u001a\u00020.2\u0006\u0010&\u001a\u00020'J\u001e\u0010/\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u00100\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u00101\u001a\u000202J\u001e\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0006\u00105\u001a\u000202J\u0016\u00106\u001a\u00020'2\u0006\u00104\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!J\u0016\u00107\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u00108\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u0005J\u0016\u00109\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010;\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010=\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0005H\u0007J\u000e\u0010>\u001a\u00020\u00052\u0006\u0010:\u001a\u00020\u0005J\u000e\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020C0@H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lio/intercom/android/sdk/api/ApiFactory;", "", "<init>", "()V", "CACHE_NAME", "", "PROTOCOL", "PARTIAL_HOSTNAME_US", "PARTIAL_HOSTNAME_AUS", "PARTIAL_HOSTNAME_EU", "ENDPOINT", "CACHE_SIZE", "", "MAX_DNS_SEGMENT_SIZE", "INTERCOM_TRAFFIC_TAG", "createApi", "Lio/intercom/android/sdk/api/Api;", "context", "Landroid/content/Context;", "appIdentity", "Lio/intercom/android/sdk/identity/AppIdentity;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "appConfigProvider", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/identity/AppConfig;", "opsMetricTracker", "Lio/intercom/android/sdk/metrics/ops/OpsMetricTracker;", "dataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "unreadConversationsTracker", "Lio/intercom/android/sdk/metrics/UnreadConversationsTracker;", "httpClient", "Lokhttp3/OkHttpClient;", "messengerApi", "Lio/intercom/android/sdk/api/MessengerApi;", "createHelpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "retrofit", "Lretrofit2/Retrofit;", "createSurveyApi", "Lio/intercom/android/sdk/api/SurveyApi;", "createTicketApi", "Lio/intercom/android/sdk/tickets/create/data/TicketApi;", "createMessengerApi", "getUploadApi", "Lio/intercom/android/sdk/api/ExternalUploadApi;", "createConfigurableHttpClient", "createHttpClientWithoutHeaders", "createGsonWithAdapters", "Lcom/google/gson/Gson;", "createLegacyRetrofit", "hostname", "gson", "createKotlinXRetrofit", "getServerUrl", "convertHostnameToUrl", "getFullHostname", RemoteConfigConstants.RequestFieldKey.APP_ID, "getCorrectServerHostname", "region", "createUniqueIdentifier", "removeInvalidCharacters", "getHomeCardsAdapterFactory", "Lio/intercom/android/sdk/utilities/gson/RuntimeTypeAdapterFactory;", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "getTicketTypeAdapterFactory", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ApiFactory {
    public static final int $stable = 0;
    private static final String CACHE_NAME = "Intercom_SDK/HttpCache";
    private static final int CACHE_SIZE = 10485760;
    private static final String ENDPOINT = "/messenger/mobile/";
    public static final ApiFactory INSTANCE = new ApiFactory();
    private static final int INTERCOM_TRAFFIC_TAG = 46837266;
    private static final int MAX_DNS_SEGMENT_SIZE = 63;
    private static final String PARTIAL_HOSTNAME_AUS = ".mobile-messenger.au.intercom.io";
    private static final String PARTIAL_HOSTNAME_EU = ".mobile-messenger.eu.intercom.io";
    private static final String PARTIAL_HOSTNAME_US = ".mobile-messenger.intercom.com";
    private static final String PROTOCOL = "https://";

    private ApiFactory() {
    }

    public final Api createApi(Context context, AppIdentity appIdentity, UserIdentity userIdentity, Provider<AppConfig> appConfigProvider, OpsMetricTracker opsMetricTracker, IntercomDataLayer dataLayer, UnreadConversationsTracker unreadConversationsTracker, OkHttpClient httpClient, MessengerApi messengerApi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appIdentity, "appIdentity");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(appConfigProvider, "appConfigProvider");
        Intrinsics.checkNotNullParameter(opsMetricTracker, "opsMetricTracker");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(unreadConversationsTracker, "unreadConversationsTracker");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        return new Api(context, appIdentity, userIdentity, httpClient, messengerApi, new CallbackHolder(dataLayer, userIdentity, unreadConversationsTracker), new RateLimiter(appConfigProvider.get()), appConfigProvider, opsMetricTracker, dataLayer);
    }

    public final HelpCenterApi createHelpCenterApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(HelpCenterApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (HelpCenterApi) create;
    }

    public final SurveyApi createSurveyApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(SurveyApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (SurveyApi) create;
    }

    public final TicketApi createTicketApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(TicketApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (TicketApi) create;
    }

    public final MessengerApi createMessengerApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(MessengerApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (MessengerApi) create;
    }

    public final ExternalUploadApi getUploadApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(ExternalUploadApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (ExternalUploadApi) create;
    }

    public final OkHttpClient createConfigurableHttpClient(Context context, AppIdentity appIdentity, UserIdentity userIdentity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appIdentity, "appIdentity");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().readTimeout(2L, TimeUnit.MINUTES).connectTimeout(2L, TimeUnit.MINUTES).writeTimeout(2L, TimeUnit.MINUTES).socketFactory(new TaggingSocketFactory(SocketFactory.getDefault(), INTERCOM_TRAFFIC_TAG)).addInterceptor(new UserIdentityInterceptor(userIdentity)).addInterceptor(new RetryInterceptor(new RetryInterceptor.Sleeper())).addInterceptor(new ShutdownInterceptor(new ShutdownState(context, appIdentity, TimeProvider.SYSTEM)));
        HeaderInterceptor create = HeaderInterceptor.create(context, appIdentity);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        OkHttpClient.Builder addNetworkInterceptor = addInterceptor.addNetworkInterceptor(create);
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            addNetworkInterceptor.cache(new Cache(new File(cacheDir.getAbsolutePath(), CACHE_NAME), SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE));
        }
        return addNetworkInterceptor.build();
    }

    public final OkHttpClient createHttpClientWithoutHeaders(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new S3HostRedirectInterceptor());
        return builder.build();
    }

    public final Gson createGsonWithAdapters() {
        Gson create = new GsonBuilder().registerTypeAdapterFactory(getHomeCardsAdapterFactory()).registerTypeAdapterFactory(getTicketTypeAdapterFactory()).create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }

    public final Retrofit createLegacyRetrofit(String hostname, OkHttpClient httpClient, Gson gson) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Retrofit build = new Retrofit.Builder().baseUrl(hostname).addCallAdapterFactory(new NetworkResponseAdapterFactory()).addConverterFactory(GsonConverterFactory.create(gson)).client(httpClient).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final Retrofit createKotlinXRetrofit(String hostname, OkHttpClient httpClient) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Retrofit build = new Retrofit.Builder().baseUrl(hostname).addCallAdapterFactory(new NetworkResponseAdapterFactory()).addConverterFactory(KotlinXConvertorFactory.INSTANCE.getConvertorFactory()).client(httpClient).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final String getServerUrl(AppIdentity appIdentity, Context context) {
        String sb;
        Intrinsics.checkNotNullParameter(appIdentity, "appIdentity");
        Intrinsics.checkNotNullParameter(context, "context");
        String readHostFromManifest = UtilsKt.readHostFromManifest(context);
        if (TextUtils.isEmpty(readHostFromManifest)) {
            String appId = appIdentity.appId();
            Intrinsics.checkNotNullExpressionValue(appId, "appId(...)");
            sb = getFullHostname(appId, context);
        } else {
            StringBuilder sb2 = new StringBuilder();
            String appId2 = appIdentity.appId();
            Intrinsics.checkNotNullExpressionValue(appId2, "appId(...)");
            sb2.append(createUniqueIdentifier(appId2));
            sb2.append(readHostFromManifest);
            sb = sb2.toString();
        }
        return convertHostnameToUrl(sb);
    }

    public final String convertHostnameToUrl(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return PROTOCOL + hostname + ENDPOINT;
    }

    public final String getFullHostname(String appId, Context context) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(context, "context");
        return createUniqueIdentifier(appId) + getCorrectServerHostname(UtilsKt.getServerRegionFromManifest(context), context);
    }

    private final String getCorrectServerHostname(int region, Context context) {
        if (region == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_aus)) {
            return PARTIAL_HOSTNAME_AUS;
        }
        if (region == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_eu)) {
            return PARTIAL_HOSTNAME_EU;
        }
        if (region == UtilsKt.getRegionCode(context, R.integer.intercom_server_region_us) || region == 0) {
            LumberMill.getLogger().i("Defaulting to US region, since no explicit region was mentioned. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
            return PARTIAL_HOSTNAME_US;
        }
        LumberMill.getLogger().e("Incorrect value for region is provided in AndroidManifest.xml file. Please use one of the available regions values from provided list. For more info on regions, please visit Intercom Android SDK documentation", new Object[0]);
        return "";
    }

    public final String createUniqueIdentifier(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        String str = removeInvalidCharacters(appId) + "-android";
        if (str.length() <= 63) {
            return str;
        }
        String substring = str.substring(0, str.charAt(62) == '-' ? 62 : 63);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String removeInvalidCharacters(String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        return new Regex("[^A-Za-z0-9\\-$]").replace(appId, "");
    }

    private final RuntimeTypeAdapterFactory<HomeCards> getHomeCardsAdapterFactory() {
        RuntimeTypeAdapterFactory of = RuntimeTypeAdapterFactory.of(HomeCards.class, "type");
        String lowerCase = "SPACES".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype = of.registerSubtype(HomeCards.HomeSpacesData.class, lowerCase);
        String lowerCase2 = "NEW_CONVERSATION".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype2 = registerSubtype.registerSubtype(HomeCards.HomeNewConversationData.class, lowerCase2);
        String lowerCase3 = "RECENT_CONVERSATION".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype3 = registerSubtype2.registerSubtype(HomeCards.HomeRecentConversationData.class, lowerCase3);
        String lowerCase4 = "HELP_CENTER".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype4 = registerSubtype3.registerSubtype(HomeCards.HomeHelpCenterData.class, lowerCase4);
        String lowerCase5 = "EXTERNAL_LINKS".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype5 = registerSubtype4.registerSubtype(HomeCards.HomeExternalLinkData.class, lowerCase5);
        String lowerCase6 = "MESSENGER_APP".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype6 = registerSubtype5.registerSubtype(HomeCards.HomeMessengerAppData.class, lowerCase6);
        String lowerCase7 = "RECENT_TICKETS".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype7 = registerSubtype6.registerSubtype(HomeCards.HomeRecentTicketsData.class, lowerCase7);
        String lowerCase8 = "TICKET_LINKS".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase8, "toLowerCase(...)");
        RuntimeTypeAdapterFactory<HomeCards> registerIgnoredSubtype = registerSubtype7.registerSubtype(HomeCards.HomeTicketLinksData.class, lowerCase8).registerIgnoredSubtype(HomeCards.UnSupported.class, "UnSupported");
        Intrinsics.checkNotNullExpressionValue(registerIgnoredSubtype, "registerIgnoredSubtype(...)");
        return registerIgnoredSubtype;
    }

    private final RuntimeTypeAdapterFactory<Ticket.TicketAttribute> getTicketTypeAdapterFactory() {
        RuntimeTypeAdapterFactory of = RuntimeTypeAdapterFactory.of(Ticket.TicketAttribute.class, "type");
        String lowerCase = "STRING".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype = of.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase);
        String lowerCase2 = "INTEGER".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype2 = registerSubtype.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase2);
        String lowerCase3 = "FLOAT".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype3 = registerSubtype2.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase3);
        String lowerCase4 = "BOOLEAN".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype4 = registerSubtype3.registerSubtype(Ticket.TicketAttribute.PrimitiveAttribute.class, lowerCase4);
        String lowerCase5 = "LIST".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype5 = registerSubtype4.registerSubtype(Ticket.TicketAttribute.ListAttribute.class, lowerCase5);
        String lowerCase6 = "DATETIME".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
        RuntimeTypeAdapterFactory registerSubtype6 = registerSubtype5.registerSubtype(Ticket.TicketAttribute.DateTimeAttribute.class, lowerCase6);
        String lowerCase7 = "FILES".toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
        RuntimeTypeAdapterFactory<Ticket.TicketAttribute> registerIgnoredSubtype = registerSubtype6.registerSubtype(Ticket.TicketAttribute.FilesAttribute.class, lowerCase7).registerIgnoredSubtype(Ticket.TicketAttribute.UnSupported.class, "UnSupported");
        Intrinsics.checkNotNullExpressionValue(registerIgnoredSubtype, "registerIgnoredSubtype(...)");
        return registerIgnoredSubtype;
    }
}
