package ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.R$string;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerEvent;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerViewModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R'\u00102\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00150,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00150,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVH;", "Ld20/a;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonViewGroup;", "buttonView", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "selectionFormViewModel", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModel;", "mediaPickerViewModel", "LWZ/l;", "tokenizedAnalytics", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonViewGroup;Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModel;LWZ/l;Ll10/i;LVg/d;Ld20/e;)V", "", "observeSingleEvent", "()V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getDefaultNotificationDTO", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "refreshBloggerPage", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonVO;)V", "onWidgetCreated", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/submitButton/SelectionFormSubmitButtonViewGroup;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModel;", "LWZ/l;", "Ll10/i;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "onAction", "Lkotlin/jvm/functions/Function1;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormSubmitButtonVH extends AbstractC6064a<SelectionFormSubmitButtonVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final SelectionFormSubmitButtonViewGroup buttonView;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final MediaPickerViewModel mediaPickerViewModel;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final SelectionFormViewModel selectionFormViewModel;

    @NotNull
    private final l tokenizedAnalytics;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionFormSubmitButtonVH(@NotNull SelectionFormSubmitButtonViewGroup buttonView, @NotNull SelectionFormViewModel selectionFormViewModel, @NotNull MediaPickerViewModel mediaPickerViewModel, @NotNull l tokenizedAnalytics, @NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        Intrinsics.checkNotNullParameter(selectionFormViewModel, "selectionFormViewModel");
        Intrinsics.checkNotNullParameter(mediaPickerViewModel, "mediaPickerViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.buttonView = buttonView;
        this.selectionFormViewModel = selectionFormViewModel;
        this.mediaPickerViewModel = mediaPickerViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.container = container;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = k.b(new SelectionFormSubmitButtonVH$actionHandler$2(this));
        this.onAction = new SelectionFormSubmitButtonVH$onAction$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationDTO getDefaultNotificationDTO() {
        return new NotificationDTO(StringProvider.getString(R$string.collapse_widget_notification_warning_title_android), StringProvider.getString(ru.ozon.app.android.pdp.domain.actionHandlers.R$string.reviews_try_again_later_android), null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 476, null);
    }

    private final void observeSingleEvent() {
        C2399j.C(new C2408n0(this.selectionFormViewModel.getSingleEvent(), new SelectionFormSubmitButtonVH$observeSingleEvent$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onWidgetCreated$onMediaPickerEvent(SelectionFormViewModel selectionFormViewModel, MediaPickerEvent mediaPickerEvent, kotlin.coroutines.d dVar) {
        selectionFormViewModel.onMediaPickerEvent(mediaPickerEvent);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void refreshBloggerPage(AtomActionDTO action) {
        r a11;
        G supportFragmentManager;
        SelectionFormSubmitButtonVO selectionFormSubmitButtonVO = (SelectionFormSubmitButtonVO) getBoundData();
        if ((selectionFormSubmitButtonVO != null ? selectionFormSubmitButtonVO.getEntityType() : null) != SelectionItemFormDTO.EntityType.ENTITY_TYPE_POST || action.getBehavior() == AtomActionDTO.Behavior.SCROLL_TO_WIDGET || (a11 = this.container.Q().a()) == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        Iterator it = C7714v.b0("REFRESH_BLOGGER_MAIN_PAGE_AFTER_FORM_SUBMIT_REQUEST_KEY", "REFRESH_BLOGGER_POSTS_PAGE_AFTER_FORM_SUBMIT_REQUEST_KEY").iterator();
        while (it.hasNext()) {
            supportFragmentManager.m1(Bundle.EMPTY, (String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notification) {
        ViewGroup rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        r a11 = this.container.K().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, a11, getActionHandler()).show();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        observeSingleEvent();
        C2399j.C(new C2408n0(this.mediaPickerViewModel.getMediaPickerEvents(), new SelectionFormSubmitButtonVH$onWidgetCreated$1(this.selectionFormViewModel)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull SelectionFormSubmitButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.buttonView.bind(item, this.onAction);
    }
}
