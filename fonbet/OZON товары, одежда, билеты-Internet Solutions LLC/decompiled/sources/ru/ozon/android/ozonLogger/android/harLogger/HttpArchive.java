package ru.ozon.android.ozonLogger.android.harLogger;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive;", "", "log", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Log;", "<init>", "(Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Log;)V", "getLog", "()Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Log;", "Log", "Creator", "HarEntry", "Request", "Response", "Cookie", "Header", "Query", "PostData", "Params", "Content", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HttpArchive {

    @NotNull
    private final Log log;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Content;", "", "size", "", "compression", "mimeType", "", "text", "encoding", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSize", "()I", "getCompression", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMimeType", "()Ljava/lang/String;", "getText", "getEncoding", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Content {
        private final Integer compression;
        private final String encoding;

        @NotNull
        private final String mimeType;
        private final int size;

        @NotNull
        private final String text;

        public Content(int i11, Integer num, @NotNull String mimeType, @NotNull String text, String str) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Intrinsics.checkNotNullParameter(text, "text");
            this.size = i11;
            this.compression = num;
            this.mimeType = mimeType;
            this.text = text;
            this.encoding = str;
        }

        public final Integer getCompression() {
            return this.compression;
        }

        public final String getEncoding() {
            return this.encoding;
        }

        @NotNull
        public final String getMimeType() {
            return this.mimeType;
        }

        public final int getSize() {
            return this.size;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Cookie;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cookie {

        @NotNull
        private final String name;

        public Cookie(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Creator;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "version", "commitHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVersion", "getCommitHash", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Creator {

        @NotNull
        private final String commitHash;

        @NotNull
        private final String name;

        @NotNull
        private final String version;

        public Creator(@NotNull String name, @NotNull String version, @NotNull String commitHash) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(commitHash, "commitHash");
            this.name = name;
            this.version = version;
            this.commitHash = commitHash;
        }

        @NotNull
        public final String getCommitHash() {
            return this.commitHash;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getVersion() {
            return this.version;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$HarEntry;", "", "startedDateTime", "", "time", "", "request", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Request;", "response", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Response;", "<init>", "(Ljava/lang/String;ILru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Request;Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Response;)V", "getStartedDateTime", "()Ljava/lang/String;", "getTime", "()I", "getRequest", "()Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Request;", "getResponse", "()Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Response;", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class HarEntry {

        @NotNull
        private final Request request;

        @NotNull
        private final Response response;

        @NotNull
        private final String startedDateTime;
        private final int time;

        public HarEntry(@NotNull String startedDateTime, int i11, @NotNull Request request, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(startedDateTime, "startedDateTime");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            this.startedDateTime = startedDateTime;
            this.time = i11;
            this.request = request;
            this.response = response;
        }

        @NotNull
        public final Request getRequest() {
            return this.request;
        }

        @NotNull
        public final Response getResponse() {
            return this.response;
        }

        @NotNull
        public final String getStartedDateTime() {
            return this.startedDateTime;
        }

        public final int getTime() {
            return this.time;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Header;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Header {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public Header(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Params;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "fileName", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "getFileName", "getContentType", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Params {
        private final String contentType;
        private final String fileName;

        @NotNull
        private final String name;
        private final String value;

        public Params(@NotNull String name, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.value = str;
            this.fileName = str2;
            this.contentType = str3;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getFileName() {
            return this.fileName;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Query;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Query {

        @NotNull
        private final String name;

        @NotNull
        private final String value;

        public Query(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B_\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Response;", "", "status", "", "statusText", "", "httpVersion", "cookies", "", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Cookie;", "headers", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Header;", "content", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Content;", "redirectURL", "headersSize", "bodySize", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Content;Ljava/lang/String;II)V", "getStatus", "()I", "getStatusText", "()Ljava/lang/String;", "getHttpVersion", "getCookies", "()Ljava/util/List;", "getHeaders", "getContent", "()Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Content;", "getRedirectURL", "getHeadersSize", "getBodySize", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Response {
        private final int bodySize;
        private final Content content;

        @NotNull
        private final List<Cookie> cookies;

        @NotNull
        private final List<Header> headers;
        private final int headersSize;

        @NotNull
        private final String httpVersion;

        @NotNull
        private final String redirectURL;
        private final int status;

        @NotNull
        private final String statusText;

        public Response(int i11, @NotNull String statusText, @NotNull String httpVersion, @NotNull List<Cookie> cookies, @NotNull List<Header> headers, Content content, @NotNull String redirectURL, int i12, int i13) {
            Intrinsics.checkNotNullParameter(statusText, "statusText");
            Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
            Intrinsics.checkNotNullParameter(cookies, "cookies");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(redirectURL, "redirectURL");
            this.status = i11;
            this.statusText = statusText;
            this.httpVersion = httpVersion;
            this.cookies = cookies;
            this.headers = headers;
            this.content = content;
            this.redirectURL = redirectURL;
            this.headersSize = i12;
            this.bodySize = i13;
        }

        public final int getBodySize() {
            return this.bodySize;
        }

        public final Content getContent() {
            return this.content;
        }

        @NotNull
        public final List<Cookie> getCookies() {
            return this.cookies;
        }

        @NotNull
        public final List<Header> getHeaders() {
            return this.headers;
        }

        public final int getHeadersSize() {
            return this.headersSize;
        }

        @NotNull
        public final String getHttpVersion() {
            return this.httpVersion;
        }

        @NotNull
        public final String getRedirectURL() {
            return this.redirectURL;
        }

        public final int getStatus() {
            return this.status;
        }

        @NotNull
        public final String getStatusText() {
            return this.statusText;
        }
    }

    public HttpArchive(@NotNull Log log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.log = log;
    }

    @NotNull
    public final Log getLog() {
        return this.log;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$PostData;", "", "mimeType", "", "params", "", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Params;", "text", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMimeType", "()Ljava/lang/String;", "getParams", "()Ljava/util/List;", "getText", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PostData {

        @NotNull
        private final String mimeType;
        private final List<Params> params;
        private final String text;

        public PostData(@NotNull String mimeType, List<Params> list, String str) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.mimeType = mimeType;
            this.params = list;
            this.text = str;
        }

        @NotNull
        public final String getMimeType() {
            return this.mimeType;
        }

        public final List<Params> getParams() {
            return this.params;
        }

        public final String getText() {
            return this.text;
        }

        public /* synthetic */ PostData(String str, List list, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B3\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Log;", "", "version", "", "creator", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Creator;", "browser", "entries", "", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$HarEntry;", "<init>", "(Ljava/lang/String;Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Creator;Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Creator;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getCreator", "()Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Creator;", "getBrowser", "getEntries", "()Ljava/util/List;", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Log {
        private final Creator browser;

        @NotNull
        private final Creator creator;

        @NotNull
        private final List<HarEntry> entries;

        @NotNull
        private final String version;

        public Log(@NotNull String version, @NotNull Creator creator, Creator creator2, @NotNull List<HarEntry> entries) {
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(creator, "creator");
            Intrinsics.checkNotNullParameter(entries, "entries");
            this.version = version;
            this.creator = creator;
            this.browser = creator2;
            this.entries = entries;
        }

        public final Creator getBrowser() {
            return this.browser;
        }

        @NotNull
        public final Creator getCreator() {
            return this.creator;
        }

        @NotNull
        public final List<HarEntry> getEntries() {
            return this.entries;
        }

        @NotNull
        public final String getVersion() {
            return this.version;
        }

        public /* synthetic */ Log(String str, Creator creator, Creator creator2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "1.2" : str, creator, creator2, list);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001Bg\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Request;", "", "method", "", ImagesContract.URL, "httpVersion", "cookies", "", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Cookie;", "headers", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Header;", "queryString", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$Query;", "postData", "Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$PostData;", "headersSize", "", "bodySize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$PostData;II)V", "getMethod", "()Ljava/lang/String;", "getUrl", "getHttpVersion", "getCookies", "()Ljava/util/List;", "getHeaders", "getQueryString", "getPostData", "()Lru/ozon/android/ozonLogger/android/harLogger/HttpArchive$PostData;", "getHeadersSize", "()I", "getBodySize", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Request {
        private final int bodySize;

        @NotNull
        private final List<Cookie> cookies;

        @NotNull
        private final List<Header> headers;
        private final int headersSize;

        @NotNull
        private final String httpVersion;

        @NotNull
        private final String method;
        private final PostData postData;

        @NotNull
        private final List<Query> queryString;

        @NotNull
        private final String url;

        public Request(@NotNull String method, @NotNull String url, @NotNull String httpVersion, @NotNull List<Cookie> cookies, @NotNull List<Header> headers, @NotNull List<Query> queryString, PostData postData, int i11, int i12) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
            Intrinsics.checkNotNullParameter(cookies, "cookies");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(queryString, "queryString");
            this.method = method;
            this.url = url;
            this.httpVersion = httpVersion;
            this.cookies = cookies;
            this.headers = headers;
            this.queryString = queryString;
            this.postData = postData;
            this.headersSize = i11;
            this.bodySize = i12;
        }

        public final int getBodySize() {
            return this.bodySize;
        }

        @NotNull
        public final List<Cookie> getCookies() {
            return this.cookies;
        }

        @NotNull
        public final List<Header> getHeaders() {
            return this.headers;
        }

        public final int getHeadersSize() {
            return this.headersSize;
        }

        @NotNull
        public final String getHttpVersion() {
            return this.httpVersion;
        }

        @NotNull
        public final String getMethod() {
            return this.method;
        }

        public final PostData getPostData() {
            return this.postData;
        }

        @NotNull
        public final List<Query> getQueryString() {
            return this.queryString;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public Request(String str, String str2, String str3, List list, List list2, List list3, PostData postData, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i13 & 8) != 0 ? K.f71697a : list, list2, list3, postData, i11, i12);
        }
    }
}
