package com.socure.docv.reactnative;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Api.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/reactnative/TransactionResponse;", "", "data", "Lcom/socure/docv/reactnative/TransactionResponse$Data;", "<init>", "(Lcom/socure/docv/reactnative/TransactionResponse$Data;)V", "getData", "()Lcom/socure/docv/reactnative/TransactionResponse$Data;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Data", "socure-inc_docv-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TransactionResponse {
    private final Data data;

    public static /* synthetic */ TransactionResponse copy$default(TransactionResponse transactionResponse, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            data = transactionResponse.data;
        }
        return transactionResponse.copy(data);
    }

    /* renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    public final TransactionResponse copy(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new TransactionResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransactionResponse) && Intrinsics.areEqual(this.data, ((TransactionResponse) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "TransactionResponse(data=" + this.data + ")";
    }

    public TransactionResponse(Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final Data getData() {
        return this.data;
    }

    /* compiled from: Api.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/reactnative/TransactionResponse$Data;", "", "eventId", "", "authToken", "docVTransactionToken", "qrcode", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getAuthToken", "getDocVTransactionToken", "getQrcode", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "socure-inc_docv-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data {
        private final String authToken;
        private final String docVTransactionToken;
        private final String eventId;
        private final String qrcode;
        private final String url;

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.eventId;
            }
            if ((i & 2) != 0) {
                str2 = data.authToken;
            }
            if ((i & 4) != 0) {
                str3 = data.docVTransactionToken;
            }
            if ((i & 8) != 0) {
                str4 = data.qrcode;
            }
            if ((i & 16) != 0) {
                str5 = data.url;
            }
            String str6 = str5;
            String str7 = str3;
            return data.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAuthToken() {
            return this.authToken;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDocVTransactionToken() {
            return this.docVTransactionToken;
        }

        /* renamed from: component4, reason: from getter */
        public final String getQrcode() {
            return this.qrcode;
        }

        /* renamed from: component5, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Data copy(String eventId, String authToken, String docVTransactionToken, String qrcode, String url) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(authToken, "authToken");
            Intrinsics.checkNotNullParameter(docVTransactionToken, "docVTransactionToken");
            Intrinsics.checkNotNullParameter(qrcode, "qrcode");
            Intrinsics.checkNotNullParameter(url, "url");
            return new Data(eventId, authToken, docVTransactionToken, qrcode, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.eventId, data.eventId) && Intrinsics.areEqual(this.authToken, data.authToken) && Intrinsics.areEqual(this.docVTransactionToken, data.docVTransactionToken) && Intrinsics.areEqual(this.qrcode, data.qrcode) && Intrinsics.areEqual(this.url, data.url);
        }

        public int hashCode() {
            return (((((((this.eventId.hashCode() * 31) + this.authToken.hashCode()) * 31) + this.docVTransactionToken.hashCode()) * 31) + this.qrcode.hashCode()) * 31) + this.url.hashCode();
        }

        public String toString() {
            return "Data(eventId=" + this.eventId + ", authToken=" + this.authToken + ", docVTransactionToken=" + this.docVTransactionToken + ", qrcode=" + this.qrcode + ", url=" + this.url + ")";
        }

        public Data(String eventId, String authToken, String docVTransactionToken, String qrcode, String url) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(authToken, "authToken");
            Intrinsics.checkNotNullParameter(docVTransactionToken, "docVTransactionToken");
            Intrinsics.checkNotNullParameter(qrcode, "qrcode");
            Intrinsics.checkNotNullParameter(url, "url");
            this.eventId = eventId;
            this.authToken = authToken;
            this.docVTransactionToken = docVTransactionToken;
            this.qrcode = qrcode;
            this.url = url;
        }

        public final String getEventId() {
            return this.eventId;
        }

        public final String getAuthToken() {
            return this.authToken;
        }

        public final String getDocVTransactionToken() {
            return this.docVTransactionToken;
        }

        public final String getQrcode() {
            return this.qrcode;
        }

        public final String getUrl() {
            return this.url;
        }
    }
}
