package ru.ozon.app.android.marketing.widgets.couponList.data;

import B0.C2454a;
import Cm.e;
import G.g;
import Kk.C3532b;
import Nh.a;
import Pk0.f;
import T7.P;
import c8.C5766e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\tHÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\u0017\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J³\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0016\u001a\u00020\t2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0001J\u0013\u0010?\u001a\u00020\u00072\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u000eHÖ\u0001J\t\u0010B\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010!R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010!R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006C"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/data/CouponItemDTO;", "", "actionButton", "Lru/ozon/app/android/marketing/widgets/couponList/data/ActionButtonDTO;", "conditions", "Lru/ozon/app/android/marketing/widgets/couponList/data/ConditionsDTO;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "couponCode", "", "headerImage", "deeplink", "description", "id", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "isPointsVisible", "isLargeText", AppMeasurementSdk.ConditionalUserProperty.NAME, "products", "", "Lru/ozon/app/android/marketing/widgets/couponList/data/ProductDTO;", "accentColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/marketing/widgets/couponList/data/ActionButtonDTO;Lru/ozon/app/android/marketing/widgets/couponList/data/ConditionsDTO;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getActionButton", "()Lru/ozon/app/android/marketing/widgets/couponList/data/ActionButtonDTO;", "getConditions", "()Lru/ozon/app/android/marketing/widgets/couponList/data/ConditionsDTO;", "getActive", "()Z", "getCouponCode", "()Ljava/lang/String;", "getHeaderImage", "getDeeplink", "getDescription", "getId", "()I", "getName", "getProducts", "()Ljava/util/List;", "getAccentColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CouponItemDTO {
    public static final int $stable = 8;

    @NotNull
    private final String accentColor;

    @NotNull
    private final ActionButtonDTO actionButton;
    private final boolean active;

    @NotNull
    private final ConditionsDTO conditions;

    @NotNull
    private final String couponCode;

    @NotNull
    private final String deeplink;

    @NotNull
    private final String description;

    @NotNull
    private final String headerImage;
    private final int id;
    private final boolean isAdult;
    private final boolean isLargeText;
    private final boolean isPointsVisible;

    @NotNull
    private final String name;

    @NotNull
    private final List<ProductDTO> products;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CouponItemDTO(@NotNull ActionButtonDTO actionButton, @NotNull ConditionsDTO conditions, boolean z11, @NotNull String couponCode, @NotNull String headerImage, @NotNull String deeplink, @NotNull String description, int i11, boolean z12, boolean z13, boolean z14, @NotNull String name, @NotNull List<ProductDTO> products, @NotNull String accentColor, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(couponCode, "couponCode");
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(accentColor, "accentColor");
        this.actionButton = actionButton;
        this.conditions = conditions;
        this.active = z11;
        this.couponCode = couponCode;
        this.headerImage = headerImage;
        this.deeplink = deeplink;
        this.description = description;
        this.id = i11;
        this.isAdult = z12;
        this.isPointsVisible = z13;
        this.isLargeText = z14;
        this.name = name;
        this.products = products;
        this.accentColor = accentColor;
        this.trackingInfo = map;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ActionButtonDTO getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsPointsVisible() {
        return this.isPointsVisible;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsLargeText() {
        return this.isLargeText;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<ProductDTO> component13() {
        return this.products;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getAccentColor() {
        return this.accentColor;
    }

    public final Map<String, TokenizedTrackingInfo> component15() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ConditionsDTO getConditions() {
        return this.conditions;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCouponCode() {
        return this.couponCode;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getHeaderImage() {
        return this.headerImage;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component8, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    @NotNull
    public final CouponItemDTO copy(@NotNull ActionButtonDTO actionButton, @NotNull ConditionsDTO conditions, boolean active, @NotNull String couponCode, @NotNull String headerImage, @NotNull String deeplink, @NotNull String description, int id2, boolean isAdult, boolean isPointsVisible, boolean isLargeText, @NotNull String name, @NotNull List<ProductDTO> products, @NotNull String accentColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(couponCode, "couponCode");
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(accentColor, "accentColor");
        return new CouponItemDTO(actionButton, conditions, active, couponCode, headerImage, deeplink, description, id2, isAdult, isPointsVisible, isLargeText, name, products, accentColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponItemDTO)) {
            return false;
        }
        CouponItemDTO couponItemDTO = (CouponItemDTO) other;
        return Intrinsics.d(this.actionButton, couponItemDTO.actionButton) && Intrinsics.d(this.conditions, couponItemDTO.conditions) && this.active == couponItemDTO.active && Intrinsics.d(this.couponCode, couponItemDTO.couponCode) && Intrinsics.d(this.headerImage, couponItemDTO.headerImage) && Intrinsics.d(this.deeplink, couponItemDTO.deeplink) && Intrinsics.d(this.description, couponItemDTO.description) && this.id == couponItemDTO.id && this.isAdult == couponItemDTO.isAdult && this.isPointsVisible == couponItemDTO.isPointsVisible && this.isLargeText == couponItemDTO.isLargeText && Intrinsics.d(this.name, couponItemDTO.name) && Intrinsics.d(this.products, couponItemDTO.products) && Intrinsics.d(this.accentColor, couponItemDTO.accentColor) && Intrinsics.d(this.trackingInfo, couponItemDTO.trackingInfo);
    }

    @NotNull
    public final String getAccentColor() {
        return this.accentColor;
    }

    @NotNull
    public final ActionButtonDTO getActionButton() {
        return this.actionButton;
    }

    public final boolean getActive() {
        return this.active;
    }

    @NotNull
    public final ConditionsDTO getConditions() {
        return this.conditions;
    }

    @NotNull
    public final String getCouponCode() {
        return this.couponCode;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getHeaderImage() {
        return this.headerImage;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<ProductDTO> getProducts() {
        return this.products;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(g.b(g.a(C3532b.a(C3532b.a(C3532b.a(C2454a.a(this.id, g.a(g.a(g.a(g.a(C3532b.a((this.conditions.hashCode() + (this.actionButton.hashCode() * 31)) * 31, 31, this.active), 31, this.couponCode), 31, this.headerImage), 31, this.deeplink), 31, this.description), 31), 31, this.isAdult), 31, this.isPointsVisible), 31, this.isLargeText), 31, this.name), 31, this.products), 31, this.accentColor);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
    }

    public final boolean isAdult() {
        return this.isAdult;
    }

    public final boolean isLargeText() {
        return this.isLargeText;
    }

    public final boolean isPointsVisible() {
        return this.isPointsVisible;
    }

    @NotNull
    public String toString() {
        ActionButtonDTO actionButtonDTO = this.actionButton;
        ConditionsDTO conditionsDTO = this.conditions;
        boolean z11 = this.active;
        String str = this.couponCode;
        String str2 = this.headerImage;
        String str3 = this.deeplink;
        String str4 = this.description;
        int i11 = this.id;
        boolean z12 = this.isAdult;
        boolean z13 = this.isPointsVisible;
        boolean z14 = this.isLargeText;
        String str5 = this.name;
        List<ProductDTO> list = this.products;
        String str6 = this.accentColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CouponItemDTO(actionButton=");
        sb2.append(actionButtonDTO);
        sb2.append(", conditions=");
        sb2.append(conditionsDTO);
        sb2.append(", active=");
        C5766e.a(", couponCode=", str, ", headerImage=", sb2, z11);
        a.h(sb2, str2, ", deeplink=", str3, ", description=");
        Pk0.g.d(i11, str4, ", id=", ", isAdult=", sb2);
        f.c(", isPointsVisible=", ", isLargeText=", sb2, z12, z13);
        C5766e.a(", name=", str5, ", products=", sb2, z14);
        e.i(", accentColor=", str6, ", trackingInfo=", sb2, list);
        return P.f(sb2, map, ")");
    }
}
