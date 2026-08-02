package ru.ozon.app.android.search.widgets.feedbackTile.data;

import G.g;
import K1.G;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\"B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackTile/data/FeedbackTileDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "notification", "Lru/ozon/app/android/search/widgets/feedbackTile/data/FeedbackTileDTO$NotificationWrapper;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/search/widgets/feedbackTile/data/FeedbackTileDTO$NotificationWrapper;Ljava/util/Map;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButtons", "()Ljava/util/List;", "getNotification", "()Lru/ozon/app/android/search/widgets/feedbackTile/data/FeedbackTileDTO$NotificationWrapper;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "NotificationWrapper", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedbackTileDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ButtonV3DTO> buttons;

    @NotNull
    private final NotificationWrapper notification;

    @NotNull
    private final TextDTO text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackTile/data/FeedbackTileDTO$NotificationWrapper;", "", "success", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getSuccess", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationWrapper {
        public static final int $stable = NotificationDTO.$stable;

        @NotNull
        private final NotificationDTO success;

        public NotificationWrapper(@NotNull NotificationDTO success) {
            Intrinsics.checkNotNullParameter(success, "success");
            this.success = success;
        }

        public static /* synthetic */ NotificationWrapper copy$default(NotificationWrapper notificationWrapper, NotificationDTO notificationDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                notificationDTO = notificationWrapper.success;
            }
            return notificationWrapper.copy(notificationDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final NotificationDTO getSuccess() {
            return this.success;
        }

        @NotNull
        public final NotificationWrapper copy(@NotNull NotificationDTO success) {
            Intrinsics.checkNotNullParameter(success, "success");
            return new NotificationWrapper(success);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotificationWrapper) && Intrinsics.d(this.success, ((NotificationWrapper) other).success);
        }

        @NotNull
        public final NotificationDTO getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return this.success.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e("NotificationWrapper(success=", ")", this.success);
        }
    }

    public FeedbackTileDTO(@NotNull TextDTO text, @NotNull List<ButtonV3DTO> buttons, @NotNull NotificationWrapper notification, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.text = text;
        this.buttons = buttons;
        this.notification = notification;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackTileDTO copy$default(FeedbackTileDTO feedbackTileDTO, TextDTO textDTO, List list, NotificationWrapper notificationWrapper, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = feedbackTileDTO.text;
        }
        if ((i11 & 2) != 0) {
            list = feedbackTileDTO.buttons;
        }
        if ((i11 & 4) != 0) {
            notificationWrapper = feedbackTileDTO.notification;
        }
        if ((i11 & 8) != 0) {
            map = feedbackTileDTO.trackingInfo;
        }
        return feedbackTileDTO.copy(textDTO, list, notificationWrapper, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    public final List<ButtonV3DTO> component2() {
        return this.buttons;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final NotificationWrapper getNotification() {
        return this.notification;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final FeedbackTileDTO copy(@NotNull TextDTO text, @NotNull List<ButtonV3DTO> buttons, @NotNull NotificationWrapper notification, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(notification, "notification");
        return new FeedbackTileDTO(text, buttons, notification, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackTileDTO)) {
            return false;
        }
        FeedbackTileDTO feedbackTileDTO = (FeedbackTileDTO) other;
        return Intrinsics.d(this.text, feedbackTileDTO.text) && Intrinsics.d(this.buttons, feedbackTileDTO.buttons) && Intrinsics.d(this.notification, feedbackTileDTO.notification) && Intrinsics.d(this.trackingInfo, feedbackTileDTO.trackingInfo);
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final NotificationWrapper getNotification() {
        return this.notification;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.notification.hashCode() + g.b(this.text.hashCode() * 31, 31, this.buttons)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.text;
        List<ButtonV3DTO> list = this.buttons;
        NotificationWrapper notificationWrapper = this.notification;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("FeedbackTileDTO(text=", textDTO, ", buttons=", list, ", notification=");
        e11.append(notificationWrapper);
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(")");
        return e11.toString();
    }
}
