package ru.ozon.app.android.session.editUserFullName.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameDTO;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$InputDTO;", "", "currentIndex", "lastIndex", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "toInputVo", "(Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$InputDTO;II)Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$SubmitButtonDTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "toSubmitButtonAtom", "(Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO$SubmitButtonDTO;)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EditUserFullNameMapper implements Function2<EditUserFullNameDTO, d, List<? extends EditUserFullNameVO>> {
    private final EditUserFullNameVO.InputVO toInputVo(EditUserFullNameDTO.InputDTO inputDTO, int i11, int i12) {
        return new EditUserFullNameVO.InputVO(inputDTO.getName(), inputDTO.getPlaceholder(), true, inputDTO.getValue(), i11 == i12 ? 6 : 5, i11 == 0, null);
    }

    private final ButtonV3Atom.LargeButton toSubmitButtonAtom(EditUserFullNameDTO.SubmitButtonDTO submitButtonDTO) {
        return new ButtonV3Atom.LargeButton(OzonSpannableStringKt.toOzonSpannableString(submitButtonDTO.getText()), null, ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_PRIMARY, null, null, submitButtonDTO.getAction(), null, null, null, 474, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EditUserFullNameVO> invoke(@NotNull EditUserFullNameDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        String title = state.getTitle();
        List<EditUserFullNameDTO.InputDTO> inputs = state.getInputs();
        ArrayList arrayList = new ArrayList(C7714v.z(inputs, 10));
        Iterator<T> it = inputs.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                ButtonV3Atom.LargeButton submitButtonAtom = toSubmitButtonAtom(state.getSubmitButton());
                AtomAction atomAction = AtomActionMapperKt.toAtomAction(state.getSubmitButton().getAction(), null);
                return C7714v.a0(new EditUserFullNameVO(hashCode, title, arrayList, submitButtonAtom, atomAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) atomAction : null));
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toInputVo((EditUserFullNameDTO.InputDTO) next, i11, C7714v.P(state.getInputs())));
            i11 = i12;
        }
    }
}
