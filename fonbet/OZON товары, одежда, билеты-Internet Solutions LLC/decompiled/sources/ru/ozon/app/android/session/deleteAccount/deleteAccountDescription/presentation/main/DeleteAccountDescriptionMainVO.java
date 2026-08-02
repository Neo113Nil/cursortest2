package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main;

import An.C2439a;
import G.g;
import I0.C3173b;
import N3.C3660k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.deprecated.Annotation;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002+,B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "", "id", "Lru/ozon/uni/atoms/data/deprecated/Annotation;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions;", "conditions", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason;", "reason", "Lkotlin/Pair;", "", "dataForSend", "<init>", "(JLru/ozon/uni/atoms/data/deprecated/Annotation;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason;Lkotlin/Pair;)V", "copy", "(JLru/ozon/uni/atoms/data/deprecated/Annotation;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason;Lkotlin/Pair;)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/deprecated/Annotation;", "getRestriction", "()Lru/ozon/uni/atoms/data/deprecated/Annotation;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions;", "getConditions", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason;", "getReason", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason;", "Lkotlin/Pair;", "getDataForSend", "()Lkotlin/Pair;", "Conditions", "Reason", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeleteAccountDescriptionMainVO implements c {

    @NotNull
    private final Conditions conditions;

    @NotNull
    private final Pair<String, String> dataForSend;
    private final long id;
    private final Reason reason;
    private final Annotation restriction;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions$DescriptionsItem;", "descriptions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getDescriptions", "()Ljava/util/List;", "DescriptionsItem", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Conditions {

        @NotNull
        private final List<DescriptionsItem> descriptions;

        @NotNull
        private final String title;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Conditions$DescriptionsItem;", "", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$BulletListElement;", "description", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "button", "<init>", "(Lru/ozon/app/android/atoms/data/list/ListElementAtom$BulletListElement;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$BulletListElement;", "getDescription", "()Lru/ozon/app/android/atoms/data/list/ListElementAtom$BulletListElement;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DescriptionsItem {
            private final ButtonV3Atom.SmallBorderlessButton button;

            @NotNull
            private final ListElementAtom.BulletListElement description;

            public DescriptionsItem(@NotNull ListElementAtom.BulletListElement description, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
                Intrinsics.checkNotNullParameter(description, "description");
                this.description = description;
                this.button = smallBorderlessButton;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DescriptionsItem)) {
                    return false;
                }
                DescriptionsItem descriptionsItem = (DescriptionsItem) other;
                return Intrinsics.d(this.description, descriptionsItem.description) && Intrinsics.d(this.button, descriptionsItem.button);
            }

            public final ButtonV3Atom.SmallBorderlessButton getButton() {
                return this.button;
            }

            @NotNull
            public final ListElementAtom.BulletListElement getDescription() {
                return this.description;
            }

            public int hashCode() {
                int hashCode = this.description.hashCode() * 31;
                ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
                return hashCode + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode());
            }

            @NotNull
            public String toString() {
                return "DescriptionsItem(description=" + this.description + ", button=" + this.button + ")";
            }
        }

        public Conditions(@NotNull String title, @NotNull List<DescriptionsItem> descriptions) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(descriptions, "descriptions");
            this.title = title;
            this.descriptions = descriptions;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Conditions)) {
                return false;
            }
            Conditions conditions = (Conditions) other;
            return Intrinsics.d(this.title, conditions.title) && Intrinsics.d(this.descriptions, conditions.descriptions);
        }

        @NotNull
        public final List<DescriptionsItem> getDescriptions() {
            return this.descriptions;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.descriptions.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2439a.a("Conditions(title=", this.title, ", descriptions=", ")", this.descriptions);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason$Input;", "input", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "submitButton", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason$Input;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "copy", "(Ljava/lang/String;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason$Input;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason$Input;", "getInput", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason$Input;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Input", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Reason {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;

        @NotNull
        private final Input input;

        @NotNull
        private final ButtonV3Atom.LargeButton submitButton;

        @NotNull
        private final String title;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason$Input;", "", "", "hint", "id", "text", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO$Reason$Input;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHint", "getId", "getText", "getError", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Input {

            @NotNull
            private final String error;

            @NotNull
            private final String hint;

            @NotNull
            private final String id;

            @NotNull
            private final String text;

            public Input(@NotNull String hint, @NotNull String id2, @NotNull String text, @NotNull String error) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(error, "error");
                this.hint = hint;
                this.id = id2;
                this.text = text;
                this.error = error;
            }

            public static /* synthetic */ Input copy$default(Input input, String str, String str2, String str3, String str4, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = input.hint;
                }
                if ((i11 & 2) != 0) {
                    str2 = input.id;
                }
                if ((i11 & 4) != 0) {
                    str3 = input.text;
                }
                if ((i11 & 8) != 0) {
                    str4 = input.error;
                }
                return input.copy(str, str2, str3, str4);
            }

            @NotNull
            public final Input copy(@NotNull String hint, @NotNull String id2, @NotNull String text, @NotNull String error) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(error, "error");
                return new Input(hint, id2, text, error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Input)) {
                    return false;
                }
                Input input = (Input) other;
                return Intrinsics.d(this.hint, input.hint) && Intrinsics.d(this.id, input.id) && Intrinsics.d(this.text, input.text) && Intrinsics.d(this.error, input.error);
            }

            @NotNull
            public final String getHint() {
                return this.hint;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.error.hashCode() + g.a(g.a(this.hint.hashCode() * 31, 31, this.id), 31, this.text);
            }

            @NotNull
            public String toString() {
                String str = this.hint;
                String str2 = this.id;
                return C3173b.c(C3660k.d("Input(hint=", str, ", id=", str2, ", text="), this.text, ", error=", this.error, ")");
            }
        }

        public Reason(@NotNull String title, @NotNull Input input, @NotNull ButtonV3Atom.LargeButton submitButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            this.title = title;
            this.input = input;
            this.submitButton = submitButton;
        }

        public static /* synthetic */ Reason copy$default(Reason reason, String str, Input input, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = reason.title;
            }
            if ((i11 & 2) != 0) {
                input = reason.input;
            }
            if ((i11 & 4) != 0) {
                largeButton = reason.submitButton;
            }
            return reason.copy(str, input, largeButton);
        }

        @NotNull
        public final Reason copy(@NotNull String title, @NotNull Input input, @NotNull ButtonV3Atom.LargeButton submitButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            return new Reason(title, input, submitButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reason)) {
                return false;
            }
            Reason reason = (Reason) other;
            return Intrinsics.d(this.title, reason.title) && Intrinsics.d(this.input, reason.input) && Intrinsics.d(this.submitButton, reason.submitButton);
        }

        @NotNull
        public final Input getInput() {
            return this.input;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSubmitButton() {
            return this.submitButton;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.submitButton.hashCode() + ((this.input.hashCode() + (this.title.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Reason(title=" + this.title + ", input=" + this.input + ", submitButton=" + this.submitButton + ")";
        }
    }

    public DeleteAccountDescriptionMainVO(long j11, Annotation annotation, @NotNull Conditions conditions, Reason reason, @NotNull Pair<String, String> dataForSend) {
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(dataForSend, "dataForSend");
        this.id = j11;
        this.restriction = annotation;
        this.conditions = conditions;
        this.reason = reason;
        this.dataForSend = dataForSend;
    }

    public static /* synthetic */ DeleteAccountDescriptionMainVO copy$default(DeleteAccountDescriptionMainVO deleteAccountDescriptionMainVO, long j11, Annotation annotation, Conditions conditions, Reason reason, Pair pair, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = deleteAccountDescriptionMainVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            annotation = deleteAccountDescriptionMainVO.restriction;
        }
        Annotation annotation2 = annotation;
        if ((i11 & 4) != 0) {
            conditions = deleteAccountDescriptionMainVO.conditions;
        }
        Conditions conditions2 = conditions;
        if ((i11 & 8) != 0) {
            reason = deleteAccountDescriptionMainVO.reason;
        }
        Reason reason2 = reason;
        if ((i11 & 16) != 0) {
            pair = deleteAccountDescriptionMainVO.dataForSend;
        }
        return deleteAccountDescriptionMainVO.copy(j12, annotation2, conditions2, reason2, pair);
    }

    @NotNull
    public final DeleteAccountDescriptionMainVO copy(long id2, Annotation restriction, @NotNull Conditions conditions, Reason reason, @NotNull Pair<String, String> dataForSend) {
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(dataForSend, "dataForSend");
        return new DeleteAccountDescriptionMainVO(id2, restriction, conditions, reason, dataForSend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountDescriptionMainVO)) {
            return false;
        }
        DeleteAccountDescriptionMainVO deleteAccountDescriptionMainVO = (DeleteAccountDescriptionMainVO) other;
        return this.id == deleteAccountDescriptionMainVO.id && Intrinsics.d(this.restriction, deleteAccountDescriptionMainVO.restriction) && Intrinsics.d(this.conditions, deleteAccountDescriptionMainVO.conditions) && Intrinsics.d(this.reason, deleteAccountDescriptionMainVO.reason) && Intrinsics.d(this.dataForSend, deleteAccountDescriptionMainVO.dataForSend);
    }

    @NotNull
    public final Conditions getConditions() {
        return this.conditions;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Reason getReason() {
        return this.reason;
    }

    public final Annotation getRestriction() {
        return this.restriction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Annotation annotation = this.restriction;
        int hashCode2 = (this.conditions.hashCode() + ((hashCode + (annotation == null ? 0 : annotation.hashCode())) * 31)) * 31;
        Reason reason = this.reason;
        return this.dataForSend.hashCode() + ((hashCode2 + (reason != null ? reason.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "DeleteAccountDescriptionMainVO(id=" + this.id + ", restriction=" + this.restriction + ", conditions=" + this.conditions + ", reason=" + this.reason + ", dataForSend=" + this.dataForSend + ")";
    }
}
