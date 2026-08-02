package ru.ozon.app.android.marketing.widgets.couponList.presentation;

import Ak.C2436a;
import B0.A0;
import B0.C2454a;
import B90.C2618u;
import El.C2971a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import Tl.b;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "<init>", "()V", "", "getBackgroundColor", "()I", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getTrackingInfo", "()LWZ/t;", "trackingInfo", "CouponVO", "ActionButtonVO", "ProductVO", "ConditionsVO", "EmptyCouponVO", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$CouponVO;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$EmptyCouponVO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseCouponVO implements c {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ActionButtonVO;", "", "", "deepLink", "text", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeepLink", "getText", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionButtonVO {

        @NotNull
        private final String deepLink;

        @NotNull
        private final String text;
        private final t tokenizedEvent;

        public ActionButtonVO(@NotNull String deepLink, @NotNull String text, t tVar) {
            Intrinsics.checkNotNullParameter(deepLink, "deepLink");
            Intrinsics.checkNotNullParameter(text, "text");
            this.deepLink = deepLink;
            this.text = text;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionButtonVO)) {
                return false;
            }
            ActionButtonVO actionButtonVO = (ActionButtonVO) other;
            return Intrinsics.d(this.deepLink, actionButtonVO.deepLink) && Intrinsics.d(this.text, actionButtonVO.text) && Intrinsics.d(this.tokenizedEvent, actionButtonVO.tokenizedEvent);
        }

        @NotNull
        public final String getDeepLink() {
            return this.deepLink;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = g.a(this.deepLink.hashCode() * 31, 31, this.text);
            t tVar = this.tokenizedEvent;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.deepLink;
            String str2 = this.text;
            return b.d(C3660k.d("ActionButtonVO(deepLink=", str, ", text=", str2, ", tokenizedEvent="), this.tokenizedEvent, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ConditionsVO;", "", "", "text", "", "color", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "I", "getColor", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConditionsVO {
        private final int color;

        @NotNull
        private final String text;

        public ConditionsVO(@NotNull String text, int i11) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.color = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConditionsVO)) {
                return false;
            }
            ConditionsVO conditionsVO = (ConditionsVO) other;
            return Intrinsics.d(this.text, conditionsVO.text) && this.color == conditionsVO.color;
        }

        public final int getColor() {
            return this.color;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return Integer.hashCode(this.color) + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2618u.f(this.color, "ConditionsVO(text=", this.text, ", color=", ")");
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B©\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r\u0012\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b4\u0010\"R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b\u000e\u00106R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b\u000f\u00106R\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b7\u0010\"R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0016\u00105\u001a\u0004\b>\u00106R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b?\u0010\"R\u0017\u0010\u0018\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b\u0018\u00106R\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b@\u0010$R\"\u0010\u001a\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u00105\u001a\u0004\bA\u00106\"\u0004\bB\u0010CR\u001a\u0010\u001b\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u00105\u001a\u0004\b\u001b\u00106R\"\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$CouponVO;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "", "backgroundColor", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "headerImage", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ActionButtonVO;", "actionButton", "description", "", "isPointsVisible", "isLargeText", "deepLink", "", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ProductVO;", "products", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ConditionsVO;", "conditions", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "couponCode", "isEven", "productSize", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JILjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ActionButtonVO;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/List;Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ConditionsVO;ZLjava/lang/String;ZIZZLWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getBackgroundColor", "Ljava/lang/String;", "getName", "getHeaderImage", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ActionButtonVO;", "getActionButton", "()Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ActionButtonVO;", "getDescription", "Z", "()Z", "getDeepLink", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ConditionsVO;", "getConditions", "()Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ConditionsVO;", "getActive", "getCouponCode", "getProductSize", "getShouldBlur", "setShouldBlur", "(Z)V", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CouponVO extends BaseCouponVO implements AdultVO {

        @NotNull
        private final ActionButtonVO actionButton;
        private final boolean active;
        private final int backgroundColor;

        @NotNull
        private final ConditionsVO conditions;

        @NotNull
        private final String couponCode;

        @NotNull
        private final String deepLink;

        @NotNull
        private final String description;

        @NotNull
        private final String headerImage;
        private final long id;
        private final boolean isAdult;
        private final boolean isEven;
        private final boolean isLargeText;
        private final boolean isPointsVisible;

        @NotNull
        private final String name;
        private final int productSize;

        @NotNull
        private final List<ProductVO> products;
        private boolean shouldBlur;
        private final t trackingInfo;

        public /* synthetic */ CouponVO(long j11, int i11, String str, String str2, ActionButtonVO actionButtonVO, String str3, boolean z11, boolean z12, String str4, List list, ConditionsVO conditionsVO, boolean z13, String str5, boolean z14, int i12, boolean z15, boolean z16, t tVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, i11, str, str2, actionButtonVO, str3, z11, z12, str4, list, conditionsVO, z13, str5, z14, i12, z15, (i13 & 65536) != 0 ? z15 : z16, tVar);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponVO)) {
                return false;
            }
            CouponVO couponVO = (CouponVO) other;
            return this.id == couponVO.id && this.backgroundColor == couponVO.backgroundColor && Intrinsics.d(this.name, couponVO.name) && Intrinsics.d(this.headerImage, couponVO.headerImage) && Intrinsics.d(this.actionButton, couponVO.actionButton) && Intrinsics.d(this.description, couponVO.description) && this.isPointsVisible == couponVO.isPointsVisible && this.isLargeText == couponVO.isLargeText && Intrinsics.d(this.deepLink, couponVO.deepLink) && Intrinsics.d(this.products, couponVO.products) && Intrinsics.d(this.conditions, couponVO.conditions) && this.active == couponVO.active && Intrinsics.d(this.couponCode, couponVO.couponCode) && this.isEven == couponVO.isEven && this.productSize == couponVO.productSize && this.shouldBlur == couponVO.shouldBlur && this.isAdult == couponVO.isAdult && Intrinsics.d(this.trackingInfo, couponVO.trackingInfo);
        }

        @NotNull
        public final ActionButtonVO getActionButton() {
            return this.actionButton;
        }

        public final boolean getActive() {
            return this.active;
        }

        @Override // ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO
        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ConditionsVO getConditions() {
            return this.conditions;
        }

        @NotNull
        public final String getCouponCode() {
            return this.couponCode;
        }

        @NotNull
        public final String getDeepLink() {
            return this.deepLink;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getHeaderImage() {
            return this.headerImage;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getProductSize() {
            return this.productSize;
        }

        @NotNull
        public final List<ProductVO> getProducts() {
            return this.products;
        }

        public boolean getShouldBlur() {
            return this.shouldBlur;
        }

        @Override // ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO
        public t getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(C3532b.a(C2454a.a(this.productSize, C3532b.a(g.a(C3532b.a((this.conditions.hashCode() + g.b(g.a(C3532b.a(C3532b.a(g.a((this.actionButton.hashCode() + g.a(g.a(C2454a.a(this.backgroundColor, Long.hashCode(this.id) * 31, 31), 31, this.name), 31, this.headerImage)) * 31, 31, this.description), 31, this.isPointsVisible), 31, this.isLargeText), 31, this.deepLink), 31, this.products)) * 31, 31, this.active), 31, this.couponCode), 31, this.isEven), 31), 31, this.shouldBlur), 31, this.isAdult);
            t tVar = this.trackingInfo;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        /* renamed from: isAdult, reason: from getter */
        public boolean getIsAdult() {
            return this.isAdult;
        }

        /* renamed from: isEven, reason: from getter */
        public final boolean getIsEven() {
            return this.isEven;
        }

        /* renamed from: isPointsVisible, reason: from getter */
        public final boolean getIsPointsVisible() {
            return this.isPointsVisible;
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        public void setShouldBlur(boolean z11) {
            this.shouldBlur = z11;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            int i11 = this.backgroundColor;
            String str = this.name;
            String str2 = this.headerImage;
            ActionButtonVO actionButtonVO = this.actionButton;
            String str3 = this.description;
            boolean z11 = this.isPointsVisible;
            boolean z12 = this.isLargeText;
            String str4 = this.deepLink;
            List<ProductVO> list = this.products;
            ConditionsVO conditionsVO = this.conditions;
            boolean z13 = this.active;
            String str5 = this.couponCode;
            boolean z14 = this.isEven;
            int i12 = this.productSize;
            boolean z15 = this.shouldBlur;
            boolean z16 = this.isAdult;
            t tVar = this.trackingInfo;
            StringBuilder b11 = Ql.c.b(j11, "CouponVO(id=", i11, ", backgroundColor=");
            a.h(b11, ", name=", str, ", headerImage=", str2);
            b11.append(", actionButton=");
            b11.append(actionButtonVO);
            b11.append(", description=");
            b11.append(str3);
            C2436a.e(", isPointsVisible=", ", isLargeText=", b11, z11, z12);
            a.g(", deepLink=", str4, ", products=", b11, list);
            b11.append(", conditions=");
            b11.append(conditionsVO);
            b11.append(", active=");
            b11.append(z13);
            D40.a.g(", couponCode=", str5, ", isEven=", b11, z14);
            b11.append(", productSize=");
            b11.append(i12);
            b11.append(", shouldBlur=");
            b11.append(z15);
            C2971a.d(b11, ", isAdult=", z16, ", trackingInfo=", tVar);
            b11.append(")");
            return b11.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CouponVO(long j11, int i11, @NotNull String name, @NotNull String headerImage, @NotNull ActionButtonVO actionButton, @NotNull String description, boolean z11, boolean z12, @NotNull String deepLink, @NotNull List<ProductVO> products, @NotNull ConditionsVO conditions, boolean z13, @NotNull String couponCode, boolean z14, int i12, boolean z15, boolean z16, t tVar) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(headerImage, "headerImage");
            Intrinsics.checkNotNullParameter(actionButton, "actionButton");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(deepLink, "deepLink");
            Intrinsics.checkNotNullParameter(products, "products");
            Intrinsics.checkNotNullParameter(conditions, "conditions");
            Intrinsics.checkNotNullParameter(couponCode, "couponCode");
            this.id = j11;
            this.backgroundColor = i11;
            this.name = name;
            this.headerImage = headerImage;
            this.actionButton = actionButton;
            this.description = description;
            this.isPointsVisible = z11;
            this.isLargeText = z12;
            this.deepLink = deepLink;
            this.products = products;
            this.conditions = conditions;
            this.active = z13;
            this.couponCode = couponCode;
            this.isEven = z14;
            this.productSize = i12;
            this.shouldBlur = z15;
            this.isAdult = z16;
            this.trackingInfo = tVar;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$EmptyCouponVO;", "Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO;", "", "id", "", "backgroundColor", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "<init>", "(JILWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getBackgroundColor", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyCouponVO extends BaseCouponVO {
        private final int backgroundColor;
        private final long id;
        private final t trackingInfo;

        public EmptyCouponVO(long j11, int i11, t tVar) {
            super(null);
            this.id = j11;
            this.backgroundColor = i11;
            this.trackingInfo = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyCouponVO)) {
                return false;
            }
            EmptyCouponVO emptyCouponVO = (EmptyCouponVO) other;
            return this.id == emptyCouponVO.id && this.backgroundColor == emptyCouponVO.backgroundColor && Intrinsics.d(this.trackingInfo, emptyCouponVO.trackingInfo);
        }

        @Override // ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO
        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // ru.ozon.app.android.marketing.widgets.couponList.presentation.BaseCouponVO
        public t getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C2454a.a(this.backgroundColor, Long.hashCode(this.id) * 31, 31);
            t tVar = this.trackingInfo;
            return a11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            int i11 = this.backgroundColor;
            return Lh.a.b(Ql.c.b(j11, "EmptyCouponVO(id=", i11, ", backgroundColor="), ", trackingInfo=", this.trackingInfo, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponList/presentation/BaseCouponVO$ProductVO;", "", "", "image", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductVO {

        @NotNull
        private final String image;

        public ProductVO(@NotNull String image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ProductVO) && Intrinsics.d(this.image, ((ProductVO) other).image);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("ProductVO(image=", this.image, ")");
        }
    }

    public /* synthetic */ BaseCouponVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getBackgroundColor();

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public abstract t getTrackingInfo();

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    private BaseCouponVO() {
    }
}
