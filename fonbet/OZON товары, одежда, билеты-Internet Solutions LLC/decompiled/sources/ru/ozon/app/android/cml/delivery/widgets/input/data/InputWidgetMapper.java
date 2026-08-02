package ru.ozon.app.android.cml.delivery.widgets.input.data;

import Sc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.input.data.InputWidgetDTO;
import ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetVO;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;", "mapConfig", "(Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO;)Lru/ozon/app/android/cml/delivery/widgets/input/presentation/InputWidgetVO$InputConfig;", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/input/data/InputWidgetDTO;Ll20/d;)Ljava/util/List;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputWidgetMapper implements Function2<InputWidgetDTO, d, List<? extends InputWidgetVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InputWidgetDTO.InputStatus.values().length];
            try {
                iArr[InputWidgetDTO.InputStatus.READONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputWidgetDTO.InputStatus.NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputWidgetDTO.InputStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputWidgetDTO.InputStatus.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputWidgetDTO.InputType.values().length];
            try {
                iArr2[InputWidgetDTO.InputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InputWidgetDTO.InputType.MONEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final InputWidgetVO.InputConfig mapConfig(InputWidgetDTO state) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[state.getType().ordinal()];
        if (i11 == 1) {
            return new InputWidgetVO.InputConfig.RawText(state.getMaxLength());
        }
        if (i11 == 2) {
            return new InputWidgetVO.InputConfig.Money(state.getMaxLength());
        }
        throw new o();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<InputWidgetVO> invoke(@NotNull InputWidgetDTO state, @NotNull d widgetInfo) {
        UniColors uniColors;
        OzonTextInputLayoutModel.Status status;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        InputWidgetVO.InputConfig mapConfig = mapConfig(state);
        String backgroundColor = state.getBackgroundColor();
        String value = state.getValue();
        String placeholder = state.getPlaceholder();
        String message = state.getMessage();
        InputWidgetDTO.InputStatus status2 = state.getStatus();
        int i11 = status2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status2.ordinal()];
        if (i11 == -1 || i11 == 1 || i11 == 2) {
            uniColors = UniColors.TEXT_SECONDARY;
        } else if (i11 == 3) {
            uniColors = UniColors.TEXT_NEGATIVE;
        } else {
            if (i11 != 4) {
                throw new o();
            }
            uniColors = UniColors.TEXT_POSITIVE;
        }
        AtomActionDTO tooltipAction = state.getTooltipAction();
        AtomAction atomAction = tooltipAction != null ? AtomActionMapperKt.toAtomAction(tooltipAction, null) : null;
        Paddings topPadding = state.getTopPadding();
        if (topPadding == null) {
            topPadding = Paddings.PADDING_300;
        }
        Paddings bottomPadding = state.getBottomPadding();
        if (bottomPadding == null) {
            bottomPadding = Paddings.PADDING_300;
        }
        Paddings leftPadding = state.getLeftPadding();
        if (leftPadding == null) {
            leftPadding = Paddings.PADDING_500;
        }
        Paddings rightPadding = state.getRightPadding();
        if (rightPadding == null) {
            rightPadding = Paddings.PADDING_500;
        }
        AtomAction atomAction2 = atomAction;
        Paddings paddings = bottomPadding;
        Paddings paddings2 = leftPadding;
        CommonControlSettings common = state.getCommon();
        InputWidgetDTO.InputStatus status3 = state.getStatus();
        int i12 = status3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status3.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                status = OzonTextInputLayoutModel.Status.READONLY;
            } else if (i12 != 2) {
                if (i12 == 3) {
                    status = OzonTextInputLayoutModel.Status.ERROR;
                } else {
                    if (i12 != 4) {
                        throw new o();
                    }
                    status = OzonTextInputLayoutModel.Status.SUCCESS;
                }
            }
            return C7714v.a0(new InputWidgetVO(hashCode, mapConfig, backgroundColor, value, placeholder, message, uniColors, atomAction2, !Intrinsics.d(state.isDisabled(), Boolean.TRUE) ? OzonTextInputLayoutModel.State.DISABLED : OzonTextInputLayoutModel.State.DEFAULT, status, topPadding, rightPadding, paddings, paddings2, common));
        }
        status = OzonTextInputLayoutModel.Status.NEUTRAL;
        return C7714v.a0(new InputWidgetVO(hashCode, mapConfig, backgroundColor, value, placeholder, message, uniColors, atomAction2, !Intrinsics.d(state.isDisabled(), Boolean.TRUE) ? OzonTextInputLayoutModel.State.DISABLED : OzonTextInputLayoutModel.State.DEFAULT, status, topPadding, rightPadding, paddings, paddings2, common));
    }
}
