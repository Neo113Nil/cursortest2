package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data;

import B3.p;
import GR.b;
import Xc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003456Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\t\u0010,\u001a\u00020\u0013HÆ\u0003J}\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO;", "", "banner", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseBannerDTO;", "tiles", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO;", "products", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseOldTileDTO;", "beak", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$BeakDTO;", "backgroundColor", "", "paddings", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$PaddingsDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "sizeConfiguration", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$SizeConfigurationDTO;", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseBannerDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$BeakDTO;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$PaddingsDTO;Ljava/util/Map;Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$SizeConfigurationDTO;)V", "getBanner", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseBannerDTO;", "getTiles", "()Ljava/util/List;", "getProducts", "getBeak", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$BeakDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$PaddingsDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getSizeConfiguration", "()Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$SizeConfigurationDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "PaddingsDTO", "BeakDTO", "SizeConfigurationDTO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WiseSkuScrollDTO {
    private final String backgroundColor;
    private final WiseBannerDTO banner;
    private final BeakDTO beak;

    @NotNull
    private final PaddingsDTO paddings;
    private final List<WiseOldTileDTO> products;

    @NotNull
    private final SizeConfigurationDTO sizeConfiguration;
    private final List<FreshTileDTO> tiles;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$BeakDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BeakDTO {

        @NotNull
        private final AtomActionDTO action;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public BeakDTO(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BeakDTO copy$default(BeakDTO beakDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = beakDTO.action;
            }
            if ((i11 & 2) != 0) {
                map = beakDTO.trackingInfo;
            }
            return beakDTO.copy(atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        @NotNull
        public final BeakDTO copy(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new BeakDTO(action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BeakDTO)) {
                return false;
            }
            BeakDTO beakDTO = (BeakDTO) other;
            return Intrinsics.d(this.action, beakDTO.action) && Intrinsics.d(this.trackingInfo, beakDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "BeakDTO(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$PaddingsDTO;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings left;
        private final Paddings right;

        @NotNull
        private final Paddings top;

        public PaddingsDTO() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsDTO.right;
            }
            return paddingsDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final PaddingsDTO copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            return new PaddingsDTO(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.top == paddingsDTO.top && this.bottom == paddingsDTO.bottom && this.left == paddingsDTO.left && this.right == paddingsDTO.right;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            int b11 = b.b(this.left, b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
            Paddings paddings = this.right;
            return b11 + (paddings == null ? 0 : paddings.hashCode());
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return b.e(p.b("PaddingsDTO(top=", paddings, ", bottom=", paddings2, ", left="), this.left, ", right=", this.right, ")");
        }

        public PaddingsDTO(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, Paddings paddings) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = paddings;
        }

        public /* synthetic */ PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_500 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_300 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_400 : paddings3, (i11 & 8) != 0 ? null : paddings4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$SizeConfigurationDTO;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD_SET", "COMBO_SET", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SizeConfigurationDTO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SizeConfigurationDTO[] $VALUES;
        public static final SizeConfigurationDTO STANDARD_SET = new SizeConfigurationDTO("STANDARD_SET", 0);
        public static final SizeConfigurationDTO COMBO_SET = new SizeConfigurationDTO("COMBO_SET", 1);

        private static final /* synthetic */ SizeConfigurationDTO[] $values() {
            return new SizeConfigurationDTO[]{STANDARD_SET, COMBO_SET};
        }

        static {
            SizeConfigurationDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private SizeConfigurationDTO(String str, int i11) {
        }

        public static SizeConfigurationDTO valueOf(String str) {
            return (SizeConfigurationDTO) Enum.valueOf(SizeConfigurationDTO.class, str);
        }

        public static SizeConfigurationDTO[] values() {
            return (SizeConfigurationDTO[]) $VALUES.clone();
        }
    }

    public WiseSkuScrollDTO(WiseBannerDTO wiseBannerDTO, List<FreshTileDTO> list, List<WiseOldTileDTO> list2, BeakDTO beakDTO, String str, @NotNull PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> map, @NotNull SizeConfigurationDTO sizeConfiguration) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(sizeConfiguration, "sizeConfiguration");
        this.banner = wiseBannerDTO;
        this.tiles = list;
        this.products = list2;
        this.beak = beakDTO;
        this.backgroundColor = str;
        this.paddings = paddings;
        this.trackingInfo = map;
        this.sizeConfiguration = sizeConfiguration;
    }

    public static /* synthetic */ WiseSkuScrollDTO copy$default(WiseSkuScrollDTO wiseSkuScrollDTO, WiseBannerDTO wiseBannerDTO, List list, List list2, BeakDTO beakDTO, String str, PaddingsDTO paddingsDTO, Map map, SizeConfigurationDTO sizeConfigurationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wiseBannerDTO = wiseSkuScrollDTO.banner;
        }
        if ((i11 & 2) != 0) {
            list = wiseSkuScrollDTO.tiles;
        }
        if ((i11 & 4) != 0) {
            list2 = wiseSkuScrollDTO.products;
        }
        if ((i11 & 8) != 0) {
            beakDTO = wiseSkuScrollDTO.beak;
        }
        if ((i11 & 16) != 0) {
            str = wiseSkuScrollDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            paddingsDTO = wiseSkuScrollDTO.paddings;
        }
        if ((i11 & 64) != 0) {
            map = wiseSkuScrollDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            sizeConfigurationDTO = wiseSkuScrollDTO.sizeConfiguration;
        }
        Map map2 = map;
        SizeConfigurationDTO sizeConfigurationDTO2 = sizeConfigurationDTO;
        String str2 = str;
        PaddingsDTO paddingsDTO2 = paddingsDTO;
        return wiseSkuScrollDTO.copy(wiseBannerDTO, list, list2, beakDTO, str2, paddingsDTO2, map2, sizeConfigurationDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final WiseBannerDTO getBanner() {
        return this.banner;
    }

    public final List<FreshTileDTO> component2() {
        return this.tiles;
    }

    public final List<WiseOldTileDTO> component3() {
        return this.products;
    }

    /* renamed from: component4, reason: from getter */
    public final BeakDTO getBeak() {
        return this.beak;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final SizeConfigurationDTO getSizeConfiguration() {
        return this.sizeConfiguration;
    }

    @NotNull
    public final WiseSkuScrollDTO copy(WiseBannerDTO banner, List<FreshTileDTO> tiles, List<WiseOldTileDTO> products, BeakDTO beak, String backgroundColor, @NotNull PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull SizeConfigurationDTO sizeConfiguration) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(sizeConfiguration, "sizeConfiguration");
        return new WiseSkuScrollDTO(banner, tiles, products, beak, backgroundColor, paddings, trackingInfo, sizeConfiguration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WiseSkuScrollDTO)) {
            return false;
        }
        WiseSkuScrollDTO wiseSkuScrollDTO = (WiseSkuScrollDTO) other;
        return Intrinsics.d(this.banner, wiseSkuScrollDTO.banner) && Intrinsics.d(this.tiles, wiseSkuScrollDTO.tiles) && Intrinsics.d(this.products, wiseSkuScrollDTO.products) && Intrinsics.d(this.beak, wiseSkuScrollDTO.beak) && Intrinsics.d(this.backgroundColor, wiseSkuScrollDTO.backgroundColor) && Intrinsics.d(this.paddings, wiseSkuScrollDTO.paddings) && Intrinsics.d(this.trackingInfo, wiseSkuScrollDTO.trackingInfo) && this.sizeConfiguration == wiseSkuScrollDTO.sizeConfiguration;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final WiseBannerDTO getBanner() {
        return this.banner;
    }

    public final BeakDTO getBeak() {
        return this.beak;
    }

    @NotNull
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final List<WiseOldTileDTO> getProducts() {
        return this.products;
    }

    @NotNull
    public final SizeConfigurationDTO getSizeConfiguration() {
        return this.sizeConfiguration;
    }

    public final List<FreshTileDTO> getTiles() {
        return this.tiles;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        WiseBannerDTO wiseBannerDTO = this.banner;
        int hashCode = (wiseBannerDTO == null ? 0 : wiseBannerDTO.hashCode()) * 31;
        List<FreshTileDTO> list = this.tiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<WiseOldTileDTO> list2 = this.products;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BeakDTO beakDTO = this.beak;
        int hashCode4 = (hashCode3 + (beakDTO == null ? 0 : beakDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode5 = (this.paddings.hashCode() + ((hashCode4 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.sizeConfiguration.hashCode() + ((hashCode5 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "WiseSkuScrollDTO(banner=" + this.banner + ", tiles=" + this.tiles + ", products=" + this.products + ", beak=" + this.beak + ", backgroundColor=" + this.backgroundColor + ", paddings=" + this.paddings + ", trackingInfo=" + this.trackingInfo + ", sizeConfiguration=" + this.sizeConfiguration + ")";
    }

    public /* synthetic */ WiseSkuScrollDTO(WiseBannerDTO wiseBannerDTO, List list, List list2, BeakDTO beakDTO, String str, PaddingsDTO paddingsDTO, Map map, SizeConfigurationDTO sizeConfigurationDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiseBannerDTO, list, list2, beakDTO, str, (i11 & 32) != 0 ? new PaddingsDTO(null, null, null, null, 15, null) : paddingsDTO, map, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? SizeConfigurationDTO.STANDARD_SET : sizeConfigurationDTO);
    }
}
