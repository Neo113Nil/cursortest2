package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo;

import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\"B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO$FooterItem;", "footerContent", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "seatsLeft", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getFooterContent", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSeatsLeft", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "FooterItem", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelRailwaySeatSelectFooterVO implements c {

    @NotNull
    private final List<FooterItem> footerContent;
    private final long id;
    private final TextAtom seatsLeft;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\r\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO$FooterItem;", "", "id", "", "getId", "()I", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AdditionalServiceVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AlternativePriceBlockVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AtomDTOHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/BlockDividerVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/BonusVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/CarriageDetailsVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/IslandVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/LineDividerVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/PriceBlockVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/RailwayServicesVOHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/RoundedCellHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/SelectedSeatVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TariffVO;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FooterItem {
        int getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelRailwaySeatSelectFooterVO(long j11, @NotNull List<? extends FooterItem> footerContent, TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        this.id = j11;
        this.footerContent = footerContent;
        this.seatsLeft = textAtom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelRailwaySeatSelectFooterVO copy$default(TravelRailwaySeatSelectFooterVO travelRailwaySeatSelectFooterVO, long j11, List list, TextAtom textAtom, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = travelRailwaySeatSelectFooterVO.id;
        }
        if ((i11 & 2) != 0) {
            list = travelRailwaySeatSelectFooterVO.footerContent;
        }
        if ((i11 & 4) != 0) {
            textAtom = travelRailwaySeatSelectFooterVO.seatsLeft;
        }
        return travelRailwaySeatSelectFooterVO.copy(j11, list, textAtom);
    }

    @NotNull
    public final TravelRailwaySeatSelectFooterVO copy(long id2, @NotNull List<? extends FooterItem> footerContent, TextAtom seatsLeft) {
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        return new TravelRailwaySeatSelectFooterVO(id2, footerContent, seatsLeft);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRailwaySeatSelectFooterVO)) {
            return false;
        }
        TravelRailwaySeatSelectFooterVO travelRailwaySeatSelectFooterVO = (TravelRailwaySeatSelectFooterVO) other;
        return this.id == travelRailwaySeatSelectFooterVO.id && Intrinsics.d(this.footerContent, travelRailwaySeatSelectFooterVO.footerContent) && Intrinsics.d(this.seatsLeft, travelRailwaySeatSelectFooterVO.seatsLeft);
    }

    @NotNull
    public final List<FooterItem> getFooterContent() {
        return this.footerContent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSeatsLeft() {
        return this.seatsLeft;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.footerContent);
        TextAtom textAtom = this.seatsLeft;
        return b11 + (textAtom == null ? 0 : textAtom.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<FooterItem> list = this.footerContent;
        TextAtom textAtom = this.seatsLeft;
        StringBuilder b11 = b.b(j11, "TravelRailwaySeatSelectFooterVO(id=", ", footerContent=", list);
        b11.append(", seatsLeft=");
        b11.append(textAtom);
        b11.append(")");
        return b11.toString();
    }
}
