package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data;

import C.o0;
import G.g;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002/0BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ja\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO;", "", "link", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "companyName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "companyOptions", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", Scopes.EMAIL, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;)V", "getLink", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "getCompanyName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCompanyOptions", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getEmail", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "CompanyCardOption", "CompanyCardParsedDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CompanyCardDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final ButtonDTO button;
    private final TextDTO companyName;

    @NotNull
    private final List<CompanyCardOption> companyOptions;
    private final CellDTO email;
    private final UncontainedButtonDTO link;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption;", "", "Disclosure", "Cell", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption$Cell;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption$Disclosure;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CompanyCardOption {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption$Cell;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption;", "atom", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getAtom", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Cell implements CompanyCardOption {
            public static final int $stable = CellDTO.$stable;

            @NotNull
            private final CellDTO atom;

            public Cell(@NotNull CellDTO atom) {
                Intrinsics.checkNotNullParameter(atom, "atom");
                this.atom = atom;
            }

            public static /* synthetic */ Cell copy$default(Cell cell, CellDTO cellDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    cellDTO = cell.atom;
                }
                return cell.copy(cellDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final CellDTO getAtom() {
                return this.atom;
            }

            @NotNull
            public final Cell copy(@NotNull CellDTO atom) {
                Intrinsics.checkNotNullParameter(atom, "atom");
                return new Cell(atom);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cell) && Intrinsics.d(this.atom, ((Cell) other).atom);
            }

            @NotNull
            public final CellDTO getAtom() {
                return this.atom;
            }

            public int hashCode() {
                return this.atom.hashCode();
            }

            @NotNull
            public String toString() {
                return "Cell(atom=" + this.atom + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption$Disclosure;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption;", "atom", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "<init>", "(Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;)V", "getAtom", "()Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Disclosure implements CompanyCardOption {
            public static final int $stable = DisclosureTitleSubtitleCellDTO.$stable;

            @NotNull
            private final DisclosureTitleSubtitleCellDTO atom;

            public Disclosure(@NotNull DisclosureTitleSubtitleCellDTO atom) {
                Intrinsics.checkNotNullParameter(atom, "atom");
                this.atom = atom;
            }

            public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, DisclosureTitleSubtitleCellDTO disclosureTitleSubtitleCellDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    disclosureTitleSubtitleCellDTO = disclosure.atom;
                }
                return disclosure.copy(disclosureTitleSubtitleCellDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final DisclosureTitleSubtitleCellDTO getAtom() {
                return this.atom;
            }

            @NotNull
            public final Disclosure copy(@NotNull DisclosureTitleSubtitleCellDTO atom) {
                Intrinsics.checkNotNullParameter(atom, "atom");
                return new Disclosure(atom);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Disclosure) && Intrinsics.d(this.atom, ((Disclosure) other).atom);
            }

            @NotNull
            public final DisclosureTitleSubtitleCellDTO getAtom() {
                return this.atom;
            }

            public int hashCode() {
                return this.atom.hashCode();
            }

            @NotNull
            public String toString() {
                return "Disclosure(atom=" + this.atom + ")";
            }
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010#\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003Jq\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R'\u0010\u0006\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardParsedDTO;", "", "link", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "companyName", "Lru/ozon/uni/atoms/data/text/TextDTO;", "companyOptions", "", "", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", Scopes.EMAIL, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;)V", "getLink", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "getCompanyName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCompanyOptions", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getEmail", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CompanyCardParsedDTO {
        public static final int $stable = 8;
        private final String backgroundColor;
        private final BadgeDTO badge;
        private final ButtonDTO button;
        private final TextDTO companyName;
        private final List<Map<String, Object>> companyOptions;
        private final CellDTO email;
        private final UncontainedButtonDTO link;

        /* JADX WARN: Multi-variable type inference failed */
        public CompanyCardParsedDTO(UncontainedButtonDTO uncontainedButtonDTO, TextDTO textDTO, List<? extends Map<String, ? extends Object>> list, ButtonDTO buttonDTO, BadgeDTO badgeDTO, CellDTO cellDTO, String str) {
            this.link = uncontainedButtonDTO;
            this.companyName = textDTO;
            this.companyOptions = list;
            this.button = buttonDTO;
            this.badge = badgeDTO;
            this.email = cellDTO;
            this.backgroundColor = str;
        }

        public static /* synthetic */ CompanyCardParsedDTO copy$default(CompanyCardParsedDTO companyCardParsedDTO, UncontainedButtonDTO uncontainedButtonDTO, TextDTO textDTO, List list, ButtonDTO buttonDTO, BadgeDTO badgeDTO, CellDTO cellDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uncontainedButtonDTO = companyCardParsedDTO.link;
            }
            if ((i11 & 2) != 0) {
                textDTO = companyCardParsedDTO.companyName;
            }
            if ((i11 & 4) != 0) {
                list = companyCardParsedDTO.companyOptions;
            }
            if ((i11 & 8) != 0) {
                buttonDTO = companyCardParsedDTO.button;
            }
            if ((i11 & 16) != 0) {
                badgeDTO = companyCardParsedDTO.badge;
            }
            if ((i11 & 32) != 0) {
                cellDTO = companyCardParsedDTO.email;
            }
            if ((i11 & 64) != 0) {
                str = companyCardParsedDTO.backgroundColor;
            }
            CellDTO cellDTO2 = cellDTO;
            String str2 = str;
            BadgeDTO badgeDTO2 = badgeDTO;
            List list2 = list;
            return companyCardParsedDTO.copy(uncontainedButtonDTO, textDTO, list2, buttonDTO, badgeDTO2, cellDTO2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UncontainedButtonDTO getLink() {
            return this.link;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getCompanyName() {
            return this.companyName;
        }

        public final List<Map<String, Object>> component3() {
            return this.companyOptions;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonDTO getButton() {
            return this.button;
        }

        /* renamed from: component5, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component6, reason: from getter */
        public final CellDTO getEmail() {
            return this.email;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CompanyCardParsedDTO copy(UncontainedButtonDTO link, TextDTO companyName, List<? extends Map<String, ? extends Object>> companyOptions, ButtonDTO button, BadgeDTO badge, CellDTO email, String backgroundColor) {
            return new CompanyCardParsedDTO(link, companyName, companyOptions, button, badge, email, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompanyCardParsedDTO)) {
                return false;
            }
            CompanyCardParsedDTO companyCardParsedDTO = (CompanyCardParsedDTO) other;
            return Intrinsics.d(this.link, companyCardParsedDTO.link) && Intrinsics.d(this.companyName, companyCardParsedDTO.companyName) && Intrinsics.d(this.companyOptions, companyCardParsedDTO.companyOptions) && Intrinsics.d(this.button, companyCardParsedDTO.button) && Intrinsics.d(this.badge, companyCardParsedDTO.badge) && Intrinsics.d(this.email, companyCardParsedDTO.email) && Intrinsics.d(this.backgroundColor, companyCardParsedDTO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final ButtonDTO getButton() {
            return this.button;
        }

        public final TextDTO getCompanyName() {
            return this.companyName;
        }

        public final List<Map<String, Object>> getCompanyOptions() {
            return this.companyOptions;
        }

        public final CellDTO getEmail() {
            return this.email;
        }

        public final UncontainedButtonDTO getLink() {
            return this.link;
        }

        public int hashCode() {
            UncontainedButtonDTO uncontainedButtonDTO = this.link;
            int hashCode = (uncontainedButtonDTO == null ? 0 : uncontainedButtonDTO.hashCode()) * 31;
            TextDTO textDTO = this.companyName;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            List<Map<String, Object>> list = this.companyOptions;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            ButtonDTO buttonDTO = this.button;
            int hashCode4 = (hashCode3 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode5 = (hashCode4 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            CellDTO cellDTO = this.email;
            int hashCode6 = (hashCode5 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode6 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            UncontainedButtonDTO uncontainedButtonDTO = this.link;
            TextDTO textDTO = this.companyName;
            List<Map<String, Object>> list = this.companyOptions;
            ButtonDTO buttonDTO = this.button;
            BadgeDTO badgeDTO = this.badge;
            CellDTO cellDTO = this.email;
            String str = this.backgroundColor;
            StringBuilder sb2 = new StringBuilder("CompanyCardParsedDTO(link=");
            sb2.append(uncontainedButtonDTO);
            sb2.append(", companyName=");
            sb2.append(textDTO);
            sb2.append(", companyOptions=");
            sb2.append(list);
            sb2.append(", button=");
            sb2.append(buttonDTO);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", email=");
            sb2.append(cellDTO);
            sb2.append(", backgroundColor=");
            return o0.c(sb2, str, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompanyCardDTO(UncontainedButtonDTO uncontainedButtonDTO, TextDTO textDTO, @NotNull List<? extends CompanyCardOption> companyOptions, ButtonDTO buttonDTO, BadgeDTO badgeDTO, CellDTO cellDTO, String str) {
        Intrinsics.checkNotNullParameter(companyOptions, "companyOptions");
        this.link = uncontainedButtonDTO;
        this.companyName = textDTO;
        this.companyOptions = companyOptions;
        this.button = buttonDTO;
        this.badge = badgeDTO;
        this.email = cellDTO;
        this.backgroundColor = str;
    }

    public static /* synthetic */ CompanyCardDTO copy$default(CompanyCardDTO companyCardDTO, UncontainedButtonDTO uncontainedButtonDTO, TextDTO textDTO, List list, ButtonDTO buttonDTO, BadgeDTO badgeDTO, CellDTO cellDTO, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            uncontainedButtonDTO = companyCardDTO.link;
        }
        if ((i11 & 2) != 0) {
            textDTO = companyCardDTO.companyName;
        }
        if ((i11 & 4) != 0) {
            list = companyCardDTO.companyOptions;
        }
        if ((i11 & 8) != 0) {
            buttonDTO = companyCardDTO.button;
        }
        if ((i11 & 16) != 0) {
            badgeDTO = companyCardDTO.badge;
        }
        if ((i11 & 32) != 0) {
            cellDTO = companyCardDTO.email;
        }
        if ((i11 & 64) != 0) {
            str = companyCardDTO.backgroundColor;
        }
        CellDTO cellDTO2 = cellDTO;
        String str2 = str;
        BadgeDTO badgeDTO2 = badgeDTO;
        List list2 = list;
        return companyCardDTO.copy(uncontainedButtonDTO, textDTO, list2, buttonDTO, badgeDTO2, cellDTO2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final UncontainedButtonDTO getLink() {
        return this.link;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getCompanyName() {
        return this.companyName;
    }

    @NotNull
    public final List<CompanyCardOption> component3() {
        return this.companyOptions;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonDTO getButton() {
        return this.button;
    }

    /* renamed from: component5, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component6, reason: from getter */
    public final CellDTO getEmail() {
        return this.email;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CompanyCardDTO copy(UncontainedButtonDTO link, TextDTO companyName, @NotNull List<? extends CompanyCardOption> companyOptions, ButtonDTO button, BadgeDTO badge, CellDTO email, String backgroundColor) {
        Intrinsics.checkNotNullParameter(companyOptions, "companyOptions");
        return new CompanyCardDTO(link, companyName, companyOptions, button, badge, email, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyCardDTO)) {
            return false;
        }
        CompanyCardDTO companyCardDTO = (CompanyCardDTO) other;
        return Intrinsics.d(this.link, companyCardDTO.link) && Intrinsics.d(this.companyName, companyCardDTO.companyName) && Intrinsics.d(this.companyOptions, companyCardDTO.companyOptions) && Intrinsics.d(this.button, companyCardDTO.button) && Intrinsics.d(this.badge, companyCardDTO.badge) && Intrinsics.d(this.email, companyCardDTO.email) && Intrinsics.d(this.backgroundColor, companyCardDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final ButtonDTO getButton() {
        return this.button;
    }

    public final TextDTO getCompanyName() {
        return this.companyName;
    }

    @NotNull
    public final List<CompanyCardOption> getCompanyOptions() {
        return this.companyOptions;
    }

    public final CellDTO getEmail() {
        return this.email;
    }

    public final UncontainedButtonDTO getLink() {
        return this.link;
    }

    public int hashCode() {
        UncontainedButtonDTO uncontainedButtonDTO = this.link;
        int hashCode = (uncontainedButtonDTO == null ? 0 : uncontainedButtonDTO.hashCode()) * 31;
        TextDTO textDTO = this.companyName;
        int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.companyOptions);
        ButtonDTO buttonDTO = this.button;
        int hashCode2 = (b11 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        CellDTO cellDTO = this.email;
        int hashCode4 = (hashCode3 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        UncontainedButtonDTO uncontainedButtonDTO = this.link;
        TextDTO textDTO = this.companyName;
        List<CompanyCardOption> list = this.companyOptions;
        ButtonDTO buttonDTO = this.button;
        BadgeDTO badgeDTO = this.badge;
        CellDTO cellDTO = this.email;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("CompanyCardDTO(link=");
        sb2.append(uncontainedButtonDTO);
        sb2.append(", companyName=");
        sb2.append(textDTO);
        sb2.append(", companyOptions=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(buttonDTO);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", email=");
        sb2.append(cellDTO);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }
}
