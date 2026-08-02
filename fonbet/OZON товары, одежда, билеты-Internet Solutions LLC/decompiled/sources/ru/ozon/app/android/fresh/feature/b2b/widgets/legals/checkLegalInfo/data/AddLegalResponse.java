package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data;

import B0.A0;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;", "", "isSuccess", "", "errors", "", "", "error", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(ZLjava/util/Map;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "()Z", "getErrors", "()Ljava/util/Map;", "getError", "()Ljava/lang/String;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Errors", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddLegalResponse {
    public static final int $stable = 8;
    private final String error;
    private final Map<String, String> errors;
    private final boolean isSuccess;
    private final NotificationDTO notification;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse$Errors;", "", "kpp", "", "<init>", "(Ljava/lang/String;)V", "getKpp", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Errors {
        public static final int $stable = 0;
        private final String kpp;

        public Errors(String str) {
            this.kpp = str;
        }

        public static /* synthetic */ Errors copy$default(Errors errors, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = errors.kpp;
            }
            return errors.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKpp() {
            return this.kpp;
        }

        @NotNull
        public final Errors copy(String kpp) {
            return new Errors(kpp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Errors) && Intrinsics.d(this.kpp, ((Errors) other).kpp);
        }

        public final String getKpp() {
            return this.kpp;
        }

        public int hashCode() {
            String str = this.kpp;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Errors(kpp=", this.kpp, ")");
        }
    }

    public AddLegalResponse(boolean z11, Map<String, String> map, String str, NotificationDTO notificationDTO) {
        this.isSuccess = z11;
        this.errors = map;
        this.error = str;
        this.notification = notificationDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddLegalResponse copy$default(AddLegalResponse addLegalResponse, boolean z11, Map map, String str, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = addLegalResponse.isSuccess;
        }
        if ((i11 & 2) != 0) {
            map = addLegalResponse.errors;
        }
        if ((i11 & 4) != 0) {
            str = addLegalResponse.error;
        }
        if ((i11 & 8) != 0) {
            notificationDTO = addLegalResponse.notification;
        }
        return addLegalResponse.copy(z11, map, str, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final Map<String, String> component2() {
        return this.errors;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final AddLegalResponse copy(boolean isSuccess, Map<String, String> errors, String error, NotificationDTO notification) {
        return new AddLegalResponse(isSuccess, errors, error, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddLegalResponse)) {
            return false;
        }
        AddLegalResponse addLegalResponse = (AddLegalResponse) other;
        return this.isSuccess == addLegalResponse.isSuccess && Intrinsics.d(this.errors, addLegalResponse.errors) && Intrinsics.d(this.error, addLegalResponse.error) && Intrinsics.d(this.notification, addLegalResponse.notification);
    }

    public final String getError() {
        return this.error;
    }

    public final Map<String, String> getErrors() {
        return this.errors;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isSuccess) * 31;
        Map<String, String> map = this.errors;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.error;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notification;
        return hashCode3 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "AddLegalResponse(isSuccess=" + this.isSuccess + ", errors=" + this.errors + ", error=" + this.error + ", notification=" + this.notification + ")";
    }
}
