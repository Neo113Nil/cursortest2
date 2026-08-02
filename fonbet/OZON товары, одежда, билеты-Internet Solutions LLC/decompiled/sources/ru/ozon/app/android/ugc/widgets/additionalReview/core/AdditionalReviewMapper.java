package ru.ozon.app.android.ugc.widgets.additionalReview.core;

import WZ.t;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.widgets.additionalReview.data.AdditionalReviewDTO;
import ru.ozon.app.android.ugc.widgets.additionalReview.presentation.AdditionalReviewVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/core/AdditionalReviewMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/AdditionalReviewVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/additionalReview/data/AdditionalReviewDTO;Ll20/d;)Ljava/util/List;", "", "isLargeScreen", "Z", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdditionalReviewMapper implements Function2<AdditionalReviewDTO, d, List<? extends AdditionalReviewVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean isLargeScreen;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/core/AdditionalReviewMapper$Companion;", "", "<init>", "()V", "DISPLAY_HEIGHT_720", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdditionalReviewMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isLargeScreen = context.getResources().getDisplayMetrics().heightPixels > 720;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdditionalReviewVO> invoke(@NotNull AdditionalReviewDTO state, @NotNull d widgetInfo) {
        ImageDTO copy;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        AdditionalReviewDTO.Bonus bonus = state.getBonus();
        AdditionalReviewVO.Bonus bonus2 = bonus != null ? new AdditionalReviewVO.Bonus(bonus.getIcon(), bonus.getTitle(), bonus.getTitleColor(), bonus.getBackgroundColor(), bonus.getTitleColor()) : null;
        long id2 = state.getProduct().getId();
        TextDTO dsTextAtom$default = this.isLargeScreen ? TextMapperKt.dsTextAtom$default(state.getProduct().getName(), null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, false, 4093, null) : TextMapperKt.getDsTextAtom(state.getProduct().getName());
        copy = r11.copy((r34 & 1) != 0 ? r11.image : null, (r34 & 2) != 0 ? r11.backgroundColor : null, (r34 & 4) != 0 ? r11.aspectRatio : null, (r34 & 8) != 0 ? r11.hasParanja : false, (r34 & 16) != 0 ? r11.layoutPaddingLeft : null, (r34 & 32) != 0 ? r11.layoutPaddingRight : null, (r34 & 64) != 0 ? r11.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r11.layoutPaddingBottom : null, (r34 & 256) != 0 ? r11.cornerRadius : this.isLargeScreen ? CornerRadius.RADIUS_500 : CornerRadius.RADIUS_300, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r11.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r11.testInfo : null, (r34 & 2048) != 0 ? r11.trackingInfo : null, (r34 & 4096) != 0 ? r11.imageWidth : null, (r34 & 8192) != 0 ? r11.imageType : null, (r34 & 16384) != 0 ? r11.fitType : null, (r34 & 32768) != 0 ? state.getProduct().getImageAtom().customRatio : null);
        AtomActionDTO action = state.getProduct().getAction();
        AdditionalReviewVO.Product product = new AdditionalReviewVO.Product(id2, dsTextAtom$default, copy, action != null ? AtomActionMapperKt.toAtomAction(action, state.getProduct().getTracking()) : null);
        AdditionalReviewVO.Rating rating = new AdditionalReviewVO.Rating(TextMapperKt.dsTextAtom$default(state.getRating().getText(), null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, false, 4093, null), state.getRating().getStars());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        ru.ozon.uni.atoms.data.common.CornerRadius cornerRadius = state.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = ru.ozon.uni.atoms.data.common.CornerRadius.RADIUS_500;
        }
        return C7714v.a0(new AdditionalReviewVO(hashCode, bonus2, product, rating, tokenizedEvent$default, cornerRadius));
    }
}
