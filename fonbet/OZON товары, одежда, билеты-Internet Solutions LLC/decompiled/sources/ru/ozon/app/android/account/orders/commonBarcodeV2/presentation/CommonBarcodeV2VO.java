package ru.ozon.app.android.account.orders.commonBarcodeV2.presentation;

import Ak.C2436a;
import B0.A0;
import B0.C2454a;
import D40.a;
import G.g;
import Kk.C3532b;
import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b4\u00103R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u00107R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b;\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b\u000f\u0010=R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\bA\u0010@R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\bB\u0010%R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\bG\u0010'R\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bH\u0010'R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010>\u001a\u0004\bI\u0010@R\u0017\u0010\u001a\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\bJ\u0010@R\u0017\u0010\u001b\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001b\u0010>\u001a\u0004\bK\u0010@R\u0017\u0010\u001c\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010>\u001a\u0004\bL\u0010@R\u0017\u0010\u001d\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010C\u001a\u0004\bM\u0010E¨\u0006N"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/CommonBarcodeV2VO;", "Ll20/c;", "", "id", "", "code", "Lru/ozon/uni/atoms/data/text/TextDTO;", "visibleCode", "subtitle", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton;", "shareButton", "objectType", "", "isOfflineMode", "Lru/ozon/uni/atoms/data/common/Paddings;", "containerTopPadding", "containerHorizontalPadding", "containerBackdropColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "containerCornerRadius", "", "barcodeHeight", "barcodeHorizontalPadding", "barcodeTopLightPadding", "barcodeTopDarkPadding", "barcodeBottomLightPadding", "barcodeBottomDarkPadding", "barcodeCornerRadius", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton;Ljava/lang/String;ZLru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;IILru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "isDarkMode", "getBarcodeTopPadding", "(Z)Lru/ozon/uni/atoms/data/common/Paddings;", "getBarcodeBottomPadding", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getCode", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getVisibleCode", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton;", "getShareButton", "()Lru/ozon/app/android/account/orders/commonBarcodeV2/presentation/BarcodeShareButton;", "getObjectType", "Z", "()Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getContainerTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getContainerHorizontalPadding", "getContainerBackdropColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getContainerCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "I", "getBarcodeHeight", "getBarcodeHorizontalPadding", "getBarcodeTopLightPadding", "getBarcodeTopDarkPadding", "getBarcodeBottomLightPadding", "getBarcodeBottomDarkPadding", "getBarcodeCornerRadius", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CommonBarcodeV2VO implements c {

    @NotNull
    private final Paddings barcodeBottomDarkPadding;

    @NotNull
    private final Paddings barcodeBottomLightPadding;

    @NotNull
    private final CornerRadius barcodeCornerRadius;
    private final int barcodeHeight;
    private final int barcodeHorizontalPadding;

    @NotNull
    private final Paddings barcodeTopDarkPadding;

    @NotNull
    private final Paddings barcodeTopLightPadding;

    @NotNull
    private final String code;
    private final CommonControlSettings common;

    @NotNull
    private final String containerBackdropColor;

    @NotNull
    private final CornerRadius containerCornerRadius;

    @NotNull
    private final Paddings containerHorizontalPadding;

    @NotNull
    private final Paddings containerTopPadding;
    private final long id;
    private final boolean isOfflineMode;

    @NotNull
    private final String objectType;
    private final BarcodeShareButton shareButton;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO visibleCode;

    public CommonBarcodeV2VO(long j11, @NotNull String code, @NotNull TextDTO visibleCode, TextDTO textDTO, CommonControlSettings commonControlSettings, BarcodeShareButton barcodeShareButton, @NotNull String objectType, boolean z11, @NotNull Paddings containerTopPadding, @NotNull Paddings containerHorizontalPadding, @NotNull String containerBackdropColor, @NotNull CornerRadius containerCornerRadius, int i11, int i12, @NotNull Paddings barcodeTopLightPadding, @NotNull Paddings barcodeTopDarkPadding, @NotNull Paddings barcodeBottomLightPadding, @NotNull Paddings barcodeBottomDarkPadding, @NotNull CornerRadius barcodeCornerRadius) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        Intrinsics.checkNotNullParameter(containerTopPadding, "containerTopPadding");
        Intrinsics.checkNotNullParameter(containerHorizontalPadding, "containerHorizontalPadding");
        Intrinsics.checkNotNullParameter(containerBackdropColor, "containerBackdropColor");
        Intrinsics.checkNotNullParameter(containerCornerRadius, "containerCornerRadius");
        Intrinsics.checkNotNullParameter(barcodeTopLightPadding, "barcodeTopLightPadding");
        Intrinsics.checkNotNullParameter(barcodeTopDarkPadding, "barcodeTopDarkPadding");
        Intrinsics.checkNotNullParameter(barcodeBottomLightPadding, "barcodeBottomLightPadding");
        Intrinsics.checkNotNullParameter(barcodeBottomDarkPadding, "barcodeBottomDarkPadding");
        Intrinsics.checkNotNullParameter(barcodeCornerRadius, "barcodeCornerRadius");
        this.id = j11;
        this.code = code;
        this.visibleCode = visibleCode;
        this.subtitle = textDTO;
        this.common = commonControlSettings;
        this.shareButton = barcodeShareButton;
        this.objectType = objectType;
        this.isOfflineMode = z11;
        this.containerTopPadding = containerTopPadding;
        this.containerHorizontalPadding = containerHorizontalPadding;
        this.containerBackdropColor = containerBackdropColor;
        this.containerCornerRadius = containerCornerRadius;
        this.barcodeHeight = i11;
        this.barcodeHorizontalPadding = i12;
        this.barcodeTopLightPadding = barcodeTopLightPadding;
        this.barcodeTopDarkPadding = barcodeTopDarkPadding;
        this.barcodeBottomLightPadding = barcodeBottomLightPadding;
        this.barcodeBottomDarkPadding = barcodeBottomDarkPadding;
        this.barcodeCornerRadius = barcodeCornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonBarcodeV2VO)) {
            return false;
        }
        CommonBarcodeV2VO commonBarcodeV2VO = (CommonBarcodeV2VO) other;
        return this.id == commonBarcodeV2VO.id && Intrinsics.d(this.code, commonBarcodeV2VO.code) && Intrinsics.d(this.visibleCode, commonBarcodeV2VO.visibleCode) && Intrinsics.d(this.subtitle, commonBarcodeV2VO.subtitle) && Intrinsics.d(this.common, commonBarcodeV2VO.common) && Intrinsics.d(this.shareButton, commonBarcodeV2VO.shareButton) && Intrinsics.d(this.objectType, commonBarcodeV2VO.objectType) && this.isOfflineMode == commonBarcodeV2VO.isOfflineMode && this.containerTopPadding == commonBarcodeV2VO.containerTopPadding && this.containerHorizontalPadding == commonBarcodeV2VO.containerHorizontalPadding && Intrinsics.d(this.containerBackdropColor, commonBarcodeV2VO.containerBackdropColor) && this.containerCornerRadius == commonBarcodeV2VO.containerCornerRadius && this.barcodeHeight == commonBarcodeV2VO.barcodeHeight && this.barcodeHorizontalPadding == commonBarcodeV2VO.barcodeHorizontalPadding && this.barcodeTopLightPadding == commonBarcodeV2VO.barcodeTopLightPadding && this.barcodeTopDarkPadding == commonBarcodeV2VO.barcodeTopDarkPadding && this.barcodeBottomLightPadding == commonBarcodeV2VO.barcodeBottomLightPadding && this.barcodeBottomDarkPadding == commonBarcodeV2VO.barcodeBottomDarkPadding && this.barcodeCornerRadius == commonBarcodeV2VO.barcodeCornerRadius;
    }

    @NotNull
    public final Paddings getBarcodeBottomPadding(boolean isDarkMode) {
        return isDarkMode ? this.barcodeBottomDarkPadding : this.barcodeBottomLightPadding;
    }

    @NotNull
    public final CornerRadius getBarcodeCornerRadius() {
        return this.barcodeCornerRadius;
    }

    public final int getBarcodeHeight() {
        return this.barcodeHeight;
    }

    public final int getBarcodeHorizontalPadding() {
        return this.barcodeHorizontalPadding;
    }

    @NotNull
    public final Paddings getBarcodeTopPadding(boolean isDarkMode) {
        return isDarkMode ? this.barcodeTopDarkPadding : this.barcodeTopLightPadding;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final String getContainerBackdropColor() {
        return this.containerBackdropColor;
    }

    @NotNull
    public final CornerRadius getContainerCornerRadius() {
        return this.containerCornerRadius;
    }

    @NotNull
    public final Paddings getContainerHorizontalPadding() {
        return this.containerHorizontalPadding;
    }

    @NotNull
    public final Paddings getContainerTopPadding() {
        return this.containerTopPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getObjectType() {
        return this.objectType;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final BarcodeShareButton getShareButton() {
        return this.shareButton;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @NotNull
    public final TextDTO getVisibleCode() {
        return this.visibleCode;
    }

    public int hashCode() {
        int a11 = b.a(this.visibleCode, g.a(Long.hashCode(this.id) * 31, 31, this.code), 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        BarcodeShareButton barcodeShareButton = this.shareButton;
        return this.barcodeCornerRadius.hashCode() + GR.b.b(this.barcodeBottomDarkPadding, GR.b.b(this.barcodeBottomLightPadding, GR.b.b(this.barcodeTopDarkPadding, GR.b.b(this.barcodeTopLightPadding, C2454a.a(this.barcodeHorizontalPadding, C2454a.a(this.barcodeHeight, Tl.b.b(this.containerCornerRadius, g.a(GR.b.b(this.containerHorizontalPadding, GR.b.b(this.containerTopPadding, C3532b.a(g.a((hashCode2 + (barcodeShareButton != null ? barcodeShareButton.hashCode() : 0)) * 31, 31, this.objectType), 31, this.isOfflineMode), 31), 31), 31, this.containerBackdropColor), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: isOfflineMode, reason: from getter */
    public final boolean getIsOfflineMode() {
        return this.isOfflineMode;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.code;
        TextDTO textDTO = this.visibleCode;
        TextDTO textDTO2 = this.subtitle;
        CommonControlSettings commonControlSettings = this.common;
        BarcodeShareButton barcodeShareButton = this.shareButton;
        String str2 = this.objectType;
        boolean z11 = this.isOfflineMode;
        Paddings paddings = this.containerTopPadding;
        Paddings paddings2 = this.containerHorizontalPadding;
        String str3 = this.containerBackdropColor;
        CornerRadius cornerRadius = this.containerCornerRadius;
        int i11 = this.barcodeHeight;
        int i12 = this.barcodeHorizontalPadding;
        Paddings paddings3 = this.barcodeTopLightPadding;
        Paddings paddings4 = this.barcodeTopDarkPadding;
        Paddings paddings5 = this.barcodeBottomLightPadding;
        Paddings paddings6 = this.barcodeBottomDarkPadding;
        CornerRadius cornerRadius2 = this.barcodeCornerRadius;
        StringBuilder c11 = C2436a.c(j11, "CommonBarcodeV2VO(id=", ", code=", str);
        D3.g.i(", visibleCode=", ", subtitle=", c11, textDTO, textDTO2);
        c11.append(", common=");
        c11.append(commonControlSettings);
        c11.append(", shareButton=");
        c11.append(barcodeShareButton);
        a.g(", objectType=", str2, ", isOfflineMode=", c11, z11);
        c11.append(", containerTopPadding=");
        c11.append(paddings);
        c11.append(", containerHorizontalPadding=");
        c11.append(paddings2);
        c11.append(", containerBackdropColor=");
        c11.append(str3);
        c11.append(", containerCornerRadius=");
        c11.append(cornerRadius);
        A0.c(i11, i12, ", barcodeHeight=", ", barcodeHorizontalPadding=", c11);
        c11.append(", barcodeTopLightPadding=");
        c11.append(paddings3);
        c11.append(", barcodeTopDarkPadding=");
        c11.append(paddings4);
        c11.append(", barcodeBottomLightPadding=");
        c11.append(paddings5);
        c11.append(", barcodeBottomDarkPadding=");
        c11.append(paddings6);
        c11.append(", barcodeCornerRadius=");
        c11.append(cornerRadius2);
        c11.append(")");
        return c11.toString();
    }
}
