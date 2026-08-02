package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.data;

import An.C2439a;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.deprecated.Annotation;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;", "", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/atoms/data/deprecated/Annotation;", "conditions", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Conditions;", "reason", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Reason;", "stickyButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/uni/atoms/data/deprecated/Annotation;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Conditions;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Reason;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getRestriction", "()Lru/ozon/uni/atoms/data/deprecated/Annotation;", "getConditions", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Conditions;", "getReason", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Reason;", "getStickyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Conditions", "Reason", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeleteAccountDescriptionDTO {
    public static final int $stable = 8;

    @NotNull
    private final Conditions conditions;
    private final Reason reason;

    @NotNull
    private final Annotation restriction;
    private final ButtonV3Atom.LargeButton stickyButton;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Conditions;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "descriptions", "", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Conditions$DescriptionsItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDescriptions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "DescriptionsItem", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Conditions {
        public static final int $stable = 8;

        @NotNull
        private final List<DescriptionsItem> descriptions;

        @NotNull
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Conditions$DescriptionsItem;", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DescriptionsItem {
            public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable | OzonSpannableString.$stable;
            private final ButtonV3Atom.SmallBorderlessButton button;

            @NotNull
            private final OzonSpannableString text;

            public DescriptionsItem(@NotNull OzonSpannableString text, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.button = smallBorderlessButton;
            }

            public static /* synthetic */ DescriptionsItem copy$default(DescriptionsItem descriptionsItem, OzonSpannableString ozonSpannableString, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = descriptionsItem.text;
                }
                if ((i11 & 2) != 0) {
                    smallBorderlessButton = descriptionsItem.button;
                }
                return descriptionsItem.copy(ozonSpannableString, smallBorderlessButton);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final OzonSpannableString getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final ButtonV3Atom.SmallBorderlessButton getButton() {
                return this.button;
            }

            @NotNull
            public final DescriptionsItem copy(@NotNull OzonSpannableString text, ButtonV3Atom.SmallBorderlessButton button) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new DescriptionsItem(text, button);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DescriptionsItem)) {
                    return false;
                }
                DescriptionsItem descriptionsItem = (DescriptionsItem) other;
                return Intrinsics.d(this.text, descriptionsItem.text) && Intrinsics.d(this.button, descriptionsItem.button);
            }

            public final ButtonV3Atom.SmallBorderlessButton getButton() {
                return this.button;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.button;
                return hashCode + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode());
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.text;
                return "DescriptionsItem(text=" + ((Object) ozonSpannableString) + ", button=" + this.button + ")";
            }
        }

        public Conditions(@NotNull String title, @NotNull List<DescriptionsItem> descriptions) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(descriptions, "descriptions");
            this.title = title;
            this.descriptions = descriptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Conditions copy$default(Conditions conditions, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = conditions.title;
            }
            if ((i11 & 2) != 0) {
                list = conditions.descriptions;
            }
            return conditions.copy(str, list);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final List<DescriptionsItem> component2() {
            return this.descriptions;
        }

        @NotNull
        public final Conditions copy(@NotNull String title, @NotNull List<DescriptionsItem> descriptions) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(descriptions, "descriptions");
            return new Conditions(title, descriptions);
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

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Reason;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "input", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Reason$Input;", "submitButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Reason$Input;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getTitle", "()Ljava/lang/String;", "getInput", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Reason$Input;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Input", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Reason {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;

        @NotNull
        private final Input input;

        @NotNull
        private final ButtonV3Atom.LargeButton submitButton;

        @NotNull
        private final String title;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO$Reason$Input;", "", "hint", "", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHint", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Input {
            public static final int $stable = 0;

            @NotNull
            private final String hint;

            @NotNull
            private final String id;

            public Input(@NotNull String hint, @NotNull String id2) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(id2, "id");
                this.hint = hint;
                this.id = id2;
            }

            public static /* synthetic */ Input copy$default(Input input, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = input.hint;
                }
                if ((i11 & 2) != 0) {
                    str2 = input.id;
                }
                return input.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getHint() {
                return this.hint;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final Input copy(@NotNull String hint, @NotNull String id2) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                Intrinsics.checkNotNullParameter(id2, "id");
                return new Input(hint, id2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Input)) {
                    return false;
                }
                Input input = (Input) other;
                return Intrinsics.d(this.hint, input.hint) && Intrinsics.d(this.id, input.id);
            }

            @NotNull
            public final String getHint() {
                return this.hint;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                return this.id.hashCode() + (this.hint.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Input(hint=", this.hint, ", id=", this.id, ")");
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
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Input getInput() {
            return this.input;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final ButtonV3Atom.LargeButton getSubmitButton() {
            return this.submitButton;
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

    public DeleteAccountDescriptionDTO(@NotNull Annotation restriction, @NotNull Conditions conditions, Reason reason, ButtonV3Atom.LargeButton largeButton) {
        Intrinsics.checkNotNullParameter(restriction, "restriction");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        this.restriction = restriction;
        this.conditions = conditions;
        this.reason = reason;
        this.stickyButton = largeButton;
    }

    public static /* synthetic */ DeleteAccountDescriptionDTO copy$default(DeleteAccountDescriptionDTO deleteAccountDescriptionDTO, Annotation annotation, Conditions conditions, Reason reason, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            annotation = deleteAccountDescriptionDTO.restriction;
        }
        if ((i11 & 2) != 0) {
            conditions = deleteAccountDescriptionDTO.conditions;
        }
        if ((i11 & 4) != 0) {
            reason = deleteAccountDescriptionDTO.reason;
        }
        if ((i11 & 8) != 0) {
            largeButton = deleteAccountDescriptionDTO.stickyButton;
        }
        return deleteAccountDescriptionDTO.copy(annotation, conditions, reason, largeButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Annotation getRestriction() {
        return this.restriction;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Conditions getConditions() {
        return this.conditions;
    }

    /* renamed from: component3, reason: from getter */
    public final Reason getReason() {
        return this.reason;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeButton getStickyButton() {
        return this.stickyButton;
    }

    @NotNull
    public final DeleteAccountDescriptionDTO copy(@NotNull Annotation restriction, @NotNull Conditions conditions, Reason reason, ButtonV3Atom.LargeButton stickyButton) {
        Intrinsics.checkNotNullParameter(restriction, "restriction");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        return new DeleteAccountDescriptionDTO(restriction, conditions, reason, stickyButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteAccountDescriptionDTO)) {
            return false;
        }
        DeleteAccountDescriptionDTO deleteAccountDescriptionDTO = (DeleteAccountDescriptionDTO) other;
        return Intrinsics.d(this.restriction, deleteAccountDescriptionDTO.restriction) && Intrinsics.d(this.conditions, deleteAccountDescriptionDTO.conditions) && Intrinsics.d(this.reason, deleteAccountDescriptionDTO.reason) && Intrinsics.d(this.stickyButton, deleteAccountDescriptionDTO.stickyButton);
    }

    @NotNull
    public final Conditions getConditions() {
        return this.conditions;
    }

    public final Reason getReason() {
        return this.reason;
    }

    @NotNull
    public final Annotation getRestriction() {
        return this.restriction;
    }

    public final ButtonV3Atom.LargeButton getStickyButton() {
        return this.stickyButton;
    }

    public int hashCode() {
        int hashCode = (this.conditions.hashCode() + (this.restriction.hashCode() * 31)) * 31;
        Reason reason = this.reason;
        int hashCode2 = (hashCode + (reason == null ? 0 : reason.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.stickyButton;
        return hashCode2 + (largeButton != null ? largeButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeleteAccountDescriptionDTO(restriction=" + this.restriction + ", conditions=" + this.conditions + ", reason=" + this.reason + ", stickyButton=" + this.stickyButton + ")";
    }
}
