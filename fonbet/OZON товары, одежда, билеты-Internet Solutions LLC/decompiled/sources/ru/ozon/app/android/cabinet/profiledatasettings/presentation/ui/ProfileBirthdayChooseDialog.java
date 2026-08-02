package ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui;

import Au.e;
import Ib.a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.cabinet.databinding.ChooseBirthdayDialogFragmentBinding;
import ru.ozon.app.android.cabinet.profiledatasettings.di.DaggerProfileDataSettingsComponent;
import ru.ozon.app.android.cabinet.profiledatasettings.di.ProfileDataSettingsComponent;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.viewmodel.ProfileDataSettingsViewModel;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.date.OzonDatePicker;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/ui/ProfileBirthdayChooseDialog;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "resultCode", "", "sendResult", "(I)V", "initClicks", "initDatePicker", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "message", "showError", "(Ljava/lang/String;)V", "Lru/ozon/app/android/cabinet/databinding/ChooseBirthdayDialogFragmentBinding;", "binding", "Lru/ozon/app/android/cabinet/databinding/ChooseBirthdayDialogFragmentBinding;", "LIb/a;", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel;", "pViewModel", "LIb/a;", "getPViewModel", "()LIb/a;", "setPViewModel", "(LIb/a;)V", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "shownFlashbar", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "viewModel", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/viewmodel/ProfileDataSettingsViewModel;", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProfileBirthdayChooseDialog extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private ChooseBirthdayDialogFragmentBinding binding;
    public a<ProfileDataSettingsViewModel> pViewModel;
    private Flashbar shownFlashbar;
    private ProfileDataSettingsViewModel viewModel;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cabinet/profiledatasettings/presentation/ui/ProfileBirthdayChooseDialog$Companion;", "", "<init>", "()V", "MIN_DAY", "", "MIN_MONTH", "MIN_YEAR", "newInstance", "Lru/ozon/app/android/cabinet/profiledatasettings/presentation/ui/ProfileBirthdayChooseDialog;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ProfileBirthdayChooseDialog newInstance() {
            return new ProfileBirthdayChooseDialog();
        }

        private Companion() {
        }
    }

    private final void initClicks() {
        ChooseBirthdayDialogFragmentBinding chooseBirthdayDialogFragmentBinding = this.binding;
        if (chooseBirthdayDialogFragmentBinding != null) {
            chooseBirthdayDialogFragmentBinding.okBtn.setOnClickListener(new e(2, this, chooseBirthdayDialogFragmentBinding));
            chooseBirthdayDialogFragmentBinding.cancelBtn.setOnClickListener(new BS.a(this, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClicks$lambda$7$lambda$5(ProfileBirthdayChooseDialog profileBirthdayChooseDialog, ChooseBirthdayDialogFragmentBinding chooseBirthdayDialogFragmentBinding, View view) {
        ProfileDataSettingsViewModel profileDataSettingsViewModel = profileBirthdayChooseDialog.viewModel;
        if (profileDataSettingsViewModel != null) {
            profileDataSettingsViewModel.updateBirthday(chooseBirthdayDialogFragmentBinding.datePicker.getDayOfMonth(), chooseBirthdayDialogFragmentBinding.datePicker.getMonth(), chooseBirthdayDialogFragmentBinding.datePicker.getYear());
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    private final void initDatePicker() {
        OzonDatePicker ozonDatePicker;
        ChooseBirthdayDialogFragmentBinding chooseBirthdayDialogFragmentBinding = this.binding;
        if (chooseBirthdayDialogFragmentBinding == null || (ozonDatePicker = chooseBirthdayDialogFragmentBinding.datePicker) == null) {
            return;
        }
        ProfileDataSettingsViewModel profileDataSettingsViewModel = this.viewModel;
        if (profileDataSettingsViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        LocalDate userBirthday = profileDataSettingsViewModel.getUserBirthday();
        ozonDatePicker.updateDate(userBirthday.s(), userBirthday.n() - 1, userBirthday.i());
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(2, 0);
        calendar.set(1, 1900);
        ozonDatePicker.setMinDate(calendar.getTimeInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendResult(int resultCode) {
        Intent intent = new Intent();
        ComponentCallbacksC5392m targetFragment = getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(getTargetRequestCode(), resultCode, intent);
            Unit unit = Unit.f71690a;
        }
        dismiss();
    }

    @NotNull
    public final a<ProfileDataSettingsViewModel> getPViewModel() {
        a<ProfileDataSettingsViewModel> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProfileDataSettingsComponent.Factory factory = DaggerProfileDataSettingsComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
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
        factory.create(networkComponentApi, accountComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, (ContextComponentDependencies) dependencyStorage6.b(ContextComponentDependencies.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProfileDataSettingsViewModel profileDataSettingsViewModel = (ProfileDataSettingsViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileBirthdayChooseDialog$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ProfileDataSettingsViewModel profileDataSettingsViewModel2 = ProfileBirthdayChooseDialog.this.getPViewModel().get();
                Intrinsics.g(profileDataSettingsViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return profileDataSettingsViewModel2;
            }
        }).a(ProfileDataSettingsViewModel.class);
        this.viewModel = profileDataSettingsViewModel;
        if (profileDataSettingsViewModel != null) {
            profileDataSettingsViewModel.getSingleAction().observe(this, new ProfileBirthdayChooseDialog$sam$androidx_lifecycle_Observer$0(new ProfileBirthdayChooseDialog$onCreate$2(this)));
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ChooseBirthdayDialogFragmentBinding inflate = ChooseBirthdayDialogFragmentBinding.inflate(inflater, container, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initClicks();
        initDatePicker();
    }

    public final void showError(String message) {
        Flashbar flashbar = this.shownFlashbar;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        ViewGroup rootView = ContextExtKt.getRootView(getActivity());
        if (rootView != null) {
            String string = StringProvider.getString(R$string.error_common_message_service_error);
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            if (message != null) {
                string = message;
            }
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(string);
            int i11 = R$drawable.ic_warning;
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Flashbar create$default = FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 10000L, null, null, viewLifecycleOwner, 57306, null);
            this.shownFlashbar = create$default;
            create$default.show();
        }
    }
}
