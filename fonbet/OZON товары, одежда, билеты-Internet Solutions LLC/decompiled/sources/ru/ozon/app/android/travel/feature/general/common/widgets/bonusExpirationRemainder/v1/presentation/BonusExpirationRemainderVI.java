package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation;

import Ak.C2436a;
import Bi.b;
import De.C2859b;
import E0.C2942q;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bonusExpirationRemainder/v1/presentation/BonusExpirationRemainderVI;", "Ll20/c;", "", "id", "", "key", "timestamp", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "widgetSettings", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "", "shouldAddMargins", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "LWZ/t;", "trackingInfo", "<init>", "(JLjava/lang/String;JLru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getKey", "getTimestamp", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getWidgetSettings", "()Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Z", "getShouldAddMargins", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BonusExpirationRemainderVI implements c {

    @NotNull
    private final CellDTO cell;
    private final AtomAction clickAction;
    private final IconButtonV3DTO closeButton;
    private final long id;
    private final String key;
    private final boolean shouldAddMargins;
    private final long timestamp;
    private final t trackingInfo;
    private final TravelWidgetSettingsVO widgetSettings;

    public BonusExpirationRemainderVI(long j11, String str, long j12, TravelWidgetSettingsVO travelWidgetSettingsVO, @NotNull CellDTO cell, IconButtonV3DTO iconButtonV3DTO, boolean z11, AtomAction atomAction, t tVar) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.key = str;
        this.timestamp = j12;
        this.widgetSettings = travelWidgetSettingsVO;
        this.cell = cell;
        this.closeButton = iconButtonV3DTO;
        this.shouldAddMargins = z11;
        this.clickAction = atomAction;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusExpirationRemainderVI)) {
            return false;
        }
        BonusExpirationRemainderVI bonusExpirationRemainderVI = (BonusExpirationRemainderVI) other;
        return this.id == bonusExpirationRemainderVI.id && Intrinsics.d(this.key, bonusExpirationRemainderVI.key) && this.timestamp == bonusExpirationRemainderVI.timestamp && Intrinsics.d(this.widgetSettings, bonusExpirationRemainderVI.widgetSettings) && Intrinsics.d(this.cell, bonusExpirationRemainderVI.cell) && Intrinsics.d(this.closeButton, bonusExpirationRemainderVI.closeButton) && this.shouldAddMargins == bonusExpirationRemainderVI.shouldAddMargins && Intrinsics.d(this.clickAction, bonusExpirationRemainderVI.clickAction) && Intrinsics.d(this.trackingInfo, bonusExpirationRemainderVI.trackingInfo);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final AtomAction getClickAction() {
        return this.clickAction;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShouldAddMargins() {
        return this.shouldAddMargins;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final TravelWidgetSettingsVO getWidgetSettings() {
        return this.widgetSettings;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.key;
        int a11 = Pk0.c.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.timestamp);
        TravelWidgetSettingsVO travelWidgetSettingsVO = this.widgetSettings;
        int c11 = b.c(this.cell, (a11 + (travelWidgetSettingsVO == null ? 0 : travelWidgetSettingsVO.hashCode())) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int a12 = C3532b.a((c11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31, this.shouldAddMargins);
        AtomAction atomAction = this.clickAction;
        int hashCode2 = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.trackingInfo;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.key;
        long j12 = this.timestamp;
        TravelWidgetSettingsVO travelWidgetSettingsVO = this.widgetSettings;
        CellDTO cellDTO = this.cell;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        boolean z11 = this.shouldAddMargins;
        AtomAction atomAction = this.clickAction;
        t tVar = this.trackingInfo;
        StringBuilder c11 = C2436a.c(j11, "BonusExpirationRemainderVI(id=", ", key=", str);
        C2942q.f(c11, ", timestamp=", j12, ", widgetSettings=");
        c11.append(travelWidgetSettingsVO);
        c11.append(", cell=");
        c11.append(cellDTO);
        c11.append(", closeButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", shouldAddMargins=");
        c11.append(z11);
        c11.append(", clickAction=");
        return C2859b.e(tVar, ", trackingInfo=", ")", c11, atomAction);
    }
}
