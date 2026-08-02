package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import Vg.d;
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
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.di.TravelAddNewPassengerFormV3Component;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3WidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TravelAddNewPassengerFormV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TravelAddNewPassengerFormV3WidgetViewHolder> {
    final /* synthetic */ TravelAddNewPassengerFormV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelAddNewPassengerFormV3ViewMapper$holderProducer$1(TravelAddNewPassengerFormV3ViewMapper travelAddNewPassengerFormV3ViewMapper) {
        super(2);
        this.this$0 = travelAddNewPassengerFormV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TravelAddNewPassengerFormV3WidgetViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        AddNewPassengerFormV3View addNewPassengerFormV3View = (AddNewPassengerFormV3View) view;
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        return new TravelAddNewPassengerFormV3WidgetViewHolder(addNewPassengerFormV3View, customActionHandlersStoreFactory, ref, (TravelAddNewPassengerFormV3ViewModel) ((w0) j.a(viewModelOwnerProvider.a(), N.b(TravelAddNewPassengerFormV3ViewModel.class), new C(this.this$0.component()) { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3ViewMapper$holderProducer$1.1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                return ((TravelAddNewPassengerFormV3Component) this.receiver).getViewModel();
            }
        }).getValue()), this.this$0.component().getTokenizedAnalytics());
    }
}
