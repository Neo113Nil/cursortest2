package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.data.TravelDocumentsToEmailDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.TravelDocumentsToEmailListVO;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Input;", "item", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Input;", "mapInput", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Input;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Input;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Email;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Email;", "mapEmail", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO$Email;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Email;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/data/TravelDocumentsToEmailDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TravelDocumentsToEmailListMapper implements Function2<TravelDocumentsToEmailDTO, d, List<? extends TravelDocumentsToEmailListVO>> {
    private final TravelDocumentsToEmailListVO.Email mapEmail(TravelDocumentsToEmailDTO.Email item) {
        return new TravelDocumentsToEmailListVO.Email(item.getEmail().getText().hashCode(), item.getEmail(), item.getRemoveEmailButton());
    }

    private final TravelDocumentsToEmailListVO.Input mapInput(TravelDocumentsToEmailDTO.Input item) {
        if (item == null) {
            return null;
        }
        String value = item.getValue();
        String placeholder = item.getPlaceholder();
        List<String> errors = item.getErrors();
        boolean z11 = false;
        if (errors != null && !CollectionExtKt.isNullOrEmpty(errors)) {
            z11 = true;
        }
        List<String> errors2 = item.getErrors();
        return new TravelDocumentsToEmailListVO.Input(value, placeholder, z11, errors2 != null ? C7714v.V(errors2, "\n", null, null, null, 62) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelDocumentsToEmailListVO> invoke(@NotNull TravelDocumentsToEmailDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom emailTitle = state.getEmailTitle();
        boolean z11 = state.getEmailInput() != null;
        TravelDocumentsToEmailListVO.Input mapInput = mapInput(state.getEmailInput());
        boolean z12 = !state.getEmails().isEmpty();
        List<TravelDocumentsToEmailDTO.Email> emails = state.getEmails();
        ArrayList arrayList = new ArrayList(C7714v.z(emails, 10));
        Iterator<T> it = emails.iterator();
        while (it.hasNext()) {
            arrayList.add(mapEmail((TravelDocumentsToEmailDTO.Email) it.next()));
        }
        return C7714v.a0(new TravelDocumentsToEmailListVO(hashCode, emailTitle, z11, mapInput, z12, arrayList, state.getSubmitEmailButton(), state.getAddEmailInputButton()));
    }
}
