package ru.ozon.app.android.network.logrequests.export;

import B0.A0;
import B0.C2454a;
import B90.C2616s;
import C.o0;
import G.g;
import I0.C3173b;
import I1.w;
import K00.b;
import N3.C3660k;
import Nh.a;
import V.e;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive;", "", "log", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Log;", "<init>", "(Lru/ozon/app/android/network/logrequests/export/HttpArchive$Log;)V", "getLog", "()Lru/ozon/app/android/network/logrequests/export/HttpArchive$Log;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Log", "Creator", "HarEntry", "Request", "Response", "Cookie", "Header", "Query", "PostData", "Params", "Content", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HttpArchive {

    @NotNull
    private final Log log;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003JD\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$Content;", "", "size", "", "compression", "mimeType", "", "text", "encoding", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSize", "()I", "getCompression", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMimeType", "()Ljava/lang/String;", "getText", "getEncoding", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/network/logrequests/export/HttpArchive$Content;", "equals", "", "other", "hashCode", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {
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

        public static /* synthetic */ Content copy$default(Content content, int i11, Integer num, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = content.size;
            }
            if ((i12 & 2) != 0) {
                num = content.compression;
            }
            if ((i12 & 4) != 0) {
                str = content.mimeType;
            }
            if ((i12 & 8) != 0) {
                str2 = content.text;
            }
            if ((i12 & 16) != 0) {
                str3 = content.encoding;
            }
            String str4 = str3;
            String str5 = str;
            return content.copy(i11, num, str5, str2, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getCompression() {
            return this.compression;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEncoding() {
            return this.encoding;
        }

        @NotNull
        public final Content copy(int size, Integer compression, @NotNull String mimeType, @NotNull String text, String encoding) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Content(size, compression, mimeType, text, encoding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return this.size == content.size && Intrinsics.d(this.compression, content.compression) && Intrinsics.d(this.mimeType, content.mimeType) && Intrinsics.d(this.text, content.text) && Intrinsics.d(this.encoding, content.encoding);
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

        public int hashCode() {
            int hashCode = Integer.hashCode(this.size) * 31;
            Integer num = this.compression;
            int a11 = g.a(g.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.mimeType), 31, this.text);
            String str = this.encoding;
            return a11 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.size;
            Integer num = this.compression;
            String str = this.mimeType;
            String str2 = this.text;
            String str3 = this.encoding;
            StringBuilder sb2 = new StringBuilder("Content(size=");
            sb2.append(i11);
            sb2.append(", compression=");
            sb2.append(num);
            sb2.append(", mimeType=");
            a.h(sb2, str, ", text=", str2, ", encoding=");
            return o0.c(sb2, str3, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$Cookie;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cookie {

        @NotNull
        private final String name;

        public Cookie(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public static /* synthetic */ Cookie copy$default(Cookie cookie, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cookie.name;
            }
            return cookie.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Cookie copy(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Cookie(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cookie) && Intrinsics.d(this.name, ((Cookie) other).name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Cookie(name=", this.name, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$Creator;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "version", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVersion", "getComment", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Creator {

        @NotNull
        private final String comment;

        @NotNull
        private final String name;

        @NotNull
        private final String version;

        public Creator(@NotNull String name, @NotNull String version, @NotNull String comment) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(comment, "comment");
            this.name = name;
            this.version = version;
            this.comment = comment;
        }

        public static /* synthetic */ Creator copy$default(Creator creator, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = creator.name;
            }
            if ((i11 & 2) != 0) {
                str2 = creator.version;
            }
            if ((i11 & 4) != 0) {
                str3 = creator.comment;
            }
            return creator.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getComment() {
            return this.comment;
        }

        @NotNull
        public final Creator copy(@NotNull String name, @NotNull String version, @NotNull String comment) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(comment, "comment");
            return new Creator(name, version, comment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Creator)) {
                return false;
            }
            Creator creator = (Creator) other;
            return Intrinsics.d(this.name, creator.name) && Intrinsics.d(this.version, creator.version) && Intrinsics.d(this.comment, creator.comment);
        }

        @NotNull
        public final String getComment() {
            return this.comment;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.comment.hashCode() + g.a(this.name.hashCode() * 31, 31, this.version);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.version;
            return o0.c(C3660k.d("Creator(name=", str, ", version=", str2, ", comment="), this.comment, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$HarEntry;", "", "startedDateTime", "", "time", "", "request", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Request;", "response", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Response;", "<init>", "(Ljava/lang/String;ILru/ozon/app/android/network/logrequests/export/HttpArchive$Request;Lru/ozon/app/android/network/logrequests/export/HttpArchive$Response;)V", "getStartedDateTime", "()Ljava/lang/String;", "getTime", "()I", "getRequest", "()Lru/ozon/app/android/network/logrequests/export/HttpArchive$Request;", "getResponse", "()Lru/ozon/app/android/network/logrequests/export/HttpArchive$Response;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HarEntry {

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

        public static /* synthetic */ HarEntry copy$default(HarEntry harEntry, String str, int i11, Request request, Response response, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = harEntry.startedDateTime;
            }
            if ((i12 & 2) != 0) {
                i11 = harEntry.time;
            }
            if ((i12 & 4) != 0) {
                request = harEntry.request;
            }
            if ((i12 & 8) != 0) {
                response = harEntry.response;
            }
            return harEntry.copy(str, i11, request, response);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStartedDateTime() {
            return this.startedDateTime;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTime() {
            return this.time;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Response getResponse() {
            return this.response;
        }

        @NotNull
        public final HarEntry copy(@NotNull String startedDateTime, int time, @NotNull Request request, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(startedDateTime, "startedDateTime");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return new HarEntry(startedDateTime, time, request, response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HarEntry)) {
                return false;
            }
            HarEntry harEntry = (HarEntry) other;
            return Intrinsics.d(this.startedDateTime, harEntry.startedDateTime) && this.time == harEntry.time && Intrinsics.d(this.request, harEntry.request) && Intrinsics.d(this.response, harEntry.response);
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

        public int hashCode() {
            return this.response.hashCode() + ((this.request.hashCode() + C2454a.a(this.time, this.startedDateTime.hashCode() * 31, 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.startedDateTime;
            int i11 = this.time;
            Request request = this.request;
            Response response = this.response;
            StringBuilder c11 = C3660k.c(i11, "HarEntry(startedDateTime=", str, ", time=", ", request=");
            c11.append(request);
            c11.append(", response=");
            c11.append(response);
            c11.append(")");
            return c11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$Header;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {

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

        public static /* synthetic */ Header copy$default(Header header, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = header.name;
            }
            if ((i11 & 2) != 0) {
                str2 = header.value;
            }
            return header.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Header copy(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Header(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.name, header.name) && Intrinsics.d(this.value, header.value);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Header(name=", this.name, ", value=", this.value, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$Params;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "fileName", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "getFileName", "getContentType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Params {
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

        public static /* synthetic */ Params copy$default(Params params, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = params.name;
            }
            if ((i11 & 2) != 0) {
                str2 = params.value;
            }
            if ((i11 & 4) != 0) {
                str3 = params.fileName;
            }
            if ((i11 & 8) != 0) {
                str4 = params.contentType;
            }
            return params.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        @NotNull
        public final Params copy(@NotNull String name, String value, String fileName, String contentType) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Params(name, value, fileName, contentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.d(this.name, params.name) && Intrinsics.d(this.value, params.value) && Intrinsics.d(this.fileName, params.fileName) && Intrinsics.d(this.contentType, params.contentType);
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

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            String str = this.value;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fileName;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.contentType;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.value;
            return C3173b.c(C3660k.d("Params(name=", str, ", value=", str2, ", fileName="), this.fileName, ", contentType=", this.contentType, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$Query;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Query {

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

        public static /* synthetic */ Query copy$default(Query query, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = query.name;
            }
            if ((i11 & 2) != 0) {
                str2 = query.value;
            }
            return query.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Query copy(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Query(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Query)) {
                return false;
            }
            Query query = (Query) other;
            return Intrinsics.d(this.name, query.name) && Intrinsics.d(this.value, query.value);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Query(name=", this.name, ", value=", this.value, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jq\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u0006/"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$Response;", "", "status", "", "statusText", "", "httpVersion", "cookies", "", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Cookie;", "headers", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Header;", "content", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Content;", "redirectURL", "headersSize", "bodySize", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/network/logrequests/export/HttpArchive$Content;Ljava/lang/String;II)V", "getStatus", "()I", "getStatusText", "()Ljava/lang/String;", "getHttpVersion", "getCookies", "()Ljava/util/List;", "getHeaders", "getContent", "()Lru/ozon/app/android/network/logrequests/export/HttpArchive$Content;", "getRedirectURL", "getHeadersSize", "getBodySize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Response {
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

        public static /* synthetic */ Response copy$default(Response response, int i11, String str, String str2, List list, List list2, Content content, String str3, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = response.status;
            }
            if ((i14 & 2) != 0) {
                str = response.statusText;
            }
            if ((i14 & 4) != 0) {
                str2 = response.httpVersion;
            }
            if ((i14 & 8) != 0) {
                list = response.cookies;
            }
            if ((i14 & 16) != 0) {
                list2 = response.headers;
            }
            if ((i14 & 32) != 0) {
                content = response.content;
            }
            if ((i14 & 64) != 0) {
                str3 = response.redirectURL;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i12 = response.headersSize;
            }
            if ((i14 & 256) != 0) {
                i13 = response.bodySize;
            }
            int i15 = i12;
            int i16 = i13;
            Content content2 = content;
            String str4 = str3;
            List list3 = list2;
            String str5 = str2;
            return response.copy(i11, str, str5, list, list3, content2, str4, i15, i16);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getStatusText() {
            return this.statusText;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getHttpVersion() {
            return this.httpVersion;
        }

        @NotNull
        public final List<Cookie> component4() {
            return this.cookies;
        }

        @NotNull
        public final List<Header> component5() {
            return this.headers;
        }

        /* renamed from: component6, reason: from getter */
        public final Content getContent() {
            return this.content;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final String getRedirectURL() {
            return this.redirectURL;
        }

        /* renamed from: component8, reason: from getter */
        public final int getHeadersSize() {
            return this.headersSize;
        }

        /* renamed from: component9, reason: from getter */
        public final int getBodySize() {
            return this.bodySize;
        }

        @NotNull
        public final Response copy(int status, @NotNull String statusText, @NotNull String httpVersion, @NotNull List<Cookie> cookies, @NotNull List<Header> headers, Content content, @NotNull String redirectURL, int headersSize, int bodySize) {
            Intrinsics.checkNotNullParameter(statusText, "statusText");
            Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
            Intrinsics.checkNotNullParameter(cookies, "cookies");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(redirectURL, "redirectURL");
            return new Response(status, statusText, httpVersion, cookies, headers, content, redirectURL, headersSize, bodySize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return this.status == response.status && Intrinsics.d(this.statusText, response.statusText) && Intrinsics.d(this.httpVersion, response.httpVersion) && Intrinsics.d(this.cookies, response.cookies) && Intrinsics.d(this.headers, response.headers) && Intrinsics.d(this.content, response.content) && Intrinsics.d(this.redirectURL, response.redirectURL) && this.headersSize == response.headersSize && this.bodySize == response.bodySize;
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

        public int hashCode() {
            int b11 = g.b(g.b(g.a(g.a(Integer.hashCode(this.status) * 31, 31, this.statusText), 31, this.httpVersion), 31, this.cookies), 31, this.headers);
            Content content = this.content;
            return Integer.hashCode(this.bodySize) + C2454a.a(this.headersSize, g.a((b11 + (content == null ? 0 : content.hashCode())) * 31, 31, this.redirectURL), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.status;
            String str = this.statusText;
            String str2 = this.httpVersion;
            List<Cookie> list = this.cookies;
            List<Header> list2 = this.headers;
            Content content = this.content;
            String str3 = this.redirectURL;
            int i12 = this.headersSize;
            int i13 = this.bodySize;
            StringBuilder g10 = Cm.e.g(i11, "Response(status=", ", statusText=", str, ", httpVersion=");
            w.d(str2, ", cookies=", ", headers=", g10, list);
            g10.append(list2);
            g10.append(", content=");
            g10.append(content);
            g10.append(", redirectURL=");
            Pk0.g.d(i12, str3, ", headersSize=", ", bodySize=", g10);
            return b.e(i13, ")", g10);
        }
    }

    public HttpArchive(@NotNull Log log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.log = log;
    }

    public static /* synthetic */ HttpArchive copy$default(HttpArchive httpArchive, Log log, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            log = httpArchive.log;
        }
        return httpArchive.copy(log);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Log getLog() {
        return this.log;
    }

    @NotNull
    public final HttpArchive copy(@NotNull Log log) {
        Intrinsics.checkNotNullParameter(log, "log");
        return new HttpArchive(log);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HttpArchive) && Intrinsics.d(this.log, ((HttpArchive) other).log);
    }

    @NotNull
    public final Log getLog() {
        return this.log;
    }

    public int hashCode() {
        return this.log.hashCode();
    }

    @NotNull
    public String toString() {
        return "HttpArchive(log=" + this.log + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$PostData;", "", "mimeType", "", "params", "", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Params;", "text", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMimeType", "()Ljava/lang/String;", "getParams", "()Ljava/util/List;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostData {

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

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PostData copy$default(PostData postData, String str, List list, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = postData.mimeType;
            }
            if ((i11 & 2) != 0) {
                list = postData.params;
            }
            if ((i11 & 4) != 0) {
                str2 = postData.text;
            }
            return postData.copy(str, list, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        public final List<Params> component2() {
            return this.params;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final PostData copy(@NotNull String mimeType, List<Params> params, String text) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            return new PostData(mimeType, params, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostData)) {
                return false;
            }
            PostData postData = (PostData) other;
            return Intrinsics.d(this.mimeType, postData.mimeType) && Intrinsics.d(this.params, postData.params) && Intrinsics.d(this.text, postData.text);
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

        public int hashCode() {
            int hashCode = this.mimeType.hashCode() * 31;
            List<Params> list = this.params;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.text;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.mimeType;
            List<Params> list = this.params;
            return o0.c(Tl.b.f("PostData(mimeType=", str, ", params=", ", text=", list), this.text, ")");
        }

        public /* synthetic */ PostData(String str, List list, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$Log;", "", "version", "", "creator", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Creator;", "browser", "entries", "", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$HarEntry;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/network/logrequests/export/HttpArchive$Creator;Lru/ozon/app/android/network/logrequests/export/HttpArchive$Creator;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getCreator", "()Lru/ozon/app/android/network/logrequests/export/HttpArchive$Creator;", "getBrowser", "getEntries", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Log {
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

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Log copy$default(Log log, String str, Creator creator, Creator creator2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = log.version;
            }
            if ((i11 & 2) != 0) {
                creator = log.creator;
            }
            if ((i11 & 4) != 0) {
                creator2 = log.browser;
            }
            if ((i11 & 8) != 0) {
                list = log.entries;
            }
            return log.copy(str, creator, creator2, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Creator getCreator() {
            return this.creator;
        }

        /* renamed from: component3, reason: from getter */
        public final Creator getBrowser() {
            return this.browser;
        }

        @NotNull
        public final List<HarEntry> component4() {
            return this.entries;
        }

        @NotNull
        public final Log copy(@NotNull String version, @NotNull Creator creator, Creator browser, @NotNull List<HarEntry> entries) {
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(creator, "creator");
            Intrinsics.checkNotNullParameter(entries, "entries");
            return new Log(version, creator, browser, entries);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Log)) {
                return false;
            }
            Log log = (Log) other;
            return Intrinsics.d(this.version, log.version) && Intrinsics.d(this.creator, log.creator) && Intrinsics.d(this.browser, log.browser) && Intrinsics.d(this.entries, log.entries);
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

        public int hashCode() {
            int hashCode = (this.creator.hashCode() + (this.version.hashCode() * 31)) * 31;
            Creator creator = this.browser;
            return this.entries.hashCode() + ((hashCode + (creator == null ? 0 : creator.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "Log(version=" + this.version + ", creator=" + this.creator + ", browser=" + this.browser + ", entries=" + this.entries + ")";
        }

        public /* synthetic */ Log(String str, Creator creator, Creator creator2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "1.2" : str, creator, creator2, list);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0010HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u00060"}, d2 = {"Lru/ozon/app/android/network/logrequests/export/HttpArchive$Request;", "", "method", "", ImagesContract.URL, "httpVersion", "cookies", "", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Cookie;", "headers", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Header;", "queryString", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$Query;", "postData", "Lru/ozon/app/android/network/logrequests/export/HttpArchive$PostData;", "headersSize", "", "bodySize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/network/logrequests/export/HttpArchive$PostData;II)V", "getMethod", "()Ljava/lang/String;", "getUrl", "getHttpVersion", "getCookies", "()Ljava/util/List;", "getHeaders", "getQueryString", "getPostData", "()Lru/ozon/app/android/network/logrequests/export/HttpArchive$PostData;", "getHeadersSize", "()I", "getBodySize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Request {
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

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, List list, List list2, List list3, PostData postData, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = request.method;
            }
            if ((i13 & 2) != 0) {
                str2 = request.url;
            }
            if ((i13 & 4) != 0) {
                str3 = request.httpVersion;
            }
            if ((i13 & 8) != 0) {
                list = request.cookies;
            }
            if ((i13 & 16) != 0) {
                list2 = request.headers;
            }
            if ((i13 & 32) != 0) {
                list3 = request.queryString;
            }
            if ((i13 & 64) != 0) {
                postData = request.postData;
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                i11 = request.headersSize;
            }
            if ((i13 & 256) != 0) {
                i12 = request.bodySize;
            }
            int i14 = i11;
            int i15 = i12;
            List list4 = list3;
            PostData postData2 = postData;
            List list5 = list2;
            String str4 = str3;
            return request.copy(str, str2, str4, list, list5, list4, postData2, i14, i15);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getHttpVersion() {
            return this.httpVersion;
        }

        @NotNull
        public final List<Cookie> component4() {
            return this.cookies;
        }

        @NotNull
        public final List<Header> component5() {
            return this.headers;
        }

        @NotNull
        public final List<Query> component6() {
            return this.queryString;
        }

        /* renamed from: component7, reason: from getter */
        public final PostData getPostData() {
            return this.postData;
        }

        /* renamed from: component8, reason: from getter */
        public final int getHeadersSize() {
            return this.headersSize;
        }

        /* renamed from: component9, reason: from getter */
        public final int getBodySize() {
            return this.bodySize;
        }

        @NotNull
        public final Request copy(@NotNull String method, @NotNull String url, @NotNull String httpVersion, @NotNull List<Cookie> cookies, @NotNull List<Header> headers, @NotNull List<Query> queryString, PostData postData, int headersSize, int bodySize) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
            Intrinsics.checkNotNullParameter(cookies, "cookies");
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(queryString, "queryString");
            return new Request(method, url, httpVersion, cookies, headers, queryString, postData, headersSize, bodySize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.d(this.method, request.method) && Intrinsics.d(this.url, request.url) && Intrinsics.d(this.httpVersion, request.httpVersion) && Intrinsics.d(this.cookies, request.cookies) && Intrinsics.d(this.headers, request.headers) && Intrinsics.d(this.queryString, request.queryString) && Intrinsics.d(this.postData, request.postData) && this.headersSize == request.headersSize && this.bodySize == request.bodySize;
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

        public int hashCode() {
            int b11 = g.b(g.b(g.b(g.a(g.a(this.method.hashCode() * 31, 31, this.url), 31, this.httpVersion), 31, this.cookies), 31, this.headers), 31, this.queryString);
            PostData postData = this.postData;
            return Integer.hashCode(this.bodySize) + C2454a.a(this.headersSize, (b11 + (postData == null ? 0 : postData.hashCode())) * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.method;
            String str2 = this.url;
            String str3 = this.httpVersion;
            List<Cookie> list = this.cookies;
            List<Header> list2 = this.headers;
            List<Query> list3 = this.queryString;
            PostData postData = this.postData;
            int i11 = this.headersSize;
            int i12 = this.bodySize;
            StringBuilder d11 = C3660k.d("Request(method=", str, ", url=", str2, ", httpVersion=");
            w.d(str3, ", cookies=", ", headers=", d11, list);
            C2616s.g(", queryString=", ", postData=", d11, list2, list3);
            d11.append(postData);
            d11.append(", headersSize=");
            d11.append(i11);
            d11.append(", bodySize=");
            return b.e(i12, ")", d11);
        }

        public Request(String str, String str2, String str3, List list, List list2, List list3, PostData postData, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i13 & 8) != 0 ? K.f71697a : list, list2, list3, (i13 & 64) != 0 ? null : postData, i11, i12);
        }
    }
}
