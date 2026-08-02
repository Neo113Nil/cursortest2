package ru.ozon.app.android.composer.di.modules;

import We.B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import pf0.AbstractC8922e;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpf0/e;", "Lkotlin/jvm/internal/EnhancedNullability;", "it", "", "invoke", "(Lpf0/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class OkHttpClientProvider$provideGncOkHttpClient$1$3 extends AbstractC7737t implements Function1<AbstractC8922e, Boolean> {
    final /* synthetic */ OkHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttpClientProvider$provideGncOkHttpClient$1$3(OkHttpClientProvider okHttpClientProvider) {
        super(1);
        this.this$0 = okHttpClientProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AbstractC8922e it) {
        B b11;
        Intrinsics.checkNotNullParameter(it, "it");
        String key = it.getKey();
        b11 = this.this$0.logRequestsInterceptor;
        return Boolean.valueOf(Intrinsics.d(key, b11.getClass().getName()));
    }
}
