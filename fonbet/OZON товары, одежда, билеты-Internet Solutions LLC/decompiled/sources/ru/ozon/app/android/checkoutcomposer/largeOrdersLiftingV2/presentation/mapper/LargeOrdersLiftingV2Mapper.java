package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.InputDTO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.LargeOrdersLiftingV2DTO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.OptionsBlockDTO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.InputVO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.LargeOrdersLiftingV2VO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.OptionsBlockVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/mapper/LargeOrdersLiftingV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/LargeOrdersLiftingV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/InputDTO;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/InputVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/InputDTO;)Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/InputVO;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/OptionsBlockDTO;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/OptionsBlockVO;", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/OptionsBlockDTO;)Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/OptionsBlockVO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "disableAutoToggle", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/LargeOrdersLiftingV2DTO;Ll20/d;)Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargeOrdersLiftingV2Mapper implements Function2<LargeOrdersLiftingV2DTO, d, List<? extends LargeOrdersLiftingV2VO>> {
    private final CellDTO disableAutoToggle(CellDTO cell) {
        CellDTO.Settings settings = cell.getSettings();
        return CellDTO.copy$default(cell, null, settings != null ? CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : null, null, null, null, 29, null);
    }

    private final InputVO toVO(InputDTO inputDTO) {
        return new InputVO(inputDTO.getPlaceholder(), inputDTO.getValue(), inputDTO.getEmptyValidationText(), inputDTO.getTextChangeAction(), (long) inputDTO.getDelayAction());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<LargeOrdersLiftingV2VO> invoke(@NotNull LargeOrdersLiftingV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ImageDTO image = state.getImage();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        InputVO vo = toVO(state.getInput());
        OptionsBlockVO vo2 = toVO(state.getOptionsBlock());
        ButtonV3DTO confirmButton = state.getConfirmButton();
        ButtonV3DTO cancelButton = state.getCancelButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new LargeOrdersLiftingV2VO(hashCode, image, title, subtitle, vo, vo2, confirmButton, cancelButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }

    private final OptionsBlockVO toVO(OptionsBlockDTO optionsBlockDTO) {
        List<CellDTO> options = optionsBlockDTO.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(disableAutoToggle((CellDTO) it.next()));
        }
        return new OptionsBlockVO(arrayList, optionsBlockDTO.getBackgroundColor());
    }
}
