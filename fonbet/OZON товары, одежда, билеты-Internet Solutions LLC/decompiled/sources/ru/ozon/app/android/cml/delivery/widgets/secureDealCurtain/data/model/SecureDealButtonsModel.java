package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/model/SecureDealButtonsModel;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "mainButton", "secondaryButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getMainButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondaryButton", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SecureDealButtonsModel {

    @NotNull
    private final ButtonV3DTO mainButton;
    private final ButtonV3DTO secondaryButton;

    public SecureDealButtonsModel(@NotNull ButtonV3DTO mainButton, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(mainButton, "mainButton");
        this.mainButton = mainButton;
        this.secondaryButton = buttonV3DTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecureDealButtonsModel)) {
            return false;
        }
        SecureDealButtonsModel secureDealButtonsModel = (SecureDealButtonsModel) other;
        return Intrinsics.d(this.mainButton, secureDealButtonsModel.mainButton) && Intrinsics.d(this.secondaryButton, secureDealButtonsModel.secondaryButton);
    }

    @NotNull
    public final ButtonV3DTO getMainButton() {
        return this.mainButton;
    }

    public final ButtonV3DTO getSecondaryButton() {
        return this.secondaryButton;
    }

    public int hashCode() {
        int hashCode = this.mainButton.hashCode() * 31;
        ButtonV3DTO buttonV3DTO = this.secondaryButton;
        return hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "SecureDealButtonsModel(mainButton=" + this.mainButton + ", secondaryButton=" + this.secondaryButton + ")";
    }
}
