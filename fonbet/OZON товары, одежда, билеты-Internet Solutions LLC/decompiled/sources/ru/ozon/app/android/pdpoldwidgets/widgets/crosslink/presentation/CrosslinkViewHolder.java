package ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.presentation;

import CG.a;
import GZ.g;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetCrosslinkBinding;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/presentation/CrosslinkViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/presentation/CrosslinkVO;", "Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetCrosslinkBinding;", "Landroid/view/View;", "containerView", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Landroid/view/View;LGZ/g;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/presentation/CrosslinkVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "LGZ/g;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/presentation/CrosslinkVO;", "widgetInfo", "Ll20/d;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrosslinkViewHolder extends BindingWidgetViewHolder<CrosslinkVO, PdpWidgetCrosslinkBinding> {

    @NotNull
    private final View containerView;

    @NotNull
    private final HandlersInhibitor inhibitor;
    private CrosslinkVO item;

    @NotNull
    private final g ozonRouter;
    private d widgetInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.presentation.CrosslinkViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, PdpWidgetCrosslinkBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, PdpWidgetCrosslinkBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdpoldwidgets/databinding/PdpWidgetCrosslinkBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PdpWidgetCrosslinkBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return PdpWidgetCrosslinkBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrosslinkViewHolder(@NotNull View containerView, @NotNull g ozonRouter, @NotNull HandlersInhibitor inhibitor) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.containerView = containerView;
        this.ozonRouter = ozonRouter;
        this.inhibitor = inhibitor;
        getBinding().brandTv.setOnClickListener(new a(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CrosslinkViewHolder crosslinkViewHolder, View view) {
        HandlersInhibitor.run$default(crosslinkViewHolder.inhibitor, 0L, new CrosslinkViewHolder$2$1(crosslinkViewHolder), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CrosslinkVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        binding(new CrosslinkViewHolder$bind$1(this, item, info));
    }
}
