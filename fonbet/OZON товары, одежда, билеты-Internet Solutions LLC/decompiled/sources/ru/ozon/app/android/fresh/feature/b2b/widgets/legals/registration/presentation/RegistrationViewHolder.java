package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Bl.b;
import El.C2971a;
import Vg.d;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.feature.b2b.R$string;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common.LegalRouter;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.registration.presentation.RegistrationVI;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;
import xe.B0;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 :2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001:B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010&\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-H\u0014¢\u0006\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u001c068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;", "router", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel;LVg/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "Lxe/B0;", "observeScreenState", "(Landroidx/lifecycle/J;)Lxe/B0;", "observeUIEvents", "", "actionName", "", "postData", "registrationVI", "", "processRegistration", "(Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;)V", "startQuery", "openSearchDialog", "(Ljava/lang/String;)V", "message", "showErrorMessage", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotificationBar", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "setScreenMinHeight", "()V", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationVI;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/common/LegalRouter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/registration/presentation/RegistrationViewModel;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RegistrationViewHolder extends k<RegistrationVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final RegistrationView containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final LegalRouter router;

    @NotNull
    private final RegistrationViewModel viewModel;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationViewHolder(@NotNull RegistrationView containerView, @NotNull ComposerReferences refs, @NotNull LegalRouter router, @NotNull RegistrationViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.refs = refs;
        this.router = router;
        this.viewModel = viewModel;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new RegistrationViewHolder$actionHandler$1(this)).onComposerAction(new RegistrationViewHolder$actionHandler$2(this)).buildHandler();
        setScreenMinHeight();
    }

    private final B0 observeScreenState(J lifecycle) {
        return C2399j.C(new C2408n0(this.viewModel.getState(), new RegistrationViewHolder$observeScreenState$1(this, null)), K.a(lifecycle));
    }

    private final B0 observeUIEvents(J lifecycle) {
        return C2399j.C(new C2408n0(this.viewModel.getEvents(), new RegistrationViewHolder$observeUIEvents$1(this, null)), K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openSearchDialog(String startQuery) {
        this.containerView.clearFocus();
        String string = StringProvider.getString(R$string.consignee_list_search_hint);
        String string2 = StringProvider.getString(R$string.registration_company_address);
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        YandexSearchSheetFragment newInstance = YandexSearchSheetFragment.INSTANCE.newInstance(new YandexSearchSheetFragment.Data("", null, string, startQuery, new FormBuilderBlockVO.Field.YandexSearchField.SearchOptions("validateCourierAddressV2?fl=1&pv=2&q={q}", string2, 1, null, null, k11, k11, 16, null), null, null, null, null, null, 992, null), getTrackingData());
        newInstance.setTargetFragment(this.refs.getContainer().j(), 1000);
        newInstance.show(this.refs.getContainer().k(), YandexSearchSheetFragment.class.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processRegistration(String actionName, Map<String, String> postData, RegistrationVI registrationVI) {
        List<RegistrationVI.FieldVI> fields = registrationVI.getFields();
        ArrayList<RegistrationVI.FieldVI.InputVI> arrayList = new ArrayList();
        Iterator<T> it = fields.iterator();
        while (it.hasNext()) {
            RegistrationVI.FieldVI.InputVI input = ((RegistrationVI.FieldVI) it.next()).getInput();
            if (input != null) {
                arrayList.add(input);
            }
        }
        int h11 = U.h(C7714v.z(arrayList, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (RegistrationVI.FieldVI.InputVI inputVI : arrayList) {
            String name = inputVI.getName();
            InputData inputData = this.containerView.getInputData(inputVI.getName());
            if (inputData == null) {
                return;
            }
            Pair pair = new Pair(name, inputData);
            linkedHashMap.put(pair.e(), pair.f());
        }
        this.viewModel.processRegistration(actionName, linkedHashMap, registrationVI, postData);
    }

    private final void setScreenMinHeight() {
        AppBarLayout composerAppbar;
        ViewGroup composerContainer;
        ViewGroup b11 = C2971a.b(this.refs);
        int i11 = 0;
        int height = (b11 == null || (composerContainer = ComposerViewExtensionKt.composerContainer(b11)) == null) ? 0 : composerContainer.getHeight();
        ViewGroup b12 = C2971a.b(this.refs);
        if (b12 != null && (composerAppbar = ComposerViewExtensionKt.composerAppbar(b12)) != null) {
            i11 = composerAppbar.getHeight();
        }
        this.containerView.setMinimumHeight(height - i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage(String message) {
        ViewGroup rootView = ContextExtKt.getRootView(this.refs.getContainer().j());
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            FlashbarFactory.create$default(flashbarFactory, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message == null ? StringProvider.getString(ru.ozon.app.android.platform.R$string.common_universal_network_error) : message), null, null, Integer.valueOf(R$drawable.ic_m_exclamation_filled), null, UniColors.GRAPHIC_WARNING_PRIMARY.getToken(), null, null, null, null, null, 3000L, null, null, this.refs.getContainer().g(), 56666, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationBar(NotificationDTO notification) {
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ViewGroup b11 = b.b(this.refs);
        if (b11 == null || (composerContainer = ComposerViewExtensionKt.composerContainer(b11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, this.refs.getContainer().i(), this.actionHandler).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        observeScreenState(lifecycle);
        observeUIEvents(lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RegistrationVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, new RegistrationViewHolder$bind$1(this), this.actionHandler);
    }
}
