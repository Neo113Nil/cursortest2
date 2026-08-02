package ru.ozon.app.android.partpayment.formpage.view;

import Pc.a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.partpayment.R$id;
import ru.ozon.app.android.partpayment.databinding.WidgetNouiFormPageBinding;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00132\n\u0010\u0016\u001a\u00060\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0016\u001a\u00060\u0012j\u0002`\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR6\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060!j\u0002`\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/partpayment/formpage/data/FormPageDTO;", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO;", "LPc/a;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModelImpl;", "pViewModel", "Lru/ozon/app/android/partpayment/formpage/view/FormPageRouter;", "router", "Landroid/content/Context;", "appContext", "<init>", "(LPc/a;Lru/ozon/app/android/partpayment/formpage/view/FormPageRouter;Landroid/content/Context;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "onRefresh", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "LPc/a;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageRouter;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/partpayment/formpage/view/FormPageBinder;", "binder", "Lru/ozon/app/android/partpayment/formpage/view/FormPageBinder;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormPageViewMapper extends SingleNoUiViewMapper<FormPageDTO, FormPageVO> {
    private FormPageBinder binder;

    @NotNull
    private final Function2<FormPageDTO, d, List<FormPageVO>> mapper;

    @NotNull
    private final a<FormPageViewModelImpl> pViewModel;

    @NotNull
    private final FormPageRouter router;

    public FormPageViewMapper(@NotNull a<FormPageViewModelImpl> pViewModel, @NotNull FormPageRouter router, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.pViewModel = pViewModel;
        this.router = router;
        this.mapper = new FormPageViewMapper$mapper$1(appContext);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        FormPageViewModelImpl formPageViewModelImpl = (FormPageViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.partpayment.formpage.view.FormPageViewMapper$bind$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = FormPageViewMapper.this.pViewModel;
                FormPageViewModelImpl formPageViewModelImpl2 = (FormPageViewModelImpl) aVar.get();
                Intrinsics.g(formPageViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return formPageViewModelImpl2;
            }
        }).a(FormPageViewModelImpl.class);
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO");
        formPageViewModelImpl.bind((FormPageVO) d11);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        SwipeRefreshLayout composerSwipeRefresh = ComposerViewExtensionKt.composerSwipeRefresh(composerRootView);
        if (composerSwipeRefresh != null) {
            ViewExtKt.gone(composerSwipeRefresh);
        }
        CoordinatorLayout composerCoordinatorLayout = ComposerViewExtensionKt.composerCoordinatorLayout(composerRootView);
        if (composerCoordinatorLayout != null) {
            ComponentCallbacksC5392m j11 = references.getContainer().j();
            FormPageViewModelImpl formPageViewModelImpl = (FormPageViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.partpayment.formpage.view.FormPageViewMapper$constructLayout$lambda$3$$inlined$createViewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = FormPageViewMapper.this.pViewModel;
                    FormPageViewModelImpl formPageViewModelImpl2 = (FormPageViewModelImpl) aVar.get();
                    Intrinsics.g(formPageViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return formPageViewModelImpl2;
                }
            }).a(FormPageViewModelImpl.class);
            if (this.binder == null) {
                Intrinsics.f(formPageViewModelImpl);
                this.binder = new FormPageBinder(formPageViewModelImpl, this.router, j11, references.getController());
            }
            if (composerCoordinatorLayout.findViewById(R$id.pageFormWidgetCl) == null) {
                WidgetNouiFormPageBinding inflate = WidgetNouiFormPageBinding.inflate(LayoutInflater.from(composerCoordinatorLayout.getContext()), composerCoordinatorLayout, true);
                FormPageBinder formPageBinder = this.binder;
                if (formPageBinder == null) {
                    Intrinsics.n("binder");
                    throw null;
                }
                Intrinsics.f(inflate);
                J viewLifecycleOwner = j11.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
                ViewGroup rootView = ContextExtKt.getRootView(j11);
                Intrinsics.f(rootView);
                J viewLifecycleOwner2 = j11.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                formPageBinder.setView(new FormPageView(inflate, viewLifecycleOwner, FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, viewLifecycleOwner2, 62, null)));
            }
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<FormPageDTO, d, List<FormPageVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    public void onRefresh(@NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(references, "references");
        ((FormPageViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.partpayment.formpage.view.FormPageViewMapper$onRefresh$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = FormPageViewMapper.this.pViewModel;
                FormPageViewModelImpl formPageViewModelImpl = (FormPageViewModelImpl) aVar.get();
                Intrinsics.g(formPageViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return formPageViewModelImpl;
            }
        }).a(FormPageViewModelImpl.class)).releaseBindLock();
    }
}
