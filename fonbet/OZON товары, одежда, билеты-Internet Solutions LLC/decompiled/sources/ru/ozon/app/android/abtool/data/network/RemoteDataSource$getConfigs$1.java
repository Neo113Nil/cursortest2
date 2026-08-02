package ru.ozon.app.android.abtool.data.network;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.data.network.RemoteDataSource", f = "RemoteDataSource.kt", l = {13}, m = "getConfigs-gIAlu-s")
/* loaded from: classes6.dex */
final class RemoteDataSource$getConfigs$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteDataSource$getConfigs$1(RemoteDataSource remoteDataSource, d<? super RemoteDataSource$getConfigs$1> dVar) {
        super(dVar);
        this.this$0 = remoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object m451getConfigsgIAlus = this.this$0.m451getConfigsgIAlus(null, this);
        return m451getConfigsgIAlus == a.COROUTINE_SUSPENDED ? m451getConfigsgIAlus : r.a(m451getConfigsgIAlus);
    }
}
