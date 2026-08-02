package ru.ozon.app.android.marketing.widgets.badgeTimer.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.marketing.widgets.badgeTimer.data.BadgeTimerDTO;
import ru.ozon.app.android.marketing.widgets.badgeTimer.data.Timer;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/badgeTimer/data/BadgeTimerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/badgeTimer/data/BadgeTimerDTO;Ll20/d;)Ljava/util/List;", "", "stateId", "toVO", "(Lru/ozon/app/android/marketing/widgets/badgeTimer/data/BadgeTimerDTO;Ljava/lang/String;)Lru/ozon/app/android/marketing/widgets/badgeTimer/presentation/BadgeTimerVO;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BadgeTimerMapper implements Function2<BadgeTimerDTO, d, List<? extends BadgeTimerVO>> {
    @NotNull
    public final BadgeTimerVO toVO(@NotNull BadgeTimerDTO badgeTimerDTO, @NotNull String stateId) {
        Long l11;
        Intrinsics.checkNotNullParameter(badgeTimerDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long millis = new DateTime().getMillis();
        long hashCode = stateId.hashCode();
        Badge badge = badgeTimerDTO.getBadge();
        Timer timer = badgeTimerDTO.getTimer();
        if (timer != null) {
            l11 = Long.valueOf((DateTime.i(timer.getDeadlineTimestamp()).getMillis() - DateTime.i(timer.getServerTimestamp()).getMillis()) + millis);
        } else {
            l11 = null;
        }
        return new BadgeTimerVO(hashCode, badge, l11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BadgeTimerVO> invoke(@NotNull BadgeTimerDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto, widgetInfo.d()));
    }
}
