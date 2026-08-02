package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.submitButton;

import CE.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetDocsDeliverySubmitButtonBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.data.DocsDeliveryFormDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.di.DaggerDocsDeliveryFormComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.di.DocsDeliveryFormComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewModelImpl;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\rj\u0002`\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001bj\b\u0012\u0004\u0012\u00020\u0002`\u001c2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR2\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050!0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/submitButton/DocsDeliverySubmitButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/BottomContainerViewMapper2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/di/DocsDeliveryFormComponent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/submitButton/DocsDeliverySubmitButtonViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/submitButton/DocsDeliverySubmitButtonVO;", "<init>", "()V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/submitButton/DocsDeliverySubmitButtonViewHolder;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/submitButton/DocsDeliverySubmitButtonViewHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DocsDeliverySubmitButtonViewMapper extends BottomContainerViewMapper2<DocsDeliveryFormComponent, DocsDeliverySubmitButtonViewHolder, DocsDeliveryFormDTO, DocsDeliverySubmitButtonVO> {

    @NotNull
    private final Function2<DocsDeliveryFormDTO, d, List<DocsDeliverySubmitButtonVO>> mapper = DocsDeliverySubmitButtonViewMapper$mapper$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocsDeliveryFormComponent widgetComponent$lambda$1(C7475g c7475g) {
        return DaggerDocsDeliveryFormComponent.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (LocationComponentApi) c7475g.getComponent(LocationComponentApi.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    public /* bridge */ /* synthetic */ DocsDeliverySubmitButtonViewHolder createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<DocsDeliveryFormDTO, d, List<DocsDeliverySubmitButtonVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DocsDeliveryFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(DocsDeliveryFormComponent.class), new a(storage, 3));
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public void bind(@NotNull DocsDeliverySubmitButtonViewHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        DocsDeliverySubmitButtonVO docsDeliverySubmitButtonVO = d11 instanceof DocsDeliverySubmitButtonVO ? (DocsDeliverySubmitButtonVO) d11 : null;
        if (docsDeliverySubmitButtonVO == null) {
            return;
        }
        k.bindItem$default(holder, docsDeliverySubmitButtonVO, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    @NotNull
    public DocsDeliverySubmitButtonViewHolder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        WidgetDocsDeliverySubmitButtonBinding bind = WidgetDocsDeliverySubmitButtonBinding.bind(composerInflater.inflate(R$layout.widget_docs_delivery_submit_button));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        Object a11 = new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.submitButton.DocsDeliverySubmitButtonViewMapper$createHolder$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                DocsDeliveryFormViewModelImpl docsDeliveryFormViewModelImpl = ((DocsDeliveryFormComponent) DocsDeliverySubmitButtonViewMapper.this.component()).getViewModelProvider().get();
                Intrinsics.g(docsDeliveryFormViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return docsDeliveryFormViewModelImpl;
            }
        }).a(DocsDeliveryFormViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "sharedViewModel(...)");
        return new DocsDeliverySubmitButtonViewHolder(bind, references, (DocsDeliveryFormViewModel) a11);
    }
}
