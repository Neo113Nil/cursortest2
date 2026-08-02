package ru.ozon.app.android.courieronmap.presentation.vo;

import B0.C2454a;
import B90.C2619v;
import G.g;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.courieronmap.data.CourierOnMapDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import we0.m;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0080\b\u0018\u00002\u00020\u0001:\u0001CB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b5\u0010.R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b<\u0010\u001fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010@\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;", "courier", "customer", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "refreshInterval", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "deliveryTime", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom;", "orderInfo", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "pinAnimationDuration", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$CourierDetails;", "courierDetails", "<init>", "(JLru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ILru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;ILWZ/t;Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$CourierDetails;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;", "getCourier", "()Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;", "getCustomer", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "I", "getRefreshInterval", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDeliveryTime", "Ljava/util/List;", "getOrderInfo", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getPinAnimationDuration", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$CourierDetails;", "getCourierDetails", "()Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$CourierDetails;", "PinInfo", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CourierOnMapVO implements c {
    private final DisclaimerAtom annotation;
    private final ButtonV3Atom.LargeButton button;
    private final PinInfo courier;
    private final CourierOnMapDTO.CourierDetails courierDetails;

    @NotNull
    private final PinInfo customer;
    private final TextAtom deliveryTime;
    private final long id;
    private final List<CellAtom> orderInfo;
    private final int pinAnimationDuration;
    private final int refreshInterval;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\t\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/vo/CourierOnMapVO$PinInfo;", "", "Lwe0/m;", "coordinates", "", "image", "id", "caption", "", "isCourier", "<init>", "(Lwe0/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lwe0/m;", "getCoordinates", "()Lwe0/m;", "Ljava/lang/String;", "getImage", "getId", "getCaption", "Z", "()Z", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PinInfo {
        private final String caption;

        @NotNull
        private final m coordinates;

        @NotNull
        private final String id;

        @NotNull
        private final String image;
        private final boolean isCourier;

        public PinInfo(@NotNull m coordinates, @NotNull String image, @NotNull String id2, String str, boolean z11) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(id2, "id");
            this.coordinates = coordinates;
            this.image = image;
            this.id = id2;
            this.caption = str;
            this.isCourier = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinInfo)) {
                return false;
            }
            PinInfo pinInfo = (PinInfo) other;
            return Intrinsics.d(this.coordinates, pinInfo.coordinates) && Intrinsics.d(this.image, pinInfo.image) && Intrinsics.d(this.id, pinInfo.id) && Intrinsics.d(this.caption, pinInfo.caption) && this.isCourier == pinInfo.isCourier;
        }

        public final String getCaption() {
            return this.caption;
        }

        @NotNull
        public final m getCoordinates() {
            return this.coordinates;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.coordinates.hashCode() * 31, 31, this.image), 31, this.id);
            String str = this.caption;
            return Boolean.hashCode(this.isCourier) + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
        }

        /* renamed from: isCourier, reason: from getter */
        public final boolean getIsCourier() {
            return this.isCourier;
        }

        @NotNull
        public String toString() {
            m mVar = this.coordinates;
            String str = this.image;
            String str2 = this.id;
            String str3 = this.caption;
            boolean z11 = this.isCourier;
            StringBuilder sb2 = new StringBuilder("PinInfo(coordinates=");
            sb2.append(mVar);
            sb2.append(", image=");
            sb2.append(str);
            sb2.append(", id=");
            a.h(sb2, str2, ", caption=", str3, ", isCourier=");
            return Pk0.a.a(")", sb2, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CourierOnMapVO(long j11, PinInfo pinInfo, @NotNull PinInfo customer, @NotNull TextAtom title, TextAtom textAtom, int i11, DisclaimerAtom disclaimerAtom, TextAtom textAtom2, List<? extends CellAtom> list, ButtonV3Atom.LargeButton largeButton, int i12, t tVar, CourierOnMapDTO.CourierDetails courierDetails) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.courier = pinInfo;
        this.customer = customer;
        this.title = title;
        this.subtitle = textAtom;
        this.refreshInterval = i11;
        this.annotation = disclaimerAtom;
        this.deliveryTime = textAtom2;
        this.orderInfo = list;
        this.button = largeButton;
        this.pinAnimationDuration = i12;
        this.tokenizedEvent = tVar;
        this.courierDetails = courierDetails;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourierOnMapVO)) {
            return false;
        }
        CourierOnMapVO courierOnMapVO = (CourierOnMapVO) other;
        return this.id == courierOnMapVO.id && Intrinsics.d(this.courier, courierOnMapVO.courier) && Intrinsics.d(this.customer, courierOnMapVO.customer) && Intrinsics.d(this.title, courierOnMapVO.title) && Intrinsics.d(this.subtitle, courierOnMapVO.subtitle) && this.refreshInterval == courierOnMapVO.refreshInterval && Intrinsics.d(this.annotation, courierOnMapVO.annotation) && Intrinsics.d(this.deliveryTime, courierOnMapVO.deliveryTime) && Intrinsics.d(this.orderInfo, courierOnMapVO.orderInfo) && Intrinsics.d(this.button, courierOnMapVO.button) && this.pinAnimationDuration == courierOnMapVO.pinAnimationDuration && Intrinsics.d(this.tokenizedEvent, courierOnMapVO.tokenizedEvent) && Intrinsics.d(this.courierDetails, courierOnMapVO.courierDetails);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final PinInfo getCourier() {
        return this.courier;
    }

    public final CourierOnMapDTO.CourierDetails getCourierDetails() {
        return this.courierDetails;
    }

    @NotNull
    public final PinInfo getCustomer() {
        return this.customer;
    }

    public final TextAtom getDeliveryTime() {
        return this.deliveryTime;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final List<CellAtom> getOrderInfo() {
        return this.orderInfo;
    }

    public final int getPinAnimationDuration() {
        return this.pinAnimationDuration;
    }

    public final int getRefreshInterval() {
        return this.refreshInterval;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        PinInfo pinInfo = this.courier;
        int b11 = C2619v.b((this.customer.hashCode() + ((hashCode + (pinInfo == null ? 0 : pinInfo.hashCode())) * 31)) * 31, 31, this.title);
        TextAtom textAtom = this.subtitle;
        int a11 = C2454a.a(this.refreshInterval, (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31);
        DisclaimerAtom disclaimerAtom = this.annotation;
        int hashCode2 = (a11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.deliveryTime;
        int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        List<CellAtom> list = this.orderInfo;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.button;
        int a12 = C2454a.a(this.pinAnimationDuration, (hashCode4 + (largeButton == null ? 0 : largeButton.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        int hashCode5 = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        CourierOnMapDTO.CourierDetails courierDetails = this.courierDetails;
        return hashCode5 + (courierDetails != null ? courierDetails.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CourierOnMapVO(id=" + this.id + ", courier=" + this.courier + ", customer=" + this.customer + ", title=" + this.title + ", subtitle=" + this.subtitle + ", refreshInterval=" + this.refreshInterval + ", annotation=" + this.annotation + ", deliveryTime=" + this.deliveryTime + ", orderInfo=" + this.orderInfo + ", button=" + this.button + ", pinAnimationDuration=" + this.pinAnimationDuration + ", tokenizedEvent=" + this.tokenizedEvent + ", courierDetails=" + this.courierDetails + ")";
    }
}
