package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetPassengersDirectoryV2Binding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.PassengersDirectoryV2VO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.PassengersDirectoryV2ViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.adapter.PassengersDirectoryV2Adapter;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2ViewModel$Result;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2ViewModel$Result;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PassengersDirectoryV2WidgetViewHolder$observeLiveData$1 extends AbstractC7737t implements Function1<PassengersDirectoryV2ViewModel.Result, Unit> {
    final /* synthetic */ PassengersDirectoryV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PassengersDirectoryV2WidgetViewHolder$observeLiveData$1(PassengersDirectoryV2WidgetViewHolder passengersDirectoryV2WidgetViewHolder) {
        super(1);
        this.this$0 = passengersDirectoryV2WidgetViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(PassengersDirectoryV2ViewModel.Result result, PassengersDirectoryV2WidgetViewHolder passengersDirectoryV2WidgetViewHolder) {
        WidgetPassengersDirectoryV2Binding widgetPassengersDirectoryV2Binding;
        PassengersDirectoryV2ViewModel passengersDirectoryV2ViewModel;
        Parcelable layoutManagerState = result.getLayoutManagerState();
        if (layoutManagerState != null) {
            widgetPassengersDirectoryV2Binding = passengersDirectoryV2WidgetViewHolder.binding;
            RecyclerView.o layoutManager = widgetPassengersDirectoryV2Binding.passengersListRV.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(layoutManagerState);
            }
            passengersDirectoryV2ViewModel = passengersDirectoryV2WidgetViewHolder.viewModel;
            passengersDirectoryV2ViewModel.setLayoutManagerState(null);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PassengersDirectoryV2ViewModel.Result result) {
        invoke2(result);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final PassengersDirectoryV2ViewModel.Result result) {
        PassengersDirectoryV2Adapter passengersDirectoryV2Adapter;
        passengersDirectoryV2Adapter = this.this$0.passengersAdapter;
        List<PassengersDirectoryV2VO.PassengerListItem> passengerList = result.getPassengerList();
        final PassengersDirectoryV2WidgetViewHolder passengersDirectoryV2WidgetViewHolder = this.this$0;
        passengersDirectoryV2Adapter.setItems(passengerList, new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.a
            @Override // java.lang.Runnable
            public final void run() {
                PassengersDirectoryV2WidgetViewHolder$observeLiveData$1.invoke$lambda$1(PassengersDirectoryV2ViewModel.Result.this, passengersDirectoryV2WidgetViewHolder);
            }
        });
    }
}
