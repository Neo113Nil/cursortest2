package td0;

import De.s;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.L0;

/* loaded from: classes3.dex */
public final class g {
    @NotNull
    public static final L0 a() {
        Intrinsics.checkNotNullParameter(C10720e0.f105451a, "<this>");
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            return s.f6650a;
        }
        Handler handler = new Handler(myLooper);
        String name = Thread.currentThread().getName();
        int i11 = ye.j.f106590a;
        return new ye.f(handler, name);
    }
}
