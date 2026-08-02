package ru.ozon.app.android.ugc.widgets.singlequestion.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.widgets.common.MenuDTOKt;
import ru.ozon.app.android.ugc.widgets.common.MenuVO;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.app.android.ugc.widgets.singlequestion.presentation.SingleQuestionVO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/core/SingleQuestionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/singlequestion/presentation/SingleQuestionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleQuestionMapper implements Function2<SingleQuestionDTO, d, List<? extends SingleQuestionVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SingleQuestionVO> invoke(@NotNull SingleQuestionDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d() + dto.getQuestion()).hashCode();
        TextDTO name = dto.getQuestion().getAuthor().getName();
        String avatarUri = dto.getQuestion().getAuthor().getAvatarUri();
        String createdAt = dto.getQuestion().getAuthor().getCreatedAt();
        SingleQuestionDTO.AuthorQuestion.Author.Partner partner = dto.getQuestion().getAuthor().getPartner();
        Badge badge = dto.getQuestion().getAuthor().getBadge();
        SingleQuestionVO.QuestionVO questionVO = new SingleQuestionVO.QuestionVO(dto.getQuestion().getQuestion().getId(), TextMapperKt.getDsTextAtom(dto.getQuestion().getQuestion().getText()), dto.getQuestion().getQuestion().getAuthorName());
        ButtonV3Atom.SmallButton answerButton = dto.getQuestion().getQuestion().getButtons().getAnswerButton();
        SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton = dto.getQuestion().getQuestion().getButtons().getLikeButton();
        MenuVO vo = MenuDTOKt.toVO(dto.getQuestion().getQuestion().getButtons().getMenu(), hashCode);
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getQuestion().getQuestion().getTrackingInfo();
        return C7714v.a0(new SingleQuestionVO(hashCode, name, avatarUri, createdAt, partner, badge, questionVO, answerButton, likeButton, vo, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
