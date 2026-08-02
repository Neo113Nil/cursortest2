package ru.ozon.app.android.storefront.widgets.feedback.npsRating.core;

import java.text.ParseException;
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
import ru.ozon.app.android.storefront.widgets.feedback.common.presentation.FeedbackNavbarVO;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.data.NpsRatingDTO;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.NpsRatingVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u000eB\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/core/NpsRatingMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/feedback/npsRating/presentation/NpsRatingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/feedback/npsRating/data/NpsRatingDTO;Ll20/d;)Ljava/util/List;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NpsRatingMapper implements Function2<NpsRatingDTO, d, List<? extends NpsRatingVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/npsRating/core/NpsRatingMapper$Companion;", "", "<init>", "()V", "SELECTOR_IMAGES_URL_SIZE", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NpsRatingVO> invoke(@NotNull NpsRatingDTO state, @NotNull d widgetInfo) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (state.getBody().getSelector().getImagesUrl().size() != 11) {
            throw new ParseException("Size of body.selector.imagesUrl must be 11", -1);
        }
        long hashCode = widgetInfo.d().hashCode();
        ButtonV3Atom.SmallIconButton backButton = state.getNavbar().getBackButton();
        TextAtom title = state.getNavbar().getTitle();
        Integer maxLines = state.getNavbar().getTitle().getMaxLines();
        TextAtom copy$default = TextAtom.copy$default(title, null, null, null, Integer.valueOf(maxLines != null ? maxLines.intValue() : 1), null, null, null, 119, null);
        ButtonV3Atom.SmallIconButton closeButton = state.getNavbar().getCloseButton();
        ButtonV3Atom.SmallIconButton backButton2 = state.getNavbar().getBackButton();
        FeedbackNavbarVO feedbackNavbarVO = new FeedbackNavbarVO(hashCode, backButton, copy$default, closeButton, (backButton2 == null || (action = backButton2.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()));
        TextAtom leftDescription = state.getBody().getSelector().getLeftDescription();
        Integer maxLines2 = state.getBody().getSelector().getLeftDescription().getMaxLines();
        TextAtom copy$default2 = TextAtom.copy$default(leftDescription, null, null, null, Integer.valueOf(maxLines2 != null ? maxLines2.intValue() : 1), null, null, null, 119, null);
        TextAtom rightDescription = state.getBody().getSelector().getRightDescription();
        Integer maxLines3 = state.getBody().getSelector().getRightDescription().getMaxLines();
        NpsRatingVO.Body body = new NpsRatingVO.Body(state.getBody().getTitle(), state.getBody().getSubtitle(), new NpsRatingVO.Selector(copy$default2, TextAtom.copy$default(rightDescription, null, null, null, Integer.valueOf(maxLines3 != null ? maxLines3.intValue() : 1), null, null, null, 119, null), state.getBody().getSelector().getSelectionColor(), state.getBody().getSelector().getDefaultIconUrl(), state.getBody().getSelector().getImagesUrl()));
        ButtonV3Atom.LargeButton nextPageButton = state.getNextPageButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new NpsRatingVO(hashCode, feedbackNavbarVO, body, nextPageButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
