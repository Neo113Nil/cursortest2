package ru.ozon.app.android.ugc.widgets.listquestions.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.utils.HtmlOpenBracketReplacer;
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.app.android.ugc.widgets.listquestions.data.ListQuestionsDTO;
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "<unused var>", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ListQuestionsConfig$parser$1 extends AbstractC7737t implements Function2<String, String, List<? extends Object>> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListQuestionsConfig$parser$1(JsonParser jsonParser) {
        super(2);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<Object> invoke(String str, String str2) {
        ArrayList arrayList;
        ListQuestionsDTO listQuestionsDTO;
        HtmlOpenBracketReplacer htmlOpenBracketReplacer = new HtmlOpenBracketReplacer();
        JsonParser jsonParser = this.$jsonDeserializer;
        String replaceNoHtmlOpenBrackets = htmlOpenBracketReplacer.replaceNoHtmlOpenBrackets(str2);
        if (replaceNoHtmlOpenBrackets == null || (listQuestionsDTO = (ListQuestionsDTO) jsonParser.fromJson(replaceNoHtmlOpenBrackets, ListQuestionsDTO.class)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (ListQuestionsDTO.Element element : listQuestionsDTO.getElements()) {
                arrayList.add(new SingleQuestionDTO(element.getQuestion()));
                ListAnswersDTO.Answer answer = element.getAnswer();
                if (answer != null) {
                    arrayList.add(new ListAnswersDTO(null, C7714v.a0(answer), element.getMoreAnswers(), listQuestionsDTO.getProductID()));
                }
            }
            arrayList.add(listQuestionsDTO);
        }
        return arrayList == null ? K.f71697a : arrayList;
    }
}
