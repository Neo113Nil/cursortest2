package gk0;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
final class m extends kotlin.coroutines.a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f64547c = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f64548a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.fragment.app.r f64549b;

    public static final class a implements CoroutineContext.a<m> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.fragment.app.r rVar, @NotNull String tag) {
        super(f64547c);
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f64548a = tag;
        this.f64549b = rVar;
    }

    @NotNull
    public final String q() {
        return this.f64548a;
    }

    public final Context r() {
        return this.f64549b;
    }
}
