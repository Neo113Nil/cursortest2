package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.color;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2VO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJE\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2 \u0010\u0011\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e0\r¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/color/VariantsMapper;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;", "dto", "Lru/ozon/uni/atoms/data/text/TextDTO;", "buildSingleVariantTitle", "(Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;)Lru/ozon/uni/atoms/data/text/TextDTO;", "Ll20/d;", "info", "Lkotlin/Function1;", "", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "mapToVo", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2VO;", "map", "(Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$AspectV2;Ll20/d;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "titleVisibleAcceptedTypes", "Ljava/util/List;", "", "variantTextColor", "I", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VariantsMapper {

    @NotNull
    private final List<String> titleVisibleAcceptedTypes;
    private final int variantTextColor;

    public VariantsMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.titleVisibleAcceptedTypes = C7714v.b0("COLOR", "IMAGE", "TILES", "IMAGE_WITH_TITLE");
        this.variantTextColor = StyleParser.INSTANCE.parseColor(context, UniColors.TEXT_SECONDARY.getToken(), R$color.text_secondary);
    }

    private final TextDTO buildSingleVariantTitle(AspectsV2DTO.AspectV2 dto) {
        if (dto.getTitle() == null && dto.getSubtitle() == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.variantTextColor);
        int length = spannableStringBuilder.length();
        String title = dto.getTitle();
        spannableStringBuilder.append((CharSequence) (title != null ? title : ""));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        String subtitle = dto.getSubtitle();
        if (subtitle != null) {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) subtitle);
        }
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(new SpannedString(spannableStringBuilder));
        TextPreset textPreset = TextPreset.PRESET_CUSTOM;
        String token = UniTextStyles.COMPACT_400_SMALL.getToken();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_500;
        return new TextDTO(ozonSpannableString, null, layoutPadding, layoutPadding, null, null, textPreset, token, UniColors.TEXT_PRIMARY.getToken(), null, null, null, null, true, null, null, null, null, null, 515634, null);
    }

    @NotNull
    public final List<AspectsCompactV2VO> map(@NotNull AspectsV2DTO.AspectV2 dto, @NotNull d info, @NotNull Function1<? super List<AspectsV2DTO.VariantV2>, ? extends List<? extends AspectsCompactVO$Variant>> mapToVo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(mapToVo, "mapToVo");
        long hashCode = info.d().hashCode();
        TextDTO titleAtom = dto.getTitleAtom();
        if (titleAtom == null) {
            titleAtom = buildSingleVariantTitle(dto);
        }
        TextDTO textDTO = titleAtom;
        boolean z11 = dto.getTitleAtom() == null;
        ButtonV3Atom.SmallBorderlessButtonWithIcon additionalButton = dto.getAdditionalButton();
        ButtonV3Atom.LargeBorderlessButton moreVariantsButton = dto.getMoreVariantsButton();
        List<? extends AspectsCompactVO$Variant> invoke = mapToVo.invoke(dto.getVariants());
        String type = dto.getType();
        ButtonV3DTO additionalButtonAtom = dto.getAdditionalButtonAtom();
        Boolean shouldRefreshToTop = dto.getShouldRefreshToTop();
        return C7714v.a0(new AspectsCompactV2VO(hashCode, null, textDTO, z11, invoke, moreVariantsButton, additionalButton, type, additionalButtonAtom, shouldRefreshToTop != null ? shouldRefreshToTop.booleanValue() : false, 2, null));
    }
}
