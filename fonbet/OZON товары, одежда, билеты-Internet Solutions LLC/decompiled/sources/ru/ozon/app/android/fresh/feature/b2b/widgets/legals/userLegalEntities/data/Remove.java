package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.data;

import G.g;
import I0.C3173b;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "confirmation", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getConfirmation", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Confirmation", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Remove {
    public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;

    @NotNull
    private final ButtonV3Atom.SmallIconButton button;

    @NotNull
    private final Confirmation confirmation;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "submitButtonText", "cancelButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSubmitButtonText", "getCancelButtonText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Confirmation {
        public static final int $stable = 0;

        @NotNull
        private final String cancelButtonText;

        @NotNull
        private final String submitButtonText;

        @NotNull
        private final String subtitle;

        @NotNull
        private final String title;

        public Confirmation(@NotNull String title, @NotNull String subtitle, @NotNull String submitButtonText, @NotNull String cancelButtonText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
            Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
            this.title = title;
            this.subtitle = subtitle;
            this.submitButtonText = submitButtonText;
            this.cancelButtonText = cancelButtonText;
        }

        public static /* synthetic */ Confirmation copy$default(Confirmation confirmation, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = confirmation.title;
            }
            if ((i11 & 2) != 0) {
                str2 = confirmation.subtitle;
            }
            if ((i11 & 4) != 0) {
                str3 = confirmation.submitButtonText;
            }
            if ((i11 & 8) != 0) {
                str4 = confirmation.cancelButtonText;
            }
            return confirmation.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSubmitButtonText() {
            return this.submitButtonText;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getCancelButtonText() {
            return this.cancelButtonText;
        }

        @NotNull
        public final Confirmation copy(@NotNull String title, @NotNull String subtitle, @NotNull String submitButtonText, @NotNull String cancelButtonText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(submitButtonText, "submitButtonText");
            Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
            return new Confirmation(title, subtitle, submitButtonText, cancelButtonText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) other;
            return Intrinsics.d(this.title, confirmation.title) && Intrinsics.d(this.subtitle, confirmation.subtitle) && Intrinsics.d(this.submitButtonText, confirmation.submitButtonText) && Intrinsics.d(this.cancelButtonText, confirmation.cancelButtonText);
        }

        @NotNull
        public final String getCancelButtonText() {
            return this.cancelButtonText;
        }

        @NotNull
        public final String getSubmitButtonText() {
            return this.submitButtonText;
        }

        @NotNull
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.cancelButtonText.hashCode() + g.a(g.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.submitButtonText);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return C3173b.c(C3660k.d("Confirmation(title=", str, ", subtitle=", str2, ", submitButtonText="), this.submitButtonText, ", cancelButtonText=", this.cancelButtonText, ")");
        }
    }

    public Remove(@NotNull ButtonV3Atom.SmallIconButton button, @NotNull Confirmation confirmation) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        this.button = button;
        this.confirmation = confirmation;
    }

    public static /* synthetic */ Remove copy$default(Remove remove, ButtonV3Atom.SmallIconButton smallIconButton, Confirmation confirmation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallIconButton = remove.button;
        }
        if ((i11 & 2) != 0) {
            confirmation = remove.confirmation;
        }
        return remove.copy(smallIconButton, confirmation);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Confirmation getConfirmation() {
        return this.confirmation;
    }

    @NotNull
    public final Remove copy(@NotNull ButtonV3Atom.SmallIconButton button, @NotNull Confirmation confirmation) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(confirmation, "confirmation");
        return new Remove(button, confirmation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Remove)) {
            return false;
        }
        Remove remove = (Remove) other;
        return Intrinsics.d(this.button, remove.button) && Intrinsics.d(this.confirmation, remove.confirmation);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    @NotNull
    public final Confirmation getConfirmation() {
        return this.confirmation;
    }

    public int hashCode() {
        return this.confirmation.hashCode() + (this.button.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Remove(button=" + this.button + ", confirmation=" + this.confirmation + ")";
    }
}
