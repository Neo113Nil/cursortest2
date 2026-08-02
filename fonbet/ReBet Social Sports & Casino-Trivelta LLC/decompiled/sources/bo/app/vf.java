package bo.app;

import I0.InterfaceC1344i;
import android.content.Context;
import com.braze.storage.DataStoreProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vf extends DataStoreProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f26146a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(Context context, String fileName) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.f26146a = fileName;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final InterfaceC1344i getDataStore() {
        return DataStoreProvider.createOrGetDataStore$default(this, null, 1, null);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return this.f26146a;
    }
}
