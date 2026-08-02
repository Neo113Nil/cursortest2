package ru.ozon.app.android.payment.ui.createservice;

import C.o0;
import Ul.C4070a;
import V.e;
import Xc.a;
import Xc.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO;", "", "<init>", "()V", "CreateServiceUnknown", "CreateServiceRedirect", "CreateServiceError", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceRedirect;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceUnknown;", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CreateServiceDO {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b!\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\"\u0010\u0010R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO;", "", "message", "", "duration", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction;", "action", "image", "imageTintColor", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Long;", "getDuration", "()Ljava/lang/Long;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction;", "getAction", "()Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction;", "getImage", "getImageTintColor", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "ErrorAction", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CreateServiceError extends CreateServiceDO {
        private final ErrorAction action;
        private final Long duration;
        private final String image;
        private final String imageTintColor;

        @NotNull
        private final String message;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction;", "", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction$TYPE;", "type", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "link", "<init>", "(Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction$TYPE;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction$TYPE;", "getType", "()Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction$TYPE;", "Ljava/lang/String;", "getTitle", "getLink", "TYPE", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ErrorAction {
            private final String link;
            private final String title;
            private final TYPE type;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceError$ErrorAction$TYPE;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "DEFAULT", "REFRESH", "REDIRECT", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class TYPE {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ TYPE[] $VALUES;

                @NotNull
                private final String key;
                public static final TYPE DEFAULT = new TYPE("DEFAULT", 0, "default");
                public static final TYPE REFRESH = new TYPE("REFRESH", 1, "refresh");
                public static final TYPE REDIRECT = new TYPE("REDIRECT", 2, "redirect");

                private static final /* synthetic */ TYPE[] $values() {
                    return new TYPE[]{DEFAULT, REFRESH, REDIRECT};
                }

                static {
                    TYPE[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private TYPE(String str, int i11, String str2) {
                    this.key = str2;
                }

                @NotNull
                public static a<TYPE> getEntries() {
                    return $ENTRIES;
                }

                public static TYPE valueOf(String str) {
                    return (TYPE) Enum.valueOf(TYPE.class, str);
                }

                public static TYPE[] values() {
                    return (TYPE[]) $VALUES.clone();
                }

                @NotNull
                public final String getKey() {
                    return this.key;
                }
            }

            public ErrorAction(TYPE type, String str, String str2) {
                this.type = type;
                this.title = str;
                this.link = str2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorAction)) {
                    return false;
                }
                ErrorAction errorAction = (ErrorAction) other;
                return this.type == errorAction.type && Intrinsics.d(this.title, errorAction.title) && Intrinsics.d(this.link, errorAction.link);
            }

            public final String getLink() {
                return this.link;
            }

            public final String getTitle() {
                return this.title;
            }

            public final TYPE getType() {
                return this.type;
            }

            public int hashCode() {
                TYPE type = this.type;
                int hashCode = (type == null ? 0 : type.hashCode()) * 31;
                String str = this.title;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.link;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TYPE type = this.type;
                String str = this.title;
                String str2 = this.link;
                StringBuilder sb2 = new StringBuilder("ErrorAction(type=");
                sb2.append(type);
                sb2.append(", title=");
                sb2.append(str);
                sb2.append(", link=");
                return o0.c(sb2, str2, ")");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateServiceError(@NotNull String message, Long l11, ErrorAction errorAction, String str, String str2, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.duration = l11;
            this.action = errorAction;
            this.image = str;
            this.imageTintColor = str2;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateServiceError)) {
                return false;
            }
            CreateServiceError createServiceError = (CreateServiceError) other;
            return Intrinsics.d(this.message, createServiceError.message) && Intrinsics.d(this.duration, createServiceError.duration) && Intrinsics.d(this.action, createServiceError.action) && Intrinsics.d(this.image, createServiceError.image) && Intrinsics.d(this.imageTintColor, createServiceError.imageTintColor) && Intrinsics.d(this.trackingInfo, createServiceError.trackingInfo);
        }

        public final ErrorAction getAction() {
            return this.action;
        }

        public final Long getDuration() {
            return this.duration;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            Long l11 = this.duration;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            ErrorAction errorAction = this.action;
            int hashCode3 = (hashCode2 + (errorAction == null ? 0 : errorAction.hashCode())) * 31;
            String str = this.image;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imageTintColor;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.message;
            Long l11 = this.duration;
            ErrorAction errorAction = this.action;
            String str2 = this.image;
            String str3 = this.imageTintColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("CreateServiceError(message=");
            sb2.append(str);
            sb2.append(", duration=");
            sb2.append(l11);
            sb2.append(", action=");
            sb2.append(errorAction);
            sb2.append(", image=");
            sb2.append(str2);
            sb2.append(", imageTintColor=");
            return C4070a.a(sb2, str3, ", trackingInfo=", map, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceRedirect;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO;", "", "redirectLink", "cancelLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRedirectLink", "getCancelLink", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CreateServiceRedirect extends CreateServiceDO {
        private final String cancelLink;

        @NotNull
        private final String redirectLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateServiceRedirect(@NotNull String redirectLink, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(redirectLink, "redirectLink");
            this.redirectLink = redirectLink;
            this.cancelLink = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateServiceRedirect)) {
                return false;
            }
            CreateServiceRedirect createServiceRedirect = (CreateServiceRedirect) other;
            return Intrinsics.d(this.redirectLink, createServiceRedirect.redirectLink) && Intrinsics.d(this.cancelLink, createServiceRedirect.cancelLink);
        }

        public final String getCancelLink() {
            return this.cancelLink;
        }

        @NotNull
        public final String getRedirectLink() {
            return this.redirectLink;
        }

        public int hashCode() {
            int hashCode = this.redirectLink.hashCode() * 31;
            String str = this.cancelLink;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("CreateServiceRedirect(redirectLink=", this.redirectLink, ", cancelLink=", this.cancelLink, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO$CreateServiceUnknown;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CreateServiceUnknown extends CreateServiceDO {

        @NotNull
        public static final CreateServiceUnknown INSTANCE = new CreateServiceUnknown();

        private CreateServiceUnknown() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CreateServiceUnknown);
        }

        public int hashCode() {
            return -205688931;
        }

        @NotNull
        public String toString() {
            return "CreateServiceUnknown";
        }
    }

    public /* synthetic */ CreateServiceDO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CreateServiceDO() {
    }
}
