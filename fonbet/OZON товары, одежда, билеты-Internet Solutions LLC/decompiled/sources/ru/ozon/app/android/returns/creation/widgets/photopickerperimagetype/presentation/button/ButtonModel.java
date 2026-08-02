package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.presentation.button;

import D40.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.data.ReturnCreationPhotoPickerPerImageTypeDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/presentation/button/ButtonModel;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "continueButton", "", "", "minCounts", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;", "notifications", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getContinueButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/Map;", "getMinCounts", "()Ljava/util/Map;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;", "getNotifications", "()Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/data/ReturnCreationPhotoPickerPerImageTypeDTO$Notifications;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ButtonModel {

    @NotNull
    private final ButtonV3DTO continueButton;

    @NotNull
    private final Map<Integer, Integer> minCounts;

    @NotNull
    private final ReturnCreationPhotoPickerPerImageTypeDTO.Notifications notifications;

    public ButtonModel(@NotNull ButtonV3DTO continueButton, @NotNull Map<Integer, Integer> minCounts, @NotNull ReturnCreationPhotoPickerPerImageTypeDTO.Notifications notifications) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        Intrinsics.checkNotNullParameter(minCounts, "minCounts");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.continueButton = continueButton;
        this.minCounts = minCounts;
        this.notifications = notifications;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonModel)) {
            return false;
        }
        ButtonModel buttonModel = (ButtonModel) other;
        return Intrinsics.d(this.continueButton, buttonModel.continueButton) && Intrinsics.d(this.minCounts, buttonModel.minCounts) && Intrinsics.d(this.notifications, buttonModel.notifications);
    }

    @NotNull
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @NotNull
    public final Map<Integer, Integer> getMinCounts() {
        return this.minCounts;
    }

    @NotNull
    public final ReturnCreationPhotoPickerPerImageTypeDTO.Notifications getNotifications() {
        return this.notifications;
    }

    public int hashCode() {
        return this.notifications.hashCode() + c.a(this.minCounts, this.continueButton.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "ButtonModel(continueButton=" + this.continueButton + ", minCounts=" + this.minCounts + ", notifications=" + this.notifications + ")";
    }
}
