package ru.ozon.app.android.ugc.widgets.usersGrades.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.usersGrades.data.UsersGradesDTO;
import ru.ozon.app.android.ugc.widgets.usersGrades.presentation.UsersGradesVO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGrades/core/UsersGradesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/usersGrades/data/UsersGradesDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/usersGrades/presentation/UsersGradesVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/usersGrades/data/UsersGradesDTO$Answer;", "Lru/ozon/app/android/ugc/widgets/usersGrades/presentation/UsersGradesVO$AnswerVO;", "toVO", "(Lru/ozon/app/android/ugc/widgets/usersGrades/data/UsersGradesDTO$Answer;)Lru/ozon/app/android/ugc/widgets/usersGrades/presentation/UsersGradesVO$AnswerVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/usersGrades/data/UsersGradesDTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UsersGradesMapper implements Function2<UsersGradesDTO, d, List<? extends UsersGradesVO>> {
    private final UsersGradesVO.AnswerVO toVO(UsersGradesDTO.Answer answer) {
        return new UsersGradesVO.AnswerVO(TextMapperKt.getDsTextAtom(answer.getTitle()), TextMapperKt.getDsTextAtom(answer.getValue()), (int) answer.getFillPercent(), answer.getFillLineColor());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<UsersGradesVO> invoke(@NotNull UsersGradesDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom value = state.getValue();
        TextDTO dsTextAtom = value != null ? TextMapperKt.getDsTextAtom(value) : null;
        List<UsersGradesDTO.Answer> answers = state.getAnswers();
        ArrayList arrayList = new ArrayList(C7714v.z(answers, 10));
        Iterator<T> it = answers.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((UsersGradesDTO.Answer) it.next()));
        }
        return C7714v.a0(new UsersGradesVO(hashCode, dsTextAtom, arrayList));
    }
}
