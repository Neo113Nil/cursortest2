package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.core;

import Ev.C2973a;
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
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddEdoV2ButtonBinding;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.di.StatusEdoStateComponentApi;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data.AddEdoDTOV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di.AddEdoComponentV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.di.DaggerAddEdoComponentV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoButtonVOV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoButtonViewHolderV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\n\u0010\u0014\u001a\u00060\rj\u0002`\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001bj\b\u0012\u0004\u0012\u00020\u0002`\u001c2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050!0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/core/AddEdoButtonsViewMapperV2;", "Lru/ozon/app/android/composer/widgets/v2/overlay/BottomContainerViewMapper2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/di/AddEdoComponentV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonViewHolderV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoDTOV2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonVOV2;", "<init>", "()V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonViewHolderV2;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoButtonViewHolderV2;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddEdoButtonsViewMapperV2 extends BottomContainerViewMapper2<AddEdoComponentV2, AddEdoButtonViewHolderV2, AddEdoDTOV2, AddEdoButtonVOV2> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AddEdoComponentV2 widgetComponent$lambda$1(C7475g c7475g) {
        return DaggerAddEdoComponentV2.factory().create((NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (StatusEdoStateComponentApi) c7475g.getComponent(StatusEdoStateComponentApi.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    public /* bridge */ /* synthetic */ AddEdoButtonViewHolderV2 createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<AddEdoDTOV2, d, List<AddEdoButtonVOV2>> getMapper() {
        return ((AddEdoComponentV2) component()).getAddEDOButtonMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AddEdoComponentV2> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(AddEdoComponentV2.class), new C2973a(storage, 2));
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public void bind(@NotNull AddEdoButtonViewHolderV2 holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        AddEdoButtonVOV2 addEdoButtonVOV2 = d11 instanceof AddEdoButtonVOV2 ? (AddEdoButtonVOV2) d11 : null;
        if (addEdoButtonVOV2 == null) {
            return;
        }
        k.bindItem$default(holder, addEdoButtonVOV2, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    @NotNull
    public AddEdoButtonViewHolderV2 createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        WidgetAddEdoV2ButtonBinding bind = WidgetAddEdoV2ButtonBinding.bind(composerInflater.inflate(R$layout.widget_add_edo_v2_button));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        w0 a11 = new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.core.AddEdoButtonsViewMapperV2$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AddEdoViewModelV2Impl addEdoViewModelV2Impl = ((AddEdoComponentV2) AddEdoButtonsViewMapperV2.this.component()).getWidgetViewModelProvider().get();
                Intrinsics.g(addEdoViewModelV2Impl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return addEdoViewModelV2Impl;
            }
        }).a(AddEdoViewModelV2Impl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new AddEdoButtonViewHolderV2(bind, (AddEdoViewModelV2Impl) a11, references);
    }
}
