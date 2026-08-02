package ru.ozon.app.android.analytics.plugins.af;

import androidx.recyclerview.widget.LinearLayoutManager;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.analytics.plugins.af.AppsFlyerResolver", f = "AppsFlyerResolver.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "resolveLink")
/* loaded from: classes11.dex */
final class AppsFlyerResolver$resolveLink$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppsFlyerResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppsFlyerResolver$resolveLink$1(AppsFlyerResolver appsFlyerResolver, d<? super AppsFlyerResolver$resolveLink$1> dVar) {
        super(dVar);
        this.this$0 = appsFlyerResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.resolveLink(null, this);
    }
}
