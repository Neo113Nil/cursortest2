package ru.ozon.app.android.cart.alltocart.core;

import Pc.a;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartHolder;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartVO;
import ru.ozon.app.android.cart.alltocart.presentation.AllToCartViewModel;
import ru.ozon.app.android.cart.feature.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\b\u0007\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0011j\u0002`\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR6\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001fj\u0002` \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/cart/alltocart/core/AllToCartViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/BottomContainerViewMapper;", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartHolder;", "Lru/ozon/app/android/cart/alltocart/core/AllToCartDTO;", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO;", "LPc/a;", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartViewModel;", "viewModelProvider", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(LPc/a;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/cart/alltocart/presentation/AllToCartHolder;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "bind", "(Lru/ozon/app/android/cart/alltocart/presentation/AllToCartHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "LPc/a;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AllToCartViewMapper extends BottomContainerViewMapper<AllToCartHolder, AllToCartDTO, AllToCartVO> {

    @NotNull
    private final HandlersInhibitor inhibitor;

    @NotNull
    private final Function2<AllToCartDTO, d, List<AllToCartVO>> mapper;

    @NotNull
    private final a<AllToCartViewModel> viewModelProvider;

    public AllToCartViewMapper(@NotNull a<AllToCartViewModel> viewModelProvider, @NotNull HandlersInhibitor inhibitor) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.viewModelProvider = viewModelProvider;
        this.inhibitor = inhibitor;
        this.mapper = new AllToCartMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper
    public /* bridge */ /* synthetic */ AllToCartHolder createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<AllToCartDTO, d, List<AllToCartVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.MultiplyNoUIViewMapper
    public void bind(@NotNull AllToCartHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.cart.alltocart.presentation.AllToCartVO");
        k.bindItem$default(holder, (AllToCartVO) d11, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper
    @NotNull
    public AllToCartHolder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        View inflate = composerInflater.inflate(R$layout.widget_all_to_cart);
        w0 a11 = new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.cart.alltocart.core.AllToCartViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = AllToCartViewMapper.this.viewModelProvider;
                AllToCartViewModel allToCartViewModel = (AllToCartViewModel) aVar.get();
                Intrinsics.g(allToCartViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return allToCartViewModel;
            }
        }).a(AllToCartViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        return new AllToCartHolder(inflate, (AllToCartViewModel) a11, references, this.inhibitor);
    }
}
