package ru.ozon.app.android.marketing.widgets.couponPromo.data;

import B0.A0;
import C.o0;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.data.markdown.MarkWonToTextTypeExtKt;
import ru.ozon.app.android.tools.MarkupType;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005?@ABCB\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00106\u001a\u00020\u0011HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u009b\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001J\u0013\u0010:\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006D"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "backgroundColor", "textColor", "activated", "", "promoCode", "shareData", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShareDataDTO;", "activateAction", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ActivateActionDTO;", "showStepsAction", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShowStepsActionDTO;", "stepsText", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsTextDTO;", "stepsAction", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShareDataDTO;Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ActivateActionDTO;Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShowStepsActionDTO;Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsTextDTO;Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsActionDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getBackgroundColor", "getTextColor", "getActivated", "()Z", "getPromoCode", "getShareData", "()Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShareDataDTO;", "getActivateAction", "()Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ActivateActionDTO;", "getShowStepsAction", "()Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShowStepsActionDTO;", "getStepsText", "()Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsTextDTO;", "getStepsAction", "()Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "ShareDataDTO", "ActivateActionDTO", "ShowStepsActionDTO", "StepsTextDTO", "StepsActionDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CouponPromoDTO {
    public static final int $stable = 8;
    private final ActivateActionDTO activateAction;
    private final boolean activated;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final String promoCode;
    private final ShareDataDTO shareData;
    private final ShowStepsActionDTO showStepsAction;
    private final StepsActionDTO stepsAction;

    @NotNull
    private final StepsTextDTO stepsText;
    private final String subtitle;
    private final String textColor;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ActivateActionDTO;", "", "inactiveStateTitle", "", "activeStateTitle", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInactiveStateTitle", "()Ljava/lang/String;", "getActiveStateTitle", "getDeeplink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActivateActionDTO {
        public static final int $stable = 0;

        @NotNull
        private final String activeStateTitle;
        private final String deeplink;

        @NotNull
        private final String inactiveStateTitle;

        public ActivateActionDTO(@NotNull String inactiveStateTitle, @NotNull String activeStateTitle, String str) {
            Intrinsics.checkNotNullParameter(inactiveStateTitle, "inactiveStateTitle");
            Intrinsics.checkNotNullParameter(activeStateTitle, "activeStateTitle");
            this.inactiveStateTitle = inactiveStateTitle;
            this.activeStateTitle = activeStateTitle;
            this.deeplink = str;
        }

        public static /* synthetic */ ActivateActionDTO copy$default(ActivateActionDTO activateActionDTO, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = activateActionDTO.inactiveStateTitle;
            }
            if ((i11 & 2) != 0) {
                str2 = activateActionDTO.activeStateTitle;
            }
            if ((i11 & 4) != 0) {
                str3 = activateActionDTO.deeplink;
            }
            return activateActionDTO.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getInactiveStateTitle() {
            return this.inactiveStateTitle;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActiveStateTitle() {
            return this.activeStateTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final ActivateActionDTO copy(@NotNull String inactiveStateTitle, @NotNull String activeStateTitle, String deeplink) {
            Intrinsics.checkNotNullParameter(inactiveStateTitle, "inactiveStateTitle");
            Intrinsics.checkNotNullParameter(activeStateTitle, "activeStateTitle");
            return new ActivateActionDTO(inactiveStateTitle, activeStateTitle, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActivateActionDTO)) {
                return false;
            }
            ActivateActionDTO activateActionDTO = (ActivateActionDTO) other;
            return Intrinsics.d(this.inactiveStateTitle, activateActionDTO.inactiveStateTitle) && Intrinsics.d(this.activeStateTitle, activateActionDTO.activeStateTitle) && Intrinsics.d(this.deeplink, activateActionDTO.deeplink);
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
            return o0.c(C3660k.d("ActivateActionDTO(inactiveStateTitle=", str, ", activeStateTitle=", str2, ", deeplink="), this.deeplink, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShareDataDTO;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShareDataDTO {
        public static final int $stable = 0;

        @NotNull
        private final String text;

        public ShareDataDTO(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public static /* synthetic */ ShareDataDTO copy$default(ShareDataDTO shareDataDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = shareDataDTO.text;
            }
            return shareDataDTO.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final ShareDataDTO copy(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ShareDataDTO(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShareDataDTO) && Intrinsics.d(this.text, ((ShareDataDTO) other).text);
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
            return A0.b("ShareDataDTO(text=", this.text, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$ShowStepsActionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowStepsActionDTO {
        public static final int $stable = 0;

        @NotNull
        private final String title;

        public ShowStepsActionDTO(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
        }

        public static /* synthetic */ ShowStepsActionDTO copy$default(ShowStepsActionDTO showStepsActionDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = showStepsActionDTO.title;
            }
            return showStepsActionDTO.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final ShowStepsActionDTO copy(@NotNull String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new ShowStepsActionDTO(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowStepsActionDTO) && Intrinsics.d(this.title, ((ShowStepsActionDTO) other).title);
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
            return A0.b("ShowStepsActionDTO(title=", this.title, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsActionDTO;", "", "inactiveStateTitle", "", "activeStateTitle", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInactiveStateTitle", "()Ljava/lang/String;", "getActiveStateTitle", "getDeeplink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StepsActionDTO {
        public static final int $stable = 0;

        @NotNull
        private final String activeStateTitle;
        private final String deeplink;

        @NotNull
        private final String inactiveStateTitle;

        public StepsActionDTO(@NotNull String inactiveStateTitle, @NotNull String activeStateTitle, String str) {
            Intrinsics.checkNotNullParameter(inactiveStateTitle, "inactiveStateTitle");
            Intrinsics.checkNotNullParameter(activeStateTitle, "activeStateTitle");
            this.inactiveStateTitle = inactiveStateTitle;
            this.activeStateTitle = activeStateTitle;
            this.deeplink = str;
        }

        public static /* synthetic */ StepsActionDTO copy$default(StepsActionDTO stepsActionDTO, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = stepsActionDTO.inactiveStateTitle;
            }
            if ((i11 & 2) != 0) {
                str2 = stepsActionDTO.activeStateTitle;
            }
            if ((i11 & 4) != 0) {
                str3 = stepsActionDTO.deeplink;
            }
            return stepsActionDTO.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getInactiveStateTitle() {
            return this.inactiveStateTitle;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getActiveStateTitle() {
            return this.activeStateTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final StepsActionDTO copy(@NotNull String inactiveStateTitle, @NotNull String activeStateTitle, String deeplink) {
            Intrinsics.checkNotNullParameter(inactiveStateTitle, "inactiveStateTitle");
            Intrinsics.checkNotNullParameter(activeStateTitle, "activeStateTitle");
            return new StepsActionDTO(inactiveStateTitle, activeStateTitle, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepsActionDTO)) {
                return false;
            }
            StepsActionDTO stepsActionDTO = (StepsActionDTO) other;
            return Intrinsics.d(this.inactiveStateTitle, stepsActionDTO.inactiveStateTitle) && Intrinsics.d(this.activeStateTitle, stepsActionDTO.activeStateTitle) && Intrinsics.d(this.deeplink, stepsActionDTO.deeplink);
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
            return o0.c(C3660k.d("StepsActionDTO(inactiveStateTitle=", str, ", activeStateTitle=", str2, ", deeplink="), this.deeplink, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO$StepsTextDTO;", "", "textColor", "", "markupType", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTextColor", "()Ljava/lang/String;", "getMarkupType", "getText", "textType", "Lru/ozon/app/android/tools/MarkupType;", "getTextType", "()Lru/ozon/app/android/tools/MarkupType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StepsTextDTO {
        public static final int $stable = 0;
        private final String markupType;

        @NotNull
        private final String text;
        private final String textColor;

        @NotNull
        private final MarkupType textType;

        public StepsTextDTO(String str, String str2, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.textColor = str;
            this.markupType = str2;
            this.text = text;
            this.textType = MarkWonToTextTypeExtKt.toTextType(str2);
        }

        public static /* synthetic */ StepsTextDTO copy$default(StepsTextDTO stepsTextDTO, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = stepsTextDTO.textColor;
            }
            if ((i11 & 2) != 0) {
                str2 = stepsTextDTO.markupType;
            }
            if ((i11 & 4) != 0) {
                str3 = stepsTextDTO.text;
            }
            return stepsTextDTO.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMarkupType() {
            return this.markupType;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final StepsTextDTO copy(String textColor, String markupType, @NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new StepsTextDTO(textColor, markupType, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StepsTextDTO)) {
                return false;
            }
            StepsTextDTO stepsTextDTO = (StepsTextDTO) other;
            return Intrinsics.d(this.textColor, stepsTextDTO.textColor) && Intrinsics.d(this.markupType, stepsTextDTO.markupType) && Intrinsics.d(this.text, stepsTextDTO.text);
        }

        public final String getMarkupType() {
            return this.markupType;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final MarkupType getTextType() {
            return this.textType;
        }

        public int hashCode() {
            String str = this.textColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.markupType;
            return this.text.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.textColor;
            String str2 = this.markupType;
            return o0.c(C3660k.d("StepsTextDTO(textColor=", str, ", markupType=", str2, ", text="), this.text, ")");
        }
    }

    public CouponPromoDTO(@NotNull String title, String str, @NotNull String backgroundColor, String str2, boolean z11, @NotNull String promoCode, ShareDataDTO shareDataDTO, ActivateActionDTO activateActionDTO, ShowStepsActionDTO showStepsActionDTO, @NotNull StepsTextDTO stepsText, StepsActionDTO stepsActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(promoCode, "promoCode");
        Intrinsics.checkNotNullParameter(stepsText, "stepsText");
        this.title = title;
        this.subtitle = str;
        this.backgroundColor = backgroundColor;
        this.textColor = str2;
        this.activated = z11;
        this.promoCode = promoCode;
        this.shareData = shareDataDTO;
        this.activateAction = activateActionDTO;
        this.showStepsAction = showStepsActionDTO;
        this.stepsText = stepsText;
        this.stepsAction = stepsActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CouponPromoDTO copy$default(CouponPromoDTO couponPromoDTO, String str, String str2, String str3, String str4, boolean z11, String str5, ShareDataDTO shareDataDTO, ActivateActionDTO activateActionDTO, ShowStepsActionDTO showStepsActionDTO, StepsTextDTO stepsTextDTO, StepsActionDTO stepsActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = couponPromoDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = couponPromoDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = couponPromoDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            str4 = couponPromoDTO.textColor;
        }
        if ((i11 & 16) != 0) {
            z11 = couponPromoDTO.activated;
        }
        if ((i11 & 32) != 0) {
            str5 = couponPromoDTO.promoCode;
        }
        if ((i11 & 64) != 0) {
            shareDataDTO = couponPromoDTO.shareData;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            activateActionDTO = couponPromoDTO.activateAction;
        }
        if ((i11 & 256) != 0) {
            showStepsActionDTO = couponPromoDTO.showStepsAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            stepsTextDTO = couponPromoDTO.stepsText;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            stepsActionDTO = couponPromoDTO.stepsAction;
        }
        if ((i11 & 2048) != 0) {
            map = couponPromoDTO.trackingInfo;
        }
        StepsActionDTO stepsActionDTO2 = stepsActionDTO;
        Map map2 = map;
        ShowStepsActionDTO showStepsActionDTO2 = showStepsActionDTO;
        StepsTextDTO stepsTextDTO2 = stepsTextDTO;
        ShareDataDTO shareDataDTO2 = shareDataDTO;
        ActivateActionDTO activateActionDTO2 = activateActionDTO;
        boolean z12 = z11;
        String str6 = str5;
        return couponPromoDTO.copy(str, str2, str3, str4, z12, str6, shareDataDTO2, activateActionDTO2, showStepsActionDTO2, stepsTextDTO2, stepsActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final StepsTextDTO getStepsText() {
        return this.stepsText;
    }

    /* renamed from: component11, reason: from getter */
    public final StepsActionDTO getStepsAction() {
        return this.stepsAction;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getActivated() {
        return this.activated;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    /* renamed from: component7, reason: from getter */
    public final ShareDataDTO getShareData() {
        return this.shareData;
    }

    /* renamed from: component8, reason: from getter */
    public final ActivateActionDTO getActivateAction() {
        return this.activateAction;
    }

    /* renamed from: component9, reason: from getter */
    public final ShowStepsActionDTO getShowStepsAction() {
        return this.showStepsAction;
    }

    @NotNull
    public final CouponPromoDTO copy(@NotNull String title, String subtitle, @NotNull String backgroundColor, String textColor, boolean activated, @NotNull String promoCode, ShareDataDTO shareData, ActivateActionDTO activateAction, ShowStepsActionDTO showStepsAction, @NotNull StepsTextDTO stepsText, StepsActionDTO stepsAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(promoCode, "promoCode");
        Intrinsics.checkNotNullParameter(stepsText, "stepsText");
        return new CouponPromoDTO(title, subtitle, backgroundColor, textColor, activated, promoCode, shareData, activateAction, showStepsAction, stepsText, stepsAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponPromoDTO)) {
            return false;
        }
        CouponPromoDTO couponPromoDTO = (CouponPromoDTO) other;
        return Intrinsics.d(this.title, couponPromoDTO.title) && Intrinsics.d(this.subtitle, couponPromoDTO.subtitle) && Intrinsics.d(this.backgroundColor, couponPromoDTO.backgroundColor) && Intrinsics.d(this.textColor, couponPromoDTO.textColor) && this.activated == couponPromoDTO.activated && Intrinsics.d(this.promoCode, couponPromoDTO.promoCode) && Intrinsics.d(this.shareData, couponPromoDTO.shareData) && Intrinsics.d(this.activateAction, couponPromoDTO.activateAction) && Intrinsics.d(this.showStepsAction, couponPromoDTO.showStepsAction) && Intrinsics.d(this.stepsText, couponPromoDTO.stepsText) && Intrinsics.d(this.stepsAction, couponPromoDTO.stepsAction) && Intrinsics.d(this.trackingInfo, couponPromoDTO.trackingInfo);
    }

    public final ActivateActionDTO getActivateAction() {
        return this.activateAction;
    }

    public final boolean getActivated() {
        return this.activated;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getPromoCode() {
        return this.promoCode;
    }

    public final ShareDataDTO getShareData() {
        return this.shareData;
    }

    public final ShowStepsActionDTO getShowStepsAction() {
        return this.showStepsAction;
    }

    public final StepsActionDTO getStepsAction() {
        return this.stepsAction;
    }

    @NotNull
    public final StepsTextDTO getStepsText() {
        return this.stepsText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.backgroundColor);
        String str2 = this.textColor;
        int a12 = g.a(C3532b.a((a11 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.activated), 31, this.promoCode);
        ShareDataDTO shareDataDTO = this.shareData;
        int hashCode2 = (a12 + (shareDataDTO == null ? 0 : shareDataDTO.hashCode())) * 31;
        ActivateActionDTO activateActionDTO = this.activateAction;
        int hashCode3 = (hashCode2 + (activateActionDTO == null ? 0 : activateActionDTO.hashCode())) * 31;
        ShowStepsActionDTO showStepsActionDTO = this.showStepsAction;
        int hashCode4 = (this.stepsText.hashCode() + ((hashCode3 + (showStepsActionDTO == null ? 0 : showStepsActionDTO.hashCode())) * 31)) * 31;
        StepsActionDTO stepsActionDTO = this.stepsAction;
        int hashCode5 = (hashCode4 + (stepsActionDTO == null ? 0 : stepsActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.backgroundColor;
        String str4 = this.textColor;
        boolean z11 = this.activated;
        String str5 = this.promoCode;
        ShareDataDTO shareDataDTO = this.shareData;
        ActivateActionDTO activateActionDTO = this.activateAction;
        ShowStepsActionDTO showStepsActionDTO = this.showStepsAction;
        StepsTextDTO stepsTextDTO = this.stepsText;
        StepsActionDTO stepsActionDTO = this.stepsAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("CouponPromoDTO(title=", str, ", subtitle=", str2, ", backgroundColor=");
        a.h(d11, str3, ", textColor=", str4, ", activated=");
        C5766e.a(", promoCode=", str5, ", shareData=", d11, z11);
        d11.append(shareDataDTO);
        d11.append(", activateAction=");
        d11.append(activateActionDTO);
        d11.append(", showStepsAction=");
        d11.append(showStepsActionDTO);
        d11.append(", stepsText=");
        d11.append(stepsTextDTO);
        d11.append(", stepsAction=");
        d11.append(stepsActionDTO);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
