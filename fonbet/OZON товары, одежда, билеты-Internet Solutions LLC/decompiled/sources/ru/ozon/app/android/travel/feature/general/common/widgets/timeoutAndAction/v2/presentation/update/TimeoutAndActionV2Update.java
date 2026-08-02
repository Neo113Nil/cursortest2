package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.update;

import A00.a;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.TimeoutAndActionV2VO;

@InterfaceC6346b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/update/TimeoutAndActionV2Update;", "LA00/a$J$a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "newState", "constructor-impl", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;)Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "", "toString-impl", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "getNewState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeoutAndActionV2Update implements a.J.InterfaceC0007a {

    @NotNull
    private final TimeoutAndActionV2VO newState;

    private /* synthetic */ TimeoutAndActionV2Update(TimeoutAndActionV2VO timeoutAndActionV2VO) {
        this.newState = timeoutAndActionV2VO;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TimeoutAndActionV2Update m1258boximpl(TimeoutAndActionV2VO timeoutAndActionV2VO) {
        return new TimeoutAndActionV2Update(timeoutAndActionV2VO);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static TimeoutAndActionV2VO m1259constructorimpl(@NotNull TimeoutAndActionV2VO newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        return newState;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1260equalsimpl(TimeoutAndActionV2VO timeoutAndActionV2VO, Object obj) {
        return (obj instanceof TimeoutAndActionV2Update) && Intrinsics.d(timeoutAndActionV2VO, ((TimeoutAndActionV2Update) obj).getNewState());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1261hashCodeimpl(TimeoutAndActionV2VO timeoutAndActionV2VO) {
        return timeoutAndActionV2VO.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1262toStringimpl(TimeoutAndActionV2VO timeoutAndActionV2VO) {
        return "TimeoutAndActionV2Update(newState=" + timeoutAndActionV2VO + ")";
    }

    public boolean equals(Object obj) {
        return m1260equalsimpl(this.newState, obj);
    }

    public int hashCode() {
        return m1261hashCodeimpl(this.newState);
    }

    public String toString() {
        return m1262toStringimpl(this.newState);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ TimeoutAndActionV2VO getNewState() {
        return this.newState;
    }
}
