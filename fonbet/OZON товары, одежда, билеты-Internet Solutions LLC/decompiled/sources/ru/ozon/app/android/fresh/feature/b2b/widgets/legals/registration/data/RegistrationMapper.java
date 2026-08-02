package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.data.RegistrationDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationVI;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVI", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO;J)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI$InputVI;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO$FieldDTO$InputDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI$FieldVI$InputVI;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/data/RegistrationDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RegistrationMapper implements Function2<RegistrationDTO, d, List<? extends RegistrationVI>> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    private final RegistrationVI toVI(RegistrationDTO registrationDTO, long j11) {
        List list;
        CellDTO requisites = registrationDTO.getRequisites();
        List<RegistrationDTO.FieldDTO> fields = registrationDTO.getFields();
        if (fields != null) {
            List<RegistrationDTO.FieldDTO> list2 = fields;
            list = new ArrayList(C7714v.z(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(toVI((RegistrationDTO.FieldDTO) it.next()));
            }
        } else {
            list = K.f71697a;
        }
        return new RegistrationVI(j11, requisites, list, registrationDTO.getBanner(), registrationDTO.getButton());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RegistrationVI> invoke(@NotNull RegistrationDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVI(state, widgetInfo.d().hashCode()));
    }

    private final RegistrationVI.FieldVI toVI(RegistrationDTO.FieldDTO fieldDTO) {
        TextDTO title = fieldDTO.getTitle();
        TextDTO subtitle = fieldDTO.getSubtitle();
        RegistrationDTO.FieldDTO.InputDTO input = fieldDTO.getInput();
        return new RegistrationVI.FieldVI(title, subtitle, input != null ? toVI(input) : null, fieldDTO.getCheckbox());
    }

    private final RegistrationVI.FieldVI.InputVI toVI(RegistrationDTO.FieldDTO.InputDTO inputDTO) {
        String name = inputDTO.getName();
        String value = inputDTO.getValue();
        String placeholder = inputDTO.getPlaceholder();
        String caption = inputDTO.getCaption();
        Boolean required = inputDTO.getRequired();
        boolean booleanValue = required != null ? required.booleanValue() : false;
        Boolean readOnly = inputDTO.getReadOnly();
        boolean booleanValue2 = readOnly != null ? readOnly.booleanValue() : false;
        RegistrationDTO.FieldDTO.InputDTO.Errors lexemes = inputDTO.getLexemes();
        Integer minLength = inputDTO.getMinLength();
        int intValue = minLength != null ? minLength.intValue() : LinearLayoutManager.INVALID_OFFSET;
        Integer maxLength = inputDTO.getMaxLength();
        int intValue2 = maxLength != null ? maxLength.intValue() : Integer.MAX_VALUE;
        Boolean isAddress = inputDTO.isAddress();
        return new RegistrationVI.FieldVI.InputVI(name, value, placeholder, caption, booleanValue, booleanValue2, lexemes, intValue, intValue2, isAddress != null ? isAddress.booleanValue() : false, inputDTO.getViewType(), inputDTO.getKeyboardType());
    }
}
