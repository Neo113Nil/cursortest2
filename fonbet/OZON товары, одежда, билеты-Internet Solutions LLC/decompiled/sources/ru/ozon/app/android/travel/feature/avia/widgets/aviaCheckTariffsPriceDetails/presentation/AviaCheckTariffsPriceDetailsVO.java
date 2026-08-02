package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation;

import Ak.C2436a;
import De.C2859b;
import F3.G;
import Kk.C3532b;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003BU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJn\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u001a\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b;\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Landroid/os/Parcelable;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "continueButton", "scrollToWidgetButton", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "luggage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "priceDescription", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewTracking", "", "shouldAnimateLuggageAppearance", "shouldShowContinueButton", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;ZZ)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getContinueButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getScrollToWidgetButton", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getLuggage", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPriceDescription", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "LWZ/t;", "getViewTracking", "()LWZ/t;", "Z", "getShouldAnimateLuggageAppearance", "()Z", "getShouldShowContinueButton", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaCheckTariffsPriceDetailsVO implements c, Parcelable {

    @NotNull
    public static final Parcelable.Creator<AviaCheckTariffsPriceDetailsVO> CREATOR = new Creator();

    @NotNull
    private final ButtonV3DTO continueButton;
    private final long id;
    private final CellDTO luggage;
    private final TextDTO priceDescription;
    private final ButtonV3DTO scrollToWidgetButton;
    private final boolean shouldAnimateLuggageAppearance;
    private final boolean shouldShowContinueButton;
    private final t viewTracking;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AviaCheckTariffsPriceDetailsVO> {
        @Override // android.os.Parcelable.Creator
        public final AviaCheckTariffsPriceDetailsVO createFromParcel(Parcel parcel) {
            boolean z11;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long readLong = parcel.readLong();
            ButtonV3DTO buttonV3DTO = (ButtonV3DTO) parcel.readParcelable(AviaCheckTariffsPriceDetailsVO.class.getClassLoader());
            ButtonV3DTO buttonV3DTO2 = (ButtonV3DTO) parcel.readParcelable(AviaCheckTariffsPriceDetailsVO.class.getClassLoader());
            CellDTO cellDTO = (CellDTO) parcel.readParcelable(AviaCheckTariffsPriceDetailsVO.class.getClassLoader());
            TextDTO textDTO = (TextDTO) parcel.readParcelable(AviaCheckTariffsPriceDetailsVO.class.getClassLoader());
            t tVar = (t) parcel.readParcelable(AviaCheckTariffsPriceDetailsVO.class.getClassLoader());
            boolean z12 = false;
            if (parcel.readInt() != 0) {
                z11 = false;
                z12 = true;
            } else {
                z11 = false;
            }
            return new AviaCheckTariffsPriceDetailsVO(readLong, buttonV3DTO, buttonV3DTO2, cellDTO, textDTO, tVar, z12, parcel.readInt() == 0 ? z11 : true);
        }

        @Override // android.os.Parcelable.Creator
        public final AviaCheckTariffsPriceDetailsVO[] newArray(int i11) {
            return new AviaCheckTariffsPriceDetailsVO[i11];
        }
    }

    public AviaCheckTariffsPriceDetailsVO(long j11, @NotNull ButtonV3DTO continueButton, ButtonV3DTO buttonV3DTO, CellDTO cellDTO, TextDTO textDTO, t tVar, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        this.id = j11;
        this.continueButton = continueButton;
        this.scrollToWidgetButton = buttonV3DTO;
        this.luggage = cellDTO;
        this.priceDescription = textDTO;
        this.viewTracking = tVar;
        this.shouldAnimateLuggageAppearance = z11;
        this.shouldShowContinueButton = z12;
    }

    public static /* synthetic */ AviaCheckTariffsPriceDetailsVO copy$default(AviaCheckTariffsPriceDetailsVO aviaCheckTariffsPriceDetailsVO, long j11, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, CellDTO cellDTO, TextDTO textDTO, t tVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aviaCheckTariffsPriceDetailsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            buttonV3DTO = aviaCheckTariffsPriceDetailsVO.continueButton;
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        if ((i11 & 4) != 0) {
            buttonV3DTO2 = aviaCheckTariffsPriceDetailsVO.scrollToWidgetButton;
        }
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO2;
        if ((i11 & 8) != 0) {
            cellDTO = aviaCheckTariffsPriceDetailsVO.luggage;
        }
        return aviaCheckTariffsPriceDetailsVO.copy(j12, buttonV3DTO3, buttonV3DTO4, cellDTO, (i11 & 16) != 0 ? aviaCheckTariffsPriceDetailsVO.priceDescription : textDTO, (i11 & 32) != 0 ? aviaCheckTariffsPriceDetailsVO.viewTracking : tVar, (i11 & 64) != 0 ? aviaCheckTariffsPriceDetailsVO.shouldAnimateLuggageAppearance : z11, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? aviaCheckTariffsPriceDetailsVO.shouldShowContinueButton : z12);
    }

    @NotNull
    public final AviaCheckTariffsPriceDetailsVO copy(long id2, @NotNull ButtonV3DTO continueButton, ButtonV3DTO scrollToWidgetButton, CellDTO luggage, TextDTO priceDescription, t viewTracking, boolean shouldAnimateLuggageAppearance, boolean shouldShowContinueButton) {
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        return new AviaCheckTariffsPriceDetailsVO(id2, continueButton, scrollToWidgetButton, luggage, priceDescription, viewTracking, shouldAnimateLuggageAppearance, shouldShowContinueButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaCheckTariffsPriceDetailsVO)) {
            return false;
        }
        AviaCheckTariffsPriceDetailsVO aviaCheckTariffsPriceDetailsVO = (AviaCheckTariffsPriceDetailsVO) other;
        return this.id == aviaCheckTariffsPriceDetailsVO.id && Intrinsics.d(this.continueButton, aviaCheckTariffsPriceDetailsVO.continueButton) && Intrinsics.d(this.scrollToWidgetButton, aviaCheckTariffsPriceDetailsVO.scrollToWidgetButton) && Intrinsics.d(this.luggage, aviaCheckTariffsPriceDetailsVO.luggage) && Intrinsics.d(this.priceDescription, aviaCheckTariffsPriceDetailsVO.priceDescription) && Intrinsics.d(this.viewTracking, aviaCheckTariffsPriceDetailsVO.viewTracking) && this.shouldAnimateLuggageAppearance == aviaCheckTariffsPriceDetailsVO.shouldAnimateLuggageAppearance && this.shouldShowContinueButton == aviaCheckTariffsPriceDetailsVO.shouldShowContinueButton;
    }

    @NotNull
    public final ButtonV3DTO getContinueButton() {
        return this.continueButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final CellDTO getLuggage() {
        return this.luggage;
    }

    public final TextDTO getPriceDescription() {
        return this.priceDescription;
    }

    public final ButtonV3DTO getScrollToWidgetButton() {
        return this.scrollToWidgetButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldAnimateLuggageAppearance() {
        return this.shouldAnimateLuggageAppearance;
    }

    public final boolean getShouldShowContinueButton() {
        return this.shouldShowContinueButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.continueButton, Long.hashCode(this.id) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.scrollToWidgetButton;
        int hashCode = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        CellDTO cellDTO = this.luggage;
        int hashCode2 = (hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        TextDTO textDTO = this.priceDescription;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        t tVar = this.viewTracking;
        return Boolean.hashCode(this.shouldShowContinueButton) + C3532b.a((hashCode3 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.shouldAnimateLuggageAppearance);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.continueButton;
        ButtonV3DTO buttonV3DTO2 = this.scrollToWidgetButton;
        CellDTO cellDTO = this.luggage;
        TextDTO textDTO = this.priceDescription;
        t tVar = this.viewTracking;
        boolean z11 = this.shouldAnimateLuggageAppearance;
        boolean z12 = this.shouldShowContinueButton;
        StringBuilder c11 = G.c("AviaCheckTariffsPriceDetailsVO(id=", j11, ", continueButton=", buttonV3DTO);
        c11.append(", scrollToWidgetButton=");
        c11.append(buttonV3DTO2);
        c11.append(", luggage=");
        c11.append(cellDTO);
        c11.append(", priceDescription=");
        c11.append(textDTO);
        c11.append(", viewTracking=");
        c11.append(tVar);
        C2436a.e(", shouldAnimateLuggageAppearance=", ", shouldShowContinueButton=", c11, z11, z12);
        c11.append(")");
        return c11.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeParcelable(this.continueButton, flags);
        dest.writeParcelable(this.scrollToWidgetButton, flags);
        dest.writeParcelable(this.luggage, flags);
        dest.writeParcelable(this.priceDescription, flags);
        dest.writeParcelable(this.viewTracking, flags);
        dest.writeInt(this.shouldAnimateLuggageAppearance ? 1 : 0);
        dest.writeInt(this.shouldShowContinueButton ? 1 : 0);
    }
}
