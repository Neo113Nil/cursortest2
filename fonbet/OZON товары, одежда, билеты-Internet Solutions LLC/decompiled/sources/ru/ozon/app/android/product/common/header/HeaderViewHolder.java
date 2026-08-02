package ru.ozon.app.android.product.common.header;

import CG.c;
import WZ.t;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.disclosure.DisclosureHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.common.header.model.HeaderVO;
import ru.ozon.app.android.product.databinding.ItemProductHeaderBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000e0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/product/common/header/HeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/product/common/header/model/HeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/product/common/header/model/HeaderVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/product/common/header/model/HeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "bindTitle", "(Ljava/lang/String;)V", "subtitle", "bindSubtitle", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/product/databinding/ItemProductHeaderBinding;", "binding", "Lru/ozon/app/android/product/databinding/ItemProductHeaderBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "defaultTextColor", "I", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeaderViewHolder extends k<HeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemProductHeaderBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final View containerView;
    private final int defaultTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.containerView = containerView;
        this.composerReferences = composerReferences;
        ItemProductHeaderBinding bind = ItemProductHeaderBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.defaultTextColor = ThemeExtKt.themeColor(getContext(), R$attr.textPrimary);
        containerView.setOnClickListener(new c(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(HeaderViewHolder headerViewHolder, View view) {
        AtomActionDTO action;
        HeaderVO boundedData = headerViewHolder.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        headerViewHolder.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, boundedData.getTrackingInfo()));
    }

    public final void bindSubtitle(String subtitle) {
        TextAtomView headerSubtitleTa = this.binding.headerSubtitleTa;
        Intrinsics.checkNotNullExpressionValue(headerSubtitleTa, "headerSubtitleTa");
        TextViewExtKt.setTextOrGone(headerSubtitleTa, subtitle);
        this.binding.headerSubtitleTa.setTextColor(this.defaultTextColor);
    }

    public final void bindTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.binding.headerTitleTa.setText(title);
        this.binding.headerTitleTa.setTextColor(this.defaultTextColor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bindTitle(item.getTitle());
        bindSubtitle(item.getSubtitle());
        ButtonV3Atom.SmallBorderlessButton multilineLink = item.getMultilineLink();
        if (multilineLink == null) {
            SmallBorderlessButtonView headerLinkTa = this.binding.headerLinkTa;
            Intrinsics.checkNotNullExpressionValue(headerLinkTa, "headerLinkTa");
            ViewExtKt.gone(headerLinkTa);
        } else {
            SmallBorderlessButtonView headerLinkTa2 = this.binding.headerLinkTa;
            Intrinsics.checkNotNullExpressionValue(headerLinkTa2, "headerLinkTa");
            ViewExtKt.show(headerLinkTa2);
            SmallBorderlessButtonView headerLinkTa3 = this.binding.headerLinkTa;
            Intrinsics.checkNotNullExpressionValue(headerLinkTa3, "headerLinkTa");
            WrappedBorderlessButtonHolderKt.bind(headerLinkTa3, multilineLink, this.actionHandler);
        }
        DisclosureView headerDisclosure = this.binding.headerDisclosure;
        Intrinsics.checkNotNullExpressionValue(headerDisclosure, "headerDisclosure");
        DisclosureHolderKt.bindOrGone$default(headerDisclosure, item.getDisclosure(), null, 2, null);
        BadgeView headerBadge = this.binding.headerBadge;
        Intrinsics.checkNotNullExpressionValue(headerBadge, "headerBadge");
        BadgeHolderKt.bindOrGone(headerBadge, item.getBadge(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HeaderVO item, @NotNull W10.c trackingData, f viewedPond) {
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        if (trackingInfo == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), tokenizedEvent$default, null, 2, null);
    }
}
