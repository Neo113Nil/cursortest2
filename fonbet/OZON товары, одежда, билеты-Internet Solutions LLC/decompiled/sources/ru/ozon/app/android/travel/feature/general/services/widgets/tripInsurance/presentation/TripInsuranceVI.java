package ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.presentation;

import B6.b;
import Bl.C2639a;
import D3.h;
import G.g;
import Lh.a;
import Sc.C;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001:\u0001(B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "mobileHeader", "", "benefits", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI$AdditionalInfo;", "additionalInfo", "LWZ/t;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI$AdditionalInfo;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getMobileHeader", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Ljava/util/List;", "getBenefits", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI$AdditionalInfo;", "getAdditionalInfo", "()Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI$AdditionalInfo;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "AdditionalInfo", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TripInsuranceVI implements c {

    @NotNull
    private final AdditionalInfo additionalInfo;

    @NotNull
    private final List<CellDTO> benefits;
    private final long id;

    @NotNull
    private final CellDTO mobileHeader;
    private final t trackingInfo;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI$AdditionalInfo;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Ll1/Z;", "bgColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;JLru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "J", "getBgColor-0d7_KjU", "()J", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo {
        private final AtomAction action;
        private final long bgColor;
        private final IconDTO icon;
        private final ImageDTO image;

        @NotNull
        private final TextDTO title;

        public /* synthetic */ AdditionalInfo(TextDTO textDTO, IconDTO iconDTO, ImageDTO imageDTO, long j11, AtomAction atomAction, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, iconDTO, imageDTO, j11, atomAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalInfo)) {
                return false;
            }
            AdditionalInfo additionalInfo = (AdditionalInfo) other;
            return Intrinsics.d(this.title, additionalInfo.title) && Intrinsics.d(this.icon, additionalInfo.icon) && Intrinsics.d(this.image, additionalInfo.image) && C7807Z.p(this.bgColor, additionalInfo.bgColor) && Intrinsics.d(this.action, additionalInfo.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        /* renamed from: getBgColor-0d7_KjU, reason: not valid java name and from getter */
        public final long getBgColor() {
            return this.bgColor;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            ImageDTO imageDTO = this.image;
            int hashCode3 = (hashCode2 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
            long j11 = this.bgColor;
            int i11 = C7807Z.f72260n;
            C.Companion companion = C.INSTANCE;
            int a11 = Pk0.c.a(hashCode3, 31, j11);
            AtomAction atomAction = this.action;
            return a11 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            ImageDTO imageDTO = this.image;
            String v11 = C7807Z.v(this.bgColor);
            AtomAction atomAction = this.action;
            StringBuilder d11 = C2639a.d("AdditionalInfo(title=", ", icon=", ", image=", iconDTO, textDTO);
            d11.append(imageDTO);
            d11.append(", bgColor=");
            d11.append(v11);
            d11.append(", action=");
            return b.b(d11, atomAction, ")");
        }

        private AdditionalInfo(TextDTO title, IconDTO iconDTO, ImageDTO imageDTO, long j11, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.icon = iconDTO;
            this.image = imageDTO;
            this.bgColor = j11;
            this.action = atomAction;
        }
    }

    public TripInsuranceVI(long j11, @NotNull CellDTO mobileHeader, @NotNull List<CellDTO> benefits, @NotNull AdditionalInfo additionalInfo, t tVar) {
        Intrinsics.checkNotNullParameter(mobileHeader, "mobileHeader");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.id = j11;
        this.mobileHeader = mobileHeader;
        this.benefits = benefits;
        this.additionalInfo = additionalInfo;
        this.trackingInfo = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TripInsuranceVI)) {
            return false;
        }
        TripInsuranceVI tripInsuranceVI = (TripInsuranceVI) other;
        return this.id == tripInsuranceVI.id && Intrinsics.d(this.mobileHeader, tripInsuranceVI.mobileHeader) && Intrinsics.d(this.benefits, tripInsuranceVI.benefits) && Intrinsics.d(this.additionalInfo, tripInsuranceVI.additionalInfo) && Intrinsics.d(this.trackingInfo, tripInsuranceVI.trackingInfo);
    }

    @NotNull
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @NotNull
    public final List<CellDTO> getBenefits() {
        return this.benefits;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CellDTO getMobileHeader() {
        return this.mobileHeader;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.additionalInfo.hashCode() + g.b(Bi.b.c(this.mobileHeader, Long.hashCode(this.id) * 31, 31), 31, this.benefits)) * 31;
        t tVar = this.trackingInfo;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.mobileHeader;
        List<CellDTO> list = this.benefits;
        AdditionalInfo additionalInfo = this.additionalInfo;
        t tVar = this.trackingInfo;
        StringBuilder e11 = h.e("TripInsuranceVI(id=", j11, ", mobileHeader=", cellDTO);
        e11.append(", benefits=");
        e11.append(list);
        e11.append(", additionalInfo=");
        e11.append(additionalInfo);
        return a.b(e11, ", trackingInfo=", tVar, ")");
    }
}
