package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.presentation;

import Sc.InterfaceC4008j;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.services.databinding.WidgetInfoPopupBinding;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.presentation.InfoPopupVO;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellsView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/services/databinding/WidgetInfoPopupBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/services/databinding/WidgetInfoPopupBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "bgCornerRadius", "F", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAdapter", "Landroid/graphics/drawable/ShapeDrawable;", "imageBackground$delegate", "LSc/j;", "getImageBackground", "()Landroid/graphics/drawable/ShapeDrawable;", "imageBackground", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupWidgetViewHolder extends k<InfoPopupVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final float bgCornerRadius;

    @NotNull
    private final WidgetInfoPopupBinding binding;

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final AtomsAdapter cellsAdapter;

    /* renamed from: imageBackground$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j imageBackground;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoPopupWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetInfoPopupBinding bind = WidgetInfoPopupBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        this.bgCornerRadius = ResourceExtKt.toPxF(16, getContext());
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.cellsAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonsAdapter = atomsAdapter2;
        this.imageBackground = Sc.k.b(new InfoPopupWidgetViewHolder$imageBackground$2(this));
        atomsAdapter.setOnAction(buildHandler);
        atomsAdapter2.setOnAction(buildHandler);
        bind.infoPopupCellsVAL.setAdapter(atomsAdapter);
        VerticalAtomsLayout verticalAtomsLayout = bind.infoPopupButtonsVAL;
        verticalAtomsLayout.setAdapter(atomsAdapter2);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new InfoPopupButtonsDecoration(context));
    }

    private final ShapeDrawable getImageBackground() {
        return (ShapeDrawable) this.imageBackground.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InfoPopupVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AppCompatImageView infoPopupImageIV = this.binding.infoPopupImageIV;
        Intrinsics.checkNotNullExpressionValue(infoPopupImageIV, "infoPopupImageIV");
        InfoPopupVO.InfoPopupImageVO image = item.getImage();
        ImageViewExtKt.loadImageOrGone(infoPopupImageIV, image != null ? image.getSrc() : null);
        if (item.getIsImageGone()) {
            View infoPopupBackgroundView = this.binding.infoPopupBackgroundView;
            Intrinsics.checkNotNullExpressionValue(infoPopupBackgroundView, "infoPopupBackgroundView");
            ViewExtKt.gone(infoPopupBackgroundView);
        } else {
            View infoPopupBackgroundView2 = this.binding.infoPopupBackgroundView;
            Intrinsics.checkNotNullExpressionValue(infoPopupBackgroundView2, "infoPopupBackgroundView");
            infoPopupBackgroundView2.setVisibility(item.getIsBgInvisible() ? 4 : 0);
            View view = this.binding.infoPopupBackgroundView;
            ShapeDrawable imageBackground = getImageBackground();
            Paint paint = imageBackground.getPaint();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            InfoPopupVO.InfoPopupImageVO image2 = item.getImage();
            paint.setColor(styleParser.parseColor(context, image2 != null ? image2.getBackgroundColor() : null, R$color.transparent));
            view.setBackground(imageBackground);
        }
        TextInfoCellsView.bind$default(this.binding.infoPopupInfoCellListTICV, item.getTextInfoCells(), null, 2, null);
        VerticalAtomsLayout infoPopupCellsVAL = this.binding.infoPopupCellsVAL;
        Intrinsics.checkNotNullExpressionValue(infoPopupCellsVAL, "infoPopupCellsVAL");
        infoPopupCellsVAL.setVisibility(item.getIsCellsVisible() ? 0 : 8);
        this.cellsAdapter.bind(getContext(), item.getCells());
        this.buttonsAdapter.bind(getContext(), item.getButtons());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull InfoPopupVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((InfoPopupWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
