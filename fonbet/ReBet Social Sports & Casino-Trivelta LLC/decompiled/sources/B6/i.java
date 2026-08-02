package B6;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class i extends e {

    /* renamed from: b, reason: collision with root package name */
    public static i f813b;

    public i() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static i D0() {
        if (f813b == null) {
            f813b = new i();
        }
        return f813b;
    }

    @Override // B6.e, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
