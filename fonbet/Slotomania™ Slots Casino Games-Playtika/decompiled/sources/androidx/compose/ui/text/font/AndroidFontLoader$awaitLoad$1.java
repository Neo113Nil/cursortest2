package androidx.compose.ui.text.font;

import com.vungle.ads.internal.protos.Sdk;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidFontLoader.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", i = {1, 1}, l = {Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE, Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE}, m = "awaitLoad", n = {"this", ContentType.Font.TYPE}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidFontLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, Continuation<? super AndroidFontLoader$awaitLoad$1> continuation) {
        super(continuation);
        this.this$0 = androidFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitLoad(null, this);
    }
}
