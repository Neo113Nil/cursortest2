package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import Ak.C2436a;
import B0.C2454a;
import B90.C2619v;
import Cm.e;
import Ek.a;
import G.g;
import Kk.C3532b;
import T7.E;
import Tl.b;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0010\u001f !\"#$%&'()*+,-.B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;", "content", "", "asyncData", "<init>", "(JLru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;Ljava/lang/String;)V", "copy", "(JLru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;", "getContent", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;", "Ljava/lang/String;", "getAsyncData", "LuggageContent", "AppBarVO", "PassengerTabVO", "ActionPaneVO", "FlightItem", "LuggageEmptyStateVO", "SkeletonVO", "FlightVO", "LuggageItem", "LuggageRouteItem", "LuggageBaseTariffInfoItem", "LuggageHeaderItem", "LuggageInfoItem", "LuggageOptionItem", "LuggageTransportationItem", "LuggageBottomItem", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdditionalLuggageV2VO implements c {
    private final String asyncData;

    @NotNull
    private final LuggageContent content;
    private final long id;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;", "", "", "formattedTotalPrice", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "priceDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "saveButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "detailsButton", "<init>", "(Ljava/lang/CharSequence;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "copy", "(Ljava/lang/CharSequence;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getFormattedTotalPrice", "()Ljava/lang/CharSequence;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPriceDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getSaveButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getDetailsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionPaneVO {
        private final ButtonV3Atom.SmallIconButton detailsButton;

        @NotNull
        private final CharSequence formattedTotalPrice;

        @NotNull
        private final TextAtom priceDescription;

        @NotNull
        private final ButtonV3Atom.LargeButton saveButton;

        public ActionPaneVO(@NotNull CharSequence formattedTotalPrice, @NotNull TextAtom priceDescription, @NotNull ButtonV3Atom.LargeButton saveButton, ButtonV3Atom.SmallIconButton smallIconButton) {
            Intrinsics.checkNotNullParameter(formattedTotalPrice, "formattedTotalPrice");
            Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
            Intrinsics.checkNotNullParameter(saveButton, "saveButton");
            this.formattedTotalPrice = formattedTotalPrice;
            this.priceDescription = priceDescription;
            this.saveButton = saveButton;
            this.detailsButton = smallIconButton;
        }

        public static /* synthetic */ ActionPaneVO copy$default(ActionPaneVO actionPaneVO, CharSequence charSequence, TextAtom textAtom, ButtonV3Atom.LargeButton largeButton, ButtonV3Atom.SmallIconButton smallIconButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                charSequence = actionPaneVO.formattedTotalPrice;
            }
            if ((i11 & 2) != 0) {
                textAtom = actionPaneVO.priceDescription;
            }
            if ((i11 & 4) != 0) {
                largeButton = actionPaneVO.saveButton;
            }
            if ((i11 & 8) != 0) {
                smallIconButton = actionPaneVO.detailsButton;
            }
            return actionPaneVO.copy(charSequence, textAtom, largeButton, smallIconButton);
        }

        @NotNull
        public final ActionPaneVO copy(@NotNull CharSequence formattedTotalPrice, @NotNull TextAtom priceDescription, @NotNull ButtonV3Atom.LargeButton saveButton, ButtonV3Atom.SmallIconButton detailsButton) {
            Intrinsics.checkNotNullParameter(formattedTotalPrice, "formattedTotalPrice");
            Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
            Intrinsics.checkNotNullParameter(saveButton, "saveButton");
            return new ActionPaneVO(formattedTotalPrice, priceDescription, saveButton, detailsButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionPaneVO)) {
                return false;
            }
            ActionPaneVO actionPaneVO = (ActionPaneVO) other;
            return Intrinsics.d(this.formattedTotalPrice, actionPaneVO.formattedTotalPrice) && Intrinsics.d(this.priceDescription, actionPaneVO.priceDescription) && Intrinsics.d(this.saveButton, actionPaneVO.saveButton) && Intrinsics.d(this.detailsButton, actionPaneVO.detailsButton);
        }

        public final ButtonV3Atom.SmallIconButton getDetailsButton() {
            return this.detailsButton;
        }

        @NotNull
        public final CharSequence getFormattedTotalPrice() {
            return this.formattedTotalPrice;
        }

        @NotNull
        public final TextAtom getPriceDescription() {
            return this.priceDescription;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSaveButton() {
            return this.saveButton;
        }

        public int hashCode() {
            int a11 = b.a(this.saveButton, C2619v.b(this.formattedTotalPrice.hashCode() * 31, 31, this.priceDescription), 31);
            ButtonV3Atom.SmallIconButton smallIconButton = this.detailsButton;
            return a11 + (smallIconButton == null ? 0 : smallIconButton.hashCode());
        }

        @NotNull
        public String toString() {
            CharSequence charSequence = this.formattedTotalPrice;
            return "ActionPaneVO(formattedTotalPrice=" + ((Object) charSequence) + ", priceDescription=" + this.priceDescription + ", saveButton=" + this.saveButton + ", detailsButton=" + this.detailsButton + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isShimmerVisible", "arePassengerTabsVisible", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$PassengerTabVO;", "passengerTabs", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;ZZLjava/util/List;)V", "copy", "(Lru/ozon/uni/atoms/data/texts/TextAtom;ZZLjava/util/List;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Z", "()Z", "getArePassengerTabsVisible", "Ljava/util/List;", "getPassengerTabs", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AppBarVO {
        private final boolean arePassengerTabsVisible;
        private final boolean isShimmerVisible;

        @NotNull
        private final List<PassengerTabVO> passengerTabs;

        @NotNull
        private final TextAtom title;

        public AppBarVO(@NotNull TextAtom title, boolean z11, boolean z12, @NotNull List<PassengerTabVO> passengerTabs) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(passengerTabs, "passengerTabs");
            this.title = title;
            this.isShimmerVisible = z11;
            this.arePassengerTabsVisible = z12;
            this.passengerTabs = passengerTabs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AppBarVO copy$default(AppBarVO appBarVO, TextAtom textAtom, boolean z11, boolean z12, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = appBarVO.title;
            }
            if ((i11 & 2) != 0) {
                z11 = appBarVO.isShimmerVisible;
            }
            if ((i11 & 4) != 0) {
                z12 = appBarVO.arePassengerTabsVisible;
            }
            if ((i11 & 8) != 0) {
                list = appBarVO.passengerTabs;
            }
            return appBarVO.copy(textAtom, z11, z12, list);
        }

        @NotNull
        public final AppBarVO copy(@NotNull TextAtom title, boolean isShimmerVisible, boolean arePassengerTabsVisible, @NotNull List<PassengerTabVO> passengerTabs) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(passengerTabs, "passengerTabs");
            return new AppBarVO(title, isShimmerVisible, arePassengerTabsVisible, passengerTabs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppBarVO)) {
                return false;
            }
            AppBarVO appBarVO = (AppBarVO) other;
            return Intrinsics.d(this.title, appBarVO.title) && this.isShimmerVisible == appBarVO.isShimmerVisible && this.arePassengerTabsVisible == appBarVO.arePassengerTabsVisible && Intrinsics.d(this.passengerTabs, appBarVO.passengerTabs);
        }

        public final boolean getArePassengerTabsVisible() {
            return this.arePassengerTabsVisible;
        }

        @NotNull
        public final List<PassengerTabVO> getPassengerTabs() {
            return this.passengerTabs;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.passengerTabs.hashCode() + C3532b.a(C3532b.a(this.title.hashCode() * 31, 31, this.isShimmerVisible), 31, this.arePassengerTabsVisible);
        }

        /* renamed from: isShimmerVisible, reason: from getter */
        public final boolean getIsShimmerVisible() {
            return this.isShimmerVisible;
        }

        @NotNull
        public String toString() {
            return "AppBarVO(title=" + this.title + ", isShimmerVisible=" + this.isShimmerVisible + ", arePassengerTabsVisible=" + this.arePassengerTabsVisible + ", passengerTabs=" + this.passengerTabs + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightItem;", "", "id", "", "getId", "()I", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageEmptyStateVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$SkeletonVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FlightItem {
        int getId();
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightItem;", "", "id", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "luggageItems", "<init>", "(ILjava/util/List;)V", "copy", "(ILjava/util/List;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getLuggageItems", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FlightVO implements FlightItem {
        private final int id;

        @NotNull
        private final List<LuggageItem> luggageItems;

        /* JADX WARN: Multi-variable type inference failed */
        public FlightVO(int i11, @NotNull List<? extends LuggageItem> luggageItems) {
            Intrinsics.checkNotNullParameter(luggageItems, "luggageItems");
            this.id = i11;
            this.luggageItems = luggageItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FlightVO copy$default(FlightVO flightVO, int i11, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = flightVO.id;
            }
            if ((i12 & 2) != 0) {
                list = flightVO.luggageItems;
            }
            return flightVO.copy(i11, list);
        }

        @NotNull
        public final FlightVO copy(int id2, @NotNull List<? extends LuggageItem> luggageItems) {
            Intrinsics.checkNotNullParameter(luggageItems, "luggageItems");
            return new FlightVO(id2, luggageItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlightVO)) {
                return false;
            }
            FlightVO flightVO = (FlightVO) other;
            return this.id == flightVO.id && Intrinsics.d(this.luggageItems, flightVO.luggageItems);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.FlightItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final List<LuggageItem> getLuggageItems() {
            return this.luggageItems;
        }

        public int hashCode() {
            return this.luggageItems.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "FlightVO(id=" + this.id + ", luggageItems=" + this.luggageItems + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b \u0010\u001b¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageBaseTariffInfoItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "handCarryLabel", "luggageLabel", "handCarryAmount", "luggageAmount", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getHandCarryLabel", "getLuggageLabel", "getHandCarryAmount", "getLuggageAmount", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageBaseTariffInfoItem implements LuggageItem {
        public static final int $stable = TextAtom.$stable;
        private final TextAtom handCarryAmount;

        @NotNull
        private final TextAtom handCarryLabel;
        private final int id;
        private final TextAtom luggageAmount;

        @NotNull
        private final TextAtom luggageLabel;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public LuggageBaseTariffInfoItem(int i11, @NotNull TextAtom title, TextAtom textAtom, @NotNull TextAtom handCarryLabel, @NotNull TextAtom luggageLabel, TextAtom textAtom2, TextAtom textAtom3) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(handCarryLabel, "handCarryLabel");
            Intrinsics.checkNotNullParameter(luggageLabel, "luggageLabel");
            this.id = i11;
            this.title = title;
            this.subtitle = textAtom;
            this.handCarryLabel = handCarryLabel;
            this.luggageLabel = luggageLabel;
            this.handCarryAmount = textAtom2;
            this.luggageAmount = textAtom3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageBaseTariffInfoItem)) {
                return false;
            }
            LuggageBaseTariffInfoItem luggageBaseTariffInfoItem = (LuggageBaseTariffInfoItem) other;
            return this.id == luggageBaseTariffInfoItem.id && Intrinsics.d(this.title, luggageBaseTariffInfoItem.title) && Intrinsics.d(this.subtitle, luggageBaseTariffInfoItem.subtitle) && Intrinsics.d(this.handCarryLabel, luggageBaseTariffInfoItem.handCarryLabel) && Intrinsics.d(this.luggageLabel, luggageBaseTariffInfoItem.luggageLabel) && Intrinsics.d(this.handCarryAmount, luggageBaseTariffInfoItem.handCarryAmount) && Intrinsics.d(this.luggageAmount, luggageBaseTariffInfoItem.luggageAmount);
        }

        public final TextAtom getHandCarryAmount() {
            return this.handCarryAmount;
        }

        @NotNull
        public final TextAtom getHandCarryLabel() {
            return this.handCarryLabel;
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.LuggageItem
        public int getId() {
            return this.id;
        }

        public final TextAtom getLuggageAmount() {
            return this.luggageAmount;
        }

        @NotNull
        public final TextAtom getLuggageLabel() {
            return this.luggageLabel;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = C2619v.b(Integer.hashCode(this.id) * 31, 31, this.title);
            TextAtom textAtom = this.subtitle;
            int b12 = C2619v.b(C2619v.b((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.handCarryLabel), 31, this.luggageLabel);
            TextAtom textAtom2 = this.handCarryAmount;
            int hashCode = (b12 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            TextAtom textAtom3 = this.luggageAmount;
            return hashCode + (textAtom3 != null ? textAtom3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            TextAtom textAtom3 = this.handCarryLabel;
            TextAtom textAtom4 = this.luggageLabel;
            TextAtom textAtom5 = this.handCarryAmount;
            TextAtom textAtom6 = this.luggageAmount;
            StringBuilder sb2 = new StringBuilder("LuggageBaseTariffInfoItem(id=");
            sb2.append(i11);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", subtitle=");
            C4636t5.c(", handCarryLabel=", ", luggageLabel=", sb2, textAtom2, textAtom3);
            C4636t5.c(", handCarryAmount=", ", luggageAmount=", sb2, textAtom4, textAtom5);
            return Bi.b.g(sb2, textAtom6, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageBottomItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageBottomItem implements LuggageItem {
        private final int id;

        public LuggageBottomItem(int i11) {
            this.id = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LuggageBottomItem) && this.id == ((LuggageBottomItem) other).id;
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.LuggageItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return E.a(this.id, "LuggageBottomItem(id=", ")");
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jz\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "appBar", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightItem;", "flights", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageEmptyStateVO;", "emptyState", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;", "actionPane", "", "", "", "", "addedLuggage", "selectedTabPosition", "totalPrice", "", "shouldFetchState", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageEmptyStateVO;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;Ljava/util/Map;IIZ)V", "copy", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageEmptyStateVO;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;Ljava/util/Map;IIZ)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "getAppBar", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "Ljava/util/List;", "getFlights", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageEmptyStateVO;", "getEmptyState", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageEmptyStateVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;", "getActionPane", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;", "Ljava/util/Map;", "getAddedLuggage", "()Ljava/util/Map;", "I", "getSelectedTabPosition", "getTotalPrice", "Z", "getShouldFetchState", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageContent {

        @NotNull
        private final ActionPaneVO actionPane;

        @NotNull
        private final Map<Integer, Set<String>> addedLuggage;

        @NotNull
        private final AppBarVO appBar;
        private final LuggageEmptyStateVO emptyState;

        @NotNull
        private final List<FlightItem> flights;
        private final int selectedTabPosition;
        private final boolean shouldFetchState;
        private final int totalPrice;

        /* JADX WARN: Multi-variable type inference failed */
        public LuggageContent(@NotNull AppBarVO appBar, @NotNull List<? extends FlightItem> flights, LuggageEmptyStateVO luggageEmptyStateVO, @NotNull ActionPaneVO actionPane, @NotNull Map<Integer, Set<String>> addedLuggage, int i11, int i12, boolean z11) {
            Intrinsics.checkNotNullParameter(appBar, "appBar");
            Intrinsics.checkNotNullParameter(flights, "flights");
            Intrinsics.checkNotNullParameter(actionPane, "actionPane");
            Intrinsics.checkNotNullParameter(addedLuggage, "addedLuggage");
            this.appBar = appBar;
            this.flights = flights;
            this.emptyState = luggageEmptyStateVO;
            this.actionPane = actionPane;
            this.addedLuggage = addedLuggage;
            this.selectedTabPosition = i11;
            this.totalPrice = i12;
            this.shouldFetchState = z11;
        }

        public static /* synthetic */ LuggageContent copy$default(LuggageContent luggageContent, AppBarVO appBarVO, List list, LuggageEmptyStateVO luggageEmptyStateVO, ActionPaneVO actionPaneVO, Map map, int i11, int i12, boolean z11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                appBarVO = luggageContent.appBar;
            }
            if ((i13 & 2) != 0) {
                list = luggageContent.flights;
            }
            if ((i13 & 4) != 0) {
                luggageEmptyStateVO = luggageContent.emptyState;
            }
            if ((i13 & 8) != 0) {
                actionPaneVO = luggageContent.actionPane;
            }
            if ((i13 & 16) != 0) {
                map = luggageContent.addedLuggage;
            }
            if ((i13 & 32) != 0) {
                i11 = luggageContent.selectedTabPosition;
            }
            if ((i13 & 64) != 0) {
                i12 = luggageContent.totalPrice;
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z11 = luggageContent.shouldFetchState;
            }
            int i14 = i12;
            boolean z12 = z11;
            Map map2 = map;
            int i15 = i11;
            return luggageContent.copy(appBarVO, list, luggageEmptyStateVO, actionPaneVO, map2, i15, i14, z12);
        }

        @NotNull
        public final LuggageContent copy(@NotNull AppBarVO appBar, @NotNull List<? extends FlightItem> flights, LuggageEmptyStateVO emptyState, @NotNull ActionPaneVO actionPane, @NotNull Map<Integer, Set<String>> addedLuggage, int selectedTabPosition, int totalPrice, boolean shouldFetchState) {
            Intrinsics.checkNotNullParameter(appBar, "appBar");
            Intrinsics.checkNotNullParameter(flights, "flights");
            Intrinsics.checkNotNullParameter(actionPane, "actionPane");
            Intrinsics.checkNotNullParameter(addedLuggage, "addedLuggage");
            return new LuggageContent(appBar, flights, emptyState, actionPane, addedLuggage, selectedTabPosition, totalPrice, shouldFetchState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageContent)) {
                return false;
            }
            LuggageContent luggageContent = (LuggageContent) other;
            return Intrinsics.d(this.appBar, luggageContent.appBar) && Intrinsics.d(this.flights, luggageContent.flights) && Intrinsics.d(this.emptyState, luggageContent.emptyState) && Intrinsics.d(this.actionPane, luggageContent.actionPane) && Intrinsics.d(this.addedLuggage, luggageContent.addedLuggage) && this.selectedTabPosition == luggageContent.selectedTabPosition && this.totalPrice == luggageContent.totalPrice && this.shouldFetchState == luggageContent.shouldFetchState;
        }

        @NotNull
        public final ActionPaneVO getActionPane() {
            return this.actionPane;
        }

        @NotNull
        public final Map<Integer, Set<String>> getAddedLuggage() {
            return this.addedLuggage;
        }

        @NotNull
        public final AppBarVO getAppBar() {
            return this.appBar;
        }

        public final LuggageEmptyStateVO getEmptyState() {
            return this.emptyState;
        }

        @NotNull
        public final List<FlightItem> getFlights() {
            return this.flights;
        }

        public final int getSelectedTabPosition() {
            return this.selectedTabPosition;
        }

        public final boolean getShouldFetchState() {
            return this.shouldFetchState;
        }

        public final int getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            int b11 = g.b(this.appBar.hashCode() * 31, 31, this.flights);
            LuggageEmptyStateVO luggageEmptyStateVO = this.emptyState;
            return Boolean.hashCode(this.shouldFetchState) + C2454a.a(this.totalPrice, C2454a.a(this.selectedTabPosition, D40.c.a(this.addedLuggage, (this.actionPane.hashCode() + ((b11 + (luggageEmptyStateVO == null ? 0 : luggageEmptyStateVO.hashCode())) * 31)) * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            return "LuggageContent(appBar=" + this.appBar + ", flights=" + this.flights + ", emptyState=" + this.emptyState + ", actionPane=" + this.actionPane + ", addedLuggage=" + this.addedLuggage + ", selectedTabPosition=" + this.selectedTabPosition + ", totalPrice=" + this.totalPrice + ", shouldFetchState=" + this.shouldFetchState + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageHeaderItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageHeaderItem implements LuggageItem {
        public static final int $stable = TextAtom.$stable;
        private final int id;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public LuggageHeaderItem(int i11, @NotNull TextAtom title, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = i11;
            this.title = title;
            this.subtitle = textAtom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageHeaderItem)) {
                return false;
            }
            LuggageHeaderItem luggageHeaderItem = (LuggageHeaderItem) other;
            return this.id == luggageHeaderItem.id && Intrinsics.d(this.title, luggageHeaderItem.title) && Intrinsics.d(this.subtitle, luggageHeaderItem.subtitle);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.LuggageItem
        public int getId() {
            return this.id;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = C2619v.b(Integer.hashCode(this.id) * 31, 31, this.title);
            TextAtom textAtom = this.subtitle;
            return b11 + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            StringBuilder sb2 = new StringBuilder("LuggageHeaderItem(id=");
            sb2.append(i11);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", subtitle=");
            return Bi.b.g(sb2, textAtom2, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageInfoItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "", "id", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "info", "<init>", "(ILru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getInfo", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageInfoItem implements LuggageItem {
        private final int id;

        @NotNull
        private final DisclaimerAtom info;

        public LuggageInfoItem(int i11, @NotNull DisclaimerAtom info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.id = i11;
            this.info = info;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageInfoItem)) {
                return false;
            }
            LuggageInfoItem luggageInfoItem = (LuggageInfoItem) other;
            return this.id == luggageInfoItem.id && Intrinsics.d(this.info, luggageInfoItem.info);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.LuggageItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final DisclaimerAtom getInfo() {
            return this.info;
        }

        public int hashCode() {
            return this.info.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "LuggageInfoItem(id=" + this.id + ", info=" + this.info + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0007\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "", "id", "", "getId", "()I", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageBaseTariffInfoItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageBottomItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageHeaderItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageInfoItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageRouteItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageTransportationItem;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface LuggageItem {
        int getId();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "", "id", "", "refId", "passengerIndex", "price", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "option", "<init>", "(ILjava/lang/String;IILru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;)V", "copy", "(ILjava/lang/String;IILru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getRefId", "getPassengerIndex", "getPrice", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "getOption", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadioCounter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageOptionItem implements LuggageItem {
        private final int id;

        @NotNull
        private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter option;
        private final int passengerIndex;
        private final int price;

        @NotNull
        private final String refId;

        public LuggageOptionItem(int i11, @NotNull String refId, int i12, int i13, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter option) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(option, "option");
            this.id = i11;
            this.refId = refId;
            this.passengerIndex = i12;
            this.price = i13;
            this.option = option;
        }

        public static /* synthetic */ LuggageOptionItem copy$default(LuggageOptionItem luggageOptionItem, int i11, String str, int i12, int i13, CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = luggageOptionItem.id;
            }
            if ((i14 & 2) != 0) {
                str = luggageOptionItem.refId;
            }
            if ((i14 & 4) != 0) {
                i12 = luggageOptionItem.passengerIndex;
            }
            if ((i14 & 8) != 0) {
                i13 = luggageOptionItem.price;
            }
            if ((i14 & 16) != 0) {
                cellWithSubtitleCheckboxRadioCounter = luggageOptionItem.option;
            }
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter2 = cellWithSubtitleCheckboxRadioCounter;
            int i15 = i12;
            return luggageOptionItem.copy(i11, str, i15, i13, cellWithSubtitleCheckboxRadioCounter2);
        }

        @NotNull
        public final LuggageOptionItem copy(int id2, @NotNull String refId, int passengerIndex, int price, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter option) {
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(option, "option");
            return new LuggageOptionItem(id2, refId, passengerIndex, price, option);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageOptionItem)) {
                return false;
            }
            LuggageOptionItem luggageOptionItem = (LuggageOptionItem) other;
            return this.id == luggageOptionItem.id && Intrinsics.d(this.refId, luggageOptionItem.refId) && this.passengerIndex == luggageOptionItem.passengerIndex && this.price == luggageOptionItem.price && Intrinsics.d(this.option, luggageOptionItem.option);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.LuggageItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter getOption() {
            return this.option;
        }

        public final int getPassengerIndex() {
            return this.passengerIndex;
        }

        public final int getPrice() {
            return this.price;
        }

        @NotNull
        public final String getRefId() {
            return this.refId;
        }

        public int hashCode() {
            return this.option.hashCode() + C2454a.a(this.price, C2454a.a(this.passengerIndex, g.a(Integer.hashCode(this.id) * 31, 31, this.refId), 31), 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            String str = this.refId;
            int i12 = this.passengerIndex;
            int i13 = this.price;
            CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadioCounter cellWithSubtitleCheckboxRadioCounter = this.option;
            StringBuilder g10 = e.g(i11, "LuggageOptionItem(id=", ", refId=", str, ", passengerIndex=");
            a.f(i12, i13, ", price=", ", option=", g10);
            g10.append(cellWithSubtitleCheckboxRadioCounter);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageRouteItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "route", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRoute", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageRouteItem implements LuggageItem {
        public static final int $stable = TextAtom.$stable;
        private final int id;

        @NotNull
        private final TextAtom route;

        public LuggageRouteItem(int i11, @NotNull TextAtom route) {
            Intrinsics.checkNotNullParameter(route, "route");
            this.id = i11;
            this.route = route;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageRouteItem)) {
                return false;
            }
            LuggageRouteItem luggageRouteItem = (LuggageRouteItem) other;
            return this.id == luggageRouteItem.id && Intrinsics.d(this.route, luggageRouteItem.route);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.LuggageItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getRoute() {
            return this.route;
        }

        public int hashCode() {
            return this.route.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "LuggageRouteItem(id=" + this.id + ", route=" + this.route + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageTransportationItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "", "id", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "transportation", "<init>", "(ILru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getTransportation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageTransportationItem implements LuggageItem {
        private final int id;

        @NotNull
        private final DisclaimerAtom transportation;

        public LuggageTransportationItem(int i11, @NotNull DisclaimerAtom transportation) {
            Intrinsics.checkNotNullParameter(transportation, "transportation");
            this.id = i11;
            this.transportation = transportation;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageTransportationItem)) {
                return false;
            }
            LuggageTransportationItem luggageTransportationItem = (LuggageTransportationItem) other;
            return this.id == luggageTransportationItem.id && Intrinsics.d(this.transportation, luggageTransportationItem.transportation);
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.LuggageItem
        public int getId() {
            return this.id;
        }

        @NotNull
        public final DisclaimerAtom getTransportation() {
            return this.transportation;
        }

        public int hashCode() {
            return this.transportation.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "LuggageTransportationItem(id=" + this.id + ", transportation=" + this.transportation + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$PassengerTabVO;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isSelected", "hasAddedLuggage", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;ZZ)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;ZZ)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$PassengerTabVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Z", "()Z", "getHasAddedLuggage", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerTabVO {
        public static final int $stable = TextAtom.$stable;
        private final boolean hasAddedLuggage;

        @NotNull
        private final String id;
        private final boolean isSelected;

        @NotNull
        private final TextAtom title;

        public PassengerTabVO(@NotNull String id2, @NotNull TextAtom title, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id2;
            this.title = title;
            this.isSelected = z11;
            this.hasAddedLuggage = z12;
        }

        public static /* synthetic */ PassengerTabVO copy$default(PassengerTabVO passengerTabVO, String str, TextAtom textAtom, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = passengerTabVO.id;
            }
            if ((i11 & 2) != 0) {
                textAtom = passengerTabVO.title;
            }
            if ((i11 & 4) != 0) {
                z11 = passengerTabVO.isSelected;
            }
            if ((i11 & 8) != 0) {
                z12 = passengerTabVO.hasAddedLuggage;
            }
            return passengerTabVO.copy(str, textAtom, z11, z12);
        }

        @NotNull
        public final PassengerTabVO copy(@NotNull String id2, @NotNull TextAtom title, boolean isSelected, boolean hasAddedLuggage) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            return new PassengerTabVO(id2, title, isSelected, hasAddedLuggage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerTabVO)) {
                return false;
            }
            PassengerTabVO passengerTabVO = (PassengerTabVO) other;
            return Intrinsics.d(this.id, passengerTabVO.id) && Intrinsics.d(this.title, passengerTabVO.title) && this.isSelected == passengerTabVO.isSelected && this.hasAddedLuggage == passengerTabVO.hasAddedLuggage;
        }

        public final boolean getHasAddedLuggage() {
            return this.hasAddedLuggage;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasAddedLuggage) + C3532b.a(C2619v.b(this.id.hashCode() * 31, 31, this.title), 31, this.isSelected);
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            TextAtom textAtom = this.title;
            boolean z11 = this.isSelected;
            boolean z12 = this.hasAddedLuggage;
            StringBuilder d11 = C2436a.d("PassengerTabVO(id=", str, ", title=", ", isSelected=", textAtom);
            d11.append(z11);
            d11.append(", hasAddedLuggage=");
            d11.append(z12);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$SkeletonVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightItem;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SkeletonVO implements FlightItem {
        private final int id;

        public SkeletonVO() {
            this(0, 1, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SkeletonVO) && this.id == ((SkeletonVO) other).id;
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.FlightItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return E.a(this.id, "SkeletonVO(id=", ")");
        }

        public SkeletonVO(int i11) {
            this.id = i11;
        }

        public /* synthetic */ SkeletonVO(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 743571016 : i11);
        }
    }

    public AdditionalLuggageV2VO(long j11, @NotNull LuggageContent content, String str) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j11;
        this.content = content;
        this.asyncData = str;
    }

    public static /* synthetic */ AdditionalLuggageV2VO copy$default(AdditionalLuggageV2VO additionalLuggageV2VO, long j11, LuggageContent luggageContent, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = additionalLuggageV2VO.id;
        }
        if ((i11 & 2) != 0) {
            luggageContent = additionalLuggageV2VO.content;
        }
        if ((i11 & 4) != 0) {
            str = additionalLuggageV2VO.asyncData;
        }
        return additionalLuggageV2VO.copy(j11, luggageContent, str);
    }

    @NotNull
    public final AdditionalLuggageV2VO copy(long id2, @NotNull LuggageContent content, String asyncData) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new AdditionalLuggageV2VO(id2, content, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalLuggageV2VO)) {
            return false;
        }
        AdditionalLuggageV2VO additionalLuggageV2VO = (AdditionalLuggageV2VO) other;
        return this.id == additionalLuggageV2VO.id && Intrinsics.d(this.content, additionalLuggageV2VO.content) && Intrinsics.d(this.asyncData, additionalLuggageV2VO.asyncData);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @NotNull
    public final LuggageContent getContent() {
        return this.content;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        int hashCode = (this.content.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.asyncData;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        LuggageContent luggageContent = this.content;
        String str = this.asyncData;
        StringBuilder sb2 = new StringBuilder("AdditionalLuggageV2VO(id=");
        sb2.append(j11);
        sb2.append(", content=");
        sb2.append(luggageContent);
        return C6594f.a(", asyncData=", str, ")", sb2);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageEmptyStateVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightItem;", "", "id", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "emptyState", "<init>", "(ILru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LuggageEmptyStateVO implements FlightItem {
        public static final int $stable = EmptyStateVO.$stable;

        @NotNull
        private final EmptyStateVO emptyState;
        private final int id;

        public LuggageEmptyStateVO(int i11, @NotNull EmptyStateVO emptyState) {
            Intrinsics.checkNotNullParameter(emptyState, "emptyState");
            this.id = i11;
            this.emptyState = emptyState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LuggageEmptyStateVO)) {
                return false;
            }
            LuggageEmptyStateVO luggageEmptyStateVO = (LuggageEmptyStateVO) other;
            return this.id == luggageEmptyStateVO.id && Intrinsics.d(this.emptyState, luggageEmptyStateVO.emptyState);
        }

        @NotNull
        public final EmptyStateVO getEmptyState() {
            return this.emptyState;
        }

        @Override // ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO.FlightItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.emptyState.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "LuggageEmptyStateVO(id=" + this.id + ", emptyState=" + this.emptyState + ")";
        }

        public /* synthetic */ LuggageEmptyStateVO(int i11, EmptyStateVO emptyStateVO, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? -1829227649 : i11, emptyStateVO);
        }
    }
}
