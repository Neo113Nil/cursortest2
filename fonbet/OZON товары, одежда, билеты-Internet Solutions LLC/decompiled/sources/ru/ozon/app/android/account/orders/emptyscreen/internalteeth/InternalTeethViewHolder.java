package ru.ozon.app.android.account.orders.emptyscreen.internalteeth;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import j10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.databinding.PdpWidgetIslandSeparatorBinding;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorVO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/internalteeth/InternalTeethViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "Landroid/view/View;", "containerView", "Lj10/h$a;", "Lru/ozon/composer/ui/widget/l;", "overlayItemsHelper", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lj10/h$a;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "isModal", "()Z", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;Ll20/d;)V", "Landroid/view/View;", "Lj10/h$a;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/android/composerCommonViewKit/databinding/PdpWidgetIslandSeparatorBinding;", "binding", "Lru/ozon/android/composerCommonViewKit/databinding/PdpWidgetIslandSeparatorBinding;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InternalTeethViewHolder extends k<IslandSeparatorVO> {

    @NotNull
    private final PdpWidgetIslandSeparatorBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final h.a<l> overlayItemsHelper;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalTeethViewHolder(@NotNull View containerView, @NotNull h.a<l> overlayItemsHelper, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(overlayItemsHelper, "overlayItemsHelper");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        this.overlayItemsHelper = overlayItemsHelper;
        this.references = references;
        PdpWidgetIslandSeparatorBinding bind = PdpWidgetIslandSeparatorBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final boolean isModal() {
        ComponentCallbacksC5392m c11 = this.references.getContainer().c();
        return (c11 != null ? c11.getParentFragment() : null) instanceof BottomSheetComposerFragment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull IslandSeparatorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (InternalTeethViewHolderKt.hasNavbar(this.overlayItemsHelper) || isModal()) {
            IslandSeparatorView islandSeparatorV = this.binding.islandSeparatorV;
            Intrinsics.checkNotNullExpressionValue(islandSeparatorV, "islandSeparatorV");
            ViewExtKt.gone(islandSeparatorV);
        } else {
            IslandSeparatorView islandSeparatorV2 = this.binding.islandSeparatorV;
            Intrinsics.checkNotNullExpressionValue(islandSeparatorV2, "islandSeparatorV");
            InternalTeethViewHolderKt.bind(islandSeparatorV2, item);
        }
    }
}
