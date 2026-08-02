package zm0;

import E.r;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b extends Handler implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f109323a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f109323a = new LinkedHashMap();
    }

    @Override // zm0.a
    public final void a(long j11, @NotNull r runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        removeMessages(1);
        this.f109323a.put(1, runnable);
        sendEmptyMessageDelayed(1, j11);
    }

    @Override // android.os.Handler
    public final void handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i11 = msg.what;
        LinkedHashMap linkedHashMap = this.f109323a;
        if (!linkedHashMap.containsKey(Integer.valueOf(i11))) {
            super.handleMessage(msg);
            return;
        }
        Runnable runnable = (Runnable) linkedHashMap.get(Integer.valueOf(i11));
        if (runnable != null) {
            runnable.run();
        }
    }
}
