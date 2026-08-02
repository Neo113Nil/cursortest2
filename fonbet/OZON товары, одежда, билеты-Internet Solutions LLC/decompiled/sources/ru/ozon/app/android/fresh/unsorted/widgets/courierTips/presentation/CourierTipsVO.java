package ru.ozon.app.android.fresh.unsorted.widgets.courierTips.presentation;

import A00.a;
import Cm.e;
import G.g;
import Ns.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003GHIB{\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u009a\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b2\u0010.R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010 R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010D\u001a\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "subtitle", "", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CourierTipsVariant;", "variants", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CheckboxWithText;", "checkbox", "", "asyncData", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "infoButton", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$SpacersVO;", "spacers", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CheckboxWithText;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$SpacersVO;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CheckboxWithText;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$SpacersVO;)Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSubtitle", "Ljava/util/List;", "getVariants", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CheckboxWithText;", "getCheckbox", "()Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CheckboxWithText;", "Ljava/lang/String;", "getAsyncData", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$SpacersVO;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$SpacersVO;", "CourierTipsVariant", "CheckboxWithText", "SpacersVO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CourierTipsVO implements c, a.J.InterfaceC0007a {
    private final String asyncData;
    private final BadgeDTO badge;
    private final ButtonV3DTO button;
    private final CheckboxWithText checkbox;
    private final long id;
    private final IconButtonV3DTO infoButton;

    @NotNull
    private final SpacersVO spacers;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final t tokenizedEvent;

    @NotNull
    private final List<CourierTipsVariant> variants;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CheckboxWithText;", "", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "checkbox", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class CheckboxWithText {
        public static final int $stable = AtomAction.$stable | CheckBoxDTO.$stable;
        private final AtomAction action;

        @NotNull
        private final CheckBoxDTO checkbox;

        @NotNull
        private final TextDTO text;

        public CheckboxWithText(@NotNull CheckBoxDTO checkbox, @NotNull TextDTO text, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(text, "text");
            this.checkbox = checkbox;
            this.text = text;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckboxWithText)) {
                return false;
            }
            CheckboxWithText checkboxWithText = (CheckboxWithText) other;
            return Intrinsics.d(this.checkbox, checkboxWithText.checkbox) && Intrinsics.d(this.text, checkboxWithText.text) && Intrinsics.d(this.action, checkboxWithText.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final CheckBoxDTO getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = b.a(this.text, this.checkbox.hashCode() * 31, 31);
            AtomAction atomAction = this.action;
            return a11 + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            CheckBoxDTO checkBoxDTO = this.checkbox;
            TextDTO textDTO = this.text;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("CheckboxWithText(checkbox=");
            sb2.append(checkBoxDTO);
            sb2.append(", text=");
            sb2.append(textDTO);
            sb2.append(", action=");
            return B6.b.b(sb2, atomAction, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$CourierTipsVariant;", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "chip", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "getChip", "()Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class CourierTipsVariant {
        public static final int $stable = AtomAction.$stable | ChipDTO.$stable;
        private final AtomAction action;

        @NotNull
        private final ChipDTO chip;

        public CourierTipsVariant(@NotNull ChipDTO chip, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(chip, "chip");
            this.chip = chip;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CourierTipsVariant)) {
                return false;
            }
            CourierTipsVariant courierTipsVariant = (CourierTipsVariant) other;
            return Intrinsics.d(this.chip, courierTipsVariant.chip) && Intrinsics.d(this.action, courierTipsVariant.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final ChipDTO getChip() {
            return this.chip;
        }

        public int hashCode() {
            int hashCode = this.chip.hashCode() * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "CourierTipsVariant(chip=" + this.chip + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/courierTips/presentation/CourierTipsVO$SpacersVO;", "", "", "topPadding", "bottomPadding", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTopPadding", "getBottomPadding", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* data */ class SpacersVO {
        private final int bottomPadding;
        private final int topPadding;

        public SpacersVO(int i11, int i12) {
            this.topPadding = i11;
            this.bottomPadding = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacersVO)) {
                return false;
            }
            SpacersVO spacersVO = (SpacersVO) other;
            return this.topPadding == spacersVO.topPadding && this.bottomPadding == spacersVO.bottomPadding;
        }

        public final int getBottomPadding() {
            return this.bottomPadding;
        }

        public final int getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return Integer.hashCode(this.bottomPadding) + (Integer.hashCode(this.topPadding) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("SpacersVO(topPadding=", this.topPadding, ", bottomPadding=", ")", this.bottomPadding);
        }
    }

    public CourierTipsVO(long j11, TextDTO textDTO, BadgeDTO badgeDTO, TextDTO textDTO2, @NotNull List<CourierTipsVariant> variants, CheckboxWithText checkboxWithText, String str, t tVar, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, @NotNull SpacersVO spacers) {
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.id = j11;
        this.title = textDTO;
        this.badge = badgeDTO;
        this.subtitle = textDTO2;
        this.variants = variants;
        this.checkbox = checkboxWithText;
        this.asyncData = str;
        this.tokenizedEvent = tVar;
        this.button = buttonV3DTO;
        this.infoButton = iconButtonV3DTO;
        this.spacers = spacers;
    }

    public static /* synthetic */ CourierTipsVO copy$default(CourierTipsVO courierTipsVO, long j11, TextDTO textDTO, BadgeDTO badgeDTO, TextDTO textDTO2, List list, CheckboxWithText checkboxWithText, String str, t tVar, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, SpacersVO spacersVO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = courierTipsVO.id;
        }
        return courierTipsVO.copy(j11, (i11 & 2) != 0 ? courierTipsVO.title : textDTO, (i11 & 4) != 0 ? courierTipsVO.badge : badgeDTO, (i11 & 8) != 0 ? courierTipsVO.subtitle : textDTO2, (i11 & 16) != 0 ? courierTipsVO.variants : list, (i11 & 32) != 0 ? courierTipsVO.checkbox : checkboxWithText, (i11 & 64) != 0 ? courierTipsVO.asyncData : str, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? courierTipsVO.tokenizedEvent : tVar, (i11 & 256) != 0 ? courierTipsVO.button : buttonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? courierTipsVO.infoButton : iconButtonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? courierTipsVO.spacers : spacersVO);
    }

    @NotNull
    public final CourierTipsVO copy(long id2, TextDTO title, BadgeDTO badge, TextDTO subtitle, @NotNull List<CourierTipsVariant> variants, CheckboxWithText checkbox, String asyncData, t tokenizedEvent, ButtonV3DTO button, IconButtonV3DTO infoButton, @NotNull SpacersVO spacers) {
        Intrinsics.checkNotNullParameter(variants, "variants");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        return new CourierTipsVO(id2, title, badge, subtitle, variants, checkbox, asyncData, tokenizedEvent, button, infoButton, spacers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourierTipsVO)) {
            return false;
        }
        CourierTipsVO courierTipsVO = (CourierTipsVO) other;
        return this.id == courierTipsVO.id && Intrinsics.d(this.title, courierTipsVO.title) && Intrinsics.d(this.badge, courierTipsVO.badge) && Intrinsics.d(this.subtitle, courierTipsVO.subtitle) && Intrinsics.d(this.variants, courierTipsVO.variants) && Intrinsics.d(this.checkbox, courierTipsVO.checkbox) && Intrinsics.d(this.asyncData, courierTipsVO.asyncData) && Intrinsics.d(this.tokenizedEvent, courierTipsVO.tokenizedEvent) && Intrinsics.d(this.button, courierTipsVO.button) && Intrinsics.d(this.infoButton, courierTipsVO.infoButton) && Intrinsics.d(this.spacers, courierTipsVO.spacers);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final CheckboxWithText getCheckbox() {
        return this.checkbox;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IconButtonV3DTO getInfoButton() {
        return this.infoButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final SpacersVO getSpacers() {
        return this.spacers;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final List<CourierTipsVariant> getVariants() {
        return this.variants;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int b11 = g.b((hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31, 31, this.variants);
        CheckboxWithText checkboxWithText = this.checkbox;
        int hashCode4 = (b11 + (checkboxWithText == null ? 0 : checkboxWithText.hashCode())) * 31;
        String str = this.asyncData;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode7 = (hashCode6 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        return this.spacers.hashCode() + ((hashCode7 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        BadgeDTO badgeDTO = this.badge;
        TextDTO textDTO2 = this.subtitle;
        List<CourierTipsVariant> list = this.variants;
        CheckboxWithText checkboxWithText = this.checkbox;
        String str = this.asyncData;
        t tVar = this.tokenizedEvent;
        ButtonV3DTO buttonV3DTO = this.button;
        IconButtonV3DTO iconButtonV3DTO = this.infoButton;
        SpacersVO spacersVO = this.spacers;
        StringBuilder b11 = TY.a.b("CourierTipsVO(id=", j11, ", title=", textDTO);
        b11.append(", badge=");
        b11.append(badgeDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", variants=");
        b11.append(list);
        b11.append(", checkbox=");
        b11.append(checkboxWithText);
        Bi.a.f(b11, ", asyncData=", str, ", tokenizedEvent=", tVar);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(", infoButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", spacers=");
        b11.append(spacersVO);
        b11.append(")");
        return b11.toString();
    }
}
