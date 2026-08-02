package ru.ozon.app.android.pdp.widgets.sellerPoints.core;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.sellerPoints.data.SellerPointsDTO;
import ru.ozon.app.android.pdp.widgets.sellerPoints.presentation.SellerPointsVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerPoints/core/SellerPointsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/sellerPoints/data/SellerPointsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pdp/widgets/sellerPoints/data/SellerPointsDTO$Block;", "", "isEmpty", "(Lru/ozon/app/android/pdp/widgets/sellerPoints/data/SellerPointsDTO$Block;)Z", "", "widgetId", "toVo", "(Lru/ozon/app/android/pdp/widgets/sellerPoints/data/SellerPointsDTO;J)Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO;", "Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;", "toVoBlock", "(Lru/ozon/app/android/pdp/widgets/sellerPoints/data/SellerPointsDTO$Block;)Lru/ozon/app/android/pdp/widgets/sellerPoints/presentation/SellerPointsVO$Block;", "isSmallScreen", "", "getTitleTextStyle", "(Z)Ljava/lang/String;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/sellerPoints/data/SellerPointsDTO;Ll20/d;)Ljava/util/List;", "Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerPointsMapper implements Function2<SellerPointsDTO, d, List<? extends SellerPointsVO>> {
    private final boolean isSmallScreen;

    public SellerPointsMapper(@NotNull Context context) {
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = ContextExtKt.getAppUsableScreenSize(context).x;
        i11 = SellerPointsMapperKt.BIG_SCREEN_THRESHOLD_PX;
        this.isSmallScreen = i12 < i11;
    }

    private final String getTitleTextStyle(boolean isSmallScreen) {
        return isSmallScreen ? StyleParser.TextStyle.HEAD_XL.getStyleName() : StyleParser.TextStyle.HEAD_XXL.getStyleName();
    }

    private final boolean isEmpty(SellerPointsDTO.Block block) {
        return h.K(block.getTitle().getText()) && h.K(block.getSubtitle().getText());
    }

    private final SellerPointsVO toVo(SellerPointsDTO sellerPointsDTO, long j11) {
        SellerPointsVO.Block voBlock = toVoBlock(sellerPointsDTO.getFirstBlock());
        SellerPointsDTO.Block secondBlock = sellerPointsDTO.getSecondBlock();
        SellerPointsVO.Block voBlock2 = secondBlock != null ? toVoBlock(secondBlock) : null;
        String backgroundColor = sellerPointsDTO.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        String str = backgroundColor;
        SellerPointsVO.Size size = this.isSmallScreen ? SellerPointsVO.Size.SMALL : SellerPointsVO.Size.REGULAR;
        Map<String, TokenizedTrackingInfo> trackingInfo = sellerPointsDTO.getTrackingInfo();
        return new SellerPointsVO(j11, voBlock, voBlock2, str, size, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final SellerPointsVO.Block toVoBlock(SellerPointsDTO.Block block) {
        TextAtom title = block.getTitle();
        TextAtom textAtom = !h.K(title.getText()) ? title : null;
        TextDTO dsTextAtom$default = textAtom != null ? TextMapperKt.dsTextAtom$default(textAtom, null, null, null, null, null, null, null, getTitleTextStyle(this.isSmallScreen), null, 1, null, false, 3455, null) : null;
        TextAtom subtitle = block.getSubtitle();
        TextAtom textAtom2 = !h.K(subtitle.getText()) ? subtitle : null;
        TextDTO dsTextAtom$default2 = textAtom2 != null ? TextMapperKt.dsTextAtom$default(textAtom2, null, null, null, null, null, null, null, null, null, 1, null, false, 3583, null) : null;
        String backgroundColor = block.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.BG_SECONDARY.getToken();
        }
        return new SellerPointsVO.Block(dsTextAtom$default, dsTextAtom$default2, backgroundColor);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SellerPointsVO> invoke(@NotNull SellerPointsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        SellerPointsDTO.Block firstBlock = state.getFirstBlock();
        SellerPointsDTO.Block block = !isEmpty(firstBlock) ? firstBlock : null;
        if (block == null) {
            return K.f71697a;
        }
        SellerPointsDTO.Block secondBlock = state.getSecondBlock();
        return C7714v.a0(toVo(SellerPointsDTO.copy$default(state, block, (secondBlock == null || isEmpty(secondBlock)) ? null : secondBlock, null, null, 12, null), widgetInfo.d().hashCode()));
    }
}
