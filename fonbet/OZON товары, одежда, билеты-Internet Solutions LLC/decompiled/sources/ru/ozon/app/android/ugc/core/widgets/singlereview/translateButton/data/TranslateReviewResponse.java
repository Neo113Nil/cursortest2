package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/data/TranslateReviewResponse;", "", "bodySections", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getBodySections$annotations", "()V", "getBodySections", "()Ljava/util/List;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TranslateReviewResponse {
    public static final int $stable = 8;

    @NotNull
    private final List<SingleReviewDTO.BodySectionDTO> bodySections;
    private final NotificationDTO notification;

    public TranslateReviewResponse(@NotNull List<SingleReviewDTO.BodySectionDTO> bodySections, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(bodySections, "bodySections");
        this.bodySections = bodySections;
        this.notification = notificationDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TranslateReviewResponse copy$default(TranslateReviewResponse translateReviewResponse, List list, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = translateReviewResponse.bodySections;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = translateReviewResponse.notification;
        }
        return translateReviewResponse.copy(list, notificationDTO);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getBodySections$annotations() {
    }

    @NotNull
    public final List<SingleReviewDTO.BodySectionDTO> component1() {
        return this.bodySections;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final TranslateReviewResponse copy(@NotNull List<SingleReviewDTO.BodySectionDTO> bodySections, NotificationDTO notification) {
        Intrinsics.checkNotNullParameter(bodySections, "bodySections");
        return new TranslateReviewResponse(bodySections, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranslateReviewResponse)) {
            return false;
        }
        TranslateReviewResponse translateReviewResponse = (TranslateReviewResponse) other;
        return Intrinsics.d(this.bodySections, translateReviewResponse.bodySections) && Intrinsics.d(this.notification, translateReviewResponse.notification);
    }

    @NotNull
    public final List<SingleReviewDTO.BodySectionDTO> getBodySections() {
        return this.bodySections;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        int hashCode = this.bodySections.hashCode() * 31;
        NotificationDTO notificationDTO = this.notification;
        return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "TranslateReviewResponse(bodySections=" + this.bodySections + ", notification=" + this.notification + ")";
    }
}
