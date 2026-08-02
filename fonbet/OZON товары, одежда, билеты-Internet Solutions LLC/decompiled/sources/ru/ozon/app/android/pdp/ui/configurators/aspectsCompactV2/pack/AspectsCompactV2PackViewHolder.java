package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2PackLayoutBinding;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/pack/AspectsCompactV2PackVariantBaseViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2PackLayoutBinding;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Landroid/widget/LinearLayout;", "getParandjaView", "()Landroid/widget/LinearLayout;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "item", "", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsCompactV2PackViewHolder extends AspectsCompactV2PackVariantBaseViewHolder<WidgetAspectsCompactV2PackLayoutBinding> {

    @NotNull
    private final View containerView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack.AspectsCompactV2PackViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetAspectsCompactV2PackLayoutBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetAspectsCompactV2PackLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2PackLayoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetAspectsCompactV2PackLayoutBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetAspectsCompactV2PackLayoutBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2PackLayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack.AspectsCompactV2PackViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<WidgetAspectsCompactV2PackLayoutBinding, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsCompactV2PackLayoutBinding widgetAspectsCompactV2PackLayoutBinding) {
            invoke2(widgetAspectsCompactV2PackLayoutBinding);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WidgetAspectsCompactV2PackLayoutBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "$this$binding");
            binding.titleTav.setTextIsSelectable(false);
            binding.subtitleTav.setTextIsSelectable(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectsCompactV2PackViewHolder(@NotNull View containerView) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        binding(AnonymousClass2.INSTANCE);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder
    public void bind(@NotNull AspectsCompactVO$Variant item) {
        Intrinsics.checkNotNullParameter(item, "item");
        binding(new AspectsCompactV2PackViewHolder$bind$1(item, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder
    @NotNull
    public LinearLayout getParandjaView() {
        LinearLayout infoFl = ((WidgetAspectsCompactV2PackLayoutBinding) getBinding()).infoFl;
        Intrinsics.checkNotNullExpressionValue(infoFl, "infoFl");
        return infoFl;
    }
}
