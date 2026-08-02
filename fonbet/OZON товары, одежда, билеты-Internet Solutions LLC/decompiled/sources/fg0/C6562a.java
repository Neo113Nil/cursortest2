package fg0;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.CallAdapter;
import uf0.InterfaceC10056a;

/* renamed from: fg0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6562a<T> implements CallAdapter<T, Call<InterfaceC10056a<T>>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Type f63418a;

    public C6562a(@NotNull Type bodyType) {
        Intrinsics.checkNotNullParameter(bodyType, "bodyType");
        this.f63418a = bodyType;
    }

    @Override // retrofit2.CallAdapter
    public final Object adapt(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new e(call);
    }

    @Override // retrofit2.CallAdapter
    @NotNull
    public final Type responseType() {
        return this.f63418a;
    }
}
