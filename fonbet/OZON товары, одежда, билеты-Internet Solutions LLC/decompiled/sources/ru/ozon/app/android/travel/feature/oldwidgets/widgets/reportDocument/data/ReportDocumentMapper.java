package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.data;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.a;
import org.joda.time.format.b;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation.ReportDocumentVO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.mapper.CommonInputMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "date", "changeFormat", "(Ljava/lang/String;)Ljava/lang/String;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/data/ReportDocumentDTO;Ll20/d;)Ljava/util/List;", "Lorg/joda/time/format/b;", "kotlin.jvm.PlatformType", "inputFormatter", "Lorg/joda/time/format/b;", "outputFormatter", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReportDocumentMapper implements Function2<ReportDocumentDTO, d, List<? extends ReportDocumentVO>> {
    private final b inputFormatter = a.b("ddMMyyyy");
    private final b outputFormatter = a.b("dd.MM.yyyy");

    private final String changeFormat(String date) {
        if (date.length() == 0) {
            return date;
        }
        String h11 = this.outputFormatter.h(this.inputFormatter.e(date));
        Intrinsics.checkNotNullExpressionValue(h11, "print(...)");
        return h11;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReportDocumentVO> invoke(@NotNull ReportDocumentDTO state, @NotNull d widgetInfo) {
        boolean z11;
        boolean z12;
        CommonInputVO.DateCommonInputVO dateCommonInputVO;
        CommonInputVO commonInputVO;
        CommonInputVO.DateCommonInputVO dateCommonInputVO2;
        CommonInputVO.DateCommonInputVO copy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        TextAtom text = state.getText();
        boolean z13 = false;
        boolean z14 = true;
        if (state.getEmail() != null) {
            z11 = true;
        } else {
            z11 = true;
            z14 = false;
        }
        if (state.getFromDate() == null || state.getToDate() == null) {
            z12 = false;
        } else {
            z12 = false;
            z13 = z11;
        }
        CommonInputDTO fromDate = state.getFromDate();
        CommonInputVO vO$default = fromDate != null ? CommonInputMapperKt.toVO$default(fromDate, Boolean.FALSE, null, 0, "fromDate", 2, null) : null;
        CommonInputVO.DateCommonInputVO dateCommonInputVO3 = vO$default instanceof CommonInputVO.DateCommonInputVO ? (CommonInputVO.DateCommonInputVO) vO$default : null;
        if (dateCommonInputVO3 != null) {
            String value = state.getFromDate().getValue();
            if (value == null) {
                value = "";
            }
            dateCommonInputVO = dateCommonInputVO3.copy((r29 & 1) != 0 ? dateCommonInputVO3.id : 0L, (r29 & 2) != 0 ? dateCommonInputVO3.name : null, (r29 & 4) != 0 ? dateCommonInputVO3.value : changeFormat(value), (r29 & 8) != 0 ? dateCommonInputVO3.isErrorVisible : false, (r29 & 16) != 0 ? dateCommonInputVO3.error : null, (r29 & 32) != 0 ? dateCommonInputVO3.scrollOnMount : false, (r29 & 64) != 0 ? dateCommonInputVO3.placeholder : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? dateCommonInputVO3.isEnabled : false, (r29 & 256) != 0 ? dateCommonInputVO3.dateRange : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? dateCommonInputVO3.onSelectAction : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? dateCommonInputVO3.defaultValue : null, (r29 & 2048) != 0 ? dateCommonInputVO3.rightIcon : null, (r29 & 4096) != 0 ? dateCommonInputVO3.leftIcon : null);
        } else {
            dateCommonInputVO = null;
        }
        CommonInputDTO toDate = state.getToDate();
        if (toDate != null) {
            if (state.getEmail() != null) {
                z11 = z12;
            }
            commonInputVO = CommonInputMapperKt.toVO$default(toDate, Boolean.valueOf(z11), null, 1, "toDate", 2, null);
        } else {
            commonInputVO = null;
        }
        CommonInputVO.DateCommonInputVO dateCommonInputVO4 = commonInputVO instanceof CommonInputVO.DateCommonInputVO ? (CommonInputVO.DateCommonInputVO) commonInputVO : null;
        if (dateCommonInputVO4 != null) {
            String value2 = state.getToDate().getValue();
            copy = dateCommonInputVO4.copy((r29 & 1) != 0 ? dateCommonInputVO4.id : 0L, (r29 & 2) != 0 ? dateCommonInputVO4.name : null, (r29 & 4) != 0 ? dateCommonInputVO4.value : changeFormat(value2 != null ? value2 : ""), (r29 & 8) != 0 ? dateCommonInputVO4.isErrorVisible : false, (r29 & 16) != 0 ? dateCommonInputVO4.error : null, (r29 & 32) != 0 ? dateCommonInputVO4.scrollOnMount : false, (r29 & 64) != 0 ? dateCommonInputVO4.placeholder : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? dateCommonInputVO4.isEnabled : false, (r29 & 256) != 0 ? dateCommonInputVO4.dateRange : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? dateCommonInputVO4.onSelectAction : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? dateCommonInputVO4.defaultValue : null, (r29 & 2048) != 0 ? dateCommonInputVO4.rightIcon : null, (r29 & 4096) != 0 ? dateCommonInputVO4.leftIcon : null);
            dateCommonInputVO2 = copy;
        } else {
            dateCommonInputVO2 = null;
        }
        CommonInputDTO email = state.getEmail();
        Object vO$default2 = email != null ? CommonInputMapperKt.toVO$default(email, Boolean.TRUE, null, 2, Scopes.EMAIL, 2, null) : null;
        return C7714v.a0(new ReportDocumentVO(hashCode, title, text, z13, z14, dateCommonInputVO, dateCommonInputVO2, vO$default2 instanceof CommonInputVO.TextCommonInputVO ? (CommonInputVO.TextCommonInputVO) vO$default2 : null, state.getButton()));
    }
}
