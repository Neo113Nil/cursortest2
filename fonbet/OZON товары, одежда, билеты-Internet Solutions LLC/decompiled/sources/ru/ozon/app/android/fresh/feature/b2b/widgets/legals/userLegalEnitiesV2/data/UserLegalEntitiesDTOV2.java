package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.data;

import Co.a;
import G.g;
import H3.c;
import I0.C3173b;
import N3.C3660k;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2;", "", "legals", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2;", "<init>", "(Ljava/util/List;)V", "getLegals", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LegalsItemV2", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserLegalEntitiesDTOV2 {
    public static final int $stable = 8;

    @NotNull
    private final List<LegalsItemV2> legals;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "payprops", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "companyId", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$CompanyId;", "actionButton", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$ActionButton;", "controls", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "bottomControl", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$CompanyId;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$ActionButton;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPayprops", "getAddress", "getCompanyId", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$CompanyId;", "getActionButton", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$ActionButton;", "getControls", "()Ljava/util/List;", "getBottomControl", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CompanyId", "ActionButton", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class LegalsItemV2 {
        public static final int $stable = 8;
        private final ActionButton actionButton;
        private final TextDTO address;
        private final CellDTO bottomControl;
        private final CompanyId companyId;
        private final List<AtomDTO> controls;
        private final TextDTO payprops;

        @NotNull
        private final TextDTO title;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$ActionButton;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "confirmation", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$ActionButton$Confirmation;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$ActionButton$Confirmation;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getConfirmation", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$ActionButton$Confirmation;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Confirmation", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class ActionButton {
            public static final int $stable = IconButtonV3DTO.$stable;

            @NotNull
            private final IconButtonV3DTO button;
            private final Confirmation confirmation;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$ActionButton$Confirmation;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "submitButtonText", "cancelButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getSubmitButtonText", "getCancelButtonText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            public ActionButton(@NotNull IconButtonV3DTO button, Confirmation confirmation) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
                this.confirmation = confirmation;
            }

            public static /* synthetic */ ActionButton copy$default(ActionButton actionButton, IconButtonV3DTO iconButtonV3DTO, Confirmation confirmation, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconButtonV3DTO = actionButton.button;
                }
                if ((i11 & 2) != 0) {
                    confirmation = actionButton.confirmation;
                }
                return actionButton.copy(iconButtonV3DTO, confirmation);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IconButtonV3DTO getButton() {
                return this.button;
            }

            /* renamed from: component2, reason: from getter */
            public final Confirmation getConfirmation() {
                return this.confirmation;
            }

            @NotNull
            public final ActionButton copy(@NotNull IconButtonV3DTO button, Confirmation confirmation) {
                Intrinsics.checkNotNullParameter(button, "button");
                return new ActionButton(button, confirmation);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) other;
                return Intrinsics.d(this.button, actionButton.button) && Intrinsics.d(this.confirmation, actionButton.confirmation);
            }

            @NotNull
            public final IconButtonV3DTO getButton() {
                return this.button;
            }

            public final Confirmation getConfirmation() {
                return this.confirmation;
            }

            public int hashCode() {
                int hashCode = this.button.hashCode() * 31;
                Confirmation confirmation = this.confirmation;
                return hashCode + (confirmation == null ? 0 : confirmation.hashCode());
            }

            @NotNull
            public String toString() {
                return "ActionButton(button=" + this.button + ", confirmation=" + this.confirmation + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/data/UserLegalEntitiesDTOV2$LegalsItemV2$CompanyId;", "", "id", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getId", "()Ljava/lang/String;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CompanyId {
            public static final int $stable = IconButtonV3DTO.$stable;

            @NotNull
            private final IconButtonV3DTO button;

            @NotNull
            private final String id;

            @NotNull
            private final TextDTO text;

            public CompanyId(@NotNull String id2, @NotNull TextDTO text, @NotNull IconButtonV3DTO button) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(button, "button");
                this.id = id2;
                this.text = text;
                this.button = button;
            }

            public static /* synthetic */ CompanyId copy$default(CompanyId companyId, String str, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = companyId.id;
                }
                if ((i11 & 2) != 0) {
                    textDTO = companyId.text;
                }
                if ((i11 & 4) != 0) {
                    iconButtonV3DTO = companyId.button;
                }
                return companyId.copy(str, textDTO, iconButtonV3DTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final IconButtonV3DTO getButton() {
                return this.button;
            }

            @NotNull
            public final CompanyId copy(@NotNull String id2, @NotNull TextDTO text, @NotNull IconButtonV3DTO button) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(button, "button");
                return new CompanyId(id2, text, button);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CompanyId)) {
                    return false;
                }
                CompanyId companyId = (CompanyId) other;
                return Intrinsics.d(this.id, companyId.id) && Intrinsics.d(this.text, companyId.text) && Intrinsics.d(this.button, companyId.button);
            }

            @NotNull
            public final IconButtonV3DTO getButton() {
                return this.button;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.button.hashCode() + b.a(this.text, this.id.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                String str = this.id;
                TextDTO textDTO = this.text;
                IconButtonV3DTO iconButtonV3DTO = this.button;
                StringBuilder b11 = a.b("CompanyId(id=", textDTO, str, ", text=", ", button=");
                b11.append(iconButtonV3DTO);
                b11.append(")");
                return b11.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LegalsItemV2(@NotNull TextDTO title, TextDTO textDTO, TextDTO textDTO2, CompanyId companyId, ActionButton actionButton, List<? extends AtomDTO> list, CellDTO cellDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.payprops = textDTO;
            this.address = textDTO2;
            this.companyId = companyId;
            this.actionButton = actionButton;
            this.controls = list;
            this.bottomControl = cellDTO;
        }

        public static /* synthetic */ LegalsItemV2 copy$default(LegalsItemV2 legalsItemV2, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, CompanyId companyId, ActionButton actionButton, List list, CellDTO cellDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = legalsItemV2.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = legalsItemV2.payprops;
            }
            if ((i11 & 4) != 0) {
                textDTO3 = legalsItemV2.address;
            }
            if ((i11 & 8) != 0) {
                companyId = legalsItemV2.companyId;
            }
            if ((i11 & 16) != 0) {
                actionButton = legalsItemV2.actionButton;
            }
            if ((i11 & 32) != 0) {
                list = legalsItemV2.controls;
            }
            if ((i11 & 64) != 0) {
                cellDTO = legalsItemV2.bottomControl;
            }
            List list2 = list;
            CellDTO cellDTO2 = cellDTO;
            ActionButton actionButton2 = actionButton;
            TextDTO textDTO4 = textDTO3;
            return legalsItemV2.copy(textDTO, textDTO2, textDTO4, companyId, actionButton2, list2, cellDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getPayprops() {
            return this.payprops;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getAddress() {
            return this.address;
        }

        /* renamed from: component4, reason: from getter */
        public final CompanyId getCompanyId() {
            return this.companyId;
        }

        /* renamed from: component5, reason: from getter */
        public final ActionButton getActionButton() {
            return this.actionButton;
        }

        public final List<AtomDTO> component6() {
            return this.controls;
        }

        /* renamed from: component7, reason: from getter */
        public final CellDTO getBottomControl() {
            return this.bottomControl;
        }

        @NotNull
        public final LegalsItemV2 copy(@NotNull TextDTO title, TextDTO payprops, TextDTO address, CompanyId companyId, ActionButton actionButton, List<? extends AtomDTO> controls, CellDTO bottomControl) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new LegalsItemV2(title, payprops, address, companyId, actionButton, controls, bottomControl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LegalsItemV2)) {
                return false;
            }
            LegalsItemV2 legalsItemV2 = (LegalsItemV2) other;
            return Intrinsics.d(this.title, legalsItemV2.title) && Intrinsics.d(this.payprops, legalsItemV2.payprops) && Intrinsics.d(this.address, legalsItemV2.address) && Intrinsics.d(this.companyId, legalsItemV2.companyId) && Intrinsics.d(this.actionButton, legalsItemV2.actionButton) && Intrinsics.d(this.controls, legalsItemV2.controls) && Intrinsics.d(this.bottomControl, legalsItemV2.bottomControl);
        }

        public final ActionButton getActionButton() {
            return this.actionButton;
        }

        public final TextDTO getAddress() {
            return this.address;
        }

        public final CellDTO getBottomControl() {
            return this.bottomControl;
        }

        public final CompanyId getCompanyId() {
            return this.companyId;
        }

        public final List<AtomDTO> getControls() {
            return this.controls;
        }

        public final TextDTO getPayprops() {
            return this.payprops;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.payprops;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.address;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            CompanyId companyId = this.companyId;
            int hashCode4 = (hashCode3 + (companyId == null ? 0 : companyId.hashCode())) * 31;
            ActionButton actionButton = this.actionButton;
            int hashCode5 = (hashCode4 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
            List<AtomDTO> list = this.controls;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            CellDTO cellDTO = this.bottomControl;
            return hashCode6 + (cellDTO != null ? cellDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.payprops;
            TextDTO textDTO3 = this.address;
            CompanyId companyId = this.companyId;
            ActionButton actionButton = this.actionButton;
            List<AtomDTO> list = this.controls;
            CellDTO cellDTO = this.bottomControl;
            StringBuilder g10 = D3.g.g("LegalsItemV2(title=", textDTO, ", payprops=", textDTO2, ", address=");
            g10.append(textDTO3);
            g10.append(", companyId=");
            g10.append(companyId);
            g10.append(", actionButton=");
            g10.append(actionButton);
            g10.append(", controls=");
            g10.append(list);
            g10.append(", bottomControl=");
            g10.append(cellDTO);
            g10.append(")");
            return g10.toString();
        }
    }

    public UserLegalEntitiesDTOV2(@NotNull List<LegalsItemV2> legals) {
        Intrinsics.checkNotNullParameter(legals, "legals");
        this.legals = legals;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserLegalEntitiesDTOV2 copy$default(UserLegalEntitiesDTOV2 userLegalEntitiesDTOV2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = userLegalEntitiesDTOV2.legals;
        }
        return userLegalEntitiesDTOV2.copy(list);
    }

    @NotNull
    public final List<LegalsItemV2> component1() {
        return this.legals;
    }

    @NotNull
    public final UserLegalEntitiesDTOV2 copy(@NotNull List<LegalsItemV2> legals) {
        Intrinsics.checkNotNullParameter(legals, "legals");
        return new UserLegalEntitiesDTOV2(legals);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserLegalEntitiesDTOV2) && Intrinsics.d(this.legals, ((UserLegalEntitiesDTOV2) other).legals);
    }

    @NotNull
    public final List<LegalsItemV2> getLegals() {
        return this.legals;
    }

    public int hashCode() {
        return this.legals.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("UserLegalEntitiesDTOV2(legals=", ")", this.legals);
    }
}
