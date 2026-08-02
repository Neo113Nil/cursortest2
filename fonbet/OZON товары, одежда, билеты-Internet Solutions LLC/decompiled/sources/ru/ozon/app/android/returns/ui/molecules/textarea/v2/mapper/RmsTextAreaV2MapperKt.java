package ru.ozon.app.android.returns.ui.molecules.textarea.v2.mapper;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.v2.data.RmsTextAreaV2Dto;
import ru.ozon.app.android.returns.ui.molecules.textarea.v2.viewObject.RmsTextAreaV2VO;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/returns/ui/molecules/textarea/v2/viewObject/RmsTextAreaV2VO;", "Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto;", "Lru/ozon/uni/android/textArea/TextAreaView$Status;", "Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto$Status;", "returns_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RmsTextAreaV2MapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RmsTextAreaV2Dto.Status.values().length];
            try {
                iArr[RmsTextAreaV2Dto.Status.STATUS_NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RmsTextAreaV2Dto.Status.STATUS_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RmsTextAreaV2Dto.Status.STATUS_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final RmsTextAreaV2VO toVO(@NotNull RmsTextAreaV2Dto rmsTextAreaV2Dto) {
        Intrinsics.checkNotNullParameter(rmsTextAreaV2Dto, "<this>");
        String value = rmsTextAreaV2Dto.getValue();
        String label = rmsTextAreaV2Dto.getLabel();
        String caption = rmsTextAreaV2Dto.getCaption();
        String captionColorToken = rmsTextAreaV2Dto.getCaptionColorToken();
        if (captionColorToken == null) {
            captionColorToken = UniColors.TEXT_SECONDARY.getToken();
        }
        String str = captionColorToken;
        Integer minRows = rmsTextAreaV2Dto.getMinRows();
        int intValue = minRows != null ? minRows.intValue() : 1;
        Integer maxRows = rmsTextAreaV2Dto.getMaxRows();
        int intValue2 = maxRows != null ? maxRows.intValue() : 15;
        RmsTextAreaV2Dto.Status status = rmsTextAreaV2Dto.getStatus();
        if (status == null) {
            status = RmsTextAreaV2Dto.Status.STATUS_NEUTRAL;
        }
        TextAreaView.Status vo = toVO(status);
        Boolean hasCounter = rmsTextAreaV2Dto.getHasCounter();
        boolean booleanValue = hasCounter != null ? hasCounter.booleanValue() : false;
        Integer maxCounterValue = rmsTextAreaV2Dto.getMaxCounterValue();
        return new RmsTextAreaV2VO(value, label, caption, str, intValue, intValue2, vo, booleanValue, maxCounterValue != null ? maxCounterValue.intValue() : CounterView.COUNTER_MAX_DEFAULT, rmsTextAreaV2Dto.getTestInfo());
    }

    @NotNull
    public static final TextAreaView.Status toVO(@NotNull RmsTextAreaV2Dto.Status status) {
        Intrinsics.checkNotNullParameter(status, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i11 == 1) {
            return TextAreaView.Status.NEUTRAL;
        }
        if (i11 == 2) {
            return TextAreaView.Status.SUCCESS;
        }
        if (i11 == 3) {
            return TextAreaView.Status.ERROR;
        }
        throw new o();
    }
}
