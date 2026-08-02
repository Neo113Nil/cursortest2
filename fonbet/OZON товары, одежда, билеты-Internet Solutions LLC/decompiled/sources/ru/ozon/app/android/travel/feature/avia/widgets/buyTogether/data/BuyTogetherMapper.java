package ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.data.BuyTogetherDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.presentation.BuyTogetherVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherWrapperDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO$ServiceDTO;", "item", "", "width", "Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded$ServiceVO;", "mapService", "(Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO$ServiceDTO;I)Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$Loaded$ServiceVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherWrapperDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/data/BuyTogetherDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/buyTogether/presentation/BuyTogetherVO$State;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BuyTogetherMapper implements Function2<BuyTogetherWrapperDTO, d, List<? extends BuyTogetherVO>>, AsyncWidgetStateMapper<BuyTogetherDTO, BuyTogetherVO.State> {
    private final BuyTogetherVO.Loaded.ServiceVO mapService(BuyTogetherDTO.ServiceDTO item, int width) {
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getAddServiceButton().getTrackingInfo();
        int hashCode = item.getImage().getImageURL().hashCode();
        String imageURL = item.getImage().getImageURL();
        String imageBackgroundColor = item.getImage().getImageBackgroundColor();
        TextAtom price = item.getPrice();
        TextAtom description = item.getDescription();
        AtomActionDTO action = item.getAddServiceButton().getAction();
        return new BuyTogetherVO.Loaded.ServiceVO(hashCode, width, imageURL, imageBackgroundColor, price, description, action != null ? AtomActionMapperKt.toAtomAction(action, trackingInfo) : null, item.getAddServiceButton(), item.getBorderColor(), item.getTrackingInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BuyTogetherVO> invoke(@NotNull BuyTogetherWrapperDTO state, @NotNull d widgetInfo) {
        BuyTogetherVO.State loading;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String a11 = widgetInfo.c().a();
        if (state.getDto() != null) {
            loading = mapAsyncState(state.getDto());
        } else {
            if (a11 == null) {
                return K.f71697a;
            }
            loading = new BuyTogetherVO.Loading(a11);
        }
        return C7714v.a0(new BuyTogetherVO(hashCode, loading));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public BuyTogetherVO.State mapAsyncState(@NotNull BuyTogetherDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        List<BuyTogetherDTO.ServiceDTO> services = state.getServices();
        int i11 = services.size() > 1 ? 232 : 0;
        List<BuyTogetherDTO.ServiceDTO> list = services;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapService((BuyTogetherDTO.ServiceDTO) it.next(), i11));
        }
        TextAtom title = state.getTitle();
        ButtonV3Atom.SmallBorderlessButton allServicesButton = state.getAllServicesButton();
        AtomActionDTO action = state.getAllServicesButton().getAction();
        return new BuyTogetherVO.Loaded(title, allServicesButton, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, arrayList);
    }
}
