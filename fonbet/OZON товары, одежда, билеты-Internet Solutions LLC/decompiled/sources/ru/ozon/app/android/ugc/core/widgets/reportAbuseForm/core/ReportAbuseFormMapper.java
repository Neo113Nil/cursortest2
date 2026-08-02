package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.core;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.data.ReportAbuseFormDTO;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormVO;
import ru.ozon.uni.atoms.data.cell.RadioTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/core/ReportAbuseFormMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/data/ReportAbuseFormDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/data/ReportAbuseFormDTO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReportAbuseFormMapper implements Function2<ReportAbuseFormDTO, d, List<? extends ReportAbuseFormVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReportAbuseFormVO> invoke(@NotNull ReportAbuseFormDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), state.getClass().getSimpleName());
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        if (subtitle.getText().length() <= 0) {
            subtitle = null;
        }
        TextDTO textDTO = subtitle;
        List<RadioTitleSubtitleCellDTO> abuseReasons = state.getAbuseReasons();
        String inputTextPlaceholder = state.getInputTextPlaceholder();
        Boolean isHideInput = state.isHideInput();
        boolean booleanValue = isHideInput != null ? isHideInput.booleanValue() : false;
        String backgroundColor = state.getBackgroundColor();
        CornerRadius cornerRadius = state.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_500;
        }
        return C7714v.a0(new ReportAbuseFormVO(a11, title, textDTO, abuseReasons, inputTextPlaceholder, booleanValue, backgroundColor, cornerRadius));
    }
}
