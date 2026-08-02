package ru.ozon.app.android.bank.widgets.cbottom.core;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore;", "", "<init>", "()V", "listeners", "", "", "Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore$Callback;", "cbottomListenerInvoke", "", "uuid", "act", "Lru/ozon/fintech/exchanger/datapass/ActionResult2;", "addCallback", "callback", "removeCallback", "Callback", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CbottomWidgetListenersStore {

    @NotNull
    private final Map<Long, Callback> listeners = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore$Callback;", "", "call", "", "act", "Lru/ozon/fintech/exchanger/datapass/ActionResult2;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Callback {
        void call(@NotNull ActionResult2 act);
    }

    public final void addCallback(long uuid, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.listeners.put(Long.valueOf(uuid), callback);
    }

    public final void cbottomListenerInvoke(long uuid, @NotNull ActionResult2 act) {
        Intrinsics.checkNotNullParameter(act, "act");
        Callback callback = this.listeners.get(Long.valueOf(uuid));
        if (callback != null) {
            callback.call(act);
        }
    }

    public final void removeCallback(long uuid) {
        this.listeners.remove(Long.valueOf(uuid));
    }
}
