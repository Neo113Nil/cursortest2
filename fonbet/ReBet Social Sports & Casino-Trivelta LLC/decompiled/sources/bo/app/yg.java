package bo.app;

import I0.InterfaceC1344i;
import android.content.Context;
import bo.app.yg;
import com.braze.storage.DataStoreProvider;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yg extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f26328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26329b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f26330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(final Context context, String str, String str2) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26328a = str;
        this.f26329b = str2;
        this.f26330c = LazyKt.lazy(new Function0() { // from class: c3.wd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return yg.a(context, this);
            }
        });
    }

    public static final String a(Context context, yg ygVar) {
        return StringUtils.getCacheFileSuffix(context, ygVar.f26328a, ygVar.f26329b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf((Object[]) new K0.a[]{androidx.datastore.preferences.i.b(getContext(), "com.appboy.storage.user_cache.v3" + ((String) this.f26330c.getValue()), null, 4, null), androidx.datastore.preferences.i.b(getContext(), "com.braze.storage.user_cache.push_token_store" + ((String) this.f26330c.getValue()), null, 4, null)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.user_cache" + ((String) this.f26330c.getValue());
    }
}
