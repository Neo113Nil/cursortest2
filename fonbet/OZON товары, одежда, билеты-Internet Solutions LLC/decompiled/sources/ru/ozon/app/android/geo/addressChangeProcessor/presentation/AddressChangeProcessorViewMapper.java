package ru.ozon.app.android.geo.addressChangeProcessor.presentation;

import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.addressChangeProcessor.data.AddressChangeProcessorDTO;
import ru.ozon.app.android.geo.addressChangeProcessor.di.AddressChangeProcessorWidgetComponent;
import ru.ozon.app.android.geo.addressChangeProcessor.presentation.AddressChangeProcessorVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\n\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorViewMapper;", "Lc20/r;", "Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO;", "Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO;", "Lru/ozon/app/android/geo/addressChangeProcessor/di/AddressChangeProcessorWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/geo/addressChangeProcessor/di/AddressChangeProcessorWidgetComponent;)V", "", "stateId", "toVO", "(Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO;Ljava/lang/String;)Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO;", "Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO$LocationInfo;", "Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO$LocationInfo;", "(Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO$LocationInfo;)Lru/ozon/app/android/geo/addressChangeProcessor/presentation/AddressChangeProcessorVO$LocationInfo;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/geo/addressChangeProcessor/data/AddressChangeProcessorDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/geo/addressChangeProcessor/di/AddressChangeProcessorWidgetComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressChangeProcessorViewMapper extends r<AddressChangeProcessorDTO, AddressChangeProcessorVO> {

    @NotNull
    private final AddressChangeProcessorWidgetComponent component;

    @NotNull
    private final r.a viewType;

    public AddressChangeProcessorViewMapper(@NotNull AddressChangeProcessorWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    private final AddressChangeProcessorVO toVO(AddressChangeProcessorDTO addressChangeProcessorDTO, String str) {
        long hashCode = str.hashCode();
        AddressChangeProcessorDTO.LocationInfo locationInfo = addressChangeProcessorDTO.getLocationInfo();
        AddressChangeProcessorVO.LocationInfo vo = locationInfo != null ? toVO(locationInfo) : null;
        String redirectLink = addressChangeProcessorDTO.getRedirectLink();
        Boolean isNewLoyalityProgram = addressChangeProcessorDTO.isNewLoyalityProgram();
        boolean booleanValue = isNewLoyalityProgram != null ? isNewLoyalityProgram.booleanValue() : false;
        AtomActionDTO action = addressChangeProcessorDTO.getAction();
        return new AddressChangeProcessorVO(hashCode, vo, redirectLink, booleanValue, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<AddressChangeProcessorVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        AddressChangeProcessorWidgetComponent addressChangeProcessorWidgetComponent = this.component;
        return new AddressChangeProcessorViewHolder(container, addressChangeProcessorWidgetComponent.getAreaLocalStore(), addressChangeProcessorWidgetComponent.getAddressLocalStore(), addressChangeProcessorWidgetComponent.getAddressUiInfoViewModel(), addressChangeProcessorWidgetComponent.getAddressUpdateManager(), addressChangeProcessorWidgetComponent.getCheckoutPrefetchController(), addressChangeProcessorWidgetComponent.getCustomActionHandlersStore(), addressChangeProcessorWidgetComponent.getComposerNavigator(), addressChangeProcessorWidgetComponent.getJsonDeserializer(), addressChangeProcessorWidgetComponent.getViewModelProvider());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<AddressChangeProcessorVO> map(@NotNull AddressChangeProcessorDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info.d()));
    }

    private final AddressChangeProcessorVO.LocationInfo toVO(AddressChangeProcessorDTO.LocationInfo locationInfo) {
        return new AddressChangeProcessorVO.LocationInfo(locationInfo.getAreaId(), locationInfo.getAddressId());
    }
}
