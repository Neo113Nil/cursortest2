package ru.ozon.app.android.travel.feature.railway.widgets.passengerList.presentation;

import Bi.b;
import F3.G;
import G.g;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/presentation/PassengerListVI;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/presentation/PassengerListVI$Passenger;", "passengers", "LWZ/t;", "trackingInfo", "<init>", "(JLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Passenger", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PassengerListVI implements c {
    private final long id;

    @NotNull
    private final List<Passenger> passengers;
    private final t trackingInfo;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b\r\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/presentation/PassengerListVI$Passenger;", "", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "passengerInfo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "ticketNumber", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "copyIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "isSeparatorVisible", "<init>", "(ILru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPassengerInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTicketNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCopyIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Z", "()Z", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Passenger {
        public static final int $stable = (AtomAction.$stable | IconDTO.$stable) | CellDTO.$stable;
        private final AtomAction atomAction;
        private final IconDTO copyIcon;
        private final int id;
        private final boolean isSeparatorVisible;

        @NotNull
        private final CellDTO passengerInfo;
        private final TextDTO ticketNumber;

        public Passenger(int i11, @NotNull CellDTO passengerInfo, TextDTO textDTO, IconDTO iconDTO, AtomAction atomAction, boolean z11) {
            Intrinsics.checkNotNullParameter(passengerInfo, "passengerInfo");
            this.id = i11;
            this.passengerInfo = passengerInfo;
            this.ticketNumber = textDTO;
            this.copyIcon = iconDTO;
            this.atomAction = atomAction;
            this.isSeparatorVisible = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Passenger)) {
                return false;
            }
            Passenger passenger = (Passenger) other;
            return this.id == passenger.id && Intrinsics.d(this.passengerInfo, passenger.passengerInfo) && Intrinsics.d(this.ticketNumber, passenger.ticketNumber) && Intrinsics.d(this.copyIcon, passenger.copyIcon) && Intrinsics.d(this.atomAction, passenger.atomAction) && this.isSeparatorVisible == passenger.isSeparatorVisible;
        }

        public final AtomAction getAtomAction() {
            return this.atomAction;
        }

        public final IconDTO getCopyIcon() {
            return this.copyIcon;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final CellDTO getPassengerInfo() {
            return this.passengerInfo;
        }

        public final TextDTO getTicketNumber() {
            return this.ticketNumber;
        }

        public int hashCode() {
            int c11 = b.c(this.passengerInfo, Integer.hashCode(this.id) * 31, 31);
            TextDTO textDTO = this.ticketNumber;
            int hashCode = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconDTO iconDTO = this.copyIcon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            AtomAction atomAction = this.atomAction;
            return Boolean.hashCode(this.isSeparatorVisible) + ((hashCode2 + (atomAction != null ? atomAction.hashCode() : 0)) * 31);
        }

        /* renamed from: isSeparatorVisible, reason: from getter */
        public final boolean getIsSeparatorVisible() {
            return this.isSeparatorVisible;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            CellDTO cellDTO = this.passengerInfo;
            TextDTO textDTO = this.ticketNumber;
            IconDTO iconDTO = this.copyIcon;
            AtomAction atomAction = this.atomAction;
            boolean z11 = this.isSeparatorVisible;
            StringBuilder sb2 = new StringBuilder("Passenger(id=");
            sb2.append(i11);
            sb2.append(", passengerInfo=");
            sb2.append(cellDTO);
            sb2.append(", ticketNumber=");
            G.f(sb2, textDTO, ", copyIcon=", iconDTO, ", atomAction=");
            sb2.append(atomAction);
            sb2.append(", isSeparatorVisible=");
            sb2.append(z11);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public PassengerListVI(long j11, @NotNull List<Passenger> passengers, t tVar) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.id = j11;
        this.passengers = passengers;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengerListVI)) {
            return false;
        }
        PassengerListVI passengerListVI = (PassengerListVI) other;
        return this.id == passengerListVI.id && Intrinsics.d(this.passengers, passengerListVI.passengers) && Intrinsics.d(this.trackingInfo, passengerListVI.trackingInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<Passenger> getPassengers() {
        return this.passengers;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.passengers);
        t tVar = this.trackingInfo;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Passenger> list = this.passengers;
        return a.b(Lh.b.b(j11, "PassengerListVI(id=", ", passengers=", list), ", trackingInfo=", this.trackingInfo, ")");
    }
}
