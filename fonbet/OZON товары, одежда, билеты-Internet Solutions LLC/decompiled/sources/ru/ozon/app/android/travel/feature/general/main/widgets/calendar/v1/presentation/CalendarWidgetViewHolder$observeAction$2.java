package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation.CalendarViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CalendarWidgetViewHolder$observeAction$2 extends AbstractC7737t implements Function1<CalendarViewModel.Action, Unit> {
    final /* synthetic */ CalendarWidgetViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CalendarViewModel.Action.values().length];
            try {
                iArr[CalendarViewModel.Action.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalendarViewModel.Action.DISMISS_AND_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CalendarWidgetViewHolder$observeAction$2(CalendarWidgetViewHolder calendarWidgetViewHolder) {
        super(1);
        this.this$0 = calendarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CalendarViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CalendarViewModel.Action action) {
        ComposerReferences composerReferences;
        ViewGroup rootView;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel;
        ComposerReferences composerReferences4;
        ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel2;
        int i11 = action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            composerReferences3 = this.this$0.references;
            composerReferences3.getNavigator().popBackStack();
            modalParentRefreshSharedViewModel = this.this$0.modalParentRefreshViewModel;
            if (modalParentRefreshSharedViewModel.refreshUrlLiveData().hasActiveObservers()) {
                modalParentRefreshSharedViewModel2 = this.this$0.modalParentRefreshViewModel;
                ModalParentRefreshSharedViewModel.sendRefresh$default(modalParentRefreshSharedViewModel2, null, null, 3, null);
                return;
            } else {
                composerReferences4 = this.this$0.references;
                ComposerExtKt.sendRefreshToTargetFragment$default(composerReferences4.getContainer(), null, null, null, null, 15, null);
                return;
            }
        }
        composerReferences = this.this$0.references;
        ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        CalendarWidgetViewHolder calendarWidgetViewHolder = this.this$0;
        FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
        composerReferences2 = calendarWidgetViewHolder.references;
        ComponentCallbacksC5392m c12 = composerReferences2.getContainer().c();
        Intrinsics.f(c12);
        FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, c12, 62, null).show();
    }
}
