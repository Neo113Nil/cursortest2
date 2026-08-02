package ru.ozon.app.android.marketing.widgets.couponPromo.core;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.data.markdown.TextParser;
import ru.ozon.app.android.data.markdown.TextParserProvider;
import ru.ozon.app.android.marketing.widgets.couponPromo.data.CouponPromoDTO;
import ru.ozon.app.android.marketing.widgets.couponPromo.presentation.CouponPromoVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/couponPromo/presentation/CouponPromoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/data/markdown/TextParserProvider;", "textParserProvider", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/data/markdown/TextParserProvider;)V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/couponPromo/data/CouponPromoDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/data/markdown/TextParserProvider;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CouponPromoMapper implements Function2<CouponPromoDTO, d, List<? extends CouponPromoVO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final TextParserProvider textParserProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/couponPromo/core/CouponPromoMapper$Companion;", "", "<init>", "()V", "PROMOCODE_REPLACE", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CouponPromoMapper(@NotNull Context context, @NotNull TextParserProvider textParserProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textParserProvider, "textParserProvider");
        this.context = context;
        this.textParserProvider = textParserProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CouponPromoVO> invoke(@NotNull CouponPromoDTO dto, @NotNull d widgetInfo) {
        CharSequence text;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CouponPromoVO.PromoCodeVO promoCodeVO = new CouponPromoVO.PromoCodeVO(dto.getActivated(), dto.getPromoCode());
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(this.context, dto.getBackgroundColor());
        Integer parseColor2 = styleParser.parseColor(this.context, dto.getTextColor());
        CouponPromoDTO.ShareDataDTO shareData = dto.getShareData();
        CouponPromoVO.BaseStateVO.SharedDataVO sharedDataVO = shareData != null ? new CouponPromoVO.BaseStateVO.SharedDataVO(h.X(shareData.getText(), "#PROMOCODE#", dto.getPromoCode(), false)) : null;
        CouponPromoDTO.ActivateActionDTO activateAction = dto.getActivateAction();
        CouponPromoVO.BaseStateVO.ActivateActionVO activateActionVO = activateAction != null ? new CouponPromoVO.BaseStateVO.ActivateActionVO(activateAction.getInactiveStateTitle(), activateAction.getActiveStateTitle(), activateAction.getDeeplink()) : null;
        CouponPromoDTO.ShowStepsActionDTO showStepsAction = dto.getShowStepsAction();
        CouponPromoVO.BaseStateVO baseStateVO = new CouponPromoVO.BaseStateVO(dto.getTitle(), dto.getSubtitle(), parseColor2, parseColor, sharedDataVO, activateActionVO, showStepsAction != null ? new CouponPromoVO.BaseStateVO.ShowStepsActionVO(showStepsAction.getTitle()) : null);
        String textColor = dto.getStepsText().getTextColor();
        Integer parseColor3 = textColor != null ? styleParser.parseColor(this.context, textColor) : null;
        TextParser provideParser = this.textParserProvider.provideParser(dto.getStepsText().getTextType());
        if (provideParser == null || (text = provideParser.parse(dto.getStepsText().getText())) == null) {
            text = dto.getStepsText().getText();
        }
        CouponPromoVO.StepsStateVO.StepsTextVO stepsTextVO = new CouponPromoVO.StepsStateVO.StepsTextVO(parseColor3, OzonSpannableStringKt.toOzonSpannableString(text));
        CouponPromoDTO.StepsActionDTO stepsAction = dto.getStepsAction();
        CouponPromoVO.StepsStateVO stepsStateVO = new CouponPromoVO.StepsStateVO(stepsTextVO, stepsAction != null ? new CouponPromoVO.StepsStateVO.StepsActionVO(stepsAction.getInactiveStateTitle(), stepsAction.getActiveStateTitle(), stepsAction.getDeeplink()) : null);
        long hashCode = dto.hashCode();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new CouponPromoVO(hashCode, promoCodeVO, baseStateVO, stepsStateVO, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
