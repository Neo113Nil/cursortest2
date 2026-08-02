package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation;

import B0.C2454a;
import G.g;
import Nh.a;
import Ns.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003678BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jp\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u001bR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "initialVisibleItemsCount", "", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;", "items", "visibleItems", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "settings", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;", "expandCollapseButton", "LWZ/t;", "viewTokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;ILjava/util/List;Ljava/util/List;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;LWZ/t;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;ILjava/util/List;Ljava/util/List;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;LWZ/t;)Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "I", "getInitialVisibleItemsCount", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getVisibleItems", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;", "getExpandCollapseButton", "()Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;", "LWZ/t;", "getViewTokenizedEvent", "()LWZ/t;", "ItemVO", "PriceVO", "ExpandCollapseButtonVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DirectFlightsDropdownVO implements c {
    private final ExpandCollapseButtonVO expandCollapseButton;
    private final long id;
    private final int initialVisibleItemsCount;

    @NotNull
    private final List<ItemVO> items;

    @NotNull
    private final TravelWidgetSettingsVO settings;

    @NotNull
    private final TextDTO title;
    private final t viewTokenizedEvent;

    @NotNull
    private final List<ItemVO> visibleItems;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ItemVO;", "", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "aviaIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "aviaTitle", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$PriceVO;", "price", "", "textItems", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(ILru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$PriceVO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getAviaIcon", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAviaTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$PriceVO;", "getPrice", "()Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$PriceVO;", "Ljava/util/List;", "getTextItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemVO {

        @NotNull
        private final ImageDTO aviaIcon;

        @NotNull
        private final TextDTO aviaTitle;

        @NotNull
        private final CommonControlSettings common;
        private final int id;

        @NotNull
        private final PriceVO price;

        @NotNull
        private final List<TextDTO> textItems;

        public ItemVO(int i11, @NotNull ImageDTO aviaIcon, @NotNull TextDTO aviaTitle, @NotNull PriceVO price, @NotNull List<TextDTO> textItems, @NotNull CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(aviaIcon, "aviaIcon");
            Intrinsics.checkNotNullParameter(aviaTitle, "aviaTitle");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(textItems, "textItems");
            Intrinsics.checkNotNullParameter(common, "common");
            this.id = i11;
            this.aviaIcon = aviaIcon;
            this.aviaTitle = aviaTitle;
            this.price = price;
            this.textItems = textItems;
            this.common = common;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemVO)) {
                return false;
            }
            ItemVO itemVO = (ItemVO) other;
            return this.id == itemVO.id && Intrinsics.d(this.aviaIcon, itemVO.aviaIcon) && Intrinsics.d(this.aviaTitle, itemVO.aviaTitle) && Intrinsics.d(this.price, itemVO.price) && Intrinsics.d(this.textItems, itemVO.textItems) && Intrinsics.d(this.common, itemVO.common);
        }

        @NotNull
        public final ImageDTO getAviaIcon() {
            return this.aviaIcon;
        }

        @NotNull
        public final TextDTO getAviaTitle() {
            return this.aviaTitle;
        }

        @NotNull
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final PriceVO getPrice() {
            return this.price;
        }

        @NotNull
        public final List<TextDTO> getTextItems() {
            return this.textItems;
        }

        public int hashCode() {
            return this.common.hashCode() + g.b((this.price.hashCode() + b.a(this.aviaTitle, a.b(this.aviaIcon, Integer.hashCode(this.id) * 31, 31), 31)) * 31, 31, this.textItems);
        }

        @NotNull
        public String toString() {
            return "ItemVO(id=" + this.id + ", aviaIcon=" + this.aviaIcon + ", aviaTitle=" + this.aviaTitle + ", price=" + this.price + ", textItems=" + this.textItems + ", common=" + this.common + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$PriceVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "label", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceVO {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO label;

        public PriceVO(@NotNull TextDTO label, @NotNull IconDTO icon) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.label = label;
            this.icon = icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceVO)) {
                return false;
            }
            PriceVO priceVO = (PriceVO) other;
            return Intrinsics.d(this.label, priceVO.label) && Intrinsics.d(this.icon, priceVO.icon);
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.icon.hashCode() + (this.label.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "PriceVO(label=" + this.label + ", icon=" + this.icon + ")";
        }
    }

    public DirectFlightsDropdownVO(long j11, @NotNull TextDTO title, int i11, @NotNull List<ItemVO> items, @NotNull List<ItemVO> visibleItems, @NotNull TravelWidgetSettingsVO settings, ExpandCollapseButtonVO expandCollapseButtonVO, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.id = j11;
        this.title = title;
        this.initialVisibleItemsCount = i11;
        this.items = items;
        this.visibleItems = visibleItems;
        this.settings = settings;
        this.expandCollapseButton = expandCollapseButtonVO;
        this.viewTokenizedEvent = tVar;
    }

    public static /* synthetic */ DirectFlightsDropdownVO copy$default(DirectFlightsDropdownVO directFlightsDropdownVO, long j11, TextDTO textDTO, int i11, List list, List list2, TravelWidgetSettingsVO travelWidgetSettingsVO, ExpandCollapseButtonVO expandCollapseButtonVO, t tVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = directFlightsDropdownVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            textDTO = directFlightsDropdownVO.title;
        }
        TextDTO textDTO2 = textDTO;
        if ((i12 & 4) != 0) {
            i11 = directFlightsDropdownVO.initialVisibleItemsCount;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            list = directFlightsDropdownVO.items;
        }
        return directFlightsDropdownVO.copy(j12, textDTO2, i13, list, (i12 & 16) != 0 ? directFlightsDropdownVO.visibleItems : list2, (i12 & 32) != 0 ? directFlightsDropdownVO.settings : travelWidgetSettingsVO, (i12 & 64) != 0 ? directFlightsDropdownVO.expandCollapseButton : expandCollapseButtonVO, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? directFlightsDropdownVO.viewTokenizedEvent : tVar);
    }

    @NotNull
    public final DirectFlightsDropdownVO copy(long id2, @NotNull TextDTO title, int initialVisibleItemsCount, @NotNull List<ItemVO> items, @NotNull List<ItemVO> visibleItems, @NotNull TravelWidgetSettingsVO settings, ExpandCollapseButtonVO expandCollapseButton, t viewTokenizedEvent) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new DirectFlightsDropdownVO(id2, title, initialVisibleItemsCount, items, visibleItems, settings, expandCollapseButton, viewTokenizedEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DirectFlightsDropdownVO)) {
            return false;
        }
        DirectFlightsDropdownVO directFlightsDropdownVO = (DirectFlightsDropdownVO) other;
        return this.id == directFlightsDropdownVO.id && Intrinsics.d(this.title, directFlightsDropdownVO.title) && this.initialVisibleItemsCount == directFlightsDropdownVO.initialVisibleItemsCount && Intrinsics.d(this.items, directFlightsDropdownVO.items) && Intrinsics.d(this.visibleItems, directFlightsDropdownVO.visibleItems) && Intrinsics.d(this.settings, directFlightsDropdownVO.settings) && Intrinsics.d(this.expandCollapseButton, directFlightsDropdownVO.expandCollapseButton) && Intrinsics.d(this.viewTokenizedEvent, directFlightsDropdownVO.viewTokenizedEvent);
    }

    public final ExpandCollapseButtonVO getExpandCollapseButton() {
        return this.expandCollapseButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getInitialVisibleItemsCount() {
        return this.initialVisibleItemsCount;
    }

    @NotNull
    public final List<ItemVO> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TravelWidgetSettingsVO getSettings() {
        return this.settings;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final t getViewTokenizedEvent() {
        return this.viewTokenizedEvent;
    }

    @NotNull
    public final List<ItemVO> getVisibleItems() {
        return this.visibleItems;
    }

    public int hashCode() {
        int hashCode = (this.settings.hashCode() + g.b(g.b(C2454a.a(this.initialVisibleItemsCount, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31), 31, this.items), 31, this.visibleItems)) * 31;
        ExpandCollapseButtonVO expandCollapseButtonVO = this.expandCollapseButton;
        int hashCode2 = (hashCode + (expandCollapseButtonVO == null ? 0 : expandCollapseButtonVO.hashCode())) * 31;
        t tVar = this.viewTokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        int i11 = this.initialVisibleItemsCount;
        List<ItemVO> list = this.items;
        List<ItemVO> list2 = this.visibleItems;
        TravelWidgetSettingsVO travelWidgetSettingsVO = this.settings;
        ExpandCollapseButtonVO expandCollapseButtonVO = this.expandCollapseButton;
        t tVar = this.viewTokenizedEvent;
        StringBuilder b11 = TY.a.b("DirectFlightsDropdownVO(id=", j11, ", title=", textDTO);
        b11.append(", initialVisibleItemsCount=");
        b11.append(i11);
        b11.append(", items=");
        b11.append(list);
        b11.append(", visibleItems=");
        b11.append(list2);
        b11.append(", settings=");
        b11.append(travelWidgetSettingsVO);
        b11.append(", expandCollapseButton=");
        b11.append(expandCollapseButtonVO);
        b11.append(", viewTokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJV\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b\u000b\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "collapsedLabel", "expandedLabel", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "LWZ/t;", "clickExpandTracking", "clickCollapseTracking", "", "isExpanded", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;LWZ/t;LWZ/t;Z)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;LWZ/t;LWZ/t;Z)Lru/ozon/app/android/travel/feature/avia/widgets/directFlightsDropdown/v1/presentation/DirectFlightsDropdownVO$ExpandCollapseButtonVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCollapsedLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getExpandedLabel", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "LWZ/t;", "getClickExpandTracking", "()LWZ/t;", "getClickCollapseTracking", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpandCollapseButtonVO {
        private final t clickCollapseTracking;
        private final t clickExpandTracking;
        private final TextDTO collapsedLabel;
        private final TextDTO expandedLabel;
        private final IconDTO icon;
        private final boolean isExpanded;

        public ExpandCollapseButtonVO(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, t tVar, t tVar2, boolean z11) {
            this.collapsedLabel = textDTO;
            this.expandedLabel = textDTO2;
            this.icon = iconDTO;
            this.clickExpandTracking = tVar;
            this.clickCollapseTracking = tVar2;
            this.isExpanded = z11;
        }

        public static /* synthetic */ ExpandCollapseButtonVO copy$default(ExpandCollapseButtonVO expandCollapseButtonVO, TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, t tVar, t tVar2, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = expandCollapseButtonVO.collapsedLabel;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = expandCollapseButtonVO.expandedLabel;
            }
            if ((i11 & 4) != 0) {
                iconDTO = expandCollapseButtonVO.icon;
            }
            if ((i11 & 8) != 0) {
                tVar = expandCollapseButtonVO.clickExpandTracking;
            }
            if ((i11 & 16) != 0) {
                tVar2 = expandCollapseButtonVO.clickCollapseTracking;
            }
            if ((i11 & 32) != 0) {
                z11 = expandCollapseButtonVO.isExpanded;
            }
            t tVar3 = tVar2;
            boolean z12 = z11;
            return expandCollapseButtonVO.copy(textDTO, textDTO2, iconDTO, tVar, tVar3, z12);
        }

        @NotNull
        public final ExpandCollapseButtonVO copy(TextDTO collapsedLabel, TextDTO expandedLabel, IconDTO icon, t clickExpandTracking, t clickCollapseTracking, boolean isExpanded) {
            return new ExpandCollapseButtonVO(collapsedLabel, expandedLabel, icon, clickExpandTracking, clickCollapseTracking, isExpanded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExpandCollapseButtonVO)) {
                return false;
            }
            ExpandCollapseButtonVO expandCollapseButtonVO = (ExpandCollapseButtonVO) other;
            return Intrinsics.d(this.collapsedLabel, expandCollapseButtonVO.collapsedLabel) && Intrinsics.d(this.expandedLabel, expandCollapseButtonVO.expandedLabel) && Intrinsics.d(this.icon, expandCollapseButtonVO.icon) && Intrinsics.d(this.clickExpandTracking, expandCollapseButtonVO.clickExpandTracking) && Intrinsics.d(this.clickCollapseTracking, expandCollapseButtonVO.clickCollapseTracking) && this.isExpanded == expandCollapseButtonVO.isExpanded;
        }

        public final t getClickCollapseTracking() {
            return this.clickCollapseTracking;
        }

        public final t getClickExpandTracking() {
            return this.clickExpandTracking;
        }

        public final TextDTO getCollapsedLabel() {
            return this.collapsedLabel;
        }

        public final TextDTO getExpandedLabel() {
            return this.expandedLabel;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            TextDTO textDTO = this.collapsedLabel;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            TextDTO textDTO2 = this.expandedLabel;
            int hashCode2 = (hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            t tVar = this.clickExpandTracking;
            int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.clickCollapseTracking;
            return Boolean.hashCode(this.isExpanded) + ((hashCode4 + (tVar2 != null ? tVar2.hashCode() : 0)) * 31);
        }

        /* renamed from: isExpanded, reason: from getter */
        public final boolean getIsExpanded() {
            return this.isExpanded;
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.collapsedLabel;
            TextDTO textDTO2 = this.expandedLabel;
            IconDTO iconDTO = this.icon;
            t tVar = this.clickExpandTracking;
            t tVar2 = this.clickCollapseTracking;
            boolean z11 = this.isExpanded;
            StringBuilder g10 = D3.g.g("ExpandCollapseButtonVO(collapsedLabel=", textDTO, ", expandedLabel=", textDTO2, ", icon=");
            g10.append(iconDTO);
            g10.append(", clickExpandTracking=");
            g10.append(tVar);
            g10.append(", clickCollapseTracking=");
            g10.append(tVar2);
            g10.append(", isExpanded=");
            g10.append(z11);
            g10.append(")");
            return g10.toString();
        }

        public /* synthetic */ ExpandCollapseButtonVO(TextDTO textDTO, TextDTO textDTO2, IconDTO iconDTO, t tVar, t tVar2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, iconDTO, tVar, tVar2, (i11 & 32) != 0 ? false : z11);
        }
    }

    public /* synthetic */ DirectFlightsDropdownVO(long j11, TextDTO textDTO, int i11, List list, List list2, TravelWidgetSettingsVO travelWidgetSettingsVO, ExpandCollapseButtonVO expandCollapseButtonVO, t tVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textDTO, i11, list, (i12 & 16) != 0 ? C7714v.K0(list, i11) : list2, travelWidgetSettingsVO, expandCollapseButtonVO, tVar);
    }
}
