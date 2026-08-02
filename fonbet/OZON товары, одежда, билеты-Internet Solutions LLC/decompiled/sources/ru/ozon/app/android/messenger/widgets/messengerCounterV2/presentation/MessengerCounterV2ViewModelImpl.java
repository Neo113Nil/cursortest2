package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import GH.a;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.notifications.NotificationsManager;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000e*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewModel;", "Lru/ozon/app/android/notifications/NotificationsManager;", "notificationsManager", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "<init>", "(Lru/ozon/app/android/notifications/NotificationsManager;Lru/ozon/app/android/storage/auth/AuthStateStorage;)V", "", "unreadMessagesCount", "", "parseUnreadMessagesCount", "(I)Ljava/lang/String;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "text", "copyWithStyleType", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;)Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "count", "createDefaultIndicator", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "vo", "getSynchronizedItem", "(Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;)Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "", "onCleared", "()V", "Lru/ozon/app/android/notifications/NotificationsManager;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "updateUnreadCountEvent", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getUpdateUnreadCountEvent", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "disposables", "Lnc/a;", "cachedItem", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "Companion", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MessengerCounterV2ViewModelImpl extends w0 implements MessengerCounterV2ViewModel {

    @NotNull
    private final AuthStateStorage authManager;
    private MessengerCounterV2VO cachedItem;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final NotificationsManager notificationsManager;

    @NotNull
    private final SingleLiveEvent<MessengerCounterV2VO> updateUnreadCountEvent;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "unreadMessagesCount", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2ViewModelImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Integer, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Integer num) {
            IndicatorDTO indicatorDTO;
            MessengerCounterV2VO messengerCounterV2VO = MessengerCounterV2ViewModelImpl.this.cachedItem;
            if (messengerCounterV2VO != null) {
                MessengerCounterV2ViewModelImpl messengerCounterV2ViewModelImpl = MessengerCounterV2ViewModelImpl.this;
                Intrinsics.f(num);
                String parseUnreadMessagesCount = messengerCounterV2ViewModelImpl.parseUnreadMessagesCount(num.intValue());
                if (parseUnreadMessagesCount != null) {
                    IndicatorDTO indicatorDto = messengerCounterV2VO.getIndicatorDto();
                    if (indicatorDto == null || (indicatorDTO = messengerCounterV2ViewModelImpl.copyWithStyleType(indicatorDto, parseUnreadMessagesCount)) == null) {
                        indicatorDTO = messengerCounterV2ViewModelImpl.createDefaultIndicator(parseUnreadMessagesCount);
                    }
                } else {
                    indicatorDTO = null;
                }
                MessengerCounterV2VO copy$default = MessengerCounterV2VO.copy$default(messengerCounterV2VO, 0L, null, indicatorDTO, 3, null);
                messengerCounterV2ViewModelImpl.getUpdateUnreadCountEvent().setValue(copy$default);
                messengerCounterV2ViewModelImpl.cachedItem = copy$default;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewModelImpl$Companion;", "", "<init>", "()V", "MAX_COUNTER", "", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MessengerCounterV2ViewModelImpl(@NotNull NotificationsManager notificationsManager, @NotNull AuthStateStorage authManager) {
        Intrinsics.checkNotNullParameter(notificationsManager, "notificationsManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.notificationsManager = notificationsManager;
        this.authManager = authManager;
        this.updateUnreadCountEvent = new SingleLiveEvent<>();
        C8486a c8486a = new C8486a();
        this.disposables = c8486a;
        InterfaceC8487b subscribe = notificationsManager.observeMessagesCount().subscribe(new a(new AnonymousClass1(), 16));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndicatorDTO copyWithStyleType(IndicatorDTO indicatorDTO, String str) {
        return IndicatorDTO.copy$default(indicatorDTO, str, null, null, null, null, null, null, null, null, indicatorDTO.getStyleType(), null, 1534, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndicatorDTO createDefaultIndicator(String count) {
        return new IndicatorDTO(count, null, IndicatorDTO.IndicatorSize.SIZE_500, IndicatorDTO.Style.ACCENT, null, IndicatorDTO.IndicatorContent.TEXT, null, null, null, null, null, 2002, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String parseUnreadMessagesCount(int unreadMessagesCount) {
        if (1 <= unreadMessagesCount && unreadMessagesCount < 100) {
            return String.valueOf(unreadMessagesCount);
        }
        if (unreadMessagesCount > 99) {
            return "99";
        }
        return null;
    }

    @Override // ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2ViewModel
    @NotNull
    public MessengerCounterV2VO getSynchronizedItem(@NotNull MessengerCounterV2VO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        MessengerCounterV2VO messengerCounterV2VO = this.cachedItem;
        if (messengerCounterV2VO == null || messengerCounterV2VO.getId() != vo.getId()) {
            this.cachedItem = vo;
            return vo;
        }
        if (this.authManager.isAuthenticated()) {
            this.notificationsManager.updateUnreadCountInfo();
        }
        return MessengerCounterV2VO.copy$default(vo, 0L, null, null, 3, null);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.dispose();
        super.onCleared();
    }

    @Override // ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2ViewModel
    @NotNull
    public SingleLiveEvent<MessengerCounterV2VO> getUpdateUnreadCountEvent() {
        return this.updateUnreadCountEvent;
    }
}
