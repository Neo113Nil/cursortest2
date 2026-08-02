package ru.ozon.app.android.geo.map.clusterization;

import Lm0.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.PinsProto$Pins;
import sf.C9684j;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterizationPinsDecoderImpl;", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPinsDecoder;", "mapper", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationPinsMapper;", "<init>", "(Lru/ozon/app/android/geo/map/clusterization/ClusterizationPinsMapper;)V", "decodePins", "Lru/ozon/app/android/geo/map/clusterization/ClusterizationData;", "response", "Lru/ozon/app/android/geo/map/clusterization/PinsResponse;", "decompressAndParse", "bytes", "", "parse", "inputStream", "Ljava/io/InputStream;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClusterizationPinsDecoderImpl implements ClusterizationPinsDecoder {

    @NotNull
    private final ClusterizationPinsMapper mapper;

    public ClusterizationPinsDecoderImpl(@NotNull ClusterizationPinsMapper mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.mapper = mapper;
    }

    private final ClusterizationData decompressAndParse(byte[] bytes) {
        return parse(new GZIPInputStream(new ByteArrayInputStream(bytes)));
    }

    private final ClusterizationData parse(InputStream inputStream) {
        try {
            PinsProto$Pins parseFrom = PinsProto$Pins.parseFrom(inputStream);
            ClusterizationPinsMapper clusterizationPinsMapper = this.mapper;
            Intrinsics.f(parseFrom);
            return clusterizationPinsMapper.mapToClusterizationPins(parseFrom);
        } catch (Exception e11) {
            a.f17149a.e(e11);
            return null;
        }
    }

    @Override // ru.ozon.app.android.geo.map.clusterization.ClusterizationPinsDecoder
    public ClusterizationData decodePins(PinsResponse response) {
        String pinsBin;
        byte[] G11;
        if (response == null || (pinsBin = response.getPinsBin()) == null) {
            return null;
        }
        C9684j c9684j = C9684j.f98719d;
        C9684j a11 = C9684j.a.a(pinsBin);
        if (a11 == null || (G11 = a11.G()) == null) {
            return null;
        }
        return decompressAndParse(G11);
    }
}
