package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface qy3 {
    boolean isAvailableOnDevice();

    void onClearCredential(gw2 gw2Var, CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var);

    void onGetCredential(Context context, fx8 fx8Var, CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var);
}
