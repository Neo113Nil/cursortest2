package com.appsonair.applink.services;

import Ph.P;
import android.net.Uri;
import com.appsonair.applink.interfaces.AppLinkListener;
import com.appsonair.applink.services.AppLinkHandler;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.appsonair.applink.services.AppLinkService$onDeepLinkProcessed$1", f = "AppLinkService.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppLinkService$onDeepLinkProcessed$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ AppLinkService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinkService$onDeepLinkProcessed$1(Uri uri, AppLinkService appLinkService, Continuation<? super AppLinkService$onDeepLinkProcessed$1> continuation) {
        super(2, continuation);
        this.$uri = uri;
        this.this$0 = appLinkService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AppLinkService$onDeepLinkProcessed$1(this.$uri, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((AppLinkService$onDeepLinkProcessed$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        String str2;
        boolean z10;
        String lastPathSegment;
        AppLinkListener appLinkListener;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        AppLinkListener appLinkListener2 = null;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            String scheme = this.$uri.getScheme();
            if (scheme == null) {
                scheme = "";
            }
            if (!StringsKt.startsWith$default(scheme, "http", false, 2, (Object) null) || (lastPathSegment = this.$uri.getLastPathSegment()) == null || lastPathSegment.length() == 0) {
                String queryParameter = this.$uri.getQueryParameter("link");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                if (!StringsKt.startsWith$default(queryParameter, "http", false, 2, (Object) null)) {
                    queryParameter = "https://" + queryParameter;
                }
                Uri parse = Uri.parse(queryParameter);
                String lastPathSegment2 = parse.getLastPathSegment();
                if (lastPathSegment2 == null) {
                    lastPathSegment2 = "";
                }
                String host = parse.getHost();
                str = host != null ? host : "";
                str2 = lastPathSegment2;
            } else {
                String lastPathSegment3 = this.$uri.getLastPathSegment();
                if (lastPathSegment3 == null) {
                    lastPathSegment3 = "";
                }
                String host2 = this.$uri.getHost();
                if (host2 == null) {
                    host2 = "";
                }
                String queryParameter2 = this.$uri.getQueryParameter("link");
                str2 = lastPathSegment3;
                if ((queryParameter2 != null ? queryParameter2 : "").length() == 0) {
                    z10 = true;
                    str = host2;
                    AppLinkHandler.Companion companion = AppLinkHandler.INSTANCE;
                    AppLinkHandler.Companion.handleLinkCount$default(companion, str2, str, z10, false, false, 24, null);
                    this.label = 1;
                    obj = companion.fetchAppLink(str2, str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    str = host2;
                }
            }
            z10 = false;
            AppLinkHandler.Companion companion2 = AppLinkHandler.INSTANCE;
            AppLinkHandler.Companion.handleLinkCount$default(companion2, str2, str, z10, false, false, 24, null);
            this.label = 1;
            obj = companion2.fetchAppLink(str2, str, this);
            if (obj == coroutine_suspended) {
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        JSONObject jSONObject = (JSONObject) obj;
        appLinkListener = this.this$0.listener;
        if (appLinkListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
        } else {
            appLinkListener2 = appLinkListener;
        }
        Uri uri = this.$uri;
        JSONObject optJSONObject = jSONObject.optJSONObject(EventKeys.DATA);
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        appLinkListener2.onDeepLinkProcessed(uri, jSONObject);
        return Unit.INSTANCE;
    }
}
