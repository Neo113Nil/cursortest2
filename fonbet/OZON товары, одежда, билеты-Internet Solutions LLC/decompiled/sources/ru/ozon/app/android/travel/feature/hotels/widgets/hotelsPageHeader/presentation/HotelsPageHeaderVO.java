package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation;

import B0.A0;
import B0.C2454a;
import B90.C2619v;
import C.o0;
import G.g;
import Kk.C3532b;
import Pk0.f;
import Ve.C4636t5;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003%&'B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ@\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0014R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "stateWrapper", "", "bottomRadius", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;ILWZ/t;)V", "copy", "(JLru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;ILWZ/t;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "getStateWrapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "I", "getBottomRadius", "LWZ/t;", "getViewEvent", "()LWZ/t;", "StateWrapper", "PremiumInfoVO", "PriceInfo", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsPageHeaderVO implements c {
    private final int bottomRadius;
    private final long id;

    @NotNull
    private final StateWrapper stateWrapper;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PremiumInfoVO;", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "premiumButton", "", "backgroundColor", "darkBackgroundColor", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getPremiumButton", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "Ljava/lang/String;", "getBackgroundColor", "getDarkBackgroundColor", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PremiumInfoVO {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String darkBackgroundColor;

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon premiumButton;

        public PremiumInfoVO(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon premiumButton, @NotNull String backgroundColor, @NotNull String darkBackgroundColor) {
            Intrinsics.checkNotNullParameter(premiumButton, "premiumButton");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(darkBackgroundColor, "darkBackgroundColor");
            this.premiumButton = premiumButton;
            this.backgroundColor = backgroundColor;
            this.darkBackgroundColor = darkBackgroundColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PremiumInfoVO)) {
                return false;
            }
            PremiumInfoVO premiumInfoVO = (PremiumInfoVO) other;
            return Intrinsics.d(this.premiumButton, premiumInfoVO.premiumButton) && Intrinsics.d(this.backgroundColor, premiumInfoVO.backgroundColor) && Intrinsics.d(this.darkBackgroundColor, premiumInfoVO.darkBackgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getDarkBackgroundColor() {
            return this.darkBackgroundColor;
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getPremiumButton() {
            return this.premiumButton;
        }

        public int hashCode() {
            return this.darkBackgroundColor.hashCode() + g.a(this.premiumButton.hashCode() * 31, 31, this.backgroundColor);
        }

        @NotNull
        public String toString() {
            CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon = this.premiumButton;
            String str = this.backgroundColor;
            String str2 = this.darkBackgroundColor;
            StringBuilder sb2 = new StringBuilder("PremiumInfoVO(premiumButton=");
            sb2.append(cellWithSubtitle24Icon);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", darkBackgroundColor=");
            return o0.c(sb2, str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "", "Invalid", "PriceWrapper", "CellWrapper", "AsyncPlaceholder", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo$AsyncPlaceholder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo$CellWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo$Invalid;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo$PriceWrapper;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PriceInfo {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo$AsyncPlaceholder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "", "asyncData", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AsyncPlaceholder implements PriceInfo {

            @NotNull
            private final String asyncData;

            public AsyncPlaceholder(@NotNull String asyncData) {
                Intrinsics.checkNotNullParameter(asyncData, "asyncData");
                this.asyncData = asyncData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AsyncPlaceholder) && Intrinsics.d(this.asyncData, ((AsyncPlaceholder) other).asyncData);
            }

            @NotNull
            public final String getAsyncData() {
                return this.asyncData;
            }

            public int hashCode() {
                return this.asyncData.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("AsyncPlaceholder(asyncData=", this.asyncData, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo$CellWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "cell", "<init>", "(Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "getCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellWrapper implements PriceInfo {

            @NotNull
            private final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cell;

            public CellWrapper(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cell) {
                Intrinsics.checkNotNullParameter(cell, "cell");
                this.cell = cell;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CellWrapper) && Intrinsics.d(this.cell, ((CellWrapper) other).cell);
            }

            @NotNull
            public final CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon getCell() {
                return this.cell;
            }

            public int hashCode() {
                return this.cell.hashCode();
            }

            @NotNull
            public String toString() {
                return "CellWrapper(cell=" + this.cell + ")";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo$Invalid;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Invalid implements PriceInfo {

            @NotNull
            public static final Invalid INSTANCE = new Invalid();

            private Invalid() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Invalid);
            }

            public int hashCode() {
                return -592739698;
            }

            @NotNull
            public String toString() {
                return "Invalid";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo$PriceWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "priceDescription", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PremiumInfoVO;", "premiumInfo", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PremiumInfoVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPriceDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PremiumInfoVO;", "getPremiumInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PremiumInfoVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceWrapper implements PriceInfo {
            private final PremiumInfoVO premiumInfo;

            @NotNull
            private final Price price;

            @NotNull
            private final TextAtom priceDescription;

            public PriceWrapper(@NotNull Price price, @NotNull TextAtom priceDescription, PremiumInfoVO premiumInfoVO) {
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
                this.price = price;
                this.priceDescription = priceDescription;
                this.premiumInfo = premiumInfoVO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceWrapper)) {
                    return false;
                }
                PriceWrapper priceWrapper = (PriceWrapper) other;
                return Intrinsics.d(this.price, priceWrapper.price) && Intrinsics.d(this.priceDescription, priceWrapper.priceDescription) && Intrinsics.d(this.premiumInfo, priceWrapper.premiumInfo);
            }

            public final PremiumInfoVO getPremiumInfo() {
                return this.premiumInfo;
            }

            @NotNull
            public final Price getPrice() {
                return this.price;
            }

            @NotNull
            public final TextAtom getPriceDescription() {
                return this.priceDescription;
            }

            public int hashCode() {
                int b11 = C2619v.b(this.price.hashCode() * 31, 31, this.priceDescription);
                PremiumInfoVO premiumInfoVO = this.premiumInfo;
                return b11 + (premiumInfoVO == null ? 0 : premiumInfoVO.hashCode());
            }

            @NotNull
            public String toString() {
                return "PriceWrapper(price=" + this.price + ", priceDescription=" + this.priceDescription + ", premiumInfo=" + this.premiumInfo + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011Jj\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b\u000f\u0010$¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "priceInfo", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "badges", "", "isMirBadgeExist", "isBadgesVisible", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "stars", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "isPremium", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;Ljava/util/List;ZZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Z)V", "copy", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;Ljava/util/List;ZZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Z)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$StateWrapper;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "getPriceInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO$PriceInfo;", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "Z", "()Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getStars", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getAddress", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StateWrapper {
        private final LinkButtonVO address;

        @NotNull
        private final List<Badge> badges;
        private final boolean isBadgesVisible;
        private final boolean isMirBadgeExist;
        private final boolean isPremium;

        @NotNull
        private final PriceInfo priceInfo;
        private final TextAtom stars;

        @NotNull
        private final TextAtom title;

        public StateWrapper(@NotNull PriceInfo priceInfo, @NotNull List<Badge> badges, boolean z11, boolean z12, TextAtom textAtom, @NotNull TextAtom title, LinkButtonVO linkButtonVO, boolean z13) {
            Intrinsics.checkNotNullParameter(priceInfo, "priceInfo");
            Intrinsics.checkNotNullParameter(badges, "badges");
            Intrinsics.checkNotNullParameter(title, "title");
            this.priceInfo = priceInfo;
            this.badges = badges;
            this.isMirBadgeExist = z11;
            this.isBadgesVisible = z12;
            this.stars = textAtom;
            this.title = title;
            this.address = linkButtonVO;
            this.isPremium = z13;
        }

        public static /* synthetic */ StateWrapper copy$default(StateWrapper stateWrapper, PriceInfo priceInfo, List list, boolean z11, boolean z12, TextAtom textAtom, TextAtom textAtom2, LinkButtonVO linkButtonVO, boolean z13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceInfo = stateWrapper.priceInfo;
            }
            if ((i11 & 2) != 0) {
                list = stateWrapper.badges;
            }
            if ((i11 & 4) != 0) {
                z11 = stateWrapper.isMirBadgeExist;
            }
            if ((i11 & 8) != 0) {
                z12 = stateWrapper.isBadgesVisible;
            }
            if ((i11 & 16) != 0) {
                textAtom = stateWrapper.stars;
            }
            if ((i11 & 32) != 0) {
                textAtom2 = stateWrapper.title;
            }
            if ((i11 & 64) != 0) {
                linkButtonVO = stateWrapper.address;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z13 = stateWrapper.isPremium;
            }
            LinkButtonVO linkButtonVO2 = linkButtonVO;
            boolean z14 = z13;
            TextAtom textAtom3 = textAtom;
            TextAtom textAtom4 = textAtom2;
            return stateWrapper.copy(priceInfo, list, z11, z12, textAtom3, textAtom4, linkButtonVO2, z14);
        }

        @NotNull
        public final StateWrapper copy(@NotNull PriceInfo priceInfo, @NotNull List<Badge> badges, boolean isMirBadgeExist, boolean isBadgesVisible, TextAtom stars, @NotNull TextAtom title, LinkButtonVO address, boolean isPremium) {
            Intrinsics.checkNotNullParameter(priceInfo, "priceInfo");
            Intrinsics.checkNotNullParameter(badges, "badges");
            Intrinsics.checkNotNullParameter(title, "title");
            return new StateWrapper(priceInfo, badges, isMirBadgeExist, isBadgesVisible, stars, title, address, isPremium);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateWrapper)) {
                return false;
            }
            StateWrapper stateWrapper = (StateWrapper) other;
            return Intrinsics.d(this.priceInfo, stateWrapper.priceInfo) && Intrinsics.d(this.badges, stateWrapper.badges) && this.isMirBadgeExist == stateWrapper.isMirBadgeExist && this.isBadgesVisible == stateWrapper.isBadgesVisible && Intrinsics.d(this.stars, stateWrapper.stars) && Intrinsics.d(this.title, stateWrapper.title) && Intrinsics.d(this.address, stateWrapper.address) && this.isPremium == stateWrapper.isPremium;
        }

        public final LinkButtonVO getAddress() {
            return this.address;
        }

        @NotNull
        public final List<Badge> getBadges() {
            return this.badges;
        }

        @NotNull
        public final PriceInfo getPriceInfo() {
            return this.priceInfo;
        }

        public final TextAtom getStars() {
            return this.stars;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = C3532b.a(C3532b.a(g.b(this.priceInfo.hashCode() * 31, 31, this.badges), 31, this.isMirBadgeExist), 31, this.isBadgesVisible);
            TextAtom textAtom = this.stars;
            int b11 = C2619v.b((a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.title);
            LinkButtonVO linkButtonVO = this.address;
            return Boolean.hashCode(this.isPremium) + ((b11 + (linkButtonVO != null ? linkButtonVO.hashCode() : 0)) * 31);
        }

        /* renamed from: isBadgesVisible, reason: from getter */
        public final boolean getIsBadgesVisible() {
            return this.isBadgesVisible;
        }

        /* renamed from: isMirBadgeExist, reason: from getter */
        public final boolean getIsMirBadgeExist() {
            return this.isMirBadgeExist;
        }

        /* renamed from: isPremium, reason: from getter */
        public final boolean getIsPremium() {
            return this.isPremium;
        }

        @NotNull
        public String toString() {
            PriceInfo priceInfo = this.priceInfo;
            List<Badge> list = this.badges;
            boolean z11 = this.isMirBadgeExist;
            boolean z12 = this.isBadgesVisible;
            TextAtom textAtom = this.stars;
            TextAtom textAtom2 = this.title;
            LinkButtonVO linkButtonVO = this.address;
            boolean z13 = this.isPremium;
            StringBuilder sb2 = new StringBuilder("StateWrapper(priceInfo=");
            sb2.append(priceInfo);
            sb2.append(", badges=");
            sb2.append(list);
            sb2.append(", isMirBadgeExist=");
            f.c(", isBadgesVisible=", ", stars=", sb2, z11, z12);
            C4636t5.c(", title=", ", address=", sb2, textAtom, textAtom2);
            sb2.append(linkButtonVO);
            sb2.append(", isPremium=");
            sb2.append(z13);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public HotelsPageHeaderVO(long j11, @NotNull StateWrapper stateWrapper, int i11, t tVar) {
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        this.id = j11;
        this.stateWrapper = stateWrapper;
        this.bottomRadius = i11;
        this.viewEvent = tVar;
    }

    public static /* synthetic */ HotelsPageHeaderVO copy$default(HotelsPageHeaderVO hotelsPageHeaderVO, long j11, StateWrapper stateWrapper, int i11, t tVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = hotelsPageHeaderVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            stateWrapper = hotelsPageHeaderVO.stateWrapper;
        }
        StateWrapper stateWrapper2 = stateWrapper;
        if ((i12 & 4) != 0) {
            i11 = hotelsPageHeaderVO.bottomRadius;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            tVar = hotelsPageHeaderVO.viewEvent;
        }
        return hotelsPageHeaderVO.copy(j12, stateWrapper2, i13, tVar);
    }

    @NotNull
    public final HotelsPageHeaderVO copy(long id2, @NotNull StateWrapper stateWrapper, int bottomRadius, t viewEvent) {
        Intrinsics.checkNotNullParameter(stateWrapper, "stateWrapper");
        return new HotelsPageHeaderVO(id2, stateWrapper, bottomRadius, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsPageHeaderVO)) {
            return false;
        }
        HotelsPageHeaderVO hotelsPageHeaderVO = (HotelsPageHeaderVO) other;
        return this.id == hotelsPageHeaderVO.id && Intrinsics.d(this.stateWrapper, hotelsPageHeaderVO.stateWrapper) && this.bottomRadius == hotelsPageHeaderVO.bottomRadius && Intrinsics.d(this.viewEvent, hotelsPageHeaderVO.viewEvent);
    }

    public final int getBottomRadius() {
        return this.bottomRadius;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final StateWrapper getStateWrapper() {
        return this.stateWrapper;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.bottomRadius, (this.stateWrapper.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        t tVar = this.viewEvent;
        return a11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "HotelsPageHeaderVO(id=" + this.id + ", stateWrapper=" + this.stateWrapper + ", bottomRadius=" + this.bottomRadius + ", viewEvent=" + this.viewEvent + ")";
    }
}
