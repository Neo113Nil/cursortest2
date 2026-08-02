package bo.app;

import I0.InterfaceC1344i;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a5 extends DataStoreProvider {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f25246e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f25247a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25248b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f25249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Context context, String str, String str2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25247a = str;
        this.f25248b = str2;
        this.f25249c = LazyKt.lazy(new Function0() { // from class: c3.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.a5.a(bo.app.a5.this);
            }
        });
    }

    public static final String a(a5 a5Var) {
        return StringUtils.getCacheFileSuffix(a5Var.getContext(), a5Var.f25247a, a5Var.f25248b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{androidx.datastore.preferences.i.a(getContext(), "com.appboy.storage.device_cache.v3" + ((String) this.f25249c.getValue()), SetsKt.setOf(DataStoreKey.CACHED_DEVICE.getKey())), androidx.datastore.preferences.i.a(getContext(), "com.braze.storage.device_cache.metadata" + ((String) this.f25249c.getValue()), SetsKt.setOf((Object[]) new String[]{DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT.getKey(), DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION.getKey()}))}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.device_cache" + ((String) this.f25249c.getValue());
    }
}
