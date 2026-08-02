package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights;

import Ak.C2436a;
import B0.C2454a;
import Cm.e;
import F3.G;
import G.g;
import Kk.C3532b;
import Ns.b;
import Tz.C4055a;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTO;
import ru.ozon.app.android.travel.molecules.view.priceCard.PriceCardVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002!\"B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "asyncData", "offerId", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "content", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getAsyncData", "getOfferId", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "getContent", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "Content", "TariffItem", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaCheckTariffsVO implements c {
    private final String asyncData;

    @NotNull
    private final Content content;
    private final long id;
    private final String offerId;

    public AviaCheckTariffsVO(long j11, String str, String str2, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = j11;
        this.asyncData = str;
        this.offerId = str2;
        this.content = content;
    }

    public static /* synthetic */ AviaCheckTariffsVO copy$default(AviaCheckTariffsVO aviaCheckTariffsVO, long j11, String str, String str2, Content content, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aviaCheckTariffsVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = aviaCheckTariffsVO.asyncData;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = aviaCheckTariffsVO.offerId;
        }
        String str4 = str2;
        if ((i11 & 8) != 0) {
            content = aviaCheckTariffsVO.content;
        }
        return aviaCheckTariffsVO.copy(j12, str3, str4, content);
    }

    @NotNull
    public final AviaCheckTariffsVO copy(long id2, String asyncData, String offerId, @NotNull Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new AviaCheckTariffsVO(id2, asyncData, offerId, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaCheckTariffsVO)) {
            return false;
        }
        AviaCheckTariffsVO aviaCheckTariffsVO = (AviaCheckTariffsVO) other;
        return this.id == aviaCheckTariffsVO.id && Intrinsics.d(this.asyncData, aviaCheckTariffsVO.asyncData) && Intrinsics.d(this.offerId, aviaCheckTariffsVO.offerId) && Intrinsics.d(this.content, aviaCheckTariffsVO.content);
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @NotNull
    public final Content getContent() {
        return this.content;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.asyncData;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.offerId;
        return this.content.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.asyncData;
        String str2 = this.offerId;
        Content content = this.content;
        StringBuilder c11 = C2436a.c(j11, "AviaCheckTariffsVO(id=", ", asyncData=", str);
        c11.append(", offerId=");
        c11.append(str2);
        c11.append(", content=");
        c11.append(content);
        c11.append(")");
        return c11.toString();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem;", "", "id", "", "getId", "()I", "TariffVO", "PriceBlockVO", "SimpleCellVO", "TariffSkeleton", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffSkeleton;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TariffItem {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$PriceBlockVO;", "", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "discountPriceCard", "originalPriceCard", "<init>", "(Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "getDiscountPriceCard", "()Lru/ozon/app/android/travel/molecules/view/priceCard/PriceCardVO;", "getOriginalPriceCard", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PriceBlockVO {
            public static final int $stable = PriceCardVO.$stable;

            @NotNull
            private final PriceCardVO discountPriceCard;

            @NotNull
            private final PriceCardVO originalPriceCard;

            public PriceBlockVO(@NotNull PriceCardVO discountPriceCard, @NotNull PriceCardVO originalPriceCard) {
                Intrinsics.checkNotNullParameter(discountPriceCard, "discountPriceCard");
                Intrinsics.checkNotNullParameter(originalPriceCard, "originalPriceCard");
                this.discountPriceCard = discountPriceCard;
                this.originalPriceCard = originalPriceCard;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceBlockVO)) {
                    return false;
                }
                PriceBlockVO priceBlockVO = (PriceBlockVO) other;
                return Intrinsics.d(this.discountPriceCard, priceBlockVO.discountPriceCard) && Intrinsics.d(this.originalPriceCard, priceBlockVO.originalPriceCard);
            }

            @NotNull
            public final PriceCardVO getDiscountPriceCard() {
                return this.discountPriceCard;
            }

            @NotNull
            public final PriceCardVO getOriginalPriceCard() {
                return this.originalPriceCard;
            }

            public int hashCode() {
                return this.originalPriceCard.hashCode() + (this.discountPriceCard.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "PriceBlockVO(discountPriceCard=" + this.discountPriceCard + ", originalPriceCard=" + this.originalPriceCard + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$SimpleCellVO;", "", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "rightIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(ILru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRightIcon", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SimpleCellVO {
            public static final int $stable;
            private final AtomAction action;
            private final IconDTO icon;
            private final int id;
            private final IconDTO rightIcon;

            @NotNull
            private final TextDTO text;

            static {
                int i11 = AtomAction.$stable;
                int i12 = IconDTO.$stable;
                $stable = i11 | i12 | i12;
            }

            public SimpleCellVO(int i11, IconDTO iconDTO, @NotNull TextDTO text, IconDTO iconDTO2, AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.id = i11;
                this.icon = iconDTO;
                this.text = text;
                this.rightIcon = iconDTO2;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SimpleCellVO)) {
                    return false;
                }
                SimpleCellVO simpleCellVO = (SimpleCellVO) other;
                return this.id == simpleCellVO.id && Intrinsics.d(this.icon, simpleCellVO.icon) && Intrinsics.d(this.text, simpleCellVO.text) && Intrinsics.d(this.rightIcon, simpleCellVO.rightIcon) && Intrinsics.d(this.action, simpleCellVO.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public final IconDTO getIcon() {
                return this.icon;
            }

            public final int getId() {
                return this.id;
            }

            public final IconDTO getRightIcon() {
                return this.rightIcon;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.id) * 31;
                IconDTO iconDTO = this.icon;
                int a11 = b.a(this.text, (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
                IconDTO iconDTO2 = this.rightIcon;
                int hashCode2 = (a11 + (iconDTO2 == null ? 0 : iconDTO2.hashCode())) * 31;
                AtomAction atomAction = this.action;
                return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                IconDTO iconDTO = this.icon;
                TextDTO textDTO = this.text;
                IconDTO iconDTO2 = this.rightIcon;
                AtomAction atomAction = this.action;
                StringBuilder sb2 = new StringBuilder("SimpleCellVO(id=");
                sb2.append(i11);
                sb2.append(", icon=");
                sb2.append(iconDTO);
                sb2.append(", text=");
                G.f(sb2, textDTO, ", rightIcon=", iconDTO2, ", action=");
                return B6.b.b(sb2, atomAction, ")");
            }
        }

        int getId();

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffSkeleton;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem;", "", "id", "benefitsSize", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getBenefitsSize", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TariffSkeleton implements TariffItem {
            private final int benefitsSize;
            private final int id;

            public TariffSkeleton(int i11, int i12) {
                this.id = i11;
                this.benefitsSize = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TariffSkeleton)) {
                    return false;
                }
                TariffSkeleton tariffSkeleton = (TariffSkeleton) other;
                return this.id == tariffSkeleton.id && this.benefitsSize == tariffSkeleton.benefitsSize;
            }

            public final int getBenefitsSize() {
                return this.benefitsSize;
            }

            @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO.TariffItem
            public int getId() {
                return this.id;
            }

            public int hashCode() {
                return Integer.hashCode(this.benefitsSize) + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return e.c("TariffSkeleton(id=", this.id, ", benefitsSize=", ")", this.benefitsSize);
            }

            public /* synthetic */ TariffSkeleton(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? -527221327 : i11, i12);
            }
        }

        @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"JÜ\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u001d2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u00108R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010;R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b<\u0010;R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b=\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010&R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010I\u001a\u0004\bJ\u0010KR%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010O\u001a\u0004\b\u001e\u0010PR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010Q\u001a\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "route", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "milesBadge", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$SimpleCellVO;", "benefits", "visibleBenefits", "initiallyVisibleBenefitsCount", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;", "showMoreButton", "", "borderColor", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;", "backgroundColor", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "marketingImage", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTrackingInfo", "", "isSelected", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$PriceBlockVO;", "priceBlock", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/util/List;ILru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;ZLru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$PriceBlockVO;)V", "copy", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Ljava/util/List;ILru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;Ljava/lang/String;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;ZLru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$PriceBlockVO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getRoute", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getMilesBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getBenefits", "()Ljava/util/List;", "getVisibleBenefits", "getInitiallyVisibleBenefitsCount", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;", "getShowMoreButton", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$ShowMoreButtonDTO;", "Ljava/lang/String;", "getBorderColor", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;", "getBackgroundColor", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$BackgroundWrapper;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getMarketingImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getViewTrackingInfo", "()Ljava/util/Map;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$PriceBlockVO;", "getPriceBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$PriceBlockVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TariffVO implements TariffItem {
            private final AviaCheckTariffsDTO.BackgroundWrapper backgroundColor;

            @NotNull
            private final List<SimpleCellVO> benefits;
            private final String borderColor;
            private final AtomAction clickAction;
            private final int id;
            private final int initiallyVisibleBenefitsCount;
            private final boolean isSelected;
            private final ImageDTO marketingImage;
            private final BadgeDTO milesBadge;
            private final PriceDTO price;
            private final PriceBlockVO priceBlock;
            private final TextDTO route;
            private final AviaCheckTariffsDTO.ShowMoreButtonDTO showMoreButton;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

            @NotNull
            private final List<SimpleCellVO> visibleBenefits;

            public TariffVO(int i11, @NotNull TextDTO title, PriceDTO priceDTO, TextDTO textDTO, BadgeDTO badgeDTO, @NotNull List<SimpleCellVO> benefits, @NotNull List<SimpleCellVO> visibleBenefits, int i12, AviaCheckTariffsDTO.ShowMoreButtonDTO showMoreButtonDTO, String str, AviaCheckTariffsDTO.BackgroundWrapper backgroundWrapper, ImageDTO imageDTO, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, boolean z11, PriceBlockVO priceBlockVO) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(benefits, "benefits");
                Intrinsics.checkNotNullParameter(visibleBenefits, "visibleBenefits");
                this.id = i11;
                this.title = title;
                this.price = priceDTO;
                this.route = textDTO;
                this.milesBadge = badgeDTO;
                this.benefits = benefits;
                this.visibleBenefits = visibleBenefits;
                this.initiallyVisibleBenefitsCount = i12;
                this.showMoreButton = showMoreButtonDTO;
                this.borderColor = str;
                this.backgroundColor = backgroundWrapper;
                this.marketingImage = imageDTO;
                this.clickAction = atomAction;
                this.viewTrackingInfo = map;
                this.isSelected = z11;
                this.priceBlock = priceBlockVO;
            }

            @NotNull
            public final TariffVO copy(int id2, @NotNull TextDTO title, PriceDTO price, TextDTO route, BadgeDTO milesBadge, @NotNull List<SimpleCellVO> benefits, @NotNull List<SimpleCellVO> visibleBenefits, int initiallyVisibleBenefitsCount, AviaCheckTariffsDTO.ShowMoreButtonDTO showMoreButton, String borderColor, AviaCheckTariffsDTO.BackgroundWrapper backgroundColor, ImageDTO marketingImage, AtomAction clickAction, Map<String, TokenizedTrackingInfo> viewTrackingInfo, boolean isSelected, PriceBlockVO priceBlock) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(benefits, "benefits");
                Intrinsics.checkNotNullParameter(visibleBenefits, "visibleBenefits");
                return new TariffVO(id2, title, price, route, milesBadge, benefits, visibleBenefits, initiallyVisibleBenefitsCount, showMoreButton, borderColor, backgroundColor, marketingImage, clickAction, viewTrackingInfo, isSelected, priceBlock);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TariffVO)) {
                    return false;
                }
                TariffVO tariffVO = (TariffVO) other;
                return this.id == tariffVO.id && Intrinsics.d(this.title, tariffVO.title) && Intrinsics.d(this.price, tariffVO.price) && Intrinsics.d(this.route, tariffVO.route) && Intrinsics.d(this.milesBadge, tariffVO.milesBadge) && Intrinsics.d(this.benefits, tariffVO.benefits) && Intrinsics.d(this.visibleBenefits, tariffVO.visibleBenefits) && this.initiallyVisibleBenefitsCount == tariffVO.initiallyVisibleBenefitsCount && Intrinsics.d(this.showMoreButton, tariffVO.showMoreButton) && Intrinsics.d(this.borderColor, tariffVO.borderColor) && Intrinsics.d(this.backgroundColor, tariffVO.backgroundColor) && Intrinsics.d(this.marketingImage, tariffVO.marketingImage) && Intrinsics.d(this.clickAction, tariffVO.clickAction) && Intrinsics.d(this.viewTrackingInfo, tariffVO.viewTrackingInfo) && this.isSelected == tariffVO.isSelected && Intrinsics.d(this.priceBlock, tariffVO.priceBlock);
            }

            public final AviaCheckTariffsDTO.BackgroundWrapper getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final List<SimpleCellVO> getBenefits() {
                return this.benefits;
            }

            public final String getBorderColor() {
                return this.borderColor;
            }

            public final AtomAction getClickAction() {
                return this.clickAction;
            }

            @Override // ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO.TariffItem
            public int getId() {
                return this.id;
            }

            public final int getInitiallyVisibleBenefitsCount() {
                return this.initiallyVisibleBenefitsCount;
            }

            public final ImageDTO getMarketingImage() {
                return this.marketingImage;
            }

            public final BadgeDTO getMilesBadge() {
                return this.milesBadge;
            }

            public final PriceDTO getPrice() {
                return this.price;
            }

            public final PriceBlockVO getPriceBlock() {
                return this.priceBlock;
            }

            public final TextDTO getRoute() {
                return this.route;
            }

            public final AviaCheckTariffsDTO.ShowMoreButtonDTO getShowMoreButton() {
                return this.showMoreButton;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
                return this.viewTrackingInfo;
            }

            @NotNull
            public final List<SimpleCellVO> getVisibleBenefits() {
                return this.visibleBenefits;
            }

            public int hashCode() {
                int a11 = b.a(this.title, Integer.hashCode(this.id) * 31, 31);
                PriceDTO priceDTO = this.price;
                int hashCode = (a11 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
                TextDTO textDTO = this.route;
                int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                BadgeDTO badgeDTO = this.milesBadge;
                int a12 = C2454a.a(this.initiallyVisibleBenefitsCount, g.b(g.b((hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31, this.benefits), 31, this.visibleBenefits), 31);
                AviaCheckTariffsDTO.ShowMoreButtonDTO showMoreButtonDTO = this.showMoreButton;
                int hashCode3 = (a12 + (showMoreButtonDTO == null ? 0 : showMoreButtonDTO.hashCode())) * 31;
                String str = this.borderColor;
                int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
                AviaCheckTariffsDTO.BackgroundWrapper backgroundWrapper = this.backgroundColor;
                int hashCode5 = (hashCode4 + (backgroundWrapper == null ? 0 : backgroundWrapper.hashCode())) * 31;
                ImageDTO imageDTO = this.marketingImage;
                int hashCode6 = (hashCode5 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
                AtomAction atomAction = this.clickAction;
                int hashCode7 = (hashCode6 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                int a13 = C3532b.a((hashCode7 + (map == null ? 0 : map.hashCode())) * 31, 31, this.isSelected);
                PriceBlockVO priceBlockVO = this.priceBlock;
                return a13 + (priceBlockVO != null ? priceBlockVO.hashCode() : 0);
            }

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                TextDTO textDTO = this.title;
                PriceDTO priceDTO = this.price;
                TextDTO textDTO2 = this.route;
                BadgeDTO badgeDTO = this.milesBadge;
                List<SimpleCellVO> list = this.benefits;
                List<SimpleCellVO> list2 = this.visibleBenefits;
                int i12 = this.initiallyVisibleBenefitsCount;
                AviaCheckTariffsDTO.ShowMoreButtonDTO showMoreButtonDTO = this.showMoreButton;
                String str = this.borderColor;
                AviaCheckTariffsDTO.BackgroundWrapper backgroundWrapper = this.backgroundColor;
                ImageDTO imageDTO = this.marketingImage;
                AtomAction atomAction = this.clickAction;
                Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
                boolean z11 = this.isSelected;
                PriceBlockVO priceBlockVO = this.priceBlock;
                StringBuilder b11 = C4055a.b(textDTO, "TariffVO(id=", ", title=", ", price=", i11);
                b11.append(priceDTO);
                b11.append(", route=");
                b11.append(textDTO2);
                b11.append(", milesBadge=");
                b11.append(badgeDTO);
                b11.append(", benefits=");
                b11.append(list);
                b11.append(", visibleBenefits=");
                b11.append(list2);
                b11.append(", initiallyVisibleBenefitsCount=");
                b11.append(i12);
                b11.append(", showMoreButton=");
                b11.append(showMoreButtonDTO);
                b11.append(", borderColor=");
                b11.append(str);
                b11.append(", backgroundColor=");
                b11.append(backgroundWrapper);
                b11.append(", marketingImage=");
                b11.append(imageDTO);
                b11.append(", clickAction=");
                b11.append(atomAction);
                b11.append(", viewTrackingInfo=");
                b11.append(map);
                b11.append(", isSelected=");
                b11.append(z11);
                b11.append(", priceBlock=");
                b11.append(priceBlockVO);
                b11.append(")");
                return b11.toString();
            }

            public TariffVO(int i11, TextDTO textDTO, PriceDTO priceDTO, TextDTO textDTO2, BadgeDTO badgeDTO, List list, List list2, int i12, AviaCheckTariffsDTO.ShowMoreButtonDTO showMoreButtonDTO, String str, AviaCheckTariffsDTO.BackgroundWrapper backgroundWrapper, ImageDTO imageDTO, AtomAction atomAction, Map map, boolean z11, PriceBlockVO priceBlockVO, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, textDTO, priceDTO, textDTO2, badgeDTO, list, (i13 & 64) != 0 ? K.f71697a : list2, i12, showMoreButtonDTO, str, backgroundWrapper, imageDTO, atomAction, map, z11, priceBlockVO);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011Jb\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem;", "tariffs", "", "selectedTariffInd", "Landroid/os/Parcelable;", "lastVisiblePosition", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;", "asyncBehaviorType", "", "", "asyncParams", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILandroid/os/Parcelable;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;Ljava/util/Map;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILandroid/os/Parcelable;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getTariffs", "()Ljava/util/List;", "I", "getSelectedTariffInd", "Landroid/os/Parcelable;", "getLastVisiblePosition", "()Landroid/os/Parcelable;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;", "getAsyncBehaviorType", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$AsyncBehaviorType;", "Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content {

        @NotNull
        private final AviaCheckTariffsDTO.AsyncBehaviorType asyncBehaviorType;
        private final Map<String, String> asyncParams;
        private final Parcelable lastVisiblePosition;
        private final int selectedTariffInd;

        @NotNull
        private final List<TariffItem> tariffs;

        @NotNull
        private final TextDTO title;

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@NotNull TextDTO title, @NotNull List<? extends TariffItem> tariffs, int i11, Parcelable parcelable, @NotNull AviaCheckTariffsDTO.AsyncBehaviorType asyncBehaviorType, Map<String, String> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tariffs, "tariffs");
            Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
            this.title = title;
            this.tariffs = tariffs;
            this.selectedTariffInd = i11;
            this.lastVisiblePosition = parcelable;
            this.asyncBehaviorType = asyncBehaviorType;
            this.asyncParams = map;
        }

        public static /* synthetic */ Content copy$default(Content content, TextDTO textDTO, List list, int i11, Parcelable parcelable, AviaCheckTariffsDTO.AsyncBehaviorType asyncBehaviorType, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textDTO = content.title;
            }
            if ((i12 & 2) != 0) {
                list = content.tariffs;
            }
            if ((i12 & 4) != 0) {
                i11 = content.selectedTariffInd;
            }
            if ((i12 & 8) != 0) {
                parcelable = content.lastVisiblePosition;
            }
            if ((i12 & 16) != 0) {
                asyncBehaviorType = content.asyncBehaviorType;
            }
            if ((i12 & 32) != 0) {
                map = content.asyncParams;
            }
            AviaCheckTariffsDTO.AsyncBehaviorType asyncBehaviorType2 = asyncBehaviorType;
            Map map2 = map;
            return content.copy(textDTO, list, i11, parcelable, asyncBehaviorType2, map2);
        }

        @NotNull
        public final Content copy(@NotNull TextDTO title, @NotNull List<? extends TariffItem> tariffs, int selectedTariffInd, Parcelable lastVisiblePosition, @NotNull AviaCheckTariffsDTO.AsyncBehaviorType asyncBehaviorType, Map<String, String> asyncParams) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tariffs, "tariffs");
            Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
            return new Content(title, tariffs, selectedTariffInd, lastVisiblePosition, asyncBehaviorType, asyncParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.d(this.title, content.title) && Intrinsics.d(this.tariffs, content.tariffs) && this.selectedTariffInd == content.selectedTariffInd && Intrinsics.d(this.lastVisiblePosition, content.lastVisiblePosition) && this.asyncBehaviorType == content.asyncBehaviorType && Intrinsics.d(this.asyncParams, content.asyncParams);
        }

        @NotNull
        public final AviaCheckTariffsDTO.AsyncBehaviorType getAsyncBehaviorType() {
            return this.asyncBehaviorType;
        }

        public final Map<String, String> getAsyncParams() {
            return this.asyncParams;
        }

        public final Parcelable getLastVisiblePosition() {
            return this.lastVisiblePosition;
        }

        public final int getSelectedTariffInd() {
            return this.selectedTariffInd;
        }

        @NotNull
        public final List<TariffItem> getTariffs() {
            return this.tariffs;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.selectedTariffInd, g.b(this.title.hashCode() * 31, 31, this.tariffs), 31);
            Parcelable parcelable = this.lastVisiblePosition;
            int hashCode = (this.asyncBehaviorType.hashCode() + ((a11 + (parcelable == null ? 0 : parcelable.hashCode())) * 31)) * 31;
            Map<String, String> map = this.asyncParams;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            List<TariffItem> list = this.tariffs;
            int i11 = this.selectedTariffInd;
            Parcelable parcelable = this.lastVisiblePosition;
            AviaCheckTariffsDTO.AsyncBehaviorType asyncBehaviorType = this.asyncBehaviorType;
            Map<String, String> map = this.asyncParams;
            StringBuilder e11 = K1.G.e("Content(title=", textDTO, ", tariffs=", list, ", selectedTariffInd=");
            e11.append(i11);
            e11.append(", lastVisiblePosition=");
            e11.append(parcelable);
            e11.append(", asyncBehaviorType=");
            e11.append(asyncBehaviorType);
            e11.append(", asyncParams=");
            e11.append(map);
            e11.append(")");
            return e11.toString();
        }

        public /* synthetic */ Content(TextDTO textDTO, List list, int i11, Parcelable parcelable, AviaCheckTariffsDTO.AsyncBehaviorType asyncBehaviorType, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, list, i11, (i12 & 8) != 0 ? null : parcelable, asyncBehaviorType, map);
        }
    }
}
