package ru.ozon.app.android.partpayment.smssign.view;

import GZ.g;
import Pc.a;
import Sc.o;
import android.view.ViewGroup;
import androidx.lifecycle.W;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.partpayment.smssign.data.SmsSignDTO;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignNoUiViewMapper;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR6\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/partpayment/smssign/data/SmsSignDTO;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignNoUiVO;", "LGZ/g;", "screenRouter", "LPc/a;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModelImpl;", "pViewModel", "<init>", "(LGZ/g;LPc/a;)V", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction$PinSuccess;", "action", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "", "pinSuccess", "(Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$NoUiAction$PinSuccess;Lru/ozon/app/android/composer/ComposerReferences;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "LGZ/g;", "LPc/a;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "isInitialized", "Z", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SmsSignNoUiViewMapper extends SingleNoUiViewMapper<SmsSignDTO, SmsSignNoUiVO> {
    private boolean isInitialized;

    @NotNull
    private final Function2<SmsSignDTO, d, List<SmsSignNoUiVO>> mapper;

    @NotNull
    private final a<SmsSignViewModelImpl> pViewModel;

    @NotNull
    private final g screenRouter;

    public SmsSignNoUiViewMapper(@NotNull g screenRouter, @NotNull a<SmsSignViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.screenRouter = screenRouter;
        this.pViewModel = pViewModel;
        this.mapper = SmsSignNoUiViewMapper$mapper$1.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void constructLayout$lambda$1(SmsSignNoUiViewMapper smsSignNoUiViewMapper, ComposerReferences composerReferences, SmsSignViewModel.NoUiAction noUiAction) {
        if (noUiAction instanceof SmsSignViewModel.NoUiAction.PinSuccess) {
            smsSignNoUiViewMapper.pinSuccess((SmsSignViewModel.NoUiAction.PinSuccess) noUiAction, composerReferences);
        } else {
            if (!Intrinsics.d(noUiAction, SmsSignViewModel.NoUiAction.ReSendPin.INSTANCE)) {
                throw new o();
            }
            InterfaceC7851b.a.a(composerReferences.getController(), null, null, null, null, 15);
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    private final void pinSuccess(SmsSignViewModel.NoUiAction.PinSuccess action, ComposerReferences references) {
        if (action.getIsCompleted()) {
            references.getNavigator().popBackStack();
        }
        g.a.a(this.screenRouter, action.getDeeplink(), null, null, 6);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull final ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        ((SmsSignViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.partpayment.smssign.view.SmsSignNoUiViewMapper$constructLayout$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = SmsSignNoUiViewMapper.this.pViewModel;
                SmsSignViewModelImpl smsSignViewModelImpl = (SmsSignViewModelImpl) aVar.get();
                Intrinsics.g(smsSignViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return smsSignViewModelImpl;
            }
        }).a(SmsSignViewModelImpl.class)).getNoUiAction().observe(references.getContainer().j(), new W() { // from class: fC.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                SmsSignNoUiViewMapper.constructLayout$lambda$1(SmsSignNoUiViewMapper.this, references, (SmsSignViewModel.NoUiAction) obj);
            }
        });
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<SmsSignDTO, d, List<SmsSignNoUiVO>> getMapper() {
        return this.mapper;
    }
}
