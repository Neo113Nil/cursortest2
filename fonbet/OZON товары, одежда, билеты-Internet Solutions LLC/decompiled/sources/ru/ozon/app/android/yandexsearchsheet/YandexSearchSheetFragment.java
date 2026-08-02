package ru.ozon.app.android.yandexsearchsheet;

import B90.C2618u;
import B90.q0;
import GZ.g;
import N3.C3660k;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import W10.c;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.bottomsheet.b;
import com.google.android.material.textfield.TextInputEditText;
import com.squareup.moshi.j;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.atoms.utils.EditTextExtKt;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.map.databinding.FragmentSearchSheetBinding;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.adapter.YandexSuggestionsAdapter;
import ru.ozon.app.android.yandexsearchsheet.di.DaggerYandexSearchSheetComponent;
import ru.ozon.app.android.yandexsearchsheet.di.YandexSearchSheetComponent;
import ru.ozon.mapsdk.common.geoproxy.data.model.AnalyticModuleState;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;
import ru.ozon.uni.android.component.sheet.SheetDialog;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 L2\u00020\u0001:\u0002LMB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "LPc/a;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel$suggestions_search_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$suggestions_search_prodGoogleAllVendorsRelease", "(LPc/a;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel;", "viewModel", "Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter;", "suggestionsAdapter", "Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter;", "getSuggestionsAdapter", "()Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter;", "setSuggestionsAdapter", "(Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter;)V", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetBinder;", "binder", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetBinder;", "getBinder", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetBinder;", "setBinder", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetBinder;)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "keyboardShowRunnable", "Ljava/lang/Runnable;", "Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;", "binding", "Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;", "Companion", "Data", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YandexSearchSheetFragment extends b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public YandexSearchSheetBinder binder;
    private FragmentSearchSheetBinding binding;
    public a<YandexSearchSheetViewModelImpl> pViewModel;
    public g router;
    public YandexSuggestionsAdapter suggestionsAdapter;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new YandexSearchSheetFragment$viewModel$2(this));

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @NotNull
    private Runnable keyboardShowRunnable = new q0(this, 1);

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "initialData", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment;", "newInstance", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;LW10/c;)Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment;", "Lru/ozon/app/android/yandexsearchsheet/ShowYandexSearchSheetAction;", "showYandexSearchSheetAction", "Landroidx/fragment/app/m;", "fragment", "Landroidx/fragment/app/G;", "fragmentManager", "", "show", "(Lru/ozon/app/android/yandexsearchsheet/ShowYandexSearchSheetAction;Landroidx/fragment/app/m;Landroidx/fragment/app/G;)V", "", "ARG_TRACKING_DATA", "Ljava/lang/String;", "", "REQUEST_CODE_YANDEX_SEARCH_FROM_FORM", "I", "REQUEST_CODE_YANDEX_SEARCH_FROM_MAP", "EXTRA_DATA", "DEF_SEARCH_LENGTH", "", "SHOW_KEYBOARD_DELAY_MILLIS", "J", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final YandexSearchSheetFragment newInstance(@NotNull Data initialData, c trackingData) {
            Intrinsics.checkNotNullParameter(initialData, "initialData");
            YandexSearchSheetFragment yandexSearchSheetFragment = new YandexSearchSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_DATA", initialData);
            if (trackingData != null) {
                bundle.putParcelable("ARG_TRACKING_DATA", trackingData);
            }
            yandexSearchSheetFragment.setArguments(bundle);
            return yandexSearchSheetFragment;
        }

        public final void show(@NotNull ShowYandexSearchSheetAction showYandexSearchSheetAction, @NotNull ComponentCallbacksC5392m fragment, @NotNull G fragmentManager) {
            Intrinsics.checkNotNullParameter(showYandexSearchSheetAction, "showYandexSearchSheetAction");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            YandexSearchSheetFragment newInstance = newInstance(showYandexSearchSheetAction.getSearchSheetData(), showYandexSearchSheetAction.getTrackingData());
            newInstance.setTargetFragment(fragment, showYandexSearchSheetAction.getRequestCode());
            newInstance.show(fragmentManager, YandexSearchSheetFragment.class.toString());
        }

        private Companion() {
        }
    }

    private final YandexSearchSheetViewModel getViewModel() {
        Object value = this.viewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (YandexSearchSheetViewModel) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keyboardShowRunnable$lambda$1(YandexSearchSheetFragment yandexSearchSheetFragment) {
        TextInputEditText textInputEditText;
        FragmentSearchSheetBinding fragmentSearchSheetBinding = yandexSearchSheetFragment.binding;
        if (fragmentSearchSheetBinding == null || (textInputEditText = fragmentSearchSheetBinding.fieldEt) == null) {
            return;
        }
        textInputEditText.requestFocus();
        KeyboardUtilsKt.showKeyboard(yandexSearchSheetFragment, textInputEditText);
    }

    @NotNull
    public final YandexSearchSheetBinder getBinder() {
        YandexSearchSheetBinder yandexSearchSheetBinder = this.binder;
        if (yandexSearchSheetBinder != null) {
            return yandexSearchSheetBinder;
        }
        Intrinsics.n("binder");
        throw null;
    }

    @NotNull
    public final a<YandexSearchSheetViewModelImpl> getPViewModel$suggestions_search_prodGoogleAllVendorsRelease() {
        a<YandexSearchSheetViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @NotNull
    public final g getRouter() {
        g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @NotNull
    public final YandexSuggestionsAdapter getSuggestionsAdapter() {
        YandexSuggestionsAdapter yandexSuggestionsAdapter = this.suggestionsAdapter;
        if (yandexSuggestionsAdapter != null) {
            return yandexSuggestionsAdapter;
        }
        Intrinsics.n("suggestionsAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        c cVar;
        Intrinsics.checkNotNullParameter(context, "context");
        YandexSearchSheetComponent.Factory factory = DaggerYandexSearchSheetComponent.factory();
        Bundle arguments = getArguments();
        if (arguments == null || (cVar = (c) arguments.getParcelable("ARG_TRACKING_DATA")) == null) {
            cVar = new c(null, null, null);
        }
        c cVar2 = cVar;
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, MapCommonComponentApi.class).getDependencyStorage();
        if (MapCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component MapCommonComponentApi is not DiComponent");
        }
        MapCommonComponentApi mapCommonComponentApi = (MapCommonComponentApi) dependencyStorage3.b(MapCommonComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage4.b(ComposerComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage5.b(ActionComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage6.b(ContextComponentDependencies.class);
        C6740b dependencyStorage7 = C6739a.b(this, LocationComponentApi.class).getDependencyStorage();
        if (LocationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LocationComponentApi is not DiComponent");
        }
        factory.create(cVar2, networkComponentApi, navigationComponentApi, mapCommonComponentApi, composerComponentApi, actionComponentApi, contextComponentDependencies, (LocationComponentApi) dependencyStorage7.b(LocationComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBinder(new YandexSearchSheetBinder(this, getViewModel(), getRouter()));
        YandexSearchSheetViewModel viewModel = getViewModel();
        Bundle arguments = getArguments();
        Data data = arguments != null ? (Data) arguments.getParcelable("ARG_DATA") : null;
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        viewModel.bindInitial(data);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new SheetDialog(requireContext, 0, true, 0, false, false, null, null, false, false, null, false, 0, false, null, 32762, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentSearchSheetBinding inflate = FragmentSearchSheetBinding.inflate(LayoutInflater.from(getContext()), null, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.root;
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.handler.removeCallbacks(this.keyboardShowRunnable);
        this.binding = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        KeyboardUtilsKt.hideKeyboard(this);
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        this.handler.postDelayed(this.keyboardShowRunnable, 100L);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        TextInputEditText textInputEditText;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinder().setView(new YandexSearchSheetView(this.binding, getSuggestionsAdapter(), m.e.DEFAULT_SWIPE_ANIMATION_DURATION));
        FragmentSearchSheetBinding fragmentSearchSheetBinding = this.binding;
        if (fragmentSearchSheetBinding == null || (textInputEditText = fragmentSearchSheetBinding.fieldEt) == null) {
            return;
        }
        EditTextExtKt.setupBackgroundForSelect(textInputEditText);
    }

    public final void setBinder(@NotNull YandexSearchSheetBinder yandexSearchSheetBinder) {
        Intrinsics.checkNotNullParameter(yandexSearchSheetBinder, "<set-?>");
        this.binder = yandexSearchSheetBinder;
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001<Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0082\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b5\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "Landroid/os/Parcelable;", "", "fieldName", "sheetTitle", "hint", "startQuery", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "searchOptions", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "selectedSuggest", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest;", "mapInfoRequest", "contextLocationUid", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "geoProviderConfig", "Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "analyticsModuleState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;)Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFieldName", "getSheetTitle", "getHint", "getStartQuery", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "getSearchOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$YandexSearchField$SearchOptions;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "getSelectedSuggest", "()Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest;", "getMapInfoRequest", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest;", "getContextLocationUid", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "getGeoProviderConfig", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "getAnalyticsModuleState", "()Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "MapInfoRequest", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new Creator();
        private final AnalyticModuleState analyticsModuleState;
        private final String contextLocationUid;

        @NotNull
        private final String fieldName;
        private final GeoProviderConfig geoProviderConfig;

        @NotNull
        private final String hint;
        private final MapInfoRequest mapInfoRequest;

        @NotNull
        private final FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions;
        private final SuggestVO.Suggest.SuggestInfo selectedSuggest;
        private final String sheetTitle;
        private final String startQuery;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), FormBuilderBlockVO.Field.YandexSearchField.SearchOptions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuggestVO.Suggest.SuggestInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MapInfoRequest.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (GeoProviderConfig) parcel.readParcelable(Data.class.getClassLoader()), (AnalyticModuleState) parcel.readParcelable(Data.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i11) {
                return new Data[i11];
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest;", "Landroid/os/Parcelable;", "mapInfo", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest$MapInfo;", "<init>", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest$MapInfo;)V", "getMapInfo", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest$MapInfo;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MapInfo", "PreferredGeoProviders", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class MapInfoRequest implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<MapInfoRequest> CREATOR = new Creator();

            @NotNull
            private final MapInfo mapInfo;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<MapInfoRequest> {
                @Override // android.os.Parcelable.Creator
                public final MapInfoRequest createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new MapInfoRequest(MapInfo.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final MapInfoRequest[] newArray(int i11) {
                    return new MapInfoRequest[i11];
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest$MapInfo;", "Landroid/os/Parcelable;", "geoSessionId", "", "preferredGeoProviders", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest$PreferredGeoProviders;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest$PreferredGeoProviders;)V", "getGeoSessionId", "()Ljava/lang/String;", "getPreferredGeoProviders", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest$PreferredGeoProviders;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class MapInfo implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<MapInfo> CREATOR = new Creator();
                private final String geoSessionId;

                @NotNull
                private final PreferredGeoProviders preferredGeoProviders;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<MapInfo> {
                    @Override // android.os.Parcelable.Creator
                    public final MapInfo createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new MapInfo(parcel.readString(), PreferredGeoProviders.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final MapInfo[] newArray(int i11) {
                        return new MapInfo[i11];
                    }
                }

                public MapInfo(String str, @NotNull PreferredGeoProviders preferredGeoProviders) {
                    Intrinsics.checkNotNullParameter(preferredGeoProviders, "preferredGeoProviders");
                    this.geoSessionId = str;
                    this.preferredGeoProviders = preferredGeoProviders;
                }

                public static /* synthetic */ MapInfo copy$default(MapInfo mapInfo, String str, PreferredGeoProviders preferredGeoProviders, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = mapInfo.geoSessionId;
                    }
                    if ((i11 & 2) != 0) {
                        preferredGeoProviders = mapInfo.preferredGeoProviders;
                    }
                    return mapInfo.copy(str, preferredGeoProviders);
                }

                /* renamed from: component1, reason: from getter */
                public final String getGeoSessionId() {
                    return this.geoSessionId;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final PreferredGeoProviders getPreferredGeoProviders() {
                    return this.preferredGeoProviders;
                }

                @NotNull
                public final MapInfo copy(String geoSessionId, @NotNull PreferredGeoProviders preferredGeoProviders) {
                    Intrinsics.checkNotNullParameter(preferredGeoProviders, "preferredGeoProviders");
                    return new MapInfo(geoSessionId, preferredGeoProviders);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MapInfo)) {
                        return false;
                    }
                    MapInfo mapInfo = (MapInfo) other;
                    return Intrinsics.d(this.geoSessionId, mapInfo.geoSessionId) && Intrinsics.d(this.preferredGeoProviders, mapInfo.preferredGeoProviders);
                }

                public final String getGeoSessionId() {
                    return this.geoSessionId;
                }

                @NotNull
                public final PreferredGeoProviders getPreferredGeoProviders() {
                    return this.preferredGeoProviders;
                }

                public int hashCode() {
                    String str = this.geoSessionId;
                    return this.preferredGeoProviders.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
                }

                @NotNull
                public String toString() {
                    return "MapInfo(geoSessionId=" + this.geoSessionId + ", preferredGeoProviders=" + this.preferredGeoProviders + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.geoSessionId);
                    this.preferredGeoProviders.writeToParcel(dest, flags);
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data$MapInfoRequest$PreferredGeoProviders;", "Landroid/os/Parcelable;", "geoCode", "", "", "revGeoCode", "suggest", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getGeoCode", "()Ljava/util/List;", "getRevGeoCode", "getSuggest", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PreferredGeoProviders implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<PreferredGeoProviders> CREATOR = new Creator();

                @NotNull
                private final List<String> geoCode;

                @NotNull
                private final List<String> revGeoCode;

                @NotNull
                private final List<String> suggest;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<PreferredGeoProviders> {
                    @Override // android.os.Parcelable.Creator
                    public final PreferredGeoProviders createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new PreferredGeoProviders(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final PreferredGeoProviders[] newArray(int i11) {
                        return new PreferredGeoProviders[i11];
                    }
                }

                public PreferredGeoProviders() {
                    this(null, null, null, 7, null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ PreferredGeoProviders copy$default(PreferredGeoProviders preferredGeoProviders, List list, List list2, List list3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        list = preferredGeoProviders.geoCode;
                    }
                    if ((i11 & 2) != 0) {
                        list2 = preferredGeoProviders.revGeoCode;
                    }
                    if ((i11 & 4) != 0) {
                        list3 = preferredGeoProviders.suggest;
                    }
                    return preferredGeoProviders.copy(list, list2, list3);
                }

                @NotNull
                public final List<String> component1() {
                    return this.geoCode;
                }

                @NotNull
                public final List<String> component2() {
                    return this.revGeoCode;
                }

                @NotNull
                public final List<String> component3() {
                    return this.suggest;
                }

                @NotNull
                public final PreferredGeoProviders copy(@NotNull List<String> geoCode, @NotNull List<String> revGeoCode, @NotNull List<String> suggest) {
                    Intrinsics.checkNotNullParameter(geoCode, "geoCode");
                    Intrinsics.checkNotNullParameter(revGeoCode, "revGeoCode");
                    Intrinsics.checkNotNullParameter(suggest, "suggest");
                    return new PreferredGeoProviders(geoCode, revGeoCode, suggest);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof PreferredGeoProviders)) {
                        return false;
                    }
                    PreferredGeoProviders preferredGeoProviders = (PreferredGeoProviders) other;
                    return Intrinsics.d(this.geoCode, preferredGeoProviders.geoCode) && Intrinsics.d(this.revGeoCode, preferredGeoProviders.revGeoCode) && Intrinsics.d(this.suggest, preferredGeoProviders.suggest);
                }

                @NotNull
                public final List<String> getGeoCode() {
                    return this.geoCode;
                }

                @NotNull
                public final List<String> getRevGeoCode() {
                    return this.revGeoCode;
                }

                @NotNull
                public final List<String> getSuggest() {
                    return this.suggest;
                }

                public int hashCode() {
                    return this.suggest.hashCode() + G.g.b(this.geoCode.hashCode() * 31, 31, this.revGeoCode);
                }

                @NotNull
                public String toString() {
                    List<String> list = this.geoCode;
                    List<String> list2 = this.revGeoCode;
                    return C2618u.h(Fj.c.d("PreferredGeoProviders(geoCode=", list, ", revGeoCode=", ", suggest=", list2), this.suggest, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@NotNull Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeStringList(this.geoCode);
                    dest.writeStringList(this.revGeoCode);
                    dest.writeStringList(this.suggest);
                }

                public PreferredGeoProviders(List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? K.f71697a : list2, (i11 & 4) != 0 ? K.f71697a : list3);
                }

                public PreferredGeoProviders(@NotNull List<String> geoCode, @NotNull List<String> revGeoCode, @NotNull List<String> suggest) {
                    Intrinsics.checkNotNullParameter(geoCode, "geoCode");
                    Intrinsics.checkNotNullParameter(revGeoCode, "revGeoCode");
                    Intrinsics.checkNotNullParameter(suggest, "suggest");
                    this.geoCode = geoCode;
                    this.revGeoCode = revGeoCode;
                    this.suggest = suggest;
                }
            }

            public MapInfoRequest(@NotNull MapInfo mapInfo) {
                Intrinsics.checkNotNullParameter(mapInfo, "mapInfo");
                this.mapInfo = mapInfo;
            }

            public static /* synthetic */ MapInfoRequest copy$default(MapInfoRequest mapInfoRequest, MapInfo mapInfo, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    mapInfo = mapInfoRequest.mapInfo;
                }
                return mapInfoRequest.copy(mapInfo);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final MapInfo getMapInfo() {
                return this.mapInfo;
            }

            @NotNull
            public final MapInfoRequest copy(@NotNull MapInfo mapInfo) {
                Intrinsics.checkNotNullParameter(mapInfo, "mapInfo");
                return new MapInfoRequest(mapInfo);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MapInfoRequest) && Intrinsics.d(this.mapInfo, ((MapInfoRequest) other).mapInfo);
            }

            @NotNull
            public final MapInfo getMapInfo() {
                return this.mapInfo;
            }

            public int hashCode() {
                return this.mapInfo.hashCode();
            }

            @NotNull
            public String toString() {
                return "MapInfoRequest(mapInfo=" + this.mapInfo + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.mapInfo.writeToParcel(dest, flags);
            }
        }

        public Data(@NotNull String fieldName, String str, @NotNull String hint, String str2, @NotNull FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions, SuggestVO.Suggest.SuggestInfo suggestInfo, MapInfoRequest mapInfoRequest, String str3, GeoProviderConfig geoProviderConfig, AnalyticModuleState analyticModuleState) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(searchOptions, "searchOptions");
            this.fieldName = fieldName;
            this.sheetTitle = str;
            this.hint = hint;
            this.startQuery = str2;
            this.searchOptions = searchOptions;
            this.selectedSuggest = suggestInfo;
            this.mapInfoRequest = mapInfoRequest;
            this.contextLocationUid = str3;
            this.geoProviderConfig = geoProviderConfig;
            this.analyticsModuleState = analyticModuleState;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions, SuggestVO.Suggest.SuggestInfo suggestInfo, MapInfoRequest mapInfoRequest, String str5, GeoProviderConfig geoProviderConfig, AnalyticModuleState analyticModuleState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.fieldName;
            }
            if ((i11 & 2) != 0) {
                str2 = data.sheetTitle;
            }
            if ((i11 & 4) != 0) {
                str3 = data.hint;
            }
            if ((i11 & 8) != 0) {
                str4 = data.startQuery;
            }
            if ((i11 & 16) != 0) {
                searchOptions = data.searchOptions;
            }
            if ((i11 & 32) != 0) {
                suggestInfo = data.selectedSuggest;
            }
            if ((i11 & 64) != 0) {
                mapInfoRequest = data.mapInfoRequest;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str5 = data.contextLocationUid;
            }
            if ((i11 & 256) != 0) {
                geoProviderConfig = data.geoProviderConfig;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                analyticModuleState = data.analyticsModuleState;
            }
            GeoProviderConfig geoProviderConfig2 = geoProviderConfig;
            AnalyticModuleState analyticModuleState2 = analyticModuleState;
            MapInfoRequest mapInfoRequest2 = mapInfoRequest;
            String str6 = str5;
            FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions2 = searchOptions;
            SuggestVO.Suggest.SuggestInfo suggestInfo2 = suggestInfo;
            return data.copy(str, str2, str3, str4, searchOptions2, suggestInfo2, mapInfoRequest2, str6, geoProviderConfig2, analyticModuleState2);
        }

        @NotNull
        public final Data copy(@NotNull String fieldName, String sheetTitle, @NotNull String hint, String startQuery, @NotNull FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions, SuggestVO.Suggest.SuggestInfo selectedSuggest, MapInfoRequest mapInfoRequest, String contextLocationUid, GeoProviderConfig geoProviderConfig, AnalyticModuleState analyticsModuleState) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(searchOptions, "searchOptions");
            return new Data(fieldName, sheetTitle, hint, startQuery, searchOptions, selectedSuggest, mapInfoRequest, contextLocationUid, geoProviderConfig, analyticsModuleState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.fieldName, data.fieldName) && Intrinsics.d(this.sheetTitle, data.sheetTitle) && Intrinsics.d(this.hint, data.hint) && Intrinsics.d(this.startQuery, data.startQuery) && Intrinsics.d(this.searchOptions, data.searchOptions) && Intrinsics.d(this.selectedSuggest, data.selectedSuggest) && Intrinsics.d(this.mapInfoRequest, data.mapInfoRequest) && Intrinsics.d(this.contextLocationUid, data.contextLocationUid) && Intrinsics.d(this.geoProviderConfig, data.geoProviderConfig) && Intrinsics.d(this.analyticsModuleState, data.analyticsModuleState);
        }

        public final AnalyticModuleState getAnalyticsModuleState() {
            return this.analyticsModuleState;
        }

        public final String getContextLocationUid() {
            return this.contextLocationUid;
        }

        @NotNull
        public final String getFieldName() {
            return this.fieldName;
        }

        public final GeoProviderConfig getGeoProviderConfig() {
            return this.geoProviderConfig;
        }

        @NotNull
        public final String getHint() {
            return this.hint;
        }

        public final MapInfoRequest getMapInfoRequest() {
            return this.mapInfoRequest;
        }

        @NotNull
        public final FormBuilderBlockVO.Field.YandexSearchField.SearchOptions getSearchOptions() {
            return this.searchOptions;
        }

        public final SuggestVO.Suggest.SuggestInfo getSelectedSuggest() {
            return this.selectedSuggest;
        }

        public final String getSheetTitle() {
            return this.sheetTitle;
        }

        public final String getStartQuery() {
            return this.startQuery;
        }

        public int hashCode() {
            int hashCode = this.fieldName.hashCode() * 31;
            String str = this.sheetTitle;
            int a11 = G.g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.hint);
            String str2 = this.startQuery;
            int hashCode2 = (this.searchOptions.hashCode() + ((a11 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            SuggestVO.Suggest.SuggestInfo suggestInfo = this.selectedSuggest;
            int hashCode3 = (hashCode2 + (suggestInfo == null ? 0 : suggestInfo.hashCode())) * 31;
            MapInfoRequest mapInfoRequest = this.mapInfoRequest;
            int hashCode4 = (hashCode3 + (mapInfoRequest == null ? 0 : mapInfoRequest.hashCode())) * 31;
            String str3 = this.contextLocationUid;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            GeoProviderConfig geoProviderConfig = this.geoProviderConfig;
            int hashCode6 = (hashCode5 + (geoProviderConfig == null ? 0 : geoProviderConfig.hashCode())) * 31;
            AnalyticModuleState analyticModuleState = this.analyticsModuleState;
            return hashCode6 + (analyticModuleState != null ? analyticModuleState.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.fieldName;
            String str2 = this.sheetTitle;
            String str3 = this.hint;
            String str4 = this.startQuery;
            FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions = this.searchOptions;
            SuggestVO.Suggest.SuggestInfo suggestInfo = this.selectedSuggest;
            MapInfoRequest mapInfoRequest = this.mapInfoRequest;
            String str5 = this.contextLocationUid;
            GeoProviderConfig geoProviderConfig = this.geoProviderConfig;
            AnalyticModuleState analyticModuleState = this.analyticsModuleState;
            StringBuilder d11 = C3660k.d("Data(fieldName=", str, ", sheetTitle=", str2, ", hint=");
            Nh.a.h(d11, str3, ", startQuery=", str4, ", searchOptions=");
            d11.append(searchOptions);
            d11.append(", selectedSuggest=");
            d11.append(suggestInfo);
            d11.append(", mapInfoRequest=");
            d11.append(mapInfoRequest);
            d11.append(", contextLocationUid=");
            d11.append(str5);
            d11.append(", geoProviderConfig=");
            d11.append(geoProviderConfig);
            d11.append(", analyticsModuleState=");
            d11.append(analyticModuleState);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fieldName);
            dest.writeString(this.sheetTitle);
            dest.writeString(this.hint);
            dest.writeString(this.startQuery);
            this.searchOptions.writeToParcel(dest, flags);
            SuggestVO.Suggest.SuggestInfo suggestInfo = this.selectedSuggest;
            if (suggestInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                suggestInfo.writeToParcel(dest, flags);
            }
            MapInfoRequest mapInfoRequest = this.mapInfoRequest;
            if (mapInfoRequest == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                mapInfoRequest.writeToParcel(dest, flags);
            }
            dest.writeString(this.contextLocationUid);
            dest.writeParcelable(this.geoProviderConfig, flags);
            dest.writeParcelable(this.analyticsModuleState, flags);
        }

        public /* synthetic */ Data(String str, String str2, String str3, String str4, FormBuilderBlockVO.Field.YandexSearchField.SearchOptions searchOptions, SuggestVO.Suggest.SuggestInfo suggestInfo, MapInfoRequest mapInfoRequest, String str5, GeoProviderConfig geoProviderConfig, AnalyticModuleState analyticModuleState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, searchOptions, (i11 & 32) != 0 ? null : suggestInfo, (i11 & 64) != 0 ? null : mapInfoRequest, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : str5, (i11 & 256) != 0 ? null : geoProviderConfig, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : analyticModuleState);
        }
    }
}
