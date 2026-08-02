package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import Bi.a;
import D3.h;
import Kk.C3532b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.data.TotalStickyV3DTO;
import ru.ozon.app.android.checkoutgeo.checkout.views.totalButton.TotalButtonDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J`\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "additionalInfo", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;", "totalButton", "", "showRoundedHeader", "", "asyncData", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;", "widgetContainerSettings", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;ZLjava/lang/String;LWZ/t;Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;)V", "copy", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;ZLjava/lang/String;LWZ/t;Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getAdditionalInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;", "getTotalButton", "()Lru/ozon/app/android/checkoutgeo/checkout/views/totalButton/TotalButtonDTO;", "Z", "getShowRoundedHeader", "()Z", "Ljava/lang/String;", "getAsyncData", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;", "getWidgetContainerSettings", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO$ContainerSettings;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalStickyV3VO implements c {
    private final CellDTO additionalInfo;
    private final String asyncData;
    private final long id;
    private final boolean showRoundedHeader;
    private final t tokenizedEvent;
    private final TotalButtonDTO totalButton;
    private final TotalStickyV3DTO.ContainerSettings widgetContainerSettings;

    public TotalStickyV3VO(long j11, CellDTO cellDTO, TotalButtonDTO totalButtonDTO, boolean z11, String str, t tVar, TotalStickyV3DTO.ContainerSettings containerSettings) {
        this.id = j11;
        this.additionalInfo = cellDTO;
        this.totalButton = totalButtonDTO;
        this.showRoundedHeader = z11;
        this.asyncData = str;
        this.tokenizedEvent = tVar;
        this.widgetContainerSettings = containerSettings;
    }

    public static /* synthetic */ TotalStickyV3VO copy$default(TotalStickyV3VO totalStickyV3VO, long j11, CellDTO cellDTO, TotalButtonDTO totalButtonDTO, boolean z11, String str, t tVar, TotalStickyV3DTO.ContainerSettings containerSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = totalStickyV3VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            cellDTO = totalStickyV3VO.additionalInfo;
        }
        CellDTO cellDTO2 = cellDTO;
        if ((i11 & 4) != 0) {
            totalButtonDTO = totalStickyV3VO.totalButton;
        }
        TotalButtonDTO totalButtonDTO2 = totalButtonDTO;
        if ((i11 & 8) != 0) {
            z11 = totalStickyV3VO.showRoundedHeader;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            str = totalStickyV3VO.asyncData;
        }
        return totalStickyV3VO.copy(j12, cellDTO2, totalButtonDTO2, z12, str, (i11 & 32) != 0 ? totalStickyV3VO.tokenizedEvent : tVar, (i11 & 64) != 0 ? totalStickyV3VO.widgetContainerSettings : containerSettings);
    }

    @NotNull
    public final TotalStickyV3VO copy(long id2, CellDTO additionalInfo, TotalButtonDTO totalButton, boolean showRoundedHeader, String asyncData, t tokenizedEvent, TotalStickyV3DTO.ContainerSettings widgetContainerSettings) {
        return new TotalStickyV3VO(id2, additionalInfo, totalButton, showRoundedHeader, asyncData, tokenizedEvent, widgetContainerSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalStickyV3VO)) {
            return false;
        }
        TotalStickyV3VO totalStickyV3VO = (TotalStickyV3VO) other;
        return this.id == totalStickyV3VO.id && Intrinsics.d(this.additionalInfo, totalStickyV3VO.additionalInfo) && Intrinsics.d(this.totalButton, totalStickyV3VO.totalButton) && this.showRoundedHeader == totalStickyV3VO.showRoundedHeader && Intrinsics.d(this.asyncData, totalStickyV3VO.asyncData) && Intrinsics.d(this.tokenizedEvent, totalStickyV3VO.tokenizedEvent) && Intrinsics.d(this.widgetContainerSettings, totalStickyV3VO.widgetContainerSettings);
    }

    public final CellDTO getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final boolean getShowRoundedHeader() {
        return this.showRoundedHeader;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final TotalButtonDTO getTotalButton() {
        return this.totalButton;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final TotalStickyV3DTO.ContainerSettings getWidgetContainerSettings() {
        return this.widgetContainerSettings;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        CellDTO cellDTO = this.additionalInfo;
        int hashCode2 = (hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        TotalButtonDTO totalButtonDTO = this.totalButton;
        int a11 = C3532b.a((hashCode2 + (totalButtonDTO == null ? 0 : totalButtonDTO.hashCode())) * 31, 31, this.showRoundedHeader);
        String str = this.asyncData;
        int hashCode3 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        TotalStickyV3DTO.ContainerSettings containerSettings = this.widgetContainerSettings;
        return hashCode4 + (containerSettings != null ? containerSettings.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.additionalInfo;
        TotalButtonDTO totalButtonDTO = this.totalButton;
        boolean z11 = this.showRoundedHeader;
        String str = this.asyncData;
        t tVar = this.tokenizedEvent;
        TotalStickyV3DTO.ContainerSettings containerSettings = this.widgetContainerSettings;
        StringBuilder e11 = h.e("TotalStickyV3VO(id=", j11, ", additionalInfo=", cellDTO);
        e11.append(", totalButton=");
        e11.append(totalButtonDTO);
        e11.append(", showRoundedHeader=");
        e11.append(z11);
        a.f(e11, ", asyncData=", str, ", tokenizedEvent=", tVar);
        e11.append(", widgetContainerSettings=");
        e11.append(containerSettings);
        e11.append(")");
        return e11.toString();
    }
}
