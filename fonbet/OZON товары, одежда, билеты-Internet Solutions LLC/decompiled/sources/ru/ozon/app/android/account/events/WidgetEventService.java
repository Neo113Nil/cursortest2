package ru.ozon.app.android.account.events;

import Mc.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.events.WidgetEventService;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/events/WidgetEventService;", "", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "", "collect", "()V", "", "key", "widgetId", "Lkotlin/Function0;", "action", "registerAction", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "unregisterAction", "(Ljava/lang/String;)V", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "Lnc/b;", "disposable", "Lnc/b;", "", "Lru/ozon/app/android/account/events/Event;", "actions", "Ljava/util/List;", "", "isUserAnAdult", "Z", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WidgetEventService {

    @NotNull
    private final List<Event> actions;

    @NotNull
    private final AdultHandler adultHandler;
    private InterfaceC8487b disposable;
    private boolean isUserAnAdult;

    public WidgetEventService(@NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.adultHandler = adultHandler;
        this.actions = new ArrayList();
        this.isUserAnAdult = adultHandler.isUserAnAdult();
        collect();
    }

    private final void collect() {
        this.disposable = this.adultHandler.observeUserAdultState().subscribeOn(a.b()).observeOn(C8125a.a()).subscribe(new IJ.a(new WidgetEventService$collect$1(this), 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean unregisterAction$lambda$1(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public final void registerAction(@NotNull String key, @NotNull String widgetId, @NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(action, "action");
        List<Event> list = this.actions;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Event event : list) {
                if (Intrinsics.d(event.getKey(), key) && Intrinsics.d(event.getWidgetId(), widgetId)) {
                    return;
                }
            }
        }
        this.actions.add(new Event(key, action, widgetId));
    }

    public final void unregisterAction(@NotNull String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        List<Event> list = this.actions;
        final WidgetEventService$unregisterAction$1 widgetEventService$unregisterAction$1 = new WidgetEventService$unregisterAction$1(widgetId);
        list.removeIf(new Predicate() { // from class: ek.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean unregisterAction$lambda$1;
                unregisterAction$lambda$1 = WidgetEventService.unregisterAction$lambda$1(Function1.this, obj);
                return unregisterAction$lambda$1;
            }
        });
        InterfaceC8487b interfaceC8487b = this.disposable;
        if (interfaceC8487b == null || interfaceC8487b.isDisposed()) {
            interfaceC8487b = null;
        }
        if (interfaceC8487b != null) {
            interfaceC8487b.dispose();
        }
    }
}
