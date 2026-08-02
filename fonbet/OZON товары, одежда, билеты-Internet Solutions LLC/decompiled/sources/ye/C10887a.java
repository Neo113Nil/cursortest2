package ye;

import De.r;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;

/* renamed from: ye.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10887a implements r {
    @Override // De.r
    @NotNull
    public final f a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(j.b(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
