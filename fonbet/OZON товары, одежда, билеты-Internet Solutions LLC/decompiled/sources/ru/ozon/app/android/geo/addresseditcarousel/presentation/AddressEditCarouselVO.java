package ru.ozon.app.android.geo.addresseditcarousel.presentation;

import B6.b;
import C.o0;
import G.g;
import I1.w;
import Lh.a;
import T7.P;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002()B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "elements", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$Option;", "options", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "moreButton", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "getOptions", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "getMoreButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Option", "CellVO", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditCarouselVO implements c {

    @NotNull
    private final List<AtomDTO> elements;
    private final long id;
    private final ButtonV3Atom.LargeBorderlessButton moreButton;

    @NotNull
    private final List<Option> options;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001:\u0001*BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b)\u0010\u0012¨\u0006+"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "image", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO$NumberPVZ;", "numberPVZ", "imageTintColor", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO$NumberPVZ;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getImage", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO$NumberPVZ;", "getNumberPVZ", "()Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO$NumberPVZ;", "getImageTintColor", "NumberPVZ", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellVO {
        private final AtomAction action;
        private final List<BadgeDTO> badges;
        private final String image;
        private final String imageTintColor;
        private final NumberPVZ numberPVZ;

        @NotNull
        private final OzonSpannableString subtitle;
        private final String title;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO$NumberPVZ;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "number", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NumberPVZ {
            private final AtomAction action;

            @NotNull
            private final TextDTO number;

            public NumberPVZ(@NotNull TextDTO number, AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(number, "number");
                this.number = number;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NumberPVZ)) {
                    return false;
                }
                NumberPVZ numberPVZ = (NumberPVZ) other;
                return Intrinsics.d(this.number, numberPVZ.number) && Intrinsics.d(this.action, numberPVZ.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final TextDTO getNumber() {
                return this.number;
            }

            public int hashCode() {
                int hashCode = this.number.hashCode() * 31;
                AtomAction atomAction = this.action;
                return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
            }

            @NotNull
            public String toString() {
                return "NumberPVZ(number=" + this.number + ", action=" + this.action + ")";
            }
        }

        public CellVO(String str, @NotNull OzonSpannableString subtitle, String str2, List<BadgeDTO> list, AtomAction atomAction, NumberPVZ numberPVZ, String str3) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = str;
            this.subtitle = subtitle;
            this.image = str2;
            this.badges = list;
            this.action = atomAction;
            this.numberPVZ = numberPVZ;
            this.imageTintColor = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellVO)) {
                return false;
            }
            CellVO cellVO = (CellVO) other;
            return Intrinsics.d(this.title, cellVO.title) && Intrinsics.d(this.subtitle, cellVO.subtitle) && Intrinsics.d(this.image, cellVO.image) && Intrinsics.d(this.badges, cellVO.badges) && Intrinsics.d(this.action, cellVO.action) && Intrinsics.d(this.numberPVZ, cellVO.numberPVZ) && Intrinsics.d(this.imageTintColor, cellVO.imageTintColor);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        public final NumberPVZ getNumberPVZ() {
            return this.numberPVZ;
        }

        @NotNull
        public final OzonSpannableString getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int c11 = P.c(this.subtitle, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.image;
            int hashCode = (c11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<BadgeDTO> list = this.badges;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode3 = (hashCode2 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            NumberPVZ numberPVZ = this.numberPVZ;
            int hashCode4 = (hashCode3 + (numberPVZ == null ? 0 : numberPVZ.hashCode())) * 31;
            String str3 = this.imageTintColor;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            OzonSpannableString ozonSpannableString = this.subtitle;
            String str2 = this.image;
            List<BadgeDTO> list = this.badges;
            AtomAction atomAction = this.action;
            NumberPVZ numberPVZ = this.numberPVZ;
            String str3 = this.imageTintColor;
            StringBuilder sb2 = new StringBuilder("CellVO(title=");
            sb2.append(str);
            sb2.append(", subtitle=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", image=");
            w.d(str2, ", badges=", ", action=", sb2, list);
            sb2.append(atomAction);
            sb2.append(", numberPVZ=");
            sb2.append(numberPVZ);
            sb2.append(", imageTintColor=");
            return o0.c(sb2, str3, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$Option;", "", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO;", "cell", "", "Lru/ozon/app/android/atoms/data/deprecated/Label;", "marketingInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO;", "getCell", "()Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO;", "Ljava/util/List;", "getMarketingInfo", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Option {
        private final AtomAction action;

        @NotNull
        private final CellVO cell;
        private final List<Label> marketingInfo;

        public Option(@NotNull CellVO cell, List<Label> list, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
            this.marketingInfo = list;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.d(this.cell, option.cell) && Intrinsics.d(this.marketingInfo, option.marketingInfo) && Intrinsics.d(this.action, option.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final CellVO getCell() {
            return this.cell;
        }

        public final List<Label> getMarketingInfo() {
            return this.marketingInfo;
        }

        public int hashCode() {
            int hashCode = this.cell.hashCode() * 31;
            List<Label> list = this.marketingInfo;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            AtomAction atomAction = this.action;
            return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            CellVO cellVO = this.cell;
            List<Label> list = this.marketingInfo;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("Option(cell=");
            sb2.append(cellVO);
            sb2.append(", marketingInfo=");
            sb2.append(list);
            sb2.append(", action=");
            return b.b(sb2, atomAction, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditCarouselVO(long j11, @NotNull List<? extends AtomDTO> elements, @NotNull List<Option> options, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, t tVar) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(options, "options");
        this.id = j11;
        this.elements = elements;
        this.options = options;
        this.moreButton = largeBorderlessButton;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditCarouselVO)) {
            return false;
        }
        AddressEditCarouselVO addressEditCarouselVO = (AddressEditCarouselVO) other;
        return this.id == addressEditCarouselVO.id && Intrinsics.d(this.elements, addressEditCarouselVO.elements) && Intrinsics.d(this.options, addressEditCarouselVO.options) && Intrinsics.d(this.moreButton, addressEditCarouselVO.moreButton) && Intrinsics.d(this.tokenizedEvent, addressEditCarouselVO.tokenizedEvent);
    }

    @NotNull
    public final List<AtomDTO> getElements() {
        return this.elements;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ButtonV3Atom.LargeBorderlessButton getMoreButton() {
        return this.moreButton;
    }

    @NotNull
    public final List<Option> getOptions() {
        return this.options;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(g.b(Long.hashCode(this.id) * 31, 31, this.elements), 31, this.options);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreButton;
        int hashCode = (b11 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomDTO> list = this.elements;
        List<Option> list2 = this.options;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.moreButton;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = Lh.b.b(j11, "AddressEditCarouselVO(id=", ", elements=", list);
        b11.append(", options=");
        b11.append(list2);
        b11.append(", moreButton=");
        b11.append(largeBorderlessButton);
        return a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
