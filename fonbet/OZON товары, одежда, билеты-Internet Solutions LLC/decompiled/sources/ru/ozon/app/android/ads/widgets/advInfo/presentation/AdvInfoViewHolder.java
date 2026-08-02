package ru.ozon.app.android.ads.widgets.advInfo.presentation;

import Bl.b;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.ads.databinding.WidgetAdvInfoBinding;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitle24IconHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitle24IconView;
import ru.ozon.app.android.utils.ClipboardWrapperKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advInfo/presentation/AdvInfoViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ads/widgets/advInfo/presentation/AdvInfoVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "", "handleCustomCopyLinkAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "item", "showFlashbar", "(Lru/ozon/app/android/ads/widgets/advInfo/presentation/AdvInfoVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/ads/widgets/advInfo/presentation/AdvInfoVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ads/databinding/WidgetAdvInfoBinding;", "binding", "Lru/ozon/app/android/ads/databinding/WidgetAdvInfoBinding;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "copyLinkActionHandler", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdvInfoViewHolder extends k<AdvInfoVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAdvInfoBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final Function1<AtomAction, Unit> copyLinkActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvInfoViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerReferences = composerReferences;
        WidgetAdvInfoBinding bind = WidgetAdvInfoBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.copyLinkActionHandler = new ActionHandler.Builder(composerReferences, this).onPreProcess(new AdvInfoViewHolder$copyLinkActionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleCustomCopyLinkAction(AtomAction atomAction) {
        AdvInfoVO boundedData;
        if ((atomAction instanceof AtomAction.Click) && Intrinsics.d(((AtomAction.Click) atomAction).getId(), "copyLink") && (boundedData = getBoundedData()) != null) {
            ClipboardWrapperKt.toClipboard(getContext(), boundedData.getCopyLinkUrl(), boundedData.getCopyLinkUrl());
            this.composerReferences.getNavigator().popBackStack();
            showFlashbar(boundedData);
        }
    }

    private final void showFlashbar(AdvInfoVO item) {
        ViewGroup b11 = b.b(this.composerReferences);
        if (b11 != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(item.getNotificationText());
            int i11 = R$drawable.ic_m_confirmed;
            FlashbarFactory.create$default(flashbarFactory, b11, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 3000L, null, null, this.composerReferences.getContainer().g(), 57306, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdvInfoVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView advAboutInfoTitleTV = this.binding.advAboutInfoTitleTV;
        Intrinsics.checkNotNullExpressionValue(advAboutInfoTitleTV, "advAboutInfoTitleTV");
        TextAtomHolderKt.bind$default(advAboutInfoTitleTV, item.getTitle(), null, 2, null);
        TextAtomView advAboutInfoDescriptionTV = this.binding.advAboutInfoDescriptionTV;
        Intrinsics.checkNotNullExpressionValue(advAboutInfoDescriptionTV, "advAboutInfoDescriptionTV");
        TextAtomHolderKt.bind(advAboutInfoDescriptionTV, item.getDescription(), this.actionHandler);
        CellWithSubtitle24IconView advAboutInfoAdvertiserRegularCellView = this.binding.advAboutInfoAdvertiserRegularCellView;
        Intrinsics.checkNotNullExpressionValue(advAboutInfoAdvertiserRegularCellView, "advAboutInfoAdvertiserRegularCellView");
        CellWithSubtitle24IconHolderKt.bind(advAboutInfoAdvertiserRegularCellView, item.getAdvertiserInfoCell(), this.actionHandler);
        CellWithSubtitle24IconView advAboutInfoCopyLinkCellView = this.binding.advAboutInfoCopyLinkCellView;
        Intrinsics.checkNotNullExpressionValue(advAboutInfoCopyLinkCellView, "advAboutInfoCopyLinkCellView");
        CellWithSubtitle24IconHolderKt.bind(advAboutInfoCopyLinkCellView, item.getCopyLinkCell(), this.copyLinkActionHandler);
    }
}
