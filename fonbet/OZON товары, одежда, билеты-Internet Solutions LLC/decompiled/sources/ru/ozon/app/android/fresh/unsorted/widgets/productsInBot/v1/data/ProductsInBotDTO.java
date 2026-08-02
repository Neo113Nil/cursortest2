package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.data;

import B0.C2454a;
import B90.C2619v;
import G.g;
import Kk.C3532b;
import Pk0.c;
import T7.P;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO;", "", "items", "", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO$BotItemDTO;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "BotItemDTO", "BotConfirmButtonDTO", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductsInBotDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.LargeButton button;

    @NotNull
    private final List<BotItemDTO> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO$BotConfirmButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BotConfirmButtonDTO {
        public static final int $stable = ButtonV3Atom.LargeButton.$stable;

        @NotNull
        private final ButtonV3Atom.LargeButton button;

        public BotConfirmButtonDTO(@NotNull ButtonV3Atom.LargeButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
        }

        public static /* synthetic */ BotConfirmButtonDTO copy$default(BotConfirmButtonDTO botConfirmButtonDTO, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                largeButton = botConfirmButtonDTO.button;
            }
            return botConfirmButtonDTO.copy(largeButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        @NotNull
        public final BotConfirmButtonDTO copy(@NotNull ButtonV3Atom.LargeButton button) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new BotConfirmButtonDTO(button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BotConfirmButtonDTO) && Intrinsics.d(this.button, ((BotConfirmButtonDTO) other).button);
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getButton() {
            return this.button;
        }

        public int hashCode() {
            return this.button.hashCode();
        }

        @NotNull
        public String toString() {
            return "BotConfirmButtonDTO(button=" + this.button + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ji\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\tHÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!¨\u00061"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO$BotItemDTO;", "", "price", "Lru/ozon/uni/atoms/data/price/Price;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "image", "", "maxQuantity", "", "skuId", "", "isChecked", "", "aspects", "minusButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "plusButton", "<init>", "(Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;IJZLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImage", "()Ljava/lang/String;", "getMaxQuantity", "()I", "getSkuId", "()J", "()Z", "getAspects", "getMinusButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getPlusButton", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BotItemDTO {
        public static final int $stable;
        private final TextAtom aspects;

        @NotNull
        private final String image;
        private final boolean isChecked;
        private final int maxQuantity;
        private final ButtonV3Atom.SmallIconButton minusButton;
        private final ButtonV3Atom.SmallIconButton plusButton;

        @NotNull
        private final Price price;
        private final long skuId;

        @NotNull
        private final TextAtom title;

        static {
            int i11 = ButtonV3Atom.SmallIconButton.$stable;
            int i12 = TextAtom.$stable;
            $stable = i11 | i12 | i12 | Price.$stable;
        }

        public BotItemDTO(@NotNull Price price, @NotNull TextAtom title, @NotNull String image, int i11, long j11, boolean z11, TextAtom textAtom, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            this.price = price;
            this.title = title;
            this.image = image;
            this.maxQuantity = i11;
            this.skuId = j11;
            this.isChecked = z11;
            this.aspects = textAtom;
            this.minusButton = smallIconButton;
            this.plusButton = smallIconButton2;
        }

        public static /* synthetic */ BotItemDTO copy$default(BotItemDTO botItemDTO, Price price, TextAtom textAtom, String str, int i11, long j11, boolean z11, TextAtom textAtom2, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                price = botItemDTO.price;
            }
            if ((i12 & 2) != 0) {
                textAtom = botItemDTO.title;
            }
            if ((i12 & 4) != 0) {
                str = botItemDTO.image;
            }
            if ((i12 & 8) != 0) {
                i11 = botItemDTO.maxQuantity;
            }
            if ((i12 & 16) != 0) {
                j11 = botItemDTO.skuId;
            }
            if ((i12 & 32) != 0) {
                z11 = botItemDTO.isChecked;
            }
            if ((i12 & 64) != 0) {
                textAtom2 = botItemDTO.aspects;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                smallIconButton = botItemDTO.minusButton;
            }
            if ((i12 & 256) != 0) {
                smallIconButton2 = botItemDTO.plusButton;
            }
            long j12 = j11;
            String str2 = str;
            int i13 = i11;
            return botItemDTO.copy(price, textAtom, str2, i13, j12, z11, textAtom2, smallIconButton, smallIconButton2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxQuantity() {
            return this.maxQuantity;
        }

        /* renamed from: component5, reason: from getter */
        public final long getSkuId() {
            return this.skuId;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        /* renamed from: component7, reason: from getter */
        public final TextAtom getAspects() {
            return this.aspects;
        }

        /* renamed from: component8, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getMinusButton() {
            return this.minusButton;
        }

        /* renamed from: component9, reason: from getter */
        public final ButtonV3Atom.SmallIconButton getPlusButton() {
            return this.plusButton;
        }

        @NotNull
        public final BotItemDTO copy(@NotNull Price price, @NotNull TextAtom title, @NotNull String image, int maxQuantity, long skuId, boolean isChecked, TextAtom aspects, ButtonV3Atom.SmallIconButton minusButton, ButtonV3Atom.SmallIconButton plusButton) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            return new BotItemDTO(price, title, image, maxQuantity, skuId, isChecked, aspects, minusButton, plusButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BotItemDTO)) {
                return false;
            }
            BotItemDTO botItemDTO = (BotItemDTO) other;
            return Intrinsics.d(this.price, botItemDTO.price) && Intrinsics.d(this.title, botItemDTO.title) && Intrinsics.d(this.image, botItemDTO.image) && this.maxQuantity == botItemDTO.maxQuantity && this.skuId == botItemDTO.skuId && this.isChecked == botItemDTO.isChecked && Intrinsics.d(this.aspects, botItemDTO.aspects) && Intrinsics.d(this.minusButton, botItemDTO.minusButton) && Intrinsics.d(this.plusButton, botItemDTO.plusButton);
        }

        public final TextAtom getAspects() {
            return this.aspects;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final int getMaxQuantity() {
            return this.maxQuantity;
        }

        public final ButtonV3Atom.SmallIconButton getMinusButton() {
            return this.minusButton;
        }

        public final ButtonV3Atom.SmallIconButton getPlusButton() {
            return this.plusButton;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public final long getSkuId() {
            return this.skuId;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = C3532b.a(c.a(C2454a.a(this.maxQuantity, g.a(C2619v.b(this.price.hashCode() * 31, 31, this.title), 31, this.image), 31), 31, this.skuId), 31, this.isChecked);
            TextAtom textAtom = this.aspects;
            int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            ButtonV3Atom.SmallIconButton smallIconButton = this.minusButton;
            int hashCode2 = (hashCode + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
            ButtonV3Atom.SmallIconButton smallIconButton2 = this.plusButton;
            return hashCode2 + (smallIconButton2 != null ? smallIconButton2.hashCode() : 0);
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        @NotNull
        public String toString() {
            Price price = this.price;
            TextAtom textAtom = this.title;
            String str = this.image;
            int i11 = this.maxQuantity;
            long j11 = this.skuId;
            boolean z11 = this.isChecked;
            TextAtom textAtom2 = this.aspects;
            ButtonV3Atom.SmallIconButton smallIconButton = this.minusButton;
            ButtonV3Atom.SmallIconButton smallIconButton2 = this.plusButton;
            StringBuilder sb2 = new StringBuilder("BotItemDTO(price=");
            sb2.append(price);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", image=");
            Pk0.g.d(i11, str, ", maxQuantity=", ", skuId=", sb2);
            sb2.append(j11);
            sb2.append(", isChecked=");
            sb2.append(z11);
            sb2.append(", aspects=");
            sb2.append(textAtom2);
            sb2.append(", minusButton=");
            sb2.append(smallIconButton);
            sb2.append(", plusButton=");
            sb2.append(smallIconButton2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public ProductsInBotDTO(@NotNull List<BotItemDTO> items, @NotNull ButtonV3Atom.LargeButton button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.items = items;
        this.button = button;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductsInBotDTO copy$default(ProductsInBotDTO productsInBotDTO, List list, ButtonV3Atom.LargeButton largeButton, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = productsInBotDTO.items;
        }
        if ((i11 & 2) != 0) {
            largeButton = productsInBotDTO.button;
        }
        if ((i11 & 4) != 0) {
            map = productsInBotDTO.trackingInfo;
        }
        return productsInBotDTO.copy(list, largeButton, map);
    }

    @NotNull
    public final List<BotItemDTO> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProductsInBotDTO copy(@NotNull List<BotItemDTO> items, @NotNull ButtonV3Atom.LargeButton button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        return new ProductsInBotDTO(items, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductsInBotDTO)) {
            return false;
        }
        ProductsInBotDTO productsInBotDTO = (ProductsInBotDTO) other;
        return Intrinsics.d(this.items, productsInBotDTO.items) && Intrinsics.d(this.button, productsInBotDTO.button) && Intrinsics.d(this.trackingInfo, productsInBotDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @NotNull
    public final List<BotItemDTO> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.button, this.items.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        List<BotItemDTO> list = this.items;
        ButtonV3Atom.LargeButton largeButton = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ProductsInBotDTO(items=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(largeButton);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
