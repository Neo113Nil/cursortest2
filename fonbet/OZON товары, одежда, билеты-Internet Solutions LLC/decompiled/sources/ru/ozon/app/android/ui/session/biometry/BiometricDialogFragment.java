package ru.ozon.app.android.ui.session.biometry;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.f;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.domain.session.di.auth.AuthComponentApi;
import ru.ozon.app.android.domain.session.models.BiometricDialogConfig;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.ui.session.biometry.BiometricDialogFragment;
import ru.ozon.app.android.ui.session.biometry.di.BiometricComponent;
import ru.ozon.app.android.ui.session.biometry.di.DaggerBiometricComponent;
import ru.ozon.app.android.uikit.R$string;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/ui/session/biometry/BiometricDialogFragment;", "Landroidx/fragment/app/k;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "LPc/a;", "Lru/ozon/app/android/ui/session/biometry/BiometricAuthViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel", "()LPc/a;", "setPViewModel", "(LPc/a;)V", "Lru/ozon/app/android/ui/session/biometry/BiometricAuthViewModel;", "biometricAuthViewModel$delegate", "LSc/j;", "getBiometricAuthViewModel", "()Lru/ozon/app/android/ui/session/biometry/BiometricAuthViewModel;", "biometricAuthViewModel", "Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "configBiometric", "Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "getConfigBiometric", "()Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "setConfigBiometric", "(Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;)V", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BiometricDialogFragment extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: biometricAuthViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j biometricAuthViewModel = k.b(new BiometricDialogFragment$biometricAuthViewModel$2(this));
    public BiometricDialogConfig configBiometric;
    public a<BiometricAuthViewModelImpl> pViewModel;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ui/session/biometry/BiometricDialogFragment$Companion;", "", "<init>", "()V", "EXTRA_CONFIG", "", "TAG", "newInstance", "Lru/ozon/app/android/ui/session/biometry/BiometricDialogFragment;", "config", "Lru/ozon/app/android/domain/session/models/BiometricDialogConfig;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BiometricDialogFragment newInstance(@NotNull BiometricDialogConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            BiometricDialogFragment biometricDialogFragment = new BiometricDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ru.ozon.app.android.cabinet.auth.biometry.BiometricDialogFragment.EXTRA_CONFIG", config);
            biometricDialogFragment.setArguments(bundle);
            return biometricDialogFragment;
        }

        private Companion() {
        }
    }

    private final BiometricAuthViewModel getBiometricAuthViewModel() {
        Object value = this.biometricAuthViewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (BiometricAuthViewModel) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$0(BiometricDialogFragment biometricDialogFragment, DialogInterface dialogInterface, int i11) {
        biometricDialogFragment.getBiometricAuthViewModel().onBiometryAuthAccepted(biometricDialogFragment.getConfigBiometric().getAnalyticTag(), biometricDialogFragment.getConfigBiometric().getDeeplink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$1(BiometricDialogFragment biometricDialogFragment, DialogInterface dialogInterface, int i11) {
        biometricDialogFragment.getBiometricAuthViewModel().onBiometryAuthDeclined(biometricDialogFragment.getConfigBiometric().getAnalyticTag(), biometricDialogFragment.getConfigBiometric().getDeeplink());
    }

    @NotNull
    public final BiometricDialogConfig getConfigBiometric() {
        BiometricDialogConfig biometricDialogConfig = this.configBiometric;
        if (biometricDialogConfig != null) {
            return biometricDialogConfig;
        }
        Intrinsics.n("configBiometric");
        throw null;
    }

    @NotNull
    public final a<BiometricAuthViewModelImpl> getPViewModel() {
        a<BiometricAuthViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BiometricComponent.Factory factory = DaggerBiometricComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage.b(StorageComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, AuthComponentApi.class).getDependencyStorage();
        if (AuthComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AuthComponentApi is not DiComponent");
        }
        AuthComponentApi authComponentApi = (AuthComponentApi) dependencyStorage2.b(AuthComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage3.b(AccountComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage4.b(NetworkComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage5.b(NavigationComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage6.b(ComposerComponentApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage7.b(ActionComponentApi.class);
        C6740b dependencyStorage8 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        factory.create(storageComponentApi, authComponentApi, accountComponentApi, networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, (ContextComponentDependencies) dependencyStorage8.b(ContextComponentDependencies.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        BiometricDialogConfig biometricDialogConfig = arguments != null ? (BiometricDialogConfig) arguments.getParcelable("ru.ozon.app.android.cabinet.auth.biometry.BiometricDialogFragment.EXTRA_CONFIG") : null;
        if (biometricDialogConfig == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        setConfigBiometric(biometricDialogConfig);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        f create = new f.a(requireContext()).setTitle(getConfigBiometric().getTitle()).f(getConfigBiometric().getSubtitle()).setPositiveButton(R$string.common_action_ok, new DialogInterface.OnClickListener() { // from class: gX.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BiometricDialogFragment.onCreateDialog$lambda$0(BiometricDialogFragment.this, dialogInterface, i11);
            }
        }).setNegativeButton(R$string.common_action_cancel, new DialogInterface.OnClickListener() { // from class: gX.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BiometricDialogFragment.onCreateDialog$lambda$1(BiometricDialogFragment.this, dialogInterface, i11);
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }

    public final void setConfigBiometric(@NotNull BiometricDialogConfig biometricDialogConfig) {
        Intrinsics.checkNotNullParameter(biometricDialogConfig, "<set-?>");
        this.configBiometric = biometricDialogConfig;
    }
}
