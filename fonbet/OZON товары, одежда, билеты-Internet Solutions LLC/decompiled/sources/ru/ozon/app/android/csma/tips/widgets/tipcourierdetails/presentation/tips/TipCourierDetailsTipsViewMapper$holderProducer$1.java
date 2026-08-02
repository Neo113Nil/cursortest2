package ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips;

import a00.h;
import a00.j;
import android.view.View;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModel;
import ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.TipCourierDetailsViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/tips/TipCourierDetailsTipsWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TipCourierDetailsTipsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TipCourierDetailsTipsWidgetViewHolder> {
    final /* synthetic */ TipCourierDetailsTipsViewMapper this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/csma/tips/widgets/tipcourierdetails/presentation/TipCourierDetailsViewModelImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.csma.tips.widgets.tipcourierdetails.presentation.tips.TipCourierDetailsTipsViewMapper$holderProducer$1$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<TipCourierDetailsViewModelImpl> {
        final /* synthetic */ TipCourierDetailsTipsViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TipCourierDetailsTipsViewMapper tipCourierDetailsTipsViewMapper) {
            super(0);
            this.this$0 = tipCourierDetailsTipsViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TipCourierDetailsViewModelImpl invoke() {
            return this.this$0.component().getViewModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TipCourierDetailsTipsViewMapper$holderProducer$1(TipCourierDetailsTipsViewMapper tipCourierDetailsTipsViewMapper) {
        super(2);
        this.this$0 = tipCourierDetailsTipsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TipCourierDetailsTipsWidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        return new TipCourierDetailsTipsWidgetViewHolder(view, ref, (TipCourierDetailsViewModel) ((w0) j.a(viewModelOwnerProvider.a(), N.b(TipCourierDetailsViewModelImpl.class), new AnonymousClass1(this.this$0)).getValue()), this.this$0.component().getCustomActionHandlersFactory(), this.this$0.component().getMapper());
    }
}
