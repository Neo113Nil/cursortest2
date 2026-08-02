package ru.ozon.app.android.autopicker.widgets.productPickerDetails.core.stickyblock;

import GZ.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import j10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.R$layout;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.stickyblock.StickyBlockVO;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.stickyblock.StickyBlockViewHolder;
import ru.ozon.app.android.common.productselectormobile.core.AutopickerBottomSheetRepository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\n\u0010\u001b\u001a\u00060\u0011j\u0002`\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/stickyblock/StickyBlockViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/stickyblock/StickyBlockVO;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/common/productselectormobile/core/AutopickerBottomSheetRepository;", "autopickerBottomSheetRepository", "LGZ/g;", "router", "<init>", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/common/productselectormobile/core/AutopickerBottomSheetRepository;LGZ/g;)V", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "", "handleRemove", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)Z", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/common/productselectormobile/core/AutopickerBottomSheetRepository;", "LGZ/g;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/stickyblock/StickyBlockMapper;", "mapper", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/stickyblock/StickyBlockMapper;", "getMapper", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/core/stickyblock/StickyBlockMapper;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/stickyblock/StickyBlockViewHolder;", "holder", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/stickyblock/StickyBlockViewHolder;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickyBlockViewMapper extends SingleNoUiViewMapper<ProductPickerDetailsDTO, StickyBlockVO> {

    @NotNull
    private final AutopickerBottomSheetRepository autopickerBottomSheetRepository;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;
    private StickyBlockViewHolder holder;

    @NotNull
    private final StickyBlockMapper mapper;

    @NotNull
    private final g router;

    public StickyBlockViewMapper(@NotNull HandlersInhibitor handlersInhibitor, @NotNull AutopickerBottomSheetRepository autopickerBottomSheetRepository, @NotNull g router) {
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(autopickerBottomSheetRepository, "autopickerBottomSheetRepository");
        Intrinsics.checkNotNullParameter(router, "router");
        this.handlersInhibitor = handlersInhibitor;
        this.autopickerBottomSheetRepository = autopickerBottomSheetRepository;
        this.router = router;
        this.mapper = new StickyBlockMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        StickyBlockVO stickyBlockVO = d11 instanceof StickyBlockVO ? (StickyBlockVO) d11 : null;
        if (stickyBlockVO != null) {
            StickyBlockViewHolder stickyBlockViewHolder = this.holder;
            if (stickyBlockViewHolder != null) {
                stickyBlockViewHolder.bindTrackingData(viewObject, viewObject.n(), ((RetainComposerComponentApi) references.getWidgetComponent(RetainComposerComponentApi.class)).getViewedPond());
            }
            StickyBlockViewHolder stickyBlockViewHolder2 = this.holder;
            if (stickyBlockViewHolder2 != null) {
                k.bindItem$default(stickyBlockViewHolder2, stickyBlockVO, viewObject.c(), null, 4, null);
            }
            StickyBlockViewHolder stickyBlockViewHolder3 = this.holder;
            if (stickyBlockViewHolder3 != null) {
                stickyBlockViewHolder3.setLifecycleState(AbstractC5434v.b.RESUMED);
            }
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        View inflate = View.inflate(composerRootView.getContext(), R$layout.widget_sticky_block_product_picker_details, null);
        ComposerViewExtensionKt.composerBottomContainer(composerRootView).addView(inflate);
        Intrinsics.f(inflate);
        this.holder = new StickyBlockViewHolder(inflate, this.handlersInhibitor, references, this.autopickerBottomSheetRepository, this.router);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public boolean handleRemove(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        StickyBlockViewHolder stickyBlockViewHolder = this.holder;
        if (stickyBlockViewHolder != null) {
            composerRootView.removeView(stickyBlockViewHolder.getContainerView());
            stickyBlockViewHolder.setLifecycleState(AbstractC5434v.b.DESTROYED);
        }
        this.holder = null;
        return true;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public StickyBlockMapper getMapper() {
        return this.mapper;
    }
}
