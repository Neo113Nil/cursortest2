package ru.ozon.app.android.session.sessionList.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/session/sessionList/data/SessionListNeedUpdate;", "", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "getValue", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListNeedUpdate {

    @NotNull
    public static final SessionListNeedUpdate INSTANCE = new SessionListNeedUpdate();

    @NotNull
    private static final AtomicBoolean value = new AtomicBoolean(false);
    public static final int $stable = 8;

    private SessionListNeedUpdate() {
    }

    @NotNull
    public final AtomicBoolean getValue() {
        return value;
    }
}
