package ru.ozon.app.android.bank.widgets.aboutInstallment.data;

import B90.C2619v;
import G.g;
import HY.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.disclosure.DisclosureAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B[\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0001\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0003\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/bank/widgets/aboutInstallment/data/AboutInstallmentDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subTitle", "moreDisclosure", "Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "items", "", "Lru/ozon/app/android/bank/widgets/aboutInstallment/data/AboutInstallmentDTO$Item;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubTitle", "getMoreDisclosure", "()Lru/ozon/app/android/atoms/data/disclosure/DisclosureAtom;", "getItems", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Item", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AboutInstallmentDTO {
    private final AtomActionDTO action;

    @NotNull
    private final List<Item> items;
    private final DisclosureAtom moreDisclosure;

    @NotNull
    private final TextAtom subTitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/bank/widgets/aboutInstallment/data/AboutInstallmentDTO$Item;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "image", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Item {

        @NotNull
        private final String image;

        @NotNull
        private final TextAtom text;

        public Item(@i(name = "text") @NotNull TextAtom text, @i(name = "image") @NotNull String image) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(image, "image");
            this.text = text;
            this.image = image;
        }

        public static /* synthetic */ Item copy$default(Item item, TextAtom textAtom, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = item.text;
            }
            if ((i11 & 2) != 0) {
                str = item.image;
            }
            return item.copy(textAtom, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final Item copy(@i(name = "text") @NotNull TextAtom text, @i(name = "image") @NotNull String image) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(image, "image");
            return new Item(text, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.text, item.text) && Intrinsics.d(this.image, item.image);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.image.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Item(text=" + this.text + ", image=" + this.image + ")";
        }
    }

    public AboutInstallmentDTO(@i(name = "title") @NotNull TextAtom title, @i(name = "subtitle") @NotNull TextAtom subTitle, @i(name = "more") DisclosureAtom disclosureAtom, @i(name = "items") @NotNull List<Item> items, @i(name = "action") AtomActionDTO atomActionDTO, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.subTitle = subTitle;
        this.moreDisclosure = disclosureAtom;
        this.items = items;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AboutInstallmentDTO copy$default(AboutInstallmentDTO aboutInstallmentDTO, TextAtom textAtom, TextAtom textAtom2, DisclosureAtom disclosureAtom, List list, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = aboutInstallmentDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = aboutInstallmentDTO.subTitle;
        }
        if ((i11 & 4) != 0) {
            disclosureAtom = aboutInstallmentDTO.moreDisclosure;
        }
        if ((i11 & 8) != 0) {
            list = aboutInstallmentDTO.items;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = aboutInstallmentDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = aboutInstallmentDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return aboutInstallmentDTO.copy(textAtom, textAtom2, disclosureAtom, list, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final DisclosureAtom getMoreDisclosure() {
        return this.moreDisclosure;
    }

    @NotNull
    public final List<Item> component4() {
        return this.items;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final AboutInstallmentDTO copy(@i(name = "title") @NotNull TextAtom title, @i(name = "subtitle") @NotNull TextAtom subTitle, @i(name = "more") DisclosureAtom moreDisclosure, @i(name = "items") @NotNull List<Item> items, @i(name = "action") AtomActionDTO action, @i(name = "trackingInfo") Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        return new AboutInstallmentDTO(title, subTitle, moreDisclosure, items, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AboutInstallmentDTO)) {
            return false;
        }
        AboutInstallmentDTO aboutInstallmentDTO = (AboutInstallmentDTO) other;
        return Intrinsics.d(this.title, aboutInstallmentDTO.title) && Intrinsics.d(this.subTitle, aboutInstallmentDTO.subTitle) && Intrinsics.d(this.moreDisclosure, aboutInstallmentDTO.moreDisclosure) && Intrinsics.d(this.items, aboutInstallmentDTO.items) && Intrinsics.d(this.action, aboutInstallmentDTO.action) && Intrinsics.d(this.trackingInfo, aboutInstallmentDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final List<Item> getItems() {
        return this.items;
    }

    public final DisclosureAtom getMoreDisclosure() {
        return this.moreDisclosure;
    }

    @NotNull
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.subTitle);
        DisclosureAtom disclosureAtom = this.moreDisclosure;
        int b12 = g.b((b11 + (disclosureAtom == null ? 0 : disclosureAtom.hashCode())) * 31, 31, this.items);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (b12 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        DisclosureAtom disclosureAtom = this.moreDisclosure;
        List<Item> list = this.items;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = a.a("AboutInstallmentDTO(title=", textAtom, ", subTitle=", textAtom2, ", moreDisclosure=");
        a11.append(disclosureAtom);
        a11.append(", items=");
        a11.append(list);
        a11.append(", action=");
        return D40.a.d(a11, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
