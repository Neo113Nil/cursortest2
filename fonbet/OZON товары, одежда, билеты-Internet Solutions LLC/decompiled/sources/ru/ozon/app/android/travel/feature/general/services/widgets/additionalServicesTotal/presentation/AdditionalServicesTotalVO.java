package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation;

import B90.C2619v;
import Bl.C2639a;
import D3.h;
import G.g;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000212BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b(\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u0010\u0018¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO$ServiceItem;", "serviceItems", "totalPrice", "priceDescription", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "detailsLinkButton", "", "bgElevation", "", "marginHorizontal", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;FI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getServiceItems", "()Ljava/util/List;", "getTotalPrice", "getPriceDescription", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getDetailsLinkButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "F", "getBgElevation", "()F", "I", "getMarginHorizontal", "ServiceItem", "AdditionalServicesTotalTheme", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalServicesTotalVO implements c {
    private final float bgElevation;
    private final LinkButtonVO detailsLinkButton;
    private final long id;
    private final int marginHorizontal;

    @NotNull
    private final TextAtom priceDescription;

    @NotNull
    private final List<ServiceItem> serviceItems;

    @NotNull
    private final TextAtom title;

    @NotNull
    private final TextAtom totalPrice;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO$AdditionalServicesTotalTheme;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SHADED", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AdditionalServicesTotalTheme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AdditionalServicesTotalTheme[] $VALUES;
        public static final AdditionalServicesTotalTheme DEFAULT = new AdditionalServicesTotalTheme("DEFAULT", 0);
        public static final AdditionalServicesTotalTheme SHADED = new AdditionalServicesTotalTheme("SHADED", 1);

        private static final /* synthetic */ AdditionalServicesTotalTheme[] $values() {
            return new AdditionalServicesTotalTheme[]{DEFAULT, SHADED};
        }

        static {
            AdditionalServicesTotalTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AdditionalServicesTotalTheme(String str, int i11) {
        }

        public static AdditionalServicesTotalTheme valueOf(String str) {
            return (AdditionalServicesTotalTheme) Enum.valueOf(AdditionalServicesTotalTheme.class, str);
        }

        public static AdditionalServicesTotalTheme[] values() {
            return (AdditionalServicesTotalTheme[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalVO$ServiceItem;", "", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "serviceKey", "", "serviceValues", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getServiceKey", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getServiceValues", "()Ljava/util/List;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServiceItem {
        private final long id;

        @NotNull
        private final TextAtom serviceKey;

        @NotNull
        private final List<TextAtom> serviceValues;

        public ServiceItem(long j11, @NotNull TextAtom serviceKey, @NotNull List<TextAtom> serviceValues) {
            Intrinsics.checkNotNullParameter(serviceKey, "serviceKey");
            Intrinsics.checkNotNullParameter(serviceValues, "serviceValues");
            this.id = j11;
            this.serviceKey = serviceKey;
            this.serviceValues = serviceValues;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceItem)) {
                return false;
            }
            ServiceItem serviceItem = (ServiceItem) other;
            return this.id == serviceItem.id && Intrinsics.d(this.serviceKey, serviceItem.serviceKey) && Intrinsics.d(this.serviceValues, serviceItem.serviceValues);
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getServiceKey() {
            return this.serviceKey;
        }

        @NotNull
        public final List<TextAtom> getServiceValues() {
            return this.serviceValues;
        }

        public int hashCode() {
            return this.serviceValues.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.serviceKey);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.serviceKey;
            return h.c(C2639a.c("ServiceItem(id=", j11, ", serviceKey=", textAtom), ", serviceValues=", this.serviceValues, ")");
        }
    }

    public AdditionalServicesTotalVO(long j11, @NotNull TextAtom title, @NotNull List<ServiceItem> serviceItems, @NotNull TextAtom totalPrice, @NotNull TextAtom priceDescription, LinkButtonVO linkButtonVO, float f7, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(serviceItems, "serviceItems");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        this.id = j11;
        this.title = title;
        this.serviceItems = serviceItems;
        this.totalPrice = totalPrice;
        this.priceDescription = priceDescription;
        this.detailsLinkButton = linkButtonVO;
        this.bgElevation = f7;
        this.marginHorizontal = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServicesTotalVO)) {
            return false;
        }
        AdditionalServicesTotalVO additionalServicesTotalVO = (AdditionalServicesTotalVO) other;
        return this.id == additionalServicesTotalVO.id && Intrinsics.d(this.title, additionalServicesTotalVO.title) && Intrinsics.d(this.serviceItems, additionalServicesTotalVO.serviceItems) && Intrinsics.d(this.totalPrice, additionalServicesTotalVO.totalPrice) && Intrinsics.d(this.priceDescription, additionalServicesTotalVO.priceDescription) && Intrinsics.d(this.detailsLinkButton, additionalServicesTotalVO.detailsLinkButton) && Float.compare(this.bgElevation, additionalServicesTotalVO.bgElevation) == 0 && this.marginHorizontal == additionalServicesTotalVO.marginHorizontal;
    }

    public final float getBgElevation() {
        return this.bgElevation;
    }

    public final LinkButtonVO getDetailsLinkButton() {
        return this.detailsLinkButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMarginHorizontal() {
        return this.marginHorizontal;
    }

    @NotNull
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<ServiceItem> getServiceItems() {
        return this.serviceItems;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(g.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.title), 31, this.serviceItems), 31, this.totalPrice), 31, this.priceDescription);
        LinkButtonVO linkButtonVO = this.detailsLinkButton;
        return Integer.hashCode(this.marginHorizontal) + Pk0.b.a(this.bgElevation, (b11 + (linkButtonVO == null ? 0 : linkButtonVO.hashCode())) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        List<ServiceItem> list = this.serviceItems;
        TextAtom textAtom2 = this.totalPrice;
        TextAtom textAtom3 = this.priceDescription;
        LinkButtonVO linkButtonVO = this.detailsLinkButton;
        float f7 = this.bgElevation;
        int i11 = this.marginHorizontal;
        StringBuilder c11 = C2639a.c("AdditionalServicesTotalVO(id=", j11, ", title=", textAtom);
        c11.append(", serviceItems=");
        c11.append(list);
        c11.append(", totalPrice=");
        c11.append(textAtom2);
        c11.append(", priceDescription=");
        c11.append(textAtom3);
        c11.append(", detailsLinkButton=");
        c11.append(linkButtonVO);
        c11.append(", bgElevation=");
        c11.append(f7);
        c11.append(", marginHorizontal=");
        c11.append(i11);
        c11.append(")");
        return c11.toString();
    }
}
