package com.reactnativecompressor.Utils;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.feature.orchestrator.presentation.viewmodel.UnstructuredDocViewModelExtKt;
import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: Uploader.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eJ(\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J \u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020+H\u0003J\u0018\u0010,\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+J\f\u0010.\u001a\u00020\u0019*\u00020/H\u0002J\f\u00100\u001a\u00020+*\u00020/H\u0002J\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u000203H\u0002J\u0016\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u000207R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\r¨\u00068"}, d2 = {"Lcom/reactnativecompressor/Utils/Uploader;", "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", AnalyticsConstantsKt.KEY_CLIENT, "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "setClient", "(Lokhttp3/OkHttpClient;)V", "MIN_EVENT_DT_MS", "", "getMIN_EVENT_DT_MS", "()J", "httpCallManager", "Lcom/reactnativecompressor/Utils/HttpCallManager;", "getHttpCallManager", "()Lcom/reactnativecompressor/Utils/HttpCallManager;", UnstructuredDocViewModelExtKt.UPLOAD, "", "fileUriString", "_options", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "okHttpClient", "getOkHttpClient", "createUploadRequest", "Lokhttp3/Request;", "url", "options", "Lcom/reactnativecompressor/Utils/UploaderOptions;", "decorator", "Lcom/reactnativecompressor/Utils/RequestBodyDecorator;", "createRequestBody", "Lokhttp3/RequestBody;", "file", "Ljava/io/File;", "getContentType", "context", "checkIfFileExists", "Landroid/net/Uri;", "toFile", "translateHeaders", "headers", "Lokhttp3/Headers;", "cancelUpload", "uuid", "shouldCancelAll", "", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Uploader {
    private final long MIN_EVENT_DT_MS;
    private final String TAG;
    private OkHttpClient client;
    private final HttpCallManager httpCallManager;
    private final ReactApplicationContext reactContext;

    /* compiled from: Uploader.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UploadType.values().length];
            try {
                iArr[UploadType.BINARY_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UploadType.MULTIPART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Uploader(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.TAG = "asyncTaskUploader";
        this.MIN_EVENT_DT_MS = 100L;
        this.httpCallManager = new HttpCallManager();
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final void setClient(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public final long getMIN_EVENT_DT_MS() {
        return this.MIN_EVENT_DT_MS;
    }

    public final HttpCallManager getHttpCallManager() {
        return this.httpCallManager;
    }

    public final void upload(String fileUriString, ReadableMap _options, ReactApplicationContext reactContext, final Promise promise) {
        Intrinsics.checkNotNullParameter(fileUriString, "fileUriString");
        Intrinsics.checkNotNullParameter(_options, "_options");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        UploaderOptions convertReadableMapToUploaderOptions = UploaderHelperKt.convertReadableMapToUploaderOptions(_options);
        String url = convertReadableMapToUploaderOptions.getUrl();
        final String uuid = convertReadableMapToUploaderOptions.getUuid();
        final CountingRequestListener countingRequestListener = new CountingRequestListener() { // from class: com.reactnativecompressor.Utils.Uploader$upload$progressListener$1
            private long mLastUpdate = -1;

            @Override // com.reactnativecompressor.Utils.CountingRequestListener
            public void onProgress(long bytesWritten, long contentLength) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > this.mLastUpdate + Uploader.this.getMIN_EVENT_DT_MS() || bytesWritten == contentLength) {
                    this.mLastUpdate = currentTimeMillis;
                    EventEmitterHandler.INSTANCE.sendUploadProgressEvent(bytesWritten, contentLength, uuid);
                }
            }
        };
        Request createUploadRequest = createUploadRequest(url, fileUriString, convertReadableMapToUploaderOptions, new RequestBodyDecorator() { // from class: com.reactnativecompressor.Utils.Uploader$$ExternalSyntheticLambda0
            @Override // com.reactnativecompressor.Utils.RequestBodyDecorator
            public final RequestBody decorate(RequestBody requestBody) {
                RequestBody upload$lambda$0;
                upload$lambda$0 = Uploader.upload$lambda$0(CountingRequestListener.this, requestBody);
                return upload$lambda$0;
            }
        });
        OkHttpClient okHttpClient = getOkHttpClient();
        if (okHttpClient != null) {
            Call newCall = okHttpClient.newCall(createUploadRequest);
            this.httpCallManager.registerTask(newCall, uuid);
            newCall.enqueue(new Callback() { // from class: com.reactnativecompressor.Utils.Uploader$upload$1$1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "e");
                    Log.e(Uploader.this.getTAG(), String.valueOf(e.getMessage()));
                    promise.reject(Uploader.this.getTAG(), e.getMessage());
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    ReadableMap translateHeaders;
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("status", response.code());
                    ResponseBody body = response.body();
                    createMap.putString("body", body != null ? body.string() : null);
                    translateHeaders = Uploader.this.translateHeaders(response.headers());
                    createMap.putMap("headers", translateHeaders);
                    response.close();
                    promise.resolve(createMap);
                }
            });
            return;
        }
        promise.reject(new UploaderOkHttpNullException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestBody upload$lambda$0(CountingRequestListener countingRequestListener, RequestBody requestBody) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return new CountingRequestBody(requestBody, countingRequestListener);
    }

    private final synchronized OkHttpClient getOkHttpClient() {
        if (this.client == null) {
            this.client = new OkHttpClient.Builder().connectTimeout(60L, TimeUnit.SECONDS).readTimeout(60L, TimeUnit.SECONDS).writeTimeout(60L, TimeUnit.SECONDS).build();
        }
        return this.client;
    }

    private final Request createUploadRequest(String url, String fileUriString, UploaderOptions options, RequestBodyDecorator decorator) throws IOException {
        Uri parse = Uri.parse(Utils.INSTANCE.slashifyFilePath(fileUriString));
        Intrinsics.checkNotNull(parse);
        checkIfFileExists(parse);
        Request.Builder url2 = new Request.Builder().url(url);
        Map<String, String> headers = options.getHeaders();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                url2.addHeader(entry.getKey(), entry.getValue());
            }
        }
        return url2.method(options.getHttpMethod().getValue(), createRequestBody(options, decorator, toFile(parse))).build();
    }

    private final RequestBody createRequestBody(UploaderOptions options, RequestBodyDecorator decorator, File file) {
        String contentType;
        int i = WhenMappings.$EnumSwitchMapping$0[options.getUploadType().ordinal()];
        if (i == 1) {
            String mimeType = options.getMimeType();
            if (mimeType != null && mimeType.length() > 0) {
                contentType = options.getMimeType();
            } else {
                contentType = getContentType(this.reactContext, file);
                if (contentType == null) {
                    contentType = "application/octet-stream";
                }
            }
            return decorator.decorate(RequestBody.INSTANCE.create(file, contentType != null ? MediaType.INSTANCE.parse(contentType) : null));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        MultipartBody.Builder type = new MultipartBody.Builder(null, 1, null).setType(MultipartBody.FORM);
        Map<String, String> parameters = options.getParameters();
        if (parameters != null) {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                type.addFormDataPart(entry.getKey(), entry.getValue().toString());
            }
        }
        String mimeType2 = options.getMimeType();
        if (mimeType2 == null) {
            mimeType2 = URLConnection.guessContentTypeFromName(file.getName());
            Intrinsics.checkNotNullExpressionValue(mimeType2, "guessContentTypeFromName(...)");
        }
        String fieldName = options.getFieldName();
        if (fieldName == null) {
            fieldName = file.getName();
        }
        Intrinsics.checkNotNull(fieldName);
        type.addFormDataPart(fieldName, file.getName(), decorator.decorate(RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse(mimeType2))));
        return type.build();
    }

    public final String getContentType(ReactApplicationContext context, File file) {
        String fileExtensionFromUrl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        Uri fromFile = Uri.fromFile(file);
        String type = contentResolver.getType(fromFile);
        if (type != null || (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(fromFile.toString())) == null) {
            return type;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    private final void checkIfFileExists(Uri uri) throws IOException {
        File file = toFile(uri);
        if (file.exists()) {
            return;
        }
        throw new IOException("Directory for '" + file.getPath() + "' doesn't exist.");
    }

    private final File toFile(Uri uri) {
        if (uri.getPath() != null) {
            String path = uri.getPath();
            Intrinsics.checkNotNull(path);
            return new File(path);
        }
        throw new IOException("Invalid Uri: " + uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReadableMap translateHeaders(Headers headers) {
        WritableMap createMap = Arguments.createMap();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (createMap.hasKey(name)) {
                createMap.putString(name, createMap.getString(name) + ", " + headers.value(i));
            } else {
                createMap.putString(name, headers.value(i));
            }
        }
        return createMap;
    }

    public final void cancelUpload(String uuid, boolean shouldCancelAll) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (shouldCancelAll) {
            this.httpCallManager.cancelAllTasks();
            return;
        }
        if (Intrinsics.areEqual(uuid, "")) {
            Call taskPop = this.httpCallManager.taskPop();
            if (taskPop != null) {
                taskPop.cancel();
                return;
            }
            return;
        }
        Call uploadTaskForId = this.httpCallManager.uploadTaskForId(uuid);
        if (uploadTaskForId != null) {
            uploadTaskForId.cancel();
        }
    }
}
