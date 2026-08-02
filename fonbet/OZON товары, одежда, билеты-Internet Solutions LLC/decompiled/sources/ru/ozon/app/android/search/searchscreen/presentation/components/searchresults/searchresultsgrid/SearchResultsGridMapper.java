package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.WindowManager;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.search.R$dimen;
import ru.ozon.app.android.search.producttilebuttons.MultiButtonVO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.TopRightButtonsUtilsKt;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.AtomComponentDTO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.MultiButtonDTO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.mapper.MultiButtonMapper;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.mapper.MultiButtonMapperArgs;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.mapper.SearchResultsGridGalleryModelMapper;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.TextMeasurer;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.image.SearchResultsGalleryModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model.MultiButtonModel;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonCheckBox;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonsChechBoxMapperKt;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridDTO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.SearchResultsGridVO;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.domain.onboarding.OnboardingFeature;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u0002*\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u0019*\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J)\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010+\u001a\u00020**\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J*\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u00103\u001a\u00020\u00022\n\u00105\u001a\u00060\u0003j\u0002`4H\u0096\u0002¢\u0006\u0004\b6\u00107J#\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u00103\u001a\u0002082\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010H\u001a\u0004\u0018\u00010G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010E¨\u0006P"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "Ll20/d;", "", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/TextMeasurer;", "textMeasurer", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/TextMeasurer;Lru/ozon/app/android/favorites/common/SelectedProductsManager;)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;", "", "placeholderRow", "", "isSoldOut", "toVo", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;Ljava/lang/Integer;Z)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO$BadgeOnboardingVO;", "getBadgeOnboarding", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO$BadgeOnboardingVO;", "Lru/ozon/uni/atoms/data/badge/Badge$StyleType;", "", "defineBadgeRadiusByTheme", "(Lru/ozon/uni/atoms/data/badge/Badge$StyleType;)F", "", "topRightButtons", "", "extractCheckboxSku", "(Ljava/util/List;)Ljava/lang/Long;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "footerLabelText", "footerLabelMaxLines", "styleResId", "calculateFooterLabelHeight", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;II)I", "fixFooterLabelAndMultiButtonHeight", "(Ljava/util/List;)Ljava/util/List;", "footerLabelTextHeight", "", "updateFooterLabelHeightForLastButton", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;I)V", "createFooterLabelWidthMeasureSpec", "(Landroid/content/Context;)I", "Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;", "multiButtonModel", "computeMultiButtonFooterLabel", "(Lru/ozon/app/android/search/producttilebuttons/MultiButtonVO;)I", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridVO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO;", "map", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO;Z)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/TextMeasurer;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/mapper/MultiButtonMapper;", "multiButtonMapper", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/mapper/MultiButtonMapper;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/mapper/SearchResultsGridGalleryModelMapper;", "galleryModelMapper", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/mapper/SearchResultsGridGalleryModelMapper;", "tilePadding", "I", "footerLabelWidthMeasureSpec", "Landroid/graphics/drawable/Drawable;", "cachedDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/ColorDrawable;", "placeholderDrawable", "Landroid/graphics/drawable/ColorDrawable;", "onboardingBackgroundCornerRadius", "F", "onboardingBackgroundPadding", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchResultsGridMapper implements Function2<SearchResultsGridVO, d, List<? extends SearchResultsGridVO>> {
    private final Drawable cachedDrawable;

    @NotNull
    private final Context context;
    private final int footerLabelWidthMeasureSpec;

    @NotNull
    private final SearchResultsGridGalleryModelMapper galleryModelMapper;

    @NotNull
    private final MultiButtonMapper multiButtonMapper;
    private final float onboardingBackgroundCornerRadius;
    private final int onboardingBackgroundPadding;

    @NotNull
    private final ColorDrawable placeholderDrawable;

    @NotNull
    private final SelectedProductsManager selectedProductsManager;

    @NotNull
    private final TextMeasurer textMeasurer;
    private final int tilePadding;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Badge.StyleType.values().length];
            try {
                iArr[Badge.StyleType.STYLE_TYPE_XSMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_DISCOUNT_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_PREMIUM_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_LARGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_PREMIUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_DISCOUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Badge.StyleType.STYLE_TYPE_INVALID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchResultsGridMapper(@NotNull Context context, @NotNull TextMeasurer textMeasurer, @NotNull SelectedProductsManager selectedProductsManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(selectedProductsManager, "selectedProductsManager");
        this.context = context;
        this.textMeasurer = textMeasurer;
        this.selectedProductsManager = selectedProductsManager;
        Drawable drawable = null;
        this.multiButtonMapper = new MultiButtonMapper(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        this.galleryModelMapper = new SearchResultsGridGalleryModelMapper();
        this.tilePadding = context.getResources().getDimensionPixelSize(R$dimen.search_tile_grid_padding);
        this.footerLabelWidthMeasureSpec = createFooterLabelWidthMeasureSpec(context);
        Drawable loadDrawableByName = ContextExtKt.loadDrawableByName(context, "ic_s_vzhuh");
        if (loadDrawableByName != null) {
            loadDrawableByName.setBounds(0, 0, loadDrawableByName.getIntrinsicWidth(), loadDrawableByName.getIntrinsicHeight());
            drawable = loadDrawableByName;
        }
        this.cachedDrawable = drawable;
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setBounds(0, 0, 0, ResourceExtKt.toPx(16));
        this.placeholderDrawable = colorDrawable;
        this.onboardingBackgroundCornerRadius = UiExtKt.toPxF(8);
        this.onboardingBackgroundPadding = ResourceExtKt.toPx(6);
    }

    private final int calculateFooterLabelHeight(OzonSpannableString footerLabelText, int footerLabelMaxLines, int styleResId) {
        return this.textMeasurer.measure(footerLabelText, styleResId, this.footerLabelWidthMeasureSpec, 0, footerLabelMaxLines).y;
    }

    private final int computeMultiButtonFooterLabel(MultiButtonVO multiButtonModel) {
        Pair pair;
        MultiButtonModel multiButtonModel2 = (MultiButtonModel) C7714v.Z(multiButtonModel.getTemplate().getButtons());
        AtomDTO text = multiButtonModel2 != null ? multiButtonModel2.getText() : null;
        TextAtomWithIcon textAtomWithIcon = text instanceof TextAtomWithIcon ? (TextAtomWithIcon) text : null;
        if (textAtomWithIcon == null) {
            return 0;
        }
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(textAtomWithIcon.getTextStyle());
        int intValue = parseTextStyle != null ? parseTextStyle.intValue() : R$style.TextStyle_Body_M;
        if (textAtomWithIcon.getIcon() == null) {
            pair = new Pair(this.placeholderDrawable, " ");
        } else {
            Object obj = this.cachedDrawable;
            if (obj == null) {
                obj = this.placeholderDrawable;
            }
            pair = new Pair(obj, "  ");
        }
        Drawable drawable = (Drawable) pair.a();
        String str = (String) pair.b();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) textAtomWithIcon.getText());
        spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 0);
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(spannableStringBuilder);
        Integer maxLines = textAtomWithIcon.getMaxLines();
        return calculateFooterLabelHeight(ozonSpannableString, maxLines != null ? maxLines.intValue() : Integer.MAX_VALUE, intValue);
    }

    private final int createFooterLabelWidthMeasureSpec(Context context) {
        Object systemService = context.getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getSize(new Point());
        int i11 = context.getResources().getConfiguration().orientation;
        return View.MeasureSpec.makeMeasureSpec(C6915b.c(((i11 != 1 ? i11 != 2 ? r1.x : r1.y : r1.x) / 2) - (this.tilePadding * 2)), 1073741824);
    }

    private final float defineBadgeRadiusByTheme(Badge.StyleType styleType) {
        switch (styleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[styleType.ordinal()]) {
            case 2:
            case 3:
            case 4:
                return 6.0f;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return 8.0f;
            default:
                return 5.0f;
        }
    }

    private final Long extractCheckboxSku(List<? extends Object> topRightButtons) {
        Object obj;
        if (topRightButtons != null) {
            Iterator<T> it = topRightButtons.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof TopRightButtonCheckBox) {
                    break;
                }
            }
            if (obj != null) {
                TopRightButtonCheckBox topRightButtonCheckBox = obj instanceof TopRightButtonCheckBox ? (TopRightButtonCheckBox) obj : null;
                if (topRightButtonCheckBox != null) {
                    return TopRightButtonsChechBoxMapperKt.extractSku(topRightButtonCheckBox);
                }
            }
        }
        return null;
    }

    private final List<SearchResultsGridVO> fixFooterLabelAndMultiButtonHeight(List<SearchResultsGridVO> list) {
        if (list == null) {
            return list;
        }
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        int i11 = 1;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SearchResultsGridVO searchResultsGridVO = (SearchResultsGridVO) it.next();
            SearchResultsGridVO searchResultsGridVO2 = (SearchResultsGridVO) next;
            if (i11 % 2 != 0) {
                int max = Math.max(searchResultsGridVO2.getFooterLabelHeight(), searchResultsGridVO.getFooterLabelHeight());
                searchResultsGridVO2.setFooterLabelHeight(max);
                searchResultsGridVO.setFooterLabelHeight(max);
                int max2 = Math.max(searchResultsGridVO2.getMultiButtonHeight(), searchResultsGridVO.getMultiButtonHeight());
                updateFooterLabelHeightForLastButton(searchResultsGridVO2, max2);
                updateFooterLabelHeightForLastButton(searchResultsGridVO, max2);
            }
            i11 = i12;
            next = searchResultsGridVO;
        }
        return list;
    }

    private final SearchResultsGridVO.BadgeOnboardingVO getBadgeOnboarding(SearchResultsGridDTO.GridItemDTO gridItemDTO) {
        if (gridItemDTO.getOnboarding() == null) {
            return null;
        }
        OnboardingModel badgeOnboarding = gridItemDTO.getOnboarding().getBadgeOnboarding();
        String key = OnboardingFeature.SRV_2_BADGE_ONBOARDING.key(gridItemDTO.getOnboarding().getBadgeOnboardingKey());
        Badge leftBottomBadge = gridItemDTO.getTileImage().getLeftBottomBadge();
        return new SearchResultsGridVO.BadgeOnboardingVO(badgeOnboarding, key, UiExtKt.toPxF(defineBadgeRadiusByTheme(leftBottomBadge != null ? leftBottomBadge.getTheme() : null)), this.onboardingBackgroundCornerRadius, this.onboardingBackgroundPadding);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107 A[LOOP:0: B:31:0x0101->B:33:0x0107, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final SearchResultsGridVO toVo(SearchResultsGridDTO.GridItemDTO gridItemDTO, Integer num, boolean z11) {
        MultiButtonVO multiButtonVO;
        int i11;
        Drawable drawable;
        List<Object> topRightButtons;
        List<Object> list;
        Iterator<T> it;
        int hashCode = gridItemDTO.getMainState().hashCode();
        MultiButtonDTO multiButton = gridItemDTO.getMultiButton();
        long hashCode2 = ("SearchResultsGrid_" + hashCode + "_" + (multiButton != null ? multiButton.hashCode() : 0)).hashCode();
        MultiButtonVO multiButtonVO2 = this.multiButtonMapper.toMultiButtonVO(gridItemDTO.getMultiButton(), new MultiButtonMapperArgs(hashCode2, gridItemDTO.isAdult(), true));
        if (multiButtonVO2 != null) {
            multiButtonVO = multiButtonVO2;
            i11 = computeMultiButtonFooterLabel(multiButtonVO2);
        } else {
            multiButtonVO = null;
            i11 = 0;
        }
        Long extractCheckboxSku = extractCheckboxSku(gridItemDTO.getTopRightButtons());
        boolean z12 = extractCheckboxSku != null && this.selectedProductsManager.isProductAdded(extractCheckboxSku.longValue());
        SearchResultsGalleryModel buildGalleryModel = this.galleryModelMapper.buildGalleryModel(hashCode2, gridItemDTO, z11, gridItemDTO.isAdult(), gridItemDTO.isAdult(), this.galleryModelMapper.buildAdultImageModel(hashCode2, gridItemDTO, z11, gridItemDTO.isAdult()));
        String backgroundImage = gridItemDTO.getBackgroundImage();
        if (backgroundImage != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = backgroundImage.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase != null) {
                drawable = ContextExtKt.loadDrawableByName(this.context, lowerCase);
                String backgroundColor = gridItemDTO.getBackgroundColor();
                topRightButtons = gridItemDTO.getTopRightButtons();
                if (topRightButtons == null) {
                    Boolean compactFavoriteIcon = gridItemDTO.getCompactFavoriteIcon();
                    list = TopRightButtonsUtilsKt.modifyTopRightButtons(topRightButtons, z12, compactFavoriteIcon != null ? compactFavoriteIcon.booleanValue() : false);
                } else {
                    list = null;
                }
                boolean isAdult = gridItemDTO.isAdult();
                Badge leftBottomBadge = gridItemDTO.getTileImage().getLeftBottomBadge();
                BadgeDTO mapToDsBadge = leftBottomBadge == null ? BadgeMapperKt.mapToDsBadge(leftBottomBadge) : null;
                Badge secondLeftBottomBadge = gridItemDTO.getTileImage().getSecondLeftBottomBadge();
                BadgeDTO mapToDsBadge2 = secondLeftBottomBadge != null ? BadgeMapperKt.mapToDsBadge(secondLeftBottomBadge) : null;
                List<AtomComponentDTO> mainState = gridItemDTO.getMainState();
                ArrayList arrayList = new ArrayList(C7714v.z(mainState, 10));
                it = mainState.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AtomComponentDTO) it.next()).getAtom());
                }
                return new SearchResultsGridVO(drawable, backgroundColor, 0, i11, isAdult, extractCheckboxSku, hashCode2, buildGalleryModel, list, mapToDsBadge, mapToDsBadge2, arrayList, multiButtonVO, null, gridItemDTO.getAction(), gridItemDTO.getTrackingInfo(), num, getBadgeOnboarding(gridItemDTO), 8196, null);
            }
        }
        drawable = null;
        String backgroundColor2 = gridItemDTO.getBackgroundColor();
        topRightButtons = gridItemDTO.getTopRightButtons();
        if (topRightButtons == null) {
        }
        boolean isAdult2 = gridItemDTO.isAdult();
        Badge leftBottomBadge2 = gridItemDTO.getTileImage().getLeftBottomBadge();
        if (leftBottomBadge2 == null) {
        }
        Badge secondLeftBottomBadge2 = gridItemDTO.getTileImage().getSecondLeftBottomBadge();
        BadgeDTO mapToDsBadge22 = secondLeftBottomBadge2 != null ? BadgeMapperKt.mapToDsBadge(secondLeftBottomBadge2) : null;
        List<AtomComponentDTO> mainState2 = gridItemDTO.getMainState();
        ArrayList arrayList2 = new ArrayList(C7714v.z(mainState2, 10));
        it = mainState2.iterator();
        while (it.hasNext()) {
        }
        return new SearchResultsGridVO(drawable, backgroundColor2, 0, i11, isAdult2, extractCheckboxSku, hashCode2, buildGalleryModel, list, mapToDsBadge, mapToDsBadge22, arrayList2, multiButtonVO, null, gridItemDTO.getAction(), gridItemDTO.getTrackingInfo(), num, getBadgeOnboarding(gridItemDTO), 8196, null);
    }

    private final void updateFooterLabelHeightForLastButton(SearchResultsGridVO searchResultsGridVO, int i11) {
        MultiButtonModel multiButtonModel;
        if (searchResultsGridVO == null) {
            searchResultsGridVO = null;
        }
        MultiButtonVO buttonState = searchResultsGridVO != null ? searchResultsGridVO.getButtonState() : null;
        MultiButtonVO multiButtonVO = buttonState != null ? buttonState : null;
        if (multiButtonVO == null || (multiButtonModel = (MultiButtonModel) C7714v.Z(multiButtonVO.getTemplate().getButtons())) == null) {
            return;
        }
        multiButtonModel.setFooterLabelTextHeight(Integer.valueOf(i11));
    }

    @NotNull
    public final List<SearchResultsGridVO> map(@NotNull SearchResultsGridDTO state, boolean isSoldOut) {
        Intrinsics.checkNotNullParameter(state, "state");
        List<SearchResultsGridDTO.GridItemDTO> items = state.getItems();
        List<SearchResultsGridVO> list = null;
        if (items != null) {
            List<SearchResultsGridDTO.GridItemDTO> list2 = items;
            ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList.add(toVo((SearchResultsGridDTO.GridItemDTO) obj, state.getPlaceholderRow(), isSoldOut));
                i11 = i12;
            }
            list = fixFooterLabelAndMultiButtonHeight(arrayList);
        }
        return list == null ? K.f71697a : list;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SearchResultsGridVO> invoke(@NotNull SearchResultsGridVO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(state);
    }
}
