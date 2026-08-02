package ru.ozon.app.android.error.summary.presentation;

import Pc.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.S;
import androidx.core.app.t;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.error.summary.di.DaggerErrorSummaryComponent;
import ru.ozon.app.android.error.summary.di.ErrorSummaryComponent;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryCommand;
import ru.ozon.app.android.error.summary.presentation.ErrorSummaryFragment;
import ru.ozon.app.android.error.summary.presentation.recycler.ErrorSummaryAdapter;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001d\u0010,\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R#\u00104\u001a\n 0*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/ErrorSummaryFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryView;", "view", "", "initRecyclerView", "(Lru/ozon/app/android/error/summary/presentation/ErrorSummaryView;)V", "initButtonClickListeners", "observeState", "observeCommands", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryCommand$Share;", "commandShare", "shareData", "(Lru/ozon/app/android/error/summary/presentation/ErrorSummaryCommand$Share;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Lru/ozon/app/android/error/summary/presentation/ErrorSummaryView;", "Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LPc/a;", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "setViewModelProvider", "(LPc/a;)V", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "serverIssue$delegate", "LSc/j;", "getServerIssue", "()Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "serverIssue", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryAdapter;", "adapter", "Lru/ozon/app/android/error/summary/presentation/recycler/ErrorSummaryAdapter;", "kotlin.jvm.PlatformType", "screenViewModel$delegate", "getScreenViewModel", "()Lru/ozon/app/android/error/summary/presentation/ErrorSummaryViewModel;", "screenViewModel", "Companion", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryFragment extends ComponentCallbacksC5392m {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public a<ErrorSummaryViewModel> viewModelProvider;

    /* renamed from: serverIssue$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j serverIssue = LazyUtilsKt.unsafeLazy(new ErrorSummaryFragment$serverIssue$2(this));

    @NotNull
    private final ErrorSummaryAdapter adapter = new ErrorSummaryAdapter(new ErrorSummaryFragment$adapter$1(this), new ErrorSummaryFragment$adapter$2(this));

    /* renamed from: screenViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j screenViewModel = LazyUtilsKt.unsafeLazy(new ErrorSummaryFragment$screenViewModel$2(this));

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/ErrorSummaryFragment$Companion;", "", "<init>", "()V", "TAG", "", "ARGS", "newInstance", "Lru/ozon/app/android/error/summary/presentation/ErrorSummaryFragment;", "args", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ErrorSummaryFragment newInstance$default(Companion companion, ScreenState.ServerIssue serverIssue, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                serverIssue = null;
            }
            return companion.newInstance(serverIssue);
        }

        @NotNull
        public final ErrorSummaryFragment newInstance(ScreenState.ServerIssue args) {
            ErrorSummaryFragment errorSummaryFragment = new ErrorSummaryFragment();
            errorSummaryFragment.setArguments(d.b(new Pair("ARGS", args)));
            return errorSummaryFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorSummaryViewModel getScreenViewModel() {
        return (ErrorSummaryViewModel) this.screenViewModel.getValue();
    }

    private final ScreenState.ServerIssue getServerIssue() {
        return (ScreenState.ServerIssue) this.serverIssue.getValue();
    }

    private final void initButtonClickListeners(ErrorSummaryView view) {
        view.getBackButton().setOnClickListener(new FK.a(this, 3));
        view.getSharingButton().setOnClickListener(new Hv.a(1, view, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonClickListeners$lambda$9$lambda$3(ErrorSummaryFragment errorSummaryFragment, View view) {
        errorSummaryFragment.getScreenViewModel().onBackButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initButtonClickListeners$lambda$9$lambda$8(ErrorSummaryView errorSummaryView, final ErrorSummaryFragment errorSummaryFragment, View view) {
        S s11 = new S(view, errorSummaryView.getContext());
        g a11 = s11.a();
        ((i) a11.add("Share error details")).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: Ls.a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$4;
                initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$4 = ErrorSummaryFragment.initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$4(ErrorSummaryFragment.this, menuItem);
                return initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$4;
            }
        });
        ((i) a11.add("Share last requests")).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: Ls.b
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5;
                initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5 = ErrorSummaryFragment.initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(ErrorSummaryFragment.this, menuItem);
                return initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5;
            }
        });
        s11.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$4(ErrorSummaryFragment errorSummaryFragment, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return errorSummaryFragment.getScreenViewModel().onShareButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initButtonClickListeners$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(ErrorSummaryFragment errorSummaryFragment, MenuItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ErrorSummaryViewModel screenViewModel = errorSummaryFragment.getScreenViewModel();
        Context requireContext = errorSummaryFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return screenViewModel.onShareHarItemClicked(requireContext);
    }

    private final void initRecyclerView(ErrorSummaryView view) {
        view.getRecyclerView().setAdapter(this.adapter);
    }

    private final void observeCommands() {
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        K.a(viewLifecycleOwner).d(new ErrorSummaryFragment$observeCommands$1(this, null));
    }

    private final void observeState() {
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        K.a(viewLifecycleOwner).d(new ErrorSummaryFragment$observeState$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareData(ErrorSummaryCommand.Share commandShare) {
        t.a aVar = new t.a(requireActivity());
        aVar.g("text/*");
        aVar.f(commandShare.getJsonData());
        aVar.d("Share error summary data");
        aVar.h();
    }

    @NotNull
    public final a<ErrorSummaryViewModel> getViewModelProvider() {
        a<ErrorSummaryViewModel> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewModelProvider");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ErrorSummaryComponent.Factory factory = DaggerErrorSummaryComponent.factory();
        ScreenState.ServerIssue serverIssue = getServerIssue();
        C6740b dependencyStorage = C6739a.b(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage.b(StorageComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage2.b(AccountComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage3.b(NavigationComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        factory.create(serverIssue, storageComponentApi, accountComponentApi, navigationComponentApi, (NetworkComponentApi) dependencyStorage4.b(NetworkComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if ((view instanceof ErrorSummaryView ? (ErrorSummaryView) view : null) != null) {
            ErrorSummaryView errorSummaryView = (ErrorSummaryView) view;
            initRecyclerView(errorSummaryView);
            initButtonClickListeners(errorSummaryView);
        }
        observeState();
        observeCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public ErrorSummaryView onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ErrorSummaryView errorSummaryView = new ErrorSummaryView(context, null, 2, 0 == true ? 1 : 0);
        errorSummaryView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        errorSummaryView.setFitsSystemWindows(true);
        return errorSummaryView;
    }
}
