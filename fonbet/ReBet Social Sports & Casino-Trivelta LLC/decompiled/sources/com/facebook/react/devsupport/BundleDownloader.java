package com.facebook.react.devsupport;

import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.MultipartStreamReader;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import ti.AbstractC6473c;
import ti.C6478h;
import ti.InterfaceC6480j;
import zendesk.core.Constants;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0002&%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader;", "", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "", EventKeys.URL, "Lokhttp3/Response;", "response", "boundary", "Ljava/io/File;", "outputFile", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "bundleInfo", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "callback", "", "processMultipartResponse", "(Ljava/lang/String;Lokhttp3/Response;Ljava/lang/String;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V", "", "statusCode", "Lokhttp3/Headers;", "headers", "Lti/j;", "body", "processBundleResult", "(Ljava/lang/String;ILokhttp3/Headers;Lti/j;Ljava/io/File;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;)V", "bundleURL", "Lokhttp3/Request$Builder;", "requestBuilder", "downloadBundleFromURL", "(Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Lokhttp3/Request$Builder;)V", "Lokhttp3/OkHttpClient;", "Lokhttp3/Call;", "downloadBundleFromURLCall", "Lokhttp3/Call;", "Companion", "BundleInfo", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BundleDownloader {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;

    @NotNull
    private static final String TAG = "BundleDownloader";

    @NotNull
    private final OkHttpClient client;

    @Nullable
    private Call downloadBundleFromURLCall;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "", "<init>", "()V", "_url", "", "get_url$ReactAndroid_release", "()Ljava/lang/String;", "set_url$ReactAndroid_release", "(Ljava/lang/String;)V", EventKeys.URL, "getUrl", EventKeys.VALUE_KEY, "", "filesChangedCount", "getFilesChangedCount", "()I", "setFilesChangedCount$ReactAndroid_release", "(I)V", "toJSONString", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundleInfo {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Nullable
        private String _url;
        private int filesChangedCount;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo$Companion;", "", "<init>", "()V", "fromJSONString", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "jsonStr", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @Nullable
            public final BundleInfo fromJSONString(@Nullable String jsonStr) {
                if (jsonStr == null) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(jsonStr);
                    BundleInfo bundleInfo = new BundleInfo();
                    bundleInfo.set_url$ReactAndroid_release(jSONObject.getString(EventKeys.URL));
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(jSONObject.getInt("filesChangedCount"));
                    return bundleInfo;
                } catch (JSONException e10) {
                    E6.a.n(BundleDownloader.TAG, "Invalid bundle info: ", e10);
                    return null;
                }
            }

            private Companion() {
            }
        }

        @JvmStatic
        @Nullable
        public static final BundleInfo fromJSONString(@Nullable String str) {
            return INSTANCE.fromJSONString(str);
        }

        public final int getFilesChangedCount() {
            return this.filesChangedCount;
        }

        @NotNull
        public final String getUrl() {
            String str = this._url;
            return str == null ? "unknown" : str;
        }

        @Nullable
        /* renamed from: get_url$ReactAndroid_release, reason: from getter */
        public final String get_url() {
            return this._url;
        }

        public final void setFilesChangedCount$ReactAndroid_release(int i10) {
            this.filesChangedCount = i10;
        }

        public final void set_url$ReactAndroid_release(@Nullable String str) {
            this._url = str;
        }

        @Nullable
        public final String toJSONString() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(EventKeys.URL, this._url);
                jSONObject.put("filesChangedCount", this.filesChangedCount);
                return jSONObject.toString();
            } catch (JSONException e10) {
                E6.a.n(BundleDownloader.TAG, "Can't serialize bundle info: ", e10);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/devsupport/BundleDownloader$Companion;", "", "<init>", "()V", "Lti/j;", "body", "Ljava/io/File;", "outputFile", "", "storePlainJSInFile", "(Lti/j;Ljava/io/File;)Z", "", EventKeys.URL, "Lokhttp3/Headers;", "headers", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "bundleInfo", "", "populateBundleInfo", "(Ljava/lang/String;Lokhttp3/Headers;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;)V", "TAG", "Ljava/lang/String;", "", "FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER", "I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBundleDownloader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleDownloader.kt\ncom/facebook/react/devsupport/BundleDownloader$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void populateBundleInfo(String url, Headers headers, BundleInfo bundleInfo) {
            bundleInfo.set_url$ReactAndroid_release(url);
            String str = headers.get("X-Metro-Files-Changed-Count");
            if (str != null) {
                try {
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(Integer.parseInt(str));
                } catch (NumberFormatException e10) {
                    bundleInfo.setFilesChangedCount$ReactAndroid_release(-2);
                    E6.a.n(BundleDownloader.TAG, "Can't populate bundle info: ", e10);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean storePlainJSInFile(InterfaceC6480j body, File outputFile) {
            ti.E c10 = AbstractC6473c.a().c(outputFile);
            try {
                body.K1(c10);
                CloseableKt.closeFinally(c10, null);
                return true;
            } finally {
            }
        }

        private Companion() {
        }
    }

    public BundleDownloader(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    public static /* synthetic */ void downloadBundleFromURL$default(BundleDownloader bundleDownloader, DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo, Request.Builder builder, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            builder = new Request.Builder();
        }
        bundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processBundleResult(String url, int statusCode, Headers headers, InterfaceC6480j body, File outputFile, BundleInfo bundleInfo, DevBundleDownloadListener callback) {
        if (statusCode == 200) {
            if (bundleInfo != null) {
                INSTANCE.populateBundleInfo(url, headers, bundleInfo);
            }
            File file = new File(outputFile.getPath() + ".tmp");
            if (!INSTANCE.storePlainJSInFile(body, file) || file.renameTo(outputFile)) {
                callback.onSuccess();
                return;
            }
            throw new IOException("Couldn't rename " + file + " to " + outputFile);
        }
        String G12 = body.G1();
        DebugServerException parse = DebugServerException.INSTANCE.parse(url, G12);
        if (parse != null) {
            callback.onFailure(parse);
            return;
        }
        String str = "The development server returned response error code: " + statusCode + "\n\nURL: " + url + "\n\nBody:\n" + G12;
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        callback.onFailure(new DebugServerException(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processMultipartResponse(final String url, final Response response, String boundary, final File outputFile, final BundleInfo bundleInfo, final DevBundleDownloadListener callback) {
        if (response.getBody() == null) {
            callback.onFailure(new DebugServerException(StringsKt.trimIndent("\n                    Error while reading multipart response.\n                    \n                    Response body was empty: " + response.getCode() + "\n                    \n                    URL: " + url + "\n                    \n                    \n                    ")));
            return;
        }
        ResponseBody body = response.getBody();
        InterfaceC6480j source = body != null ? body.getSource() : null;
        if (source == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (new MultipartStreamReader(source, boundary).readAllParts(new MultipartStreamReader.ChunkListener() { // from class: com.facebook.react.devsupport.BundleDownloader$processMultipartResponse$completed$1
            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkComplete(Map<String, String> headers, C6478h body2, boolean isLastChunk) {
                Intrinsics.checkNotNullParameter(headers, "headers");
                Intrinsics.checkNotNullParameter(body2, "body");
                if (isLastChunk) {
                    int code = Response.this.getCode();
                    if (headers.containsKey("X-Http-Status")) {
                        code = Integer.parseInt(headers.getOrDefault("X-Http-Status", "0"));
                    }
                    this.processBundleResult(url, code, Headers.INSTANCE.m1668deprecated_of(headers), body2, outputFile, bundleInfo, callback);
                    return;
                }
                if (headers.containsKey("Content-Type") && Intrinsics.areEqual(headers.get("Content-Type"), "application/json")) {
                    try {
                        JSONObject jSONObject = new JSONObject(body2.G1());
                        callback.onProgress(jSONObject.has("status") ? jSONObject.getString("status") : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                    } catch (JSONException e10) {
                        E6.a.m(ReactConstants.TAG, "Error parsing progress JSON. " + e10);
                    }
                }
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkProgress(Map<String, String> headers, long loaded, long total) {
                Intrinsics.checkNotNullParameter(headers, "headers");
                if (Intrinsics.areEqual("application/javascript", headers.get("Content-Type"))) {
                    long j10 = 1024;
                    callback.onProgress("Downloading", Integer.valueOf((int) (loaded / j10)), Integer.valueOf((int) (total / j10)));
                }
            }
        })) {
            return;
        }
        callback.onFailure(new DebugServerException(StringsKt.trimIndent("\n                    Error while reading multipart response.\n                    \n                    Response code: " + response.getCode() + "\n                    \n                    URL: " + url + "\n                    \n                    \n                    ")));
    }

    @JvmOverloads
    public final void downloadBundleFromURL(@NotNull DevBundleDownloadListener callback, @NotNull File outputFile, @Nullable String str, @Nullable BundleInfo bundleInfo) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        downloadBundleFromURL$default(this, callback, outputFile, str, bundleInfo, null, 16, null);
    }

    @JvmOverloads
    public final void downloadBundleFromURL(@NotNull final DevBundleDownloadListener callback, @NotNull final File outputFile, @Nullable String bundleURL, @Nullable final BundleInfo bundleInfo, @NotNull Request.Builder requestBuilder) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(requestBuilder, "requestBuilder");
        if (bundleURL == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Call newCall = this.client.newCall(requestBuilder.url(bundleURL).addHeader(Constants.ACCEPT_HEADER, "multipart/mixed").build());
        this.downloadBundleFromURLCall = newCall;
        if (newCall == null) {
            throw new IllegalStateException("Required value was null.");
        }
        newCall.enqueue(new Callback() { // from class: com.facebook.react.devsupport.BundleDownloader$downloadBundleFromURL$1
            /* JADX WARN: Code restructure failed: missing block: B:3:0x0013, code lost:
            
                r0 = r4.this$0.downloadBundleFromURLCall;
             */
            @Override // okhttp3.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onFailure(Call call, IOException e10) {
                Call call2;
                Call call3;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e10, "e");
                call2 = BundleDownloader.this.downloadBundleFromURLCall;
                if (call2 == null || (call3 != null && call3.getCanceled())) {
                    BundleDownloader.this.downloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.downloadBundleFromURLCall = null;
                String url = call.request().getUrl().getUrl();
                callback.onFailure(DebugServerException.INSTANCE.makeGeneric(url, "Could not connect to development server.", "URL: " + url, e10));
            }

            /* JADX WARN: Code restructure failed: missing block: B:54:0x0024, code lost:
            
                if (r11.getCanceled() == true) goto L10;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v15, types: [okhttp3.Response] */
            /* JADX WARN: Type inference failed for: r11v17 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v4 */
            /* JADX WARN: Type inference failed for: r11v5, types: [okhttp3.Call] */
            /* JADX WARN: Type inference failed for: r11v6 */
            @Override // okhttp3.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onResponse(Call call, Response response) {
                ?? r11;
                Throwable th2;
                Response response2;
                Call call2;
                Response response3;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                BundleDownloader bundleDownloader = BundleDownloader.this;
                File file = outputFile;
                BundleDownloader.BundleInfo bundleInfo2 = bundleInfo;
                DevBundleDownloadListener devBundleDownloadListener = callback;
                try {
                    r11 = bundleDownloader.downloadBundleFromURLCall;
                    try {
                        if (r11 != 0) {
                            call2 = bundleDownloader.downloadBundleFromURLCall;
                            if (call2 != null) {
                                try {
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    response2 = response;
                                    try {
                                        throw th2;
                                    } catch (Throwable th4) {
                                        CloseableKt.closeFinally(response2, th2);
                                        throw th4;
                                    }
                                }
                            }
                            bundleDownloader.downloadBundleFromURLCall = null;
                            String url = response.getRequest().getUrl().getUrl();
                            String header$default = Response.header$default(response, "content-type", null, 2, null);
                            if (header$default == null) {
                                header$default = "";
                            }
                            Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(header$default);
                            if (header$default.length() <= 0 || !matcher.find()) {
                                r11 = response;
                                ResponseBody body = r11.getBody();
                                if (body != null) {
                                    try {
                                        bundleDownloader.processBundleResult(url, r11.getCode(), r11.getHeaders(), body.getSource(), file, bundleInfo2, devBundleDownloadListener);
                                    } finally {
                                    }
                                }
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(body, null);
                                response3 = r11;
                            } else {
                                String str = (String) S7.a.c(matcher.group(1));
                                Intrinsics.checkNotNull(str);
                                try {
                                    bundleDownloader.processMultipartResponse(url, response, str, file, bundleInfo2, devBundleDownloadListener);
                                    response3 = response;
                                } catch (Throwable th5) {
                                    th = th5;
                                    r11 = response;
                                    th2 = th;
                                    response2 = r11;
                                    throw th2;
                                }
                            }
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(response3, null);
                            return;
                        }
                        bundleDownloader.downloadBundleFromURLCall = null;
                        CloseableKt.closeFinally(response, null);
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r11 = response;
                }
            }
        });
    }
}
