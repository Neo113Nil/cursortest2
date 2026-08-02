package ru.ozon.app.android.common.activate_code.presentation;

import Ak.C2436a;
import H00.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.activate_code.data.ActivateCodeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jh\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$Input;", "input", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "activateButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "termsButton", "", "activatedData", "", "activated", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$Input;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/lang/Object;Z)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$Input;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/lang/Object;Z)Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$Input;", "getInput", "()Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO$Input;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getActivateButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getTermsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Ljava/lang/Object;", "getActivatedData", "()Ljava/lang/Object;", "Z", "getActivated", "()Z", "activate-code_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActivateCodeVO implements c {

    @NotNull
    private final ButtonV3Atom.LargeButton activateButton;
    private final boolean activated;

    @NotNull
    private final Object activatedData;
    private final String backgroundColor;
    private final long id;
    private final ActivateCodeDTO.Input input;
    private final ButtonV3Atom.SmallBorderlessButton termsButton;
    private final TextAtom title;

    public ActivateCodeVO(long j11, String str, TextAtom textAtom, ActivateCodeDTO.Input input, @NotNull ButtonV3Atom.LargeButton activateButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, @NotNull Object activatedData, boolean z11) {
        Intrinsics.checkNotNullParameter(activateButton, "activateButton");
        Intrinsics.checkNotNullParameter(activatedData, "activatedData");
        this.id = j11;
        this.backgroundColor = str;
        this.title = textAtom;
        this.input = input;
        this.activateButton = activateButton;
        this.termsButton = smallBorderlessButton;
        this.activatedData = activatedData;
        this.activated = z11;
    }

    public static /* synthetic */ ActivateCodeVO copy$default(ActivateCodeVO activateCodeVO, long j11, String str, TextAtom textAtom, ActivateCodeDTO.Input input, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            j11 = activateCodeVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = activateCodeVO.backgroundColor;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            textAtom = activateCodeVO.title;
        }
        TextAtom textAtom2 = textAtom;
        if ((i11 & 8) != 0) {
            input = activateCodeVO.input;
        }
        return activateCodeVO.copy(j12, str2, textAtom2, input, (i11 & 16) != 0 ? activateCodeVO.activateButton : largeButton, (i11 & 32) != 0 ? activateCodeVO.termsButton : smallBorderlessButton, (i11 & 64) != 0 ? activateCodeVO.activatedData : obj, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? activateCodeVO.activated : z11);
    }

    @NotNull
    public final ActivateCodeVO copy(long id2, String backgroundColor, TextAtom title, ActivateCodeDTO.Input input, @NotNull ButtonV3Atom.LargeButton activateButton, ButtonV3Atom.SmallBorderlessButton termsButton, @NotNull Object activatedData, boolean activated) {
        Intrinsics.checkNotNullParameter(activateButton, "activateButton");
        Intrinsics.checkNotNullParameter(activatedData, "activatedData");
        return new ActivateCodeVO(id2, backgroundColor, title, input, activateButton, termsButton, activatedData, activated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivateCodeVO)) {
            return false;
        }
        ActivateCodeVO activateCodeVO = (ActivateCodeVO) other;
        return this.id == activateCodeVO.id && Intrinsics.d(this.backgroundColor, activateCodeVO.backgroundColor) && Intrinsics.d(this.title, activateCodeVO.title) && Intrinsics.d(this.input, activateCodeVO.input) && Intrinsics.d(this.activateButton, activateCodeVO.activateButton) && Intrinsics.d(this.termsButton, activateCodeVO.termsButton) && Intrinsics.d(this.activatedData, activateCodeVO.activatedData) && this.activated == activateCodeVO.activated;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getActivateButton() {
        return this.activateButton;
    }

    public final boolean getActivated() {
        return this.activated;
    }

    @NotNull
    public final Object getActivatedData() {
        return this.activatedData;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ActivateCodeDTO.Input getInput() {
        return this.input;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3Atom.SmallBorderlessButton getTermsButton() {
        return this.termsButton;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        ActivateCodeDTO.Input input = this.input;
        int a11 = b.a(this.activateButton, (hashCode3 + (input == null ? 0 : input.hashCode())) * 31, 31);
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.termsButton;
        return Boolean.hashCode(this.activated) + a.c((a11 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0)) * 31, 31, this.activatedData);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        TextAtom textAtom = this.title;
        ActivateCodeDTO.Input input = this.input;
        ButtonV3Atom.LargeButton largeButton = this.activateButton;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.termsButton;
        Object obj = this.activatedData;
        boolean z11 = this.activated;
        StringBuilder c11 = C2436a.c(j11, "ActivateCodeVO(id=", ", backgroundColor=", str);
        c11.append(", title=");
        c11.append(textAtom);
        c11.append(", input=");
        c11.append(input);
        c11.append(", activateButton=");
        c11.append(largeButton);
        c11.append(", termsButton=");
        c11.append(smallBorderlessButton);
        c11.append(", activatedData=");
        c11.append(obj);
        c11.append(", activated=");
        c11.append(z11);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ ActivateCodeVO(long j11, String str, TextAtom textAtom, ActivateCodeDTO.Input input, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, Object obj, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, textAtom, input, largeButton, smallBorderlessButton, obj, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11);
    }
}
