package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.facebook.react.common.ReactConstants;
import com.twilio.voice.VoiceURLConnection;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ti.AbstractC6473c;
import ti.G;
import ti.InterfaceC6479i;
import ti.k;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+¨\u0006."}, d2 = {"Lcom/facebook/react/modules/network/RequestBodyUtil;", "", "<init>", "()V", "", "encodingType", "", "isGzipEncoding", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "fileContentUriStr", "Ljava/io/InputStream;", "getFileInputStream", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;", "Landroid/net/Uri;", "uri", "getDownloadFileInputStream", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/InputStream;", "Lokhttp3/MediaType;", "mediaType", "body", "Lokhttp3/RequestBody;", "createGzip", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;", "Lti/G;", "source", "", "closeQuietly", "(Lti/G;)V", "inputStream", "create", "(Lokhttp3/MediaType;Ljava/io/InputStream;)Lokhttp3/RequestBody;", "requestBody", "Lcom/facebook/react/modules/network/ProgressListener;", "listener", "Lcom/facebook/react/modules/network/ProgressRequestBody;", "createProgressRequest", "(Lokhttp3/RequestBody;Lcom/facebook/react/modules/network/ProgressListener;)Lcom/facebook/react/modules/network/ProgressRequestBody;", "method", "getEmptyBody", "(Ljava/lang/String;)Lokhttp3/RequestBody;", "CONTENT_ENCODING_GZIP", "Ljava/lang/String;", "NAME", "TEMP_FILE_SUFFIX", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRequestBodyUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBodyUtil.kt\ncom/facebook/react/modules/network/RequestBodyUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,181:1\n739#2,9:182\n37#3:191\n36#3,3:192\n*S KotlinDebug\n*F\n+ 1 RequestBodyUtil.kt\ncom/facebook/react/modules/network/RequestBodyUtil\n*L\n68#1:182,9\n69#1:191\n69#1:192,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RequestBodyUtil {

    @NotNull
    private static final String CONTENT_ENCODING_GZIP = "gzip";

    @NotNull
    public static final RequestBodyUtil INSTANCE = new RequestBodyUtil();

    @NotNull
    private static final String NAME = "RequestBodyUtil";

    @NotNull
    private static final String TEMP_FILE_SUFFIX = "temp";

    private RequestBodyUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeQuietly(G source) {
        try {
            source.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable final MediaType mediaType, @NotNull final InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return new RequestBody() { // from class: com.facebook.react.modules.network.RequestBodyUtil$create$1
            @Override // okhttp3.RequestBody
            public long contentLength() {
                try {
                    return inputStream.available();
                } catch (IOException unused) {
                    return 0L;
                }
            }

            @Override // okhttp3.RequestBody
            /* renamed from: contentType, reason: from getter */
            public MediaType get$mediaType() {
                return MediaType.this;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(InterfaceC6479i sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                G g10 = null;
                try {
                    g10 = AbstractC6473c.a().e(inputStream);
                    sink.Y(g10);
                } finally {
                    if (g10 != null) {
                        RequestBodyUtil.INSTANCE.closeQuietly(g10);
                    }
                }
            }
        };
    }

    @JvmStatic
    @Nullable
    public static final RequestBody createGzip(@Nullable MediaType mediaType, @NotNull String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bytes = body.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            RequestBody.Companion companion = RequestBody.INSTANCE;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return RequestBody.Companion.create$default(companion, mediaType, byteArray, 0, 0, 12, (Object) null);
        } catch (IOException unused) {
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final ProgressRequestBody createProgressRequest(@NotNull RequestBody requestBody, @NotNull ProgressListener listener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new ProgressRequestBody(requestBody, listener);
    }

    private final InputStream getDownloadFileInputStream(Context context, Uri uri) {
        File createTempFile = File.createTempFile(NAME, TEMP_FILE_SUFFIX, context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            InputStream openStream = url.openStream();
            try {
                ReadableByteChannel newChannel = Channels.newChannel(openStream);
                try {
                    fileOutputStream.getChannel().transferFrom(newChannel, 0L, LongCompanionObject.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    CloseableKt.closeFinally(newChannel, null);
                    CloseableKt.closeFinally(openStream, null);
                    CloseableKt.closeFinally(fileOutputStream, null);
                    return fileInputStream;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @JvmStatic
    @Nullable
    public static final RequestBody getEmptyBody(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        int hashCode = method.hashCode();
        if (hashCode == 79599 ? method.equals("PUT") : hashCode == 2461856 ? method.equals(VoiceURLConnection.METHOD_TYPE_POST) : hashCode == 75900968 && method.equals("PATCH")) {
            return RequestBody.INSTANCE.create((MediaType) null, k.f65868d);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final InputStream getFileInputStream(@NotNull Context context, @NotNull String fileContentUriStr) {
        List emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileContentUriStr, "fileContentUriStr");
        try {
            Uri parse = Uri.parse(fileContentUriStr);
            String scheme = parse.getScheme();
            if (scheme != null && StringsKt.startsWith$default(scheme, "http", false, 2, (Object) null)) {
                RequestBodyUtil requestBodyUtil = INSTANCE;
                Intrinsics.checkNotNull(parse);
                return requestBodyUtil.getDownloadFileInputStream(context, parse);
            }
            if (!StringsKt.startsWith$default(fileContentUriStr, "data:", false, 2, (Object) null)) {
                return context.getContentResolver().openInputStream(parse);
            }
            List<String> split = new Regex(",").split(fileContentUriStr, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            return new ByteArrayInputStream(Base64.decode(((String[]) emptyList.toArray(new String[0]))[1], 0));
        } catch (Exception e10) {
            E6.a.n(ReactConstants.TAG, "Could not retrieve file for contentUri " + fileContentUriStr, e10);
            return null;
        }
    }

    @JvmStatic
    public static final boolean isGzipEncoding(@Nullable String encodingType) {
        return StringsKt.equals(CONTENT_ENCODING_GZIP, encodingType, true);
    }
}
