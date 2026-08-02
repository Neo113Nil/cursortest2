package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import B0.C2454a;
import Ek.a;
import G.g;
import Kk.C3532b;
import Pk0.b;
import android.graphics.drawable.Drawable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.combiner.PlaceholderRow;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b>\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001aBÍ\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'Jô\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0016\b\u0002\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010+R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00106\u001a\u0004\b7\u0010-\"\u0004\b8\u00109R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00106\u001a\u0004\b:\u0010-\"\u0004\b;\u00109R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b\f\u0010=R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u000f\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010FR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bM\u0010LR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010G\u001a\u0004\bN\u0010IR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010O\u001a\u0004\bP\u0010QR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010U\u001a\u0004\bV\u0010WR%\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b\"\u0010X\u001a\u0004\bY\u0010ZR\u001c\u0010#\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010[\u001a\u0004\b\\\u0010]R\u0019\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\f\n\u0004\b%\u0010^\u001a\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/combiner/PlaceholderRow;", "Landroid/graphics/drawable/Drawable;", "backgroundImage", "", "backgroundColor", "", "footerLabelHeight", "multiButtonHeight", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "checkboxSku", "id", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "galleryModel", "", "", "topRightButtons", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "leftBottomBadge", "secondLeftBottomBadge", "Lru/ozon/uni/atoms/data/AtomDTO;", "contentElements", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "buttonState", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "footerLabelAtom", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "placeholderRow", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO$BadgeOnboardingVO;", "badgeOnboarding", "<init>", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;IIZLjava/lang/Long;JLru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO$BadgeOnboardingVO;)V", "copy", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;IIZLjava/lang/Long;JLru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Integer;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO$BadgeOnboardingVO;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/drawable/Drawable;", "getBackgroundImage", "()Landroid/graphics/drawable/Drawable;", "Ljava/lang/String;", "getBackgroundColor", "I", "getFooterLabelHeight", "setFooterLabelHeight", "(I)V", "getMultiButtonHeight", "setMultiButtonHeight", "Z", "()Z", "Ljava/lang/Long;", "getCheckboxSku", "()Ljava/lang/Long;", "J", "getId", "()J", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "getGalleryModel", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/image/SearchResultsGalleryModel;", "Ljava/util/List;", "getTopRightButtons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getLeftBottomBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSecondLeftBottomBadge", "getContentElements", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "getButtonState", "()Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getFooterLabelAtom", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Ljava/lang/Integer;", "getPlaceholderRow", "()Ljava/lang/Integer;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO$BadgeOnboardingVO;", "getBadgeOnboarding", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO$BadgeOnboardingVO;", "BadgeOnboardingVO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchResultsGridVO implements c, PlaceholderRow {
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final Drawable backgroundImage;
    private final BadgeOnboardingVO badgeOnboarding;
    private final MultiButtonVO buttonState;
    private final Long checkboxSku;

    @NotNull
    private final List<AtomDTO> contentElements;
    private final TextAtom footerLabelAtom;
    private int footerLabelHeight;

    @NotNull
    private final SearchResultsGalleryModel galleryModel;
    private final long id;
    private final boolean isAdult;
    private final BadgeDTO leftBottomBadge;
    private int multiButtonHeight;
    private final Integer placeholderRow;
    private final BadgeDTO secondLeftBottomBadge;
    private final List<Object> topRightButtons;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO$BadgeOnboardingVO;", "", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "onboarding", "", "onboardingKey", "", "badgeCornerRadius", "backgroundCornerRadius", "", "backgroundPadding", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;Ljava/lang/String;FFI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "getOnboarding", "()Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "Ljava/lang/String;", "getOnboardingKey", "F", "getBadgeCornerRadius", "()F", "getBackgroundCornerRadius", "I", "getBackgroundPadding", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BadgeOnboardingVO {
        private final float backgroundCornerRadius;
        private final int backgroundPadding;
        private final float badgeCornerRadius;

        @NotNull
        private final OnboardingModel onboarding;

        @NotNull
        private final String onboardingKey;

        public BadgeOnboardingVO(@NotNull OnboardingModel onboarding, @NotNull String onboardingKey, float f7, float f11, int i11) {
            Intrinsics.checkNotNullParameter(onboarding, "onboarding");
            Intrinsics.checkNotNullParameter(onboardingKey, "onboardingKey");
            this.onboarding = onboarding;
            this.onboardingKey = onboardingKey;
            this.badgeCornerRadius = f7;
            this.backgroundCornerRadius = f11;
            this.backgroundPadding = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BadgeOnboardingVO)) {
                return false;
            }
            BadgeOnboardingVO badgeOnboardingVO = (BadgeOnboardingVO) other;
            return Intrinsics.d(this.onboarding, badgeOnboardingVO.onboarding) && Intrinsics.d(this.onboardingKey, badgeOnboardingVO.onboardingKey) && Float.compare(this.badgeCornerRadius, badgeOnboardingVO.badgeCornerRadius) == 0 && Float.compare(this.backgroundCornerRadius, badgeOnboardingVO.backgroundCornerRadius) == 0 && this.backgroundPadding == badgeOnboardingVO.backgroundPadding;
        }

        public final float getBackgroundCornerRadius() {
            return this.backgroundCornerRadius;
        }

        public final int getBackgroundPadding() {
            return this.backgroundPadding;
        }

        public final float getBadgeCornerRadius() {
            return this.badgeCornerRadius;
        }

        @NotNull
        public final OnboardingModel getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final String getOnboardingKey() {
            return this.onboardingKey;
        }

        public int hashCode() {
            return Integer.hashCode(this.backgroundPadding) + b.a(this.backgroundCornerRadius, b.a(this.badgeCornerRadius, g.a(this.onboarding.hashCode() * 31, 31, this.onboardingKey), 31), 31);
        }

        @NotNull
        public String toString() {
            OnboardingModel onboardingModel = this.onboarding;
            String str = this.onboardingKey;
            float f7 = this.badgeCornerRadius;
            float f11 = this.backgroundCornerRadius;
            int i11 = this.backgroundPadding;
            StringBuilder sb2 = new StringBuilder("BadgeOnboardingVO(onboarding=");
            sb2.append(onboardingModel);
            sb2.append(", onboardingKey=");
            sb2.append(str);
            sb2.append(", badgeCornerRadius=");
            sb2.append(f7);
            sb2.append(", backgroundCornerRadius=");
            sb2.append(f11);
            sb2.append(", backgroundPadding=");
            return K00.b.e(i11, ")", sb2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchResultsGridVO(Drawable drawable, String str, int i11, int i12, boolean z11, Long l11, long j11, @NotNull SearchResultsGalleryModel galleryModel, List<? extends Object> list, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, @NotNull List<? extends AtomDTO> contentElements, MultiButtonVO multiButtonVO, TextAtom textAtom, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Integer num, BadgeOnboardingVO badgeOnboardingVO) {
        Intrinsics.checkNotNullParameter(galleryModel, "galleryModel");
        Intrinsics.checkNotNullParameter(contentElements, "contentElements");
        this.backgroundImage = drawable;
        this.backgroundColor = str;
        this.footerLabelHeight = i11;
        this.multiButtonHeight = i12;
        this.isAdult = z11;
        this.checkboxSku = l11;
        this.id = j11;
        this.galleryModel = galleryModel;
        this.topRightButtons = list;
        this.leftBottomBadge = badgeDTO;
        this.secondLeftBottomBadge = badgeDTO2;
        this.contentElements = contentElements;
        this.buttonState = multiButtonVO;
        this.footerLabelAtom = textAtom;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.placeholderRow = num;
        this.badgeOnboarding = badgeOnboardingVO;
    }

    public static /* synthetic */ SearchResultsGridVO copy$default(SearchResultsGridVO searchResultsGridVO, Drawable drawable, String str, int i11, int i12, boolean z11, Long l11, long j11, SearchResultsGalleryModel searchResultsGalleryModel, List list, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, List list2, MultiButtonVO multiButtonVO, TextAtom textAtom, AtomActionDTO atomActionDTO, Map map, Integer num, BadgeOnboardingVO badgeOnboardingVO, int i13, Object obj) {
        BadgeOnboardingVO badgeOnboardingVO2;
        Integer num2;
        Drawable drawable2 = (i13 & 1) != 0 ? searchResultsGridVO.backgroundImage : drawable;
        String str2 = (i13 & 2) != 0 ? searchResultsGridVO.backgroundColor : str;
        int i14 = (i13 & 4) != 0 ? searchResultsGridVO.footerLabelHeight : i11;
        int i15 = (i13 & 8) != 0 ? searchResultsGridVO.multiButtonHeight : i12;
        boolean z12 = (i13 & 16) != 0 ? searchResultsGridVO.isAdult : z11;
        Long l12 = (i13 & 32) != 0 ? searchResultsGridVO.checkboxSku : l11;
        long j12 = (i13 & 64) != 0 ? searchResultsGridVO.id : j11;
        SearchResultsGalleryModel searchResultsGalleryModel2 = (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? searchResultsGridVO.galleryModel : searchResultsGalleryModel;
        List list3 = (i13 & 256) != 0 ? searchResultsGridVO.topRightButtons : list;
        BadgeDTO badgeDTO3 = (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? searchResultsGridVO.leftBottomBadge : badgeDTO;
        BadgeDTO badgeDTO4 = (i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? searchResultsGridVO.secondLeftBottomBadge : badgeDTO2;
        List list4 = (i13 & 2048) != 0 ? searchResultsGridVO.contentElements : list2;
        MultiButtonVO multiButtonVO2 = (i13 & 4096) != 0 ? searchResultsGridVO.buttonState : multiButtonVO;
        Drawable drawable3 = drawable2;
        TextAtom textAtom2 = (i13 & 8192) != 0 ? searchResultsGridVO.footerLabelAtom : textAtom;
        AtomActionDTO atomActionDTO2 = (i13 & 16384) != 0 ? searchResultsGridVO.action : atomActionDTO;
        Map map2 = (i13 & 32768) != 0 ? searchResultsGridVO.trackingInfo : map;
        Integer num3 = (i13 & 65536) != 0 ? searchResultsGridVO.placeholderRow : num;
        if ((i13 & 131072) != 0) {
            num2 = num3;
            badgeOnboardingVO2 = searchResultsGridVO.badgeOnboarding;
        } else {
            badgeOnboardingVO2 = badgeOnboardingVO;
            num2 = num3;
        }
        return searchResultsGridVO.copy(drawable3, str2, i14, i15, z12, l12, j12, searchResultsGalleryModel2, list3, badgeDTO3, badgeDTO4, list4, multiButtonVO2, textAtom2, atomActionDTO2, map2, num2, badgeOnboardingVO2);
    }

    @NotNull
    public final SearchResultsGridVO copy(Drawable backgroundImage, String backgroundColor, int footerLabelHeight, int multiButtonHeight, boolean isAdult, Long checkboxSku, long id2, @NotNull SearchResultsGalleryModel galleryModel, List<? extends Object> topRightButtons, BadgeDTO leftBottomBadge, BadgeDTO secondLeftBottomBadge, @NotNull List<? extends AtomDTO> contentElements, MultiButtonVO buttonState, TextAtom footerLabelAtom, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Integer placeholderRow, BadgeOnboardingVO badgeOnboarding) {
        Intrinsics.checkNotNullParameter(galleryModel, "galleryModel");
        Intrinsics.checkNotNullParameter(contentElements, "contentElements");
        return new SearchResultsGridVO(backgroundImage, backgroundColor, footerLabelHeight, multiButtonHeight, isAdult, checkboxSku, id2, galleryModel, topRightButtons, leftBottomBadge, secondLeftBottomBadge, contentElements, buttonState, footerLabelAtom, action, trackingInfo, placeholderRow, badgeOnboarding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultsGridVO)) {
            return false;
        }
        SearchResultsGridVO searchResultsGridVO = (SearchResultsGridVO) other;
        return Intrinsics.d(this.backgroundImage, searchResultsGridVO.backgroundImage) && Intrinsics.d(this.backgroundColor, searchResultsGridVO.backgroundColor) && this.footerLabelHeight == searchResultsGridVO.footerLabelHeight && this.multiButtonHeight == searchResultsGridVO.multiButtonHeight && this.isAdult == searchResultsGridVO.isAdult && Intrinsics.d(this.checkboxSku, searchResultsGridVO.checkboxSku) && this.id == searchResultsGridVO.id && Intrinsics.d(this.galleryModel, searchResultsGridVO.galleryModel) && Intrinsics.d(this.topRightButtons, searchResultsGridVO.topRightButtons) && Intrinsics.d(this.leftBottomBadge, searchResultsGridVO.leftBottomBadge) && Intrinsics.d(this.secondLeftBottomBadge, searchResultsGridVO.secondLeftBottomBadge) && Intrinsics.d(this.contentElements, searchResultsGridVO.contentElements) && Intrinsics.d(this.buttonState, searchResultsGridVO.buttonState) && Intrinsics.d(this.footerLabelAtom, searchResultsGridVO.footerLabelAtom) && Intrinsics.d(this.action, searchResultsGridVO.action) && Intrinsics.d(this.trackingInfo, searchResultsGridVO.trackingInfo) && Intrinsics.d(this.placeholderRow, searchResultsGridVO.placeholderRow) && Intrinsics.d(this.badgeOnboarding, searchResultsGridVO.badgeOnboarding);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Drawable getBackgroundImage() {
        return this.backgroundImage;
    }

    public final BadgeOnboardingVO getBadgeOnboarding() {
        return this.badgeOnboarding;
    }

    public final MultiButtonVO getButtonState() {
        return this.buttonState;
    }

    public final Long getCheckboxSku() {
        return this.checkboxSku;
    }

    @NotNull
    public final List<AtomDTO> getContentElements() {
        return this.contentElements;
    }

    public final TextAtom getFooterLabelAtom() {
        return this.footerLabelAtom;
    }

    public final int getFooterLabelHeight() {
        return this.footerLabelHeight;
    }

    @NotNull
    public final SearchResultsGalleryModel getGalleryModel() {
        return this.galleryModel;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final BadgeDTO getLeftBottomBadge() {
        return this.leftBottomBadge;
    }

    public final int getMultiButtonHeight() {
        return this.multiButtonHeight;
    }

    @Override // ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.combiner.PlaceholderRow
    public Integer getPlaceholderRow() {
        return this.placeholderRow;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final BadgeDTO getSecondLeftBottomBadge() {
        return this.secondLeftBottomBadge;
    }

    public final List<Object> getTopRightButtons() {
        return this.topRightButtons;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        Drawable drawable = this.backgroundImage;
        int hashCode = (drawable == null ? 0 : drawable.hashCode()) * 31;
        String str = this.backgroundColor;
        int a11 = C3532b.a(C2454a.a(this.multiButtonHeight, C2454a.a(this.footerLabelHeight, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.isAdult);
        Long l11 = this.checkboxSku;
        int hashCode2 = (this.galleryModel.hashCode() + Pk0.c.a((a11 + (l11 == null ? 0 : l11.hashCode())) * 31, 31, this.id)) * 31;
        List<Object> list = this.topRightButtons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BadgeDTO badgeDTO = this.leftBottomBadge;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.secondLeftBottomBadge;
        int b11 = g.b((hashCode4 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31, 31, this.contentElements);
        MultiButtonVO multiButtonVO = this.buttonState;
        int hashCode5 = (b11 + (multiButtonVO == null ? 0 : multiButtonVO.hashCode())) * 31;
        TextAtom textAtom = this.footerLabelAtom;
        int hashCode6 = (hashCode5 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.placeholderRow;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        BadgeOnboardingVO badgeOnboardingVO = this.badgeOnboarding;
        return hashCode9 + (badgeOnboardingVO != null ? badgeOnboardingVO.hashCode() : 0);
    }

    /* renamed from: isAdult, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    public final void setFooterLabelHeight(int i11) {
        this.footerLabelHeight = i11;
    }

    @NotNull
    public String toString() {
        Drawable drawable = this.backgroundImage;
        String str = this.backgroundColor;
        int i11 = this.footerLabelHeight;
        int i12 = this.multiButtonHeight;
        boolean z11 = this.isAdult;
        Long l11 = this.checkboxSku;
        long j11 = this.id;
        SearchResultsGalleryModel searchResultsGalleryModel = this.galleryModel;
        List<Object> list = this.topRightButtons;
        BadgeDTO badgeDTO = this.leftBottomBadge;
        BadgeDTO badgeDTO2 = this.secondLeftBottomBadge;
        List<AtomDTO> list2 = this.contentElements;
        MultiButtonVO multiButtonVO = this.buttonState;
        TextAtom textAtom = this.footerLabelAtom;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Integer num = this.placeholderRow;
        BadgeOnboardingVO badgeOnboardingVO = this.badgeOnboarding;
        StringBuilder sb2 = new StringBuilder("SearchResultsGridVO(backgroundImage=");
        sb2.append(drawable);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", footerLabelHeight=");
        a.f(i11, i12, ", multiButtonHeight=", ", isAdult=", sb2);
        sb2.append(z11);
        sb2.append(", checkboxSku=");
        sb2.append(l11);
        sb2.append(", id=");
        sb2.append(j11);
        sb2.append(", galleryModel=");
        sb2.append(searchResultsGalleryModel);
        sb2.append(", topRightButtons=");
        sb2.append(list);
        sb2.append(", leftBottomBadge=");
        sb2.append(badgeDTO);
        sb2.append(", secondLeftBottomBadge=");
        sb2.append(badgeDTO2);
        sb2.append(", contentElements=");
        sb2.append(list2);
        sb2.append(", buttonState=");
        sb2.append(multiButtonVO);
        sb2.append(", footerLabelAtom=");
        sb2.append(textAtom);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", placeholderRow=");
        sb2.append(num);
        sb2.append(", badgeOnboarding=");
        sb2.append(badgeOnboardingVO);
        sb2.append(")");
        return sb2.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SearchResultsGridVO(android.graphics.drawable.Drawable r23, java.lang.String r24, int r25, int r26, boolean r27, java.lang.Long r28, long r29, ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel r31, java.util.List r32, ru.ozon.uni.atoms.data.dsBadge.BadgeDTO r33, ru.ozon.uni.atoms.data.dsBadge.BadgeDTO r34, java.util.List r35, ru.ozon.app.android.search.producttilebuttons.MultiButtonVO r36, ru.ozon.uni.atoms.data.texts.TextAtom r37, ru.ozon.uni.atoms.data.AtomActionDTO r38, java.util.Map r39, java.lang.Integer r40, ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridVO.BadgeOnboardingVO r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r22 = this;
            r0 = r42
            r1 = r0 & 4
            if (r1 == 0) goto L9
            r1 = 0
            r5 = r1
            goto Lb
        L9:
            r5 = r25
        Lb:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            r2 = 0
            if (r1 == 0) goto L13
            r17 = r2
            goto L15
        L13:
            r17 = r37
        L15:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L3d
            r21 = r2
            r3 = r23
            r4 = r24
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r18 = r38
            r19 = r39
            r20 = r40
            r2 = r22
            goto L5f
        L3d:
            r21 = r41
            r2 = r22
            r3 = r23
            r4 = r24
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r18 = r38
            r19 = r39
            r20 = r40
        L5f:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridVO.<init>(android.graphics.drawable.Drawable, java.lang.String, int, int, boolean, java.lang.Long, long, ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel, java.util.List, ru.ozon.uni.atoms.data.dsBadge.BadgeDTO, ru.ozon.uni.atoms.data.dsBadge.BadgeDTO, java.util.List, ru.ozon.app.android.search.producttilebuttons.MultiButtonVO, ru.ozon.uni.atoms.data.texts.TextAtom, ru.ozon.uni.atoms.data.AtomActionDTO, java.util.Map, java.lang.Integer, ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridVO$BadgeOnboardingVO, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
