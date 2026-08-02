package ru.ozon.app.android.video.manager;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import p3.j;
import p3.p;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp3/j$a;", "invoke", "()Lp3/j$a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ExoManagerLiveImpl$defaultDataSourceFactory$2 extends AbstractC7737t implements Function0<j.a> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ExoManagerLiveImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExoManagerLiveImpl$defaultDataSourceFactory$2(Context context, ExoManagerLiveImpl exoManagerLiveImpl) {
        super(0);
        this.$context = context;
        this.this$0 = exoManagerLiveImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final j.a invoke() {
        p httpDataSourceFactory;
        Context context = this.$context;
        httpDataSourceFactory = this.this$0.getHttpDataSourceFactory();
        return new j.a(context, httpDataSourceFactory);
    }
}
