package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core.NetworkImageDataLoader", f = "NetworkImageDataLoader.kt", l = {14}, m = "getBytesFromUrl-0E7RQCE")
/* loaded from: classes12.dex */
final class NetworkImageDataLoader$getBytesFromUrl$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetworkImageDataLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkImageDataLoader$getBytesFromUrl$1(NetworkImageDataLoader networkImageDataLoader, d<? super NetworkImageDataLoader$getBytesFromUrl$1> dVar) {
        super(dVar);
        this.this$0 = networkImageDataLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object m746getBytesFromUrl0E7RQCE = this.this$0.m746getBytesFromUrl0E7RQCE(null, null, this);
        return m746getBytesFromUrl0E7RQCE == a.COROUTINE_SUSPENDED ? m746getBytesFromUrl0E7RQCE : r.a(m746getBytesFromUrl0E7RQCE);
    }
}
