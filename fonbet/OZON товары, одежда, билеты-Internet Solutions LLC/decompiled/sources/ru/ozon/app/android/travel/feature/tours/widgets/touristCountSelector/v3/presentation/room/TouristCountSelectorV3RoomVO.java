package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room;

import Ak.C2436a;
import G.g;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ChildFormVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3QuantityCellVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013Jn\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\b\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b\u000b\u0010%R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b\u0011\u0010%¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "roomTitle", "", "isRoomTitleVisible", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "deleteRoomButton", "isDeleteRoomButtonVisible", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "guests", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "childForms", "isRoomVisible", "<init>", "(JLjava/lang/String;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZLjava/util/List;Ljava/util/List;Z)V", "copy", "(JLjava/lang/String;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;ZLjava/util/List;Ljava/util/List;Z)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getRoomTitle", "Z", "()Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDeleteRoomButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/List;", "getGuests", "()Ljava/util/List;", "getChildForms", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TouristCountSelectorV3RoomVO implements c {

    @NotNull
    private final List<TouristCountSelectorV3ChildFormVO> childForms;
    private final ButtonV3DTO deleteRoomButton;

    @NotNull
    private final List<TouristCountSelectorV3QuantityCellVO> guests;
    private final long id;
    private final boolean isDeleteRoomButtonVisible;
    private final boolean isRoomTitleVisible;
    private final boolean isRoomVisible;

    @NotNull
    private final String roomTitle;

    public TouristCountSelectorV3RoomVO(long j11, @NotNull String roomTitle, boolean z11, ButtonV3DTO buttonV3DTO, boolean z12, @NotNull List<TouristCountSelectorV3QuantityCellVO> guests, @NotNull List<TouristCountSelectorV3ChildFormVO> childForms, boolean z13) {
        Intrinsics.checkNotNullParameter(roomTitle, "roomTitle");
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(childForms, "childForms");
        this.id = j11;
        this.roomTitle = roomTitle;
        this.isRoomTitleVisible = z11;
        this.deleteRoomButton = buttonV3DTO;
        this.isDeleteRoomButtonVisible = z12;
        this.guests = guests;
        this.childForms = childForms;
        this.isRoomVisible = z13;
    }

    public static /* synthetic */ TouristCountSelectorV3RoomVO copy$default(TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO, long j11, String str, boolean z11, ButtonV3DTO buttonV3DTO, boolean z12, List list, List list2, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = touristCountSelectorV3RoomVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = touristCountSelectorV3RoomVO.roomTitle;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z11 = touristCountSelectorV3RoomVO.isRoomTitleVisible;
        }
        boolean z14 = z11;
        if ((i11 & 8) != 0) {
            buttonV3DTO = touristCountSelectorV3RoomVO.deleteRoomButton;
        }
        return touristCountSelectorV3RoomVO.copy(j12, str2, z14, buttonV3DTO, (i11 & 16) != 0 ? touristCountSelectorV3RoomVO.isDeleteRoomButtonVisible : z12, (i11 & 32) != 0 ? touristCountSelectorV3RoomVO.guests : list, (i11 & 64) != 0 ? touristCountSelectorV3RoomVO.childForms : list2, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? touristCountSelectorV3RoomVO.isRoomVisible : z13);
    }

    @NotNull
    public final TouristCountSelectorV3RoomVO copy(long id2, @NotNull String roomTitle, boolean isRoomTitleVisible, ButtonV3DTO deleteRoomButton, boolean isDeleteRoomButtonVisible, @NotNull List<TouristCountSelectorV3QuantityCellVO> guests, @NotNull List<TouristCountSelectorV3ChildFormVO> childForms, boolean isRoomVisible) {
        Intrinsics.checkNotNullParameter(roomTitle, "roomTitle");
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(childForms, "childForms");
        return new TouristCountSelectorV3RoomVO(id2, roomTitle, isRoomTitleVisible, deleteRoomButton, isDeleteRoomButtonVisible, guests, childForms, isRoomVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristCountSelectorV3RoomVO)) {
            return false;
        }
        TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO = (TouristCountSelectorV3RoomVO) other;
        return this.id == touristCountSelectorV3RoomVO.id && Intrinsics.d(this.roomTitle, touristCountSelectorV3RoomVO.roomTitle) && this.isRoomTitleVisible == touristCountSelectorV3RoomVO.isRoomTitleVisible && Intrinsics.d(this.deleteRoomButton, touristCountSelectorV3RoomVO.deleteRoomButton) && this.isDeleteRoomButtonVisible == touristCountSelectorV3RoomVO.isDeleteRoomButtonVisible && Intrinsics.d(this.guests, touristCountSelectorV3RoomVO.guests) && Intrinsics.d(this.childForms, touristCountSelectorV3RoomVO.childForms) && this.isRoomVisible == touristCountSelectorV3RoomVO.isRoomVisible;
    }

    @NotNull
    public final List<TouristCountSelectorV3ChildFormVO> getChildForms() {
        return this.childForms;
    }

    public final ButtonV3DTO getDeleteRoomButton() {
        return this.deleteRoomButton;
    }

    @NotNull
    public final List<TouristCountSelectorV3QuantityCellVO> getGuests() {
        return this.guests;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getRoomTitle() {
        return this.roomTitle;
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
        int a11 = C3532b.a(g.a(Long.hashCode(this.id) * 31, 31, this.roomTitle), 31, this.isRoomTitleVisible);
        ButtonV3DTO buttonV3DTO = this.deleteRoomButton;
        return Boolean.hashCode(this.isRoomVisible) + g.b(g.b(C3532b.a((a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31, this.isDeleteRoomButtonVisible), 31, this.guests), 31, this.childForms);
    }

    /* renamed from: isDeleteRoomButtonVisible, reason: from getter */
    public final boolean getIsDeleteRoomButtonVisible() {
        return this.isDeleteRoomButtonVisible;
    }

    /* renamed from: isRoomTitleVisible, reason: from getter */
    public final boolean getIsRoomTitleVisible() {
        return this.isRoomTitleVisible;
    }

    /* renamed from: isRoomVisible, reason: from getter */
    public final boolean getIsRoomVisible() {
        return this.isRoomVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.roomTitle;
        boolean z11 = this.isRoomTitleVisible;
        ButtonV3DTO buttonV3DTO = this.deleteRoomButton;
        boolean z12 = this.isDeleteRoomButtonVisible;
        List<TouristCountSelectorV3QuantityCellVO> list = this.guests;
        List<TouristCountSelectorV3ChildFormVO> list2 = this.childForms;
        boolean z13 = this.isRoomVisible;
        StringBuilder c11 = C2436a.c(j11, "TouristCountSelectorV3RoomVO(id=", ", roomTitle=", str);
        c11.append(", isRoomTitleVisible=");
        c11.append(z11);
        c11.append(", deleteRoomButton=");
        c11.append(buttonV3DTO);
        c11.append(", isDeleteRoomButtonVisible=");
        c11.append(z12);
        c11.append(", guests=");
        c11.append(list);
        AZ.c.c(c11, ", childForms=", list2, ", isRoomVisible=", z13);
        c11.append(")");
        return c11.toString();
    }
}
