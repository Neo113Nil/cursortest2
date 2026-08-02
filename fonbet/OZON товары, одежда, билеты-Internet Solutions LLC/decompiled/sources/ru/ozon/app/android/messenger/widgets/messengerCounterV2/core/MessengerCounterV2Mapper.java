package ru.ozon.app.android.messenger.widgets.messengerCounterV2.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.data.MessengerCounterV2DTO;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2VO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/core/MessengerCounterV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/data/MessengerCounterV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/presentation/MessengerCounterV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/messenger/widgets/messengerCounterV2/data/MessengerCounterV2DTO;Ll20/d;)Ljava/util/List;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MessengerCounterV2Mapper implements Function2<MessengerCounterV2DTO, d, List<? extends MessengerCounterV2VO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MessengerCounterV2VO> invoke(@NotNull MessengerCounterV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new MessengerCounterV2VO(widgetInfo.d().hashCode() + c.INSTANCE.d(), state.getButton(), state.getUnreadCount()));
    }
}
