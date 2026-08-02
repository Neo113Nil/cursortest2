package gi0;

import android.content.Context;
import fi0.x;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gi0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C6742a<T, A> {

    /* renamed from: a, reason: collision with root package name */
    private Function2<? super A, ? super x, ? extends T> f64493a;

    /* renamed from: b, reason: collision with root package name */
    private volatile T f64494b;

    public C6742a(@NotNull Function2<? super A, ? super x, ? extends T> creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.f64493a = creator;
    }

    public final Object a(Context context, @NotNull x settings) {
        T t2;
        Intrinsics.checkNotNullParameter(settings, "settings");
        T t11 = this.f64494b;
        if (t11 != null) {
            return t11;
        }
        synchronized (this) {
            t2 = this.f64494b;
            if (t2 == null) {
                Function2<? super A, ? super x, ? extends T> function2 = this.f64493a;
                Intrinsics.f(function2);
                t2 = function2.invoke(context, settings);
                this.f64494b = t2;
                this.f64493a = null;
            }
        }
        return t2;
    }

    public final T b() {
        T t2;
        synchronized (this) {
            t2 = this.f64494b;
        }
        return t2;
    }
}
