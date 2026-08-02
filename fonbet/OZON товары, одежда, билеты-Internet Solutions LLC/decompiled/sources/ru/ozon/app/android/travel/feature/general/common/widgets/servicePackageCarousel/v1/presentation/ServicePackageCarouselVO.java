package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation;

import De.C2859b;
import G.g;
import Kk.C3532b;
import Ns.b;
import Pk0.h;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.themeImage.v2.ThemeImageV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001-BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "travelLogo", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "packages", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "getTravelLogo", "()Lru/ozon/app/android/travel/molecules/view/themeImage/v2/ThemeImageV2VO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getPackages", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "ServicePackageCarouselCardVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ServicePackageCarouselVO implements c {
    private final long id;

    @NotNull
    private final List<ServicePackageCarouselCardVO> packages;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final ThemeImageV2VO travelLogo;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u009e\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010&\"\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u001f\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b:\u00109R\u001f\u0010\u0015\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b;\u00106R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "", "", "id", "", "isActive", "", "borderColor", "Lru/ozon/uni/core/UniGradient;", "backgroundGradient", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO;", "items", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "smsToggler", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "smsTogglerViewEvent", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "lightThemeButton", "darkThemeButton", "viewEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(IZLjava/lang/String;Lru/ozon/uni/core/UniGradient;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "copy", "(IZLjava/lang/String;Lru/ozon/uni/core/UniGradient;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;LWZ/t;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Z", "()Z", "setActive", "(Z)V", "Ljava/lang/String;", "getBorderColor", "Lru/ozon/uni/core/UniGradient;", "getBackgroundGradient", "()Lru/ozon/uni/core/UniGradient;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSmsToggler", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "LWZ/t;", "getSmsTogglerViewEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getLightThemeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDarkThemeButton", "getViewEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "ServicePackageCarouselCardItemVO", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ServicePackageCarouselCardVO {
        private final UniGradient backgroundGradient;
        private final String borderColor;
        private final ButtonV3DTO darkThemeButton;
        private final int id;
        private boolean isActive;

        @NotNull
        private final List<ServicePackageCarouselCardItemVO> items;

        @NotNull
        private final ButtonV3DTO lightThemeButton;
        private final CellDTO smsToggler;
        private final t smsTogglerViewEvent;
        private final TestInfo testInfo;
        private final t viewEvent;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO;", "", "id", "", "getId", "()I", "HorizontalBadges", "Text", "Price", "Benefit", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Benefit;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$HorizontalBadges;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Price;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Text;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface ServicePackageCarouselCardItemVO {

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Benefit;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "benefit", "<init>", "(ILru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBenefit", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Benefit implements ServicePackageCarouselCardItemVO {
                public static final int $stable = CellDTO.$stable;

                @NotNull
                private final CellDTO benefit;
                private final int id;

                public Benefit(int i11, @NotNull CellDTO benefit) {
                    Intrinsics.checkNotNullParameter(benefit, "benefit");
                    this.id = i11;
                    this.benefit = benefit;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Benefit)) {
                        return false;
                    }
                    Benefit benefit = (Benefit) other;
                    return this.id == benefit.id && Intrinsics.d(this.benefit, benefit.benefit);
                }

                @NotNull
                public final CellDTO getBenefit() {
                    return this.benefit;
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO
                public int getId() {
                    return this.id;
                }

                public int hashCode() {
                    return this.benefit.hashCode() + (Integer.hashCode(this.id) * 31);
                }

                @NotNull
                public String toString() {
                    return "Benefit(id=" + this.id + ", benefit=" + this.benefit + ")";
                }
            }

            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$HorizontalBadges;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO;", "", "id", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badges", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/util/List;", "getBadges", "()Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class HorizontalBadges implements ServicePackageCarouselCardItemVO {

                @NotNull
                private final List<BadgeDTO> badges;
                private final int id;

                public HorizontalBadges(int i11, @NotNull List<BadgeDTO> badges) {
                    Intrinsics.checkNotNullParameter(badges, "badges");
                    this.id = i11;
                    this.badges = badges;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HorizontalBadges)) {
                        return false;
                    }
                    HorizontalBadges horizontalBadges = (HorizontalBadges) other;
                    return this.id == horizontalBadges.id && Intrinsics.d(this.badges, horizontalBadges.badges);
                }

                @NotNull
                public final List<BadgeDTO> getBadges() {
                    return this.badges;
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO
                public int getId() {
                    return this.id;
                }

                public int hashCode() {
                    return this.badges.hashCode() + (Integer.hashCode(this.id) * 31);
                }

                @NotNull
                public String toString() {
                    return "HorizontalBadges(id=" + this.id + ", badges=" + this.badges + ")";
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Price;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO;", "", "id", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "<init>", "(ILru/ozon/uni/atoms/data/price/PriceDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Price implements ServicePackageCarouselCardItemVO {
                public static final int $stable = PriceDTO.$stable;
                private final int id;

                @NotNull
                private final PriceDTO price;

                public Price(int i11, @NotNull PriceDTO price) {
                    Intrinsics.checkNotNullParameter(price, "price");
                    this.id = i11;
                    this.price = price;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Price)) {
                        return false;
                    }
                    Price price = (Price) other;
                    return this.id == price.id && Intrinsics.d(this.price, price.price);
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO
                public int getId() {
                    return this.id;
                }

                @NotNull
                public final PriceDTO getPrice() {
                    return this.price;
                }

                public int hashCode() {
                    return this.price.hashCode() + (Integer.hashCode(this.id) * 31);
                }

                @NotNull
                public String toString() {
                    return "Price(id=" + this.id + ", price=" + this.price + ")";
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Text;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Text implements ServicePackageCarouselCardItemVO {
                private final int id;

                @NotNull
                private final TextDTO text;

                public Text(int i11, @NotNull TextDTO text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.id = i11;
                    this.text = text;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Text)) {
                        return false;
                    }
                    Text text = (Text) other;
                    return this.id == text.id && Intrinsics.d(this.text, text.text);
                }

                @Override // ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO
                public int getId() {
                    return this.id;
                }

                @NotNull
                public final TextDTO getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode() + (Integer.hashCode(this.id) * 31);
                }

                @NotNull
                public String toString() {
                    return "Text(id=" + this.id + ", text=" + this.text + ")";
                }
            }

            int getId();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ServicePackageCarouselCardVO(int i11, boolean z11, String str, UniGradient uniGradient, @NotNull List<? extends ServicePackageCarouselCardItemVO> items, CellDTO cellDTO, t tVar, @NotNull ButtonV3DTO lightThemeButton, ButtonV3DTO buttonV3DTO, t tVar2, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(lightThemeButton, "lightThemeButton");
            this.id = i11;
            this.isActive = z11;
            this.borderColor = str;
            this.backgroundGradient = uniGradient;
            this.items = items;
            this.smsToggler = cellDTO;
            this.smsTogglerViewEvent = tVar;
            this.lightThemeButton = lightThemeButton;
            this.darkThemeButton = buttonV3DTO;
            this.viewEvent = tVar2;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ ServicePackageCarouselCardVO copy$default(ServicePackageCarouselCardVO servicePackageCarouselCardVO, int i11, boolean z11, String str, UniGradient uniGradient, List list, CellDTO cellDTO, t tVar, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, t tVar2, TestInfo testInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = servicePackageCarouselCardVO.id;
            }
            if ((i12 & 2) != 0) {
                z11 = servicePackageCarouselCardVO.isActive;
            }
            if ((i12 & 4) != 0) {
                str = servicePackageCarouselCardVO.borderColor;
            }
            if ((i12 & 8) != 0) {
                uniGradient = servicePackageCarouselCardVO.backgroundGradient;
            }
            if ((i12 & 16) != 0) {
                list = servicePackageCarouselCardVO.items;
            }
            if ((i12 & 32) != 0) {
                cellDTO = servicePackageCarouselCardVO.smsToggler;
            }
            if ((i12 & 64) != 0) {
                tVar = servicePackageCarouselCardVO.smsTogglerViewEvent;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                buttonV3DTO = servicePackageCarouselCardVO.lightThemeButton;
            }
            if ((i12 & 256) != 0) {
                buttonV3DTO2 = servicePackageCarouselCardVO.darkThemeButton;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                tVar2 = servicePackageCarouselCardVO.viewEvent;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                testInfo = servicePackageCarouselCardVO.testInfo;
            }
            t tVar3 = tVar2;
            TestInfo testInfo2 = testInfo;
            ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
            ButtonV3DTO buttonV3DTO4 = buttonV3DTO2;
            CellDTO cellDTO2 = cellDTO;
            t tVar4 = tVar;
            List list2 = list;
            String str2 = str;
            return servicePackageCarouselCardVO.copy(i11, z11, str2, uniGradient, list2, cellDTO2, tVar4, buttonV3DTO3, buttonV3DTO4, tVar3, testInfo2);
        }

        @NotNull
        public final ServicePackageCarouselCardVO copy(int id2, boolean isActive, String borderColor, UniGradient backgroundGradient, @NotNull List<? extends ServicePackageCarouselCardItemVO> items, CellDTO smsToggler, t smsTogglerViewEvent, @NotNull ButtonV3DTO lightThemeButton, ButtonV3DTO darkThemeButton, t viewEvent, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(lightThemeButton, "lightThemeButton");
            return new ServicePackageCarouselCardVO(id2, isActive, borderColor, backgroundGradient, items, smsToggler, smsTogglerViewEvent, lightThemeButton, darkThemeButton, viewEvent, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServicePackageCarouselCardVO)) {
                return false;
            }
            ServicePackageCarouselCardVO servicePackageCarouselCardVO = (ServicePackageCarouselCardVO) other;
            return this.id == servicePackageCarouselCardVO.id && this.isActive == servicePackageCarouselCardVO.isActive && Intrinsics.d(this.borderColor, servicePackageCarouselCardVO.borderColor) && Intrinsics.d(this.backgroundGradient, servicePackageCarouselCardVO.backgroundGradient) && Intrinsics.d(this.items, servicePackageCarouselCardVO.items) && Intrinsics.d(this.smsToggler, servicePackageCarouselCardVO.smsToggler) && Intrinsics.d(this.smsTogglerViewEvent, servicePackageCarouselCardVO.smsTogglerViewEvent) && Intrinsics.d(this.lightThemeButton, servicePackageCarouselCardVO.lightThemeButton) && Intrinsics.d(this.darkThemeButton, servicePackageCarouselCardVO.darkThemeButton) && Intrinsics.d(this.viewEvent, servicePackageCarouselCardVO.viewEvent) && Intrinsics.d(this.testInfo, servicePackageCarouselCardVO.testInfo);
        }

        public final UniGradient getBackgroundGradient() {
            return this.backgroundGradient;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final ButtonV3DTO getDarkThemeButton() {
            return this.darkThemeButton;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final List<ServicePackageCarouselCardItemVO> getItems() {
            return this.items;
        }

        @NotNull
        public final ButtonV3DTO getLightThemeButton() {
            return this.lightThemeButton;
        }

        public final CellDTO getSmsToggler() {
            return this.smsToggler;
        }

        public final t getSmsTogglerViewEvent() {
            return this.smsTogglerViewEvent;
        }

        public final t getViewEvent() {
            return this.viewEvent;
        }

        public int hashCode() {
            int a11 = C3532b.a(Integer.hashCode(this.id) * 31, 31, this.isActive);
            String str = this.borderColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            UniGradient uniGradient = this.backgroundGradient;
            int b11 = g.b((hashCode + (uniGradient == null ? 0 : uniGradient.hashCode())) * 31, 31, this.items);
            CellDTO cellDTO = this.smsToggler;
            int hashCode2 = (b11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
            t tVar = this.smsTogglerViewEvent;
            int c11 = C2859b.c(this.lightThemeButton, (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31, 31);
            ButtonV3DTO buttonV3DTO = this.darkThemeButton;
            int hashCode3 = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            t tVar2 = this.viewEvent;
            int hashCode4 = (hashCode3 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode4 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        /* renamed from: isActive, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            boolean z11 = this.isActive;
            String str = this.borderColor;
            UniGradient uniGradient = this.backgroundGradient;
            List<ServicePackageCarouselCardItemVO> list = this.items;
            CellDTO cellDTO = this.smsToggler;
            t tVar = this.smsTogglerViewEvent;
            ButtonV3DTO buttonV3DTO = this.lightThemeButton;
            ButtonV3DTO buttonV3DTO2 = this.darkThemeButton;
            t tVar2 = this.viewEvent;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("ServicePackageCarouselCardVO(id=");
            sb2.append(i11);
            sb2.append(", isActive=");
            sb2.append(z11);
            sb2.append(", borderColor=");
            sb2.append(str);
            sb2.append(", backgroundGradient=");
            sb2.append(uniGradient);
            sb2.append(", items=");
            sb2.append(list);
            sb2.append(", smsToggler=");
            sb2.append(cellDTO);
            sb2.append(", smsTogglerViewEvent=");
            sb2.append(tVar);
            sb2.append(", lightThemeButton=");
            sb2.append(buttonV3DTO);
            sb2.append(", darkThemeButton=");
            sb2.append(buttonV3DTO2);
            sb2.append(", viewEvent=");
            sb2.append(tVar2);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    public ServicePackageCarouselVO(long j11, @NotNull ThemeImageV2VO travelLogo, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<ServicePackageCarouselCardVO> packages, t tVar) {
        Intrinsics.checkNotNullParameter(travelLogo, "travelLogo");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(packages, "packages");
        this.id = j11;
        this.travelLogo = travelLogo;
        this.title = title;
        this.subtitle = subtitle;
        this.packages = packages;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePackageCarouselVO)) {
            return false;
        }
        ServicePackageCarouselVO servicePackageCarouselVO = (ServicePackageCarouselVO) other;
        return this.id == servicePackageCarouselVO.id && Intrinsics.d(this.travelLogo, servicePackageCarouselVO.travelLogo) && Intrinsics.d(this.title, servicePackageCarouselVO.title) && Intrinsics.d(this.subtitle, servicePackageCarouselVO.subtitle) && Intrinsics.d(this.packages, servicePackageCarouselVO.packages) && Intrinsics.d(this.viewEvent, servicePackageCarouselVO.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ServicePackageCarouselCardVO> getPackages() {
        return this.packages;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final ThemeImageV2VO getTravelLogo() {
        return this.travelLogo;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(b.a(this.subtitle, b.a(this.title, (this.travelLogo.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31), 31, this.packages);
        t tVar = this.viewEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        ThemeImageV2VO themeImageV2VO = this.travelLogo;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<ServicePackageCarouselCardVO> list = this.packages;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("ServicePackageCarouselVO(id=");
        sb2.append(j11);
        sb2.append(", travelLogo=");
        sb2.append(themeImageV2VO);
        D3.g.i(", title=", ", subtitle=", sb2, textDTO, textDTO2);
        Ak.b.h(sb2, ", packages=", list, ", viewEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
