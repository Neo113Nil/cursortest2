package ru.ozon.app.android.session.editCredential.newCredentials.data;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.InputType;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsVO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/data/NewCredentialsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/editCredential/newCredentials/data/NewCredentialsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "toVO", "(Lru/ozon/app/android/session/editCredential/newCredentials/data/NewCredentialsDTO;)Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;", "", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/InputType;", "toInputType", "(Ljava/lang/String;)Lru/ozon/app/android/session/editCredential/newCredentials/presentation/InputType;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/editCredential/newCredentials/data/NewCredentialsDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NewCredentialsMapper implements Function2<NewCredentialsDTO, d, List<? extends NewCredentialsVO>> {
    private final InputType toInputType(String str) {
        for (InputType inputType : InputType.values()) {
            if (h.D(inputType.name(), str, true)) {
                return inputType;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private final NewCredentialsVO toVO(NewCredentialsDTO newCredentialsDTO) {
        String type;
        long j11 = -209999524;
        String title = newCredentialsDTO.getTitle();
        String subtitle = newCredentialsDTO.getSubtitle();
        OzonSpannableString ozonSpannableString = subtitle != null ? OzonSpannableStringKt.toOzonSpannableString(subtitle) : null;
        InputDTO input = newCredentialsDTO.getInput();
        InputType inputType = (input == null || (type = input.getType()) == null) ? null : toInputType(type);
        InputDTO input2 = newCredentialsDTO.getInput();
        String placeholder = input2 != null ? input2.getPlaceholder() : null;
        InputDTO input3 = newCredentialsDTO.getInput();
        String name = input3 != null ? input3.getName() : null;
        InputDTO input4 = newCredentialsDTO.getInput();
        String caption = input4 != null ? input4.getCaption() : null;
        SubmitButtonDTO submitButton = newCredentialsDTO.getSubmitButton();
        String title2 = submitButton != null ? submitButton.getTitle() : null;
        SubmitButtonDTO submitButton2 = newCredentialsDTO.getSubmitButton();
        String action = submitButton2 != null ? submitButton2.getAction() : null;
        SecondaryButtonDTO secondaryButton = newCredentialsDTO.getSecondaryButton();
        String title3 = secondaryButton != null ? secondaryButton.getTitle() : null;
        SecondaryButtonDTO secondaryButton2 = newCredentialsDTO.getSecondaryButton();
        String deeplink = secondaryButton2 != null ? secondaryButton2.getDeeplink() : null;
        HintButtonDTO hintButton = newCredentialsDTO.getHintButton();
        String title4 = hintButton != null ? hintButton.getTitle() : null;
        HintButtonDTO hintButton2 = newCredentialsDTO.getHintButton();
        return new NewCredentialsVO(j11, title, ozonSpannableString, inputType, placeholder, name, caption, title2, title3, action, deeplink, title4, hintButton2 != null ? hintButton2.getDeeplink() : null, newCredentialsDTO.getTranslationLexemes());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NewCredentialsVO> invoke(@NotNull NewCredentialsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state));
    }
}
