package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation;

import a00.h;
import a00.j;
import android.view.View;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.di.SkiResortInfoComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.view.SkiResortInfoView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SkiResortInfoViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SkiResortInfoWidgetViewHolder> {
    final /* synthetic */ SkiResortInfoViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkiResortInfoViewMapper$holderProducer$1(SkiResortInfoViewMapper skiResortInfoViewMapper) {
        super(2);
        this.this$0 = skiResortInfoViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SkiResortInfoWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        return new SkiResortInfoWidgetViewHolder((SkiResortInfoView) view, (SkiResortInfoViewModel) ((w0) j.a(viewModelOwnerProvider.a(), N.b(SkiResortInfoViewModel.class), new C(this.this$0.component()) { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation.SkiResortInfoViewMapper$holderProducer$1.1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((SkiResortInfoComponent) this.receiver).getViewModel();
            }
        }).getValue()), this.this$0.component().getTokenizedAnalytics(), refs);
    }
}
