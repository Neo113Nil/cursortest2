package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.pins;

import hd.C6915b;
import kd.InterfaceC7663b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aK\u0010\u000e\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0013\u001a\u00020\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"", "bitsLng", "bitsLat", "", "createPrecisionMask", "(II)J", "Lkd/b;", "", "latitudeRange", "longitudeRange", "latitudeCellPxSize", "longitudeCellPxSize", "screenHeight", "screenWidth", "mapCellsCountToPrecisionBitMask", "(Lkd/b;Lkd/b;IIII)J", FormPageDTO.Field.FIELD_TYPE_RANGE, "world", "cellsCount", "requiredBits", "(Lkd/b;II)I", "map_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UtilsKt {
    public static final long createPrecisionMask(int i11, int i12) {
        long j11 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 >= i11 && i14 >= i12) {
                return j11;
            }
            int i16 = i15 % 2;
            if (i16 == 0 && i13 < i11) {
                j11 = MapExtKt.writeTrueAtPosition(j11, i15);
                i13++;
            } else if (i16 == 1 && i14 < i12) {
                j11 = MapExtKt.writeTrueAtPosition(j11, i15);
                i14++;
            }
            i15++;
        }
    }

    public static final long mapCellsCountToPrecisionBitMask(@NotNull InterfaceC7663b<Double> latitudeRange, @NotNull InterfaceC7663b<Double> longitudeRange, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(latitudeRange, "latitudeRange");
        Intrinsics.checkNotNullParameter(longitudeRange, "longitudeRange");
        return createPrecisionMask(requiredBits(longitudeRange, 360, i14 / i12), requiredBits(latitudeRange, 180, i13 / i11));
    }

    private static final int requiredBits(InterfaceC7663b<Double> interfaceC7663b, int i11, int i12) {
        return C6915b.b(C6915b.a((i11 / Math.abs(interfaceC7663b.e().doubleValue() - interfaceC7663b.getStart().doubleValue())) * i12));
    }
}
