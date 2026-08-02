package ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageTypeSelect.v2.presentation;

import Fm.C3051a;
import Ns.b;
import Tz.C4055a;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0016B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/TravelCarriageTypeSelectV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/TravelCarriageTypeSelectV2VO$CarriageTypeVO;", "carriageTypes", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;LWZ/t;)V", "J", "getId", "()J", "Ljava/util/List;", "getCarriageTypes", "()Ljava/util/List;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "CarriageTypeVO", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelCarriageTypeSelectV2VO implements c {

    @NotNull
    private final List<CarriageTypeVO> carriageTypes;
    private final long id;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b\f\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelCarriageTypeSelect/v2/presentation/TravelCarriageTypeSelectV2VO$CarriageTypeVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "seatsNumber", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "", "isSeatsNumberOnNewLine", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeatsNumber", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Z", "()Z", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarriageTypeVO {
        public static final int $stable = AspectDTO.$stable | PriceDTO.$stable;

        @NotNull
        private final AspectDTO aspect;
        private final int id;
        private final boolean isSeatsNumberOnNewLine;

        @NotNull
        private final TextDTO name;

        @NotNull
        private final PriceDTO price;

        @NotNull
        private final TextDTO seatsNumber;

        public CarriageTypeVO(int i11, @NotNull TextDTO name, @NotNull TextDTO seatsNumber, @NotNull PriceDTO price, @NotNull AspectDTO aspect, boolean z11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(seatsNumber, "seatsNumber");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(aspect, "aspect");
            this.id = i11;
            this.name = name;
            this.seatsNumber = seatsNumber;
            this.price = price;
            this.aspect = aspect;
            this.isSeatsNumberOnNewLine = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarriageTypeVO)) {
                return false;
            }
            CarriageTypeVO carriageTypeVO = (CarriageTypeVO) other;
            return this.id == carriageTypeVO.id && Intrinsics.d(this.name, carriageTypeVO.name) && Intrinsics.d(this.seatsNumber, carriageTypeVO.seatsNumber) && Intrinsics.d(this.price, carriageTypeVO.price) && Intrinsics.d(this.aspect, carriageTypeVO.aspect) && this.isSeatsNumberOnNewLine == carriageTypeVO.isSeatsNumberOnNewLine;
        }

        @NotNull
        public final AspectDTO getAspect() {
            return this.aspect;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getName() {
            return this.name;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getSeatsNumber() {
            return this.seatsNumber;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSeatsNumberOnNewLine) + ((this.aspect.hashCode() + C3051a.b(this.price, b.a(this.seatsNumber, b.a(this.name, Integer.hashCode(this.id) * 31, 31), 31), 31)) * 31);
        }

        /* renamed from: isSeatsNumberOnNewLine, reason: from getter */
        public final boolean getIsSeatsNumberOnNewLine() {
            return this.isSeatsNumberOnNewLine;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.name;
            TextDTO textDTO2 = this.seatsNumber;
            PriceDTO priceDTO = this.price;
            AspectDTO aspectDTO = this.aspect;
            boolean z11 = this.isSeatsNumberOnNewLine;
            StringBuilder b11 = C4055a.b(textDTO, "CarriageTypeVO(id=", ", name=", ", seatsNumber=", i11);
            b11.append(textDTO2);
            b11.append(", price=");
            b11.append(priceDTO);
            b11.append(", aspect=");
            b11.append(aspectDTO);
            b11.append(", isSeatsNumberOnNewLine=");
            b11.append(z11);
            b11.append(")");
            return b11.toString();
        }
    }

    public TravelCarriageTypeSelectV2VO(long j11, @NotNull List<CarriageTypeVO> carriageTypes, t tVar) {
        Intrinsics.checkNotNullParameter(carriageTypes, "carriageTypes");
        this.id = j11;
        this.carriageTypes = carriageTypes;
        this.tokenizedEvent = tVar;
    }

    @NotNull
    public final List<CarriageTypeVO> getCarriageTypes() {
        return this.carriageTypes;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
