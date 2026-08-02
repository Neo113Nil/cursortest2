package ru.ozon.app.android.network.websockets;

import Sc.o;
import hg.InterfaceC6948a;
import io.reactivex.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.network.websockets.AppVisibility;
import ru.ozon.app.android.network.websockets.SocketEvent;
import sc.C9656b;
import wc.w;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/network/websockets/AppVisibility$State;", "Lkotlin/jvm/internal/EnhancedNullability;", "appVisibility", "Lhg/a;", "Lru/ozon/app/android/network/websockets/SocketEvent;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/network/websockets/AppVisibility$State;)Lhg/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class OzonWebSocketImpl$sharedSubscription$1 extends AbstractC7737t implements Function1<AppVisibility.State, InterfaceC6948a<? extends SocketEvent>> {
    final /* synthetic */ OzonWebSocketImpl this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppVisibility.State.values().length];
            try {
                iArr[AppVisibility.State.APP_FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppVisibility.State.APP_BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonWebSocketImpl$sharedSubscription$1(OzonWebSocketImpl ozonWebSocketImpl) {
        super(1);
        this.this$0 = ozonWebSocketImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC6948a<? extends SocketEvent> invoke(AppVisibility.State appVisibility) {
        h socketFlowable;
        Intrinsics.checkNotNullParameter(appVisibility, "appVisibility");
        int i11 = WhenMappings.$EnumSwitchMapping$0[appVisibility.ordinal()];
        if (i11 == 1) {
            socketFlowable = this.this$0.getSocketFlowable();
            return socketFlowable;
        }
        if (i11 != 2) {
            throw new o();
        }
        Lm0.a.f17149a.d("Web socket: Unavailable", new Object[0]);
        SocketEvent.Unavailable unavailable = SocketEvent.Unavailable.INSTANCE;
        int i12 = h.f66520b;
        C9656b.c(unavailable, "item is null");
        return new w(unavailable);
    }
}
