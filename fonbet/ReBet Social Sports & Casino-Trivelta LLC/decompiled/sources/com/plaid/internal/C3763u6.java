package com.plaid.internal;

import com.plaid.internal.C3556a6;
import com.plaid.internal.Y6;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartRequest;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveStartResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* renamed from: com.plaid.internal.u6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3763u6 implements InterfaceC3675k7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3639g7 f41121a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public String f41122b;

    public C3763u6(@NotNull InterfaceC3639g7 snaApi) {
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        this.f41121a = snaApi;
    }

    @Override // com.plaid.internal.InterfaceC3675k7
    @NotNull
    public final C3640h a(@NotNull InterfaceC3666j7 params, @NotNull C3712p context) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f41122b;
        if (str == null) {
            C3640h a10 = C3640h.a(new Exception("FAILURE: sessionVerificationId is null"));
            Intrinsics.checkNotNullExpressionValue(a10, "completedExceptionally(...)");
            return a10;
        }
        SilentNetworkAuth$LinkSNAProveStartRequest build = SilentNetworkAuth$LinkSNAProveStartRequest.newBuilder().a(params.a().a()).b(str).build();
        InterfaceC3639g7 interfaceC3639g7 = this.f41121a;
        Intrinsics.checkNotNull(build);
        try {
            Response<SilentNetworkAuth$LinkSNAProveStartResponse> execute = interfaceC3639g7.a(build).execute();
            if (execute.isSuccessful()) {
                SilentNetworkAuth$LinkSNAProveStartResponse body = execute.body();
                String redirectTargetUrl = body != null ? body.getRedirectTargetUrl() : null;
                if (redirectTargetUrl != null) {
                    C3556a6.a.a(C3556a6.f39823a, "Prove Start Step success - redirectTargetUrl: " + redirectTargetUrl);
                    C3640h a11 = C3640h.a(redirectTargetUrl);
                    Intrinsics.checkNotNullExpressionValue(a11, "completed(...)");
                    return a11;
                }
            }
            Y6.a.a("Prove Start Step failure - response: " + execute);
            C3640h a12 = C3640h.a(new Exception("FAILURE: " + execute));
            Intrinsics.checkNotNullExpressionValue(a12, "completedExceptionally(...)");
            return a12;
        } catch (Exception e10) {
            Y6.a.a("Prove Start Step failure - exception: " + e10);
            C3640h a13 = C3640h.a(new Exception("FAILURE: " + e10));
            Intrinsics.checkNotNullExpressionValue(a13, "completedExceptionally(...)");
            return a13;
        }
    }
}
