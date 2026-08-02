package com.appsonair.applink.services;

import Ph.P;
import android.util.Log;
import com.appsonair.applink.utils.StringConst;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "Lorg/json/JSONObject;", "<anonymous>", "(LPh/P;)Lorg/json/JSONObject;"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.appsonair.applink.services.AppLinkHandler$Companion$getReferralLinkByIP$2", f = "AppLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppLinkHandler$Companion$getReferralLinkByIP$2 extends SuspendLambda implements Function2<P, Continuation<? super JSONObject>, Object> {
    final /* synthetic */ OkHttpClient $client;
    final /* synthetic */ Request $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinkHandler$Companion$getReferralLinkByIP$2(OkHttpClient okHttpClient, Request request, Continuation<? super AppLinkHandler$Companion$getReferralLinkByIP$2> continuation) {
        super(2, continuation);
        this.$client = okHttpClient;
        this.$request = request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AppLinkHandler$Companion$getReferralLinkByIP$2(this.$client, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super JSONObject> continuation) {
        return ((AppLinkHandler$Companion$getReferralLinkByIP$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String string;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            Response execute = this.$client.newCall(this.$request).execute();
            String str = "";
            if (execute.isSuccessful()) {
                ResponseBody body = execute.body();
                string = body != null ? body.string() : null;
                if (string != null) {
                    str = string;
                }
                return new JSONObject(str);
            }
            ResponseBody body2 = execute.body();
            string = body2 != null ? body2.string() : null;
            if (string != null) {
                str = string;
            }
            return execute.code() != 429 ? new JSONObject(str) : new JSONObject(MapsKt.mapOf(TuplesKt.to("error", str)));
        } catch (Exception e10) {
            Log.e("NetworkError", "Request failed: " + e10.getMessage());
            return new JSONObject(MapsKt.mapOf(TuplesKt.to("error", StringConst.SomethingWentWrong)));
        }
    }
}
