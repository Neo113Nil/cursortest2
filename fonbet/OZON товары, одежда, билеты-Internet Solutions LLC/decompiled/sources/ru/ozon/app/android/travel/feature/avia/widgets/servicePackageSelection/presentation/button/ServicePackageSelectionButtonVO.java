package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation.button;

import De.C2859b;
import F3.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/button/ServicePackageSelectionButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "confirmButton", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "milesBadge", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getConfirmButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMilesBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ServicePackageSelectionButtonVO implements c {

    @NotNull
    private final ButtonV3DTO confirmButton;
    private final long id;
    private final BadgeDTO milesBadge;

    public ServicePackageSelectionButtonVO(long j11, @NotNull ButtonV3DTO confirmButton, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        this.id = j11;
        this.confirmButton = confirmButton;
        this.milesBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePackageSelectionButtonVO)) {
            return false;
        }
        ServicePackageSelectionButtonVO servicePackageSelectionButtonVO = (ServicePackageSelectionButtonVO) other;
        return this.id == servicePackageSelectionButtonVO.id && Intrinsics.d(this.confirmButton, servicePackageSelectionButtonVO.confirmButton) && Intrinsics.d(this.milesBadge, servicePackageSelectionButtonVO.milesBadge);
    }

    @NotNull
    public final ButtonV3DTO getConfirmButton() {
        return this.confirmButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final BadgeDTO getMilesBadge() {
        return this.milesBadge;
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
        int c11 = C2859b.c(this.confirmButton, Long.hashCode(this.id) * 31, 31);
        BadgeDTO badgeDTO = this.milesBadge;
        return c11 + (badgeDTO == null ? 0 : badgeDTO.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ButtonV3DTO buttonV3DTO = this.confirmButton;
        BadgeDTO badgeDTO = this.milesBadge;
        StringBuilder c11 = G.c("ServicePackageSelectionButtonVO(id=", j11, ", confirmButton=", buttonV3DTO);
        c11.append(", milesBadge=");
        c11.append(badgeDTO);
        c11.append(")");
        return c11.toString();
    }
}
