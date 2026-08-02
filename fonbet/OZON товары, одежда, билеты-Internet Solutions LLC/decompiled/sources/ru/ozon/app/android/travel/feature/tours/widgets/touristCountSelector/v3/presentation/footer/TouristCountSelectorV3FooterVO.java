package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.footer;

import F3.G;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\b\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "addRoomButton", "", "isAddRoomButtonVisible", "applyButton", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "copy", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/footer/TouristCountSelectorV3FooterVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddRoomButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Z", "()Z", "getApplyButton", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TouristCountSelectorV3FooterVO implements c {
    private final ButtonV3DTO addRoomButton;

    @NotNull
    private final ButtonV3DTO applyButton;
    private final long id;
    private final boolean isAddRoomButtonVisible;

    public TouristCountSelectorV3FooterVO(long j11, ButtonV3DTO buttonV3DTO, boolean z11, @NotNull ButtonV3DTO applyButton) {
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        this.id = j11;
        this.addRoomButton = buttonV3DTO;
        this.isAddRoomButtonVisible = z11;
        this.applyButton = applyButton;
    }

    public static /* synthetic */ TouristCountSelectorV3FooterVO copy$default(TouristCountSelectorV3FooterVO touristCountSelectorV3FooterVO, long j11, ButtonV3DTO buttonV3DTO, boolean z11, ButtonV3DTO buttonV3DTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = touristCountSelectorV3FooterVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            buttonV3DTO = touristCountSelectorV3FooterVO.addRoomButton;
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        if ((i11 & 4) != 0) {
            z11 = touristCountSelectorV3FooterVO.isAddRoomButtonVisible;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            buttonV3DTO2 = touristCountSelectorV3FooterVO.applyButton;
        }
        return touristCountSelectorV3FooterVO.copy(j12, buttonV3DTO3, z12, buttonV3DTO2);
    }

    @NotNull
    public final TouristCountSelectorV3FooterVO copy(long id2, ButtonV3DTO addRoomButton, boolean isAddRoomButtonVisible, @NotNull ButtonV3DTO applyButton) {
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        return new TouristCountSelectorV3FooterVO(id2, addRoomButton, isAddRoomButtonVisible, applyButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristCountSelectorV3FooterVO)) {
            return false;
        }
        TouristCountSelectorV3FooterVO touristCountSelectorV3FooterVO = (TouristCountSelectorV3FooterVO) other;
        return this.id == touristCountSelectorV3FooterVO.id && Intrinsics.d(this.addRoomButton, touristCountSelectorV3FooterVO.addRoomButton) && this.isAddRoomButtonVisible == touristCountSelectorV3FooterVO.isAddRoomButtonVisible && Intrinsics.d(this.applyButton, touristCountSelectorV3FooterVO.applyButton);
    }

    public final ButtonV3DTO getAddRoomButton() {
        return this.addRoomButton;
    }

    @NotNull
    public final ButtonV3DTO getApplyButton() {
        return this.applyButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ButtonV3DTO buttonV3DTO = this.addRoomButton;
        return this.applyButton.hashCode() + C3532b.a((hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31, this.isAddRoomButtonVisible);
    }

    /* renamed from: isAddRoomButtonVisible, reason: from getter */
    public final boolean getIsAddRoomButtonVisible() {
        return this.isAddRoomButtonVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.addRoomButton;
        boolean z11 = this.isAddRoomButtonVisible;
        ButtonV3DTO buttonV3DTO2 = this.applyButton;
        StringBuilder c11 = G.c("TouristCountSelectorV3FooterVO(id=", j11, ", addRoomButton=", buttonV3DTO);
        c11.append(", isAddRoomButtonVisible=");
        c11.append(z11);
        c11.append(", applyButton=");
        c11.append(buttonV3DTO2);
        c11.append(")");
        return c11.toString();
    }
}
