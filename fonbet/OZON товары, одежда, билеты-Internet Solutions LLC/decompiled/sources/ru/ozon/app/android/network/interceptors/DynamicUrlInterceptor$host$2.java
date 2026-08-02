package ru.ozon.app.android.network.interceptors;

import Ib.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.network.di.NetworkComponentConfig;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DynamicUrlInterceptor$host$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ a<NetworkComponentConfig> $config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DynamicUrlInterceptor$host$2(a<NetworkComponentConfig> aVar) {
        super(0);
        this.$config = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return Uri.parse(this.$config.get().getApiUrl()).getHost();
    }
}
