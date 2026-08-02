package ru.ozon.app.android.fresh.main.widgets.product.common.header;

import GW.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.disclosure.DisclosureHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.databinding.ItemProductHeaderExpressBinding;
import ru.ozon.app.android.fresh.main.widgets.product.common.header.model.HeaderVO;
import ru.ozon.app.android.uikit.view.atoms.disclosure.DisclosureView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000e0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/header/HeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderVO;", "getItem", "()Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderVO;", "setItem", "(Lru/ozon/app/android/fresh/main/widgets/product/common/header/model/HeaderVO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/main/databinding/ItemProductHeaderExpressBinding;", "binding", "Lru/ozon/app/android/fresh/main/databinding/ItemProductHeaderExpressBinding;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HeaderViewHolder extends k<HeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ItemProductHeaderExpressBinding binding;
    private HeaderVO item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        ItemProductHeaderExpressBinding bind = ItemProductHeaderExpressBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        containerView.setOnClickListener(new a(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(HeaderViewHolder headerViewHolder, View view) {
        AtomActionDTO action;
        HeaderVO headerVO = headerViewHolder.item;
        if (headerVO == null || (action = headerVO.getAction()) == null) {
            return;
        }
        headerViewHolder.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, headerVO.getTrackingInfo()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.binding.headerTitleTa.setText(item.getTitle());
        TextAtomView headerSubtitleTa = this.binding.headerSubtitleTa;
        Intrinsics.checkNotNullExpressionValue(headerSubtitleTa, "headerSubtitleTa");
        TextViewExtKt.setTextOrGone(headerSubtitleTa, item.getSubtitle());
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
    }
}
