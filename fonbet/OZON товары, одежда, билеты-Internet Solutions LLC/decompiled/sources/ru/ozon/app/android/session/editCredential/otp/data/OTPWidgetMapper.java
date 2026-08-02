package ru.ozon.app.android.session.editCredential.otp.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetVO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OTPWidgetMapper implements Function2<OTPWidgetDTO, d, List<? extends OTPWidgetVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OTPWidgetVO> invoke(@NotNull OTPWidgetDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (state.getTitle() + "." + ((Object) state.getSubtitle())).hashCode();
        String title = state.getTitle();
        OTPWidgetVO.SubmitAction submitAction = new OTPWidgetVO.SubmitAction(state.getAction(), state.getData());
        OzonSpannableString subtitle = state.getSubtitle();
        OTPWidgetDTO.Input input = state.getInput();
        ArrayList arrayList = null;
        OTPWidgetVO.OtpInput otpInput = input != null ? new OTPWidgetVO.OtpInput(input.getValue(), input.getPlaceholder(), input.getName()) : null;
        OTPWidgetDTO.RetryButton retryButton = state.getRetryButton();
        List<OTPWidgetDTO.HintButton> hintButtons = state.getHintButtons();
        if (hintButtons != null) {
            List<OTPWidgetDTO.HintButton> list = hintButtons;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (OTPWidgetDTO.HintButton hintButton : list) {
                OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(hintButton.getTitle());
                CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_250;
                arrayList.add(new OTPWidgetVO.HintButton(new TextDTO(ozonSpannableString, TextDTO.TextAlignment.CENTER, null, null, layoutPadding, layoutPadding, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_CONTROL_500_MEDIUM.getToken(), UniColors.TEXT_ACTION.getToken(), null, null, null, null, false, null, null, null, null, 1, 261644, null), new OTPWidgetVO.HintAction(hintButton.getDeeplink(), hintButton.getData()), hintButton.getTrackClick()));
            }
        }
        return C7714v.a0(new OTPWidgetVO(hashCode, title, subtitle, submitAction, otpInput, retryButton, arrayList, null, state.getOtpLength(), state.getErrorLogoUrl(), state.getPageType(), null, 0, 6272, null));
    }
}
