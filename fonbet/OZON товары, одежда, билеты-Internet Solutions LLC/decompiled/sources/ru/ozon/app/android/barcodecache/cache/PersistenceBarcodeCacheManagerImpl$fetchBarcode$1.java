package ru.ozon.app.android.barcodecache.cache;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.barcodecache.cache.PersistenceBarcodeCacheManagerImpl", f = "BarcodeCacheManager.kt", l = {145, ModuleDescriptor.MODULE_VERSION}, m = "fetchBarcode")
/* loaded from: classes11.dex */
final class PersistenceBarcodeCacheManagerImpl$fetchBarcode$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PersistenceBarcodeCacheManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersistenceBarcodeCacheManagerImpl$fetchBarcode$1(PersistenceBarcodeCacheManagerImpl persistenceBarcodeCacheManagerImpl, d<? super PersistenceBarcodeCacheManagerImpl$fetchBarcode$1> dVar) {
        super(dVar);
        this.this$0 = persistenceBarcodeCacheManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.fetchBarcode(this);
    }
}
