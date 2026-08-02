package ru.ozon.app.android.orderdetails.productsToPay.data;

import Ef0.c;
import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jf\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\nHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/data/ProductCounterDto;", "", "id", "", "plusButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "minusButton", "countValue", "Lru/ozon/uni/atoms/data/text/TextDTO;", "maxValue", "", "minValue", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getPlusButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getMinusButton", "getCountValue", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMaxValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinValue", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/orderdetails/productsToPay/data/ProductCounterDto;", "equals", "", "other", "hashCode", "toString", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductCounterDto {
    public static final int $stable = 8;

    @NotNull
    private final TextDTO countValue;

    @NotNull
    private final String id;
    private final Integer maxValue;
    private final Integer minValue;

    @NotNull
    private final IconButtonV3DTO minusButton;

    @NotNull
    private final IconButtonV3DTO plusButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ProductCounterDto(@NotNull String id2, @NotNull IconButtonV3DTO plusButton, @NotNull IconButtonV3DTO minusButton, @NotNull TextDTO countValue, Integer num, Integer num2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(plusButton, "plusButton");
        Intrinsics.checkNotNullParameter(minusButton, "minusButton");
        Intrinsics.checkNotNullParameter(countValue, "countValue");
        this.id = id2;
        this.plusButton = plusButton;
        this.minusButton = minusButton;
        this.countValue = countValue;
        this.maxValue = num;
        this.minValue = num2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ProductCounterDto copy$default(ProductCounterDto productCounterDto, String str, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, TextDTO textDTO, Integer num, Integer num2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = productCounterDto.id;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = productCounterDto.plusButton;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO2 = productCounterDto.minusButton;
        }
        if ((i11 & 8) != 0) {
            textDTO = productCounterDto.countValue;
        }
        if ((i11 & 16) != 0) {
            num = productCounterDto.maxValue;
        }
        if ((i11 & 32) != 0) {
            num2 = productCounterDto.minValue;
        }
        if ((i11 & 64) != 0) {
            map = productCounterDto.trackingInfo;
        }
        Integer num3 = num2;
        Map map2 = map;
        Integer num4 = num;
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO2;
        return productCounterDto.copy(str, iconButtonV3DTO, iconButtonV3DTO3, textDTO, num4, num3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getPlusButton() {
        return this.plusButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getMinusButton() {
        return this.minusButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getCountValue() {
        return this.countValue;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getMinValue() {
        return this.minValue;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProductCounterDto copy(@NotNull String id2, @NotNull IconButtonV3DTO plusButton, @NotNull IconButtonV3DTO minusButton, @NotNull TextDTO countValue, Integer maxValue, Integer minValue, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(plusButton, "plusButton");
        Intrinsics.checkNotNullParameter(minusButton, "minusButton");
        Intrinsics.checkNotNullParameter(countValue, "countValue");
        return new ProductCounterDto(id2, plusButton, minusButton, countValue, maxValue, minValue, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCounterDto)) {
            return false;
        }
        ProductCounterDto productCounterDto = (ProductCounterDto) other;
        return Intrinsics.d(this.id, productCounterDto.id) && Intrinsics.d(this.plusButton, productCounterDto.plusButton) && Intrinsics.d(this.minusButton, productCounterDto.minusButton) && Intrinsics.d(this.countValue, productCounterDto.countValue) && Intrinsics.d(this.maxValue, productCounterDto.maxValue) && Intrinsics.d(this.minValue, productCounterDto.minValue) && Intrinsics.d(this.trackingInfo, productCounterDto.trackingInfo);
    }

    @NotNull
    public final TextDTO getCountValue() {
        return this.countValue;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final Integer getMaxValue() {
        return this.maxValue;
    }

    public final Integer getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final IconButtonV3DTO getMinusButton() {
        return this.minusButton;
    }

    @NotNull
    public final IconButtonV3DTO getPlusButton() {
        return this.plusButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.countValue, GR.b.c(this.minusButton, GR.b.c(this.plusButton, this.id.hashCode() * 31, 31), 31), 31);
        Integer num = this.maxValue;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minValue;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        IconButtonV3DTO iconButtonV3DTO = this.plusButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.minusButton;
        TextDTO textDTO = this.countValue;
        Integer num = this.maxValue;
        Integer num2 = this.minValue;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ProductCounterDto(id=");
        sb2.append(str);
        sb2.append(", plusButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", minusButton=");
        sb2.append(iconButtonV3DTO2);
        sb2.append(", countValue=");
        sb2.append(textDTO);
        sb2.append(", maxValue=");
        c.e(sb2, num, ", minValue=", num2, ", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
