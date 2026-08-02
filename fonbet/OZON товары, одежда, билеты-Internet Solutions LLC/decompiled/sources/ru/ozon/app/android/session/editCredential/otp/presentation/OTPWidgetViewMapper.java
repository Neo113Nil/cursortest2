package ru.ozon.app.android.session.editCredential.otp.presentation;

import A00.a;
import GZ.g;
import Pc.a;
import a00.C4908c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.domain.session.updatekey.OnSmsReceived;
import ru.ozon.app.android.domain.session.updatekey.OnTimerUpdate;
import ru.ozon.app.android.domain.session.utils.OTPPeriodFormatterBuilder;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.databinding.WidgetOtpBinding;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetMapper;
import ru.ozon.app.android.session.editCredential.otp.presentation.viewmodel.OTPWidgetViewModelImpl;
import ru.ozon.app.android.ui.session.routing.AuthRouter;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u001b0\u001aj\u0002`\u001c2\n\u0010\u001f\u001a\u00060\u001bj\u0002`\u001eH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001f\u001a\u00060\u001bj\u0002`\u001e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010$J+\u0010%\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010\u001f\u001a\u00060\u001bj\u0002`\u001eH\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R(\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001102018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO;", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/session/editCredential/otp/presentation/viewmodel/OTPWidgetViewModelImpl;", "pViewModel", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;", "periodFormatterBuilder", "<init>", "(Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetMapper;LPc/a;LGZ/g;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;)Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetVO;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "removeView", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetMapper;", "getMapper", "()Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetMapper;", "LPc/a;", "LGZ/g;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetBinder;", "binder", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetBinder;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OTPWidgetViewMapper extends SingleNoUiViewMapper<OTPWidgetDTO, OTPWidgetVO> {
    private OTPWidgetBinder binder;

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private final OTPWidgetMapper mapper;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final a<OTPWidgetViewModelImpl> pViewModel;

    @NotNull
    private final OTPPeriodFormatterBuilder periodFormatterBuilder;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    public OTPWidgetViewMapper(@NotNull OTPWidgetMapper mapper, @NotNull Pc.a<OTPWidgetViewModelImpl> pViewModel, @NotNull g ozonRouter, @NotNull JsonSerializer jsonSerializer, @NotNull OTPPeriodFormatterBuilder periodFormatterBuilder) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(periodFormatterBuilder, "periodFormatterBuilder");
        this.mapper = mapper;
        this.pViewModel = pViewModel;
        this.ozonRouter = ozonRouter;
        this.jsonSerializer = jsonSerializer;
        this.periodFormatterBuilder = periodFormatterBuilder;
        this.supportedUpdates = C7714v.b0(OnSmsReceived.class, OnTimerUpdate.class);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        OTPWidgetViewModelImpl oTPWidgetViewModelImpl = (OTPWidgetViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetViewMapper$bind$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Pc.a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = OTPWidgetViewMapper.this.pViewModel;
                OTPWidgetViewModelImpl oTPWidgetViewModelImpl2 = (OTPWidgetViewModelImpl) aVar.get();
                Intrinsics.g(oTPWidgetViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return oTPWidgetViewModelImpl2;
            }
        }).a(OTPWidgetViewModelImpl.class);
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetVO");
        oTPWidgetViewModelImpl.bind((OTPWidgetVO) d11, viewObject.n());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        if (composerRootView.findViewById(R$id.rootSv) == null) {
            WidgetOtpBinding inflate = WidgetOtpBinding.inflate(LayoutInflater.from(references.getContainer().i()), composerRootView, true);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            OTPWidgetViewHolder oTPWidgetViewHolder = new OTPWidgetViewHolder(inflate, references.getContainer().g(), this.periodFormatterBuilder, references.getContainer());
            C4908c g10 = references.getContainer().g();
            OTPWidgetViewModelImpl oTPWidgetViewModelImpl = (OTPWidgetViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetViewMapper$constructLayout$$inlined$createViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Pc.a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = OTPWidgetViewMapper.this.pViewModel;
                    OTPWidgetViewModelImpl oTPWidgetViewModelImpl2 = (OTPWidgetViewModelImpl) aVar.get();
                    Intrinsics.g(oTPWidgetViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return oTPWidgetViewModelImpl2;
                }
            }).a(OTPWidgetViewModelImpl.class);
            AuthRouter authRouter = new AuthRouter(references.getContainer(), references.getNavigator(), this.ozonRouter, this.jsonSerializer);
            Intrinsics.f(oTPWidgetViewModelImpl);
            this.binder = new OTPWidgetBinder(oTPWidgetViewHolder, oTPWidgetViewModelImpl, g10, references.getController(), authRouter);
        }
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void removeView(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull l viewObject) {
        View findViewById;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        OTPWidgetBinder oTPWidgetBinder = this.binder;
        if (oTPWidgetBinder != null) {
            oTPWidgetBinder.onDestroyView();
        }
        this.binder = null;
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(composerRootView);
        if (composerCoordinatorLayout == null || (findViewById = composerCoordinatorLayout.findViewById(R$id.rootSv)) == null) {
            return;
        }
        composerCoordinatorLayout.removeView(findViewById);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public OTPWidgetMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper, c20.r, I00.d
    @NotNull
    public OTPWidgetVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull OTPWidgetVO oldItem) {
        OTPWidgetVO copy;
        OTPWidgetVO copy2;
        OTPWidgetVO copy3;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof OnSmsReceived) {
            copy3 = oldItem.copy((r29 & 1) != 0 ? oldItem.id : 0L, (r29 & 2) != 0 ? oldItem.title : null, (r29 & 4) != 0 ? oldItem.subtitle : null, (r29 & 8) != 0 ? oldItem.action : null, (r29 & 16) != 0 ? oldItem.input : null, (r29 & 32) != 0 ? oldItem.retryButton : null, (r29 & 64) != 0 ? oldItem.hintButtons : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.isButtonShowing : null, (r29 & 256) != 0 ? oldItem.otpLength : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.errorLogoUrl : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.pageType : null, (r29 & 2048) != 0 ? oldItem.otpSms : ((OnSmsReceived) update).getSms(), (r29 & 4096) != 0 ? oldItem.requestTimes : 0);
            return copy3;
        }
        if (update instanceof OnTimerUpdate) {
            copy2 = oldItem.copy((r29 & 1) != 0 ? oldItem.id : 0L, (r29 & 2) != 0 ? oldItem.title : null, (r29 & 4) != 0 ? oldItem.subtitle : null, (r29 & 8) != 0 ? oldItem.action : null, (r29 & 16) != 0 ? oldItem.input : null, (r29 & 32) != 0 ? oldItem.retryButton : null, (r29 & 64) != 0 ? oldItem.hintButtons : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.isButtonShowing : null, (r29 & 256) != 0 ? oldItem.otpLength : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.errorLogoUrl : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.pageType : null, (r29 & 2048) != 0 ? oldItem.otpSms : null, (r29 & 4096) != 0 ? oldItem.requestTimes : oldItem.getRequestTimes() + 1);
            return copy2;
        }
        copy = oldItem.copy((r29 & 1) != 0 ? oldItem.id : 0L, (r29 & 2) != 0 ? oldItem.title : null, (r29 & 4) != 0 ? oldItem.subtitle : null, (r29 & 8) != 0 ? oldItem.action : null, (r29 & 16) != 0 ? oldItem.input : null, (r29 & 32) != 0 ? oldItem.retryButton : null, (r29 & 64) != 0 ? oldItem.hintButtons : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.isButtonShowing : null, (r29 & 256) != 0 ? oldItem.otpLength : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.errorLogoUrl : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.pageType : null, (r29 & 2048) != 0 ? oldItem.otpSms : null, (r29 & 4096) != 0 ? oldItem.requestTimes : 0);
        return copy;
    }
}
