package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector;

import androidx.lifecycle.J;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModel;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.NotificationsSettingsCellViewModelImpl;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorBinder;", "", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorView;", "view", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModel;", "viewModel", "Landroidx/lifecycle/J;", "lifecycleOwner", "<init>", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/selector/NotificationsSettingsSelectorView;Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModel;Landroidx/lifecycle/J;)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsSelectorBinder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorBinder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements InterfaceC6512o<Long, Long, Long, Long, Unit> {
        AnonymousClass1(Object obj) {
            super(4, obj, NotificationsSettingsCellViewModel.class, "changeSettingInBottomSheet", "changeSettingInBottomSheet(JJJJ)V", 0);
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(Long l11, Long l12, Long l13, Long l14) {
            invoke(l11.longValue(), l12.longValue(), l13.longValue(), l14.longValue());
            return Unit.f71690a;
        }

        public final void invoke(long j11, long j12, long j13, long j14) {
            ((NotificationsSettingsCellViewModel) this.receiver).changeSettingInBottomSheet(j11, j12, j13, j14);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsCellViewModelImpl$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorBinder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<NotificationsSettingsCellViewModelImpl.Action, Unit> {
        final /* synthetic */ NotificationsSettingsSelectorView $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(NotificationsSettingsSelectorView notificationsSettingsSelectorView) {
            super(1);
            this.$view = notificationsSettingsSelectorView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NotificationsSettingsCellViewModelImpl.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NotificationsSettingsCellViewModelImpl.Action action) {
            if (action instanceof NotificationsSettingsCellViewModelImpl.Action.SelectorChanged) {
                this.$view.onHideProgress();
                NotificationsSettingsCellViewModelImpl.Action.SelectorChanged selectorChanged = (NotificationsSettingsCellViewModelImpl.Action.SelectorChanged) action;
                this.$view.onSelectorChanged(selectorChanged.getId(), selectorChanged.getValue());
            } else if (action instanceof NotificationsSettingsCellViewModelImpl.Action.Progress) {
                this.$view.onShowProgress();
            } else if (action instanceof NotificationsSettingsCellViewModelImpl.Action.DialogResult) {
                this.$view.onDialogResult(((NotificationsSettingsCellViewModelImpl.Action.DialogResult) action).getId());
            } else if (action instanceof NotificationsSettingsCellViewModelImpl.Action.Error) {
                this.$view.onHideProgress();
                this.$view.onError(((NotificationsSettingsCellViewModelImpl.Action.Error) action).getId());
            }
            WhenExtKt.getExhaustive(Unit.f71690a);
        }
    }

    public NotificationsSettingsSelectorBinder(@NotNull NotificationsSettingsSelectorView view, @NotNull NotificationsSettingsCellViewModel viewModel, @NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        view.setOnSettingChanged(new AnonymousClass1(viewModel));
        P<NotificationsSettingsCellViewModelImpl.Action> actionLiveData = viewModel.getActionLiveData();
        T t2 = new T();
        t2.a(actionLiveData, new NotificationsSettingsSelectorBinder$inlined$sam$i$androidx_lifecycle_Observer$0(new NotificationsSettingsSelectorBinder$special$$inlined$filter$1(t2, view)));
        t2.observe(lifecycleOwner, new NotificationsSettingsSelectorBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass3(view)));
    }
}
