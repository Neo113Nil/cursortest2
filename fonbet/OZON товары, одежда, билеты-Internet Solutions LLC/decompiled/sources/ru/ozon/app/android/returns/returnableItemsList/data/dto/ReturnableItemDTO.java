package ru.ozon.app.android.returns.returnableItemsList.data.dto;

import B90.C2618u;
import B90.C2619v;
import Bl.b;
import Fm.C3051a;
import G.g;
import K1.G;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.QuantitySelector;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;", "subtitle", "items", "", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Item;", "<init>", "(Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;Ljava/util/List;)V", "getTitle", "()Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;", "getSubtitle", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TitleDTO", "Item", "Title", "Caption", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnableItemDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Item> items;

    @NotNull
    private final Title subtitle;

    @NotNull
    private final Title title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Caption;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Caption {
        public static final int $stable = TextAtom.$stable;
        private final String icon;

        @NotNull
        private final TextAtom text;

        public Caption(@NotNull TextAtom text, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = str;
        }

        public static /* synthetic */ Caption copy$default(Caption caption, TextAtom textAtom, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = caption.text;
            }
            if ((i11 & 2) != 0) {
                str = caption.icon;
            }
            return caption.copy(textAtom, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final Caption copy(@NotNull TextAtom text, String icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Caption(text, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Caption)) {
                return false;
            }
            Caption caption = (Caption) other;
            return Intrinsics.d(this.text, caption.text) && Intrinsics.d(this.icon, caption.icon);
        }

        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.icon;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "Caption(text=" + this.text + ", icon=" + this.icon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010<\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u009c\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020\u00142\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u0013\u0010,R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006E"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Item;", "", "checkbox", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "attributes", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", "quantity", "caption", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Caption;", "itemAction", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "quantitySelector", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;", "isDisabled", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Caption;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "getCheckbox", "()Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "getImage", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAttributes", "()Ljava/util/List;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getQuantity", "getCaption", "()Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Caption;", "getItemAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getQuantitySelector", "()Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Caption;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Lru/ozon/app/android/returns/ui/molecules/quantitySelector/QuantitySelector;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Item;", "equals", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final List<TextAtom> attributes;
        private final Caption caption;

        @NotNull
        private final RmsCheckbox checkbox;

        @NotNull
        private final String image;
        private final Boolean isDisabled;
        private final ButtonV3Atom.SmallBorderlessButton itemAction;

        @NotNull
        private final Price price;
        private final TextAtom quantity;
        private final QuantitySelector quantitySelector;
        private final TestInfo testInfo;

        @NotNull
        private final TextAtom title;

        public Item(@NotNull RmsCheckbox checkbox, @NotNull String image, @NotNull TextAtom title, List<TextAtom> list, @NotNull Price price, TextAtom textAtom, Caption caption, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, QuantitySelector quantitySelector, Boolean bool, AtomActionDTO atomActionDTO, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            this.checkbox = checkbox;
            this.image = image;
            this.title = title;
            this.attributes = list;
            this.price = price;
            this.quantity = textAtom;
            this.caption = caption;
            this.itemAction = smallBorderlessButton;
            this.quantitySelector = quantitySelector;
            this.isDisabled = bool;
            this.action = atomActionDTO;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Item copy$default(Item item, RmsCheckbox rmsCheckbox, String str, TextAtom textAtom, List list, Price price, TextAtom textAtom2, Caption caption, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, QuantitySelector quantitySelector, Boolean bool, AtomActionDTO atomActionDTO, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                rmsCheckbox = item.checkbox;
            }
            if ((i11 & 2) != 0) {
                str = item.image;
            }
            if ((i11 & 4) != 0) {
                textAtom = item.title;
            }
            if ((i11 & 8) != 0) {
                list = item.attributes;
            }
            if ((i11 & 16) != 0) {
                price = item.price;
            }
            if ((i11 & 32) != 0) {
                textAtom2 = item.quantity;
            }
            if ((i11 & 64) != 0) {
                caption = item.caption;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                smallBorderlessButton = item.itemAction;
            }
            if ((i11 & 256) != 0) {
                quantitySelector = item.quantitySelector;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                bool = item.isDisabled;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                atomActionDTO = item.action;
            }
            if ((i11 & 2048) != 0) {
                testInfo = item.testInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            TestInfo testInfo2 = testInfo;
            QuantitySelector quantitySelector2 = quantitySelector;
            Boolean bool2 = bool;
            Caption caption2 = caption;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton2 = smallBorderlessButton;
            Price price2 = price;
            TextAtom textAtom3 = textAtom2;
            return item.copy(rmsCheckbox, str, textAtom, list, price2, textAtom3, caption2, smallBorderlessButton2, quantitySelector2, bool2, atomActionDTO2, testInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final RmsCheckbox getCheckbox() {
            return this.checkbox;
        }

        /* renamed from: component10, reason: from getter */
        public final Boolean getIsDisabled() {
            return this.isDisabled;
        }

        /* renamed from: component11, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component12, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        public final List<TextAtom> component4() {
            return this.attributes;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        /* renamed from: component6, reason: from getter */
        public final TextAtom getQuantity() {
            return this.quantity;
        }

        /* renamed from: component7, reason: from getter */
        public final Caption getCaption() {
            return this.caption;
        }

        /* renamed from: component8, reason: from getter */
        public final ButtonV3Atom.SmallBorderlessButton getItemAction() {
            return this.itemAction;
        }

        /* renamed from: component9, reason: from getter */
        public final QuantitySelector getQuantitySelector() {
            return this.quantitySelector;
        }

        @NotNull
        public final Item copy(@NotNull RmsCheckbox checkbox, @NotNull String image, @NotNull TextAtom title, List<TextAtom> attributes, @NotNull Price price, TextAtom quantity, Caption caption, ButtonV3Atom.SmallBorderlessButton itemAction, QuantitySelector quantitySelector, Boolean isDisabled, AtomActionDTO action, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(checkbox, "checkbox");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            return new Item(checkbox, image, title, attributes, price, quantity, caption, itemAction, quantitySelector, isDisabled, action, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.checkbox, item.checkbox) && Intrinsics.d(this.image, item.image) && Intrinsics.d(this.title, item.title) && Intrinsics.d(this.attributes, item.attributes) && Intrinsics.d(this.price, item.price) && Intrinsics.d(this.quantity, item.quantity) && Intrinsics.d(this.caption, item.caption) && Intrinsics.d(this.itemAction, item.itemAction) && Intrinsics.d(this.quantitySelector, item.quantitySelector) && Intrinsics.d(this.isDisabled, item.isDisabled) && Intrinsics.d(this.action, item.action) && Intrinsics.d(this.testInfo, item.testInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final List<TextAtom> getAttributes() {
            return this.attributes;
        }

        public final Caption getCaption() {
            return this.caption;
        }

        @NotNull
        public final RmsCheckbox getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final ButtonV3Atom.SmallBorderlessButton getItemAction() {
            return this.itemAction;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public final TextAtom getQuantity() {
            return this.quantity;
        }

        public final QuantitySelector getQuantitySelector() {
            return this.quantitySelector;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = C2619v.b(g.a(this.checkbox.hashCode() * 31, 31, this.image), 31, this.title);
            List<TextAtom> list = this.attributes;
            int a11 = C3051a.a(this.price, (b11 + (list == null ? 0 : list.hashCode())) * 31, 31);
            TextAtom textAtom = this.quantity;
            int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Caption caption = this.caption;
            int hashCode2 = (hashCode + (caption == null ? 0 : caption.hashCode())) * 31;
            ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.itemAction;
            int hashCode3 = (hashCode2 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31;
            QuantitySelector quantitySelector = this.quantitySelector;
            int hashCode4 = (hashCode3 + (quantitySelector == null ? 0 : quantitySelector.hashCode())) * 31;
            Boolean bool = this.isDisabled;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode6 = (hashCode5 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        public final Boolean isDisabled() {
            return this.isDisabled;
        }

        @NotNull
        public String toString() {
            return "Item(checkbox=" + this.checkbox + ", image=" + this.image + ", title=" + this.title + ", attributes=" + this.attributes + ", price=" + this.price + ", quantity=" + this.quantity + ", caption=" + this.caption + ", itemAction=" + this.itemAction + ", quantitySelector=" + this.quantitySelector + ", isDisabled=" + this.isDisabled + ", action=" + this.action + ", testInfo=" + this.testInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Title {
        public static final int $stable = TextAtom.$stable;
        private final AtomActionDTO action;
        private final String icon;

        @NotNull
        private final TextAtom text;

        public Title(@NotNull TextAtom text, String str, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = str;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ Title copy$default(Title title, TextAtom textAtom, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = title.text;
            }
            if ((i11 & 2) != 0) {
                str = title.icon;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = title.action;
            }
            return title.copy(textAtom, str, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Title copy(@NotNull TextAtom text, String icon, AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Title(text, icon, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Title)) {
                return false;
            }
            Title title = (Title) other;
            return Intrinsics.d(this.text, title.text) && Intrinsics.d(this.icon, title.icon) && Intrinsics.d(this.action, title.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.icon;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.text;
            String str = this.icon;
            return G.c(b.d("Title(text=", ", icon=", str, ", action=", textAtom), this.action, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$TitleDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;", "subtitle", "<init>", "(Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;)V", "getTitle", "()Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Title;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleDTO {
        public static final int $stable = TextAtom.$stable;

        @NotNull
        private final Title subtitle;

        @NotNull
        private final Title title;

        public TitleDTO(@NotNull Title title, @NotNull Title subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.title = title;
            this.subtitle = subtitle;
        }

        public static /* synthetic */ TitleDTO copy$default(TitleDTO titleDTO, Title title, Title title2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                title = titleDTO.title;
            }
            if ((i11 & 2) != 0) {
                title2 = titleDTO.subtitle;
            }
            return titleDTO.copy(title, title2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Title getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Title getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TitleDTO copy(@NotNull Title title, @NotNull Title subtitle) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new TitleDTO(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleDTO)) {
                return false;
            }
            TitleDTO titleDTO = (TitleDTO) other;
            return Intrinsics.d(this.title, titleDTO.title) && Intrinsics.d(this.subtitle, titleDTO.subtitle);
        }

        @NotNull
        public final Title getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final Title getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TitleDTO(title=" + this.title + ", subtitle=" + this.subtitle + ")";
        }
    }

    public ReturnableItemDTO(@NotNull Title title, @NotNull Title subtitle, @NotNull List<Item> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.subtitle = subtitle;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnableItemDTO copy$default(ReturnableItemDTO returnableItemDTO, Title title, Title title2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            title = returnableItemDTO.title;
        }
        if ((i11 & 2) != 0) {
            title2 = returnableItemDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = returnableItemDTO.items;
        }
        return returnableItemDTO.copy(title, title2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Title getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Title getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<Item> component3() {
        return this.items;
    }

    @NotNull
    public final ReturnableItemDTO copy(@NotNull Title title, @NotNull Title subtitle, @NotNull List<Item> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReturnableItemDTO(title, subtitle, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnableItemDTO)) {
            return false;
        }
        ReturnableItemDTO returnableItemDTO = (ReturnableItemDTO) other;
        return Intrinsics.d(this.title, returnableItemDTO.title) && Intrinsics.d(this.subtitle, returnableItemDTO.subtitle) && Intrinsics.d(this.items, returnableItemDTO.items);
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    @NotNull
    public final Title getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final Title getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.items.hashCode() + ((this.subtitle.hashCode() + (this.title.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        Title title = this.title;
        Title title2 = this.subtitle;
        List<Item> list = this.items;
        StringBuilder sb2 = new StringBuilder("ReturnableItemDTO(title=");
        sb2.append(title);
        sb2.append(", subtitle=");
        sb2.append(title2);
        sb2.append(", items=");
        return C2618u.h(sb2, list, ")");
    }
}
