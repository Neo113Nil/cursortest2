package ru.ozon.app.android.switchUser;

import Pb0.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import od0.InterfaceC8695a;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ru/ozon/app/android/switchUser/SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1", "LPb0/g;", "", "Lru/ozon/id/api/utils/UserId;", "userId", "J", "getUserId", "()J", "Lkotlin/Function1;", "Lod0/a;", "", "onResult", "Lkotlin/jvm/functions/Function1;", "getOnResult", "()Lkotlin/jvm/functions/Function1;", "switch-user_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1 extends g {
    private final Function1<InterfaceC8695a, Unit> onResult;
    private final long userId;

    SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1(long j11, SwitchUserDestinationInterceptor switchUserDestinationInterceptor, d<? super InterfaceC8695a> dVar) {
        this.userId = j11;
        this.onResult = new SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1$onResult$1(switchUserDestinationInterceptor, dVar);
    }

    public Function1<InterfaceC8695a, Unit> getOnResult() {
        return this.onResult;
    }

    public long getUserId() {
        return this.userId;
    }
}
