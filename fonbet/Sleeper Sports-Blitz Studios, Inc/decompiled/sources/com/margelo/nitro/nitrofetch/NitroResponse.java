package com.margelo.nitro.nitrofetch;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.margelo.nitro.core.ArrayBuffer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroResponse.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jh\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroResponse;", "", "url", "", "status", "", "statusText", "ok", "", "redirected", "headers", "", "Lcom/margelo/nitro/nitrofetch/NitroHeader;", "bodyString", "bodyBytes", "Lcom/margelo/nitro/core/ArrayBuffer;", "<init>", "(Ljava/lang/String;DLjava/lang/String;ZZ[Lcom/margelo/nitro/nitrofetch/NitroHeader;Ljava/lang/String;Lcom/margelo/nitro/core/ArrayBuffer;)V", "getUrl", "()Ljava/lang/String;", "getStatus", "()D", "getStatusText", "getOk", "()Z", "getRedirected", "getHeaders", "()[Lcom/margelo/nitro/nitrofetch/NitroHeader;", "[Lcom/margelo/nitro/nitrofetch/NitroHeader;", "getBodyString", "getBodyBytes", "()Lcom/margelo/nitro/core/ArrayBuffer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;DLjava/lang/String;ZZ[Lcom/margelo/nitro/nitrofetch/NitroHeader;Ljava/lang/String;Lcom/margelo/nitro/core/ArrayBuffer;)Lcom/margelo/nitro/nitrofetch/NitroResponse;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NitroResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ArrayBuffer bodyBytes;
    private final String bodyString;
    private final NitroHeader[] headers;
    private final boolean ok;
    private final boolean redirected;
    private final double status;
    private final String statusText;
    private final String url;

    public static /* synthetic */ NitroResponse copy$default(NitroResponse nitroResponse, String str, double d, String str2, boolean z, boolean z2, NitroHeader[] nitroHeaderArr, String str3, ArrayBuffer arrayBuffer, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nitroResponse.url;
        }
        if ((i & 2) != 0) {
            d = nitroResponse.status;
        }
        if ((i & 4) != 0) {
            str2 = nitroResponse.statusText;
        }
        if ((i & 8) != 0) {
            z = nitroResponse.ok;
        }
        if ((i & 16) != 0) {
            z2 = nitroResponse.redirected;
        }
        if ((i & 32) != 0) {
            nitroHeaderArr = nitroResponse.headers;
        }
        if ((i & 64) != 0) {
            str3 = nitroResponse.bodyString;
        }
        if ((i & 128) != 0) {
            arrayBuffer = nitroResponse.bodyBytes;
        }
        String str4 = str3;
        ArrayBuffer arrayBuffer2 = arrayBuffer;
        return nitroResponse.copy(str, d, str2, z, z2, nitroHeaderArr, str4, arrayBuffer2);
    }

    @JvmStatic
    private static final NitroResponse fromCpp(String str, double d, String str2, boolean z, boolean z2, NitroHeader[] nitroHeaderArr, String str3, ArrayBuffer arrayBuffer) {
        return INSTANCE.fromCpp(str, d, str2, z, z2, nitroHeaderArr, str3, arrayBuffer);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final double getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getOk() {
        return this.ok;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getRedirected() {
        return this.redirected;
    }

    /* renamed from: component6, reason: from getter */
    public final NitroHeader[] getHeaders() {
        return this.headers;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBodyString() {
        return this.bodyString;
    }

    /* renamed from: component8, reason: from getter */
    public final ArrayBuffer getBodyBytes() {
        return this.bodyBytes;
    }

    public final NitroResponse copy(String url, double status, String statusText, boolean ok, boolean redirected, NitroHeader[] headers, String bodyString, ArrayBuffer bodyBytes) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new NitroResponse(url, status, statusText, ok, redirected, headers, bodyString, bodyBytes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NitroResponse)) {
            return false;
        }
        NitroResponse nitroResponse = (NitroResponse) other;
        return Intrinsics.areEqual(this.url, nitroResponse.url) && Double.compare(this.status, nitroResponse.status) == 0 && Intrinsics.areEqual(this.statusText, nitroResponse.statusText) && this.ok == nitroResponse.ok && this.redirected == nitroResponse.redirected && Intrinsics.areEqual(this.headers, nitroResponse.headers) && Intrinsics.areEqual(this.bodyString, nitroResponse.bodyString) && Intrinsics.areEqual(this.bodyBytes, nitroResponse.bodyBytes);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.url.hashCode() * 31) + Double.hashCode(this.status)) * 31) + this.statusText.hashCode()) * 31) + Boolean.hashCode(this.ok)) * 31) + Boolean.hashCode(this.redirected)) * 31) + Arrays.hashCode(this.headers)) * 31;
        String str = this.bodyString;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ArrayBuffer arrayBuffer = this.bodyBytes;
        return hashCode2 + (arrayBuffer != null ? arrayBuffer.hashCode() : 0);
    }

    public String toString() {
        return "NitroResponse(url=" + this.url + ", status=" + this.status + ", statusText=" + this.statusText + ", ok=" + this.ok + ", redirected=" + this.redirected + ", headers=" + Arrays.toString(this.headers) + ", bodyString=" + this.bodyString + ", bodyBytes=" + this.bodyBytes + ")";
    }

    public NitroResponse(String url, double d, String statusText, boolean z, boolean z2, NitroHeader[] headers, String str, ArrayBuffer arrayBuffer) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.url = url;
        this.status = d;
        this.statusText = statusText;
        this.ok = z;
        this.redirected = z2;
        this.headers = headers;
        this.bodyString = str;
        this.bodyBytes = arrayBuffer;
    }

    public final String getUrl() {
        return this.url;
    }

    public final double getStatus() {
        return this.status;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final boolean getRedirected() {
        return this.redirected;
    }

    public final NitroHeader[] getHeaders() {
        return this.headers;
    }

    public final String getBodyString() {
        return this.bodyString;
    }

    public final ArrayBuffer getBodyBytes() {
        return this.bodyBytes;
    }

    /* compiled from: NitroResponse.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroResponse$Companion;", "", "<init>", "()V", "fromCpp", "Lcom/margelo/nitro/nitrofetch/NitroResponse;", "url", "", "status", "", "statusText", "ok", "", "redirected", "headers", "", "Lcom/margelo/nitro/nitrofetch/NitroHeader;", "bodyString", "bodyBytes", "Lcom/margelo/nitro/core/ArrayBuffer;", "(Ljava/lang/String;DLjava/lang/String;ZZ[Lcom/margelo/nitro/nitrofetch/NitroHeader;Ljava/lang/String;Lcom/margelo/nitro/core/ArrayBuffer;)Lcom/margelo/nitro/nitrofetch/NitroResponse;", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final NitroResponse fromCpp(String url, double status, String statusText, boolean ok, boolean redirected, NitroHeader[] headers, String bodyString, ArrayBuffer bodyBytes) {
            return new NitroResponse(url, status, statusText, ok, redirected, headers, bodyString, bodyBytes);
        }
    }
}
