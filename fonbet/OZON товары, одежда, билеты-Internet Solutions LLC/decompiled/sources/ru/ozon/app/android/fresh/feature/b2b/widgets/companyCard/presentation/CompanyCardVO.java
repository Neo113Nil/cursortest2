package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation;

import G.g;
import com.google.android.gms.common.Scopes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.cell.DisclosureTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00017BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u0010\u0017¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "link", "Lru/ozon/uni/atoms/data/text/TextDTO;", "companyName", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO$CompanyCardOptionVO;", "companyOptions", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "button", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", Scopes.EMAIL, "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "getLink", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCompanyName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getCompanyOptions", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getEmail", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/lang/String;", "getBackgroundColor", "CompanyCardOptionVO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CompanyCardVO implements c {
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final ButtonDTO button;
    private final TextDTO companyName;

    @NotNull
    private final List<CompanyCardOptionVO> companyOptions;
    private final CellDTO email;
    private final long id;
    private final UncontainedButtonDTO link;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO$CompanyCardOptionVO;", "", "Disclosure", "Cell", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO$CompanyCardOptionVO$Cell;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO$CompanyCardOptionVO$Disclosure;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CompanyCardOptionVO {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO$CompanyCardOptionVO$Cell;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO$CompanyCardOptionVO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Cell implements CompanyCardOptionVO {
            public static final int $stable = CellDTO.$stable;

            @NotNull
            private final CellDTO atom;

            public Cell(@NotNull CellDTO atom) {
                Intrinsics.checkNotNullParameter(atom, "atom");
                this.atom = atom;
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

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO$CompanyCardOptionVO$Disclosure;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/presentation/CompanyCardVO$CompanyCardOptionVO;", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "atom", "<init>", "(Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/cell/DisclosureTitleSubtitleCellDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Disclosure implements CompanyCardOptionVO {
            public static final int $stable = DisclosureTitleSubtitleCellDTO.$stable;

            @NotNull
            private final DisclosureTitleSubtitleCellDTO atom;

            public Disclosure(@NotNull DisclosureTitleSubtitleCellDTO atom) {
                Intrinsics.checkNotNullParameter(atom, "atom");
                this.atom = atom;
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

    /* JADX WARN: Multi-variable type inference failed */
    public CompanyCardVO(long j11, UncontainedButtonDTO uncontainedButtonDTO, TextDTO textDTO, @NotNull List<? extends CompanyCardOptionVO> companyOptions, ButtonDTO buttonDTO, BadgeDTO badgeDTO, CellDTO cellDTO, String str) {
        Intrinsics.checkNotNullParameter(companyOptions, "companyOptions");
        this.id = j11;
        this.link = uncontainedButtonDTO;
        this.companyName = textDTO;
        this.companyOptions = companyOptions;
        this.button = buttonDTO;
        this.badge = badgeDTO;
        this.email = cellDTO;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyCardVO)) {
            return false;
        }
        CompanyCardVO companyCardVO = (CompanyCardVO) other;
        return this.id == companyCardVO.id && Intrinsics.d(this.link, companyCardVO.link) && Intrinsics.d(this.companyName, companyCardVO.companyName) && Intrinsics.d(this.companyOptions, companyCardVO.companyOptions) && Intrinsics.d(this.button, companyCardVO.button) && Intrinsics.d(this.badge, companyCardVO.badge) && Intrinsics.d(this.email, companyCardVO.email) && Intrinsics.d(this.backgroundColor, companyCardVO.backgroundColor);
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
    public final List<CompanyCardOptionVO> getCompanyOptions() {
        return this.companyOptions;
    }

    public final CellDTO getEmail() {
        return this.email;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final UncontainedButtonDTO getLink() {
        return this.link;
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
        UncontainedButtonDTO uncontainedButtonDTO = this.link;
        int hashCode2 = (hashCode + (uncontainedButtonDTO == null ? 0 : uncontainedButtonDTO.hashCode())) * 31;
        TextDTO textDTO = this.companyName;
        int b11 = g.b((hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.companyOptions);
        ButtonDTO buttonDTO = this.button;
        int hashCode3 = (b11 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        CellDTO cellDTO = this.email;
        int hashCode5 = (hashCode4 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CompanyCardVO(id=" + this.id + ", link=" + this.link + ", companyName=" + this.companyName + ", companyOptions=" + this.companyOptions + ", button=" + this.button + ", badge=" + this.badge + ", email=" + this.email + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
