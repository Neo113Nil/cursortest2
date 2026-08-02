package bo.app;

import I0.InterfaceC1344i;
import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b5 extends DataStoreProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return createOrGetDataStore(CollectionsKt.listOf(androidx.datastore.preferences.i.a(getContext(), "com.appboy.managers.device_data_provider", SetsKt.setOf((Object[]) new String[]{DataStoreKey.GOOGLE_ADVERTISING_ID.getKey(), DataStoreKey.AD_TRACKING_ENABLED.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.device_data";
    }
}
