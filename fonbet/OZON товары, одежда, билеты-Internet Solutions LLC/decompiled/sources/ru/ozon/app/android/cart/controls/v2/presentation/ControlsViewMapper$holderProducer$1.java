package ru.ozon.app.android.cart.controls.v2.presentation;

import Vg.c;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ControlsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ControlsViewHolder> {
    final /* synthetic */ ControlsViewMapper this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.controls.v2.presentation.ControlsViewMapper$holderProducer$1$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<c> {
        final /* synthetic */ ControlsViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ControlsViewMapper controlsViewMapper) {
            super(0);
            this.this$0 = controlsViewMapper;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            c customActionHandlersStore;
            customActionHandlersStore = this.this$0.getCustomActionHandlersStore();
            return customActionHandlersStore;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ControlsViewMapper$holderProducer$1(ControlsViewMapper controlsViewMapper) {
        super(2);
        this.this$0 = controlsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ControlsViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        return new ControlsViewHolder((ControlsView) view, this.this$0.component().getHandlersInhibitor(), ref, new AnonymousClass1(this.this$0));
    }
}
