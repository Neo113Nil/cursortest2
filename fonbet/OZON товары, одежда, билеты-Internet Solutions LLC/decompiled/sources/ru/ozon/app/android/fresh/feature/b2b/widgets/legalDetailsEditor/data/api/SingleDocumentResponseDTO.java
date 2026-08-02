package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.api;

import B0.A0;
import D3.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO;", "", "isSuccess", "", "key", "", "error", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO$ErrorResponse;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO$ErrorResponse;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getKey", "()Ljava/lang/String;", "getError", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO$ErrorResponse;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO$ErrorResponse;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO;", "equals", "other", "hashCode", "", "toString", "ErrorResponse", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SingleDocumentResponseDTO {
    public static final int $stable = 0;
    private final ErrorResponse error;
    private final Boolean isSuccess;
    private final String key;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO$ErrorResponse;", "", "message", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO$ErrorResponse$Message;", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO$ErrorResponse$Message;)V", "getMessage", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO$ErrorResponse$Message;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Message", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ErrorResponse {
        public static final int $stable = 0;
        private final Message message;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/api/SingleDocumentResponseDTO$ErrorResponse$Message;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Message {
            public static final int $stable = 0;
            private final String text;

            public Message(String str) {
                this.text = str;
            }

            public static /* synthetic */ Message copy$default(Message message, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = message.text;
                }
                return message.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @NotNull
            public final Message copy(String text) {
                return new Message(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Message) && Intrinsics.d(this.text, ((Message) other).text);
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                String str = this.text;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Message(text=", this.text, ")");
            }
        }

        public ErrorResponse(Message message) {
            this.message = message;
        }

        public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, Message message, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                message = errorResponse.message;
            }
            return errorResponse.copy(message);
        }

        /* renamed from: component1, reason: from getter */
        public final Message getMessage() {
            return this.message;
        }

        @NotNull
        public final ErrorResponse copy(Message message) {
            return new ErrorResponse(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorResponse) && Intrinsics.d(this.message, ((ErrorResponse) other).message);
        }

        public final Message getMessage() {
            return this.message;
        }

        public int hashCode() {
            Message message = this.message;
            if (message == null) {
                return 0;
            }
            return message.hashCode();
        }

        @NotNull
        public String toString() {
            return "ErrorResponse(message=" + this.message + ")";
        }
    }

    public SingleDocumentResponseDTO(Boolean bool, String str, ErrorResponse errorResponse) {
        this.isSuccess = bool;
        this.key = str;
        this.error = errorResponse;
    }

    public static /* synthetic */ SingleDocumentResponseDTO copy$default(SingleDocumentResponseDTO singleDocumentResponseDTO, Boolean bool, String str, ErrorResponse errorResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = singleDocumentResponseDTO.isSuccess;
        }
        if ((i11 & 2) != 0) {
            str = singleDocumentResponseDTO.key;
        }
        if ((i11 & 4) != 0) {
            errorResponse = singleDocumentResponseDTO.error;
        }
        return singleDocumentResponseDTO.copy(bool, str, errorResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final ErrorResponse getError() {
        return this.error;
    }

    @NotNull
    public final SingleDocumentResponseDTO copy(Boolean isSuccess, String key, ErrorResponse error) {
        return new SingleDocumentResponseDTO(isSuccess, key, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleDocumentResponseDTO)) {
            return false;
        }
        SingleDocumentResponseDTO singleDocumentResponseDTO = (SingleDocumentResponseDTO) other;
        return Intrinsics.d(this.isSuccess, singleDocumentResponseDTO.isSuccess) && Intrinsics.d(this.key, singleDocumentResponseDTO.key) && Intrinsics.d(this.error, singleDocumentResponseDTO.error);
    }

    public final ErrorResponse getError() {
        return this.error;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        Boolean bool = this.isSuccess;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.key;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ErrorResponse errorResponse = this.error;
        return hashCode2 + (errorResponse != null ? errorResponse.hashCode() : 0);
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isSuccess;
        String str = this.key;
        ErrorResponse errorResponse = this.error;
        StringBuilder e11 = g.e("SingleDocumentResponseDTO(isSuccess=", bool, ", key=", str, ", error=");
        e11.append(errorResponse);
        e11.append(")");
        return e11.toString();
    }
}
