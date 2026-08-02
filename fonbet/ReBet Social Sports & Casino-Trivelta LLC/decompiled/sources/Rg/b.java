package Rg;

import Ph.InterfaceC1465n;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class b implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Wg.d f10230a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1465n f10231b;

    public b(Wg.d requestData, InterfaceC1465n continuation) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f10230a = requestData;
        this.f10231b = continuation;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e10) {
        Throwable f10;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (this.f10231b.isCancelled()) {
            return;
        }
        InterfaceC1465n interfaceC1465n = this.f10231b;
        Result.Companion companion = Result.INSTANCE;
        f10 = h.f(this.f10230a, e10);
        interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(f10)));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        if (call.getCanceled()) {
            return;
        }
        this.f10231b.resumeWith(Result.m147constructorimpl(response));
    }
}
