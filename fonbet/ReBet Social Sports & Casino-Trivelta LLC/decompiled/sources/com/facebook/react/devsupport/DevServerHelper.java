package com.facebook.react.devsupport;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.DevServerHelper;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.FileIoHandler;
import com.facebook.react.packagerconnection.JSPackagerClient;
import com.facebook.react.packagerconnection.NotificationOnlyHandler;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.util.RNLog;
import com.twilio.voice.EventGroupType;
import com.twilio.voice.VoiceURLConnection;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ti.AbstractC6473c;
import ti.C6472b;
import ti.InterfaceC6480j;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 O2\u00020\u0001:\u0003MNOB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020$J\u0006\u0010)\u001a\u00020$J\u0006\u0010*\u001a\u00020$J\u0006\u0010+\u001a\u00020$J6\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u000b2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0002\u00104\u001a\u000205H\u0007J\u0018\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000bH\u0002J6\u00109\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020;2\b\b\u0002\u00108\u001a\u00020\u000b2\b\b\u0002\u0010<\u001a\u00020\u001e2\b\b\u0002\u0010=\u001a\u00020\u001eH\u0002J\u0010\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000bH\u0016J\u0010\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000bH\u0016J\u0010\u0010A\u001a\u00020$2\u0006\u0010-\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000bH\u0016J\u0010\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000bH\u0016J\u0018\u0010F\u001a\u0004\u0018\u0001002\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010/\u001a\u000200J$\u0010H\u001a\u00020$2\b\u0010I\u001a\u0004\u0018\u00010J2\b\u0010K\u001a\u0004\u0018\u00010\u000b2\b\u0010L\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\rR\u0014\u0010\u001b\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006P"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper;", "", EventGroupType.SETTINGS_GROUP, "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "applicationContext", "Landroid/content/Context;", "packagerConnectionSettings", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "<init>", "(Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;Landroid/content/Context;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;)V", "websocketProxyURL", "", "getWebsocketProxyURL", "()Ljava/lang/String;", "client", "Lokhttp3/OkHttpClient;", "bundleDownloader", "Lcom/facebook/react/devsupport/BundleDownloader;", "packagerStatusCheck", "Lcom/facebook/react/devsupport/PackagerStatusCheck;", "packageName", "packagerClient", "Lcom/facebook/react/packagerconnection/JSPackagerClient;", "inspectorPackagerConnection", "Lcom/facebook/react/devsupport/IInspectorPackagerConnection;", "inspectorDeviceId", "getInspectorDeviceId", "inspectorDeviceUrl", "getInspectorDeviceUrl", "devMode", "", "getDevMode", "()Z", "jSMinifyMode", "getJSMinifyMode", "openPackagerConnection", "", "clientId", "commandListener", "Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", "closePackagerConnection", "openInspectorConnection", "disableDebugger", "closeInspectorConnection", "downloadBundleFromURL", "callback", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "outputFile", "Ljava/io/File;", "bundleURL", "bundleInfo", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "requestBuilder", "Lokhttp3/Request$Builder;", "createSplitBundleURL", "mainModuleID", "host", "createBundleURL", "type", "Lcom/facebook/react/devsupport/DevServerHelper$BundleType;", "modulesOnly", "runModule", "getDevServerBundleURL", "jsModulePath", "getDevServerSplitBundleURL", "isPackagerRunning", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "getSourceMapUrl", "mainModuleName", "getSourceUrl", "downloadBundleResourceFromUrlSync", "resourcePath", "openDebugger", "context", "Lcom/facebook/react/bridge/ReactContext;", "errorMessage", "panel", "PackagerCommandListener", "BundleType", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public class DevServerHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEBUGGER_MSG_DISABLE = "{ \"id\":1,\"method\":\"Debugger.disable\" }";
    private static final int HTTP_CONNECT_TIMEOUT_MS = 5000;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final BundleDownloader bundleDownloader;

    @NotNull
    private final OkHttpClient client;

    @Nullable
    private IInspectorPackagerConnection inspectorPackagerConnection;

    @NotNull
    private final String packageName;

    @Nullable
    private JSPackagerClient packagerClient;

    @NotNull
    private final PackagerConnectionSettings packagerConnectionSettings;

    @NotNull
    private final PackagerStatusCheck packagerStatusCheck;

    @NotNull
    private final DeveloperSettings settings;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$BundleType;", "", "typeID", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeID", "()Ljava/lang/String;", "BUNDLE", "MAP", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BundleType[] $VALUES;
        public static final BundleType BUNDLE = new BundleType("BUNDLE", 0, "bundle");
        public static final BundleType MAP = new BundleType("MAP", 1, "map");

        @NotNull
        private final String typeID;

        private static final /* synthetic */ BundleType[] $values() {
            return new BundleType[]{BUNDLE, MAP};
        }

        static {
            BundleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private BundleType(String str, int i10, String str2) {
            this.typeID = str2;
        }

        @NotNull
        public static EnumEntries<BundleType> getEntries() {
            return $ENTRIES;
        }

        public static BundleType valueOf(String str) {
            return (BundleType) Enum.valueOf(BundleType.class, str);
        }

        public static BundleType[] values() {
            return (BundleType[]) $VALUES.clone();
        }

        @NotNull
        public final String getTypeID() {
            return this.typeID;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$Companion;", "", "<init>", "()V", "HTTP_CONNECT_TIMEOUT_MS", "", "DEBUGGER_MSG_DISABLE", "", "getSHA256", "string", "createResourceURL", "host", "resourcePathParam", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createResourceURL(String host, String resourcePathParam) {
            if (StringsKt.startsWith$default(resourcePathParam, "/", false, 2, (Object) null)) {
                E6.a.K(ReactConstants.TAG, "Resource path should not begin with `/`, removing it.");
                resourcePathParam = resourcePathParam.substring(1);
                Intrinsics.checkNotNullExpressionValue(resourcePathParam, "substring(...)");
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "http://%s/%s", Arrays.copyOf(new Object[]{host, resourcePathParam}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getSHA256(String string) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.reset();
                try {
                    Charset forName = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                    byte[] bytes = string.getBytes(forName);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    byte[] digest = messageDigest.digest(bytes);
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String format = String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Arrays.copyOf(new Object[]{Byte.valueOf(digest[0]), Byte.valueOf(digest[1]), Byte.valueOf(digest[2]), Byte.valueOf(digest[3]), Byte.valueOf(digest[4]), Byte.valueOf(digest[5]), Byte.valueOf(digest[6]), Byte.valueOf(digest[7]), Byte.valueOf(digest[8]), Byte.valueOf(digest[9]), Byte.valueOf(digest[10]), Byte.valueOf(digest[11]), Byte.valueOf(digest[12]), Byte.valueOf(digest[13]), Byte.valueOf(digest[14]), Byte.valueOf(digest[15]), Byte.valueOf(digest[16]), Byte.valueOf(digest[17]), Byte.valueOf(digest[18]), Byte.valueOf(digest[19])}, 20));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return format;
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError("This environment doesn't support UTF-8 encoding", e10);
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new AssertionError("Could not get standard SHA-256 algorithm", e11);
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", "", "onPackagerConnected", "", "onPackagerDisconnected", "onPackagerReloadCommand", "onPackagerDevMenuCommand", "customCommandHandlers", "", "", "Lcom/facebook/react/packagerconnection/RequestHandler;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PackagerCommandListener {
        @Nullable
        Map<String, RequestHandler> customCommandHandlers();

        void onPackagerConnected();

        void onPackagerDevMenuCommand();

        void onPackagerDisconnected();

        void onPackagerReloadCommand();
    }

    public DevServerHelper(@NotNull DeveloperSettings settings, @NotNull Context applicationContext, @NotNull PackagerConnectionSettings packagerConnectionSettings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(packagerConnectionSettings, "packagerConnectionSettings");
        this.settings = settings;
        this.applicationContext = applicationContext;
        this.packagerConnectionSettings = packagerConnectionSettings;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient build = builder.connectTimeout(5000L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
        this.client = build;
        this.bundleDownloader = new BundleDownloader(build);
        this.packagerStatusCheck = new PackagerStatusCheck(build);
        String packageName = applicationContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.packageName = packageName;
    }

    private final String createBundleURL(String mainModuleID, BundleType type, String host, boolean modulesOnly, boolean runModule) {
        boolean devMode = getDevMode();
        StringBuilder sb2 = new StringBuilder();
        PackagerConnectionSettings packagerConnectionSettings = this.packagerConnectionSettings;
        for (Map.Entry<String, String> entry : packagerConnectionSettings.updatePackagerOptions(packagerConnectionSettings.getAdditionalOptionsForPackager()).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.length() != 0) {
                sb2.append("&" + key + "=" + Uri.encode(value));
            }
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", Arrays.copyOf(new Object[]{host, mainModuleID, type.getTypeID(), Boolean.valueOf(devMode), Boolean.valueOf(devMode), Boolean.valueOf(getJSMinifyMode()), this.packageName, modulesOnly ? "true" : Constants.CASEFIRST_FALSE, runModule ? "true" : Constants.CASEFIRST_FALSE}, 9));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format + (InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : "") + ((Object) sb2);
    }

    public static /* synthetic */ String createBundleURL$default(DevServerHelper devServerHelper, String str, BundleType bundleType, String str2, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBundleURL");
        }
        if ((i10 & 4) != 0) {
            str2 = devServerHelper.packagerConnectionSettings.getDebugServerHost();
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        return devServerHelper.createBundleURL(str, bundleType, str3, z12, z11);
    }

    private final String createSplitBundleURL(String mainModuleID, String host) {
        return createBundleURL(mainModuleID, BundleType.BUNDLE, host, true, false);
    }

    public static /* synthetic */ void downloadBundleFromURL$default(DevServerHelper devServerHelper, DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo, Request.Builder builder, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadBundleFromURL");
        }
        if ((i10 & 16) != 0) {
            builder = new Request.Builder();
        }
        devServerHelper.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, builder);
    }

    private final boolean getDevMode() {
        return this.settings.isJSDevModeEnabled();
    }

    private final String getInspectorDeviceId() {
        String str = this.packageName;
        String string = Settings.Secure.getString(this.applicationContext.getContentResolver(), "android_id");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "android-%s-%s-%s", Arrays.copyOf(new Object[]{str, string, InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return Companion.getSHA256(format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getInspectorDeviceUrl() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s&device=%s&profiling=%b", Arrays.copyOf(new Object[]{this.packagerConnectionSettings.getDebugServerHost(), Uri.encode(AndroidInfoHelpers.getFriendlyDeviceName()), Uri.encode(this.packageName), Uri.encode(getInspectorDeviceId()), Boolean.valueOf(InspectorFlags.getIsProfilingBuild())}, 5));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final boolean getJSMinifyMode() {
        return this.settings.isJSMinifyEnabled();
    }

    public final void closeInspectorConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper$closeInspectorConnection$1
            @Override // android.os.AsyncTask
            @Deprecated(message = "This class needs to be rewritten to don't use AsyncTasks")
            public Void doInBackground(Void... params) {
                IInspectorPackagerConnection iInspectorPackagerConnection;
                Intrinsics.checkNotNullParameter(params, "params");
                iInspectorPackagerConnection = DevServerHelper.this.inspectorPackagerConnection;
                if (iInspectorPackagerConnection != null) {
                    iInspectorPackagerConnection.closeQuietly();
                }
                DevServerHelper.this.inspectorPackagerConnection = null;
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void closePackagerConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper$closePackagerConnection$1
            @Override // android.os.AsyncTask
            @Deprecated(message = "This class needs to be rewritten to don't use AsyncTasks")
            public Void doInBackground(Void... params) {
                JSPackagerClient jSPackagerClient;
                Intrinsics.checkNotNullParameter(params, "params");
                jSPackagerClient = DevServerHelper.this.packagerClient;
                if (jSPackagerClient != null) {
                    jSPackagerClient.close();
                }
                DevServerHelper.this.packagerClient = null;
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void disableDebugger() {
        IInspectorPackagerConnection iInspectorPackagerConnection = this.inspectorPackagerConnection;
        if (iInspectorPackagerConnection != null) {
            iInspectorPackagerConnection.sendEventToAllConnections(DEBUGGER_MSG_DISABLE);
        }
    }

    @JvmOverloads
    public final void downloadBundleFromURL(@NotNull DevBundleDownloadListener callback, @NotNull File outputFile, @Nullable String str, @Nullable BundleDownloader.BundleInfo bundleInfo) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        downloadBundleFromURL$default(this, callback, outputFile, str, bundleInfo, null, 16, null);
    }

    @Nullable
    public final File downloadBundleResourceFromUrlSync(@NotNull String resourcePath, @NotNull File outputFile) {
        Intrinsics.checkNotNullParameter(resourcePath, "resourcePath");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        try {
            Response execute = this.client.newCall(new Request.Builder().url(Companion.createResourceURL(this.packagerConnectionSettings.getDebugServerHost(), resourcePath)).build()).execute();
            try {
                if (execute.isSuccessful() && execute.getBody() != null) {
                    ti.E c10 = AbstractC6473c.a().c(outputFile);
                    try {
                        C6472b a10 = AbstractC6473c.a();
                        ResponseBody body = execute.getBody();
                        InterfaceC6480j source = body != null ? body.getSource() : null;
                        Intrinsics.checkNotNull(source);
                        a10.b(source).K1(c10);
                        CloseableKt.closeFinally(c10, null);
                        CloseableKt.closeFinally(execute, null);
                        return outputFile;
                    } finally {
                    }
                }
                CloseableKt.closeFinally(execute, null);
                return null;
            } finally {
            }
        } catch (Exception e10) {
            E6.a.o(ReactConstants.TAG, "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", resourcePath, outputFile.getAbsolutePath(), e10);
            return null;
        }
    }

    @NotNull
    public String getDevServerBundleURL(@NotNull String jsModulePath) {
        Intrinsics.checkNotNullParameter(jsModulePath, "jsModulePath");
        return createBundleURL$default(this, jsModulePath, BundleType.BUNDLE, this.packagerConnectionSettings.getDebugServerHost(), false, false, 24, null);
    }

    @NotNull
    public String getDevServerSplitBundleURL(@NotNull String jsModulePath) {
        Intrinsics.checkNotNullParameter(jsModulePath, "jsModulePath");
        return createSplitBundleURL(jsModulePath, this.packagerConnectionSettings.getDebugServerHost());
    }

    @NotNull
    public String getSourceMapUrl(@NotNull String mainModuleName) {
        Intrinsics.checkNotNullParameter(mainModuleName, "mainModuleName");
        return createBundleURL$default(this, mainModuleName, BundleType.MAP, null, false, false, 28, null);
    }

    @NotNull
    public String getSourceUrl(@NotNull String mainModuleName) {
        Intrinsics.checkNotNullParameter(mainModuleName, "mainModuleName");
        return createBundleURL$default(this, mainModuleName, BundleType.BUNDLE, null, false, false, 28, null);
    }

    @NotNull
    public final String getWebsocketProxyURL() {
        return "ws://" + this.packagerConnectionSettings.getDebugServerHost() + "/debugger-proxy?role=client";
    }

    public void isPackagerRunning(@NotNull PackagerStatusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.packagerStatusCheck.run(this.packagerConnectionSettings.getDebugServerHost(), callback);
    }

    public final void openDebugger(@Nullable final ReactContext context, @Nullable final String errorMessage, @Nullable String panel) {
        StringBuilder sb2 = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "http://%s/open-debugger?device=%s", Arrays.copyOf(new Object[]{this.packagerConnectionSettings.getDebugServerHost(), Uri.encode(getInspectorDeviceId())}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb2.append(format);
        if (panel != null) {
            sb2.append("&panel=" + Uri.encode(panel));
        }
        Request.Builder builder = new Request.Builder();
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        this.client.newCall(builder.url(sb3).method(VoiceURLConnection.METHOD_TYPE_POST, RequestBody.INSTANCE.create((MediaType) null, "")).build()).enqueue(new Callback() { // from class: com.facebook.react.devsupport.DevServerHelper$openDebugger$1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e10) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                ReactContext reactContext = ReactContext.this;
                String str = errorMessage;
                if (str == null) {
                    str = "openDebugger error";
                }
                RNLog.w(reactContext, str);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
            }
        });
    }

    public final void openInspectorConnection() {
        if (this.inspectorPackagerConnection != null) {
            E6.a.K(ReactConstants.TAG, "Inspector connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper$openInspectorConnection$1
                @Override // android.os.AsyncTask
                @Deprecated(message = "This class needs to be rewritten to don't use AsyncTasks")
                public Void doInBackground(Void... params) {
                    Context context;
                    String inspectorDeviceUrl;
                    String str;
                    Intrinsics.checkNotNullParameter(params, "params");
                    context = DevServerHelper.this.applicationContext;
                    String str2 = AndroidInfoHelpers.getInspectorHostMetadata(context).get("deviceName");
                    if (str2 == null) {
                        E6.a.K(ReactConstants.TAG, "Could not get device name from Inspector Host Metadata.");
                        return null;
                    }
                    DevServerHelper devServerHelper = DevServerHelper.this;
                    inspectorDeviceUrl = DevServerHelper.this.getInspectorDeviceUrl();
                    str = DevServerHelper.this.packageName;
                    CxxInspectorPackagerConnection cxxInspectorPackagerConnection = new CxxInspectorPackagerConnection(inspectorDeviceUrl, str2, str);
                    cxxInspectorPackagerConnection.connect();
                    devServerHelper.inspectorPackagerConnection = cxxInspectorPackagerConnection;
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void openPackagerConnection(@Nullable final String clientId, @NotNull final PackagerCommandListener commandListener) {
        Intrinsics.checkNotNullParameter(commandListener, "commandListener");
        if (this.packagerClient != null) {
            E6.a.K(ReactConstants.TAG, "Packager connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1
                @Override // android.os.AsyncTask
                @Deprecated(message = "This needs to be rewritten to not use AsyncTasks")
                public Void doInBackground(Void... backgroundParams) {
                    PackagerConnectionSettings packagerConnectionSettings;
                    Intrinsics.checkNotNullParameter(backgroundParams, "backgroundParams");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    final DevServerHelper.PackagerCommandListener packagerCommandListener = DevServerHelper.PackagerCommandListener.this;
                    linkedHashMap.put("reload", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$1
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object params) {
                            DevServerHelper.PackagerCommandListener.this.onPackagerReloadCommand();
                        }
                    });
                    final DevServerHelper.PackagerCommandListener packagerCommandListener2 = DevServerHelper.PackagerCommandListener.this;
                    linkedHashMap.put("devMenu", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$2
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object params) {
                            DevServerHelper.PackagerCommandListener.this.onPackagerDevMenuCommand();
                        }
                    });
                    Map<String, RequestHandler> customCommandHandlers = DevServerHelper.PackagerCommandListener.this.customCommandHandlers();
                    if (customCommandHandlers != null) {
                        linkedHashMap.putAll(customCommandHandlers);
                    }
                    linkedHashMap.putAll(new FileIoHandler().handlers());
                    final DevServerHelper.PackagerCommandListener packagerCommandListener3 = DevServerHelper.PackagerCommandListener.this;
                    ReconnectingWebSocket.ConnectionCallback connectionCallback = new ReconnectingWebSocket.ConnectionCallback() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$onPackagerConnectedCallback$1
                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onConnected() {
                            DevServerHelper.PackagerCommandListener.this.onPackagerConnected();
                        }

                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onDisconnected() {
                            DevServerHelper.PackagerCommandListener.this.onPackagerDisconnected();
                        }
                    };
                    if (clientId == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    DevServerHelper devServerHelper = this;
                    String str = clientId;
                    packagerConnectionSettings = this.packagerConnectionSettings;
                    JSPackagerClient jSPackagerClient = new JSPackagerClient(str, packagerConnectionSettings, linkedHashMap, connectionCallback);
                    jSPackagerClient.init();
                    devServerHelper.packagerClient = jSPackagerClient;
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @JvmOverloads
    public final void downloadBundleFromURL(@NotNull DevBundleDownloadListener callback, @NotNull File outputFile, @Nullable String bundleURL, @Nullable BundleDownloader.BundleInfo bundleInfo, @NotNull Request.Builder requestBuilder) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        this.bundleDownloader.downloadBundleFromURL(callback, outputFile, bundleURL, bundleInfo, requestBuilder);
    }
}
