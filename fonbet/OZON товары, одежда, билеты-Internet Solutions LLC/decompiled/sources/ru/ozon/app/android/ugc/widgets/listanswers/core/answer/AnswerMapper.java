package ru.ozon.app.android.ugc.widgets.listanswers.core.answer;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.app.android.ugc.widgets.listanswers.presentation.answer.AnswerVO;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/core/answer/AnswerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/listanswers/presentation/answer/AnswerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnswerMapper implements Function2<ListAnswersDTO, d, List<? extends AnswerVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AnswerVO> invoke(@NotNull ListAnswersDTO dto, @NotNull d widgetInfo) {
        ListAnswersDTO dto2 = dto;
        Intrinsics.checkNotNullParameter(dto2, "dto");
        d widgetInfo2 = widgetInfo;
        Intrinsics.checkNotNullParameter(widgetInfo2, "widgetInfo");
        List<ListAnswersDTO.Answer> answers = dto2.getAnswers();
        ArrayList arrayList = new ArrayList(C7714v.z(answers, 10));
        Iterator it = answers.iterator();
        while (it.hasNext()) {
            ListAnswersDTO.Answer answer = (ListAnswersDTO.Answer) it.next();
            long hashCode = (widgetInfo2.d() + answer).hashCode();
            TextDTO name = answer.getAuthor().getName();
            String avatarUri = answer.getAuthor().getAvatarUri();
            String createdAt = answer.getAuthor().getCreatedAt();
            SingleQuestionDTO.AuthorQuestion.Author.Partner partner = answer.getAuthor().getPartner();
            Badge badge = answer.getAuthor().getBadge();
            if (badge == null) {
                badge = answer.getBadge();
            }
            Badge badge2 = badge;
            TextDTO copy$default = TextDTO.copy$default(answer.getAnswerText(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null);
            TextAtom title = answer.getButtons().getTitle();
            TextDTO dsTextAtom = title != null ? TextMapperKt.getDsTextAtom(title) : null;
            TagV3Atom.TagAtom like = answer.getButtons().getLike();
            TagV3Atom.TagAtom dislike = answer.getButtons().getDislike();
            ListAnswersDTO.Answer.AnswerButtons.MakeBestButton makeBest = answer.getButtons().getMakeBest();
            MenuVO vo = MenuDTOKt.toVO(answer.getButtons().getMenu(), hashCode);
            ButtonV3Atom.SmallBorderlessButton moreAnswers = dto2.getMoreAnswers();
            Boolean isHighlighted = answer.isHighlighted();
            Iterator it2 = it;
            Boolean bool = Boolean.TRUE;
            boolean d11 = Intrinsics.d(isHighlighted, bool);
            String token = Intrinsics.d(answer.isHighlighted(), bool) ? UniColors.BG_ACTION_SECONDARY.getToken() : UniColors.LAYER_FLOOR_1.getToken();
            Map<String, TokenizedTrackingInfo> trackingInfo = answer.getTrackingInfo();
            arrayList.add(new AnswerVO(hashCode, name, avatarUri, createdAt, partner, badge2, copy$default, dsTextAtom, like, dislike, makeBest, vo, moreAnswers, d11, token, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
            dto2 = dto;
            widgetInfo2 = widgetInfo;
            it = it2;
        }
        return arrayList;
    }
}
