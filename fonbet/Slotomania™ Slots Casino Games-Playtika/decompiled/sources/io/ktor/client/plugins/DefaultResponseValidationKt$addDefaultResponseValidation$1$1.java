package io.ktor.client.plugins;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCallKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.utils.io.charsets.MalformedInputException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;

/* compiled from: DefaultResponseValidation.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "response", "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", i = {0, 0, 1, 1, 1}, l = {42, 48}, m = "invokeSuspend", n = {"response", "statusCode", "response", "exceptionResponse", "statusCode"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes6.dex */
final class DefaultResponseValidationKt$addDefaultResponseValidation$1$1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super Unit>, Object> {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    DefaultResponseValidationKt$addDefaultResponseValidation$1$1(Continuation<? super DefaultResponseValidationKt$addDefaultResponseValidation$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultResponseValidationKt$addDefaultResponseValidation$1$1 defaultResponseValidationKt$addDefaultResponseValidation$1$1 = new DefaultResponseValidationKt$addDefaultResponseValidation$1$1(continuation);
        defaultResponseValidationKt$addDefaultResponseValidation$1$1.L$0 = obj;
        return defaultResponseValidationKt$addDefaultResponseValidation$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        return ((DefaultResponseValidationKt$addDefaultResponseValidation$1$1) create(httpResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(8:5|6|7|8|9|(2:16|(1:(1:24)(1:23))(1:19))(1:12)|13|14)(2:28|29))(1:30))(2:39|(2:41|42)(4:43|(2:45|(3:47|(1:49)|35))|50|51))|31|32|33|(10:36|8|9|(0)|16|(0)|(1:21)|24|13|14)|35|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
    
        r0 = r1;
        r3 = r5;
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int value;
        AttributeKey<?> attributeKey;
        HttpResponse httpResponse;
        Logger logger;
        AttributeKey attributeKey2;
        int i;
        HttpResponse httpResponse2;
        HttpResponse httpResponse3;
        String str;
        ServerResponseException responseException;
        Logger logger2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HttpResponse httpResponse4 = (HttpResponse) this.L$0;
            if (!((Boolean) httpResponse4.getCall().getAttributes().get(HttpCallValidatorKt.getExpectSuccessAttributeKey())).booleanValue()) {
                logger = DefaultResponseValidationKt.LOGGER;
                logger.trace("Skipping default response validation for " + httpResponse4.getCall().getRequest().getUrl());
                return Unit.INSTANCE;
            }
            value = httpResponse4.getStatus().getValue();
            HttpClientCall call = httpResponse4.getCall();
            if (value >= 300) {
                Attributes attributes = call.getAttributes();
                attributeKey = DefaultResponseValidationKt.ValidateMark;
                if (!attributes.contains(attributeKey)) {
                    this.L$0 = httpResponse4;
                    this.I$0 = value;
                    this.label = 1;
                    Object save = SavedCallKt.save(call, this);
                    if (save != coroutine_suspended) {
                        httpResponse = httpResponse4;
                        obj = save;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            httpResponse3 = (HttpResponse) this.L$1;
            httpResponse2 = (HttpResponse) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                str = (String) obj;
            } catch (MalformedInputException unused) {
                str = "<body failed decoding>";
                if (300 > i) {
                }
                if (400 > i) {
                }
                if (500 > i) {
                }
                responseException = new ResponseException(httpResponse3, str);
                logger2 = DefaultResponseValidationKt.LOGGER;
                logger2.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + responseException);
                throw responseException;
            }
            if (300 > i && i < 400) {
                responseException = new RedirectResponseException(httpResponse3, str);
            } else if (400 > i && i < 500) {
                responseException = new ClientRequestException(httpResponse3, str);
            } else if (500 > i && i < 600) {
                responseException = new ServerResponseException(httpResponse3, str);
            } else {
                responseException = new ResponseException(httpResponse3, str);
            }
            logger2 = DefaultResponseValidationKt.LOGGER;
            logger2.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + responseException);
            throw responseException;
        }
        value = this.I$0;
        httpResponse = (HttpResponse) this.L$0;
        ResultKt.throwOnFailure(obj);
        HttpClientCall httpClientCall = (HttpClientCall) obj;
        Attributes attributes2 = httpClientCall.getAttributes();
        attributeKey2 = DefaultResponseValidationKt.ValidateMark;
        attributes2.put(attributeKey2, Unit.INSTANCE);
        HttpResponse response = httpClientCall.getResponse();
        this.L$0 = httpResponse;
        this.L$1 = response;
        this.I$0 = value;
        this.label = 2;
        Object bodyAsText$default = HttpResponseKt.bodyAsText$default(response, null, this, 1, null);
        if (bodyAsText$default != coroutine_suspended) {
            i = value;
            httpResponse3 = response;
            obj = bodyAsText$default;
            httpResponse2 = httpResponse;
            str = (String) obj;
            if (300 > i) {
            }
            if (400 > i) {
            }
            if (500 > i) {
            }
            responseException = new ResponseException(httpResponse3, str);
            logger2 = DefaultResponseValidationKt.LOGGER;
            logger2.trace("Default response validation for " + httpResponse2.getCall().getRequest().getUrl() + " failed with " + responseException);
            throw responseException;
        }
        return coroutine_suspended;
    }
}
