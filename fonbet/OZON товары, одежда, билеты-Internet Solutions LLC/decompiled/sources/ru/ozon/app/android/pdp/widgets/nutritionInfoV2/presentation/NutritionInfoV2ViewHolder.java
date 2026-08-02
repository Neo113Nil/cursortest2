package ru.ozon.app.android.pdp.widgets.nutritionInfoV2.presentation;

import W10.c;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetNutritionInfoV2Binding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/nutritionInfoV2/presentation/NutritionInfoV2ViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/nutritionInfoV2/presentation/NutritionInfoV2VO;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetNutritionInfoV2Binding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "", "trackView", "(Lru/ozon/app/android/pdp/widgets/nutritionInfoV2/presentation/NutritionInfoV2VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/nutritionInfoV2/presentation/NutritionInfoV2VO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NutritionInfoV2ViewHolder extends BindingWidgetViewHolder<NutritionInfoV2VO, WidgetNutritionInfoV2Binding> {

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.nutritionInfoV2.presentation.NutritionInfoV2ViewHolder$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetNutritionInfoV2Binding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetNutritionInfoV2Binding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetNutritionInfoV2Binding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetNutritionInfoV2Binding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetNutritionInfoV2Binding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NutritionInfoV2ViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.refs = refs;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NutritionInfoV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetNutritionInfoV2Binding binding = getBinding();
        TextAtomV2View titleTav = binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bindOrGone$default(titleTav, item.getTitle(), null, 2, null);
        binding.customView.setNutrients(item.getValues(), item.getBackgroundColor());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull NutritionInfoV2VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        TokenizedAnalyticsExtKt.processViewEvents(this.refs.getTokenizedAnalytics(), item.getTokenizedEvent());
    }
}
