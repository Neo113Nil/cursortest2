package ru.ozon.app.android.search.widgets.expandableCells.presentation;

import G.g;
import Kk.C3532b;
import Nh.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.expandableCells.data.ExpandableCellsDTO;
import ru.ozon.app.android.search.widgets.expandableCells.data.api.GetWarlockSectionResponse;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b/\u0010\u001cR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010*\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u00107R$\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010*\u001a\u0004\b8\u0010\u001c\"\u0004\b9\u00107R$\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010*\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u00107R$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010*\u001a\u0004\b<\u0010\u001c\"\u0004\b=\u00107R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/ExpandableCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$ExpandableCell;", "cell", "", "backgroundColor", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "errorNotification", "baseLink", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/CellState;", "state", "skeletonStateId", "tileGrid2StateId", "tileScrollStateId", "buttonWidgetStateId", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "widgetTokenizedEvent", "", "autoExpand", "Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;", "warlockSectionResponse", "<init>", "(JLru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$ExpandableCell;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/String;Lru/ozon/app/android/search/widgets/expandableCells/presentation/CellState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LWZ/t;ZLru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$ExpandableCell;", "getCell", "()Lru/ozon/app/android/search/widgets/expandableCells/data/ExpandableCellsDTO$ExpandableCell;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getBaseLink", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/CellState;", "getState", "()Lru/ozon/app/android/search/widgets/expandableCells/presentation/CellState;", "setState", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/CellState;)V", "getSkeletonStateId", "setSkeletonStateId", "(Ljava/lang/String;)V", "getTileGrid2StateId", "setTileGrid2StateId", "getTileScrollStateId", "setTileScrollStateId", "getButtonWidgetStateId", "setButtonWidgetStateId", "LWZ/t;", "getWidgetTokenizedEvent", "()LWZ/t;", "Z", "getAutoExpand", "()Z", "setAutoExpand", "(Z)V", "Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;", "getWarlockSectionResponse", "()Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;", "setWarlockSectionResponse", "(Lru/ozon/app/android/search/widgets/expandableCells/data/api/GetWarlockSectionResponse;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExpandableCellVO implements c {
    private boolean autoExpand;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String baseLink;
    private String buttonWidgetStateId;

    @NotNull
    private final ExpandableCellsDTO.ExpandableCell cell;
    private final NotificationDTO errorNotification;
    private final long id;
    private String skeletonStateId;

    @NotNull
    private CellState state;
    private String tileGrid2StateId;
    private String tileScrollStateId;
    private GetWarlockSectionResponse warlockSectionResponse;
    private final t widgetTokenizedEvent;

    public ExpandableCellVO(long j11, @NotNull ExpandableCellsDTO.ExpandableCell cell, @NotNull String backgroundColor, NotificationDTO notificationDTO, @NotNull String baseLink, @NotNull CellState state, String str, String str2, String str3, String str4, t tVar, boolean z11, GetWarlockSectionResponse getWarlockSectionResponse) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(baseLink, "baseLink");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.cell = cell;
        this.backgroundColor = backgroundColor;
        this.errorNotification = notificationDTO;
        this.baseLink = baseLink;
        this.state = state;
        this.skeletonStateId = str;
        this.tileGrid2StateId = str2;
        this.tileScrollStateId = str3;
        this.buttonWidgetStateId = str4;
        this.widgetTokenizedEvent = tVar;
        this.autoExpand = z11;
        this.warlockSectionResponse = getWarlockSectionResponse;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableCellVO)) {
            return false;
        }
        ExpandableCellVO expandableCellVO = (ExpandableCellVO) other;
        return this.id == expandableCellVO.id && Intrinsics.d(this.cell, expandableCellVO.cell) && Intrinsics.d(this.backgroundColor, expandableCellVO.backgroundColor) && Intrinsics.d(this.errorNotification, expandableCellVO.errorNotification) && Intrinsics.d(this.baseLink, expandableCellVO.baseLink) && this.state == expandableCellVO.state && Intrinsics.d(this.skeletonStateId, expandableCellVO.skeletonStateId) && Intrinsics.d(this.tileGrid2StateId, expandableCellVO.tileGrid2StateId) && Intrinsics.d(this.tileScrollStateId, expandableCellVO.tileScrollStateId) && Intrinsics.d(this.buttonWidgetStateId, expandableCellVO.buttonWidgetStateId) && Intrinsics.d(this.widgetTokenizedEvent, expandableCellVO.widgetTokenizedEvent) && this.autoExpand == expandableCellVO.autoExpand && Intrinsics.d(this.warlockSectionResponse, expandableCellVO.warlockSectionResponse);
    }

    public final boolean getAutoExpand() {
        return this.autoExpand;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getBaseLink() {
        return this.baseLink;
    }

    public final String getButtonWidgetStateId() {
        return this.buttonWidgetStateId;
    }

    @NotNull
    public final ExpandableCellsDTO.ExpandableCell getCell() {
        return this.cell;
    }

    public final NotificationDTO getErrorNotification() {
        return this.errorNotification;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSkeletonStateId() {
        return this.skeletonStateId;
    }

    @NotNull
    public final CellState getState() {
        return this.state;
    }

    public final String getTileGrid2StateId() {
        return this.tileGrid2StateId;
    }

    public final String getTileScrollStateId() {
        return this.tileScrollStateId;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final GetWarlockSectionResponse getWarlockSectionResponse() {
        return this.warlockSectionResponse;
    }

    public final t getWidgetTokenizedEvent() {
        return this.widgetTokenizedEvent;
    }

    public int hashCode() {
        int a11 = g.a((this.cell.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.backgroundColor);
        NotificationDTO notificationDTO = this.errorNotification;
        int hashCode = (this.state.hashCode() + g.a((a11 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31, 31, this.baseLink)) * 31;
        String str = this.skeletonStateId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tileGrid2StateId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tileScrollStateId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonWidgetStateId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        t tVar = this.widgetTokenizedEvent;
        int a12 = C3532b.a((hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.autoExpand);
        GetWarlockSectionResponse getWarlockSectionResponse = this.warlockSectionResponse;
        return a12 + (getWarlockSectionResponse != null ? getWarlockSectionResponse.hashCode() : 0);
    }

    public final void setAutoExpand(boolean z11) {
        this.autoExpand = z11;
    }

    public final void setButtonWidgetStateId(String str) {
        this.buttonWidgetStateId = str;
    }

    public final void setSkeletonStateId(String str) {
        this.skeletonStateId = str;
    }

    public final void setState(@NotNull CellState cellState) {
        Intrinsics.checkNotNullParameter(cellState, "<set-?>");
        this.state = cellState;
    }

    public final void setTileGrid2StateId(String str) {
        this.tileGrid2StateId = str;
    }

    public final void setTileScrollStateId(String str) {
        this.tileScrollStateId = str;
    }

    public final void setWarlockSectionResponse(GetWarlockSectionResponse getWarlockSectionResponse) {
        this.warlockSectionResponse = getWarlockSectionResponse;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ExpandableCellsDTO.ExpandableCell expandableCell = this.cell;
        String str = this.backgroundColor;
        NotificationDTO notificationDTO = this.errorNotification;
        String str2 = this.baseLink;
        CellState cellState = this.state;
        String str3 = this.skeletonStateId;
        String str4 = this.tileGrid2StateId;
        String str5 = this.tileScrollStateId;
        String str6 = this.buttonWidgetStateId;
        t tVar = this.widgetTokenizedEvent;
        boolean z11 = this.autoExpand;
        GetWarlockSectionResponse getWarlockSectionResponse = this.warlockSectionResponse;
        StringBuilder sb2 = new StringBuilder("ExpandableCellVO(id=");
        sb2.append(j11);
        sb2.append(", cell=");
        sb2.append(expandableCell);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", errorNotification=");
        sb2.append(notificationDTO);
        sb2.append(", baseLink=");
        sb2.append(str2);
        sb2.append(", state=");
        sb2.append(cellState);
        a.h(sb2, ", skeletonStateId=", str3, ", tileGrid2StateId=", str4);
        a.h(sb2, ", tileScrollStateId=", str5, ", buttonWidgetStateId=", str6);
        sb2.append(", widgetTokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", autoExpand=");
        sb2.append(z11);
        sb2.append(", warlockSectionResponse=");
        sb2.append(getWarlockSectionResponse);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ExpandableCellVO(long j11, ExpandableCellsDTO.ExpandableCell expandableCell, String str, NotificationDTO notificationDTO, String str2, CellState cellState, String str3, String str4, String str5, String str6, t tVar, boolean z11, GetWarlockSectionResponse getWarlockSectionResponse, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, expandableCell, str, notificationDTO, str2, cellState, (i11 & 64) != 0 ? null : str3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : str6, tVar, z11, (i11 & 4096) != 0 ? null : getWarlockSectionResponse);
    }
}
