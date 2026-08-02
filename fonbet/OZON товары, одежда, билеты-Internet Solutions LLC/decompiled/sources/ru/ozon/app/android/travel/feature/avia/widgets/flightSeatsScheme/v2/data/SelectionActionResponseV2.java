package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data;

import De.C2859b;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J[\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/SelectionActionResponseV2;", "", "passengers", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$PassengerV2DTO;", "caption", "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "infoIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "skipButton", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getPassengers", "()Ljava/util/List;", "getCaption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getInfoIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getSkipButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SelectionActionResponseV2 {
    public static final int $stable = 8;

    @NotNull
    private final TextDTO caption;
    private final CommonControlSettings common;
    private final CommonAtomIconDTO infoIcon;

    @NotNull
    private final List<FooterBlockV2DTO.PassengerV2DTO> passengers;

    @NotNull
    private final TextDTO price;
    private final ButtonV3DTO skipButton;

    @NotNull
    private final ButtonV3DTO submitButton;

    public SelectionActionResponseV2(@NotNull List<FooterBlockV2DTO.PassengerV2DTO> passengers, @NotNull TextDTO caption, @NotNull TextDTO price, @NotNull ButtonV3DTO submitButton, CommonAtomIconDTO commonAtomIconDTO, CommonControlSettings commonControlSettings, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.passengers = passengers;
        this.caption = caption;
        this.price = price;
        this.submitButton = submitButton;
        this.infoIcon = commonAtomIconDTO;
        this.common = commonControlSettings;
        this.skipButton = buttonV3DTO;
    }

    public static /* synthetic */ SelectionActionResponseV2 copy$default(SelectionActionResponseV2 selectionActionResponseV2, List list, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, CommonAtomIconDTO commonAtomIconDTO, CommonControlSettings commonControlSettings, ButtonV3DTO buttonV3DTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = selectionActionResponseV2.passengers;
        }
        if ((i11 & 2) != 0) {
            textDTO = selectionActionResponseV2.caption;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = selectionActionResponseV2.price;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = selectionActionResponseV2.submitButton;
        }
        if ((i11 & 16) != 0) {
            commonAtomIconDTO = selectionActionResponseV2.infoIcon;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = selectionActionResponseV2.common;
        }
        if ((i11 & 64) != 0) {
            buttonV3DTO2 = selectionActionResponseV2.skipButton;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
        CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
        TextDTO textDTO3 = textDTO2;
        return selectionActionResponseV2.copy(list, textDTO, textDTO3, buttonV3DTO, commonAtomIconDTO2, commonControlSettings2, buttonV3DTO3);
    }

    @NotNull
    public final List<FooterBlockV2DTO.PassengerV2DTO> component1() {
        return this.passengers;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getCaption() {
        return this.caption;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonAtomIconDTO getInfoIcon() {
        return this.infoIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3DTO getSkipButton() {
        return this.skipButton;
    }

    @NotNull
    public final SelectionActionResponseV2 copy(@NotNull List<FooterBlockV2DTO.PassengerV2DTO> passengers, @NotNull TextDTO caption, @NotNull TextDTO price, @NotNull ButtonV3DTO submitButton, CommonAtomIconDTO infoIcon, CommonControlSettings common, ButtonV3DTO skipButton) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new SelectionActionResponseV2(passengers, caption, price, submitButton, infoIcon, common, skipButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionActionResponseV2)) {
            return false;
        }
        SelectionActionResponseV2 selectionActionResponseV2 = (SelectionActionResponseV2) other;
        return Intrinsics.d(this.passengers, selectionActionResponseV2.passengers) && Intrinsics.d(this.caption, selectionActionResponseV2.caption) && Intrinsics.d(this.price, selectionActionResponseV2.price) && Intrinsics.d(this.submitButton, selectionActionResponseV2.submitButton) && Intrinsics.d(this.infoIcon, selectionActionResponseV2.infoIcon) && Intrinsics.d(this.common, selectionActionResponseV2.common) && Intrinsics.d(this.skipButton, selectionActionResponseV2.skipButton);
    }

    @NotNull
    public final TextDTO getCaption() {
        return this.caption;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final CommonAtomIconDTO getInfoIcon() {
        return this.infoIcon;
    }

    @NotNull
    public final List<FooterBlockV2DTO.PassengerV2DTO> getPassengers() {
        return this.passengers;
    }

    @NotNull
    public final TextDTO getPrice() {
        return this.price;
    }

    public final ButtonV3DTO getSkipButton() {
        return this.skipButton;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.submitButton, b.a(this.price, b.a(this.caption, this.passengers.hashCode() * 31, 31), 31), 31);
        CommonAtomIconDTO commonAtomIconDTO = this.infoIcon;
        int hashCode = (c11 + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.skipButton;
        return hashCode2 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SelectionActionResponseV2(passengers=" + this.passengers + ", caption=" + this.caption + ", price=" + this.price + ", submitButton=" + this.submitButton + ", infoIcon=" + this.infoIcon + ", common=" + this.common + ", skipButton=" + this.skipButton + ")";
    }
}
