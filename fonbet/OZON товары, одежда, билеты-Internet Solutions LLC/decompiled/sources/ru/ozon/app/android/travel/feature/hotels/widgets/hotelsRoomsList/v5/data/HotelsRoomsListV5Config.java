package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0015\b\u0007\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5Config;", "Lj20/a;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "addTrackingInfoIfNeeded", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;", "Lj20/b;", "state", "parse", "(Lj20/b;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5Config implements InterfaceC7243a<HotelsRoomsListV5DTO> {

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public HotelsRoomsListV5Config(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final HotelsRoomsListV5DTO addTrackingInfoIfNeeded(HotelsRoomsListV5DTO hotelsRoomsListV5DTO) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        CommonControlSettings controlSettings = hotelsRoomsListV5DTO.getControlSettings();
        if (controlSettings == null || (trackingInfo = controlSettings.getTrackingInfo()) == null) {
            return hotelsRoomsListV5DTO;
        }
        HotelsRoomsListV5DTO copy$default = HotelsRoomsListV5DTO.copy$default(hotelsRoomsListV5DTO, null, null, null, null, trackingInfo, 15, null);
        return copy$default == null ? hotelsRoomsListV5DTO : copy$default;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public HotelsRoomsListV5DTO parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return addTrackingInfoIfNeeded((HotelsRoomsListV5DTO) this.jsonDeserializer.fromJson(state.b(), HotelsRoomsListV5DTO.class));
    }
}
