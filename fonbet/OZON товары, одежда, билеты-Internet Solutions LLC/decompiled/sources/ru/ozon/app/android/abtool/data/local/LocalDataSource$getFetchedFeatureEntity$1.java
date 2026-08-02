package ru.ozon.app.android.abtool.data.local;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.data.local.LocalDataSource", f = "LocalDataSource.kt", l = {32}, m = "getFetchedFeatureEntity-IoAF18A")
/* loaded from: classes6.dex */
final class LocalDataSource$getFetchedFeatureEntity$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalDataSource$getFetchedFeatureEntity$1(LocalDataSource localDataSource, d<? super LocalDataSource$getFetchedFeatureEntity$1> dVar) {
        super(dVar);
        this.this$0 = localDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object m450getFetchedFeatureEntityIoAF18A = this.this$0.m450getFetchedFeatureEntityIoAF18A(this);
        return m450getFetchedFeatureEntityIoAF18A == a.COROUTINE_SUSPENDED ? m450getFetchedFeatureEntityIoAF18A : r.a(m450getFetchedFeatureEntityIoAF18A);
    }
}
