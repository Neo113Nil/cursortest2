package ru.ozon.app.android.action.sheet;

import Pc.a;
import WZ.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.material.bottomsheet.b;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.di.ActionSheetFragmentComponent;
import ru.ozon.app.android.action.sheet.di.DaggerActionSheetFragmentComponent;
import ru.ozon.app.android.composer.R$layout;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog;", "onCreateDialog", "(Landroid/os/Bundle;)Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog;", "Lru/ozon/app/android/action/sheet/ActionSheetBinder;", "binder", "Lru/ozon/app/android/action/sheet/ActionSheetBinder;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "setTokenizedAnalytics", "(LWZ/l;)V", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "handler", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "setHandler", "(Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;)V", "LPc/a;", "Lru/ozon/app/android/action/sheet/ActionSheetViewModelImpl;", "provider", "LPc/a;", "getProvider", "()LPc/a;", "setProvider", "(LPc/a;)V", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel;", "viewModel", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel;", "getViewModel", "()Lru/ozon/app/android/action/sheet/ActionSheetViewModel;", "setViewModel", "(Lru/ozon/app/android/action/sheet/ActionSheetViewModel;)V", "Companion", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionSheetFragment extends b {
    private ActionSheetBinder binder;
    public ActionSheetEventHandler handler;
    public a<ActionSheetViewModelImpl> provider;
    public l tokenizedAnalytics;
    public ActionSheetViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetFragment$Companion;", "", "<init>", "()V", "MODE_REMOTE", "", "CURRENT_PAGE_URL", "ACTION_PATH", "REQUEST_ID", "ACTION_SHEET", "WIDGET_TRACKING_DATA", "TAG", "newInstance", "Lru/ozon/app/android/action/sheet/ActionSheetFragment;", "currentPageUrl", "id", "requestId", "", "analyticsInfo", "Lru/ozon/app/android/action/sheet/AnalyticsInfo;", "actionSheet", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSheetFragment newInstance(String currentPageUrl, @NotNull String id2, long requestId, @NotNull AnalyticsInfo analyticsInfo) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(analyticsInfo, "analyticsInfo");
            ActionSheetFragment actionSheetFragment = new ActionSheetFragment();
            Bundle bundle = new Bundle();
            if (currentPageUrl != null) {
                bundle.putString("arg:current_page_url", currentPageUrl);
            }
            bundle.putString("arg:action_path", id2);
            bundle.putLong("arg:request_id", requestId);
            bundle.putBoolean("arg:mode", true);
            bundle.putParcelable("arg:widget_tracking_data", analyticsInfo);
            actionSheetFragment.setArguments(bundle);
            return actionSheetFragment;
        }

        private Companion() {
        }

        @NotNull
        public final ActionSheetFragment newInstance(@NotNull ActionSheetVO actionSheet, long requestId, @NotNull AnalyticsInfo analyticsInfo) {
            Intrinsics.checkNotNullParameter(actionSheet, "actionSheet");
            Intrinsics.checkNotNullParameter(analyticsInfo, "analyticsInfo");
            ActionSheetFragment actionSheetFragment = new ActionSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg:action_sheet", actionSheet);
            bundle.putLong("arg:request_id", requestId);
            bundle.putBoolean("arg:mode", false);
            bundle.putParcelable("arg:widget_tracking_data", analyticsInfo);
            actionSheetFragment.setArguments(bundle);
            return actionSheetFragment;
        }
    }

    @NotNull
    public final ActionSheetEventHandler getHandler() {
        ActionSheetEventHandler actionSheetEventHandler = this.handler;
        if (actionSheetEventHandler != null) {
            return actionSheetEventHandler;
        }
        Intrinsics.n("handler");
        throw null;
    }

    @NotNull
    public final a<ActionSheetViewModelImpl> getProvider() {
        a<ActionSheetViewModelImpl> aVar = this.provider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("provider");
        throw null;
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        l lVar = this.tokenizedAnalytics;
        if (lVar != null) {
            return lVar;
        }
        Intrinsics.n("tokenizedAnalytics");
        throw null;
    }

    @NotNull
    public final ActionSheetViewModel getViewModel() {
        ActionSheetViewModel actionSheetViewModel = this.viewModel;
        if (actionSheetViewModel != null) {
            return actionSheetViewModel;
        }
        Intrinsics.n("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ActionSheetFragmentComponent.Factory factory = DaggerActionSheetFragmentComponent.factory();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage.b(ComposerComponentApi.class);
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        factory.create(composerComponentApi, (ActionComponentApi) dependencyStorage2.b(ActionComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setViewModel((ActionSheetViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.action.sheet.ActionSheetFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ActionSheetViewModelImpl actionSheetViewModelImpl = ActionSheetFragment.this.getProvider().get();
                Intrinsics.g(actionSheetViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return actionSheetViewModelImpl;
            }
        }).a(ActionSheetViewModelImpl.class));
        ActionSheetViewModel viewModel = getViewModel();
        l tokenizedAnalytics = getTokenizedAnalytics();
        ActionSheetEventHandler handler = getHandler();
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw ActionSheetRequestIdMissing.INSTANCE;
        }
        this.binder = new ActionSheetBinder(viewModel, this, this, tokenizedAnalytics, handler, arguments.getLong("arg:request_id"));
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = View.inflate(requireContext(), R$layout.fragment_action_sheet, container);
        ActionSheetBinder actionSheetBinder = this.binder;
        if (actionSheetBinder == null) {
            Intrinsics.n("binder");
            throw null;
        }
        Intrinsics.f(inflate);
        actionSheetBinder.setView(new ActionSheetView(inflate));
        Intrinsics.checkNotNullExpressionValue(inflate, "also(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Bundle arguments = getArguments();
        Boolean valueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("arg:mode")) : null;
        if (valueOf == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean booleanValue = valueOf.booleanValue();
        Bundle arguments2 = getArguments();
        AnalyticsInfo analyticsInfo = arguments2 != null ? (AnalyticsInfo) arguments2.getParcelable("arg:widget_tracking_data") : null;
        if (analyticsInfo == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ActionSheetBinder actionSheetBinder = this.binder;
        if (actionSheetBinder == null) {
            Intrinsics.n("binder");
            throw null;
        }
        actionSheetBinder.bind(analyticsInfo);
        if (!booleanValue) {
            ActionSheetViewModel viewModel = getViewModel();
            Bundle arguments3 = getArguments();
            ActionSheetVO actionSheetVO = arguments3 != null ? (ActionSheetVO) arguments3.getParcelable("arg:action_sheet") : null;
            if (actionSheetVO == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            viewModel.bindInitialLocal(actionSheetVO);
            return;
        }
        ActionSheetViewModel viewModel2 = getViewModel();
        Bundle arguments4 = getArguments();
        String string = arguments4 != null ? arguments4.getString("arg:current_page_url") : null;
        Bundle arguments5 = getArguments();
        String string2 = arguments5 != null ? arguments5.getString("arg:action_path") : null;
        if (string2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        viewModel2.bindInitialRemote(string, string2, analyticsInfo);
    }

    public final void setViewModel(@NotNull ActionSheetViewModel actionSheetViewModel) {
        Intrinsics.checkNotNullParameter(actionSheetViewModel, "<set-?>");
        this.viewModel = actionSheetViewModel;
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public OzonBottomSheetDialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 0, false, null, true, true, true, null, false, 790, null);
    }
}
