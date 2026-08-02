package ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.data;

import B90.C2619v;
import Co.a;
import G.g;
import Kk.C3532b;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004 !\"#B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "cases", "", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Case;", "closeButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "selectedTintColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCases", "()Ljava/util/List;", "getCloseButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSelectedTintColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Case", "Tab", "Step", "Warning", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HelpInsuranceDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Case> cases;

    @NotNull
    private final ButtonV3Atom.LargeButton closeButton;

    @NotNull
    private final String selectedTintColor;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Case;", "", "tab", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Tab;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "instructions", "", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Step;", "warning", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Warning;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Tab;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Warning;)V", "getTab", "()Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Tab;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getInstructions", "()Ljava/util/List;", "getWarning", "()Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Warning;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Case {
        public static final int $stable = 8;

        @NotNull
        private final List<Step> instructions;
        private final TextAtom subtitle;

        @NotNull
        private final Tab tab;

        @NotNull
        private final TextAtom title;
        private final Warning warning;

        public Case(@NotNull Tab tab, @NotNull TextAtom title, TextAtom textAtom, @NotNull List<Step> instructions, Warning warning) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            this.tab = tab;
            this.title = title;
            this.subtitle = textAtom;
            this.instructions = instructions;
            this.warning = warning;
        }

        public static /* synthetic */ Case copy$default(Case r02, Tab tab, TextAtom textAtom, TextAtom textAtom2, List list, Warning warning, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                tab = r02.tab;
            }
            if ((i11 & 2) != 0) {
                textAtom = r02.title;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = r02.subtitle;
            }
            if ((i11 & 8) != 0) {
                list = r02.instructions;
            }
            if ((i11 & 16) != 0) {
                warning = r02.warning;
            }
            Warning warning2 = warning;
            TextAtom textAtom3 = textAtom2;
            return r02.copy(tab, textAtom, textAtom3, list, warning2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Tab getTab() {
            return this.tab;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final List<Step> component4() {
            return this.instructions;
        }

        /* renamed from: component5, reason: from getter */
        public final Warning getWarning() {
            return this.warning;
        }

        @NotNull
        public final Case copy(@NotNull Tab tab, @NotNull TextAtom title, TextAtom subtitle, @NotNull List<Step> instructions, Warning warning) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            return new Case(tab, title, subtitle, instructions, warning);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Case)) {
                return false;
            }
            Case r52 = (Case) other;
            return Intrinsics.d(this.tab, r52.tab) && Intrinsics.d(this.title, r52.title) && Intrinsics.d(this.subtitle, r52.subtitle) && Intrinsics.d(this.instructions, r52.instructions) && Intrinsics.d(this.warning, r52.warning);
        }

        @NotNull
        public final List<Step> getInstructions() {
            return this.instructions;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final Tab getTab() {
            return this.tab;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Warning getWarning() {
            return this.warning;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.tab.hashCode() * 31, 31, this.title);
            TextAtom textAtom = this.subtitle;
            int b12 = g.b((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.instructions);
            Warning warning = this.warning;
            return b12 + (warning != null ? warning.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Case(tab=" + this.tab + ", title=" + this.title + ", subtitle=" + this.subtitle + ", instructions=" + this.instructions + ", warning=" + this.warning + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Step;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "description", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Step {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final TextAtom description;

        @NotNull
        private final TextAtom title;

        public Step(@NotNull TextAtom title, @NotNull TextAtom description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            this.title = title;
            this.description = description;
        }

        public static /* synthetic */ Step copy$default(Step step, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = step.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = step.description;
            }
            return step.copy(textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final Step copy(@NotNull TextAtom title, @NotNull TextAtom description) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Step(title, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Step)) {
                return false;
            }
            Step step = (Step) other;
            return Intrinsics.d(this.title, step.title) && Intrinsics.d(this.description, step.description);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a.a("Step(title=", this.title, ", description=", this.description, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Tab;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "isSelected", "", "tabIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/uni/atoms/data/button/Icon;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "()Z", "getTabIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab {
        public static final int $stable = Icon.$stable | TextAtom.$stable;
        private final boolean isSelected;
        private final Icon tabIcon;

        @NotNull
        private final TextAtom title;

        public Tab(@NotNull TextAtom title, boolean z11, Icon icon) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.isSelected = z11;
            this.tabIcon = icon;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, TextAtom textAtom, boolean z11, Icon icon, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = tab.title;
            }
            if ((i11 & 2) != 0) {
                z11 = tab.isSelected;
            }
            if ((i11 & 4) != 0) {
                icon = tab.tabIcon;
            }
            return tab.copy(textAtom, z11, icon);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component3, reason: from getter */
        public final Icon getTabIcon() {
            return this.tabIcon;
        }

        @NotNull
        public final Tab copy(@NotNull TextAtom title, boolean isSelected, Icon tabIcon) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Tab(title, isSelected, tabIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return Intrinsics.d(this.title, tab.title) && this.isSelected == tab.isSelected && Intrinsics.d(this.tabIcon, tab.tabIcon);
        }

        public final Icon getTabIcon() {
            return this.tabIcon;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.title.hashCode() * 31, 31, this.isSelected);
            Icon icon = this.tabIcon;
            return a11 + (icon == null ? 0 : icon.hashCode());
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "Tab(title=" + this.title + ", isSelected=" + this.isSelected + ", tabIcon=" + this.tabIcon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/data/HelpInsuranceDTO$Warning;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Warning {
        public static final int $stable = TextAtom.$stable | Icon.$stable;

        @NotNull
        private final Icon icon;

        @NotNull
        private final TextAtom title;

        public Warning(@NotNull Icon icon, @NotNull TextAtom title) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.icon = icon;
            this.title = title;
        }

        public static /* synthetic */ Warning copy$default(Warning warning, Icon icon, TextAtom textAtom, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = warning.icon;
            }
            if ((i11 & 2) != 0) {
                textAtom = warning.title;
            }
            return warning.copy(icon, textAtom);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        public final Warning copy(@NotNull Icon icon, @NotNull TextAtom title) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Warning(icon, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Warning)) {
                return false;
            }
            Warning warning = (Warning) other;
            return Intrinsics.d(this.icon, warning.icon) && Intrinsics.d(this.title, warning.title);
        }

        @NotNull
        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode() + (this.icon.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Warning(icon=" + this.icon + ", title=" + this.title + ")";
        }
    }

    public HelpInsuranceDTO(@NotNull TextAtom title, @NotNull List<Case> cases, @NotNull ButtonV3Atom.LargeButton closeButton, @NotNull String selectedTintColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cases, "cases");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(selectedTintColor, "selectedTintColor");
        this.title = title;
        this.cases = cases;
        this.closeButton = closeButton;
        this.selectedTintColor = selectedTintColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HelpInsuranceDTO copy$default(HelpInsuranceDTO helpInsuranceDTO, TextAtom textAtom, List list, ButtonV3Atom.LargeButton largeButton, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = helpInsuranceDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = helpInsuranceDTO.cases;
        }
        if ((i11 & 4) != 0) {
            largeButton = helpInsuranceDTO.closeButton;
        }
        if ((i11 & 8) != 0) {
            str = helpInsuranceDTO.selectedTintColor;
        }
        return helpInsuranceDTO.copy(textAtom, list, largeButton, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Case> component2() {
        return this.cases;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.LargeButton getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSelectedTintColor() {
        return this.selectedTintColor;
    }

    @NotNull
    public final HelpInsuranceDTO copy(@NotNull TextAtom title, @NotNull List<Case> cases, @NotNull ButtonV3Atom.LargeButton closeButton, @NotNull String selectedTintColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cases, "cases");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(selectedTintColor, "selectedTintColor");
        return new HelpInsuranceDTO(title, cases, closeButton, selectedTintColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpInsuranceDTO)) {
            return false;
        }
        HelpInsuranceDTO helpInsuranceDTO = (HelpInsuranceDTO) other;
        return Intrinsics.d(this.title, helpInsuranceDTO.title) && Intrinsics.d(this.cases, helpInsuranceDTO.cases) && Intrinsics.d(this.closeButton, helpInsuranceDTO.closeButton) && Intrinsics.d(this.selectedTintColor, helpInsuranceDTO.selectedTintColor);
    }

    @NotNull
    public final List<Case> getCases() {
        return this.cases;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    public final String getSelectedTintColor() {
        return this.selectedTintColor;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.selectedTintColor.hashCode() + b.a(this.closeButton, g.b(this.title.hashCode() * 31, 31, this.cases), 31);
    }

    @NotNull
    public String toString() {
        return "HelpInsuranceDTO(title=" + this.title + ", cases=" + this.cases + ", closeButton=" + this.closeButton + ", selectedTintColor=" + this.selectedTintColor + ")";
    }
}
