package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.category;

import D3.h;
import G.g;
import TY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001#B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\u000b\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/PassengersDirectoryV3CategoryVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/PassengersDirectoryV3CategoryVO$PassengerV3VO;", "passengers", "", "isSelectedPassengerUnsuitable", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "Z", "()Z", "PassengerV3VO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassengersDirectoryV3CategoryVO implements c {
    private final long id;
    private final boolean isSelectedPassengerUnsuitable;

    @NotNull
    private final List<PassengerV3VO> passengers;
    private final TextDTO title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/PassengersDirectoryV3CategoryVO$PassengerV3VO;", "", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "passenger", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPassenger", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerV3VO {
        private final long id;

        @NotNull
        private final CellDTO passenger;

        public PassengerV3VO(long j11, @NotNull CellDTO passenger) {
            Intrinsics.checkNotNullParameter(passenger, "passenger");
            this.id = j11;
            this.passenger = passenger;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerV3VO)) {
                return false;
            }
            PassengerV3VO passengerV3VO = (PassengerV3VO) other;
            return this.id == passengerV3VO.id && Intrinsics.d(this.passenger, passengerV3VO.passenger);
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final CellDTO getPassenger() {
            return this.passenger;
        }

        public int hashCode() {
            return this.passenger.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder e11 = h.e("PassengerV3VO(id=", this.id, ", passenger=", this.passenger);
            e11.append(")");
            return e11.toString();
        }
    }

    public PassengersDirectoryV3CategoryVO(long j11, TextDTO textDTO, @NotNull List<PassengerV3VO> passengers, boolean z11) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.id = j11;
        this.title = textDTO;
        this.passengers = passengers;
        this.isSelectedPassengerUnsuitable = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersDirectoryV3CategoryVO)) {
            return false;
        }
        PassengersDirectoryV3CategoryVO passengersDirectoryV3CategoryVO = (PassengersDirectoryV3CategoryVO) other;
        return this.id == passengersDirectoryV3CategoryVO.id && Intrinsics.d(this.title, passengersDirectoryV3CategoryVO.title) && Intrinsics.d(this.passengers, passengersDirectoryV3CategoryVO.passengers) && this.isSelectedPassengerUnsuitable == passengersDirectoryV3CategoryVO.isSelectedPassengerUnsuitable;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PassengerV3VO> getPassengers() {
        return this.passengers;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        return Boolean.hashCode(this.isSelectedPassengerUnsuitable) + g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.passengers);
    }

    /* renamed from: isSelectedPassengerUnsuitable, reason: from getter */
    public final boolean getIsSelectedPassengerUnsuitable() {
        return this.isSelectedPassengerUnsuitable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        List<PassengerV3VO> list = this.passengers;
        boolean z11 = this.isSelectedPassengerUnsuitable;
        StringBuilder b11 = a.b("PassengersDirectoryV3CategoryVO(id=", j11, ", title=", textDTO);
        AZ.c.c(b11, ", passengers=", list, ", isSelectedPassengerUnsuitable=", z11);
        b11.append(")");
        return b11.toString();
    }
}
