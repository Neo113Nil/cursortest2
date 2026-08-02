package ru.ozon.app.android.travel.molecules.view.serviceBlock.v4;

import B90.C2619v;
import Bl.C2639a;
import HY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v4.ServiceBlockV4DTO;
import ru.ozon.app.android.travel.molecules.dto.travelBadge.v2.TravelBadgeV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u0003123B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b-\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "content", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "moreAction", "", "Lru/ozon/app/android/travel/molecules/dto/travelBadge/v2/TravelBadgeV2DTO;", "travelBadgesList", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$PriceDescription;", "priceDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "changeServiceButton", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$AdditionalListItem;", "additionalList", "", "additionalListVisible", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;Ljava/util/List;Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$PriceDescription;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getContent", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "getMoreAction", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Ljava/util/List;", "getTravelBadgesList", "()Ljava/util/List;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$PriceDescription;", "getPriceDescription", "()Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$PriceDescription;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getChangeServiceButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getAdditionalList", "Z", "getAdditionalListVisible", "()Z", "AdditionalInfoVO", "CopyBlockVO", "AdditionalListItem", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ServiceBlockV4VO {
    public static final int $stable = 8;
    private final List<AdditionalListItem> additionalList;
    private final boolean additionalListVisible;
    private final ButtonV3Atom.SmallButton changeServiceButton;

    @NotNull
    private final TextAtom content;
    private final ButtonV3Atom.SmallBorderlessButton moreAction;
    private final ServiceBlockV4DTO.PriceDescription priceDescription;

    @NotNull
    private final TextAtom title;
    private final List<TravelBadgeV2DTO> travelBadgesList;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$AdditionalInfoVO;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$AdditionalListItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "info", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;", "icon", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getInfo", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;", "getIcon", "()Lru/ozon/app/android/atoms/data/list/ListElementAtom$Marker$Icon;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfoVO implements AdditionalListItem {
        private final ListElementAtom.Marker.Icon icon;
        private final long id;

        @NotNull
        private final TextAtom info;

        public AdditionalInfoVO(long j11, @NotNull TextAtom info, ListElementAtom.Marker.Icon icon) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.id = j11;
            this.info = info;
            this.icon = icon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalInfoVO)) {
                return false;
            }
            AdditionalInfoVO additionalInfoVO = (AdditionalInfoVO) other;
            return this.id == additionalInfoVO.id && Intrinsics.d(this.info, additionalInfoVO.info) && Intrinsics.d(this.icon, additionalInfoVO.icon);
        }

        public final ListElementAtom.Marker.Icon getIcon() {
            return this.icon;
        }

        @Override // ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.ServiceBlockV4VO.AdditionalListItem
        public long getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getInfo() {
            return this.info;
        }

        public int hashCode() {
            int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.info);
            ListElementAtom.Marker.Icon icon = this.icon;
            return b11 + (icon == null ? 0 : icon.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.info;
            ListElementAtom.Marker.Icon icon = this.icon;
            StringBuilder c11 = C2639a.c("AdditionalInfoVO(id=", j11, ", info=", textAtom);
            c11.append(", icon=");
            c11.append(icon);
            c11.append(")");
            return c11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$AdditionalListItem;", "", "id", "", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$AdditionalInfoVO;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$CopyBlockVO;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AdditionalListItem {
        long getId();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$CopyBlockVO;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$AdditionalListItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$CopyItem;", "clipboard", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$CopyItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$CopyItem;", "getClipboard", "()Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v4/ServiceBlockV4DTO$CopyItem;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyBlockVO implements AdditionalListItem {

        @NotNull
        private final ServiceBlockV4DTO.CopyItem clipboard;
        private final long id;

        @NotNull
        private final TextAtom text;

        public CopyBlockVO(long j11, @NotNull TextAtom text, @NotNull ServiceBlockV4DTO.CopyItem clipboard) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(clipboard, "clipboard");
            this.id = j11;
            this.text = text;
            this.clipboard = clipboard;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CopyBlockVO)) {
                return false;
            }
            CopyBlockVO copyBlockVO = (CopyBlockVO) other;
            return this.id == copyBlockVO.id && Intrinsics.d(this.text, copyBlockVO.text) && Intrinsics.d(this.clipboard, copyBlockVO.clipboard);
        }

        @NotNull
        public final ServiceBlockV4DTO.CopyItem getClipboard() {
            return this.clipboard;
        }

        @Override // ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.ServiceBlockV4VO.AdditionalListItem
        public long getId() {
            return this.id;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public int hashCode() {
            return this.clipboard.hashCode() + C2619v.b(Long.hashCode(this.id) * 31, 31, this.text);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.text;
            ServiceBlockV4DTO.CopyItem copyItem = this.clipboard;
            StringBuilder c11 = C2639a.c("CopyBlockVO(id=", j11, ", text=", textAtom);
            c11.append(", clipboard=");
            c11.append(copyItem);
            c11.append(")");
            return c11.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceBlockV4VO(@NotNull TextAtom title, @NotNull TextAtom content, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, List<TravelBadgeV2DTO> list, ServiceBlockV4DTO.PriceDescription priceDescription, ButtonV3Atom.SmallButton smallButton, List<? extends AdditionalListItem> list2, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.title = title;
        this.content = content;
        this.moreAction = smallBorderlessButton;
        this.travelBadgesList = list;
        this.priceDescription = priceDescription;
        this.changeServiceButton = smallButton;
        this.additionalList = list2;
        this.additionalListVisible = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceBlockV4VO)) {
            return false;
        }
        ServiceBlockV4VO serviceBlockV4VO = (ServiceBlockV4VO) other;
        return Intrinsics.d(this.title, serviceBlockV4VO.title) && Intrinsics.d(this.content, serviceBlockV4VO.content) && Intrinsics.d(this.moreAction, serviceBlockV4VO.moreAction) && Intrinsics.d(this.travelBadgesList, serviceBlockV4VO.travelBadgesList) && Intrinsics.d(this.priceDescription, serviceBlockV4VO.priceDescription) && Intrinsics.d(this.changeServiceButton, serviceBlockV4VO.changeServiceButton) && Intrinsics.d(this.additionalList, serviceBlockV4VO.additionalList) && this.additionalListVisible == serviceBlockV4VO.additionalListVisible;
    }

    public final List<AdditionalListItem> getAdditionalList() {
        return this.additionalList;
    }

    public final boolean getAdditionalListVisible() {
        return this.additionalListVisible;
    }

    public final ButtonV3Atom.SmallButton getChangeServiceButton() {
        return this.changeServiceButton;
    }

    @NotNull
    public final TextAtom getContent() {
        return this.content;
    }

    public final ButtonV3Atom.SmallBorderlessButton getMoreAction() {
        return this.moreAction;
    }

    public final ServiceBlockV4DTO.PriceDescription getPriceDescription() {
        return this.priceDescription;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final List<TravelBadgeV2DTO> getTravelBadgesList() {
        return this.travelBadgesList;
    }

    public int hashCode() {
        int b11 = C2619v.b(this.title.hashCode() * 31, 31, this.content);
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.moreAction;
        int hashCode = (b11 + (smallBorderlessButton == null ? 0 : smallBorderlessButton.hashCode())) * 31;
        List<TravelBadgeV2DTO> list = this.travelBadgesList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ServiceBlockV4DTO.PriceDescription priceDescription = this.priceDescription;
        int hashCode3 = (hashCode2 + (priceDescription == null ? 0 : priceDescription.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.changeServiceButton;
        int hashCode4 = (hashCode3 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        List<AdditionalListItem> list2 = this.additionalList;
        return Boolean.hashCode(this.additionalListVisible) + ((hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.content;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.moreAction;
        List<TravelBadgeV2DTO> list = this.travelBadgesList;
        ServiceBlockV4DTO.PriceDescription priceDescription = this.priceDescription;
        ButtonV3Atom.SmallButton smallButton = this.changeServiceButton;
        List<AdditionalListItem> list2 = this.additionalList;
        boolean z11 = this.additionalListVisible;
        StringBuilder a11 = a.a("ServiceBlockV4VO(title=", textAtom, ", content=", textAtom2, ", moreAction=");
        a11.append(smallBorderlessButton);
        a11.append(", travelBadgesList=");
        a11.append(list);
        a11.append(", priceDescription=");
        a11.append(priceDescription);
        a11.append(", changeServiceButton=");
        a11.append(smallButton);
        a11.append(", additionalList=");
        a11.append(list2);
        a11.append(", additionalListVisible=");
        a11.append(z11);
        a11.append(")");
        return a11.toString();
    }
}
