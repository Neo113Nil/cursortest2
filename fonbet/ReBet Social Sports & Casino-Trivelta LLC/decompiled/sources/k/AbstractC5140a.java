package k;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5140a {

    /* renamed from: k.a$a, reason: collision with other inner class name */
    public static final class C0780a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f53994a;

        public C0780a(Object obj) {
            this.f53994a = obj;
        }

        public final Object a() {
            return this.f53994a;
        }
    }

    public abstract Intent createIntent(Context context, Object obj);

    @Nullable
    public C0780a getSynchronousResult(@NotNull Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object parseResult(int i10, Intent intent);
}
