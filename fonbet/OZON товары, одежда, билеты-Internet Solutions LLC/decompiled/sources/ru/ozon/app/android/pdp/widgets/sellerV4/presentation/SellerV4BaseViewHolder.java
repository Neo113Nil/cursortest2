package ru.ozon.app.android.pdp.widgets.sellerV4.presentation;

import W10.c;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.disclosure.disclosureIconTitleSubtitleCell.DisclosureIconTitleSubtitleCellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.cell.disclosureCell.DisclosureIconTitleSubtitleCellHolderKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00010B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00100$8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4BaseViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4VO;", "", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "sellerDisclosureView", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "automatizationId", "", "setLocators", "(Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;Ljava/lang/String;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4VO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "(Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerV4VO;)V", "Lru/ozon/uni/android/cell/disclosure/disclosureIconTitleSubtitleCell/DisclosureIconTitleSubtitleCellView;", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerCellVO;", "previewSellerCellVO", "Lru/ozon/app/android/pdp/widgets/sellerV4/presentation/SellerCellVO;", "Landroid/graphics/drawable/PaintDrawable;", "cellDrawable", "Landroid/graphics/drawable/PaintDrawable;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SellerV4BaseViewHolder extends k<SellerV4VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final PaintDrawable cellDrawable;

    @NotNull
    private final View containerView;
    private SellerCellVO previewSellerCellVO;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final DisclosureIconTitleSubtitleCellView sellerDisclosureView;
    public static final int $stable = 8;

    public /* synthetic */ SellerV4BaseViewHolder(DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView, View view, ComposerReferences composerReferences, HandlersInhibitor handlersInhibitor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(disclosureIconTitleSubtitleCellView, (i11 & 2) != 0 ? disclosureIconTitleSubtitleCellView : view, composerReferences, handlersInhibitor);
    }

    private final void setLocators(DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView, String str) {
        disclosureIconTitleSubtitleCellView.setContentDescription(str);
        disclosureIconTitleSubtitleCellView.getMainView().getMainView().getAddonView().setContentDescription("SmartLabel.label");
        disclosureIconTitleSubtitleCellView.getMainView().getAddonView().setContentDescription("Icon.backgroundImageView");
    }

    @NotNull
    protected final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerV4BaseViewHolder(@NotNull DisclosureIconTitleSubtitleCellView sellerDisclosureView, @NotNull View containerView, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor inhibitor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(sellerDisclosureView, "sellerDisclosureView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.sellerDisclosureView = sellerDisclosureView;
        this.containerView = containerView;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).buildHandler();
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setCornerRadius(Dimens.INSTANCE.getDPF_16());
        this.cellDrawable = paintDrawable;
        sellerDisclosureView.setBackground(paintDrawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public final void bind(@NotNull SellerV4VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bind(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SellerV4VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.refs.getTokenizedAnalytics(), item.getTokenizedEvent());
    }

    public void bind(@NotNull SellerV4VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.d(item.getSellerCellVO(), this.previewSellerCellVO)) {
            return;
        }
        this.previewSellerCellVO = item.getSellerCellVO();
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getSellerCellVO().getBackgroundColor());
        if (parseColor != null) {
            this.cellDrawable.getPaint().setColor(parseColor.intValue());
        }
        DisclosureIconTitleSubtitleCellHolderKt.bind(this.sellerDisclosureView, item.getSellerCellVO().getCell(), this.actionHandler);
        DisclosureIconTitleSubtitleCellView disclosureIconTitleSubtitleCellView = this.sellerDisclosureView;
        TestInfo testInfo = item.getSellerCellVO().getCell().getTestInfo();
        setLocators(disclosureIconTitleSubtitleCellView, testInfo != null ? testInfo.getAutomatizationId() : null);
    }
}
