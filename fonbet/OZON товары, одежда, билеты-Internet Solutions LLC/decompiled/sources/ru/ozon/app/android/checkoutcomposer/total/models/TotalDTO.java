package ru.ozon.app.android.checkoutcomposer.total.models;

import C.o0;
import G.g;
import H3.c;
import HY.a;
import T7.P;
import Tl.b;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.stickyTotal.data.StickyTotalDTO;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.deprecated.Button;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004+,-.B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJR\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO;", "", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;", "interactiveActions", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$InteractiveActions;", "additionalInfo", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$AdditionalInfo;", "sticky", "Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;", "progressBar", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;", "showVerticalSeparator", "", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$InteractiveActions;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$AdditionalInfo;Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;Ljava/lang/Boolean;)V", "getSummary", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;", "getInteractiveActions", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$InteractiveActions;", "getAdditionalInfo", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$AdditionalInfo;", "getSticky", "()Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;", "getProgressBar", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;", "getShowVerticalSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$InteractiveActions;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$AdditionalInfo;Lru/ozon/app/android/checkoutcomposer/stickyTotal/data/StickyTotalDTO;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;Ljava/lang/Boolean;)Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO;", "equals", "other", "hashCode", "", "toString", "", "Summary", "InteractiveActions", "AdditionalInfo", "ProgressBar", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalDTO {
    public static final int $stable = 8;

    @NotNull
    private final AdditionalInfo additionalInfo;

    @NotNull
    private final InteractiveActions interactiveActions;
    private final ProgressBar progressBar;
    private final Boolean showVerticalSeparator;
    private final StickyTotalDTO sticky;
    private final Summary summary;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$AdditionalInfo;", "", "hints", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "<init>", "(Ljava/util/List;)V", "getHints", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo {
        public static final int $stable = 8;
        private final List<AtomDTO> hints;

        /* JADX WARN: Multi-variable type inference failed */
        public AdditionalInfo(List<? extends AtomDTO> list) {
            this.hints = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AdditionalInfo copy$default(AdditionalInfo additionalInfo, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = additionalInfo.hints;
            }
            return additionalInfo.copy(list);
        }

        public final List<AtomDTO> component1() {
            return this.hints;
        }

        @NotNull
        public final AdditionalInfo copy(List<? extends AtomDTO> hints) {
            return new AdditionalInfo(hints);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdditionalInfo) && Intrinsics.d(this.hints, ((AdditionalInfo) other).hints);
        }

        public final List<AtomDTO> getHints() {
            return this.hints;
        }

        public int hashCode() {
            List<AtomDTO> list = this.hints;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("AdditionalInfo(hints=", ")", this.hints);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$InteractiveActions;", "", "button", "Lru/ozon/uni/atoms/data/deprecated/Button;", "hints", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttonColor", "", "totalButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonTextColor", "<init>", "(Lru/ozon/uni/atoms/data/deprecated/Button;Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;)V", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "getHints", "()Ljava/util/List;", "getButtonColor", "()Ljava/lang/String;", "getTotalButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButtonTextColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InteractiveActions {
        public static final int $stable = 8;
        private final Button button;
        private final String buttonColor;
        private final String buttonTextColor;
        private final List<AtomDTO> hints;
        private final ButtonV3DTO totalButton;

        /* JADX WARN: Multi-variable type inference failed */
        public InteractiveActions(Button button, List<? extends AtomDTO> list, String str, ButtonV3DTO buttonV3DTO, String str2) {
            this.button = button;
            this.hints = list;
            this.buttonColor = str;
            this.totalButton = buttonV3DTO;
            this.buttonTextColor = str2;
        }

        public static /* synthetic */ InteractiveActions copy$default(InteractiveActions interactiveActions, Button button, List list, String str, ButtonV3DTO buttonV3DTO, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                button = interactiveActions.button;
            }
            if ((i11 & 2) != 0) {
                list = interactiveActions.hints;
            }
            if ((i11 & 4) != 0) {
                str = interactiveActions.buttonColor;
            }
            if ((i11 & 8) != 0) {
                buttonV3DTO = interactiveActions.totalButton;
            }
            if ((i11 & 16) != 0) {
                str2 = interactiveActions.buttonTextColor;
            }
            String str3 = str2;
            String str4 = str;
            return interactiveActions.copy(button, list, str4, buttonV3DTO, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        public final List<AtomDTO> component2() {
            return this.hints;
        }

        /* renamed from: component3, reason: from getter */
        public final String getButtonColor() {
            return this.buttonColor;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3DTO getTotalButton() {
            return this.totalButton;
        }

        /* renamed from: component5, reason: from getter */
        public final String getButtonTextColor() {
            return this.buttonTextColor;
        }

        @NotNull
        public final InteractiveActions copy(Button button, List<? extends AtomDTO> hints, String buttonColor, ButtonV3DTO totalButton, String buttonTextColor) {
            return new InteractiveActions(button, hints, buttonColor, totalButton, buttonTextColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InteractiveActions)) {
                return false;
            }
            InteractiveActions interactiveActions = (InteractiveActions) other;
            return Intrinsics.d(this.button, interactiveActions.button) && Intrinsics.d(this.hints, interactiveActions.hints) && Intrinsics.d(this.buttonColor, interactiveActions.buttonColor) && Intrinsics.d(this.totalButton, interactiveActions.totalButton) && Intrinsics.d(this.buttonTextColor, interactiveActions.buttonTextColor);
        }

        public final Button getButton() {
            return this.button;
        }

        public final String getButtonColor() {
            return this.buttonColor;
        }

        public final String getButtonTextColor() {
            return this.buttonTextColor;
        }

        public final List<AtomDTO> getHints() {
            return this.hints;
        }

        public final ButtonV3DTO getTotalButton() {
            return this.totalButton;
        }

        public int hashCode() {
            Button button = this.button;
            int hashCode = (button == null ? 0 : button.hashCode()) * 31;
            List<AtomDTO> list = this.hints;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.buttonColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.totalButton;
            int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            String str2 = this.buttonTextColor;
            return hashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Button button = this.button;
            List<AtomDTO> list = this.hints;
            String str = this.buttonColor;
            ButtonV3DTO buttonV3DTO = this.totalButton;
            String str2 = this.buttonTextColor;
            StringBuilder sb2 = new StringBuilder("InteractiveActions(button=");
            sb2.append(button);
            sb2.append(", hints=");
            sb2.append(list);
            sb2.append(", buttonColor=");
            sb2.append(str);
            sb2.append(", totalButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", buttonTextColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;", "", "duration", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getDuration", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBar {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final String duration;
        private final TextAtom title;

        public ProgressBar(@NotNull String duration, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.duration = duration;
            this.title = textAtom;
        }

        public static /* synthetic */ ProgressBar copy$default(ProgressBar progressBar, String str, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = progressBar.duration;
            }
            if ((i11 & 2) != 0) {
                textAtom = progressBar.title;
            }
            return progressBar.copy(str, textAtom);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDuration() {
            return this.duration;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final ProgressBar copy(@NotNull String duration, TextAtom title) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            return new ProgressBar(duration, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBar)) {
                return false;
            }
            ProgressBar progressBar = (ProgressBar) other;
            return Intrinsics.d(this.duration, progressBar.duration) && Intrinsics.d(this.title, progressBar.title);
        }

        @NotNull
        public final String getDuration() {
            return this.duration;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.duration.hashCode() * 31;
            TextAtom textAtom = this.title;
            return hashCode + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            return "ProgressBar(duration=" + this.duration + ", title=" + this.title + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004 !\"#B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Header;", "prices", "", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Footer;", "footerPrices", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Header;Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Footer;Ljava/util/List;)V", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Header;", "getPrices", "()Ljava/util/List;", "getFooter", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Footer;", "getFooterPrices", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Header", "Price", "FooterPrice", "Footer", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Summary {
        public static final int $stable = 8;

        @NotNull
        private final Footer footer;
        private final List<FooterPrice> footerPrices;

        @NotNull
        private final Header header;

        @NotNull
        private final List<Price> prices;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Footer;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "price", "priceColor", "", "partnerBanksMolecule", "Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "getPrice", "getPriceColor", "()Ljava/lang/String;", "getPartnerBanksMolecule", "()Lru/ozon/app/android/partnerBanks/data/PartnerBanksDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Footer {
            public static final int $stable;
            private final PartnerBanksDTO partnerBanksMolecule;

            @NotNull
            private final OzonSpannableString price;
            private final String priceColor;
            private final OzonSpannableString subtitle;

            @NotNull
            private final OzonSpannableString title;

            static {
                int i11 = PartnerBanksDTO.$stable;
                int i12 = OzonSpannableString.$stable;
                $stable = i11 | i12 | i12 | i12;
            }

            public Footer(@NotNull OzonSpannableString title, OzonSpannableString ozonSpannableString, @NotNull OzonSpannableString price, String str, PartnerBanksDTO partnerBanksDTO) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(price, "price");
                this.title = title;
                this.subtitle = ozonSpannableString;
                this.price = price;
                this.priceColor = str;
                this.partnerBanksMolecule = partnerBanksDTO;
            }

            public static /* synthetic */ Footer copy$default(Footer footer, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, OzonSpannableString ozonSpannableString3, String str, PartnerBanksDTO partnerBanksDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    ozonSpannableString = footer.title;
                }
                if ((i11 & 2) != 0) {
                    ozonSpannableString2 = footer.subtitle;
                }
                if ((i11 & 4) != 0) {
                    ozonSpannableString3 = footer.price;
                }
                if ((i11 & 8) != 0) {
                    str = footer.priceColor;
                }
                if ((i11 & 16) != 0) {
                    partnerBanksDTO = footer.partnerBanksMolecule;
                }
                PartnerBanksDTO partnerBanksDTO2 = partnerBanksDTO;
                OzonSpannableString ozonSpannableString4 = ozonSpannableString3;
                return footer.copy(ozonSpannableString, ozonSpannableString2, ozonSpannableString4, str, partnerBanksDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final OzonSpannableString getPrice() {
                return this.price;
            }

            /* renamed from: component4, reason: from getter */
            public final String getPriceColor() {
                return this.priceColor;
            }

            /* renamed from: component5, reason: from getter */
            public final PartnerBanksDTO getPartnerBanksMolecule() {
                return this.partnerBanksMolecule;
            }

            @NotNull
            public final Footer copy(@NotNull OzonSpannableString title, OzonSpannableString subtitle, @NotNull OzonSpannableString price, String priceColor, PartnerBanksDTO partnerBanksMolecule) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(price, "price");
                return new Footer(title, subtitle, price, priceColor, partnerBanksMolecule);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Footer)) {
                    return false;
                }
                Footer footer = (Footer) other;
                return Intrinsics.d(this.title, footer.title) && Intrinsics.d(this.subtitle, footer.subtitle) && Intrinsics.d(this.price, footer.price) && Intrinsics.d(this.priceColor, footer.priceColor) && Intrinsics.d(this.partnerBanksMolecule, footer.partnerBanksMolecule);
            }

            public final PartnerBanksDTO getPartnerBanksMolecule() {
                return this.partnerBanksMolecule;
            }

            @NotNull
            public final OzonSpannableString getPrice() {
                return this.price;
            }

            public final String getPriceColor() {
                return this.priceColor;
            }

            public final OzonSpannableString getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                OzonSpannableString ozonSpannableString = this.subtitle;
                int c11 = P.c(this.price, (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31);
                String str = this.priceColor;
                int hashCode2 = (c11 + (str == null ? 0 : str.hashCode())) * 31;
                PartnerBanksDTO partnerBanksDTO = this.partnerBanksMolecule;
                return hashCode2 + (partnerBanksDTO != null ? partnerBanksDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                OzonSpannableString ozonSpannableString = this.title;
                OzonSpannableString ozonSpannableString2 = this.subtitle;
                OzonSpannableString ozonSpannableString3 = this.price;
                String str = this.priceColor;
                PartnerBanksDTO partnerBanksDTO = this.partnerBanksMolecule;
                StringBuilder sb2 = new StringBuilder("Footer(title=");
                sb2.append((Object) ozonSpannableString);
                sb2.append(", subtitle=");
                sb2.append((Object) ozonSpannableString2);
                sb2.append(", price=");
                a.c(", priceColor=", str, ", partnerBanksMolecule=", sb2, ozonSpannableString3);
                sb2.append(partnerBanksDTO);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice;", "", "left", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice$LeftBlock;", "right", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice$RightBlock;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice$LeftBlock;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice$RightBlock;)V", "getLeft", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice$LeftBlock;", "getRight", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice$RightBlock;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LeftBlock", "RightBlock", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class FooterPrice {
            public static final int $stable;

            @NotNull
            private final LeftBlock left;

            @NotNull
            private final RightBlock right;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice$LeftBlock;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", DynamicElementDTO.SMALL_BORDERLESS_BUTTON, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getSmallBorderlessButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class LeftBlock {
                public static final int $stable;
                private final ButtonV3Atom.SmallBorderlessButton smallBorderlessButton;
                private final TextAtom subtitle;

                @NotNull
                private final TextAtom title;

                static {
                    int i11 = ButtonV3Atom.SmallBorderlessButton.$stable;
                    int i12 = TextAtom.$stable;
                    $stable = i11 | i12 | i12;
                }

                public LeftBlock(@NotNull TextAtom title, TextAtom textAtom, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.title = title;
                    this.subtitle = textAtom;
                    this.smallBorderlessButton = smallBorderlessButton;
                }

                public static /* synthetic */ LeftBlock copy$default(LeftBlock leftBlock, TextAtom textAtom, TextAtom textAtom2, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textAtom = leftBlock.title;
                    }
                    if ((i11 & 2) != 0) {
                        textAtom2 = leftBlock.subtitle;
                    }
                    if ((i11 & 4) != 0) {
                        smallBorderlessButton = leftBlock.smallBorderlessButton;
                    }
                    return leftBlock.copy(textAtom, textAtom2, smallBorderlessButton);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextAtom getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final TextAtom getSubtitle() {
                    return this.subtitle;
                }

                /* renamed from: component3, reason: from getter */
                public final ButtonV3Atom.SmallBorderlessButton getSmallBorderlessButton() {
                    return this.smallBorderlessButton;
                }

                @NotNull
                public final LeftBlock copy(@NotNull TextAtom title, TextAtom subtitle, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new LeftBlock(title, subtitle, smallBorderlessButton);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LeftBlock)) {
                        return false;
                    }
                    LeftBlock leftBlock = (LeftBlock) other;
                    return Intrinsics.d(this.title, leftBlock.title) && Intrinsics.d(this.subtitle, leftBlock.subtitle) && Intrinsics.d(this.smallBorderlessButton, leftBlock.smallBorderlessButton);
                }

                public final ButtonV3Atom.SmallBorderlessButton getSmallBorderlessButton() {
                    return this.smallBorderlessButton;
                }

                public final TextAtom getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextAtom getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    TextAtom textAtom = this.subtitle;
                    int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                    ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.smallBorderlessButton;
                    return hashCode2 + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    TextAtom textAtom = this.title;
                    TextAtom textAtom2 = this.subtitle;
                    ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.smallBorderlessButton;
                    StringBuilder a11 = a.a("LeftBlock(title=", textAtom, ", subtitle=", textAtom2, ", smallBorderlessButton=");
                    a11.append(smallBorderlessButton);
                    a11.append(")");
                    return a11.toString();
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$FooterPrice$RightBlock;", "", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getPrice", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class RightBlock {
                public static final int $stable = TextAtom.$stable;

                @NotNull
                private final TextAtom price;

                public RightBlock(@NotNull TextAtom price) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    this.price = price;
                }

                public static /* synthetic */ RightBlock copy$default(RightBlock rightBlock, TextAtom textAtom, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textAtom = rightBlock.price;
                    }
                    return rightBlock.copy(textAtom);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextAtom getPrice() {
                    return this.price;
                }

                @NotNull
                public final RightBlock copy(@NotNull TextAtom price) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    return new RightBlock(price);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof RightBlock) && Intrinsics.d(this.price, ((RightBlock) other).price);
                }

                @NotNull
                public final TextAtom getPrice() {
                    return this.price;
                }

                public int hashCode() {
                    return this.price.hashCode();
                }

                @NotNull
                public String toString() {
                    return "RightBlock(price=" + this.price + ")";
                }
            }

            static {
                int i11 = TextAtom.$stable;
                $stable = i11 | ButtonV3Atom.SmallBorderlessButton.$stable | i11 | i11;
            }

            public FooterPrice(@NotNull LeftBlock left, @NotNull RightBlock right) {
                Intrinsics.checkNotNullParameter(left, "left");
                Intrinsics.checkNotNullParameter(right, "right");
                this.left = left;
                this.right = right;
            }

            public static /* synthetic */ FooterPrice copy$default(FooterPrice footerPrice, LeftBlock leftBlock, RightBlock rightBlock, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    leftBlock = footerPrice.left;
                }
                if ((i11 & 2) != 0) {
                    rightBlock = footerPrice.right;
                }
                return footerPrice.copy(leftBlock, rightBlock);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final LeftBlock getLeft() {
                return this.left;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final RightBlock getRight() {
                return this.right;
            }

            @NotNull
            public final FooterPrice copy(@NotNull LeftBlock left, @NotNull RightBlock right) {
                Intrinsics.checkNotNullParameter(left, "left");
                Intrinsics.checkNotNullParameter(right, "right");
                return new FooterPrice(left, right);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FooterPrice)) {
                    return false;
                }
                FooterPrice footerPrice = (FooterPrice) other;
                return Intrinsics.d(this.left, footerPrice.left) && Intrinsics.d(this.right, footerPrice.right);
            }

            @NotNull
            public final LeftBlock getLeft() {
                return this.left;
            }

            @NotNull
            public final RightBlock getRight() {
                return this.right;
            }

            public int hashCode() {
                return this.right.hashCode() + (this.left.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "FooterPrice(left=" + this.left + ", right=" + this.right + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getInfo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Header {
            public static final int $stable = 0;
            private final String info;

            @NotNull
            private final String title;

            public Header(@NotNull String title, String str) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
                this.info = str;
            }

            public static /* synthetic */ Header copy$default(Header header, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = header.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = header.info;
                }
                return header.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final String getInfo() {
                return this.info;
            }

            @NotNull
            public final Header copy(@NotNull String title, String info) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new Header(title, info);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Header)) {
                    return false;
                }
                Header header = (Header) other;
                return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.info, header.info);
            }

            public final String getInfo() {
                return this.info;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.info;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return e.a("Header(title=", this.title, ", info=", this.info, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price;", "", "left", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$LeftBlock;", "right", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$RightBlock;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$LeftBlock;Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$RightBlock;)V", "getLeft", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$LeftBlock;", "getRight", "()Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$RightBlock;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LeftBlock", "RightBlock", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Price {
            public static final int $stable;

            @NotNull
            private final LeftBlock left;

            @NotNull
            private final RightBlock right;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$LeftBlock;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "image", "", "button", "Lru/ozon/uni/atoms/data/deprecated/Button;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Lru/ozon/uni/atoms/data/deprecated/Button;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "getImage", "()Ljava/lang/String;", "getButton", "()Lru/ozon/uni/atoms/data/deprecated/Button;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class LeftBlock {
                public static final int $stable;
                private final Button button;
                private final String image;
                private final OzonSpannableString subtitle;

                @NotNull
                private final OzonSpannableString title;

                static {
                    int i11 = Button.$stable;
                    int i12 = OzonSpannableString.$stable;
                    $stable = i11 | i12 | i12;
                }

                public LeftBlock(@NotNull OzonSpannableString title, OzonSpannableString ozonSpannableString, String str, Button button) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.title = title;
                    this.subtitle = ozonSpannableString;
                    this.image = str;
                    this.button = button;
                }

                public static /* synthetic */ LeftBlock copy$default(LeftBlock leftBlock, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, String str, Button button, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        ozonSpannableString = leftBlock.title;
                    }
                    if ((i11 & 2) != 0) {
                        ozonSpannableString2 = leftBlock.subtitle;
                    }
                    if ((i11 & 4) != 0) {
                        str = leftBlock.image;
                    }
                    if ((i11 & 8) != 0) {
                        button = leftBlock.button;
                    }
                    return leftBlock.copy(ozonSpannableString, ozonSpannableString2, str, button);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final OzonSpannableString getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final OzonSpannableString getSubtitle() {
                    return this.subtitle;
                }

                /* renamed from: component3, reason: from getter */
                public final String getImage() {
                    return this.image;
                }

                /* renamed from: component4, reason: from getter */
                public final Button getButton() {
                    return this.button;
                }

                @NotNull
                public final LeftBlock copy(@NotNull OzonSpannableString title, OzonSpannableString subtitle, String image, Button button) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new LeftBlock(title, subtitle, image, button);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LeftBlock)) {
                        return false;
                    }
                    LeftBlock leftBlock = (LeftBlock) other;
                    return Intrinsics.d(this.title, leftBlock.title) && Intrinsics.d(this.subtitle, leftBlock.subtitle) && Intrinsics.d(this.image, leftBlock.image) && Intrinsics.d(this.button, leftBlock.button);
                }

                public final Button getButton() {
                    return this.button;
                }

                public final String getImage() {
                    return this.image;
                }

                public final OzonSpannableString getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final OzonSpannableString getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    OzonSpannableString ozonSpannableString = this.subtitle;
                    int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
                    String str = this.image;
                    int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    Button button = this.button;
                    return hashCode3 + (button != null ? button.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    OzonSpannableString ozonSpannableString = this.title;
                    OzonSpannableString ozonSpannableString2 = this.subtitle;
                    return "LeftBlock(title=" + ((Object) ozonSpannableString) + ", subtitle=" + ((Object) ozonSpannableString2) + ", image=" + this.image + ", button=" + this.button + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary$Price$RightBlock;", "", "originalPrice", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "price", "subtitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getOriginalPrice", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getPrice", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class RightBlock {
                public static final int $stable = OzonSpannableString.$stable;
                private final OzonSpannableString originalPrice;

                @NotNull
                private final OzonSpannableString price;
                private final TextDTO subtitle;

                public RightBlock(OzonSpannableString ozonSpannableString, @NotNull OzonSpannableString price, TextDTO textDTO) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    this.originalPrice = ozonSpannableString;
                    this.price = price;
                    this.subtitle = textDTO;
                }

                public static /* synthetic */ RightBlock copy$default(RightBlock rightBlock, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, TextDTO textDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        ozonSpannableString = rightBlock.originalPrice;
                    }
                    if ((i11 & 2) != 0) {
                        ozonSpannableString2 = rightBlock.price;
                    }
                    if ((i11 & 4) != 0) {
                        textDTO = rightBlock.subtitle;
                    }
                    return rightBlock.copy(ozonSpannableString, ozonSpannableString2, textDTO);
                }

                /* renamed from: component1, reason: from getter */
                public final OzonSpannableString getOriginalPrice() {
                    return this.originalPrice;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final OzonSpannableString getPrice() {
                    return this.price;
                }

                /* renamed from: component3, reason: from getter */
                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final RightBlock copy(OzonSpannableString originalPrice, @NotNull OzonSpannableString price, TextDTO subtitle) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    return new RightBlock(originalPrice, price, subtitle);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof RightBlock)) {
                        return false;
                    }
                    RightBlock rightBlock = (RightBlock) other;
                    return Intrinsics.d(this.originalPrice, rightBlock.originalPrice) && Intrinsics.d(this.price, rightBlock.price) && Intrinsics.d(this.subtitle, rightBlock.subtitle);
                }

                public final OzonSpannableString getOriginalPrice() {
                    return this.originalPrice;
                }

                @NotNull
                public final OzonSpannableString getPrice() {
                    return this.price;
                }

                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                public int hashCode() {
                    OzonSpannableString ozonSpannableString = this.originalPrice;
                    int c11 = P.c(this.price, (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31, 31);
                    TextDTO textDTO = this.subtitle;
                    return c11 + (textDTO != null ? textDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    OzonSpannableString ozonSpannableString = this.originalPrice;
                    OzonSpannableString ozonSpannableString2 = this.price;
                    TextDTO textDTO = this.subtitle;
                    StringBuilder sb2 = new StringBuilder("RightBlock(originalPrice=");
                    sb2.append((Object) ozonSpannableString);
                    sb2.append(", price=");
                    sb2.append((Object) ozonSpannableString2);
                    sb2.append(", subtitle=");
                    return b.e(sb2, textDTO, ")");
                }
            }

            static {
                int i11 = OzonSpannableString.$stable;
                $stable = i11 | Button.$stable | i11 | i11;
            }

            public Price(@NotNull LeftBlock left, @NotNull RightBlock right) {
                Intrinsics.checkNotNullParameter(left, "left");
                Intrinsics.checkNotNullParameter(right, "right");
                this.left = left;
                this.right = right;
            }

            public static /* synthetic */ Price copy$default(Price price, LeftBlock leftBlock, RightBlock rightBlock, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    leftBlock = price.left;
                }
                if ((i11 & 2) != 0) {
                    rightBlock = price.right;
                }
                return price.copy(leftBlock, rightBlock);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final LeftBlock getLeft() {
                return this.left;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final RightBlock getRight() {
                return this.right;
            }

            @NotNull
            public final Price copy(@NotNull LeftBlock left, @NotNull RightBlock right) {
                Intrinsics.checkNotNullParameter(left, "left");
                Intrinsics.checkNotNullParameter(right, "right");
                return new Price(left, right);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Price)) {
                    return false;
                }
                Price price = (Price) other;
                return Intrinsics.d(this.left, price.left) && Intrinsics.d(this.right, price.right);
            }

            @NotNull
            public final LeftBlock getLeft() {
                return this.left;
            }

            @NotNull
            public final RightBlock getRight() {
                return this.right;
            }

            public int hashCode() {
                return this.right.hashCode() + (this.left.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Price(left=" + this.left + ", right=" + this.right + ")";
            }
        }

        public Summary(@NotNull Header header, @NotNull List<Price> prices, @NotNull Footer footer, List<FooterPrice> list) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(prices, "prices");
            Intrinsics.checkNotNullParameter(footer, "footer");
            this.header = header;
            this.prices = prices;
            this.footer = footer;
            this.footerPrices = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Summary copy$default(Summary summary, Header header, List list, Footer footer, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                header = summary.header;
            }
            if ((i11 & 2) != 0) {
                list = summary.prices;
            }
            if ((i11 & 4) != 0) {
                footer = summary.footer;
            }
            if ((i11 & 8) != 0) {
                list2 = summary.footerPrices;
            }
            return summary.copy(header, list, footer, list2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        @NotNull
        public final List<Price> component2() {
            return this.prices;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Footer getFooter() {
            return this.footer;
        }

        public final List<FooterPrice> component4() {
            return this.footerPrices;
        }

        @NotNull
        public final Summary copy(@NotNull Header header, @NotNull List<Price> prices, @NotNull Footer footer, List<FooterPrice> footerPrices) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(prices, "prices");
            Intrinsics.checkNotNullParameter(footer, "footer");
            return new Summary(header, prices, footer, footerPrices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) other;
            return Intrinsics.d(this.header, summary.header) && Intrinsics.d(this.prices, summary.prices) && Intrinsics.d(this.footer, summary.footer) && Intrinsics.d(this.footerPrices, summary.footerPrices);
        }

        @NotNull
        public final Footer getFooter() {
            return this.footer;
        }

        public final List<FooterPrice> getFooterPrices() {
            return this.footerPrices;
        }

        @NotNull
        public final Header getHeader() {
            return this.header;
        }

        @NotNull
        public final List<Price> getPrices() {
            return this.prices;
        }

        public int hashCode() {
            int hashCode = (this.footer.hashCode() + g.b(this.header.hashCode() * 31, 31, this.prices)) * 31;
            List<FooterPrice> list = this.footerPrices;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "Summary(header=" + this.header + ", prices=" + this.prices + ", footer=" + this.footer + ", footerPrices=" + this.footerPrices + ")";
        }
    }

    public TotalDTO(Summary summary, @NotNull InteractiveActions interactiveActions, @NotNull AdditionalInfo additionalInfo, StickyTotalDTO stickyTotalDTO, ProgressBar progressBar, Boolean bool) {
        Intrinsics.checkNotNullParameter(interactiveActions, "interactiveActions");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.summary = summary;
        this.interactiveActions = interactiveActions;
        this.additionalInfo = additionalInfo;
        this.sticky = stickyTotalDTO;
        this.progressBar = progressBar;
        this.showVerticalSeparator = bool;
    }

    public static /* synthetic */ TotalDTO copy$default(TotalDTO totalDTO, Summary summary, InteractiveActions interactiveActions, AdditionalInfo additionalInfo, StickyTotalDTO stickyTotalDTO, ProgressBar progressBar, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            summary = totalDTO.summary;
        }
        if ((i11 & 2) != 0) {
            interactiveActions = totalDTO.interactiveActions;
        }
        if ((i11 & 4) != 0) {
            additionalInfo = totalDTO.additionalInfo;
        }
        if ((i11 & 8) != 0) {
            stickyTotalDTO = totalDTO.sticky;
        }
        if ((i11 & 16) != 0) {
            progressBar = totalDTO.progressBar;
        }
        if ((i11 & 32) != 0) {
            bool = totalDTO.showVerticalSeparator;
        }
        ProgressBar progressBar2 = progressBar;
        Boolean bool2 = bool;
        return totalDTO.copy(summary, interactiveActions, additionalInfo, stickyTotalDTO, progressBar2, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final Summary getSummary() {
        return this.summary;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final InteractiveActions getInteractiveActions() {
        return this.interactiveActions;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final StickyTotalDTO getSticky() {
        return this.sticky;
    }

    /* renamed from: component5, reason: from getter */
    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getShowVerticalSeparator() {
        return this.showVerticalSeparator;
    }

    @NotNull
    public final TotalDTO copy(Summary summary, @NotNull InteractiveActions interactiveActions, @NotNull AdditionalInfo additionalInfo, StickyTotalDTO sticky, ProgressBar progressBar, Boolean showVerticalSeparator) {
        Intrinsics.checkNotNullParameter(interactiveActions, "interactiveActions");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return new TotalDTO(summary, interactiveActions, additionalInfo, sticky, progressBar, showVerticalSeparator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalDTO)) {
            return false;
        }
        TotalDTO totalDTO = (TotalDTO) other;
        return Intrinsics.d(this.summary, totalDTO.summary) && Intrinsics.d(this.interactiveActions, totalDTO.interactiveActions) && Intrinsics.d(this.additionalInfo, totalDTO.additionalInfo) && Intrinsics.d(this.sticky, totalDTO.sticky) && Intrinsics.d(this.progressBar, totalDTO.progressBar) && Intrinsics.d(this.showVerticalSeparator, totalDTO.showVerticalSeparator);
    }

    @NotNull
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @NotNull
    public final InteractiveActions getInteractiveActions() {
        return this.interactiveActions;
    }

    public final ProgressBar getProgressBar() {
        return this.progressBar;
    }

    public final Boolean getShowVerticalSeparator() {
        return this.showVerticalSeparator;
    }

    public final StickyTotalDTO getSticky() {
        return this.sticky;
    }

    public final Summary getSummary() {
        return this.summary;
    }

    public int hashCode() {
        Summary summary = this.summary;
        int hashCode = (this.additionalInfo.hashCode() + ((this.interactiveActions.hashCode() + ((summary == null ? 0 : summary.hashCode()) * 31)) * 31)) * 31;
        StickyTotalDTO stickyTotalDTO = this.sticky;
        int hashCode2 = (hashCode + (stickyTotalDTO == null ? 0 : stickyTotalDTO.hashCode())) * 31;
        ProgressBar progressBar = this.progressBar;
        int hashCode3 = (hashCode2 + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        Boolean bool = this.showVerticalSeparator;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TotalDTO(summary=" + this.summary + ", interactiveActions=" + this.interactiveActions + ", additionalInfo=" + this.additionalInfo + ", sticky=" + this.sticky + ", progressBar=" + this.progressBar + ", showVerticalSeparator=" + this.showVerticalSeparator + ")";
    }
}
