package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.s;
import W10.c;
import Wc.a;
import android.os.Build;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.platform.notifications.EnableNotificationsSuggestingHandler;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatus;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusKt;
import ru.ozon.app.android.storefront.core.notifications.domain.NotificationStatusProvider;
import ru.ozon.app.android.storefront.feature.notifications.utils.ViewEffect;
import ru.ozon.app.android.storefront.feature.notifications.utils.ViewIntent;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data.PromoPushEnableCellDTO;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import xe.C10727i;
import xe.J;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 G2\u00020\u0001:\u0001GB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J7\u0010'\u001a\u00020\f2\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010$\u001a\u00020\u00162\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001f\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190-8\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u0010=R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u0002080>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010F\u001a\u0004\u0018\u00010C*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "notificationsHandler", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;", "pushNotificationStatusProvider", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;)V", "", "openNotificationSettings", "()V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "targetCell", "updateCell", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableCellDTO;", "withInvertedToggle", "(Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableCellDTO;)Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableCellDTO;", "", "getSelectedTypeIds", "()Ljava/lang/String;", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;", "state", "setInitData", "(Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;)V", "Lru/ozon/app/android/storefront/feature/notifications/utils/ViewIntent;", "intent", "onIntent", "(Lru/ozon/app/android/storefront/feature/notifications/utils/ViewIntent;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "actionLink", "", "params", "sendTypeIdsRequest", "(LW10/c;Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/platform/notifications/EnableNotificationsSuggestingHandler;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatusProvider;", "LAe/M0;", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatus;", "notificationStatus", "LAe/M0;", "Lxe/J;", "loggingExHandler", "Lxe/J;", "LAe/x0;", "_widgetState", "LAe/x0;", "Lze/h;", "Lru/ozon/app/android/storefront/feature/notifications/utils/ViewEffect;", "_effect", "Lze/h;", "widgetState", "getWidgetState", "()LAe/M0;", "LAe/h;", "effect", "LAe/h;", "getEffect", "()LAe/h;", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "getToggle", "(Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableCellDTO;)Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "toggle", "Companion", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoPushEnableViewModel extends w0 {

    @NotNull
    private final h<ViewEffect> _effect;

    @NotNull
    private final x0<PromoPushEnableVI> _widgetState;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;

    @NotNull
    private final InterfaceC2395h<ViewEffect> effect;

    @NotNull
    private final J loggingExHandler;

    @NotNull
    private final M0<NotificationStatus> notificationStatus;

    @NotNull
    private final EnableNotificationsSuggestingHandler notificationsHandler;

    @NotNull
    private final NotificationStatusProvider pushNotificationStatusProvider;

    @NotNull
    private final M0<PromoPushEnableVI> widgetState;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "status", "Lru/ozon/app/android/storefront/core/notifications/domain/NotificationStatus;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModel$1", f = "PromoPushEnableViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<NotificationStatus, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = PromoPushEnableViewModel.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            if (NotificationStatusKt.getCanPostNotifications((NotificationStatus) this.L$0)) {
                PromoPushEnableViewModel.this._effect.b(PromoPushEnableViewEffect$DismissDialog.INSTANCE);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NotificationStatus notificationStatus, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(notificationStatus, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableViewModel$Companion;", "", "<init>", "()V", "ID_COMMA_DELIMITER", "", "KEY_TYPE_IDS", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PromoPushEnableViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull EnableNotificationsSuggestingHandler notificationsHandler, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider, @NotNull NotificationStatusProvider pushNotificationStatusProvider) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(notificationsHandler, "notificationsHandler");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(pushNotificationStatusProvider, "pushNotificationStatusProvider");
        this.actionV2Repository = actionV2Repository;
        this.notificationsHandler = notificationsHandler;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.pushNotificationStatusProvider = pushNotificationStatusProvider;
        M0<NotificationStatus> statusFlow = pushNotificationStatusProvider.getStatusFlow();
        this.notificationStatus = statusFlow;
        this.loggingExHandler = new PromoPushEnableViewModel$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        x0<PromoPushEnableVI> a11 = O0.a(null);
        this._widgetState = a11;
        C11115c a12 = k.a(-2, 6, null);
        this._effect = a12;
        this.widgetState = C2399j.b(a11);
        this.effect = C2399j.H(a12);
        C2399j.C(new C2408n0(statusFlow, new AnonymousClass1(null)), androidx.lifecycle.x0.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSelectedTypeIds() {
        List<PromoPushEnableCellDTO> cells;
        PromoPushEnableVI value = this.widgetState.getValue();
        if (value == null || (cells = value.getCells()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : cells) {
            ToggleDTO toggle = getToggle((PromoPushEnableCellDTO) obj);
            if (toggle != null ? Intrinsics.d(toggle.isSelected(), Boolean.TRUE) : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<String> typeIds = ((PromoPushEnableCellDTO) it.next()).getTypeIds();
            if (typeIds == null) {
                typeIds = K.f71697a;
            }
            C7714v.p(typeIds, arrayList2);
        }
        return C7714v.V(arrayList2, ",", null, null, null, 62);
    }

    private final ToggleDTO getToggle(PromoPushEnableCellDTO promoPushEnableCellDTO) {
        CellDTO.RightBlock rightBlock = promoPushEnableCellDTO.getCell().getRightBlock();
        AtomDTO control = rightBlock != null ? rightBlock.getControl() : null;
        if (control instanceof ToggleDTO) {
            return (ToggleDTO) control;
        }
        return null;
    }

    private final void openNotificationSettings() {
        if (NotificationStatusKt.getHasDisabledChannels(this.notificationStatus.getValue())) {
            this._effect.b(PromoPushEnableViewEffect$OpenChannelSettings.INSTANCE);
            return;
        }
        if (this.notificationsHandler.isPermissionForPushNotificationsForApiMoreThan32Requested()) {
            this._effect.b(PromoPushEnableViewEffect$OpenNotificationSettings.INSTANCE);
        } else if (Build.VERSION.SDK_INT < 33) {
            this._effect.b(PromoPushEnableViewEffect$OpenNotificationSettings.INSTANCE);
        } else {
            C10727i.c(androidx.lifecycle.x0.a(this), this.coroutineDispatcherProvider.getIO().plus(this.loggingExHandler), null, new PromoPushEnableViewModel$openNotificationSettings$1(this, null), 2);
            this._effect.b(PromoPushEnableViewEffect$RequestNotificationPermission.INSTANCE);
        }
    }

    private final void updateCell(CellDTO targetCell) {
        PromoPushEnableVI value;
        PromoPushEnableVI promoPushEnableVI;
        x0<PromoPushEnableVI> x0Var = this._widgetState;
        do {
            value = x0Var.getValue();
            PromoPushEnableVI promoPushEnableVI2 = value;
            if (promoPushEnableVI2 != null) {
                List<PromoPushEnableCellDTO> cells = promoPushEnableVI2.getCells();
                ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
                for (PromoPushEnableCellDTO promoPushEnableCellDTO : cells) {
                    if (Intrinsics.d(promoPushEnableCellDTO.getCell(), targetCell)) {
                        promoPushEnableCellDTO = withInvertedToggle(promoPushEnableCellDTO);
                    }
                    arrayList.add(promoPushEnableCellDTO);
                }
                promoPushEnableVI = PromoPushEnableVI.copy$default(promoPushEnableVI2, 0L, arrayList, null, 5, null);
            } else {
                promoPushEnableVI = null;
            }
        } while (!x0Var.b(value, promoPushEnableVI));
    }

    private final PromoPushEnableCellDTO withInvertedToggle(PromoPushEnableCellDTO promoPushEnableCellDTO) {
        CellDTO.RightBlock rightBlock;
        ToggleDTO toggleDTO;
        Boolean isSelected;
        CellDTO cell = promoPushEnableCellDTO.getCell();
        CellDTO.RightBlock rightBlock2 = promoPushEnableCellDTO.getCell().getRightBlock();
        if (rightBlock2 != null) {
            ToggleDTO toggle = getToggle(promoPushEnableCellDTO);
            if (toggle != null) {
                ToggleDTO toggle2 = getToggle(promoPushEnableCellDTO);
                toggleDTO = ToggleDTO.copy$default(toggle, (toggle2 == null || (isSelected = toggle2.isSelected()) == null) ? null : Boolean.valueOf(!isSelected.booleanValue()), null, null, null, null, null, 62, null);
            } else {
                toggleDTO = null;
            }
            rightBlock = CellDTO.RightBlock.copy$default(rightBlock2, null, null, null, null, null, null, null, null, null, null, toggleDTO, null, 3071, null);
        } else {
            rightBlock = null;
        }
        return PromoPushEnableCellDTO.copy$default(promoPushEnableCellDTO, null, CellDTO.copy$default(cell, null, null, null, rightBlock, null, 23, null), 1, null);
    }

    @NotNull
    public final InterfaceC2395h<ViewEffect> getEffect() {
        return this.effect;
    }

    @NotNull
    public final M0<PromoPushEnableVI> getWidgetState() {
        return this.widgetState;
    }

    public final void onIntent(@NotNull ViewIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof PromoPushEnableViewIntent$OnToggleClick) {
            updateCell(((PromoPushEnableViewIntent$OnToggleClick) intent).getCell());
        }
    }

    public final void sendTypeIdsRequest(@NotNull c trackingData, @NotNull String actionLink, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(actionLink, "actionLink");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new PromoPushEnableViewModel$sendTypeIdsRequest$1(actionLink, this, trackingData, params, null), 3);
        openNotificationSettings();
    }

    public final void setInitData(@NotNull PromoPushEnableVI state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this._widgetState.getValue() == null) {
            this._widgetState.tryEmit(state);
        }
    }
}
