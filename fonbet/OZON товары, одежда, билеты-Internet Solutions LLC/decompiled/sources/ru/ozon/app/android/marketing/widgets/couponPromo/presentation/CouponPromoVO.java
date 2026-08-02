package ru.ozon.app.android.marketing.widgets.couponPromo.presentation;

import B0.A0;
import C.o0;
import G.g;
import Lh.a;
import N3.C3660k;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003*+,B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;", "promoCode", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO;", "baseState", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;", "stepsState", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;", "getPromoCode", "()Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO;", "getBaseState", "()Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;", "getStepsState", "()Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "PromoCodeVO", "BaseStateVO", "StepsStateVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CouponPromoVO implements c {

    @NotNull
    private final BaseStateVO baseState;
    private final long id;

    @NotNull
    private final PromoCodeVO promoCode;

    @NotNull
    private final StepsStateVO stepsState;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0003()*BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "", "titleColor", "backgroundColor", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$SharedDataVO;", "sharedData", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ActivateActionVO;", "activateAction", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ShowStepsActionVO;", "showStepsAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$SharedDataVO;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ActivateActionVO;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ShowStepsActionVO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubTitle", "Ljava/lang/Integer;", "getTitleColor", "()Ljava/lang/Integer;", "getBackgroundColor", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$SharedDataVO;", "getSharedData", "()Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$SharedDataVO;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ActivateActionVO;", "getActivateAction", "()Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ActivateActionVO;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ShowStepsActionVO;", "getShowStepsAction", "()Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ShowStepsActionVO;", "SharedDataVO", "ActivateActionVO", "ShowStepsActionVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BaseStateVO {
        private final ActivateActionVO activateAction;
        private final Integer backgroundColor;
        private final SharedDataVO sharedData;
        private final ShowStepsActionVO showStepsAction;
        private final String subTitle;

        @NotNull
        private final String title;
        private final Integer titleColor;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ActivateActionVO;", "", "", "inactiveStateTitle", "activeStateTitle", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInactiveStateTitle", "getActiveStateTitle", "getDeeplink", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActivateActionVO {

            @NotNull
            private final String activeStateTitle;
            private final String deeplink;

            @NotNull
            private final String inactiveStateTitle;

            public ActivateActionVO(@NotNull String inactiveStateTitle, @NotNull String activeStateTitle, String str) {
                Intrinsics.checkNotNullParameter(inactiveStateTitle, "inactiveStateTitle");
                Intrinsics.checkNotNullParameter(activeStateTitle, "activeStateTitle");
                this.inactiveStateTitle = inactiveStateTitle;
                this.activeStateTitle = activeStateTitle;
                this.deeplink = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActivateActionVO)) {
                    return false;
                }
                ActivateActionVO activateActionVO = (ActivateActionVO) other;
                return Intrinsics.d(this.inactiveStateTitle, activateActionVO.inactiveStateTitle) && Intrinsics.d(this.activeStateTitle, activateActionVO.activeStateTitle) && Intrinsics.d(this.deeplink, activateActionVO.deeplink);
            }

            @NotNull
            public final String getActiveStateTitle() {
                return this.activeStateTitle;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final String getInactiveStateTitle() {
                return this.inactiveStateTitle;
            }

            public int hashCode() {
                int a11 = g.a(this.inactiveStateTitle.hashCode() * 31, 31, this.activeStateTitle);
                String str = this.deeplink;
                return a11 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.inactiveStateTitle;
                String str2 = this.activeStateTitle;
                return o0.c(C3660k.d("ActivateActionVO(inactiveStateTitle=", str, ", activeStateTitle=", str2, ", deeplink="), this.deeplink, ")");
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$SharedDataVO;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SharedDataVO {

            @NotNull
            private final String text;

            public SharedDataVO(@NotNull String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SharedDataVO) && Intrinsics.d(this.text, ((SharedDataVO) other).text);
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("SharedDataVO(text=", this.text, ")");
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$BaseStateVO$ShowStepsActionVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShowStepsActionVO {

            @NotNull
            private final String title;

            public ShowStepsActionVO(@NotNull String title) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShowStepsActionVO) && Intrinsics.d(this.title, ((ShowStepsActionVO) other).title);
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ShowStepsActionVO(title=", this.title, ")");
            }
        }

        public BaseStateVO(@NotNull String title, String str, Integer num, Integer num2, SharedDataVO sharedDataVO, ActivateActionVO activateActionVO, ShowStepsActionVO showStepsActionVO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subTitle = str;
            this.titleColor = num;
            this.backgroundColor = num2;
            this.sharedData = sharedDataVO;
            this.activateAction = activateActionVO;
            this.showStepsAction = showStepsActionVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseStateVO)) {
                return false;
            }
            BaseStateVO baseStateVO = (BaseStateVO) other;
            return Intrinsics.d(this.title, baseStateVO.title) && Intrinsics.d(this.subTitle, baseStateVO.subTitle) && Intrinsics.d(this.titleColor, baseStateVO.titleColor) && Intrinsics.d(this.backgroundColor, baseStateVO.backgroundColor) && Intrinsics.d(this.sharedData, baseStateVO.sharedData) && Intrinsics.d(this.activateAction, baseStateVO.activateAction) && Intrinsics.d(this.showStepsAction, baseStateVO.showStepsAction);
        }

        public final ActivateActionVO getActivateAction() {
            return this.activateAction;
        }

        public final Integer getBackgroundColor() {
            return this.backgroundColor;
        }

        public final SharedDataVO getSharedData() {
            return this.sharedData;
        }

        public final ShowStepsActionVO getShowStepsAction() {
            return this.showStepsAction;
        }

        public final String getSubTitle() {
            return this.subTitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Integer getTitleColor() {
            return this.titleColor;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subTitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.titleColor;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.backgroundColor;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            SharedDataVO sharedDataVO = this.sharedData;
            int hashCode5 = (hashCode4 + (sharedDataVO == null ? 0 : sharedDataVO.hashCode())) * 31;
            ActivateActionVO activateActionVO = this.activateAction;
            int hashCode6 = (hashCode5 + (activateActionVO == null ? 0 : activateActionVO.hashCode())) * 31;
            ShowStepsActionVO showStepsActionVO = this.showStepsAction;
            return hashCode6 + (showStepsActionVO != null ? showStepsActionVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subTitle;
            Integer num = this.titleColor;
            Integer num2 = this.backgroundColor;
            SharedDataVO sharedDataVO = this.sharedData;
            ActivateActionVO activateActionVO = this.activateAction;
            ShowStepsActionVO showStepsActionVO = this.showStepsAction;
            StringBuilder d11 = C3660k.d("BaseStateVO(title=", str, ", subTitle=", str2, ", titleColor=");
            Ef0.c.e(d11, num, ", backgroundColor=", num2, ", sharedData=");
            d11.append(sharedDataVO);
            d11.append(", activateAction=");
            d11.append(activateActionVO);
            d11.append(", showStepsAction=");
            d11.append(showStepsActionVO);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$PromoCodeVO;", "", "", "isActivated", "", "promoCode", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "setActivated", "(Z)V", "Ljava/lang/String;", "getPromoCode", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PromoCodeVO {
        private boolean isActivated;

        @NotNull
        private final String promoCode;

        public PromoCodeVO(boolean z11, @NotNull String promoCode) {
            Intrinsics.checkNotNullParameter(promoCode, "promoCode");
            this.isActivated = z11;
            this.promoCode = promoCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PromoCodeVO)) {
                return false;
            }
            PromoCodeVO promoCodeVO = (PromoCodeVO) other;
            return this.isActivated == promoCodeVO.isActivated && Intrinsics.d(this.promoCode, promoCodeVO.promoCode);
        }

        @NotNull
        public final String getPromoCode() {
            return this.promoCode;
        }

        public int hashCode() {
            return this.promoCode.hashCode() + (Boolean.hashCode(this.isActivated) * 31);
        }

        /* renamed from: isActivated, reason: from getter */
        public final boolean getIsActivated() {
            return this.isActivated;
        }

        public final void setActivated(boolean z11) {
            this.isActivated = z11;
        }

        @NotNull
        public String toString() {
            return "PromoCodeVO(isActivated=" + this.isActivated + ", promoCode=" + this.promoCode + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO;", "", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsTextVO;", "stepsText", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsActionVO;", "stepsAction", "<init>", "(Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsTextVO;Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsActionVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsTextVO;", "getStepsText", "()Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsTextVO;", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsActionVO;", "getStepsAction", "()Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsActionVO;", "StepsTextVO", "StepsActionVO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StepsStateVO {
        public static final int $stable = OzonSpannableString.$stable;
        private final StepsActionVO stepsAction;

        @NotNull
        private final StepsTextVO stepsText;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsActionVO;", "", "", "inactiveStateTitle", "activeStateTitle", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInactiveStateTitle", "getActiveStateTitle", "getDeeplink", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StepsActionVO {

            @NotNull
            private final String activeStateTitle;
            private final String deeplink;

            @NotNull
            private final String inactiveStateTitle;

            public StepsActionVO(@NotNull String inactiveStateTitle, @NotNull String activeStateTitle, String str) {
                Intrinsics.checkNotNullParameter(inactiveStateTitle, "inactiveStateTitle");
                Intrinsics.checkNotNullParameter(activeStateTitle, "activeStateTitle");
                this.inactiveStateTitle = inactiveStateTitle;
                this.activeStateTitle = activeStateTitle;
                this.deeplink = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StepsActionVO)) {
                    return false;
                }
                StepsActionVO stepsActionVO = (StepsActionVO) other;
                return Intrinsics.d(this.inactiveStateTitle, stepsActionVO.inactiveStateTitle) && Intrinsics.d(this.activeStateTitle, stepsActionVO.activeStateTitle) && Intrinsics.d(this.deeplink, stepsActionVO.deeplink);
            }

            @NotNull
            public final String getActiveStateTitle() {
                return this.activeStateTitle;
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final String getInactiveStateTitle() {
                return this.inactiveStateTitle;
            }

            public int hashCode() {
                int a11 = g.a(this.inactiveStateTitle.hashCode() * 31, 31, this.activeStateTitle);
                String str = this.deeplink;
                return a11 + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.inactiveStateTitle;
                String str2 = this.activeStateTitle;
                return o0.c(C3660k.d("StepsActionVO(inactiveStateTitle=", str, ", activeStateTitle=", str2, ", deeplink="), this.deeplink, ")");
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO$StepsStateVO$StepsTextVO;", "", "", "textColor", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "<init>", "(Ljava/lang/Integer;Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class StepsTextVO {
            public static final int $stable = OzonSpannableString.$stable;

            @NotNull
            private final OzonSpannableString text;
            private final Integer textColor;

            public StepsTextVO(Integer num, @NotNull OzonSpannableString text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.textColor = num;
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StepsTextVO)) {
                    return false;
                }
                StepsTextVO stepsTextVO = (StepsTextVO) other;
                return Intrinsics.d(this.textColor, stepsTextVO.textColor) && Intrinsics.d(this.text, stepsTextVO.text);
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            public final Integer getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                Integer num = this.textColor;
                return this.text.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return "StepsTextVO(textColor=" + this.textColor + ", text=" + ((Object) this.text) + ")";
            }
        }

        public StepsStateVO(@NotNull StepsTextVO stepsText, StepsActionVO stepsActionVO) {
            Intrinsics.checkNotNullParameter(stepsText, "stepsText");
            this.stepsText = stepsText;
            this.stepsAction = stepsActionVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepsStateVO)) {
                return false;
            }
            StepsStateVO stepsStateVO = (StepsStateVO) other;
            return Intrinsics.d(this.stepsText, stepsStateVO.stepsText) && Intrinsics.d(this.stepsAction, stepsStateVO.stepsAction);
        }

        public final StepsActionVO getStepsAction() {
            return this.stepsAction;
        }

        @NotNull
        public final StepsTextVO getStepsText() {
            return this.stepsText;
        }

        public int hashCode() {
            int hashCode = this.stepsText.hashCode() * 31;
            StepsActionVO stepsActionVO = this.stepsAction;
            return hashCode + (stepsActionVO == null ? 0 : stepsActionVO.hashCode());
        }

        @NotNull
        public String toString() {
            return "StepsStateVO(stepsText=" + this.stepsText + ", stepsAction=" + this.stepsAction + ")";
        }
    }

    public CouponPromoVO(long j11, @NotNull PromoCodeVO promoCode, @NotNull BaseStateVO baseState, @NotNull StepsStateVO stepsState, t tVar) {
        Intrinsics.checkNotNullParameter(promoCode, "promoCode");
        Intrinsics.checkNotNullParameter(baseState, "baseState");
        Intrinsics.checkNotNullParameter(stepsState, "stepsState");
        this.id = j11;
        this.promoCode = promoCode;
        this.baseState = baseState;
        this.stepsState = stepsState;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponPromoVO)) {
            return false;
        }
        CouponPromoVO couponPromoVO = (CouponPromoVO) other;
        return this.id == couponPromoVO.id && Intrinsics.d(this.promoCode, couponPromoVO.promoCode) && Intrinsics.d(this.baseState, couponPromoVO.baseState) && Intrinsics.d(this.stepsState, couponPromoVO.stepsState) && Intrinsics.d(this.tokenizedEvent, couponPromoVO.tokenizedEvent);
    }

    @NotNull
    public final BaseStateVO getBaseState() {
        return this.baseState;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final PromoCodeVO getPromoCode() {
        return this.promoCode;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final StepsStateVO getStepsState() {
        return this.stepsState;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.stepsState.hashCode() + ((this.baseState.hashCode() + ((this.promoCode.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PromoCodeVO promoCodeVO = this.promoCode;
        BaseStateVO baseStateVO = this.baseState;
        StepsStateVO stepsStateVO = this.stepsState;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("CouponPromoVO(id=");
        sb2.append(j11);
        sb2.append(", promoCode=");
        sb2.append(promoCodeVO);
        sb2.append(", baseState=");
        sb2.append(baseStateVO);
        sb2.append(", stepsState=");
        sb2.append(stepsStateVO);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
