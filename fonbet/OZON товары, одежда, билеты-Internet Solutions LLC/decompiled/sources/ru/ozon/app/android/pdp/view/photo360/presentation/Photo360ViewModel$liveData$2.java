package ru.ozon.app.android.pdp.view.photo360.presentation;

import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/V;", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360ViewModel$Action;", "invoke", "()Landroidx/lifecycle/V;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class Photo360ViewModel$liveData$2 extends AbstractC7737t implements Function0<V<Photo360ViewModel.Action>> {
    final /* synthetic */ Photo360ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360ViewModel$liveData$2(Photo360ViewModel photo360ViewModel) {
        super(0);
        this.this$0 = photo360ViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final V<Photo360ViewModel.Action> invoke() {
        return this.this$0._liveData;
    }
}
