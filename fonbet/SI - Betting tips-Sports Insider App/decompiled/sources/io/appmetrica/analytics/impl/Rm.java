package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Rm implements Qm {
    @NonNull
    public abstract IBinaryDataHelper a(@NonNull Context context);

    @NonNull
    public abstract ProtobufStateStorage<Object> a(@NonNull Context context, @NonNull IBinaryDataHelper iBinaryDataHelper);

    @NonNull
    public abstract IBinaryDataHelper b(@NonNull Context context);

    @Override // io.appmetrica.analytics.impl.Qm, io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    @NonNull
    public final ProtobufStateStorage<Object> create(@NonNull Context context) {
        return a(context, a(context));
    }

    @Override // io.appmetrica.analytics.impl.Qm, io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory
    @NonNull
    public final ProtobufStateStorage<Object> createForMigration(@NonNull Context context) {
        return a(context, b(context));
    }
}
