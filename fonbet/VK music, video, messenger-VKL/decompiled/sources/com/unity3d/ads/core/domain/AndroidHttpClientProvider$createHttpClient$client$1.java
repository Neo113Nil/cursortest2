package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidHttpClientProvider.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1", f = "AndroidHttpClientProvider.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidHttpClientProvider$createHttpClient$client$1 extends SuspendLambda implements wzs<yvj, spj<? super HttpClient>, Object> {
    final /* synthetic */ HttpClientSelection $selectedHttpClient;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* compiled from: AndroidHttpClientProvider.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpClientSelection.values().length];
            try {
                iArr[HttpClientSelection.OKHTTP3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpClientSelection.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$createHttpClient$client$1(HttpClientSelection httpClientSelection, AndroidHttpClientProvider androidHttpClientProvider, spj<? super AndroidHttpClientProvider$createHttpClient$client$1> spjVar) {
        super(2, spjVar);
        this.$selectedHttpClient = httpClientSelection;
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidHttpClientProvider$createHttpClient$client$1(this.$selectedHttpClient, this.this$0, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers iSDKDispatchers;
        Context context;
        ISDKDispatchers iSDKDispatchers2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$selectedHttpClient.ordinal()];
            if (i2 == 1) {
                return this.this$0.getOkHttp3Client();
            }
            if (i2 == 2) {
                iSDKDispatchers = this.this$0.dispatchers;
                return new LegacyHttpClient(iSDKDispatchers);
            }
            AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
            context = androidHttpClientProvider.context;
            iSDKDispatchers2 = this.this$0.dispatchers;
            HttpClientSelection httpClientSelection = this.$selectedHttpClient;
            this.label = 1;
            obj = androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers2, httpClientSelection, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return (HttpClient) obj;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super HttpClient> spjVar) {
        return ((AndroidHttpClientProvider$createHttpClient$client$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
