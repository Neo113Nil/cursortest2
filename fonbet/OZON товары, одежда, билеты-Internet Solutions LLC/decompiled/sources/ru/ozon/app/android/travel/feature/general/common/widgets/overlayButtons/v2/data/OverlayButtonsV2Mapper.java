package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data.OverlayButtonsV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.ButtonVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.OverlayButtonsV2State;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.OverlayButtonsV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation.SettingsVO;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0014\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0014\u0010\u0018J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0003j\u0002`\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2State;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "", "asyncData", "extractState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2State;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$ButtonDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/ButtonVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$ButtonDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/ButtonVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$SettingsDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/SettingsVO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$SettingsDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/SettingsVO;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2State;", "Landroid/content/Context;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlayButtonsV2Mapper implements Function2<OverlayButtonsV2DTO, d, List<? extends OverlayButtonsV2VO>>, AsyncWidgetStateMapper<OverlayButtonsV2DTO, OverlayButtonsV2State> {

    @NotNull
    private final Context context;

    public OverlayButtonsV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final OverlayButtonsV2State extractState(OverlayButtonsV2DTO state, String asyncData) {
        AsyncActionDTO asyncBehavior = state.getAsyncBehavior();
        AsyncActionVO vo = asyncBehavior != null ? MapperExtKt.toVO(asyncBehavior, asyncData) : null;
        List<OverlayButtonsV2DTO.ButtonDTO> buttons = state.getButtons();
        ArrayList arrayList = new ArrayList(C7714v.z(buttons, 10));
        Iterator<T> it = buttons.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((OverlayButtonsV2DTO.ButtonDTO) it.next()));
        }
        return new OverlayButtonsV2State(vo, arrayList, state.getBackgroundColor(), state.getDividerColor(), state.getViewTracking());
    }

    private final ButtonVO toVO(OverlayButtonsV2DTO.ButtonDTO buttonDTO) {
        return new ButtonVO(buttonDTO.hashCode(), buttonDTO.getText(), buttonDTO.getIcon(), buttonDTO.getIndicator(), buttonDTO.getBackgroundColor(), buttonDTO.getActiveBackgroundColor(), buttonDTO.getCommonControlSettings(), toVO(buttonDTO.getSettings()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OverlayButtonsV2VO> invoke(@NotNull OverlayButtonsV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new OverlayButtonsV2VO(widgetInfo.d().hashCode(), extractState(state, widgetInfo.c().a())));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public OverlayButtonsV2State mapAsyncState(@NotNull OverlayButtonsV2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state, null);
    }

    private final SettingsVO toVO(OverlayButtonsV2DTO.SettingsDTO settingsDTO) {
        return new SettingsVO(UiExtKt.toPx(settingsDTO.getTopPadding().getPx(), this.context), UiExtKt.toPx(settingsDTO.getBottomPadding().getPx(), this.context), UiExtKt.toPx(settingsDTO.getLeftPadding().getPx(), this.context), UiExtKt.toPx(settingsDTO.getRightPadding().getPx(), this.context));
    }
}
