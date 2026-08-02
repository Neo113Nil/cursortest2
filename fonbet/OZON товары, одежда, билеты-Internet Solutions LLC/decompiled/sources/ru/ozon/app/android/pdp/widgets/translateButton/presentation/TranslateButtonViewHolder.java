package ru.ozon.app.android.pdp.widgets.translateButton.presentation;

import W10.c;
import WZ.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.translateButton.core.TranslateButtonViewMapper;
import ru.ozon.app.android.pdp.widgets.translateButton.core.TranslateShowLoadingUpdateKey;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010\u0010J'\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b#\u0010&J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J)\u0010/\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateButtonViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateButtonVO;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "view", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "item", "", "initUi", "(Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateButtonVO;)V", "", "payload", "bindInternal", "(Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateButtonVO;Ljava/lang/Object;)V", "handleTranslated", "()V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "clickAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "bind", "Ll20/d;", "info", "(Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateButtonVO;Ll20/d;Ljava/lang/Object;)V", "", "isShow", "updateLoadingPayload", "(Z)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateButtonVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TranslateButtonViewHolder extends TabEmbeddedWidgetViewHolder<TranslateButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ButtonV3View view;

    @NotNull
    private final TranslateViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslateButtonViewHolder(@NotNull ButtonV3View view, @NotNull TranslateViewModel viewModel, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(view, refs, null, 4, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.viewModel = viewModel;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new TranslateButtonViewHolder$actionHandler$1(this)).buildHandler();
    }

    private final void bindInternal(TranslateButtonVO item, Object payload) {
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            initUi(item);
        }
        List list = payload instanceof List ? (List) payload : null;
        if (list != null) {
            for (Object obj : list) {
                if (Intrinsics.d(obj, TranslateButtonViewMapper.TranslatedButtonPayload.INSTANCE)) {
                    initUi(item);
                } else if (Intrinsics.d(obj, TranslateButtonViewMapper.TranslateButtonLoadingPayload.INSTANCE)) {
                    updateLoadingPayload(item.getIsLoading());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void clickAction(AtomAction.Click action) {
        TranslateButtonVO translateButtonVO;
        List<String> attributeKeys;
        if (!Intrinsics.d(action.getId(), "translation_action") || (translateButtonVO = (TranslateButtonVO) getBoundedData()) == null || (attributeKeys = translateButtonVO.getAttributeKeys()) == null) {
            return;
        }
        this.viewModel.translateProductAttributes(action, attributeKeys);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTranslated() {
        this.refs.getController().update(TranslateButtonViewMapper.TranslatedUpdateKey.INSTANCE);
        this.refs.getController().update(new TranslateShowLoadingUpdateKey(false, 0, 2, null));
    }

    private final void initUi(TranslateButtonVO item) {
        ButtonV3View buttonV3View = this.view;
        ButtonV3DTO translateButton = item.getTranslateButton();
        if (translateButton == null) {
            translateButton = item.getTranslatedButton();
        }
        ButtonV3HolderKt.bind(buttonV3View, translateButton, this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notification) {
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notification));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager, notification, this.refs.getContainer().g(), null, 8, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        C10727i.c(K.a(lifecycle), null, null, new TranslateButtonViewHolder$onAttachViewModel$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    protected void updateLoadingPayload(boolean isShow) {
        super.updateLoadingPayload(isShow);
        this.view.setHoverDisabled(isShow);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TranslateButtonVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, item.getTokenizedEvent());
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    public void bind(@NotNull TranslateButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bindInternal(item, Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TranslateButtonVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        bindInternal(item, payload);
    }
}
