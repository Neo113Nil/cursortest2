package ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.data;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.imageprefetch.PrefetchUtilsKt;
import ru.ozon.app.android.composer.imageprefetch.PrefetchableImage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerComposeVI;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerDTO;", "Landroid/content/Context;", "context", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/composer/imageprefetch/PrefetchableImage;", "imagePrefetcher", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/presentation/InsuranceUpgradeBannerComposeVI;", "asVI", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerDTO;Landroid/content/Context;Ll20/d;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/presentation/InsuranceUpgradeBannerComposeVI;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InsuranceUpgradeBannerMapperKt {
    @NotNull
    public static final InsuranceUpgradeBannerComposeVI asVI(@NotNull InsuranceUpgradeBannerDTO insuranceUpgradeBannerDTO, @NotNull Context context, @NotNull d widgetInfo, @NotNull ImagePrefetcher<PrefetchableImage> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(insuranceUpgradeBannerDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        PrefetchUtilsKt.prefetchImage(context, new PrefetchableImage(ResourceExtKt.toPx(114, context), ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN, context), insuranceUpgradeBannerDTO.getImageLink()), imagePrefetcher);
        long hashCode = widgetInfo.d().hashCode();
        OzonSpannableString text = insuranceUpgradeBannerDTO.getTitle().getText();
        String textColor = insuranceUpgradeBannerDTO.getTitle().getTextColor();
        Integer maxLines = insuranceUpgradeBannerDTO.getTitle().getMaxLines();
        int intValue = maxLines != null ? maxLines.intValue() : 2;
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        UniTheme uniTheme = UniTheme.INSTANCE;
        TextDTO textDTO = new TextDTO(text, null, null, null, null, null, textPreset, uniTheme.getTypographyTokens().getHeadline400Small().getId(), textColor, null, null, null, null, false, null, null, null, null, Integer.valueOf(intValue), 261694, null);
        OzonSpannableString text2 = insuranceUpgradeBannerDTO.getDescription().getText();
        String textColor2 = insuranceUpgradeBannerDTO.getDescription().getTextColor();
        String id2 = uniTheme.getTypographyTokens().getBody300XSmall().getId();
        Integer maxLines2 = insuranceUpgradeBannerDTO.getDescription().getMaxLines();
        TextDTO textDTO2 = new TextDTO(text2, null, null, null, null, null, textPreset, id2, textColor2, null, null, null, null, false, null, null, null, null, Integer.valueOf(maxLines2 != null ? maxLines2.intValue() : 3), 261694, null);
        String obj = insuranceUpgradeBannerDTO.getSelectButton().getText().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
        return new InsuranceUpgradeBannerComposeVI(hashCode, textDTO, textDTO2, new ButtonV3DTO(ButtonV3DTO.StyleTypes.CUSTOM, ButtonV3DTO.Sizes.SIZE_400, obj, null, null, null, null, uniTheme.getColorTokens().getTextAction().getId(), null, null, null, null, uniTheme.getColorTokens().getBgLightKey().getId(), new CommonControlSettings(insuranceUpgradeBannerDTO.getSelectButton().getAction(), null, null, 6, null), null, null, null, null, 249720, null), StyleParser.INSTANCE.parseColor(context, insuranceUpgradeBannerDTO.getBackgroundColor(), R$color.oz_semantic_accent_primary), new ImageDTO(insuranceUpgradeBannerDTO.getImageLink(), null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null));
    }
}
