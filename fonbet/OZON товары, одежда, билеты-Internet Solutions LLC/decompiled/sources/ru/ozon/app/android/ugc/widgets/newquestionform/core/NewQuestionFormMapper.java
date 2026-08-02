package ru.ozon.app.android.ugc.widgets.newquestionform.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.widgets.newquestionform.data.NewQuestionFormDTO;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/core/NewQuestionFormMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewQuestionFormMapper implements Function2<NewQuestionFormDTO, d, List<? extends NewQuestionFormVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NewQuestionFormVO> invoke(@NotNull NewQuestionFormDTO dto, @NotNull d widgetInfo) {
        long j11;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        long productId = dto.getProductId();
        Long questionId = dto.getQuestionId();
        NewQuestionFormVO.Header header = new NewQuestionFormVO.Header(dto.getHeader().getImage(), TextMapperKt.getDsTextAtom(dto.getHeader().getText()));
        NewQuestionFormDTO.Header secondHeader = dto.getSecondHeader();
        t tVar = null;
        NewQuestionFormVO.Header header2 = secondHeader != null ? new NewQuestionFormVO.Header(secondHeader.getImage(), TextMapperKt.getDsTextAtom(secondHeader.getText())) : null;
        String placeholder = dto.getInput().getPlaceholder();
        int minLength = dto.getInput().getMinLength();
        int maxLength = dto.getInput().getMaxLength();
        String invalidLengthError = dto.getInput().getInvalidLengthError();
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle anonymousCell = dto.getAnonymousCell();
        ButtonV3Atom.LargeBorderlessButton policyRulesButton = dto.getPolicyRulesButton();
        ButtonV3Atom.LargeButton sendButton = dto.getSendButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        if (trackingInfo != null) {
            j11 = hashCode;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        } else {
            j11 = hashCode;
        }
        return C7714v.a0(new NewQuestionFormVO(j11, productId, questionId, header, header2, placeholder, minLength, maxLength, invalidLengthError, anonymousCell, policyRulesButton, sendButton, tVar));
    }
}
