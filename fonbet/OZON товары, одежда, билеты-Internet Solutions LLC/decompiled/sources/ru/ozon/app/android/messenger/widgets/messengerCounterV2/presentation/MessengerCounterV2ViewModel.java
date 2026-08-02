package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2ViewModel;", "", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "vo", "getSynchronizedItem", "(Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;)Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "Landroidx/lifecycle/P;", "getUpdateUnreadCountEvent", "()Landroidx/lifecycle/P;", "updateUnreadCountEvent", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MessengerCounterV2ViewModel {
    @NotNull
    MessengerCounterV2VO getSynchronizedItem(@NotNull MessengerCounterV2VO vo);

    @NotNull
    P<MessengerCounterV2VO> getUpdateUnreadCountEvent();
}
