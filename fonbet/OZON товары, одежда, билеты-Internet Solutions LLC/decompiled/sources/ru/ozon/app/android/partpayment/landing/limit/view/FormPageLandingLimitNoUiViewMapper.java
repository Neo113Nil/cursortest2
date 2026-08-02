package ru.ozon.app.android.partpayment.landing.limit.view;

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
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.partpayment.landing.limit.data.FormPageLandingLimitDTO;
import ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitNoUiViewMapper;
import ru.ozon.app.android.partpayment.landing.limit.view.LandingLimitViewModel;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ=\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u00152\n\u0010\u0018\u001a\u00060\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR6\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u001ej\u0002`\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitNoUiViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/partpayment/landing/limit/data/FormPageLandingLimitDTO;", "Lru/ozon/app/android/partpayment/landing/limit/view/FormPageLandingLimitNoUiVO;", "LGZ/g;", "screenRouter", "LPc/a;", "Lru/ozon/app/android/partpayment/landing/limit/view/LandingLimitViewModelImpl;", "pViewModel", "<init>", "(LGZ/g;LPc/a;)V", "Landroid/view/ViewGroup;", "composerRootView", "", "showLoader", "(Landroid/view/ViewGroup;)V", "hideLoader", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "LGZ/g;", "LPc/a;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "isInitialized", "Z", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormPageLandingLimitNoUiViewMapper extends SingleNoUiViewMapper<FormPageLandingLimitDTO, FormPageLandingLimitNoUiVO> {
    private boolean isInitialized;

    @NotNull
    private final Function2<FormPageLandingLimitDTO, d, List<FormPageLandingLimitNoUiVO>> mapper;

    @NotNull
    private final a<LandingLimitViewModelImpl> pViewModel;

    @NotNull
    private final g screenRouter;

    public FormPageLandingLimitNoUiViewMapper(@NotNull g screenRouter, @NotNull a<LandingLimitViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(screenRouter, "screenRouter");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.screenRouter = screenRouter;
        this.pViewModel = pViewModel;
        this.mapper = FormPageLandingLimitNoUiViewMapper$mapper$1.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void constructLayout$lambda$2(ComposerReferences composerReferences, FormPageLandingLimitNoUiViewMapper formPageLandingLimitNoUiViewMapper, ViewGroup viewGroup, LandingLimitViewModel.NoUiAction noUiAction) {
        if (noUiAction instanceof LandingLimitViewModel.NoUiAction.SendSuccess) {
            composerReferences.getContainer().i();
            g.a.a(formPageLandingLimitNoUiViewMapper.screenRouter, ((LandingLimitViewModel.NoUiAction.SendSuccess) noUiAction).getDeeplink(), null, null, 6);
        } else if (Intrinsics.d(noUiAction, LandingLimitViewModel.NoUiAction.ShowLoader.INSTANCE)) {
            formPageLandingLimitNoUiViewMapper.showLoader(viewGroup);
        } else {
            if (!Intrinsics.d(noUiAction, LandingLimitViewModel.NoUiAction.HideLoader.INSTANCE)) {
                throw new o();
            }
            formPageLandingLimitNoUiViewMapper.hideLoader(viewGroup);
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    private final void hideLoader(ViewGroup composerRootView) {
        ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(composerRootView);
        if (composerProgressBar != null) {
            ViewExtKt.gone(composerProgressBar);
        }
    }

    private final void showLoader(ViewGroup composerRootView) {
        ViewGroup composerProgressBar = ComposerViewExtensionKt.composerProgressBar(composerRootView);
        if (composerProgressBar != null) {
            ViewExtKt.show(composerProgressBar);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull final ViewGroup composerRootView, @NotNull final ComposerReferences references, @NotNull h<l> voHelper, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        if (this.isInitialized) {
            return;
        }
        ((LandingLimitViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.partpayment.landing.limit.view.FormPageLandingLimitNoUiViewMapper$constructLayout$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = FormPageLandingLimitNoUiViewMapper.this.pViewModel;
                LandingLimitViewModelImpl landingLimitViewModelImpl = (LandingLimitViewModelImpl) aVar.get();
                Intrinsics.g(landingLimitViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return landingLimitViewModelImpl;
            }
        }).a(LandingLimitViewModelImpl.class)).getNoUiAction().observe(references.getContainer().g(), new W() { // from class: cC.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                FormPageLandingLimitNoUiViewMapper.constructLayout$lambda$2(ComposerReferences.this, this, composerRootView, (LandingLimitViewModel.NoUiAction) obj);
            }
        });
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<FormPageLandingLimitDTO, d, List<FormPageLandingLimitNoUiVO>> getMapper() {
        return this.mapper;
    }
}
