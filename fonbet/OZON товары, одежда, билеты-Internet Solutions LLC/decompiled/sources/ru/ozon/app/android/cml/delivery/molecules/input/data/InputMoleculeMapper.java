package ru.ozon.app.android.cml.delivery.molecules.input.data;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\r*\u0004\u0018\u00010\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "", "<init>", "()V", "map", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO;", "state", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO;", "shouldMapState", "", "mapConfig", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/InputMoleculeVO$InputConfig;", "toPx", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputMoleculeMapper {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputMoleculeDTO.InputType.values().length];
            try {
                iArr[InputMoleculeDTO.InputType.TYPE_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputMoleculeDTO.InputType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputMoleculeDTO.InputType.MONEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InputMoleculeDTO.InputType.DIGITAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ InputMoleculeVO map$default(InputMoleculeMapper inputMoleculeMapper, InputMoleculeDTO inputMoleculeDTO, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return inputMoleculeMapper.map(inputMoleculeDTO, z11);
    }

    private final InputMoleculeVO.InputConfig mapConfig(InputMoleculeDTO state) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getType().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return new InputMoleculeVO.InputConfig.RawText(state.getMaxLength());
        }
        if (i11 == 3) {
            return new InputMoleculeVO.InputConfig.Money(state.getMaxLength());
        }
        if (i11 == 4) {
            return new InputMoleculeVO.InputConfig.Digital(state.getMaxLength(), state.getMask());
        }
        throw new o();
    }

    private final int toPx(Paddings paddings) {
        if (paddings == null) {
            paddings = Paddings.PADDING_300;
        }
        return UiExtKt.toPx(paddings.getPx());
    }

    @NotNull
    public final InputMoleculeVO map(@NotNull InputMoleculeDTO state, boolean shouldMapState) {
        OzonTextInputLayoutModel.State state2;
        Intrinsics.checkNotNullParameter(state, "state");
        InputMoleculeVO.InputConfig mapConfig = mapConfig(state);
        String backgroundColor = state.getBackgroundColor();
        String value = state.getValue();
        String placeholder = state.getPlaceholder();
        String message = state.getMessage();
        UniColors ozonColor = OzonTextInputLayoutExtKt.toOzonColor(state.getStatus());
        int px = toPx(state.getTopPadding());
        int px2 = toPx(state.getBottomPadding());
        int px3 = toPx(state.getLeftPadding());
        int px4 = toPx(state.getRightPadding());
        CommonControlSettings common = state.getCommon();
        OzonTextInputLayoutModel.Status ozonTextInputLayoutStatus = OzonTextInputLayoutExtKt.toOzonTextInputLayoutStatus(state.getStatus());
        if (shouldMapState) {
            state2 = Intrinsics.d(state.isDisabled(), Boolean.TRUE) ? OzonTextInputLayoutModel.State.DISABLED : OzonTextInputLayoutModel.State.DEFAULT;
        } else {
            state2 = null;
        }
        AtomActionDTO action = state.getCommon().getAction();
        return new InputMoleculeVO(mapConfig, backgroundColor, value, placeholder, message, ozonColor, state2, ozonTextInputLayoutStatus, px, px4, px2, px3, common, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, state.getDebounce() != null ? r0.intValue() : 0L);
    }
}
