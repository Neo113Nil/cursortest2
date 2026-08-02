package defpackage;

import android.app.Application;
import com.sofascore.model.newNetwork.Question;
import com.sofascore.model.newNetwork.Survey;
import com.sofascore.model.newNetwork.SurveyAnswer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Laoi;", "Lq8;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class aoi extends q8 {
    public final yni e;
    public final yzc f;
    public final yzc g;
    public Survey h;
    public int i;
    public final ArrayList j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoi(Application application, yni yniVar) {
        super(application);
        yniVar.getClass();
        this.e = yniVar;
        yzc yzcVar = new yzc();
        this.f = yzcVar;
        this.g = yzcVar;
        this.j = new ArrayList();
    }

    public final ArrayList k(ArrayList arrayList, int i) {
        Object obj;
        List<Integer> values;
        Survey survey = this.h;
        if (survey == null) {
            Intrinsics.i("survey");
            throw null;
        }
        List<Question> questions = survey.getQuestions();
        Survey survey2 = this.h;
        if (survey2 == null) {
            Intrinsics.i("survey");
            throw null;
        }
        List<Question> subList = questions.subList(i, survey2.getQuestions().size());
        ArrayList arrayList2 = new ArrayList();
        for (Question question : subList) {
            Map<Integer, List<Integer>> filter = question.getFilter();
            if (filter != null) {
                Iterator<Map.Entry<Integer, List<Integer>>> it = filter.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        arrayList2.add(question);
                        break;
                    }
                    Map.Entry<Integer, List<Integer>> next = it.next();
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((SurveyAnswer) obj).getId() == next.getKey().intValue()) {
                            break;
                        }
                    }
                    SurveyAnswer surveyAnswer = (SurveyAnswer) obj;
                    if (surveyAnswer != null && (values = surveyAnswer.getValues()) != null && !values.isEmpty()) {
                        Iterator<T> it3 = values.iterator();
                        while (it3.hasNext()) {
                            if (next.getValue().contains(Integer.valueOf(((Number) it3.next()).intValue()))) {
                                break;
                            }
                        }
                    }
                }
            } else {
                arrayList2.add(question);
            }
        }
        return arrayList2;
    }
}
