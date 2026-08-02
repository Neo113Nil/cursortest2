package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.presentation;

import B90.C2619v;
import Bl.C2639a;
import J.d;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b\t\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b%\u0010\u001e¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/presentation/TravelCarriageDetailsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "mainInfo", "", "isServiceGroupVisible", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/presentation/TravelCarriageDetailsVO$CarriageServiceInfo;", "serviceInfo", "additionalInfo", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/presentation/TravelCarriageDetailsVO$CarriageServiceInfo;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMainInfo", "Z", "()Z", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/presentation/TravelCarriageDetailsVO$CarriageServiceInfo;", "getServiceInfo", "()Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/presentation/TravelCarriageDetailsVO$CarriageServiceInfo;", "getAdditionalInfo", "CarriageServiceInfo", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCarriageDetailsVO implements c {

    @NotNull
    private final TextAtom additionalInfo;

    @NotNull
    private final TextAtom header;
    private final long id;
    private final boolean isServiceGroupVisible;

    @NotNull
    private final TextAtom mainInfo;

    @NotNull
    private final CarriageServiceInfo serviceInfo;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageDetails/presentation/TravelCarriageDetailsVO$CarriageServiceInfo;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$IconTextMediumListElement;", ResultDTO.CONTENT_TYPE_SERVICES, "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getServices", "()Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarriageServiceInfo {

        @NotNull
        private final List<ListElementAtom.IconTextMediumListElement> services;

        @NotNull
        private final TextAtom title;

        public CarriageServiceInfo(@NotNull TextAtom title, @NotNull List<ListElementAtom.IconTextMediumListElement> services) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(services, "services");
            this.title = title;
            this.services = services;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarriageServiceInfo)) {
                return false;
            }
            CarriageServiceInfo carriageServiceInfo = (CarriageServiceInfo) other;
            return Intrinsics.d(this.title, carriageServiceInfo.title) && Intrinsics.d(this.services, carriageServiceInfo.services);
        }

        @NotNull
        public final List<ListElementAtom.IconTextMediumListElement> getServices() {
            return this.services;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.services.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return d.c("CarriageServiceInfo(title=", this.title, ", services=", this.services, ")");
        }
    }

    public TravelCarriageDetailsVO(long j11, @NotNull TextAtom header, @NotNull TextAtom mainInfo, boolean z11, @NotNull CarriageServiceInfo serviceInfo, @NotNull TextAtom additionalInfo) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(mainInfo, "mainInfo");
        Intrinsics.checkNotNullParameter(serviceInfo, "serviceInfo");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.id = j11;
        this.header = header;
        this.mainInfo = mainInfo;
        this.isServiceGroupVisible = z11;
        this.serviceInfo = serviceInfo;
        this.additionalInfo = additionalInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCarriageDetailsVO)) {
            return false;
        }
        TravelCarriageDetailsVO travelCarriageDetailsVO = (TravelCarriageDetailsVO) other;
        return this.id == travelCarriageDetailsVO.id && Intrinsics.d(this.header, travelCarriageDetailsVO.header) && Intrinsics.d(this.mainInfo, travelCarriageDetailsVO.mainInfo) && this.isServiceGroupVisible == travelCarriageDetailsVO.isServiceGroupVisible && Intrinsics.d(this.serviceInfo, travelCarriageDetailsVO.serviceInfo) && Intrinsics.d(this.additionalInfo, travelCarriageDetailsVO.additionalInfo);
    }

    @NotNull
    public final TextAtom getAdditionalInfo() {
        return this.additionalInfo;
    }

    @NotNull
    public final TextAtom getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextAtom getMainInfo() {
        return this.mainInfo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final CarriageServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.additionalInfo.hashCode() + ((this.serviceInfo.hashCode() + C3532b.a(C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.header), 31, this.mainInfo), 31, this.isServiceGroupVisible)) * 31);
    }

    /* renamed from: isServiceGroupVisible, reason: from getter */
    public final boolean getIsServiceGroupVisible() {
        return this.isServiceGroupVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.header;
        TextAtom textAtom2 = this.mainInfo;
        boolean z11 = this.isServiceGroupVisible;
        CarriageServiceInfo carriageServiceInfo = this.serviceInfo;
        TextAtom textAtom3 = this.additionalInfo;
        StringBuilder c11 = C2639a.c("TravelCarriageDetailsVO(id=", j11, ", header=", textAtom);
        c11.append(", mainInfo=");
        c11.append(textAtom2);
        c11.append(", isServiceGroupVisible=");
        c11.append(z11);
        c11.append(", serviceInfo=");
        c11.append(carriageServiceInfo);
        c11.append(", additionalInfo=");
        c11.append(textAtom3);
        c11.append(")");
        return c11.toString();
    }
}
