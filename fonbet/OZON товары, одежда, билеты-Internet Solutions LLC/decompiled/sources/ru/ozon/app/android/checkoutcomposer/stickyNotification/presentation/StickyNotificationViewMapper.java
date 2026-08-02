package ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
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
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkout.databinding.WidgetStickyNotificationBinding;
import ru.ozon.app.android.checkoutcomposer.stickyNotification.data.StickyNotificationDTO;
import ru.ozon.app.android.checkoutcomposer.stickyNotification.di.StickyNotificationComponent;
import ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation.vo.StickyNotificationVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u000ej\u0002`\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R,\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/StickyNotificationViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/BottomContainerViewMapper;", "Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/StickyNotificationViewHolder;", "Lru/ozon/app/android/checkoutcomposer/stickyNotification/data/StickyNotificationDTO;", "Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/vo/StickyNotificationVO;", "Lru/ozon/app/android/checkoutcomposer/stickyNotification/di/StickyNotificationComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/stickyNotification/di/StickyNotificationComponent;)V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/StickyNotificationViewHolder;", "holder", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "bind", "(Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/StickyNotificationViewHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/checkoutcomposer/stickyNotification/di/StickyNotificationComponent;", "Lkotlin/Function2;", "Ll20/d;", "", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyNotificationViewMapper extends BottomContainerViewMapper<StickyNotificationViewHolder, StickyNotificationDTO, StickyNotificationVO> {

    @NotNull
    private final StickyNotificationComponent component;

    public StickyNotificationViewMapper(@NotNull StickyNotificationComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper
    public /* bridge */ /* synthetic */ StickyNotificationViewHolder createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<StickyNotificationDTO, d, List<StickyNotificationVO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.MultiplyNoUIViewMapper
    public void bind(@NotNull StickyNotificationViewHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation.vo.StickyNotificationVO");
        k.bindItem$default(holder, (StickyNotificationVO) d11, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper
    @NotNull
    public StickyNotificationViewHolder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        View view;
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        View inflate = composerInflater.inflate(R$layout.widget_sticky_notification);
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || ComposerViewExtensionKt.composerContainer(view) == null) {
            throw new IllegalStateException("RootView is null");
        }
        WidgetStickyNotificationBinding bind = WidgetStickyNotificationBinding.bind(inflate);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new StickyNotificationViewHolder(bind, references, (TotalVisibilityViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation.StickyNotificationViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                StickyNotificationComponent stickyNotificationComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                stickyNotificationComponent = StickyNotificationViewMapper.this.component;
                TotalVisibilityViewModel totalVisibilityViewModel = stickyNotificationComponent.getTotalVisibilityViewModel();
                Intrinsics.g(totalVisibilityViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return totalVisibilityViewModel;
            }
        }).a(TotalVisibilityViewModel.class));
    }
}
