package ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsV2TextColorLayoutBinding;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/ColorTitleVariantV2ViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsV2/imageTitle/BaseImageTitleVariantV2ViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsV2TextColorLayoutBinding;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "item", "", "bind", "(Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ColorTitleVariantV2ViewHolder extends BaseImageTitleVariantV2ViewHolder<WidgetAspectsV2TextColorLayoutBinding> {

    @NotNull
    private final View containerView;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle.ColorTitleVariantV2ViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetAspectsV2TextColorLayoutBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetAspectsV2TextColorLayoutBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsV2TextColorLayoutBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetAspectsV2TextColorLayoutBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetAspectsV2TextColorLayoutBinding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ColorTitleVariantV2ViewHolder(@NotNull View containerView) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        ((WidgetAspectsV2TextColorLayoutBinding) getBinding()).titleTav.setTextIsSelectable(false);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder
    public void bind(@NotNull AspectsCompactVO$Variant item) {
        Intrinsics.checkNotNullParameter(item, "item");
        binding(new ColorTitleVariantV2ViewHolder$bind$1(item, this));
    }
}
