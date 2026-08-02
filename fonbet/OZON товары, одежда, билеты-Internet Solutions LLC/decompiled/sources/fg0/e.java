package fg0;

import We.G;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sf.N;
import uf0.InterfaceC10056a;

/* loaded from: classes7.dex */
public final class e<T> implements Call<InterfaceC10056a<T>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Call<T> f63422a;

    public static final class a implements Callback<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback<InterfaceC10056a<T>> f63423a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e<T> f63424b;

        a(Callback<InterfaceC10056a<T>> callback, e<T> eVar) {
            this.f63423a = callback;
            this.f63424b = eVar;
        }

        @Override // retrofit2.Callback
        public final void onFailure(Call<T> call, Throwable t2) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t2, "t");
            this.f63423a.onFailure(this.f63424b, t2);
        }

        @Override // retrofit2.Callback
        public final void onResponse(Call<T> call, Response<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f63423a.onResponse(this.f63424b, d.a(response));
        }
    }

    public e(@NotNull Call<T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f63422a = delegate;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.f63422a.cancel();
    }

    @Override // retrofit2.Call
    public final void enqueue(@NotNull Callback<InterfaceC10056a<T>> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f63422a.enqueue(new a(callback, this));
    }

    @Override // retrofit2.Call
    @NotNull
    public final Response<InterfaceC10056a<T>> execute() {
        Response<T> execute = this.f63422a.execute();
        Intrinsics.checkNotNullExpressionValue(execute, "execute(...)");
        return d.a(execute);
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f63422a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f63422a.isExecuted();
    }

    @Override // retrofit2.Call
    @NotNull
    public final G request() {
        G request = this.f63422a.request();
        Intrinsics.checkNotNullExpressionValue(request, "request(...)");
        return request;
    }

    @Override // retrofit2.Call
    @NotNull
    public final N timeout() {
        N timeout = this.f63422a.timeout();
        Intrinsics.checkNotNullExpressionValue(timeout, "timeout(...)");
        return timeout;
    }

    @Override // retrofit2.Call
    @NotNull
    public final Call<InterfaceC10056a<T>> clone() {
        Call<T> clone = this.f63422a.clone();
        Intrinsics.checkNotNullExpressionValue(clone, "clone(...)");
        return new e(clone);
    }
}
