package com.braze.managers;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class y implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.storage.z0 f615a;

    public y(Context context, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f615a = new com.braze.storage.z0(context, apiKey);
    }

    public final String a() {
        com.braze.storage.z0 z0Var = this.f615a;
        DataStoreKey dataStoreKey = DataStoreKey.DEVICE_ID;
        String readString = z0Var.readString(dataStoreKey, null);
        if (readString == null) {
            com.braze.storage.z0 z0Var2 = this.f615a;
            DataStoreKey dataStoreKey2 = DataStoreKey.LEGACY_DEVICE_ID;
            readString = z0Var2.readString(dataStoreKey2, null);
            this.f615a.clearData(dataStoreKey2);
        }
        com.braze.storage.z0 z0Var3 = this.f615a;
        DataStoreKey dataStoreKey3 = DataStoreKey.PERSISTENT_DEVICE_ID;
        if ((z0Var3.contains(dataStoreKey3) ? !Intrinsics.areEqual(this.f615a.readString(dataStoreKey3, null), String.valueOf(722989291)) : false) || readString == null) {
            readString = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(readString, "toString(...)");
        }
        this.f615a.writeData(dataStoreKey, readString);
        this.f615a.writeData(dataStoreKey3, String.valueOf(722989291));
        return readString;
    }
}
