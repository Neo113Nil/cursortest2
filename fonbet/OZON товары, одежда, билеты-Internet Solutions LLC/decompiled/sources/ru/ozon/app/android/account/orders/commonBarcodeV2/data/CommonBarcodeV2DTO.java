package ru.ozon.app.android.account.orders.commonBarcodeV2.data;

import Co.a;
import Kk.C3532b;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b6\b\u0081\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010=\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003JÈ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0012HÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b1\u0010(¨\u0006H"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "", "code", "", "visibleCode", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "isOfflineMode", "", "containerTopPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "containerHorizontalPadding", "containerBackdropColor", "containerCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "barcodeHeight", "", "horizontalPadding", "barcodeTopLightPadding", "barcodeTopDarkPadding", "barcodeBottomLightPadding", "barcodeBottomDarkPadding", "barcodeCornerRadius", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;ZLru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getCode", "()Ljava/lang/String;", "getVisibleCode", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "()Z", "getContainerTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getContainerHorizontalPadding", "getContainerBackdropColor", "getContainerCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBarcodeHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHorizontalPadding", "getBarcodeTopLightPadding", "getBarcodeTopDarkPadding", "getBarcodeBottomLightPadding", "getBarcodeBottomDarkPadding", "getBarcodeCornerRadius", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;ZLru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "equals", "other", "hashCode", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CommonBarcodeV2DTO {
    public static final int $stable = 0;
    private final Paddings barcodeBottomDarkPadding;
    private final Paddings barcodeBottomLightPadding;
    private final CornerRadius barcodeCornerRadius;
    private final Integer barcodeHeight;
    private final Paddings barcodeTopDarkPadding;
    private final Paddings barcodeTopLightPadding;

    @NotNull
    private final String code;
    private final CommonControlSettings common;
    private final String containerBackdropColor;
    private final CornerRadius containerCornerRadius;
    private final Paddings containerHorizontalPadding;
    private final Paddings containerTopPadding;
    private final Integer horizontalPadding;
    private final boolean isOfflineMode;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO visibleCode;

    public CommonBarcodeV2DTO(@NotNull String code, @NotNull TextDTO visibleCode, TextDTO textDTO, CommonControlSettings commonControlSettings, boolean z11, Paddings paddings, Paddings paddings2, String str, CornerRadius cornerRadius, Integer num, Integer num2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, CornerRadius cornerRadius2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
        this.code = code;
        this.visibleCode = visibleCode;
        this.subtitle = textDTO;
        this.common = commonControlSettings;
        this.isOfflineMode = z11;
        this.containerTopPadding = paddings;
        this.containerHorizontalPadding = paddings2;
        this.containerBackdropColor = str;
        this.containerCornerRadius = cornerRadius;
        this.barcodeHeight = num;
        this.horizontalPadding = num2;
        this.barcodeTopLightPadding = paddings3;
        this.barcodeTopDarkPadding = paddings4;
        this.barcodeBottomLightPadding = paddings5;
        this.barcodeBottomDarkPadding = paddings6;
        this.barcodeCornerRadius = cornerRadius2;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getBarcodeHeight() {
        return this.barcodeHeight;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component12, reason: from getter */
    public final Paddings getBarcodeTopLightPadding() {
        return this.barcodeTopLightPadding;
    }

    /* renamed from: component13, reason: from getter */
    public final Paddings getBarcodeTopDarkPadding() {
        return this.barcodeTopDarkPadding;
    }

    /* renamed from: component14, reason: from getter */
    public final Paddings getBarcodeBottomLightPadding() {
        return this.barcodeBottomLightPadding;
    }

    /* renamed from: component15, reason: from getter */
    public final Paddings getBarcodeBottomDarkPadding() {
        return this.barcodeBottomDarkPadding;
    }

    /* renamed from: component16, reason: from getter */
    public final CornerRadius getBarcodeCornerRadius() {
        return this.barcodeCornerRadius;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getVisibleCode() {
        return this.visibleCode;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOfflineMode() {
        return this.isOfflineMode;
    }

    /* renamed from: component6, reason: from getter */
    public final Paddings getContainerTopPadding() {
        return this.containerTopPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final Paddings getContainerHorizontalPadding() {
        return this.containerHorizontalPadding;
    }

    /* renamed from: component8, reason: from getter */
    public final String getContainerBackdropColor() {
        return this.containerBackdropColor;
    }

    /* renamed from: component9, reason: from getter */
    public final CornerRadius getContainerCornerRadius() {
        return this.containerCornerRadius;
    }

    @NotNull
    public final CommonBarcodeV2DTO copy(@NotNull String code, @NotNull TextDTO visibleCode, TextDTO subtitle, CommonControlSettings common, boolean isOfflineMode, Paddings containerTopPadding, Paddings containerHorizontalPadding, String containerBackdropColor, CornerRadius containerCornerRadius, Integer barcodeHeight, Integer horizontalPadding, Paddings barcodeTopLightPadding, Paddings barcodeTopDarkPadding, Paddings barcodeBottomLightPadding, Paddings barcodeBottomDarkPadding, CornerRadius barcodeCornerRadius) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
        return new CommonBarcodeV2DTO(code, visibleCode, subtitle, common, isOfflineMode, containerTopPadding, containerHorizontalPadding, containerBackdropColor, containerCornerRadius, barcodeHeight, horizontalPadding, barcodeTopLightPadding, barcodeTopDarkPadding, barcodeBottomLightPadding, barcodeBottomDarkPadding, barcodeCornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonBarcodeV2DTO)) {
            return false;
        }
        CommonBarcodeV2DTO commonBarcodeV2DTO = (CommonBarcodeV2DTO) other;
        return Intrinsics.d(this.code, commonBarcodeV2DTO.code) && Intrinsics.d(this.visibleCode, commonBarcodeV2DTO.visibleCode) && Intrinsics.d(this.subtitle, commonBarcodeV2DTO.subtitle) && Intrinsics.d(this.common, commonBarcodeV2DTO.common) && this.isOfflineMode == commonBarcodeV2DTO.isOfflineMode && this.containerTopPadding == commonBarcodeV2DTO.containerTopPadding && this.containerHorizontalPadding == commonBarcodeV2DTO.containerHorizontalPadding && Intrinsics.d(this.containerBackdropColor, commonBarcodeV2DTO.containerBackdropColor) && this.containerCornerRadius == commonBarcodeV2DTO.containerCornerRadius && Intrinsics.d(this.barcodeHeight, commonBarcodeV2DTO.barcodeHeight) && Intrinsics.d(this.horizontalPadding, commonBarcodeV2DTO.horizontalPadding) && this.barcodeTopLightPadding == commonBarcodeV2DTO.barcodeTopLightPadding && this.barcodeTopDarkPadding == commonBarcodeV2DTO.barcodeTopDarkPadding && this.barcodeBottomLightPadding == commonBarcodeV2DTO.barcodeBottomLightPadding && this.barcodeBottomDarkPadding == commonBarcodeV2DTO.barcodeBottomDarkPadding && this.barcodeCornerRadius == commonBarcodeV2DTO.barcodeCornerRadius;
    }

    public final Paddings getBarcodeBottomDarkPadding() {
        return this.barcodeBottomDarkPadding;
    }

    public final Paddings getBarcodeBottomLightPadding() {
        return this.barcodeBottomLightPadding;
    }

    public final CornerRadius getBarcodeCornerRadius() {
        return this.barcodeCornerRadius;
    }

    public final Integer getBarcodeHeight() {
        return this.barcodeHeight;
    }

    public final Paddings getBarcodeTopDarkPadding() {
        return this.barcodeTopDarkPadding;
    }

    public final Paddings getBarcodeTopLightPadding() {
        return this.barcodeTopLightPadding;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final String getContainerBackdropColor() {
        return this.containerBackdropColor;
    }

    public final CornerRadius getContainerCornerRadius() {
        return this.containerCornerRadius;
    }

    public final Paddings getContainerHorizontalPadding() {
        return this.containerHorizontalPadding;
    }

    public final Paddings getContainerTopPadding() {
        return this.containerTopPadding;
    }

    public final Integer getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getVisibleCode() {
        return this.visibleCode;
    }

    public int hashCode() {
        int a11 = b.a(this.visibleCode, this.code.hashCode() * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int a12 = C3532b.a((hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31, 31, this.isOfflineMode);
        Paddings paddings = this.containerTopPadding;
        int hashCode2 = (a12 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.containerHorizontalPadding;
        int hashCode3 = (hashCode2 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        String str = this.containerBackdropColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        CornerRadius cornerRadius = this.containerCornerRadius;
        int hashCode5 = (hashCode4 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Integer num = this.barcodeHeight;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.horizontalPadding;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Paddings paddings3 = this.barcodeTopLightPadding;
        int hashCode8 = (hashCode7 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.barcodeTopDarkPadding;
        int hashCode9 = (hashCode8 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
        Paddings paddings5 = this.barcodeBottomLightPadding;
        int hashCode10 = (hashCode9 + (paddings5 == null ? 0 : paddings5.hashCode())) * 31;
        Paddings paddings6 = this.barcodeBottomDarkPadding;
        int hashCode11 = (hashCode10 + (paddings6 == null ? 0 : paddings6.hashCode())) * 31;
        CornerRadius cornerRadius2 = this.barcodeCornerRadius;
        return hashCode11 + (cornerRadius2 != null ? cornerRadius2.hashCode() : 0);
    }

    public final boolean isOfflineMode() {
        return this.isOfflineMode;
    }

    @NotNull
    public String toString() {
        String str = this.code;
        TextDTO textDTO = this.visibleCode;
        TextDTO textDTO2 = this.subtitle;
        CommonControlSettings commonControlSettings = this.common;
        boolean z11 = this.isOfflineMode;
        Paddings paddings = this.containerTopPadding;
        Paddings paddings2 = this.containerHorizontalPadding;
        String str2 = this.containerBackdropColor;
        CornerRadius cornerRadius = this.containerCornerRadius;
        Integer num = this.barcodeHeight;
        Integer num2 = this.horizontalPadding;
        Paddings paddings3 = this.barcodeTopLightPadding;
        Paddings paddings4 = this.barcodeTopDarkPadding;
        Paddings paddings5 = this.barcodeBottomLightPadding;
        Paddings paddings6 = this.barcodeBottomDarkPadding;
        CornerRadius cornerRadius2 = this.barcodeCornerRadius;
        StringBuilder b11 = a.b("CommonBarcodeV2DTO(code=", textDTO, str, ", visibleCode=", ", subtitle=");
        b11.append(textDTO2);
        b11.append(", common=");
        b11.append(commonControlSettings);
        b11.append(", isOfflineMode=");
        b11.append(z11);
        b11.append(", containerTopPadding=");
        b11.append(paddings);
        b11.append(", containerHorizontalPadding=");
        b11.append(paddings2);
        b11.append(", containerBackdropColor=");
        b11.append(str2);
        b11.append(", containerCornerRadius=");
        b11.append(cornerRadius);
        b11.append(", barcodeHeight=");
        b11.append(num);
        b11.append(", horizontalPadding=");
        b11.append(num2);
        b11.append(", barcodeTopLightPadding=");
        b11.append(paddings3);
        b11.append(", barcodeTopDarkPadding=");
        Lh.a.e(b11, paddings4, ", barcodeBottomLightPadding=", paddings5, ", barcodeBottomDarkPadding=");
        b11.append(paddings6);
        b11.append(", barcodeCornerRadius=");
        b11.append(cornerRadius2);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ CommonBarcodeV2DTO(String str, TextDTO textDTO, TextDTO textDTO2, CommonControlSettings commonControlSettings, boolean z11, Paddings paddings, Paddings paddings2, String str2, CornerRadius cornerRadius, Integer num, Integer num2, Paddings paddings3, Paddings paddings4, Paddings paddings5, Paddings paddings6, CornerRadius cornerRadius2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textDTO, textDTO2, commonControlSettings, (i11 & 16) != 0 ? false : z11, paddings, paddings2, str2, cornerRadius, num, num2, paddings3, paddings4, paddings5, paddings6, cornerRadius2);
    }
}
