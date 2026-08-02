package ru.ozon.app.android.travel.feature.railway.widgets.passengerList.data;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.railway.widgets.passengerList.data.PassengerListDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.passengerList.presentation.PassengerListVI;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVI", "Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/presentation/PassengerListVI;", "Lru/ozon/app/android/travel/feature/railway/widgets/passengerList/data/PassengerListDTO;", "widgetId", "", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PassengerListMapperKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [ru.ozon.uni.atoms.af.AtomAction] */
    /* JADX WARN: Type inference failed for: r16v2 */
    @NotNull
    public static final PassengerListVI toVI(@NotNull PassengerListDTO passengerListDTO, @NotNull String widgetId) {
        Intrinsics.checkNotNullParameter(passengerListDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        long hashCode = widgetId.hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = passengerListDTO.getTrackingInfo();
        Throwable th2 = null;
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null;
        List<PassengerListDTO.PassengerDTO> passengers = passengerListDTO.getPassengers();
        ArrayList arrayList = new ArrayList(C7714v.z(passengers, 10));
        int i11 = 0;
        for (Object obj : passengers) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                Throwable th3 = th2;
                C7714v.O0();
                throw th3;
            }
            PassengerListDTO.PassengerDTO passengerDTO = (PassengerListDTO.PassengerDTO) obj;
            CellDTO.CellText title = passengerDTO.getPassengerInfo().getCenterBlock().getTitle();
            TextDTO ticketNumber = passengerDTO.getTicketNumber();
            Object text = ticketNumber != null ? ticketNumber.getText() : th2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(title);
            sb2.append(text);
            int hashCode2 = sb2.toString().hashCode();
            CellDTO passengerInfo = passengerDTO.getPassengerInfo();
            TextDTO ticketNumber2 = passengerDTO.getTicketNumber();
            IconDTO copyIcon = passengerDTO.getCopyIcon();
            CommonControlSettings common = passengerDTO.getCommon();
            Throwable th4 = th2;
            arrayList.add(new PassengerListVI.Passenger(hashCode2, passengerInfo, ticketNumber2, copyIcon, common != null ? common.toAtomAction() : th2, passengerListDTO.getPassengers().size() > 1 && i11 != C7714v.P(passengerListDTO.getPassengers())));
            th2 = th4;
            i11 = i12;
        }
        return new PassengerListVI(hashCode, arrayList, b11);
    }
}
