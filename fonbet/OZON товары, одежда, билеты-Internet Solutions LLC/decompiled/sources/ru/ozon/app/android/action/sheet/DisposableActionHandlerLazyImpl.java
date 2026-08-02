package ru.ozon.app.android.action.sheet;

import Sc.InterfaceC4008j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/action/sheet/DisposableActionHandlerLazyImpl;", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "Lkotlin/Function0;", "disposableActionHandlerProvider", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "cancel", "()V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "handler", "Lkotlin/jvm/functions/Function1;", "getHandler", "()Lkotlin/jvm/functions/Function1;", "lazyHandler$delegate", "LSc/j;", "getLazyHandler", "()Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "lazyHandler", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DisposableActionHandlerLazyImpl implements DisposableActionHandler {

    @NotNull
    private final Function1<AtomAction, Unit> handler;

    /* renamed from: lazyHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j lazyHandler;

    public DisposableActionHandlerLazyImpl(@NotNull Function0<? extends DisposableActionHandler> disposableActionHandlerProvider) {
        Intrinsics.checkNotNullParameter(disposableActionHandlerProvider, "disposableActionHandlerProvider");
        this.handler = new DisposableActionHandlerLazyImpl$handler$1(this);
        this.lazyHandler = LazyUtilsKt.unsafeLazy(new DisposableActionHandlerLazyImpl$lazyHandler$2(disposableActionHandlerProvider));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisposableActionHandler getLazyHandler() {
        return (DisposableActionHandler) this.lazyHandler.getValue();
    }

    @Override // ru.ozon.app.android.action.sheet.DisposableActionHandler
    public void cancel() {
        getLazyHandler().cancel();
    }

    @Override // ru.ozon.app.android.action.sheet.DisposableActionHandler
    @NotNull
    public Function1<AtomAction, Unit> getHandler() {
        return this.handler;
    }
}
