package ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.data.InputFormDTO;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation.InputFormVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$Spacers;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$Spacers;", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$Spacers;)Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$Spacers;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;", "(Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO$TextArea;)Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO$TextArea;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO;Ll20/d;)Ljava/util/List;", "Companion", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputFormMapper implements Function2<InputFormDTO, d, List<? extends InputFormVO>> {
    private static final int defaultBottomMargin = ResourceExtKt.toPx(0);
    private static final int defaultTopTitleMargin = ResourceExtKt.toPx(8);
    private static final int defaultLeftMargin = ResourceExtKt.toPx(16);
    private static final int defaultRightMargin = ResourceExtKt.toPx(16);
    private static final int defaultTopTextAreaMargin = ResourceExtKt.toPx(8);
    private static final int defaultTopButtonMargin = ResourceExtKt.toPx(8);

    private final InputFormVO.Spacers toVO(InputFormDTO.Spacers spacers) {
        Paddings topTextArea;
        Paddings topButton;
        Paddings topTitle;
        Paddings right;
        Paddings left;
        Paddings bottom;
        return new InputFormVO.Spacers((spacers == null || (bottom = spacers.getBottom()) == null) ? defaultBottomMargin : ResourceExtKt.toPx(bottom.getPx()), (spacers == null || (left = spacers.getLeft()) == null) ? defaultLeftMargin : ResourceExtKt.toPx(left.getPx()), (spacers == null || (right = spacers.getRight()) == null) ? defaultRightMargin : ResourceExtKt.toPx(right.getPx()), (spacers == null || (topTitle = spacers.getTopTitle()) == null) ? defaultTopTitleMargin : ResourceExtKt.toPx(topTitle.getPx()), (spacers == null || (topButton = spacers.getTopButton()) == null) ? defaultTopButtonMargin : ResourceExtKt.toPx(topButton.getPx()), (spacers == null || (topTextArea = spacers.getTopTextArea()) == null) ? defaultTopTextAreaMargin : ResourceExtKt.toPx(topTextArea.getPx()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InputFormVO> invoke(@NotNull InputFormDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        ButtonV3DTO button = state.getButton();
        InputFormVO.TextArea vo = toVO(state.getTextArea());
        InputFormVO.Spacers vo2 = toVO(state.getSpacers());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new InputFormVO(hashCode, vo, button, title, vo2, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null));
    }

    private final InputFormVO.TextArea toVO(InputFormDTO.TextArea textArea) {
        String placeholder = textArea.getPlaceholder();
        String value = textArea.getValue();
        if (value == null) {
            value = "";
        }
        Integer maxInputLength = textArea.getMaxInputLength();
        int intValue = maxInputLength != null ? maxInputLength.intValue() : 100;
        Integer minRows = textArea.getMinRows();
        int i11 = 1;
        int intValue2 = minRows != null ? minRows.intValue() : 1;
        Integer maxRows = textArea.getMaxRows();
        if (maxRows != null) {
            i11 = maxRows.intValue();
        } else {
            Integer minRows2 = textArea.getMinRows();
            if (minRows2 != null) {
                i11 = minRows2.intValue();
            }
        }
        return new InputFormVO.TextArea(placeholder, value, intValue, intValue2, i11, null, null, 96, null);
    }
}
