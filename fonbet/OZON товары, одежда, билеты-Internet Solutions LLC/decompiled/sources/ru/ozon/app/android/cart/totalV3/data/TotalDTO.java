package ru.ozon.app.android.cart.totalV3.data;

import Am.C2438a;
import B0.C2454a;
import Cm.e;
import Ef0.c;
import G.g;
import T7.E;
import T7.Z;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB-\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ6\u0010\u0013\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO;", "", "items", "", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem;", "showRoundedHeader", "", "prefetch", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getItems", "()Ljava/util/List;", "getShowRoundedHeader", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPrefetch", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/cart/totalV3/data/TotalDTO;", "equals", "other", "hashCode", "", "toString", "", "TotalItem", "HorizontalMarginsDTO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TotalDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<TotalItem> items;
    private final Boolean prefetch;
    private final Boolean showRoundedHeader;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "", "marginLeft", "", "marginRight", "<init>", "(II)V", "getMarginLeft", "()I", "getMarginRight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class HorizontalMarginsDTO {
        public static final int $stable = 0;
        private final int marginLeft;
        private final int marginRight;

        public HorizontalMarginsDTO(int i11, int i12) {
            this.marginLeft = i11;
            this.marginRight = i12;
        }

        public static /* synthetic */ HorizontalMarginsDTO copy$default(HorizontalMarginsDTO horizontalMarginsDTO, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = horizontalMarginsDTO.marginLeft;
            }
            if ((i13 & 2) != 0) {
                i12 = horizontalMarginsDTO.marginRight;
            }
            return horizontalMarginsDTO.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMarginLeft() {
            return this.marginLeft;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMarginRight() {
            return this.marginRight;
        }

        @NotNull
        public final HorizontalMarginsDTO copy(int marginLeft, int marginRight) {
            return new HorizontalMarginsDTO(marginLeft, marginRight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalMarginsDTO)) {
                return false;
            }
            HorizontalMarginsDTO horizontalMarginsDTO = (HorizontalMarginsDTO) other;
            return this.marginLeft == horizontalMarginsDTO.marginLeft && this.marginRight == horizontalMarginsDTO.marginRight;
        }

        public final int getMarginLeft() {
            return this.marginLeft;
        }

        public final int getMarginRight() {
            return this.marginRight;
        }

        public int hashCode() {
            return Integer.hashCode(this.marginRight) + (Integer.hashCode(this.marginLeft) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("HorizontalMarginsDTO(marginLeft=", this.marginLeft, ", marginRight=", ")", this.marginRight);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem;", "", "TotalButtonDTO", "TotalTextDTO", "PriceBlockDTO", "SpaceDTO", "PriceLineDTO", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$SpaceDTO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$TotalButtonDTO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$TotalTextDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TotalItem {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u001f !\"B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem;", "leftPriceCart", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;", "rightPriceCart", "divider", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$DividerDTO;", "margins", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "<init>", "(Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$DividerDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;)V", "getLeftPriceCart", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;", "getRightPriceCart", "getDivider", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$DividerDTO;", "getMargins", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PriceCardDTO", "DividerDTO", "TextWithIconDTO", "IconWithPositionDTO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class PriceBlockDTO implements TotalItem {
            public static final int $stable;
            private final DividerDTO divider;

            @NotNull
            private final PriceCardDTO leftPriceCart;
            private final HorizontalMarginsDTO margins;
            private final PriceCardDTO rightPriceCart;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$DividerDTO;", "", "height", "", "width", "color", "", "margins", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "<init>", "(IILjava/lang/String;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;)V", "getHeight", "()I", "getWidth", "getColor", "()Ljava/lang/String;", "getMargins", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final /* data */ class DividerDTO {
                public static final int $stable = 0;

                @NotNull
                private final String color;
                private final int height;

                @NotNull
                private final HorizontalMarginsDTO margins;
                private final int width;

                public DividerDTO(int i11, int i12, @NotNull String color, @NotNull HorizontalMarginsDTO margins) {
                    Intrinsics.checkNotNullParameter(color, "color");
                    Intrinsics.checkNotNullParameter(margins, "margins");
                    this.height = i11;
                    this.width = i12;
                    this.color = color;
                    this.margins = margins;
                }

                public static /* synthetic */ DividerDTO copy$default(DividerDTO dividerDTO, int i11, int i12, String str, HorizontalMarginsDTO horizontalMarginsDTO, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        i11 = dividerDTO.height;
                    }
                    if ((i13 & 2) != 0) {
                        i12 = dividerDTO.width;
                    }
                    if ((i13 & 4) != 0) {
                        str = dividerDTO.color;
                    }
                    if ((i13 & 8) != 0) {
                        horizontalMarginsDTO = dividerDTO.margins;
                    }
                    return dividerDTO.copy(i11, i12, str, horizontalMarginsDTO);
                }

                /* renamed from: component1, reason: from getter */
                public final int getHeight() {
                    return this.height;
                }

                /* renamed from: component2, reason: from getter */
                public final int getWidth() {
                    return this.width;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final String getColor() {
                    return this.color;
                }

                @NotNull
                /* renamed from: component4, reason: from getter */
                public final HorizontalMarginsDTO getMargins() {
                    return this.margins;
                }

                @NotNull
                public final DividerDTO copy(int height, int width, @NotNull String color, @NotNull HorizontalMarginsDTO margins) {
                    Intrinsics.checkNotNullParameter(color, "color");
                    Intrinsics.checkNotNullParameter(margins, "margins");
                    return new DividerDTO(height, width, color, margins);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DividerDTO)) {
                        return false;
                    }
                    DividerDTO dividerDTO = (DividerDTO) other;
                    return this.height == dividerDTO.height && this.width == dividerDTO.width && Intrinsics.d(this.color, dividerDTO.color) && Intrinsics.d(this.margins, dividerDTO.margins);
                }

                @NotNull
                public final String getColor() {
                    return this.color;
                }

                public final int getHeight() {
                    return this.height;
                }

                @NotNull
                public final HorizontalMarginsDTO getMargins() {
                    return this.margins;
                }

                public final int getWidth() {
                    return this.width;
                }

                public int hashCode() {
                    return this.margins.hashCode() + g.a(C2454a.a(this.width, Integer.hashCode(this.height) * 31, 31), 31, this.color);
                }

                @NotNull
                public String toString() {
                    int i11 = this.height;
                    int i12 = this.width;
                    String str = this.color;
                    HorizontalMarginsDTO horizontalMarginsDTO = this.margins;
                    StringBuilder a11 = C2438a.a("DividerDTO(height=", i11, ", width=", ", color=", i12);
                    a11.append(str);
                    a11.append(", margins=");
                    a11.append(horizontalMarginsDTO);
                    a11.append(")");
                    return a11.toString();
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "position", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO$PositionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO$PositionDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPosition", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO$PositionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PositionDTO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            /* loaded from: classes11.dex */
            public static final /* data */ class IconWithPositionDTO {
                public static final int $stable = IconDTO.$stable;

                @NotNull
                private final IconDTO icon;

                @NotNull
                private final PositionDTO position;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO$PositionDTO;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class PositionDTO {
                    private static final /* synthetic */ a $ENTRIES;
                    private static final /* synthetic */ PositionDTO[] $VALUES;
                    public static final PositionDTO START = new PositionDTO("START", 0);
                    public static final PositionDTO END = new PositionDTO("END", 1);

                    private static final /* synthetic */ PositionDTO[] $values() {
                        return new PositionDTO[]{START, END};
                    }

                    static {
                        PositionDTO[] $values = $values();
                        $VALUES = $values;
                        $ENTRIES = b.a($values);
                    }

                    private PositionDTO(String str, int i11) {
                    }

                    public static PositionDTO valueOf(String str) {
                        return (PositionDTO) Enum.valueOf(PositionDTO.class, str);
                    }

                    public static PositionDTO[] values() {
                        return (PositionDTO[]) $VALUES.clone();
                    }
                }

                public IconWithPositionDTO(@NotNull IconDTO icon, @NotNull PositionDTO position) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(position, "position");
                    this.icon = icon;
                    this.position = position;
                }

                public static /* synthetic */ IconWithPositionDTO copy$default(IconWithPositionDTO iconWithPositionDTO, IconDTO iconDTO, PositionDTO positionDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        iconDTO = iconWithPositionDTO.icon;
                    }
                    if ((i11 & 2) != 0) {
                        positionDTO = iconWithPositionDTO.position;
                    }
                    return iconWithPositionDTO.copy(iconDTO, positionDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final IconDTO getIcon() {
                    return this.icon;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final PositionDTO getPosition() {
                    return this.position;
                }

                @NotNull
                public final IconWithPositionDTO copy(@NotNull IconDTO icon, @NotNull PositionDTO position) {
                    Intrinsics.checkNotNullParameter(icon, "icon");
                    Intrinsics.checkNotNullParameter(position, "position");
                    return new IconWithPositionDTO(icon, position);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof IconWithPositionDTO)) {
                        return false;
                    }
                    IconWithPositionDTO iconWithPositionDTO = (IconWithPositionDTO) other;
                    return Intrinsics.d(this.icon, iconWithPositionDTO.icon) && this.position == iconWithPositionDTO.position;
                }

                @NotNull
                public final IconDTO getIcon() {
                    return this.icon;
                }

                @NotNull
                public final PositionDTO getPosition() {
                    return this.position;
                }

                public int hashCode() {
                    return this.position.hashCode() + (this.icon.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "IconWithPositionDTO(icon=" + this.icon + ", position=" + this.position + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJj\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001e\u0010\u001a¨\u0006."}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "textWithIcon", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$TextWithIconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "backgroundColor", "", "topPadding", "", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$TextWithIconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getTextWithIcon", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$TextWithIconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getBackgroundColor", "()Ljava/lang/String;", "getTopPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$TextWithIconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;", "equals", "", "other", "hashCode", "toString", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final /* data */ class PriceCardDTO {
                public static final int $stable = IconDTO.$stable | PriceDTO.$stable;
                private final String backgroundColor;
                private final Integer bottomPadding;
                private final CommonControlSettings common;
                private final Integer leftPadding;

                @NotNull
                private final PriceDTO price;
                private final Integer rightPadding;

                @NotNull
                private final TextWithIconDTO textWithIcon;
                private final Integer topPadding;

                public PriceCardDTO(@NotNull PriceDTO price, @NotNull TextWithIconDTO textWithIcon, CommonControlSettings commonControlSettings, String str, Integer num, Integer num2, Integer num3, Integer num4) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    Intrinsics.checkNotNullParameter(textWithIcon, "textWithIcon");
                    this.price = price;
                    this.textWithIcon = textWithIcon;
                    this.common = commonControlSettings;
                    this.backgroundColor = str;
                    this.topPadding = num;
                    this.bottomPadding = num2;
                    this.leftPadding = num3;
                    this.rightPadding = num4;
                }

                public static /* synthetic */ PriceCardDTO copy$default(PriceCardDTO priceCardDTO, PriceDTO priceDTO, TextWithIconDTO textWithIconDTO, CommonControlSettings commonControlSettings, String str, Integer num, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        priceDTO = priceCardDTO.price;
                    }
                    if ((i11 & 2) != 0) {
                        textWithIconDTO = priceCardDTO.textWithIcon;
                    }
                    if ((i11 & 4) != 0) {
                        commonControlSettings = priceCardDTO.common;
                    }
                    if ((i11 & 8) != 0) {
                        str = priceCardDTO.backgroundColor;
                    }
                    if ((i11 & 16) != 0) {
                        num = priceCardDTO.topPadding;
                    }
                    if ((i11 & 32) != 0) {
                        num2 = priceCardDTO.bottomPadding;
                    }
                    if ((i11 & 64) != 0) {
                        num3 = priceCardDTO.leftPadding;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        num4 = priceCardDTO.rightPadding;
                    }
                    Integer num5 = num3;
                    Integer num6 = num4;
                    Integer num7 = num;
                    Integer num8 = num2;
                    return priceCardDTO.copy(priceDTO, textWithIconDTO, commonControlSettings, str, num7, num8, num5, num6);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final PriceDTO getPrice() {
                    return this.price;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final TextWithIconDTO getTextWithIcon() {
                    return this.textWithIcon;
                }

                /* renamed from: component3, reason: from getter */
                public final CommonControlSettings getCommon() {
                    return this.common;
                }

                /* renamed from: component4, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                /* renamed from: component5, reason: from getter */
                public final Integer getTopPadding() {
                    return this.topPadding;
                }

                /* renamed from: component6, reason: from getter */
                public final Integer getBottomPadding() {
                    return this.bottomPadding;
                }

                /* renamed from: component7, reason: from getter */
                public final Integer getLeftPadding() {
                    return this.leftPadding;
                }

                /* renamed from: component8, reason: from getter */
                public final Integer getRightPadding() {
                    return this.rightPadding;
                }

                @NotNull
                public final PriceCardDTO copy(@NotNull PriceDTO price, @NotNull TextWithIconDTO textWithIcon, CommonControlSettings common, String backgroundColor, Integer topPadding, Integer bottomPadding, Integer leftPadding, Integer rightPadding) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    Intrinsics.checkNotNullParameter(textWithIcon, "textWithIcon");
                    return new PriceCardDTO(price, textWithIcon, common, backgroundColor, topPadding, bottomPadding, leftPadding, rightPadding);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PriceCardDTO)) {
                        return false;
                    }
                    PriceCardDTO priceCardDTO = (PriceCardDTO) other;
                    return Intrinsics.d(this.price, priceCardDTO.price) && Intrinsics.d(this.textWithIcon, priceCardDTO.textWithIcon) && Intrinsics.d(this.common, priceCardDTO.common) && Intrinsics.d(this.backgroundColor, priceCardDTO.backgroundColor) && Intrinsics.d(this.topPadding, priceCardDTO.topPadding) && Intrinsics.d(this.bottomPadding, priceCardDTO.bottomPadding) && Intrinsics.d(this.leftPadding, priceCardDTO.leftPadding) && Intrinsics.d(this.rightPadding, priceCardDTO.rightPadding);
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final Integer getBottomPadding() {
                    return this.bottomPadding;
                }

                public final CommonControlSettings getCommon() {
                    return this.common;
                }

                public final Integer getLeftPadding() {
                    return this.leftPadding;
                }

                @NotNull
                public final PriceDTO getPrice() {
                    return this.price;
                }

                public final Integer getRightPadding() {
                    return this.rightPadding;
                }

                @NotNull
                public final TextWithIconDTO getTextWithIcon() {
                    return this.textWithIcon;
                }

                public final Integer getTopPadding() {
                    return this.topPadding;
                }

                public int hashCode() {
                    int hashCode = (this.textWithIcon.hashCode() + (this.price.hashCode() * 31)) * 31;
                    CommonControlSettings commonControlSettings = this.common;
                    int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
                    String str = this.backgroundColor;
                    int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    Integer num = this.topPadding;
                    int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.bottomPadding;
                    int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Integer num3 = this.leftPadding;
                    int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
                    Integer num4 = this.rightPadding;
                    return hashCode6 + (num4 != null ? num4.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    PriceDTO priceDTO = this.price;
                    TextWithIconDTO textWithIconDTO = this.textWithIcon;
                    CommonControlSettings commonControlSettings = this.common;
                    String str = this.backgroundColor;
                    Integer num = this.topPadding;
                    Integer num2 = this.bottomPadding;
                    Integer num3 = this.leftPadding;
                    Integer num4 = this.rightPadding;
                    StringBuilder sb2 = new StringBuilder("PriceCardDTO(price=");
                    sb2.append(priceDTO);
                    sb2.append(", textWithIcon=");
                    sb2.append(textWithIconDTO);
                    sb2.append(", common=");
                    sb2.append(commonControlSettings);
                    sb2.append(", backgroundColor=");
                    sb2.append(str);
                    sb2.append(", topPadding=");
                    c.e(sb2, num, ", bottomPadding=", num2, ", leftPadding=");
                    return Z.c(sb2, num3, ", rightPadding=", num4, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$TextWithIconDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconWithPosition", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconWithPosition", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final /* data */ class TextWithIconDTO {
                public static final int $stable = IconDTO.$stable;
                private final IconWithPositionDTO iconWithPosition;

                @NotNull
                private final TextDTO text;

                public TextWithIconDTO(@NotNull TextDTO text, IconWithPositionDTO iconWithPositionDTO) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                    this.iconWithPosition = iconWithPositionDTO;
                }

                public static /* synthetic */ TextWithIconDTO copy$default(TextWithIconDTO textWithIconDTO, TextDTO textDTO, IconWithPositionDTO iconWithPositionDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = textWithIconDTO.text;
                    }
                    if ((i11 & 2) != 0) {
                        iconWithPositionDTO = textWithIconDTO.iconWithPosition;
                    }
                    return textWithIconDTO.copy(textDTO, iconWithPositionDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getText() {
                    return this.text;
                }

                /* renamed from: component2, reason: from getter */
                public final IconWithPositionDTO getIconWithPosition() {
                    return this.iconWithPosition;
                }

                @NotNull
                public final TextWithIconDTO copy(@NotNull TextDTO text, IconWithPositionDTO iconWithPosition) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new TextWithIconDTO(text, iconWithPosition);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TextWithIconDTO)) {
                        return false;
                    }
                    TextWithIconDTO textWithIconDTO = (TextWithIconDTO) other;
                    return Intrinsics.d(this.text, textWithIconDTO.text) && Intrinsics.d(this.iconWithPosition, textWithIconDTO.iconWithPosition);
                }

                public final IconWithPositionDTO getIconWithPosition() {
                    return this.iconWithPosition;
                }

                @NotNull
                public final TextDTO getText() {
                    return this.text;
                }

                public int hashCode() {
                    int hashCode = this.text.hashCode() * 31;
                    IconWithPositionDTO iconWithPositionDTO = this.iconWithPosition;
                    return hashCode + (iconWithPositionDTO == null ? 0 : iconWithPositionDTO.hashCode());
                }

                @NotNull
                public String toString() {
                    return "TextWithIconDTO(text=" + this.text + ", iconWithPosition=" + this.iconWithPosition + ")";
                }
            }

            static {
                int i11 = IconDTO.$stable;
                int i12 = PriceDTO.$stable;
                $stable = i11 | i11 | i12 | i12;
            }

            public PriceBlockDTO(@NotNull PriceCardDTO leftPriceCart, PriceCardDTO priceCardDTO, DividerDTO dividerDTO, HorizontalMarginsDTO horizontalMarginsDTO) {
                Intrinsics.checkNotNullParameter(leftPriceCart, "leftPriceCart");
                this.leftPriceCart = leftPriceCart;
                this.rightPriceCart = priceCardDTO;
                this.divider = dividerDTO;
                this.margins = horizontalMarginsDTO;
            }

            public static /* synthetic */ PriceBlockDTO copy$default(PriceBlockDTO priceBlockDTO, PriceCardDTO priceCardDTO, PriceCardDTO priceCardDTO2, DividerDTO dividerDTO, HorizontalMarginsDTO horizontalMarginsDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    priceCardDTO = priceBlockDTO.leftPriceCart;
                }
                if ((i11 & 2) != 0) {
                    priceCardDTO2 = priceBlockDTO.rightPriceCart;
                }
                if ((i11 & 4) != 0) {
                    dividerDTO = priceBlockDTO.divider;
                }
                if ((i11 & 8) != 0) {
                    horizontalMarginsDTO = priceBlockDTO.margins;
                }
                return priceBlockDTO.copy(priceCardDTO, priceCardDTO2, dividerDTO, horizontalMarginsDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final PriceCardDTO getLeftPriceCart() {
                return this.leftPriceCart;
            }

            /* renamed from: component2, reason: from getter */
            public final PriceCardDTO getRightPriceCart() {
                return this.rightPriceCart;
            }

            /* renamed from: component3, reason: from getter */
            public final DividerDTO getDivider() {
                return this.divider;
            }

            /* renamed from: component4, reason: from getter */
            public final HorizontalMarginsDTO getMargins() {
                return this.margins;
            }

            @NotNull
            public final PriceBlockDTO copy(@NotNull PriceCardDTO leftPriceCart, PriceCardDTO rightPriceCart, DividerDTO divider, HorizontalMarginsDTO margins) {
                Intrinsics.checkNotNullParameter(leftPriceCart, "leftPriceCart");
                return new PriceBlockDTO(leftPriceCart, rightPriceCart, divider, margins);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceBlockDTO)) {
                    return false;
                }
                PriceBlockDTO priceBlockDTO = (PriceBlockDTO) other;
                return Intrinsics.d(this.leftPriceCart, priceBlockDTO.leftPriceCart) && Intrinsics.d(this.rightPriceCart, priceBlockDTO.rightPriceCart) && Intrinsics.d(this.divider, priceBlockDTO.divider) && Intrinsics.d(this.margins, priceBlockDTO.margins);
            }

            public final DividerDTO getDivider() {
                return this.divider;
            }

            @NotNull
            public final PriceCardDTO getLeftPriceCart() {
                return this.leftPriceCart;
            }

            public final HorizontalMarginsDTO getMargins() {
                return this.margins;
            }

            public final PriceCardDTO getRightPriceCart() {
                return this.rightPriceCart;
            }

            public int hashCode() {
                int hashCode = this.leftPriceCart.hashCode() * 31;
                PriceCardDTO priceCardDTO = this.rightPriceCart;
                int hashCode2 = (hashCode + (priceCardDTO == null ? 0 : priceCardDTO.hashCode())) * 31;
                DividerDTO dividerDTO = this.divider;
                int hashCode3 = (hashCode2 + (dividerDTO == null ? 0 : dividerDTO.hashCode())) * 31;
                HorizontalMarginsDTO horizontalMarginsDTO = this.margins;
                return hashCode3 + (horizontalMarginsDTO != null ? horizontalMarginsDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "PriceBlockDTO(leftPriceCart=" + this.leftPriceCart + ", rightPriceCart=" + this.rightPriceCart + ", divider=" + this.divider + ", margins=" + this.margins + ")";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem;", "left", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceLinePartDTO;", "right", "margins", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "<init>", "(Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceLinePartDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceLinePartDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;)V", "getLeft", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceLinePartDTO;", "getRight", "getMargins", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PriceLinePartDTO", "PriceWithCommonDTO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class PriceLineDTO implements TotalItem {
            public static final int $stable = PriceDTO.$stable;
            private final PriceLinePartDTO left;
            private final HorizontalMarginsDTO margins;
            private final PriceLinePartDTO right;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceLinePartDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "priceWithCommon", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceWithCommonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceWithCommonDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPriceWithCommon", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceWithCommonDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final /* data */ class PriceLinePartDTO {
                public static final int $stable = PriceDTO.$stable;
                private final PriceWithCommonDTO priceWithCommon;
                private final TextDTO text;

                public PriceLinePartDTO(TextDTO textDTO, PriceWithCommonDTO priceWithCommonDTO) {
                    this.text = textDTO;
                    this.priceWithCommon = priceWithCommonDTO;
                }

                public static /* synthetic */ PriceLinePartDTO copy$default(PriceLinePartDTO priceLinePartDTO, TextDTO textDTO, PriceWithCommonDTO priceWithCommonDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = priceLinePartDTO.text;
                    }
                    if ((i11 & 2) != 0) {
                        priceWithCommonDTO = priceLinePartDTO.priceWithCommon;
                    }
                    return priceLinePartDTO.copy(textDTO, priceWithCommonDTO);
                }

                /* renamed from: component1, reason: from getter */
                public final TextDTO getText() {
                    return this.text;
                }

                /* renamed from: component2, reason: from getter */
                public final PriceWithCommonDTO getPriceWithCommon() {
                    return this.priceWithCommon;
                }

                @NotNull
                public final PriceLinePartDTO copy(TextDTO text, PriceWithCommonDTO priceWithCommon) {
                    return new PriceLinePartDTO(text, priceWithCommon);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PriceLinePartDTO)) {
                        return false;
                    }
                    PriceLinePartDTO priceLinePartDTO = (PriceLinePartDTO) other;
                    return Intrinsics.d(this.text, priceLinePartDTO.text) && Intrinsics.d(this.priceWithCommon, priceLinePartDTO.priceWithCommon);
                }

                public final PriceWithCommonDTO getPriceWithCommon() {
                    return this.priceWithCommon;
                }

                public final TextDTO getText() {
                    return this.text;
                }

                public int hashCode() {
                    TextDTO textDTO = this.text;
                    int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                    PriceWithCommonDTO priceWithCommonDTO = this.priceWithCommon;
                    return hashCode + (priceWithCommonDTO != null ? priceWithCommonDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "PriceLinePartDTO(text=" + this.text + ", priceWithCommon=" + this.priceWithCommon + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceWithCommonDTO;", "", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final /* data */ class PriceWithCommonDTO {
                public static final int $stable = PriceDTO.$stable;
                private final CommonControlSettings common;

                @NotNull
                private final PriceDTO price;

                public PriceWithCommonDTO(@NotNull PriceDTO price, CommonControlSettings commonControlSettings) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    this.price = price;
                    this.common = commonControlSettings;
                }

                public static /* synthetic */ PriceWithCommonDTO copy$default(PriceWithCommonDTO priceWithCommonDTO, PriceDTO priceDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        priceDTO = priceWithCommonDTO.price;
                    }
                    if ((i11 & 2) != 0) {
                        commonControlSettings = priceWithCommonDTO.common;
                    }
                    return priceWithCommonDTO.copy(priceDTO, commonControlSettings);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final PriceDTO getPrice() {
                    return this.price;
                }

                /* renamed from: component2, reason: from getter */
                public final CommonControlSettings getCommon() {
                    return this.common;
                }

                @NotNull
                public final PriceWithCommonDTO copy(@NotNull PriceDTO price, CommonControlSettings common) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    return new PriceWithCommonDTO(price, common);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PriceWithCommonDTO)) {
                        return false;
                    }
                    PriceWithCommonDTO priceWithCommonDTO = (PriceWithCommonDTO) other;
                    return Intrinsics.d(this.price, priceWithCommonDTO.price) && Intrinsics.d(this.common, priceWithCommonDTO.common);
                }

                public final CommonControlSettings getCommon() {
                    return this.common;
                }

                @NotNull
                public final PriceDTO getPrice() {
                    return this.price;
                }

                public int hashCode() {
                    int hashCode = this.price.hashCode() * 31;
                    CommonControlSettings commonControlSettings = this.common;
                    return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
                }

                @NotNull
                public String toString() {
                    return "PriceWithCommonDTO(price=" + this.price + ", common=" + this.common + ")";
                }
            }

            public PriceLineDTO(PriceLinePartDTO priceLinePartDTO, PriceLinePartDTO priceLinePartDTO2, HorizontalMarginsDTO horizontalMarginsDTO) {
                this.left = priceLinePartDTO;
                this.right = priceLinePartDTO2;
                this.margins = horizontalMarginsDTO;
            }

            public static /* synthetic */ PriceLineDTO copy$default(PriceLineDTO priceLineDTO, PriceLinePartDTO priceLinePartDTO, PriceLinePartDTO priceLinePartDTO2, HorizontalMarginsDTO horizontalMarginsDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    priceLinePartDTO = priceLineDTO.left;
                }
                if ((i11 & 2) != 0) {
                    priceLinePartDTO2 = priceLineDTO.right;
                }
                if ((i11 & 4) != 0) {
                    horizontalMarginsDTO = priceLineDTO.margins;
                }
                return priceLineDTO.copy(priceLinePartDTO, priceLinePartDTO2, horizontalMarginsDTO);
            }

            /* renamed from: component1, reason: from getter */
            public final PriceLinePartDTO getLeft() {
                return this.left;
            }

            /* renamed from: component2, reason: from getter */
            public final PriceLinePartDTO getRight() {
                return this.right;
            }

            /* renamed from: component3, reason: from getter */
            public final HorizontalMarginsDTO getMargins() {
                return this.margins;
            }

            @NotNull
            public final PriceLineDTO copy(PriceLinePartDTO left, PriceLinePartDTO right, HorizontalMarginsDTO margins) {
                return new PriceLineDTO(left, right, margins);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PriceLineDTO)) {
                    return false;
                }
                PriceLineDTO priceLineDTO = (PriceLineDTO) other;
                return Intrinsics.d(this.left, priceLineDTO.left) && Intrinsics.d(this.right, priceLineDTO.right) && Intrinsics.d(this.margins, priceLineDTO.margins);
            }

            public final PriceLinePartDTO getLeft() {
                return this.left;
            }

            public final HorizontalMarginsDTO getMargins() {
                return this.margins;
            }

            public final PriceLinePartDTO getRight() {
                return this.right;
            }

            public int hashCode() {
                PriceLinePartDTO priceLinePartDTO = this.left;
                int hashCode = (priceLinePartDTO == null ? 0 : priceLinePartDTO.hashCode()) * 31;
                PriceLinePartDTO priceLinePartDTO2 = this.right;
                int hashCode2 = (hashCode + (priceLinePartDTO2 == null ? 0 : priceLinePartDTO2.hashCode())) * 31;
                HorizontalMarginsDTO horizontalMarginsDTO = this.margins;
                return hashCode2 + (horizontalMarginsDTO != null ? horizontalMarginsDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "PriceLineDTO(left=" + this.left + ", right=" + this.right + ", margins=" + this.margins + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$SpaceDTO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem;", "height", "", "<init>", "(I)V", "getHeight", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SpaceDTO implements TotalItem {
            public static final int $stable = 0;
            private final int height;

            public SpaceDTO(int i11) {
                this.height = i11;
            }

            public static /* synthetic */ SpaceDTO copy$default(SpaceDTO spaceDTO, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = spaceDTO.height;
                }
                return spaceDTO.copy(i11);
            }

            /* renamed from: component1, reason: from getter */
            public final int getHeight() {
                return this.height;
            }

            @NotNull
            public final SpaceDTO copy(int height) {
                return new SpaceDTO(height);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SpaceDTO) && this.height == ((SpaceDTO) other).height;
            }

            public final int getHeight() {
                return this.height;
            }

            public int hashCode() {
                return Integer.hashCode(this.height);
            }

            @NotNull
            public String toString() {
                return E.a(this.height, "SpaceDTO(height=", ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$TotalButtonDTO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem;", "button", "Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "margins", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/DataButtonDTO;", "getMargins", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TotalButtonDTO implements TotalItem {
            public static final int $stable = DataButtonDTO.$stable;

            @NotNull
            private final DataButtonDTO button;
            private final HorizontalMarginsDTO margins;

            public TotalButtonDTO(@NotNull DataButtonDTO button, HorizontalMarginsDTO horizontalMarginsDTO) {
                Intrinsics.checkNotNullParameter(button, "button");
                this.button = button;
                this.margins = horizontalMarginsDTO;
            }

            public static /* synthetic */ TotalButtonDTO copy$default(TotalButtonDTO totalButtonDTO, DataButtonDTO dataButtonDTO, HorizontalMarginsDTO horizontalMarginsDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    dataButtonDTO = totalButtonDTO.button;
                }
                if ((i11 & 2) != 0) {
                    horizontalMarginsDTO = totalButtonDTO.margins;
                }
                return totalButtonDTO.copy(dataButtonDTO, horizontalMarginsDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final DataButtonDTO getButton() {
                return this.button;
            }

            /* renamed from: component2, reason: from getter */
            public final HorizontalMarginsDTO getMargins() {
                return this.margins;
            }

            @NotNull
            public final TotalButtonDTO copy(@NotNull DataButtonDTO button, HorizontalMarginsDTO margins) {
                Intrinsics.checkNotNullParameter(button, "button");
                return new TotalButtonDTO(button, margins);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TotalButtonDTO)) {
                    return false;
                }
                TotalButtonDTO totalButtonDTO = (TotalButtonDTO) other;
                return Intrinsics.d(this.button, totalButtonDTO.button) && Intrinsics.d(this.margins, totalButtonDTO.margins);
            }

            @NotNull
            public final DataButtonDTO getButton() {
                return this.button;
            }

            public final HorizontalMarginsDTO getMargins() {
                return this.margins;
            }

            public int hashCode() {
                int hashCode = this.button.hashCode() * 31;
                HorizontalMarginsDTO horizontalMarginsDTO = this.margins;
                return hashCode + (horizontalMarginsDTO == null ? 0 : horizontalMarginsDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "TotalButtonDTO(button=" + this.button + ", margins=" + this.margins + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$TotalTextDTO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "margins", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMargins", "()Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TotalTextDTO implements TotalItem {
            public static final int $stable = 0;
            private final HorizontalMarginsDTO margins;

            @NotNull
            private final TextDTO text;

            public TotalTextDTO(@NotNull TextDTO text, HorizontalMarginsDTO horizontalMarginsDTO) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.margins = horizontalMarginsDTO;
            }

            public static /* synthetic */ TotalTextDTO copy$default(TotalTextDTO totalTextDTO, TextDTO textDTO, HorizontalMarginsDTO horizontalMarginsDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = totalTextDTO.text;
                }
                if ((i11 & 2) != 0) {
                    horizontalMarginsDTO = totalTextDTO.margins;
                }
                return totalTextDTO.copy(textDTO, horizontalMarginsDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final HorizontalMarginsDTO getMargins() {
                return this.margins;
            }

            @NotNull
            public final TotalTextDTO copy(@NotNull TextDTO text, HorizontalMarginsDTO margins) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new TotalTextDTO(text, margins);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TotalTextDTO)) {
                    return false;
                }
                TotalTextDTO totalTextDTO = (TotalTextDTO) other;
                return Intrinsics.d(this.text, totalTextDTO.text) && Intrinsics.d(this.margins, totalTextDTO.margins);
            }

            public final HorizontalMarginsDTO getMargins() {
                return this.margins;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                HorizontalMarginsDTO horizontalMarginsDTO = this.margins;
                return hashCode + (horizontalMarginsDTO == null ? 0 : horizontalMarginsDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "TotalTextDTO(text=" + this.text + ", margins=" + this.margins + ")";
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TotalDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = TotalItem.TotalButtonDTO.class), @ProtoOneOfSignature(name = "text", type = TotalItem.TotalTextDTO.class), @ProtoOneOfSignature(name = "priceBlock", type = TotalItem.PriceBlockDTO.class), @ProtoOneOfSignature(name = "space", type = TotalItem.SpaceDTO.class), @ProtoOneOfSignature(name = "priceLine", type = TotalItem.PriceLineDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends TotalItem> items, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.showRoundedHeader = bool;
        this.prefetch = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TotalDTO copy$default(TotalDTO totalDTO, List list, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = totalDTO.items;
        }
        if ((i11 & 2) != 0) {
            bool = totalDTO.showRoundedHeader;
        }
        if ((i11 & 4) != 0) {
            bool2 = totalDTO.prefetch;
        }
        return totalDTO.copy(list, bool, bool2);
    }

    @NotNull
    public final List<TotalItem> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getShowRoundedHeader() {
        return this.showRoundedHeader;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getPrefetch() {
        return this.prefetch;
    }

    @NotNull
    public final TotalDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = TotalItem.TotalButtonDTO.class), @ProtoOneOfSignature(name = "text", type = TotalItem.TotalTextDTO.class), @ProtoOneOfSignature(name = "priceBlock", type = TotalItem.PriceBlockDTO.class), @ProtoOneOfSignature(name = "space", type = TotalItem.SpaceDTO.class), @ProtoOneOfSignature(name = "priceLine", type = TotalItem.PriceLineDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends TotalItem> items, Boolean showRoundedHeader, Boolean prefetch) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new TotalDTO(items, showRoundedHeader, prefetch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalDTO)) {
            return false;
        }
        TotalDTO totalDTO = (TotalDTO) other;
        return Intrinsics.d(this.items, totalDTO.items) && Intrinsics.d(this.showRoundedHeader, totalDTO.showRoundedHeader) && Intrinsics.d(this.prefetch, totalDTO.prefetch);
    }

    @NotNull
    public final List<TotalItem> getItems() {
        return this.items;
    }

    public final Boolean getPrefetch() {
        return this.prefetch;
    }

    public final Boolean getShowRoundedHeader() {
        return this.showRoundedHeader;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Boolean bool = this.showRoundedHeader;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.prefetch;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TotalItem> list = this.items;
        Boolean bool = this.showRoundedHeader;
        Boolean bool2 = this.prefetch;
        StringBuilder sb2 = new StringBuilder("TotalDTO(items=");
        sb2.append(list);
        sb2.append(", showRoundedHeader=");
        sb2.append(bool);
        sb2.append(", prefetch=");
        return D3.g.d(sb2, bool2, ")");
    }

    public /* synthetic */ TotalDTO(List list, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? Boolean.FALSE : bool, bool2);
    }
}
