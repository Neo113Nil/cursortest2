package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.textIcon;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.AspectsDecorFactory;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsAdapter;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.VariantsViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.textIcon.AspectsV2TextIconViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectsCompactV2BaseViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectsCompactV2BaseViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AspectsCompactV2TextIconViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AspectsCompactV2BaseViewHolder> {
    public static final AspectsCompactV2TextIconViewMapper$holderProducer$1 INSTANCE = new AspectsCompactV2TextIconViewMapper$holderProducer$1();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "viewGroup", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "LX4/a;", "invoke", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/VariantsViewHolder;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.textIcon.AspectsCompactV2TextIconViewMapper$holderProducer$1$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ViewGroup, VariantsViewHolder<AspectsCompactVO$Variant, ? extends a>> {
        final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(View view) {
            super(1);
            this.$view = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final VariantsViewHolder<AspectsCompactVO$Variant, a> invoke(ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            View inflate = LayoutInflater.from(((RecyclerView) this.$view).getContext()).inflate(R$layout.widget_aspects_compact_v2_text_icon_layout, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new AspectsV2TextIconViewHolder(inflate);
        }
    }

    AspectsCompactV2TextIconViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final AspectsCompactV2BaseViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        view.setContentDescription("aspectsCompactTextRoot");
        return new AspectsCompactV2BaseViewHolder((RecyclerView) view, new VariantsAdapter(), AspectsDecorFactory.AspectMode.HORIZONTAL, ref, new AnonymousClass1(view));
    }
}
