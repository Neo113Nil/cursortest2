package ru.ozon.app.android.storefront.widgets.naviCategories.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesDTO;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.BlockPositionVO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u001d\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel;", "", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "position", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/BlockPositionVO;", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/BlockPositionVO;)V", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "getPosition", "()Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/BlockPositionVO;", "setPosition", "(Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/BlockPositionVO;)V", "SingleNaviCategoryModel", "DoubleNaviCategoryModel", "EmptyNaviCategoryModel", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel$DoubleNaviCategoryModel;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel$EmptyNaviCategoryModel;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel$SingleNaviCategoryModel;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class NaviCategoriesModel {

    @NotNull
    private BlockPositionVO position;
    private final NaviCategoriesDTO.RoundedCornersDTO roundedCorners;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel$DoubleNaviCategoryModel;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;", "block", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;", "getBlock", "()Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DoubleNaviCategoryModel extends NaviCategoriesModel {

        @NotNull
        private final NaviCategoriesDTO.NaviCategoryBlockDTO block;
        private final NaviCategoriesDTO.RoundedCornersDTO roundedCorners;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DoubleNaviCategoryModel(NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO, @NotNull NaviCategoriesDTO.NaviCategoryBlockDTO block) {
            super(roundedCornersDTO, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(block, "block");
            this.roundedCorners = roundedCornersDTO;
            this.block = block;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DoubleNaviCategoryModel)) {
                return false;
            }
            DoubleNaviCategoryModel doubleNaviCategoryModel = (DoubleNaviCategoryModel) other;
            return this.roundedCorners == doubleNaviCategoryModel.roundedCorners && Intrinsics.d(this.block, doubleNaviCategoryModel.block);
        }

        @NotNull
        public final NaviCategoriesDTO.NaviCategoryBlockDTO getBlock() {
            return this.block;
        }

        @Override // ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesModel
        public NaviCategoriesDTO.RoundedCornersDTO getRoundedCorners() {
            return this.roundedCorners;
        }

        public int hashCode() {
            NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO = this.roundedCorners;
            return this.block.hashCode() + ((roundedCornersDTO == null ? 0 : roundedCornersDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "DoubleNaviCategoryModel(roundedCorners=" + this.roundedCorners + ", block=" + this.block + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel$EmptyNaviCategoryModel;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "roundedCorners", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyNaviCategoryModel extends NaviCategoriesModel {
        private final NaviCategoriesDTO.RoundedCornersDTO roundedCorners;

        /* JADX WARN: Multi-variable type inference failed */
        public EmptyNaviCategoryModel(NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO) {
            super(roundedCornersDTO, null, 2, 0 == true ? 1 : 0);
            this.roundedCorners = roundedCornersDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EmptyNaviCategoryModel) && this.roundedCorners == ((EmptyNaviCategoryModel) other).roundedCorners;
        }

        @Override // ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesModel
        public NaviCategoriesDTO.RoundedCornersDTO getRoundedCorners() {
            return this.roundedCorners;
        }

        public int hashCode() {
            NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO = this.roundedCorners;
            if (roundedCornersDTO == null) {
                return 0;
            }
            return roundedCornersDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return "EmptyNaviCategoryModel(roundedCorners=" + this.roundedCorners + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel$SingleNaviCategoryModel;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;", "block", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$RoundedCornersDTO;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;", "getBlock", "()Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesDTO$NaviCategoryBlockDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SingleNaviCategoryModel extends NaviCategoriesModel {

        @NotNull
        private final NaviCategoriesDTO.NaviCategoryBlockDTO block;
        private final NaviCategoriesDTO.RoundedCornersDTO roundedCorners;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SingleNaviCategoryModel(NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO, @NotNull NaviCategoriesDTO.NaviCategoryBlockDTO block) {
            super(roundedCornersDTO, null, 2, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(block, "block");
            this.roundedCorners = roundedCornersDTO;
            this.block = block;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleNaviCategoryModel)) {
                return false;
            }
            SingleNaviCategoryModel singleNaviCategoryModel = (SingleNaviCategoryModel) other;
            return this.roundedCorners == singleNaviCategoryModel.roundedCorners && Intrinsics.d(this.block, singleNaviCategoryModel.block);
        }

        @NotNull
        public final NaviCategoriesDTO.NaviCategoryBlockDTO getBlock() {
            return this.block;
        }

        @Override // ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesModel
        public NaviCategoriesDTO.RoundedCornersDTO getRoundedCorners() {
            return this.roundedCorners;
        }

        public int hashCode() {
            NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO = this.roundedCorners;
            return this.block.hashCode() + ((roundedCornersDTO == null ? 0 : roundedCornersDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "SingleNaviCategoryModel(roundedCorners=" + this.roundedCorners + ", block=" + this.block + ")";
        }
    }

    public /* synthetic */ NaviCategoriesModel(NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO, BlockPositionVO blockPositionVO, DefaultConstructorMarker defaultConstructorMarker) {
        this(roundedCornersDTO, blockPositionVO);
    }

    @NotNull
    public BlockPositionVO getPosition() {
        return this.position;
    }

    public NaviCategoriesDTO.RoundedCornersDTO getRoundedCorners() {
        return this.roundedCorners;
    }

    public void setPosition(@NotNull BlockPositionVO blockPositionVO) {
        Intrinsics.checkNotNullParameter(blockPositionVO, "<set-?>");
        this.position = blockPositionVO;
    }

    private NaviCategoriesModel(NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO, BlockPositionVO blockPositionVO) {
        this.roundedCorners = roundedCornersDTO;
        this.position = blockPositionVO;
    }

    public /* synthetic */ NaviCategoriesModel(NaviCategoriesDTO.RoundedCornersDTO roundedCornersDTO, BlockPositionVO blockPositionVO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(roundedCornersDTO, (i11 & 2) != 0 ? BlockPositionVO.TOP_LEFT : blockPositionVO, null);
    }
}
