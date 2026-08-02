package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.buttons;

import De.C2859b;
import F3.G;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/buttons/PassengersDirectoryV3ButtonsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "selectButton", "addDocumentButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSelectButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddDocumentButton", "LWZ/t;", "getViewEvent", "()LWZ/t;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassengersDirectoryV3ButtonsVO implements c {

    @NotNull
    private final ButtonV3DTO addDocumentButton;
    private final long id;
    private final ButtonV3DTO selectButton;
    private final t viewEvent;

    public PassengersDirectoryV3ButtonsVO(long j11, ButtonV3DTO buttonV3DTO, @NotNull ButtonV3DTO addDocumentButton, t tVar) {
        Intrinsics.checkNotNullParameter(addDocumentButton, "addDocumentButton");
        this.id = j11;
        this.selectButton = buttonV3DTO;
        this.addDocumentButton = addDocumentButton;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersDirectoryV3ButtonsVO)) {
            return false;
        }
        PassengersDirectoryV3ButtonsVO passengersDirectoryV3ButtonsVO = (PassengersDirectoryV3ButtonsVO) other;
        return this.id == passengersDirectoryV3ButtonsVO.id && Intrinsics.d(this.selectButton, passengersDirectoryV3ButtonsVO.selectButton) && Intrinsics.d(this.addDocumentButton, passengersDirectoryV3ButtonsVO.addDocumentButton) && Intrinsics.d(this.viewEvent, passengersDirectoryV3ButtonsVO.viewEvent);
    }

    @NotNull
    public final ButtonV3DTO getAddDocumentButton() {
        return this.addDocumentButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3DTO getSelectButton() {
        return this.selectButton;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ButtonV3DTO buttonV3DTO = this.selectButton;
        int c11 = C2859b.c(this.addDocumentButton, (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31);
        t tVar = this.viewEvent;
        return c11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.selectButton;
        ButtonV3DTO buttonV3DTO2 = this.addDocumentButton;
        t tVar = this.viewEvent;
        StringBuilder c11 = G.c("PassengersDirectoryV3ButtonsVO(id=", j11, ", selectButton=", buttonV3DTO);
        c11.append(", addDocumentButton=");
        c11.append(buttonV3DTO2);
        c11.append(", viewEvent=");
        c11.append(tVar);
        c11.append(")");
        return c11.toString();
    }
}
