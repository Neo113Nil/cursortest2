package h;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6755a<I, O> {

    /* renamed from: h.a$a, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C1046a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Serializable f64577a;

        public C1046a(Serializable serializable) {
            this.f64577a = serializable;
        }

        public final T a() {
            return (T) this.f64577a;
        }
    }

    @NotNull
    public abstract Intent a(@NotNull Context context, I i11);

    public C1046a<O> b(@NotNull Context context, I i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract O c(int i11, Intent intent);
}
