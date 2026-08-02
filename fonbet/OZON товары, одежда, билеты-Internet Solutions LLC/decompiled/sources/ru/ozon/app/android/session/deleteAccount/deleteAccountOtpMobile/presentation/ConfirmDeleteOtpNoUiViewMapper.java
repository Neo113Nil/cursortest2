package ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation;

import GZ.g;
import Pc.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.domain.session.utils.OTPPeriodFormatterBuilder;
import ru.ozon.app.android.session.databinding.WidgetConfirmDeleteOtpLayoutBinding;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.ConfirmDeleteOtpDTO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.data.InputTypeMapper;
import ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpVO;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0010\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00180\u0017j\u0002`\u00192\n\u0010\u001c\u001a\u00060\u0018j\u0002`\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u001c\u001a\u00060\u0018j\u0002`\u001bH\u0016¢\u0006\u0004\b \u0010!J+\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u001c\u001a\u00060\u0018j\u0002`\u001b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'R6\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060)j\u0002`*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030+0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;", "LPc/a;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpViewModelImpl;", "pViewModel", "LGZ/g;", "router", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/InputTypeMapper;", "inputTypeMapper", "Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;", "periodFormatterBuilder", "<init>", "(LPc/a;LGZ/g;Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/InputTypeMapper;Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;)V", "", "stateId", "toVO", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/ConfirmDeleteOtpDTO;Ljava/lang/String;)Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpVO;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "removeView", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "LPc/a;", "LGZ/g;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/data/InputTypeMapper;", "Lru/ozon/app/android/domain/session/utils/OTPPeriodFormatterBuilder;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpBinder;", "binder", "Lru/ozon/app/android/session/deleteAccount/deleteAccountOtpMobile/presentation/ConfirmDeleteOtpBinder;", "Lru/ozon/app/android/session/databinding/WidgetConfirmDeleteOtpLayoutBinding;", "binding", "Lru/ozon/app/android/session/databinding/WidgetConfirmDeleteOtpLayoutBinding;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConfirmDeleteOtpNoUiViewMapper extends SingleNoUiViewMapper<ConfirmDeleteOtpDTO, ConfirmDeleteOtpVO> {
    private ConfirmDeleteOtpBinder binder;
    private WidgetConfirmDeleteOtpLayoutBinding binding;

    @NotNull
    private final InputTypeMapper inputTypeMapper;

    @NotNull
    private final Function2<ConfirmDeleteOtpDTO, d, List<ConfirmDeleteOtpVO>> mapper;

    @NotNull
    private final a<ConfirmDeleteOtpViewModelImpl> pViewModel;

    @NotNull
    private final OTPPeriodFormatterBuilder periodFormatterBuilder;

    @NotNull
    private final g router;

    public ConfirmDeleteOtpNoUiViewMapper(@NotNull a<ConfirmDeleteOtpViewModelImpl> pViewModel, @NotNull g router, @NotNull InputTypeMapper inputTypeMapper, @NotNull OTPPeriodFormatterBuilder periodFormatterBuilder) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(inputTypeMapper, "inputTypeMapper");
        Intrinsics.checkNotNullParameter(periodFormatterBuilder, "periodFormatterBuilder");
        this.pViewModel = pViewModel;
        this.router = router;
        this.inputTypeMapper = inputTypeMapper;
        this.periodFormatterBuilder = periodFormatterBuilder;
        this.mapper = new ConfirmDeleteOtpNoUiViewMapper$mapper$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfirmDeleteOtpVO toVO(ConfirmDeleteOtpDTO confirmDeleteOtpDTO, String str) {
        long hashCode = str.hashCode();
        String title = confirmDeleteOtpDTO.getTitle();
        String text = confirmDeleteOtpDTO.getText();
        String action = confirmDeleteOtpDTO.getAction();
        ConfirmDeleteOtpDTO.Timer timer = confirmDeleteOtpDTO.getTimer();
        ConfirmDeleteOtpDTO.Input input = confirmDeleteOtpDTO.getInput();
        ConfirmDeleteOtpVO.Input input2 = input != null ? new ConfirmDeleteOtpVO.Input(this.inputTypeMapper.map(confirmDeleteOtpDTO.getInput().getType()), input.getName()) : null;
        ConfirmDeleteOtpDTO.Button submitButton = confirmDeleteOtpDTO.getSubmitButton();
        return new ConfirmDeleteOtpVO(hashCode, title, text, action, input2, timer, submitButton != null ? new ConfirmDeleteOtpVO.Button(submitButton.getTitle(), submitButton.getAction()) : null, confirmDeleteOtpDTO.getOtpLength());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        ConfirmDeleteOtpBinder confirmDeleteOtpBinder = this.binder;
        if (confirmDeleteOtpBinder != null) {
            c d11 = viewObject.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpVO");
            confirmDeleteOtpBinder.bind((ConfirmDeleteOtpVO) d11);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ConfirmDeleteOtpViewModelImpl confirmDeleteOtpViewModelImpl = (ConfirmDeleteOtpViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.session.deleteAccount.deleteAccountOtpMobile.presentation.ConfirmDeleteOtpNoUiViewMapper$constructLayout$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ConfirmDeleteOtpNoUiViewMapper.this.pViewModel;
                ConfirmDeleteOtpViewModelImpl confirmDeleteOtpViewModelImpl2 = (ConfirmDeleteOtpViewModelImpl) aVar.get();
                Intrinsics.g(confirmDeleteOtpViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return confirmDeleteOtpViewModelImpl2;
            }
        }).a(ConfirmDeleteOtpViewModelImpl.class);
        Intrinsics.f(confirmDeleteOtpViewModelImpl);
        ConfirmDeleteOtpBinder confirmDeleteOtpBinder = new ConfirmDeleteOtpBinder(confirmDeleteOtpViewModelImpl, this.router, references.getContainer(), references);
        this.binder = confirmDeleteOtpBinder;
        WidgetConfirmDeleteOtpLayoutBinding inflate = WidgetConfirmDeleteOtpLayoutBinding.inflate(LayoutInflater.from(composerRootView.getContext()), composerRootView, true);
        this.binding = inflate;
        Intrinsics.checkNotNullExpressionValue(inflate, "also(...)");
        confirmDeleteOtpBinder.setView(new ConfirmDeleteOtpWidgetView(inflate, references.getContainer().g(), this.periodFormatterBuilder));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<ConfirmDeleteOtpDTO, d, List<ConfirmDeleteOtpVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void removeView(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        WidgetConfirmDeleteOtpLayoutBinding widgetConfirmDeleteOtpLayoutBinding = this.binding;
        composerRootView.removeView(widgetConfirmDeleteOtpLayoutBinding != null ? widgetConfirmDeleteOtpLayoutBinding.deleteOtpContainer : null);
        Unit unit = Unit.f71690a;
        this.binder = null;
        this.binding = null;
    }
}
