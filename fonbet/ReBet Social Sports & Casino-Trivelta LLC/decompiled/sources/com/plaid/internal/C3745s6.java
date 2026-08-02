package com.plaid.internal;

import com.plaid.internal.Y6;
import com.plaid.internal.core.protos.link.api.SilentNetworkAuth$LinkSNAProveFinishResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;

/* renamed from: com.plaid.internal.s6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3745s6 implements InterfaceC3675k7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC3639g7 f41056a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public String f41057b;

    public C3745s6(@NotNull InterfaceC3639g7 snaApi) {
        Intrinsics.checkNotNullParameter(snaApi, "snaApi");
        this.f41056a = snaApi;
    }

    @Override // com.plaid.internal.InterfaceC3675k7
    @NotNull
    public final C3640h a(@NotNull InterfaceC3624f1 finishInput, @NotNull C3712p context) {
        Intrinsics.checkNotNullParameter(finishInput, "finishInput");
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f41057b;
        if (str == null) {
            C3640h a10 = C3640h.a(new Exception("FAILURE: sessionVerificationId is null"));
            Intrinsics.checkNotNullExpressionValue(a10, "completedExceptionally(...)");
            return a10;
        }
        InterfaceC3639g7 interfaceC3639g7 = this.f41056a;
        String a11 = finishInput.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getVfp(...)");
        try {
            Response<SilentNetworkAuth$LinkSNAProveFinishResponse> execute = interfaceC3639g7.a(str, a11).execute();
            if (execute.isSuccessful()) {
                C3640h a12 = C3640h.a(String.valueOf(execute.body()));
                Intrinsics.checkNotNullExpressionValue(a12, "completed(...)");
                return a12;
            }
            Y6.a.a("Prove Finish Step failure - response: " + execute);
            C3640h a13 = C3640h.a(new Exception("FAILURE: " + execute));
            Intrinsics.checkNotNullExpressionValue(a13, "completedExceptionally(...)");
            return a13;
        } catch (Exception e10) {
            Y6.a.a("Prove Finish Step failure - exception: " + e10);
            C3640h a14 = C3640h.a(new Exception("FAILURE: " + e10));
            Intrinsics.checkNotNullExpressionValue(a14, "completedExceptionally(...)");
            return a14;
        }
    }
}
