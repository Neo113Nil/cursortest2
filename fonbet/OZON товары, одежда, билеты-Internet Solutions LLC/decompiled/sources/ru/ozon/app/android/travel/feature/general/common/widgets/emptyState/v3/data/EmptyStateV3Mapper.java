package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data;

import B0.C2454a;
import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.imageprefetch.PrefetchUtilsKt;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "mapButtons", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "mapOnBackPressedAction", "(Ljava/util/List;)Lru/ozon/uni/atoms/af/AtomAction;", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO$LayoutType;", "mapLayoutType", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO$LayoutType;", "", "prefetchImages", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO;)V", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV3Mapper implements Function2<EmptyStateV3DTO, d, List<? extends EmptyStateV3VO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<ImageDTO> imagePrefetcher;

    public EmptyStateV3Mapper(@NotNull Context context, @NotNull ImagePrefetcher<ImageDTO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
    }

    private final List<ButtonV3DTO> mapButtons(List<ButtonV3DTO> buttons) {
        CommonControlSettings commonControlSettings;
        AtomActionDTO atomActionDTO;
        AtomActionDTO action;
        Map b11;
        AtomActionDTO action2;
        Map<String, String> params;
        if (buttons == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : buttons) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ButtonV3DTO buttonV3DTO = (ButtonV3DTO) obj;
            CommonControlSettings common = buttonV3DTO.getCommon();
            if (common != null) {
                CommonControlSettings common2 = buttonV3DTO.getCommon();
                if (common2 == null || (action = common2.getAction()) == null) {
                    atomActionDTO = null;
                } else {
                    CommonControlSettings common3 = buttonV3DTO.getCommon();
                    if (common3 == null || (action2 = common3.getAction()) == null || (params = action2.getParams()) == null) {
                        b11 = C2454a.b("buttonIndex", String.valueOf(i11));
                    } else {
                        b11 = U.u(params);
                        b11.put("buttonIndex", String.valueOf(i11));
                        Unit unit = Unit.f71690a;
                    }
                    atomActionDTO = AtomActionDTO.copy$default(action, null, null, null, b11, null, 23, null);
                }
                commonControlSettings = CommonControlSettings.copy$default(common, atomActionDTO, null, null, 6, null);
            } else {
                commonControlSettings = null;
            }
            arrayList.add(ButtonV3DTO.copy$default(buttonV3DTO, null, null, null, null, null, null, null, null, null, null, null, null, null, commonControlSettings, null, null, null, 122879, null));
            i11 = i12;
        }
        return arrayList;
    }

    private final EmptyStateV3VO.LayoutType mapLayoutType(EmptyStateV3DTO state) {
        boolean z11 = state.getAppearance() == EmptyStateV3DTO.ViewAppearance.VIEW_APPEARANCE_FULL && state.getButtonsPosition() == EmptyStateV3DTO.ButtonsPosition.AT_BOTTOM;
        boolean z12 = state.getContentAlign() == EmptyStateV3DTO.ContentAlign.BOTTOM;
        return (z11 && z12) ? EmptyStateV3VO.LayoutType.FIXED_BOTTOM_PLACEHOLDER_AND_BUTTONS : (!z11 || z12) ? EmptyStateV3VO.LayoutType.CENTER_IF_SPACE : EmptyStateV3VO.LayoutType.FIXED_BOTTOM_BUTTONS;
    }

    private final AtomAction mapOnBackPressedAction(List<ButtonV3DTO> buttons) {
        ButtonV3DTO buttonV3DTO;
        CommonControlSettings common;
        AtomActionDTO action;
        Object obj;
        AtomActionDTO action2;
        if (buttons != null) {
            Iterator<T> it = buttons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                CommonControlSettings common2 = ((ButtonV3DTO) obj).getCommon();
                if (((common2 == null || (action2 = common2.getAction()) == null) ? null : action2.getBehavior()) == AtomActionDTO.Behavior.DISMISS_REFRESH) {
                    break;
                }
            }
            buttonV3DTO = (ButtonV3DTO) obj;
        } else {
            buttonV3DTO = null;
        }
        if (buttonV3DTO == null || (common = buttonV3DTO.getCommon()) == null || (action = common.getAction()) == null) {
            return null;
        }
        return AtomActionMapperKt.toAtomAction(action, buttonV3DTO.getTrackingInfo());
    }

    private final void prefetchImages(EmptyStateV3DTO emptyStateV3DTO) {
        PrefetchUtilsKt.prefetchImage(this.context, emptyStateV3DTO.getImage(), this.imagePrefetcher);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EmptyStateV3VO> invoke(@NotNull EmptyStateV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ImageDTO image = state.getImage();
        TextDTO title = state.getTitle();
        TextDTO message = state.getMessage();
        if (message != null) {
            message.setTagSupported(true);
            Unit unit = Unit.f71690a;
        } else {
            message = null;
        }
        List<ButtonV3DTO> mapButtons = mapButtons(state.getButtons());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        EmptyStateV3VO emptyStateV3VO = new EmptyStateV3VO(hashCode, image, title, message, mapButtons, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, state.getAppearance() == EmptyStateV3DTO.ViewAppearance.VIEW_APPEARANCE_FULL, mapLayoutType(state), mapOnBackPressedAction(state.getButtons()));
        prefetchImages(state);
        return C7714v.a0(emptyStateV3VO);
    }
}
