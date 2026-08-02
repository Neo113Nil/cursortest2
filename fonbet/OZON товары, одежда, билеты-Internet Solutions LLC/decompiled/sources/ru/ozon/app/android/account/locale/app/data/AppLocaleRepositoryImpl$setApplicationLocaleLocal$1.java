package ru.ozon.app.android.account.locale.app.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.account.locale.app.data.AppLocaleRepositoryImpl", f = "AppLocaleRepositoryImpl.kt", l = {145, 149, 151}, m = "setApplicationLocaleLocal")
/* loaded from: classes11.dex */
final class AppLocaleRepositoryImpl$setApplicationLocaleLocal$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppLocaleRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppLocaleRepositoryImpl$setApplicationLocaleLocal$1(AppLocaleRepositoryImpl appLocaleRepositoryImpl, d<? super AppLocaleRepositoryImpl$setApplicationLocaleLocal$1> dVar) {
        super(dVar);
        this.this$0 = appLocaleRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object applicationLocaleLocal;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        applicationLocaleLocal = this.this$0.setApplicationLocaleLocal(null, this);
        return applicationLocaleLocal;
    }
}
