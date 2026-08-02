package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.button;

import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2;
import ru.ozon.app.android.fresh.unsorted.R$layout;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.data.ProductsInBotDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.di.ProductsInBotComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.ProductsInBotViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000bj\b\u0012\u0004\u0012\u00020\u0002`\f2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00032\n\u0010 \u001a\u00060\u0019j\u0002`\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/BottomContainerViewMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/di/ProductsInBotComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonViewHolder;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/data/ProductsInBotDTO$BotConfirmButtonDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonViewHolder;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonViewHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonMapper;", "getMapper", "()Lru/ozon/app/android/fresh/unsorted/widgets/productsInBot/v1/presentation/button/BotConfirmButtonMapper;", "mapper", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotConfirmButtonViewMapper extends BottomContainerViewMapper2<ProductsInBotComponent, BotConfirmButtonViewHolder, ProductsInBotDTO.BotConfirmButtonDTO, BotConfirmButtonVO> {
    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ProductsInBotDTO.BotConfirmButtonDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    public /* bridge */ /* synthetic */ BotConfirmButtonViewHolder createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ProductsInBotComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ProductsInBotComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public void bind(@NotNull BotConfirmButtonViewHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        BotConfirmButtonVO botConfirmButtonVO = d11 instanceof BotConfirmButtonVO ? (BotConfirmButtonVO) d11 : null;
        if (botConfirmButtonVO == null) {
            return;
        }
        k.bindItem$default(holder, botConfirmButtonVO, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    @NotNull
    public BotConfirmButtonViewHolder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        View inflate = composerInflater.inflate(R$layout.layout_bot_confirm_button);
        w0 a11 = new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.button.BotConfirmButtonViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ProductsInBotViewModel productsInBotViewModel = ((ProductsInBotComponent) BotConfirmButtonViewMapper.this.component()).getViewModelProvider().get();
                Intrinsics.g(productsInBotViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return productsInBotViewModel;
            }
        }).a(ProductsInBotViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        return new BotConfirmButtonViewHolder(inflate, references, (ProductsInBotViewModel) a11);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public BotConfirmButtonMapper getMapper() {
        return ((ProductsInBotComponent) component()).getBotConfirmButtonMapper();
    }
}
