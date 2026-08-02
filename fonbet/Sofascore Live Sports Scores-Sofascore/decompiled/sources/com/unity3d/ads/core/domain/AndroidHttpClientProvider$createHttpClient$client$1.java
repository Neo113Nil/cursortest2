package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/services/core/network/core/HttpClient;", "<anonymous>", "(Lku3;)Lcom/unity3d/services/core/network/core/HttpClient;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1", f = "AndroidHttpClientProvider.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidHttpClientProvider$createHttpClient$client$1 extends hoi implements Function2<ku3, rq3<? super HttpClient>, Object> {
    final /* synthetic */ HttpClientSelection $selectedHttpClient;
    int label;
    final /* synthetic */ AndroidHttpClientProvider this$0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
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
    public AndroidHttpClientProvider$createHttpClient$client$1(HttpClientSelection httpClientSelection, AndroidHttpClientProvider androidHttpClientProvider, rq3<? super AndroidHttpClientProvider$createHttpClient$client$1> rq3Var) {
        super(2, rq3Var);
        this.$selectedHttpClient = httpClientSelection;
        this.this$0 = androidHttpClientProvider;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidHttpClientProvider$createHttpClient$client$1(this.$selectedHttpClient, this.this$0, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super HttpClient> rq3Var) {
        return ((AndroidHttpClientProvider$createHttpClient$client$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        ISDKDispatchers iSDKDispatchers;
        Context context;
        ISDKDispatchers iSDKDispatchers2;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        if (i == 0) {
            y6a.M(obj);
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
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return (HttpClient) obj;
    }
}
