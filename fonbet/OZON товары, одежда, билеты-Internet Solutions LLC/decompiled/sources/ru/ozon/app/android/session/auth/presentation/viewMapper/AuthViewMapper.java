package ru.ozon.app.android.session.auth.presentation.viewMapper;

import A00.a;
import GZ.g;
import Pc.a;
import a00.C4908c;
import a00.C4911f;
import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.auth.biometry.BiometryAuthenicator;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.domain.session.updatekey.auth.AuthAdvertisementStateUpdate;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.permission.extension.PermissionExtensionsKt;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.auth.data.AuthDTO;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.mapper.AuthMapper;
import ru.ozon.app.android.session.auth.presentation.AuthBinder;
import ru.ozon.app.android.session.auth.presentation.viewHolder.AuthViewHolder;
import ru.ozon.app.android.session.auth.presentation.viewmodel.AuthViewModel;
import ru.ozon.app.android.session.databinding.WidgetAuthBinding;
import ru.ozon.app.android.ui.session.biometry.BiometricAuthViewModelImpl;
import ru.ozon.app.android.ui.session.routing.AuthRouter;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001HBE\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J=\u00101\u001a\u0002002\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00162\u0010\u0010-\u001a\f\u0012\u0004\u0012\u00020+0*j\u0002`,2\n\u0010/\u001a\u00060+j\u0002`.H\u0016¢\u0006\u0004\b1\u00102J+\u00103\u001a\u0002002\u0006\u0010)\u001a\u00020(2\n\u0010/\u001a\u00060+j\u0002`.2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u00104J+\u00105\u001a\u0002002\u0006\u0010)\u001a\u00020(2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010/\u001a\u00060+j\u0002`.H\u0016¢\u0006\u0004\b5\u00106R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00107R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/viewMapper/AuthViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/session/auth/data/AuthDTO;", "Lru/ozon/app/android/session/auth/data/AuthVO;", "LPc/a;", "Lru/ozon/app/android/session/auth/presentation/viewmodel/AuthViewModel;", "pViewModel", "Lru/ozon/app/android/ui/session/biometry/BiometricAuthViewModelImpl;", "pBiometricViewModel", "Lru/ozon/app/android/account/auth/biometry/BiometryAuthenicator;", "biometryAuthenicator", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/app/android/session/auth/data/mapper/AuthMapper;", "mapper", "<init>", "(LPc/a;LPc/a;Lru/ozon/app/android/account/auth/biometry/BiometryAuthenicator;LGZ/g;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/app/android/session/auth/data/mapper/AuthMapper;)V", "oldVO", "invertAdvertisementState", "(Lru/ozon/app/android/session/auth/data/AuthVO;)Lru/ozon/app/android/session/auth/data/AuthVO;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "updateActionIfNeeded", "(Lru/ozon/app/android/session/auth/data/AuthVO;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/session/auth/data/AuthVO;", "Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;", "submitButton", "", "addPermissionQueryParam", "(Lru/ozon/app/android/session/auth/data/AuthDTO$SubmitButton;)Ljava/lang/String;", "Landroid/app/Activity;", "", "isPermissionsGranted", "(Landroid/app/Activity;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/session/auth/data/AuthVO;)Lru/ozon/app/android/session/auth/data/AuthVO;", "Landroid/view/ViewGroup;", "composerRootView", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "removeView", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "LPc/a;", "Lru/ozon/app/android/account/auth/biometry/BiometryAuthenicator;", "LGZ/g;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/app/android/session/auth/data/mapper/AuthMapper;", "getMapper", "()Lru/ozon/app/android/session/auth/data/mapper/AuthMapper;", "Lru/ozon/app/android/session/auth/presentation/AuthBinder;", "binder", "Lru/ozon/app/android/session/auth/presentation/AuthBinder;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/domain/session/updatekey/auth/AuthAdvertisementStateUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthViewMapper extends SingleNoUiViewMapper<AuthDTO, AuthVO> {
    private AuthBinder binder;

    @NotNull
    private final BiometryAuthenicator biometryAuthenicator;

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private final AuthMapper mapper;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final a<BiometricAuthViewModelImpl> pBiometricViewModel;

    @NotNull
    private final a<AuthViewModel> pViewModel;

    @NotNull
    private final List<Class<AuthAdvertisementStateUpdate>> supportedUpdates;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/viewMapper/AuthViewMapper$Companion;", "", "<init>", "()V", "PERMISSION_QUERY_PARAM_KEY", "", "PERMISSION_QUERY_PARAM_VALUE", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AuthViewMapper(@NotNull a<AuthViewModel> pViewModel, @NotNull a<BiometricAuthViewModelImpl> pBiometricViewModel, @NotNull BiometryAuthenicator biometryAuthenicator, @NotNull g ozonRouter, @NotNull JsonSerializer jsonSerializer, @NotNull AuthMapper mapper) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(pBiometricViewModel, "pBiometricViewModel");
        Intrinsics.checkNotNullParameter(biometryAuthenicator, "biometryAuthenicator");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.pViewModel = pViewModel;
        this.pBiometricViewModel = pBiometricViewModel;
        this.biometryAuthenicator = biometryAuthenicator;
        this.ozonRouter = ozonRouter;
        this.jsonSerializer = jsonSerializer;
        this.mapper = mapper;
        this.supportedUpdates = C7714v.a0(AuthAdvertisementStateUpdate.class);
    }

    private final String addPermissionQueryParam(AuthDTO.SubmitButton submitButton) {
        String uri = Uri.parse(submitButton.getAction()).buildUpon().appendQueryParameter("isNeedPermissionsScreen", "true").build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    private final AuthVO invertAdvertisementState(AuthVO oldVO) {
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio copy;
        AuthVO copy2;
        AuthVO.Advertisement advertisement = oldVO.getAdvertisement();
        Intrinsics.f(advertisement);
        copy = r1.copy((r32 & 1) != 0 ? r1.isSelected : !advertisement.getAtom().isSelected(), (r32 & 2) != 0 ? r1.isRadio : false, (r32 & 4) != 0 ? r1.isAutoToggleDisabled : false, (r32 & 8) != 0 ? r1.title : null, (r32 & 16) != 0 ? r1.titleColor : null, (r32 & 32) != 0 ? r1.subtitle : null, (r32 & 64) != 0 ? r1.subtitleColor : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r1.align : null, (r32 & 256) != 0 ? r1.maxLines : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r1.action : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r1.hideSeparator : false, (r32 & 2048) != 0 ? r1.colorDisabledAsEnabled : false, (r32 & 4096) != 0 ? r1.context : null, (r32 & 8192) != 0 ? r1.testInfo : null, (r32 & 16384) != 0 ? advertisement.getAtom().trackingInfo : null);
        copy2 = oldVO.copy((r29 & 1) != 0 ? oldVO.id : 0L, (r29 & 2) != 0 ? oldVO.title : null, (r29 & 4) != 0 ? oldVO.subtitle : null, (r29 & 8) != 0 ? oldVO.origin : null, (r29 & 16) != 0 ? oldVO.inputs : null, (r29 & 32) != 0 ? oldVO.advertisement : AuthVO.Advertisement.copy$default(advertisement, copy, null, true, 2, null), (r29 & 64) != 0 ? oldVO.submitButton : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVO.hintButtons : null, (r29 & 256) != 0 ? oldVO.loginBySberIdButton : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVO.alertEntry : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVO.annotation : null, (r29 & 2048) != 0 ? oldVO.termsOfUseText : null, (r29 & 4096) != 0 ? oldVO.translationLexemes : null);
        return copy2;
    }

    private final boolean isPermissionsGranted(Activity activity) {
        return PermissionExtensionsKt.isPermissionGranted(activity, "android.permission.READ_CALL_LOG") && PermissionExtensionsKt.isPermissionGranted(activity, "android.permission.READ_PHONE_STATE");
    }

    private final AuthVO updateActionIfNeeded(AuthVO authVO, ComposerReferences composerReferences) {
        AuthVO copy;
        AuthDTO.SubmitButton submitButton = authVO.getSubmitButton();
        if (submitButton == null || isPermissionsGranted(composerReferences.getContainer().i())) {
            return authVO;
        }
        copy = authVO.copy((r29 & 1) != 0 ? authVO.id : 0L, (r29 & 2) != 0 ? authVO.title : null, (r29 & 4) != 0 ? authVO.subtitle : null, (r29 & 8) != 0 ? authVO.origin : null, (r29 & 16) != 0 ? authVO.inputs : null, (r29 & 32) != 0 ? authVO.advertisement : null, (r29 & 64) != 0 ? authVO.submitButton : AuthDTO.SubmitButton.copy$default(submitButton, addPermissionQueryParam(submitButton), null, null, 6, null), (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? authVO.hintButtons : null, (r29 & 256) != 0 ? authVO.loginBySberIdButton : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? authVO.alertEntry : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? authVO.annotation : null, (r29 & 2048) != 0 ? authVO.termsOfUseText : null, (r29 & 4096) != 0 ? authVO.translationLexemes : null);
        return copy;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.session.auth.data.AuthVO");
        AuthVO authVO = (AuthVO) d11;
        AuthBinder authBinder = this.binder;
        if (authBinder != null) {
            authBinder.bind(updateActionIfNeeded(authVO, references), viewObject.n());
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        if (composerRootView.findViewById(R$id.authWidget) == null) {
            C4911f container = references.getContainer();
            WidgetAuthBinding inflate = WidgetAuthBinding.inflate(LayoutInflater.from(container.i()), composerRootView, true);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            C4908c g10 = container.g();
            ScrollView authWidget = inflate.authWidget;
            Intrinsics.checkNotNullExpressionValue(authWidget, "authWidget");
            AuthViewHolder authViewHolder = new AuthViewHolder(authWidget, g10, references);
            w0 a11 = new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.session.auth.presentation.viewMapper.AuthViewMapper$constructLayout$$inlined$createViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = AuthViewMapper.this.pViewModel;
                    AuthViewModel authViewModel = (AuthViewModel) aVar.get();
                    Intrinsics.g(authViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return authViewModel;
                }
            }).a(AuthViewModel.class);
            Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
            AuthViewModel authViewModel = (AuthViewModel) a11;
            AuthRouter authRouter = new AuthRouter(container, references.getNavigator(), this.ozonRouter, this.jsonSerializer);
            InterfaceC7851b controller = references.getController();
            BiometryAuthenicator biometryAuthenicator = this.biometryAuthenicator;
            w0 a12 = new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.session.auth.presentation.viewMapper.AuthViewMapper$constructLayout$$inlined$createViewModel$2
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = AuthViewMapper.this.pBiometricViewModel;
                    BiometricAuthViewModelImpl biometricAuthViewModelImpl = (BiometricAuthViewModelImpl) aVar.get();
                    Intrinsics.g(biometricAuthViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return biometricAuthViewModelImpl;
                }
            }).a(BiometricAuthViewModelImpl.class);
            Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
            this.binder = new AuthBinder(authViewHolder, authViewModel, authRouter, biometryAuthenicator, (BiometricAuthViewModelImpl) a12, controller, container);
        }
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<AuthAdvertisementStateUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void removeView(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        composerRootView.removeView(composerRootView.findViewById(R$id.authWidget));
        AuthBinder authBinder = this.binder;
        if (authBinder != null) {
            authBinder.onDestroyView();
        }
        this.binder = null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public AuthMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper, c20.r, I00.d
    @NotNull
    public AuthVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AuthVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof AuthAdvertisementStateUpdate ? invertAdvertisementState(oldItem) : oldItem;
    }
}
