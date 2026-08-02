package io.ktor.client.plugins.cookies;

import androidx.compose.material.TextFieldImplKt;
import io.ktor.client.HttpClient;
import io.ktor.http.Url;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpCookies.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cookies.HttpCookiesKt", f = "HttpCookies.kt", i = {}, l = {TextFieldImplKt.AnimationDuration}, m = "cookies", n = {}, s = {})
/* loaded from: classes2.dex */
final class HttpCookiesKt$cookies$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    HttpCookiesKt$cookies$1(Continuation<? super HttpCookiesKt$cookies$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpCookiesKt.cookies((HttpClient) null, (Url) null, this);
    }
}
