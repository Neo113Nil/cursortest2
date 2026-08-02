package ru.ozon.app.android.fresh.feature.b2b.domain;

import B0.A0;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse;", "", "isSuccess", "", "message", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse$Message;", "errors", "", "", "<init>", "(ZLru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse$Message;Ljava/util/Map;)V", "()Z", "getMessage", "()Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse$Message;", "getErrors", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Message", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocsDeliveryResponse {
    public static final int $stable = 8;
    private final Map<String, String> errors;
    private final boolean isSuccess;
    private final Message message;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryResponse$Message;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Message {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        public Message(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public static /* synthetic */ Message copy$default(Message message, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = message.text;
            }
            return message.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final Message copy(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Message(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Message) && Intrinsics.d(this.text, ((Message) other).text);
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Message(text=", this.text, ")");
        }
    }

    public DocsDeliveryResponse(boolean z11, Message message, Map<String, String> map) {
        this.isSuccess = z11;
        this.message = message;
        this.errors = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocsDeliveryResponse copy$default(DocsDeliveryResponse docsDeliveryResponse, boolean z11, Message message, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = docsDeliveryResponse.isSuccess;
        }
        if ((i11 & 2) != 0) {
            message = docsDeliveryResponse.message;
        }
        if ((i11 & 4) != 0) {
            map = docsDeliveryResponse.errors;
        }
        return docsDeliveryResponse.copy(z11, message, map);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    public final Map<String, String> component3() {
        return this.errors;
    }

    @NotNull
    public final DocsDeliveryResponse copy(boolean isSuccess, Message message, Map<String, String> errors) {
        return new DocsDeliveryResponse(isSuccess, message, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocsDeliveryResponse)) {
            return false;
        }
        DocsDeliveryResponse docsDeliveryResponse = (DocsDeliveryResponse) other;
        return this.isSuccess == docsDeliveryResponse.isSuccess && Intrinsics.d(this.message, docsDeliveryResponse.message) && Intrinsics.d(this.errors, docsDeliveryResponse.errors);
    }

    public final Map<String, String> getErrors() {
        return this.errors;
    }

    public final Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isSuccess) * 31;
        Message message = this.message;
        int hashCode2 = (hashCode + (message == null ? 0 : message.hashCode())) * 31;
        Map<String, String> map = this.errors;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isSuccess;
        Message message = this.message;
        Map<String, String> map = this.errors;
        StringBuilder sb2 = new StringBuilder("DocsDeliveryResponse(isSuccess=");
        sb2.append(z11);
        sb2.append(", message=");
        sb2.append(message);
        sb2.append(", errors=");
        return P.f(sb2, map, ")");
    }
}
