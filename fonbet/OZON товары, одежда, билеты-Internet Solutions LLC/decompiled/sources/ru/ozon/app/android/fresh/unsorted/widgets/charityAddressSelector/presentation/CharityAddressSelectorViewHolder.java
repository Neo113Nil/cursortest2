package ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.presentation;

import Sc.r;
import W10.c;
import WZ.l;
import WZ.t;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.V;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.fresh.unsorted.R$string;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetCharityAddressSelectorBinding;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010&\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)H\u0014¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000e028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "click", "", "changeAddress", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "LSc/r;", "event", "collect", "(Ljava/lang/Object;)V", "showSuccess", "()V", "showError", "Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorViewModel;", "viewModel", "()Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorViewModel;", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/charityAddressSelector/presentation/CharityAddressSelectorVO;Ll20/d;)V", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetCharityAddressSelectorBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetCharityAddressSelectorBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CharityAddressSelectorViewHolder extends k<CharityAddressSelectorVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCharityAddressSelectorBinding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharityAddressSelectorViewHolder(@NotNull View containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        WidgetCharityAddressSelectorBinding bind = WidgetCharityAddressSelectorBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new CharityAddressSelectorViewHolder$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeAddress(AtomAction.Click click) {
        this.refs.getController().e(new l.a.C1079a(0L, null, 3));
        CharityAddressSelectorViewModel viewModel = viewModel();
        if (viewModel != null) {
            viewModel.changeAddress(click);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collect(Object event) {
        this.refs.getController().hideLoader();
        r.Companion companion = r.INSTANCE;
        boolean z11 = event instanceof r.b;
        if (!z11) {
            showSuccess();
        } else if (z11) {
            showError();
        }
    }

    private final void showError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, StringProvider.getString(R$string.feedback_failure_msg), null, null, null, c11, 58, null).show();
    }

    private final void showSuccess() {
        ViewGroup rootView;
        Dialog dialog;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        BottomSheetComposerFragment bottomSheetComposerFragment = (BottomSheetComposerFragment) (c11 != null ? c11.getParentFragment() : null);
        if (bottomSheetComposerFragment != null && (dialog = bottomSheetComposerFragment.getDialog()) != null) {
            dialog.dismiss();
        }
        androidx.fragment.app.r a11 = this.refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, new OzonSpannableString(StringProvider.getString(R$string.address_charity_change)), null, null, Integer.valueOf(R$drawable.ic_s_check), null, StyleParser.OzColor.OZ_SEMANTIC_TEXT_POSITIVE.getValue(), null, null, null, null, null, null, null, null, a11, 65370, null).show();
    }

    private final CharityAddressSelectorViewModel viewModel() {
        return (CharityAddressSelectorViewModel) getWidgetViewModel();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        V<r<Unit>> events;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        CharityAddressSelectorViewModel viewModel = viewModel();
        if (viewModel == null || (events = viewModel.getEvents()) == null) {
            return;
        }
        events.observe(lifecycle, new CharityAddressSelectorViewHolder$sam$androidx_lifecycle_Observer$0(new CharityAddressSelectorViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CharityAddressSelectorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView tvTitle = this.binding.tvTitle;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        TextAtomHolderKt.bind$default(tvTitle, item.getTitle(), null, 2, null);
        TextAtomView tvSubtitle = this.binding.tvSubtitle;
        Intrinsics.checkNotNullExpressionValue(tvSubtitle, "tvSubtitle");
        TextAtomHolderKt.bind$default(tvSubtitle, item.getSubtitle(), null, 2, null);
        LargeButtonView button = this.binding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        LargeButtonHolderKt.bind(button, item.getButton(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CharityAddressSelectorVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CharityAddressSelectorViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
