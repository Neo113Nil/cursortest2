package ru.ozon.app.android.geo.map.clusterization;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.PinsProto$AdditionalPinContent;
import ru.ozon.app.android.geo.PinsProto$Coordinates;
import ru.ozon.app.android.geo.PinsProto$CustomPinStyle;
import ru.ozon.app.android.geo.PinsProto$Pin;
import ru.ozon.app.android.geo.PinsProto$PinStyleType;
import ru.ozon.app.android.geo.PinsProto$Pins;
import ru.ozon.app.android.geo.map.clusterization.ClusterizationPin;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002J\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterizationPinsMapper;", "", "<init>", "()V", "mapToClusterizationPins", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationData;", "protoPins", "Lru/ozon/app/android/geo/PinsProto$Pins;", "toPinCoordinates", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$Coordinates;", "Lru/ozon/app/android/geo/PinsProto$Coordinates;", "toPinAdditionalContent", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$AdditionalPinContent;", "Lru/ozon/app/android/geo/PinsProto$AdditionalPinContent;", "toCustomPinStyle", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$CustomPinStyle;", "Lru/ozon/app/android/geo/PinsProto$CustomPinStyle;", "toPinStyleType", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPin$PinStyleType;", "Lru/ozon/app/android/geo/PinsProto$PinStyleType;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClusterizationPinsMapper {
    private final ClusterizationPin.CustomPinStyle toCustomPinStyle(PinsProto$CustomPinStyle pinsProto$CustomPinStyle) {
        return new ClusterizationPin.CustomPinStyle(pinsProto$CustomPinStyle.getTintColor(), pinsProto$CustomPinStyle.getTextColor(), pinsProto$CustomPinStyle.getIconTintColor(), pinsProto$CustomPinStyle.getBorderColor(), pinsProto$CustomPinStyle.getPinsCountColor());
    }

    private final ClusterizationPin.AdditionalPinContent toPinAdditionalContent(PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent) {
        return new ClusterizationPin.AdditionalPinContent(pinsProto$AdditionalPinContent.getText(), pinsProto$AdditionalPinContent.getIcon());
    }

    private final ClusterizationPin.Coordinates toPinCoordinates(PinsProto$Coordinates pinsProto$Coordinates) {
        return new ClusterizationPin.Coordinates(pinsProto$Coordinates.getLatitude(), pinsProto$Coordinates.getLongitude());
    }

    private final ClusterizationPin.PinStyleType toPinStyleType(PinsProto$PinStyleType pinsProto$PinStyleType) {
        return ClusterizationPin.PinStyleType.DEFAULT;
    }

    @NotNull
    public final ClusterizationData mapToClusterizationPins(@NotNull PinsProto$Pins protoPins) {
        Intrinsics.checkNotNullParameter(protoPins, "protoPins");
        List U02 = C7714v.U0(protoPins.getImagesMap().values());
        List<PinsProto$Pin> pinsList = protoPins.getPinsList();
        Intrinsics.checkNotNullExpressionValue(pinsList, "getPinsList(...)");
        List<PinsProto$Pin> list = pinsList;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (PinsProto$Pin pinsProto$Pin : list) {
            PinsProto$AdditionalPinContent pinsProto$AdditionalPinContent = protoPins.getCustomTextContentMap().get(Integer.valueOf(pinsProto$Pin.getAdditionalContentKey()));
            ClusterizationPin.AdditionalPinContent pinAdditionalContent = pinsProto$AdditionalPinContent != null ? toPinAdditionalContent(pinsProto$AdditionalPinContent) : null;
            PinsProto$CustomPinStyle pinsProto$CustomPinStyle = protoPins.getCustomPinStylesMap().get(Integer.valueOf(pinsProto$Pin.getPinStyleKey()));
            ClusterizationPin.CustomPinStyle customPinStyle = pinsProto$CustomPinStyle != null ? toCustomPinStyle(pinsProto$CustomPinStyle) : null;
            String str = protoPins.getImagesMap().get(Integer.valueOf(pinsProto$Pin.getPinImageKey()));
            PinsProto$PinStyleType styleType = protoPins.getStyleType();
            Intrinsics.checkNotNullExpressionValue(styleType, "getStyleType(...)");
            ClusterizationPin.PinStyleType pinStyleType = toPinStyleType(styleType);
            String valueOf = String.valueOf(pinsProto$Pin.getId().getValue());
            PinsProto$Coordinates coordinates = pinsProto$Pin.getCoordinates();
            Intrinsics.checkNotNullExpressionValue(coordinates, "getCoordinates(...)");
            ClusterizationPin.Coordinates pinCoordinates = toPinCoordinates(coordinates);
            float value = pinsProto$Pin.getZPriority().getValue();
            int providerId = pinsProto$Pin.getProviderId();
            boolean value2 = pinsProto$Pin.getIsClickEnabled().getValue();
            Integer valueOf2 = Integer.valueOf(pinsProto$Pin.getPinsCount());
            ClusterizationPin clusterizationPin = new ClusterizationPin(valueOf, pinCoordinates, value, providerId, value2, pinAdditionalContent, customPinStyle, str, pinStyleType, valueOf2.intValue() != 0 ? valueOf2 : null, false, UserVerificationMethods.USER_VERIFY_ALL, null);
            clusterizationPin.configureMetaData();
            arrayList.add(clusterizationPin);
        }
        return new ClusterizationData(U02, arrayList);
    }
}
