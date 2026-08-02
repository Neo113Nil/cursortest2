package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* renamed from: k5.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC7520h0 {
    public final <T extends Serializable> T a(@NonNull Mm0.e eVar, long j11) {
        H2<T> b11 = b(eVar);
        if (b11 == null || b11.b() + j11 <= System.currentTimeMillis()) {
            return null;
        }
        return b11.a();
    }

    protected abstract <T extends Serializable> H2<T> b(@NonNull Mm0.e eVar);

    public final <T extends Serializable> void c(@NonNull Mm0.e eVar, T t2) {
        d(eVar, t2 != null ? new H2<>(t2) : null);
    }

    protected abstract <T extends Serializable> void d(@NonNull Mm0.e eVar, H2<T> h22);
}
