package ru.ozon.app.android.monetization.widgets.inputSubmit.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import B90.C2615q;
import Sc.o;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010#\u001a\u00020\u000e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0012J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u0012J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R \u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u000e0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewGroup;", "inputSubmitView", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel;", "inputSubmitViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewGroup;Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroidx/core/view/D;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setRootInsetsListener", "(Landroidx/core/view/D;)V", "observeScreenState", "()V", "observeErrors", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showSuccessNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "showErrorNotification", "Landroid/view/ViewGroup;", "rootView", "Landroidx/lifecycle/J;", "lifecycleOwner", "model", "showNotification", "(Landroid/view/ViewGroup;Landroidx/lifecycle/J;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel$ScreenState$SuccessWithRefreshRequests$RefreshPageRequest;", "requests", "refreshPages", "(Ljava/util/Set;)V", "onAttach", "onDetach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitVO;Ll20/d;)V", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewGroup;", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "insetsListener", "Landroidx/core/view/D;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputSubmitViewHolder extends k<InputSubmitVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final InputSubmitViewGroup inputSubmitView;

    @NotNull
    private final InputSubmitViewModel inputSubmitViewModel;

    @NotNull
    private final D insetsListener;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests.RefreshPageRequest.values().length];
            try {
                iArr[InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests.RefreshPageRequest.BLOGGER_MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests.RefreshPageRequest.BLOGGER_CHANNELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputSubmitViewHolder(@NotNull InputSubmitViewGroup inputSubmitView, @NotNull InputSubmitViewModel inputSubmitViewModel, @NotNull ComposerReferences composerReferences) {
        super(inputSubmitView);
        Intrinsics.checkNotNullParameter(inputSubmitView, "inputSubmitView");
        Intrinsics.checkNotNullParameter(inputSubmitViewModel, "inputSubmitViewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.inputSubmitView = inputSubmitView;
        this.inputSubmitViewModel = inputSubmitViewModel;
        this.composerReferences = composerReferences;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).onComposerAction(new InputSubmitViewHolder$actionHandler$1(this)).buildHandler();
        this.insetsListener = new C2615q(this, 1);
        observeScreenState();
        observeErrors();
        inputSubmitView.setTextWatcher(new OzonTextWatcher() { // from class: ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewHolder.1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                InputSubmitVO boundData = InputSubmitViewHolder.this.getBoundData();
                if (boundData == null || boundData.getTextArea() == null) {
                    return;
                }
                InputSubmitViewHolder inputSubmitViewHolder = InputSubmitViewHolder.this;
                inputSubmitViewHolder.inputSubmitView.hideError();
                InputSubmitViewModel inputSubmitViewModel2 = inputSubmitViewHolder.inputSubmitViewModel;
                String obj = editable != null ? editable.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                inputSubmitViewModel2.onInputUpdated(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$0(InputSubmitViewHolder inputSubmitViewHolder, View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (!insets.p(8)) {
            inputSubmitViewHolder.inputSubmitView.clearFocus();
        }
        return Y.u(view, insets);
    }

    private final void observeErrors() {
        C2399j.C(new C2408n0(this.inputSubmitViewModel.getError(), new InputSubmitViewHolder$observeErrors$1(this, null)), K.a(this.composerReferences.getContainer().e()));
    }

    private final void observeScreenState() {
        C2399j.C(new C2408n0(this.inputSubmitViewModel.getScreenState(), new InputSubmitViewHolder$observeScreenState$1(this, null)), K.a(this.composerReferences.getContainer().e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshPages(Set<? extends InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests.RefreshPageRequest> requests) {
        G supportFragmentManager;
        String str;
        r a11 = this.composerReferences.getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        Set<? extends InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests.RefreshPageRequest> set = requests;
        ArrayList arrayList = new ArrayList(C7714v.z(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((InputSubmitViewModel.ScreenState.SuccessWithRefreshRequests.RefreshPageRequest) it.next()).ordinal()];
            if (i11 == 1) {
                str = "REFRESH_BLOGGER_MAIN_PAGE_AFTER_INPUT_SUBMIT_REQUEST_KEY";
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                str = "REFRESH_BLOGGER_CHANNELS_AFTER_INPUT_SUBMIT_REQUEST_KEY";
            }
            arrayList.add(str);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            supportFragmentManager.m1(Bundle.EMPTY, (String) it2.next());
        }
    }

    private final void setRootInsetsListener(D listener) {
        ViewGroup rootView;
        r a11 = this.composerReferences.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        Y.J(rootView, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNotification(NotificationDTO notification) {
        ComponentCallbacksC5392m c11 = this.composerReferences.getContainer().c();
        ViewGroup rootView = ContextExtKt.getRootView(c11);
        if (rootView == null || c11 == null) {
            return;
        }
        showNotification(rootView, c11, notification);
    }

    private final void showNotification(ViewGroup rootView, J lifecycleOwner, NotificationDTO model) {
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(ComposerViewExtensionKt.composerContainer(rootView), null, 1, null);
        if (asNotificationLayoutManager$default == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, model, lifecycleOwner, this.actionHandler).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSuccessNotification(NotificationDTO notification) {
        r a11;
        ViewGroup rootView;
        if (notification == null || (rootView = ContextExtKt.getRootView((a11 = this.composerReferences.getContainer().a()))) == null || a11 == null) {
            return;
        }
        showNotification(rootView, a11, notification);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        setRootInsetsListener(this.insetsListener);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        setRootInsetsListener(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull InputSubmitVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        InputSubmitViewGroup inputSubmitViewGroup = this.inputSubmitView;
        inputSubmitViewGroup.bind(item, this.actionHandler);
        String value = this.inputSubmitViewModel.getInputValue().getValue();
        if (value == null) {
            value = "";
        }
        inputSubmitViewGroup.setInputText(value);
    }
}
