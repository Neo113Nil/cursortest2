package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.presentation;

import Co.a;
import G.g;
import I0.C3173b;
import N3.C3660k;
import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000234BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "payprops", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$CompanyId;", "companyId", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton;", "actionButton", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "controls", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "bottomControl", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$CompanyId;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPayprops", "getAddress", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$CompanyId;", "getCompanyId", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$CompanyId;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton;", "getActionButton", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton;", "Ljava/util/List;", "getControls", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBottomControl", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "CompanyId", "ActionButton", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LegalsItemVOV2 implements c {
    private final ActionButton actionButton;
    private final TextDTO address;
    private final CellDTO bottomControl;
    private final CompanyId companyId;
    private final List<AtomDTO> controls;
    private final long id;
    private final TextDTO payprops;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "button", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton$Confirmation;", "confirmation", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton$Confirmation;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton$Confirmation;", "getConfirmation", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton$Confirmation;", "Confirmation", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionButton {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO button;
        private final Confirmation confirmation;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$ActionButton$Confirmation;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "submitButtonText", "cancelButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSubmitButtonText", "getCancelButtonText", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Confirmation {

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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/LegalsItemVOV2$CompanyId;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "button", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    public LegalsItemVOV2(long j11, @NotNull TextDTO title, TextDTO textDTO, TextDTO textDTO2, CompanyId companyId, ActionButton actionButton, List<? extends AtomDTO> list, CellDTO cellDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.payprops = textDTO;
        this.address = textDTO2;
        this.companyId = companyId;
        this.actionButton = actionButton;
        this.controls = list;
        this.bottomControl = cellDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalsItemVOV2)) {
            return false;
        }
        LegalsItemVOV2 legalsItemVOV2 = (LegalsItemVOV2) other;
        return this.id == legalsItemVOV2.id && Intrinsics.d(this.title, legalsItemVOV2.title) && Intrinsics.d(this.payprops, legalsItemVOV2.payprops) && Intrinsics.d(this.address, legalsItemVOV2.address) && Intrinsics.d(this.companyId, legalsItemVOV2.companyId) && Intrinsics.d(this.actionButton, legalsItemVOV2.actionButton) && Intrinsics.d(this.controls, legalsItemVOV2.controls) && Intrinsics.d(this.bottomControl, legalsItemVOV2.bottomControl);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TextDTO getPayprops() {
        return this.payprops;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.payprops;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.address;
        int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        CompanyId companyId = this.companyId;
        int hashCode3 = (hashCode2 + (companyId == null ? 0 : companyId.hashCode())) * 31;
        ActionButton actionButton = this.actionButton;
        int hashCode4 = (hashCode3 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        List<AtomDTO> list = this.controls;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        CellDTO cellDTO = this.bottomControl;
        return hashCode5 + (cellDTO != null ? cellDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.payprops;
        TextDTO textDTO3 = this.address;
        CompanyId companyId = this.companyId;
        ActionButton actionButton = this.actionButton;
        List<AtomDTO> list = this.controls;
        CellDTO cellDTO = this.bottomControl;
        StringBuilder b11 = TY.a.b("LegalsItemVOV2(id=", j11, ", title=", textDTO);
        D3.g.i(", payprops=", ", address=", b11, textDTO2, textDTO3);
        b11.append(", companyId=");
        b11.append(companyId);
        b11.append(", actionButton=");
        b11.append(actionButton);
        b11.append(", controls=");
        b11.append(list);
        b11.append(", bottomControl=");
        b11.append(cellDTO);
        b11.append(")");
        return b11.toString();
    }
}
