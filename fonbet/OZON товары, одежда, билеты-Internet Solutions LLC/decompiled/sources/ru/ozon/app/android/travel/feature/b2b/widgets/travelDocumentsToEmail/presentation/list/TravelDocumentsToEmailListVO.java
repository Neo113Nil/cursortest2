package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000234BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b\b\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b\u000b\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isInputVisible", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Input;", "input", "isEmailListVisible", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Email;", "emails", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "submitEmailButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "addEmailButton", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Input;ZLjava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Input;", "getInput", "()Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Input;", "Ljava/util/List;", "getEmails", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubmitEmailButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getAddEmailButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Input", "Email", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TravelDocumentsToEmailListVO implements c {
    private final ButtonV3Atom.SmallBorderlessButton addEmailButton;

    @NotNull
    private final List<Email> emails;
    private final long id;
    private final Input input;
    private final boolean isEmailListVisible;
    private final boolean isInputVisible;
    private final ButtonV3Atom.LargeButton submitEmailButton;
    private final TextAtom title;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Email;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", Scopes.EMAIL, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "removeButton", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getEmail", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getRemoveButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Email {
        public static final int $stable = ButtonV3Atom.SmallIconButton.$stable | TextAtom.$stable;

        @NotNull
        private final TextAtom email;
        private final long id;

        @NotNull
        private final ButtonV3Atom.SmallIconButton removeButton;

        public Email(long j11, @NotNull TextAtom email, @NotNull ButtonV3Atom.SmallIconButton removeButton) {
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(removeButton, "removeButton");
            this.id = j11;
            this.email = email;
            this.removeButton = removeButton;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return this.id == email.id && Intrinsics.d(this.email, email.email) && Intrinsics.d(this.removeButton, email.removeButton);
        }

        @NotNull
        public final TextAtom getEmail() {
            return this.email;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final ButtonV3Atom.SmallIconButton getRemoveButton() {
            return this.removeButton;
        }

        public int hashCode() {
            return this.removeButton.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.email);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.email;
            ButtonV3Atom.SmallIconButton smallIconButton = this.removeButton;
            StringBuilder c11 = C2639a.c("Email(id=", j11, ", email=", textAtom);
            c11.append(", removeButton=");
            c11.append(smallIconButton);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Input;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "", "isErrorVisible", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getPlaceholder", "Z", "()Z", "getError", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {
        private final String error;
        private final boolean isErrorVisible;
        private final String placeholder;
        private final String value;

        public Input(String str, String str2, boolean z11, String str3) {
            this.value = str;
            this.placeholder = str2;
            this.isErrorVisible = z11;
            this.error = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.d(this.value, input.value) && Intrinsics.d(this.placeholder, input.placeholder) && this.isErrorVisible == input.isErrorVisible && Intrinsics.d(this.error, input.error);
        }

        public final String getError() {
            return this.error;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.placeholder;
            int a11 = C3532b.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isErrorVisible);
            String str3 = this.error;
            return a11 + (str3 != null ? str3.hashCode() : 0);
        }

        /* renamed from: isErrorVisible, reason: from getter */
        public final boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        @NotNull
        public String toString() {
            String str = this.value;
            String str2 = this.placeholder;
            boolean z11 = this.isErrorVisible;
            String str3 = this.error;
            StringBuilder d11 = C3660k.d("Input(value=", str, ", placeholder=", str2, ", isErrorVisible=");
            d11.append(z11);
            d11.append(", error=");
            d11.append(str3);
            d11.append(")");
            return d11.toString();
        }
    }

    public TravelDocumentsToEmailListVO(long j11, TextAtom textAtom, boolean z11, Input input, boolean z12, @NotNull List<Email> emails, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
        Intrinsics.checkNotNullParameter(emails, "emails");
        this.id = j11;
        this.title = textAtom;
        this.isInputVisible = z11;
        this.input = input;
        this.isEmailListVisible = z12;
        this.emails = emails;
        this.submitEmailButton = largeButton;
        this.addEmailButton = smallBorderlessButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelDocumentsToEmailListVO)) {
            return false;
        }
        TravelDocumentsToEmailListVO travelDocumentsToEmailListVO = (TravelDocumentsToEmailListVO) other;
        return this.id == travelDocumentsToEmailListVO.id && Intrinsics.d(this.title, travelDocumentsToEmailListVO.title) && this.isInputVisible == travelDocumentsToEmailListVO.isInputVisible && Intrinsics.d(this.input, travelDocumentsToEmailListVO.input) && this.isEmailListVisible == travelDocumentsToEmailListVO.isEmailListVisible && Intrinsics.d(this.emails, travelDocumentsToEmailListVO.emails) && Intrinsics.d(this.submitEmailButton, travelDocumentsToEmailListVO.submitEmailButton) && Intrinsics.d(this.addEmailButton, travelDocumentsToEmailListVO.addEmailButton);
    }

    public final ButtonV3Atom.SmallBorderlessButton getAddEmailButton() {
        return this.addEmailButton;
    }

    @NotNull
    public final List<Email> getEmails() {
        return this.emails;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Input getInput() {
        return this.input;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3Atom.LargeButton getSubmitEmailButton() {
        return this.submitEmailButton;
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
        TextAtom textAtom = this.title;
        int a11 = C3532b.a((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.isInputVisible);
        Input input = this.input;
        int b11 = g.b(C3532b.a((a11 + (input == null ? 0 : input.hashCode())) * 31, 31, this.isEmailListVisible), 31, this.emails);
        ButtonV3Atom.LargeButton largeButton = this.submitEmailButton;
        int hashCode2 = (b11 + (largeButton == null ? 0 : largeButton.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.addEmailButton;
        return hashCode2 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
    }

    /* renamed from: isEmailListVisible, reason: from getter */
    public final boolean getIsEmailListVisible() {
        return this.isEmailListVisible;
    }

    /* renamed from: isInputVisible, reason: from getter */
    public final boolean getIsInputVisible() {
        return this.isInputVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        boolean z11 = this.isInputVisible;
        Input input = this.input;
        boolean z12 = this.isEmailListVisible;
        List<Email> list = this.emails;
        ButtonV3Atom.LargeButton largeButton = this.submitEmailButton;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.addEmailButton;
        StringBuilder c11 = C2639a.c("TravelDocumentsToEmailListVO(id=", j11, ", title=", textAtom);
        c11.append(", isInputVisible=");
        c11.append(z11);
        c11.append(", input=");
        c11.append(input);
        c11.append(", isEmailListVisible=");
        c11.append(z12);
        c11.append(", emails=");
        c11.append(list);
        c11.append(", submitEmailButton=");
        c11.append(largeButton);
        c11.append(", addEmailButton=");
        c11.append(smallBorderlessButton);
        c11.append(")");
        return c11.toString();
    }
}
