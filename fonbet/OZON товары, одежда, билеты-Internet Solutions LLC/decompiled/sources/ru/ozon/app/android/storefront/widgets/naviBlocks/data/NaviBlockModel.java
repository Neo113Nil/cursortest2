package ru.ozon.app.android.storefront.widgets.naviBlocks.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksDTO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockPositionVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u001d\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel;", "", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "position", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;)V", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "getPosition", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;", "setPosition", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/NaviBlockPositionVO;)V", "CarouselNaviBlockModel", "OneFrameNaviBlockModel", "CoupleNaviBlockModel", "LastEmptyNaviBlockModel", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CarouselNaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CoupleNaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$LastEmptyNaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$OneFrameNaviBlockModel;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NaviBlockModel {

    @NotNull
    private NaviBlockPositionVO position;
    private final NaviBlocksDTO.RoundedCornersDTO roundedCorners;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CarouselNaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO;", "carouselBlock", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "roundedCorners", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO;Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO;", "getCarouselBlock", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CarouselNaviBlockModel extends NaviBlockModel {

        @NotNull
        private final NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO carouselBlock;
        private final NaviBlocksDTO.RoundedCornersDTO roundedCorners;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CarouselNaviBlockModel(@NotNull NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO carouselBlock, NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO) {
            super(roundedCornersDTO, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(carouselBlock, "carouselBlock");
            this.carouselBlock = carouselBlock;
            this.roundedCorners = roundedCornersDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CarouselNaviBlockModel)) {
                return false;
            }
            CarouselNaviBlockModel carouselNaviBlockModel = (CarouselNaviBlockModel) other;
            return Intrinsics.d(this.carouselBlock, carouselNaviBlockModel.carouselBlock) && this.roundedCorners == carouselNaviBlockModel.roundedCorners;
        }

        @NotNull
        public final NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO getCarouselBlock() {
            return this.carouselBlock;
        }

        @Override // ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel
        public NaviBlocksDTO.RoundedCornersDTO getRoundedCorners() {
            return this.roundedCorners;
        }

        public int hashCode() {
            int hashCode = this.carouselBlock.hashCode() * 31;
            NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO = this.roundedCorners;
            return hashCode + (roundedCornersDTO == null ? 0 : roundedCornersDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "CarouselNaviBlockModel(carouselBlock=" + this.carouselBlock + ", roundedCorners=" + this.roundedCorners + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CoupleNaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO;", "coupleBlock", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "roundedCorners", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO;Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO;", "getCoupleBlock", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CoupleNaviBlockModel extends NaviBlockModel {

        @NotNull
        private final NaviBlocksDTO.NaviBlockDTO.SquareCoupleDTO coupleBlock;
        private final NaviBlocksDTO.RoundedCornersDTO roundedCorners;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CoupleNaviBlockModel(@NotNull NaviBlocksDTO.NaviBlockDTO.SquareCoupleDTO coupleBlock, NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO) {
            super(roundedCornersDTO, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(coupleBlock, "coupleBlock");
            this.coupleBlock = coupleBlock;
            this.roundedCorners = roundedCornersDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CoupleNaviBlockModel)) {
                return false;
            }
            CoupleNaviBlockModel coupleNaviBlockModel = (CoupleNaviBlockModel) other;
            return Intrinsics.d(this.coupleBlock, coupleNaviBlockModel.coupleBlock) && this.roundedCorners == coupleNaviBlockModel.roundedCorners;
        }

        @NotNull
        public final NaviBlocksDTO.NaviBlockDTO.SquareCoupleDTO getCoupleBlock() {
            return this.coupleBlock;
        }

        @Override // ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel
        public NaviBlocksDTO.RoundedCornersDTO getRoundedCorners() {
            return this.roundedCorners;
        }

        public int hashCode() {
            int hashCode = this.coupleBlock.hashCode() * 31;
            NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO = this.roundedCorners;
            return hashCode + (roundedCornersDTO == null ? 0 : roundedCornersDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "CoupleNaviBlockModel(coupleBlock=" + this.coupleBlock + ", roundedCorners=" + this.roundedCorners + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$LastEmptyNaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "roundedCorners", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LastEmptyNaviBlockModel extends NaviBlockModel {
        private final NaviBlocksDTO.RoundedCornersDTO roundedCorners;

        /* JADX WARN: Multi-variable type inference failed */
        public LastEmptyNaviBlockModel(NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO) {
            super(roundedCornersDTO, null, 2, 0 == true ? 1 : 0);
            this.roundedCorners = roundedCornersDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LastEmptyNaviBlockModel) && this.roundedCorners == ((LastEmptyNaviBlockModel) other).roundedCorners;
        }

        @Override // ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel
        public NaviBlocksDTO.RoundedCornersDTO getRoundedCorners() {
            return this.roundedCorners;
        }

        public int hashCode() {
            NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO = this.roundedCorners;
            if (roundedCornersDTO == null) {
                return 0;
            }
            return roundedCornersDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return "LastEmptyNaviBlockModel(roundedCorners=" + this.roundedCorners + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$OneFrameNaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO;", "oneFrameBlock", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "roundedCorners", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO;Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO;", "getOneFrameBlock", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OneFrameNaviBlockModel extends NaviBlockModel {

        @NotNull
        private final NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO.FrameDTO oneFrameBlock;
        private final NaviBlocksDTO.RoundedCornersDTO roundedCorners;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OneFrameNaviBlockModel(@NotNull NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO.FrameDTO oneFrameBlock, NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO) {
            super(roundedCornersDTO, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(oneFrameBlock, "oneFrameBlock");
            this.oneFrameBlock = oneFrameBlock;
            this.roundedCorners = roundedCornersDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OneFrameNaviBlockModel)) {
                return false;
            }
            OneFrameNaviBlockModel oneFrameNaviBlockModel = (OneFrameNaviBlockModel) other;
            return Intrinsics.d(this.oneFrameBlock, oneFrameNaviBlockModel.oneFrameBlock) && this.roundedCorners == oneFrameNaviBlockModel.roundedCorners;
        }

        @NotNull
        public final NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO.FrameDTO getOneFrameBlock() {
            return this.oneFrameBlock;
        }

        @Override // ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel
        public NaviBlocksDTO.RoundedCornersDTO getRoundedCorners() {
            return this.roundedCorners;
        }

        public int hashCode() {
            int hashCode = this.oneFrameBlock.hashCode() * 31;
            NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO = this.roundedCorners;
            return hashCode + (roundedCornersDTO == null ? 0 : roundedCornersDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "OneFrameNaviBlockModel(oneFrameBlock=" + this.oneFrameBlock + ", roundedCorners=" + this.roundedCorners + ")";
        }
    }

    public /* synthetic */ NaviBlockModel(NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO, NaviBlockPositionVO naviBlockPositionVO, DefaultConstructorMarker defaultConstructorMarker) {
        this(roundedCornersDTO, naviBlockPositionVO);
    }

    @NotNull
    public NaviBlockPositionVO getPosition() {
        return this.position;
    }

    public NaviBlocksDTO.RoundedCornersDTO getRoundedCorners() {
        return this.roundedCorners;
    }

    public void setPosition(@NotNull NaviBlockPositionVO naviBlockPositionVO) {
        Intrinsics.checkNotNullParameter(naviBlockPositionVO, "<set-?>");
        this.position = naviBlockPositionVO;
    }

    private NaviBlockModel(NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO, NaviBlockPositionVO naviBlockPositionVO) {
        this.roundedCorners = roundedCornersDTO;
        this.position = naviBlockPositionVO;
    }

    public /* synthetic */ NaviBlockModel(NaviBlocksDTO.RoundedCornersDTO roundedCornersDTO, NaviBlockPositionVO naviBlockPositionVO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(roundedCornersDTO, (i11 & 2) != 0 ? NaviBlockPositionVO.FIRST : naviBlockPositionVO, null);
    }
}
